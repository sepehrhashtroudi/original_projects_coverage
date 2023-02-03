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

public class EigenSolverTest {static class __CLR4_4_11ttp1ttplb90pd53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,85355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** test non invertible matrix */
    @Test
    public void testNonInvertible() {__CLR4_4_11ttp1ttplb90pd53.R.globalSliceStart(getClass().getName(),85309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye1ttp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ttp1ttplb90pd53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ttp1ttplb90pd53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenSolverTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye1ttp(){try{__CLR4_4_11ttp1ttplb90pd53.R.inc(85309);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85310);Random r = new Random(9994100315209l);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85311);RealMatrix m =
            EigenDecompositionTest.createTestMatrix(r, new double[] { 1.0, 0.0, -1.0, -2.0, -3.0 });
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85312);DecompositionSolver es = new EigenDecomposition(m).getSolver();
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85313);Assert.assertFalse(es.isNonSingular());
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85314);try {
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85315);es.getInverse();
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85316);Assert.fail("an exception should have been thrown");
        } catch (SingularMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11ttp1ttplb90pd53.R.flushNeeded();}}

    /** test invertible matrix */
    @Test
    public void testInvertible() {__CLR4_4_11ttp1ttplb90pd53.R.globalSliceStart(getClass().getName(),85317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2bja91ttx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ttp1ttplb90pd53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ttp1ttplb90pd53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenSolverTest.testInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2bja91ttx(){try{__CLR4_4_11ttp1ttplb90pd53.R.inc(85317);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85318);Random r = new Random(9994100315209l);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85319);RealMatrix m =
            EigenDecompositionTest.createTestMatrix(r, new double[] { 1.0, 0.5, -1.0, -2.0, -3.0 });
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85320);DecompositionSolver es = new EigenDecomposition(m).getSolver();
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85321);Assert.assertTrue(es.isNonSingular());
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85322);RealMatrix inverse = es.getInverse();
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85323);RealMatrix error =
            m.multiply(inverse).subtract(MatrixUtils.createRealIdentityMatrix(m.getRowDimension()));
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85324);Assert.assertEquals(0, error.getNorm(), 4.0e-15);
    }finally{__CLR4_4_11ttp1ttplb90pd53.R.flushNeeded();}}

    /** test solve dimension errors */
    @Test
    public void testSolveDimensionErrors() {__CLR4_4_11ttp1ttplb90pd53.R.globalSliceStart(getClass().getName(),85325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1koni5n1tu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ttp1ttplb90pd53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ttp1ttplb90pd53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenSolverTest.testSolveDimensionErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1koni5n1tu5(){try{__CLR4_4_11ttp1ttplb90pd53.R.inc(85325);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85326);final double[] refValues = new double[] {
            2.003, 2.002, 2.001, 1.001, 1.000, 0.001
        };
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85327);final RealMatrix matrix = EigenDecompositionTest.createTestMatrix(new Random(35992629946426l), refValues);

        __CLR4_4_11ttp1ttplb90pd53.R.inc(85328);DecompositionSolver es = new EigenDecomposition(matrix).getSolver();
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85329);RealMatrix b = MatrixUtils.createRealMatrix(new double[2][2]);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85330);try {
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85331);es.solve(b);
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85332);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85333);try {
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85334);es.solve(b.getColumnVector(0));
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85335);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85336);try {
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85337);es.solve(new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(0)));
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85338);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException iae) {
            // expected behavior
        }
    }finally{__CLR4_4_11ttp1ttplb90pd53.R.flushNeeded();}}

    /** test solve */
    @Test
    public void testSolve() {__CLR4_4_11ttp1ttplb90pd53.R.globalSliceStart(getClass().getName(),85339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiwkms1tuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ttp1ttplb90pd53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ttp1ttplb90pd53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenSolverTest.testSolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiwkms1tuj(){try{__CLR4_4_11ttp1ttplb90pd53.R.inc(85339);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85340);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
                { 91,  5, 29, 32, 40, 14 },
                {  5, 34, -1,  0,  2, -1 },
                { 29, -1, 12,  9, 21,  8 },
                { 32,  0,  9, 14,  9,  0 },
                { 40,  2, 21,  9, 51, 19 },
                { 14, -1,  8,  0, 19, 14 }
        });
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85341);DecompositionSolver es = new EigenDecomposition(m).getSolver();
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85342);RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
                { 1561, 269, 188 },
                {   69, -21,  70 },
                {  739, 108,  63 },
                {  324,  86,  59 },
                { 1624, 194, 107 },
                {  796,  69,  36 }
        });
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85343);RealMatrix xRef = MatrixUtils.createRealMatrix(new double[][] {
                { 1,   2, 1 },
                { 2,  -1, 2 },
                { 4,   2, 3 },
                { 8,  -1, 0 },
                { 16,  2, 0 },
                { 32, -1, 0 }
        });

        // using RealMatrix
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85344);RealMatrix solution=es.solve(b);
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85345);Assert.assertEquals(0, solution.subtract(xRef).getNorm(), 2.5e-12);

        // using RealVector
        __CLR4_4_11ttp1ttplb90pd53.R.inc(85346);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11ttp1ttplb90pd53.R.iget(85347)!=0|true))||(__CLR4_4_11ttp1ttplb90pd53.R.iget(85348)==0&false)); ++i) {{
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85349);Assert.assertEquals(0,
                         es.solve(b.getColumnVector(i)).subtract(xRef.getColumnVector(i)).getNorm(),
                         2.0e-11);
        }

        // using RealVector with an alternate implementation
        }__CLR4_4_11ttp1ttplb90pd53.R.inc(85350);for (int i = 0; (((i < b.getColumnDimension())&&(__CLR4_4_11ttp1ttplb90pd53.R.iget(85351)!=0|true))||(__CLR4_4_11ttp1ttplb90pd53.R.iget(85352)==0&false)); ++i) {{
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85353);ArrayRealVectorTest.RealVectorTestImpl v =
                new ArrayRealVectorTest.RealVectorTestImpl(b.getColumn(i));
            __CLR4_4_11ttp1ttplb90pd53.R.inc(85354);Assert.assertEquals(0,
                         es.solve(v).subtract(xRef.getColumnVector(i)).getNorm(),
                         2.0e-11);
        }
    }}finally{__CLR4_4_11ttp1ttplb90pd53.R.flushNeeded();}}
}
