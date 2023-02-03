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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.junit.Assert;
import org.junit.Test;

public class FieldLUSolverTest {static class __CLR4_4_11tzp1tzplb90pd5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,85604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int[][] testData = {
            { 1, 2, 3},
            { 2, 5, 3},
            { 1, 0, 8}
    };
    private int[][] luData = {
            { 2, 3, 3 },
            { 0, 5, 7 },
            { 6, 9, 8 }
    };

    // singular matrices
    private int[][] singular = {
            { 2, 3 },
            { 2, 3 }
    };
    private int[][] bigSingular = {
            { 1, 2,   3,    4 },
            { 2, 5,   3,    4 },
            { 7, 3, 256, 1930 },
            { 3, 7,   6,    8 }
    }; // 4th row = 1st + 2nd

    public static FieldMatrix<Fraction> createFractionMatrix(final int[][] data) {try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85525);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85526);final int numRows = data.length;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85527);final int numCols = data[0].length;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85528);final Array2DRowFieldMatrix<Fraction> m;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85529);m = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(),
                                                numRows, numCols);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85530);for (int i = 0; (((i < numRows)&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85531)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85532)==0&false)); i++) {{
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85533);for (int j = 0; (((j < numCols)&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85534)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85535)==0&false)); j++) {{
                __CLR4_4_11tzp1tzplb90pd5l.R.inc(85536);m.setEntry(i, j, new Fraction(data[i][j], 1));
            }
        }}
        }__CLR4_4_11tzp1tzplb90pd5l.R.inc(85537);return m;
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    /** test singular */
    @Test
    public void testSingular() {__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceStart(getClass().getName(),85538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p0sts1u02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tzp1tzplb90pd5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUSolverTest.testSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p0sts1u02(){try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85538);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85539);FieldDecompositionSolver<Fraction> solver;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85540);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(testData))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85541);Assert.assertTrue(solver.isNonSingular());
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85542);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(singular))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85543);Assert.assertFalse(solver.isNonSingular());
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85544);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(bigSingular))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85545);Assert.assertFalse(solver.isNonSingular());
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceStart(getClass().getName(),85546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1u0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tzp1tzplb90pd5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUSolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1u0a(){try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85546);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85547);FieldDecompositionSolver<Fraction> solver;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85548);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(testData))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85549);FieldMatrix<Fraction> b = createFractionMatrix(new int[2][2]);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85550);try {
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85551);solver.solve(b);
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85552);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85553);try {
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85554);solver.solve(b.getColumnVector(0));
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85555);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    /** test solve singularity errors */
    @Test
    public void testSolveSingularityErrors() {__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceStart(getClass().getName(),85556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxdo9w1u0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tzp1tzplb90pd5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUSolverTest.testSolveSingularityErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxdo9w1u0k(){try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85556);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85557);FieldDecompositionSolver<Fraction> solver;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85558);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(singular))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85559);FieldMatrix<Fraction> b = createFractionMatrix(new int[2][2]);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85560);try {
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85561);solver.solve(b);
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85562);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85563);try {
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85564);solver.solve(b.getColumnVector(0));
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85565);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceStart(getClass().getName(),85566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1u0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tzp1tzplb90pd5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUSolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1u0u(){try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85566);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85567);FieldDecompositionSolver<Fraction> solver;
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85568);solver = new FieldLUDecomposition<Fraction>(createFractionMatrix(testData))
            .getSolver();
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85569);FieldMatrix<Fraction> b = createFractionMatrix(new int[][] {
                { 1, 0 }, { 2, -5 }, { 3, 1 }
        });
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85570);FieldMatrix<Fraction> xRef = createFractionMatrix(new int[][] {
                { 19, -71 }, { -6, 22 }, { -2, 9 }
        });

        // using FieldMatrix
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85571);FieldMatrix<Fraction> x = solver.solve(b);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85572);for (int i = 0; (((i < x.getRowDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85573)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85574)==0&false)); i++){{
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85575);for (int j = 0; (((j < x.getColumnDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85576)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85577)==0&false)); j++){{
                __CLR4_4_11tzp1tzplb90pd5l.R.inc(85578);Assert.assertEquals("(" + i + ", " + j + ")",
                                    xRef.getEntry(i, j), x.getEntry(i, j));
            }
        }}

        // using ArrayFieldVector
        }__CLR4_4_11tzp1tzplb90pd5l.R.inc(85579);for (int j = 0; (((j < b.getColumnDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85580)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85581)==0&false)); j++) {{
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85582);final FieldVector<Fraction> xj = solver.solve(b.getColumnVector(j));
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85583);for (int i = 0; (((i < xj.getDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85584)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85585)==0&false)); i++){{
                __CLR4_4_11tzp1tzplb90pd5l.R.inc(85586);Assert.assertEquals("(" + i + ", " + j + ")",
                                    xRef.getEntry(i, j), xj.getEntry(i));
            }
        }}

        // using SparseFieldVector
        }__CLR4_4_11tzp1tzplb90pd5l.R.inc(85587);for (int j = 0; (((j < b.getColumnDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85588)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85589)==0&false)); j++) {{
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85590);final SparseFieldVector<Fraction> bj;
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85591);bj = new SparseFieldVector<Fraction>(FractionField.getInstance(),
                                                 b.getColumn(j));
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85592);final FieldVector<Fraction> xj = solver.solve(bj);
            __CLR4_4_11tzp1tzplb90pd5l.R.inc(85593);for (int i = 0; (((i < xj.getDimension())&&(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85594)!=0|true))||(__CLR4_4_11tzp1tzplb90pd5l.R.iget(85595)==0&false)); i++) {{
                __CLR4_4_11tzp1tzplb90pd5l.R.inc(85596);Assert.assertEquals("(" + i + ", " + j + ")",
                                    xRef.getEntry(i, j), xj.getEntry(i));
            }
        }}
    }}finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    /** test determinant */
    @Test
    public void testDeterminant() {__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceStart(getClass().getName(),85597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0n2ye1u1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tzp1tzplb90pd5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tzp1tzplb90pd5l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUSolverTest.testDeterminant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0n2ye1u1p(){try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85597);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85598);Assert.assertEquals( -1, getDeterminant(createFractionMatrix(testData)), 1E-15);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85599);Assert.assertEquals(-10, getDeterminant(createFractionMatrix(luData)), 1E-14);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85600);Assert.assertEquals(  0, getDeterminant(createFractionMatrix(singular)), 1E-15);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85601);Assert.assertEquals(  0, getDeterminant(createFractionMatrix(bigSingular)), 1E-15);
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}

    private double getDeterminant(final FieldMatrix<Fraction> m) {try{__CLR4_4_11tzp1tzplb90pd5l.R.inc(85602);
        __CLR4_4_11tzp1tzplb90pd5l.R.inc(85603);return new FieldLUDecomposition<Fraction>(m).getDeterminant().doubleValue();
    }finally{__CLR4_4_11tzp1tzplb90pd5l.R.flushNeeded();}}
}
