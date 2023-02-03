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
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * Test cases for the {@link OpenMapRealMatrix} class.
 *
 * @version $Id$
 */
public final class SparseRealMatrixTest {static class __CLR4_4_11x321x32lb90pdec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89865,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // 3 x 3 identity matrix
    protected double[][] id = { { 1d, 0d, 0d }, { 0d, 1d, 0d }, { 0d, 0d, 1d } };
    // Test data for group operations
    protected double[][] testData = { { 1d, 2d, 3d }, { 2d, 5d, 3d },
            { 1d, 0d, 8d } };
    protected double[][] testDataLU = { { 2d, 5d, 3d }, { .5d, -2.5d, 6.5d },
            { 0.5d, 0.2d, .2d } };
    protected double[][] testDataPlus2 = { { 3d, 4d, 5d }, { 4d, 7d, 5d },
            { 3d, 2d, 10d } };
    protected double[][] testDataMinus = { { -1d, -2d, -3d },
            { -2d, -5d, -3d }, { -1d, 0d, -8d } };
    protected double[] testDataRow1 = { 1d, 2d, 3d };
    protected double[] testDataCol3 = { 3d, 3d, 8d };
    protected double[][] testDataInv = { { -40d, 16d, 9d }, { 13d, -5d, -3d },
            { 5d, -2d, -1d } };
    protected double[] preMultTest = { 8, 12, 33 };
    protected double[][] testData2 = { { 1d, 2d, 3d }, { 2d, 5d, 3d } };
    protected double[][] testData2T = { { 1d, 2d }, { 2d, 5d }, { 3d, 3d } };
    protected double[][] testDataPlusInv = { { -39d, 18d, 12d },
            { 15d, 0d, 0d }, { 6d, -2d, 7d } };

    // lu decomposition tests
    protected double[][] luData = { { 2d, 3d, 3d }, { 0d, 5d, 7d }, { 6d, 9d, 8d } };
    protected double[][] luDataLUDecomposition = { { 6d, 9d, 8d },
            { 0d, 5d, 7d }, { 0.33333333333333, 0d, 0.33333333333333 } };

    // singular matrices
    protected double[][] singular = { { 2d, 3d }, { 2d, 3d } };
    protected double[][] bigSingular = { { 1d, 2d, 3d, 4d },
            { 2d, 5d, 3d, 4d }, { 7d, 3d, 256d, 1930d }, { 3d, 7d, 6d, 8d } }; // 4th

    // row
    // =
    // 1st
    // +
    // 2nd
    protected double[][] detData = { { 1d, 2d, 3d }, { 4d, 5d, 6d },
            { 7d, 8d, 10d } };
    protected double[][] detData2 = { { 1d, 3d }, { 2d, 4d } };

    // vectors
    protected double[] testVector = { 1, 2, 3 };
    protected double[] testVector2 = { 1, 2, 3, 4 };

    // submatrix accessor tests
    protected double[][] subTestData = { { 1, 2, 3, 4 },
            { 1.5, 2.5, 3.5, 4.5 }, { 2, 4, 6, 8 }, { 4, 5, 6, 7 } };

    // array selections
    protected double[][] subRows02Cols13 = { { 2, 4 }, { 4, 8 } };
    protected double[][] subRows03Cols12 = { { 2, 3 }, { 5, 6 } };
    protected double[][] subRows03Cols123 = { { 2, 3, 4 }, { 5, 6, 7 } };

    // effective permutations
    protected double[][] subRows20Cols123 = { { 4, 6, 8 }, { 2, 3, 4 } };
    protected double[][] subRows31Cols31 = { { 7, 5 }, { 4.5, 2.5 } };

    // contiguous ranges
    protected double[][] subRows01Cols23 = { { 3, 4 }, { 3.5, 4.5 } };
    protected double[][] subRows23Cols00 = { { 2 }, { 4 } };
    protected double[][] subRows00Cols33 = { { 4 } };

    // row matrices
    protected double[][] subRow0 = { { 1, 2, 3, 4 } };
    protected double[][] subRow3 = { { 4, 5, 6, 7 } };

    // column matrices
    protected double[][] subColumn1 = { { 2 }, { 2.5 }, { 4 }, { 5 } };
    protected double[][] subColumn3 = { { 4 }, { 4.5 }, { 8 }, { 7 } };

    // tolerances
    protected double entryTolerance = 10E-16;
    protected double normTolerance = 10E-14;

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21x32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21x32(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89534);
        __CLR4_4_11x321x32lb90pdec.R.inc(89535);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89536);OpenMapRealMatrix m2 = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89537);Assert.assertEquals("testData row dimension", 3, m.getRowDimension());
        __CLR4_4_11x321x32lb90pdec.R.inc(89538);Assert.assertEquals("testData column dimension", 3, m.getColumnDimension());
        __CLR4_4_11x321x32lb90pdec.R.inc(89539);Assert.assertTrue("testData is square", m.isSquare());
        __CLR4_4_11x321x32lb90pdec.R.inc(89540);Assert.assertEquals("testData2 row dimension", m2.getRowDimension(), 2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89541);Assert.assertEquals("testData2 column dimension", m2.getColumnDimension(), 3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89542);Assert.assertTrue("testData2 is not square", !m2.isSquare());
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1x3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1x3b(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89543);
        __CLR4_4_11x321x32lb90pdec.R.inc(89544);OpenMapRealMatrix m1 = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89545);RealMatrix m2 = m1.copy();
        __CLR4_4_11x321x32lb90pdec.R.inc(89546);Assert.assertEquals(m1.getClass(), m2.getClass());
        __CLR4_4_11x321x32lb90pdec.R.inc(89547);Assert.assertEquals((m2), m1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89548);OpenMapRealMatrix m3 = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89549);RealMatrix m4 = m3.copy();
        __CLR4_4_11x321x32lb90pdec.R.inc(89550);Assert.assertEquals(m3.getClass(), m4.getClass());
        __CLR4_4_11x321x32lb90pdec.R.inc(89551);Assert.assertEquals((m4), m3);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1x3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1x3k(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89552);
        __CLR4_4_11x321x32lb90pdec.R.inc(89553);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89554);OpenMapRealMatrix mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89555);OpenMapRealMatrix mDataPlusInv = createSparseMatrix(testDataPlusInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89556);RealMatrix mPlusMInv = m.add(mInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89557);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11x321x32lb90pdec.R.iget(89558)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89559)==0&false)); row++) {{
            __CLR4_4_11x321x32lb90pdec.R.inc(89560);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11x321x32lb90pdec.R.iget(89561)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89562)==0&false)); col++) {{
                __CLR4_4_11x321x32lb90pdec.R.inc(89563);Assert.assertEquals("sum entry entry",
                    mDataPlusInv.getEntry(row, col), mPlusMInv.getEntry(row, col),
                    entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1x3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1x3w(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89564);
        __CLR4_4_11x321x32lb90pdec.R.inc(89565);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89566);OpenMapRealMatrix m2 = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89567);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89568);m.add(m2);
            __CLR4_4_11x321x32lb90pdec.R.inc(89569);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test norm */
    @Test
    public void testNorm() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs5o971x42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testNorm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs5o971x42(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89570);
        __CLR4_4_11x321x32lb90pdec.R.inc(89571);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89572);OpenMapRealMatrix m2 = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89573);Assert.assertEquals("testData norm", 14d, m.getNorm(), entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89574);Assert.assertEquals("testData2 norm", 7d, m2.getNorm(), entryTolerance);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1x47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1x47(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89575);
        __CLR4_4_11x321x32lb90pdec.R.inc(89576);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89577);OpenMapRealMatrix n = createSparseMatrix(testDataInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89578);assertClose("m-n = m + -n", m.subtract(n),
            n.scalarMultiply(-1d).add(m), entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89579);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89580);m.subtract(createSparseMatrix(testData2));
            __CLR4_4_11x321x32lb90pdec.R.inc(89581);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test multiply */
    @Test
    public void testMultiply() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1x4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1x4e(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89582);
        __CLR4_4_11x321x32lb90pdec.R.inc(89583);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89584);OpenMapRealMatrix mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89585);OpenMapRealMatrix identity = createSparseMatrix(id);
        __CLR4_4_11x321x32lb90pdec.R.inc(89586);OpenMapRealMatrix m2 = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89587);assertClose("inverse multiply", m.multiply(mInv), identity,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89588);assertClose("inverse multiply", m.multiply(new BlockRealMatrix(testDataInv)), identity,
                    entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89589);assertClose("inverse multiply", mInv.multiply(m), identity,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89590);assertClose("identity multiply", m.multiply(identity), m,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89591);assertClose("identity multiply", identity.multiply(mInv), mInv,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89592);assertClose("identity multiply", m2.multiply(identity), m2,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89593);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89594);m.multiply(createSparseMatrix(bigSingular));
            __CLR4_4_11x321x32lb90pdec.R.inc(89595);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    // Additional Test for Array2DRowRealMatrixTest.testMultiply

    private double[][] d3 = new double[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
    private double[][] d4 = new double[][] { { 1 }, { 2 }, { 3 }, { 4 } };
    private double[][] d5 = new double[][] { { 30 }, { 70 } };

    @Test
    public void testMultiply2() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251x4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251x4s(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89596);
        __CLR4_4_11x321x32lb90pdec.R.inc(89597);RealMatrix m3 = createSparseMatrix(d3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89598);RealMatrix m4 = createSparseMatrix(d4);
        __CLR4_4_11x321x32lb90pdec.R.inc(89599);RealMatrix m5 = createSparseMatrix(d5);
        __CLR4_4_11x321x32lb90pdec.R.inc(89600);assertClose("m3*m4=m5", m3.multiply(m4), m5, entryTolerance);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61x4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61x4x(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89601);
        __CLR4_4_11x321x32lb90pdec.R.inc(89602);RealMatrix m = createSparseMatrix(id);
        __CLR4_4_11x321x32lb90pdec.R.inc(89603);Assert.assertEquals("identity trace", 3d, m.getTrace(), entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89604);m = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89605);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89606);m.getTrace();
            __CLR4_4_11x321x32lb90pdec.R.inc(89607);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test sclarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1x54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1x54(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89608);
        __CLR4_4_11x321x32lb90pdec.R.inc(89609);RealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89610);assertClose("scalar add", createSparseMatrix(testDataPlus2),
            m.scalarAdd(2d), entryTolerance);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1x57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1x57(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89611);
        __CLR4_4_11x321x32lb90pdec.R.inc(89612);RealMatrix m = createSparseMatrix(id);
        __CLR4_4_11x321x32lb90pdec.R.inc(89613);assertClose("identity operate", testVector, m.operate(testVector),
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89614);assertClose("identity operate", testVector, m.operate(
                new ArrayRealVector(testVector)).toArray(), entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89615);m = createSparseMatrix(bigSingular);
        __CLR4_4_11x321x32lb90pdec.R.inc(89616);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89617);m.operate(testVector);
            __CLR4_4_11x321x32lb90pdec.R.inc(89618);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1x5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1x5f(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89619);
        __CLR4_4_11x321x32lb90pdec.R.inc(89620);RealMatrix a = createSparseMatrix(new double[][] {
                { 1, 2 }, { 3, 4 }, { 5, 6 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89621);double[] b = a.operate(new double[] { 1, 1 });
        __CLR4_4_11x321x32lb90pdec.R.inc(89622);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11x321x32lb90pdec.R.inc(89623);Assert.assertEquals(3.0, b[0], 1.0e-12);
        __CLR4_4_11x321x32lb90pdec.R.inc(89624);Assert.assertEquals(7.0, b[1], 1.0e-12);
        __CLR4_4_11x321x32lb90pdec.R.inc(89625);Assert.assertEquals(11.0, b[2], 1.0e-12);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21x5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21x5m(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89626);
        __CLR4_4_11x321x32lb90pdec.R.inc(89627);RealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89628);RealMatrix mIT = new LUDecomposition(m).getSolver().getInverse().transpose();
        __CLR4_4_11x321x32lb90pdec.R.inc(89629);RealMatrix mTI = new LUDecomposition(m.transpose()).getSolver().getInverse();
        __CLR4_4_11x321x32lb90pdec.R.inc(89630);assertClose("inverse-transpose", mIT, mTI, normTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89631);m = createSparseMatrix(testData2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89632);RealMatrix mt = createSparseMatrix(testData2T);
        __CLR4_4_11x321x32lb90pdec.R.inc(89633);assertClose("transpose",mt,m.transpose(),normTolerance);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1x5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1x5u(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89634);
        __CLR4_4_11x321x32lb90pdec.R.inc(89635);RealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89636);assertClose("premultiply", m.preMultiply(testVector), preMultTest,
            normTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89637);assertClose("premultiply", m.preMultiply(
            new ArrayRealVector(testVector).toArray()), preMultTest, normTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89638);m = createSparseMatrix(bigSingular);
        __CLR4_4_11x321x32lb90pdec.R.inc(89639);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89640);m.preMultiply(testVector);
            __CLR4_4_11x321x32lb90pdec.R.inc(89641);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01x62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01x62(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89642);
        __CLR4_4_11x321x32lb90pdec.R.inc(89643);RealMatrix m3 = createSparseMatrix(d3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89644);RealMatrix m4 = createSparseMatrix(d4);
        __CLR4_4_11x321x32lb90pdec.R.inc(89645);RealMatrix m5 = createSparseMatrix(d5);
        __CLR4_4_11x321x32lb90pdec.R.inc(89646);assertClose("m3*m4=m5", m4.preMultiply(m3), m5, entryTolerance);

        __CLR4_4_11x321x32lb90pdec.R.inc(89647);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89648);OpenMapRealMatrix mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11x321x32lb90pdec.R.inc(89649);OpenMapRealMatrix identity = createSparseMatrix(id);
        __CLR4_4_11x321x32lb90pdec.R.inc(89650);assertClose("inverse multiply", m.preMultiply(mInv), identity,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89651);assertClose("inverse multiply", mInv.preMultiply(m), identity,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89652);assertClose("identity multiply", m.preMultiply(identity), m,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89653);assertClose("identity multiply", identity.preMultiply(mInv), mInv,
                entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89654);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89655);m.preMultiply(createSparseMatrix(bigSingular));
            __CLR4_4_11x321x32lb90pdec.R.inc(89656);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711x6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711x6h(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89657);
        __CLR4_4_11x321x32lb90pdec.R.inc(89658);RealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89659);assertClose("get row", m.getRow(0), testDataRow1, entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89660);assertClose("get col", m.getColumn(2), testDataCol3, entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89661);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89662);m.getRow(10);
            __CLR4_4_11x321x32lb90pdec.R.inc(89663);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89664);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89665);m.getColumn(-1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89666);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1x6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1x6r(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89667);
        __CLR4_4_11x321x32lb90pdec.R.inc(89668);RealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89669);Assert.assertEquals("get entry", m.getEntry(0, 1), 2d, entryTolerance);
        __CLR4_4_11x321x32lb90pdec.R.inc(89670);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89671);m.getEntry(10, 4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89672);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1x6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1x6x(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89673);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11x321x32lb90pdec.R.inc(89674);double[][] matrixData = { { 1d, 2d, 3d }, { 2d, 5d, 3d } };
        __CLR4_4_11x321x32lb90pdec.R.inc(89675);RealMatrix m = createSparseMatrix(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11x321x32lb90pdec.R.inc(89676);double[][] matrixData2 = { { 1d, 2d }, { 2d, 5d }, { 1d, 7d } };
        __CLR4_4_11x321x32lb90pdec.R.inc(89677);RealMatrix n = createSparseMatrix(matrixData2);
        // Now multiply m by n
        __CLR4_4_11x321x32lb90pdec.R.inc(89678);RealMatrix p = m.multiply(n);
        __CLR4_4_11x321x32lb90pdec.R.inc(89679);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11x321x32lb90pdec.R.inc(89680);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11x321x32lb90pdec.R.inc(89681);RealMatrix pInverse = new LUDecomposition(p).getSolver().getInverse();
        __CLR4_4_11x321x32lb90pdec.R.inc(89682);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11x321x32lb90pdec.R.inc(89683);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11x321x32lb90pdec.R.inc(89684);double[][] coefficientsData = { { 2, 3, -2 }, { -1, 7, 6 },
                { 4, -3, -5 } };
        __CLR4_4_11x321x32lb90pdec.R.inc(89685);RealMatrix coefficients = createSparseMatrix(coefficientsData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89686);RealVector constants = new ArrayRealVector(new double[]{ 1, -2, 1 }, false);
        __CLR4_4_11x321x32lb90pdec.R.inc(89687);RealVector solution = new LUDecomposition(coefficients).getSolver().solve(constants);
        __CLR4_4_11x321x32lb90pdec.R.inc(89688);final double cst0 = constants.getEntry(0);
        __CLR4_4_11x321x32lb90pdec.R.inc(89689);final double cst1 = constants.getEntry(1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89690);final double cst2 = constants.getEntry(2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89691);final double sol0 = solution.getEntry(0);
        __CLR4_4_11x321x32lb90pdec.R.inc(89692);final double sol1 = solution.getEntry(1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89693);final double sol2 = solution.getEntry(2);
        __CLR4_4_11x321x32lb90pdec.R.inc(89694);Assert.assertEquals(2 * sol0 + 3 * sol1 - 2 * sol2, cst0, 1E-12);
        __CLR4_4_11x321x32lb90pdec.R.inc(89695);Assert.assertEquals(-1 * sol0 + 7 * sol1 + 6 * sol2, cst1, 1E-12);
        __CLR4_4_11x321x32lb90pdec.R.inc(89696);Assert.assertEquals(4 * sol0 - 3 * sol1 - 5 * sol2, cst2, 1E-12);

    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testSubMatrix() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qygefq1x7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qygefq1x7l(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89697);
        __CLR4_4_11x321x32lb90pdec.R.inc(89698);RealMatrix m = createSparseMatrix(subTestData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89699);RealMatrix mRows23Cols00 = createSparseMatrix(subRows23Cols00);
        __CLR4_4_11x321x32lb90pdec.R.inc(89700);RealMatrix mRows00Cols33 = createSparseMatrix(subRows00Cols33);
        __CLR4_4_11x321x32lb90pdec.R.inc(89701);RealMatrix mRows01Cols23 = createSparseMatrix(subRows01Cols23);
        __CLR4_4_11x321x32lb90pdec.R.inc(89702);RealMatrix mRows02Cols13 = createSparseMatrix(subRows02Cols13);
        __CLR4_4_11x321x32lb90pdec.R.inc(89703);RealMatrix mRows03Cols12 = createSparseMatrix(subRows03Cols12);
        __CLR4_4_11x321x32lb90pdec.R.inc(89704);RealMatrix mRows03Cols123 = createSparseMatrix(subRows03Cols123);
        __CLR4_4_11x321x32lb90pdec.R.inc(89705);RealMatrix mRows20Cols123 = createSparseMatrix(subRows20Cols123);
        __CLR4_4_11x321x32lb90pdec.R.inc(89706);RealMatrix mRows31Cols31 = createSparseMatrix(subRows31Cols31);
        __CLR4_4_11x321x32lb90pdec.R.inc(89707);Assert.assertEquals("Rows23Cols00", mRows23Cols00, m.getSubMatrix(2, 3, 0, 0));
        __CLR4_4_11x321x32lb90pdec.R.inc(89708);Assert.assertEquals("Rows00Cols33", mRows00Cols33, m.getSubMatrix(0, 0, 3, 3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89709);Assert.assertEquals("Rows01Cols23", mRows01Cols23, m.getSubMatrix(0, 1, 2, 3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89710);Assert.assertEquals("Rows02Cols13", mRows02Cols13,
            m.getSubMatrix(new int[] { 0, 2 }, new int[] { 1, 3 }));
        __CLR4_4_11x321x32lb90pdec.R.inc(89711);Assert.assertEquals("Rows03Cols12", mRows03Cols12,
            m.getSubMatrix(new int[] { 0, 3 }, new int[] { 1, 2 }));
        __CLR4_4_11x321x32lb90pdec.R.inc(89712);Assert.assertEquals("Rows03Cols123", mRows03Cols123,
            m.getSubMatrix(new int[] { 0, 3 }, new int[] { 1, 2, 3 }));
        __CLR4_4_11x321x32lb90pdec.R.inc(89713);Assert.assertEquals("Rows20Cols123", mRows20Cols123,
            m.getSubMatrix(new int[] { 2, 0 }, new int[] { 1, 2, 3 }));
        __CLR4_4_11x321x32lb90pdec.R.inc(89714);Assert.assertEquals("Rows31Cols31", mRows31Cols31,
            m.getSubMatrix(new int[] { 3, 1 }, new int[] { 3, 1 }));
        __CLR4_4_11x321x32lb90pdec.R.inc(89715);Assert.assertEquals("Rows31Cols31", mRows31Cols31,
            m.getSubMatrix(new int[] { 3, 1 }, new int[] { 3, 1 }));

        __CLR4_4_11x321x32lb90pdec.R.inc(89716);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89717);m.getSubMatrix(1, 0, 2, 4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89718);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89719);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89720);m.getSubMatrix(-1, 1, 2, 2);
            __CLR4_4_11x321x32lb90pdec.R.inc(89721);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89722);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89723);m.getSubMatrix(1, 0, 2, 2);
            __CLR4_4_11x321x32lb90pdec.R.inc(89724);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89725);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89726);m.getSubMatrix(1, 0, 2, 4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89727);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89728);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89729);m.getSubMatrix(new int[] {}, new int[] { 0 });
            __CLR4_4_11x321x32lb90pdec.R.inc(89730);Assert.fail("Expecting NoDataException");
        } catch (NoDataException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89731);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89732);m.getSubMatrix(new int[] { 0 }, new int[] { 4 });
            __CLR4_4_11x321x32lb90pdec.R.inc(89733);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1x8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1x8m(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89734);
        __CLR4_4_11x321x32lb90pdec.R.inc(89735);RealMatrix m = createSparseMatrix(subTestData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89736);RealMatrix mRow0 = createSparseMatrix(subRow0);
        __CLR4_4_11x321x32lb90pdec.R.inc(89737);RealMatrix mRow3 = createSparseMatrix(subRow3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89738);Assert.assertEquals("Row0", mRow0, m.getRowMatrix(0));
        __CLR4_4_11x321x32lb90pdec.R.inc(89739);Assert.assertEquals("Row3", mRow3, m.getRowMatrix(3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89740);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89741);m.getRowMatrix(-1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89742);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89743);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89744);m.getRowMatrix(4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89745);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1x8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1x8y(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89746);
        __CLR4_4_11x321x32lb90pdec.R.inc(89747);RealMatrix m = createSparseMatrix(subTestData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89748);RealMatrix mColumn1 = createSparseMatrix(subColumn1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89749);RealMatrix mColumn3 = createSparseMatrix(subColumn3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89750);Assert.assertEquals("Column1", mColumn1, m.getColumnMatrix(1));
        __CLR4_4_11x321x32lb90pdec.R.inc(89751);Assert.assertEquals("Column3", mColumn3, m.getColumnMatrix(3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89752);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89753);m.getColumnMatrix(-1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89754);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89755);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89756);m.getColumnMatrix(4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89757);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401x9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401x9a(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89758);
        __CLR4_4_11x321x32lb90pdec.R.inc(89759);RealMatrix m = createSparseMatrix(subTestData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89760);RealVector mRow0 = new ArrayRealVector(subRow0[0]);
        __CLR4_4_11x321x32lb90pdec.R.inc(89761);RealVector mRow3 = new ArrayRealVector(subRow3[0]);
        __CLR4_4_11x321x32lb90pdec.R.inc(89762);Assert.assertEquals("Row0", mRow0, m.getRowVector(0));
        __CLR4_4_11x321x32lb90pdec.R.inc(89763);Assert.assertEquals("Row3", mRow3, m.getRowVector(3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89764);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89765);m.getRowVector(-1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89766);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89767);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89768);m.getRowVector(4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89769);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1x9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1x9m(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89770);
        __CLR4_4_11x321x32lb90pdec.R.inc(89771);RealMatrix m = createSparseMatrix(subTestData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89772);RealVector mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89773);RealVector mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11x321x32lb90pdec.R.inc(89774);Assert.assertEquals("Column1", mColumn1, m.getColumnVector(1));
        __CLR4_4_11x321x32lb90pdec.R.inc(89775);Assert.assertEquals("Column3", mColumn3, m.getColumnVector(3));
        __CLR4_4_11x321x32lb90pdec.R.inc(89776);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89777);m.getColumnVector(-1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89778);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89779);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89780);m.getColumnVector(4);
            __CLR4_4_11x321x32lb90pdec.R.inc(89781);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    private RealVector columnToVector(double[][] column) {try{__CLR4_4_11x321x32lb90pdec.R.inc(89782);
        __CLR4_4_11x321x32lb90pdec.R.inc(89783);double[] data = new double[column.length];
        __CLR4_4_11x321x32lb90pdec.R.inc(89784);for (int i = 0; (((i < data.length)&&(__CLR4_4_11x321x32lb90pdec.R.iget(89785)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89786)==0&false)); ++i) {{
            __CLR4_4_11x321x32lb90pdec.R.inc(89787);data[i] = column[i][0];
        }
        }__CLR4_4_11x321x32lb90pdec.R.inc(89788);return new ArrayRealVector(data, false);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81xa5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81xa5(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89789);
        __CLR4_4_11x321x32lb90pdec.R.inc(89790);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89791);OpenMapRealMatrix m1 = m.copy();
        __CLR4_4_11x321x32lb90pdec.R.inc(89792);OpenMapRealMatrix mt = (OpenMapRealMatrix) m.transpose();
        __CLR4_4_11x321x32lb90pdec.R.inc(89793);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11x321x32lb90pdec.R.inc(89794);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11x321x32lb90pdec.R.inc(89795);Assert.assertEquals(m, m);
        __CLR4_4_11x321x32lb90pdec.R.inc(89796);Assert.assertEquals(m, m1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89797);Assert.assertFalse(m.equals(null));
        __CLR4_4_11x321x32lb90pdec.R.inc(89798);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11x321x32lb90pdec.R.inc(89799);Assert.assertFalse(m.equals(createSparseMatrix(bigSingular)));
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1xag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1xag(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89800);
        __CLR4_4_11x321x32lb90pdec.R.inc(89801);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89802);Assert.assertEquals("OpenMapRealMatrix{{1.0,2.0,3.0},{2.0,5.0,3.0},{1.0,0.0,8.0}}",
            m.toString());
        __CLR4_4_11x321x32lb90pdec.R.inc(89803);m = new OpenMapRealMatrix(1, 1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89804);Assert.assertEquals("OpenMapRealMatrix{{0.0}}", m.toString());
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1xal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1xal(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89805);
        __CLR4_4_11x321x32lb90pdec.R.inc(89806);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89807);m.setSubMatrix(detData2, 1, 1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89808);RealMatrix expected = createSparseMatrix(new double[][] {
                { 1.0, 2.0, 3.0 }, { 2.0, 1.0, 3.0 }, { 1.0, 2.0, 4.0 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89809);Assert.assertEquals(expected, m);

        __CLR4_4_11x321x32lb90pdec.R.inc(89810);m.setSubMatrix(detData2, 0, 0);
        __CLR4_4_11x321x32lb90pdec.R.inc(89811);expected = createSparseMatrix(new double[][] {
                { 1.0, 3.0, 3.0 }, { 2.0, 4.0, 3.0 }, { 1.0, 2.0, 4.0 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89812);Assert.assertEquals(expected, m);

        __CLR4_4_11x321x32lb90pdec.R.inc(89813);m.setSubMatrix(testDataPlus2, 0, 0);
        __CLR4_4_11x321x32lb90pdec.R.inc(89814);expected = createSparseMatrix(new double[][] {
                { 3.0, 4.0, 5.0 }, { 4.0, 7.0, 5.0 }, { 3.0, 2.0, 10.0 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89815);Assert.assertEquals(expected, m);

        // javadoc example
        __CLR4_4_11x321x32lb90pdec.R.inc(89816);OpenMapRealMatrix matrix =
            createSparseMatrix(new double[][] {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89817);matrix.setSubMatrix(new double[][] { { 3, 4 }, { 5, 6 } }, 1, 1);
        __CLR4_4_11x321x32lb90pdec.R.inc(89818);expected = createSparseMatrix(new double[][] {
                { 1, 2, 3, 4 }, { 5, 3, 4, 8 }, { 9, 5, 6, 2 } });
        __CLR4_4_11x321x32lb90pdec.R.inc(89819);Assert.assertEquals(expected, matrix);

        // dimension overflow
        __CLR4_4_11x321x32lb90pdec.R.inc(89820);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89821);m.setSubMatrix(testData, 1, 1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89822);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11x321x32lb90pdec.R.inc(89823);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89824);m.setSubMatrix(testData, -1, 1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89825);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89826);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89827);m.setSubMatrix(testData, 1, -1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89828);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11x321x32lb90pdec.R.inc(89829);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89830);m.setSubMatrix(null, 1, 1);
            __CLR4_4_11x321x32lb90pdec.R.inc(89831);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
        __CLR4_4_11x321x32lb90pdec.R.inc(89832);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89833);new OpenMapRealMatrix(0, 0);
            __CLR4_4_11x321x32lb90pdec.R.inc(89834);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // ragged
        __CLR4_4_11x321x32lb90pdec.R.inc(89835);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89836);m.setSubMatrix(new double[][] { { 1 }, { 2, 3 } }, 0, 0);
            __CLR4_4_11x321x32lb90pdec.R.inc(89837);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11x321x32lb90pdec.R.inc(89838);try {
            __CLR4_4_11x321x32lb90pdec.R.inc(89839);m.setSubMatrix(new double[][] { {} }, 0, 0);
            __CLR4_4_11x321x32lb90pdec.R.inc(89840);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11x321x32lb90pdec.R.globalSliceStart(getClass().getName(),89841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1xbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11x321x32lb90pdec.R.rethrow($CLV_t2$);}finally{__CLR4_4_11x321x32lb90pdec.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseRealMatrixTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1xbl(){try{__CLR4_4_11x321x32lb90pdec.R.inc(89841);
        __CLR4_4_11x321x32lb90pdec.R.inc(89842);OpenMapRealMatrix m = createSparseMatrix(testData);
        __CLR4_4_11x321x32lb90pdec.R.inc(89843);Assert.assertEquals(m,TestUtils.serializeAndRecover(m));
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    // --------------- -----------------Protected methods

    /** verifies that two matrices are close (1-norm) */
    protected void assertClose(String msg, RealMatrix m, RealMatrix n,
            double tolerance) {try{__CLR4_4_11x321x32lb90pdec.R.inc(89844);
        __CLR4_4_11x321x32lb90pdec.R.inc(89845);Assert.assertTrue(msg, m.subtract(n).getNorm() < tolerance);
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    /** verifies that two vectors are close (sup norm) */
    protected void assertClose(String msg, double[] m, double[] n,
            double tolerance) {try{__CLR4_4_11x321x32lb90pdec.R.inc(89846);
        __CLR4_4_11x321x32lb90pdec.R.inc(89847);if ((((m.length != n.length)&&(__CLR4_4_11x321x32lb90pdec.R.iget(89848)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89849)==0&false))) {{
            __CLR4_4_11x321x32lb90pdec.R.inc(89850);Assert.fail("vectors not same length");
        }
        }__CLR4_4_11x321x32lb90pdec.R.inc(89851);for (int i = 0; (((i < m.length)&&(__CLR4_4_11x321x32lb90pdec.R.iget(89852)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89853)==0&false)); i++) {{
            __CLR4_4_11x321x32lb90pdec.R.inc(89854);Assert.assertEquals(msg + " " + i + " elements differ", m[i], n[i],
                    tolerance);
        }
    }}finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}

    private OpenMapRealMatrix createSparseMatrix(double[][] data) {try{__CLR4_4_11x321x32lb90pdec.R.inc(89855);
        __CLR4_4_11x321x32lb90pdec.R.inc(89856);OpenMapRealMatrix matrix = new OpenMapRealMatrix(data.length, data[0].length);
        __CLR4_4_11x321x32lb90pdec.R.inc(89857);for (int row = 0; (((row < data.length)&&(__CLR4_4_11x321x32lb90pdec.R.iget(89858)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89859)==0&false)); row++) {{
            __CLR4_4_11x321x32lb90pdec.R.inc(89860);for (int col = 0; (((col < data[row].length)&&(__CLR4_4_11x321x32lb90pdec.R.iget(89861)!=0|true))||(__CLR4_4_11x321x32lb90pdec.R.iget(89862)==0&false)); col++) {{
                __CLR4_4_11x321x32lb90pdec.R.inc(89863);matrix.setEntry(row, col, data[row][col]);
            }
        }}
        }__CLR4_4_11x321x32lb90pdec.R.inc(89864);return matrix;
    }finally{__CLR4_4_11x321x32lb90pdec.R.flushNeeded();}}
}
