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

package org.apache.commons.math3.ode.sampling;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.junit.Test;

/** Base class for step normalizer output tests. */
public abstract class StepNormalizerOutputTestBase
    implements FirstOrderDifferentialEquations, FixedStepHandler {static class __CLR4_4_120sz20szlb90pdoo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The normalized output time values. */
    private List<Double> output;

    /**
     * Returns the start time.
     * @return the start time
     */
    protected abstract double getStart();

    /**
     * Returns the end time.
     * @return the end time
     */
    protected abstract double getEnd();

    /**
     * Returns the expected normalized output time values for increment mode.
     * @return the expected normalized output time values for increment mode
     */
    protected abstract double[] getExpInc();

    /**
     * Returns the expected reversed normalized output time values for
     * increment mode.
     * @return the expected reversed normalized output time values for
     * increment mode
     */
    protected abstract double[] getExpIncRev();

    /**
     * Returns the expected normalized output time values for multiples mode.
     * @return the expected normalized output time values for multiples mode
     */
    protected abstract double[] getExpMul();

    /**
     * Returns the expected reversed normalized output time values for
     * multiples mode.
     * @return the expected reversed normalized output time values for
     * multiples mode
     */
    protected abstract double[] getExpMulRev();

    /**
     * Returns the offsets for the unit tests below, in the order they are
     * given below. For each test, the left and right offsets are returned.
     * @return the offsets for the unit tests below, in the order they are
     * given below
     */
    protected abstract int[][] getO();

    /**
     * Get the array, given left and right offsets.
     * @param a the input array
     * @param offsetL the left side offset
     * @param offsetR the right side offset
     * @return the modified array
     */
    private double[] getArray(double[] a, int offsetL, int offsetR) {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94355);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94356);double[] copy = new double[a.length - offsetR - offsetL];
        __CLR4_4_120sz20szlb90pdoo.R.inc(94357);System.arraycopy(a, offsetL, copy, 0, copy.length);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94358);return copy;
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncNeither()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w636620t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeither",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w636620t3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94359);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94360);double[] exp = getArray(getExpInc(), getO()[0][0], getO()[0][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94361);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.NEITHER, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncNeitherRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18u1y6520t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18u1y6520t6() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94362);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94363);double[] exp = getArray(getExpIncRev(), getO()[1][0], getO()[1][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94364);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.NEITHER, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncFirst()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5b8q320t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5b8q320t9() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94365);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94366);double[] exp = getArray(getExpInc(), getO()[2][0], getO()[2][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94367);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.FIRST, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncFirstRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0idl220tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0idl220tc() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94368);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94369);double[] exp = getArray(getExpIncRev(), getO()[3][0], getO()[3][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94370);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.FIRST, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncLast()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oj411z20tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oj411z20tf() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94371);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94372);double[] exp = getArray(getExpInc(), getO()[4][0], getO()[4][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94373);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.LAST, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncLastRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7uz0o20ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7uz0o20ti() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94374);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94375);double[] exp = getArray(getExpIncRev(), getO()[5][0], getO()[5][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94376);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.LAST, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncBoth()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu79ro20tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu79ro20tl() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94377);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94378);double[] exp = getArray(getExpInc(), getO()[6][0], getO()[6][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94379);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.BOTH, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testIncBothRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t31d2520to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t31d2520to() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94380);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94381);double[] exp = getArray(getExpIncRev(), getO()[7][0], getO()[7][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94382);doTest(StepNormalizerMode.INCREMENT, StepNormalizerBounds.BOTH, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulNeither()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8u4ig20tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeither",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8u4ig20tr() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94383);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94384);double[] exp = getArray(getExpMul(), getO()[8][0], getO()[8][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94385);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.NEITHER, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulNeitherRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb58bt20tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb58bt20tu() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94386);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94387);double[] exp = getArray(getExpMulRev(), getO()[9][0], getO()[9][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94388);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.NEITHER, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulFirst()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkk22j20tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkk22j20tx() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94389);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94390);double[] exp = getArray(getExpMul(), getO()[10][0], getO()[10][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94391);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.FIRST, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulFirstRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143sh2k20u0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143sh2k20u0() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94392);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94393);double[] exp = getArray(getExpMulRev(), getO()[11][0], getO()[11][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94394);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.FIRST, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulLast()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j03hgx20u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLast",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j03hgx20u3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94395);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94396);double[] exp = getArray(getExpMul(), getO()[12][0], getO()[12][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94397);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.LAST, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulLastRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ex58ny20u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ex58ny20u6() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94398);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94399);double[] exp = getArray(getExpMulRev(), getO()[13][0], getO()[13][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94400);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.LAST, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulBoth()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zd7tcq20u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zd7tcq20u9() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94401);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94402);double[] exp = getArray(getExpMul(), getO()[14][0], getO()[14][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94403);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.BOTH, exp, false);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    @Test
    public void testMulBothRev()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120sz20szlb90pdoo.R.globalSliceStart(getClass().getName(),94404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111yumh20uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120sz20szlb90pdoo.R.rethrow($CLV_t2$);}finally{__CLR4_4_120sz20szlb90pdoo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111yumh20uc() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120sz20szlb90pdoo.R.inc(94404);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94405);double[] exp = getArray(getExpMulRev(), getO()[15][0], getO()[15][1]);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94406);doTest(StepNormalizerMode.MULTIPLES, StepNormalizerBounds.BOTH, exp, true);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    /**
     * The actual step normalizer output test code, shared by all the unit
     * tests.
     *
     * @param mode the step normalizer mode to use
     * @param bounds the step normalizer bounds setting to use
     * @param expected the expected output (normalized time points)
     * @param reverse whether to reverse the integration direction
     * @throws NoBracketingException 
     * @throws MaxCountExceededException 
     * @throws NumberIsTooSmallException 
     * @throws DimensionMismatchException 
     */
    private void doTest(StepNormalizerMode mode, StepNormalizerBounds bounds,
                        double[] expected, boolean reverse)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94407);
        // Forward test.
        __CLR4_4_120sz20szlb90pdoo.R.inc(94408);FirstOrderIntegrator integ = new GraggBulirschStoerIntegrator(
                                                        1e-8, 1.0, 1e-5, 1e-5);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94409);integ.addStepHandler(new StepNormalizer(0.5, this, mode, bounds));
        __CLR4_4_120sz20szlb90pdoo.R.inc(94410);double[] y   = {0.0};
        __CLR4_4_120sz20szlb90pdoo.R.inc(94411);double start = (((reverse )&&(__CLR4_4_120sz20szlb90pdoo.R.iget(94412)!=0|true))||(__CLR4_4_120sz20szlb90pdoo.R.iget(94413)==0&false))? getEnd()   : getStart();
        __CLR4_4_120sz20szlb90pdoo.R.inc(94414);double end   = (((reverse )&&(__CLR4_4_120sz20szlb90pdoo.R.iget(94415)!=0|true))||(__CLR4_4_120sz20szlb90pdoo.R.iget(94416)==0&false))? getStart() : getEnd();
        __CLR4_4_120sz20szlb90pdoo.R.inc(94417);output       = new ArrayList<Double>();
        __CLR4_4_120sz20szlb90pdoo.R.inc(94418);integ.integrate(this, start, y, end, y);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94419);double[] actual = new double[output.size()];
        __CLR4_4_120sz20szlb90pdoo.R.inc(94420);for(int i = 0; (((i < actual.length)&&(__CLR4_4_120sz20szlb90pdoo.R.iget(94421)!=0|true))||(__CLR4_4_120sz20szlb90pdoo.R.iget(94422)==0&false)); i++) {{
            __CLR4_4_120sz20szlb90pdoo.R.inc(94423);actual[i] = output.get(i);
        }
        }__CLR4_4_120sz20szlb90pdoo.R.inc(94424);Assert.assertArrayEquals(expected, actual, 1e-5);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94425);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94426);return 1;
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94427);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94428);yDot[0] = y[0];
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94429);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void handleStep(double t, double[] y, double[] yDot, boolean isLast) {try{__CLR4_4_120sz20szlb90pdoo.R.inc(94430);
        __CLR4_4_120sz20szlb90pdoo.R.inc(94431);output.add(t);
    }finally{__CLR4_4_120sz20szlb90pdoo.R.flushNeeded();}}

}
