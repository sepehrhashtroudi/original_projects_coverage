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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.IterationEvent;
import org.apache.commons.math3.util.IterationListener;
import org.junit.Assert;
import org.junit.Test;

public class ConjugateGradientTest {static class __CLR4_4_11t1b1t1blb90pd3v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,84702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = NonSquareOperatorException.class)
    public void testNonSquareOperator() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pige3n1t1b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,58,32,91,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSquareOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testNonSquareOperator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pige3n1t1b(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84287);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84288);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 3);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84289);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84290);solver = new ConjugateGradient(10, 0., false);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84291);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84292);final ArrayRealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84293);solver.solve(a, b, x);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchRightHandSide() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18igp211t1i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,82,105,103,104,116,72,97,110,100,83,105,100,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testDimensionMismatchRightHandSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18igp211t1i(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84294);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84295);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(3, 3);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84296);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84297);solver = new ConjugateGradient(10, 0., false);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84298);final ArrayRealVector b = new ArrayRealVector(2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84299);final ArrayRealVector x = new ArrayRealVector(3);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84300);solver.solve(a, b, x);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchSolution() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcbote1t1p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,83,111,108,117,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testDimensionMismatchSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcbote1t1p(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84301);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84302);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(3, 3);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84303);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84304);solver = new ConjugateGradient(10, 0., false);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84305);final ArrayRealVector b = new ArrayRealVector(3);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84306);final ArrayRealVector x = new ArrayRealVector(2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84307);solver.solve(a, b, x);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = NonPositiveDefiniteOperatorException.class)
    public void testNonPositiveDefiniteLinearOperator() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uxvlg1t1w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,76,105,110,101,97,114,79,112,101,114,97,116,111,114,58,32,91,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonPositiveDefiniteOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testNonPositiveDefiniteLinearOperator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uxvlg1t1w(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84308);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84309);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84310);a.setEntry(0, 0, -1.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84311);a.setEntry(0, 1, 2.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84312);a.setEntry(1, 0, 3.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84313);a.setEntry(1, 1, 4.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84314);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84315);solver = new ConjugateGradient(10, 0., true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84316);final ArrayRealVector b = new ArrayRealVector(2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84317);b.setEntry(0, -1.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84318);b.setEntry(1, -1.);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84319);final ArrayRealVector x = new ArrayRealVector(2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84320);solver.solve(a, b, x);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedSolution() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19me16q1t29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19me16q1t29(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84321);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84322);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84323);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84324);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84325);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84326);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84327);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84328);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84329);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84330)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84331)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84332);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84333);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84334);final RealVector x = solver.solve(a, b);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84335);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84336)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84337)==0&false)); i++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84338);final double actual = x.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84339);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84340);final double delta = 1E-10 * Math.abs(expected);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84341);final String msg = String.format("entry[%d][%d]", i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84342);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedInPlaceSolutionWithInitialGuess() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngu32x1t2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedInPlaceSolutionWithInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngu32x1t2v(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84343);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84344);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84345);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84346);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84347);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84348);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84349);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84350);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84351);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84352)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84353)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84354);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84355);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84356);final RealVector x0 = new ArrayRealVector(n);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84357);x0.set(1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84358);final RealVector x = solver.solveInPlace(a, b, x0);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84359);Assert.assertSame("x should be a reference to x0", x0, x);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84360);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84361)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84362)==0&false)); i++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84363);final double actual = x.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84364);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84365);final double delta = 1E-10 * Math.abs(expected);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84366);final String msg = String.format("entry[%d][%d)", i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84367);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedSolutionWithInitialGuess() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jgtwb1t3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedSolutionWithInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jgtwb1t3k(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84368);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84369);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84370);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84371);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84372);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84373);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84374);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84375);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84376);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84377)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84378)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84379);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84380);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84381);final RealVector x0 = new ArrayRealVector(n);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84382);x0.set(1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84383);final RealVector x = solver.solve(a, b, x0);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84384);Assert.assertNotSame("x should not be a reference to x0", x0, x);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84385);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84386)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84387)==0&false)); i++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84388);final double actual = x.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84389);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84390);final double delta = 1E-10 * Math.abs(expected);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84391);final String msg = String.format("entry[%d][%d]", i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84392);Assert.assertEquals(msg, expected, actual, delta);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84393);Assert.assertEquals(msg, x0.getEntry(i), 1., Math.ulp(1.));
            }
        }}
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    /**
     * Check whether the estimate of the (updated) residual corresponds to the
     * exact residual. This fails to be true for a large number of iterations,
     * due to the loss of orthogonality of the successive search directions.
     * Therefore, in the present test, the number of iterations is limited.
     */
    @Test
    public void testUnpreconditionedResidual() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6jsi1t4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6jsi1t4a(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84394);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84395);final int n = 10;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84396);final int maxIterations = n;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84397);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84398);final ConjugateGradient solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84399);solver = new ConjugateGradient(maxIterations, 1E-15, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84400);final RealVector r = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84401);final RealVector x = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84402);final IterationListener listener = new IterationListener() {

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84403);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84404);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84405);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84406);final IterativeLinearSolverEvent evt;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84407);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84408);RealVector v = evt.getResidual();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84409);r.setSubVector(0, v);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84410);v = evt.getSolution();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84411);x.setSubVector(0, v);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84412);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84413);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84414);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84415);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84416)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84417)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84418);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84419);b.setEntry(j, 1.);

            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84420);boolean caught = false;
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84421);try {
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84422);solver.solve(a, b);
            } catch (MaxCountExceededException e) {
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84423);caught = true;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84424);final RealVector y = a.operate(x);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84425);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84426)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84427)==0&false)); i++) {{
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84428);final double actual = b.getEntry(i) - y.getEntry(i);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84429);final double expected = r.getEntry(i);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84430);final double delta = 1E-6 * Math.abs(expected);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84431);final String msg = String
                        .format("column %d, residual %d", i, j);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84432);Assert.assertEquals(msg, expected, actual, delta);
                }
            }}
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84433);Assert
                .assertTrue("MaxCountExceededException should have been caught",
                            caught);
        }
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = NonSquareOperatorException.class)
    public void testNonSquarePreconditioner() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvaeak1t5e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,113,117,97,114,101,80,114,101,99,111,110,100,105,116,105,111,110,101,114,58,32,91,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSquareOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testNonSquarePreconditioner",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvaeak1t5e(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84434);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84435);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84436);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84437);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84438);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84439);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84440);return 2;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84441);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84442);return 3;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84443);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84444);solver = new ConjugateGradient(10, 0d, false);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84445);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84446);solver.solve(a, m, b);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testMismatchedOperatorDimensions() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng9mzt1t5r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,115,109,97,116,99,104,101,100,79,112,101,114,97,116,111,114,68,105,109,101,110,115,105,111,110,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testMismatchedOperatorDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng9mzt1t5r(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84447);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84448);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84449);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84450);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84451);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84452);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84453);return 3;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84454);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84455);return 3;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84456);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84457);solver = new ConjugateGradient(10, 0d, false);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84458);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84459);solver.solve(a, m, b);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test(expected = NonPositiveDefiniteOperatorException.class)
    public void testNonPositiveDefinitePreconditioner() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyf1ao1t64();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,80,114,101,99,111,110,100,105,116,105,111,110,101,114,58,32,91,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonPositiveDefiniteOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testNonPositiveDefinitePreconditioner",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyf1ao1t64(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84460);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84461);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84462);a.setEntry(0, 0, 1d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84463);a.setEntry(0, 1, 2d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84464);a.setEntry(1, 0, 3d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84465);a.setEntry(1, 1, 4d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84466);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84467);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84468);final ArrayRealVector y = new ArrayRealVector(2);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84469);y.setEntry(0, -x.getEntry(0));
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84470);y.setEntry(1, x.getEntry(1));
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84471);return y;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84472);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84473);return 2;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84474);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84475);return 2;
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84476);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84477);solver = new ConjugateGradient(10, 0d, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84478);final ArrayRealVector b = new ArrayRealVector(2);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84479);b.setEntry(0, -1d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84480);b.setEntry(1, -1d);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84481);solver.solve(a, m, b);
    }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testPreconditionedSolution() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3mwmv1t6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3mwmv1t6q(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84482);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84483);final int n = 8;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84484);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84485);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84486);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84487);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84488);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84489);solver = new ConjugateGradient(maxIterations, 1E-15, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84490);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84491);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84492)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84493)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84494);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84495);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84496);final RealVector x = solver.solve(a, m, b);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84497);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84498)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84499)==0&false)); i++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84500);final double actual = x.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84501);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84502);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84503);final String msg = String.format("coefficient (%d, %d)", i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84504);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testPreconditionedResidual() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rg7hm31t7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rg7hm31t7d(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84505);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84506);final int n = 10;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84507);final int maxIterations = n;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84508);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84509);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84510);final ConjugateGradient solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84511);solver = new ConjugateGradient(maxIterations, 1E-15, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84512);final RealVector r = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84513);final RealVector x = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84514);final IterationListener listener = new IterationListener() {

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84515);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84516);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84517);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84518);final IterativeLinearSolverEvent evt;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84519);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84520);RealVector v = evt.getResidual();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84521);r.setSubVector(0, v);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84522);v = evt.getSolution();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84523);x.setSubVector(0, v);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84524);
                // Do nothing
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84525);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84526);final RealVector b = new ArrayRealVector(n);

        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84527);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84528)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84529)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84530);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84531);b.setEntry(j, 1.);

            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84532);boolean caught = false;
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84533);try {
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84534);solver.solve(a, m, b);
            } catch (MaxCountExceededException e) {
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84535);caught = true;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84536);final RealVector y = a.operate(x);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84537);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84538)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84539)==0&false)); i++) {{
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84540);final double actual = b.getEntry(i) - y.getEntry(i);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84541);final double expected = r.getEntry(i);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84542);final double delta = 1E-6 * Math.abs(expected);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84543);final String msg = String
                        .format("column %d, residual %d", i, j);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84544);Assert.assertEquals(msg, expected, actual, delta);
                }
            }}
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84545);Assert
                .assertTrue("MaxCountExceededException should have been caught",
                            caught);
        }
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testPreconditionedSolution2() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19viirb1t8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedSolution2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19viirb1t8i(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84546);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84547);final int n = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84548);final int maxIterations = 100000;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84549);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(n, n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84550);double daux = 1.;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84551);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84552)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84553)==0&false)); i++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84554);a.setEntry(i, i, daux);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84555);daux *= 1.2;
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84556);for (int j = i + 1; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84557)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84558)==0&false)); j++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84559);if ((((i == j)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84560)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84561)==0&false))) {{
                } }else {{
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84562);final double value = 1.0;
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84563);a.setEntry(i, j, value);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84564);a.setEntry(j, i, value);
                }
            }}
        }}
        }__CLR4_4_11t1b1t1blb90pd3v.R.inc(84565);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84566);final PreconditionedIterativeLinearSolver pcg;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84567);final IterativeLinearSolver cg;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84568);pcg = new ConjugateGradient(maxIterations, 1E-6, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84569);cg = new ConjugateGradient(maxIterations, 1E-6, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84570);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84571);final String pattern = "preconditioned gradient (%d iterations) should"
                               + " have been faster than unpreconditioned (%d iterations)";
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84572);String msg;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84573);for (int j = 0; (((j < 1)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84574)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84575)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84576);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84577);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84578);final RealVector px = pcg.solve(a, m, b);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84579);final RealVector x = cg.solve(a, b);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84580);final int npcg = pcg.getIterationManager().getIterations();
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84581);final int ncg = cg.getIterationManager().getIterations();
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84582);msg = String.format(pattern, npcg, ncg);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84583);Assert.assertTrue(msg, npcg < ncg);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84584);for (int i = 0; (((i < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84585)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84586)==0&false)); i++) {{
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84587);msg = String.format("row %d, column %d", i, j);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84588);final double expected = x.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84589);final double actual = px.getEntry(i);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84590);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84591);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testEventManagement() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpoinm1t9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testEventManagement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpoinm1t9s(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84592);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84593);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84594);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84595);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84596);final IterativeLinearSolver solver;
        /*
         * count[0] = number of calls to initializationPerformed
         * count[1] = number of calls to iterationStarted
         * count[2] = number of calls to iterationPerformed
         * count[3] = number of calls to terminationPerformed
         */
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84597);final int[] count = new int[] {0, 0, 0, 0};
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84598);final IterationListener listener = new IterationListener() {
            private void doTestVectorsAreUnmodifiable(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84599);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84600);final IterativeLinearSolverEvent evt;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84601);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84602);try {
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84603);evt.getResidual().set(0.0);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84604);Assert.fail("r is modifiable");
                } catch (MathUnsupportedOperationException exc){
                    // Expected behavior
                }
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84605);try {
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84606);evt.getRightHandSideVector().set(0.0);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84607);Assert.fail("b is modifiable");
                } catch (MathUnsupportedOperationException exc){
                    // Expected behavior
                }
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84608);try {
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84609);evt.getSolution().set(0.0);
                    __CLR4_4_11t1b1t1blb90pd3v.R.inc(84610);Assert.fail("x is modifiable");
                } catch (MathUnsupportedOperationException exc){
                    // Expected behavior
                }
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84611);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84612);++count[0];
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84613);doTestVectorsAreUnmodifiable(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84614);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84615);++count[2];
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84616);Assert.assertEquals("iteration performed",
                    count[2], e.getIterations() - 1);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84617);doTestVectorsAreUnmodifiable(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84618);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84619);++count[1];
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84620);Assert.assertEquals("iteration started",
                    count[1], e.getIterations() - 1);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84621);doTestVectorsAreUnmodifiable(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84622);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84623);++count[3];
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84624);doTestVectorsAreUnmodifiable(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84625);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84626);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84627);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84628);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84629)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84630)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84631);Arrays.fill(count, 0);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84632);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84633);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84634);solver.solve(a, b);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84635);String msg = String.format("column %d (initialization)", j);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84636);Assert.assertEquals(msg, 1, count[0]);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84637);msg = String.format("column %d (finalization)", j);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84638);Assert.assertEquals(msg, 1, count[3]);
        }
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedNormOfResidual() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryaibl1tb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testUnpreconditionedNormOfResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryaibl1tb3(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84639);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84640);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84641);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84642);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84643);final IterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84644);final IterationListener listener = new IterationListener() {

            private void doTestNormOfResidual(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84645);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84646);final IterativeLinearSolverEvent evt;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84647);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84648);final RealVector x = evt.getSolution();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84649);final RealVector b = evt.getRightHandSideVector();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84650);final RealVector r = b.subtract(a.operate(x));
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84651);final double rnorm = r.getNorm();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84652);Assert.assertEquals("iteration performed (residual)",
                    rnorm, evt.getNormOfResidual(),
                    FastMath.max(1E-5 * rnorm, 1E-10));
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84653);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84654);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84655);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84656);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84657);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84658);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84659);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84660);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84661);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84662);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84663);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84664);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84665)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84666)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84667);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84668);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84669);solver.solve(a, b);
        }
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

    @Test
    public void testPreconditionedNormOfResidual() {__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceStart(getClass().getName(),84670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6q56w1tby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11t1b1t1blb90pd3v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11t1b1t1blb90pd3v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ConjugateGradientTest.testPreconditionedNormOfResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6q56w1tby(){try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84670);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84671);final int n = 5;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84672);final int maxIterations = 100;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84673);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84674);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84675);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84676);final IterationListener listener = new IterationListener() {

            private void doTestNormOfResidual(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84677);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84678);final IterativeLinearSolverEvent evt;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84679);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84680);final RealVector x = evt.getSolution();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84681);final RealVector b = evt.getRightHandSideVector();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84682);final RealVector r = b.subtract(a.operate(x));
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84683);final double rnorm = r.getNorm();
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84684);Assert.assertEquals("iteration performed (residual)",
                    rnorm, evt.getNormOfResidual(),
                    FastMath.max(1E-5 * rnorm, 1E-10));
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84685);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84686);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84687);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84688);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84689);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84690);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11t1b1t1blb90pd3v.R.inc(84691);
                __CLR4_4_11t1b1t1blb90pd3v.R.inc(84692);doTestNormOfResidual(e);
            }finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
        };
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84693);solver = new ConjugateGradient(maxIterations, 1E-10, true);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84694);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84695);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11t1b1t1blb90pd3v.R.inc(84696);for (int j = 0; (((j < n)&&(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84697)!=0|true))||(__CLR4_4_11t1b1t1blb90pd3v.R.iget(84698)==0&false)); j++) {{
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84699);b.set(0.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84700);b.setEntry(j, 1.);
            __CLR4_4_11t1b1t1blb90pd3v.R.inc(84701);solver.solve(a, m, b);
        }
    }}finally{__CLR4_4_11t1b1t1blb90pd3v.R.flushNeeded();}}
}
