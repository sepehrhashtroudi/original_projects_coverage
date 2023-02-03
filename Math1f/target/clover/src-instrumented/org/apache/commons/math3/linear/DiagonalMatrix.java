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
package org.apache.commons.math3.linear;

import java.io.Serializable;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.Precision;

/**
 * Implementation of a diagonal matrix.
 *
 * @version $Id$
 * @since 3.1.1
 */
public class DiagonalMatrix extends AbstractRealMatrix
    implements Serializable {public static class __CLR4_4_1k2wk2wlb90p8uk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,26142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 20121229L;
    /** Entries of the diagonal. */
    private final double[] data;

    /**
     * Creates a matrix with the supplied dimension.
     *
     * @param dimension Number of rows and columns in the new matrix.
     * @throws NotStrictlyPositiveException if the dimension is
     * not positive.
     */
    public DiagonalMatrix(final int dimension)
        throws NotStrictlyPositiveException {
        super(dimension, dimension);__CLR4_4_1k2wk2wlb90p8uk.R.inc(26025);try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26024);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26026);data = new double[dimension];
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Creates a matrix using the input array as the underlying data.
     * <br/>
     * The input array is copied, not referenced.
     *
     * @param d Data for the new matrix.
     */
    public DiagonalMatrix(final double[] d) {
        this(d, true);__CLR4_4_1k2wk2wlb90p8uk.R.inc(26028);try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26027);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Creates a matrix using the input array as the underlying data.
     * <br/>
     * If an array is created specially in order to be embedded in a
     * this instance and not used directly, the {@code copyArray} may be
     * set to {@code false}.
     * This will prevent the copying and improve performance as no new
     * array will be built and no data will be copied.
     *
     * @param d Data for new matrix.
     * @param copyArray if {@code true}, the input array will be copied,
     * otherwise it will be referenced.
     * @exception NullArgumentException if d is null
     */
    public DiagonalMatrix(final double[] d, final boolean copyArray)
        throws NullArgumentException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26029);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26030);MathUtils.checkNotNull(d);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26031);data = (((copyArray )&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26032)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26033)==0&false))? d.clone() : d;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws DimensionMismatchException if the requested dimensions are not equal.
     */
    @Override
    public RealMatrix createMatrix(final int rowDimension,
                                   final int columnDimension)
        throws NotStrictlyPositiveException,
               DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26034);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26035);if ((((rowDimension != columnDimension)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26036)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26037)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26038);throw new DimensionMismatchException(rowDimension, columnDimension);
        }

        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26039);return new DiagonalMatrix(rowDimension);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealMatrix copy() {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26040);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26041);return new DiagonalMatrix(data);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Compute the sum of {@code this} and {@code m}.
     *
     * @param m Matrix to be added.
     * @return {@code this + m}.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public DiagonalMatrix add(final DiagonalMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26042);
        // Safety check.
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26043);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26044);final int dim = getRowDimension();
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26045);final double[] outData = new double[dim];
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26046);for (int i = 0; (((i < dim)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26047)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26048)==0&false)); i++) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26049);outData[i] = data[i] + m.data[i];
        }

        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26050);return new DiagonalMatrix(outData, false);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Returns {@code this} minus {@code m}.
     *
     * @param m Matrix to be subtracted.
     * @return {@code this - m}
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public DiagonalMatrix subtract(final DiagonalMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26051);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26052);MatrixUtils.checkSubtractionCompatible(this, m);

        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26053);final int dim = getRowDimension();
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26054);final double[] outData = new double[dim];
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26055);for (int i = 0; (((i < dim)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26056)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26057)==0&false)); i++) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26058);outData[i] = data[i] - m.data[i];
        }

        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26059);return new DiagonalMatrix(outData, false);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Returns the result of postmultiplying {@code this} by {@code m}.
     *
     * @param m matrix to postmultiply by
     * @return {@code this * m}
     * @throws DimensionMismatchException if
     * {@code columnDimension(this) != rowDimension(m)}
     */
    public DiagonalMatrix multiply(final DiagonalMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26060);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26061);MatrixUtils.checkMultiplicationCompatible(this, m);

        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26062);final int dim = getRowDimension();
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26063);final double[] outData = new double[dim];
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26064);for (int i = 0; (((i < dim)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26065)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26066)==0&false)); i++) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26067);outData[i] = data[i] * m.data[i];
        }

        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26068);return new DiagonalMatrix(outData, false);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Returns the result of postmultiplying {@code this} by {@code m}.
     *
     * @param m matrix to postmultiply by
     * @return {@code this * m}
     * @throws DimensionMismatchException if
     * {@code columnDimension(this) != rowDimension(m)}
     */
    @Override
    public RealMatrix multiply(final RealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26069);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26070);if ((((m instanceof DiagonalMatrix)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26071)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26072)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26073);return multiply((DiagonalMatrix) m);
        } }else {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26074);MatrixUtils.checkMultiplicationCompatible(this, m);
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26075);final int nRows = m.getRowDimension();
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26076);final int nCols = m.getColumnDimension();
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26077);final double[][] product = new double[nRows][nCols];
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26078);for (int r = 0; (((r < nRows)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26079)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26080)==0&false)); r++) {{
                __CLR4_4_1k2wk2wlb90p8uk.R.inc(26081);for (int c = 0; (((c < nCols)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26082)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26083)==0&false)); c++) {{
                    __CLR4_4_1k2wk2wlb90p8uk.R.inc(26084);product[r][c] = data[r] * m.getEntry(r, c);
                }
            }}
            }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26085);return new Array2DRowRealMatrix(product, false);
        }
    }}finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[][] getData() {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26086);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26087);final int dim = getRowDimension();
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26088);final double[][] out = new double[dim][dim];

        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26089);for (int i = 0; (((i < dim)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26090)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26091)==0&false)); i++) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26092);out[i][i] = data[i];
        }

        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26093);return out;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /**
     * Gets a reference to the underlying data array.
     *
     * @return 1-dimensional array of entries.
     */
    public double[] getDataRef() {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26094);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26095);return data;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26096);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26097);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26098);return (((row == column )&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26099)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26100)==0&false))? data[row] : 0;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc}
     * @throws NumberIsTooLargeException if {@code row != column} and value is non-zero.
     */
    @Override
    public void setEntry(final int row, final int column, final double value)
        throws OutOfRangeException, NumberIsTooLargeException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26101);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26102);if ((((row == column)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26103)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26104)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26105);MatrixUtils.checkRowIndex(this, row);
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26106);data[row] = value;
        } }else {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26107);ensureZero(value);
        }
    }}finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc}
     * @throws NumberIsTooLargeException if {@code row != column} and increment is non-zero.
     */
    @Override
    public void addToEntry(final int row,
                           final int column,
                           final double increment)
        throws OutOfRangeException, NumberIsTooLargeException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26108);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26109);if ((((row == column)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26110)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26111)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26112);MatrixUtils.checkRowIndex(this, row);
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26113);data[row] += increment;
        } }else {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26114);ensureZero(increment);
        }
    }}finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(final int row,
                              final int column,
                              final double factor)
        throws OutOfRangeException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26115);
        // we don't care about non-diagonal elements for multiplication
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26116);if ((((row == column)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26117)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26118)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26119);MatrixUtils.checkRowIndex(this, row);
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26120);data[row] *= factor;
        }
    }}finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26121);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26122);return data.length;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26123);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26124);return data.length;
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] operate(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26125);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26126);return multiply(new DiagonalMatrix(v, false)).getDataRef();
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] preMultiply(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26127);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26128);return operate(v);
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector preMultiply(final RealVector v) throws DimensionMismatchException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26129);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26130);final double[] vectorData;
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26131);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26132)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26133)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26134);vectorData = ((ArrayRealVector) v).getDataRef();
        } }else {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26135);vectorData = v.toArray();
        }
        }__CLR4_4_1k2wk2wlb90p8uk.R.inc(26136);return MatrixUtils.createRealVector(preMultiply(vectorData));
    }finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

    /** Ensure a value is zero.
     * @param value value to check
     * @exception NumberIsTooLargeException if value is not zero
     */
    private void ensureZero(final double value) throws NumberIsTooLargeException {try{__CLR4_4_1k2wk2wlb90p8uk.R.inc(26137);
        __CLR4_4_1k2wk2wlb90p8uk.R.inc(26138);if ((((!Precision.equals(0.0, value, 1))&&(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26139)!=0|true))||(__CLR4_4_1k2wk2wlb90p8uk.R.iget(26140)==0&false))) {{
            __CLR4_4_1k2wk2wlb90p8uk.R.inc(26141);throw new NumberIsTooLargeException(FastMath.abs(value), 0, true);
        }
    }}finally{__CLR4_4_1k2wk2wlb90p8uk.R.flushNeeded();}}

}
