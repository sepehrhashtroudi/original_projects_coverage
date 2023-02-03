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

import org.junit.Test;
import org.junit.Assert;

public class LUSolverTest {static class __CLR4_4_11uu71uu7lb90pd7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86679,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[][] testData = {
            { 1.0, 2.0, 3.0},
            { 2.0, 5.0, 3.0},
            { 1.0, 0.0, 8.0}
    };
    private double[][] luData = {
            { 2.0, 3.0, 3.0 },
            { 0.0, 5.0, 7.0 },
            { 6.0, 9.0, 8.0 }
    };

    // singular matrices
    private double[][] singular = {
            { 2.0, 3.0 },
            { 2.0, 3.0 }
    };
    private double[][] bigSingular = {
            { 1.0, 2.0,   3.0,    4.0 },
            { 2.0, 5.0,   3.0,    4.0 },
            { 7.0, 3.0, 256.0, 1930.0 },
            { 3.0, 7.0,   6.0,    8.0 }
    }; // 4th row = 1st + 2nd

    /** test threshold impact */
    @Test
    public void testThreshold() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161n3ds1uu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testThreshold",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161n3ds1uu7(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86623);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86624);final RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
                                                       { 1.0, 2.0, 3.0},
                                                       { 2.0, 5.0, 3.0},
                                                       { 4.000001, 9.0, 9.0}
                                                     });
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86625);Assert.assertFalse(new LUDecomposition(matrix, 1.0e-5).getSolver().isNonSingular());
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86626);Assert.assertTrue(new LUDecomposition(matrix, 1.0e-10).getSolver().isNonSingular());
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    /** test singular */
    @Test
    public void testSingular() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p0sts1uub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p0sts1uub(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86627);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86628);DecompositionSolver solver =
            new LUDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86629);Assert.assertTrue(solver.isNonSingular());
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86630);solver = new LUDecomposition(MatrixUtils.createRealMatrix(singular)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86631);Assert.assertFalse(solver.isNonSingular());
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86632);solver = new LUDecomposition(MatrixUtils.createRealMatrix(bigSingular)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86633);Assert.assertFalse(solver.isNonSingular());
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1uui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1uui(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86634);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86635);DecompositionSolver solver =
            new LUDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86636);RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86637);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86638);solver.solve(b);
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86639);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86640);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86641);solver.solve(b.getColumnVector(0));
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86642);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86643);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86644);solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86645);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    /** test solve singularity errors */
    @Test
    public void testSolveSingularityErrors() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxdo9w1uuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testSolveSingularityErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxdo9w1uuu(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86646);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86647);DecompositionSolver solver =
            new LUDecomposition(MatrixUtils.createRealMatrix(singular)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86648);RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86649);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86650);solver.solve(b);
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86651);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86652);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86653);solver.solve(b.getColumnVector(0));
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86654);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86655);try {
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86656);solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86657);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1uv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1uv6(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86658);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86659);DecompositionSolver solver =
            new LUDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver();
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86660);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
                { 1, 0 }, { 2, -5 }, { 3, 1 }
        });
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86661);RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] {
                { 19, -71 }, { -6, 22 }, { -2, 9 }
        });

        // using RealMatrix
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86662);Assert.assertEquals(0, solver.solve(b).subtract(xRef).getNorm(), 1.0e-13);

        // using ArrayRealVector
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86663);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11uu71uu7lb90pd7j.R.iget(86664)!=0|true))||(__CLR4_4_11uu71uu7lb90pd7j.R.iget(86665)==0&false)); ++i) {{
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86666);Assert.assertEquals(0,
                         solver.solve(b.getColumnVector(i)).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }

        // using RealVector with an alternate implementation
        }__CLR4_4_11uu71uu7lb90pd7j.R.inc(86667);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11uu71uu7lb90pd7j.R.iget(86668)!=0|true))||(__CLR4_4_11uu71uu7lb90pd7j.R.iget(86669)==0&false)); ++i) {{
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86670);ArrayRealVectorTest.RealVectorTestImpl v =
                new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i));
            __CLR4_4_11uu71uu7lb90pd7j.R.inc(86671);Assert.assertEquals(0,
                         solver.solve(v).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }
    }}finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    /** test determinant */
    @Test
    public void testDeterminant() {__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceStart(getClass().getName(),86672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0n2ye1uvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uu71uu7lb90pd7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uu71uu7lb90pd7j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUSolverTest.testDeterminant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0n2ye1uvk(){try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86672);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86673);Assert.assertEquals( -1, getDeterminant(MatrixUtils.createRealMatrix(testData)), 1.0e-15);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86674);Assert.assertEquals(-10, getDeterminant(MatrixUtils.createRealMatrix(luData)), 1.0e-14);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86675);Assert.assertEquals(  0, getDeterminant(MatrixUtils.createRealMatrix(singular)), 1.0e-17);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86676);Assert.assertEquals(  0, getDeterminant(MatrixUtils.createRealMatrix(bigSingular)), 1.0e-10);
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}

    private double getDeterminant(RealMatrix m) {try{__CLR4_4_11uu71uu7lb90pd7j.R.inc(86677);
        __CLR4_4_11uu71uu7lb90pd7j.R.inc(86678);return new LUDecomposition(m).getDeterminant();
    }finally{__CLR4_4_11uu71uu7lb90pd7j.R.flushNeeded();}}
}
