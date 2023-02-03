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
import java.lang.reflect.Array;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;

/**
 * Open addressed map from int to FieldElement.
 * <p>This class provides a dedicated map from integers to FieldElements with a
 * much smaller memory overhead than standard <code>java.util.Map</code>.</p>
 * <p>This class is not synchronized. The specialized iterators returned by
 * {@link #iterator()} are fail-fast: they throw a
 * <code>ConcurrentModificationException</code> when they detect the map has been
 * modified during iteration.</p>
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 2.0
 */
public class OpenIntToFieldHashMap<T extends FieldElement<T>> implements Serializable {public static class __CLR4_4_11apl1apllb90pbaq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Status indicator for free table entries. */
    protected static final byte FREE    = 0;

    /** Status indicator for full table entries. */
    protected static final byte FULL    = 1;

    /** Status indicator for removed table entries. */
    protected static final byte REMOVED = 2;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -9179080286849120720L;

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

    /** Field to which the elements belong. */
    private final Field<T> field;

    /** Keys table. */
    private int[] keys;

    /** Values table. */
    private T[] values;

    /** States table. */
    private byte[] states;

    /** Return value for missing entries. */
    private final T missingEntries;

    /** Current size of the map. */
    private int size;

    /** Bit mask for hash values. */
    private int mask;

    /** Modifications count. */
    private transient int count;

    /**
     * Build an empty map with default size and using zero for missing entries.
     * @param field field to which the elements belong
     */
    public OpenIntToFieldHashMap(final Field<T>field) {
        this(field, DEFAULT_EXPECTED_SIZE, field.getZero());__CLR4_4_11apl1apllb90pbaq.R.inc(60538);try{__CLR4_4_11apl1apllb90pbaq.R.inc(60537);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Build an empty map with default size
     * @param field field to which the elements belong
     * @param missingEntries value to return when a missing entry is fetched
     */
    public OpenIntToFieldHashMap(final Field<T>field, final T missingEntries) {
        this(field,DEFAULT_EXPECTED_SIZE, missingEntries);__CLR4_4_11apl1apllb90pbaq.R.inc(60540);try{__CLR4_4_11apl1apllb90pbaq.R.inc(60539);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Build an empty map with specified size and using zero for missing entries.
     * @param field field to which the elements belong
     * @param expectedSize expected number of elements in the map
     */
    public OpenIntToFieldHashMap(final Field<T> field,final int expectedSize) {
        this(field,expectedSize, field.getZero());__CLR4_4_11apl1apllb90pbaq.R.inc(60542);try{__CLR4_4_11apl1apllb90pbaq.R.inc(60541);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Build an empty map with specified size.
     * @param field field to which the elements belong
     * @param expectedSize expected number of elements in the map
     * @param missingEntries value to return when a missing entry is fetched
     */
    public OpenIntToFieldHashMap(final Field<T> field,final int expectedSize,
                                  final T missingEntries) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60543);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60544);this.field = field;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60545);final int capacity = computeCapacity(expectedSize);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60546);keys   = new int[capacity];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60547);values = buildArray(capacity);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60548);states = new byte[capacity];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60549);this.missingEntries = missingEntries;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60550);mask   = capacity - 1;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Copy constructor.
     * @param source map to copy
     */
    public OpenIntToFieldHashMap(final OpenIntToFieldHashMap<T> source) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60551);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60552);field = source.field;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60553);final int length = source.keys.length;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60554);keys = new int[length];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60555);System.arraycopy(source.keys, 0, keys, 0, length);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60556);values = buildArray(length);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60557);System.arraycopy(source.values, 0, values, 0, length);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60558);states = new byte[length];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60559);System.arraycopy(source.states, 0, states, 0, length);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60560);missingEntries = source.missingEntries;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60561);size  = source.size;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60562);mask  = source.mask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60563);count = source.count;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Compute the capacity needed for a given size.
     * @param expectedSize expected size of the map
     * @return capacity to use for the specified size
     */
    private static int computeCapacity(final int expectedSize) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60564);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60565);if ((((expectedSize == 0)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60566)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60567)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60568);return 1;
        }
        }__CLR4_4_11apl1apllb90pbaq.R.inc(60569);final int capacity   = (int) FastMath.ceil(expectedSize / LOAD_FACTOR);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60570);final int powerOfTwo = Integer.highestOneBit(capacity);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60571);if ((((powerOfTwo == capacity)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60572)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60573)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60574);return capacity;
        }
        }__CLR4_4_11apl1apllb90pbaq.R.inc(60575);return nextPowerOfTwo(capacity);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Find the smallest power of two greater than the input value
     * @param i input value
     * @return smallest power of two greater than the input value
     */
    private static int nextPowerOfTwo(final int i) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60576);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60577);return Integer.highestOneBit(i) << 1;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Get the stored value associated with the given key
     * @param key key associated with the data
     * @return data associated with the key
     */
    public T get(final int key) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60578);

        __CLR4_4_11apl1apllb90pbaq.R.inc(60579);final int hash  = hashOf(key);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60580);int index = hash & mask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60581);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60582)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60583)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60584);return values[index];
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60585);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60586)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60587)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60588);return missingEntries;
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60589);int j = index;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60590);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60591)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60592)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60593);j = probe(perturb, j);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60594);index = j & mask;
            __CLR4_4_11apl1apllb90pbaq.R.inc(60595);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60596)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60597)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60598);return values[index];
            }
        }}

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60599);return missingEntries;

    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Check if a value is associated with a key.
     * @param key key to check
     * @return true if a value is associated with key
     */
    public boolean containsKey(final int key) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60600);

        __CLR4_4_11apl1apllb90pbaq.R.inc(60601);final int hash  = hashOf(key);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60602);int index = hash & mask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60603);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60604)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60605)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60606);return true;
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60607);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60608)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60609)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60610);return false;
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60611);int j = index;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60612);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60613)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60614)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60615);j = probe(perturb, j);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60616);index = j & mask;
            __CLR4_4_11apl1apllb90pbaq.R.inc(60617);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60618)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60619)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60620);return true;
            }
        }}

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60621);return false;

    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Get an iterator over map elements.
     * <p>The specialized iterators returned are fail-fast: they throw a
     * <code>ConcurrentModificationException</code> when they detect the map
     * has been modified during iteration.</p>
     * @return iterator over the map elements
     */
    public Iterator iterator() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60622);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60623);return new Iterator();
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Perturb the hash for starting probing.
     * @param hash initial hash
     * @return perturbed hash
     */
    private static int perturb(final int hash) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60624);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60625);return hash & 0x7fffffff;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Find the index at which a key should be inserted
     * @param key key to lookup
     * @return index at which key should be inserted
     */
    private int findInsertionIndex(final int key) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60626);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60627);return findInsertionIndex(keys, states, key, mask);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Find the index at which a key should be inserted
     * @param keys keys table
     * @param states states table
     * @param key key to lookup
     * @param mask bit mask for hash values
     * @return index at which key should be inserted
     */
    private static int findInsertionIndex(final int[] keys, final byte[] states,
                                          final int key, final int mask) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60628);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60629);final int hash = hashOf(key);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60630);int index = hash & mask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60631);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60632)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60633)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60634);return index;
        } }else {__CLR4_4_11apl1apllb90pbaq.R.inc(60635);if ((((states[index] == FULL && keys[index] == key)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60636)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60637)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60638);return changeIndexSign(index);
        }

        }}__CLR4_4_11apl1apllb90pbaq.R.inc(60639);int perturb = perturb(hash);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60640);int j = index;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60641);if ((((states[index] == FULL)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60642)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60643)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60644);while (true) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60645);j = probe(perturb, j);
                __CLR4_4_11apl1apllb90pbaq.R.inc(60646);index = j & mask;
                __CLR4_4_11apl1apllb90pbaq.R.inc(60647);perturb >>= PERTURB_SHIFT;

                __CLR4_4_11apl1apllb90pbaq.R.inc(60648);if ((((states[index] != FULL || keys[index] == key)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60649)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60650)==0&false))) {{
                    __CLR4_4_11apl1apllb90pbaq.R.inc(60651);break;
                }
            }}
        }}

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60652);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60653)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60654)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60655);return index;
        } }else {__CLR4_4_11apl1apllb90pbaq.R.inc(60656);if ((((states[index] == FULL)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60657)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60658)==0&false))) {{
            // due to the loop exit condition,
            // if (states[index] == FULL) then keys[index] == key
            __CLR4_4_11apl1apllb90pbaq.R.inc(60659);return changeIndexSign(index);
        }

        }}__CLR4_4_11apl1apllb90pbaq.R.inc(60660);final int firstRemoved = index;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60661);while (true) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60662);j = probe(perturb, j);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60663);index = j & mask;

            __CLR4_4_11apl1apllb90pbaq.R.inc(60664);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60665)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60666)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60667);return firstRemoved;
            } }else {__CLR4_4_11apl1apllb90pbaq.R.inc(60668);if ((((states[index] == FULL && keys[index] == key)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60669)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60670)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60671);return changeIndexSign(index);
            }

            }}__CLR4_4_11apl1apllb90pbaq.R.inc(60672);perturb >>= PERTURB_SHIFT;

        }

    }}finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Compute next probe for collision resolution
     * @param perturb perturbed hash
     * @param j previous probe
     * @return next probe
     */
    private static int probe(final int perturb, final int j) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60673);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60674);return (j << 2) + j + perturb + 1;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Change the index sign
     * @param index initial index
     * @return changed index
     */
    private static int changeIndexSign(final int index) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60675);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60676);return -index - 1;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Get the number of elements stored in the map.
     * @return number of elements stored in the map
     */
    public int size() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60677);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60678);return size;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}


    /**
     * Remove the value associated with a key.
     * @param key key to which the value is associated
     * @return removed value
     */
    public T remove(final int key) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60679);

        __CLR4_4_11apl1apllb90pbaq.R.inc(60680);final int hash  = hashOf(key);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60681);int index = hash & mask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60682);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60683)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60684)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60685);return doRemove(index);
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60686);if ((((states[index] == FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60687)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60688)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60689);return missingEntries;
        }

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60690);int j = index;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60691);for (int perturb = perturb(hash); (((states[index] != FREE)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60692)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60693)==0&false)); perturb >>= PERTURB_SHIFT) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60694);j = probe(perturb, j);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60695);index = j & mask;
            __CLR4_4_11apl1apllb90pbaq.R.inc(60696);if ((((containsKey(key, index))&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60697)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60698)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60699);return doRemove(index);
            }
        }}

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60700);return missingEntries;

    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Check if the tables contain an element associated with specified key
     * at specified index.
     * @param key key to check
     * @param index index to check
     * @return true if an element is associated with key at index
     */
    private boolean containsKey(final int key, final int index) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60701);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60702);return (key != 0 || states[index] == FULL) && keys[index] == key;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Remove an element at specified index.
     * @param index index of the element to remove
     * @return removed value
     */
    private T doRemove(int index) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60703);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60704);keys[index]   = 0;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60705);states[index] = REMOVED;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60706);final T previous = values[index];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60707);values[index] = missingEntries;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60708);--size;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60709);++count;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60710);return previous;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Put a value associated with a key in the map.
     * @param key key to which value is associated
     * @param value value to put in the map
     * @return previous value associated with the key
     */
    public T put(final int key, final T value) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60711);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60712);int index = findInsertionIndex(key);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60713);T previous = missingEntries;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60714);boolean newMapping = true;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60715);if ((((index < 0)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60716)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60717)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60718);index = changeIndexSign(index);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60719);previous = values[index];
            __CLR4_4_11apl1apllb90pbaq.R.inc(60720);newMapping = false;
        }
        }__CLR4_4_11apl1apllb90pbaq.R.inc(60721);keys[index]   = key;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60722);states[index] = FULL;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60723);values[index] = value;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60724);if ((((newMapping)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60725)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60726)==0&false))) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60727);++size;
            __CLR4_4_11apl1apllb90pbaq.R.inc(60728);if ((((shouldGrowTable())&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60729)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60730)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60731);growTable();
            }
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60732);++count;
        }
        }__CLR4_4_11apl1apllb90pbaq.R.inc(60733);return previous;

    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Grow the tables.
     */
    private void growTable() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60734);

        __CLR4_4_11apl1apllb90pbaq.R.inc(60735);final int oldLength      = states.length;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60736);final int[] oldKeys      = keys;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60737);final T[] oldValues = values;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60738);final byte[] oldStates   = states;

        __CLR4_4_11apl1apllb90pbaq.R.inc(60739);final int newLength = RESIZE_MULTIPLIER * oldLength;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60740);final int[] newKeys = new int[newLength];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60741);final T[] newValues = buildArray(newLength);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60742);final byte[] newStates = new byte[newLength];
        __CLR4_4_11apl1apllb90pbaq.R.inc(60743);final int newMask = newLength - 1;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60744);for (int i = 0; (((i < oldLength)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60745)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60746)==0&false)); ++i) {{
            __CLR4_4_11apl1apllb90pbaq.R.inc(60747);if ((((oldStates[i] == FULL)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60748)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60749)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60750);final int key = oldKeys[i];
                __CLR4_4_11apl1apllb90pbaq.R.inc(60751);final int index = findInsertionIndex(newKeys, newStates, key, newMask);
                __CLR4_4_11apl1apllb90pbaq.R.inc(60752);newKeys[index]   = key;
                __CLR4_4_11apl1apllb90pbaq.R.inc(60753);newValues[index] = oldValues[i];
                __CLR4_4_11apl1apllb90pbaq.R.inc(60754);newStates[index] = FULL;
            }
        }}

        }__CLR4_4_11apl1apllb90pbaq.R.inc(60755);mask   = newMask;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60756);keys   = newKeys;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60757);values = newValues;
        __CLR4_4_11apl1apllb90pbaq.R.inc(60758);states = newStates;

    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Check if tables should grow due to increased size.
     * @return true if  tables should grow
     */
    private boolean shouldGrowTable() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60759);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60760);return size > (mask + 1) * LOAD_FACTOR;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /**
     * Compute the hash value of a key
     * @param key key to hash
     * @return hash value of the key
     */
    private static int hashOf(final int key) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60761);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60762);final int h = key ^ ((key >>> 20) ^ (key >>> 12));
        __CLR4_4_11apl1apllb90pbaq.R.inc(60763);return h ^ (h >>> 7) ^ (h >>> 4);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}


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
        private Iterator() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60764);

            // preserve the modification count of the map to detect concurrent modifications later
            __CLR4_4_11apl1apllb90pbaq.R.inc(60765);referenceCount = count;

            // initialize current index
            __CLR4_4_11apl1apllb90pbaq.R.inc(60766);next = -1;
            __CLR4_4_11apl1apllb90pbaq.R.inc(60767);try {
                __CLR4_4_11apl1apllb90pbaq.R.inc(60768);advance();
            } catch (NoSuchElementException nsee) { // NOPMD
                // ignored
            }

        }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

        /**
         * Check if there is a next element in the map.
         * @return true if there is a next element
         */
        public boolean hasNext() {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60769);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60770);return next >= 0;
        }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

        /**
         * Get the key of current entry.
         * @return key of current entry
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public int key()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60771);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60772);if ((((referenceCount != count)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60773)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60774)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60775);throw new ConcurrentModificationException();
            }
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60776);if ((((current < 0)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60777)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60778)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60779);throw new NoSuchElementException();
            }
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60780);return keys[current];
        }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

        /**
         * Get the value of current entry.
         * @return value of current entry
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public T value()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60781);
            __CLR4_4_11apl1apllb90pbaq.R.inc(60782);if ((((referenceCount != count)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60783)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60784)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60785);throw new ConcurrentModificationException();
            }
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60786);if ((((current < 0)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60787)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60788)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60789);throw new NoSuchElementException();
            }
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60790);return values[current];
        }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

        /**
         * Advance iterator one step further.
         * @exception ConcurrentModificationException if the map is modified during iteration
         * @exception NoSuchElementException if there is no element left in the map
         */
        public void advance()
            throws ConcurrentModificationException, NoSuchElementException {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60791);

            __CLR4_4_11apl1apllb90pbaq.R.inc(60792);if ((((referenceCount != count)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60793)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60794)==0&false))) {{
                __CLR4_4_11apl1apllb90pbaq.R.inc(60795);throw new ConcurrentModificationException();
            }

            // advance on step
            }__CLR4_4_11apl1apllb90pbaq.R.inc(60796);current = next;

            // prepare next step
            __CLR4_4_11apl1apllb90pbaq.R.inc(60797);try {
                __CLR4_4_11apl1apllb90pbaq.R.inc(60798);while ((((states[++next] != FULL)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60799)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60800)==0&false))) {{ // NOPMD
                    // nothing to do
                }
            }} catch (ArrayIndexOutOfBoundsException e) {
                __CLR4_4_11apl1apllb90pbaq.R.inc(60801);next = -2;
                __CLR4_4_11apl1apllb90pbaq.R.inc(60802);if ((((current < 0)&&(__CLR4_4_11apl1apllb90pbaq.R.iget(60803)!=0|true))||(__CLR4_4_11apl1apllb90pbaq.R.iget(60804)==0&false))) {{
                    __CLR4_4_11apl1apllb90pbaq.R.inc(60805);throw new NoSuchElementException();
                }
            }}

        }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    }

    /**
     * Read a serialized object.
     * @param stream input stream
     * @throws IOException if object cannot be read
     * @throws ClassNotFoundException if the class corresponding
     * to the serialized object cannot be found
     */
    private void readObject(final ObjectInputStream stream)
        throws IOException, ClassNotFoundException {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60806);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60807);stream.defaultReadObject();
        __CLR4_4_11apl1apllb90pbaq.R.inc(60808);count = 0;
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

    /** Build an array of elements.
     * @param length size of the array to build
     * @return a new array
     */
    @SuppressWarnings("unchecked") // field is of type T
    private T[] buildArray(final int length) {try{__CLR4_4_11apl1apllb90pbaq.R.inc(60809);
        __CLR4_4_11apl1apllb90pbaq.R.inc(60810);return (T[]) Array.newInstance(field.getRuntimeClass(), length);
    }finally{__CLR4_4_11apl1apllb90pbaq.R.flushNeeded();}}

}
