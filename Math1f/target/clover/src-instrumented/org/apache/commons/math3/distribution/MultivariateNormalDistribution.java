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
package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implementation of the multivariate normal (Gaussian) distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Multivariate_normal_distribution">
 * Multivariate normal distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/MultivariateNormalDistribution.html">
 * Multivariate normal distribution (MathWorld)</a>
 *
 * @version $Id$
 * @since 3.1
 */
public class MultivariateNormalDistribution
    extends AbstractMultivariateRealDistribution {public static class __CLR4_4_18qg8qglb90p7jr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Vector of means. */
    private final double[] means;
    /** Covariance matrix. */
    private final RealMatrix covarianceMatrix;
    /** The matrix inverse of the covariance matrix. */
    private final RealMatrix covarianceMatrixInverse;
    /** The determinant of the covariance matrix. */
    private final double covarianceMatrixDeterminant;
    /** Matrix used in computation of samples. */
    private final RealMatrix samplingMatrix;

    /**
     * Creates a multivariate normal distribution with the given mean vector and
     * covariance matrix.
     * <br/>
     * The number of dimensions is equal to the length of the mean vector
     * and to the number of rows and columns of the covariance matrix.
     * It is frequently written as "p" in formulae.
     *
     * @param means Vector of means.
     * @param covariances Covariance matrix.
     * @throws DimensionMismatchException if the arrays length are
     * inconsistent.
     * @throws SingularMatrixException if the eigenvalue decomposition cannot
     * be performed on the provided covariance matrix.
     * @throws NonPositiveDefiniteMatrixException if any of the eigenvalues is
     * negative.
     */
    public MultivariateNormalDistribution(final double[] means,
                                          final double[][] covariances)
        throws SingularMatrixException,
               DimensionMismatchException,
               NonPositiveDefiniteMatrixException {
        this(new Well19937c(), means, covariances);__CLR4_4_18qg8qglb90p7jr.R.inc(11321);try{__CLR4_4_18qg8qglb90p7jr.R.inc(11320);
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /**
     * Creates a multivariate normal distribution with the given mean vector and
     * covariance matrix.
     * <br/>
     * The number of dimensions is equal to the length of the mean vector
     * and to the number of rows and columns of the covariance matrix.
     * It is frequently written as "p" in formulae.
     *
     * @param rng Random Number Generator.
     * @param means Vector of means.
     * @param covariances Covariance matrix.
     * @throws DimensionMismatchException if the arrays length are
     * inconsistent.
     * @throws SingularMatrixException if the eigenvalue decomposition cannot
     * be performed on the provided covariance matrix.
     * @throws NonPositiveDefiniteMatrixException if any of the eigenvalues is
     * negative.
     */
    public MultivariateNormalDistribution(RandomGenerator rng,
                                          final double[] means,
                                          final double[][] covariances)
            throws SingularMatrixException,
                   DimensionMismatchException,
                   NonPositiveDefiniteMatrixException {
        super(rng, means.length);__CLR4_4_18qg8qglb90p7jr.R.inc(11323);try{__CLR4_4_18qg8qglb90p7jr.R.inc(11322);

        __CLR4_4_18qg8qglb90p7jr.R.inc(11324);final int dim = means.length;

        __CLR4_4_18qg8qglb90p7jr.R.inc(11325);if ((((covariances.length != dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11326)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11327)==0&false))) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11328);throw new DimensionMismatchException(covariances.length, dim);
        }

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11329);for (int i = 0; (((i < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11330)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11331)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11332);if ((((dim != covariances[i].length)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11333)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11334)==0&false))) {{
                __CLR4_4_18qg8qglb90p7jr.R.inc(11335);throw new DimensionMismatchException(covariances[i].length, dim);
            }
        }}

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11336);this.means = MathArrays.copyOf(means);

        __CLR4_4_18qg8qglb90p7jr.R.inc(11337);covarianceMatrix = new Array2DRowRealMatrix(covariances);

        // Covariance matrix eigen decomposition.
        __CLR4_4_18qg8qglb90p7jr.R.inc(11338);final EigenDecomposition covMatDec = new EigenDecomposition(covarianceMatrix);

        // Compute and store the inverse.
        __CLR4_4_18qg8qglb90p7jr.R.inc(11339);covarianceMatrixInverse = covMatDec.getSolver().getInverse();
        // Compute and store the determinant.
        __CLR4_4_18qg8qglb90p7jr.R.inc(11340);covarianceMatrixDeterminant = covMatDec.getDeterminant();

        // Eigenvalues of the covariance matrix.
        __CLR4_4_18qg8qglb90p7jr.R.inc(11341);final double[] covMatEigenvalues = covMatDec.getRealEigenvalues();

        __CLR4_4_18qg8qglb90p7jr.R.inc(11342);for (int i = 0; (((i < covMatEigenvalues.length)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11343)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11344)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11345);if ((((covMatEigenvalues[i] < 0)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11346)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11347)==0&false))) {{
                __CLR4_4_18qg8qglb90p7jr.R.inc(11348);throw new NonPositiveDefiniteMatrixException(covMatEigenvalues[i], i, 0);
            }
        }}

        // Matrix where each column is an eigenvector of the covariance matrix.
        }__CLR4_4_18qg8qglb90p7jr.R.inc(11349);final Array2DRowRealMatrix covMatEigenvectors = new Array2DRowRealMatrix(dim, dim);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11350);for (int v = 0; (((v < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11351)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11352)==0&false)); v++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11353);final double[] evec = covMatDec.getEigenvector(v).toArray();
            __CLR4_4_18qg8qglb90p7jr.R.inc(11354);covMatEigenvectors.setColumn(v, evec);
        }

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11355);final RealMatrix tmpMatrix = covMatEigenvectors.transpose();

        // Scale each eigenvector by the square root of its eigenvalue.
        __CLR4_4_18qg8qglb90p7jr.R.inc(11356);for (int row = 0; (((row < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11357)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11358)==0&false)); row++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11359);final double factor = FastMath.sqrt(covMatEigenvalues[row]);
            __CLR4_4_18qg8qglb90p7jr.R.inc(11360);for (int col = 0; (((col < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11361)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11362)==0&false)); col++) {{
                __CLR4_4_18qg8qglb90p7jr.R.inc(11363);tmpMatrix.multiplyEntry(row, col, factor);
            }
        }}

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11364);samplingMatrix = covMatEigenvectors.multiply(tmpMatrix);
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /**
     * Gets the mean vector.
     *
     * @return the mean vector.
     */
    public double[] getMeans() {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11365);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11366);return MathArrays.copyOf(means);
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /**
     * Gets the covariance matrix.
     *
     * @return the covariance matrix.
     */
    public RealMatrix getCovariances() {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11367);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11368);return covarianceMatrix.copy();
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(final double[] vals) throws DimensionMismatchException {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11369);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11370);final int dim = getDimension();
        __CLR4_4_18qg8qglb90p7jr.R.inc(11371);if ((((vals.length != dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11372)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11373)==0&false))) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11374);throw new DimensionMismatchException(vals.length, dim);
        }

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11375);return FastMath.pow(2 * FastMath.PI, -0.5 * dim) *
            FastMath.pow(covarianceMatrixDeterminant, -0.5) *
            getExponentTerm(vals);
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /**
     * Gets the square root of each element on the diagonal of the covariance
     * matrix.
     *
     * @return the standard deviations.
     */
    public double[] getStandardDeviations() {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11376);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11377);final int dim = getDimension();
        __CLR4_4_18qg8qglb90p7jr.R.inc(11378);final double[] std = new double[dim];
        __CLR4_4_18qg8qglb90p7jr.R.inc(11379);final double[][] s = covarianceMatrix.getData();
        __CLR4_4_18qg8qglb90p7jr.R.inc(11380);for (int i = 0; (((i < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11381)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11382)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11383);std[i] = FastMath.sqrt(s[i][i]);
        }
        }__CLR4_4_18qg8qglb90p7jr.R.inc(11384);return std;
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] sample() {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11385);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11386);final int dim = getDimension();
        __CLR4_4_18qg8qglb90p7jr.R.inc(11387);final double[] normalVals = new double[dim];

        __CLR4_4_18qg8qglb90p7jr.R.inc(11388);for (int i = 0; (((i < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11389)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11390)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11391);normalVals[i] = random.nextGaussian();
        }

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11392);final double[] vals = samplingMatrix.operate(normalVals);

        __CLR4_4_18qg8qglb90p7jr.R.inc(11393);for (int i = 0; (((i < dim)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11394)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11395)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11396);vals[i] += means[i];
        }

        }__CLR4_4_18qg8qglb90p7jr.R.inc(11397);return vals;
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}

    /**
     * Computes the term used in the exponent (see definition of the distribution).
     *
     * @param values Values at which to compute density.
     * @return the multiplication factor of density calculations.
     */
    private double getExponentTerm(final double[] values) {try{__CLR4_4_18qg8qglb90p7jr.R.inc(11398);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11399);final double[] centered = new double[values.length];
        __CLR4_4_18qg8qglb90p7jr.R.inc(11400);for (int i = 0; (((i < centered.length)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11401)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11402)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11403);centered[i] = values[i] - getMeans()[i];
        }
        }__CLR4_4_18qg8qglb90p7jr.R.inc(11404);final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
        __CLR4_4_18qg8qglb90p7jr.R.inc(11405);double sum = 0;
        __CLR4_4_18qg8qglb90p7jr.R.inc(11406);for (int i = 0; (((i < preMultiplied.length)&&(__CLR4_4_18qg8qglb90p7jr.R.iget(11407)!=0|true))||(__CLR4_4_18qg8qglb90p7jr.R.iget(11408)==0&false)); i++) {{
            __CLR4_4_18qg8qglb90p7jr.R.inc(11409);sum += preMultiplied[i] * centered[i];
        }
        }__CLR4_4_18qg8qglb90p7jr.R.inc(11410);return FastMath.exp(-0.5 * sum);
    }finally{__CLR4_4_18qg8qglb90p7jr.R.flushNeeded();}}
}
