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

import java.math.BigDecimal;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link MatrixUtils} class.
 *
 * @version $Id$
 */

public final class MatrixUtilsTest {static class __CLR4_4_11uvx1uvxlb90pd7y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected double[][] testData = { {1d,2d,3d}, {2d,5d,3d}, {1d,0d,8d} };
    protected double[][] nullMatrix = null;
    protected double[] row = {1,2,3};
    protected BigDecimal[] bigRow =
        {new BigDecimal(1),new BigDecimal(2),new BigDecimal(3)};
    protected String[] stringRow = {"1", "2", "3"};
    protected Fraction[] fractionRow =
        {new Fraction(1),new Fraction(2),new Fraction(3)};
    protected double[][] rowMatrix = {{1,2,3}};
    protected BigDecimal[][] bigRowMatrix =
        {{new BigDecimal(1), new BigDecimal(2), new BigDecimal(3)}};
    protected String[][] stringRowMatrix = {{"1", "2", "3"}};
    protected Fraction[][] fractionRowMatrix =
        {{new Fraction(1), new Fraction(2), new Fraction(3)}};
    protected double[] col = {0,4,6};
    protected BigDecimal[] bigCol =
        {new BigDecimal(0),new BigDecimal(4),new BigDecimal(6)};
    protected String[] stringCol = {"0","4","6"};
    protected Fraction[] fractionCol =
        {new Fraction(0),new Fraction(4),new Fraction(6)};
    protected double[] nullDoubleArray = null;
    protected double[][] colMatrix = {{0},{4},{6}};
    protected BigDecimal[][] bigColMatrix =
        {{new BigDecimal(0)},{new BigDecimal(4)},{new BigDecimal(6)}};
    protected String[][] stringColMatrix = {{"0"}, {"4"}, {"6"}};
    protected Fraction[][] fractionColMatrix =
        {{new Fraction(0)},{new Fraction(4)},{new Fraction(6)}};

    @Test
    public void testCreateRealMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1915d3g1uvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateRealMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1915d3g1uvx(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86685);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86686);Assert.assertEquals(new BlockRealMatrix(testData),
                MatrixUtils.createRealMatrix(testData));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86687);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86688);MatrixUtils.createRealMatrix(new double[][] {{1}, {1,2}});  // ragged
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86689);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86690);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86691);MatrixUtils.createRealMatrix(new double[][] {{}, {}});  // no columns
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86692);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86693);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86694);MatrixUtils.createRealMatrix(null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86695);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testcreateFieldMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8jllg1uw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testcreateFieldMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8jllg1uw8(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86696);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86697);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(asFraction(testData)),
                     MatrixUtils.createFieldMatrix(asFraction(testData)));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86698);Assert.assertEquals(new Array2DRowFieldMatrix<Fraction>(FractionField.getInstance(), fractionColMatrix),
                     MatrixUtils.createFieldMatrix(fractionColMatrix));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86699);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86700);MatrixUtils.createFieldMatrix(asFraction(new double[][] {{1}, {1,2}}));  // ragged
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86701);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86702);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86703);MatrixUtils.createFieldMatrix(asFraction(new double[][] {{}, {}}));  // no columns
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86704);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86705);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86706);MatrixUtils.createFieldMatrix((Fraction[][])null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86707);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCreateRowRealMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luqhg21uwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateRowRealMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luqhg21uwk(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86708);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86709);Assert.assertEquals(MatrixUtils.createRowRealMatrix(row),
                     new BlockRealMatrix(rowMatrix));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86710);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86711);MatrixUtils.createRowRealMatrix(new double[] {});  // empty
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86712);Assert.fail("Expecting NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86713);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86714);MatrixUtils.createRowRealMatrix(null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86715);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCreateRowFieldMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11odpw61uws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateRowFieldMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11odpw61uws(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86716);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86717);Assert.assertEquals(MatrixUtils.createRowFieldMatrix(asFraction(row)),
                     new Array2DRowFieldMatrix<Fraction>(asFraction(rowMatrix)));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86718);Assert.assertEquals(MatrixUtils.createRowFieldMatrix(fractionRow),
                     new Array2DRowFieldMatrix<Fraction>(fractionRowMatrix));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86719);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86720);MatrixUtils.createRowFieldMatrix(new Fraction[] {});  // empty
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86721);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86722);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86723);MatrixUtils.createRowFieldMatrix((Fraction[]) null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86724);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCreateColumnRealMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfo5p21ux1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateColumnRealMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfo5p21ux1(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86725);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86726);Assert.assertEquals(MatrixUtils.createColumnRealMatrix(col),
                     new BlockRealMatrix(colMatrix));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86727);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86728);MatrixUtils.createColumnRealMatrix(new double[] {});  // empty
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86729);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86730);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86731);MatrixUtils.createColumnRealMatrix(null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86732);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCreateColumnFieldMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146gm4e1ux9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateColumnFieldMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146gm4e1ux9(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86733);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86734);Assert.assertEquals(MatrixUtils.createColumnFieldMatrix(asFraction(col)),
                     new Array2DRowFieldMatrix<Fraction>(asFraction(colMatrix)));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86735);Assert.assertEquals(MatrixUtils.createColumnFieldMatrix(fractionCol),
                     new Array2DRowFieldMatrix<Fraction>(fractionColMatrix));

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86736);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86737);MatrixUtils.createColumnFieldMatrix(new Fraction[] {});  // empty
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86738);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86739);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86740);MatrixUtils.createColumnFieldMatrix((Fraction[]) null);  // null
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86741);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    /**
     * Verifies that the matrix is an identity matrix
     */
    protected void checkIdentityMatrix(RealMatrix m) {try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86742);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86743);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86744)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86745)==0&false)); i++) {{
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86746);for (int j =0; (((j < m.getColumnDimension())&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86747)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86748)==0&false)); j++) {{
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86749);if ((((i == j)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86750)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86751)==0&false))) {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86752);Assert.assertEquals(m.getEntry(i, j), 1d, 0);
                } }else {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86753);Assert.assertEquals(m.getEntry(i, j), 0d, 0);
                }
            }}
        }}
    }}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCreateIdentityMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8s7mc1uxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCreateIdentityMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8s7mc1uxu(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86754);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86755);checkIdentityMatrix(MatrixUtils.createRealIdentityMatrix(3));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86756);checkIdentityMatrix(MatrixUtils.createRealIdentityMatrix(2));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86757);checkIdentityMatrix(MatrixUtils.createRealIdentityMatrix(1));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86758);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86759);MatrixUtils.createRealIdentityMatrix(0);
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86760);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    /**
     * Verifies that the matrix is an identity matrix
     */
    protected void checkIdentityFieldMatrix(FieldMatrix<Fraction> m) {try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86761);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86762);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86763)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86764)==0&false)); i++) {{
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86765);for (int j =0; (((j < m.getColumnDimension())&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86766)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86767)==0&false)); j++) {{
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86768);if ((((i == j)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86769)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86770)==0&false))) {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86771);Assert.assertEquals(m.getEntry(i, j), Fraction.ONE);
                } }else {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86772);Assert.assertEquals(m.getEntry(i, j), Fraction.ZERO);
                }
            }}
        }}
    }}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testcreateFieldIdentityMatrix() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssvtte1uyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testcreateFieldIdentityMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssvtte1uyd(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86773);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86774);checkIdentityFieldMatrix(MatrixUtils.createFieldIdentityMatrix(FractionField.getInstance(), 3));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86775);checkIdentityFieldMatrix(MatrixUtils.createFieldIdentityMatrix(FractionField.getInstance(), 2));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86776);checkIdentityFieldMatrix(MatrixUtils.createFieldIdentityMatrix(FractionField.getInstance(), 1));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86777);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86778);MatrixUtils.createRealIdentityMatrix(0);
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86779);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testBigFractionConverter() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4vk2x1uyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testBigFractionConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4vk2x1uyk(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86780);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86781);BigFraction[][] bfData = {
                { new BigFraction(1), new BigFraction(2), new BigFraction(3) },
                { new BigFraction(2), new BigFraction(5), new BigFraction(3) },
                { new BigFraction(1), new BigFraction(0), new BigFraction(8) }
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86782);FieldMatrix<BigFraction> m = new Array2DRowFieldMatrix<BigFraction>(bfData, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86783);RealMatrix converted = MatrixUtils.bigFractionMatrixToRealMatrix(m);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86784);RealMatrix reference = new Array2DRowRealMatrix(testData, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86785);Assert.assertEquals(0.0, converted.subtract(reference).getNorm(), 0.0);
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testFractionConverter() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abu3fx1uyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testFractionConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abu3fx1uyq(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86786);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86787);Fraction[][] fData = {
                { new Fraction(1), new Fraction(2), new Fraction(3) },
                { new Fraction(2), new Fraction(5), new Fraction(3) },
                { new Fraction(1), new Fraction(0), new Fraction(8) }
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86788);FieldMatrix<Fraction> m = new Array2DRowFieldMatrix<Fraction>(fData, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86789);RealMatrix converted = MatrixUtils.fractionMatrixToRealMatrix(m);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86790);RealMatrix reference = new Array2DRowRealMatrix(testData, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86791);Assert.assertEquals(0.0, converted.subtract(reference).getNorm(), 0.0);
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    public static final Fraction[][] asFraction(double[][] data) {try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86792);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86793);Fraction d[][] = new Fraction[data.length][];
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86794);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86795);for (int i = 0; (((i < data.length)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86796)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86797)==0&false)); ++i) {{
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86798);double[] dataI = data[i];
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86799);Fraction[] dI  = new Fraction[dataI.length];
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86800);for (int j = 0; (((j < dataI.length)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86801)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86802)==0&false)); ++j) {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86803);dI[j] = new Fraction(dataI[j]);
                }
                }__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86804);d[i] = dI;
            }
        }} catch (FractionConversionException fce) {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86805);Assert.fail(fce.getMessage());
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86806);return d;
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    public static final Fraction[] asFraction(double[] data) {try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86807);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86808);Fraction d[] = new Fraction[data.length];
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86809);try {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86810);for (int i = 0; (((i < data.length)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86811)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86812)==0&false)); ++i) {{
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86813);d[i] = new Fraction(data[i]);
            }
        }} catch (FractionConversionException fce) {
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86814);Assert.fail(fce.getMessage());
        }
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86815);return d;
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}
  
    @Test 
    public void testSolveLowerTriangularSystem(){__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kjq9r1uzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testSolveLowerTriangularSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kjq9r1uzk(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86816);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86817);RealMatrix rm = new Array2DRowRealMatrix(
                new double[][] { {2,0,0,0 }, { 1,1,0,0 }, { 3,3,3,0 }, { 3,3,3,4 } },
                       false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86818);RealVector b = new ArrayRealVector(new double[] { 2,3,4,8 }, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86819);MatrixUtils.solveLowerTriangularSystem(rm, b);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86820);TestUtils.assertEquals( new double[]{1,2,-1.66666666666667, 1.0}  , b.toArray() , 1.0e-12);
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}
    
     
    /*
     * Taken from R manual http://stat.ethz.ch/R-manual/R-patched/library/base/html/backsolve.html
     */
    @Test
    public void testSolveUpperTriangularSystem(){__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ntmmyq1uzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testSolveUpperTriangularSystem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ntmmyq1uzp(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86821);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86822);RealMatrix rm = new Array2DRowRealMatrix(
                new double[][] { {1,2,3 }, { 0,1,1 }, { 0,0,2 } },
                       false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86823);RealVector b = new ArrayRealVector(new double[] { 8,4,2 }, false);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86824);MatrixUtils.solveUpperTriangularSystem(rm, b);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86825);TestUtils.assertEquals( new double[]{-1,3,1}  , b.toArray() , 1.0e-12);
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    /**
     * This test should probably be replaced by one that could show
     * whether this algorithm can sometimes perform better (precision- or
     * performance-wise) than the direct inversion of the whole matrix.
     */
    @Test
    public void testBlockInverse() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190g6o41uzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testBlockInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190g6o41uzu(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86826);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86827);final double[][] data = {
            { -1, 0, 123, 4 },
            { -56, 78.9, -0.1, -23.4 },
            { 5.67, 8, -9, 1011 },
            { 12, 345, -67.8, 9 },
        };

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86828);final RealMatrix m = new Array2DRowRealMatrix(data);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86829);final int len = data.length;
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86830);final double tol = 1e-14;

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86831);for (int splitIndex = 0; (((splitIndex < 3)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86832)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86833)==0&false)); splitIndex++) {{
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86834);final RealMatrix mInv = MatrixUtils.blockInverse(m, splitIndex);
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86835);final RealMatrix id = m.multiply(mInv);

            // Check that we recovered the identity matrix.
            __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86836);for (int i = 0; (((i < len)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86837)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86838)==0&false)); i++) {{
                __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86839);for (int j = 0; (((j < len)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86840)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86841)==0&false)); j++) {{
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86842);final double entry = id.getEntry(i, j);
                    __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86843);if ((((i == j)&&(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86844)!=0|true))||(__CLR4_4_11uvx1uvxlb90pd7y.R.iget(86845)==0&false))) {{
                        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86846);Assert.assertEquals("[" + i + "][" + j + "]",
                                            1, entry, tol);
                    } }else {{
                        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86847);Assert.assertEquals("[" + i + "][" + j + "]",
                                            0, entry, tol);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test(expected=SingularMatrixException.class)
    public void testBlockInverseNonInvertible() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kia2h1v0g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,108,111,99,107,73,110,118,101,114,115,101,78,111,110,73,110,118,101,114,116,105,98,108,101,58,32,91,83,105,110,103,117,108,97,114,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SingularMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testBlockInverseNonInvertible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kia2h1v0g(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86848);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86849);final double[][] data = {
            { -1, 0, 123, 4 },
            { -56, 78.9, -0.1, -23.4 },
            { 5.67, 8, -9, 1011 },
            { 5.67, 8, -9, 1011 },
        };

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86850);MatrixUtils.blockInverse(new Array2DRowRealMatrix(data), 2);
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testIsSymmetric() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boucim1v0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testIsSymmetric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boucim1v0j(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86851);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86852);final double eps = Math.ulp(1d);

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86853);final double[][] dataSym = {
            { 1, 2, 3 },
            { 2, 2, 5 },
            { 3, 5, 6 },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86854);Assert.assertTrue(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataSym), eps));

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86855);final double[][] dataNonSym = {
            { 1, 2, -3 },
            { 2, 2, 5 },
            { 3, 5, 6 },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86856);Assert.assertFalse(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataNonSym), eps));
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testIsSymmetricTolerance() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sih3t1v0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testIsSymmetricTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sih3t1v0p(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86857);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86858);final double eps = 1e-4;

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86859);final double[][] dataSym1 = {
            { 1,   1, 1.00009 },
            { 1,   1, 1       },
            { 1.0, 1, 1       },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86860);Assert.assertTrue(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataSym1), eps));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86861);final double[][] dataSym2 = {
            { 1,   1, 0.99990 },
            { 1,   1, 1       },
            { 1.0, 1, 1       },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86862);Assert.assertTrue(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataSym2), eps));

        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86863);final double[][] dataNonSym1 = {
            { 1,   1, 1.00011 },
            { 1,   1, 1       },
            { 1.0, 1, 1       },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86864);Assert.assertFalse(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataNonSym1), eps));
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86865);final double[][] dataNonSym2 = {
            { 1,   1, 0.99989 },
            { 1,   1, 1       },
            { 1.0, 1, 1       },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86866);Assert.assertFalse(MatrixUtils.isSymmetric(MatrixUtils.createRealMatrix(dataNonSym2), eps));
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}

    @Test
    public void testCheckSymmetric1() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ros2mv1v0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCheckSymmetric1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ros2mv1v0z(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86867);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86868);final double[][] dataSym = {
            { 1, 2, 3 },
            { 2, 2, 5 },
            { 3, 5, 6 },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86869);MatrixUtils.checkSymmetric(MatrixUtils.createRealMatrix(dataSym), Math.ulp(1d));
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}
    
    @Test(expected=NonSymmetricMatrixException.class)
    public void testCheckSymmetric2() {__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceStart(getClass().getName(),86870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxs1fc1v12();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,104,101,99,107,83,121,109,109,101,116,114,105,99,50,58,32,91,78,111,110,83,121,109,109,101,116,114,105,99,77,97,116,114,105,120,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSymmetricMatrixException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11uvx1uvxlb90pd7y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11uvx1uvxlb90pd7y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.MatrixUtilsTest.testCheckSymmetric2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxs1fc1v12(){try{__CLR4_4_11uvx1uvxlb90pd7y.R.inc(86870);
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86871);final double[][] dataNonSym = {
            { 1, 2, -3 },
            { 2, 2, 5 },
            { 3, 5, 6 },
        };
        __CLR4_4_11uvx1uvxlb90pd7y.R.inc(86872);MatrixUtils.checkSymmetric(MatrixUtils.createRealMatrix(dataNonSym), Math.ulp(1d));
    }finally{__CLR4_4_11uvx1uvxlb90pd7y.R.flushNeeded();}}
}
