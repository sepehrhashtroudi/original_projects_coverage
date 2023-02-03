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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.apache.commons.math3.stat.ranking.RankingAlgorithm;

/**
 * Spearman's rank correlation. This implementation performs a rank
 * transformation on the input data and then computes {@link PearsonsCorrelation}
 * on the ranked data.
 * <p>
 * By default, ranks are computed using {@link NaturalRanking} with default
 * strategies for handling NaNs and ties in the data (NaNs maximal, ties averaged).
 * The ranking algorithm can be set using a constructor argument.
 *
 * @since 2.0
 * @version $Id$
 */
public class SpearmansCorrelation {public static class __CLR4_4_112ti12tilb90pal6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Input data */
    private final RealMatrix data;

    /** Ranking algorithm  */
    private final RankingAlgorithm rankingAlgorithm;

    /** Rank correlation */
    private final PearsonsCorrelation rankCorrelation;

    /**
     * Create a SpearmansCorrelation without data.
     */
    public SpearmansCorrelation() {
        this(new NaturalRanking());__CLR4_4_112ti12tilb90pal6.R.inc(50311);try{__CLR4_4_112ti12tilb90pal6.R.inc(50310);
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Create a SpearmansCorrelation with the given ranking algorithm.
     * <p>
     * From version 4.0 onwards this constructor will throw an exception
     * if the provided {@link NaturalRanking} uses a {@link NaNStrategy#REMOVED} strategy.
     *
     * @param rankingAlgorithm ranking algorithm
     * @since 3.1
     */
    public SpearmansCorrelation(final RankingAlgorithm rankingAlgorithm) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50312);
        __CLR4_4_112ti12tilb90pal6.R.inc(50313);data = null;
        __CLR4_4_112ti12tilb90pal6.R.inc(50314);this.rankingAlgorithm = rankingAlgorithm;
        __CLR4_4_112ti12tilb90pal6.R.inc(50315);rankCorrelation = null;
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Create a SpearmansCorrelation from the given data matrix.
     *
     * @param dataMatrix matrix of data with columns representing
     * variables to correlate
     */
    public SpearmansCorrelation(final RealMatrix dataMatrix) {
        this(dataMatrix, new NaturalRanking());__CLR4_4_112ti12tilb90pal6.R.inc(50317);try{__CLR4_4_112ti12tilb90pal6.R.inc(50316);
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Create a SpearmansCorrelation with the given input data matrix
     * and ranking algorithm.
     * <p>
     * From version 4.0 onwards this constructor will throw an exception
     * if the provided {@link NaturalRanking} uses a {@link NaNStrategy#REMOVED} strategy.
     *
     * @param dataMatrix matrix of data with columns representing
     * variables to correlate
     * @param rankingAlgorithm ranking algorithm
     */
    public SpearmansCorrelation(final RealMatrix dataMatrix, final RankingAlgorithm rankingAlgorithm) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50318);
        __CLR4_4_112ti12tilb90pal6.R.inc(50319);this.rankingAlgorithm = rankingAlgorithm;
        __CLR4_4_112ti12tilb90pal6.R.inc(50320);this.data = rankTransform(dataMatrix);
        __CLR4_4_112ti12tilb90pal6.R.inc(50321);rankCorrelation = new PearsonsCorrelation(data);
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Calculate the Spearman Rank Correlation Matrix.
     *
     * @return Spearman Rank Correlation Matrix
     */
    public RealMatrix getCorrelationMatrix() {try{__CLR4_4_112ti12tilb90pal6.R.inc(50322);
        __CLR4_4_112ti12tilb90pal6.R.inc(50323);return rankCorrelation.getCorrelationMatrix();
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Returns a {@link PearsonsCorrelation} instance constructed from the
     * ranked input data. That is,
     * <code>new SpearmansCorrelation(matrix).getRankCorrelation()</code>
     * is equivalent to
     * <code>new PearsonsCorrelation(rankTransform(matrix))</code> where
     * <code>rankTransform(matrix)</code> is the result of applying the
     * configured <code>RankingAlgorithm</code> to each of the columns of
     * <code>matrix.</code>
     *
     * @return PearsonsCorrelation among ranked column data
     */
    public PearsonsCorrelation getRankCorrelation() {try{__CLR4_4_112ti12tilb90pal6.R.inc(50324);
        __CLR4_4_112ti12tilb90pal6.R.inc(50325);return rankCorrelation;
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Computes the Spearman's rank correlation matrix for the columns of the
     * input matrix.
     *
     * @param matrix matrix with columns representing variables to correlate
     * @return correlation matrix
     */
    public RealMatrix computeCorrelationMatrix(final RealMatrix matrix) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50326);
        __CLR4_4_112ti12tilb90pal6.R.inc(50327);final RealMatrix matrixCopy = rankTransform(matrix);
        __CLR4_4_112ti12tilb90pal6.R.inc(50328);return new PearsonsCorrelation().computeCorrelationMatrix(matrixCopy);
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Computes the Spearman's rank correlation matrix for the columns of the
     * input rectangular array.  The columns of the array represent values
     * of variables to be correlated.
     *
     * @param matrix matrix with columns representing variables to correlate
     * @return correlation matrix
     */
    public RealMatrix computeCorrelationMatrix(final double[][] matrix) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50329);
       __CLR4_4_112ti12tilb90pal6.R.inc(50330);return computeCorrelationMatrix(new BlockRealMatrix(matrix));
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Computes the Spearman's rank correlation coefficient between the two arrays.
     *
     * @param xArray first data array
     * @param yArray second data array
     * @return Returns Spearman's rank correlation coefficient for the two arrays
     * @throws DimensionMismatchException if the arrays lengths do not match
     * @throws MathIllegalArgumentException if the array length is less than 2
     */
    public double correlation(final double[] xArray, final double[] yArray) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50331);
        __CLR4_4_112ti12tilb90pal6.R.inc(50332);if ((((xArray.length != yArray.length)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50333)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50334)==0&false))) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50335);throw new DimensionMismatchException(xArray.length, yArray.length);
        } }else {__CLR4_4_112ti12tilb90pal6.R.inc(50336);if ((((xArray.length < 2)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50337)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50338)==0&false))) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50339);throw new MathIllegalArgumentException(LocalizedFormats.INSUFFICIENT_DIMENSION,
                                                   xArray.length, 2);
        } }else {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50340);double[] x = xArray;
            __CLR4_4_112ti12tilb90pal6.R.inc(50341);double[] y = yArray;
            __CLR4_4_112ti12tilb90pal6.R.inc(50342);if ((((rankingAlgorithm instanceof NaturalRanking &&
                NaNStrategy.REMOVED == ((NaturalRanking) rankingAlgorithm).getNanStrategy())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50343)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50344)==0&false))) {{
                __CLR4_4_112ti12tilb90pal6.R.inc(50345);final Set<Integer> nanPositions = new HashSet<Integer>();

                __CLR4_4_112ti12tilb90pal6.R.inc(50346);nanPositions.addAll(getNaNPositions(xArray));
                __CLR4_4_112ti12tilb90pal6.R.inc(50347);nanPositions.addAll(getNaNPositions(yArray));

                __CLR4_4_112ti12tilb90pal6.R.inc(50348);x = removeValues(xArray, nanPositions);
                __CLR4_4_112ti12tilb90pal6.R.inc(50349);y = removeValues(yArray, nanPositions);
            }
            }__CLR4_4_112ti12tilb90pal6.R.inc(50350);return new PearsonsCorrelation().correlation(rankingAlgorithm.rank(x), rankingAlgorithm.rank(y));
        }
    }}}finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Applies rank transform to each of the columns of <code>matrix</code>
     * using the current <code>rankingAlgorithm</code>.
     *
     * @param matrix matrix to transform
     * @return a rank-transformed matrix
     */
    private RealMatrix rankTransform(final RealMatrix matrix) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50351);
        __CLR4_4_112ti12tilb90pal6.R.inc(50352);RealMatrix transformed = null;

        __CLR4_4_112ti12tilb90pal6.R.inc(50353);if ((((rankingAlgorithm instanceof NaturalRanking &&
                ((NaturalRanking) rankingAlgorithm).getNanStrategy() == NaNStrategy.REMOVED)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50354)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50355)==0&false))) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50356);final Set<Integer> nanPositions = new HashSet<Integer>();
            __CLR4_4_112ti12tilb90pal6.R.inc(50357);for (int i = 0; (((i < matrix.getColumnDimension())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50358)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50359)==0&false)); i++) {{
                __CLR4_4_112ti12tilb90pal6.R.inc(50360);nanPositions.addAll(getNaNPositions(matrix.getColumn(i)));
            }

            // if we have found NaN values, we have to update the matrix size
            }__CLR4_4_112ti12tilb90pal6.R.inc(50361);if ((((!nanPositions.isEmpty())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50362)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50363)==0&false))) {{
                __CLR4_4_112ti12tilb90pal6.R.inc(50364);transformed = new BlockRealMatrix(matrix.getRowDimension() - nanPositions.size(),
                                                  matrix.getColumnDimension());
                __CLR4_4_112ti12tilb90pal6.R.inc(50365);for (int i = 0; (((i < transformed.getColumnDimension())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50366)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50367)==0&false)); i++) {{
                    __CLR4_4_112ti12tilb90pal6.R.inc(50368);transformed.setColumn(i, removeValues(matrix.getColumn(i), nanPositions));
                }
            }}
        }}

        }__CLR4_4_112ti12tilb90pal6.R.inc(50369);if ((((transformed == null)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50370)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50371)==0&false))) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50372);transformed = matrix.copy();
        }

        }__CLR4_4_112ti12tilb90pal6.R.inc(50373);for (int i = 0; (((i < transformed.getColumnDimension())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50374)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50375)==0&false)); i++) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50376);transformed.setColumn(i, rankingAlgorithm.rank(transformed.getColumn(i)));
        }

        }__CLR4_4_112ti12tilb90pal6.R.inc(50377);return transformed;
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Returns a list containing the indices of NaN values in the input array.
     *
     * @param input the input array
     * @return a list of NaN positions in the input array
     */
    private List<Integer> getNaNPositions(final double[] input) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50378);
        __CLR4_4_112ti12tilb90pal6.R.inc(50379);final List<Integer> positions = new ArrayList<Integer>();
        __CLR4_4_112ti12tilb90pal6.R.inc(50380);for (int i = 0; (((i < input.length)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50381)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50382)==0&false)); i++) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50383);if ((((Double.isNaN(input[i]))&&(__CLR4_4_112ti12tilb90pal6.R.iget(50384)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50385)==0&false))) {{
                __CLR4_4_112ti12tilb90pal6.R.inc(50386);positions.add(i);
            }
        }}
        }__CLR4_4_112ti12tilb90pal6.R.inc(50387);return positions;
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}

    /**
     * Removes all values from the input array at the specified indices.
     *
     * @param input the input array
     * @param indices a set containing the indices to be removed
     * @return the input array without the values at the specified indices
     */
    private double[] removeValues(final double[] input, final Set<Integer> indices) {try{__CLR4_4_112ti12tilb90pal6.R.inc(50388);
        __CLR4_4_112ti12tilb90pal6.R.inc(50389);if ((((indices.isEmpty())&&(__CLR4_4_112ti12tilb90pal6.R.iget(50390)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50391)==0&false))) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50392);return input;
        }
        }__CLR4_4_112ti12tilb90pal6.R.inc(50393);final double[] result = new double[input.length - indices.size()];
        __CLR4_4_112ti12tilb90pal6.R.inc(50394);for (int i = 0, j = 0; (((i < input.length)&&(__CLR4_4_112ti12tilb90pal6.R.iget(50395)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50396)==0&false)); i++) {{
            __CLR4_4_112ti12tilb90pal6.R.inc(50397);if ((((!indices.contains(i))&&(__CLR4_4_112ti12tilb90pal6.R.iget(50398)!=0|true))||(__CLR4_4_112ti12tilb90pal6.R.iget(50399)==0&false))) {{
                __CLR4_4_112ti12tilb90pal6.R.inc(50400);result[j++] = input[i];
            }
        }}
        }__CLR4_4_112ti12tilb90pal6.R.inc(50401);return result;
    }finally{__CLR4_4_112ti12tilb90pal6.R.flushNeeded();}}
}
