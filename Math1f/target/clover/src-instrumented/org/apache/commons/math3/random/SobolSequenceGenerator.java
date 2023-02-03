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
package org.apache.commons.math3.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.FastMath;

/**
 * Implementation of a Sobol sequence.
 * <p>
 * A Sobol sequence is a low-discrepancy sequence with the property that for all values of N,
 * its subsequence (x1, ... xN) has a low discrepancy. It can be used to generate pseudo-random
 * points in a space S, which are equi-distributed.
 * <p>
 * The implementation already comes with support for up to 1000 dimensions with direction numbers
 * calculated from <a href="http://web.maths.unsw.edu.au/~fkuo/sobol/">Stephen Joe and Frances Kuo</a>.
 * <p>
 * The generator supports two modes:
 * <ul>
 *   <li>sequential generation of points: {@link #nextVector()}</li>
 *   <li>random access to the i-th point in the sequence: {@link #skipTo(int)}</li>
 * </ul>
 *
 * @see <a href="http://en.wikipedia.org/wiki/Sobol_sequence">Sobol sequence (Wikipedia)</a>
 * @see <a href="http://web.maths.unsw.edu.au/~fkuo/sobol/">Sobol sequence direction numbers</a>
 *
 * @version $Id$
 * @since 3.3
 */
public class SobolSequenceGenerator implements RandomVectorGenerator {public static class __CLR4_4_111ap11aplb90paep{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The number of bits to use. */
    private static final int BITS = 52;

    /** The scaling factor. */
    private static final double SCALE = FastMath.pow(2, BITS);

    /** The maximum supported space dimension. */
    private static final int MAX_DIMENSION = 1000;

    /** The resource containing the direction numbers. */
    private static final String RESOURCE_NAME = "/assets/org/apache/commons/math3/random/new-joe-kuo-6.1000";

    /** Character set for file input. */
    private static final String FILE_CHARSET = "US-ASCII";

    /** Space dimension. */
    private final int dimension;

    /** The current index in the sequence. */
    private int count = 0;

    /** The direction vector for each component. */
    private final long[][] direction;

    /** The current state. */
    private final long[] x;

    /**
     * Construct a new Sobol sequence generator for the given space dimension.
     *
     * @param dimension the space dimension
     * @throws OutOfRangeException if the space dimension is outside the allowed range of [1, 1000]
     */
    public SobolSequenceGenerator(final int dimension) throws OutOfRangeException {try{__CLR4_4_111ap11aplb90paep.R.inc(48337);
        __CLR4_4_111ap11aplb90paep.R.inc(48338);if ((((dimension < 1 || dimension > MAX_DIMENSION)&&(__CLR4_4_111ap11aplb90paep.R.iget(48339)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48340)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48341);throw new OutOfRangeException(dimension, 1, MAX_DIMENSION);
        }

        // initialize the other dimensions with direction numbers from a resource
        }__CLR4_4_111ap11aplb90paep.R.inc(48342);final InputStream is = getClass().getResourceAsStream(RESOURCE_NAME);
        __CLR4_4_111ap11aplb90paep.R.inc(48343);if ((((is == null)&&(__CLR4_4_111ap11aplb90paep.R.iget(48344)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48345)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48346);throw new MathInternalError();
        }

        }__CLR4_4_111ap11aplb90paep.R.inc(48347);this.dimension = dimension;

        // init data structures
        __CLR4_4_111ap11aplb90paep.R.inc(48348);direction = new long[dimension][BITS + 1];
        __CLR4_4_111ap11aplb90paep.R.inc(48349);x = new long[dimension];

        __CLR4_4_111ap11aplb90paep.R.inc(48350);try {
            __CLR4_4_111ap11aplb90paep.R.inc(48351);initFromStream(is);
        } catch (IOException e) {
            // the internal resource file could not be read -> should not happen
            __CLR4_4_111ap11aplb90paep.R.inc(48352);throw new MathInternalError();
        } catch (MathParseException e) {
            // the internal resource file could not be parsed -> should not happen
            __CLR4_4_111ap11aplb90paep.R.inc(48353);throw new MathInternalError();
        } finally {
            __CLR4_4_111ap11aplb90paep.R.inc(48354);try {
                __CLR4_4_111ap11aplb90paep.R.inc(48355);is.close();
            } catch (IOException e) { // NOPMD
                // ignore
            }
        }
    }finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /**
     * Construct a new Sobol sequence generator for the given space dimension with
     * direction vectors loaded from the given stream.
     * <p>
     * The expected format is identical to the files available from
     * <a href="http://web.maths.unsw.edu.au/~fkuo/sobol/">Stephen Joe and Frances Kuo</a>.
     * The first line will be ignored as it is assumed to contain only the column headers.
     * The columns are:
     * <ul>
     *  <li>d: the dimension</li>
     *  <li>s: the degree of the primitive polynomial</li>
     *  <li>a: the number representing the coefficients</li>
     *  <li>m: the list of initial direction numbers</li>
     * </ul>
     * Example:
     * <pre>
     * d       s       a       m_i
     * 2       1       0       1
     * 3       2       1       1 3
     * </pre>
     * <p>
     * The input stream <i>must</i> be an ASCII text containing one valid direction vector per line.
     *
     * @param dimension the space dimension
     * @param is the stream to read the direction vectors from
     * @throws NotStrictlyPositiveException if the space dimension is &lt; 1
     * @throws OutOfRangeException if the space dimension is outside the range [1, max], where
     *   max refers to the maximum dimension found in the input stream
     * @throws MathParseException if the content in the stream could not be parsed successfully
     * @throws IOException if an error occurs while reading from the input stream
     */
    public SobolSequenceGenerator(final int dimension, final InputStream is)
            throws NotStrictlyPositiveException, MathParseException, IOException {try{__CLR4_4_111ap11aplb90paep.R.inc(48356);

        __CLR4_4_111ap11aplb90paep.R.inc(48357);if ((((dimension < 1)&&(__CLR4_4_111ap11aplb90paep.R.iget(48358)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48359)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48360);throw new NotStrictlyPositiveException(dimension);
        }

        }__CLR4_4_111ap11aplb90paep.R.inc(48361);this.dimension = dimension;

        // init data structures
        __CLR4_4_111ap11aplb90paep.R.inc(48362);direction = new long[dimension][BITS + 1];
        __CLR4_4_111ap11aplb90paep.R.inc(48363);x = new long[dimension];

        // initialize the other dimensions with direction numbers from the stream
        __CLR4_4_111ap11aplb90paep.R.inc(48364);int lastDimension = initFromStream(is);
        __CLR4_4_111ap11aplb90paep.R.inc(48365);if ((((lastDimension < dimension)&&(__CLR4_4_111ap11aplb90paep.R.iget(48366)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48367)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48368);throw new OutOfRangeException(dimension, 1, lastDimension);
        }
    }}finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /**
     * Load the direction vector for each dimension from the given stream.
     * <p>
     * The input stream <i>must</i> be an ASCII text containing one
     * valid direction vector per line.
     *
     * @param is the input stream to read the direction vector from
     * @return the last dimension that has been read from the input stream
     * @throws IOException if the stream could not be read
     * @throws MathParseException if the content could not be parsed successfully
     */
    private int initFromStream(final InputStream is) throws MathParseException, IOException {try{__CLR4_4_111ap11aplb90paep.R.inc(48369);

        // special case: dimension 1 -> use unit initialization
        __CLR4_4_111ap11aplb90paep.R.inc(48370);for (int i = 1; (((i <= BITS)&&(__CLR4_4_111ap11aplb90paep.R.iget(48371)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48372)==0&false)); i++) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48373);direction[0][i] = 1l << (BITS - i);
        }

        }__CLR4_4_111ap11aplb90paep.R.inc(48374);final Charset charset = Charset.forName(FILE_CHARSET);
        __CLR4_4_111ap11aplb90paep.R.inc(48375);final BufferedReader reader = new BufferedReader(new InputStreamReader(is, charset));
        __CLR4_4_111ap11aplb90paep.R.inc(48376);int dim = -1;

        __CLR4_4_111ap11aplb90paep.R.inc(48377);try {
            // ignore first line
            __CLR4_4_111ap11aplb90paep.R.inc(48378);reader.readLine();

            __CLR4_4_111ap11aplb90paep.R.inc(48379);int lineNumber = 2;
            __CLR4_4_111ap11aplb90paep.R.inc(48380);int index = 1;
            __CLR4_4_111ap11aplb90paep.R.inc(48381);String line = null;
            __CLR4_4_111ap11aplb90paep.R.inc(48382);while ( (line = reader.readLine()) != null) {{
                __CLR4_4_111ap11aplb90paep.R.inc(48385);StringTokenizer st = new StringTokenizer(line, " ");
                __CLR4_4_111ap11aplb90paep.R.inc(48386);try {
                    __CLR4_4_111ap11aplb90paep.R.inc(48387);dim = Integer.parseInt(st.nextToken());
                    __CLR4_4_111ap11aplb90paep.R.inc(48388);if ((((dim >= 2 && dim <= dimension)&&(__CLR4_4_111ap11aplb90paep.R.iget(48389)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48390)==0&false))) {{ // we have found the right dimension
                        __CLR4_4_111ap11aplb90paep.R.inc(48391);final int s = Integer.parseInt(st.nextToken());
                        __CLR4_4_111ap11aplb90paep.R.inc(48392);final int a = Integer.parseInt(st.nextToken());
                        __CLR4_4_111ap11aplb90paep.R.inc(48393);final int[] m = new int[s + 1];
                        __CLR4_4_111ap11aplb90paep.R.inc(48394);for (int i = 1; (((i <= s)&&(__CLR4_4_111ap11aplb90paep.R.iget(48395)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48396)==0&false)); i++) {{
                            __CLR4_4_111ap11aplb90paep.R.inc(48397);m[i] = Integer.parseInt(st.nextToken());
                        }
                        }__CLR4_4_111ap11aplb90paep.R.inc(48398);initDirectionVector(index++, a, m);
                    }

                    }__CLR4_4_111ap11aplb90paep.R.inc(48399);if ((((dim > dimension)&&(__CLR4_4_111ap11aplb90paep.R.iget(48400)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48401)==0&false))) {{
                        __CLR4_4_111ap11aplb90paep.R.inc(48402);return dim;
                    }
                }} catch (NoSuchElementException e) {
                    __CLR4_4_111ap11aplb90paep.R.inc(48403);throw new MathParseException(line, lineNumber);
                } catch (NumberFormatException e) {
                    __CLR4_4_111ap11aplb90paep.R.inc(48404);throw new MathParseException(line, lineNumber);
                }
                __CLR4_4_111ap11aplb90paep.R.inc(48405);lineNumber++;
            }
        }} finally {
            __CLR4_4_111ap11aplb90paep.R.inc(48406);reader.close();
        }

        __CLR4_4_111ap11aplb90paep.R.inc(48407);return dim;
    }finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /**
     * Calculate the direction numbers from the given polynomial.
     *
     * @param d the dimension, zero-based
     * @param a the coefficients of the primitive polynomial
     * @param m the initial direction numbers
     */
    private void initDirectionVector(final int d, final int a, final int[] m) {try{__CLR4_4_111ap11aplb90paep.R.inc(48408);
        __CLR4_4_111ap11aplb90paep.R.inc(48409);final int s = m.length - 1;
        __CLR4_4_111ap11aplb90paep.R.inc(48410);for (int i = 1; (((i <= s)&&(__CLR4_4_111ap11aplb90paep.R.iget(48411)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48412)==0&false)); i++) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48413);direction[d][i] = ((long) m[i]) << (BITS - i);
        }
        }__CLR4_4_111ap11aplb90paep.R.inc(48414);for (int i = s + 1; (((i <= BITS)&&(__CLR4_4_111ap11aplb90paep.R.iget(48415)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48416)==0&false)); i++) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48417);direction[d][i] = direction[d][i - s] ^ (direction[d][i - s] >> s);
            __CLR4_4_111ap11aplb90paep.R.inc(48418);for (int k = 1; (((k <= s - 1)&&(__CLR4_4_111ap11aplb90paep.R.iget(48419)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48420)==0&false)); k++) {{
                __CLR4_4_111ap11aplb90paep.R.inc(48421);direction[d][i] ^= ((a >> (s - 1 - k)) & 1) * direction[d][i - k];
            }
        }}
    }}finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] nextVector() {try{__CLR4_4_111ap11aplb90paep.R.inc(48422);
        __CLR4_4_111ap11aplb90paep.R.inc(48423);final double[] v = new double[dimension];
        __CLR4_4_111ap11aplb90paep.R.inc(48424);if ((((count == 0)&&(__CLR4_4_111ap11aplb90paep.R.iget(48425)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48426)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48427);count++;
            __CLR4_4_111ap11aplb90paep.R.inc(48428);return v;
        }

        // find the index c of the rightmost 0
        }__CLR4_4_111ap11aplb90paep.R.inc(48429);int c = 1;
        __CLR4_4_111ap11aplb90paep.R.inc(48430);int value = count - 1;
        __CLR4_4_111ap11aplb90paep.R.inc(48431);while (((((value & 1) == 1)&&(__CLR4_4_111ap11aplb90paep.R.iget(48432)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48433)==0&false))) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48434);value >>= 1;
            __CLR4_4_111ap11aplb90paep.R.inc(48435);c++;
        }

        }__CLR4_4_111ap11aplb90paep.R.inc(48436);for (int i = 0; (((i < dimension)&&(__CLR4_4_111ap11aplb90paep.R.iget(48437)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48438)==0&false)); i++) {{
            __CLR4_4_111ap11aplb90paep.R.inc(48439);x[i] = x[i] ^ direction[i][c];
            __CLR4_4_111ap11aplb90paep.R.inc(48440);v[i] = (double) x[i] / SCALE;
        }
        }__CLR4_4_111ap11aplb90paep.R.inc(48441);count++;
        __CLR4_4_111ap11aplb90paep.R.inc(48442);return v;
    }finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /**
     * Skip to the i-th point in the Sobol sequence.
     * <p>
     * This operation can be performed in O(1).
     *
     * @param index the index in the sequence to skip to
     * @return the i-th point in the Sobol sequence
     * @throws NotPositiveException if index &lt; 0
     */
    public double[] skipTo(final int index) throws NotPositiveException {try{__CLR4_4_111ap11aplb90paep.R.inc(48443);
        __CLR4_4_111ap11aplb90paep.R.inc(48444);if ((((index == 0)&&(__CLR4_4_111ap11aplb90paep.R.iget(48445)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48446)==0&false))) {{
            // reset x vector
            __CLR4_4_111ap11aplb90paep.R.inc(48447);Arrays.fill(x, 0);
        } }else {{
            __CLR4_4_111ap11aplb90paep.R.inc(48448);final int i = index - 1;
            __CLR4_4_111ap11aplb90paep.R.inc(48449);final long grayCode = i ^ (i >> 1); // compute the gray code of i = i XOR floor(i / 2)
            __CLR4_4_111ap11aplb90paep.R.inc(48450);for (int j = 0; (((j < dimension)&&(__CLR4_4_111ap11aplb90paep.R.iget(48451)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48452)==0&false)); j++) {{
                __CLR4_4_111ap11aplb90paep.R.inc(48453);long result = 0;
                __CLR4_4_111ap11aplb90paep.R.inc(48454);for (int k = 1; (((k <= BITS)&&(__CLR4_4_111ap11aplb90paep.R.iget(48455)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48456)==0&false)); k++) {{
                    __CLR4_4_111ap11aplb90paep.R.inc(48457);final long shift = grayCode >> (k - 1);
                    __CLR4_4_111ap11aplb90paep.R.inc(48458);if ((((shift == 0)&&(__CLR4_4_111ap11aplb90paep.R.iget(48459)!=0|true))||(__CLR4_4_111ap11aplb90paep.R.iget(48460)==0&false))) {{
                        // stop, as all remaining bits will be zero
                        __CLR4_4_111ap11aplb90paep.R.inc(48461);break;
                    }
                    // the k-th bit of i
                    }__CLR4_4_111ap11aplb90paep.R.inc(48462);final long ik = shift & 1;
                    __CLR4_4_111ap11aplb90paep.R.inc(48463);result ^= ik * direction[j][k];
                }
                }__CLR4_4_111ap11aplb90paep.R.inc(48464);x[j] = result;
            }
        }}
        }__CLR4_4_111ap11aplb90paep.R.inc(48465);count = index;
        __CLR4_4_111ap11aplb90paep.R.inc(48466);return nextVector();
    }finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

    /**
     * Returns the index i of the next point in the Sobol sequence that will be returned
     * by calling {@link #nextVector()}.
     *
     * @return the index of the next point
     */
    public int getNextIndex() {try{__CLR4_4_111ap11aplb90paep.R.inc(48467);
        __CLR4_4_111ap11aplb90paep.R.inc(48468);return count;
    }finally{__CLR4_4_111ap11aplb90paep.R.flushNeeded();}}

}
