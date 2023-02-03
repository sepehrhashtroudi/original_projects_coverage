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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Covariance implementation that does not require input data to be
 * stored in memory. The size of the covariance matrix is specified in the
 * constructor. Specific elements of the matrix are incrementally updated with
 * calls to incrementRow() or increment Covariance().
 *
 * <p>This class is based on a paper written by Philippe P&eacute;bay:
 * <a href="http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf">
 * Formulas for Robust, One-Pass Parallel Computation of Covariances and
 * Arbitrary-Order Statistical Moments</a>, 2008, Technical Report SAND2008-6212,
 * Sandia National Laboratories.</p>
 *
 * <p>Note: the underlying covariance matrix is symmetric, thus only the
 * upper triangular part of the matrix is stored and updated each increment.</p>
 *
 * @version $Id$
 * @since 3.0
 */
public class StorelessCovariance extends Covariance {public static class __CLR4_4_112x012x0lb90pale{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** the square covariance matrix (upper triangular part) */
    private StorelessBivariateCovariance[] covMatrix;

    /** dimension of the square covariance matrix */
    private int dimension;

    /**
     * Create a bias corrected covariance matrix with a given dimension.
     *
     * @param dim the dimension of the square covariance matrix
     */
    public StorelessCovariance(final int dim) {
        this(dim, true);__CLR4_4_112x012x0lb90pale.R.inc(50437);try{__CLR4_4_112x012x0lb90pale.R.inc(50436);
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Create a covariance matrix with a given number of rows and columns and the
     * indicated bias correction.
     *
     * @param dim the dimension of the covariance matrix
     * @param biasCorrected if <code>true</code> the covariance estimate is corrected
     * for bias, i.e. n-1 in the denominator, otherwise there is no bias correction,
     * i.e. n in the denominator.
     */
    public StorelessCovariance(final int dim, final boolean biasCorrected) {try{__CLR4_4_112x012x0lb90pale.R.inc(50438);
        __CLR4_4_112x012x0lb90pale.R.inc(50439);dimension = dim;
        __CLR4_4_112x012x0lb90pale.R.inc(50440);covMatrix = new StorelessBivariateCovariance[dimension * (dimension + 1) / 2];
        __CLR4_4_112x012x0lb90pale.R.inc(50441);initializeMatrix(biasCorrected);
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Initialize the internal two-dimensional array of
     * {@link StorelessBivariateCovariance} instances.
     *
     * @param biasCorrected if the covariance estimate shall be corrected for bias
     */
    private void initializeMatrix(final boolean biasCorrected) {try{__CLR4_4_112x012x0lb90pale.R.inc(50442);
        __CLR4_4_112x012x0lb90pale.R.inc(50443);for(int i = 0; (((i < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50444)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50445)==0&false)); i++){{
            __CLR4_4_112x012x0lb90pale.R.inc(50446);for(int j = 0; (((j < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50447)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50448)==0&false)); j++){{
                __CLR4_4_112x012x0lb90pale.R.inc(50449);setElement(i, j, new StorelessBivariateCovariance(biasCorrected));
            }
        }}
    }}finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Returns the index (i, j) translated into the one-dimensional
     * array used to store the upper triangular part of the symmetric
     * covariance matrix.
     *
     * @param i the row index
     * @param j the column index
     * @return the corresponding index in the matrix array
     */
    private int indexOf(final int i, final int j) {try{__CLR4_4_112x012x0lb90pale.R.inc(50450);
        __CLR4_4_112x012x0lb90pale.R.inc(50451);return (((j < i )&&(__CLR4_4_112x012x0lb90pale.R.iget(50452)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50453)==0&false))? i * (i + 1) / 2 + j : j * (j + 1) / 2 + i;
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Gets the element at index (i, j) from the covariance matrix
     * @param i the row index
     * @param j the column index
     * @return the {@link StorelessBivariateCovariance} element at the given index
     */
    private StorelessBivariateCovariance getElement(final int i, final int j) {try{__CLR4_4_112x012x0lb90pale.R.inc(50454);
        __CLR4_4_112x012x0lb90pale.R.inc(50455);return covMatrix[indexOf(i, j)];
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Sets the covariance element at index (i, j) in the covariance matrix
     * @param i the row index
     * @param j the column index
     * @param cov the {@link StorelessBivariateCovariance} element to be set
     */
    private void setElement(final int i, final int j,
                            final StorelessBivariateCovariance cov) {try{__CLR4_4_112x012x0lb90pale.R.inc(50456);
        __CLR4_4_112x012x0lb90pale.R.inc(50457);covMatrix[indexOf(i, j)] = cov;
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Get the covariance for an individual element of the covariance matrix.
     *
     * @param xIndex row index in the covariance matrix
     * @param yIndex column index in the covariance matrix
     * @return the covariance of the given element
     * @throws NumberIsTooSmallException if the number of observations
     * in the cell is &lt; 2
     */
    public double getCovariance(final int xIndex,
                                final int yIndex)
        throws NumberIsTooSmallException {try{__CLR4_4_112x012x0lb90pale.R.inc(50458);

        __CLR4_4_112x012x0lb90pale.R.inc(50459);return getElement(xIndex, yIndex).getResult();

    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Increment the covariance matrix with one row of data.
     *
     * @param data array representing one row of data.
     * @throws DimensionMismatchException if the length of <code>rowData</code>
     * does not match with the covariance matrix
     */
    public void increment(final double[] data)
        throws DimensionMismatchException {try{__CLR4_4_112x012x0lb90pale.R.inc(50460);

        __CLR4_4_112x012x0lb90pale.R.inc(50461);int length = data.length;
        __CLR4_4_112x012x0lb90pale.R.inc(50462);if ((((length != dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50463)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50464)==0&false))) {{
            __CLR4_4_112x012x0lb90pale.R.inc(50465);throw new DimensionMismatchException(length, dimension);
        }

        // only update the upper triangular part of the covariance matrix
        // as only these parts are actually stored
        }__CLR4_4_112x012x0lb90pale.R.inc(50466);for (int i = 0; (((i < length)&&(__CLR4_4_112x012x0lb90pale.R.iget(50467)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50468)==0&false)); i++){{
            __CLR4_4_112x012x0lb90pale.R.inc(50469);for (int j = i; (((j < length)&&(__CLR4_4_112x012x0lb90pale.R.iget(50470)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50471)==0&false)); j++){{
                __CLR4_4_112x012x0lb90pale.R.inc(50472);getElement(i, j).increment(data[i], data[j]);
            }
        }}

    }}finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Appends {@code sc} to this, effectively aggregating the computations in {@code sc}
     * with this.  After invoking this method, covariances returned should be close
     * to what would have been obtained by performing all of the {@link #increment(double[])}
     * operations in {@code sc} directly on this.
     *
     * @param sc externally computed StorelessCovariance to add to this
     * @throws DimensionMismatchException if the dimension of sc does not match this
     */
    public void append(StorelessCovariance sc) throws DimensionMismatchException {try{__CLR4_4_112x012x0lb90pale.R.inc(50473);
        __CLR4_4_112x012x0lb90pale.R.inc(50474);if ((((sc.dimension != dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50475)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50476)==0&false))) {{
            __CLR4_4_112x012x0lb90pale.R.inc(50477);throw new DimensionMismatchException(sc.dimension, dimension);
        }

        // only update the upper triangular part of the covariance matrix
        // as only these parts are actually stored
        }__CLR4_4_112x012x0lb90pale.R.inc(50478);for (int i = 0; (((i < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50479)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50480)==0&false)); i++) {{
            __CLR4_4_112x012x0lb90pale.R.inc(50481);for (int j = i; (((j < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50482)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50483)==0&false)); j++) {{
                __CLR4_4_112x012x0lb90pale.R.inc(50484);getElement(i, j).append(sc.getElement(i, j));
            }
        }}
    }}finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @throws NumberIsTooSmallException if the number of observations
     * in a cell is &lt; 2
     */
    @Override
    public RealMatrix getCovarianceMatrix() throws NumberIsTooSmallException {try{__CLR4_4_112x012x0lb90pale.R.inc(50485);
        __CLR4_4_112x012x0lb90pale.R.inc(50486);return MatrixUtils.createRealMatrix(getData());
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * Return the covariance matrix as two-dimensional array.
     *
     * @return a two-dimensional double array of covariance values
     * @throws NumberIsTooSmallException if the number of observations
     * for a cell is &lt; 2
     */
    public double[][] getData() throws NumberIsTooSmallException {try{__CLR4_4_112x012x0lb90pale.R.inc(50487);
        __CLR4_4_112x012x0lb90pale.R.inc(50488);final double[][] data = new double[dimension][dimension];
        __CLR4_4_112x012x0lb90pale.R.inc(50489);for (int i = 0; (((i < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50490)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50491)==0&false)); i++) {{
            __CLR4_4_112x012x0lb90pale.R.inc(50492);for (int j = 0; (((j < dimension)&&(__CLR4_4_112x012x0lb90pale.R.iget(50493)!=0|true))||(__CLR4_4_112x012x0lb90pale.R.iget(50494)==0&false)); j++) {{
                __CLR4_4_112x012x0lb90pale.R.inc(50495);data[i][j] = getElement(i, j).getResult();
            }
        }}
        }__CLR4_4_112x012x0lb90pale.R.inc(50496);return data;
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}

    /**
     * This {@link Covariance} method is not supported by a {@link StorelessCovariance},
     * since the number of bivariate observations does not have to be the same for different
     * pairs of covariates - i.e., N as defined in {@link Covariance#getN()} is undefined.
     *
     * @return nothing as this implementation always throws a
     * {@link MathUnsupportedOperationException}
     * @throws MathUnsupportedOperationException in all cases
     */
    @Override
    public int getN()
        throws MathUnsupportedOperationException {try{__CLR4_4_112x012x0lb90pale.R.inc(50497);
        __CLR4_4_112x012x0lb90pale.R.inc(50498);throw new MathUnsupportedOperationException();
    }finally{__CLR4_4_112x012x0lb90pale.R.flushNeeded();}}
}
