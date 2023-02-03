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

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;

public class FieldLUDecompositionTest {static class __CLR4_4_11tuz1tuzlb90pd5d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,85525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Fraction[][] testData = {
            { new Fraction(1), new Fraction(2), new Fraction(3)},
            { new Fraction(2), new Fraction(5), new Fraction(3)},
            { new Fraction(1), new Fraction(0), new Fraction(8)}
    };
    private Fraction[][] testDataMinus = {
            { new Fraction(-1), new Fraction(-2), new Fraction(-3)},
            { new Fraction(-2), new Fraction(-5), new Fraction(-3)},
            { new Fraction(-1),  new Fraction(0), new Fraction(-8)}
    };
    private Fraction[][] luData = {
            { new Fraction(2), new Fraction(3), new Fraction(3) },
            { new Fraction(2), new Fraction(3), new Fraction(7) },
            { new Fraction(6), new Fraction(6), new Fraction(8) }
    };

    // singular matrices
    private Fraction[][] singular = {
            { new Fraction(2), new Fraction(3) },
            { new Fraction(2), new Fraction(3) }
    };
    private Fraction[][] bigSingular = {
            { new Fraction(1), new Fraction(2),   new Fraction(3),    new Fraction(4) },
            { new Fraction(2), new Fraction(5),   new Fraction(3),    new Fraction(4) },
            { new Fraction(7), new Fraction(3), new Fraction(256), new Fraction(1930) },
            { new Fraction(3), new Fraction(7),   new Fraction(6),    new Fraction(8) }
    }; // 4th row = 1st + 2nd

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21tuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21tuz(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85355);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85356);FieldMatrix<Fraction> matrix =
            new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85357);FieldLUDecomposition<Fraction> LU = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85358);Assert.assertEquals(testData.length, LU.getL().getRowDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85359);Assert.assertEquals(testData.length, LU.getL().getColumnDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85360);Assert.assertEquals(testData.length, LU.getU().getRowDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85361);Assert.assertEquals(testData.length, LU.getU().getColumnDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85362);Assert.assertEquals(testData.length, LU.getP().getRowDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85363);Assert.assertEquals(testData.length, LU.getP().getColumnDimension());

    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test non-square matrix */
    @Test
    public void testNonSquare() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1tv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1tv8(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85364);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85365);try {
            // we don't use FractionField.getInstance() for testing purposes
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85366);new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(new Fraction[][] {
                    { Fraction.ZERO, Fraction.ZERO },
                    { Fraction.ZERO, Fraction.ZERO },
                    { Fraction.ZERO, Fraction.ZERO }
            }));
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85367);Assert.fail("Expected NonSquareMatrixException");
        } catch (NonSquareMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test PA = LU */
    @Test
    public void testPAEqualLU() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk29mp1tvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testPAEqualLU",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk29mp1tvc(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85368);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85369);FieldMatrix<Fraction> matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85370);FieldLUDecomposition<Fraction> lu = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85371);FieldMatrix<Fraction> l = lu.getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85372);FieldMatrix<Fraction> u = lu.getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85373);FieldMatrix<Fraction> p = lu.getP();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85374);TestUtils.assertEquals(p.multiply(matrix), l.multiply(u));

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85375);matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testDataMinus);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85376);lu = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85377);l = lu.getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85378);u = lu.getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85379);p = lu.getP();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85380);TestUtils.assertEquals(p.multiply(matrix), l.multiply(u));

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85381);matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), 17, 17);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85382);for (int i = 0; (((i < matrix.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85383)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85384)==0&false)); ++i) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85385);matrix.setEntry(i, i, Fraction.ONE);
        }
        }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85386);lu = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85387);l = lu.getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85388);u = lu.getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85389);p = lu.getP();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85390);TestUtils.assertEquals(p.multiply(matrix), l.multiply(u));

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85391);matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), singular);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85392);lu = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85393);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85394);Assert.assertNull(lu.getL());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85395);Assert.assertNull(lu.getU());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85396);Assert.assertNull(lu.getP());

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85397);matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), bigSingular);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85398);lu = new FieldLUDecomposition<Fraction>(matrix);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85399);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85400);Assert.assertNull(lu.getL());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85401);Assert.assertNull(lu.getU());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85402);Assert.assertNull(lu.getP());

    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test that L is lower triangular with unit diagonal */
    @Test
    public void testLLowerTriangular() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya57fp1twb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testLLowerTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya57fp1twb(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85403);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85404);FieldMatrix<Fraction> matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85405);FieldMatrix<Fraction> l = new FieldLUDecomposition<Fraction>(matrix).getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85406);for (int i = 0; (((i < l.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85407)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85408)==0&false)); i++) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85409);Assert.assertEquals(Fraction.ONE, l.getEntry(i, i));
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85410);for (int j = i + 1; (((j < l.getColumnDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85411)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85412)==0&false)); j++) {{
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85413);Assert.assertEquals(Fraction.ZERO, l.getEntry(i, j));
            }
        }}
    }}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test that U is upper triangular */
    @Test
    public void testUUpperTriangular() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvl4il1twm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testUUpperTriangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvl4il1twm(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85414);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85415);FieldMatrix<Fraction> matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85416);FieldMatrix<Fraction> u = new FieldLUDecomposition<Fraction>(matrix).getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85417);for (int i = 0; (((i < u.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85418)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85419)==0&false)); i++) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85420);for (int j = 0; (((j < i)&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85421)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85422)==0&false)); j++) {{
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85423);Assert.assertEquals(Fraction.ZERO, u.getEntry(i, j));
            }
        }}
    }}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test that P is a permutation matrix */
    @Test
    public void testPPermutation() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fhhrj1tww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testPPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fhhrj1tww(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85424);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85425);FieldMatrix<Fraction> matrix = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85426);FieldMatrix<Fraction> p   = new FieldLUDecomposition<Fraction>(matrix).getP();

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85427);FieldMatrix<Fraction> ppT = p.multiply(p.transpose());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85428);FieldMatrix<Fraction> id  =
            new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(),
                                          p.getRowDimension(), p.getRowDimension());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85429);for (int i = 0; (((i < id.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85430)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85431)==0&false)); ++i) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85432);id.setEntry(i, i, Fraction.ONE);
        }
        }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85433);TestUtils.assertEquals(id, ppT);

        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85434);for (int i = 0; (((i < p.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85435)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85436)==0&false)); i++) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85437);int zeroCount  = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85438);int oneCount   = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85439);int otherCount = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85440);for (int j = 0; (((j < p.getColumnDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85441)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85442)==0&false)); j++) {{
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85443);final Fraction e = p.getEntry(i, j);
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85444);if ((((e.equals(Fraction.ZERO))&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85445)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85446)==0&false))) {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85447);++zeroCount;
                } }else {__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85448);if ((((e.equals(Fraction.ONE))&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85449)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85450)==0&false))) {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85451);++oneCount;
                } }else {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85452);++otherCount;
                }
            }}}
            }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85453);Assert.assertEquals(p.getColumnDimension() - 1, zeroCount);
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85454);Assert.assertEquals(1, oneCount);
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85455);Assert.assertEquals(0, otherCount);
        }

        }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85456);for (int j = 0; (((j < p.getColumnDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85457)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85458)==0&false)); j++) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85459);int zeroCount  = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85460);int oneCount   = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85461);int otherCount = 0;
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85462);for (int i = 0; (((i < p.getRowDimension())&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85463)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85464)==0&false)); i++) {{
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85465);final Fraction e = p.getEntry(i, j);
                __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85466);if ((((e.equals(Fraction.ZERO))&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85467)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85468)==0&false))) {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85469);++zeroCount;
                } }else {__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85470);if ((((e.equals(Fraction.ONE))&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85471)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85472)==0&false))) {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85473);++oneCount;
                } }else {{
                    __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85474);++otherCount;
                }
            }}}
            }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85475);Assert.assertEquals(p.getRowDimension() - 1, zeroCount);
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85476);Assert.assertEquals(1, oneCount);
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85477);Assert.assertEquals(0, otherCount);
        }

    }}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}


    /** test singular */
    @Test
    public void testSingular() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p0sts1tye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p0sts1tye(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85478);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85479);FieldLUDecomposition<Fraction> lu =
            new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData));
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85480);Assert.assertTrue(lu.getSolver().isNonSingular());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85481);lu = new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), singular));
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85482);Assert.assertFalse(lu.getSolver().isNonSingular());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85483);lu = new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), bigSingular));
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85484);Assert.assertFalse(lu.getSolver().isNonSingular());
    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test matrices values */
    @Test
    public void testMatricesValues1() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18sxz7u1tyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testMatricesValues1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18sxz7u1tyl(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85485);
       __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85486);FieldLUDecomposition<Fraction> lu =
            new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), testData));
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85487);FieldMatrix<Fraction> lRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(1), new Fraction(0), new Fraction(0) },
                { new Fraction(2), new Fraction(1), new Fraction(0) },
                { new Fraction(1), new Fraction(-2), new Fraction(1) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85488);FieldMatrix<Fraction> uRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(1),  new Fraction(2), new Fraction(3) },
                { new Fraction(0), new Fraction(1), new Fraction(-3) },
                { new Fraction(0),  new Fraction(0), new Fraction(-1) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85489);FieldMatrix<Fraction> pRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(1), new Fraction(0), new Fraction(0) },
                { new Fraction(0), new Fraction(1), new Fraction(0) },
                { new Fraction(0), new Fraction(0), new Fraction(1) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85490);int[] pivotRef = { 0, 1, 2 };

        // check values against known references
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85491);FieldMatrix<Fraction> l = lu.getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85492);TestUtils.assertEquals(lRef, l);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85493);FieldMatrix<Fraction> u = lu.getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85494);TestUtils.assertEquals(uRef, u);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85495);FieldMatrix<Fraction> p = lu.getP();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85496);TestUtils.assertEquals(pRef, p);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85497);int[] pivot = lu.getPivot();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85498);for (int i = 0; (((i < pivotRef.length)&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85499)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85500)==0&false)); ++i) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85501);Assert.assertEquals(pivotRef[i], pivot[i]);
        }

        // check the same cached instance is returned the second time
        }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85502);Assert.assertTrue(l == lu.getL());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85503);Assert.assertTrue(u == lu.getU());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85504);Assert.assertTrue(p == lu.getP());

    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}

    /** test matrices values */
    @Test
    public void testMatricesValues2() {__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceStart(getClass().getName(),85505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1xy0b1tz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tuz1tuzlb90pd5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tuz1tuzlb90pd5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.FieldLUDecompositionTest.testMatricesValues2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1xy0b1tz5(){try{__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85505);
       __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85506);FieldLUDecomposition<Fraction> lu =
            new FieldLUDecomposition<Fraction>(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), luData));
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85507);FieldMatrix<Fraction> lRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(1), new Fraction(0), new Fraction(0) },
                { new Fraction(3), new Fraction(1), new Fraction(0) },
                { new Fraction(1), new Fraction(0), new Fraction(1) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85508);FieldMatrix<Fraction> uRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(2), new Fraction(3), new Fraction(3)    },
                { new Fraction(0), new Fraction(-3), new Fraction(-1)  },
                { new Fraction(0), new Fraction(0), new Fraction(4) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85509);FieldMatrix<Fraction> pRef = new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), new Fraction[][] {
                { new Fraction(1), new Fraction(0), new Fraction(0) },
                { new Fraction(0), new Fraction(0), new Fraction(1) },
                { new Fraction(0), new Fraction(1), new Fraction(0) }
        });
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85510);int[] pivotRef = { 0, 2, 1 };

        // check values against known references
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85511);FieldMatrix<Fraction> l = lu.getL();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85512);TestUtils.assertEquals(lRef, l);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85513);FieldMatrix<Fraction> u = lu.getU();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85514);TestUtils.assertEquals(uRef, u);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85515);FieldMatrix<Fraction> p = lu.getP();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85516);TestUtils.assertEquals(pRef, p);
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85517);int[] pivot = lu.getPivot();
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85518);for (int i = 0; (((i < pivotRef.length)&&(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85519)!=0|true))||(__CLR4_4_11tuz1tuzlb90pd5d.R.iget(85520)==0&false)); ++i) {{
            __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85521);Assert.assertEquals(pivotRef[i], pivot[i]);
        }

        // check the same cached instance is returned the second time
        }__CLR4_4_11tuz1tuzlb90pd5d.R.inc(85522);Assert.assertTrue(l == lu.getL());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85523);Assert.assertTrue(u == lu.getU());
        __CLR4_4_11tuz1tuzlb90pd5d.R.inc(85524);Assert.assertTrue(p == lu.getP());
    }finally{__CLR4_4_11tuz1tuzlb90pd5d.R.flushNeeded();}}
}
