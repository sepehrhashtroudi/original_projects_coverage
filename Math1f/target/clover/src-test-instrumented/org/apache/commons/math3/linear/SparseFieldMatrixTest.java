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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * Test cases for the {@link SparseFieldMatrix} class.
 *
 * @version $Id$
 */
public class SparseFieldMatrixTest {static class __CLR4_4_11wqr1wqrlb90pddl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89419,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // 3 x 3 identity matrix
    protected Fraction[][] id = { {new Fraction(1), new Fraction(0), new Fraction(0) }, { new Fraction(0), new Fraction(1), new Fraction(0) }, { new Fraction(0), new Fraction(0), new Fraction(1) } };
    // Test data for group operations
    protected Fraction[][] testData = { { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(5), new Fraction(3) },
            { new Fraction(1), new Fraction(0), new Fraction(8) } };
    protected Fraction[][] testDataLU = null;
    protected Fraction[][] testDataPlus2 = { { new Fraction(3), new Fraction(4), new Fraction(5) }, { new Fraction(4), new Fraction(7), new Fraction(5) },
            { new Fraction(3), new Fraction(2), new Fraction(10) } };
    protected Fraction[][] testDataMinus = { { new Fraction(-1), new Fraction(-2), new Fraction(-3) },
            { new Fraction(-2), new Fraction(-5), new Fraction(-3) }, { new Fraction(-1), new Fraction(0), new Fraction(-8) } };
    protected Fraction[] testDataRow1 = { new Fraction(1), new Fraction(2), new Fraction(3) };
    protected Fraction[] testDataCol3 = { new Fraction(3), new Fraction(3), new Fraction(8) };
    protected Fraction[][] testDataInv = { { new Fraction(-40), new Fraction(16), new Fraction(9) }, { new Fraction(13), new Fraction(-5), new Fraction(-3) },
            { new Fraction(5), new Fraction(-2), new Fraction(-1) } };
    protected Fraction[] preMultTest = { new Fraction(8), new Fraction(12), new Fraction(33) };
    protected Fraction[][] testData2 = { { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(5), new Fraction(3) } };
    protected Fraction[][] testData2T = { { new Fraction(1), new Fraction(2) }, { new Fraction(2), new Fraction(5) }, { new Fraction(3), new Fraction(3) } };
    protected Fraction[][] testDataPlusInv = { { new Fraction(-39), new Fraction(18), new Fraction(12) },
            { new Fraction(15), new Fraction(0), new Fraction(0) }, { new Fraction(6), new Fraction(-2), new Fraction(7) } };

    // lu decomposition tests
    protected Fraction[][] luData = { { new Fraction(2), new Fraction(3), new Fraction(3) }, { new Fraction(0), new Fraction(5), new Fraction(7) }, { new Fraction(6), new Fraction(9), new Fraction(8) } };
    protected Fraction[][] luDataLUDecomposition = null;

    // singular matrices
    protected Fraction[][] singular = { { new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(3) } };
    protected Fraction[][] bigSingular = { { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) },
            { new Fraction(2), new Fraction(5), new Fraction(3), new Fraction(4) }, { new Fraction(7), new Fraction(3), new Fraction(256), new Fraction(1930) }, { new Fraction(3), new Fraction(7), new Fraction(6), new Fraction(8) } }; // 4th

    // row
    // =
    // 1st
    // +
    // 2nd
    protected Fraction[][] detData = { { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(4), new Fraction(5), new Fraction(6) },
            { new Fraction(7), new Fraction(8), new Fraction(10) } };
    protected Fraction[][] detData2 = { { new Fraction(1), new Fraction(3) }, { new Fraction(2), new Fraction(4) } };

    // vectors
    protected Fraction[] testVector = { new Fraction(1), new Fraction(2), new Fraction(3) };
    protected Fraction[] testVector2 = { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) };

    // submatrix accessor tests
    protected Fraction[][] subTestData = null;

    // array selections
    protected Fraction[][] subRows02Cols13 = { {new Fraction(2), new Fraction(4) }, { new Fraction(4), new Fraction(8) } };
    protected Fraction[][] subRows03Cols12 = { { new Fraction(2), new Fraction(3) }, { new Fraction(5), new Fraction(6) } };
    protected Fraction[][] subRows03Cols123 = { { new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6), new Fraction(7) } };

    // effective permutations
    protected Fraction[][] subRows20Cols123 = { { new Fraction(4), new Fraction(6), new Fraction(8) }, { new Fraction(2), new Fraction(3), new Fraction(4) } };
    protected Fraction[][] subRows31Cols31 = null;

    // contiguous ranges
    protected Fraction[][] subRows01Cols23 = null;
    protected Fraction[][] subRows23Cols00 = { { new Fraction(2) }, { new Fraction(4) } };
    protected Fraction[][] subRows00Cols33 = { { new Fraction(4) } };

    // row matrices
    protected Fraction[][] subRow0 = { { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) } };
    protected Fraction[][] subRow3 = { { new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7) } };

    // column matrices
    protected Fraction[][] subColumn1 = null;
    protected Fraction[][] subColumn3 = null;

    // tolerances
    protected double entryTolerance = 10E-16;
    protected double normTolerance = 10E-14;
    protected Field<Fraction> field = FractionField.getInstance();

    public SparseFieldMatrixTest() {try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89091);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89092);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89093);testDataLU = new Fraction[][]{ { new Fraction(2), new Fraction(5), new Fraction(3) }, { new Fraction(.5d), new Fraction(-2.5d), new Fraction(6.5d) },
                    { new Fraction(0.5d), new Fraction(0.2d), new Fraction(.2d) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89094);luDataLUDecomposition = new Fraction[][]{ { new Fraction(6), new Fraction(9), new Fraction(8) },
                { new Fraction(0), new Fraction(5), new Fraction(7) }, { new Fraction(0.33333333333333), new Fraction(0), new Fraction(0.33333333333333) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89095);subTestData = new Fraction [][]{ { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) },
                    { new Fraction(1.5), new Fraction(2.5), new Fraction(3.5), new Fraction(4.5) }, { new Fraction(2), new Fraction(4), new Fraction(6), new Fraction(8) }, { new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89096);subRows31Cols31 = new Fraction[][]{ { new Fraction(7), new Fraction(5) }, { new Fraction(4.5), new Fraction(2.5) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89097);subRows01Cols23 = new Fraction[][]{ { new Fraction(3), new Fraction(4) }, { new Fraction(3.5), new Fraction(4.5) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89098);subColumn1 = new Fraction [][]{ { new Fraction(2) }, { new Fraction(2.5) }, { new Fraction(4) }, { new Fraction(5) } };
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89099);subColumn3 = new Fraction[][]{ { new Fraction(4) }, { new Fraction(4.5) }, { new Fraction(8) }, { new Fraction(7) } };
        } catch (FractionConversionException e) {
            // ignore, can't happen
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21wr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21wr0(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89100);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89101);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89102);SparseFieldMatrix<Fraction> m2 = createSparseMatrix(testData2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89103);Assert.assertEquals("testData row dimension", 3, m.getRowDimension());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89104);Assert.assertEquals("testData column dimension", 3, m.getColumnDimension());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89105);Assert.assertTrue("testData is square", m.isSquare());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89106);Assert.assertEquals("testData2 row dimension", m2.getRowDimension(), 2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89107);Assert.assertEquals("testData2 column dimension", m2.getColumnDimension(), 3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89108);Assert.assertTrue("testData2 is not square", !m2.isSquare());
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test copy functions */
    @Test
    public void testCopyFunctions() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8kqt1wr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testCopyFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8kqt1wr9(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89109);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89110);SparseFieldMatrix<Fraction> m1 = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89111);FieldMatrix<Fraction> m2 = m1.copy();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89112);Assert.assertEquals(m1.getClass(), m2.getClass());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89113);Assert.assertEquals((m2), m1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89114);SparseFieldMatrix<Fraction> m3 = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89115);FieldMatrix<Fraction> m4 = m3.copy();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89116);Assert.assertEquals(m3.getClass(), m4.getClass());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89117);Assert.assertEquals((m4), m3);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test add */
    @Test
    public void testAdd() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1wri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1wri(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89118);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89119);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89120);SparseFieldMatrix<Fraction> mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89121);SparseFieldMatrix<Fraction> mDataPlusInv = createSparseMatrix(testDataPlusInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89122);FieldMatrix<Fraction> mPlusMInv = m.add(mInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89123);for (int row = 0; (((row < m.getRowDimension())&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89124)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89125)==0&false)); row++) {{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89126);for (int col = 0; (((col < m.getColumnDimension())&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89127)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89128)==0&false)); col++) {{
                __CLR4_4_11wqr1wqrlb90pddl.R.inc(89129);Assert.assertEquals("sum entry entry",
                    mDataPlusInv.getEntry(row, col).doubleValue(), mPlusMInv.getEntry(row, col).doubleValue(),
                    entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test add failure */
    @Test
    public void testAddFail() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qefw2c1wru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testAddFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qefw2c1wru(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89130);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89131);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89132);SparseFieldMatrix<Fraction> m2 = createSparseMatrix(testData2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89133);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89134);m.add(m2);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89135);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}


    /** test m-n = m + -n */
    @Test
    public void testPlusMinus() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg67nv1ws0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testPlusMinus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg67nv1ws0(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89136);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89137);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89138);SparseFieldMatrix<Fraction> n = createSparseMatrix(testDataInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89139);assertClose("m-n = m + -n", m.subtract(n),
            n.scalarMultiply(new Fraction(-1)).add(m), entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89140);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89141);m.subtract(createSparseMatrix(testData2));
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89142);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test multiply */
    @Test
    public void testMultiply() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1ws7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1ws7(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89143);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89144);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89145);SparseFieldMatrix<Fraction> mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89146);SparseFieldMatrix<Fraction> identity = createSparseMatrix(id);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89147);SparseFieldMatrix<Fraction> m2 = createSparseMatrix(testData2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89148);assertClose("inverse multiply", m.multiply(mInv), identity,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89149);assertClose("inverse multiply", m.multiply(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testDataInv)), identity,
                    entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89150);assertClose("inverse multiply", mInv.multiply(m), identity,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89151);assertClose("identity multiply", m.multiply(identity), m,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89152);assertClose("identity multiply", identity.multiply(mInv), mInv,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89153);assertClose("identity multiply", m2.multiply(identity), m2,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89154);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89155);m.multiply(createSparseMatrix(bigSingular));
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89156);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    // Additional Test for Array2DRowRealMatrixTest.testMultiply

    private Fraction[][] d3 = new Fraction[][] { { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8) } };
    private Fraction[][] d4 = new Fraction[][] { { new Fraction(1) }, { new Fraction(2) }, { new Fraction(3) }, { new Fraction(4) } };
    private Fraction[][] d5 = new Fraction[][] { { new Fraction(30) }, { new Fraction(70) } };

    @Test
    public void testMultiply2() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251wsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251wsl(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89157);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89158);FieldMatrix<Fraction> m3 = createSparseMatrix(d3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89159);FieldMatrix<Fraction> m4 = createSparseMatrix(d4);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89160);FieldMatrix<Fraction> m5 = createSparseMatrix(d5);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89161);assertClose("m3*m4=m5", m3.multiply(m4), m5, entryTolerance);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test trace */
    @Test
    public void testTrace() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ht6t61wsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testTrace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ht6t61wsq(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89162);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89163);FieldMatrix<Fraction> m = createSparseMatrix(id);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89164);Assert.assertEquals("identity trace", 3d, m.getTrace().doubleValue(), entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89165);m = createSparseMatrix(testData2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89166);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89167);m.getTrace();
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89168);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test sclarAdd */
    @Test
    public void testScalarAdd() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r073wq1wsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testScalarAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r073wq1wsx(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89169);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89170);FieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89171);assertClose("scalar add", createSparseMatrix(testDataPlus2),
            m.scalarAdd(new Fraction(2)), entryTolerance);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test operate */
    @Test
    public void testOperate() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1wt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1wt0(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89172);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89173);FieldMatrix<Fraction> m = createSparseMatrix(id);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89174);assertClose("identity operate", testVector, m.operate(testVector),
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89175);assertClose("identity operate", testVector, m.operate(
                new ArrayFieldVector<Fraction>(testVector)).getData(), entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89176);m = createSparseMatrix(bigSingular);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89177);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89178);m.operate(testVector);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89179);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test issue MATH-209 */
    @Test
    public void testMath209() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh1w4o1wt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testMath209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh1w4o1wt8(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89180);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89181);FieldMatrix<Fraction> a = createSparseMatrix(new Fraction[][] {
                { new Fraction(1), new Fraction(2) }, { new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89182);Fraction[] b = a.operate(new Fraction[] { new Fraction(1), new Fraction(1) });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89183);Assert.assertEquals(a.getRowDimension(), b.length);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89184);Assert.assertEquals(3.0, b[0].doubleValue(), 1.0e-12);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89185);Assert.assertEquals(7.0, b[1].doubleValue(), 1.0e-12);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89186);Assert.assertEquals(11.0, b[2].doubleValue(), 1.0e-12);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test transpose */
    @Test
    public void testTranspose() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr21wtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr21wtf(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89187);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89188);FieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89189);FieldMatrix<Fraction> mIT = new FieldLUDecomposition<Fraction>(m).getSolver().getInverse().transpose();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89190);FieldMatrix<Fraction> mTI = new FieldLUDecomposition<Fraction>(m.transpose()).getSolver().getInverse();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89191);assertClose("inverse-transpose", mIT, mTI, normTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89192);m = createSparseMatrix(testData2);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89193);FieldMatrix<Fraction> mt = createSparseMatrix(testData2T);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89194);assertClose("transpose",mt,m.transpose(),normTolerance);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test preMultiply by vector */
    @Test
    public void testPremultiplyVector() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5c08x1wtn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testPremultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5c08x1wtn(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89195);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89196);FieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89197);assertClose("premultiply", m.preMultiply(testVector), preMultTest,
            normTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89198);assertClose("premultiply", m.preMultiply(
            new ArrayFieldVector<Fraction>(testVector).getData()), preMultTest, normTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89199);m = createSparseMatrix(bigSingular);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89200);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89201);m.preMultiply(testVector);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89202);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testPremultiply() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16waah01wtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testPremultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16waah01wtv(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89203);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89204);FieldMatrix<Fraction> m3 = createSparseMatrix(d3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89205);FieldMatrix<Fraction> m4 = createSparseMatrix(d4);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89206);FieldMatrix<Fraction> m5 = createSparseMatrix(d5);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89207);assertClose("m3*m4=m5", m4.preMultiply(m3), m5, entryTolerance);

        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89208);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89209);SparseFieldMatrix<Fraction> mInv = createSparseMatrix(testDataInv);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89210);SparseFieldMatrix<Fraction> identity = createSparseMatrix(id);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89211);assertClose("inverse multiply", m.preMultiply(mInv), identity,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89212);assertClose("inverse multiply", mInv.preMultiply(m), identity,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89213);assertClose("identity multiply", m.preMultiply(identity), m,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89214);assertClose("identity multiply", identity.preMultiply(mInv), mInv,
                entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89215);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89216);m.preMultiply(createSparseMatrix(bigSingular));
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89217);Assert.fail("Expecting illegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetVectors() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuaj711wua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuaj711wua(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89218);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89219);FieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89220);assertClose("get row", m.getRow(0), testDataRow1, entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89221);assertClose("get col", m.getColumn(2), testDataCol3, entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89222);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89223);m.getRow(10);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89224);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89225);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89226);m.getColumn(-1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89227);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // ignored
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1wuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1wuk(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89228);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89229);FieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89230);Assert.assertEquals("get entry", m.getEntry(0, 1).doubleValue(), 2d, entryTolerance);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89231);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89232);m.getEntry(10, 4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89233);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** test examples in user guide */
    @Test
    public void testExamples() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knwny1wuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testExamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knwny1wuq(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89234);
        // Create a real matrix with two rows and three columns
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89235);Fraction[][] matrixData = { { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(5), new Fraction(3) } };
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89236);FieldMatrix<Fraction> m = createSparseMatrix(matrixData);
        // One more with three rows, two columns
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89237);Fraction[][] matrixData2 = { { new Fraction(1), new Fraction(2) }, { new Fraction(2), new Fraction(5) }, { new Fraction(1), new Fraction(7) } };
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89238);FieldMatrix<Fraction> n = createSparseMatrix(matrixData2);
        // Now multiply m by n
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89239);FieldMatrix<Fraction> p = m.multiply(n);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89240);Assert.assertEquals(2, p.getRowDimension());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89241);Assert.assertEquals(2, p.getColumnDimension());
        // Invert p
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89242);FieldMatrix<Fraction> pInverse = new FieldLUDecomposition<Fraction>(p).getSolver().getInverse();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89243);Assert.assertEquals(2, pInverse.getRowDimension());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89244);Assert.assertEquals(2, pInverse.getColumnDimension());

        // Solve example
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89245);Fraction[][] coefficientsData = { { new Fraction(2), new Fraction(3), new Fraction(-2) }, { new Fraction(-1), new Fraction(7), new Fraction(6) },
                { new Fraction(4), new Fraction(-3), new Fraction(-5) } };
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89246);FieldMatrix<Fraction> coefficients = createSparseMatrix(coefficientsData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89247);Fraction[] constants = { new Fraction(1), new Fraction(-2), new Fraction(1) };
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89248);Fraction[] solution;
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89249);solution = new FieldLUDecomposition<Fraction>(coefficients)
            .getSolver()
            .solve(new ArrayFieldVector<Fraction>(constants, false)).toArray();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89250);Assert.assertEquals((new Fraction(2).multiply((solution[0])).add(new Fraction(3).multiply(solution[1])).subtract(new Fraction(2).multiply(solution[2]))).doubleValue(),
                constants[0].doubleValue(), 1E-12);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89251);Assert.assertEquals(((new Fraction(-1).multiply(solution[0])).add(new Fraction(7).multiply(solution[1])).add(new Fraction(6).multiply(solution[2]))).doubleValue(),
                constants[1].doubleValue(), 1E-12);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89252);Assert.assertEquals(((new Fraction(4).multiply(solution[0])).subtract(new Fraction(3).multiply( solution[1])).subtract(new Fraction(5).multiply(solution[2]))).doubleValue(),
                constants[2].doubleValue(), 1E-12);

    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    // test submatrix accessors
    @Test
    public void testSubMatrix() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qygefq1wv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qygefq1wv9(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89253);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89254);FieldMatrix<Fraction> m = createSparseMatrix(subTestData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89255);FieldMatrix<Fraction> mRows23Cols00 = createSparseMatrix(subRows23Cols00);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89256);FieldMatrix<Fraction> mRows00Cols33 = createSparseMatrix(subRows00Cols33);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89257);FieldMatrix<Fraction> mRows01Cols23 = createSparseMatrix(subRows01Cols23);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89258);FieldMatrix<Fraction> mRows02Cols13 = createSparseMatrix(subRows02Cols13);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89259);FieldMatrix<Fraction> mRows03Cols12 = createSparseMatrix(subRows03Cols12);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89260);FieldMatrix<Fraction> mRows03Cols123 = createSparseMatrix(subRows03Cols123);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89261);FieldMatrix<Fraction> mRows20Cols123 = createSparseMatrix(subRows20Cols123);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89262);FieldMatrix<Fraction> mRows31Cols31 = createSparseMatrix(subRows31Cols31);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89263);Assert.assertEquals("Rows23Cols00", mRows23Cols00, m.getSubMatrix(2, 3, 0, 0));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89264);Assert.assertEquals("Rows00Cols33", mRows00Cols33, m.getSubMatrix(0, 0, 3, 3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89265);Assert.assertEquals("Rows01Cols23", mRows01Cols23, m.getSubMatrix(0, 1, 2, 3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89266);Assert.assertEquals("Rows02Cols13", mRows02Cols13,
            m.getSubMatrix(new int[] { 0, 2 }, new int[] { 1, 3 }));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89267);Assert.assertEquals("Rows03Cols12", mRows03Cols12,
            m.getSubMatrix(new int[] { 0, 3 }, new int[] { 1, 2 }));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89268);Assert.assertEquals("Rows03Cols123", mRows03Cols123,
            m.getSubMatrix(new int[] { 0, 3 }, new int[] { 1, 2, 3 }));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89269);Assert.assertEquals("Rows20Cols123", mRows20Cols123,
            m.getSubMatrix(new int[] { 2, 0 }, new int[] { 1, 2, 3 }));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89270);Assert.assertEquals("Rows31Cols31", mRows31Cols31,
            m.getSubMatrix(new int[] { 3, 1 }, new int[] { 3, 1 }));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89271);Assert.assertEquals("Rows31Cols31", mRows31Cols31,
            m.getSubMatrix(new int[] { 3, 1 }, new int[] { 3, 1 }));

        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89272);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89273);m.getSubMatrix(1, 0, 2, 4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89274);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89275);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89276);m.getSubMatrix(-1, 1, 2, 2);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89277);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89278);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89279);m.getSubMatrix(1, 0, 2, 2);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89280);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89281);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89282);m.getSubMatrix(1, 0, 2, 4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89283);Assert.fail("Expecting NumberIsTooSmallException");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89284);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89285);m.getSubMatrix(new int[] {}, new int[] { 0 });
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89286);Assert.fail("Expecting NoDataException");
        } catch (NoDataException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89287);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89288);m.getSubMatrix(new int[] { 0 }, new int[] { 4 });
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89289);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetRowMatrix() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v9mla1wwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetRowMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v9mla1wwa(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89290);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89291);FieldMatrix<Fraction> m = createSparseMatrix(subTestData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89292);FieldMatrix<Fraction> mRow0 = createSparseMatrix(subRow0);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89293);FieldMatrix<Fraction> mRow3 = createSparseMatrix(subRow3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89294);Assert.assertEquals("Row0", mRow0, m.getRowMatrix(0));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89295);Assert.assertEquals("Row3", mRow3, m.getRowMatrix(3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89296);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89297);m.getRowMatrix(-1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89298);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89299);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89300);m.getRowMatrix(4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89301);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetColumnMatrix() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95wrm1wwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetColumnMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95wrm1wwm(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89302);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89303);FieldMatrix<Fraction> m = createSparseMatrix(subTestData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89304);FieldMatrix<Fraction> mColumn1 = createSparseMatrix(subColumn1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89305);FieldMatrix<Fraction> mColumn3 = createSparseMatrix(subColumn3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89306);Assert.assertEquals("Column1", mColumn1, m.getColumnMatrix(1));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89307);Assert.assertEquals("Column3", mColumn3, m.getColumnMatrix(3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89308);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89309);m.getColumnMatrix(-1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89310);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89311);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89312);m.getColumnMatrix(4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89313);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetRowVector() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p19x401wwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetRowVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p19x401wwy(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89314);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89315);FieldMatrix<Fraction> m = createSparseMatrix(subTestData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89316);FieldVector<Fraction> mRow0 = new ArrayFieldVector<Fraction>(subRow0[0]);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89317);FieldVector<Fraction> mRow3 = new ArrayFieldVector<Fraction>(subRow3[0]);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89318);Assert.assertEquals("Row0", mRow0, m.getRowVector(0));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89319);Assert.assertEquals("Row3", mRow3, m.getRowVector(3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89320);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89321);m.getRowVector(-1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89322);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89323);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89324);m.getRowVector(4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89325);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testGetColumnVector() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plxuos1wxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testGetColumnVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plxuos1wxa(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89326);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89327);FieldMatrix<Fraction> m = createSparseMatrix(subTestData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89328);FieldVector<Fraction> mColumn1 = columnToVector(subColumn1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89329);FieldVector<Fraction> mColumn3 = columnToVector(subColumn3);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89330);Assert.assertEquals("Column1", mColumn1, m.getColumnVector(1));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89331);Assert.assertEquals("Column3", mColumn3, m.getColumnVector(3));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89332);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89333);m.getColumnVector(-1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89334);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89335);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89336);m.getColumnVector(4);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89337);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    private FieldVector<Fraction> columnToVector(Fraction[][] column) {try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89338);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89339);Fraction[] data = new Fraction[column.length];
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89340);for (int i = 0; (((i < data.length)&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89341)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89342)==0&false)); ++i) {{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89343);data[i] = column[i][0];
        }
        }__CLR4_4_11wqr1wqrlb90pddl.R.inc(89344);return new ArrayFieldVector<Fraction>(data, false);
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81wxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81wxt(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89345);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89346);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89347);SparseFieldMatrix<Fraction> m1 = (SparseFieldMatrix<Fraction>) m.copy();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89348);SparseFieldMatrix<Fraction> mt = (SparseFieldMatrix<Fraction>) m.transpose();
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89349);Assert.assertTrue(m.hashCode() != mt.hashCode());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89350);Assert.assertEquals(m.hashCode(), m1.hashCode());
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89351);Assert.assertEquals(m, m);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89352);Assert.assertEquals(m, m1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89353);Assert.assertFalse(m.equals(null));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89354);Assert.assertFalse(m.equals(mt));
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89355);Assert.assertFalse(m.equals(createSparseMatrix(bigSingular)));
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /* Disable for now
    @Test
    public void testToString() {
        SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        Assert.assertEquals("SparseFieldMatrix<Fraction>{{1.0,2.0,3.0},{2.0,5.0,3.0},{1.0,0.0,8.0}}",
            m.toString());
        m = new SparseFieldMatrix<Fraction>(field, 1, 1);
        Assert.assertEquals("SparseFieldMatrix<Fraction>{{0.0}}", m.toString());
    }
    */

    @Test
    public void testSetSubMatrix() {__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceStart(getClass().getName(),89356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1wy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wqr1wqrlb90pddl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wqr1wqrlb90pddl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1wy4(){try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89356);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89357);SparseFieldMatrix<Fraction> m = createSparseMatrix(testData);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89358);m.setSubMatrix(detData2, 1, 1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89359);FieldMatrix<Fraction> expected = createSparseMatrix(new Fraction[][] {
                { new Fraction(1), new Fraction(2), new Fraction(3) }, { new Fraction(2), new Fraction(1), new Fraction(3) }, { new Fraction(1), new Fraction(2), new Fraction(4) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89360);Assert.assertEquals(expected, m);

        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89361);m.setSubMatrix(detData2, 0, 0);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89362);expected = createSparseMatrix(new Fraction[][] {
                { new Fraction(1), new Fraction(3), new Fraction(3) }, { new Fraction(2), new Fraction(4), new Fraction(3) }, { new Fraction(1), new Fraction(2), new Fraction(4) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89363);Assert.assertEquals(expected, m);

        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89364);m.setSubMatrix(testDataPlus2, 0, 0);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89365);expected = createSparseMatrix(new Fraction[][] {
                { new Fraction(3), new Fraction(4), new Fraction(5) }, { new Fraction(4), new Fraction(7), new Fraction(5) }, { new Fraction(3), new Fraction(2), new Fraction(10) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89366);Assert.assertEquals(expected, m);

        // javadoc example
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89367);SparseFieldMatrix<Fraction> matrix =
            createSparseMatrix(new Fraction[][] {
        { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8) }, { new Fraction(9), new Fraction(0), new Fraction(1), new Fraction(2) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89368);matrix.setSubMatrix(new Fraction[][] { { new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(6) } }, 1, 1);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89369);expected = createSparseMatrix(new Fraction[][] {
                { new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4) }, { new Fraction(5), new Fraction(3), new Fraction(4), new Fraction(8) }, { new Fraction(9), new Fraction(5), new Fraction(6), new Fraction(2) } });
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89370);Assert.assertEquals(expected, matrix);

        // dimension overflow
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89371);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89372);m.setSubMatrix(testData, 1, 1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89373);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        // dimension underflow
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89374);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89375);m.setSubMatrix(testData, -1, 1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89376);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89377);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89378);m.setSubMatrix(testData, 1, -1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89379);Assert.fail("expecting OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }

        // null
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89380);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89381);m.setSubMatrix(null, 1, 1);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89382);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89383);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89384);new SparseFieldMatrix<Fraction>(field, 0, 0);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89385);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // ragged
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89386);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89387);m.setSubMatrix(new Fraction[][] { { new Fraction(1) }, { new Fraction(2), new Fraction(3) } }, 0, 0);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89388);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }

        // empty
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89389);try {
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89390);m.setSubMatrix(new Fraction[][] { {} }, 0, 0);
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89391);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    // --------------- -----------------Protected methods

    /** verifies that two matrices are close (1-norm) */
    protected void assertClose(String msg, FieldMatrix<Fraction> m, FieldMatrix<Fraction> n,
            double tolerance) {try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89392);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89393);for(int i=0; (((i < m.getRowDimension())&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89394)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89395)==0&false)); i++){{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89396);for(int j=0; (((j < m.getColumnDimension())&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89397)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89398)==0&false)); j++){{
                __CLR4_4_11wqr1wqrlb90pddl.R.inc(89399);Assert.assertEquals(msg, m.getEntry(i,j).doubleValue(), n.getEntry(i,j).doubleValue(), tolerance);
            }

        }}
    }}finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    /** verifies that two vectors are close (sup norm) */
    protected void assertClose(String msg, Fraction[] m, Fraction[] n,
            double tolerance) {try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89400);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89401);if ((((m.length != n.length)&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89402)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89403)==0&false))) {{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89404);Assert.fail("vectors not same length");
        }
        }__CLR4_4_11wqr1wqrlb90pddl.R.inc(89405);for (int i = 0; (((i < m.length)&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89406)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89407)==0&false)); i++) {{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89408);Assert.assertEquals(msg + " " + i + " elements differ", m[i].doubleValue(), n[i].doubleValue(),
                    tolerance);
        }
    }}finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}

    private SparseFieldMatrix<Fraction> createSparseMatrix(Fraction[][] data) {try{__CLR4_4_11wqr1wqrlb90pddl.R.inc(89409);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89410);SparseFieldMatrix<Fraction> matrix = new SparseFieldMatrix<Fraction>(field, data.length, data[0].length);
        __CLR4_4_11wqr1wqrlb90pddl.R.inc(89411);for (int row = 0; (((row < data.length)&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89412)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89413)==0&false)); row++) {{
            __CLR4_4_11wqr1wqrlb90pddl.R.inc(89414);for (int col = 0; (((col < data[row].length)&&(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89415)!=0|true))||(__CLR4_4_11wqr1wqrlb90pddl.R.iget(89416)==0&false)); col++) {{
                __CLR4_4_11wqr1wqrlb90pddl.R.inc(89417);matrix.setEntry(row, col, data[row][col]);
            }
        }}
        }__CLR4_4_11wqr1wqrlb90pddl.R.inc(89418);return matrix;
    }finally{__CLR4_4_11wqr1wqrlb90pddl.R.flushNeeded();}}
}
