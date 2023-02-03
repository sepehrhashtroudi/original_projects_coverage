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

import org.apache.commons.math3.linear.BiDiagonalTransformer;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class BiDiagonalTransformerTest {static class __CLR4_4_11rlm1rlmlb90pd0j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,82523,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testSquare = {
            { 24.0 / 25.0, 43.0 / 25.0 },
            { 57.0 / 25.0, 24.0 / 25.0 }
    };

    private double[][] testNonSquare = {
        {  -540.0 / 625.0,  963.0 / 625.0, -216.0 / 625.0 },
        { -1730.0 / 625.0, -744.0 / 625.0, 1008.0 / 625.0 },
        {  -720.0 / 625.0, 1284.0 / 625.0, -288.0 / 625.0 },
        {  -360.0 / 625.0,  192.0 / 625.0, 1756.0 / 625.0 },
    };

    @Test
    public void testDimensions() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21rlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21rlm(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82426);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82427);checkdimensions(MatrixUtils.createRealMatrix(testSquare));
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82428);checkdimensions(MatrixUtils.createRealMatrix(testNonSquare));
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82429);checkdimensions(MatrixUtils.createRealMatrix(testNonSquare).transpose());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    private void checkdimensions(RealMatrix matrix) {try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82430);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82431);final int m = matrix.getRowDimension();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82432);final int n = matrix.getColumnDimension();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82433);BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82434);Assert.assertEquals(m, transformer.getU().getRowDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82435);Assert.assertEquals(m, transformer.getU().getColumnDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82436);Assert.assertEquals(m, transformer.getB().getRowDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82437);Assert.assertEquals(n, transformer.getB().getColumnDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82438);Assert.assertEquals(n, transformer.getV().getRowDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82439);Assert.assertEquals(n, transformer.getV().getColumnDimension());

    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testAEqualUSVt() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hi92js1rm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testAEqualUSVt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hi92js1rm0(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82440);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82441);checkAEqualUSVt(MatrixUtils.createRealMatrix(testSquare));
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82442);checkAEqualUSVt(MatrixUtils.createRealMatrix(testNonSquare));
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82443);checkAEqualUSVt(MatrixUtils.createRealMatrix(testNonSquare).transpose());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    private void checkAEqualUSVt(RealMatrix matrix) {try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82444);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82445);BiDiagonalTransformer transformer = new BiDiagonalTransformer(matrix);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82446);RealMatrix u = transformer.getU();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82447);RealMatrix b = transformer.getB();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82448);RealMatrix v = transformer.getV();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82449);double norm = u.multiply(b).multiply(v.transpose()).subtract(matrix).getNorm();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82450);Assert.assertEquals(0, norm, 1.0e-14);
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testUOrthogonal() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8ncmb1rmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testUOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8ncmb1rmb(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82451);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82452);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare)).getU());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82453);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare)).getU());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82454);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare).transpose()).getU());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testVOrthogonal() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w126kc1rmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testVOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w126kc1rmf(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82455);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82456);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare)).getV());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82457);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare)).getV());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82458);checkOrthogonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare).transpose()).getV());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    private void checkOrthogonal(RealMatrix m) {try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82459);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82460);RealMatrix mTm = m.transpose().multiply(m);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82461);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(mTm.getRowDimension());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82462);Assert.assertEquals(0, mTm.subtract(id).getNorm(), 1.0e-14);
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testBBiDiagonal() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b681o31rmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testBBiDiagonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b681o31rmn(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82463);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82464);checkBiDiagonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare)).getB());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82465);checkBiDiagonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare)).getB());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82466);checkBiDiagonal(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare).transpose()).getB());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    private void checkBiDiagonal(RealMatrix m) {try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82467);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82468);final int rows = m.getRowDimension();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82469);final int cols = m.getColumnDimension();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82470);for (int i = 0; (((i < rows)&&(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82471)!=0|true))||(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82472)==0&false)); ++i) {{
            __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82473);for (int j = 0; (((j < cols)&&(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82474)!=0|true))||(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82475)==0&false)); ++j) {{
                __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82476);if ((((rows < cols)&&(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82477)!=0|true))||(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82478)==0&false))) {{
                    __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82479);if (((((i < j) || (i > j + 1))&&(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82480)!=0|true))||(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82481)==0&false))) {{
                        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82482);Assert.assertEquals(0, m.getEntry(i, j), 1.0e-16);
                    }
                }} }else {{
                    __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82483);if (((((i < j - 1) || (i > j))&&(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82484)!=0|true))||(__CLR4_4_11rlm1rlmlb90pd0j.R.iget(82485)==0&false))) {{
                        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82486);Assert.assertEquals(0, m.getEntry(i, j), 1.0e-16);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testSingularMatrix() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0mub51rnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testSingularMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0mub51rnb(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82487);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82488);BiDiagonalTransformer transformer =
            new BiDiagonalTransformer(MatrixUtils.createRealMatrix(new double[][] {
                { 1.0, 2.0, 3.0 },
                { 2.0, 3.0, 4.0 },
                { 3.0, 5.0, 7.0 }
            }));
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82489);final double s3  = FastMath.sqrt(3.0);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82490);final double s14 = FastMath.sqrt(14.0);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82491);final double s1553 = FastMath.sqrt(1553.0);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82492);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
           {  -1.0 / s14,  5.0 / (s3 * s14),  1.0 / s3 },
           {  -2.0 / s14, -4.0 / (s3 * s14),  1.0 / s3 },
           {  -3.0 / s14,  1.0 / (s3 * s14), -1.0 / s3 }
       });
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82493);RealMatrix bRef = MatrixUtils.createRealMatrix(new double[][] {
           { -s14, s1553 / s14,   0.0 },
           {  0.0, -87 * s3 / (s14 * s1553), -s3 * s14 / s1553 },
           {  0.0, 0.0, 0.0 }
       });
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82494);RealMatrix vRef = MatrixUtils.createRealMatrix(new double[][] {
           { 1.0,   0.0,         0.0        },
           { 0.0,  -23 / s1553,  32 / s1553 },
           { 0.0,  -32 / s1553, -23 / s1553 }
       });

       // check values against known references
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82495);RealMatrix u = transformer.getU();
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82496);Assert.assertEquals(0, u.subtract(uRef).getNorm(), 1.0e-14);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82497);RealMatrix b = transformer.getB();
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82498);Assert.assertEquals(0, b.subtract(bRef).getNorm(), 1.0e-14);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82499);RealMatrix v = transformer.getV();
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82500);Assert.assertEquals(0, v.subtract(vRef).getNorm(), 1.0e-14);

       // check the same cached instance is returned the second time
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82501);Assert.assertTrue(u == transformer.getU());
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82502);Assert.assertTrue(b == transformer.getB());
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82503);Assert.assertTrue(v == transformer.getV());

    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testMatricesValues() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5n6ej1rns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testMatricesValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5n6ej1rns(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82504);
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82505);BiDiagonalTransformer transformer =
            new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare));
       __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82506);final double s17 = FastMath.sqrt(17.0);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82507);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
                {  -8 / (5 * s17), 19 / (5 * s17) },
                { -19 / (5 * s17), -8 / (5 * s17) }
        });
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82508);RealMatrix bRef = MatrixUtils.createRealMatrix(new double[][] {
                { -3 * s17 / 5, 32 * s17 / 85 },
                {      0.0,     -5 * s17 / 17 }
        });
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82509);RealMatrix vRef = MatrixUtils.createRealMatrix(new double[][] {
                { 1.0,  0.0 },
                { 0.0, -1.0 }
        });

        // check values against known references
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82510);RealMatrix u = transformer.getU();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82511);Assert.assertEquals(0, u.subtract(uRef).getNorm(), 1.0e-14);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82512);RealMatrix b = transformer.getB();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82513);Assert.assertEquals(0, b.subtract(bRef).getNorm(), 1.0e-14);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82514);RealMatrix v = transformer.getV();
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82515);Assert.assertEquals(0, v.subtract(vRef).getNorm(), 1.0e-14);

        // check the same cached instance is returned the second time
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82516);Assert.assertTrue(u == transformer.getU());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82517);Assert.assertTrue(b == transformer.getB());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82518);Assert.assertTrue(v == transformer.getV());

    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

    @Test
    public void testUpperOrLower() {__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceStart(getClass().getName(),82519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3zfh11ro7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11rlm1rlmlb90pd0j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11rlm1rlmlb90pd0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.BiDiagonalTransformerTest.testUpperOrLower",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3zfh11ro7(){try{__CLR4_4_11rlm1rlmlb90pd0j.R.inc(82519);
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82520);Assert.assertTrue(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare)).isUpperBiDiagonal());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82521);Assert.assertTrue(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare)).isUpperBiDiagonal());
        __CLR4_4_11rlm1rlmlb90pd0j.R.inc(82522);Assert.assertFalse(new BiDiagonalTransformer(MatrixUtils.createRealMatrix(testNonSquare).transpose()).isUpperBiDiagonal());
    }finally{__CLR4_4_11rlm1rlmlb90pd0j.R.flushNeeded();}}

}
