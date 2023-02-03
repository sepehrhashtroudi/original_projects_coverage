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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

/**
 * Computes covariances for pairs of arrays or columns of a matrix.
 *
 * <p>The constructors that take <code>RealMatrix</code> or
 * <code>double[][]</code> arguments generate covariance matrices.  The
 * columns of the input matrices are assumed to represent variable values.</p>
 *
 * <p>The constructor argument <code>biasCorrected</code> determines whether or
 * not computed covariances are bias-corrected.</p>
 *
 * <p>Unbiased covariances are given by the formula</p>
 * <code>cov(X, Y) = &Sigma;[(x<sub>i</sub> - E(X))(y<sub>i</sub> - E(Y))] / (n - 1)</code>
 * where <code>E(X)</code> is the mean of <code>X</code> and <code>E(Y)</code>
 * is the mean of the <code>Y</code> values.
 *
 * <p>Non-bias-corrected estimates use <code>n</code> in place of <code>n - 1</code>
 *
 * @version $Id$
 * @since 2.0
 */
public class Covariance {public static class __CLR4_4_112ol12ollb90pakn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50204,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** covariance matrix */
    private final RealMatrix covarianceMatrix;

    /**
     * Create an empty covariance matrix.
     */
    /** Number of observations (length of covariate vectors) */
    private final int n;

    /**
     * Create a Covariance with no data
     */
    public Covariance() {
        super();__CLR4_4_112ol12ollb90pakn.R.inc(50134);try{__CLR4_4_112ol12ollb90pakn.R.inc(50133);
        __CLR4_4_112ol12ollb90pakn.R.inc(50135);covarianceMatrix = null;
        __CLR4_4_112ol12ollb90pakn.R.inc(50136);n = 0;
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a Covariance matrix from a rectangular array
     * whose columns represent covariates.
     *
     * <p>The <code>biasCorrected</code> parameter determines whether or not
     * covariance estimates are bias-corrected.</p>
     *
     * <p>The input array must be rectangular with at least one column
     * and two rows.</p>
     *
     * @param data rectangular array with columns representing covariates
     * @param biasCorrected true means covariances are bias-corrected
     * @throws MathIllegalArgumentException if the input data array is not
     * rectangular with at least two rows and one column.
     * @throws NotStrictlyPositiveException if the input data array is not
     * rectangular with at least one row and one column.
     */
    public Covariance(double[][] data, boolean biasCorrected)
    throws MathIllegalArgumentException, NotStrictlyPositiveException {
        this(new BlockRealMatrix(data), biasCorrected);__CLR4_4_112ol12ollb90pakn.R.inc(50138);try{__CLR4_4_112ol12ollb90pakn.R.inc(50137);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a Covariance matrix from a rectangular array
     * whose columns represent covariates.
     *
     * <p>The input array must be rectangular with at least one column
     * and two rows</p>
     *
     * @param data rectangular array with columns representing covariates
     * @throws MathIllegalArgumentException if the input data array is not
     * rectangular with at least two rows and one column.
     * @throws NotStrictlyPositiveException if the input data array is not
     * rectangular with at least one row and one column.
     */
    public Covariance(double[][] data)
    throws MathIllegalArgumentException, NotStrictlyPositiveException {
        this(data, true);__CLR4_4_112ol12ollb90pakn.R.inc(50140);try{__CLR4_4_112ol12ollb90pakn.R.inc(50139);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a covariance matrix from a matrix whose columns
     * represent covariates.
     *
     * <p>The <code>biasCorrected</code> parameter determines whether or not
     * covariance estimates are bias-corrected.</p>
     *
     * <p>The matrix must have at least one column and two rows</p>
     *
     * @param matrix matrix with columns representing covariates
     * @param biasCorrected true means covariances are bias-corrected
     * @throws MathIllegalArgumentException if the input matrix does not have
     * at least two rows and one column
     */
    public Covariance(RealMatrix matrix, boolean biasCorrected)
    throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50141);
       __CLR4_4_112ol12ollb90pakn.R.inc(50142);checkSufficientData(matrix);
       __CLR4_4_112ol12ollb90pakn.R.inc(50143);n = matrix.getRowDimension();
       __CLR4_4_112ol12ollb90pakn.R.inc(50144);covarianceMatrix = computeCovarianceMatrix(matrix, biasCorrected);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a covariance matrix from a matrix whose columns
     * represent covariates.
     *
     * <p>The matrix must have at least one column and two rows</p>
     *
     * @param matrix matrix with columns representing covariates
     * @throws MathIllegalArgumentException if the input matrix does not have
     * at least two rows and one column
     */
    public Covariance(RealMatrix matrix) throws MathIllegalArgumentException {
        this(matrix, true);__CLR4_4_112ol12ollb90pakn.R.inc(50146);try{__CLR4_4_112ol12ollb90pakn.R.inc(50145);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Returns the covariance matrix
     *
     * @return covariance matrix
     */
    public RealMatrix getCovarianceMatrix() {try{__CLR4_4_112ol12ollb90pakn.R.inc(50147);
        __CLR4_4_112ol12ollb90pakn.R.inc(50148);return covarianceMatrix;
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Returns the number of observations (length of covariate vectors)
     *
     * @return number of observations
     */
    public int getN() {try{__CLR4_4_112ol12ollb90pakn.R.inc(50149);
        __CLR4_4_112ol12ollb90pakn.R.inc(50150);return n;
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Compute a covariance matrix from a matrix whose columns represent
     * covariates.
     * @param matrix input matrix (must have at least one column and two rows)
     * @param biasCorrected determines whether or not covariance estimates are bias-corrected
     * @return covariance matrix
     * @throws MathIllegalArgumentException if the matrix does not contain sufficient data
     */
    protected RealMatrix computeCovarianceMatrix(RealMatrix matrix, boolean biasCorrected)
    throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50151);
        __CLR4_4_112ol12ollb90pakn.R.inc(50152);int dimension = matrix.getColumnDimension();
        __CLR4_4_112ol12ollb90pakn.R.inc(50153);Variance variance = new Variance(biasCorrected);
        __CLR4_4_112ol12ollb90pakn.R.inc(50154);RealMatrix outMatrix = new BlockRealMatrix(dimension, dimension);
        __CLR4_4_112ol12ollb90pakn.R.inc(50155);for (int i = 0; (((i < dimension)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50156)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50157)==0&false)); i++) {{
            __CLR4_4_112ol12ollb90pakn.R.inc(50158);for (int j = 0; (((j < i)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50159)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50160)==0&false)); j++) {{
              __CLR4_4_112ol12ollb90pakn.R.inc(50161);double cov = covariance(matrix.getColumn(i), matrix.getColumn(j), biasCorrected);
              __CLR4_4_112ol12ollb90pakn.R.inc(50162);outMatrix.setEntry(i, j, cov);
              __CLR4_4_112ol12ollb90pakn.R.inc(50163);outMatrix.setEntry(j, i, cov);
            }
            }__CLR4_4_112ol12ollb90pakn.R.inc(50164);outMatrix.setEntry(i, i, variance.evaluate(matrix.getColumn(i)));
        }
        }__CLR4_4_112ol12ollb90pakn.R.inc(50165);return outMatrix;
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a covariance matrix from a matrix whose columns represent
     * covariates. Covariances are computed using the bias-corrected formula.
     * @param matrix input matrix (must have at least one column and two rows)
     * @return covariance matrix
     * @throws MathIllegalArgumentException if matrix does not contain sufficient data
     * @see #Covariance
     */
    protected RealMatrix computeCovarianceMatrix(RealMatrix matrix)
    throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50166);
        __CLR4_4_112ol12ollb90pakn.R.inc(50167);return computeCovarianceMatrix(matrix, true);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Compute a covariance matrix from a rectangular array whose columns represent
     * covariates.
     * @param data input array (must have at least one column and two rows)
     * @param biasCorrected determines whether or not covariance estimates are bias-corrected
     * @return covariance matrix
     * @throws MathIllegalArgumentException if the data array does not contain sufficient
     * data
     * @throws NotStrictlyPositiveException if the input data array is not
     * rectangular with at least one row and one column.
     */
    protected RealMatrix computeCovarianceMatrix(double[][] data, boolean biasCorrected)
    throws MathIllegalArgumentException, NotStrictlyPositiveException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50168);
        __CLR4_4_112ol12ollb90pakn.R.inc(50169);return computeCovarianceMatrix(new BlockRealMatrix(data), biasCorrected);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Create a covariance matrix from a rectangular array whose columns represent
     * covariates. Covariances are computed using the bias-corrected formula.
     * @param data input array (must have at least one column and two rows)
     * @return covariance matrix
     * @throws MathIllegalArgumentException if the data array does not contain sufficient data
     * @throws NotStrictlyPositiveException if the input data array is not
     * rectangular with at least one row and one column.
     * @see #Covariance
     */
    protected RealMatrix computeCovarianceMatrix(double[][] data)
    throws MathIllegalArgumentException, NotStrictlyPositiveException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50170);
        __CLR4_4_112ol12ollb90pakn.R.inc(50171);return computeCovarianceMatrix(data, true);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Computes the covariance between the two arrays.
     *
     * <p>Array lengths must match and the common length must be at least 2.</p>
     *
     * @param xArray first data array
     * @param yArray second data array
     * @param biasCorrected if true, returned value will be bias-corrected
     * @return returns the covariance for the two arrays
     * @throws  MathIllegalArgumentException if the arrays lengths do not match or
     * there is insufficient data
     */
    public double covariance(final double[] xArray, final double[] yArray, boolean biasCorrected)
        throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50172);
        __CLR4_4_112ol12ollb90pakn.R.inc(50173);Mean mean = new Mean();
        __CLR4_4_112ol12ollb90pakn.R.inc(50174);double result = 0d;
        __CLR4_4_112ol12ollb90pakn.R.inc(50175);int length = xArray.length;
        __CLR4_4_112ol12ollb90pakn.R.inc(50176);if ((((length != yArray.length)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50177)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50178)==0&false))) {{
            __CLR4_4_112ol12ollb90pakn.R.inc(50179);throw new MathIllegalArgumentException(
                  LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, length, yArray.length);
        } }else {__CLR4_4_112ol12ollb90pakn.R.inc(50180);if ((((length < 2)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50181)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50182)==0&false))) {{
            __CLR4_4_112ol12ollb90pakn.R.inc(50183);throw new MathIllegalArgumentException(
                  LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE, length, 2);
        } }else {{
            __CLR4_4_112ol12ollb90pakn.R.inc(50184);double xMean = mean.evaluate(xArray);
            __CLR4_4_112ol12ollb90pakn.R.inc(50185);double yMean = mean.evaluate(yArray);
            __CLR4_4_112ol12ollb90pakn.R.inc(50186);for (int i = 0; (((i < length)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50187)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50188)==0&false)); i++) {{
                __CLR4_4_112ol12ollb90pakn.R.inc(50189);double xDev = xArray[i] - xMean;
                __CLR4_4_112ol12ollb90pakn.R.inc(50190);double yDev = yArray[i] - yMean;
                __CLR4_4_112ol12ollb90pakn.R.inc(50191);result += (xDev * yDev - result) / (i + 1);
            }
        }}
        }}__CLR4_4_112ol12ollb90pakn.R.inc(50192);return (((biasCorrected )&&(__CLR4_4_112ol12ollb90pakn.R.iget(50193)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50194)==0&false))? result * ((double) length / (double)(length - 1)) : result;
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Computes the covariance between the two arrays, using the bias-corrected
     * formula.
     *
     * <p>Array lengths must match and the common length must be at least 2.</p>
     *
     * @param xArray first data array
     * @param yArray second data array
     * @return returns the covariance for the two arrays
     * @throws  MathIllegalArgumentException if the arrays lengths do not match or
     * there is insufficient data
     */
    public double covariance(final double[] xArray, final double[] yArray)
        throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50195);
        __CLR4_4_112ol12ollb90pakn.R.inc(50196);return covariance(xArray, yArray, true);
    }finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}

    /**
     * Throws MathIllegalArgumentException if the matrix does not have at least
     * one column and two rows.
     * @param matrix matrix to check
     * @throws MathIllegalArgumentException if the matrix does not contain sufficient data
     * to compute covariance
     */
    private void checkSufficientData(final RealMatrix matrix) throws MathIllegalArgumentException {try{__CLR4_4_112ol12ollb90pakn.R.inc(50197);
        __CLR4_4_112ol12ollb90pakn.R.inc(50198);int nRows = matrix.getRowDimension();
        __CLR4_4_112ol12ollb90pakn.R.inc(50199);int nCols = matrix.getColumnDimension();
        __CLR4_4_112ol12ollb90pakn.R.inc(50200);if ((((nRows < 2 || nCols < 1)&&(__CLR4_4_112ol12ollb90pakn.R.iget(50201)!=0|true))||(__CLR4_4_112ol12ollb90pakn.R.iget(50202)==0&false))) {{
            __CLR4_4_112ol12ollb90pakn.R.inc(50203);throw new MathIllegalArgumentException(
                    LocalizedFormats.INSUFFICIENT_ROWS_AND_COLUMNS,
                    nRows, nCols);
        }
    }}finally{__CLR4_4_112ol12ollb90pakn.R.flushNeeded();}}
}
