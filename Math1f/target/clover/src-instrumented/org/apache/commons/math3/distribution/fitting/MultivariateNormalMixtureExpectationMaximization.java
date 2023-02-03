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
package org.apache.commons.math3.distribution.fitting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;

/**
 * Expectation-Maximization</a> algorithm for fitting the parameters of
 * multivariate normal mixture model distributions.
 *
 * This implementation is pure original code based on <a
 * href="https://www.ee.washington.edu/techsite/papers/documents/UWEETR-2010-0002.pdf">
 * EM Demystified: An Expectation-Maximization Tutorial</a> by Yihua Chen and Maya R. Gupta,
 * Department of Electrical Engineering, University of Washington, Seattle, WA 98195.
 * It was verified using external tools like <a
 * href="http://cran.r-project.org/web/packages/mixtools/index.html">CRAN Mixtools</a>
 * (see the JUnit test cases) but it is <strong>not</strong> based on Mixtools code at all.
 * The discussion of the origin of this class can be seen in the comments of the <a
 * href="https://issues.apache.org/jira/browse/MATH-817">MATH-817</a> JIRA issue.
 * @version $Id$
 * @since 3.2
 */
public class MultivariateNormalMixtureExpectationMaximization {public static class __CLR4_4_19fr9frlb90p7mn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default maximum number of iterations allowed per fitting process.
     */
    private static final int DEFAULT_MAX_ITERATIONS = 1000;
    /**
     * Default convergence threshold for fitting.
     */
    private static final double DEFAULT_THRESHOLD = 1E-5;
    /**
     * The data to fit.
     */
    private final double[][] data;
    /**
     * The model fit against the data.
     */
    private MixtureMultivariateNormalDistribution fittedModel;
    /**
     * The log likelihood of the data given the fitted model.
     */
    private double logLikelihood = 0d;

    /**
     * Creates an object to fit a multivariate normal mixture model to data.
     *
     * @param data Data to use in fitting procedure
     * @throws NotStrictlyPositiveException if data has no rows
     * @throws DimensionMismatchException if rows of data have different numbers
     *             of columns
     * @throws NumberIsTooSmallException if the number of columns in the data is
     *             less than 2
     */
    public MultivariateNormalMixtureExpectationMaximization(double[][] data)
        throws NotStrictlyPositiveException,
               DimensionMismatchException,
               NumberIsTooSmallException {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12231);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12232);if ((((data.length < 1)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12233)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12234)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12235);throw new NotStrictlyPositiveException(data.length);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12236);this.data = new double[data.length][data[0].length];

        __CLR4_4_19fr9frlb90p7mn.R.inc(12237);for (int i = 0; (((i < data.length)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12238)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12239)==0&false)); i++) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12240);if ((((data[i].length != data[0].length)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12241)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12242)==0&false))) {{
                // Jagged arrays not allowed
                __CLR4_4_19fr9frlb90p7mn.R.inc(12243);throw new DimensionMismatchException(data[i].length,
                                                     data[0].length);
            }
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12244);if ((((data[i].length < 2)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12245)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12246)==0&false))) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12247);throw new NumberIsTooSmallException(LocalizedFormats.NUMBER_TOO_SMALL,
                                                    data[i].length, 2, true);
            }
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12248);this.data[i] = MathArrays.copyOf(data[i], data[i].length);
        }
    }}finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Fit a mixture model to the data supplied to the constructor.
     *
     * The quality of the fit depends on the concavity of the data provided to
     * the constructor and the initial mixture provided to this function. If the
     * data has many local optima, multiple runs of the fitting function with
     * different initial mixtures may be required to find the optimal solution.
     * If a SingularMatrixException is encountered, it is possible that another
     * initialization would work.
     *
     * @param initialMixture Model containing initial values of weights and
     *            multivariate normals
     * @param maxIterations Maximum iterations allowed for fit
     * @param threshold Convergence threshold computed as difference in
     *             logLikelihoods between successive iterations
     * @throws SingularMatrixException if any component's covariance matrix is
     *             singular during fitting
     * @throws NotStrictlyPositiveException if numComponents is less than one
     *             or threshold is less than Double.MIN_VALUE
     * @throws DimensionMismatchException if initialMixture mean vector and data
     *             number of columns are not equal
     */
    public void fit(final MixtureMultivariateNormalDistribution initialMixture,
                    final int maxIterations,
                    final double threshold)
            throws SingularMatrixException,
                   NotStrictlyPositiveException,
                   DimensionMismatchException {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12249);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12250);if ((((maxIterations < 1)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12251)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12252)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12253);throw new NotStrictlyPositiveException(maxIterations);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12254);if ((((threshold < Double.MIN_VALUE)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12255)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12256)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12257);throw new NotStrictlyPositiveException(threshold);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12258);final int n = data.length;

        // Number of data columns. Jagged data already rejected in constructor,
        // so we can assume the lengths of each row are equal.
        __CLR4_4_19fr9frlb90p7mn.R.inc(12259);final int numCols = data[0].length;
        __CLR4_4_19fr9frlb90p7mn.R.inc(12260);final int k = initialMixture.getComponents().size();

        __CLR4_4_19fr9frlb90p7mn.R.inc(12261);final int numMeanColumns
            = initialMixture.getComponents().get(0).getSecond().getMeans().length;

        __CLR4_4_19fr9frlb90p7mn.R.inc(12262);if ((((numMeanColumns != numCols)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12263)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12264)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12265);throw new DimensionMismatchException(numMeanColumns, numCols);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12266);int numIterations = 0;
        __CLR4_4_19fr9frlb90p7mn.R.inc(12267);double previousLogLikelihood = 0d;

        __CLR4_4_19fr9frlb90p7mn.R.inc(12268);logLikelihood = Double.NEGATIVE_INFINITY;

        // Initialize model to fit to initial mixture.
        __CLR4_4_19fr9frlb90p7mn.R.inc(12269);fittedModel = new MixtureMultivariateNormalDistribution(initialMixture.getComponents());

        __CLR4_4_19fr9frlb90p7mn.R.inc(12270);while ((((numIterations++ <= maxIterations &&
               Math.abs(previousLogLikelihood - logLikelihood) > threshold)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12271)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12272)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12273);previousLogLikelihood = logLikelihood;
            __CLR4_4_19fr9frlb90p7mn.R.inc(12274);double sumLogLikelihood = 0d;

            // Mixture components
            __CLR4_4_19fr9frlb90p7mn.R.inc(12275);final List<Pair<Double, MultivariateNormalDistribution>> components
                = fittedModel.getComponents();

            // Weight and distribution of each component
            __CLR4_4_19fr9frlb90p7mn.R.inc(12276);final double[] weights = new double[k];

            __CLR4_4_19fr9frlb90p7mn.R.inc(12277);final MultivariateNormalDistribution[] mvns = new MultivariateNormalDistribution[k];

            __CLR4_4_19fr9frlb90p7mn.R.inc(12278);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12279)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12280)==0&false)); j++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12281);weights[j] = components.get(j).getFirst();
                __CLR4_4_19fr9frlb90p7mn.R.inc(12282);mvns[j] = components.get(j).getSecond();
            }

            // E-step: compute the data dependent parameters of the expectation
            // function.
            // The percentage of row's total density between a row and a
            // component
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12283);final double[][] gamma = new double[n][k];

            // Sum of gamma for each component
            __CLR4_4_19fr9frlb90p7mn.R.inc(12284);final double[] gammaSums = new double[k];

            // Sum of gamma times its row for each each component
            __CLR4_4_19fr9frlb90p7mn.R.inc(12285);final double[][] gammaDataProdSums = new double[k][numCols];

            __CLR4_4_19fr9frlb90p7mn.R.inc(12286);for (int i = 0; (((i < n)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12287)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12288)==0&false)); i++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12289);final double rowDensity = fittedModel.density(data[i]);
                __CLR4_4_19fr9frlb90p7mn.R.inc(12290);sumLogLikelihood += Math.log(rowDensity);

                __CLR4_4_19fr9frlb90p7mn.R.inc(12291);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12292)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12293)==0&false)); j++) {{
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12294);gamma[i][j] = weights[j] * mvns[j].density(data[i]) / rowDensity;
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12295);gammaSums[j] += gamma[i][j];

                    __CLR4_4_19fr9frlb90p7mn.R.inc(12296);for (int col = 0; (((col < numCols)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12297)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12298)==0&false)); col++) {{
                        __CLR4_4_19fr9frlb90p7mn.R.inc(12299);gammaDataProdSums[j][col] += gamma[i][j] * data[i][col];
                    }
                }}
            }}

            }__CLR4_4_19fr9frlb90p7mn.R.inc(12300);logLikelihood = sumLogLikelihood / n;

            // M-step: compute the new parameters based on the expectation
            // function.
            __CLR4_4_19fr9frlb90p7mn.R.inc(12301);final double[] newWeights = new double[k];
            __CLR4_4_19fr9frlb90p7mn.R.inc(12302);final double[][] newMeans = new double[k][numCols];

            __CLR4_4_19fr9frlb90p7mn.R.inc(12303);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12304)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12305)==0&false)); j++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12306);newWeights[j] = gammaSums[j] / n;
                __CLR4_4_19fr9frlb90p7mn.R.inc(12307);for (int col = 0; (((col < numCols)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12308)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12309)==0&false)); col++) {{
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12310);newMeans[j][col] = gammaDataProdSums[j][col] / gammaSums[j];
                }
            }}

            // Compute new covariance matrices
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12311);final RealMatrix[] newCovMats = new RealMatrix[k];
            __CLR4_4_19fr9frlb90p7mn.R.inc(12312);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12313)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12314)==0&false)); j++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12315);newCovMats[j] = new Array2DRowRealMatrix(numCols, numCols);
            }
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12316);for (int i = 0; (((i < n)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12317)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12318)==0&false)); i++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12319);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12320)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12321)==0&false)); j++) {{
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12322);final RealMatrix vec
                        = new Array2DRowRealMatrix(MathArrays.ebeSubtract(data[i], newMeans[j]));
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12323);final RealMatrix dataCov
                        = vec.multiply(vec.transpose()).scalarMultiply(gamma[i][j]);
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12324);newCovMats[j] = newCovMats[j].add(dataCov);
                }
            }}

            // Converting to arrays for use by fitted model
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12325);final double[][][] newCovMatArrays = new double[k][numCols][numCols];
            __CLR4_4_19fr9frlb90p7mn.R.inc(12326);for (int j = 0; (((j < k)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12327)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12328)==0&false)); j++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12329);newCovMats[j] = newCovMats[j].scalarMultiply(1d / gammaSums[j]);
                __CLR4_4_19fr9frlb90p7mn.R.inc(12330);newCovMatArrays[j] = newCovMats[j].getData();
            }

            // Update current model
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12331);fittedModel = new MixtureMultivariateNormalDistribution(newWeights,
                                                                    newMeans,
                                                                    newCovMatArrays);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12332);if ((((Math.abs(previousLogLikelihood - logLikelihood) > threshold)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12333)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12334)==0&false))) {{
            // Did not converge before the maximum number of iterations
            __CLR4_4_19fr9frlb90p7mn.R.inc(12335);throw new ConvergenceException();
        }
    }}finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Fit a mixture model to the data supplied to the constructor.
     *
     * The quality of the fit depends on the concavity of the data provided to
     * the constructor and the initial mixture provided to this function. If the
     * data has many local optima, multiple runs of the fitting function with
     * different initial mixtures may be required to find the optimal solution.
     * If a SingularMatrixException is encountered, it is possible that another
     * initialization would work.
     *
     * @param initialMixture Model containing initial values of weights and
     *            multivariate normals
     * @throws SingularMatrixException if any component's covariance matrix is
     *             singular during fitting
     * @throws NotStrictlyPositiveException if numComponents is less than one or
     *             threshold is less than Double.MIN_VALUE
     */
    public void fit(MixtureMultivariateNormalDistribution initialMixture)
        throws SingularMatrixException,
               NotStrictlyPositiveException {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12336);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12337);fit(initialMixture, DEFAULT_MAX_ITERATIONS, DEFAULT_THRESHOLD);
    }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Helper method to create a multivariate normal mixture model which can be
     * used to initialize {@link #fit(MixtureMultivariateNormalDistribution)}.
     *
     * This method uses the data supplied to the constructor to try to determine
     * a good mixture model at which to start the fit, but it is not guaranteed
     * to supply a model which will find the optimal solution or even converge.
     *
     * @param data Data to estimate distribution
     * @param numComponents Number of components for estimated mixture
     * @return Multivariate normal mixture model estimated from the data
     * @throws NumberIsTooLargeException if {@code numComponents} is greater
     * than the number of data rows.
     * @throws NumberIsTooSmallException if {@code numComponents < 2}.
     * @throws NotStrictlyPositiveException if data has less than 2 rows
     * @throws DimensionMismatchException if rows of data have different numbers
     *             of columns
     */
    public static MixtureMultivariateNormalDistribution estimate(final double[][] data,
                                                                 final int numComponents)
        throws NotStrictlyPositiveException,
               DimensionMismatchException {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12338);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12339);if ((((data.length < 2)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12340)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12341)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12342);throw new NotStrictlyPositiveException(data.length);
        }
        }__CLR4_4_19fr9frlb90p7mn.R.inc(12343);if ((((numComponents < 2)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12344)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12345)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12346);throw new NumberIsTooSmallException(numComponents, 2, true);
        }
        }__CLR4_4_19fr9frlb90p7mn.R.inc(12347);if ((((numComponents > data.length)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12348)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12349)==0&false))) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12350);throw new NumberIsTooLargeException(numComponents, data.length, true);
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12351);final int numRows = data.length;
        __CLR4_4_19fr9frlb90p7mn.R.inc(12352);final int numCols = data[0].length;

        // sort the data
        __CLR4_4_19fr9frlb90p7mn.R.inc(12353);final DataRow[] sortedData = new DataRow[numRows];
        __CLR4_4_19fr9frlb90p7mn.R.inc(12354);for (int i = 0; (((i < numRows)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12355)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12356)==0&false)); i++) {{
            __CLR4_4_19fr9frlb90p7mn.R.inc(12357);sortedData[i] = new DataRow(data[i]);
        }
        }__CLR4_4_19fr9frlb90p7mn.R.inc(12358);Arrays.sort(sortedData);

        // uniform weight for each bin
        __CLR4_4_19fr9frlb90p7mn.R.inc(12359);final double weight = 1d / numComponents;

        // components of mixture model to be created
        __CLR4_4_19fr9frlb90p7mn.R.inc(12360);final List<Pair<Double, MultivariateNormalDistribution>> components =
                new ArrayList<Pair<Double, MultivariateNormalDistribution>>(numComponents);

        // create a component based on data in each bin
        __CLR4_4_19fr9frlb90p7mn.R.inc(12361);for (int binIndex = 0; (((binIndex < numComponents)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12362)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12363)==0&false)); binIndex++) {{
            // minimum index (inclusive) from sorted data for this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12364);final int minIndex = (binIndex * numRows) / numComponents;

            // maximum index (exclusive) from sorted data for this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12365);final int maxIndex = ((binIndex + 1) * numRows) / numComponents;

            // number of data records that will be in this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12366);final int numBinRows = maxIndex - minIndex;

            // data for this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12367);final double[][] binData = new double[numBinRows][numCols];

            // mean of each column for the data in the this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12368);final double[] columnMeans = new double[numCols];

            // populate bin and create component
            __CLR4_4_19fr9frlb90p7mn.R.inc(12369);for (int i = minIndex, iBin = 0; (((i < maxIndex)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12370)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12371)==0&false)); i++, iBin++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12372);for (int j = 0; (((j < numCols)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12373)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12374)==0&false)); j++) {{
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12375);final double val = sortedData[i].getRow()[j];
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12376);columnMeans[j] += val;
                    __CLR4_4_19fr9frlb90p7mn.R.inc(12377);binData[iBin][j] = val;
                }
            }}

            }__CLR4_4_19fr9frlb90p7mn.R.inc(12378);MathArrays.scaleInPlace(1d / numBinRows, columnMeans);

            // covariance matrix for this bin
            __CLR4_4_19fr9frlb90p7mn.R.inc(12379);final double[][] covMat
                = new Covariance(binData).getCovarianceMatrix().getData();
            __CLR4_4_19fr9frlb90p7mn.R.inc(12380);final MultivariateNormalDistribution mvn
                = new MultivariateNormalDistribution(columnMeans, covMat);

            __CLR4_4_19fr9frlb90p7mn.R.inc(12381);components.add(new Pair<Double, MultivariateNormalDistribution>(weight, mvn));
        }

        }__CLR4_4_19fr9frlb90p7mn.R.inc(12382);return new MixtureMultivariateNormalDistribution(components);
    }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Gets the log likelihood of the data under the fitted model.
     *
     * @return Log likelihood of data or zero of no data has been fit
     */
    public double getLogLikelihood() {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12383);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12384);return logLikelihood;
    }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Gets the fitted model.
     *
     * @return fitted model or {@code null} if no fit has been performed yet.
     */
    public MixtureMultivariateNormalDistribution getFittedModel() {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12385);
        __CLR4_4_19fr9frlb90p7mn.R.inc(12386);return new MixtureMultivariateNormalDistribution(fittedModel.getComponents());
    }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

    /**
     * Class used for sorting user-supplied data.
     */
    private static class DataRow implements Comparable<DataRow> {
        /** One data row. */
        private final double[] row;
        /** Mean of the data row. */
        private Double mean;

        /**
         * Create a data row.
         * @param data Data to use for the row
         */
        DataRow(final double[] data) {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12387);
            // Store reference.
            __CLR4_4_19fr9frlb90p7mn.R.inc(12388);row = data;
            // Compute mean.
            __CLR4_4_19fr9frlb90p7mn.R.inc(12389);mean = 0d;
            __CLR4_4_19fr9frlb90p7mn.R.inc(12390);for (int i = 0; (((i < data.length)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12391)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12392)==0&false)); i++) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12393);mean += data[i];
            }
            }__CLR4_4_19fr9frlb90p7mn.R.inc(12394);mean /= data.length;
        }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

        /**
         * Compare two data rows.
         * @param other The other row
         * @return int for sorting
         */
        public int compareTo(final DataRow other) {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12395);
            __CLR4_4_19fr9frlb90p7mn.R.inc(12396);return mean.compareTo(other.mean);
        }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean equals(Object other) {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12397);

            __CLR4_4_19fr9frlb90p7mn.R.inc(12398);if ((((this == other)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12399)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12400)==0&false))) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12401);return true;
            }

            }__CLR4_4_19fr9frlb90p7mn.R.inc(12402);if ((((other instanceof DataRow)&&(__CLR4_4_19fr9frlb90p7mn.R.iget(12403)!=0|true))||(__CLR4_4_19fr9frlb90p7mn.R.iget(12404)==0&false))) {{
                __CLR4_4_19fr9frlb90p7mn.R.inc(12405);return MathArrays.equals(row, ((DataRow) other).row);
            }

            }__CLR4_4_19fr9frlb90p7mn.R.inc(12406);return false;

        }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int hashCode() {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12407);
            __CLR4_4_19fr9frlb90p7mn.R.inc(12408);return Arrays.hashCode(row);
        }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}
        /**
         * Get a data row.
         * @return data row array
         */
        public double[] getRow() {try{__CLR4_4_19fr9frlb90p7mn.R.inc(12409);
            __CLR4_4_19fr9frlb90p7mn.R.inc(12410);return row;
        }finally{__CLR4_4_19fr9frlb90p7mn.R.flushNeeded();}}
    }
}

