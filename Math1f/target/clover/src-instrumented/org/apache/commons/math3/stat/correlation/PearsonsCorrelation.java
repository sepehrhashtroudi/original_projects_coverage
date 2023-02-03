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
package org.apache.commons.math3.stat.correlation;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.apache.commons.math3.util.FastMath;

/**
 * Computes Pearson's product-moment correlation coefficients for pairs of arrays
 * or columns of a matrix.
 *
 * <p>The constructors that take <code>RealMatrix</code> or
 * <code>double[][]</code> arguments generate correlation matrices.  The
 * columns of the input matrices are assumed to represent variable values.
 * Correlations are given by the formula</p>
 * <code>cor(X, Y) = &Sigma;[(x<sub>i</sub> - E(X))(y<sub>i</sub> - E(Y))] / [(n - 1)s(X)s(Y)]</code>
 * where <code>E(X)</code> is the mean of <code>X</code>, <code>E(Y)</code>
 * is the mean of the <code>Y</code> values and s(X), s(Y) are standard deviations.
 *
 * @version $Id$
 * @since 2.0
 */
public class PearsonsCorrelation {public static class __CLR4_4_112qk12qklb90paky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** correlation matrix */
    private final RealMatrix correlationMatrix;

    /** number of observations */
    private final int nObs;

    /**
     * Create a PearsonsCorrelation instance without data
     */
    public PearsonsCorrelation() {
        super();__CLR4_4_112qk12qklb90paky.R.inc(50205);try{__CLR4_4_112qk12qklb90paky.R.inc(50204);
        __CLR4_4_112qk12qklb90paky.R.inc(50206);correlationMatrix = null;
        __CLR4_4_112qk12qklb90paky.R.inc(50207);nObs = 0;
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Create a PearsonsCorrelation from a rectangular array
     * whose columns represent values of variables to be correlated.
     *
     * @param data rectangular array with columns representing variables
     * @throws IllegalArgumentException if the input data array is not
     * rectangular with at least two rows and two columns.
     */
    public PearsonsCorrelation(double[][] data) {
        this(new BlockRealMatrix(data));__CLR4_4_112qk12qklb90paky.R.inc(50209);try{__CLR4_4_112qk12qklb90paky.R.inc(50208);
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Create a PearsonsCorrelation from a RealMatrix whose columns
     * represent variables to be correlated.
     *
     * @param matrix matrix with columns representing variables to correlate
     */
    public PearsonsCorrelation(RealMatrix matrix) {try{__CLR4_4_112qk12qklb90paky.R.inc(50210);
        __CLR4_4_112qk12qklb90paky.R.inc(50211);checkSufficientData(matrix);
        __CLR4_4_112qk12qklb90paky.R.inc(50212);nObs = matrix.getRowDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50213);correlationMatrix = computeCorrelationMatrix(matrix);
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Create a PearsonsCorrelation from a {@link Covariance}.  The correlation
     * matrix is computed by scaling the Covariance's covariance matrix.
     * The Covariance instance must have been created from a data matrix with
     * columns representing variable values.
     *
     * @param covariance Covariance instance
     */
    public PearsonsCorrelation(Covariance covariance) {try{__CLR4_4_112qk12qklb90paky.R.inc(50214);
        __CLR4_4_112qk12qklb90paky.R.inc(50215);RealMatrix covarianceMatrix = covariance.getCovarianceMatrix();
        __CLR4_4_112qk12qklb90paky.R.inc(50216);if ((((covarianceMatrix == null)&&(__CLR4_4_112qk12qklb90paky.R.iget(50217)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50218)==0&false))) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50219);throw new NullArgumentException(LocalizedFormats.COVARIANCE_MATRIX);
        }
        }__CLR4_4_112qk12qklb90paky.R.inc(50220);nObs = covariance.getN();
        __CLR4_4_112qk12qklb90paky.R.inc(50221);correlationMatrix = covarianceToCorrelation(covarianceMatrix);
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Create a PearsonsCorrelation from a covariance matrix.  The correlation
     * matrix is computed by scaling the covariance matrix.
     *
     * @param covarianceMatrix covariance matrix
     * @param numberOfObservations the number of observations in the dataset used to compute
     * the covariance matrix
     */
    public PearsonsCorrelation(RealMatrix covarianceMatrix, int numberOfObservations) {try{__CLR4_4_112qk12qklb90paky.R.inc(50222);
        __CLR4_4_112qk12qklb90paky.R.inc(50223);nObs = numberOfObservations;
        __CLR4_4_112qk12qklb90paky.R.inc(50224);correlationMatrix = covarianceToCorrelation(covarianceMatrix);

    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Returns the correlation matrix
     *
     * @return correlation matrix
     */
    public RealMatrix getCorrelationMatrix() {try{__CLR4_4_112qk12qklb90paky.R.inc(50225);
        __CLR4_4_112qk12qklb90paky.R.inc(50226);return correlationMatrix;
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Returns a matrix of standard errors associated with the estimates
     * in the correlation matrix.<br/>
     * <code>getCorrelationStandardErrors().getEntry(i,j)</code> is the standard
     * error associated with <code>getCorrelationMatrix.getEntry(i,j)</code>
     * <p>The formula used to compute the standard error is <br/>
     * <code>SE<sub>r</sub> = ((1 - r<sup>2</sup>) / (n - 2))<sup>1/2</sup></code>
     * where <code>r</code> is the estimated correlation coefficient and
     * <code>n</code> is the number of observations in the source dataset.</p>
     *
     * @return matrix of correlation standard errors
     */
    public RealMatrix getCorrelationStandardErrors() {try{__CLR4_4_112qk12qklb90paky.R.inc(50227);
        __CLR4_4_112qk12qklb90paky.R.inc(50228);int nVars = correlationMatrix.getColumnDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50229);double[][] out = new double[nVars][nVars];
        __CLR4_4_112qk12qklb90paky.R.inc(50230);for (int i = 0; (((i < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50231)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50232)==0&false)); i++) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50233);for (int j = 0; (((j < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50234)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50235)==0&false)); j++) {{
                __CLR4_4_112qk12qklb90paky.R.inc(50236);double r = correlationMatrix.getEntry(i, j);
                __CLR4_4_112qk12qklb90paky.R.inc(50237);out[i][j] = FastMath.sqrt((1 - r * r) /(nObs - 2));
            }
        }}
        }__CLR4_4_112qk12qklb90paky.R.inc(50238);return new BlockRealMatrix(out);
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Returns a matrix of p-values associated with the (two-sided) null
     * hypothesis that the corresponding correlation coefficient is zero.
     * <p><code>getCorrelationPValues().getEntry(i,j)</code> is the probability
     * that a random variable distributed as <code>t<sub>n-2</sub></code> takes
     * a value with absolute value greater than or equal to <br>
     * <code>|r|((n - 2) / (1 - r<sup>2</sup>))<sup>1/2</sup></code></p>
     * <p>The values in the matrix are sometimes referred to as the
     * <i>significance</i> of the corresponding correlation coefficients.</p>
     *
     * @return matrix of p-values
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if an error occurs estimating probabilities
     */
    public RealMatrix getCorrelationPValues() {try{__CLR4_4_112qk12qklb90paky.R.inc(50239);
        __CLR4_4_112qk12qklb90paky.R.inc(50240);TDistribution tDistribution = new TDistribution(nObs - 2);
        __CLR4_4_112qk12qklb90paky.R.inc(50241);int nVars = correlationMatrix.getColumnDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50242);double[][] out = new double[nVars][nVars];
        __CLR4_4_112qk12qklb90paky.R.inc(50243);for (int i = 0; (((i < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50244)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50245)==0&false)); i++) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50246);for (int j = 0; (((j < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50247)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50248)==0&false)); j++) {{
                __CLR4_4_112qk12qklb90paky.R.inc(50249);if ((((i == j)&&(__CLR4_4_112qk12qklb90paky.R.iget(50250)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50251)==0&false))) {{
                    __CLR4_4_112qk12qklb90paky.R.inc(50252);out[i][j] = 0d;
                } }else {{
                    __CLR4_4_112qk12qklb90paky.R.inc(50253);double r = correlationMatrix.getEntry(i, j);
                    __CLR4_4_112qk12qklb90paky.R.inc(50254);double t = FastMath.abs(r * FastMath.sqrt((nObs - 2)/(1 - r * r)));
                    __CLR4_4_112qk12qklb90paky.R.inc(50255);out[i][j] = 2 * tDistribution.cumulativeProbability(-t);
                }
            }}
        }}
        }__CLR4_4_112qk12qklb90paky.R.inc(50256);return new BlockRealMatrix(out);
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}


    /**
     * Computes the correlation matrix for the columns of the
     * input matrix.
     *
     * @param matrix matrix with columns representing variables to correlate
     * @return correlation matrix
     */
    public RealMatrix computeCorrelationMatrix(RealMatrix matrix) {try{__CLR4_4_112qk12qklb90paky.R.inc(50257);
        __CLR4_4_112qk12qklb90paky.R.inc(50258);int nVars = matrix.getColumnDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50259);RealMatrix outMatrix = new BlockRealMatrix(nVars, nVars);
        __CLR4_4_112qk12qklb90paky.R.inc(50260);for (int i = 0; (((i < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50261)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50262)==0&false)); i++) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50263);for (int j = 0; (((j < i)&&(__CLR4_4_112qk12qklb90paky.R.iget(50264)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50265)==0&false)); j++) {{
              __CLR4_4_112qk12qklb90paky.R.inc(50266);double corr = correlation(matrix.getColumn(i), matrix.getColumn(j));
              __CLR4_4_112qk12qklb90paky.R.inc(50267);outMatrix.setEntry(i, j, corr);
              __CLR4_4_112qk12qklb90paky.R.inc(50268);outMatrix.setEntry(j, i, corr);
            }
            }__CLR4_4_112qk12qklb90paky.R.inc(50269);outMatrix.setEntry(i, i, 1d);
        }
        }__CLR4_4_112qk12qklb90paky.R.inc(50270);return outMatrix;
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Computes the correlation matrix for the columns of the
     * input rectangular array.  The colums of the array represent values
     * of variables to be correlated.
     *
     * @param data matrix with columns representing variables to correlate
     * @return correlation matrix
     */
    public RealMatrix computeCorrelationMatrix(double[][] data) {try{__CLR4_4_112qk12qklb90paky.R.inc(50271);
       __CLR4_4_112qk12qklb90paky.R.inc(50272);return computeCorrelationMatrix(new BlockRealMatrix(data));
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Computes the Pearson's product-moment correlation coefficient between the two arrays.
     *
     * </p>Throws IllegalArgumentException if the arrays do not have the same length
     * or their common length is less than 2</p>
     *
     * @param xArray first data array
     * @param yArray second data array
     * @return Returns Pearson's correlation coefficient for the two arrays
     * @throws DimensionMismatchException if the arrays lengths do not match
     * @throws MathIllegalArgumentException if there is insufficient data
     */
    public double correlation(final double[] xArray, final double[] yArray) {try{__CLR4_4_112qk12qklb90paky.R.inc(50273);
        __CLR4_4_112qk12qklb90paky.R.inc(50274);SimpleRegression regression = new SimpleRegression();
        __CLR4_4_112qk12qklb90paky.R.inc(50275);if ((((xArray.length != yArray.length)&&(__CLR4_4_112qk12qklb90paky.R.iget(50276)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50277)==0&false))) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50278);throw new DimensionMismatchException(xArray.length, yArray.length);
        } }else {__CLR4_4_112qk12qklb90paky.R.inc(50279);if ((((xArray.length < 2)&&(__CLR4_4_112qk12qklb90paky.R.iget(50280)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50281)==0&false))) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50282);throw new MathIllegalArgumentException(LocalizedFormats.INSUFFICIENT_DIMENSION,
                                                   xArray.length, 2);
        } }else {{
            __CLR4_4_112qk12qklb90paky.R.inc(50283);for(int i=0; (((i<xArray.length)&&(__CLR4_4_112qk12qklb90paky.R.iget(50284)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50285)==0&false)); i++) {{
                __CLR4_4_112qk12qklb90paky.R.inc(50286);regression.addData(xArray[i], yArray[i]);
            }
            }__CLR4_4_112qk12qklb90paky.R.inc(50287);return regression.getR();
        }
    }}}finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Derives a correlation matrix from a covariance matrix.
     *
     * <p>Uses the formula <br/>
     * <code>r(X,Y) = cov(X,Y)/s(X)s(Y)</code> where
     * <code>r(&middot,&middot;)</code> is the correlation coefficient and
     * <code>s(&middot;)</code> means standard deviation.</p>
     *
     * @param covarianceMatrix the covariance matrix
     * @return correlation matrix
     */
    public RealMatrix covarianceToCorrelation(RealMatrix covarianceMatrix) {try{__CLR4_4_112qk12qklb90paky.R.inc(50288);
        __CLR4_4_112qk12qklb90paky.R.inc(50289);int nVars = covarianceMatrix.getColumnDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50290);RealMatrix outMatrix = new BlockRealMatrix(nVars, nVars);
        __CLR4_4_112qk12qklb90paky.R.inc(50291);for (int i = 0; (((i < nVars)&&(__CLR4_4_112qk12qklb90paky.R.iget(50292)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50293)==0&false)); i++) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50294);double sigma = FastMath.sqrt(covarianceMatrix.getEntry(i, i));
            __CLR4_4_112qk12qklb90paky.R.inc(50295);outMatrix.setEntry(i, i, 1d);
            __CLR4_4_112qk12qklb90paky.R.inc(50296);for (int j = 0; (((j < i)&&(__CLR4_4_112qk12qklb90paky.R.iget(50297)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50298)==0&false)); j++) {{
                __CLR4_4_112qk12qklb90paky.R.inc(50299);double entry = covarianceMatrix.getEntry(i, j) /
                       (sigma * FastMath.sqrt(covarianceMatrix.getEntry(j, j)));
                __CLR4_4_112qk12qklb90paky.R.inc(50300);outMatrix.setEntry(i, j, entry);
                __CLR4_4_112qk12qklb90paky.R.inc(50301);outMatrix.setEntry(j, i, entry);
            }
        }}
        }__CLR4_4_112qk12qklb90paky.R.inc(50302);return outMatrix;
    }finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}

    /**
     * Throws IllegalArgumentException of the matrix does not have at least
     * two columns and two rows
     *
     * @param matrix matrix to check for sufficiency
     * @throws MathIllegalArgumentException if there is insufficient data
     */
    private void checkSufficientData(final RealMatrix matrix) {try{__CLR4_4_112qk12qklb90paky.R.inc(50303);
        __CLR4_4_112qk12qklb90paky.R.inc(50304);int nRows = matrix.getRowDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50305);int nCols = matrix.getColumnDimension();
        __CLR4_4_112qk12qklb90paky.R.inc(50306);if ((((nRows < 2 || nCols < 2)&&(__CLR4_4_112qk12qklb90paky.R.iget(50307)!=0|true))||(__CLR4_4_112qk12qklb90paky.R.iget(50308)==0&false))) {{
            __CLR4_4_112qk12qklb90paky.R.inc(50309);throw new MathIllegalArgumentException(LocalizedFormats.INSUFFICIENT_ROWS_AND_COLUMNS,
                                                   nRows, nCols);
        }
    }}finally{__CLR4_4_112qk12qklb90paky.R.flushNeeded();}}
}
