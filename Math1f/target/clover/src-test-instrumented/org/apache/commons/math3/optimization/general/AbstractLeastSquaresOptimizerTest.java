/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.optimization.general;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Assert;

import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {static class __CLR4_4_125kk25kklb90pe1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,100583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static AbstractLeastSquaresOptimizer createOptimizer() {try{__CLR4_4_125kk25kklb90pe1q.R.inc(100532);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100533);return new AbstractLeastSquaresOptimizer(null) {

            @Override
            protected PointVectorValuePair doOptimize() {try{__CLR4_4_125kk25kklb90pe1q.R.inc(100534);
                __CLR4_4_125kk25kklb90pe1q.R.inc(100535);final double[] params = getStartPoint();
                __CLR4_4_125kk25kklb90pe1q.R.inc(100536);final double[] res = computeResiduals(computeObjectiveValue(params));
                __CLR4_4_125kk25kklb90pe1q.R.inc(100537);setCost(computeCost(res));
                __CLR4_4_125kk25kklb90pe1q.R.inc(100538);return new PointVectorValuePair(params, null);
            }finally{__CLR4_4_125kk25kklb90pe1q.R.flushNeeded();}}
        };
    }finally{__CLR4_4_125kk25kklb90pe1q.R.flushNeeded();}}

    @Test
    public void testGetChiSquare() throws IOException {__CLR4_4_125kk25kklb90pe1q.R.globalSliceStart(getClass().getName(),100539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0z6h025kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125kk25kklb90pe1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_125kk25kklb90pe1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest.testGetChiSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0z6h025kr() throws IOException{try{__CLR4_4_125kk25kklb90pe1q.R.inc(100539);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100540);final StatisticalReferenceDataset dataset;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100541);dataset = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100542);final AbstractLeastSquaresOptimizer optimizer;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100543);optimizer = createOptimizer();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100544);final double[] a = dataset.getParameters();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100545);final double[] y = dataset.getData()[1];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100546);final double[] w = new double[y.length];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100547);Arrays.fill(w, 1.0);

        __CLR4_4_125kk25kklb90pe1q.R.inc(100548);optimizer.optimize(1, dataset.getLeastSquaresProblem(), y, w, a);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100549);final double expected = dataset.getResidualSumOfSquares();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100550);final double actual = optimizer.getChiSquare();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100551);Assert.assertEquals(dataset.getName(), expected, actual,
                            1E-11 * expected);
    }finally{__CLR4_4_125kk25kklb90pe1q.R.flushNeeded();}}

    @Test
    public void testGetRMS() throws IOException {__CLR4_4_125kk25kklb90pe1q.R.globalSliceStart(getClass().getName(),100552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3yvyz25l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125kk25kklb90pe1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_125kk25kklb90pe1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest.testGetRMS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3yvyz25l4() throws IOException{try{__CLR4_4_125kk25kklb90pe1q.R.inc(100552);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100553);final StatisticalReferenceDataset dataset;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100554);dataset = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100555);final AbstractLeastSquaresOptimizer optimizer;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100556);optimizer = createOptimizer();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100557);final double[] a = dataset.getParameters();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100558);final double[] y = dataset.getData()[1];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100559);final double[] w = new double[y.length];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100560);Arrays.fill(w, 1.0);

        __CLR4_4_125kk25kklb90pe1q.R.inc(100561);optimizer.optimize(1, dataset.getLeastSquaresProblem(), y, w, a);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100562);final double expected = FastMath
            .sqrt(dataset.getResidualSumOfSquares() /
                  dataset.getNumObservations());
        __CLR4_4_125kk25kklb90pe1q.R.inc(100563);final double actual = optimizer.getRMS();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100564);Assert.assertEquals(dataset.getName(), expected, actual,
                            1E-11 * expected);
    }finally{__CLR4_4_125kk25kklb90pe1q.R.flushNeeded();}}

    @Test
    public void testComputeSigma() throws IOException {__CLR4_4_125kk25kklb90pe1q.R.globalSliceStart(getClass().getName(),100565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9kc7t25lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125kk25kklb90pe1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_125kk25kklb90pe1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest.testComputeSigma",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9kc7t25lh() throws IOException{try{__CLR4_4_125kk25kklb90pe1q.R.inc(100565);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100566);final StatisticalReferenceDataset dataset;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100567);dataset = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100568);final AbstractLeastSquaresOptimizer optimizer;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100569);optimizer = createOptimizer();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100570);final double[] a = dataset.getParameters();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100571);final double[] y = dataset.getData()[1];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100572);final double[] w = new double[y.length];
        __CLR4_4_125kk25kklb90pe1q.R.inc(100573);Arrays.fill(w, 1.0);

        __CLR4_4_125kk25kklb90pe1q.R.inc(100574);final int dof = y.length - a.length;
        __CLR4_4_125kk25kklb90pe1q.R.inc(100575);final PointVectorValuePair optimum = optimizer.optimize(1, dataset.getLeastSquaresProblem(), y, w, a);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100576);final double[] sig = optimizer.computeSigma(optimum.getPoint(), 1e-14);
        __CLR4_4_125kk25kklb90pe1q.R.inc(100577);final double[] expected = dataset.getParametersStandardDeviations();
        __CLR4_4_125kk25kklb90pe1q.R.inc(100578);for (int i = 0; (((i < sig.length)&&(__CLR4_4_125kk25kklb90pe1q.R.iget(100579)!=0|true))||(__CLR4_4_125kk25kklb90pe1q.R.iget(100580)==0&false)); i++) {{
            __CLR4_4_125kk25kklb90pe1q.R.inc(100581);final double actual = FastMath.sqrt(optimizer.getChiSquare() / dof) * sig[i];
            __CLR4_4_125kk25kklb90pe1q.R.inc(100582);Assert.assertEquals(dataset.getName() + ", parameter #" + i,
                                expected[i], actual, 1e-7 * expected[i]);
        }
    }}finally{__CLR4_4_125kk25kklb90pe1q.R.flushNeeded();}}
}
