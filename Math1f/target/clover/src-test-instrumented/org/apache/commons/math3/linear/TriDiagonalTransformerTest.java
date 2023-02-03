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

import org.apache.commons.math3.util.FastMath;

import org.junit.Test;
import org.junit.Assert;

public class TriDiagonalTransformerTest {static class __CLR4_4_11xpq1xpqlb90pdf8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testSquare5 = {
            { 1, 2, 3, 1, 1 },
            { 2, 1, 1, 3, 1 },
            { 3, 1, 1, 1, 2 },
            { 1, 3, 1, 2, 1 },
            { 1, 1, 2, 1, 3 }
    };

    private double[][] testSquare3 = {
            { 1, 3, 4 },
            { 3, 2, 2 },
            { 4, 2, 0 }
    };

    @Test
    public void testNonSquare() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1xpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1xpq(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90350);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90351);try {
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90352);new TriDiagonalTransformer(MatrixUtils.createRealMatrix(new double[3][2]));
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90353);Assert.fail("an exception should have been thrown");
        } catch (NonSquareMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testAEqualQTQt() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akelwu1xpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testAEqualQTQt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akelwu1xpu(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90354);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90355);checkAEqualQTQt(MatrixUtils.createRealMatrix(testSquare5));
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90356);checkAEqualQTQt(MatrixUtils.createRealMatrix(testSquare3));
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    private void checkAEqualQTQt(RealMatrix matrix) {try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90357);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90358);TriDiagonalTransformer transformer = new TriDiagonalTransformer(matrix);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90359);RealMatrix q  = transformer.getQ();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90360);RealMatrix qT = transformer.getQT();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90361);RealMatrix t  = transformer.getT();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90362);double norm = q.multiply(t).multiply(qT).subtract(matrix).getNorm();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90363);Assert.assertEquals(0, norm, 4.0e-15);
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testNoAccessBelowDiagonal() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qez0ty1xq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testNoAccessBelowDiagonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qez0ty1xq4(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90364);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90365);checkNoAccessBelowDiagonal(testSquare5);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90366);checkNoAccessBelowDiagonal(testSquare3);
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    private void checkNoAccessBelowDiagonal(double[][] data) {try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90367);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90368);double[][] modifiedData = new double[data.length][];
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90369);for (int i = 0; (((i < data.length)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90370)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90371)==0&false)); ++i) {{
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90372);modifiedData[i] = data[i].clone();
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90373);Arrays.fill(modifiedData[i], 0, i, Double.NaN);
        }
        }__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90374);RealMatrix matrix = MatrixUtils.createRealMatrix(modifiedData);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90375);TriDiagonalTransformer transformer = new TriDiagonalTransformer(matrix);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90376);RealMatrix q  = transformer.getQ();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90377);RealMatrix qT = transformer.getQT();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90378);RealMatrix t  = transformer.getT();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90379);double norm = q.multiply(t).multiply(qT).subtract(MatrixUtils.createRealMatrix(data)).getNorm();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90380);Assert.assertEquals(0, norm, 4.0e-15);
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testQOrthogonal() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15719gf1xql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testQOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15719gf1xql(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90381);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90382);checkOrthogonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare5)).getQ());
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90383);checkOrthogonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare3)).getQ());
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testQTOrthogonal() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q01s7p1xqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testQTOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q01s7p1xqo(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90384);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90385);checkOrthogonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare5)).getQT());
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90386);checkOrthogonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare3)).getQT());
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    private void checkOrthogonal(RealMatrix m) {try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90387);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90388);RealMatrix mTm = m.transpose().multiply(m);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90389);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(mTm.getRowDimension());
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90390);Assert.assertEquals(0, mTm.subtract(id).getNorm(), 1.0e-15);
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testTTriDiagonal() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxu2at1xqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testTTriDiagonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxu2at1xqv(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90391);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90392);checkTriDiagonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare5)).getT());
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90393);checkTriDiagonal(new TriDiagonalTransformer(MatrixUtils.createRealMatrix(testSquare3)).getT());
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    private void checkTriDiagonal(RealMatrix m) {try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90394);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90395);final int rows = m.getRowDimension();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90396);final int cols = m.getColumnDimension();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90397);for (int i = 0; (((i < rows)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90398)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90399)==0&false)); ++i) {{
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90400);for (int j = 0; (((j < cols)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90401)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90402)==0&false)); ++j) {{
                __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90403);if (((((i < j - 1) || (i > j + 1))&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90404)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90405)==0&false))) {{
                    __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90406);Assert.assertEquals(0, m.getEntry(i, j), 1.0e-16);
                }
            }}
        }}
    }}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testMatricesValues5() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsxudq1xrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testMatricesValues5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsxudq1xrb(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90407);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90408);checkMatricesValues(testSquare5,
                            new double[][] {
                                { 1.0,  0.0,                 0.0,                  0.0,                   0.0 },
                                { 0.0, -0.5163977794943222,  0.016748280772542083, 0.839800693771262,     0.16669620021405473 },
                                { 0.0, -0.7745966692414833, -0.4354553000860955,  -0.44989322880603355,  -0.08930153582895772 },
                                { 0.0, -0.2581988897471611,  0.6364346693566014,  -0.30263204032131164,   0.6608313651342882 },
                                { 0.0, -0.2581988897471611,  0.6364346693566009,  -0.027289660803112598, -0.7263191580755246 }
                            },
                            new double[] { 1, 4.4, 1.433099579242636, -0.89537362758743, 2.062274048344794 },
                            new double[] { -FastMath.sqrt(15), -3.0832882879592476, 0.6082710842351517, 1.1786086405912128 });
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    @Test
    public void testMatricesValues3() {__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceStart(getClass().getName(),90409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1faxwss1xrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xpq1xpqlb90pdf8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xpq1xpqlb90pdf8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.TriDiagonalTransformerTest.testMatricesValues3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1faxwss1xrd(){try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90409);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90410);checkMatricesValues(testSquare3,
                            new double[][] {
                                {  1.0,  0.0,  0.0 },
                                {  0.0, -0.6,  0.8 },
                                {  0.0, -0.8, -0.6 },
                            },
                            new double[] { 1, 2.64, -0.64 },
                            new double[] { -5, -1.52 });
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}

    private void checkMatricesValues(double[][] matrix, double[][] qRef,
                                     double[] mainDiagnonal,
                                     double[] secondaryDiagonal) {try{__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90411);
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90412);TriDiagonalTransformer transformer =
            new TriDiagonalTransformer(MatrixUtils.createRealMatrix(matrix));

        // check values against known references
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90413);RealMatrix q = transformer.getQ();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90414);Assert.assertEquals(0, q.subtract(MatrixUtils.createRealMatrix(qRef)).getNorm(), 1.0e-14);

        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90415);RealMatrix t = transformer.getT();
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90416);double[][] tData = new double[mainDiagnonal.length][mainDiagnonal.length];
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90417);for (int i = 0; (((i < mainDiagnonal.length)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90418)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90419)==0&false)); ++i) {{
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90420);tData[i][i] = mainDiagnonal[i];
            __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90421);if ((((i > 0)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90422)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90423)==0&false))) {{
                __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90424);tData[i][i - 1] = secondaryDiagonal[i - 1];
            }
            }__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90425);if ((((i < secondaryDiagonal.length)&&(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90426)!=0|true))||(__CLR4_4_11xpq1xpqlb90pdf8.R.iget(90427)==0&false))) {{
                __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90428);tData[i][i + 1] = secondaryDiagonal[i];
            }
        }}
        }__CLR4_4_11xpq1xpqlb90pdf8.R.inc(90429);Assert.assertEquals(0, t.subtract(MatrixUtils.createRealMatrix(tData)).getNorm(), 1.0e-14);

        // check the same cached instance is returned the second time
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90430);Assert.assertTrue(q == transformer.getQ());
        __CLR4_4_11xpq1xpqlb90pdf8.R.inc(90431);Assert.assertTrue(t == transformer.getT());
    }finally{__CLR4_4_11xpq1xpqlb90pdf8.R.flushNeeded();}}
}
