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

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * Test cases for the {@link BlockRealMatrix} class.
 *
 * @version $Id$
 */

public final class BlockRealMatrixTest {static class __CLR4_4_11sbm1sbmlb90pd2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,84208,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21sbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21sbm(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83362);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83363);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83364);BlockRealMatrix m2 = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83365);Assert.assertEquals("testData row dimension",3,m.getRowDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83366);Assert.assertEquals("testData column dimension",3,m.getColumnDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83367);Assert.assertTrue("testData is square",m.isSquare());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83368);Assert.assertEquals("testData2 row dimension",m2.getRowDimension(),2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83369);Assert.assertEquals("testData2 column dimension",m2.getColumnDimension(),3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83370);Assert.assertTrue("testData2 is not square",!m2.isSquare());
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1sbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1sbv(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83371);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83372);Random r = new Random(66636328996002l);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83373);BlockRealMatrix m1 = createRandomMatrix(r, 47, 83);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83374);BlockRealMatrix m2 = new BlockRealMatrix(m1.getData());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83375);Assert.assertEquals(m1, m2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83376);BlockRealMatrix m3 = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83377);BlockRealMatrix m4 = new BlockRealMatrix(m3.getData());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83378);Assert.assertEquals(m3, m4);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1sc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1sc3(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83379);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83380);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83381);BlockRealMatrix mInv = new BlockRealMatrix(testDataInv);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83382);RealMatrix mPlusMInv = m.add(mInv);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83383);double[][] sumEntries = mPlusMInv.getData();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83384);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83385)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83386)==0&false)); row++) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83387);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83388)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83389)==0&false)); col++) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83390);Assert.assertEquals("sum entry entry",
                    testDataPlusInv[row][col],sumEntries[row][col],
                        entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1scf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1scf(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83391);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83392);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83393);BlockRealMatrix m2 = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83394);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83395);m.add(m2);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83396);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test norm */
    @Test
    public void testNorm() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971scl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs5o971scl(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83397);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83398);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83399);BlockRealMatrix m2 = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83400);Assert.assertEquals("testData norm",14d,m.getNorm(),entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83401);Assert.assertEquals("testData2 norm",7d,m2.getNorm(),entryTolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test Frobenius norm */
    @Test
    public void testFrobeniusNorm() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g77plc1scq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testFrobeniusNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g77plc1scq(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83402);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83403);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83404);BlockRealMatrix m2 = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83405);Assert.assertEquals("testData Frobenius norm", FastMath.sqrt(117.0), m.getFrobeniusNorm(), entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83406);Assert.assertEquals("testData2 Frobenius norm", FastMath.sqrt(52.0), m2.getFrobeniusNorm(), entryTolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1scv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1scv(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83407);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83408);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83409);BlockRealMatrix m2 = new BlockRealMatrix(testDataInv);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83410);assertClose(m.subtract(m2), m2.scalarMultiply(-1d).add(m), entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83411);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83412);m.subtract(new BlockRealMatrix(testData2));
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83413);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test multiply */
    @Test
    public void testMultiply() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1sd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1sd2(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83414);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83415);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83416);BlockRealMatrix mInv = new BlockRealMatrix(testDataInv);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83417);BlockRealMatrix identity = new BlockRealMatrix(id);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83418);BlockRealMatrix m2 = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83419);assertClose(m.multiply(mInv), identity, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83420);assertClose(mInv.multiply(m), identity, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83421);assertClose(m.multiply(identity), m, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83422);assertClose(identity.multiply(mInv), mInv, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83423);assertClose(m2.multiply(identity), m2, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83424);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83425);m.multiply(new BlockRealMatrix(bigSingular));
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83426);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSeveralBlocks() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3guq11sdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSeveralBlocks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3guq11sdf(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83427);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83428);RealMatrix m = new BlockRealMatrix(35, 71);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83429);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83430)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83431)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83432);for (int j = 0; (((j < m.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83433)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83434)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83435);m.setEntry(i, j, i + j / 1024.0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83436);RealMatrix mT = m.transpose();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83437);Assert.assertEquals(m.getRowDimension(), mT.getColumnDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83438);Assert.assertEquals(m.getColumnDimension(), mT.getRowDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83439);for (int i = 0; (((i < mT.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83440)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83441)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83442);for (int j = 0; (((j < mT.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83443)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83444)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83445);Assert.assertEquals(m.getEntry(j, i), mT.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83446);RealMatrix mPm = m.add(m);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83447);for (int i = 0; (((i < mPm.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83448)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83449)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83450);for (int j = 0; (((j < mPm.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83451)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83452)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83453);Assert.assertEquals(2 * m.getEntry(i, j), mPm.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83454);RealMatrix mPmMm = mPm.subtract(m);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83455);for (int i = 0; (((i < mPmMm.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83456)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83457)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83458);for (int j = 0; (((j < mPmMm.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83459)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83460)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83461);Assert.assertEquals(m.getEntry(i, j), mPmMm.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83462);RealMatrix mTm = mT.multiply(m);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83463);for (int i = 0; (((i < mTm.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83464)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83465)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83466);for (int j = 0; (((j < mTm.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83467)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83468)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83469);double sum = 0;
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83470);for (int k = 0; (((k < mT.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83471)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83472)==0&false)); ++k) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83473);sum += (k + i / 1024.0) * (k + j / 1024.0);
                }
                }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83474);Assert.assertEquals(sum, mTm.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83475);RealMatrix mmT = m.multiply(mT);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83476);for (int i = 0; (((i < mmT.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83477)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83478)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83479);for (int j = 0; (((j < mmT.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83480)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83481)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83482);double sum = 0;
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83483);for (int k = 0; (((k < m.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83484)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83485)==0&false)); ++k) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83486);sum += (i + k / 1024.0) * (j + k / 1024.0);
                }
                }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83487);Assert.assertEquals(sum, mmT.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83488);RealMatrix sub1 = m.getSubMatrix(2, 9, 5, 20);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83489);for (int i = 0; (((i < sub1.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83490)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83491)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83492);for (int j = 0; (((j < sub1.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83493)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83494)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83495);Assert.assertEquals((i + 2) + (j + 5) / 1024.0, sub1.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83496);RealMatrix sub2 = m.getSubMatrix(10, 12, 3, 70);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83497);for (int i = 0; (((i < sub2.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83498)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83499)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83500);for (int j = 0; (((j < sub2.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83501)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83502)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83503);Assert.assertEquals((i + 10) + (j + 3) / 1024.0, sub2.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83504);RealMatrix sub3 = m.getSubMatrix(30, 34, 0, 5);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83505);for (int i = 0; (((i < sub3.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83506)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83507)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83508);for (int j = 0; (((j < sub3.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83509)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83510)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83511);Assert.assertEquals((i + 30) + (j + 0) / 1024.0, sub3.getEntry(i, j), 0);
            }
        }}

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83512);RealMatrix sub4 = m.getSubMatrix(30, 32, 62, 65);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83513);for (int i = 0; (((i < sub4.getRowDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83514)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83515)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83516);for (int j = 0; (((j < sub4.getColumnDimension())&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83517)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83518)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83519);Assert.assertEquals((i + 30) + (j + 62) / 1024.0, sub4.getEntry(i, j), 0);
            }
        }}

    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    //Additional Test for BlockRealMatrixTest.testMultiply

    private double[][] d3 = new double[][] {{1,2,3,4},{5,6,7,8}};
    private double[][] d4 = new double[][] {{1},{2},{3},{4}};
    private double[][] d5 = new double[][] {{30},{70}};

    @Test
    public void testMultiply2() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251sg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251sg0(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83520);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83521);RealMatrix m3 = new BlockRealMatrix(d3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83522);RealMatrix m4 = new BlockRealMatrix(d4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83523);RealMatrix m5 = new BlockRealMatrix(d5);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83524);assertClose(m3.multiply(m4), m5, entryTolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61sg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61sg5(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83525);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83526);RealMatrix m = new BlockRealMatrix(id);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83527);Assert.assertEquals("identity trace",3d,m.getTrace(),entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83528);m = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83529);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83530);m.getTrace();
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83531);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test scalarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1sgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1sgc(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83532);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83533);RealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83534);assertClose(new BlockRealMatrix(testDataPlus2), m.scalarAdd(2d), entryTolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1sgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1sgf(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83535);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83536);RealMatrix m = new BlockRealMatrix(id);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83537);assertClose(testVector, m.operate(testVector), entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83538);assertClose(testVector, m.operate(new ArrayRealVector(testVector)).toArray(), entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83539);m = new BlockRealMatrix(bigSingular);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83540);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83541);m.operate(testVector);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83542);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testOperateLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1maf5681sgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testOperateLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1maf5681sgn(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83543);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83544);int p = (7 * BlockRealMatrix.BLOCK_SIZE) / 2;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83545);int q = (5 * BlockRealMatrix.BLOCK_SIZE) / 2;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83546);int r =  3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83547);Random random = new Random(111007463902334l);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83548);RealMatrix m1 = createRandomMatrix(random, p, q);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83549);RealMatrix m2 = createRandomMatrix(random, q, r);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83550);RealMatrix m1m2 = m1.multiply(m2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83551);for (int i = 0; (((i < r)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83552)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83553)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83554);checkArrays(m1m2.getColumn(i), m1.operate(m2.getColumn(i)));
        }
    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testOperatePremultiplyLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsufhp1sgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testOperatePremultiplyLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsufhp1sgz(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83555);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83556);int p = (7 * BlockRealMatrix.BLOCK_SIZE) / 2;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83557);int q = (5 * BlockRealMatrix.BLOCK_SIZE) / 2;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83558);int r =  3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83559);Random random = new Random(111007463902334l);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83560);RealMatrix m1 = createRandomMatrix(random, p, q);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83561);RealMatrix m2 = createRandomMatrix(random, q, r);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83562);RealMatrix m1m2 = m1.multiply(m2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83563);for (int i = 0; (((i < p)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83564)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83565)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83566);checkArrays(m1m2.getRow(i), m2.preMultiply(m1.getRow(i)));
        }
    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1shb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1shb(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83567);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83568);RealMatrix a = new BlockRealMatrix(new double[][] {
                { 1, 2 }, { 3, 4 }, { 5, 6 }
        });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83569);double[] b = a.operate(new double[] { 1, 1 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83570);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83571);Assert.assertEquals( 3.0, b[0], 1.0e-12);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83572);Assert.assertEquals( 7.0, b[1], 1.0e-12);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83573);Assert.assertEquals(11.0, b[2], 1.0e-12);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21shi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21shi(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83574);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83575);RealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83576);RealMatrix mIT = new LUDecomposition(m).getSolver().getInverse().transpose();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83577);RealMatrix mTI = new LUDecomposition(m.transpose()).getSolver().getInverse();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83578);assertClose(mIT, mTI, normTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83579);m = new BlockRealMatrix(testData2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83580);RealMatrix mt = new BlockRealMatrix(testData2T);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83581);assertClose(mt, m.transpose(), normTolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1shq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1shq(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83582);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83583);RealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83584);assertClose(m.preMultiply(testVector), preMultTest, normTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83585);assertClose(m.preMultiply(new ArrayRealVector(testVector).toArray()),
                    preMultTest, normTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83586);m = new BlockRealMatrix(bigSingular);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83587);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83588);m.preMultiply(testVector);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83589);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01shy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01shy(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83590);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83591);RealMatrix m3 = new BlockRealMatrix(d3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83592);RealMatrix m4 = new BlockRealMatrix(d4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83593);RealMatrix m5 = new BlockRealMatrix(d5);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83594);assertClose(m4.preMultiply(m3), m5, entryTolerance);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83595);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83596);BlockRealMatrix mInv = new BlockRealMatrix(testDataInv);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83597);BlockRealMatrix identity = new BlockRealMatrix(id);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83598);assertClose(m.preMultiply(mInv), identity, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83599);assertClose(mInv.preMultiply(m), identity, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83600);assertClose(m.preMultiply(identity), m, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83601);assertClose(identity.preMultiply(mInv), mInv, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83602);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83603);m.preMultiply(new BlockRealMatrix(bigSingular));
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83604);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711sid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711sid(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83605);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83606);RealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83607);assertClose(m.getRow(0), testDataRow1, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83608);assertClose(m.getColumn(2), testDataCol3, entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83609);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83610);m.getRow(10);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83611);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83612);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83613);m.getColumn(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83614);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1sin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1sin(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83615);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83616);RealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83617);Assert.assertEquals("get entry",m.getEntry(0,1),2d,entryTolerance);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83618);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83619);m.getEntry(10, 4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83620);Assert.fail ("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1sit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1sit(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83621);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83622);double[][] matrixData = { {1d,2d,3d}, {2d,5d,3d}};
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83623);RealMatrix m = new BlockRealMatrix(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83624);double[][] matrixData2 = { {1d,2d}, {2d,5d}, {1d, 7d}};
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83625);RealMatrix n = new BlockRealMatrix(matrixData2);
        // Now multiply m by n
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83626);RealMatrix p = m.multiply(n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83627);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83628);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83629);RealMatrix pInverse = new LUDecomposition(p).getSolver().getInverse();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83630);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83631);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83632);double[][] coefficientsData = {{2, 3, -2}, {-1, 7, 6}, {4, -3, -5}};
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83633);RealMatrix coefficients = new BlockRealMatrix(coefficientsData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83634);RealVector constants = new ArrayRealVector(new double[]{1, -2, 1}, false);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83635);RealVector solution = new LUDecomposition(coefficients).getSolver().solve(constants);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83636);final double cst0 = constants.getEntry(0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83637);final double cst1 = constants.getEntry(1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83638);final double cst2 = constants.getEntry(2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83639);final double sol0 = solution.getEntry(0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83640);final double sol1 = solution.getEntry(1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83641);final double sol2 = solution.getEntry(2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83642);Assert.assertEquals(2 * sol0 + 3 * sol1 -2 * sol2, cst0, 1E-12);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83643);Assert.assertEquals(-1 * sol0 + 7 * sol1 + 6 * sol2, cst1, 1E-12);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83644);Assert.assertEquals(4 * sol0 - 3 * sol1 -5 * sol2, cst2, 1E-12);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testGetSubMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19452rg1sjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19452rg1sjh(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83645);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83646);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83647);checkGetSubMatrix(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83648);checkGetSubMatrix(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83649);checkGetSubMatrix(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83650);checkGetSubMatrix(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83651);checkGetSubMatrix(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83652);checkGetSubMatrix(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83653);checkGetSubMatrix(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83654);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83655);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83656);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83657);checkGetSubMatrix(m, null, -1, 1, 2, 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83658);checkGetSubMatrix(m, null,  1, 0, 2, 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83659);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83660);checkGetSubMatrix(m, null, new int[] {},    new int[] { 0 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83661);checkGetSubMatrix(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private void checkGetSubMatrix(RealMatrix m, double[][] reference,
                                   int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83662);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83663);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83664);RealMatrix sub = m.getSubMatrix(startRow, endRow, startColumn, endColumn);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83665);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83666)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83667)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83668);Assert.assertEquals(new BlockRealMatrix(reference), sub);
            } }else {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83669);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83670);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83671)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83672)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83673);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83674);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83675)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83676)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83677);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83678);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83679)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83680)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83681);throw e;
            }
        }}
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private void checkGetSubMatrix(RealMatrix m, double[][] reference,
                                   int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83682);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83683);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83684);RealMatrix sub = m.getSubMatrix(selectedRows, selectedColumns);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83685);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83686)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83687)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83688);Assert.assertEquals(new BlockRealMatrix(reference), sub);
            } }else {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83689);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallExceptiono r NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83690);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83691)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83692)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83693);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83694);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83695)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83696)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83697);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83698);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83699)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83700)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83701);throw e;
            }
        }}
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetMatrixLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjr9fn1sl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjr9fn1sl2(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83702);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83703);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83704);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83705);RealMatrix sub = new BlockRealMatrix(n - 4, n - 4).scalarAdd(1);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83706);m.setSubMatrix(sub.getData(), 2, 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83707);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83708)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83709)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83710);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83711)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83712)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83713);if (((((i < 2) || (i > n - 3) || (j < 2) || (j > n - 3))&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83714)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83715)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83716);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83717);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83718);Assert.assertEquals(sub, m.getSubMatrix(2, n - 3, 2, n - 3));

    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testCopySubMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y87lfj1slj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testCopySubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y87lfj1slj(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83719);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83720);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83721);checkCopy(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83722);checkCopy(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83723);checkCopy(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83724);checkCopy(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83725);checkCopy(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83726);checkCopy(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83727);checkCopy(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83728);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83729);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83730);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83731);checkCopy(m, null, -1, 1, 2, 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83732);checkCopy(m, null,  1, 0, 2, 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83733);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83734);checkCopy(m, null, new int[] {},    new int[] { 0 });
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83735);checkCopy(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private void checkCopy(RealMatrix m, double[][] reference,
                           int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83736);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83737);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83738);double[][] sub = ((((reference == null) )&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83739)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83740)==0&false))?
                             new double[1][1] :
                             new double[reference.length][reference[0].length];
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83741);m.copySubMatrix(startRow, endRow, startColumn, endColumn, sub);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83742);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83743)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83744)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83745);Assert.assertEquals(new BlockRealMatrix(reference), new BlockRealMatrix(sub));
            } }else {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83746);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83747);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83748)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83749)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83750);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83751);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83752)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83753)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83754);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83755);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83756)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83757)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83758);throw e;
            }
        }}
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private void checkCopy(RealMatrix m, double[][] reference,
                           int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83759);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83760);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83761);double[][] sub = ((((reference == null) )&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83762)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83763)==0&false))?
                    new double[1][1] :
                    new double[reference.length][reference[0].length];
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83764);m.copySubMatrix(selectedRows, selectedColumns, sub);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83765);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83766)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83767)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83768);Assert.assertEquals(new BlockRealMatrix(reference), new BlockRealMatrix(sub));
            } }else {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83769);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83770);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83771)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83772)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83773);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83774);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83775)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83776)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83777);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83778);if ((((reference != null)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83779)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83780)==0&false))) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83781);throw e;
            }
        }}
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1sna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1sna(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83782);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83783);RealMatrix m     = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83784);RealMatrix mRow0 = new BlockRealMatrix(subRow0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83785);RealMatrix mRow3 = new BlockRealMatrix(subRow3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83786);Assert.assertEquals("Row0", mRow0, m.getRowMatrix(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83787);Assert.assertEquals("Row3", mRow3, m.getRowMatrix(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83788);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83789);m.getRowMatrix(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83790);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83791);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83792);m.getRowMatrix(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83793);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetRowMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydvo21snm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydvo21snm(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83794);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83795);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83796);RealMatrix mRow3 = new BlockRealMatrix(subRow3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83797);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83798);m.setRowMatrix(0, mRow3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83799);Assert.assertEquals(mRow3, m.getRowMatrix(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83800);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83801);m.setRowMatrix(-1, mRow3);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83802);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83803);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83804);m.setRowMatrix(0, m);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83805);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetRowMatrixLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12syekl1sny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetRowMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12syekl1sny(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83806);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83807);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83808);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83809);RealMatrix sub = new BlockRealMatrix(1, n).scalarAdd(1);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83810);m.setRowMatrix(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83811);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83812)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83813)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83814);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83815)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83816)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83817);if ((((i != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83818)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83819)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83820);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83821);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83822);Assert.assertEquals(sub, m.getRowMatrix(2));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1sof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1sof(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83823);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83824);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83825);RealMatrix mColumn1 = new BlockRealMatrix(subColumn1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83826);RealMatrix mColumn3 = new BlockRealMatrix(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83827);Assert.assertEquals(mColumn1, m.getColumnMatrix(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83828);Assert.assertEquals(mColumn3, m.getColumnMatrix(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83829);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83830);m.getColumnMatrix(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83831);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83832);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83833);m.getColumnMatrix(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83834);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetColumnMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh7wb61sor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh7wb61sor(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83835);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83836);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83837);RealMatrix mColumn3 = new BlockRealMatrix(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83838);Assert.assertNotSame(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83839);m.setColumnMatrix(1, mColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83840);Assert.assertEquals(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83841);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83842);m.setColumnMatrix(-1, mColumn3);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83843);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83844);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83845);m.setColumnMatrix(0, m);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83846);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetColumnMatrixLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n41m5v1sp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetColumnMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n41m5v1sp3(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83847);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83848);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83849);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83850);RealMatrix sub = new BlockRealMatrix(n, 1).scalarAdd(1);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83851);m.setColumnMatrix(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83852);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83853)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83854)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83855);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83856)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83857)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83858);if ((((j != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83859)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83860)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83861);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83862);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83863);Assert.assertEquals(sub, m.getColumnMatrix(2));

    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401spk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401spk(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83864);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83865);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83866);RealVector mRow0 = new ArrayRealVector(subRow0[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83867);RealVector mRow3 = new ArrayRealVector(subRow3[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83868);Assert.assertEquals(mRow0, m.getRowVector(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83869);Assert.assertEquals(mRow3, m.getRowVector(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83870);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83871);m.getRowVector(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83872);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83873);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83874);m.getRowVector(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83875);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetRowVector() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwpvsc1spw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwpvsc1spw(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83876);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83877);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83878);RealVector mRow3 = new ArrayRealVector(subRow3[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83879);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83880);m.setRowVector(0, mRow3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83881);Assert.assertEquals(mRow3, m.getRowVector(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83882);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83883);m.setRowVector(-1, mRow3);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83884);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83885);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83886);m.setRowVector(0, new ArrayRealVector(5));
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83887);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetRowVectorLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15be1191sq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetRowVectorLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15be1191sq8(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83888);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83889);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83890);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83891);RealVector sub = new ArrayRealVector(n, 1.0);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83892);m.setRowVector(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83893);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83894)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83895)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83896);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83897)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83898)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83899);if ((((i != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83900)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83901)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83902);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83903);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83904);Assert.assertEquals(sub, m.getRowVector(2));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1sqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1sqp(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83905);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83906);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83907);RealVector mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83908);RealVector mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83909);Assert.assertEquals(mColumn1, m.getColumnVector(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83910);Assert.assertEquals(mColumn3, m.getColumnVector(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83911);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83912);m.getColumnVector(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83913);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83914);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83915);m.getColumnVector(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83916);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetColumnVector() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb7lsg1sr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb7lsg1sr1(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83917);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83918);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83919);RealVector mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83920);Assert.assertNotSame(mColumn3, m.getColumnVector(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83921);m.setColumnVector(1, mColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83922);Assert.assertEquals(mColumn3, m.getColumnVector(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83923);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83924);m.setColumnVector(-1, mColumn3);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83925);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83926);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83927);m.setColumnVector(0, new ArrayRealVector(5));
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83928);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetColumnVectorLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8e1rp1srd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetColumnVectorLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8e1rp1srd(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83929);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83930);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83931);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83932);RealVector sub = new ArrayRealVector(n, 1.0);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83933);m.setColumnVector(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83934);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83935)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83936)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83937);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83938)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83939)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83940);if ((((j != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83941)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83942)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83943);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83944);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83945);Assert.assertEquals(sub, m.getColumnVector(2));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private RealVector columnToVector(double[][] column) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83946);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83947);double[] data = new double[column.length];
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83948);for (int i = 0; (((i < data.length)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83949)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83950)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83951);data[i] = column[i][0];
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83952);return new ArrayRealVector(data, false);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetRow() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1bja51ss1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1bja51ss1(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83953);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83954);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83955);checkArrays(subRow0[0], m.getRow(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83956);checkArrays(subRow3[0], m.getRow(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83957);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83958);m.getRow(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83959);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83960);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83961);m.getRow(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83962);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetRow() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z2y4x1ssb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z2y4x1ssb(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83963);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83964);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83965);Assert.assertTrue(subRow3[0][0] != m.getRow(0)[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83966);m.setRow(0, subRow3[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83967);checkArrays(subRow3[0], m.getRow(0));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83968);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83969);m.setRow(-1, subRow3[0]);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83970);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83971);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83972);m.setRow(0, new double[5]);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83973);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetRowLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpcjve1ssm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetRowLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpcjve1ssm(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83974);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83975);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83976);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83977);double[] sub = new double[n];
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83978);Arrays.fill(sub, 1.0);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83979);m.setRow(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83980);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83981)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83982)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83983);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83984)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83985)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83986);if ((((i != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83987)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(83988)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83989);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83990);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83991);checkArrays(sub, m.getRow(2));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetColumn() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),83992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynjvhb1st4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynjvhb1st4(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(83992);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83993);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83994);double[] mColumn1 = columnToArray(subColumn1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83995);double[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83996);checkArrays(mColumn1, m.getColumn(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83997);checkArrays(mColumn3, m.getColumn(3));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83998);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(83999);m.getColumn(-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84000);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84001);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84002);m.getColumn(4);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84003);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetColumn() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5snzh1stg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5snzh1stg(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84004);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84005);RealMatrix m = new BlockRealMatrix(subTestData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84006);double[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84007);Assert.assertTrue(mColumn3[0] != m.getColumn(1)[0]);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84008);m.setColumn(1, mColumn3);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84009);checkArrays(mColumn3, m.getColumn(1));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84010);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84011);m.setColumn(-1, mColumn3);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84012);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84013);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84014);m.setColumn(0, new double[5]);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84015);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testGetSetColumnLarge() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pefyy61sts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testGetSetColumnLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pefyy61sts(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84016);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84017);int n = 3 * BlockRealMatrix.BLOCK_SIZE;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84018);RealMatrix m = new BlockRealMatrix(n, n);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84019);double[] sub = new double[n];
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84020);Arrays.fill(sub, 1.0);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84021);m.setColumn(2, sub);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84022);for (int i = 0; (((i < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84023)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84024)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84025);for (int j = 0; (((j < n)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84026)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84027)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84028);if ((((j != 2)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84029)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84030)==0&false))) {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84031);Assert.assertEquals(0.0, m.getEntry(i, j), 0.0);
                } }else {{
                    __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84032);Assert.assertEquals(1.0, m.getEntry(i, j), 0.0);
                }
            }}
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84033);checkArrays(sub, m.getColumn(2));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private double[] columnToArray(double[][] column) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84034);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84035);double[] data = new double[column.length];
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84036);for (int i = 0; (((i < data.length)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84037)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84038)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84039);data[i] = column[i][0];
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84040);return data;
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private void checkArrays(double[] expected, double[] actual) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84041);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84042);Assert.assertEquals(expected.length, actual.length);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84043);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84044)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84045)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84046);Assert.assertEquals(expected[i], actual[i], 0);
        }
    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81sun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81sun(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84047);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84048);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84049);BlockRealMatrix m1 = m.copy();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84050);BlockRealMatrix mt = m.transpose();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84051);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84052);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84053);Assert.assertEquals(m, m);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84054);Assert.assertEquals(m, m1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84055);Assert.assertFalse(m.equals(null));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84056);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84057);Assert.assertFalse(m.equals(new BlockRealMatrix(bigSingular)));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1suy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1suy(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84058);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84059);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84060);Assert.assertEquals("BlockRealMatrix{{1.0,2.0,3.0},{2.0,5.0,3.0},{1.0,0.0,8.0}}",
                m.toString());
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1sv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1sv1(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84061);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84062);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84063);m.setSubMatrix(detData2,1,1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84064);RealMatrix expected = new BlockRealMatrix
            (new double[][] {{1.0,2.0,3.0},{2.0,1.0,3.0},{1.0,2.0,4.0}});
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84065);Assert.assertEquals(expected, m);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84066);m.setSubMatrix(detData2,0,0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84067);expected = new BlockRealMatrix
            (new double[][] {{1.0,3.0,3.0},{2.0,4.0,3.0},{1.0,2.0,4.0}});
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84068);Assert.assertEquals(expected, m);

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84069);m.setSubMatrix(testDataPlus2,0,0);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84070);expected = new BlockRealMatrix
            (new double[][] {{3.0,4.0,5.0},{4.0,7.0,5.0},{3.0,2.0,10.0}});
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84071);Assert.assertEquals(expected, m);

        // javadoc example
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84072);BlockRealMatrix matrix = new BlockRealMatrix
            (new double[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1 , 2}});
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84073);matrix.setSubMatrix(new double[][] {{3, 4}, {5, 6}}, 1, 1);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84074);expected = new BlockRealMatrix
            (new double[][] {{1, 2, 3, 4}, {5, 3, 4, 8}, {9, 5 ,6, 2}});
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84075);Assert.assertEquals(expected, matrix);

        // dimension overflow
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84076);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84077);m.setSubMatrix(testData,1,1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84078);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84079);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84080);m.setSubMatrix(testData,-1,1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84081);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84082);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84083);m.setSubMatrix(testData,1,-1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84084);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84085);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84086);m.setSubMatrix(null,1,1);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84087);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }

        // ragged
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84088);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84089);m.setSubMatrix(new double[][] {{1}, {2, 3}}, 0, 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84090);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84091);try {
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84092);m.setSubMatrix(new double[][] {{}}, 0, 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84093);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testWalk() {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1310jtu1svy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testWalk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1310jtu1svy(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84094);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84095);int rows    = 150;
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84096);int columns = 75;

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84097);RealMatrix m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84098);m.walkInRowOrder(new SetVisitor());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84099);GetVisitor getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84100);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84101);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84102);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84103);m.walkInRowOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84104);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84105);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84106);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84107);for (int i = 0; (((i < rows)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84108)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84109)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84110);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84111);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84112);for (int j = 0; (((j < columns)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84113)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84114)==0&false)); ++j) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84115);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84116);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84117);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84118);m.walkInColumnOrder(new SetVisitor());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84119);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84120);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84121);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84122);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84123);m.walkInColumnOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84124);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84125);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84126);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84127);for (int i = 0; (((i < rows)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84128)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84129)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84130);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84131);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84132);for (int j = 0; (((j < columns)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84133)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84134)==0&false)); ++j) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84135);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84136);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84137);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84138);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84139);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84140);m.walkInRowOrder(getVisitor);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84141);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84142);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84143);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84144);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84145);m.walkInRowOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84146);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84147);for (int i = 0; (((i < rows)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84148)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84149)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84150);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84151);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84152);for (int j = 0; (((j < columns)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84153)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84154)==0&false)); ++j) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84155);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84156);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84157);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84158);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84159);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84160);m.walkInColumnOrder(getVisitor);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84161);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84162);m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84163);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84164);getVisitor = new GetVisitor();
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84165);m.walkInColumnOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84166);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84167);for (int i = 0; (((i < rows)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84168)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84169)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84170);Assert.assertEquals(0.0, m.getEntry(i, 0), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84171);Assert.assertEquals(0.0, m.getEntry(i, columns - 1), 0);
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84172);for (int j = 0; (((j < columns)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84173)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84174)==0&false)); ++j) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84175);Assert.assertEquals(0.0, m.getEntry(0, j), 0);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84176);Assert.assertEquals(0.0, m.getEntry(rows - 1, j), 0);
        }

    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceStart(getClass().getName(),84177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1sy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sbm1sbmlb90pd2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockRealMatrixTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1sy9(){try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84177);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84178);BlockRealMatrix m = new BlockRealMatrix(testData);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84179);Assert.assertEquals(m,TestUtils.serializeAndRecover(m));
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private static class SetVisitor extends DefaultRealMatrixChangingVisitor {
        @Override
        public double visit(int i, int j, double value) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84180);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84181);return i + j / 1024.0;
        }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}
    }

    private static class GetVisitor extends DefaultRealMatrixPreservingVisitor {
        private int count = 0;
        @Override
        public void visit(int i, int j, double value) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84182);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84183);++count;
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84184);Assert.assertEquals(i + j / 1024.0, value, 0.0);
        }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}
        public int getCount() {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84185);
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84186);return count;
        }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}
    }

    //--------------- -----------------Protected methods

    /** verifies that two matrices are close (1-norm) */
    protected void assertClose(RealMatrix m, RealMatrix n, double tolerance) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84187);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84188);Assert.assertTrue(m.subtract(n).getNorm() < tolerance);
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    /** verifies that two vectors are close (sup norm) */
    protected void assertClose(double[] m, double[] n, double tolerance) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84189);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84190);if ((((m.length != n.length)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84191)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84192)==0&false))) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84193);Assert.fail("vectors not same length");
        }
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84194);for (int i = 0; (((i < m.length)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84195)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84196)==0&false)); i++) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84197);Assert.assertEquals(m[i], n[i], tolerance);
        }
    }}finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}

    private BlockRealMatrix createRandomMatrix(Random r, int rows, int columns) {try{__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84198);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84199);BlockRealMatrix m = new BlockRealMatrix(rows, columns);
        __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84200);for (int i = 0; (((i < rows)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84201)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84202)==0&false)); ++i) {{
            __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84203);for (int j = 0; (((j < columns)&&(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84204)!=0|true))||(__CLR4_4_11sbm1sbmlb90pd2y.R.iget(84205)==0&false)); ++j) {{
                __CLR4_4_11sbm1sbmlb90pd2y.R.inc(84206);m.setEntry(i, j, 200 * r.nextDouble() - 100);
            }
        }}
        }__CLR4_4_11sbm1sbmlb90pd2y.R.inc(84207);return m;
    }finally{__CLR4_4_11sbm1sbmlb90pd2y.R.flushNeeded();}}
}

