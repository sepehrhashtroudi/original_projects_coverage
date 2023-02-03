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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

/**
 * Cache-friendly implementation of FieldMatrix using a flat arrays to store
 * square blocks of the matrix.
 * <p>
 * This implementation is specially designed to be cache-friendly. Square blocks are
 * stored as small arrays and allow efficient traversal of data both in row major direction
 * and columns major direction, one block at a time. This greatly increases performances
 * for algorithms that use crossed directions loops like multiplication or transposition.
 * </p>
 * <p>
 * The size of square blocks is a static parameter. It may be tuned according to the cache
 * size of the target computer processor. As a rule of thumbs, it should be the largest
 * value that allows three blocks to be simultaneously cached (this is necessary for example
 * for matrix multiplication). The default value is to use 36x36 blocks.
 * </p>
 * <p>
 * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks
 * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square
 * blocks are flattened in row major order in single dimension arrays which are therefore
 * {@link #BLOCK_SIZE}<sup>2</sup> elements long for regular blocks. The blocks are themselves
 * organized in row major order.
 * </p>
 * <p>
 * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.
 * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be
 * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]
 * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding
 * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center
 * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28
 * rectangle.
 * </p>
 * <p>
 * The layout complexity overhead versus simple mapping of matrices to java
 * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads
 * to up to 3-fold improvements for matrices of moderate to large size.
 * </p>
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 2.0
 */
public class BlockFieldMatrix<T extends FieldElement<T>> extends AbstractFieldMatrix<T> implements Serializable {public static class __CLR4_4_1iauiaulb90p8r6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,24719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Block size. */
    public static final int BLOCK_SIZE = 36;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -4602336630143123183L;
    /** Blocks of matrix entries. */
    private final T blocks[][];
    /** Number of rows of the matrix. */
    private final int rows;
    /** Number of columns of the matrix. */
    private final int columns;
    /** Number of block rows of the matrix. */
    private final int blockRows;
    /** Number of block columns of the matrix. */
    private final int blockColumns;

    /**
     * Create a new matrix with the supplied row and column dimensions.
     *
     * @param field Field to which the elements belong.
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     */
    public BlockFieldMatrix(final Field<T> field, final int rows,
                            final int columns)
        throws NotStrictlyPositiveException {
        super(field, rows, columns);__CLR4_4_1iauiaulb90p8r6.R.inc(23719);try{__CLR4_4_1iauiaulb90p8r6.R.inc(23718);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23720);this.rows    = rows;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23721);this.columns = columns;

        // number of blocks
        __CLR4_4_1iauiaulb90p8r6.R.inc(23722);blockRows    = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23723);blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // allocate storage blocks, taking care of smaller ones at right and bottom
        __CLR4_4_1iauiaulb90p8r6.R.inc(23724);blocks = createBlocksLayout(field, rows, columns);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Create a new dense matrix copying entries from raw layout data.
     * <p>The input array <em>must</em> already be in raw layout.</p>
     * <p>Calling this constructor is equivalent to call:
     * <pre>matrix = new BlockFieldMatrix<T>(getField(), rawData.length, rawData[0].length,
     *                                   toBlocksLayout(rawData), false);</pre>
     * </p>
     *
     * @param rawData Data for the new matrix, in raw layout.
     * @throws DimensionMismatchException if the {@code blockData} shape is
     * inconsistent with block layout.
     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)
     */
    public BlockFieldMatrix(final T[][] rawData)
        throws DimensionMismatchException {
        this(rawData.length, rawData[0].length, toBlocksLayout(rawData), false);__CLR4_4_1iauiaulb90p8r6.R.inc(23726);try{__CLR4_4_1iauiaulb90p8r6.R.inc(23725);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Create a new dense matrix copying entries from block layout data.
     * <p>The input array <em>must</em> already be in blocks layout.</p>
     * @param rows  the number of rows in the new matrix
     * @param columns  the number of columns in the new matrix
     * @param blockData data for new matrix
     * @param copyArray if true, the input array will be copied, otherwise
     * it will be referenced
     *
     * @throws DimensionMismatchException if the {@code blockData} shape is
     * inconsistent with block layout.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @see #createBlocksLayout(Field, int, int)
     * @see #toBlocksLayout(FieldElement[][])
     * @see #BlockFieldMatrix(FieldElement[][])
     */
    public BlockFieldMatrix(final int rows, final int columns,
                            final T[][] blockData, final boolean copyArray)
        throws DimensionMismatchException, NotStrictlyPositiveException {
        super(extractField(blockData), rows, columns);__CLR4_4_1iauiaulb90p8r6.R.inc(23728);try{__CLR4_4_1iauiaulb90p8r6.R.inc(23727);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23729);this.rows    = rows;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23730);this.columns = columns;

        // number of blocks
        __CLR4_4_1iauiaulb90p8r6.R.inc(23731);blockRows    = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23732);blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        __CLR4_4_1iauiaulb90p8r6.R.inc(23733);if ((((copyArray)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23734)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23735)==0&false))) {{
            // allocate storage blocks, taking care of smaller ones at right and bottom
            __CLR4_4_1iauiaulb90p8r6.R.inc(23736);blocks = MathArrays.buildArray(getField(), blockRows * blockColumns, -1);
        } }else {{
            // reference existing array
            __CLR4_4_1iauiaulb90p8r6.R.inc(23737);blocks = blockData;
        }

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23738);int index = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23739);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23740)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23741)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23742);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(23743);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23744)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23745)==0&false)); ++jBlock, ++index) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23746);if ((((blockData[index].length != iHeight * blockWidth(jBlock))&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23747)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23748)==0&false))) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23749);throw new DimensionMismatchException(blockData[index].length,
                                                         iHeight * blockWidth(jBlock));
                }
                }__CLR4_4_1iauiaulb90p8r6.R.inc(23750);if ((((copyArray)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23751)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23752)==0&false))) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23753);blocks[index] = blockData[index].clone();
                }
            }}
        }}
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Convert a data array from raw layout to blocks layout.
     * <p>
     * Raw layout is the straightforward layout where element at row i and
     * column j is in array element <code>rawData[i][j]</code>. Blocks layout
     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix
     * is split in square blocks (except at right and bottom side where blocks may
     * be rectangular to fit matrix size) and each block is stored in a flattened
     * one-dimensional array.
     * </p>
     * <p>
     * This method creates an array in blocks layout from an input array in raw layout.
     * It can be used to provide the array argument of the {@link
     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}
     * constructor.
     * </p>
     * @param <T> Type of the field elements.
     * @param rawData Data array in raw layout.
     * @return a new data array containing the same entries but in blocks layout
     * @throws DimensionMismatchException if {@code rawData} is not rectangular
     *  (not all rows have the same length).
     * @see #createBlocksLayout(Field, int, int)
     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)
     */
    public static <T extends FieldElement<T>> T[][] toBlocksLayout(final T[][] rawData)
        throws DimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23754);

        __CLR4_4_1iauiaulb90p8r6.R.inc(23755);final int rows         = rawData.length;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23756);final int columns      = rawData[0].length;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23757);final int blockRows    = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23758);final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // safety checks
        __CLR4_4_1iauiaulb90p8r6.R.inc(23759);for (int i = 0; (((i < rawData.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23760)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23761)==0&false)); ++i) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23762);final int length = rawData[i].length;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23763);if ((((length != columns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23764)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23765)==0&false))) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23766);throw new DimensionMismatchException(columns, length);
            }
        }}

        // convert array
        }__CLR4_4_1iauiaulb90p8r6.R.inc(23767);final Field<T> field = extractField(rawData);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23768);final T[][] blocks = MathArrays.buildArray(field, blockRows * blockColumns, -1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23769);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23770);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23771)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23772)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23773);final int pStart  = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23774);final int pEnd    = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(23775);final int iHeight = pEnd - pStart;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23776);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23777)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23778)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23779);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23780);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(23781);final int jWidth = qEnd - qStart;

                // allocate new block
                __CLR4_4_1iauiaulb90p8r6.R.inc(23782);final T[] block = MathArrays.buildArray(field, iHeight * jWidth);
                __CLR4_4_1iauiaulb90p8r6.R.inc(23783);blocks[blockIndex] = block;

                // copy data
                __CLR4_4_1iauiaulb90p8r6.R.inc(23784);int index = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23785);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23786)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23787)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23788);System.arraycopy(rawData[p], qStart, block, index, jWidth);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23789);index += jWidth;
                }

                }__CLR4_4_1iauiaulb90p8r6.R.inc(23790);++blockIndex;
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23791);return blocks;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Create a data array in blocks layout.
     * <p>
     * This method can be used to create the array argument of the {@link
     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}
     * constructor.
     * </p>
     * @param <T> Type of the field elements.
     * @param field Field to which the elements belong.
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @return a new data array in blocks layout.
     * @see #toBlocksLayout(FieldElement[][])
     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)
     */
    public static <T extends FieldElement<T>> T[][] createBlocksLayout(final Field<T> field,
                                                                       final int rows, final int columns) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23792);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23793);final int blockRows    = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23794);final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        __CLR4_4_1iauiaulb90p8r6.R.inc(23795);final T[][] blocks = MathArrays.buildArray(field, blockRows * blockColumns, -1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23796);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23797);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23798)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23799)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23800);final int pStart  = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23801);final int pEnd    = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(23802);final int iHeight = pEnd - pStart;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23803);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23804)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23805)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23806);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23807);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(23808);final int jWidth = qEnd - qStart;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23809);blocks[blockIndex] = MathArrays.buildArray(field, iHeight * jWidth);
                __CLR4_4_1iauiaulb90p8r6.R.inc(23810);++blockIndex;
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23811);return blocks;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> createMatrix(final int rowDimension,
                                       final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23812);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23813);return new BlockFieldMatrix<T>(getField(), rowDimension,
                                       columnDimension);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> copy() {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23814);

        // create an empty matrix
        __CLR4_4_1iauiaulb90p8r6.R.inc(23815);BlockFieldMatrix<T> copied = new BlockFieldMatrix<T>(getField(), rows, columns);

        // copy the blocks
        __CLR4_4_1iauiaulb90p8r6.R.inc(23816);for (int i = 0; (((i < blocks.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23817)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23818)==0&false)); ++i) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23819);System.arraycopy(blocks[i], 0, copied.blocks[i], 0, blocks[i].length);
        }

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23820);return copied;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> add(final FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23821);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23822);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(23823);return add((BlockFieldMatrix<T>) m);
        } catch (ClassCastException cce) {

            // safety check
            __CLR4_4_1iauiaulb90p8r6.R.inc(23824);checkAdditionCompatible(m);

            __CLR4_4_1iauiaulb90p8r6.R.inc(23825);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

            // perform addition block-wise, to ensure good cache behavior
            __CLR4_4_1iauiaulb90p8r6.R.inc(23826);int blockIndex = 0;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23827);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23828)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23829)==0&false)); ++iBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23830);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23831)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23832)==0&false)); ++jBlock) {{

                    // perform addition on the current block
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23833);final T[] outBlock = out.blocks[blockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23834);final T[] tBlock   = blocks[blockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23835);final int      pStart   = iBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23836);final int      pEnd     = FastMath.min(pStart + BLOCK_SIZE, rows);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23837);final int      qStart   = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23838);final int      qEnd     = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23839);int k = 0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23840);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23841)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23842)==0&false)); ++p) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23843);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23844)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23845)==0&false)); ++q) {{
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23846);outBlock[k] = tBlock[k].add(m.getEntry(p, q));
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23847);++k;
                        }
                    }}

                    // go to next block
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(23848);++blockIndex;

                }
            }}

            }__CLR4_4_1iauiaulb90p8r6.R.inc(23849);return out;
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Compute the sum of {@code this} and {@code m}.
     *
     * @param m matrix to be added
     * @return {@code this + m}
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}
     */
    public BlockFieldMatrix<T> add(final BlockFieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23850);

        // safety check
        __CLR4_4_1iauiaulb90p8r6.R.inc(23851);checkAdditionCompatible(m);

        __CLR4_4_1iauiaulb90p8r6.R.inc(23852);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

        // perform addition block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(23853);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23854)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23855)==0&false)); ++blockIndex) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23856);final T[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23857);final T[] tBlock   = blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23858);final T[] mBlock   = m.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23859);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23860)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23861)==0&false)); ++k) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23862);outBlock[k] = tBlock[k].add(mBlock[k]);
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23863);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> subtract(final FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23864);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23865);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(23866);return subtract((BlockFieldMatrix<T>) m);
        } catch (ClassCastException cce) {

            // safety check
            __CLR4_4_1iauiaulb90p8r6.R.inc(23867);checkSubtractionCompatible(m);

            __CLR4_4_1iauiaulb90p8r6.R.inc(23868);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

            // perform subtraction block-wise, to ensure good cache behavior
            __CLR4_4_1iauiaulb90p8r6.R.inc(23869);int blockIndex = 0;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23870);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23871)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23872)==0&false)); ++iBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23873);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23874)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23875)==0&false)); ++jBlock) {{

                    // perform subtraction on the current block
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23876);final T[] outBlock = out.blocks[blockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23877);final T[] tBlock   = blocks[blockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23878);final int      pStart   = iBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23879);final int      pEnd     = FastMath.min(pStart + BLOCK_SIZE, rows);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23880);final int      qStart   = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23881);final int      qEnd     = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23882);int k = 0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23883);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23884)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23885)==0&false)); ++p) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23886);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23887)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23888)==0&false)); ++q) {{
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23889);outBlock[k] = tBlock[k].subtract(m.getEntry(p, q));
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23890);++k;
                        }
                    }}

                    // go to next block
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(23891);++blockIndex;

                }
            }}

            }__CLR4_4_1iauiaulb90p8r6.R.inc(23892);return out;
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Compute {@code this - m}.
     *
     * @param m matrix to be subtracted
     * @return {@code this - m}
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}
     */
    public BlockFieldMatrix<T> subtract(final BlockFieldMatrix<T> m) throws MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23893);
        // safety check
        __CLR4_4_1iauiaulb90p8r6.R.inc(23894);checkSubtractionCompatible(m);

        __CLR4_4_1iauiaulb90p8r6.R.inc(23895);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(23896);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23897)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23898)==0&false)); ++blockIndex) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23899);final T[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23900);final T[] tBlock   = blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23901);final T[] mBlock   = m.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23902);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23903)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23904)==0&false)); ++k) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23905);outBlock[k] = tBlock[k].subtract(mBlock[k]);
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23906);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> scalarAdd(final T d) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23907);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23908);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(23909);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23910)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23911)==0&false)); ++blockIndex) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23912);final T[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23913);final T[] tBlock   = blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23914);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23915)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23916)==0&false)); ++k) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23917);outBlock[k] = tBlock[k].add(d);
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23918);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> scalarMultiply(final T d) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23919);

        __CLR4_4_1iauiaulb90p8r6.R.inc(23920);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(23921);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23922)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23923)==0&false)); ++blockIndex) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(23924);final T[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23925);final T[] tBlock   = blocks[blockIndex];
            __CLR4_4_1iauiaulb90p8r6.R.inc(23926);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23927)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23928)==0&false)); ++k) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23929);outBlock[k] = tBlock[k].multiply(d);
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(23930);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> multiply(final FieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23931);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23932);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(23933);return multiply((BlockFieldMatrix<T>) m);
        } catch (ClassCastException cce) {

            // safety check
            __CLR4_4_1iauiaulb90p8r6.R.inc(23934);checkMultiplicationCompatible(m);

            __CLR4_4_1iauiaulb90p8r6.R.inc(23935);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, m.getColumnDimension());
            __CLR4_4_1iauiaulb90p8r6.R.inc(23936);final T zero = getField().getZero();

            // perform multiplication block-wise, to ensure good cache behavior
            __CLR4_4_1iauiaulb90p8r6.R.inc(23937);int blockIndex = 0;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23938);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23939)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23940)==0&false)); ++iBlock) {{

                __CLR4_4_1iauiaulb90p8r6.R.inc(23941);final int pStart = iBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23942);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);

                __CLR4_4_1iauiaulb90p8r6.R.inc(23943);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23944)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23945)==0&false)); ++jBlock) {{

                    __CLR4_4_1iauiaulb90p8r6.R.inc(23946);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23947);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, m.getColumnDimension());

                    // select current block
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23948);final T[] outBlock = out.blocks[blockIndex];

                    // perform multiplication on current block
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23949);for (int kBlock = 0; (((kBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23950)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23951)==0&false)); ++kBlock) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23952);final int kWidth      = blockWidth(kBlock);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23953);final T[] tBlock = blocks[iBlock * blockColumns + kBlock];
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23954);final int rStart      = kBlock * BLOCK_SIZE;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23955);int k = 0;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(23956);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23957)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23958)==0&false)); ++p) {{
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23959);final int lStart = (p - pStart) * kWidth;
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23960);final int lEnd   = lStart + kWidth;
                            __CLR4_4_1iauiaulb90p8r6.R.inc(23961);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23962)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23963)==0&false)); ++q) {{
                                __CLR4_4_1iauiaulb90p8r6.R.inc(23964);T sum = zero;
                                __CLR4_4_1iauiaulb90p8r6.R.inc(23965);int r = rStart;
                                __CLR4_4_1iauiaulb90p8r6.R.inc(23966);for (int l = lStart; (((l < lEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23967)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23968)==0&false)); ++l) {{
                                    __CLR4_4_1iauiaulb90p8r6.R.inc(23969);sum = sum.add(tBlock[l].multiply(m.getEntry(r, q)));
                                    __CLR4_4_1iauiaulb90p8r6.R.inc(23970);++r;
                                }
                                }__CLR4_4_1iauiaulb90p8r6.R.inc(23971);outBlock[k] = outBlock[k].add(sum);
                                __CLR4_4_1iauiaulb90p8r6.R.inc(23972);++k;
                            }
                        }}
                    }}

                    // go to next block
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(23973);++blockIndex;

                }
            }}

            }__CLR4_4_1iauiaulb90p8r6.R.inc(23974);return out;
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Returns the result of postmultiplying {@code this} by {@code m}.
     *
     * @param m matrix to postmultiply by
     * @return {@code this * m}
     * @throws DimensionMismatchException if the matrices are not compatible.
     */
    public BlockFieldMatrix<T> multiply(BlockFieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(23975);

        // safety check
        __CLR4_4_1iauiaulb90p8r6.R.inc(23976);checkMultiplicationCompatible(m);

        __CLR4_4_1iauiaulb90p8r6.R.inc(23977);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, m.columns);
        __CLR4_4_1iauiaulb90p8r6.R.inc(23978);final T zero = getField().getZero();

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(23979);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(23980);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23981)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23982)==0&false)); ++iBlock) {{

            __CLR4_4_1iauiaulb90p8r6.R.inc(23983);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(23984);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);

            __CLR4_4_1iauiaulb90p8r6.R.inc(23985);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23986)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23987)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(23988);final int jWidth = out.blockWidth(jBlock);
                __CLR4_4_1iauiaulb90p8r6.R.inc(23989);final int jWidth2 = jWidth  + jWidth;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23990);final int jWidth3 = jWidth2 + jWidth;
                __CLR4_4_1iauiaulb90p8r6.R.inc(23991);final int jWidth4 = jWidth3 + jWidth;

                // select current block
                __CLR4_4_1iauiaulb90p8r6.R.inc(23992);final T[] outBlock = out.blocks[blockIndex];

                // perform multiplication on current block
                __CLR4_4_1iauiaulb90p8r6.R.inc(23993);for (int kBlock = 0; (((kBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(23994)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(23995)==0&false)); ++kBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23996);final int kWidth = blockWidth(kBlock);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23997);final T[] tBlock = blocks[iBlock * blockColumns + kBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23998);final T[] mBlock = m.blocks[kBlock * m.blockColumns + jBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(23999);int k = 0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24000);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24001)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24002)==0&false)); ++p) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24003);final int lStart = (p - pStart) * kWidth;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24004);final int lEnd   = lStart + kWidth;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24005);for (int nStart = 0; (((nStart < jWidth)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24006)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24007)==0&false)); ++nStart) {{
                            __CLR4_4_1iauiaulb90p8r6.R.inc(24008);T sum = zero;
                            __CLR4_4_1iauiaulb90p8r6.R.inc(24009);int l = lStart;
                            __CLR4_4_1iauiaulb90p8r6.R.inc(24010);int n = nStart;
                            __CLR4_4_1iauiaulb90p8r6.R.inc(24011);while ((((l < lEnd - 3)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24012)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24013)==0&false))) {{
                                __CLR4_4_1iauiaulb90p8r6.R.inc(24014);sum = sum.
                                      add(tBlock[l].multiply(mBlock[n])).
                                      add(tBlock[l + 1].multiply(mBlock[n + jWidth])).
                                      add(tBlock[l + 2].multiply(mBlock[n + jWidth2])).
                                      add(tBlock[l + 3].multiply(mBlock[n + jWidth3]));
                                __CLR4_4_1iauiaulb90p8r6.R.inc(24015);l += 4;
                                __CLR4_4_1iauiaulb90p8r6.R.inc(24016);n += jWidth4;
                            }
                            }__CLR4_4_1iauiaulb90p8r6.R.inc(24017);while ((((l < lEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24018)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24019)==0&false))) {{
                                __CLR4_4_1iauiaulb90p8r6.R.inc(24020);sum = sum.add(tBlock[l++].multiply(mBlock[n]));
                                __CLR4_4_1iauiaulb90p8r6.R.inc(24021);n += jWidth;
                            }
                            }__CLR4_4_1iauiaulb90p8r6.R.inc(24022);outBlock[k] = outBlock[k].add(sum);
                            __CLR4_4_1iauiaulb90p8r6.R.inc(24023);++k;
                        }
                    }}
                }}

                // go to next block
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24024);++blockIndex;
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24025);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[][] getData() {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24026);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24027);final T[][] data = MathArrays.buildArray(getField(), getRowDimension(), getColumnDimension());
        __CLR4_4_1iauiaulb90p8r6.R.inc(24028);final int lastColumns = columns - (blockColumns - 1) * BLOCK_SIZE;

        __CLR4_4_1iauiaulb90p8r6.R.inc(24029);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24030)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24031)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24032);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24033);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24034);int regularPos   = 0;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24035);int lastPos      = 0;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24036);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24037)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24038)==0&false)); ++p) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24039);final T[] dataP = data[p];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24040);int blockIndex = iBlock * blockColumns;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24041);int dataPos    = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24042);for (int jBlock = 0; (((jBlock < blockColumns - 1)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24043)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24044)==0&false)); ++jBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24045);System.arraycopy(blocks[blockIndex++], regularPos, dataP, dataPos, BLOCK_SIZE);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24046);dataPos += BLOCK_SIZE;
                }
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24047);System.arraycopy(blocks[blockIndex], lastPos, dataP, dataPos, lastColumns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24048);regularPos += BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24049);lastPos    += lastColumns;
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24050);return data;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> getSubMatrix(final int startRow, final int endRow,
                                       final int startColumn,
                                       final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24051);
        // safety checks
        __CLR4_4_1iauiaulb90p8r6.R.inc(24052);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);

        // create the output matrix
        __CLR4_4_1iauiaulb90p8r6.R.inc(24053);final BlockFieldMatrix<T> out =
            new BlockFieldMatrix<T>(getField(), endRow - startRow + 1, endColumn - startColumn + 1);

        // compute blocks shifts
        __CLR4_4_1iauiaulb90p8r6.R.inc(24054);final int blockStartRow    = startRow    / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24055);final int rowsShift        = startRow    % BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24056);final int blockStartColumn = startColumn / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24057);final int columnsShift     = startColumn % BLOCK_SIZE;

        // perform extraction block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24058);int pBlock = blockStartRow;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24059);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24060)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24061)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24062);final int iHeight = out.blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24063);int qBlock = blockStartColumn;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24064);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24065)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24066)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24067);final int jWidth = out.blockWidth(jBlock);

                // handle one block of the output matrix
                __CLR4_4_1iauiaulb90p8r6.R.inc(24068);final int      outIndex = iBlock * out.blockColumns + jBlock;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24069);final T[] outBlock = out.blocks[outIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24070);final int      index    = pBlock * blockColumns + qBlock;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24071);final int      width    = blockWidth(qBlock);

                __CLR4_4_1iauiaulb90p8r6.R.inc(24072);final int heightExcess = iHeight + rowsShift - BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24073);final int widthExcess  = jWidth + columnsShift - BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24074);if ((((heightExcess > 0)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24075)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24076)==0&false))) {{
                    // the submatrix block spans on two blocks rows from the original matrix
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24077);if ((((widthExcess > 0)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24078)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24079)==0&false))) {{
                        // the submatrix block spans on two blocks columns from the original matrix
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24080);final int width2 = blockWidth(qBlock + 1);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24081);copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24082);copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, BLOCK_SIZE,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24083);copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24084);copyBlockPart(blocks[index + blockColumns + 1], width2,
                                      0, heightExcess,
                                      0, widthExcess,
                                      outBlock, jWidth, iHeight - heightExcess, jWidth - widthExcess);
                    } }else {{
                        // the submatrix block spans on one block column from the original matrix
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24085);copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24086);copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                    }
                }} }else {{
                    // the submatrix block spans on one block row from the original matrix
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24087);if ((((widthExcess > 0)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24088)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24089)==0&false))) {{
                        // the submatrix block spans on two blocks columns from the original matrix
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24090);final int width2 = blockWidth(qBlock + 1);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24091);copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24092);copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, iHeight + rowsShift,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                    } }else {{
                        // the submatrix block spans on one block column from the original matrix
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24093);copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                    }
               }}
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24094);++qBlock;
            }
            }__CLR4_4_1iauiaulb90p8r6.R.inc(24095);++pBlock;
        }

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24096);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Copy a part of a block into another one
     * <p>This method can be called only when the specified part fits in both
     * blocks, no verification is done here.</p>
     * @param srcBlock source block
     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)
     * @param srcStartRow start row in the source block
     * @param srcEndRow end row (exclusive) in the source block
     * @param srcStartColumn start column in the source block
     * @param srcEndColumn end column (exclusive) in the source block
     * @param dstBlock destination block
     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)
     * @param dstStartRow start row in the destination block
     * @param dstStartColumn start column in the destination block
     */
    private void copyBlockPart(final T[] srcBlock, final int srcWidth,
                               final int srcStartRow, final int srcEndRow,
                               final int srcStartColumn, final int srcEndColumn,
                               final T[] dstBlock, final int dstWidth,
                               final int dstStartRow, final int dstStartColumn) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24097);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24098);final int length = srcEndColumn - srcStartColumn;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24099);int srcPos = srcStartRow * srcWidth + srcStartColumn;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24100);int dstPos = dstStartRow * dstWidth + dstStartColumn;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24101);for (int srcRow = srcStartRow; (((srcRow < srcEndRow)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24102)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24103)==0&false)); ++srcRow) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24104);System.arraycopy(srcBlock, srcPos, dstBlock, dstPos, length);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24105);srcPos += srcWidth;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24106);dstPos += dstWidth;
        }
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubMatrix(final T[][] subMatrix, final int row,
                             final int column)
        throws DimensionMismatchException, OutOfRangeException,
        NoDataException, NullArgumentException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24107);
        // safety checks
        __CLR4_4_1iauiaulb90p8r6.R.inc(24108);MathUtils.checkNotNull(subMatrix);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24109);final int refLength = subMatrix[0].length;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24110);if ((((refLength == 0)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24111)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24112)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24113);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24114);final int endRow    = row + subMatrix.length - 1;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24115);final int endColumn = column + refLength - 1;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24116);checkSubMatrixIndex(row, endRow, column, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24117);for (final T[] subRow : subMatrix) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24118);if ((((subRow.length != refLength)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24119)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24120)==0&false))) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24121);throw new DimensionMismatchException(refLength, subRow.length);
            }
        }}

        // compute blocks bounds
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24122);final int blockStartRow    = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24123);final int blockEndRow      = (endRow + BLOCK_SIZE) / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24124);final int blockStartColumn = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24125);final int blockEndColumn   = (endColumn + BLOCK_SIZE) / BLOCK_SIZE;

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24126);for (int iBlock = blockStartRow; (((iBlock < blockEndRow)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24127)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24128)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24129);final int iHeight  = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24130);final int firstRow = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24131);final int iStart   = FastMath.max(row,    firstRow);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24132);final int iEnd     = FastMath.min(endRow + 1, firstRow + iHeight);

            __CLR4_4_1iauiaulb90p8r6.R.inc(24133);for (int jBlock = blockStartColumn; (((jBlock < blockEndColumn)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24134)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24135)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24136);final int jWidth      = blockWidth(jBlock);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24137);final int firstColumn = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24138);final int jStart      = FastMath.max(column,    firstColumn);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24139);final int jEnd        = FastMath.min(endColumn + 1, firstColumn + jWidth);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24140);final int jLength     = jEnd - jStart;

                // handle one block, row by row
                __CLR4_4_1iauiaulb90p8r6.R.inc(24141);final T[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24142);for (int i = iStart; (((i < iEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24143)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24144)==0&false)); ++i) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24145);System.arraycopy(subMatrix[i - row], jStart - column,
                                     block, (i - firstRow) * jWidth + (jStart - firstColumn),
                                     jLength);
                }

            }}
        }}
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> getRowMatrix(final int row)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24146);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24147);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24148);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), 1, columns);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24149);final int iBlock  = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24150);final int iRow    = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24151);int outBlockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24152);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24153);T[] outBlock = out.blocks[outBlockIndex];
        __CLR4_4_1iauiaulb90p8r6.R.inc(24154);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24155)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24156)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24157);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24158);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24159);final int available  = outBlock.length - outIndex;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24160);if ((((jWidth > available)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24161)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24162)==0&false))) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24163);System.arraycopy(block, iRow * jWidth, outBlock, outIndex, available);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24164);outBlock = out.blocks[++outBlockIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24165);System.arraycopy(block, iRow * jWidth, outBlock, 0, jWidth - available);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24166);outIndex = jWidth - available;
            } }else {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24167);System.arraycopy(block, iRow * jWidth, outBlock, outIndex, jWidth);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24168);outIndex += jWidth;
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24169);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRowMatrix(final int row, final FieldMatrix<T> matrix)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24170);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24171);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24172);setRowMatrix(row, (BlockFieldMatrix<T>) matrix);
        } catch (ClassCastException cce) {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24173);super.setRowMatrix(row, matrix);
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Sets the entries in row number <code>row</code>
     * as a row matrix.  Row indices start at 0.
     *
     * @param row the row to be set
     * @param matrix row matrix (must have one row and the same number of columns
     * as the instance)
     * @throws MatrixDimensionMismatchException if the matrix dimensions do
     * not match one instance row.
     * @throws OutOfRangeException if the specified row index is invalid.
     */
    public void setRowMatrix(final int row, final BlockFieldMatrix<T> matrix)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24174);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24175);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24176);final int nCols = getColumnDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24177);if (((((matrix.getRowDimension() != 1) ||
            (matrix.getColumnDimension() != nCols))&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24178)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24179)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24180);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       1, nCols);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24181);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24182);final int iRow   = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24183);int mBlockIndex  = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24184);int mIndex       = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24185);T[] mBlock  = matrix.blocks[mBlockIndex];
        __CLR4_4_1iauiaulb90p8r6.R.inc(24186);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24187)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24188)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24189);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24190);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24191);final int available  = mBlock.length - mIndex;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24192);if ((((jWidth > available)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24193)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24194)==0&false))) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24195);System.arraycopy(mBlock, mIndex, block, iRow * jWidth, available);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24196);mBlock = matrix.blocks[++mBlockIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24197);System.arraycopy(mBlock, 0, block, iRow * jWidth, jWidth - available);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24198);mIndex = jWidth - available;
            } }else {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24199);System.arraycopy(mBlock, mIndex, block, iRow * jWidth, jWidth);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24200);mIndex += jWidth;
           }
        }}
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> getColumnMatrix(final int column)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24201);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24202);checkColumnIndex(column);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24203);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), rows, 1);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24204);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24205);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24206);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24207);int outBlockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24208);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24209);T[] outBlock = out.blocks[outBlockIndex];
        __CLR4_4_1iauiaulb90p8r6.R.inc(24210);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24211)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24212)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24213);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24214);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24215);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24216)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24217)==0&false)); ++i) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24218);if ((((outIndex >= outBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24219)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24220)==0&false))) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24221);outBlock = out.blocks[++outBlockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24222);outIndex = 0;
                }
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24223);outBlock[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24224);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumnMatrix(final int column, final FieldMatrix<T> matrix)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24225);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24226);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24227);setColumnMatrix(column, (BlockFieldMatrix<T>) matrix);
        } catch (ClassCastException cce) {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24228);super.setColumnMatrix(column, matrix);
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Sets the entries in column number {@code column}
     * as a column matrix.  Column indices start at 0.
     *
     * @param column Column to be set.
     * @param matrix Column matrix (must have one column and the same number of rows
     * as the instance).
     * @throws MatrixDimensionMismatchException if the matrix dimensions do
     * not match one instance column.
     * @throws OutOfRangeException if the specified column index is invalid.
     */
    void setColumnMatrix(final int column, final BlockFieldMatrix<T> matrix)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24229);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24230);checkColumnIndex(column);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24231);final int nRows = getRowDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24232);if (((((matrix.getRowDimension() != nRows) ||
            (matrix.getColumnDimension() != 1))&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24233)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24234)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24235);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       nRows, 1);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24236);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24237);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24238);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24239);int mBlockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24240);int mIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24241);T[] mBlock = matrix.blocks[mBlockIndex];
        __CLR4_4_1iauiaulb90p8r6.R.inc(24242);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24243)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24244)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24245);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24246);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24247);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24248)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24249)==0&false)); ++i) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24250);if ((((mIndex >= mBlock.length)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24251)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24252)==0&false))) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24253);mBlock = matrix.blocks[++mBlockIndex];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24254);mIndex = 0;
                }
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24255);block[i * jWidth + jColumn] = mBlock[mIndex++];
            }
        }}
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldVector<T> getRowVector(final int row)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24256);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24257);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24258);final T[] outData = MathArrays.buildArray(getField(), columns);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24259);final int iBlock  = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24260);final int iRow    = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24261);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24262);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24263)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24264)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24265);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24266);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24267);System.arraycopy(block, iRow * jWidth, outData, outIndex, jWidth);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24268);outIndex += jWidth;
        }

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24269);return new ArrayFieldVector<T>(getField(), outData, false);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRowVector(final int row, final FieldVector<T> vector)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24270);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24271);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24272);setRow(row, ((ArrayFieldVector<T>) vector).getDataRef());
        } catch (ClassCastException cce) {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24273);super.setRowVector(row, vector);
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldVector<T> getColumnVector(final int column)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24274);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24275);checkColumnIndex(column);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24276);final T[] outData = MathArrays.buildArray(getField(), rows);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24277);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24278);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24279);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24280);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24281);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24282)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24283)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24284);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24285);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24286);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24287)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24288)==0&false)); ++i) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24289);outData[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24290);return new ArrayFieldVector<T>(getField(), outData, false);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumnVector(final int column, final FieldVector<T> vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24291);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24292);try {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24293);setColumn(column, ((ArrayFieldVector<T>) vector).getDataRef());
        } catch (ClassCastException cce) {
            __CLR4_4_1iauiaulb90p8r6.R.inc(24294);super.setColumnVector(column, vector);
        }
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] getRow(final int row) throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24295);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24296);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24297);final T[] out = MathArrays.buildArray(getField(), columns);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24298);final int iBlock  = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24299);final int iRow    = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24300);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24301);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24302)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24303)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24304);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24305);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24306);System.arraycopy(block, iRow * jWidth, out, outIndex, jWidth);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24307);outIndex += jWidth;
        }

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24308);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRow(final int row, final T[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24309);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24310);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24311);final int nCols = getColumnDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24312);if ((((array.length != nCols)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24313)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24314)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24315);throw new MatrixDimensionMismatchException(1, array.length, 1, nCols);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24316);final int iBlock  = row / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24317);final int iRow    = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24318);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24319);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24320)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24321)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24322);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24323);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24324);System.arraycopy(array, outIndex, block, iRow * jWidth, jWidth);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24325);outIndex += jWidth;
        }
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] getColumn(final int column) throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24326);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24327);checkColumnIndex(column);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24328);final T[] out = MathArrays.buildArray(getField(), rows);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24329);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24330);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24331);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24332);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24333);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24334)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24335)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24336);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24337);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24338);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24339)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24340)==0&false)); ++i) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24341);out[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24342);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumn(final int column, final T[] array)
        throws MatrixDimensionMismatchException, OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24343);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24344);checkColumnIndex(column);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24345);final int nRows = getRowDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24346);if ((((array.length != nRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24347)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24348)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24349);throw new MatrixDimensionMismatchException(array.length, 1, nRows, 1);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24350);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24351);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24352);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24353);int outIndex      = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24354);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24355)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24356)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24357);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24358);final T[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1iauiaulb90p8r6.R.inc(24359);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24360)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24361)==0&false)); ++i) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24362);block[i * jWidth + jColumn] = array[outIndex++];
            }
        }}
    }}finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T getEntry(final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24363);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24364);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24365);checkColumnIndex(column);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24366);final int iBlock = row    / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24367);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24368);final int k      = (row    - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24369);return blocks[iBlock * blockColumns + jBlock][k];
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(final int row, final int column, final T value)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24370);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24371);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24372);checkColumnIndex(column);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24373);final int iBlock = row    / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24374);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24375);final int k      = (row    - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24376);blocks[iBlock * blockColumns + jBlock][k] = value;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(final int row, final int column, final T increment)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24377);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24378);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24379);checkColumnIndex(column);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24380);final int iBlock = row    / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24381);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24382);final int k      = (row    - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24383);final T[] blockIJ = blocks[iBlock * blockColumns + jBlock];

        __CLR4_4_1iauiaulb90p8r6.R.inc(24384);blockIJ[k] = blockIJ[k].add(increment);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(final int row, final int column, final T factor)
        throws OutOfRangeException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24385);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24386);checkRowIndex(row);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24387);checkColumnIndex(column);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24388);final int iBlock = row    / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24389);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24390);final int k      = (row    - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24391);final T[] blockIJ = blocks[iBlock * blockColumns + jBlock];

        __CLR4_4_1iauiaulb90p8r6.R.inc(24392);blockIJ[k] = blockIJ[k].multiply(factor);
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> transpose() {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24393);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24394);final int nRows = getRowDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24395);final int nCols = getColumnDimension();
        __CLR4_4_1iauiaulb90p8r6.R.inc(24396);final BlockFieldMatrix<T> out = new BlockFieldMatrix<T>(getField(), nCols, nRows);

        // perform transpose block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24397);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24398);for (int iBlock = 0; (((iBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24399)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24400)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24401);for (int jBlock = 0; (((jBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24402)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24403)==0&false)); ++jBlock) {{

                // transpose current block
                __CLR4_4_1iauiaulb90p8r6.R.inc(24404);final T[] outBlock = out.blocks[blockIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24405);final T[] tBlock   = blocks[jBlock * blockColumns + iBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24406);final int      pStart   = iBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24407);final int      pEnd     = FastMath.min(pStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24408);final int      qStart   = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24409);final int      qEnd     = FastMath.min(qStart + BLOCK_SIZE, rows);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24410);int k = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24411);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24412)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24413)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24414);final int lInc = pEnd - pStart;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24415);int l = p - pStart;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24416);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24417)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24418)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24419);outBlock[k] = tBlock[l];
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24420);++k;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24421);l+= lInc;
                    }
                }}

                // go to next block
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24422);++blockIndex;

            }
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24423);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24424);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24425);return rows;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24426);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24427);return columns;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] operate(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24428);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24429);if ((((v.length != columns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24430)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24431)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24432);throw new DimensionMismatchException(v.length, columns);
        }
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24433);final T[] out = MathArrays.buildArray(getField(), rows);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24434);final T zero = getField().getZero();

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24435);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24436)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24437)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24438);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24439);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24440);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24441)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24442)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24443);final T[] block  = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24444);final int      qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24445);final int      qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24446);int k = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24447);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24448)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24449)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24450);T sum = zero;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24451);int q = qStart;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24452);while ((((q < qEnd - 3)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24453)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24454)==0&false))) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24455);sum = sum.
                              add(block[k].multiply(v[q])).
                              add(block[k + 1].multiply(v[q + 1])).
                              add(block[k + 2].multiply(v[q + 2])).
                              add(block[k + 3].multiply(v[q + 3]));
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24456);k += 4;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24457);q += 4;
                    }
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(24458);while ((((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24459)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24460)==0&false))) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24461);sum = sum.add(block[k++].multiply(v[q++]));
                    }
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(24462);out[p] = out[p].add(sum);
                }
            }}
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24463);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] preMultiply(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24464);

        __CLR4_4_1iauiaulb90p8r6.R.inc(24465);if ((((v.length != rows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24466)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24467)==0&false))) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24468);throw new DimensionMismatchException(v.length, rows);
        }
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24469);final T[] out = MathArrays.buildArray(getField(), columns);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24470);final T zero = getField().getZero();

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1iauiaulb90p8r6.R.inc(24471);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24472)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24473)==0&false)); ++jBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24474);final int jWidth  = blockWidth(jBlock);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24475);final int jWidth2 = jWidth  + jWidth;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24476);final int jWidth3 = jWidth2 + jWidth;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24477);final int jWidth4 = jWidth3 + jWidth;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24478);final int qStart = jBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24479);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24480);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24481)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24482)==0&false)); ++iBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24483);final T[] block  = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24484);final int      pStart = iBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24485);final int      pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24486);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24487)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24488)==0&false)); ++q) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24489);int k = q - qStart;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24490);T sum = zero;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24491);int p = pStart;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24492);while ((((p < pEnd - 3)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24493)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24494)==0&false))) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24495);sum = sum.
                              add(block[k].multiply(v[p])).
                              add(block[k + jWidth].multiply(v[p + 1])).
                              add(block[k + jWidth2].multiply(v[p + 2])).
                              add(block[k + jWidth3].multiply(v[p + 3]));
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24496);k += jWidth4;
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24497);p += 4;
                    }
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(24498);while ((((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24499)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24500)==0&false))) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24501);sum = sum.add(block[k].multiply(v[p++]));
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24502);k += jWidth;
                    }
                    }__CLR4_4_1iauiaulb90p8r6.R.inc(24503);out[q] = out[q].add(sum);
                }
            }}
        }}

        }__CLR4_4_1iauiaulb90p8r6.R.inc(24504);return out;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24505);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24506);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24507);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24508)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24509)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24510);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24511);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24512);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24513)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24514)==0&false)); ++p) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24515);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24516)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24517)==0&false)); ++jBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24518);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24519);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24520);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24521);final T[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24522);int k = (p - pStart) * jWidth;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24523);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24524)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24525)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24526);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24527);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24528);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24529);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24530);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24531);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24532)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24533)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24534);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24535);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24536);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24537)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24538)==0&false)); ++p) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24539);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24540)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24541)==0&false)); ++jBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24542);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24543);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24544);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24545);final T[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24546);int k = (p - pStart) * jWidth;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24547);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24548)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24549)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24550);visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24551);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24552);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24553);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24554);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24555);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24556);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24557)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24558)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24559);final int p0     = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24560);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24561);final int pEnd   = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24562);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24563)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24564)==0&false)); ++p) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24565);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24566)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24567)==0&false)); ++jBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24568);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24569);final int q0     = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24570);final int qStart = FastMath.max(startColumn, q0);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24571);final int qEnd   = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24572);final T[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24573);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24574);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24575)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24576)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24577);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24578);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24579);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24580);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24581);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24582);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24583);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24584)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24585)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24586);final int p0     = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24587);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24588);final int pEnd   = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24589);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24590)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24591)==0&false)); ++p) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24592);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24593)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24594)==0&false)); ++jBlock) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24595);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24596);final int q0     = jBlock * BLOCK_SIZE;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24597);final int qStart = FastMath.max(startColumn, q0);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24598);final int qEnd   = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24599);final T[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24600);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24601);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24602)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24603)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24604);visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24605);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24606);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24607);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24608);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24609);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24610);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24611)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24612)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24613);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24614);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24615);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24616)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24617)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24618);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24619);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24620);final T[] block = blocks[blockIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24621);int k = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24622);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24623)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24624)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24625);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24626)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24627)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24628);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24629);++k;
                    }
                }}
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24630);++blockIndex;
            }
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24631);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24632);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24633);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24634);int blockIndex = 0;
        __CLR4_4_1iauiaulb90p8r6.R.inc(24635);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24636)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24637)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24638);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24639);final int pEnd   = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24640);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24641)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24642)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24643);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24644);final int qEnd   = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24645);final T[] block = blocks[blockIndex];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24646);int k = 0;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24647);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24648)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24649)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24650);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24651)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24652)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24653);visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24654);++k;
                    }
                }}
                }__CLR4_4_1iauiaulb90p8r6.R.inc(24655);++blockIndex;
            }
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24656);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor,
                                  final int startRow, final int endRow,
                                  final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24657);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24658);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24659);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24660);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24661)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24662)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24663);final int p0     = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24664);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24665);final int pEnd   = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24666);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24667)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24668)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24669);final int jWidth = blockWidth(jBlock);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24670);final int q0     = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24671);final int qStart = FastMath.max(startColumn, q0);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24672);final int qEnd   = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24673);final T[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24674);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24675)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24676)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24677);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24678);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24679)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24680)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24681);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24682);++k;
                    }
                }}
            }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24683);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor,
                                  final int startRow, final int endRow,
                                  final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24684);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24685);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24686);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24687);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24688)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24689)==0&false)); ++iBlock) {{
            __CLR4_4_1iauiaulb90p8r6.R.inc(24690);final int p0     = iBlock * BLOCK_SIZE;
            __CLR4_4_1iauiaulb90p8r6.R.inc(24691);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24692);final int pEnd   = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1iauiaulb90p8r6.R.inc(24693);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24694)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24695)==0&false)); ++jBlock) {{
                __CLR4_4_1iauiaulb90p8r6.R.inc(24696);final int jWidth = blockWidth(jBlock);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24697);final int q0     = jBlock * BLOCK_SIZE;
                __CLR4_4_1iauiaulb90p8r6.R.inc(24698);final int qStart = FastMath.max(startColumn, q0);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24699);final int qEnd   = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                __CLR4_4_1iauiaulb90p8r6.R.inc(24700);final T[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1iauiaulb90p8r6.R.inc(24701);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24702)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24703)==0&false)); ++p) {{
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24704);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1iauiaulb90p8r6.R.inc(24705);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24706)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24707)==0&false)); ++q) {{
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24708);visitor.visit(p, q, block[k]);
                        __CLR4_4_1iauiaulb90p8r6.R.inc(24709);++k;
                    }
                }}
            }}
        }}
        }__CLR4_4_1iauiaulb90p8r6.R.inc(24710);return visitor.end();
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Get the height of a block.
     * @param blockRow row index (in block sense) of the block
     * @return height (number of rows) of the block
     */
    private int blockHeight(final int blockRow) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24711);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24712);return ((((blockRow == blockRows - 1) )&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24713)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24714)==0&false))? rows - blockRow * BLOCK_SIZE : BLOCK_SIZE;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}

    /**
     * Get the width of a block.
     * @param blockColumn column index (in block sense) of the block
     * @return width (number of columns) of the block
     */
    private int blockWidth(final int blockColumn) {try{__CLR4_4_1iauiaulb90p8r6.R.inc(24715);
        __CLR4_4_1iauiaulb90p8r6.R.inc(24716);return ((((blockColumn == blockColumns - 1) )&&(__CLR4_4_1iauiaulb90p8r6.R.iget(24717)!=0|true))||(__CLR4_4_1iauiaulb90p8r6.R.iget(24718)==0&false))? columns - blockColumn * BLOCK_SIZE : BLOCK_SIZE;
    }finally{__CLR4_4_1iauiaulb90p8r6.R.flushNeeded();}}
}
