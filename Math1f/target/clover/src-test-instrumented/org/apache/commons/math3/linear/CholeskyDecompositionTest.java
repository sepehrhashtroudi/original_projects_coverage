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

public class CholeskyDecompositionTest {static class __CLR4_4_11sz41sz4lb90pd37{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,84257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testData = new double[][] {
            {  1,  2,   4,   7,  11 },
            {  2, 13,  23,  38,  58 },
            {  4, 23,  77, 122, 182 },
            {  7, 38, 122, 294, 430 },
            { 11, 58, 182, 430, 855 }
    };

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21sz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21sz4(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84208);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84209);CholeskyDecomposition llt =
            new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData));
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84210);Assert.assertEquals(testData.length, llt.getL().getRowDimension());
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84211);Assert.assertEquals(testData.length, llt.getL().getColumnDimension());
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84212);Assert.assertEquals(testData.length, llt.getLT().getRowDimension());
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84213);Assert.assertEquals(testData.length, llt.getLT().getColumnDimension());
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test non-square matrix */
    @Test(expected = NonSquareMatrixException.class)
    public void testNonSquare() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1sza();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,113,117,97,114,101,58,32,91,78,111,110,83,113,117,97,114,101,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSquareMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1sza(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84214);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84215);new CholeskyDecomposition(MatrixUtils.createRealMatrix(new double[3][2]));
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test non-symmetric matrix */
    @Test(expected = NonSymmetricMatrixException.class)
    public void testNotSymmetricMatrixException() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130r0wx1szc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,83,121,109,109,101,116,114,105,99,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,58,32,91,78,111,110,83,121,109,109,101,116,114,105,99,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSymmetricMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testNotSymmetricMatrixException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130r0wx1szc(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84216);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84217);double[][] changed = testData.clone();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84218);changed[0][changed[0].length - 1] += 1.0e-5;
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84219);new CholeskyDecomposition(MatrixUtils.createRealMatrix(changed));
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test non positive definite matrix */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testNotPositiveDefinite() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6qi5r1szg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,116,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,58,32,91,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonPositiveDefiniteMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testNotPositiveDefinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6qi5r1szg(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84220);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84221);new CholeskyDecomposition(MatrixUtils.createRealMatrix(new double[][] {
                { 14, 11, 13, 15, 24 },
                { 11, 34, 13, 8,  25 },
                { 13, 13, 14, 15, 21 },
                { 15, 8,  15, 18, 23 },
                { 24, 25, 21, 23, 45 }
        }));
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testMath274() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ryc1szi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,50,55,52,58,32,91,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonPositiveDefiniteMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testMath274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ryc1szi(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84222);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84223);new CholeskyDecomposition(MatrixUtils.createRealMatrix(new double[][] {
                { 0.40434286, -0.09376327, 0.30328980, 0.04909388 },
                {-0.09376327,  0.10400408, 0.07137959, 0.04762857 },
                { 0.30328980,  0.07137959, 0.30458776, 0.04882449 },
                { 0.04909388,  0.04762857, 0.04882449, 0.07543265 }

        }));
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test A = LLT */
    @Test
    public void testAEqualLLT() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18acp621szk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testAEqualLLT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18acp621szk(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84224);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84225);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84226);CholeskyDecomposition llt = new CholeskyDecomposition(matrix);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84227);RealMatrix l  = llt.getL();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84228);RealMatrix lt = llt.getLT();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84229);double norm = l.multiply(lt).subtract(matrix).getNorm();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84230);Assert.assertEquals(0, norm, 1.0e-15);
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test that L is lower triangular */
    @Test
    public void testLLowerTriangular() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya57fp1szr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testLLowerTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya57fp1szr(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84231);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84232);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84233);RealMatrix l = new CholeskyDecomposition(matrix).getL();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84234);for (int i = 0; (((i < l.getRowDimension())&&(__CLR4_4_11sz41sz4lb90pd37.R.iget(84235)!=0|true))||(__CLR4_4_11sz41sz4lb90pd37.R.iget(84236)==0&false)); i++) {{
            __CLR4_4_11sz41sz4lb90pd37.R.inc(84237);for (int j = i + 1; (((j < l.getColumnDimension())&&(__CLR4_4_11sz41sz4lb90pd37.R.iget(84238)!=0|true))||(__CLR4_4_11sz41sz4lb90pd37.R.iget(84239)==0&false)); j++) {{
                __CLR4_4_11sz41sz4lb90pd37.R.inc(84240);Assert.assertEquals(0.0, l.getEntry(i, j), 0.0);
            }
        }}
    }}finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test that LT is transpose of L */
    @Test
    public void testLTTransposed() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17njj1o1t01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testLTTransposed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17njj1o1t01(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84241);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84242);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84243);CholeskyDecomposition llt = new CholeskyDecomposition(matrix);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84244);RealMatrix l  = llt.getL();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84245);RealMatrix lt = llt.getLT();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84246);double norm = l.subtract(lt.transpose()).getNorm();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84247);Assert.assertEquals(0, norm, 1.0e-15);
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}

    /** test matrices values */
    @Test
    public void testMatricesValues() {__CLR4_4_11sz41sz4lb90pd37.R.globalSliceStart(getClass().getName(),84248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5n6ej1t08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11sz41sz4lb90pd37.R.rethrow($CLV_t2$);}finally{__CLR4_4_11sz41sz4lb90pd37.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.CholeskyDecompositionTest.testMatricesValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5n6ej1t08(){try{__CLR4_4_11sz41sz4lb90pd37.R.inc(84248);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84249);RealMatrix lRef = MatrixUtils.createRealMatrix(new double[][] {
                {  1,  0,  0,  0,  0 },
                {  2,  3,  0,  0,  0 },
                {  4,  5,  6,  0,  0 },
                {  7,  8,  9, 10,  0 },
                { 11, 12, 13, 14, 15 }
        });
       __CLR4_4_11sz41sz4lb90pd37.R.inc(84250);CholeskyDecomposition llt =
            new CholeskyDecomposition(MatrixUtils.createRealMatrix(testData));

        // check values against known references
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84251);RealMatrix l = llt.getL();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84252);Assert.assertEquals(0, l.subtract(lRef).getNorm(), 1.0e-13);
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84253);RealMatrix lt = llt.getLT();
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84254);Assert.assertEquals(0, lt.subtract(lRef.transpose()).getNorm(), 1.0e-13);

        // check the same cached instance is returned the second time
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84255);Assert.assertTrue(l  == llt.getL());
        __CLR4_4_11sz41sz4lb90pd37.R.inc(84256);Assert.assertTrue(lt == llt.getLT());
    }finally{__CLR4_4_11sz41sz4lb90pd37.R.flushNeeded();}}
}
