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

import org.junit.Assert;
import org.junit.Test;

public class SingularValueSolverTest {static class __CLR4_4_11wpe1wpelb90pdcv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testSquare = {
            { 24.0 / 25.0, 43.0 / 25.0 },
            { 57.0 / 25.0, 24.0 / 25.0 }
    };

    private static final double normTolerance = 10e-14;

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceStart(getClass().getName(),89042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1wpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wpe1wpelb90pdcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueSolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1wpe(){try{__CLR4_4_11wpe1wpelb90pdcv.R.inc(89042);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89043);DecompositionSolver solver =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare)).getSolver();
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89044);RealMatrix b = MatrixUtils.createRealMatrix(new double[3][2]);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89045);try {
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89046);solver.solve(b);
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89047);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89048);try {
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89049);solver.solve(b.getColumnVector(0));
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89050);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89051);try {
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89052);solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89053);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11wpe1wpelb90pdcv.R.flushNeeded();}}

    /** test least square solve */
    @Test
    public void testLeastSquareSolve() {__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceStart(getClass().getName(),89054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19abazy1wpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wpe1wpelb90pdcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueSolverTest.testLeastSquareSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19abazy1wpq(){try{__CLR4_4_11wpe1wpelb90pdcv.R.inc(89054);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89055);RealMatrix m =
            MatrixUtils.createRealMatrix(new double[][] {
                                   { 1.0, 0.0 },
                                   { 0.0, 0.0 }
                               });
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89056);DecompositionSolver solver = new SingularValueDecomposition(m).getSolver();
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89057);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
            { 11, 12 }, { 21, 22 }
        });
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89058);RealMatrix xMatrix = solver.solve(b);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89059);Assert.assertEquals(11, xMatrix.getEntry(0, 0), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89060);Assert.assertEquals(12, xMatrix.getEntry(0, 1), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89061);Assert.assertEquals(0, xMatrix.getEntry(1, 0), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89062);Assert.assertEquals(0, xMatrix.getEntry(1, 1), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89063);RealVector xColVec = solver.solve(b.getColumnVector(0));
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89064);Assert.assertEquals(11, xColVec.getEntry(0), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89065);Assert.assertEquals(0, xColVec.getEntry(1), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89066);RealVector xColOtherVec = solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89067);Assert.assertEquals(11, xColOtherVec.getEntry(0), 1.0e-15);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89068);Assert.assertEquals(0, xColOtherVec.getEntry(1), 1.0e-15);
    }finally{__CLR4_4_11wpe1wpelb90pdcv.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceStart(getClass().getName(),89069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1wq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wpe1wpelb90pdcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueSolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1wq5(){try{__CLR4_4_11wpe1wpelb90pdcv.R.inc(89069);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89070);DecompositionSolver solver =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare)).getSolver();
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89071);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
                { 1, 2, 3 }, { 0, -5, 1 }
        });
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89072);RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] {
                { -8.0 / 25.0, -263.0 / 75.0, -29.0 / 75.0 },
                { 19.0 / 25.0,   78.0 / 25.0,  49.0 / 25.0 }
        });

        // using RealMatrix
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89073);Assert.assertEquals(0, solver.solve(b).subtract(xRef).getNorm(), normTolerance);

        // using ArrayRealVector
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89074);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11wpe1wpelb90pdcv.R.iget(89075)!=0|true))||(__CLR4_4_11wpe1wpelb90pdcv.R.iget(89076)==0&false)); ++i) {{
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89077);Assert.assertEquals(0,
                         solver.solve(b.getColumnVector(i)).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }

        // using RealVector with an alternate implementation
        }__CLR4_4_11wpe1wpelb90pdcv.R.inc(89078);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11wpe1wpelb90pdcv.R.iget(89079)!=0|true))||(__CLR4_4_11wpe1wpelb90pdcv.R.iget(89080)==0&false)); ++i) {{
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89081);ArrayRealVectorTest.RealVectorTestImpl v =
                new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i));
            __CLR4_4_11wpe1wpelb90pdcv.R.inc(89082);Assert.assertEquals(0,
                         solver.solve(v).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }

    }}finally{__CLR4_4_11wpe1wpelb90pdcv.R.flushNeeded();}}

    /** test condition number */
    @Test
    public void testConditionNumber() {__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceStart(getClass().getName(),89083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xprhyf1wqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wpe1wpelb90pdcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueSolverTest.testConditionNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xprhyf1wqj(){try{__CLR4_4_11wpe1wpelb90pdcv.R.inc(89083);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89084);SingularValueDecomposition svd =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare));
        // replace 1.0e-15 with 1.5e-15
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89085);Assert.assertEquals(3.0, svd.getConditionNumber(), 1.5e-15);
    }finally{__CLR4_4_11wpe1wpelb90pdcv.R.flushNeeded();}}

    @Test
    public void testMath320B() {__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceStart(getClass().getName(),89086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymgvxq1wqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wpe1wpelb90pdcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wpe1wpelb90pdcv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueSolverTest.testMath320B",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymgvxq1wqm(){try{__CLR4_4_11wpe1wpelb90pdcv.R.inc(89086);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89087);RealMatrix rm = new Array2DRowRealMatrix(new double[][] {
            { 1.0, 2.0 }, { 1.0, 2.0 }
        });
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89088);SingularValueDecomposition svd =
            new SingularValueDecomposition(rm);
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89089);RealMatrix recomposed = svd.getU().multiply(svd.getS()).multiply(svd.getVT());
        __CLR4_4_11wpe1wpelb90pdcv.R.inc(89090);Assert.assertEquals(0.0, recomposed.subtract(rm).getNorm(), 2.0e-15);
    }finally{__CLR4_4_11wpe1wpelb90pdcv.R.flushNeeded();}}

}
