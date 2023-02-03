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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * Open addressed map from int to double.
 * <p>This class provides a dedicated map from integers to doubles with a
 * much smaller memory overhead than standard <code>java.util.Map</code>.</p>
 * <p>This class is not synchronized. The specialized iterators returned by
 * {@link #iterator()} are fail-fast: they throw a
 * <code>ConcurrentModificationException</code> when they detect the map has been
 * modified during iteration.</p>
 * @version $Id$
 * @since 2.0
 */
public class OpenIntToDoubleHashMap implements Serializable {public static class __CLR4_4_11ai31ai3lb90pbab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Status indicator for free table entries. */
    protected static final byte FREE    = 0;

    /** Status indicator for full table entries. */
    protected static final byte FULL    = 1;

    /** Status indicator for removed table entries. */
    protected static final byte REMOVED = 2;

    /** Serializable version identifier */
    private static final long serialVersionUID = -3646337053166149105L;

    /** Load factor for the map. */
    private static final float LOAD_FACTOR = 0.5f;

    /** Default starting size.
     * <p>This must be a power of two for bit mask to work properly. </p>
     */
    private static final int DEFAULT_EXPECTED_SIZE = 16;

    /** Multiplier for size growth when map fills up.
     * <p>This must be a power of two for bit mask to work properly. </p>
     */
    private static final int RESIZE_MULTIPLIER = 2;

    /** Number of bits to perturb the index when probing for collision resolution. */
    private static final int PERTURB_SHIFT = 5;

    /** Keys table. */
    private int[] keys;

    /** Values table. */
    private double[] values;

    /** States table. */
    private byte[] states;

    /** Return value for missing entries. */
    private final double missingEntries;

    /** Current size of the map. */
    private int size;

    /** Bit mask for hash values. */
    private int mask;

    /** Modifications count. */
    private transient int count;

    /**
     * Build an empty map with default size and using NaN for missing entries.
     */
    public OpenIntToDoubleHashMap() {
        this(DEFAULT_EXPECTED_SIZE, Double.NaN);__CLR4_4_11ai31ai3lb90pbab.R.inc(60268);try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60267);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Build an empty map with default size
     * @param missingEntries value to return when a missing entry is fetched
     */
    public OpenIntToDoubleHashMap(final double missingEntries) {
        this(DEFAULT_EXPECTED_SIZE, missingEntries);__CLR4_4_11ai31ai3lb90pbab.R.inc(60270);try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60269);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Build an empty map with specified size and using NaN for missing entries.
     * @param expectedSize expected number of elements in the map
     */
    public OpenIntToDoubleHashMap(final int expectedSize) {
        this(expectedSize, Double.NaN);__CLR4_4_11ai31ai3lb90pbab.R.inc(60272);try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60271);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Build an empty map with specified size.
     * @param expectedSize expected number of elements in the map
     * @param missingEntries value to return when a missing entry is fetched
     */
    public OpenIntToDoubleHashMap(final int expectedSize,
                                  final double missingEntries) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60273);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60274);final int capacity = computeCapacity(expectedSize);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60275);keys   = new int[capacity];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60276);values = new double[capacity];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60277);states = new byte[capacity];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60278);this.missingEntries = missingEntries;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60279);mask   = capacity - 1;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Copy constructor.
     * @param source map to copy
     */
    public OpenIntToDoubleHashMap(final OpenIntToDoubleHashMap source) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60280);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60281);final int length = source.keys.length;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60282);keys = new int[length];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60283);System.arraycopy(source.keys, 0, keys, 0, length);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60284);values = new double[length];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60285);System.arraycopy(source.values, 0, values, 0, length);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60286);states = new byte[length];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60287);System.arraycopy(source.states, 0, states, 0, length);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60288);missingEntries = source.missingEntries;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60289);size  = source.size;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60290);mask  = source.mask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60291);count = source.count;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Compute the capacity needed for a given size.
     * @param expectedSize expected size of the map
     * @return capacity to use for the specified size
     */
    private static int computeCapacity(final int expectedSize) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60292);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60293);if ((((expectedSize == 0)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60294)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60295)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60296);return 1;
        }
        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60297);final int capacity   = (int) FastMath.ceil(expectedSize / LOAD_FACTOR);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60298);final int powerOfTwo = Integer.highestOneBit(capacity);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60299);if ((((powerOfTwo == capacity)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60300)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60301)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60302);return capacity;
        }
        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60303);return nextPowerOfTwo(capacity);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Find the smallest power of two greater than the input value
     * @param i input value
     * @return smallest power of two greater than the input value
     */
    private static int nextPowerOfTwo(final int i) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60304);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60305);return Integer.highestOneBit(i) << 1;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Get the stored value associated with the given key
     * @param key key associated with the data
     * @return data associated with the key
     */
    public double get(final int key) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60306);

        __CLR4_4_11ai31ai3lb90pbab.R.inc(60307);final int hash  = hashOf(key);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60308);int index = hash & mask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60309);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60310)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60311)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60312);return values[index];
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60313);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60314)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60315)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60316);return missingEntries;
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60317);int j = index;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60318);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60319)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60320)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60321);j = probe(perturb, j);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60322);index = j & mask;
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60323);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60324)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60325)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60326);return values[index];
            }
        }}

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60327);return missingEntries;

    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Check if a value is associated with a key.
     * @param key key to check
     * @return true if a value is associated with key
     */
    public boolean containsKey(final int key) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60328);

        __CLR4_4_11ai31ai3lb90pbab.R.inc(60329);final int hash  = hashOf(key);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60330);int index = hash & mask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60331);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60332)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60333)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60334);return true;
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60335);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60336)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60337)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60338);return false;
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60339);int j = index;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60340);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60341)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60342)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60343);j = probe(perturb, j);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60344);index = j & mask;
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60345);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60346)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60347)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60348);return true;
            }
        }}

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60349);return false;

    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Get an iterator over map elements.
     * <p>The specialized iterators returned are fail-fast: they throw a
     * <code>ConcurrentModificationException</code> when they detect the map
     * has been modified during iteration.</p>
     * @return iterator over the map elements
     */
    public Iterator iterator() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60350);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60351);return new Iterator();
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Perturb the hash for starting probing.
     * @param hash initial hash
     * @return perturbed hash
     */
    private static int perturb(final int hash) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60352);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60353);return hash & 0x7fffffff;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Find the index at which a key should be inserted
     * @param key key to lookup
     * @return index at which key should be inserted
     */
    private int findInsertionIndex(final int key) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60354);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60355);return findInsertionIndex(keys, states, key, mask);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Find the index at which a key should be inserted
     * @param keys keys table
     * @param states states table
     * @param key key to lookup
     * @param mask bit mask for hash values
     * @return index at which key should be inserted
     */
    private static int findInsertionIndex(final int[] keys, final byte[] states,
                                          final int key, final int mask) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60356);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60357);final int hash = hashOf(key);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60358);int index = hash & mask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60359);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60360)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60361)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60362);return index;
        } }else {__CLR4_4_11ai31ai3lb90pbab.R.inc(60363);if ((((states[index] == FULL && keys[index] == key)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60364)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60365)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60366);return changeIndexSign(index);
        }

        }}__CLR4_4_11ai31ai3lb90pbab.R.inc(60367);int perturb = perturb(hash);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60368);int j = index;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60369);if ((((states[index] == FULL)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60370)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60371)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60372);while (true) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60373);j = probe(perturb, j);
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60374);index = j & mask;
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60375);perturb >>= PERTURB_SHIFT;

                __CLR4_4_11ai31ai3lb90pbab.R.inc(60376);if ((((states[index] != FULL || keys[index] == key)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60377)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60378)==0&false))) {{
                    __CLR4_4_11ai31ai3lb90pbab.R.inc(60379);break;
                }
            }}
        }}

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60380);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60381)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60382)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60383);return index;
        } }else {__CLR4_4_11ai31ai3lb90pbab.R.inc(60384);if ((((states[index] == FULL)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60385)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60386)==0&false))) {{
            // due to the loop exit condition,
            // if (states[index] == FULL) then keys[index] == key
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60387);return changeIndexSign(index);
        }

        }}__CLR4_4_11ai31ai3lb90pbab.R.inc(60388);final int firstRemoved = index;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60389);while (true) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60390);j = probe(perturb, j);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60391);index = j & mask;

            __CLR4_4_11ai31ai3lb90pbab.R.inc(60392);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60393)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60394)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60395);return firstRemoved;
            } }else {__CLR4_4_11ai31ai3lb90pbab.R.inc(60396);if ((((states[index] == FULL && keys[index] == key)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60397)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60398)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60399);return changeIndexSign(index);
            }

            }}__CLR4_4_11ai31ai3lb90pbab.R.inc(60400);perturb >>= PERTURB_SHIFT;

        }

    }}finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Compute next probe for collision resolution
     * @param perturb perturbed hash
     * @param j previous probe
     * @return next probe
     */
    private static int probe(final int perturb, final int j) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60401);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60402);return (j << 2) + j + perturb + 1;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Change the index sign
     * @param index initial index
     * @return changed index
     */
    private static int changeIndexSign(final int index) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60403);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60404);return -index - 1;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Get the number of elements stored in the map.
     * @return number of elements stored in the map
     */
    public int size() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60405);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60406);return size;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}


    /**
     * Remove the value associated with a key.
     * @param key key to which the value is associated
     * @return removed value
     */
    public double remove(final int key) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60407);

        __CLR4_4_11ai31ai3lb90pbab.R.inc(60408);final int hash  = hashOf(key);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60409);int index = hash & mask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60410);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60411)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60412)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60413);return doRemove(index);
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60414);if ((((states[index] == FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60415)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60416)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60417);return missingEntries;
        }

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60418);int j = index;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60419);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60420)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60421)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60422);j = probe(perturb, j);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60423);index = j & mask;
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60424);if ((((containsKey(key, index))&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60425)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60426)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60427);return doRemove(index);
            }
        }}

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60428);return missingEntries;

    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Check if the tables contain an element associated with specified key
     * at specified index.
     * @param key key to check
     * @param index index to check
     * @return true if an element is associated with key at index
     */
    private boolean containsKey(final int key, final int index) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60429);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60430);return (key != 0 || states[index] == FULL) && keys[index] == key;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Remove an element at specified index.
     * @param index index of the element to remove
     * @return removed value
     */
    private double doRemove(int index) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60431);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60432);keys[index]   = 0;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60433);states[index] = REMOVED;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60434);final double previous = values[index];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60435);values[index] = missingEntries;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60436);--size;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60437);++count;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60438);return previous;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Put a value associated with a key in the map.
     * @param key key to which value is associated
     * @param value value to put in the map
     * @return previous value associated with the key
     */
    public double put(final int key, final double value) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60439);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60440);int index = findInsertionIndex(key);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60441);double previous = missingEntries;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60442);boolean newMapping = true;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60443);if ((((index < 0)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60444)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60445)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60446);index = changeIndexSign(index);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60447);previous = values[index];
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60448);newMapping = false;
        }
        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60449);keys[index]   = key;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60450);states[index] = FULL;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60451);values[index] = value;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60452);if ((((newMapping)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60453)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60454)==0&false))) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60455);++size;
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60456);if ((((shouldGrowTable())&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60457)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60458)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60459);growTable();
            }
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60460);++count;
        }
        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60461);return previous;

    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Grow the tables.
     */
    private void growTable() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60462);

        __CLR4_4_11ai31ai3lb90pbab.R.inc(60463);final int oldLength      = states.length;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60464);final int[] oldKeys      = keys;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60465);final double[] oldValues = values;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60466);final byte[] oldStates   = states;

        __CLR4_4_11ai31ai3lb90pbab.R.inc(60467);final int newLength = RESIZE_MULTIPLIER * oldLength;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60468);final int[] newKeys = new int[newLength];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60469);final double[] newValues = new double[newLength];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60470);final byte[] newStates = new byte[newLength];
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60471);final int newMask = newLength - 1;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60472);for (int i = 0; (((i < oldLength)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60473)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60474)==0&false)); ++i) {{
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60475);if ((((oldStates[i] == FULL)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60476)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60477)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60478);final int key = oldKeys[i];
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60479);final int index = findInsertionIndex(newKeys, newStates, key, newMask);
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60480);newKeys[index]   = key;
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60481);newValues[index] = oldValues[i];
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60482);newStates[index] = FULL;
            }
        }}

        }__CLR4_4_11ai31ai3lb90pbab.R.inc(60483);mask   = newMask;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60484);keys   = newKeys;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60485);values = newValues;
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60486);states = newStates;

    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Check if tables should grow due to increased size.
     * @return true if  tables should grow
     */
    private boolean shouldGrowTable() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60487);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60488);return size > (mask + 1) * LOAD_FACTOR;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    /**
     * Compute the hash value of a key
     * @param key key to hash
     * @return hash value of the key
     */
    private static int hashOf(final int key) {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60489);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60490);final int h = key ^ ((key >>> 20) ^ (key >>> 12));
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60491);return h ^ (h >>> 7) ^ (h >>> 4);
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}


    /** Iterator class for the map. */
    public class Iterator {

        /** Reference modification count. */
        private final int referenceCount;

        /** Index of current element. */
        private int current;

        /** Index of next element. */
        private int next;

        /**
         * Simple constructor.
         */
        private Iterator() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60492);

            // preserve the modification count of the map to detect concurrent modifications later
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60493);referenceCount = count;

            // initialize current index
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60494);next = -1;
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60495);try {
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60496);advance();
            } catch (NoSuchElementException nsee) { // NOPMD
                // ignored
            }

        }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

        /**
         * Check if there is a next element in the map.
         * @return true if there is a next element
         */
        public boolean hasNext() {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60497);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60498);return next >= 0;
        }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

        /**
         * Get the key of current entry.
         * @return key of current entry
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public int key()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60499);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60500);if ((((referenceCount != count)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60501)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60502)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60503);throw new ConcurrentModificationException();
            }
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60504);if ((((current < 0)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60505)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60506)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60507);throw new NoSuchElementException();
            }
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60508);return keys[current];
        }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

        /**
         * Get the value of current entry.
         * @return value of current entry
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public double value()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60509);
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60510);if ((((referenceCount != count)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60511)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60512)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60513);throw new ConcurrentModificationException();
            }
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60514);if ((((current < 0)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60515)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60516)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60517);throw new NoSuchElementException();
            }
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60518);return values[current];
        }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

        /**
         * Advance iterator one step further.
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public void advance()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60519);

            __CLR4_4_11ai31ai3lb90pbab.R.inc(60520);if ((((referenceCount != count)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60521)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60522)==0&false))) {{
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60523);throw new ConcurrentModificationException();
            }

            // advance on step
            }__CLR4_4_11ai31ai3lb90pbab.R.inc(60524);current = next;

            // prepare next step
            __CLR4_4_11ai31ai3lb90pbab.R.inc(60525);try {
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60526);while ((((states[++next] != FULL)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60527)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60528)==0&false))) {{ // NOPMD
                    // nothing to do
                }
            }} catch (ArrayIndexOutOfBoundsException e) {
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60529);next = -2;
                __CLR4_4_11ai31ai3lb90pbab.R.inc(60530);if ((((current < 0)&&(__CLR4_4_11ai31ai3lb90pbab.R.iget(60531)!=0|true))||(__CLR4_4_11ai31ai3lb90pbab.R.iget(60532)==0&false))) {{
                    __CLR4_4_11ai31ai3lb90pbab.R.inc(60533);throw new NoSuchElementException();
                }
            }}

        }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}

    }

    /**
     * Read a serialized object.
     * @param stream input stream
     * @throws IOException if object cannot be read
     * @throws ClassNotFoundException if the class corresponding
     * to the serialized object cannot be found
     */
    private void readObject(final ObjectInputStream stream)
        throws IOException, ClassNotFoundException {try{__CLR4_4_11ai31ai3lb90pbab.R.inc(60534);
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60535);stream.defaultReadObject();
        __CLR4_4_11ai31ai3lb90pbab.R.inc(60536);count = 0;
    }finally{__CLR4_4_11ai31ai3lb90pbab.R.flushNeeded();}}


}
