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
package org.apache.commons.math3.stat.regression;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.util.FastMath;

/**
 * Abstract base class for implementations of MultipleLinearRegression.
 * @version $Id$
 * @since 2.0
 */
public abstract class AbstractMultipleLinearRegression implements
        MultipleLinearRegression {public static class __CLR4_4_115et15etlb90parf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** X sample data. */
    private RealMatrix xMatrix;

    /** Y sample data. */
    private RealVector yVector;

    /** Whether or not the regression model includes an intercept.  True means no intercept. */
    private boolean noIntercept = false;

    /**
     * @return the X sample data.
     */
    protected RealMatrix getX() {try{__CLR4_4_115et15etlb90parf.R.inc(53669);
        __CLR4_4_115et15etlb90parf.R.inc(53670);return xMatrix;
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * @return the Y sample data.
     */
    protected RealVector getY() {try{__CLR4_4_115et15etlb90parf.R.inc(53671);
        __CLR4_4_115et15etlb90parf.R.inc(53672);return yVector;
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * @return true if the model has no intercept term; false otherwise
     * @since 2.2
     */
    public boolean isNoIntercept() {try{__CLR4_4_115et15etlb90parf.R.inc(53673);
        __CLR4_4_115et15etlb90parf.R.inc(53674);return noIntercept;
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * @param noIntercept true means the model is to be estimated without an intercept term
     * @since 2.2
     */
    public void setNoIntercept(boolean noIntercept) {try{__CLR4_4_115et15etlb90parf.R.inc(53675);
        __CLR4_4_115et15etlb90parf.R.inc(53676);this.noIntercept = noIntercept;
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * <p>Loads model x and y sample data from a flat input array, overriding any previous sample.
     * </p>
     * <p>Assumes that rows are concatenated with y values first in each row.  For example, an input
     * <code>data</code> array containing the sequence of values (1, 2, 3, 4, 5, 6, 7, 8, 9) with
     * <code>nobs = 3</code> and <code>nvars = 2</code> creates a regression dataset with two
     * independent variables, as below:
     * <pre>
     *   y   x[0]  x[1]
     *   --------------
     *   1     2     3
     *   4     5     6
     *   7     8     9
     * </pre>
     * </p>
     * <p>Note that there is no need to add an initial unitary column (column of 1's) when
     * specifying a model including an intercept term.  If {@link #isNoIntercept()} is <code>true</code>,
     * the X matrix will be created without an initial column of "1"s; otherwise this column will
     * be added.
     * </p>
     * <p>Throws IllegalArgumentException if any of the following preconditions fail:
     * <ul><li><code>data</code> cannot be null</li>
     * <li><code>data.length = nobs * (nvars + 1)</li>
     * <li><code>nobs > nvars</code></li></ul>
     * </p>
     *
     * @param data input data array
     * @param nobs number of observations (rows)
     * @param nvars number of independent variables (columns, not counting y)
     * @throws NullArgumentException if the data array is null
     * @throws DimensionMismatchException if the length of the data array is not equal
     * to <code>nobs * (nvars + 1)</code>
     * @throws NumberIsTooSmallException if <code>nobs</code> is smaller than
     * <code>nvars</code>
     */
    public void newSampleData(double[] data, int nobs, int nvars) {try{__CLR4_4_115et15etlb90parf.R.inc(53677);
        __CLR4_4_115et15etlb90parf.R.inc(53678);if ((((data == null)&&(__CLR4_4_115et15etlb90parf.R.iget(53679)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53680)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53681);throw new NullArgumentException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53682);if ((((data.length != nobs * (nvars + 1))&&(__CLR4_4_115et15etlb90parf.R.iget(53683)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53684)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53685);throw new DimensionMismatchException(data.length, nobs * (nvars + 1));
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53686);if ((((nobs <= nvars)&&(__CLR4_4_115et15etlb90parf.R.iget(53687)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53688)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53689);throw new NumberIsTooSmallException(nobs, nvars, false);
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53690);double[] y = new double[nobs];
        __CLR4_4_115et15etlb90parf.R.inc(53691);final int cols = (((noIntercept )&&(__CLR4_4_115et15etlb90parf.R.iget(53692)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53693)==0&false))? nvars: nvars + 1;
        __CLR4_4_115et15etlb90parf.R.inc(53694);double[][] x = new double[nobs][cols];
        __CLR4_4_115et15etlb90parf.R.inc(53695);int pointer = 0;
        __CLR4_4_115et15etlb90parf.R.inc(53696);for (int i = 0; (((i < nobs)&&(__CLR4_4_115et15etlb90parf.R.iget(53697)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53698)==0&false)); i++) {{
            __CLR4_4_115et15etlb90parf.R.inc(53699);y[i] = data[pointer++];
            __CLR4_4_115et15etlb90parf.R.inc(53700);if ((((!noIntercept)&&(__CLR4_4_115et15etlb90parf.R.iget(53701)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53702)==0&false))) {{
                __CLR4_4_115et15etlb90parf.R.inc(53703);x[i][0] = 1.0d;
            }
            }__CLR4_4_115et15etlb90parf.R.inc(53704);for (int j = (((noIntercept )&&(__CLR4_4_115et15etlb90parf.R.iget(53705)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53706)==0&false))? 0 : 1; (((j < cols)&&(__CLR4_4_115et15etlb90parf.R.iget(53707)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53708)==0&false)); j++) {{
                __CLR4_4_115et15etlb90parf.R.inc(53709);x[i][j] = data[pointer++];
            }
        }}
        }__CLR4_4_115et15etlb90parf.R.inc(53710);this.xMatrix = new Array2DRowRealMatrix(x);
        __CLR4_4_115et15etlb90parf.R.inc(53711);this.yVector = new ArrayRealVector(y);
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Loads new y sample data, overriding any previous data.
     *
     * @param y the array representing the y sample
     * @throws NullArgumentException if y is null
     * @throws NoDataException if y is empty
     */
    protected void newYSampleData(double[] y) {try{__CLR4_4_115et15etlb90parf.R.inc(53712);
        __CLR4_4_115et15etlb90parf.R.inc(53713);if ((((y == null)&&(__CLR4_4_115et15etlb90parf.R.iget(53714)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53715)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53716);throw new NullArgumentException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53717);if ((((y.length == 0)&&(__CLR4_4_115et15etlb90parf.R.iget(53718)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53719)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53720);throw new NoDataException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53721);this.yVector = new ArrayRealVector(y);
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * <p>Loads new x sample data, overriding any previous data.
     * </p>
     * The input <code>x</code> array should have one row for each sample
     * observation, with columns corresponding to independent variables.
     * For example, if <pre>
     * <code> x = new double[][] {{1, 2}, {3, 4}, {5, 6}} </code></pre>
     * then <code>setXSampleData(x) </code> results in a model with two independent
     * variables and 3 observations:
     * <pre>
     *   x[0]  x[1]
     *   ----------
     *     1    2
     *     3    4
     *     5    6
     * </pre>
     * </p>
     * <p>Note that there is no need to add an initial unitary column (column of 1's) when
     * specifying a model including an intercept term.
     * </p>
     * @param x the rectangular array representing the x sample
     * @throws NullArgumentException if x is null
     * @throws NoDataException if x is empty
     * @throws DimensionMismatchException if x is not rectangular
     */
    protected void newXSampleData(double[][] x) {try{__CLR4_4_115et15etlb90parf.R.inc(53722);
        __CLR4_4_115et15etlb90parf.R.inc(53723);if ((((x == null)&&(__CLR4_4_115et15etlb90parf.R.iget(53724)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53725)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53726);throw new NullArgumentException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53727);if ((((x.length == 0)&&(__CLR4_4_115et15etlb90parf.R.iget(53728)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53729)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53730);throw new NoDataException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53731);if ((((noIntercept)&&(__CLR4_4_115et15etlb90parf.R.iget(53732)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53733)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53734);this.xMatrix = new Array2DRowRealMatrix(x, true);
        } }else {{ // Augment design matrix with initial unitary column
            __CLR4_4_115et15etlb90parf.R.inc(53735);final int nVars = x[0].length;
            __CLR4_4_115et15etlb90parf.R.inc(53736);final double[][] xAug = new double[x.length][nVars + 1];
            __CLR4_4_115et15etlb90parf.R.inc(53737);for (int i = 0; (((i < x.length)&&(__CLR4_4_115et15etlb90parf.R.iget(53738)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53739)==0&false)); i++) {{
                __CLR4_4_115et15etlb90parf.R.inc(53740);if ((((x[i].length != nVars)&&(__CLR4_4_115et15etlb90parf.R.iget(53741)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53742)==0&false))) {{
                    __CLR4_4_115et15etlb90parf.R.inc(53743);throw new DimensionMismatchException(x[i].length, nVars);
                }
                }__CLR4_4_115et15etlb90parf.R.inc(53744);xAug[i][0] = 1.0d;
                __CLR4_4_115et15etlb90parf.R.inc(53745);System.arraycopy(x[i], 0, xAug[i], 1, nVars);
            }
            }__CLR4_4_115et15etlb90parf.R.inc(53746);this.xMatrix = new Array2DRowRealMatrix(xAug, false);
        }
    }}finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Validates sample data.  Checks that
     * <ul><li>Neither x nor y is null or empty;</li>
     * <li>The length (i.e. number of rows) of x equals the length of y</li>
     * <li>x has at least one more row than it has columns (i.e. there is
     * sufficient data to estimate regression coefficients for each of the
     * columns in x plus an intercept.</li>
     * </ul>
     *
     * @param x the [n,k] array representing the x data
     * @param y the [n,1] array representing the y data
     * @throws NullArgumentException if {@code x} or {@code y} is null
     * @throws DimensionMismatchException if {@code x} and {@code y} do not
     * have the same length
     * @throws NoDataException if {@code x} or {@code y} are zero-length
     * @throws MathIllegalArgumentException if the number of rows of {@code x}
     * is not larger than the number of columns + 1
     */
    protected void validateSampleData(double[][] x, double[] y) throws MathIllegalArgumentException {try{__CLR4_4_115et15etlb90parf.R.inc(53747);
        __CLR4_4_115et15etlb90parf.R.inc(53748);if (((((x == null) || (y == null))&&(__CLR4_4_115et15etlb90parf.R.iget(53749)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53750)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53751);throw new NullArgumentException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53752);if ((((x.length != y.length)&&(__CLR4_4_115et15etlb90parf.R.iget(53753)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53754)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53755);throw new DimensionMismatchException(y.length, x.length);
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53756);if ((((x.length == 0)&&(__CLR4_4_115et15etlb90parf.R.iget(53757)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53758)==0&false))) {{  // Must be no y data either
            __CLR4_4_115et15etlb90parf.R.inc(53759);throw new NoDataException();
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53760);if ((((x[0].length + 1 > x.length)&&(__CLR4_4_115et15etlb90parf.R.iget(53761)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53762)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53763);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS,
                    x.length, x[0].length);
        }
    }}finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Validates that the x data and covariance matrix have the same
     * number of rows and that the covariance matrix is square.
     *
     * @param x the [n,k] array representing the x sample
     * @param covariance the [n,n] array representing the covariance matrix
     * @throws DimensionMismatchException if the number of rows in x is not equal
     * to the number of rows in covariance
     * @throws NonSquareMatrixException if the covariance matrix is not square
     */
    protected void validateCovarianceData(double[][] x, double[][] covariance) {try{__CLR4_4_115et15etlb90parf.R.inc(53764);
        __CLR4_4_115et15etlb90parf.R.inc(53765);if ((((x.length != covariance.length)&&(__CLR4_4_115et15etlb90parf.R.iget(53766)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53767)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53768);throw new DimensionMismatchException(x.length, covariance.length);
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53769);if ((((covariance.length > 0 && covariance.length != covariance[0].length)&&(__CLR4_4_115et15etlb90parf.R.iget(53770)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53771)==0&false))) {{
            __CLR4_4_115et15etlb90parf.R.inc(53772);throw new NonSquareMatrixException(covariance.length, covariance[0].length);
        }
    }}finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double[] estimateRegressionParameters() {try{__CLR4_4_115et15etlb90parf.R.inc(53773);
        __CLR4_4_115et15etlb90parf.R.inc(53774);RealVector b = calculateBeta();
        __CLR4_4_115et15etlb90parf.R.inc(53775);return b.toArray();
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double[] estimateResiduals() {try{__CLR4_4_115et15etlb90parf.R.inc(53776);
        __CLR4_4_115et15etlb90parf.R.inc(53777);RealVector b = calculateBeta();
        __CLR4_4_115et15etlb90parf.R.inc(53778);RealVector e = yVector.subtract(xMatrix.operate(b));
        __CLR4_4_115et15etlb90parf.R.inc(53779);return e.toArray();
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double[][] estimateRegressionParametersVariance() {try{__CLR4_4_115et15etlb90parf.R.inc(53780);
        __CLR4_4_115et15etlb90parf.R.inc(53781);return calculateBetaVariance().getData();
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double[] estimateRegressionParametersStandardErrors() {try{__CLR4_4_115et15etlb90parf.R.inc(53782);
        __CLR4_4_115et15etlb90parf.R.inc(53783);double[][] betaVariance = estimateRegressionParametersVariance();
        __CLR4_4_115et15etlb90parf.R.inc(53784);double sigma = calculateErrorVariance();
        __CLR4_4_115et15etlb90parf.R.inc(53785);int length = betaVariance[0].length;
        __CLR4_4_115et15etlb90parf.R.inc(53786);double[] result = new double[length];
        __CLR4_4_115et15etlb90parf.R.inc(53787);for (int i = 0; (((i < length)&&(__CLR4_4_115et15etlb90parf.R.iget(53788)!=0|true))||(__CLR4_4_115et15etlb90parf.R.iget(53789)==0&false)); i++) {{
            __CLR4_4_115et15etlb90parf.R.inc(53790);result[i] = FastMath.sqrt(sigma * betaVariance[i][i]);
        }
        }__CLR4_4_115et15etlb90parf.R.inc(53791);return result;
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double estimateRegressandVariance() {try{__CLR4_4_115et15etlb90parf.R.inc(53792);
        __CLR4_4_115et15etlb90parf.R.inc(53793);return calculateYVariance();
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Estimates the variance of the error.
     *
     * @return estimate of the error variance
     * @since 2.2
     */
    public double estimateErrorVariance() {try{__CLR4_4_115et15etlb90parf.R.inc(53794);
        __CLR4_4_115et15etlb90parf.R.inc(53795);return calculateErrorVariance();

    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Estimates the standard error of the regression.
     *
     * @return regression standard error
     * @since 2.2
     */
    public double estimateRegressionStandardError() {try{__CLR4_4_115et15etlb90parf.R.inc(53796);
        __CLR4_4_115et15etlb90parf.R.inc(53797);return Math.sqrt(estimateErrorVariance());
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Calculates the beta of multiple linear regression in matrix notation.
     *
     * @return beta
     */
    protected abstract RealVector calculateBeta();

    /**
     * Calculates the beta variance of multiple linear regression in matrix
     * notation.
     *
     * @return beta variance
     */
    protected abstract RealMatrix calculateBetaVariance();


    /**
     * Calculates the variance of the y values.
     *
     * @return Y variance
     */
    protected double calculateYVariance() {try{__CLR4_4_115et15etlb90parf.R.inc(53798);
        __CLR4_4_115et15etlb90parf.R.inc(53799);return new Variance().evaluate(yVector.toArray());
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * <p>Calculates the variance of the error term.</p>
     * Uses the formula <pre>
     * var(u) = u &middot; u / (n - k)
     * </pre>
     * where n and k are the row and column dimensions of the design
     * matrix X.
     *
     * @return error variance estimate
     * @since 2.2
     */
    protected double calculateErrorVariance() {try{__CLR4_4_115et15etlb90parf.R.inc(53800);
        __CLR4_4_115et15etlb90parf.R.inc(53801);RealVector residuals = calculateResiduals();
        __CLR4_4_115et15etlb90parf.R.inc(53802);return residuals.dotProduct(residuals) /
               (xMatrix.getRowDimension() - xMatrix.getColumnDimension());
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

    /**
     * Calculates the residuals of multiple linear regression in matrix
     * notation.
     *
     * <pre>
     * u = y - X * b
     * </pre>
     *
     * @return The residuals [n,1] matrix
     */
    protected RealVector calculateResiduals() {try{__CLR4_4_115et15etlb90parf.R.inc(53803);
        __CLR4_4_115et15etlb90parf.R.inc(53804);RealVector b = calculateBeta();
        __CLR4_4_115et15etlb90parf.R.inc(53805);return yVector.subtract(xMatrix.operate(b));
    }finally{__CLR4_4_115et15etlb90parf.R.flushNeeded();}}

}
