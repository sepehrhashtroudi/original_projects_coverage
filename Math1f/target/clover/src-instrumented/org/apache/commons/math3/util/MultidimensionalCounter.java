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

package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;

/**
 * Converter between unidimensional storage structure and multidimensional
 * conceptual structure.
 * This utility will convert from indices in a multidimensional structure
 * to the corresponding index in a one-dimensional array. For example,
 * assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,
 * the following correspondences, between 3-tuples indices and unidimensional
 * indices, will hold:
 * <ul>
 *  <li>(0, 0, 0) corresponds to 0</li>
 *  <li>(0, 0, 1) corresponds to 1</li>
 *  <li>(0, 0, 2) corresponds to 2</li>
 *  <li>(0, 1, 0) corresponds to 3</li>
 *  <li>...</li>
 *  <li>(1, 0, 0) corresponds to 12</li>
 *  <li>...</li>
 *  <li>(1, 3, 2) corresponds to 23</li>
 * </ul>
 *
 * @since 2.2
 * @version $Id$
 */
public class MultidimensionalCounter implements Iterable<Integer> {public static class __CLR4_4_11af61af6lb90pb9u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Number of dimensions.
     */
    private final int dimension;
    /**
     * Offset for each dimension.
     */
    private final int[] uniCounterOffset;
    /**
     * Counter sizes.
     */
    private final int[] size;
    /**
     * Total number of (one-dimensional) slots.
     */
    private final int totalSize;
    /**
     * Index of last dimension.
     */
    private final int last;

    /**
     * Perform iteration over the multidimensional counter.
     */
    public class Iterator implements java.util.Iterator<Integer> {
        /**
         * Multidimensional counter.
         */
        private final int[] counter = new int[dimension];
        /**
         * Unidimensional counter.
         */
        private int count = -1;

        /**
         * Create an iterator
         * @see #iterator()
         */
        Iterator() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60162);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60163);counter[last] = -1;
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public boolean hasNext() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60164);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60165);for (int i = 0; (((i < dimension)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60166)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60167)==0&false)); i++) {{
                __CLR4_4_11af61af6lb90pb9u.R.inc(60168);if ((((counter[i] != size[i] - 1)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60169)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60170)==0&false))) {{
                    __CLR4_4_11af61af6lb90pb9u.R.inc(60171);return true;
                }
            }}
            }__CLR4_4_11af61af6lb90pb9u.R.inc(60172);return false;
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

        /**
         * @return the unidimensional count after the counter has been
         * incremented by {@code 1}.
         */
        public Integer next() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60173);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60174);for (int i = last; (((i >= 0)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60175)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60176)==0&false)); i--) {{
                __CLR4_4_11af61af6lb90pb9u.R.inc(60177);if ((((counter[i] == size[i] - 1)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60178)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60179)==0&false))) {{
                    __CLR4_4_11af61af6lb90pb9u.R.inc(60180);counter[i] = 0;
                } }else {{
                    __CLR4_4_11af61af6lb90pb9u.R.inc(60181);++counter[i];
                    __CLR4_4_11af61af6lb90pb9u.R.inc(60182);break;
                }
            }}

            }__CLR4_4_11af61af6lb90pb9u.R.inc(60183);return ++count;
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

        /**
         * Get the current unidimensional counter slot.
         *
         * @return the index within the unidimensionl counter.
         */
        public int getCount() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60184);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60185);return count;
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}
        /**
         * Get the current multidimensional counter slots.
         *
         * @return the indices within the multidimensional counter.
         */
        public int[] getCounts() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60186);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60187);return MathArrays.copyOf(counter);
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

        /**
         * Get the current count in the selected dimension.
         *
         * @param dim Dimension index.
         * @return the count at the corresponding index for the current state
         * of the iterator.
         * @throws IndexOutOfBoundsException if {@code index} is not in the
         * correct interval (as defined by the length of the argument in the
         * {@link MultidimensionalCounter#MultidimensionalCounter(int[])
         * constructor of the enclosing class}).
         */
        public int getCount(int dim) {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60188);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60189);return counter[dim];
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

        /**
         * @throws UnsupportedOperationException
         */
        public void remove() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60190);
            __CLR4_4_11af61af6lb90pb9u.R.inc(60191);throw new UnsupportedOperationException();
        }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}
    }

    /**
     * Create a counter.
     *
     * @param size Counter sizes (number of slots in each dimension).
     * @throws NotStrictlyPositiveException if one of the sizes is
     * negative or zero.
     */
    public MultidimensionalCounter(int ... size) throws NotStrictlyPositiveException {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60192);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60193);dimension = size.length;
        __CLR4_4_11af61af6lb90pb9u.R.inc(60194);this.size = MathArrays.copyOf(size);

        __CLR4_4_11af61af6lb90pb9u.R.inc(60195);uniCounterOffset = new int[dimension];

        __CLR4_4_11af61af6lb90pb9u.R.inc(60196);last = dimension - 1;
        __CLR4_4_11af61af6lb90pb9u.R.inc(60197);int tS = size[last];
        __CLR4_4_11af61af6lb90pb9u.R.inc(60198);for (int i = 0; (((i < last)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60199)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60200)==0&false)); i++) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60201);int count = 1;
            __CLR4_4_11af61af6lb90pb9u.R.inc(60202);for (int j = i + 1; (((j < dimension)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60203)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60204)==0&false)); j++) {{
                __CLR4_4_11af61af6lb90pb9u.R.inc(60205);count *= size[j];
            }
            }__CLR4_4_11af61af6lb90pb9u.R.inc(60206);uniCounterOffset[i] = count;
            __CLR4_4_11af61af6lb90pb9u.R.inc(60207);tS *= size[i];
        }
        }__CLR4_4_11af61af6lb90pb9u.R.inc(60208);uniCounterOffset[last] = 0;

        __CLR4_4_11af61af6lb90pb9u.R.inc(60209);if ((((tS <= 0)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60210)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60211)==0&false))) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60212);throw new NotStrictlyPositiveException(tS);
        }

        }__CLR4_4_11af61af6lb90pb9u.R.inc(60213);totalSize = tS;
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * Create an iterator over this counter.
     *
     * @return the iterator.
     */
    public Iterator iterator() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60214);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60215);return new Iterator();
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * Get the number of dimensions of the multidimensional counter.
     *
     * @return the number of dimensions.
     */
    public int getDimension() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60216);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60217);return dimension;
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * Convert to multidimensional counter.
     *
     * @param index Index in unidimensional counter.
     * @return the multidimensional counts.
     * @throws OutOfRangeException if {@code index} is not between
     * {@code 0} and the value returned by {@link #getSize()} (excluded).
     */
    public int[] getCounts(int index) throws OutOfRangeException {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60218);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60219);if ((((index < 0 ||
            index >= totalSize)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60220)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60221)==0&false))) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60222);throw new OutOfRangeException(index, 0, totalSize);
        }

        }__CLR4_4_11af61af6lb90pb9u.R.inc(60223);final int[] indices = new int[dimension];

        __CLR4_4_11af61af6lb90pb9u.R.inc(60224);int count = 0;
        __CLR4_4_11af61af6lb90pb9u.R.inc(60225);for (int i = 0; (((i < last)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60226)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60227)==0&false)); i++) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60228);int idx = 0;
            __CLR4_4_11af61af6lb90pb9u.R.inc(60229);final int offset = uniCounterOffset[i];
            __CLR4_4_11af61af6lb90pb9u.R.inc(60230);while ((((count <= index)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60231)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60232)==0&false))) {{
                __CLR4_4_11af61af6lb90pb9u.R.inc(60233);count += offset;
                __CLR4_4_11af61af6lb90pb9u.R.inc(60234);++idx;
            }
            }__CLR4_4_11af61af6lb90pb9u.R.inc(60235);--idx;
            __CLR4_4_11af61af6lb90pb9u.R.inc(60236);count -= offset;
            __CLR4_4_11af61af6lb90pb9u.R.inc(60237);indices[i] = idx;
        }

        }__CLR4_4_11af61af6lb90pb9u.R.inc(60238);indices[last] = index - count;

        __CLR4_4_11af61af6lb90pb9u.R.inc(60239);return indices;
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * Convert to unidimensional counter.
     *
     * @param c Indices in multidimensional counter.
     * @return the index within the unidimensionl counter.
     * @throws DimensionMismatchException if the size of {@code c}
     * does not match the size of the array given in the constructor.
     * @throws OutOfRangeException if a value of {@code c} is not in
     * the range of the corresponding dimension, as defined in the
     * {@link MultidimensionalCounter#MultidimensionalCounter(int...) constructor}.
     */
    public int getCount(int ... c)
        throws OutOfRangeException, DimensionMismatchException {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60240);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60241);if ((((c.length != dimension)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60242)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60243)==0&false))) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60244);throw new DimensionMismatchException(c.length, dimension);
        }
        }__CLR4_4_11af61af6lb90pb9u.R.inc(60245);int count = 0;
        __CLR4_4_11af61af6lb90pb9u.R.inc(60246);for (int i = 0; (((i < dimension)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60247)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60248)==0&false)); i++) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60249);final int index = c[i];
            __CLR4_4_11af61af6lb90pb9u.R.inc(60250);if ((((index < 0 ||
                index >= size[i])&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60251)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60252)==0&false))) {{
                __CLR4_4_11af61af6lb90pb9u.R.inc(60253);throw new OutOfRangeException(index, 0, size[i] - 1);
            }
            }__CLR4_4_11af61af6lb90pb9u.R.inc(60254);count += uniCounterOffset[i] * c[i];
        }
        }__CLR4_4_11af61af6lb90pb9u.R.inc(60255);return count + c[last];
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * Get the total number of elements.
     *
     * @return the total size of the unidimensional counter.
     */
    public int getSize() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60256);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60257);return totalSize;
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}
    /**
     * Get the number of multidimensional counter slots in each dimension.
     *
     * @return the sizes of the multidimensional counter in each dimension.
     */
    public int[] getSizes() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60258);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60259);return MathArrays.copyOf(size);
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11af61af6lb90pb9u.R.inc(60260);
        __CLR4_4_11af61af6lb90pb9u.R.inc(60261);final StringBuilder sb = new StringBuilder();
        __CLR4_4_11af61af6lb90pb9u.R.inc(60262);for (int i = 0; (((i < dimension)&&(__CLR4_4_11af61af6lb90pb9u.R.iget(60263)!=0|true))||(__CLR4_4_11af61af6lb90pb9u.R.iget(60264)==0&false)); i++) {{
            __CLR4_4_11af61af6lb90pb9u.R.inc(60265);sb.append("[").append(getCount(i)).append("]");
        }
        }__CLR4_4_11af61af6lb90pb9u.R.inc(60266);return sb.toString();
    }finally{__CLR4_4_11af61af6lb90pb9u.R.flushNeeded();}}
}
