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

import org.junit.Assert;
import org.junit.Test;


public class RRQRDecompositionTest {static class __CLR4_4_11v6j1v6jlb90pd8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,87173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[][] testData3x3NonSingular = {
            { 12, -51, 4 },
            { 6, 167, -68 },
            { -4, 24, -41 }, };

    private double[][] testData3x3Singular = {
            { 1, 4, 7, },
            { 2, 5, 8, },
            { 3, 6, 9, }, };

    private double[][] testData3x4 = {
            { 12, -51, 4, 1 },
            { 6, 167, -68, 2 },
            { -4, 24, -41, 3 }, };

    private double[][] testData4x3 = {
            { 12, -51, 4, },
            { 6, 167, -68, },
            { -4, 24, -41, },
            { -5, 34, 7, }, };

    private static final double entryTolerance = 10e-16;

    private static final double normTolerance = 10e-14;

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21v6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21v6j(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87067);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87068);checkDimension(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87069);checkDimension(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87070);checkDimension(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87071);Random r = new Random(643895747384642l);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87072);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87073);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87074);checkDimension(createTestMatrix(r, p, q));
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87075);checkDimension(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private void checkDimension(RealMatrix m) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87076);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87077);int rows = m.getRowDimension();
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87078);int columns = m.getColumnDimension();
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87079);RRQRDecomposition qr = new RRQRDecomposition(m);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87080);Assert.assertEquals(rows,    qr.getQ().getRowDimension());
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87081);Assert.assertEquals(rows,    qr.getQ().getColumnDimension());
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87082);Assert.assertEquals(rows,    qr.getR().getRowDimension());
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87083);Assert.assertEquals(columns, qr.getR().getColumnDimension());
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    /** test AP = QR */
    @Test
    public void testAPEqualQR() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1giojvf1v70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testAPEqualQR",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1giojvf1v70(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87084);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87085);checkAPEqualQR(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87086);checkAPEqualQR(MatrixUtils.createRealMatrix(testData3x3Singular));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87087);checkAPEqualQR(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87088);checkAPEqualQR(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87089);Random r = new Random(643895747384642l);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87090);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87091);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87092);checkAPEqualQR(createTestMatrix(r, p, q));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87093);checkAPEqualQR(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private void checkAPEqualQR(RealMatrix m) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87094);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87095);RRQRDecomposition rrqr = new RRQRDecomposition(m);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87096);double norm = rrqr.getQ().multiply(rrqr.getR()).subtract(m.multiply(rrqr.getP())).getNorm();
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87097);Assert.assertEquals(0, norm, normTolerance);
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    /** test the orthogonality of Q */
    @Test
    public void testQOrthogonal() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15719gf1v7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testQOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15719gf1v7e(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87098);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87099);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87100);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x3Singular));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87101);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87102);checkQOrthogonal(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87103);Random r = new Random(643895747384642l);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87104);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87105);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87106);checkQOrthogonal(createTestMatrix(r, p, q));

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87107);checkQOrthogonal(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private void checkQOrthogonal(RealMatrix m) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87108);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87109);RRQRDecomposition qr = new RRQRDecomposition(m);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87110);RealMatrix eye = MatrixUtils.createRealIdentityMatrix(m.getRowDimension());
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87111);double norm = qr.getQT().multiply(qr.getQ()).subtract(eye).getNorm();
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87112);Assert.assertEquals(0, norm, normTolerance);
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    /** test that R is upper triangular */
    @Test
    public void testRUpperTriangular() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165g8gw1v7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testRUpperTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165g8gw1v7t(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87113);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87114);RealMatrix matrix = MatrixUtils.createRealMatrix(testData3x3NonSingular);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87115);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87116);matrix = MatrixUtils.createRealMatrix(testData3x3Singular);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87117);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87118);matrix = MatrixUtils.createRealMatrix(testData3x4);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87119);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87120);matrix = MatrixUtils.createRealMatrix(testData4x3);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87121);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87122);Random r = new Random(643895747384642l);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87123);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87124);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87125);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87126);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87127);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87128);checkUpperTriangular(new RRQRDecomposition(matrix).getR());

    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private void checkUpperTriangular(RealMatrix m) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87129);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87130);m.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
            @Override
            public void visit(int row, int column, double value) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87131);
                __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87132);if ((((column < row)&&(__CLR4_4_11v6j1v6jlb90pd8m.R.iget(87133)!=0|true))||(__CLR4_4_11v6j1v6jlb90pd8m.R.iget(87134)==0&false))) {{
                    __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87135);Assert.assertEquals(0.0, value, entryTolerance);
                }
            }}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}
        });
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    /** test that H is trapezoidal */
    @Test
    public void testHTrapezoidal() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1xs7w1v8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testHTrapezoidal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1xs7w1v8g(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87136);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87137);RealMatrix matrix = MatrixUtils.createRealMatrix(testData3x3NonSingular);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87138);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87139);matrix = MatrixUtils.createRealMatrix(testData3x3Singular);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87140);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87141);matrix = MatrixUtils.createRealMatrix(testData3x4);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87142);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87143);matrix = MatrixUtils.createRealMatrix(testData4x3);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87144);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87145);Random r = new Random(643895747384642l);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87146);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87147);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87148);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87149);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87150);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87151);checkTrapezoidal(new RRQRDecomposition(matrix).getH());

    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private void checkTrapezoidal(RealMatrix m) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87152);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87153);m.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
            @Override
            public void visit(int row, int column, double value) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87154);
                __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87155);if ((((column > row)&&(__CLR4_4_11v6j1v6jlb90pd8m.R.iget(87156)!=0|true))||(__CLR4_4_11v6j1v6jlb90pd8m.R.iget(87157)==0&false))) {{
                    __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87158);Assert.assertEquals(0.0, value, entryTolerance);
                }
            }}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}
        });
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    @Test(expected=SingularMatrixException.class)
    public void testNonInvertible() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye1v93();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,83,105,110,103,117,108,97,114,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SingularMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye1v93(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87159);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87160);RRQRDecomposition qr =
            new RRQRDecomposition(MatrixUtils.createRealMatrix(testData3x3Singular), 3.0e-16);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87161);qr.getSolver().getInverse();
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    private RealMatrix createTestMatrix(final Random r, final int rows, final int columns) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87162);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87163);RealMatrix m = MatrixUtils.createRealMatrix(rows, columns);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87164);m.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor(){
            @Override
            public double visit(int row, int column, double value) {try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87165);
                __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87166);return 2.0 * r.nextDouble() - 1.0;
            }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}
        });
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87167);return m;
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

    /** test the rank is returned correctly */
    @Test
    public void testRank() {__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceStart(getClass().getName(),87168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtsx3v1v9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v6j1v6jlb90pd8m.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v6j1v6jlb90pd8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.RRQRDecompositionTest.testRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),87168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtsx3v1v9c(){try{__CLR4_4_11v6j1v6jlb90pd8m.R.inc(87168);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87169);double[][] d = { { 1, 1, 1 }, { 0, 0, 0 }, { 1, 2, 3 } };
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87170);RealMatrix m = new Array2DRowRealMatrix(d);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87171);RRQRDecomposition qr = new RRQRDecomposition(m);
        __CLR4_4_11v6j1v6jlb90pd8m.R.inc(87172);Assert.assertEquals(2, qr.getRank(1.0e-16));
    }finally{__CLR4_4_11v6j1v6jlb90pd8m.R.flushNeeded();}}

}
