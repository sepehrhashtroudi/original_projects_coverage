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
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;

/**
 * This class demonstrates the main functionality of the
 * {@link AbstractLeastSquaresOptimizer}, common to the
 * optimizer implementations in package
 * {@link org.apache.commons.math3.optimization.general}.
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
public class AbstractLeastSquaresOptimizerTestValidation {static class __CLR4_4_122qp22qplb90pdv0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void testParametersErrorMonteCarloObservations() {__CLR4_4_122qp22qplb90pdv0.R.globalSliceStart(getClass().getName(),96865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxkces22qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122qp22qplb90pdv0.R.rethrow($CLV_t2$);}finally{__CLR4_4_122qp22qplb90pdv0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloObservations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxkces22qp(){try{__CLR4_4_122qp22qplb90pdv0.R.inc(96865);
        // Error on the observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96866);final double yError = 15;

        // True values of the parameters.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96867);final double slope = 123.456;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96868);final double offset = -98.765;

        // Samples generator.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96869);final RandomStraightLinePointGenerator lineGenerator
            = new RandomStraightLinePointGenerator(slope, offset,
                                                   yError,
                                                   -1e3, 1e4,
                                                   138577L);

        // Number of observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96870);final int numObs = 100; // XXX Should be a command-line option.
        // number of parameters.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96871);final int numParams = 2;

        // Parameters found for each of Monte-Carlo run.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96872);final SummaryStatistics[] paramsFoundByDirectSolution = new SummaryStatistics[numParams];
        // Sigma estimations (square-root of the diagonal elements of the
        // covariance matrix), for each Monte-Carlo run.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96873);final SummaryStatistics[] sigmaEstimate = new SummaryStatistics[numParams];

        // Initialize statistics accumulators.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96874);for (int i = 0; (((i < numParams)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96875)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96876)==0&false)); i++) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96877);paramsFoundByDirectSolution[i] = new SummaryStatistics();
            __CLR4_4_122qp22qplb90pdv0.R.inc(96878);sigmaEstimate[i] = new SummaryStatistics();
        }

        // Dummy optimizer (to compute the covariance matrix).
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96879);final AbstractLeastSquaresOptimizer optim = new DummyOptimizer();
        __CLR4_4_122qp22qplb90pdv0.R.inc(96880);final double[] init = { slope, offset };

        // Monte-Carlo (generates many sets of observations).
        __CLR4_4_122qp22qplb90pdv0.R.inc(96881);final int mcRepeat = MONTE_CARLO_RUNS;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96882);int mcCount = 0;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96883);while ((((mcCount < mcRepeat)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96884)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96885)==0&false))) {{
            // Observations.
            __CLR4_4_122qp22qplb90pdv0.R.inc(96886);final Point2D.Double[] obs = lineGenerator.generate(numObs);

            __CLR4_4_122qp22qplb90pdv0.R.inc(96887);final StraightLineProblem problem = new StraightLineProblem(yError);
            __CLR4_4_122qp22qplb90pdv0.R.inc(96888);for (int i = 0; (((i < numObs)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96889)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96890)==0&false)); i++) {{
                __CLR4_4_122qp22qplb90pdv0.R.inc(96891);final Point2D.Double p = obs[i];
                __CLR4_4_122qp22qplb90pdv0.R.inc(96892);problem.addPoint(p.x, p.y);
            }

            // Direct solution (using simple regression).
            }__CLR4_4_122qp22qplb90pdv0.R.inc(96893);final double[] regress = problem.solve();

            // Estimation of the standard deviation (diagonal elements of the
            // covariance matrix).
            __CLR4_4_122qp22qplb90pdv0.R.inc(96894);final PointVectorValuePair optimum
                = optim.optimize(new MaxEval(Integer.MAX_VALUE),
                                 problem.getModelFunction(),
                                 problem.getModelFunctionJacobian(),
                                 new Target(problem.target()),
                                 new Weight(problem.weight()),
                                 new InitialGuess(init));
            __CLR4_4_122qp22qplb90pdv0.R.inc(96895);final double[] sigma = optim.computeSigma(optimum.getPoint(), 1e-14);

            // Accumulate statistics.
            __CLR4_4_122qp22qplb90pdv0.R.inc(96896);for (int i = 0; (((i < numParams)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96897)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96898)==0&false)); i++) {{
                __CLR4_4_122qp22qplb90pdv0.R.inc(96899);paramsFoundByDirectSolution[i].addValue(regress[i]);
                __CLR4_4_122qp22qplb90pdv0.R.inc(96900);sigmaEstimate[i].addValue(sigma[i]);
            }

            // Next Monte-Carlo.
            }__CLR4_4_122qp22qplb90pdv0.R.inc(96901);++mcCount;
        }

        // Print statistics.
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96902);final String line = "--------------------------------------------------------------";
        __CLR4_4_122qp22qplb90pdv0.R.inc(96903);System.out.println("                 True value       Mean        Std deviation");
        __CLR4_4_122qp22qplb90pdv0.R.inc(96904);for (int i = 0; (((i < numParams)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96905)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96906)==0&false)); i++) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96907);System.out.println(line);
            __CLR4_4_122qp22qplb90pdv0.R.inc(96908);System.out.println("Parameter #" + i);

            __CLR4_4_122qp22qplb90pdv0.R.inc(96909);StatisticalSummary s = paramsFoundByDirectSolution[i].getSummary();
            __CLR4_4_122qp22qplb90pdv0.R.inc(96910);System.out.printf("              %+.6e   %+.6e   %+.6e\n",
                              init[i],
                              s.getMean(),
                              s.getStandardDeviation());

            __CLR4_4_122qp22qplb90pdv0.R.inc(96911);s = sigmaEstimate[i].getSummary();
            __CLR4_4_122qp22qplb90pdv0.R.inc(96912);System.out.printf("sigma: %+.6e (%+.6e)\n",
                              s.getMean(),
                              s.getStandardDeviation());
        }
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96913);System.out.println(line);

        // Check the error estimation.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96914);for (int i = 0; (((i < numParams)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96915)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96916)==0&false)); i++) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96917);Assert.assertEquals(paramsFoundByDirectSolution[i].getSummary().getStandardDeviation(),
                                sigmaEstimate[i].getSummary().getMean(),
                                8e-2);
        }
    }}finally{__CLR4_4_122qp22qplb90pdv0.R.flushNeeded();}}

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
    public void testParametersErrorMonteCarloParameters() {__CLR4_4_122qp22qplb90pdv0.R.globalSliceStart(getClass().getName(),96918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2m9ef22s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_122qp22qplb90pdv0.R.rethrow($CLV_t2$);}finally{__CLR4_4_122qp22qplb90pdv0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2m9ef22s6(){try{__CLR4_4_122qp22qplb90pdv0.R.inc(96918);
        // Error on the observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96919);final double yError = 15;

        // True values of the parameters.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96920);final double slope = 123.456;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96921);final double offset = -98.765;

        // Samples generator.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96922);final RandomStraightLinePointGenerator lineGenerator
            = new RandomStraightLinePointGenerator(slope, offset,
                                                   yError,
                                                   -1e3, 1e4,
                                                   13839013L);

        // Number of observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96923);final int numObs = 10;
        // number of parameters.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96924);final int numParams = 2;

        // Create a single set of observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96925);final Point2D.Double[] obs = lineGenerator.generate(numObs);

        __CLR4_4_122qp22qplb90pdv0.R.inc(96926);final StraightLineProblem problem = new StraightLineProblem(yError);
        __CLR4_4_122qp22qplb90pdv0.R.inc(96927);for (int i = 0; (((i < numObs)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96928)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96929)==0&false)); i++) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96930);final Point2D.Double p = obs[i];
            __CLR4_4_122qp22qplb90pdv0.R.inc(96931);problem.addPoint(p.x, p.y);
        }

        // Direct solution (using simple regression).
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96932);final double[] regress = problem.solve();

        // Dummy optimizer (to compute the chi-square).
        __CLR4_4_122qp22qplb90pdv0.R.inc(96933);final AbstractLeastSquaresOptimizer optim = new DummyOptimizer();
        __CLR4_4_122qp22qplb90pdv0.R.inc(96934);final double[] init = { slope, offset };
        // Get chi-square of the best parameters set for the given set of
        // observations.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96935);final double bestChi2N = getChi2N(optim, problem, regress);
        __CLR4_4_122qp22qplb90pdv0.R.inc(96936);final double[] sigma = optim.computeSigma(regress, 1e-14);

        // Monte-Carlo (generates a grid of parameters).
        __CLR4_4_122qp22qplb90pdv0.R.inc(96937);final int mcRepeat = MONTE_CARLO_RUNS;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96938);final int gridSize = (int) FastMath.sqrt(mcRepeat);

        // Parameters found for each of Monte-Carlo run.
        // Index 0 = slope
        // Index 1 = offset
        // Index 2 = normalized chi2
        __CLR4_4_122qp22qplb90pdv0.R.inc(96939);final List<double[]> paramsAndChi2 = new ArrayList<double[]>(gridSize * gridSize);

        __CLR4_4_122qp22qplb90pdv0.R.inc(96940);final double slopeRange = 10 * sigma[0];
        __CLR4_4_122qp22qplb90pdv0.R.inc(96941);final double offsetRange = 10 * sigma[1];
        __CLR4_4_122qp22qplb90pdv0.R.inc(96942);final double minSlope = slope - 0.5 * slopeRange;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96943);final double minOffset = offset - 0.5 * offsetRange;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96944);final double deltaSlope =  slopeRange/ gridSize;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96945);final double deltaOffset = offsetRange / gridSize;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96946);for (int i = 0; (((i < gridSize)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96947)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96948)==0&false)); i++) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96949);final double s = minSlope + i * deltaSlope;
            __CLR4_4_122qp22qplb90pdv0.R.inc(96950);for (int j = 0; (((j < gridSize)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96951)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96952)==0&false)); j++) {{
                __CLR4_4_122qp22qplb90pdv0.R.inc(96953);final double o = minOffset + j * deltaOffset;
                __CLR4_4_122qp22qplb90pdv0.R.inc(96954);final double chi2N = getChi2N(optim, problem, new double[] {s, o});

                __CLR4_4_122qp22qplb90pdv0.R.inc(96955);paramsAndChi2.add(new double[] {s, o, chi2N});
            }
        }}

        // Output (for use with "gnuplot").

        // Some info.

        // For plotting separately sets of parameters that have a large chi2.
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96956);final double chi2NPlusOne = bestChi2N + 1;
        __CLR4_4_122qp22qplb90pdv0.R.inc(96957);int numLarger = 0;

        __CLR4_4_122qp22qplb90pdv0.R.inc(96958);final String lineFmt = "%+.10e %+.10e   %.8e\n";

        // Point with smallest chi-square.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96959);System.out.printf(lineFmt, regress[0], regress[1], bestChi2N);
        __CLR4_4_122qp22qplb90pdv0.R.inc(96960);System.out.println(); // Empty line.

        // Points within the confidence interval.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96961);for (double[] d : paramsAndChi2) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96962);if ((((d[2] <= chi2NPlusOne)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96963)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96964)==0&false))) {{
                __CLR4_4_122qp22qplb90pdv0.R.inc(96965);System.out.printf(lineFmt, d[0], d[1], d[2]);
            }
        }}
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96966);System.out.println(); // Empty line.

        // Points outside the confidence interval.
        __CLR4_4_122qp22qplb90pdv0.R.inc(96967);for (double[] d : paramsAndChi2) {{
            __CLR4_4_122qp22qplb90pdv0.R.inc(96968);if ((((d[2] > chi2NPlusOne)&&(__CLR4_4_122qp22qplb90pdv0.R.iget(96969)!=0|true))||(__CLR4_4_122qp22qplb90pdv0.R.iget(96970)==0&false))) {{
                __CLR4_4_122qp22qplb90pdv0.R.inc(96971);++numLarger;
                __CLR4_4_122qp22qplb90pdv0.R.inc(96972);System.out.printf(lineFmt, d[0], d[1], d[2]);
            }
        }}
        }__CLR4_4_122qp22qplb90pdv0.R.inc(96973);System.out.println(); // Empty line.

        __CLR4_4_122qp22qplb90pdv0.R.inc(96974);System.out.println("# sigma=" + Arrays.toString(sigma));
        __CLR4_4_122qp22qplb90pdv0.R.inc(96975);System.out.println("# " + numLarger + " sets filtered out");
    }finally{__CLR4_4_122qp22qplb90pdv0.R.flushNeeded();}}

    /**
     * @return the normalized chi-square.
     */
    private double getChi2N(AbstractLeastSquaresOptimizer optim,
                            StraightLineProblem problem,
                            double[] params) {try{__CLR4_4_122qp22qplb90pdv0.R.inc(96976);
        __CLR4_4_122qp22qplb90pdv0.R.inc(96977);final double[] t = problem.target();
        __CLR4_4_122qp22qplb90pdv0.R.inc(96978);final double[] w = problem.weight();

        __CLR4_4_122qp22qplb90pdv0.R.inc(96979);optim.optimize(new MaxEval(Integer.MAX_VALUE),
                       problem.getModelFunction(),
                       problem.getModelFunctionJacobian(),
                       new Target(t),
                       new Weight(w),
                       new InitialGuess(params));

        __CLR4_4_122qp22qplb90pdv0.R.inc(96980);return optim.getChiSquare() / (t.length - params.length);
    }finally{__CLR4_4_122qp22qplb90pdv0.R.flushNeeded();}}
}

/**
 * A dummy optimizer.
 * Used for computing the covariance matrix.
 */
class DummyOptimizer extends AbstractLeastSquaresOptimizer {public static class __CLR4_4_122qp22txlb90pdv1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public DummyOptimizer() {
        super(null);__CLR4_4_122qp22txlb90pdv1.R.inc(96982);try{__CLR4_4_122qp22txlb90pdv1.R.inc(96981);
    }finally{__CLR4_4_122qp22txlb90pdv1.R.flushNeeded();}}

    /**
     * This method does nothing and returns a dummy value.
     */
    @Override
    public PointVectorValuePair doOptimize() {try{__CLR4_4_122qp22txlb90pdv1.R.inc(96983);
        __CLR4_4_122qp22txlb90pdv1.R.inc(96984);final double[] params = getStartPoint();
        __CLR4_4_122qp22txlb90pdv1.R.inc(96985);final double[] res = computeResiduals(computeObjectiveValue(params));
        __CLR4_4_122qp22txlb90pdv1.R.inc(96986);setCost(computeCost(res));
        __CLR4_4_122qp22txlb90pdv1.R.inc(96987);return new PointVectorValuePair(params, null);
    }finally{__CLR4_4_122qp22txlb90pdv1.R.flushNeeded();}}
}
