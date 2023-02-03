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
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;

/**
 * Sparse matrix implementation based on an open addressed map.
 *
 * @version $Id$
 * @since 2.0
 * @deprecated As of version 3.1, this class is deprecated, for reasons exposed
 * in this JIRA
 * <a href="https://issues.apache.org/jira/browse/MATH-870">ticket</a>. This
 * class will be removed in version 4.0.
 *
 */
@Deprecated
public class OpenMapRealMatrix extends AbstractRealMatrix
    implements SparseRealMatrix, Serializable {public static class __CLR4_4_1lielielb90p8z2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28007,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -5962461716457143437L;
    /** Number of rows of the matrix. */
    private final int rows;
    /** Number of columns of the matrix. */
    private final int columns;
    /** Storage for (sparse) matrix elements. */
    private final OpenIntToDoubleHashMap entries;

    /**
     * Build a sparse matrix with the supplied row and column dimensions.
     *
     * @param rowDimension Number of rows of the matrix.
     * @param columnDimension Number of columns of the matrix.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @throws NumberIsTooLargeException if the total number of entries of the
     * matrix is larger than {@code Integer.MAX_VALUE}.
     */
    public OpenMapRealMatrix(int rowDimension, int columnDimension)
        throws NotStrictlyPositiveException, NumberIsTooLargeException {
        super(rowDimension, columnDimension);__CLR4_4_1lielielb90p8z2.R.inc(27879);try{__CLR4_4_1lielielb90p8z2.R.inc(27878);
        __CLR4_4_1lielielb90p8z2.R.inc(27880);long lRow = rowDimension;
        __CLR4_4_1lielielb90p8z2.R.inc(27881);long lCol = columnDimension;
        __CLR4_4_1lielielb90p8z2.R.inc(27882);if ((((lRow * lCol >= Integer.MAX_VALUE)&&(__CLR4_4_1lielielb90p8z2.R.iget(27883)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27884)==0&false))) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27885);throw new NumberIsTooLargeException(lRow * lCol, Integer.MAX_VALUE, false);
        }
        }__CLR4_4_1lielielb90p8z2.R.inc(27886);this.rows = rowDimension;
        __CLR4_4_1lielielb90p8z2.R.inc(27887);this.columns = columnDimension;
        __CLR4_4_1lielielb90p8z2.R.inc(27888);this.entries = new OpenIntToDoubleHashMap(0.0);
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * Build a matrix by copying another one.
     *
     * @param matrix matrix to copy.
     */
    public OpenMapRealMatrix(OpenMapRealMatrix matrix) {try{__CLR4_4_1lielielb90p8z2.R.inc(27889);
        __CLR4_4_1lielielb90p8z2.R.inc(27890);this.rows = matrix.rows;
        __CLR4_4_1lielielb90p8z2.R.inc(27891);this.columns = matrix.columns;
        __CLR4_4_1lielielb90p8z2.R.inc(27892);this.entries = new OpenIntToDoubleHashMap(matrix.entries);
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealMatrix copy() {try{__CLR4_4_1lielielb90p8z2.R.inc(27893);
        __CLR4_4_1lielielb90p8z2.R.inc(27894);return new OpenMapRealMatrix(this);
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NumberIsTooLargeException if the total number of entries of the
     * matrix is larger than {@code Integer.MAX_VALUE}.
     */
    @Override
    public OpenMapRealMatrix createMatrix(int rowDimension, int columnDimension)
        throws NotStrictlyPositiveException, NumberIsTooLargeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27895);
        __CLR4_4_1lielielb90p8z2.R.inc(27896);return new OpenMapRealMatrix(rowDimension, columnDimension);
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1lielielb90p8z2.R.inc(27897);
        __CLR4_4_1lielielb90p8z2.R.inc(27898);return columns;
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * Compute the sum of this matrix and {@code m}.
     *
     * @param m Matrix to be added.
     * @return {@code this} + {@code m}.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public OpenMapRealMatrix add(OpenMapRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1lielielb90p8z2.R.inc(27899);

        __CLR4_4_1lielielb90p8z2.R.inc(27900);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1lielielb90p8z2.R.inc(27901);final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
        __CLR4_4_1lielielb90p8z2.R.inc(27902);for (OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); (((iterator.hasNext())&&(__CLR4_4_1lielielb90p8z2.R.iget(27903)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27904)==0&false));) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27905);iterator.advance();
            __CLR4_4_1lielielb90p8z2.R.inc(27906);final int row = iterator.key() / columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27907);final int col = iterator.key() - row * columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27908);out.setEntry(row, col, getEntry(row, col) + iterator.value());
        }

        }__CLR4_4_1lielielb90p8z2.R.inc(27909);return out;

    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealMatrix subtract(final RealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1lielielb90p8z2.R.inc(27910);
        __CLR4_4_1lielielb90p8z2.R.inc(27911);try {
            __CLR4_4_1lielielb90p8z2.R.inc(27912);return subtract((OpenMapRealMatrix) m);
        } catch (ClassCastException cce) {
            __CLR4_4_1lielielb90p8z2.R.inc(27913);return (OpenMapRealMatrix) super.subtract(m);
        }
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * Subtract {@code m} from this matrix.
     *
     * @param m Matrix to be subtracted.
     * @return {@code this} - {@code m}.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public OpenMapRealMatrix subtract(OpenMapRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1lielielb90p8z2.R.inc(27914);
        __CLR4_4_1lielielb90p8z2.R.inc(27915);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1lielielb90p8z2.R.inc(27916);final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
        __CLR4_4_1lielielb90p8z2.R.inc(27917);for (OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); (((iterator.hasNext())&&(__CLR4_4_1lielielb90p8z2.R.iget(27918)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27919)==0&false));) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27920);iterator.advance();
            __CLR4_4_1lielielb90p8z2.R.inc(27921);final int row = iterator.key() / columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27922);final int col = iterator.key() - row * columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27923);out.setEntry(row, col, getEntry(row, col) - iterator.value());
        }

        }__CLR4_4_1lielielb90p8z2.R.inc(27924);return out;
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NumberIsTooLargeException if {@code m} is an
     * {@code OpenMapRealMatrix}, and the total number of entries of the product
     * is larger than {@code Integer.MAX_VALUE}.
     */
    @Override
    public RealMatrix multiply(final RealMatrix m)
        throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27925);
        __CLR4_4_1lielielb90p8z2.R.inc(27926);try {
            __CLR4_4_1lielielb90p8z2.R.inc(27927);return multiply((OpenMapRealMatrix) m);
        } catch (ClassCastException cce) {

            __CLR4_4_1lielielb90p8z2.R.inc(27928);MatrixUtils.checkMultiplicationCompatible(this, m);

            __CLR4_4_1lielielb90p8z2.R.inc(27929);final int outCols = m.getColumnDimension();
            __CLR4_4_1lielielb90p8z2.R.inc(27930);final BlockRealMatrix out = new BlockRealMatrix(rows, outCols);
            __CLR4_4_1lielielb90p8z2.R.inc(27931);for (OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); (((iterator.hasNext())&&(__CLR4_4_1lielielb90p8z2.R.iget(27932)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27933)==0&false));) {{
                __CLR4_4_1lielielb90p8z2.R.inc(27934);iterator.advance();
                __CLR4_4_1lielielb90p8z2.R.inc(27935);final double value = iterator.value();
                __CLR4_4_1lielielb90p8z2.R.inc(27936);final int key      = iterator.key();
                __CLR4_4_1lielielb90p8z2.R.inc(27937);final int i        = key / columns;
                __CLR4_4_1lielielb90p8z2.R.inc(27938);final int k        = key % columns;
                __CLR4_4_1lielielb90p8z2.R.inc(27939);for (int j = 0; (((j < outCols)&&(__CLR4_4_1lielielb90p8z2.R.iget(27940)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27941)==0&false)); ++j) {{
                    __CLR4_4_1lielielb90p8z2.R.inc(27942);out.addToEntry(i, j, value * m.getEntry(k, j));
                }
            }}

            }__CLR4_4_1lielielb90p8z2.R.inc(27943);return out;
        }
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * Postmultiply this matrix by {@code m}.
     *
     * @param m Matrix to postmultiply by.
     * @return {@code this} * {@code m}.
     * @throws DimensionMismatchException if the number of rows of {@code m}
     * differ from the number of columns of {@code this} matrix.
     * @throws NumberIsTooLargeException if the total number of entries of the
     * product is larger than {@code Integer.MAX_VALUE}.
     */
    public OpenMapRealMatrix multiply(OpenMapRealMatrix m)
        throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27944);
        // Safety check.
        __CLR4_4_1lielielb90p8z2.R.inc(27945);MatrixUtils.checkMultiplicationCompatible(this, m);

        __CLR4_4_1lielielb90p8z2.R.inc(27946);final int outCols = m.getColumnDimension();
        __CLR4_4_1lielielb90p8z2.R.inc(27947);OpenMapRealMatrix out = new OpenMapRealMatrix(rows, outCols);
        __CLR4_4_1lielielb90p8z2.R.inc(27948);for (OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); (((iterator.hasNext())&&(__CLR4_4_1lielielb90p8z2.R.iget(27949)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27950)==0&false));) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27951);iterator.advance();
            __CLR4_4_1lielielb90p8z2.R.inc(27952);final double value = iterator.value();
            __CLR4_4_1lielielb90p8z2.R.inc(27953);final int key      = iterator.key();
            __CLR4_4_1lielielb90p8z2.R.inc(27954);final int i        = key / columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27955);final int k        = key % columns;
            __CLR4_4_1lielielb90p8z2.R.inc(27956);for (int j = 0; (((j < outCols)&&(__CLR4_4_1lielielb90p8z2.R.iget(27957)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27958)==0&false)); ++j) {{
                __CLR4_4_1lielielb90p8z2.R.inc(27959);final int rightKey = m.computeKey(k, j);
                __CLR4_4_1lielielb90p8z2.R.inc(27960);if ((((m.entries.containsKey(rightKey))&&(__CLR4_4_1lielielb90p8z2.R.iget(27961)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27962)==0&false))) {{
                    __CLR4_4_1lielielb90p8z2.R.inc(27963);final int outKey = out.computeKey(i, j);
                    __CLR4_4_1lielielb90p8z2.R.inc(27964);final double outValue =
                        out.entries.get(outKey) + value * m.entries.get(rightKey);
                    __CLR4_4_1lielielb90p8z2.R.inc(27965);if ((((outValue == 0.0)&&(__CLR4_4_1lielielb90p8z2.R.iget(27966)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27967)==0&false))) {{
                        __CLR4_4_1lielielb90p8z2.R.inc(27968);out.entries.remove(outKey);
                    } }else {{
                        __CLR4_4_1lielielb90p8z2.R.inc(27969);out.entries.put(outKey, outValue);
                    }
                }}
            }}
        }}

        }__CLR4_4_1lielielb90p8z2.R.inc(27970);return out;
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(int row, int column) throws OutOfRangeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27971);
        __CLR4_4_1lielielb90p8z2.R.inc(27972);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1lielielb90p8z2.R.inc(27973);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27974);return entries.get(computeKey(row, column));
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1lielielb90p8z2.R.inc(27975);
        __CLR4_4_1lielielb90p8z2.R.inc(27976);return rows;
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(int row, int column, double value)
        throws OutOfRangeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27977);
        __CLR4_4_1lielielb90p8z2.R.inc(27978);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1lielielb90p8z2.R.inc(27979);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27980);if ((((value == 0.0)&&(__CLR4_4_1lielielb90p8z2.R.iget(27981)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27982)==0&false))) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27983);entries.remove(computeKey(row, column));
        } }else {{
            __CLR4_4_1lielielb90p8z2.R.inc(27984);entries.put(computeKey(row, column), value);
        }
    }}finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(int row, int column, double increment)
        throws OutOfRangeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27985);
        __CLR4_4_1lielielb90p8z2.R.inc(27986);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1lielielb90p8z2.R.inc(27987);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27988);final int key = computeKey(row, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27989);final double value = entries.get(key) + increment;
        __CLR4_4_1lielielb90p8z2.R.inc(27990);if ((((value == 0.0)&&(__CLR4_4_1lielielb90p8z2.R.iget(27991)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(27992)==0&false))) {{
            __CLR4_4_1lielielb90p8z2.R.inc(27993);entries.remove(key);
        } }else {{
            __CLR4_4_1lielielb90p8z2.R.inc(27994);entries.put(key, value);
        }
    }}finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(int row, int column, double factor)
        throws OutOfRangeException {try{__CLR4_4_1lielielb90p8z2.R.inc(27995);
        __CLR4_4_1lielielb90p8z2.R.inc(27996);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1lielielb90p8z2.R.inc(27997);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27998);final int key = computeKey(row, column);
        __CLR4_4_1lielielb90p8z2.R.inc(27999);final double value = entries.get(key) * factor;
        __CLR4_4_1lielielb90p8z2.R.inc(28000);if ((((value == 0.0)&&(__CLR4_4_1lielielb90p8z2.R.iget(28001)!=0|true))||(__CLR4_4_1lielielb90p8z2.R.iget(28002)==0&false))) {{
            __CLR4_4_1lielielb90p8z2.R.inc(28003);entries.remove(key);
        } }else {{
            __CLR4_4_1lielielb90p8z2.R.inc(28004);entries.put(key, value);
        }
    }}finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}

    /**
     * Compute the key to access a matrix element
     * @param row row index of the matrix element
     * @param column column index of the matrix element
     * @return key within the map to access the matrix element
     */
    private int computeKey(int row, int column) {try{__CLR4_4_1lielielb90p8z2.R.inc(28005);
        __CLR4_4_1lielielb90p8z2.R.inc(28006);return row * columns + column;
    }finally{__CLR4_4_1lielielb90p8z2.R.flushNeeded();}}


}
