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

import java.util.Random;

import org.apache.commons.math3.exception.MathIllegalArgumentException;

import org.junit.Test;
import org.junit.Assert;

public class QRSolverTest {static class __CLR4_4_11v4g1v4glb90pd8f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,87067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    double[][] testData3x3NonSingular = {
            { 12, -51,   4 },
            {  6, 167, -68 },
            { -4,  24, -41 }
    };

    double[][] testData3x3Singular = {
            { 1, 2,  2 },
            { 2, 4,  6 },
            { 4, 8, 12 }
    };

    double[][] testData3x4 = {
            { 12, -51,   4, 1 },
            {  6, 167, -68, 2 },
            { -4,  24, -41, 3 }
    };

    double[][] testData4x3 = {
            { 12, -51,   4 },
            {  6, 167, -68 },
            { -4,  24, -41 },
            { -5,  34,   7 }
    };

    /** test rank */
    @Test
    public void testRank() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),86992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtsx3v1v4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtsx3v1v4g(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(86992);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86993);DecompositionSolver solver =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3NonSingular)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86994);Assert.assertTrue(solver.isNonSingular());

        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86995);solver = new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3Singular)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86996);Assert.assertFalse(solver.isNonSingular());

        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86997);solver = new QRDecomposition(MatrixUtils.createRealMatrix(testData3x4)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86998);Assert.assertTrue(solver.isNonSingular());

        __CLR4_4_11v4g1v4glb90pd8f.R.inc(86999);solver = new QRDecomposition(MatrixUtils.createRealMatrix(testData4x3)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87000);Assert.assertTrue(solver.isNonSingular());

    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),87001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1v4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1v4p(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87001);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87002);DecompositionSolver solver =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3NonSingular)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87003);RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87004);try {
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87005);solver.solve(b);
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87006);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87007);try {
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87008);solver.solve(b.getColumnVector(0));
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87009);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    /** test solve rank errors */
    @Test
    public void testSolveRankErrors() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),87010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffdmp71v4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testSolveRankErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffdmp71v4y(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87010);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87011);DecompositionSolver solver =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3Singular)).getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87012);RealMatrix b = MatrixUtils.createRealMatrix(new double[3][2]);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87013);try {
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87014);solver.solve(b);
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87015);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException iae) {
            // expected behavior
        }
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87016);try {
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87017);solver.solve(b.getColumnVector(0));
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87018);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),87019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1v57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1v57(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87019);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87020);QRDecomposition decomposition =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3NonSingular));
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87021);DecompositionSolver solver = decomposition.getSolver();
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87022);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
                { -102, 12250 }, { 544, 24500 }, { 167, -36750 }
        });
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87023);RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] {
                { 1, 2515 }, { 2, 422 }, { -3, 898 }
        });

        // using RealMatrix
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87024);Assert.assertEquals(0, solver.solve(b).subtract(xRef).getNorm(), 2.0e-16 * xRef.getNorm());

        // using ArrayRealVector
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87025);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11v4g1v4glb90pd8f.R.iget(87026)!=0|true))||(__CLR4_4_11v4g1v4glb90pd8f.R.iget(87027)==0&false)); ++i) {{
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87028);final RealVector x = solver.solve(b.getColumnVector(i));
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87029);final double error = x.subtract(xRef.getColumnVector(i)).getNorm();
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87030);Assert.assertEquals(0, error, 3.0e-16 * xRef.getColumnVector(i).getNorm());
        }

        // using RealVector with an alternate implementation
        }__CLR4_4_11v4g1v4glb90pd8f.R.inc(87031);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11v4g1v4glb90pd8f.R.iget(87032)!=0|true))||(__CLR4_4_11v4g1v4glb90pd8f.R.iget(87033)==0&false)); ++i) {{
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87034);ArrayRealVectorTest.RealVectorTestImpl v =
                new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i));
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87035);final RealVector x = solver.solve(v);
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87036);final double error = x.subtract(xRef.getColumnVector(i)).getNorm();
            __CLR4_4_11v4g1v4glb90pd8f.R.inc(87037);Assert.assertEquals(0, error, 3.0e-16 * xRef.getColumnVector(i).getNorm());
        }

    }}finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    @Test
    public void testOverdetermined() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),87038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ssso21v5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testOverdetermined",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ssso21v5q(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87038);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87039);final Random r    = new Random(5559252868205245l);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87040);int          p    = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87041);int          q    = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87042);RealMatrix   a    = createTestMatrix(r, p, q);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87043);RealMatrix   xRef = createTestMatrix(r, q, BlockRealMatrix.BLOCK_SIZE + 3);

        // build a perturbed system: A.X + noise = B
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87044);RealMatrix b = a.multiply(xRef);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87045);final double noise = 0.001;
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87046);b.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor() {
            @Override
            public double visit(int row, int column, double value) {try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87047);
                __CLR4_4_11v4g1v4glb90pd8f.R.inc(87048);return value * (1.0 + noise * (2 * r.nextDouble() - 1));
            }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}
        });

        // despite perturbation, the least square solution should be pretty good
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87049);RealMatrix x = new QRDecomposition(a).getSolver().solve(b);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87050);Assert.assertEquals(0, x.subtract(xRef).getNorm(), 0.01 * noise * p * q);

    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    @Test
    public void testUnderdetermined() {__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceStart(getClass().getName(),87051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1te80n61v63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v4g1v4glb90pd8f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v4g1v4glb90pd8f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRSolverTest.testUnderdetermined",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1te80n61v63(){try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87051);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87052);final Random r    = new Random(42185006424567123l);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87053);int          p    = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87054);int          q    = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87055);RealMatrix   a    = createTestMatrix(r, p, q);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87056);RealMatrix   xRef = createTestMatrix(r, q, BlockRealMatrix.BLOCK_SIZE + 3);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87057);RealMatrix   b    = a.multiply(xRef);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87058);RealMatrix   x = new QRDecomposition(a).getSolver().solve(b);

        // too many equations, the system cannot be solved at all
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87059);Assert.assertTrue(x.subtract(xRef).getNorm() / (p * q) > 0.01);

        // the last unknown should have been set to 0
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87060);Assert.assertEquals(0.0, x.getSubMatrix(p, q - 1, 0, x.getColumnDimension() - 1).getNorm(), 0);
    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}

    private RealMatrix createTestMatrix(final Random r, final int rows, final int columns) {try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87061);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87062);RealMatrix m = MatrixUtils.createRealMatrix(rows, columns);
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87063);m.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor() {
                @Override
                    public double visit(int row, int column, double value) {try{__CLR4_4_11v4g1v4glb90pd8f.R.inc(87064);
                    __CLR4_4_11v4g1v4glb90pd8f.R.inc(87065);return 2.0 * r.nextDouble() - 1.0;
                }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}
            });
        __CLR4_4_11v4g1v4glb90pd8f.R.inc(87066);return m;
    }finally{__CLR4_4_11v4g1v4glb90pd8f.R.flushNeeded();}}
}
