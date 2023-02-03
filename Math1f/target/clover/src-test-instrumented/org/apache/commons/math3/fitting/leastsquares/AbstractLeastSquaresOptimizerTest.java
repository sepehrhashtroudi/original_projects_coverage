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
package org.apache.commons.math3.fitting.leastsquares;

import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;
/**
 * The only features tested here are utility methods defined
 * in {@link AbstractLeastSquaresOptimizer} that compute the
 * chi-square and parameters standard-deviations.
 */
public class AbstractLeastSquaresOptimizerTest {static class __CLR4_4_11lkf1lkflb90pcjc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testComputeCost() throws IOException {__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceStart(getClass().getName(),74607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3za6f1lkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lkf1lkflb90pcjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest.testComputeCost",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3za6f1lkf() throws IOException{try{__CLR4_4_11lkf1lkflb90pcjc.R.inc(74607);
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74608);final StatisticalReferenceDataset dataset
            = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74609);final double[] a = dataset.getParameters();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74610);final double[] y = dataset.getData()[1];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74611);final double[] w = new double[y.length];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74612);Arrays.fill(w, 1d);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74613);StatisticalReferenceDataset.LeastSquaresProblem problem
            = dataset.getLeastSquaresProblem();

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74614);final LevenbergMarquardtOptimizer optim = LevenbergMarquardtOptimizer.create()
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(y)
            .withWeight(new DiagonalMatrix(w))
            .withStartPoint(a);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74615);final double expected = dataset.getResidualSumOfSquares();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74616);final double cost = optim.computeCost(optim.computeResiduals(optim.getModel().value(optim.getStart())));
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74617);final double actual = cost * cost;
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74618);Assert.assertEquals(dataset.getName(), expected, actual, 1e-11 * expected);
    }finally{__CLR4_4_11lkf1lkflb90pcjc.R.flushNeeded();}}

    @Test
    public void testComputeRMS() throws IOException {__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceStart(getClass().getName(),74619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cer8qu1lkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lkf1lkflb90pcjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest.testComputeRMS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cer8qu1lkr() throws IOException{try{__CLR4_4_11lkf1lkflb90pcjc.R.inc(74619);
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74620);final StatisticalReferenceDataset dataset
            = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74621);final double[] a = dataset.getParameters();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74622);final double[] y = dataset.getData()[1];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74623);final double[] w = new double[y.length];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74624);Arrays.fill(w, 1d);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74625);StatisticalReferenceDataset.LeastSquaresProblem problem
            = dataset.getLeastSquaresProblem();

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74626);final LevenbergMarquardtOptimizer optim = LevenbergMarquardtOptimizer.create()
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(y)
            .withWeight(new DiagonalMatrix(w))
            .withStartPoint(a);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74627);final double expected = FastMath.sqrt(dataset.getResidualSumOfSquares() /
                                              dataset.getNumObservations());
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74628);final double actual = optim.computeRMS(optim.getStart());
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74629);Assert.assertEquals(dataset.getName(), expected, actual, 1e-11 * expected);
    }finally{__CLR4_4_11lkf1lkflb90pcjc.R.flushNeeded();}}

    @Test
    public void testComputeSigma() throws IOException {__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceStart(getClass().getName(),74630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9kc7t1ll2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lkf1lkflb90pcjc.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lkf1lkflb90pcjc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest.testComputeSigma",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9kc7t1ll2() throws IOException{try{__CLR4_4_11lkf1lkflb90pcjc.R.inc(74630);
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74631);final StatisticalReferenceDataset dataset
            = StatisticalReferenceDatasetFactory.createKirby2();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74632);final double[] a = dataset.getParameters();
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74633);final double[] y = dataset.getData()[1];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74634);final double[] w = new double[y.length];
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74635);Arrays.fill(w, 1d);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74636);StatisticalReferenceDataset.LeastSquaresProblem problem
            = dataset.getLeastSquaresProblem();

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74637);final LevenbergMarquardtOptimizer optim = LevenbergMarquardtOptimizer.create()
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(y)
            .withWeight(new DiagonalMatrix(w))
            .withStartPoint(a);

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74638);final double[] expected = dataset.getParametersStandardDeviations();

        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74639);final double cost = optim.computeCost(optim.computeResiduals(optim.getModel().value(optim.getStart())));
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74640);final double[] sig = optim.computeSigma(optim.getStart(), 1e-14);
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74641);final int dof = y.length - a.length;
        __CLR4_4_11lkf1lkflb90pcjc.R.inc(74642);for (int i = 0; (((i < sig.length)&&(__CLR4_4_11lkf1lkflb90pcjc.R.iget(74643)!=0|true))||(__CLR4_4_11lkf1lkflb90pcjc.R.iget(74644)==0&false)); i++) {{
            __CLR4_4_11lkf1lkflb90pcjc.R.inc(74645);final double actual = FastMath.sqrt(cost * cost / dof) * sig[i];
            __CLR4_4_11lkf1lkflb90pcjc.R.inc(74646);Assert.assertEquals(dataset.getName() + ", parameter #" + i,
                                expected[i], actual, 1e-6 * expected[i]);
        }
    }}finally{__CLR4_4_11lkf1lkflb90pcjc.R.flushNeeded();}}
}
