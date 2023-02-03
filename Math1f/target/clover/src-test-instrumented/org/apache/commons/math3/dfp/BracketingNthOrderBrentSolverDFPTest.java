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

package org.apache.commons.math3.dfp;

import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for {@link BracketingNthOrderBrentSolverDFP bracketing n<sup>th</sup> order Brent} solver.
 *
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class BracketingNthOrderBrentSolverDFPTest {static class __CLR4_4_11i5p1i5plb90pc81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,70266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=NumberIsTooSmallException.class)
    public void testInsufficientOrder3() {__CLR4_4_11i5p1i5plb90pc81.R.globalSliceStart(getClass().getName(),70189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ku2wv1i5p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,115,117,102,102,105,99,105,101,110,116,79,114,100,101,114,51,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i5p1i5plb90pc81.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i5p1i5plb90pc81.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest.testInsufficientOrder3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ku2wv1i5p(){try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70189);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70190);new BracketingNthOrderBrentSolverDFP(relativeAccuracy, absoluteAccuracy,
                                             functionValueAccuracy, 1);
    }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    @Test
    public void testConstructorOK() {__CLR4_4_11i5p1i5plb90pc81.R.globalSliceStart(getClass().getName(),70191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnn3qj1i5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i5p1i5plb90pc81.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i5p1i5plb90pc81.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest.testConstructorOK",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnn3qj1i5r(){try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70191);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70192);BracketingNthOrderBrentSolverDFP solver =
                new BracketingNthOrderBrentSolverDFP(relativeAccuracy, absoluteAccuracy,
                                                     functionValueAccuracy, 2);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70193);Assert.assertEquals(2, solver.getMaximalOrder());
    }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    @Test
    public void testConvergenceOnFunctionAccuracy() {__CLR4_4_11i5p1i5plb90pc81.R.globalSliceStart(getClass().getName(),70194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg84s61i5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i5p1i5plb90pc81.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i5p1i5plb90pc81.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest.testConvergenceOnFunctionAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg84s61i5u(){try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70194);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70195);BracketingNthOrderBrentSolverDFP solver =
                new BracketingNthOrderBrentSolverDFP(relativeAccuracy, absoluteAccuracy,
                                                     field.newDfp(1.0e-20), 20);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70196);UnivariateDfpFunction f = new UnivariateDfpFunction() {
            public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70197);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70198);Dfp one     = field.getOne();
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70199);Dfp oneHalf = one.divide(2);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70200);Dfp xMo     = x.subtract(one);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70201);Dfp xMh     = x.subtract(oneHalf);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70202);Dfp xPh     = x.add(oneHalf);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70203);Dfp xPo     = x.add(one);
                __CLR4_4_11i5p1i5plb90pc81.R.inc(70204);return xMo.multiply(xMh).multiply(x).multiply(xPh).multiply(xPo);
            }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
        };

        __CLR4_4_11i5p1i5plb90pc81.R.inc(70205);Dfp result = solver.solve(20, f, field.newDfp(0.2), field.newDfp(0.9),
                                  field.newDfp(0.4), AllowedSolution.BELOW_SIDE);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70206);Assert.assertTrue(f.value(result).abs().lessThan(solver.getFunctionValueAccuracy()));
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70207);Assert.assertTrue(f.value(result).negativeOrNull());
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70208);Assert.assertTrue(result.subtract(field.newDfp(0.5)).subtract(solver.getAbsoluteAccuracy()).positiveOrNull());
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70209);result = solver.solve(20, f, field.newDfp(-0.9), field.newDfp(-0.2),
                              field.newDfp(-0.4), AllowedSolution.ABOVE_SIDE);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70210);Assert.assertTrue(f.value(result).abs().lessThan(solver.getFunctionValueAccuracy()));
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70211);Assert.assertTrue(f.value(result).positiveOrNull());
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70212);Assert.assertTrue(result.add(field.newDfp(0.5)).subtract(solver.getAbsoluteAccuracy()).negativeOrNull());
    }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    @Test
    public void testNeta() {__CLR4_4_11i5p1i5plb90pc81.R.globalSliceStart(getClass().getName(),70213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e03fz11i6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i5p1i5plb90pc81.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i5p1i5plb90pc81.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest.testNeta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e03fz11i6d(){try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70213);

        // the following test functions come from Beny Neta's paper:
        // "Several New Methods for solving Equations"
        // intern J. Computer Math Vol 23 pp 265-282
        // available here: http://www.math.nps.navy.mil/~bneta/SeveralNewMethods.PDF
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70214);for (AllowedSolution allowed : AllowedSolution.values()) {{
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70215);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70216);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70217);return DfpMath.sin(x).subtract(x.divide(2));
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, -2.0, 2.0, allowed);

            __CLR4_4_11i5p1i5plb90pc81.R.inc(70218);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70219);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70220);return DfpMath.pow(x, 5).add(x).subtract(field.newDfp(10000));
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, -5.0, 10.0, allowed);

            __CLR4_4_11i5p1i5plb90pc81.R.inc(70221);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70222);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70223);return x.sqrt().subtract(field.getOne().divide(x)).subtract(field.newDfp(3));
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, 0.001, 10.0, allowed);

            __CLR4_4_11i5p1i5plb90pc81.R.inc(70224);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70225);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70226);return DfpMath.exp(x).add(x).subtract(field.newDfp(20));
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, -5.0, 5.0, allowed);

            __CLR4_4_11i5p1i5plb90pc81.R.inc(70227);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70228);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70229);return DfpMath.log(x).add(x.sqrt()).subtract(field.newDfp(5));
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, 0.001, 10.0, allowed);

            __CLR4_4_11i5p1i5plb90pc81.R.inc(70230);check(new UnivariateDfpFunction() {
                public Dfp value(Dfp x) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70231);
                    __CLR4_4_11i5p1i5plb90pc81.R.inc(70232);return x.subtract(field.getOne()).multiply(x).multiply(x).subtract(field.getOne());
                }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}
            }, 200, -0.5, 1.5, allowed);
        }

    }}finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    private void check(UnivariateDfpFunction f, int maxEval, double min, double max,
                       AllowedSolution allowedSolution) {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70233);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70234);BracketingNthOrderBrentSolverDFP solver =
                new BracketingNthOrderBrentSolverDFP(relativeAccuracy, absoluteAccuracy,
                                                     functionValueAccuracy, 20);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70235);Dfp xResult = solver.solve(maxEval, f, field.newDfp(min), field.newDfp(max),
                                   allowedSolution);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70236);Dfp yResult = f.value(xResult);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11i5p1i5plb90pc81.R.inc(70237);switch (allowedSolution) {
        case ANY_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70238);__CLB4_4_1_bool0=true;}
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70239);Assert.assertTrue(yResult.abs().lessThan(functionValueAccuracy.multiply(2)));
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70240);break;
        case LEFT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70241);__CLB4_4_1_bool0=true;} {
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70242);boolean increasing = f.value(xResult).add(absoluteAccuracy).greaterThan(yResult);
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70243);Assert.assertTrue((((increasing )&&(__CLR4_4_11i5p1i5plb90pc81.R.iget(70244)!=0|true))||(__CLR4_4_11i5p1i5plb90pc81.R.iget(70245)==0&false))? yResult.negativeOrNull() : yResult.positiveOrNull());
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70246);break;
        }
        case RIGHT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70247);__CLB4_4_1_bool0=true;} {
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70248);boolean increasing = f.value(xResult).add(absoluteAccuracy).greaterThan(yResult);
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70249);Assert.assertTrue((((increasing )&&(__CLR4_4_11i5p1i5plb90pc81.R.iget(70250)!=0|true))||(__CLR4_4_11i5p1i5plb90pc81.R.iget(70251)==0&false))? yResult.positiveOrNull() : yResult.negativeOrNull());
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70252);break;
        }
        case BELOW_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70253);__CLB4_4_1_bool0=true;}
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70254);Assert.assertTrue(yResult.negativeOrNull());
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70255);break;
        case ABOVE_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70256);__CLB4_4_1_bool0=true;}
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70257);Assert.assertTrue(yResult.positiveOrNull());
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70258);break;
        default :if (!__CLB4_4_1_bool0) {__CLR4_4_11i5p1i5plb90pc81.R.inc(70259);__CLB4_4_1_bool0=true;}
            // this should never happen
            __CLR4_4_11i5p1i5plb90pc81.R.inc(70260);throw new MathInternalError(null);
        }
    }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    @Before
    public void setUp() {try{__CLR4_4_11i5p1i5plb90pc81.R.inc(70261);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70262);field                 = new DfpField(50);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70263);absoluteAccuracy      = field.newDfp(1.0e-45);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70264);relativeAccuracy      = field.newDfp(1.0e-45);
        __CLR4_4_11i5p1i5plb90pc81.R.inc(70265);functionValueAccuracy = field.newDfp(1.0e-45);
    }finally{__CLR4_4_11i5p1i5plb90pc81.R.flushNeeded();}}

    private DfpField field;
    private Dfp      absoluteAccuracy;
    private Dfp      relativeAccuracy;
    private Dfp      functionValueAccuracy;

}
