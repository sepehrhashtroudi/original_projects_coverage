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

import java.util.ArrayList;
import java.util.Locale;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Basic implementation of RealMatrix methods regardless of the underlying storage.
 * <p>All the methods implemented here use {@link #getEntry(int, int)} to access
 * matrix elements. Derived class can provide faster implementations.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public abstract class AbstractRealMatrix
    extends RealLinearOperator
    implements RealMatrix {public static class __CLR4_4_1geygeylb90p8ky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,21889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default format. */
    private static final RealMatrixFormat DEFAULT_FORMAT = RealMatrixFormat.getInstance(Locale.US);
    static {try{__CLR4_4_1geygeylb90p8ky.R.inc(21274);
        // set the minimum fraction digits to 1 to keep compatibility
        __CLR4_4_1geygeylb90p8ky.R.inc(21275);DEFAULT_FORMAT.getFormat().setMinimumFractionDigits(1);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Creates a matrix with no data
     */
    protected AbstractRealMatrix() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21276);}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Create a new RealMatrix with the supplied row and column dimensions.
     *
     * @param rowDimension  the number of rows in the new matrix
     * @param columnDimension  the number of columns in the new matrix
     * @throws NotStrictlyPositiveException if row or column dimension is not positive
     */
    protected AbstractRealMatrix(final int rowDimension,
        final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21277);
        __CLR4_4_1geygeylb90p8ky.R.inc(21278);if ((((rowDimension < 1)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21279)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21280)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21281);throw new NotStrictlyPositiveException(rowDimension);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21282);if ((((columnDimension < 1)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21283)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21284)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21285);throw new NotStrictlyPositiveException(columnDimension);
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix add(RealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21286);
        __CLR4_4_1geygeylb90p8ky.R.inc(21287);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1geygeylb90p8ky.R.inc(21288);final int rowCount    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21289);final int columnCount = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21290);final RealMatrix out = createMatrix(rowCount, columnCount);
        __CLR4_4_1geygeylb90p8ky.R.inc(21291);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21292)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21293)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21294);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21295)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21296)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21297);out.setEntry(row, col, getEntry(row, col) + m.getEntry(row, col));
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21298);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix subtract(final RealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21299);
        __CLR4_4_1geygeylb90p8ky.R.inc(21300);MatrixUtils.checkSubtractionCompatible(this, m);

        __CLR4_4_1geygeylb90p8ky.R.inc(21301);final int rowCount    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21302);final int columnCount = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21303);final RealMatrix out = createMatrix(rowCount, columnCount);
        __CLR4_4_1geygeylb90p8ky.R.inc(21304);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21305)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21306)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21307);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21308)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21309)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21310);out.setEntry(row, col, getEntry(row, col) - m.getEntry(row, col));
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21311);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix scalarAdd(final double d) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21312);
        __CLR4_4_1geygeylb90p8ky.R.inc(21313);final int rowCount    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21314);final int columnCount = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21315);final RealMatrix out = createMatrix(rowCount, columnCount);
        __CLR4_4_1geygeylb90p8ky.R.inc(21316);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21317)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21318)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21319);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21320)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21321)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21322);out.setEntry(row, col, getEntry(row, col) + d);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21323);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix scalarMultiply(final double d) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21324);
        __CLR4_4_1geygeylb90p8ky.R.inc(21325);final int rowCount    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21326);final int columnCount = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21327);final RealMatrix out = createMatrix(rowCount, columnCount);
        __CLR4_4_1geygeylb90p8ky.R.inc(21328);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21329)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21330)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21331);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21332)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21333)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21334);out.setEntry(row, col, getEntry(row, col) * d);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21335);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix multiply(final RealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21336);
        __CLR4_4_1geygeylb90p8ky.R.inc(21337);MatrixUtils.checkMultiplicationCompatible(this, m);

        __CLR4_4_1geygeylb90p8ky.R.inc(21338);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21339);final int nCols = m.getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21340);final int nSum  = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21341);final RealMatrix out = createMatrix(nRows, nCols);
        __CLR4_4_1geygeylb90p8ky.R.inc(21342);for (int row = 0; (((row < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21343)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21344)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21345);for (int col = 0; (((col < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21346)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21347)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21348);double sum = 0;
                __CLR4_4_1geygeylb90p8ky.R.inc(21349);for (int i = 0; (((i < nSum)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21350)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21351)==0&false)); ++i) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21352);sum += getEntry(row, i) * m.getEntry(i, col);
                }
                }__CLR4_4_1geygeylb90p8ky.R.inc(21353);out.setEntry(row, col, sum);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21354);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix preMultiply(final RealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21355);
        __CLR4_4_1geygeylb90p8ky.R.inc(21356);return m.multiply(this);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix power(final int p)
        throws NotPositiveException, NonSquareMatrixException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21357);
        __CLR4_4_1geygeylb90p8ky.R.inc(21358);if ((((p < 0)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21359)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21360)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21361);throw new NotPositiveException(LocalizedFormats.NOT_POSITIVE_EXPONENT, p);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21362);if ((((!isSquare())&&(__CLR4_4_1geygeylb90p8ky.R.iget(21363)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21364)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21365);throw new NonSquareMatrixException(getRowDimension(), getColumnDimension());
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21366);if ((((p == 0)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21367)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21368)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21369);return MatrixUtils.createRealIdentityMatrix(this.getRowDimension());
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21370);if ((((p == 1)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21371)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21372)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21373);return this.copy();
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21374);final int power = p - 1;

        /*
         * Only log_2(p) operations is used by doing as follows:
         * 5^214 = 5^128 * 5^64 * 5^16 * 5^4 * 5^2
         *
         * In general, the same approach is used for A^p.
         */

        __CLR4_4_1geygeylb90p8ky.R.inc(21375);final char[] binaryRepresentation = Integer.toBinaryString(power).toCharArray();
        __CLR4_4_1geygeylb90p8ky.R.inc(21376);final ArrayList<Integer> nonZeroPositions = new ArrayList<Integer>();
        __CLR4_4_1geygeylb90p8ky.R.inc(21377);int maxI = -1;

        __CLR4_4_1geygeylb90p8ky.R.inc(21378);for (int i = 0; (((i < binaryRepresentation.length)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21379)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21380)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21381);if ((((binaryRepresentation[i] == '1')&&(__CLR4_4_1geygeylb90p8ky.R.iget(21382)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21383)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21384);final int pos = binaryRepresentation.length - i - 1;
                __CLR4_4_1geygeylb90p8ky.R.inc(21385);nonZeroPositions.add(pos);

                // The positions are taken in turn, so maxI is only changed once
                __CLR4_4_1geygeylb90p8ky.R.inc(21386);if ((((maxI == -1)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21387)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21388)==0&false))) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21389);maxI = pos;
                }
            }}
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21390);RealMatrix[] results = new RealMatrix[maxI + 1];
        __CLR4_4_1geygeylb90p8ky.R.inc(21391);results[0] = this.copy();

        __CLR4_4_1geygeylb90p8ky.R.inc(21392);for (int i = 1; (((i <= maxI)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21393)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21394)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21395);results[i] = results[i-1].multiply(results[i-1]);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21396);RealMatrix result = this.copy();

        __CLR4_4_1geygeylb90p8ky.R.inc(21397);for (Integer i : nonZeroPositions) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21398);result = result.multiply(results[i]);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21399);return result;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[][] getData() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21400);
        __CLR4_4_1geygeylb90p8ky.R.inc(21401);final double[][] data = new double[getRowDimension()][getColumnDimension()];

        __CLR4_4_1geygeylb90p8ky.R.inc(21402);for (int i = 0; (((i < data.length)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21403)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21404)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21405);final double[] dataI = data[i];
            __CLR4_4_1geygeylb90p8ky.R.inc(21406);for (int j = 0; (((j < dataI.length)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21407)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21408)==0&false)); ++j) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21409);dataI[j] = getEntry(i, j);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21410);return data;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNorm() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21411);
        __CLR4_4_1geygeylb90p8ky.R.inc(21412);return walkInColumnOrder(new RealMatrixPreservingVisitor() {

            /** Last row index. */
            private double endRow;

            /** Sum of absolute values on one column. */
            private double columnSum;

            /** Maximal sum across all columns. */
            private double maxColSum;

            /** {@inheritDoc} */
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21413);
                __CLR4_4_1geygeylb90p8ky.R.inc(21414);this.endRow = endRow;
                __CLR4_4_1geygeylb90p8ky.R.inc(21415);columnSum   = 0;
                __CLR4_4_1geygeylb90p8ky.R.inc(21416);maxColSum   = 0;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

            /** {@inheritDoc} */
            public void visit(final int row, final int column, final double value) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21417);
                __CLR4_4_1geygeylb90p8ky.R.inc(21418);columnSum += FastMath.abs(value);
                __CLR4_4_1geygeylb90p8ky.R.inc(21419);if ((((row == endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21420)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21421)==0&false))) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21422);maxColSum = FastMath.max(maxColSum, columnSum);
                    __CLR4_4_1geygeylb90p8ky.R.inc(21423);columnSum = 0;
                }
            }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

            /** {@inheritDoc} */
            public double end() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21424);
                __CLR4_4_1geygeylb90p8ky.R.inc(21425);return maxColSum;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}
        });
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getFrobeniusNorm() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21426);
        __CLR4_4_1geygeylb90p8ky.R.inc(21427);return walkInOptimizedOrder(new RealMatrixPreservingVisitor() {

            /** Sum of squared entries. */
            private double sum;

            /** {@inheritDoc} */
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21428);
                __CLR4_4_1geygeylb90p8ky.R.inc(21429);sum = 0;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

            /** {@inheritDoc} */
            public void visit(final int row, final int column, final double value) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21430);
                __CLR4_4_1geygeylb90p8ky.R.inc(21431);sum += value * value;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

            /** {@inheritDoc} */
            public double end() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21432);
                __CLR4_4_1geygeylb90p8ky.R.inc(21433);return FastMath.sqrt(sum);
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}
        });
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix getSubMatrix(final int startRow, final int endRow,
                                   final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21434);
        __CLR4_4_1geygeylb90p8ky.R.inc(21435);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);

        __CLR4_4_1geygeylb90p8ky.R.inc(21436);final RealMatrix subMatrix =
            createMatrix(endRow - startRow + 1, endColumn - startColumn + 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21437);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21438)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21439)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21440);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21441)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21442)==0&false)); ++j) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21443);subMatrix.setEntry(i - startRow, j - startColumn, getEntry(i, j));
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21444);return subMatrix;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix getSubMatrix(final int[] selectedRows,
                                   final int[] selectedColumns)
        throws NullArgumentException, NoDataException, OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21445);
        __CLR4_4_1geygeylb90p8ky.R.inc(21446);MatrixUtils.checkSubMatrixIndex(this, selectedRows, selectedColumns);

        __CLR4_4_1geygeylb90p8ky.R.inc(21447);final RealMatrix subMatrix =
            createMatrix(selectedRows.length, selectedColumns.length);
        __CLR4_4_1geygeylb90p8ky.R.inc(21448);subMatrix.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor() {

            /** {@inheritDoc} */
            @Override
            public double visit(final int row, final int column, final double value) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21449);
                __CLR4_4_1geygeylb90p8ky.R.inc(21450);return getEntry(selectedRows[row], selectedColumns[column]);
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

        });

        __CLR4_4_1geygeylb90p8ky.R.inc(21451);return subMatrix;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void copySubMatrix(final int startRow, final int endRow,
                              final int startColumn, final int endColumn,
                              final double[][] destination)
        throws OutOfRangeException, NumberIsTooSmallException,
        MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21452);
        __CLR4_4_1geygeylb90p8ky.R.inc(21453);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21454);final int rowsCount    = endRow + 1 - startRow;
        __CLR4_4_1geygeylb90p8ky.R.inc(21455);final int columnsCount = endColumn + 1 - startColumn;
        __CLR4_4_1geygeylb90p8ky.R.inc(21456);if (((((destination.length < rowsCount) || (destination[0].length < columnsCount))&&(__CLR4_4_1geygeylb90p8ky.R.iget(21457)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21458)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21459);throw new MatrixDimensionMismatchException(destination.length, destination[0].length,
                                                       rowsCount, columnsCount);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21460);for (int i = 1; (((i < rowsCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21461)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21462)==0&false)); i++) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21463);if ((((destination[i].length < columnsCount)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21464)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21465)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21466);throw new MatrixDimensionMismatchException(destination.length, destination[i].length,
                                                           rowsCount, columnsCount);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21467);walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            /** Initial row index. */
            private int startRow;

            /** Initial column index. */
            private int startColumn;

            /** {@inheritDoc} */
            @Override
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21468);
                __CLR4_4_1geygeylb90p8ky.R.inc(21469);this.startRow    = startRow;
                __CLR4_4_1geygeylb90p8ky.R.inc(21470);this.startColumn = startColumn;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final double value) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21471);
                __CLR4_4_1geygeylb90p8ky.R.inc(21472);destination[row - startRow][column - startColumn] = value;
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

        }, startRow, endRow, startColumn, endColumn);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void copySubMatrix(int[] selectedRows, int[] selectedColumns,
                              double[][] destination)
        throws OutOfRangeException, NullArgumentException, NoDataException,
        MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21473);
        __CLR4_4_1geygeylb90p8ky.R.inc(21474);MatrixUtils.checkSubMatrixIndex(this, selectedRows, selectedColumns);
        __CLR4_4_1geygeylb90p8ky.R.inc(21475);final int nCols = selectedColumns.length;
        __CLR4_4_1geygeylb90p8ky.R.inc(21476);if (((((destination.length < selectedRows.length) ||
            (destination[0].length < nCols))&&(__CLR4_4_1geygeylb90p8ky.R.iget(21477)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21478)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21479);throw new MatrixDimensionMismatchException(destination.length, destination[0].length,
                                                       selectedRows.length, selectedColumns.length);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21480);for (int i = 0; (((i < selectedRows.length)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21481)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21482)==0&false)); i++) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21483);final double[] destinationI = destination[i];
            __CLR4_4_1geygeylb90p8ky.R.inc(21484);if ((((destinationI.length < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21485)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21486)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21487);throw new MatrixDimensionMismatchException(destination.length, destinationI.length,
                                                           selectedRows.length, selectedColumns.length);
            }
            }__CLR4_4_1geygeylb90p8ky.R.inc(21488);for (int j = 0; (((j < selectedColumns.length)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21489)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21490)==0&false)); j++) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21491);destinationI[j] = getEntry(selectedRows[i], selectedColumns[j]);
            }
        }}
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSubMatrix(final double[][] subMatrix, final int row, final int column)
        throws NoDataException, OutOfRangeException,
        DimensionMismatchException, NullArgumentException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21492);
        __CLR4_4_1geygeylb90p8ky.R.inc(21493);MathUtils.checkNotNull(subMatrix);
        __CLR4_4_1geygeylb90p8ky.R.inc(21494);final int nRows = subMatrix.length;
        __CLR4_4_1geygeylb90p8ky.R.inc(21495);if ((((nRows == 0)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21496)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21497)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21498);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21499);final int nCols = subMatrix[0].length;
        __CLR4_4_1geygeylb90p8ky.R.inc(21500);if ((((nCols == 0)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21501)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21502)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21503);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21504);for (int r = 1; (((r < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21505)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21506)==0&false)); ++r) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21507);if ((((subMatrix[r].length != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21508)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21509)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21510);throw new DimensionMismatchException(nCols, subMatrix[r].length);
            }
        }}

        }__CLR4_4_1geygeylb90p8ky.R.inc(21511);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21512);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21513);MatrixUtils.checkRowIndex(this, nRows + row - 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21514);MatrixUtils.checkColumnIndex(this, nCols + column - 1);

        __CLR4_4_1geygeylb90p8ky.R.inc(21515);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21516)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21517)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21518);for (int j = 0; (((j < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21519)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21520)==0&false)); ++j) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21521);setEntry(row + i, column + j, subMatrix[i][j]);
            }
        }}
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix getRowMatrix(final int row) throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21522);
        __CLR4_4_1geygeylb90p8ky.R.inc(21523);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21524);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21525);final RealMatrix out = createMatrix(1, nCols);
        __CLR4_4_1geygeylb90p8ky.R.inc(21526);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21527)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21528)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21529);out.setEntry(0, i, getEntry(row, i));
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21530);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRowMatrix(final int row, final RealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21531);
        __CLR4_4_1geygeylb90p8ky.R.inc(21532);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21533);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21534);if (((((matrix.getRowDimension() != 1) ||
            (matrix.getColumnDimension() != nCols))&&(__CLR4_4_1geygeylb90p8ky.R.iget(21535)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21536)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21537);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       1, nCols);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21538);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21539)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21540)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21541);setEntry(row, i, matrix.getEntry(0, i));
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix getColumnMatrix(final int column)
        throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21542);
        __CLR4_4_1geygeylb90p8ky.R.inc(21543);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21544);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21545);final RealMatrix out = createMatrix(nRows, 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21546);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21547)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21548)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21549);out.setEntry(i, 0, getEntry(i, column));
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21550);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumnMatrix(final int column, final RealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21551);
        __CLR4_4_1geygeylb90p8ky.R.inc(21552);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21553);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21554);if (((((matrix.getRowDimension() != nRows) ||
            (matrix.getColumnDimension() != 1))&&(__CLR4_4_1geygeylb90p8ky.R.iget(21555)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21556)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21557);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       nRows, 1);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21558);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21559)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21560)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21561);setEntry(i, column, matrix.getEntry(i, 0));
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealVector getRowVector(final int row)
        throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21562);
        __CLR4_4_1geygeylb90p8ky.R.inc(21563);return new ArrayRealVector(getRow(row), false);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRowVector(final int row, final RealVector vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21564);
        __CLR4_4_1geygeylb90p8ky.R.inc(21565);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21566);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21567);if ((((vector.getDimension() != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21568)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21569)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21570);throw new MatrixDimensionMismatchException(1, vector.getDimension(),
                                                       1, nCols);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21571);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21572)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21573)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21574);setEntry(row, i, vector.getEntry(i));
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealVector getColumnVector(final int column)
        throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21575);
        __CLR4_4_1geygeylb90p8ky.R.inc(21576);return new ArrayRealVector(getColumn(column), false);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumnVector(final int column, final RealVector vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21577);
        __CLR4_4_1geygeylb90p8ky.R.inc(21578);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21579);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21580);if ((((vector.getDimension() != nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21581)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21582)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21583);throw new MatrixDimensionMismatchException(vector.getDimension(), 1,
                                                       nRows, 1);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21584);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21585)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21586)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21587);setEntry(i, column, vector.getEntry(i));
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] getRow(final int row) throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21588);
        __CLR4_4_1geygeylb90p8ky.R.inc(21589);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21590);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21591);final double[] out = new double[nCols];
        __CLR4_4_1geygeylb90p8ky.R.inc(21592);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21593)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21594)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21595);out[i] = getEntry(row, i);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21596);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRow(final int row, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21597);
        __CLR4_4_1geygeylb90p8ky.R.inc(21598);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1geygeylb90p8ky.R.inc(21599);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21600);if ((((array.length != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21601)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21602)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21603);throw new MatrixDimensionMismatchException(1, array.length, 1, nCols);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21604);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21605)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21606)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21607);setEntry(row, i, array[i]);
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] getColumn(final int column) throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21608);
        __CLR4_4_1geygeylb90p8ky.R.inc(21609);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21610);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21611);final double[] out = new double[nRows];
        __CLR4_4_1geygeylb90p8ky.R.inc(21612);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21613)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21614)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21615);out[i] = getEntry(i, column);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21616);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumn(final int column, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21617);
        __CLR4_4_1geygeylb90p8ky.R.inc(21618);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21619);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21620);if ((((array.length != nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21621)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21622)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21623);throw new MatrixDimensionMismatchException(array.length, 1, nRows, 1);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21624);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21625)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21626)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21627);setEntry(i, column, array[i]);
        }
    }}finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void addToEntry(int row, int column, double increment)
        throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21628);
        __CLR4_4_1geygeylb90p8ky.R.inc(21629);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21630);setEntry(row, column, getEntry(row, column) + increment);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void multiplyEntry(int row, int column, double factor)
        throws OutOfRangeException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21631);
        __CLR4_4_1geygeylb90p8ky.R.inc(21632);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1geygeylb90p8ky.R.inc(21633);setEntry(row, column, getEntry(row, column) * factor);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealMatrix transpose() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21634);
        __CLR4_4_1geygeylb90p8ky.R.inc(21635);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21636);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21637);final RealMatrix out = createMatrix(nCols, nRows);
        __CLR4_4_1geygeylb90p8ky.R.inc(21638);walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final double value) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21639);
                __CLR4_4_1geygeylb90p8ky.R.inc(21640);out.setEntry(column, row, value);
            }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

        });

        __CLR4_4_1geygeylb90p8ky.R.inc(21641);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSquare() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21642);
        __CLR4_4_1geygeylb90p8ky.R.inc(21643);return getColumnDimension() == getRowDimension();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Returns the number of rows of this matrix.
     *
     * @return the number of rows.
     */
    @Override
    public abstract int getRowDimension();

    /**
     * Returns the number of columns of this matrix.
     *
     * @return the number of columns.
     */
    @Override
    public abstract int getColumnDimension();

    /** {@inheritDoc} */
    public double getTrace() throws NonSquareMatrixException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21644);
        __CLR4_4_1geygeylb90p8ky.R.inc(21645);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21646);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21647);if ((((nRows != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21648)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21649)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21650);throw new NonSquareMatrixException(nRows, nCols);
       }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21651);double trace = 0;
        __CLR4_4_1geygeylb90p8ky.R.inc(21652);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21653)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21654)==0&false)); ++i) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21655);trace += getEntry(i, i);
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21656);return trace;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] operate(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21657);
        __CLR4_4_1geygeylb90p8ky.R.inc(21658);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21659);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21660);if ((((v.length != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21661)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21662)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21663);throw new DimensionMismatchException(v.length, nCols);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21664);final double[] out = new double[nRows];
        __CLR4_4_1geygeylb90p8ky.R.inc(21665);for (int row = 0; (((row < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21666)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21667)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21668);double sum = 0;
            __CLR4_4_1geygeylb90p8ky.R.inc(21669);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21670)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21671)==0&false)); ++i) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21672);sum += getEntry(row, i) * v[i];
            }
            }__CLR4_4_1geygeylb90p8ky.R.inc(21673);out[row] = sum;
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21674);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector operate(final RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21675);
        __CLR4_4_1geygeylb90p8ky.R.inc(21676);try {
            __CLR4_4_1geygeylb90p8ky.R.inc(21677);return new ArrayRealVector(operate(((ArrayRealVector) v).getDataRef()), false);
        } catch (ClassCastException cce) {
            __CLR4_4_1geygeylb90p8ky.R.inc(21678);final int nRows = getRowDimension();
            __CLR4_4_1geygeylb90p8ky.R.inc(21679);final int nCols = getColumnDimension();
            __CLR4_4_1geygeylb90p8ky.R.inc(21680);if ((((v.getDimension() != nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21681)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21682)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21683);throw new DimensionMismatchException(v.getDimension(), nCols);
            }

            }__CLR4_4_1geygeylb90p8ky.R.inc(21684);final double[] out = new double[nRows];
            __CLR4_4_1geygeylb90p8ky.R.inc(21685);for (int row = 0; (((row < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21686)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21687)==0&false)); ++row) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21688);double sum = 0;
                __CLR4_4_1geygeylb90p8ky.R.inc(21689);for (int i = 0; (((i < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21690)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21691)==0&false)); ++i) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21692);sum += getEntry(row, i) * v.getEntry(i);
                }
                }__CLR4_4_1geygeylb90p8ky.R.inc(21693);out[row] = sum;
            }

            }__CLR4_4_1geygeylb90p8ky.R.inc(21694);return new ArrayRealVector(out, false);
        }
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] preMultiply(final double[] v) throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21695);

        __CLR4_4_1geygeylb90p8ky.R.inc(21696);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21697);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21698);if ((((v.length != nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21699)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21700)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21701);throw new DimensionMismatchException(v.length, nRows);
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21702);final double[] out = new double[nCols];
        __CLR4_4_1geygeylb90p8ky.R.inc(21703);for (int col = 0; (((col < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21704)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21705)==0&false)); ++col) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21706);double sum = 0;
            __CLR4_4_1geygeylb90p8ky.R.inc(21707);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21708)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21709)==0&false)); ++i) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21710);sum += getEntry(i, col) * v[i];
            }
            }__CLR4_4_1geygeylb90p8ky.R.inc(21711);out[col] = sum;
        }

        }__CLR4_4_1geygeylb90p8ky.R.inc(21712);return out;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public RealVector preMultiply(final RealVector v) throws DimensionMismatchException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21713);
        __CLR4_4_1geygeylb90p8ky.R.inc(21714);try {
            __CLR4_4_1geygeylb90p8ky.R.inc(21715);return new ArrayRealVector(preMultiply(((ArrayRealVector) v).getDataRef()), false);
        } catch (ClassCastException cce) {

            __CLR4_4_1geygeylb90p8ky.R.inc(21716);final int nRows = getRowDimension();
            __CLR4_4_1geygeylb90p8ky.R.inc(21717);final int nCols = getColumnDimension();
            __CLR4_4_1geygeylb90p8ky.R.inc(21718);if ((((v.getDimension() != nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21719)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21720)==0&false))) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21721);throw new DimensionMismatchException(v.getDimension(), nRows);
            }

            }__CLR4_4_1geygeylb90p8ky.R.inc(21722);final double[] out = new double[nCols];
            __CLR4_4_1geygeylb90p8ky.R.inc(21723);for (int col = 0; (((col < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21724)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21725)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21726);double sum = 0;
                __CLR4_4_1geygeylb90p8ky.R.inc(21727);for (int i = 0; (((i < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21728)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21729)==0&false)); ++i) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21730);sum += getEntry(i, col) * v.getEntry(i);
                }
                }__CLR4_4_1geygeylb90p8ky.R.inc(21731);out[col] = sum;
            }

            }__CLR4_4_1geygeylb90p8ky.R.inc(21732);return new ArrayRealVector(out, false);
        }
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21733);
        __CLR4_4_1geygeylb90p8ky.R.inc(21734);final int rows    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21735);final int columns = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21736);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21737);for (int row = 0; (((row < rows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21738)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21739)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21740);for (int column = 0; (((column < columns)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21741)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21742)==0&false)); ++column) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21743);final double oldValue = getEntry(row, column);
                __CLR4_4_1geygeylb90p8ky.R.inc(21744);final double newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1geygeylb90p8ky.R.inc(21745);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21746);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21747);
        __CLR4_4_1geygeylb90p8ky.R.inc(21748);final int rows    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21749);final int columns = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21750);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21751);for (int row = 0; (((row < rows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21752)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21753)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21754);for (int column = 0; (((column < columns)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21755)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21756)==0&false)); ++column) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21757);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21758);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21759);
        __CLR4_4_1geygeylb90p8ky.R.inc(21760);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21761);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21762);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21763)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21764)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21765);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21766)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21767)==0&false)); ++column) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21768);final double oldValue = getEntry(row, column);
                __CLR4_4_1geygeylb90p8ky.R.inc(21769);final double newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1geygeylb90p8ky.R.inc(21770);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21771);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21772);
        __CLR4_4_1geygeylb90p8ky.R.inc(21773);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21774);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21775);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21776)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21777)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21778);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21779)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21780)==0&false)); ++column) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21781);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21782);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21783);
        __CLR4_4_1geygeylb90p8ky.R.inc(21784);final int rows    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21785);final int columns = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21786);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21787);for (int column = 0; (((column < columns)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21788)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21789)==0&false)); ++column) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21790);for (int row = 0; (((row < rows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21791)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21792)==0&false)); ++row) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21793);final double oldValue = getEntry(row, column);
                __CLR4_4_1geygeylb90p8ky.R.inc(21794);final double newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1geygeylb90p8ky.R.inc(21795);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21796);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21797);
        __CLR4_4_1geygeylb90p8ky.R.inc(21798);final int rows    = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21799);final int columns = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21800);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21801);for (int column = 0; (((column < columns)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21802)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21803)==0&false)); ++column) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21804);for (int row = 0; (((row < rows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21805)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21806)==0&false)); ++row) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21807);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21808);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21809);
        __CLR4_4_1geygeylb90p8ky.R.inc(21810);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21811);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21812);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21813)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21814)==0&false)); ++column) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21815);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21816)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21817)==0&false)); ++row) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21818);final double oldValue = getEntry(row, column);
                __CLR4_4_1geygeylb90p8ky.R.inc(21819);final double newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1geygeylb90p8ky.R.inc(21820);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21821);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21822);
        __CLR4_4_1geygeylb90p8ky.R.inc(21823);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21824);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1geygeylb90p8ky.R.inc(21825);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21826)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21827)==0&false)); ++column) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21828);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21829)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21830)==0&false)); ++row) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21831);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21832);return visitor.end();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21833);
        __CLR4_4_1geygeylb90p8ky.R.inc(21834);return walkInRowOrder(visitor);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21835);
        __CLR4_4_1geygeylb90p8ky.R.inc(21836);return walkInRowOrder(visitor);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn,
                                       final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21837);
        __CLR4_4_1geygeylb90p8ky.R.inc(21838);return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn,
                                       final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1geygeylb90p8ky.R.inc(21839);
        __CLR4_4_1geygeylb90p8ky.R.inc(21840);return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Get a string representation for this matrix.
     * @return a string representation for this matrix
     */
    @Override
    public String toString() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21841);
        __CLR4_4_1geygeylb90p8ky.R.inc(21842);final StringBuilder res = new StringBuilder();
        __CLR4_4_1geygeylb90p8ky.R.inc(21843);String fullClassName = getClass().getName();
        __CLR4_4_1geygeylb90p8ky.R.inc(21844);String shortClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        __CLR4_4_1geygeylb90p8ky.R.inc(21845);res.append(shortClassName);
        __CLR4_4_1geygeylb90p8ky.R.inc(21846);res.append(DEFAULT_FORMAT.format(this));
        __CLR4_4_1geygeylb90p8ky.R.inc(21847);return res.toString();
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is a
     * <code>RealMatrix</code> instance with the same dimensions as this
     * and all corresponding matrix entries are equal.
     *
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(final Object object) {try{__CLR4_4_1geygeylb90p8ky.R.inc(21848);
        __CLR4_4_1geygeylb90p8ky.R.inc(21849);if ((((object == this )&&(__CLR4_4_1geygeylb90p8ky.R.iget(21850)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21851)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21852);return true;
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21853);if ((((object instanceof RealMatrix == false)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21854)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21855)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21856);return false;
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21857);RealMatrix m = (RealMatrix) object;
        __CLR4_4_1geygeylb90p8ky.R.inc(21858);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21859);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21860);if ((((m.getColumnDimension() != nCols || m.getRowDimension() != nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21861)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21862)==0&false))) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21863);return false;
        }
        }__CLR4_4_1geygeylb90p8ky.R.inc(21864);for (int row = 0; (((row < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21865)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21866)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21867);for (int col = 0; (((col < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21868)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21869)==0&false)); ++col) {{
                __CLR4_4_1geygeylb90p8ky.R.inc(21870);if ((((getEntry(row, col) != m.getEntry(row, col))&&(__CLR4_4_1geygeylb90p8ky.R.iget(21871)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21872)==0&false))) {{
                    __CLR4_4_1geygeylb90p8ky.R.inc(21873);return false;
                }
            }}
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21874);return true;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}

    /**
     * Computes a hashcode for the matrix.
     *
     * @return hashcode for matrix
     */
    @Override
    public int hashCode() {try{__CLR4_4_1geygeylb90p8ky.R.inc(21875);
        __CLR4_4_1geygeylb90p8ky.R.inc(21876);int ret = 7;
        __CLR4_4_1geygeylb90p8ky.R.inc(21877);final int nRows = getRowDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21878);final int nCols = getColumnDimension();
        __CLR4_4_1geygeylb90p8ky.R.inc(21879);ret = ret * 31 + nRows;
        __CLR4_4_1geygeylb90p8ky.R.inc(21880);ret = ret * 31 + nCols;
        __CLR4_4_1geygeylb90p8ky.R.inc(21881);for (int row = 0; (((row < nRows)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21882)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21883)==0&false)); ++row) {{
            __CLR4_4_1geygeylb90p8ky.R.inc(21884);for (int col = 0; (((col < nCols)&&(__CLR4_4_1geygeylb90p8ky.R.iget(21885)!=0|true))||(__CLR4_4_1geygeylb90p8ky.R.iget(21886)==0&false)); ++col) {{
               __CLR4_4_1geygeylb90p8ky.R.inc(21887);ret = ret * 31 + (11 * (row+1) + 17 * (col+1)) *
                   MathUtils.hash(getEntry(row, col));
           }
        }}
        }__CLR4_4_1geygeylb90p8ky.R.inc(21888);return ret;
    }finally{__CLR4_4_1geygeylb90p8ky.R.flushNeeded();}}


    /*
     * Empty implementations of these methods are provided in order to allow for
     * the use of the @Override tag with Java 1.5.
     */

    /** {@inheritDoc} */
    public abstract RealMatrix createMatrix(int rowDimension, int columnDimension)
        throws NotStrictlyPositiveException;

    /** {@inheritDoc} */
    public abstract RealMatrix copy();

    /** {@inheritDoc} */
    public abstract double getEntry(int row, int column)
        throws OutOfRangeException;

    /** {@inheritDoc} */
    public abstract void setEntry(int row, int column, double value)
        throws OutOfRangeException;
}
