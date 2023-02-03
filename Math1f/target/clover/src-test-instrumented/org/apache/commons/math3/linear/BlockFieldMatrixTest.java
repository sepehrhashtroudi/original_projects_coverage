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
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * Test cases for the {@link BlockFieldMatrix} class.
 *
 * @version $Id$
 */

public final class BlockFieldMatrixTest {static class __CLR4_4_11rob1roblb90pd1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,83362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // 3 x 3 identity matrix
    protected Fraction[][] id = {
            {new Fraction(1),new Fraction(0),new Fraction(0)},
            {new Fraction(0),new Fraction(1),new Fraction(0)},
            {new Fraction(0),new Fraction(0),new Fraction(1)}
    };

    // Test data for group operations
    protected Fraction[][] testData = {
            {new Fraction(1),new Fraction(2),new Fraction(3)},
            {new Fraction(2),new Fraction(5),new Fraction(3)},
            {new Fraction(1),new Fraction(0),new Fraction(8)}
    };
    protected Fraction[][] testDataLU = {
            {new Fraction(2), new Fraction(5), new Fraction(3)},
            {new Fraction(1, 2), new Fraction(-5, 2), new Fraction(13, 2)},
            {new Fraction(1, 2), new Fraction(1, 5), new Fraction(1, 5)}
    };
    protected Fraction[][] testDataPlus2 = {
            {new Fraction(3),new Fraction(4),new Fraction(5)},
            {new Fraction(4),new Fraction(7),new Fraction(5)},
            {new Fraction(3),new Fraction(2),new Fraction(10)}
    };
    protected Fraction[][] testDataMinus = {
            {new Fraction(-1),new Fraction(-2),new Fraction(-3)},
            {new Fraction(-2),new Fraction(-5),new Fraction(-3)},
            {new Fraction(-1),new Fraction(0),new Fraction(-8)}
    };
    protected Fraction[] testDataRow1 = {new Fraction(1),new Fraction(2),new Fraction(3)};
    protected Fraction[] testDataCol3 = {new Fraction(3),new Fraction(3),new Fraction(8)};
    protected Fraction[][] testDataInv = {
            {new Fraction(-40),new Fraction(16),new Fraction(9)},
            {new Fraction(13),new Fraction(-5),new Fraction(-3)},
            {new Fraction(5),new Fraction(-2),new Fraction(-1)}
    };
    protected Fraction[] preMultTest = {new Fraction(8), new Fraction(12), new Fraction(33)};
    protected Fraction[][] testData2 = {
            {new Fraction(1),new Fraction(2),new Fraction(3)},
            {new Fraction(2),new Fraction(5),new Fraction(3)}
    };
    protected Fraction[][] testData2T = {
            {new Fraction(1),new Fraction(2)},
            {new Fraction(2),new Fraction(5)},
            {new Fraction(3),new Fraction(3)}
    };
    protected Fraction[][] testDataPlusInv = {
            {new Fraction(-39),new Fraction(18),new Fraction(12)},
            {new Fraction(15),new Fraction(0),new Fraction(0)},
            {new Fraction(6),new Fraction(-2),new Fraction(7)}
    };

    // lu decomposition tests
    protected Fraction[][] luData = {
            {new Fraction(2),new Fraction(3),new Fraction(3)},
            {new Fraction(0),new Fraction(5),new Fraction(7)},
            {new Fraction(6),new Fraction(9),new Fraction(8)}
    };
    protected Fraction[][] luDataLUDecomposition = {
            {new Fraction(6),new Fraction(9),new Fraction(8)},
            {new Fraction(0),new Fraction(5),new Fraction(7)},
            {new Fraction(1, 3),new Fraction(0),new Fraction(1, 3)}
    };

    // singular matrices
    protected Fraction[][] singular = { {new Fraction(2),new Fraction(3)}, {new Fraction(2),new Fraction(3)} };
    protected Fraction[][] bigSingular = {
            {new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)},
            {new Fraction(2),new Fraction(5),new Fraction(3),new Fraction(4)},
            {new Fraction(7),new Fraction(3),new Fraction(256),new Fraction(1930)},
            {new Fraction(3),new Fraction(7),new Fraction(6),new Fraction(8)}
    }; // 4th row = 1st + 2nd
    protected Fraction[][] detData = {
            {new Fraction(1),new Fraction(2),new Fraction(3)},
            {new Fraction(4),new Fraction(5),new Fraction(6)},
            {new Fraction(7),new Fraction(8),new Fraction(10)}
    };
    protected Fraction[][] detData2 = { {new Fraction(1), new Fraction(3)}, {new Fraction(2), new Fraction(4)}};

    // vectors
    protected Fraction[] testVector = {new Fraction(1),new Fraction(2),new Fraction(3)};
    protected Fraction[] testVector2 = {new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)};

    // submatrix accessor tests
    protected Fraction[][] subTestData = {
            {new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4)},
            {new Fraction(3, 2), new Fraction(5, 2), new Fraction(7, 2), new Fraction(9, 2)},
            {new Fraction(2), new Fraction(4), new Fraction(6), new Fraction(8)},
            {new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7)}
    };
    // array selections
    protected Fraction[][] subRows02Cols13 = { {new Fraction(2), new Fraction(4)}, {new Fraction(4), new Fraction(8)}};
    protected Fraction[][] subRows03Cols12 = { {new Fraction(2), new Fraction(3)}, {new Fraction(5), new Fraction(6)}};
    protected Fraction[][] subRows03Cols123 = {
            {new Fraction(2), new Fraction(3), new Fraction(4)},
            {new Fraction(5), new Fraction(6), new Fraction(7)}
    };
    // effective permutations
    protected Fraction[][] subRows20Cols123 = {
            {new Fraction(4), new Fraction(6), new Fraction(8)},
            {new Fraction(2), new Fraction(3), new Fraction(4)}
    };
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
    public void testDimensions() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21rob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21rob(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82523);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82524);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82525);BlockFieldMatrix<Fraction> m2 = new BlockFieldMatrix<Fraction>(testData2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82526);Assert.assertEquals("testData row dimension",3,m.getRowDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82527);Assert.assertEquals("testData column dimension",3,m.getColumnDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82528);Assert.assertTrue("testData is square",m.isSquare());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82529);Assert.assertEquals("testData2 row dimension",m2.getRowDimension(),2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82530);Assert.assertEquals("testData2 column dimension",m2.getColumnDimension(),3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82531);Assert.assertTrue("testData2 is not square",!m2.isSquare());
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1rok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1rok(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82532);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82533);Random r = new Random(66636328996002l);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82534);BlockFieldMatrix<Fraction> m1 = createRandomMatrix(r, 47, 83);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82535);BlockFieldMatrix<Fraction> m2 = new BlockFieldMatrix<Fraction>(m1.getData());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82536);Assert.assertEquals(m1, m2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82537);BlockFieldMatrix<Fraction> m3 = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82538);BlockFieldMatrix<Fraction> m4 = new BlockFieldMatrix<Fraction>(m3.getData());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82539);Assert.assertEquals(m3, m4);
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1ros();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1ros(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82540);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82541);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82542);BlockFieldMatrix<Fraction> mInv = new BlockFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82543);FieldMatrix<Fraction> mPlusMInv = m.add(mInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82544);Fraction[][] sumEntries = mPlusMInv.getData();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82545);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82546)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82547)==0&false)); row++) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82548);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82549)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82550)==0&false)); col++) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82551);Assert.assertEquals(testDataPlusInv[row][col],sumEntries[row][col]);
            }
        }}
    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1rp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1rp4(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82552);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82553);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82554);BlockFieldMatrix<Fraction> m2 = new BlockFieldMatrix<Fraction>(testData2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82555);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82556);m.add(m2);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82557);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

     /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1rpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1rpa(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82558);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82559);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82560);BlockFieldMatrix<Fraction> m2 = new BlockFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82561);TestUtils.assertEquals(m.subtract(m2), m2.scalarMultiply(new Fraction(-1)).add(m));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82562);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82563);m.subtract(new BlockFieldMatrix<Fraction>(testData2));
            __CLR4_4_11rob1roblb90pd1w.R.inc(82564);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test multiply */
    @Test
    public void testMultiply() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1rph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1rph(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82565);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82566);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82567);BlockFieldMatrix<Fraction> mInv = new BlockFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82568);BlockFieldMatrix<Fraction> identity = new BlockFieldMatrix<Fraction>(id);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82569);BlockFieldMatrix<Fraction> m2 = new BlockFieldMatrix<Fraction>(testData2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82570);TestUtils.assertEquals(m.multiply(mInv), identity);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82571);TestUtils.assertEquals(mInv.multiply(m), identity);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82572);TestUtils.assertEquals(m.multiply(identity), m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82573);TestUtils.assertEquals(identity.multiply(mInv), mInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82574);TestUtils.assertEquals(m2.multiply(identity), m2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82575);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82576);m.multiply(new BlockFieldMatrix<Fraction>(bigSingular));
            __CLR4_4_11rob1roblb90pd1w.R.inc(82577);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSeveralBlocks() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3guq11rpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSeveralBlocks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3guq11rpu(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82578);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82579);FieldMatrix<Fraction> m =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), 37, 41);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82580);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82581)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82582)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82583);for (int j = 0; (((j < m.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82584)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82585)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82586);m.setEntry(i, j, new Fraction(i * 11 + j, 11));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82587);FieldMatrix<Fraction> mT = m.transpose();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82588);Assert.assertEquals(m.getRowDimension(), mT.getColumnDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82589);Assert.assertEquals(m.getColumnDimension(), mT.getRowDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82590);for (int i = 0; (((i < mT.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82591)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82592)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82593);for (int j = 0; (((j < mT.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82594)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82595)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82596);Assert.assertEquals(m.getEntry(j, i), mT.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82597);FieldMatrix<Fraction> mPm = m.add(m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82598);for (int i = 0; (((i < mPm.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82599)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82600)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82601);for (int j = 0; (((j < mPm.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82602)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82603)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82604);Assert.assertEquals(m.getEntry(i, j).multiply(new Fraction(2)), mPm.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82605);FieldMatrix<Fraction> mPmMm = mPm.subtract(m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82606);for (int i = 0; (((i < mPmMm.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82607)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82608)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82609);for (int j = 0; (((j < mPmMm.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82610)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82611)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82612);Assert.assertEquals(m.getEntry(i, j), mPmMm.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82613);FieldMatrix<Fraction> mTm = mT.multiply(m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82614);for (int i = 0; (((i < mTm.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82615)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82616)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82617);for (int j = 0; (((j < mTm.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82618)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82619)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82620);Fraction sum = Fraction.ZERO;
                __CLR4_4_11rob1roblb90pd1w.R.inc(82621);for (int k = 0; (((k < mT.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82622)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82623)==0&false)); ++k) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82624);sum = sum.add(new Fraction(k * 11 + i, 11).multiply(new Fraction(k * 11 + j, 11)));
                }
                }__CLR4_4_11rob1roblb90pd1w.R.inc(82625);Assert.assertEquals(sum, mTm.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82626);FieldMatrix<Fraction> mmT = m.multiply(mT);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82627);for (int i = 0; (((i < mmT.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82628)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82629)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82630);for (int j = 0; (((j < mmT.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82631)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82632)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82633);Fraction sum = Fraction.ZERO;
                __CLR4_4_11rob1roblb90pd1w.R.inc(82634);for (int k = 0; (((k < m.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82635)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82636)==0&false)); ++k) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82637);sum = sum.add(new Fraction(i * 11 + k, 11).multiply(new Fraction(j * 11 + k, 11)));
                }
                }__CLR4_4_11rob1roblb90pd1w.R.inc(82638);Assert.assertEquals(sum, mmT.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82639);FieldMatrix<Fraction> sub1 = m.getSubMatrix(2, 9, 5, 20);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82640);for (int i = 0; (((i < sub1.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82641)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82642)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82643);for (int j = 0; (((j < sub1.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82644)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82645)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82646);Assert.assertEquals(new Fraction((i + 2) * 11 + (j + 5), 11), sub1.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82647);FieldMatrix<Fraction> sub2 = m.getSubMatrix(10, 12, 3, 40);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82648);for (int i = 0; (((i < sub2.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82649)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82650)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82651);for (int j = 0; (((j < sub2.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82652)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82653)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82654);Assert.assertEquals(new Fraction((i + 10) * 11 + (j + 3), 11), sub2.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82655);FieldMatrix<Fraction> sub3 = m.getSubMatrix(30, 34, 0, 5);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82656);for (int i = 0; (((i < sub3.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82657)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82658)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82659);for (int j = 0; (((j < sub3.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82660)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82661)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82662);Assert.assertEquals(new Fraction((i + 30) * 11 + (j + 0), 11), sub3.getEntry(i, j));
            }
        }}

        }__CLR4_4_11rob1roblb90pd1w.R.inc(82663);FieldMatrix<Fraction> sub4 = m.getSubMatrix(30, 32, 32, 35);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82664);for (int i = 0; (((i < sub4.getRowDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82665)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82666)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82667);for (int j = 0; (((j < sub4.getColumnDimension())&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82668)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82669)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82670);Assert.assertEquals(new Fraction((i + 30) * 11 + (j + 32), 11), sub4.getEntry(i, j));
            }
        }}

    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    //Additional Test for BlockFieldMatrix<Fraction>Test.testMultiply

    private Fraction[][] d3 = new Fraction[][] {
            {new Fraction(1),new Fraction(2),new Fraction(3),new Fraction(4)},
            {new Fraction(5),new Fraction(6),new Fraction(7),new Fraction(8)}
    };
    private Fraction[][] d4 = new Fraction[][] {
            {new Fraction(1)},
            {new Fraction(2)},
            {new Fraction(3)},
            {new Fraction(4)}
    };
    private Fraction[][] d5 = new Fraction[][] {{new Fraction(30)},{new Fraction(70)}};

    @Test
    public void testMultiply2() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251rsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251rsf(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82671);
       __CLR4_4_11rob1roblb90pd1w.R.inc(82672);FieldMatrix<Fraction> m3 = new BlockFieldMatrix<Fraction>(d3);
       __CLR4_4_11rob1roblb90pd1w.R.inc(82673);FieldMatrix<Fraction> m4 = new BlockFieldMatrix<Fraction>(d4);
       __CLR4_4_11rob1roblb90pd1w.R.inc(82674);FieldMatrix<Fraction> m5 = new BlockFieldMatrix<Fraction>(d5);
       __CLR4_4_11rob1roblb90pd1w.R.inc(82675);TestUtils.assertEquals(m3.multiply(m4), m5);
   }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61rsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61rsk(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82676);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82677);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(id);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82678);Assert.assertEquals(new Fraction(3),m.getTrace());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82679);m = new BlockFieldMatrix<Fraction>(testData2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82680);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82681);m.getTrace();
            __CLR4_4_11rob1roblb90pd1w.R.inc(82682);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test scalarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1rsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1rsr(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82683);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82684);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82685);TestUtils.assertEquals(new BlockFieldMatrix<Fraction>(testDataPlus2),
                               m.scalarAdd(new Fraction(2)));
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1rsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1rsu(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82686);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82687);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(id);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82688);TestUtils.assertEquals(testVector, m.operate(testVector));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82689);TestUtils.assertEquals(testVector, m.operate(new ArrayFieldVector<Fraction>(testVector)).getData());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82690);m = new BlockFieldMatrix<Fraction>(bigSingular);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82691);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82692);m.operate(testVector);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82693);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testOperateLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1maf5681rt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testOperateLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1maf5681rt2(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82694);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82695);int p = (11 * BlockFieldMatrix.BLOCK_SIZE) / 10;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82696);int q = (11 * BlockFieldMatrix.BLOCK_SIZE) / 10;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82697);int r =  BlockFieldMatrix.BLOCK_SIZE / 2;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82698);Random random = new Random(111007463902334l);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82699);FieldMatrix<Fraction> m1 = createRandomMatrix(random, p, q);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82700);FieldMatrix<Fraction> m2 = createRandomMatrix(random, q, r);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82701);FieldMatrix<Fraction> m1m2 = m1.multiply(m2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82702);for (int i = 0; (((i < r)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82703)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82704)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82705);TestUtils.assertEquals(m1m2.getColumn(i), m1.operate(m2.getColumn(i)));
        }
    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testOperatePremultiplyLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gsufhp1rte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testOperatePremultiplyLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gsufhp1rte(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82706);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82707);int p = (11 * BlockFieldMatrix.BLOCK_SIZE) / 10;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82708);int q = (11 * BlockFieldMatrix.BLOCK_SIZE) / 10;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82709);int r =  BlockFieldMatrix.BLOCK_SIZE / 2;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82710);Random random = new Random(111007463902334l);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82711);FieldMatrix<Fraction> m1 = createRandomMatrix(random, p, q);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82712);FieldMatrix<Fraction> m2 = createRandomMatrix(random, q, r);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82713);FieldMatrix<Fraction> m1m2 = m1.multiply(m2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82714);for (int i = 0; (((i < p)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82715)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82716)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82717);TestUtils.assertEquals(m1m2.getRow(i), m2.preMultiply(m1.getRow(i)));
        }
    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1rtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1rtq(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82718);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82719);FieldMatrix<Fraction> a = new BlockFieldMatrix<Fraction>(new Fraction[][] {
                { new Fraction(1), new Fraction(2) },
                { new Fraction(3), new Fraction(4) },
                { new Fraction(5), new Fraction(6) }
        });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82720);Fraction[] b = a.operate(new Fraction[] { new Fraction(1), new Fraction(1) });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82721);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82722);Assert.assertEquals( new Fraction(3), b[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82723);Assert.assertEquals( new Fraction(7), b[1]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82724);Assert.assertEquals(new Fraction(11), b[2]);
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21rtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21rtx(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82725);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82726);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82727);FieldMatrix<Fraction> mIT = new FieldLUDecomposition<Fraction>(m).getSolver().getInverse().transpose();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82728);FieldMatrix<Fraction> mTI = new FieldLUDecomposition<Fraction>(m.transpose()).getSolver().getInverse();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82729);TestUtils.assertEquals(mIT, mTI);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82730);m = new BlockFieldMatrix<Fraction>(testData2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82731);FieldMatrix<Fraction> mt = new BlockFieldMatrix<Fraction>(testData2T);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82732);TestUtils.assertEquals(mt, m.transpose());
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1ru5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1ru5(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82733);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82734);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82735);TestUtils.assertEquals(m.preMultiply(testVector), preMultTest);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82736);TestUtils.assertEquals(m.preMultiply(new ArrayFieldVector<Fraction>(testVector).getData()),
                               preMultTest);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82737);m = new BlockFieldMatrix<Fraction>(bigSingular);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82738);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82739);m.preMultiply(testVector);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82740);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01rud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01rud(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82741);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82742);FieldMatrix<Fraction> m3 = new BlockFieldMatrix<Fraction>(d3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82743);FieldMatrix<Fraction> m4 = new BlockFieldMatrix<Fraction>(d4);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82744);FieldMatrix<Fraction> m5 = new BlockFieldMatrix<Fraction>(d5);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82745);TestUtils.assertEquals(m4.preMultiply(m3), m5);

        __CLR4_4_11rob1roblb90pd1w.R.inc(82746);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82747);BlockFieldMatrix<Fraction> mInv = new BlockFieldMatrix<Fraction>(testDataInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82748);BlockFieldMatrix<Fraction> identity = new BlockFieldMatrix<Fraction>(id);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82749);TestUtils.assertEquals(m.preMultiply(mInv), identity);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82750);TestUtils.assertEquals(mInv.preMultiply(m), identity);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82751);TestUtils.assertEquals(m.preMultiply(identity), m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82752);TestUtils.assertEquals(identity.preMultiply(mInv), mInv);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82753);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82754);m.preMultiply(new BlockFieldMatrix<Fraction>(bigSingular));
            __CLR4_4_11rob1roblb90pd1w.R.inc(82755);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711rus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711rus(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82756);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82757);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82758);TestUtils.assertEquals(m.getRow(0), testDataRow1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82759);TestUtils.assertEquals(m.getColumn(2), testDataCol3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82760);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82761);m.getRow(10);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82762);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(82763);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82764);m.getColumn(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82765);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1rv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1rv2(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82766);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82767);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82768);Assert.assertEquals(m.getEntry(0,1),new Fraction(2));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82769);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82770);m.getEntry(10, 4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82771);Assert.fail ("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1rv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1rv8(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82772);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11rob1roblb90pd1w.R.inc(82773);Fraction[][] matrixData = {
                {new Fraction(1),new Fraction(2),new Fraction(3)},
                {new Fraction(2),new Fraction(5),new Fraction(3)}
        };
        __CLR4_4_11rob1roblb90pd1w.R.inc(82774);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11rob1roblb90pd1w.R.inc(82775);Fraction[][] matrixData2 = {
                {new Fraction(1),new Fraction(2)},
                {new Fraction(2),new Fraction(5)},
                {new Fraction(1), new Fraction(7)}
        };
        __CLR4_4_11rob1roblb90pd1w.R.inc(82776);FieldMatrix<Fraction> n = new BlockFieldMatrix<Fraction>(matrixData2);
        // Now multiply m by n
        __CLR4_4_11rob1roblb90pd1w.R.inc(82777);FieldMatrix<Fraction> p = m.multiply(n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82778);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82779);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11rob1roblb90pd1w.R.inc(82780);FieldMatrix<Fraction> pInverse = new FieldLUDecomposition<Fraction>(p).getSolver().getInverse();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82781);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11rob1roblb90pd1w.R.inc(82782);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11rob1roblb90pd1w.R.inc(82783);Fraction[][] coefficientsData = {
                {new Fraction(2), new Fraction(3), new Fraction(-2)},
                {new Fraction(-1), new Fraction(7), new Fraction(6)},
                {new Fraction(4), new Fraction(-3), new Fraction(-5)}
        };
        __CLR4_4_11rob1roblb90pd1w.R.inc(82784);FieldMatrix<Fraction> coefficients = new BlockFieldMatrix<Fraction>(coefficientsData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82785);Fraction[] constants = {
            new Fraction(1), new Fraction(-2), new Fraction(1)
        };
        __CLR4_4_11rob1roblb90pd1w.R.inc(82786);Fraction[] solution;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82787);solution = new FieldLUDecomposition<Fraction>(coefficients)
            .getSolver()
            .solve(new ArrayFieldVector<Fraction>(constants, false)).toArray();
        __CLR4_4_11rob1roblb90pd1w.R.inc(82788);Assert.assertEquals(new Fraction(2).multiply(solution[0]).
                     add(new Fraction(3).multiply(solution[1])).
                     subtract(new Fraction(2).multiply(solution[2])),
                     constants[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82789);Assert.assertEquals(new Fraction(-1).multiply(solution[0]).
                     add(new Fraction(7).multiply(solution[1])).
                     add(new Fraction(6).multiply(solution[2])),
                     constants[1]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82790);Assert.assertEquals(new Fraction(4).multiply(solution[0]).
                     subtract(new Fraction(3).multiply(solution[1])).
                     subtract(new Fraction(5).multiply(solution[2])),
                     constants[2]);

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testGetSubMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19452rg1rvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19452rg1rvr(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82791);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82792);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82793);checkGetSubMatrix(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82794);checkGetSubMatrix(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82795);checkGetSubMatrix(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82796);checkGetSubMatrix(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82797);checkGetSubMatrix(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82798);checkGetSubMatrix(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82799);checkGetSubMatrix(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82800);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82801);checkGetSubMatrix(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82802);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82803);checkGetSubMatrix(m, null, -1, 1, 2, 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82804);checkGetSubMatrix(m, null,  1, 0, 2, 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82805);checkGetSubMatrix(m, null,  1, 0, 2, 4);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82806);checkGetSubMatrix(m, null, new int[] {},    new int[] { 0 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82807);checkGetSubMatrix(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private void checkGetSubMatrix(FieldMatrix<Fraction> m, Fraction[][] reference,
                                   int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(82808);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82809);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82810);FieldMatrix<Fraction> sub = m.getSubMatrix(startRow, endRow, startColumn, endColumn);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82811);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82812)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82813)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82814);Assert.assertEquals(new BlockFieldMatrix<Fraction>(reference), sub);
            } }else {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82815);Assert.fail("Expecting OutOfRangeException or NotStrictlyPositiveException"
                     + " or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82816);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82817)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82818)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82819);throw e;
            }
        }} catch (NotStrictlyPositiveException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82820);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82821)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82822)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82823);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82824);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82825)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82826)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82827);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82828);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82829)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82830)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82831);throw e;
            }
        }}
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private void checkGetSubMatrix(FieldMatrix<Fraction> m, Fraction[][] reference,
                                   int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(82832);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82833);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82834);FieldMatrix<Fraction> sub = m.getSubMatrix(selectedRows, selectedColumns);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82835);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82836)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82837)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82838);Assert.assertEquals(new BlockFieldMatrix<Fraction>(reference), sub);
            } }else {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82839);Assert.fail("Expecting OutOfRangeException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82840);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82841)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82842)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82843);throw e;
            }
        }} catch (NotStrictlyPositiveException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82844);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82845)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82846)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82847);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82848);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82849)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82850)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82851);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82852);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82853)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82854)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82855);throw e;
            }
        }}
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetMatrixLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjr9fn1rxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjr9fn1rxk(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82856);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82857);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82858);FieldMatrix<Fraction> m =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82859);FieldMatrix<Fraction> sub =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n - 4, n - 4).scalarAdd(new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(82860);m.setSubMatrix(sub.getData(), 2, 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82861);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82862)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82863)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82864);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82865)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82866)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82867);if (((((i < 2) || (i > n - 3) || (j < 2) || (j > n - 3))&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82868)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82869)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82870);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82871);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(82872);Assert.assertEquals(sub, m.getSubMatrix(2, n - 3, 2, n - 3));
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testCopySubMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y87lfj1ry1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testCopySubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y87lfj1ry1(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82873);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82874);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82875);checkCopy(m, subRows23Cols00,  2 , 3 , 0, 0);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82876);checkCopy(m, subRows00Cols33,  0 , 0 , 3, 3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82877);checkCopy(m, subRows01Cols23,  0 , 1 , 2, 3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82878);checkCopy(m, subRows02Cols13,  new int[] { 0, 2 }, new int[] { 1, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82879);checkCopy(m, subRows03Cols12,  new int[] { 0, 3 }, new int[] { 1, 2 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82880);checkCopy(m, subRows03Cols123, new int[] { 0, 3 }, new int[] { 1, 2, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82881);checkCopy(m, subRows20Cols123, new int[] { 2, 0 }, new int[] { 1, 2, 3 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82882);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82883);checkCopy(m, subRows31Cols31,  new int[] { 3, 1 }, new int[] { 3, 1 });

        __CLR4_4_11rob1roblb90pd1w.R.inc(82884);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82885);checkCopy(m, null, -1, 1, 2, 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82886);checkCopy(m, null,  1, 0, 2, 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82887);checkCopy(m, null,  1, 0, 2, 4);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82888);checkCopy(m, null, new int[] {}, new int[] { 0 });
        __CLR4_4_11rob1roblb90pd1w.R.inc(82889);checkCopy(m, null, new int[] { 0 }, new int[] { 4 });
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private void checkCopy(FieldMatrix<Fraction> m, Fraction[][] reference,
                           int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(82890);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82891);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82892);Fraction[][] sub = ((((reference == null) )&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82893)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82894)==0&false))?
                             new Fraction[1][1] :
                             new Fraction[reference.length][reference[0].length];
            __CLR4_4_11rob1roblb90pd1w.R.inc(82895);m.copySubMatrix(startRow, endRow, startColumn, endColumn, sub);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82896);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82897)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82898)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82899);Assert.assertEquals(new BlockFieldMatrix<Fraction>(reference), new BlockFieldMatrix<Fraction>(sub));
            } }else {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82900);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82901);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82902)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82903)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82904);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82905);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82906)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82907)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82908);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82909);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82910)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82911)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82912);throw e;
            }
        }}
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private void checkCopy(FieldMatrix<Fraction> m, Fraction[][] reference,
                           int[] selectedRows, int[] selectedColumns) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(82913);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82914);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82915);Fraction[][] sub = ((((reference == null) )&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82916)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82917)==0&false))?
                    new Fraction[1][1] :
                    new Fraction[reference.length][reference[0].length];
            __CLR4_4_11rob1roblb90pd1w.R.inc(82918);m.copySubMatrix(selectedRows, selectedColumns, sub);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82919);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82920)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82921)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82922);Assert.assertEquals(new BlockFieldMatrix<Fraction>(reference), new BlockFieldMatrix<Fraction>(sub));
            } }else {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82923);Assert.fail("Expecting OutOfRangeException or NumberIsTooSmallException or NoDataException");
            }
        }} catch (OutOfRangeException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82924);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82925)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82926)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82927);throw e;
            }
        }} catch (NumberIsTooSmallException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82928);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82929)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82930)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82931);throw e;
            }
        }} catch (NoDataException e) {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82932);if ((((reference != null)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82933)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82934)==0&false))) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82935);throw e;
            }
        }}
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1rzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1rzs(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82936);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82937);FieldMatrix<Fraction> m     = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82938);FieldMatrix<Fraction> mRow0 = new BlockFieldMatrix<Fraction>(subRow0);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82939);FieldMatrix<Fraction> mRow3 = new BlockFieldMatrix<Fraction>(subRow3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82940);Assert.assertEquals("Row0", mRow0, m.getRowMatrix(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82941);Assert.assertEquals("Row3", mRow3, m.getRowMatrix(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82942);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82943);m.getRowMatrix(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82944);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(82945);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82946);m.getRowMatrix(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82947);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetRowMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uydvo21s04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uydvo21s04(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82948);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82949);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82950);FieldMatrix<Fraction> mRow3 = new BlockFieldMatrix<Fraction>(subRow3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82951);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82952);m.setRowMatrix(0, mRow3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82953);Assert.assertEquals(mRow3, m.getRowMatrix(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82954);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82955);m.setRowMatrix(-1, mRow3);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82956);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(82957);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82958);m.setRowMatrix(0, m);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82959);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetRowMatrixLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12syekl1s0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetRowMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12syekl1s0g(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82960);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82961);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(82962);FieldMatrix<Fraction> m =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82963);FieldMatrix<Fraction> sub =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), 1, n).scalarAdd(new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(82964);m.setRowMatrix(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82965);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82966)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82967)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(82968);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82969)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82970)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(82971);if ((((i != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(82972)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(82973)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82974);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(82975);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(82976);Assert.assertEquals(sub, m.getRowMatrix(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1s0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1s0x(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82977);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82978);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82979);FieldMatrix<Fraction> mColumn1 = new BlockFieldMatrix<Fraction>(subColumn1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82980);FieldMatrix<Fraction> mColumn3 = new BlockFieldMatrix<Fraction>(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82981);Assert.assertEquals(mColumn1, m.getColumnMatrix(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82982);Assert.assertEquals(mColumn3, m.getColumnMatrix(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82983);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82984);m.getColumnMatrix(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82985);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(82986);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82987);m.getColumnMatrix(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82988);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetColumnMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),82989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zh7wb61s19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zh7wb61s19(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(82989);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82990);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82991);FieldMatrix<Fraction> mColumn3 = new BlockFieldMatrix<Fraction>(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82992);Assert.assertNotSame(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82993);m.setColumnMatrix(1, mColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(82994);Assert.assertEquals(mColumn3, m.getColumnMatrix(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(82995);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82996);m.setColumnMatrix(-1, mColumn3);
            __CLR4_4_11rob1roblb90pd1w.R.inc(82997);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(82998);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(82999);m.setColumnMatrix(0, m);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83000);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetColumnMatrixLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n41m5v1s1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetColumnMatrixLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n41m5v1s1l(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83001);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83002);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83003);FieldMatrix<Fraction> m =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83004);FieldMatrix<Fraction> sub =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, 1).scalarAdd(new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(83005);m.setColumnMatrix(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83006);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83007)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83008)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83009);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83010)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83011)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83012);if ((((j != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83013)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83014)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83015);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83016);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83017);Assert.assertEquals(sub, m.getColumnMatrix(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401s22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401s22(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83018);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83019);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83020);FieldVector<Fraction> mRow0 = new ArrayFieldVector<Fraction>(subRow0[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83021);FieldVector<Fraction> mRow3 = new ArrayFieldVector<Fraction>(subRow3[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83022);Assert.assertEquals(mRow0, m.getRowVector(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83023);Assert.assertEquals(mRow3, m.getRowVector(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83024);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83025);m.getRowVector(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83026);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83027);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83028);m.getRowVector(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83029);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetRowVector() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwpvsc1s2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwpvsc1s2e(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83030);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83031);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83032);FieldVector<Fraction> mRow3 = new ArrayFieldVector<Fraction>(subRow3[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83033);Assert.assertNotSame(mRow3, m.getRowMatrix(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83034);m.setRowVector(0, mRow3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83035);Assert.assertEquals(mRow3, m.getRowVector(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83036);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83037);m.setRowVector(-1, mRow3);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83038);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83039);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83040);m.setRowVector(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), 5));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83041);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetRowVectorLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15be1191s2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetRowVectorLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15be1191s2q(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83042);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83043);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83044);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83045);FieldVector<Fraction> sub = new ArrayFieldVector<Fraction>(n, new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(83046);m.setRowVector(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83047);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83048)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83049)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83050);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83051)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83052)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83053);if ((((i != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83054)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83055)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83056);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83057);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83058);Assert.assertEquals(sub, m.getRowVector(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1s37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1s37(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83059);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83060);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83061);FieldVector<Fraction> mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83062);FieldVector<Fraction> mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83063);Assert.assertEquals(mColumn1, m.getColumnVector(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83064);Assert.assertEquals(mColumn3, m.getColumnVector(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83065);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83066);m.getColumnVector(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83067);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83068);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83069);m.getColumnVector(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83070);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetColumnVector() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb7lsg1s3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb7lsg1s3j(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83071);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83072);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83073);FieldVector<Fraction> mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83074);Assert.assertNotSame(mColumn3, m.getColumnVector(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83075);m.setColumnVector(1, mColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83076);Assert.assertEquals(mColumn3, m.getColumnVector(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83077);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83078);m.setColumnVector(-1, mColumn3);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83079);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83080);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83081);m.setColumnVector(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), 5));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83082);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetColumnVectorLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8e1rp1s3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetColumnVectorLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8e1rp1s3v(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83083);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83084);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83085);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83086);FieldVector<Fraction> sub = new ArrayFieldVector<Fraction>(n, new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(83087);m.setColumnVector(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83088);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83089)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83090)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83091);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83092)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83093)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83094);if ((((j != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83095)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83096)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83097);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83098);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83099);Assert.assertEquals(sub, m.getColumnVector(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private FieldVector<Fraction> columnToVector(Fraction[][] column) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83100);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83101);Fraction[] data = new Fraction[column.length];
        __CLR4_4_11rob1roblb90pd1w.R.inc(83102);for (int i = 0; (((i < data.length)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83103)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83104)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83105);data[i] = column[i][0];
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83106);return new ArrayFieldVector<Fraction>(data, false);
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetRow() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1bja51s4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1bja51s4j(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83107);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83108);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83109);checkArrays(subRow0[0], m.getRow(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83110);checkArrays(subRow3[0], m.getRow(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83111);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83112);m.getRow(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83113);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83114);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83115);m.getRow(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83116);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetRow() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z2y4x1s4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetRow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z2y4x1s4t(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83117);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83118);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83119);Assert.assertTrue(subRow3[0][0] != m.getRow(0)[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83120);m.setRow(0, subRow3[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83121);checkArrays(subRow3[0], m.getRow(0));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83122);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83123);m.setRow(-1, subRow3[0]);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83124);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83125);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83126);m.setRow(0, new Fraction[5]);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83127);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetRowLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpcjve1s54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetRowLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpcjve1s54(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83128);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83129);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83130);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83131);Fraction[] sub = new Fraction[n];
        __CLR4_4_11rob1roblb90pd1w.R.inc(83132);Arrays.fill(sub, new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(83133);m.setRow(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83134);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83135)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83136)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83137);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83138)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83139)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83140);if ((((i != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83141)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83142)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83143);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83144);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83145);checkArrays(sub, m.getRow(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetColumn() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynjvhb1s5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynjvhb1s5m(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83146);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83147);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83148);Fraction[] mColumn1 = columnToArray(subColumn1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83149);Fraction[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83150);checkArrays(mColumn1, m.getColumn(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83151);checkArrays(mColumn3, m.getColumn(3));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83152);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83153);m.getColumn(-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83154);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83155);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83156);m.getColumn(4);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83157);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetColumn() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5snzh1s5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5snzh1s5y(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83158);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83159);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(subTestData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83160);Fraction[] mColumn3 = columnToArray(subColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83161);Assert.assertTrue(mColumn3[0] != m.getColumn(1)[0]);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83162);m.setColumn(1, mColumn3);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83163);checkArrays(mColumn3, m.getColumn(1));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83164);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83165);m.setColumn(-1, mColumn3);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83166);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83167);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83168);m.setColumn(0, new Fraction[5]);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83169);Assert.fail("Expecting MatrixDimensionMismatchException");
        } catch (MatrixDimensionMismatchException ex) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testGetSetColumnLarge() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pefyy61s6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testGetSetColumnLarge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pefyy61s6a(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83170);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83171);int n = 3 * BlockFieldMatrix.BLOCK_SIZE;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83172);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), n, n);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83173);Fraction[] sub = new Fraction[n];
        __CLR4_4_11rob1roblb90pd1w.R.inc(83174);Arrays.fill(sub, new Fraction(1));

        __CLR4_4_11rob1roblb90pd1w.R.inc(83175);m.setColumn(2, sub);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83176);for (int i = 0; (((i < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83177)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83178)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83179);for (int j = 0; (((j < n)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83180)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83181)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83182);if ((((j != 2)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83183)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83184)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83185);Assert.assertEquals(new Fraction(0), m.getEntry(i, j));
                } }else {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83186);Assert.assertEquals(new Fraction(1), m.getEntry(i, j));
                }
            }}
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83187);checkArrays(sub, m.getColumn(2));

    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private Fraction[] columnToArray(Fraction[][] column) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83188);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83189);Fraction[] data = new Fraction[column.length];
        __CLR4_4_11rob1roblb90pd1w.R.inc(83190);for (int i = 0; (((i < data.length)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83191)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83192)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83193);data[i] = column[i][0];
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83194);return data;
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private void checkArrays(Fraction[] expected, Fraction[] actual) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83195);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83196);Assert.assertEquals(expected.length, actual.length);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83197);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83198)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83199)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83200);Assert.assertEquals(expected[i], actual[i]);
        }
    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81s75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81s75(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83201);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83202);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83203);BlockFieldMatrix<Fraction> m1 = (BlockFieldMatrix<Fraction>) m.copy();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83204);BlockFieldMatrix<Fraction> mt = (BlockFieldMatrix<Fraction>) m.transpose();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83205);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83206);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83207);Assert.assertEquals(m, m);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83208);Assert.assertEquals(m, m1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83209);Assert.assertFalse(m.equals(null));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83210);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11rob1roblb90pd1w.R.inc(83211);Assert.assertFalse(m.equals(new BlockFieldMatrix<Fraction>(bigSingular)));
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1s7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1s7g(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83212);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83213);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83214);Assert.assertEquals("BlockFieldMatrix{{1,2,3},{2,5,3},{1,0,8}}", m.toString());
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1s7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1s7j(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83215);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83216);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83217);m.setSubMatrix(detData2,1,1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83218);FieldMatrix<Fraction> expected = new BlockFieldMatrix<Fraction>
            (new Fraction[][] {{new Fraction(1),new Fraction(2),new Fraction(3)},{new Fraction(2),new Fraction(1),new Fraction(3)},{new Fraction(1),new Fraction(2),new Fraction(4)}});
        __CLR4_4_11rob1roblb90pd1w.R.inc(83219);Assert.assertEquals(expected, m);

        __CLR4_4_11rob1roblb90pd1w.R.inc(83220);m.setSubMatrix(detData2,0,0);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83221);expected = new BlockFieldMatrix<Fraction>
            (new Fraction[][] {{new Fraction(1),new Fraction(3),new Fraction(3)},{new Fraction(2),new Fraction(4),new Fraction(3)},{new Fraction(1),new Fraction(2),new Fraction(4)}});
        __CLR4_4_11rob1roblb90pd1w.R.inc(83222);Assert.assertEquals(expected, m);

        __CLR4_4_11rob1roblb90pd1w.R.inc(83223);m.setSubMatrix(testDataPlus2,0,0);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83224);expected = new BlockFieldMatrix<Fraction>
            (new Fraction[][] {{new Fraction(3),new Fraction(4),new Fraction(5)},{new Fraction(4),new Fraction(7),new Fraction(5)},{new Fraction(3),new Fraction(2),new Fraction(10)}});
        __CLR4_4_11rob1roblb90pd1w.R.inc(83225);Assert.assertEquals(expected, m);

        // javadoc example
        __CLR4_4_11rob1roblb90pd1w.R.inc(83226);BlockFieldMatrix<Fraction> matrix =
            new BlockFieldMatrix<Fraction>(new Fraction[][] {
                    {new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4)},
                    {new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8)},
                    {new Fraction(9), new Fraction(0), new Fraction(1) , new Fraction(2)}
            });
        __CLR4_4_11rob1roblb90pd1w.R.inc(83227);matrix.setSubMatrix(new Fraction[][] {
                {new Fraction(3), new Fraction(4)},
                {new Fraction(5), new Fraction(6)}
        }, 1, 1);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83228);expected =
            new BlockFieldMatrix<Fraction>(new Fraction[][] {
                    {new Fraction(1), new Fraction(2), new Fraction(3),new Fraction(4)},
                    {new Fraction(5), new Fraction(3), new Fraction(4), new Fraction(8)},
                    {new Fraction(9), new Fraction(5) ,new Fraction(6), new Fraction(2)}
            });
        __CLR4_4_11rob1roblb90pd1w.R.inc(83229);Assert.assertEquals(expected, matrix);

        // dimension overflow
        __CLR4_4_11rob1roblb90pd1w.R.inc(83230);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83231);m.setSubMatrix(testData,1,1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83232);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11rob1roblb90pd1w.R.inc(83233);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83234);m.setSubMatrix(testData,-1,1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83235);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11rob1roblb90pd1w.R.inc(83236);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83237);m.setSubMatrix(testData,1,-1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83238);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11rob1roblb90pd1w.R.inc(83239);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83240);m.setSubMatrix(null,1,1);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83241);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }

        // ragged
        __CLR4_4_11rob1roblb90pd1w.R.inc(83242);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83243);m.setSubMatrix(new Fraction[][] {{new Fraction(1)}, {new Fraction(2), new Fraction(3)}}, 0, 0);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83244);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11rob1roblb90pd1w.R.inc(83245);try {
            __CLR4_4_11rob1roblb90pd1w.R.inc(83246);m.setSubMatrix(new Fraction[][] {{}}, 0, 0);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83247);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testWalk() {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1310jtu1s8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testWalk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1310jtu1s8g(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83248);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83249);int rows    = 150;
        __CLR4_4_11rob1roblb90pd1w.R.inc(83250);int columns = 75;

        __CLR4_4_11rob1roblb90pd1w.R.inc(83251);FieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83252);m.walkInRowOrder(new SetVisitor());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83253);GetVisitor getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83254);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83255);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11rob1roblb90pd1w.R.inc(83256);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83257);m.walkInRowOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83258);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83259);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83260);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83261);for (int i = 0; (((i < rows)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83262)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83263)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83264);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83265);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83266);for (int j = 0; (((j < columns)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83267)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83268)==0&false)); ++j) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83269);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83270);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11rob1roblb90pd1w.R.inc(83271);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83272);m.walkInColumnOrder(new SetVisitor());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83273);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83274);m.walkInOptimizedOrder(getVisitor);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83275);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11rob1roblb90pd1w.R.inc(83276);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83277);m.walkInColumnOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83278);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83279);m.walkInOptimizedOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83280);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83281);for (int i = 0; (((i < rows)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83282)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83283)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83284);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83285);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83286);for (int j = 0; (((j < columns)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83287)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83288)==0&false)); ++j) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83289);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83290);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11rob1roblb90pd1w.R.inc(83291);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83292);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83293);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83294);m.walkInRowOrder(getVisitor);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83295);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11rob1roblb90pd1w.R.inc(83296);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83297);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83298);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83299);m.walkInRowOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83300);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83301);for (int i = 0; (((i < rows)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83302)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83303)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83304);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83305);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83306);for (int j = 0; (((j < columns)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83307)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83308)==0&false)); ++j) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83309);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83310);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

        }__CLR4_4_11rob1roblb90pd1w.R.inc(83311);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83312);m.walkInOptimizedOrder(new SetVisitor());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83313);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83314);m.walkInColumnOrder(getVisitor);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83315);Assert.assertEquals(rows * columns, getVisitor.getCount());

        __CLR4_4_11rob1roblb90pd1w.R.inc(83316);m = new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83317);m.walkInOptimizedOrder(new SetVisitor(), 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83318);getVisitor = new GetVisitor();
        __CLR4_4_11rob1roblb90pd1w.R.inc(83319);m.walkInColumnOrder(getVisitor, 1, rows - 2, 1, columns - 2);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83320);Assert.assertEquals((rows - 2) * (columns - 2), getVisitor.getCount());
        __CLR4_4_11rob1roblb90pd1w.R.inc(83321);for (int i = 0; (((i < rows)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83322)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83323)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83324);Assert.assertEquals(new Fraction(0), m.getEntry(i, 0));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83325);Assert.assertEquals(new Fraction(0), m.getEntry(i, columns - 1));
        }
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83326);for (int j = 0; (((j < columns)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83327)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83328)==0&false)); ++j) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83329);Assert.assertEquals(new Fraction(0), m.getEntry(0, j));
            __CLR4_4_11rob1roblb90pd1w.R.inc(83330);Assert.assertEquals(new Fraction(0), m.getEntry(rows - 1, j));
        }

    }}finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11rob1roblb90pd1w.R.globalSliceStart(getClass().getName(),83331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1sar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rob1roblb90pd1w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rob1roblb90pd1w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BlockFieldMatrixTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),83331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1sar(){try{__CLR4_4_11rob1roblb90pd1w.R.inc(83331);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83332);BlockFieldMatrix<Fraction> m = new BlockFieldMatrix<Fraction>(testData);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83333);Assert.assertEquals(m,TestUtils.serializeAndRecover(m));
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}

    private static class SetVisitor extends DefaultFieldMatrixChangingVisitor<Fraction> {
        public SetVisitor() {
            super(Fraction.ZERO);__CLR4_4_11rob1roblb90pd1w.R.inc(83335);try{__CLR4_4_11rob1roblb90pd1w.R.inc(83334);
        }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
        @Override
        public Fraction visit(int i, int j, Fraction value) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83336);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83337);return new Fraction(i * 11 + j, 11);
        }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
    }

    private static class GetVisitor extends DefaultFieldMatrixPreservingVisitor<Fraction> {
        private int count;
        public GetVisitor() {
            super(Fraction.ZERO);__CLR4_4_11rob1roblb90pd1w.R.inc(83339);try{__CLR4_4_11rob1roblb90pd1w.R.inc(83338);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83340);count = 0;
        }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
        @Override
        public void visit(int i, int j, Fraction value) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83341);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83342);++count;
            __CLR4_4_11rob1roblb90pd1w.R.inc(83343);Assert.assertEquals(new Fraction(i * 11 + j, 11), value);
        }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
        public int getCount() {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83344);
            __CLR4_4_11rob1roblb90pd1w.R.inc(83345);return count;
        }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
    }

    private BlockFieldMatrix<Fraction> createRandomMatrix(Random r, int rows, int columns) {try{__CLR4_4_11rob1roblb90pd1w.R.inc(83346);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83347);BlockFieldMatrix<Fraction> m =
            new BlockFieldMatrix<Fraction>(FractionField.getInstance(), rows, columns);
        __CLR4_4_11rob1roblb90pd1w.R.inc(83348);for (int i = 0; (((i < rows)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83349)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83350)==0&false)); ++i) {{
            __CLR4_4_11rob1roblb90pd1w.R.inc(83351);for (int j = 0; (((j < columns)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83352)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83353)==0&false)); ++j) {{
                __CLR4_4_11rob1roblb90pd1w.R.inc(83354);int p = r.nextInt(20) - 10;
                __CLR4_4_11rob1roblb90pd1w.R.inc(83355);int q = r.nextInt(20) - 10;
                __CLR4_4_11rob1roblb90pd1w.R.inc(83356);if ((((q == 0)&&(__CLR4_4_11rob1roblb90pd1w.R.iget(83357)!=0|true))||(__CLR4_4_11rob1roblb90pd1w.R.iget(83358)==0&false))) {{
                    __CLR4_4_11rob1roblb90pd1w.R.inc(83359);q = 1;
                }
                }__CLR4_4_11rob1roblb90pd1w.R.inc(83360);m.setEntry(i, j, new Fraction(p, q));
            }
        }}
        }__CLR4_4_11rob1roblb90pd1w.R.inc(83361);return m;
    }finally{__CLR4_4_11rob1roblb90pd1w.R.flushNeeded();}}
}

