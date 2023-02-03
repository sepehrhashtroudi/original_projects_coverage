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
import org.apache.commons.math3.linear.SingularMatrixException;

import org.junit.Assert;
import org.junit.Test;


public class QRDecompositionTest {static class __CLR4_4_11v171v17lb90pd88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void testDimensions() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21v17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21v17(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86875);
        __CLR4_4_11v171v17lb90pd88.R.inc(86876);checkDimension(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v171v17lb90pd88.R.inc(86877);checkDimension(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v171v17lb90pd88.R.inc(86878);checkDimension(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v171v17lb90pd88.R.inc(86879);Random r = new Random(643895747384642l);
        __CLR4_4_11v171v17lb90pd88.R.inc(86880);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86881);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86882);checkDimension(createTestMatrix(r, p, q));
        __CLR4_4_11v171v17lb90pd88.R.inc(86883);checkDimension(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private void checkDimension(RealMatrix m) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86884);
        __CLR4_4_11v171v17lb90pd88.R.inc(86885);int rows = m.getRowDimension();
        __CLR4_4_11v171v17lb90pd88.R.inc(86886);int columns = m.getColumnDimension();
        __CLR4_4_11v171v17lb90pd88.R.inc(86887);QRDecomposition qr = new QRDecomposition(m);
        __CLR4_4_11v171v17lb90pd88.R.inc(86888);Assert.assertEquals(rows,    qr.getQ().getRowDimension());
        __CLR4_4_11v171v17lb90pd88.R.inc(86889);Assert.assertEquals(rows,    qr.getQ().getColumnDimension());
        __CLR4_4_11v171v17lb90pd88.R.inc(86890);Assert.assertEquals(rows,    qr.getR().getRowDimension());
        __CLR4_4_11v171v17lb90pd88.R.inc(86891);Assert.assertEquals(columns, qr.getR().getColumnDimension());
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    /** test A = QR */
    @Test
    public void testAEqualQR() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykcjql1v1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testAEqualQR",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykcjql1v1o(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86892);
        __CLR4_4_11v171v17lb90pd88.R.inc(86893);checkAEqualQR(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v171v17lb90pd88.R.inc(86894);checkAEqualQR(MatrixUtils.createRealMatrix(testData3x3Singular));

        __CLR4_4_11v171v17lb90pd88.R.inc(86895);checkAEqualQR(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v171v17lb90pd88.R.inc(86896);checkAEqualQR(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v171v17lb90pd88.R.inc(86897);Random r = new Random(643895747384642l);
        __CLR4_4_11v171v17lb90pd88.R.inc(86898);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86899);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86900);checkAEqualQR(createTestMatrix(r, p, q));

        __CLR4_4_11v171v17lb90pd88.R.inc(86901);checkAEqualQR(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private void checkAEqualQR(RealMatrix m) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86902);
        __CLR4_4_11v171v17lb90pd88.R.inc(86903);QRDecomposition qr = new QRDecomposition(m);
        __CLR4_4_11v171v17lb90pd88.R.inc(86904);double norm = qr.getQ().multiply(qr.getR()).subtract(m).getNorm();
        __CLR4_4_11v171v17lb90pd88.R.inc(86905);Assert.assertEquals(0, norm, normTolerance);
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    /** test the orthogonality of Q */
    @Test
    public void testQOrthogonal() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15719gf1v22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testQOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15719gf1v22(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86906);
        __CLR4_4_11v171v17lb90pd88.R.inc(86907);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x3NonSingular));

        __CLR4_4_11v171v17lb90pd88.R.inc(86908);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x3Singular));

        __CLR4_4_11v171v17lb90pd88.R.inc(86909);checkQOrthogonal(MatrixUtils.createRealMatrix(testData3x4));

        __CLR4_4_11v171v17lb90pd88.R.inc(86910);checkQOrthogonal(MatrixUtils.createRealMatrix(testData4x3));

        __CLR4_4_11v171v17lb90pd88.R.inc(86911);Random r = new Random(643895747384642l);
        __CLR4_4_11v171v17lb90pd88.R.inc(86912);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86913);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86914);checkQOrthogonal(createTestMatrix(r, p, q));

        __CLR4_4_11v171v17lb90pd88.R.inc(86915);checkQOrthogonal(createTestMatrix(r, q, p));

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private void checkQOrthogonal(RealMatrix m) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86916);
        __CLR4_4_11v171v17lb90pd88.R.inc(86917);QRDecomposition qr = new QRDecomposition(m);
        __CLR4_4_11v171v17lb90pd88.R.inc(86918);RealMatrix eye = MatrixUtils.createRealIdentityMatrix(m.getRowDimension());
        __CLR4_4_11v171v17lb90pd88.R.inc(86919);double norm = qr.getQT().multiply(qr.getQ()).subtract(eye).getNorm();
        __CLR4_4_11v171v17lb90pd88.R.inc(86920);Assert.assertEquals(0, norm, normTolerance);
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    /** test that R is upper triangular */
    @Test
    public void testRUpperTriangular() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165g8gw1v2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testRUpperTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165g8gw1v2h(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86921);
        __CLR4_4_11v171v17lb90pd88.R.inc(86922);RealMatrix matrix = MatrixUtils.createRealMatrix(testData3x3NonSingular);
        __CLR4_4_11v171v17lb90pd88.R.inc(86923);checkUpperTriangular(new QRDecomposition(matrix).getR());

        __CLR4_4_11v171v17lb90pd88.R.inc(86924);matrix = MatrixUtils.createRealMatrix(testData3x3Singular);
        __CLR4_4_11v171v17lb90pd88.R.inc(86925);checkUpperTriangular(new QRDecomposition(matrix).getR());

        __CLR4_4_11v171v17lb90pd88.R.inc(86926);matrix = MatrixUtils.createRealMatrix(testData3x4);
        __CLR4_4_11v171v17lb90pd88.R.inc(86927);checkUpperTriangular(new QRDecomposition(matrix).getR());

        __CLR4_4_11v171v17lb90pd88.R.inc(86928);matrix = MatrixUtils.createRealMatrix(testData4x3);
        __CLR4_4_11v171v17lb90pd88.R.inc(86929);checkUpperTriangular(new QRDecomposition(matrix).getR());

        __CLR4_4_11v171v17lb90pd88.R.inc(86930);Random r = new Random(643895747384642l);
        __CLR4_4_11v171v17lb90pd88.R.inc(86931);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86932);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86933);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v171v17lb90pd88.R.inc(86934);checkUpperTriangular(new QRDecomposition(matrix).getR());

        __CLR4_4_11v171v17lb90pd88.R.inc(86935);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v171v17lb90pd88.R.inc(86936);checkUpperTriangular(new QRDecomposition(matrix).getR());

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private void checkUpperTriangular(RealMatrix m) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86937);
        __CLR4_4_11v171v17lb90pd88.R.inc(86938);m.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
            @Override
            public void visit(int row, int column, double value) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86939);
                __CLR4_4_11v171v17lb90pd88.R.inc(86940);if ((((column < row)&&(__CLR4_4_11v171v17lb90pd88.R.iget(86941)!=0|true))||(__CLR4_4_11v171v17lb90pd88.R.iget(86942)==0&false))) {{
                    __CLR4_4_11v171v17lb90pd88.R.inc(86943);Assert.assertEquals(0.0, value, entryTolerance);
                }
            }}finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}
        });
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    /** test that H is trapezoidal */
    @Test
    public void testHTrapezoidal() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1xs7w1v34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testHTrapezoidal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1xs7w1v34(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86944);
        __CLR4_4_11v171v17lb90pd88.R.inc(86945);RealMatrix matrix = MatrixUtils.createRealMatrix(testData3x3NonSingular);
        __CLR4_4_11v171v17lb90pd88.R.inc(86946);checkTrapezoidal(new QRDecomposition(matrix).getH());

        __CLR4_4_11v171v17lb90pd88.R.inc(86947);matrix = MatrixUtils.createRealMatrix(testData3x3Singular);
        __CLR4_4_11v171v17lb90pd88.R.inc(86948);checkTrapezoidal(new QRDecomposition(matrix).getH());

        __CLR4_4_11v171v17lb90pd88.R.inc(86949);matrix = MatrixUtils.createRealMatrix(testData3x4);
        __CLR4_4_11v171v17lb90pd88.R.inc(86950);checkTrapezoidal(new QRDecomposition(matrix).getH());

        __CLR4_4_11v171v17lb90pd88.R.inc(86951);matrix = MatrixUtils.createRealMatrix(testData4x3);
        __CLR4_4_11v171v17lb90pd88.R.inc(86952);checkTrapezoidal(new QRDecomposition(matrix).getH());

        __CLR4_4_11v171v17lb90pd88.R.inc(86953);Random r = new Random(643895747384642l);
        __CLR4_4_11v171v17lb90pd88.R.inc(86954);int    p = (5 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86955);int    q = (7 * BlockRealMatrix.BLOCK_SIZE) / 4;
        __CLR4_4_11v171v17lb90pd88.R.inc(86956);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v171v17lb90pd88.R.inc(86957);checkTrapezoidal(new QRDecomposition(matrix).getH());

        __CLR4_4_11v171v17lb90pd88.R.inc(86958);matrix = createTestMatrix(r, p, q);
        __CLR4_4_11v171v17lb90pd88.R.inc(86959);checkTrapezoidal(new QRDecomposition(matrix).getH());

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private void checkTrapezoidal(RealMatrix m) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86960);
        __CLR4_4_11v171v17lb90pd88.R.inc(86961);m.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
            @Override
            public void visit(int row, int column, double value) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86962);
                __CLR4_4_11v171v17lb90pd88.R.inc(86963);if ((((column > row)&&(__CLR4_4_11v171v17lb90pd88.R.iget(86964)!=0|true))||(__CLR4_4_11v171v17lb90pd88.R.iget(86965)==0&false))) {{
                    __CLR4_4_11v171v17lb90pd88.R.inc(86966);Assert.assertEquals(0.0, value, entryTolerance);
                }
            }}finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}
        });
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}
    /** test matrices values */
    @Test
    public void testMatricesValues() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5n6ej1v3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testMatricesValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5n6ej1v3r(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86967);
        __CLR4_4_11v171v17lb90pd88.R.inc(86968);QRDecomposition qr =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3NonSingular));
        __CLR4_4_11v171v17lb90pd88.R.inc(86969);RealMatrix qRef = MatrixUtils.createRealMatrix(new double[][] {
                { -12.0 / 14.0,   69.0 / 175.0,  -58.0 / 175.0 },
                {  -6.0 / 14.0, -158.0 / 175.0,    6.0 / 175.0 },
                {   4.0 / 14.0,  -30.0 / 175.0, -165.0 / 175.0 }
        });
        __CLR4_4_11v171v17lb90pd88.R.inc(86970);RealMatrix rRef = MatrixUtils.createRealMatrix(new double[][] {
                { -14.0,  -21.0, 14.0 },
                {   0.0, -175.0, 70.0 },
                {   0.0,    0.0, 35.0 }
        });
        __CLR4_4_11v171v17lb90pd88.R.inc(86971);RealMatrix hRef = MatrixUtils.createRealMatrix(new double[][] {
                { 26.0 / 14.0, 0.0, 0.0 },
                {  6.0 / 14.0, 648.0 / 325.0, 0.0 },
                { -4.0 / 14.0,  36.0 / 325.0, 2.0 }
        });

        // check values against known references
        __CLR4_4_11v171v17lb90pd88.R.inc(86972);RealMatrix q = qr.getQ();
        __CLR4_4_11v171v17lb90pd88.R.inc(86973);Assert.assertEquals(0, q.subtract(qRef).getNorm(), 1.0e-13);
        __CLR4_4_11v171v17lb90pd88.R.inc(86974);RealMatrix qT = qr.getQT();
        __CLR4_4_11v171v17lb90pd88.R.inc(86975);Assert.assertEquals(0, qT.subtract(qRef.transpose()).getNorm(), 1.0e-13);
        __CLR4_4_11v171v17lb90pd88.R.inc(86976);RealMatrix r = qr.getR();
        __CLR4_4_11v171v17lb90pd88.R.inc(86977);Assert.assertEquals(0, r.subtract(rRef).getNorm(), 1.0e-13);
        __CLR4_4_11v171v17lb90pd88.R.inc(86978);RealMatrix h = qr.getH();
        __CLR4_4_11v171v17lb90pd88.R.inc(86979);Assert.assertEquals(0, h.subtract(hRef).getNorm(), 1.0e-13);

        // check the same cached instance is returned the second time
        __CLR4_4_11v171v17lb90pd88.R.inc(86980);Assert.assertTrue(q == qr.getQ());
        __CLR4_4_11v171v17lb90pd88.R.inc(86981);Assert.assertTrue(r == qr.getR());
        __CLR4_4_11v171v17lb90pd88.R.inc(86982);Assert.assertTrue(h == qr.getH());

    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    @Test(expected=SingularMatrixException.class)
    public void testNonInvertible() {__CLR4_4_11v171v17lb90pd88.R.globalSliceStart(getClass().getName(),86983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm6ye1v47();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,83,105,110,103,117,108,97,114,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SingularMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11v171v17lb90pd88.R.rethrow($CLV_t2$);}finally{__CLR4_4_11v171v17lb90pd88.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.QRDecompositionTest.testNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm6ye1v47(){try{__CLR4_4_11v171v17lb90pd88.R.inc(86983);
        __CLR4_4_11v171v17lb90pd88.R.inc(86984);QRDecomposition qr =
            new QRDecomposition(MatrixUtils.createRealMatrix(testData3x3Singular));
        __CLR4_4_11v171v17lb90pd88.R.inc(86985);qr.getSolver().getInverse();
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

    private RealMatrix createTestMatrix(final Random r, final int rows, final int columns) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86986);
        __CLR4_4_11v171v17lb90pd88.R.inc(86987);RealMatrix m = MatrixUtils.createRealMatrix(rows, columns);
        __CLR4_4_11v171v17lb90pd88.R.inc(86988);m.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor(){
            @Override
            public double visit(int row, int column, double value) {try{__CLR4_4_11v171v17lb90pd88.R.inc(86989);
                __CLR4_4_11v171v17lb90pd88.R.inc(86990);return 2.0 * r.nextDouble() - 1.0;
            }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}
        });
        __CLR4_4_11v171v17lb90pd88.R.inc(86991);return m;
    }finally{__CLR4_4_11v171v17lb90pd88.R.flushNeeded();}}

}
