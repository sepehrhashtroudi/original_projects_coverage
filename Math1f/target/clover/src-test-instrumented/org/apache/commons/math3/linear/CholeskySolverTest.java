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


public class CholeskySolverTest {static class __CLR4_4_11t0h1t0hlb90pd3c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,84287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testData = new double[][] {
            {  1,  2,   4,   7,  11 },
            {  2, 13,  23,  38,  58 },
            {  4, 23,  77, 122, 182 },
            {  7, 38, 122, 294, 430 },
            { 11, 58, 182, 430, 855 }
    };

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceStart(getClass().getName(),84257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1t0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t0h1t0hlb90pd3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskySolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1t0h(){try{__CLR4_4_11t0h1t0hlb90pd3c.R.inc(84257);
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84258);DecompositionSolver solver =
            new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver();
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84259);RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]);
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84260);try {
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84261);solver.solve(b);
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84262);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84263);try {
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84264);solver.solve(b.getColumnVector(0));
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84265);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84266);try {
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84267);solver.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84268);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11t0h1t0hlb90pd3c.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceStart(getClass().getName(),84269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1t0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t0h1t0hlb90pd3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskySolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1t0t(){try{__CLR4_4_11t0h1t0hlb90pd3c.R.inc(84269);
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84270);DecompositionSolver solver =
            new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData)).getSolver();
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84271);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
                {   78,  -13,    1 },
                {  414,  -62,   -1 },
                { 1312, -202,  -37 },
                { 2989, -542,  145 },
                { 5510, -1465, 201 }
        });
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84272);RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] {
                { 1,  0,  1 },
                { 0,  1,  1 },
                { 2,  1, -4 },
                { 2,  2,  2 },
                { 5, -3,  0 }
        });

        // using RealMatrix
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84273);Assert.assertEquals(0, solver.solve(b).subtract(xRef).getNorm(), 1.0e-13);

        // using ArrayRealVector
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84274);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11t0h1t0hlb90pd3c.R.iget(84275)!=0|true))||(__CLR4_4_11t0h1t0hlb90pd3c.R.iget(84276)==0&false)); ++i) {{
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84277);Assert.assertEquals(0,
                         solver.solve(b.getColumnVector(i)).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }

        // using RealVector with an alternate implementation
        }__CLR4_4_11t0h1t0hlb90pd3c.R.inc(84278);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11t0h1t0hlb90pd3c.R.iget(84279)!=0|true))||(__CLR4_4_11t0h1t0hlb90pd3c.R.iget(84280)==0&false)); ++i) {{
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84281);ArrayRealVectorTest.RealVectorTestImpl v =
                new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i));
            __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84282);Assert.assertEquals(0,
                         solver.solve(v).subtract(xRef.getColumnVector(i)).getNorm(),
                         1.0e-13);
        }

    }}finally{__CLR4_4_11t0h1t0hlb90pd3c.R.flushNeeded();}}

    /** test determinant */
    @Test
    public void testDeterminant() {__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceStart(getClass().getName(),84283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0n2ye1t17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t0h1t0hlb90pd3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t0h1t0hlb90pd3c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskySolverTest.testDeterminant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0n2ye1t17(){try{__CLR4_4_11t0h1t0hlb90pd3c.R.inc(84283);
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84284);Assert.assertEquals(7290000.0, getDeterminant(MatrixUtils.createRealMatrix(testData)), 1.0e-15);
    }finally{__CLR4_4_11t0h1t0hlb90pd3c.R.flushNeeded();}}

    private double getDeterminant(RealMatrix m) {try{__CLR4_4_11t0h1t0hlb90pd3c.R.inc(84285);
        __CLR4_4_11t0h1t0hlb90pd3c.R.inc(84286);return new CholeskyDecomposition(m).getDeterminant();
    }finally{__CLR4_4_11t0h1t0hlb90pd3c.R.flushNeeded();}}

}
