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
import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Cache-friendly implementation of RealMatrix using a flat arrays to store
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
 * for matrix multiplication). The default value is to use 52x52 blocks which is well suited
 * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value
 * could be lowered to 36x36 for processors with 32k L1 cache.
 * </p>
 * <p>
 * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks
 * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square
 * blocks are flattened in row major order in single dimension arrays which are therefore
 * {@link #BLOCK_SIZE}<sup>2</sup> elements long for regular blocks. The blocks are themselves
 * organized in row major order.
 * </p>
 * <p>
 * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.
 * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be
 * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]
 * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array
 * holding the lower right 48x8 rectangle.
 * </p>
 * <p>
 * The layout complexity overhead versus simple mapping of matrices to java
 * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads
 * to up to 3-fold improvements for matrices of moderate to large size.
 * </p>
 * @version $Id$
 * @since 2.0
 */
public class BlockRealMatrix extends AbstractRealMatrix implements Serializable {public static class __CLR4_4_1j2nj2nlb90p8te{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,25744,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Block size. */
    public static final int BLOCK_SIZE = 52;
    /** Serializable version identifier */
    private static final long serialVersionUID = 4991895511313664478L;
    /** Blocks of matrix entries. */
    private final double blocks[][];
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
     * @param rows  the number of rows in the new matrix
     * @param columns  the number of columns in the new matrix
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     */
    public BlockRealMatrix(final int rows, final int columns)
        throws NotStrictlyPositiveException {
        super(rows, columns);__CLR4_4_1j2nj2nlb90p8te.R.inc(24720);try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24719);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24721);this.rows = rows;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24722);this.columns = columns;

        // number of blocks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24723);blockRows = (rows + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24724);blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // allocate storage blocks, taking care of smaller ones at right and bottom
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24725);blocks = createBlocksLayout(rows, columns);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Create a new dense matrix copying entries from raw layout data.
     * <p>The input array <em>must</em> already be in raw layout.</p>
     * <p>Calling this constructor is equivalent to call:
     * <pre>matrix = new BlockRealMatrix(rawData.length, rawData[0].length,
     *                                   toBlocksLayout(rawData), false);</pre>
     * </p>
     *
     * @param rawData data for new matrix, in raw layout
     * @throws DimensionMismatchException if the shape of {@code blockData} is
     * inconsistent with block layout.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public BlockRealMatrix(final double[][] rawData)
        throws DimensionMismatchException, NotStrictlyPositiveException {
        this(rawData.length, rawData[0].length, toBlocksLayout(rawData), false);__CLR4_4_1j2nj2nlb90p8te.R.inc(24727);try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24726);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Create a new dense matrix copying entries from block layout data.
     * <p>The input array <em>must</em> already be in blocks layout.</p>
     *
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @param blockData data for new matrix
     * @param copyArray Whether the input array will be copied or referenced.
     * @throws DimensionMismatchException if the shape of {@code blockData} is
     * inconsistent with block layout.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @see #createBlocksLayout(int, int)
     * @see #toBlocksLayout(double[][])
     * @see #BlockRealMatrix(double[][])
     */
    public BlockRealMatrix(final int rows, final int columns,
                           final double[][] blockData, final boolean copyArray)
        throws DimensionMismatchException, NotStrictlyPositiveException {
        super(rows, columns);__CLR4_4_1j2nj2nlb90p8te.R.inc(24729);try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24728);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24730);this.rows = rows;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24731);this.columns = columns;

        // number of blocks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24732);blockRows = (rows + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24733);blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24734);if ((((copyArray)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24735)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24736)==0&false))) {{
            // allocate storage blocks, taking care of smaller ones at right and bottom
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24737);blocks = new double[blockRows * blockColumns][];
        } }else {{
            // reference existing array
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24738);blocks = blockData;
        }

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24739);int index = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24740);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24741)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24742)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24743);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24744);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24745)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24746)==0&false)); ++jBlock, ++index) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24747);if ((((blockData[index].length != iHeight * blockWidth(jBlock))&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24748)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24749)==0&false))) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24750);throw new DimensionMismatchException(blockData[index].length,
                                                         iHeight * blockWidth(jBlock));
                }
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(24751);if ((((copyArray)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24752)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24753)==0&false))) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24754);blocks[index] = blockData[index].clone();
                }
            }}
        }}
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Convert a data array from raw layout to blocks layout.
     * <p>
     * Raw layout is the straightforward layout where element at row i and
     * column j is in array element <code>rawData[i][j]</code>. Blocks layout
     * is the layout used in {@link BlockRealMatrix} instances, where the matrix
     * is split in square blocks (except at right and bottom side where blocks may
     * be rectangular to fit matrix size) and each block is stored in a flattened
     * one-dimensional array.
     * </p>
     * <p>
     * This method creates an array in blocks layout from an input array in raw layout.
     * It can be used to provide the array argument of the {@link
     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.
     * </p>
     * @param rawData Data array in raw layout.
     * @return a new data array containing the same entries but in blocks layout.
     * @throws DimensionMismatchException if {@code rawData} is not rectangular.
     * @see #createBlocksLayout(int, int)
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public static double[][] toBlocksLayout(final double[][] rawData)
        throws DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24755);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24756);final int rows = rawData.length;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24757);final int columns = rawData[0].length;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24758);final int blockRows = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24759);final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // safety checks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24760);for (int i = 0; (((i < rawData.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24761)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24762)==0&false)); ++i) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24763);final int length = rawData[i].length;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24764);if ((((length != columns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24765)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24766)==0&false))) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24767);throw new DimensionMismatchException(columns, length);
            }
        }}

        // convert array
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24768);final double[][] blocks = new double[blockRows * blockColumns][];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24769);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24770);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24771)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24772)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24773);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24774);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24775);final int iHeight = pEnd - pStart;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24776);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24777)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24778)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24779);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24780);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24781);final int jWidth = qEnd - qStart;

                // allocate new block
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24782);final double[] block = new double[iHeight * jWidth];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24783);blocks[blockIndex] = block;

                // copy data
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24784);int index = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24785);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24786)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24787)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24788);System.arraycopy(rawData[p], qStart, block, index, jWidth);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24789);index += jWidth;
                }
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(24790);++blockIndex;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24791);return blocks;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Create a data array in blocks layout.
     * <p>
     * This method can be used to create the array argument of the {@link
     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.
     * </p>
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @return a new data array in blocks layout.
     * @see #toBlocksLayout(double[][])
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public static double[][] createBlocksLayout(final int rows, final int columns) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24792);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24793);final int blockRows = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24794);final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24795);final double[][] blocks = new double[blockRows * blockColumns][];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24796);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24797);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24798)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24799)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24800);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24801);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24802);final int iHeight = pEnd - pStart;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24803);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24804)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24805)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24806);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24807);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24808);final int jWidth = qEnd - qStart;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24809);blocks[blockIndex] = new double[iHeight * jWidth];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24810);++blockIndex;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24811);return blocks;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix createMatrix(final int rowDimension,
                                        final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24812);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24813);return new BlockRealMatrix(rowDimension, columnDimension);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix copy() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24814);
        // create an empty matrix
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24815);BlockRealMatrix copied = new BlockRealMatrix(rows, columns);

        // copy the blocks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24816);for (int i = 0; (((i < blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24817)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24818)==0&false)); ++i) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24819);System.arraycopy(blocks[i], 0, copied.blocks[i], 0, blocks[i].length);
        }

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24820);return copied;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix add(final RealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24821);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24822);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24823);return add((BlockRealMatrix) m);
        } catch (ClassCastException cce) {
            // safety check
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24824);MatrixUtils.checkAdditionCompatible(this, m);

            __CLR4_4_1j2nj2nlb90p8te.R.inc(24825);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

            // perform addition block-wise, to ensure good cache behavior
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24826);int blockIndex = 0;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24827);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24828)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24829)==0&false)); ++iBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24830);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24831)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24832)==0&false)); ++jBlock) {{

                    // perform addition on the current block
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24833);final double[] outBlock = out.blocks[blockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24834);final double[] tBlock   = blocks[blockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24835);final int pStart = iBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24836);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24837);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24838);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24839);int k = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24840);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24841)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24842)==0&false)); ++p) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24843);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24844)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24845)==0&false)); ++q) {{
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24846);outBlock[k] = tBlock[k] + m.getEntry(p, q);
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24847);++k;
                        }
                    }}
                    // go to next block
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(24848);++blockIndex;
                }
            }}

            }__CLR4_4_1j2nj2nlb90p8te.R.inc(24849);return out;
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Compute the sum of this matrix and {@code m}.
     *
     * @param m Matrix to be added.
     * @return {@code this} + m.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as this matrix.
     */
    public BlockRealMatrix add(final BlockRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24850);
        // safety check
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24851);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24852);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

        // perform addition block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24853);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24854)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24855)==0&false)); ++blockIndex) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24856);final double[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24857);final double[] tBlock = blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24858);final double[] mBlock = m.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24859);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24860)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24861)==0&false)); ++k) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24862);outBlock[k] = tBlock[k] + mBlock[k];
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24863);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix subtract(final RealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24864);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24865);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24866);return subtract((BlockRealMatrix) m);
        } catch (ClassCastException cce) {
            // safety check
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24867);MatrixUtils.checkSubtractionCompatible(this, m);

            __CLR4_4_1j2nj2nlb90p8te.R.inc(24868);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

            // perform subtraction block-wise, to ensure good cache behavior
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24869);int blockIndex = 0;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24870);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24871)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24872)==0&false)); ++iBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24873);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24874)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24875)==0&false)); ++jBlock) {{

                    // perform subtraction on the current block
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24876);final double[] outBlock = out.blocks[blockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24877);final double[] tBlock = blocks[blockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24878);final int pStart = iBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24879);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24880);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24881);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24882);int k = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24883);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24884)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24885)==0&false)); ++p) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24886);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24887)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24888)==0&false)); ++q) {{
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24889);outBlock[k] = tBlock[k] - m.getEntry(p, q);
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24890);++k;
                        }
                    }}
                    // go to next block
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(24891);++blockIndex;
                }
            }}

            }__CLR4_4_1j2nj2nlb90p8te.R.inc(24892);return out;
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Subtract {@code m} from this matrix.
     *
     * @param m Matrix to be subtracted.
     * @return {@code this} - m.
     * @throws MatrixDimensionMismatchException if {@code m} is not the
     * same size as this matrix.
     */
    public BlockRealMatrix subtract(final BlockRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24893);
        // safety check
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24894);MatrixUtils.checkSubtractionCompatible(this, m);

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24895);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24896);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24897)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24898)==0&false)); ++blockIndex) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24899);final double[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24900);final double[] tBlock = blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24901);final double[] mBlock = m.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24902);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24903)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24904)==0&false)); ++k) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24905);outBlock[k] = tBlock[k] - mBlock[k];
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24906);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix scalarAdd(final double d) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24907);

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24908);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24909);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24910)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24911)==0&false)); ++blockIndex) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24912);final double[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24913);final double[] tBlock = blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24914);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24915)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24916)==0&false)); ++k) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24917);outBlock[k] = tBlock[k] + d;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24918);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealMatrix scalarMultiply(final double d) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24919);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24920);final BlockRealMatrix out = new BlockRealMatrix(rows, columns);

        // perform subtraction block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24921);for (int blockIndex = 0; (((blockIndex < out.blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24922)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24923)==0&false)); ++blockIndex) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24924);final double[] outBlock = out.blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24925);final double[] tBlock = blocks[blockIndex];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24926);for (int k = 0; (((k < outBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24927)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24928)==0&false)); ++k) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24929);outBlock[k] = tBlock[k] * d;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(24930);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix multiply(final RealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24931);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24932);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24933);return multiply((BlockRealMatrix) m);
        } catch (ClassCastException cce) {
            // safety check
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24934);MatrixUtils.checkMultiplicationCompatible(this, m);

            __CLR4_4_1j2nj2nlb90p8te.R.inc(24935);final BlockRealMatrix out = new BlockRealMatrix(rows, m.getColumnDimension());

            // perform multiplication block-wise, to ensure good cache behavior
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24936);int blockIndex = 0;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24937);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24938)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24939)==0&false)); ++iBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24940);final int pStart = iBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24941);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);

                __CLR4_4_1j2nj2nlb90p8te.R.inc(24942);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24943)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24944)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24945);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24946);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, m.getColumnDimension());

                    // select current block
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24947);final double[] outBlock = out.blocks[blockIndex];

                    // perform multiplication on current block
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24948);for (int kBlock = 0; (((kBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24949)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24950)==0&false)); ++kBlock) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24951);final int kWidth = blockWidth(kBlock);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24952);final double[] tBlock = blocks[iBlock * blockColumns + kBlock];
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24953);final int rStart = kBlock * BLOCK_SIZE;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24954);int k = 0;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(24955);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24956)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24957)==0&false)); ++p) {{
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24958);final int lStart = (p - pStart) * kWidth;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24959);final int lEnd = lStart + kWidth;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(24960);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24961)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24962)==0&false)); ++q) {{
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(24963);double sum = 0;
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(24964);int r = rStart;
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(24965);for (int l = lStart; (((l < lEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24966)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24967)==0&false)); ++l) {{
                                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24968);sum += tBlock[l] * m.getEntry(r, q);
                                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24969);++r;
                                }
                                }__CLR4_4_1j2nj2nlb90p8te.R.inc(24970);outBlock[k] += sum;
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(24971);++k;
                            }
                        }}
                    }}
                    // go to next block
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(24972);++blockIndex;
                }
            }}

            }__CLR4_4_1j2nj2nlb90p8te.R.inc(24973);return out;
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Returns the result of postmultiplying this by {@code m}.
     *
     * @param m Matrix to postmultiply by.
     * @return {@code this} * m.
     * @throws DimensionMismatchException if the matrices are not compatible.
     */
    public BlockRealMatrix multiply(BlockRealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(24974);
        // safety check
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24975);MatrixUtils.checkMultiplicationCompatible(this, m);

        __CLR4_4_1j2nj2nlb90p8te.R.inc(24976);final BlockRealMatrix out = new BlockRealMatrix(rows, m.columns);

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24977);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(24978);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24979)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24980)==0&false)); ++iBlock) {{

            __CLR4_4_1j2nj2nlb90p8te.R.inc(24981);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(24982);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);

            __CLR4_4_1j2nj2nlb90p8te.R.inc(24983);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24984)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24985)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24986);final int jWidth = out.blockWidth(jBlock);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24987);final int jWidth2 = jWidth  + jWidth;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24988);final int jWidth3 = jWidth2 + jWidth;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24989);final int jWidth4 = jWidth3 + jWidth;

                // select current block
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24990);final double[] outBlock = out.blocks[blockIndex];

                // perform multiplication on current block
                __CLR4_4_1j2nj2nlb90p8te.R.inc(24991);for (int kBlock = 0; (((kBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24992)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(24993)==0&false)); ++kBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24994);final int kWidth = blockWidth(kBlock);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24995);final double[] tBlock = blocks[iBlock * blockColumns + kBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24996);final double[] mBlock = m.blocks[kBlock * m.blockColumns + jBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24997);int k = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(24998);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(24999)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25000)==0&false)); ++p) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25001);final int lStart = (p - pStart) * kWidth;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25002);final int lEnd = lStart + kWidth;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25003);for (int nStart = 0; (((nStart < jWidth)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25004)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25005)==0&false)); ++nStart) {{
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(25006);double sum = 0;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(25007);int l = lStart;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(25008);int n = nStart;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(25009);while ((((l < lEnd - 3)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25010)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25011)==0&false))) {{
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(25012);sum += tBlock[l] * mBlock[n] +
                                       tBlock[l + 1] * mBlock[n + jWidth] +
                                       tBlock[l + 2] * mBlock[n + jWidth2] +
                                       tBlock[l + 3] * mBlock[n + jWidth3];
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(25013);l += 4;
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(25014);n += jWidth4;
                            }
                            }__CLR4_4_1j2nj2nlb90p8te.R.inc(25015);while ((((l < lEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25016)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25017)==0&false))) {{
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(25018);sum += tBlock[l++] * mBlock[n];
                                __CLR4_4_1j2nj2nlb90p8te.R.inc(25019);n += jWidth;
                            }
                            }__CLR4_4_1j2nj2nlb90p8te.R.inc(25020);outBlock[k] += sum;
                            __CLR4_4_1j2nj2nlb90p8te.R.inc(25021);++k;
                        }
                    }}
                }}
                // go to next block
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25022);++blockIndex;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25023);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[][] getData() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25024);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25025);final double[][] data = new double[getRowDimension()][getColumnDimension()];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25026);final int lastColumns = columns - (blockColumns - 1) * BLOCK_SIZE;

        __CLR4_4_1j2nj2nlb90p8te.R.inc(25027);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25028)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25029)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25030);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25031);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25032);int regularPos = 0;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25033);int lastPos = 0;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25034);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25035)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25036)==0&false)); ++p) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25037);final double[] dataP = data[p];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25038);int blockIndex = iBlock * blockColumns;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25039);int dataPos = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25040);for (int jBlock = 0; (((jBlock < blockColumns - 1)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25041)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25042)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25043);System.arraycopy(blocks[blockIndex++], regularPos, dataP, dataPos, BLOCK_SIZE);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25044);dataPos += BLOCK_SIZE;
                }
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25045);System.arraycopy(blocks[blockIndex], lastPos, dataP, dataPos, lastColumns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25046);regularPos += BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25047);lastPos    += lastColumns;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25048);return data;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getNorm() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25049);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25050);final double[] colSums = new double[BLOCK_SIZE];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25051);double maxColSum = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25052);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25053)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25054)==0&false)); jBlock++) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25055);final int jWidth = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25056);Arrays.fill(colSums, 0, jWidth, 0.0);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25057);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25058)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25059)==0&false)); ++iBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25060);final int iHeight = blockHeight(iBlock);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25061);final double[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25062);for (int j = 0; (((j < jWidth)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25063)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25064)==0&false)); ++j) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25065);double sum = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25066);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25067)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25068)==0&false)); ++i) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25069);sum += FastMath.abs(block[i * jWidth + j]);
                    }
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(25070);colSums[j] += sum;
                }
            }}
            }__CLR4_4_1j2nj2nlb90p8te.R.inc(25071);for (int j = 0; (((j < jWidth)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25072)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25073)==0&false)); ++j) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25074);maxColSum = FastMath.max(maxColSum, colSums[j]);
            }
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25075);return maxColSum;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getFrobeniusNorm() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25076);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25077);double sum2 = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25078);for (int blockIndex = 0; (((blockIndex < blocks.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25079)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25080)==0&false)); ++blockIndex) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25081);for (final double entry : blocks[blockIndex]) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25082);sum2 += entry * entry;
            }
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25083);return FastMath.sqrt(sum2);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix getSubMatrix(final int startRow, final int endRow,
                                        final int startColumn,
                                        final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25084);
        // safety checks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25085);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);

        // create the output matrix
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25086);final BlockRealMatrix out =
            new BlockRealMatrix(endRow - startRow + 1, endColumn - startColumn + 1);

        // compute blocks shifts
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25087);final int blockStartRow = startRow / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25088);final int rowsShift = startRow % BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25089);final int blockStartColumn = startColumn / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25090);final int columnsShift = startColumn % BLOCK_SIZE;

        // perform extraction block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25091);int pBlock = blockStartRow;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25092);for (int iBlock = 0; (((iBlock < out.blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25093)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25094)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25095);final int iHeight = out.blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25096);int qBlock = blockStartColumn;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25097);for (int jBlock = 0; (((jBlock < out.blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25098)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25099)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25100);final int jWidth = out.blockWidth(jBlock);

                // handle one block of the output matrix
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25101);final int outIndex = iBlock * out.blockColumns + jBlock;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25102);final double[] outBlock = out.blocks[outIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25103);final int index = pBlock * blockColumns + qBlock;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25104);final int width = blockWidth(qBlock);

                __CLR4_4_1j2nj2nlb90p8te.R.inc(25105);final int heightExcess = iHeight + rowsShift - BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25106);final int widthExcess = jWidth + columnsShift - BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25107);if ((((heightExcess > 0)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25108)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25109)==0&false))) {{
                    // the submatrix block spans on two blocks rows from the original matrix
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25110);if ((((widthExcess > 0)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25111)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25112)==0&false))) {{
                        // the submatrix block spans on two blocks columns from the original matrix
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25113);final int width2 = blockWidth(qBlock + 1);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25114);copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25115);copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, BLOCK_SIZE,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25116);copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25117);copyBlockPart(blocks[index + blockColumns + 1], width2,
                                      0, heightExcess,
                                      0, widthExcess,
                                      outBlock, jWidth, iHeight - heightExcess, jWidth - widthExcess);
                    } }else {{
                        // the submatrix block spans on one block column from the original matrix
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25118);copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25119);copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                    }
                }} }else {{
                    // the submatrix block spans on one block row from the original matrix
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25120);if ((((widthExcess > 0)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25121)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25122)==0&false))) {{
                        // the submatrix block spans on two blocks columns from the original matrix
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25123);final int width2 = blockWidth(qBlock + 1);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25124);copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25125);copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, iHeight + rowsShift,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                    } }else {{
                        // the submatrix block spans on one block column from the original matrix
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25126);copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                    }
               }}
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25127);++qBlock;
            }
            }__CLR4_4_1j2nj2nlb90p8te.R.inc(25128);++pBlock;
        }

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25129);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

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
    private void copyBlockPart(final double[] srcBlock, final int srcWidth,
                               final int srcStartRow, final int srcEndRow,
                               final int srcStartColumn, final int srcEndColumn,
                               final double[] dstBlock, final int dstWidth,
                               final int dstStartRow, final int dstStartColumn) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25130);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25131);final int length = srcEndColumn - srcStartColumn;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25132);int srcPos = srcStartRow * srcWidth + srcStartColumn;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25133);int dstPos = dstStartRow * dstWidth + dstStartColumn;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25134);for (int srcRow = srcStartRow; (((srcRow < srcEndRow)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25135)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25136)==0&false)); ++srcRow) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25137);System.arraycopy(srcBlock, srcPos, dstBlock, dstPos, length);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25138);srcPos += srcWidth;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25139);dstPos += dstWidth;
        }
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubMatrix(final double[][] subMatrix, final int row,
                             final int column)
        throws OutOfRangeException, NoDataException, NullArgumentException,
        DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25140);
        // safety checks
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25141);MathUtils.checkNotNull(subMatrix);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25142);final int refLength = subMatrix[0].length;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25143);if ((((refLength == 0)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25144)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25145)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25146);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25147);final int endRow = row + subMatrix.length - 1;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25148);final int endColumn = column + refLength - 1;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25149);MatrixUtils.checkSubMatrixIndex(this, row, endRow, column, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25150);for (final double[] subRow : subMatrix) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25151);if ((((subRow.length != refLength)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25152)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25153)==0&false))) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25154);throw new DimensionMismatchException(refLength, subRow.length);
            }
        }}

        // compute blocks bounds
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25155);final int blockStartRow = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25156);final int blockEndRow = (endRow + BLOCK_SIZE) / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25157);final int blockStartColumn = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25158);final int blockEndColumn = (endColumn + BLOCK_SIZE) / BLOCK_SIZE;

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25159);for (int iBlock = blockStartRow; (((iBlock < blockEndRow)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25160)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25161)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25162);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25163);final int firstRow = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25164);final int iStart = FastMath.max(row,    firstRow);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25165);final int iEnd = FastMath.min(endRow + 1, firstRow + iHeight);

            __CLR4_4_1j2nj2nlb90p8te.R.inc(25166);for (int jBlock = blockStartColumn; (((jBlock < blockEndColumn)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25167)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25168)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25169);final int jWidth = blockWidth(jBlock);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25170);final int firstColumn = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25171);final int jStart = FastMath.max(column,    firstColumn);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25172);final int jEnd = FastMath.min(endColumn + 1, firstColumn + jWidth);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25173);final int jLength = jEnd - jStart;

                // handle one block, row by row
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25174);final double[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25175);for (int i = iStart; (((i < iEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25176)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25177)==0&false)); ++i) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25178);System.arraycopy(subMatrix[i - row], jStart - column,
                                     block, (i - firstRow) * jWidth + (jStart - firstColumn),
                                     jLength);
                }

            }}
        }}
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix getRowMatrix(final int row)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25179);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25180);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25181);final BlockRealMatrix out = new BlockRealMatrix(1, columns);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25182);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25183);final int iRow = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25184);int outBlockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25185);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25186);double[] outBlock = out.blocks[outBlockIndex];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25187);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25188)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25189)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25190);final int jWidth = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25191);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25192);final int available = outBlock.length - outIndex;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25193);if ((((jWidth > available)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25194)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25195)==0&false))) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25196);System.arraycopy(block, iRow * jWidth, outBlock, outIndex, available);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25197);outBlock = out.blocks[++outBlockIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25198);System.arraycopy(block, iRow * jWidth, outBlock, 0, jWidth - available);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25199);outIndex = jWidth - available;
            } }else {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25200);System.arraycopy(block, iRow * jWidth, outBlock, outIndex, jWidth);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25201);outIndex += jWidth;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25202);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRowMatrix(final int row, final RealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25203);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25204);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25205);setRowMatrix(row, (BlockRealMatrix) matrix);
        } catch (ClassCastException cce) {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25206);super.setRowMatrix(row, matrix);
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Sets the entries in row number <code>row</code>
     * as a row matrix.  Row indices start at 0.
     *
     * @param row the row to be set
     * @param matrix row matrix (must have one row and the same number of columns
     * as the instance)
     * @throws OutOfRangeException if the specified row index is invalid.
     * @throws MatrixDimensionMismatchException if the matrix dimensions do
     * not match one instance row.
     */
    public void setRowMatrix(final int row, final BlockRealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25207);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25208);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25209);final int nCols = getColumnDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25210);if (((((matrix.getRowDimension() != 1) ||
            (matrix.getColumnDimension() != nCols))&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25211)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25212)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25213);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       1, nCols);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25214);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25215);final int iRow = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25216);int mBlockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25217);int mIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25218);double[] mBlock = matrix.blocks[mBlockIndex];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25219);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25220)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25221)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25222);final int jWidth = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25223);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25224);final int available  = mBlock.length - mIndex;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25225);if ((((jWidth > available)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25226)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25227)==0&false))) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25228);System.arraycopy(mBlock, mIndex, block, iRow * jWidth, available);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25229);mBlock = matrix.blocks[++mBlockIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25230);System.arraycopy(mBlock, 0, block, iRow * jWidth, jWidth - available);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25231);mIndex = jWidth - available;
            } }else {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25232);System.arraycopy(mBlock, mIndex, block, iRow * jWidth, jWidth);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25233);mIndex += jWidth;
           }
        }}
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix getColumnMatrix(final int column)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25234);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25235);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25236);final BlockRealMatrix out = new BlockRealMatrix(rows, 1);

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25237);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25238);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25239);final int jWidth = blockWidth(jBlock);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25240);int outBlockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25241);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25242);double[] outBlock = out.blocks[outBlockIndex];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25243);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25244)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25245)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25246);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25247);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25248);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25249)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25250)==0&false)); ++i) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25251);if ((((outIndex >= outBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25252)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25253)==0&false))) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25254);outBlock = out.blocks[++outBlockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25255);outIndex = 0;
                }
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25256);outBlock[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25257);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumnMatrix(final int column, final RealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25258);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25259);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25260);setColumnMatrix(column, (BlockRealMatrix) matrix);
        } catch (ClassCastException cce) {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25261);super.setColumnMatrix(column, matrix);
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Sets the entries in column number <code>column</code>
     * as a column matrix.  Column indices start at 0.
     *
     * @param column the column to be set
     * @param matrix column matrix (must have one column and the same number of rows
     * as the instance)
     * @throws OutOfRangeException if the specified column index is invalid.
     * @throws MatrixDimensionMismatchException if the matrix dimensions do
     * not match one instance column.
     */
    void setColumnMatrix(final int column, final BlockRealMatrix matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25262);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25263);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25264);final int nRows = getRowDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25265);if (((((matrix.getRowDimension() != nRows) ||
            (matrix.getColumnDimension() != 1))&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25266)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25267)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25268);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       nRows, 1);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25269);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25270);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25271);final int jWidth = blockWidth(jBlock);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25272);int mBlockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25273);int mIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25274);double[] mBlock = matrix.blocks[mBlockIndex];
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25275);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25276)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25277)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25278);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25279);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25280);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25281)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25282)==0&false)); ++i) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25283);if ((((mIndex >= mBlock.length)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25284)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25285)==0&false))) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25286);mBlock = matrix.blocks[++mBlockIndex];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25287);mIndex = 0;
                }
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25288);block[i * jWidth + jColumn] = mBlock[mIndex++];
            }
        }}
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector getRowVector(final int row)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25289);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25290);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25291);final double[] outData = new double[columns];

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25292);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25293);final int iRow = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25294);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25295);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25296)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25297)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25298);final int jWidth = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25299);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25300);System.arraycopy(block, iRow * jWidth, outData, outIndex, jWidth);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25301);outIndex += jWidth;
        }

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25302);return new ArrayRealVector(outData, false);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRowVector(final int row, final RealVector vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25303);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25304);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25305);setRow(row, ((ArrayRealVector) vector).getDataRef());
        } catch (ClassCastException cce) {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25306);super.setRowVector(row, vector);
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector getColumnVector(final int column)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25307);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25308);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25309);final double[] outData = new double[rows];

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25310);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25311);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25312);final int jWidth = blockWidth(jBlock);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25313);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25314);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25315)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25316)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25317);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25318);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25319);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25320)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25321)==0&false)); ++i) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25322);outData[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25323);return new ArrayRealVector(outData, false);
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumnVector(final int column, final RealVector vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25324);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25325);try {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25326);setColumn(column, ((ArrayRealVector) vector).getDataRef());
        } catch (ClassCastException cce) {
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25327);super.setColumnVector(column, vector);
        }
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] getRow(final int row) throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25328);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25329);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25330);final double[] out = new double[columns];

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25331);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25332);final int iRow = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25333);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25334);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25335)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25336)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25337);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25338);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25339);System.arraycopy(block, iRow * jWidth, out, outIndex, jWidth);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25340);outIndex += jWidth;
        }

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25341);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setRow(final int row, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25342);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25343);MatrixUtils.checkRowIndex(this, row);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25344);final int nCols = getColumnDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25345);if ((((array.length != nCols)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25346)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25347)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25348);throw new MatrixDimensionMismatchException(1, array.length, 1, nCols);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25349);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25350);final int iRow = row - iBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25351);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25352);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25353)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25354)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25355);final int jWidth     = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25356);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25357);System.arraycopy(array, outIndex, block, iRow * jWidth, jWidth);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25358);outIndex += jWidth;
        }
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] getColumn(final int column) throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25359);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25360);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25361);final double[] out = new double[rows];

        // perform copy block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25362);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25363);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25364);final int jWidth  = blockWidth(jBlock);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25365);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25366);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25367)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25368)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25369);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25370);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25371);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25372)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25373)==0&false)); ++i) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25374);out[outIndex++] = block[i * jWidth + jColumn];
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25375);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setColumn(final int column, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25376);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25377);MatrixUtils.checkColumnIndex(this, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25378);final int nRows = getRowDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25379);if ((((array.length != nRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25380)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25381)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25382);throw new MatrixDimensionMismatchException(array.length, 1, nRows, 1);
        }

        // perform copy block-wise, to ensure good cache behavior
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25383);final int jBlock  = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25384);final int jColumn = column - jBlock * BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25385);final int jWidth = blockWidth(jBlock);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25386);int outIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25387);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25388)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25389)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25390);final int iHeight = blockHeight(iBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25391);final double[] block = blocks[iBlock * blockColumns + jBlock];
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25392);for (int i = 0; (((i < iHeight)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25393)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25394)==0&false)); ++i) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25395);block[i * jWidth + jColumn] = array[outIndex++];
            }
        }}
    }}finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25396);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25397);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25398);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25399);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25400);final int k = (row - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25401);return blocks[iBlock * blockColumns + jBlock][k];
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(final int row, final int column, final double value)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25402);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25403);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25404);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25405);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25406);final int k = (row - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25407);blocks[iBlock * blockColumns + jBlock][k] = value;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(final int row, final int column,
                           final double increment)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25408);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25409);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25410);final int iBlock = row    / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25411);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25412);final int k = (row    - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25413);blocks[iBlock * blockColumns + jBlock][k] += increment;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(final int row, final int column,
                              final double factor)
        throws OutOfRangeException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25414);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25415);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25416);final int iBlock = row / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25417);final int jBlock = column / BLOCK_SIZE;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25418);final int k = (row - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25419);blocks[iBlock * blockColumns + jBlock][k] *= factor;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix transpose() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25420);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25421);final int nRows = getRowDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25422);final int nCols = getColumnDimension();
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25423);final BlockRealMatrix out = new BlockRealMatrix(nCols, nRows);

        // perform transpose block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25424);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25425);for (int iBlock = 0; (((iBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25426)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25427)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25428);for (int jBlock = 0; (((jBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25429)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25430)==0&false)); ++jBlock) {{
                // transpose current block
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25431);final double[] outBlock = out.blocks[blockIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25432);final double[] tBlock = blocks[jBlock * blockColumns + iBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25433);final int pStart = iBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25434);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25435);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25436);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, rows);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25437);int k = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25438);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25439)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25440)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25441);final int lInc = pEnd - pStart;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25442);int l = p - pStart;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25443);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25444)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25445)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25446);outBlock[k] = tBlock[l];
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25447);++k;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25448);l+= lInc;
                    }
                }}
                // go to next block
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25449);++blockIndex;
            }
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25450);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25451);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25452);return rows;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25453);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25454);return columns;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] operate(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25455);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25456);if ((((v.length != columns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25457)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25458)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25459);throw new DimensionMismatchException(v.length, columns);
        }
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25460);final double[] out = new double[rows];

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25461);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25462)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25463)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25464);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25465);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25466);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25467)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25468)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25469);final double[] block  = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25470);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25471);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25472);int k = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25473);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25474)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25475)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25476);double sum = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25477);int q = qStart;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25478);while ((((q < qEnd - 3)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25479)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25480)==0&false))) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25481);sum += block[k]     * v[q]     +
                               block[k + 1] * v[q + 1] +
                               block[k + 2] * v[q + 2] +
                               block[k + 3] * v[q + 3];
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25482);k += 4;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25483);q += 4;
                    }
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(25484);while ((((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25485)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25486)==0&false))) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25487);sum += block[k++] * v[q++];
                    }
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(25488);out[p] += sum;
                }
            }}
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25489);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] preMultiply(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25490);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25491);if ((((v.length != rows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25492)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25493)==0&false))) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25494);throw new DimensionMismatchException(v.length, rows);
        }
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25495);final double[] out = new double[columns];

        // perform multiplication block-wise, to ensure good cache behavior
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25496);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25497)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25498)==0&false)); ++jBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25499);final int jWidth  = blockWidth(jBlock);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25500);final int jWidth2 = jWidth  + jWidth;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25501);final int jWidth3 = jWidth2 + jWidth;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25502);final int jWidth4 = jWidth3 + jWidth;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25503);final int qStart = jBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25504);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25505);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25506)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25507)==0&false)); ++iBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25508);final double[] block  = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25509);final int pStart = iBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25510);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25511);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25512)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25513)==0&false)); ++q) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25514);int k = q - qStart;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25515);double sum = 0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25516);int p = pStart;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25517);while ((((p < pEnd - 3)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25518)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25519)==0&false))) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25520);sum += block[k]           * v[p]     +
                               block[k + jWidth]  * v[p + 1] +
                               block[k + jWidth2] * v[p + 2] +
                               block[k + jWidth3] * v[p + 3];
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25521);k += jWidth4;
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25522);p += 4;
                    }
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(25523);while ((((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25524)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25525)==0&false))) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25526);sum += block[k] * v[p++];
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25527);k += jWidth;
                    }
                    }__CLR4_4_1j2nj2nlb90p8te.R.inc(25528);out[q] += sum;
                }
            }}
        }}

        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25529);return out;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25530);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25531);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25532);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25533)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25534)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25535);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25536);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25537);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25538)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25539)==0&false)); ++p) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25540);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25541)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25542)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25543);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25544);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25545);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25546);final double[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25547);int k = (p - pStart) * jWidth;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25548);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25549)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25550)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25551);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25552);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25553);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25554);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25555);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25556);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25557)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25558)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25559);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25560);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25561);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25562)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25563)==0&false)); ++p) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25564);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25565)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25566)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25567);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25568);final int qStart = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25569);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25570);final double[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25571);int k = (p - pStart) * jWidth;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25572);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25573)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25574)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25575);visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25576);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25577);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25578);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25579);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25580);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25581);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25582)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25583)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25584);final int p0 = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25585);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25586);final int pEnd = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25587);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25588)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25589)==0&false)); ++p) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25590);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25591)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25592)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25593);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25594);final int q0 = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25595);final int qStart = FastMath.max(startColumn, q0);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25596);final int qEnd = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25597);final double[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25598);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25599);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25600)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25601)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25602);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25603);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25604);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25605);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25606);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25607);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25608);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25609)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25610)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25611);final int p0 = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25612);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25613);final int pEnd = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25614);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25615)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25616)==0&false)); ++p) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25617);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25618)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25619)==0&false)); ++jBlock) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25620);final int jWidth = blockWidth(jBlock);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25621);final int q0 = jBlock * BLOCK_SIZE;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25622);final int qStart = FastMath.max(startColumn, q0);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25623);final int qEnd = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25624);final double[] block = blocks[iBlock * blockColumns + jBlock];
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25625);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25626);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25627)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25628)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25629);visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25630);++k;
                    }
                }}
             }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25631);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25632);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25633);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25634);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25635);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25636)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25637)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25638);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25639);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25640);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25641)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25642)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25643);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25644);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25645);final double[] block = blocks[blockIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25646);int k = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25647);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25648)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25649)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25650);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25651)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25652)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25653);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25654);++k;
                    }
                }}
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25655);++blockIndex;
            }
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25656);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25657);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25658);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25659);int blockIndex = 0;
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25660);for (int iBlock = 0; (((iBlock < blockRows)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25661)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25662)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25663);final int pStart = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25664);final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25665);for (int jBlock = 0; (((jBlock < blockColumns)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25666)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25667)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25668);final int qStart = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25669);final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25670);final double[] block = blocks[blockIndex];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25671);int k = 0;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25672);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25673)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25674)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25675);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25676)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25677)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25678);visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25679);++k;
                    }
                }}
                }__CLR4_4_1j2nj2nlb90p8te.R.inc(25680);++blockIndex;
            }
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25681);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn,
                                       final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25682);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25683);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25684);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25685);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25686)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25687)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25688);final int p0 = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25689);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25690);final int pEnd = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25691);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25692)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25693)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25694);final int jWidth = blockWidth(jBlock);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25695);final int q0 = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25696);final int qStart = FastMath.max(startColumn, q0);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25697);final int qEnd = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25698);final double[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25699);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25700)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25701)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25702);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25703);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25704)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25705)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25706);block[k] = visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25707);++k;
                    }
                }}
            }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25708);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn,
                                       final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25709);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25710);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25711);visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25712);for (int iBlock = startRow / BLOCK_SIZE; (((iBlock < 1 + endRow / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25713)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25714)==0&false)); ++iBlock) {{
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25715);final int p0 = iBlock * BLOCK_SIZE;
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25716);final int pStart = FastMath.max(startRow, p0);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25717);final int pEnd = FastMath.min((iBlock + 1) * BLOCK_SIZE, 1 + endRow);
            __CLR4_4_1j2nj2nlb90p8te.R.inc(25718);for (int jBlock = startColumn / BLOCK_SIZE; (((jBlock < 1 + endColumn / BLOCK_SIZE)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25719)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25720)==0&false)); ++jBlock) {{
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25721);final int jWidth = blockWidth(jBlock);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25722);final int q0 = jBlock * BLOCK_SIZE;
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25723);final int qStart = FastMath.max(startColumn, q0);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25724);final int qEnd = FastMath.min((jBlock + 1) * BLOCK_SIZE, 1 + endColumn);
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25725);final double[] block = blocks[iBlock * blockColumns + jBlock];
                __CLR4_4_1j2nj2nlb90p8te.R.inc(25726);for (int p = pStart; (((p < pEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25727)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25728)==0&false)); ++p) {{
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25729);int k = (p - p0) * jWidth + qStart - q0;
                    __CLR4_4_1j2nj2nlb90p8te.R.inc(25730);for (int q = qStart; (((q < qEnd)&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25731)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25732)==0&false)); ++q) {{
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25733);visitor.visit(p, q, block[k]);
                        __CLR4_4_1j2nj2nlb90p8te.R.inc(25734);++k;
                    }
                }}
            }}
        }}
        }__CLR4_4_1j2nj2nlb90p8te.R.inc(25735);return visitor.end();
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Get the height of a block.
     * @param blockRow row index (in block sense) of the block
     * @return height (number of rows) of the block
     */
    private int blockHeight(final int blockRow) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25736);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25737);return ((((blockRow == blockRows - 1) )&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25738)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25739)==0&false))? rows - blockRow * BLOCK_SIZE : BLOCK_SIZE;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}

    /**
     * Get the width of a block.
     * @param blockColumn column index (in block sense) of the block
     * @return width (number of columns) of the block
     */
    private int blockWidth(final int blockColumn) {try{__CLR4_4_1j2nj2nlb90p8te.R.inc(25740);
        __CLR4_4_1j2nj2nlb90p8te.R.inc(25741);return ((((blockColumn == blockColumns - 1) )&&(__CLR4_4_1j2nj2nlb90p8te.R.iget(25742)!=0|true))||(__CLR4_4_1j2nj2nlb90p8te.R.iget(25743)==0&false))? columns - blockColumn * BLOCK_SIZE : BLOCK_SIZE;
    }finally{__CLR4_4_1j2nj2nlb90p8te.R.flushNeeded();}}
}
