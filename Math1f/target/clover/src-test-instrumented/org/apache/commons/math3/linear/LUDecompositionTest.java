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

public class LUDecompositionTest {static class __CLR4_4_11upm1upmlb90pd7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[][] testData = {
            { 1.0, 2.0, 3.0},
            { 2.0, 5.0, 3.0},
            { 1.0, 0.0, 8.0}
    };
    private double[][] testDataMinus = {
            { -1.0, -2.0, -3.0},
            { -2.0, -5.0, -3.0},
            { -1.0,  0.0, -8.0}
    };
    private double[][] luData = {
            { 2.0, 3.0, 3.0 },
            { 0.0, 5.0, 7.0 },
            { 6.0, 9.0, 8.0 }
    };

    // singular matrices
    private double[][] singular = {
            { 2.0, 3.0 },
            { 2.0, 3.0 }
    };
    private double[][] bigSingular = {
            { 1.0, 2.0,   3.0,    4.0 },
            { 2.0, 5.0,   3.0,    4.0 },
            { 7.0, 3.0, 256.0, 1930.0 },
            { 3.0, 7.0,   6.0,    8.0 }
    }; // 4th row = 1st + 2nd

    private static final double entryTolerance = 10e-16;

    private static final double normTolerance = 10e-14;

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21upm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21upm(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86458);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86459);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86460);LUDecomposition LU = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86461);Assert.assertEquals(testData.length, LU.getL().getRowDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86462);Assert.assertEquals(testData.length, LU.getL().getColumnDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86463);Assert.assertEquals(testData.length, LU.getU().getRowDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86464);Assert.assertEquals(testData.length, LU.getU().getColumnDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86465);Assert.assertEquals(testData.length, LU.getP().getRowDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86466);Assert.assertEquals(testData.length, LU.getP().getColumnDimension());

    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test non-square matrix */
    @Test
    public void testNonSquare() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1upv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1upv(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86467);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86468);try {
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86469);new LUDecomposition(MatrixUtils.createRealMatrix(new double[3][2]));
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86470);Assert.fail("Expecting NonSquareMatrixException");
        } catch (NonSquareMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test PA = LU */
    @Test
    public void testPAEqualLU() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk29mp1upz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testPAEqualLU",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk29mp1upz(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86471);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86472);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86473);LUDecomposition lu = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86474);RealMatrix l = lu.getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86475);RealMatrix u = lu.getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86476);RealMatrix p = lu.getP();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86477);double norm = l.multiply(u).subtract(p.multiply(matrix)).getNorm();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86478);Assert.assertEquals(0, norm, normTolerance);

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86479);matrix = MatrixUtils.createRealMatrix(testDataMinus);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86480);lu = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86481);l = lu.getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86482);u = lu.getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86483);p = lu.getP();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86484);norm = l.multiply(u).subtract(p.multiply(matrix)).getNorm();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86485);Assert.assertEquals(0, norm, normTolerance);

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86486);matrix = MatrixUtils.createRealIdentityMatrix(17);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86487);lu = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86488);l = lu.getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86489);u = lu.getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86490);p = lu.getP();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86491);norm = l.multiply(u).subtract(p.multiply(matrix)).getNorm();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86492);Assert.assertEquals(0, norm, normTolerance);

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86493);matrix = MatrixUtils.createRealMatrix(singular);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86494);lu = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86495);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86496);Assert.assertNull(lu.getL());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86497);Assert.assertNull(lu.getU());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86498);Assert.assertNull(lu.getP());

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86499);matrix = MatrixUtils.createRealMatrix(bigSingular);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86500);lu = new LUDecomposition(matrix);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86501);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86502);Assert.assertNull(lu.getL());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86503);Assert.assertNull(lu.getU());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86504);Assert.assertNull(lu.getP());

    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test that L is lower triangular with unit diagonal */
    @Test
    public void testLLowerTriangular() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya57fp1uqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testLLowerTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya57fp1uqx(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86505);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86506);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86507);RealMatrix l = new LUDecomposition(matrix).getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86508);for (int i = 0; (((i < l.getRowDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86509)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86510)==0&false)); i++) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86511);Assert.assertEquals(l.getEntry(i, i), 1, entryTolerance);
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86512);for (int j = i + 1; (((j < l.getColumnDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86513)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86514)==0&false)); j++) {{
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86515);Assert.assertEquals(l.getEntry(i, j), 0, entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test that U is upper triangular */
    @Test
    public void testUUpperTriangular() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvl4il1ur8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testUUpperTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvl4il1ur8(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86516);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86517);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86518);RealMatrix u = new LUDecomposition(matrix).getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86519);for (int i = 0; (((i < u.getRowDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86520)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86521)==0&false)); i++) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86522);for (int j = 0; (((j < i)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86523)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86524)==0&false)); j++) {{
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86525);Assert.assertEquals(u.getEntry(i, j), 0, entryTolerance);
            }
        }}
    }}finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test that P is a permutation matrix */
    @Test
    public void testPPermutation() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fhhrj1uri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testPPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fhhrj1uri(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86526);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86527);RealMatrix matrix = MatrixUtils.createRealMatrix(testData);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86528);RealMatrix p   = new LUDecomposition(matrix).getP();

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86529);RealMatrix ppT = p.multiply(p.transpose());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86530);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(p.getRowDimension());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86531);Assert.assertEquals(0, ppT.subtract(id).getNorm(), normTolerance);

        __CLR4_4_11upm1upmlb90pd7d.R.inc(86532);for (int i = 0; (((i < p.getRowDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86533)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86534)==0&false)); i++) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86535);int zeroCount  = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86536);int oneCount   = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86537);int otherCount = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86538);for (int j = 0; (((j < p.getColumnDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86539)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86540)==0&false)); j++) {{
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86541);final double e = p.getEntry(i, j);
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86542);if ((((e == 0)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86543)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86544)==0&false))) {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86545);++zeroCount;
                } }else {__CLR4_4_11upm1upmlb90pd7d.R.inc(86546);if ((((e == 1)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86547)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86548)==0&false))) {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86549);++oneCount;
                } }else {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86550);++otherCount;
                }
            }}}
            }__CLR4_4_11upm1upmlb90pd7d.R.inc(86551);Assert.assertEquals(p.getColumnDimension() - 1, zeroCount);
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86552);Assert.assertEquals(1, oneCount);
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86553);Assert.assertEquals(0, otherCount);
        }

        }__CLR4_4_11upm1upmlb90pd7d.R.inc(86554);for (int j = 0; (((j < p.getColumnDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86555)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86556)==0&false)); j++) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86557);int zeroCount  = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86558);int oneCount   = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86559);int otherCount = 0;
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86560);for (int i = 0; (((i < p.getRowDimension())&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86561)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86562)==0&false)); i++) {{
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86563);final double e = p.getEntry(i, j);
                __CLR4_4_11upm1upmlb90pd7d.R.inc(86564);if ((((e == 0)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86565)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86566)==0&false))) {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86567);++zeroCount;
                } }else {__CLR4_4_11upm1upmlb90pd7d.R.inc(86568);if ((((e == 1)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86569)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86570)==0&false))) {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86571);++oneCount;
                } }else {{
                    __CLR4_4_11upm1upmlb90pd7d.R.inc(86572);++otherCount;
                }
            }}}
            }__CLR4_4_11upm1upmlb90pd7d.R.inc(86573);Assert.assertEquals(p.getRowDimension() - 1, zeroCount);
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86574);Assert.assertEquals(1, oneCount);
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86575);Assert.assertEquals(0, otherCount);
        }

    }}finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test singular */
    @Test
    public void testSingular() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p0sts1usw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p0sts1usw(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86576);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86577);LUDecomposition lu =
            new LUDecomposition(MatrixUtils.createRealMatrix(testData));
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86578);Assert.assertTrue(lu.getSolver().isNonSingular());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86579);lu = new LUDecomposition(MatrixUtils.createRealMatrix(singular));
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86580);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86581);lu = new LUDecomposition(MatrixUtils.createRealMatrix(bigSingular));
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86582);Assert.assertFalse(lu.getSolver().isNonSingular());
    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test matrices values */
    @Test
    public void testMatricesValues1() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18sxz7u1ut3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testMatricesValues1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18sxz7u1ut3(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86583);
       __CLR4_4_11upm1upmlb90pd7d.R.inc(86584);LUDecomposition lu =
            new LUDecomposition(MatrixUtils.createRealMatrix(testData));
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86585);RealMatrix lRef = MatrixUtils.createRealMatrix(new double[][] {
                { 1.0, 0.0, 0.0 },
                { 0.5, 1.0, 0.0 },
                { 0.5, 0.2, 1.0 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86586);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
                { 2.0,  5.0, 3.0 },
                { 0.0, -2.5, 6.5 },
                { 0.0,  0.0, 0.2 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86587);RealMatrix pRef = MatrixUtils.createRealMatrix(new double[][] {
                { 0.0, 1.0, 0.0 },
                { 0.0, 0.0, 1.0 },
                { 1.0, 0.0, 0.0 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86588);int[] pivotRef = { 1, 2, 0 };

        // check values against known references
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86589);RealMatrix l = lu.getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86590);Assert.assertEquals(0, l.subtract(lRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86591);RealMatrix u = lu.getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86592);Assert.assertEquals(0, u.subtract(uRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86593);RealMatrix p = lu.getP();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86594);Assert.assertEquals(0, p.subtract(pRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86595);int[] pivot = lu.getPivot();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86596);for (int i = 0; (((i < pivotRef.length)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86597)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86598)==0&false)); ++i) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86599);Assert.assertEquals(pivotRef[i], pivot[i]);
        }

        // check the same cached instance is returned the second time
        }__CLR4_4_11upm1upmlb90pd7d.R.inc(86600);Assert.assertTrue(l == lu.getL());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86601);Assert.assertTrue(u == lu.getU());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86602);Assert.assertTrue(p == lu.getP());

    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}

    /** test matrices values */
    @Test
    public void testMatricesValues2() {__CLR4_4_11upm1upmlb90pd7d.R.globalSliceStart(getClass().getName(),86603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1xy0b1utn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11upm1upmlb90pd7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11upm1upmlb90pd7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.LUDecompositionTest.testMatricesValues2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1xy0b1utn(){try{__CLR4_4_11upm1upmlb90pd7d.R.inc(86603);
       __CLR4_4_11upm1upmlb90pd7d.R.inc(86604);LUDecomposition lu =
            new LUDecomposition(MatrixUtils.createRealMatrix(luData));
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86605);RealMatrix lRef = MatrixUtils.createRealMatrix(new double[][] {
                {    1.0,    0.0, 0.0 },
                {    0.0,    1.0, 0.0 },
                { 1.0 / 3.0, 0.0, 1.0 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86606);RealMatrix uRef = MatrixUtils.createRealMatrix(new double[][] {
                { 6.0, 9.0,    8.0    },
                { 0.0, 5.0,    7.0    },
                { 0.0, 0.0, 1.0 / 3.0 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86607);RealMatrix pRef = MatrixUtils.createRealMatrix(new double[][] {
                { 0.0, 0.0, 1.0 },
                { 0.0, 1.0, 0.0 },
                { 1.0, 0.0, 0.0 }
        });
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86608);int[] pivotRef = { 2, 1, 0 };

        // check values against known references
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86609);RealMatrix l = lu.getL();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86610);Assert.assertEquals(0, l.subtract(lRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86611);RealMatrix u = lu.getU();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86612);Assert.assertEquals(0, u.subtract(uRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86613);RealMatrix p = lu.getP();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86614);Assert.assertEquals(0, p.subtract(pRef).getNorm(), 1.0e-13);
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86615);int[] pivot = lu.getPivot();
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86616);for (int i = 0; (((i < pivotRef.length)&&(__CLR4_4_11upm1upmlb90pd7d.R.iget(86617)!=0|true))||(__CLR4_4_11upm1upmlb90pd7d.R.iget(86618)==0&false)); ++i) {{
            __CLR4_4_11upm1upmlb90pd7d.R.inc(86619);Assert.assertEquals(pivotRef[i], pivot[i]);
        }

        // check the same cached instance is returned the second time
        }__CLR4_4_11upm1upmlb90pd7d.R.inc(86620);Assert.assertTrue(l == lu.getL());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86621);Assert.assertTrue(u == lu.getU());
        __CLR4_4_11upm1upmlb90pd7d.R.inc(86622);Assert.assertTrue(p == lu.getP());
    }finally{__CLR4_4_11upm1upmlb90pd7d.R.flushNeeded();}}
}
