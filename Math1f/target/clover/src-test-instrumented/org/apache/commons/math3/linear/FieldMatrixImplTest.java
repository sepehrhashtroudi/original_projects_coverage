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
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * Test cases for the {@link Array2DRowFieldMatrix} class.
 *
 * @version $Id$
 */

public final class FieldMatrixImplTest {static class __CLR4_4_11u1w1u1wlb90pd6q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // 3 x 3 identity matrix
    protected Fraction[][] id = { {new Fraction(1),new Fraction(0),new Fraction(0)}, {new Fraction(0),new Fraction(1),new Fraction(0)}, {new Fraction(0),new Fraction(0),new Fraction(1)} };

    // Test data for group operations
    protected Fraction[][] testData = { {new Fraction(1),new Fraction(2),new Fraction(3)}, {new Fraction(2),new Fraction(5),new Fraction(3)}, {new Fraction(1),new Fraction(0),new Fraction(8)} };
    protected Fraction[][] testDataLU = {{new Fraction(2), new Fraction(5), new Fraction(3)}, {new Fraction(1, 2), new Fraction(-5, 2), new Fraction(13, 2)}, {new Fraction(1, 2), new Fraction(1, 5), new Fraction(1, 5)}};
    protected Fraction[][] testDataPlus2 = { {new Fraction(3),new Fraction(4),new Fraction(5)}, {new Fraction(4),new Fraction(7),new Fraction(5)}, {new Fraction(3),new Fraction(2),new Fraction(10)} };
    protected Fraction[][] testDataMinus = { {new Fraction(-1),new Fraction(-2),new Fraction(-3)}, {new Fraction(-2),new Fraction(-5),new Fraction(-3)},
       {new Fraction(-1),new Fraction(0),new Fraction(-8)} };
    protected Fraction[] testDataRow1 = {new Fraction(1),new Fraction(2),new Fraction(3)};
    protected Fraction[] testDataCol3 = {new Fraction(3),new Fraction(3),new Fraction(8)};
    protected Fraction[][] testDataInv =
        { {new Fraction(-40),new Fraction(16),new Fraction(9)}, {new Fraction(13),new Fraction(-5),new Fraction(-3)}, {new Fraction(5),new Fraction(-2),new Fraction(-1)} };
    protected Fraction[] preMultTest = {new Fraction(8),new Fraction(12),new Fraction(33)};
    protected Fraction[][] testData2 ={ {new Fraction(1),new Fraction(2),new Fraction(3)}, {new Fraction(2),new Fraction(5),new Fraction(3)}};
    protected Fraction[][] testData2T = { {new Fraction(1),new Fraction(2)}, {new Fraction(2),new Fraction(5)}, {new Fraction(3),new Fraction(3)}};
    protected Fraction[][] testDataPlusInv =
        { {new Fraction(-39),new Fraction(18),new Fraction(12)}, {new Fraction(15),new Fraction(0),new Fraction(0)}, {new Fraction(6),new Fraction(-2),new Fraction(7)} };

    // lu decomposition tests
    protected Fraction[][] luData = { {new Fraction(2),new Fraction(3),new Fraction(3)}, {new Fraction(0),new Fraction(5),new Fraction(7)}, {new Fraction(6),new Fraction(9),new Fraction(8)} };
    protected Fraction[][] luDataLUDecomposition = { {new Fraction(6),new Fraction(9),new Fraction(8)}, {new Fraction(0),new Fraction(5),new Fraction(7)},
            {new Fraction(1, 3),new Fraction(0),new Fraction(1, 3)} };

    // singular matrices
    protected Fraction[][] singular = { {new Fraction(2),new Fraction(3)}, {new Fraction(2),new Fraction(3)} };
    protected Fraction[][] bigSingular = {{new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)}, {new Fraction(2),new Fraction(5),new Fraction(3),new Fraction(4)},
        {new Fraction(7),new Fraction(3),new Fraction(256),new Fraction(1930)}, {new Fraction(3),new Fraction(7),new Fraction(6),new Fraction(8)}}; // 4th row = 1st + 2nd
    protected Fraction[][] detData = { {new Fraction(1),new Fraction(2),new Fraction(3)}, {new Fraction(4),new Fraction(5),new Fraction(6)}, {new Fraction(7),new Fraction(8),new Fraction(10)} };
    protected Fraction[][] detData2 = { {new Fraction(1), new Fraction(3)}, {new Fraction(2), new Fraction(4)}};

    // vectors
    protected Fraction[] testVector = {new Fraction(1),new Fraction(2),new Fraction(3)};
    protected Fraction[] testVector2 = {new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)};

    // submatrix accessor tests
    protected Fraction[][] subTestData = {{new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4)}, {new Fraction(3, 2), new Fraction(5, 2), new Fraction(7, 2), new Fraction(9, 2)},
            {new Fraction(2), new Fraction(4), new Fraction(6), new Fraction(8)}, {new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7)}};
    // array selections
    protected Fraction[][] subRows02Cols13 = { {new Fraction(2), new Fraction(4)}, {new Fraction(4), new Fraction(8)}};
    protected Fraction[][] subRows03Cols12 = { {new Fraction(2), new Fraction(3)}, {new Fraction(5), new Fraction(6)}};
    protected Fraction[][] subRows03Cols123 = { {new Fraction(2), new Fraction(3), new Fraction(4)} , {new Fraction(5), new Fraction(6), new Fraction(7)}};
    // effective permutations
    protected Fraction[][] subRows20Cols123 = { {new Fraction(4), new Fraction(6), new Fraction(8)} , {new Fraction(2), new Fraction(3), new Fraction(4)}};
    protected Fraction[][] subRows31Cols31 = {{new Fraction(7), new Fraction(5)}, {new Fraction(9, 2), new Fraction(5, 2)}};
    // contiguous ranges
    protected Fraction[][] subRows01Cols23 = {{new Fraction(3),new Fraction(4)} , {new Fraction(7, 2), new Fraction(9, 2)}};
    protected Fraction[][] subRows23Cols00 = {{new Fraction(2)} , {new Fraction(4)}};
    protected Fraction[][] subRows00Cols33 = {{new Fraction(4)}};
    // row matrices
    protected Fraction[][] subRow0 = {{new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)}};
    protected Fraction[][] subRow3 = {{new Fraction(4),new Fraction(5),new Fraction(6),new Fraction(7)}};
    // column matrices
    protected Fraction[][] subColumn1 = {{new Fraction(2)}, {new Fraction(5, 2)}, {new Fraction(4)}, {new Fraction(5)}};
    protected Fraction[][] subColumn3 = {{new Fraction(4)}, {new Fraction(9, 2)}, {new Fraction(8)}, {new Fraction(7)}};

    // tolerances
    protected double entryTolerance = 10E-16;
    protected double normTolerance = 10E-14;

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21u1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21u1w(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85604);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85605);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85606);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(testData2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85607);Assert.assertEquals("testData row dimension",3,m.getRowDimension());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85608);Assert.assertEquals("testData column dimension",3,m.getColumnDimension());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85609);Assert.assertTrue("testData is square",m.isSquare());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85610);Assert.assertEquals("testData2 row dimension",m2.getRowDimension(),2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85611);Assert.assertEquals("testData2 column dimension",m2.getColumnDimension(),3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85612);Assert.assertTrue("testData2 is not square",!m2.isSquare());
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1u25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1u25(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85613);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85614);Array2DRowFieldMatrix<Fraction> m1 = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85615);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(m1.getData());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85616);Assert.assertEquals(m2,m1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85617);Array2DRowFieldMatrix<Fraction> m3 = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85618);Array2DRowFieldMatrix<Fraction> m4 = new Array2DRowFieldMatrix<Fraction>(m3.getData(), false);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85619);Assert.assertEquals(m4,m3);
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1u2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1u2c(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85620);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85621);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85622);Array2DRowFieldMatrix<Fraction> mInv = new Array2DRowFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85623);FieldMatrix<Fraction> mPlusMInv = m.add(mInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85624);Fraction[][] sumEntries = mPlusMInv.getData();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85625);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85626)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85627)==0&false)); row++) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85628);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85629)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85630)==0&false)); col++) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85631);Assert.assertEquals(testDataPlusInv[row][col],sumEntries[row][col]);
            }
        }}
    }}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1u2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1u2o(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85632);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85633);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85634);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(testData2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85635);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85636);m.add(m2);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85637);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

     /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1u2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1u2u(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85638);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85639);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85640);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85641);TestUtils.assertEquals(m.subtract(m2),m2.scalarMultiply(new Fraction(-1)).add(m));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85642);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85643);m.subtract(new Array2DRowFieldMatrix<Fraction>(testData2));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85644);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test multiply */
    @Test
     public void testMultiply() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1u31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1u31(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85645);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85646);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85647);Array2DRowFieldMatrix<Fraction> mInv = new Array2DRowFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85648);Array2DRowFieldMatrix<Fraction> identity = new Array2DRowFieldMatrix<Fraction>(id);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85649);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(testData2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85650);TestUtils.assertEquals(m.multiply(mInv), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85651);TestUtils.assertEquals(mInv.multiply(m), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85652);TestUtils.assertEquals(m.multiply(identity), m);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85653);TestUtils.assertEquals(identity.multiply(mInv), mInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85654);TestUtils.assertEquals(m2.multiply(identity), m2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85655);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85656);m.multiply(new Array2DRowFieldMatrix<Fraction>(bigSingular));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85657);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    //Additional Test for Array2DRowFieldMatrix<Fraction>Test.testMultiply

    private Fraction[][] d3 = new Fraction[][] {{new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)},{new Fraction(5),new Fraction(6),new Fraction(7),new Fraction(8)}};
    private Fraction[][] d4 = new Fraction[][] {{new Fraction(1)},{new Fraction(2)},{new Fraction(3)},{new Fraction(4)}};
    private Fraction[][] d5 = new Fraction[][] {{new Fraction(30)},{new Fraction(70)}};

    @Test
    public void testMultiply2() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251u3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251u3e(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85658);
       __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85659);FieldMatrix<Fraction> m3 = new Array2DRowFieldMatrix<Fraction>(d3);
       __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85660);FieldMatrix<Fraction> m4 = new Array2DRowFieldMatrix<Fraction>(d4);
       __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85661);FieldMatrix<Fraction> m5 = new Array2DRowFieldMatrix<Fraction>(d5);
       __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85662);TestUtils.assertEquals(m3.multiply(m4), m5);
   }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testPower() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7pxfe1u3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testPower",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7pxfe1u3j(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85663);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85664);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85665);FieldMatrix<Fraction> mInv = new Array2DRowFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85666);FieldMatrix<Fraction> mPlusInv = new Array2DRowFieldMatrix<Fraction>(testDataPlusInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85667);FieldMatrix<Fraction> identity = new Array2DRowFieldMatrix<Fraction>(id);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85668);TestUtils.assertEquals(m.power(0), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85669);TestUtils.assertEquals(mInv.power(0), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85670);TestUtils.assertEquals(mPlusInv.power(0), identity);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85671);TestUtils.assertEquals(m.power(1), m);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85672);TestUtils.assertEquals(mInv.power(1), mInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85673);TestUtils.assertEquals(mPlusInv.power(1), mPlusInv);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85674);FieldMatrix<Fraction> C1 = m.copy();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85675);FieldMatrix<Fraction> C2 = mInv.copy();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85676);FieldMatrix<Fraction> C3 = mPlusInv.copy();

        // stop at 5 to avoid overflow
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85677);for (int i = 2; (((i <= 5)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85678)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85679)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85680);C1 = C1.multiply(m);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85681);C2 = C2.multiply(mInv);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85682);C3 = C3.multiply(mPlusInv);

            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85683);TestUtils.assertEquals(m.power(i), C1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85684);TestUtils.assertEquals(mInv.power(i), C2);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85685);TestUtils.assertEquals(mPlusInv.power(i), C3);
        }

        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85686);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85687);FieldMatrix<Fraction> mNotSquare = new Array2DRowFieldMatrix<Fraction>(testData2T);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85688);mNotSquare.power(2);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85689);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85690);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85691);m.power(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85692);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61u4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61u4d(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85693);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85694);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(id);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85695);Assert.assertEquals("identity trace",new Fraction(3),m.getTrace());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85696);m = new Array2DRowFieldMatrix<Fraction>(testData2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85697);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85698);m.getTrace();
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85699);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test sclarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1u4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1u4k(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85700);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85701);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85702);TestUtils.assertEquals(new Array2DRowFieldMatrix<Fraction>(testDataPlus2), m.scalarAdd(new Fraction(2)));
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1u4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1u4n(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85703);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85704);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(id);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85705);TestUtils.assertEquals(testVector, m.operate(testVector));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85706);TestUtils.assertEquals(testVector, m.operate(new ArrayFieldVector<Fraction>(testVector)).getData());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85707);m = new Array2DRowFieldMatrix<Fraction>(bigSingular);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85708);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85709);m.operate(testVector);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85710);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1u4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1u4v(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85711);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85712);FieldMatrix<Fraction> a = new Array2DRowFieldMatrix<Fraction>(new Fraction[][] {
                { new Fraction(1), new Fraction(2) }, { new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6) }
        }, false);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85713);Fraction[] b = a.operate(new Fraction[] { new Fraction(1), new Fraction(1) });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85714);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85715);Assert.assertEquals( new Fraction(3), b[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85716);Assert.assertEquals( new Fraction(7), b[1]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85717);Assert.assertEquals(new Fraction(11), b[2]);
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21u52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21u52(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85718);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85719);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85720);FieldMatrix<Fraction> mIT = new FieldLUDecomposition<Fraction>(m).getSolver().getInverse().transpose();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85721);FieldMatrix<Fraction> mTI = new FieldLUDecomposition<Fraction>(m.transpose()).getSolver().getInverse();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85722);TestUtils.assertEquals(mIT, mTI);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85723);m = new Array2DRowFieldMatrix<Fraction>(testData2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85724);FieldMatrix<Fraction> mt = new Array2DRowFieldMatrix<Fraction>(testData2T);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85725);TestUtils.assertEquals(mt, m.transpose());
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1u5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1u5a(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85726);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85727);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85728);TestUtils.assertEquals(m.preMultiply(testVector), preMultTest);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85729);TestUtils.assertEquals(m.preMultiply(new ArrayFieldVector<Fraction>(testVector).getData()),
                               preMultTest);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85730);m = new Array2DRowFieldMatrix<Fraction>(bigSingular);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85731);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85732);m.preMultiply(testVector);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85733);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01u5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01u5i(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85734);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85735);FieldMatrix<Fraction> m3 = new Array2DRowFieldMatrix<Fraction>(d3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85736);FieldMatrix<Fraction> m4 = new Array2DRowFieldMatrix<Fraction>(d4);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85737);FieldMatrix<Fraction> m5 = new Array2DRowFieldMatrix<Fraction>(d5);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85738);TestUtils.assertEquals(m4.preMultiply(m3), m5);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85739);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85740);Array2DRowFieldMatrix<Fraction> mInv = new Array2DRowFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85741);Array2DRowFieldMatrix<Fraction> identity = new Array2DRowFieldMatrix<Fraction>(id);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85742);TestUtils.assertEquals(m.preMultiply(mInv), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85743);TestUtils.assertEquals(mInv.preMultiply(m), identity);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85744);TestUtils.assertEquals(m.preMultiply(identity), m);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85745);TestUtils.assertEquals(identity.preMultiply(mInv), mInv);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85746);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85747);m.preMultiply(new Array2DRowFieldMatrix<Fraction>(bigSingular));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85748);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711u5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711u5x(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85749);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85750);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85751);TestUtils.assertEquals(m.getRow(0), testDataRow1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85752);TestUtils.assertEquals(m.getColumn(2), testDataCol3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85753);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85754);m.getRow(10);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85755);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85756);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85757);m.getColumn(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85758);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1u67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1u67(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85759);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85760);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85761);Assert.assertEquals("get entry", m.getEntry(0,1), new Fraction(2));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85762);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85763);m.getEntry(10, 4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85764);Assert.fail ("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1u6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1u6d(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85765);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85766);Fraction[][] matrixData = {
                {new Fraction(1),new Fraction(2),new Fraction(3)},
                {new Fraction(2),new Fraction(5),new Fraction(3)}
        };
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85767);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85768);Fraction[][] matrixData2 = {
                {new Fraction(1),new Fraction(2)},
                {new Fraction(2),new Fraction(5)},
                {new Fraction(1), new Fraction(7)}
        };
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85769);FieldMatrix<Fraction> n = new Array2DRowFieldMatrix<Fraction>(matrixData2);
        // Now multiply m by n
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85770);FieldMatrix<Fraction> p = m.multiply(n);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85771);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85772);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85773);FieldMatrix<Fraction> pInverse = new FieldLUDecomposition<Fraction>(p).getSolver().getInverse();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85774);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85775);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85776);Fraction[][] coefficientsData = {
                {new Fraction(2), new Fraction(3), new Fraction(-2)},
                {new Fraction(-1), new Fraction(7), new Fraction(6)},
                {new Fraction(4), new Fraction(-3), new Fraction(-5)}
        };
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85777);FieldMatrix<Fraction> coefficients = new Array2DRowFieldMatrix<Fraction>(coefficientsData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85778);Fraction[] constants = {
            new Fraction(1), new Fraction(-2), new Fraction(1)
        };
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85779);Fraction[] solution;
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85780);solution = new FieldLUDecomposition<Fraction>(coefficients)
            .getSolver()
            .solve(new ArrayFieldVector<Fraction>(constants, false)).toArray();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85781);Assert.assertEquals(new Fraction(2).multiply(solution[0]).
                     add(new Fraction(3).multiply(solution[1])).
                     subtract(new Fraction(2).multiply(solution[2])), constants[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85782);Assert.assertEquals(new Fraction(-1).multiply(solution[0]).
                     add(new Fraction(7).multiply(solution[1])).
                     add(new Fraction(6).multiply(solution[2])), constants[1]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85783);Assert.assertEquals(new Fraction(4).multiply(solution[0]).
                     subtract(new Fraction(3).multiply(solution[1])).
                     subtract(new Fraction(5).multiply(solution[2])), constants[2]);

    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testGetSubMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19452rg1u6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19452rg1u6w(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85784);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85785);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85786);checkGetSubMatrix(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85787);checkGetSubMatrix(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85788);checkGetSubMatrix(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85789);checkGetSubMatrix(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85790);checkGetSubMatrix(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85791);checkGetSubMatrix(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85792);checkGetSubMatrix(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85793);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85794);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85795);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85796);checkGetSubMatrix(m, null, -1, 1, 2, 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85797);checkGetSubMatrix(m, null,  1, 0, 2, 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85798);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85799);checkGetSubMatrix(m, null, new int[] {},    new int[] { 0 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85800);checkGetSubMatrix(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private void checkGetSubMatrix(FieldMatrix<Fraction> m, Fraction[][] reference,
                                   int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85801);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85802);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85803);FieldMatrix<Fraction> sub = m.getSubMatrix(startRow, endRow, startColumn, endColumn);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85804);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85805)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85806)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85807);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(reference), sub);
            } }else {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85808);Assert.fail("Expecting OutOfRangeException or NotStrictlyPositiveException"
                     + " or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85809);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85810)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85811)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85812);throw e;
            }
        }} catch (NotStrictlyPositiveException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85813);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85814)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85815)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85816);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85817);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85818)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85819)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85820);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85821);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85822)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85823)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85824);throw e;
            }
        }}
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private void checkGetSubMatrix(FieldMatrix<Fraction> m, Fraction[][] reference,
                                   int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85825);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85826);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85827);FieldMatrix<Fraction> sub = m.getSubMatrix(selectedRows, selectedColumns);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85828);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85829)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85830)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85831);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(reference), sub);
            } }else {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85832);Assert.fail("Expecting OutOfRangeException or NotStrictlyPositiveException"
                     + " or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85833);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85834)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85835)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85836);throw e;
            }
        }} catch (NotStrictlyPositiveException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85837);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85838)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85839)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85840);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85841);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85842)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85843)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85844);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85845);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85846)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85847)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85848);throw e;
            }
        }}
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testCopySubMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y87lfj1u8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testCopySubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y87lfj1u8p(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85849);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85850);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85851);checkCopy(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85852);checkCopy(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85853);checkCopy(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85854);checkCopy(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85855);checkCopy(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85856);checkCopy(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85857);checkCopy(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85858);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85859);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85860);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85861);checkCopy(m, null, -1, 1, 2, 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85862);checkCopy(m, null,  1, 0, 2, 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85863);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85864);checkCopy(m, null, new int[] {},    new int[] { 0 });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85865);checkCopy(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private void checkCopy(FieldMatrix<Fraction> m, Fraction[][] reference,
                           int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85866);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85867);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85868);Fraction[][] sub = ((((reference == null) )&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85869)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85870)==0&false))?
                             new Fraction[1][1] :
                             new Fraction[reference.length][reference[0].length];
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85871);m.copySubMatrix(startRow, endRow, startColumn, endColumn, sub);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85872);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85873)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85874)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85875);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(reference), new Array2DRowFieldMatrix<Fraction>(sub));
            } }else {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85876);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85877);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85878)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85879)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85880);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85881);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85882)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85883)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85884);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85885);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85886)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85887)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85888);throw e;
            }
        }}
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private void checkCopy(FieldMatrix<Fraction> m, Fraction[][] reference,
                           int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85889);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85890);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85891);Fraction[][] sub = ((((reference == null) )&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85892)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85893)==0&false))?
                    new Fraction[1][1] :
                    new Fraction[reference.length][reference[0].length];
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85894);m.copySubMatrix(selectedRows, selectedColumns, sub);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85895);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85896)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85897)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85898);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(reference), new Array2DRowFieldMatrix<Fraction>(sub));
            } }else {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85899);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85900);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85901)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85902)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85903);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85904);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85905)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85906)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85907);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85908);if ((((reference != null)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85909)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(85910)==0&false))) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85911);throw e;
            }
        }}
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1uag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1uag(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85912);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85913);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85914);FieldMatrix<Fraction> mRow0 = new Array2DRowFieldMatrix<Fraction>(subRow0);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85915);FieldMatrix<Fraction> mRow3 = new Array2DRowFieldMatrix<Fraction>(subRow3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85916);Assert.assertEquals("Row0", mRow0,
                m.getRowMatrix(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85917);Assert.assertEquals("Row3", mRow3,
                m.getRowMatrix(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85918);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85919);m.getRowMatrix(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85920);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85921);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85922);m.getRowMatrix(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85923);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetRowMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydvo21uas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydvo21uas(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85924);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85925);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85926);FieldMatrix<Fraction> mRow3 = new Array2DRowFieldMatrix<Fraction>(subRow3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85927);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85928);m.setRowMatrix(0, mRow3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85929);Assert.assertEquals(mRow3, m.getRowMatrix(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85930);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85931);m.setRowMatrix(-1, mRow3);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85932);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85933);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85934);m.setRowMatrix(0, m);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85935);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1ub4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1ub4(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85936);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85937);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85938);FieldMatrix<Fraction> mColumn1 = new Array2DRowFieldMatrix<Fraction>(subColumn1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85939);FieldMatrix<Fraction> mColumn3 = new Array2DRowFieldMatrix<Fraction>(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85940);Assert.assertEquals("Column1", mColumn1,
                m.getColumnMatrix(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85941);Assert.assertEquals("Column3", mColumn3,
                m.getColumnMatrix(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85942);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85943);m.getColumnMatrix(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85944);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85945);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85946);m.getColumnMatrix(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85947);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetColumnMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh7wb61ubg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh7wb61ubg(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85948);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85949);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85950);FieldMatrix<Fraction> mColumn3 = new Array2DRowFieldMatrix<Fraction>(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85951);Assert.assertNotSame(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85952);m.setColumnMatrix(1, mColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85953);Assert.assertEquals(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85954);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85955);m.setColumnMatrix(-1, mColumn3);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85956);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85957);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85958);m.setColumnMatrix(0, m);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85959);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401ubs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401ubs(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85960);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85961);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85962);FieldVector<Fraction> mRow0 = new ArrayFieldVector<Fraction>(subRow0[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85963);FieldVector<Fraction> mRow3 = new ArrayFieldVector<Fraction>(subRow3[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85964);Assert.assertEquals("Row0", mRow0, m.getRowVector(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85965);Assert.assertEquals("Row3", mRow3, m.getRowVector(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85966);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85967);m.getRowVector(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85968);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85969);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85970);m.getRowVector(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85971);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetRowVector() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwpvsc1uc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwpvsc1uc4(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85972);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85973);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85974);FieldVector<Fraction> mRow3 = new ArrayFieldVector<Fraction>(subRow3[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85975);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85976);m.setRowVector(0, mRow3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85977);Assert.assertEquals(mRow3, m.getRowVector(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85978);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85979);m.setRowVector(-1, mRow3);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85980);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85981);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85982);m.setRowVector(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), 5));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85983);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1ucg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1ucg(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85984);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85985);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85986);FieldVector<Fraction> mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85987);FieldVector<Fraction> mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85988);Assert.assertEquals("Column1", mColumn1, m.getColumnVector(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85989);Assert.assertEquals("Column3", mColumn3, m.getColumnVector(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85990);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85991);m.getColumnVector(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85992);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85993);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85994);m.getColumnVector(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85995);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetColumnVector() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),85996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb7lsg1ucs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb7lsg1ucs(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(85996);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85997);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85998);FieldVector<Fraction> mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(85999);Assert.assertNotSame(mColumn3, m.getColumnVector(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86000);m.setColumnVector(1, mColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86001);Assert.assertEquals(mColumn3, m.getColumnVector(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86002);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86003);m.setColumnVector(-1, mColumn3);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86004);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86005);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86006);m.setColumnVector(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), 5));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86007);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private FieldVector<Fraction> columnToVector(Fraction[][] column) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86008);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86009);Fraction[] data = new Fraction[column.length];
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86010);for (int i = 0; (((i < data.length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86011)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86012)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86013);data[i] = column[i][0];
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86014);return new ArrayFieldVector<Fraction>(data, false);
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetRow() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1bja51udb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1bja51udb(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86015);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86016);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86017);checkArrays(subRow0[0], m.getRow(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86018);checkArrays(subRow3[0], m.getRow(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86019);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86020);m.getRow(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86021);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86022);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86023);m.getRow(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86024);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetRow() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z2y4x1udl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z2y4x1udl(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86025);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86026);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86027);Assert.assertTrue(subRow3[0][0] != m.getRow(0)[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86028);m.setRow(0, subRow3[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86029);checkArrays(subRow3[0], m.getRow(0));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86030);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86031);m.setRow(-1, subRow3[0]);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86032);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86033);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86034);m.setRow(0, new Fraction[5]);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86035);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testGetColumn() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynjvhb1udw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testGetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynjvhb1udw(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86036);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86037);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86038);Fraction[] mColumn1 = columnToArray(subColumn1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86039);Fraction[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86040);checkArrays(mColumn1, m.getColumn(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86041);checkArrays(mColumn3, m.getColumn(3));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86042);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86043);m.getColumn(-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86044);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86045);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86046);m.getColumn(4);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86047);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetColumn() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5snzh1ue8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5snzh1ue8(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86048);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86049);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86050);Fraction[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86051);Assert.assertTrue(mColumn3[0] != m.getColumn(1)[0]);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86052);m.setColumn(1, mColumn3);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86053);checkArrays(mColumn3, m.getColumn(1));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86054);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86055);m.setColumn(-1, mColumn3);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86056);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86057);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86058);m.setColumn(0, new Fraction[5]);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86059);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private Fraction[] columnToArray(Fraction[][] column) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86060);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86061);Fraction[] data = new Fraction[column.length];
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86062);for (int i = 0; (((i < data.length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86063)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86064)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86065);data[i] = column[i][0];
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86066);return data;
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private void checkArrays(Fraction[] expected, Fraction[] actual) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86067);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86068);Assert.assertEquals(expected.length, actual.length);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86069);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86070)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86071)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86072);Assert.assertEquals(expected[i], actual[i]);
        }
    }}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81uex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81uex(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86073);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86074);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86075);Array2DRowFieldMatrix<Fraction> m1 = (Array2DRowFieldMatrix<Fraction>) m.copy();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86076);Array2DRowFieldMatrix<Fraction> mt = (Array2DRowFieldMatrix<Fraction>) m.transpose();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86077);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86078);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86079);Assert.assertEquals(m, m);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86080);Assert.assertEquals(m, m1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86081);Assert.assertFalse(m.equals(null));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86082);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86083);Assert.assertFalse(m.equals(new Array2DRowFieldMatrix<Fraction>(bigSingular)));
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1uf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1uf8(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86084);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86085);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86086);Assert.assertEquals("Array2DRowFieldMatrix{{1,2,3},{2,5,3},{1,0,8}}", m.toString());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86087);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86088);Assert.assertEquals("Array2DRowFieldMatrix{}", m.toString());
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1ufd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1ufd(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86089);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86090);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86091);m.setSubMatrix(detData2,1,1);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86092);FieldMatrix<Fraction> expected = new Array2DRowFieldMatrix<Fraction>
            (new Fraction[][] {
                    {new Fraction(1),new Fraction(2),new Fraction(3)},
                    {new Fraction(2),new Fraction(1),new Fraction(3)},
                    {new Fraction(1),new Fraction(2),new Fraction(4)}
             });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86093);Assert.assertEquals(expected, m);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86094);m.setSubMatrix(detData2,0,0);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86095);expected = new Array2DRowFieldMatrix<Fraction>
            (new Fraction[][] {
                    {new Fraction(1),new Fraction(3),new Fraction(3)},
                    {new Fraction(2),new Fraction(4),new Fraction(3)},
                    {new Fraction(1),new Fraction(2),new Fraction(4)}
             });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86096);Assert.assertEquals(expected, m);

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86097);m.setSubMatrix(testDataPlus2,0,0);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86098);expected = new Array2DRowFieldMatrix<Fraction>
            (new Fraction[][] {
                    {new Fraction(3),new Fraction(4),new Fraction(5)},
                    {new Fraction(4),new Fraction(7),new Fraction(5)},
                    {new Fraction(3),new Fraction(2),new Fraction(10)}
             });
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86099);Assert.assertEquals(expected, m);

        // dimension overflow
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86100);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86101);m.setSubMatrix(testData,1,1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86102);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86103);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86104);m.setSubMatrix(testData,-1,1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86105);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86106);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86107);m.setSubMatrix(testData,1,-1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86108);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86109);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86110);m.setSubMatrix(null, 1, 1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86111);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86112);Array2DRowFieldMatrix<Fraction> m2 = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86113);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86114);m2.setSubMatrix(testData,0,1);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86115);Assert.fail("expecting MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // expected
        }
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86116);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86117);m2.setSubMatrix(testData,1,0);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86118);Assert.fail("expecting MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // expected
        }

        // ragged
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86119);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86120);m.setSubMatrix(new Fraction[][] {{new Fraction(1)}, {new Fraction(2), new Fraction(3)}}, 0, 0);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86121);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86122);try {
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86123);m.setSubMatrix(new Fraction[][] {{}}, 0, 0);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86124);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testWalk() {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1310jtu1ugd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testWalk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1310jtu1ugd(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86125);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86126);int rows    = 150;
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86127);int columns = 75;

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86128);FieldMatrix<Fraction> m =
            new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86129);m.walkInRowOrder(new SetVisitor());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86130);GetVisitor getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86131);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86132);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86133);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86134);m.walkInRowOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86135);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86136);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86137);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86138);for (int i = 0; (((i < rows)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86139)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86140)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86141);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86142);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86143);for (int j = 0; (((j < columns)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86144)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86145)==0&false)); ++j) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86146);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86147);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86148);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86149);m.walkInColumnOrder(new SetVisitor());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86150);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86151);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86152);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86153);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86154);m.walkInColumnOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86155);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86156);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86157);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86158);for (int i = 0; (((i < rows)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86159)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86160)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86161);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86162);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86163);for (int j = 0; (((j < columns)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86164)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86165)==0&false)); ++j) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86166);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86167);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86168);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86169);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86170);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86171);m.walkInRowOrder(getVisitor);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86172);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86173);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86174);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86175);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86176);m.walkInRowOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86177);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86178);for (int i = 0; (((i < rows)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86179)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86180)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86181);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86182);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86183);for (int j = 0; (((j < columns)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86184)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86185)==0&false)); ++j) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86186);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86187);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86188);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86189);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86190);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86191);m.walkInColumnOrder(getVisitor);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86192);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86193);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86194);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86195);getVisitor = new GetVisitor();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86196);m.walkInColumnOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86197);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86198);for (int i = 0; (((i < rows)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86199)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86200)==0&false)); ++i) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86201);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86202);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86203);for (int j = 0; (((j < columns)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86204)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86205)==0&false)); ++j) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86206);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86207);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }
    }}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceStart(getClass().getName(),86208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1uio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11u1w1u1wlb90pd6q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldMatrixImplTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1uio(){try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86208);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86209);Array2DRowFieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(testData);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86210);Assert.assertEquals(m,TestUtils.serializeAndRecover(m));
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    private static class SetVisitor extends DefaultFieldMatrixChangingVisitor<Fraction> {
        public SetVisitor() {
            super(Fraction.ZERO);__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86212);try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86211);
        }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
        @Override
        public Fraction visit(int i, int j, Fraction value) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86213);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86214);return new Fraction(i * 1024 + j, 1024);
        }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
    }

    private static class GetVisitor extends DefaultFieldMatrixPreservingVisitor<Fraction> {
        private int count;
        public GetVisitor() {
            super(Fraction.ZERO);__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86216);try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86215);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86217);count = 0;
        }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
        @Override
        public void visit(int i, int j, Fraction value) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86218);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86219);++count;
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86220);Assert.assertEquals(new Fraction(i * 1024 + j, 1024), value);
        }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
        public int getCount() {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86221);
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86222);return count;
        }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
    }

    //--------------- -----------------Protected methods

    /** extracts the l  and u matrices from compact lu representation */
    protected void splitLU(FieldMatrix<Fraction> lu,
                           Fraction[][] lowerData,
                           Fraction[][] upperData) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86223);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86224);if ((((!lu.isSquare())&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86225)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86226)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86227);throw new NonSquareMatrixException(lu.getRowDimension(), lu.getColumnDimension());
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86228);if ((((lowerData.length != lowerData[0].length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86229)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86230)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86231);throw new DimensionMismatchException(lowerData.length, lowerData[0].length);
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86232);if ((((upperData.length != upperData[0].length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86233)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86234)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86235);throw new DimensionMismatchException(upperData.length, upperData[0].length);
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86236);if ((((lowerData.length != upperData.length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86237)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86238)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86239);throw new DimensionMismatchException(lowerData.length, upperData.length);
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86240);if ((((lowerData.length != lu.getRowDimension())&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86241)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86242)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86243);throw new DimensionMismatchException(lowerData.length, lu.getRowDimension());
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86244);int n = lu.getRowDimension();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86245);for (int i = 0; (((i < n)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86246)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86247)==0&false)); i++) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86248);for (int j = 0; (((j < n)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86249)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86250)==0&false)); j++) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86251);if ((((j < i)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86252)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86253)==0&false))) {{
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86254);lowerData[i][j] = lu.getEntry(i, j);
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86255);upperData[i][j] = Fraction.ZERO;
                } }else {__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86256);if ((((i == j)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86257)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86258)==0&false))) {{
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86259);lowerData[i][j] = Fraction.ONE;
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86260);upperData[i][j] = lu.getEntry(i, j);
                } }else {{
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86261);lowerData[i][j] = Fraction.ZERO;
                    __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86262);upperData[i][j] = lu.getEntry(i, j);
                }
            }}}
        }}
    }}finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}

    /** Returns the result of applying the given row permutation to the matrix */
    protected FieldMatrix<Fraction> permuteRows(FieldMatrix<Fraction> matrix, int[] permutation) {try{__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86263);
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86264);if ((((!matrix.isSquare())&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86265)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86266)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86267);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86268);if ((((matrix.getRowDimension() != permutation.length)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86269)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86270)==0&false))) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86271);throw new DimensionMismatchException(matrix.getRowDimension(), permutation.length);
        }
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86272);int n = matrix.getRowDimension();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86273);int m = matrix.getColumnDimension();
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86274);Fraction out[][] = new Fraction[m][n];
        __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86275);for (int i = 0; (((i < n)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86276)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86277)==0&false)); i++) {{
            __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86278);for (int j = 0; (((j < m)&&(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86279)!=0|true))||(__CLR4_4_11u1w1u1wlb90pd6q.R.iget(86280)==0&false)); j++) {{
                __CLR4_4_11u1w1u1wlb90pd6q.R.inc(86281);out[i][j] = matrix.getEntry(permutation[i], j);
            }
        }}
        }__CLR4_4_11u1w1u1wlb90pd6q.R.inc(86282);return new Array2DRowFieldMatrix<Fraction>(out);
    }finally{__CLR4_4_11u1w1u1wlb90pd6q.R.flushNeeded();}}
}
