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

public class RectangularCholeskyDecompositionTest {static class __CLR4_4_11wht1whtlb90pdc5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,88799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecomposition3x3() {__CLR4_4_11wht1whtlb90pdc5.R.globalSliceStart(getClass().getName(),88769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ud92w21wht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wht1whtlb90pdc5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wht1whtlb90pdc5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest.testDecomposition3x3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ud92w21wht(){try{__CLR4_4_11wht1whtlb90pdc5.R.inc(88769);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88770);RealMatrix m = MatrixUtils.createRealMatrix(new double[][] {
            { 1,   9,   9 },
            { 9, 225, 225 },
            { 9, 225, 625 }
        });

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88771);RectangularCholeskyDecomposition d =
                new RectangularCholeskyDecomposition(m, 1.0e-6);

        // as this decomposition permutes lines and columns, the root is NOT triangular
        // (in fact here it is the lower right part of the matrix which is zero and
        //  the upper left non-zero)
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88772);Assert.assertEquals(0.8,  d.getRootMatrix().getEntry(0, 2), 1.0e-15);
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88773);Assert.assertEquals(25.0, d.getRootMatrix().getEntry(2, 0), 1.0e-15);
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88774);Assert.assertEquals(0.0,  d.getRootMatrix().getEntry(2, 2), 1.0e-15);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88775);RealMatrix root = d.getRootMatrix();
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88776);RealMatrix rebuiltM = root.multiply(root.transpose());
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88777);Assert.assertEquals(0.0, m.subtract(rebuiltM).getNorm(), 1.0e-15);

    }finally{__CLR4_4_11wht1whtlb90pdc5.R.flushNeeded();}}

    @Test
    public void testFullRank() {__CLR4_4_11wht1whtlb90pdc5.R.globalSliceStart(getClass().getName(),88778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fhdn01wi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wht1whtlb90pdc5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wht1whtlb90pdc5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest.testFullRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fhdn01wi2(){try{__CLR4_4_11wht1whtlb90pdc5.R.inc(88778);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88779);RealMatrix base = MatrixUtils.createRealMatrix(new double[][] {
            { 0.1159548705,      0.,           0.,           0.      },
            { 0.0896442724, 0.1223540781,      0.,           0.      },
            { 0.0852155322, 4.558668e-3,  0.1083577299,      0.      },
            { 0.0905486674, 0.0213768077, 0.0128878333, 0.1014155693 }
        });

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88780);RealMatrix m = base.multiply(base.transpose());

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88781);RectangularCholeskyDecomposition d =
                new RectangularCholeskyDecomposition(m, 1.0e-10);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88782);RealMatrix root = d.getRootMatrix();
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88783);RealMatrix rebuiltM = root.multiply(root.transpose());
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88784);Assert.assertEquals(0.0, m.subtract(rebuiltM).getNorm(), 1.0e-15);

        // the pivoted Cholesky decomposition is *not* unique. Here, the root is
        // not equal to the original trianbular base matrix
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88785);Assert.assertTrue(root.subtract(base).getNorm() > 0.3);

    }finally{__CLR4_4_11wht1whtlb90pdc5.R.flushNeeded();}}

    @Test
    public void testMath789() {__CLR4_4_11wht1whtlb90pdc5.R.globalSliceStart(getClass().getName(),88786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ygbi851wia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wht1whtlb90pdc5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wht1whtlb90pdc5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest.testMath789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ygbi851wia(){try{__CLR4_4_11wht1whtlb90pdc5.R.inc(88786);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88787);final RealMatrix m1 = MatrixUtils.createRealMatrix(new double[][]{
            {0.013445532, 0.010394690, 0.009881156, 0.010499559},
            {0.010394690, 0.023006616, 0.008196856, 0.010732709},
            {0.009881156, 0.008196856, 0.019023866, 0.009210099},
            {0.010499559, 0.010732709, 0.009210099, 0.019107243}
        });
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88788);composeAndTest(m1, 4);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88789);final RealMatrix m2 = MatrixUtils.createRealMatrix(new double[][]{
            {0.0, 0.0, 0.0, 0.0, 0.0},
            {0.0, 0.013445532, 0.010394690, 0.009881156, 0.010499559},
            {0.0, 0.010394690, 0.023006616, 0.008196856, 0.010732709},
            {0.0, 0.009881156, 0.008196856, 0.019023866, 0.009210099},
            {0.0, 0.010499559, 0.010732709, 0.009210099, 0.019107243}
        });
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88790);composeAndTest(m2, 4);

        __CLR4_4_11wht1whtlb90pdc5.R.inc(88791);final RealMatrix m3 = MatrixUtils.createRealMatrix(new double[][]{
            {0.013445532, 0.010394690, 0.0, 0.009881156, 0.010499559},
            {0.010394690, 0.023006616, 0.0, 0.008196856, 0.010732709},
            {0.0, 0.0, 0.0, 0.0, 0.0},
            {0.009881156, 0.008196856, 0.0, 0.019023866, 0.009210099},
            {0.010499559, 0.010732709, 0.0, 0.009210099, 0.019107243}
        });
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88792);composeAndTest(m3, 4);

    }finally{__CLR4_4_11wht1whtlb90pdc5.R.flushNeeded();}}
    
    private void composeAndTest(RealMatrix m, int expectedRank) {try{__CLR4_4_11wht1whtlb90pdc5.R.inc(88793);
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88794);RectangularCholeskyDecomposition r = new RectangularCholeskyDecomposition(m);
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88795);Assert.assertEquals(expectedRank, r.getRank());
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88796);RealMatrix root = r.getRootMatrix();
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88797);RealMatrix rebuiltMatrix = root.multiply(root.transpose());
        __CLR4_4_11wht1whtlb90pdc5.R.inc(88798);Assert.assertEquals(0.0, m.subtract(rebuiltMatrix).getNorm(), 1.0e-16);
    }finally{__CLR4_4_11wht1whtlb90pdc5.R.flushNeeded();}}

}
