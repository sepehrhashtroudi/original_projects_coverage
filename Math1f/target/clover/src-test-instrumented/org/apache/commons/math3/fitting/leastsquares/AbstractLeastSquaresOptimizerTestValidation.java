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

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;

/**
 * This class demonstrates the main functionality of the
 * {@link AbstractLeastSquaresOptimizer}, common to the
 * optimizer implementations in package
 * {@link org.apache.commons.math3.fitting.leastsquares}.
 * <br/>
 * Not enabled by default, as the class name does not end with "Test".
 * <br/>
 * Invoke by running
 * <pre><code>
 *  mvn test -Dtest=AbstractLeastSquaresOptimizerTestValidation
 * </code></pre>
 * or by running
 * <pre><code>
 *  mvn test -Dtest=AbstractLeastSquaresOptimizerTestValidation -DargLine="-DmcRuns=1234 -server"
 * </code></pre>
 */
public class AbstractLeastSquaresOptimizerTestValidation {static class __CLR4_4_11llj1lljlb90pcjh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Number of runs. */
    private static final int MONTE_CARLO_RUNS = Integer.parseInt(System.getProperty("mcRuns",
                                                                                    "100"));

    /**
     * Using a Monte-Carlo procedure, this test checks the error estimations
     * as provided by the square-root of the diagonal elements of the
     * covariance matrix.
     * <br/>
     * The test generates sets of observations, each sampled from
     * a Gaussian distribution.
     * <br/>
     * The optimization problem solved is defined in class
     * {@link StraightLineProblem}.
     * <br/>
     * The output (on stdout) will be a table summarizing the distribution
     * of parameters generated by the Monte-Carlo process and by the direct
     * estimation provided by the diagonal elements of the covariance matrix.
     */
    @Test
    public void testParametersErrorMonteCarloObservations() {__CLR4_4_11llj1lljlb90pcjh.R.globalSliceStart(getClass().getName(),74647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxkces1llj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11llj1lljlb90pcjh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11llj1lljlb90pcjh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloObservations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxkces1llj(){try{__CLR4_4_11llj1lljlb90pcjh.R.inc(74647);
        // Error on the observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74648);final double yError = 15;

        // True values of the parameters.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74649);final double slope = 123.456;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74650);final double offset = -98.765;

        // Samples generator.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74651);final RandomStraightLinePointGenerator lineGenerator
            = new RandomStraightLinePointGenerator(slope, offset,
                                                   yError,
                                                   -1e3, 1e4,
                                                   138577L);

        // Number of observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74652);final int numObs = 100; // XXX Should be a command-line option.
        // number of parameters.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74653);final int numParams = 2;

        // Parameters found for each of Monte-Carlo run.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74654);final SummaryStatistics[] paramsFoundByDirectSolution = new SummaryStatistics[numParams];
        // Sigma estimations (square-root of the diagonal elements of the
        // covariance matrix), for each Monte-Carlo run.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74655);final SummaryStatistics[] sigmaEstimate = new SummaryStatistics[numParams];

        // Initialize statistics accumulators.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74656);for (int i = 0; (((i < numParams)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74657)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74658)==0&false)); i++) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74659);paramsFoundByDirectSolution[i] = new SummaryStatistics();
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74660);sigmaEstimate[i] = new SummaryStatistics();
        }

        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74661);final double[] init = { slope, offset };

        // Monte-Carlo (generates many sets of observations).
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74662);final int mcRepeat = MONTE_CARLO_RUNS;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74663);int mcCount = 0;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74664);while ((((mcCount < mcRepeat)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74665)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74666)==0&false))) {{
            // Observations.
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74667);final Point2D.Double[] obs = lineGenerator.generate(numObs);

            __CLR4_4_11llj1lljlb90pcjh.R.inc(74668);final StraightLineProblem problem = new StraightLineProblem(yError);
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74669);for (int i = 0; (((i < numObs)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74670)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74671)==0&false)); i++) {{
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74672);final Point2D.Double p = obs[i];
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74673);problem.addPoint(p.x, p.y);
            }

            // Direct solution (using simple regression).
            }__CLR4_4_11llj1lljlb90pcjh.R.inc(74674);final double[] regress = problem.solve();

            // Estimation of the standard deviation (diagonal elements of the
            // covariance matrix).
            // Dummy optimizer (to compute the covariance matrix).
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74675);final AbstractLeastSquaresOptimizer optim = LevenbergMarquardtOptimizer.create()
                .withModelAndJacobian(problem.getModelFunction(),
                                      problem.getModelFunctionJacobian())
                .withTarget(problem.target())
                .withWeight(new DiagonalMatrix(problem.weight()));

            __CLR4_4_11llj1lljlb90pcjh.R.inc(74676);final double[] sigma = optim.computeSigma(init, 1e-14);

            // Accumulate statistics.
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74677);for (int i = 0; (((i < numParams)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74678)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74679)==0&false)); i++) {{
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74680);paramsFoundByDirectSolution[i].addValue(regress[i]);
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74681);sigmaEstimate[i].addValue(sigma[i]);
            }

            // Next Monte-Carlo.
            }__CLR4_4_11llj1lljlb90pcjh.R.inc(74682);++mcCount;
        }

        // Print statistics.
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74683);final String line = "--------------------------------------------------------------";
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74684);System.out.println("                 True value       Mean        Std deviation");
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74685);for (int i = 0; (((i < numParams)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74686)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74687)==0&false)); i++) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74688);System.out.println(line);
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74689);System.out.println("Parameter #" + i);

            __CLR4_4_11llj1lljlb90pcjh.R.inc(74690);StatisticalSummary s = paramsFoundByDirectSolution[i].getSummary();
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74691);System.out.printf("              %+.6e   %+.6e   %+.6e\n",
                              init[i],
                              s.getMean(),
                              s.getStandardDeviation());

            __CLR4_4_11llj1lljlb90pcjh.R.inc(74692);s = sigmaEstimate[i].getSummary();
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74693);System.out.printf("sigma: %+.6e (%+.6e)\n",
                              s.getMean(),
                              s.getStandardDeviation());
        }
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74694);System.out.println(line);

        // Check the error estimation.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74695);for (int i = 0; (((i < numParams)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74696)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74697)==0&false)); i++) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74698);Assert.assertEquals(paramsFoundByDirectSolution[i].getSummary().getStandardDeviation(),
                                sigmaEstimate[i].getSummary().getMean(),
                                8e-2);
        }
    }}finally{__CLR4_4_11llj1lljlb90pcjh.R.flushNeeded();}}

    /**
     * In this test, the set of observations is fixed.
     * Using a Monte-Carlo procedure, it generates sets of parameters,
     * and determine the parameter change that will result in the
     * normalized chi-square becoming larger by one than the value from
     * the best fit solution.
     * <br/>
     * The optimization problem solved is defined in class
     * {@link StraightLineProblem}.
     * <br/>
     * The output (on stdout) will be a list of lines containing:
     * <ul>
     *  <li>slope of the straight line,</li>
     *  <li>intercept of the straight line,</li>
     *  <li>chi-square of the solution defined by the above two values.</li>
     * </ul>
     * The output is separated into two blocks (with a blank line between
     * them); the first block will contain all parameter sets for which
     * {@code chi2 < chi2_b + 1}
     * and the second block, all sets for which
     * {@code chi2 >= chi2_b + 1}
     * where {@code chi2_b} is the lowest chi-square (corresponding to the
     * best solution).
     */
    @Test
    public void testParametersErrorMonteCarloParameters() {__CLR4_4_11llj1lljlb90pcjh.R.globalSliceStart(getClass().getName(),74699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2m9ef1lmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11llj1lljlb90pcjh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11llj1lljlb90pcjh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2m9ef1lmz(){try{__CLR4_4_11llj1lljlb90pcjh.R.inc(74699);
        // Error on the observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74700);final double yError = 15;

        // True values of the parameters.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74701);final double slope = 123.456;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74702);final double offset = -98.765;

        // Samples generator.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74703);final RandomStraightLinePointGenerator lineGenerator
            = new RandomStraightLinePointGenerator(slope, offset,
                                                   yError,
                                                   -1e3, 1e4,
                                                   13839013L);

        // Number of observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74704);final int numObs = 10;
        // number of parameters.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74705);final int numParams = 2;

        // Create a single set of observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74706);final Point2D.Double[] obs = lineGenerator.generate(numObs);

        __CLR4_4_11llj1lljlb90pcjh.R.inc(74707);final StraightLineProblem problem = new StraightLineProblem(yError);
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74708);for (int i = 0; (((i < numObs)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74709)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74710)==0&false)); i++) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74711);final Point2D.Double p = obs[i];
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74712);problem.addPoint(p.x, p.y);
        }

        // Direct solution (using simple regression).
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74713);final double[] regress = problem.solve();

        // Dummy optimizer (to compute the chi-square).
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74714);final AbstractLeastSquaresOptimizer optim = LevenbergMarquardtOptimizer.create()
            .withModelAndJacobian(problem.getModelFunction(),
                                  problem.getModelFunctionJacobian())
            .withTarget(problem.target())
            .withWeight(new DiagonalMatrix(problem.weight()));

        __CLR4_4_11llj1lljlb90pcjh.R.inc(74715);final double[] init = { slope, offset };
        // Get chi-square of the best parameters set for the given set of
        // observations.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74716);final double bestChi2N = getChi2N(optim, problem, regress);
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74717);final double[] sigma = optim.computeSigma(regress, 1e-14);

        // Monte-Carlo (generates a grid of parameters).
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74718);final int mcRepeat = MONTE_CARLO_RUNS;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74719);final int gridSize = (int) FastMath.sqrt(mcRepeat);

        // Parameters found for each of Monte-Carlo run.
        // Index 0 = slope
        // Index 1 = offset
        // Index 2 = normalized chi2
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74720);final List<double[]> paramsAndChi2 = new ArrayList<double[]>(gridSize * gridSize);

        __CLR4_4_11llj1lljlb90pcjh.R.inc(74721);final double slopeRange = 10 * sigma[0];
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74722);final double offsetRange = 10 * sigma[1];
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74723);final double minSlope = slope - 0.5 * slopeRange;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74724);final double minOffset = offset - 0.5 * offsetRange;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74725);final double deltaSlope =  slopeRange/ gridSize;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74726);final double deltaOffset = offsetRange / gridSize;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74727);for (int i = 0; (((i < gridSize)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74728)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74729)==0&false)); i++) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74730);final double s = minSlope + i * deltaSlope;
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74731);for (int j = 0; (((j < gridSize)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74732)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74733)==0&false)); j++) {{
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74734);final double o = minOffset + j * deltaOffset;
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74735);final double chi2N = getChi2N(optim, problem, new double[] {s, o});

                __CLR4_4_11llj1lljlb90pcjh.R.inc(74736);paramsAndChi2.add(new double[] {s, o, chi2N});
            }
        }}

        // Output (for use with "gnuplot").

        // Some info.

        // For plotting separately sets of parameters that have a large chi2.
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74737);final double chi2NPlusOne = bestChi2N + 1;
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74738);int numLarger = 0;

        __CLR4_4_11llj1lljlb90pcjh.R.inc(74739);final String lineFmt = "%+.10e %+.10e   %.8e\n";

        // Point with smallest chi-square.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74740);System.out.printf(lineFmt, regress[0], regress[1], bestChi2N);
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74741);System.out.println(); // Empty line.

        // Points within the confidence interval.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74742);for (double[] d : paramsAndChi2) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74743);if ((((d[2] <= chi2NPlusOne)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74744)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74745)==0&false))) {{
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74746);System.out.printf(lineFmt, d[0], d[1], d[2]);
            }
        }}
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74747);System.out.println(); // Empty line.

        // Points outside the confidence interval.
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74748);for (double[] d : paramsAndChi2) {{
            __CLR4_4_11llj1lljlb90pcjh.R.inc(74749);if ((((d[2] > chi2NPlusOne)&&(__CLR4_4_11llj1lljlb90pcjh.R.iget(74750)!=0|true))||(__CLR4_4_11llj1lljlb90pcjh.R.iget(74751)==0&false))) {{
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74752);++numLarger;
                __CLR4_4_11llj1lljlb90pcjh.R.inc(74753);System.out.printf(lineFmt, d[0], d[1], d[2]);
            }
        }}
        }__CLR4_4_11llj1lljlb90pcjh.R.inc(74754);System.out.println(); // Empty line.

        __CLR4_4_11llj1lljlb90pcjh.R.inc(74755);System.out.println("# sigma=" + Arrays.toString(sigma));
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74756);System.out.println("# " + numLarger + " sets filtered out");
    }finally{__CLR4_4_11llj1lljlb90pcjh.R.flushNeeded();}}

    /**
     * @return the normalized chi-square.
     */
    private double getChi2N(AbstractLeastSquaresOptimizer optim,
                            StraightLineProblem problem,
                            double[] params) {try{__CLR4_4_11llj1lljlb90pcjh.R.inc(74757);
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74758);final double[] t = problem.target();
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74759);final double[] w = problem.weight();
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74760);final double cost = optim.computeCost(optim.computeResiduals(optim.getModel().value(params)));
        __CLR4_4_11llj1lljlb90pcjh.R.inc(74761);return cost * cost / (t.length - params.length);
    }finally{__CLR4_4_11llj1lljlb90pcjh.R.flushNeeded();}}
}

