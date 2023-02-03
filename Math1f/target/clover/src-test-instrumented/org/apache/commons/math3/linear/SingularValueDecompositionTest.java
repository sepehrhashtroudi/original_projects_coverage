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

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


public class SingularValueDecompositionTest {static class __CLR4_4_11wl91wl9lb90pdcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89042,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    private static final double normTolerance = 10e-14;

    @Test
    public void testMoreRows() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8ml2x1wl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testMoreRows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8ml2x1wl9(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88893);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88894);final double[] singularValues = { 123.456, 2.3, 1.001, 0.999 };
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88895);final int rows    = singularValues.length + 2;
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88896);final int columns = singularValues.length;
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88897);Random r = new Random(15338437322523l);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88898);SingularValueDecomposition svd =
            new SingularValueDecomposition(createTestMatrix(r, rows, columns, singularValues));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88899);double[] computedSV = svd.getSingularValues();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88900);Assert.assertEquals(singularValues.length, computedSV.length);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88901);for (int i = 0; (((i < singularValues.length)&&(__CLR4_4_11wl91wl9lb90pdcq.R.iget(88902)!=0|true))||(__CLR4_4_11wl91wl9lb90pdcq.R.iget(88903)==0&false)); ++i) {{
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(88904);Assert.assertEquals(singularValues[i], computedSV[i], 1.0e-10);
        }
    }}finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    @Test
    public void testMoreColumns() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174bdct1wll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testMoreColumns",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174bdct1wll(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88905);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88906);final double[] singularValues = { 123.456, 2.3, 1.001, 0.999 };
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88907);final int rows    = singularValues.length;
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88908);final int columns = singularValues.length + 2;
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88909);Random r = new Random(732763225836210l);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88910);SingularValueDecomposition svd =
            new SingularValueDecomposition(createTestMatrix(r, rows, columns, singularValues));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88911);double[] computedSV = svd.getSingularValues();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88912);Assert.assertEquals(singularValues.length, computedSV.length);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88913);for (int i = 0; (((i < singularValues.length)&&(__CLR4_4_11wl91wl9lb90pdcq.R.iget(88914)!=0|true))||(__CLR4_4_11wl91wl9lb90pdcq.R.iget(88915)==0&false)); ++i) {{
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(88916);Assert.assertEquals(singularValues[i], computedSV[i], 1.0e-10);
        }
    }}finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21wlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21wlx(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88917);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88918);RealMatrix matrix = MatrixUtils.createRealMatrix(testSquare);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88919);final int m = matrix.getRowDimension();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88920);final int n = matrix.getColumnDimension();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88921);SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88922);Assert.assertEquals(m, svd.getU().getRowDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88923);Assert.assertEquals(m, svd.getU().getColumnDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88924);Assert.assertEquals(m, svd.getS().getColumnDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88925);Assert.assertEquals(n, svd.getS().getColumnDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88926);Assert.assertEquals(n, svd.getV().getRowDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88927);Assert.assertEquals(n, svd.getV().getColumnDimension());

    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** Test based on a dimension 4 Hadamard matrix. */
    @Test
    public void testHadamard() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shwyiz1wm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testHadamard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shwyiz1wm8(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88928);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88929);RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
                {15.0 / 2.0,  5.0 / 2.0,  9.0 / 2.0,  3.0 / 2.0 },
                { 5.0 / 2.0, 15.0 / 2.0,  3.0 / 2.0,  9.0 / 2.0 },
                { 9.0 / 2.0,  3.0 / 2.0, 15.0 / 2.0,  5.0 / 2.0 },
                { 3.0 / 2.0,  9.0 / 2.0,  5.0 / 2.0, 15.0 / 2.0 }
        }, false);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88930);SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88931);Assert.assertEquals(16.0, svd.getSingularValues()[0], 1.0e-14);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88932);Assert.assertEquals( 8.0, svd.getSingularValues()[1], 1.0e-14);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88933);Assert.assertEquals( 4.0, svd.getSingularValues()[2], 1.0e-14);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88934);Assert.assertEquals( 2.0, svd.getSingularValues()[3], 1.0e-14);

        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88935);RealMatrix fullCovariance = new Array2DRowRealMatrix(new double[][] {
                {  85.0 / 1024, -51.0 / 1024, -75.0 / 1024,  45.0 / 1024 },
                { -51.0 / 1024,  85.0 / 1024,  45.0 / 1024, -75.0 / 1024 },
                { -75.0 / 1024,  45.0 / 1024,  85.0 / 1024, -51.0 / 1024 },
                {  45.0 / 1024, -75.0 / 1024, -51.0 / 1024,  85.0 / 1024 }
        }, false);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88936);Assert.assertEquals(0.0,
                     fullCovariance.subtract(svd.getCovariance(0.0)).getNorm(),
                     1.0e-14);

        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88937);RealMatrix halfCovariance = new Array2DRowRealMatrix(new double[][] {
                {   5.0 / 1024,  -3.0 / 1024,   5.0 / 1024,  -3.0 / 1024 },
                {  -3.0 / 1024,   5.0 / 1024,  -3.0 / 1024,   5.0 / 1024 },
                {   5.0 / 1024,  -3.0 / 1024,   5.0 / 1024,  -3.0 / 1024 },
                {  -3.0 / 1024,   5.0 / 1024,  -3.0 / 1024,   5.0 / 1024 }
        }, false);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88938);Assert.assertEquals(0.0,
                     halfCovariance.subtract(svd.getCovariance(6.0)).getNorm(),
                     1.0e-14);

    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test A = USVt */
    @Test
    public void testAEqualUSVt() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hi92js1wmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testAEqualUSVt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hi92js1wmj(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88939);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88940);checkAEqualUSVt(MatrixUtils.createRealMatrix(testSquare));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88941);checkAEqualUSVt(MatrixUtils.createRealMatrix(testNonSquare));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88942);checkAEqualUSVt(MatrixUtils.createRealMatrix(testNonSquare).transpose());
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    public void checkAEqualUSVt(final RealMatrix matrix) {try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88943);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88944);SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88945);RealMatrix u = svd.getU();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88946);RealMatrix s = svd.getS();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88947);RealMatrix v = svd.getV();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88948);double norm = u.multiply(s).multiply(v.transpose()).subtract(matrix).getNorm();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88949);Assert.assertEquals(0, norm, normTolerance);

    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test that U is orthogonal */
    @Test
    public void testUOrthogonal() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8ncmb1wmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testUOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8ncmb1wmu(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88950);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88951);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare)).getU());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88952);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testNonSquare)).getU());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88953);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testNonSquare).transpose()).getU());
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test that V is orthogonal */
    @Test
    public void testVOrthogonal() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w126kc1wmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testVOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w126kc1wmy(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88954);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88955);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare)).getV());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88956);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testNonSquare)).getV());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88957);checkOrthogonal(new SingularValueDecomposition(MatrixUtils.createRealMatrix(testNonSquare).transpose()).getV());
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    public void checkOrthogonal(final RealMatrix m) {try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88958);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88959);RealMatrix mTm = m.transpose().multiply(m);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88960);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(mTm.getRowDimension());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88961);Assert.assertEquals(0, mTm.subtract(id).getNorm(), normTolerance);
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test matrices values */
    // This test is useless since whereas the columns of U and V are linked
    // together, the actual triplet (U,S,V) is not uniquely defined.
    public void testMatricesValues1() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18sxz7u1wn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testMatricesValues1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18sxz7u1wn6(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88962);
       __CLR4_4_11wl91wl9lb90pdcq.R.inc(88963);SingularValueDecomposition svd =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88964);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
                { 3.0 / 5.0, -4.0 / 5.0 },
                { 4.0 / 5.0,  3.0 / 5.0 }
        });
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88965);RealMatrix sRef = MatrixUtils.createRealMatrix(new double[][] {
                { 3.0, 0.0 },
                { 0.0, 1.0 }
        });
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88966);RealMatrix vRef = MatrixUtils.createRealMatrix(new double[][] {
                { 4.0 / 5.0,  3.0 / 5.0 },
                { 3.0 / 5.0, -4.0 / 5.0 }
        });

        // check values against known references
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88967);RealMatrix u = svd.getU();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88968);Assert.assertEquals(0, u.subtract(uRef).getNorm(), normTolerance);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88969);RealMatrix s = svd.getS();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88970);Assert.assertEquals(0, s.subtract(sRef).getNorm(), normTolerance);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88971);RealMatrix v = svd.getV();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88972);Assert.assertEquals(0, v.subtract(vRef).getNorm(), normTolerance);

        // check the same cached instance is returned the second time
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88973);Assert.assertTrue(u == svd.getU());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88974);Assert.assertTrue(s == svd.getS());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88975);Assert.assertTrue(v == svd.getV());

    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test matrices values */
    // This test is useless since whereas the columns of U and V are linked
    // together, the actual triplet (U,S,V) is not uniquely defined.
    public void useless_testMatricesValues2() {try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88976);

        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88977);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
            {  0.0 / 5.0,  3.0 / 5.0,  0.0 / 5.0 },
            { -4.0 / 5.0,  0.0 / 5.0, -3.0 / 5.0 },
            {  0.0 / 5.0,  4.0 / 5.0,  0.0 / 5.0 },
            { -3.0 / 5.0,  0.0 / 5.0,  4.0 / 5.0 }
        });
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88978);RealMatrix sRef = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0, 0.0, 0.0 },
            { 0.0, 3.0, 0.0 },
            { 0.0, 0.0, 2.0 }
        });
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88979);RealMatrix vRef = MatrixUtils.createRealMatrix(new double[][] {
            {  80.0 / 125.0,  -60.0 / 125.0, 75.0 / 125.0 },
            {  24.0 / 125.0,  107.0 / 125.0, 60.0 / 125.0 },
            { -93.0 / 125.0,  -24.0 / 125.0, 80.0 / 125.0 }
        });

        // check values against known references
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88980);SingularValueDecomposition svd =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testNonSquare));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88981);RealMatrix u = svd.getU();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88982);Assert.assertEquals(0, u.subtract(uRef).getNorm(), normTolerance);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88983);RealMatrix s = svd.getS();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88984);Assert.assertEquals(0, s.subtract(sRef).getNorm(), normTolerance);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88985);RealMatrix v = svd.getV();
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88986);Assert.assertEquals(0, v.subtract(vRef).getNorm(), normTolerance);

        // check the same cached instance is returned the second time
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88987);Assert.assertTrue(u == svd.getU());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88988);Assert.assertTrue(s == svd.getS());
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88989);Assert.assertTrue(v == svd.getV());

    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

     /** test MATH-465 */
    @Test
    public void testRank() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtsx3v1wny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtsx3v1wny(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88990);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88991);double[][] d = { { 1, 1, 1 }, { 0, 0, 0 }, { 1, 2, 3 } };
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88992);RealMatrix m = new Array2DRowRealMatrix(d);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88993);SingularValueDecomposition svd = new SingularValueDecomposition(m);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88994);Assert.assertEquals(2, svd.getRank());
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test MATH-583 */
    @Test
    public void testStability1() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),88995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpjmsf1wo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testStability1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpjmsf1wo3(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(88995);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88996);RealMatrix m = new Array2DRowRealMatrix(201, 201);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88997);loadRealMatrix(m,"matrix1.csv");
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(88998);try {
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(88999);new SingularValueDecomposition(m);
        } catch (Exception e) {
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89000);Assert.fail("Exception whilst constructing SVD");
        }
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test MATH-327 */
    @Test
    public void testStability2() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),89001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngjnzy1wo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testStability2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngjnzy1wo9(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89001);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89002);RealMatrix m = new Array2DRowRealMatrix(7, 168);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89003);loadRealMatrix(m,"matrix2.csv");
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89004);try {
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89005);new SingularValueDecomposition(m);
        } catch (Throwable e) {
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89006);Assert.fail("Exception whilst constructing SVD");
        }
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    private void loadRealMatrix(RealMatrix m, String resourceName) {try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89007);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89008);try {
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89009);DataInputStream in = new DataInputStream(getClass().getResourceAsStream(resourceName));
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89010);BufferedReader br = new BufferedReader(new InputStreamReader(in));
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89011);String strLine;
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89012);int row = 0;
            __CLR4_4_11wl91wl9lb90pdcq.R.inc(89013);while ((strLine = br.readLine()) != null) {{
                __CLR4_4_11wl91wl9lb90pdcq.R.inc(89016);if ((((!strLine.startsWith("#"))&&(__CLR4_4_11wl91wl9lb90pdcq.R.iget(89017)!=0|true))||(__CLR4_4_11wl91wl9lb90pdcq.R.iget(89018)==0&false))) {{
                    __CLR4_4_11wl91wl9lb90pdcq.R.inc(89019);int col = 0;
                    __CLR4_4_11wl91wl9lb90pdcq.R.inc(89020);for (String entry : strLine.split(",")) {{
                        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89021);m.setEntry(row, col++, Double.parseDouble(entry));
                    }
                    }__CLR4_4_11wl91wl9lb90pdcq.R.inc(89022);row++;
                }
            }}
            }__CLR4_4_11wl91wl9lb90pdcq.R.inc(89023);in.close();
        } catch (IOException e) {}
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    /** test condition number */
    @Test
    public void testConditionNumber() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),89024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xprhyf1wow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testConditionNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xprhyf1wow(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89024);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89025);SingularValueDecomposition svd =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare));
        // replace 1.0e-15 with 1.5e-15
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89026);Assert.assertEquals(3.0, svd.getConditionNumber(), 1.5e-15);
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    @Test
    public void testInverseConditionNumber() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),89027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fen1kd1woz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testInverseConditionNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fen1kd1woz(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89027);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89028);SingularValueDecomposition svd =
            new SingularValueDecomposition(MatrixUtils.createRealMatrix(testSquare));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89029);Assert.assertEquals(1.0/3.0, svd.getInverseConditionNumber(), 1.5e-15);
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    private RealMatrix createTestMatrix(final Random r, final int rows, final int columns,
                                        final double[] singularValues) {try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89030);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89031);final RealMatrix u = EigenDecompositionTest.createOrthogonalMatrix(r, rows);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89032);final RealMatrix d = new Array2DRowRealMatrix(rows, columns);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89033);d.setSubMatrix(MatrixUtils.createRealDiagonalMatrix(singularValues).getData(), 0, 0);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89034);final RealMatrix v = EigenDecompositionTest.createOrthogonalMatrix(r, columns);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89035);return u.multiply(d).multiply(v);
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

    @Test
    public void testIssue947() {__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceStart(getClass().getName(),89036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0waqk1wp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wl91wl9lb90pdcq.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wl91wl9lb90pdcq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SingularValueDecompositionTest.testIssue947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0waqk1wp8(){try{__CLR4_4_11wl91wl9lb90pdcq.R.inc(89036);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89037);double[][] nans = new double[][] {
            { Double.NaN, Double.NaN },
            { Double.NaN, Double.NaN }
        };
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89038);RealMatrix m = new Array2DRowRealMatrix(nans, false);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89039);SingularValueDecomposition svd = new SingularValueDecomposition(m);
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89040);Assert.assertTrue(Double.isNaN(svd.getSingularValues()[0]));
        __CLR4_4_11wl91wl9lb90pdcq.R.inc(89041);Assert.assertTrue(Double.isNaN(svd.getSingularValues()[1]));
    }finally{__CLR4_4_11wl91wl9lb90pdcq.R.flushNeeded();}}

}
