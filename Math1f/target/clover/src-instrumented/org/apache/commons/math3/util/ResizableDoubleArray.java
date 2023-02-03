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

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * <p>
 * A variable length {@link DoubleArray} implementation that automatically
 * handles expanding and contracting its internal storage array as elements
 * are added and removed.
 * </p>
 * <h3>Important note: Usage should not assume that this class is thread-safe
 * even though some of the methods are {@code synchronized}.
 * This qualifier will be dropped in the next major release (4.0).</h3>
 * <p>
 * The internal storage array starts with capacity determined by the
 * {@code initialCapacity} property, which can be set by the constructor.
 * The default initial capacity is 16.  Adding elements using
 * {@link #addElement(double)} appends elements to the end of the array.
 * When there are no open entries at the end of the internal storage array,
 * the array is expanded.  The size of the expanded array depends on the
 * {@code expansionMode} and {@code expansionFactor} properties.
 * The {@code expansionMode} determines whether the size of the array is
 * multiplied by the {@code expansionFactor}
 * ({@link ExpansionMode#MULTIPLICATIVE}) or if the expansion is additive
 * ({@link ExpansionMode#ADDITIVE} -- {@code expansionFactor} storage
 * locations added).
 * The default {@code expansionMode} is {@code MULTIPLICATIVE} and the default
 * {@code expansionFactor} is 2.
 * </p>
 * <p>
 * The {@link #addElementRolling(double)} method adds a new element to the end
 * of the internal storage array and adjusts the "usable window" of the
 * internal array forward by one position (effectively making what was the
 * second element the first, and so on).  Repeated activations of this method
 * (or activation of {@link #discardFrontElements(int)}) will effectively orphan
 * the storage locations at the beginning of the internal storage array.  To
 * reclaim this storage, each time one of these methods is activated, the size
 * of the internal storage array is compared to the number of addressable
 * elements (the {@code numElements} property) and if the difference
 * is too large, the internal array is contracted to size
 * {@code numElements + 1}.  The determination of when the internal
 * storage array is "too large" depends on the {@code expansionMode} and
 * {@code contractionFactor} properties.  If  the {@code expansionMode}
 * is {@code MULTIPLICATIVE}, contraction is triggered when the
 * ratio between storage array length and {@code numElements} exceeds
 * {@code contractionFactor.}  If the {@code expansionMode}
 * is {@code ADDITIVE}, the number of excess storage locations
 * is compared to {@code contractionFactor}.
 * </p>
 * <p>
 * To avoid cycles of expansions and contractions, the
 * {@code expansionFactor} must not exceed the {@code contractionFactor}.
 * Constructors and mutators for both of these properties enforce this
 * requirement, throwing a {@code MathIllegalArgumentException} if it is
 * violated.
 * </p>
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ResizableDoubleArray implements DoubleArray, Serializable {public static class __CLR4_4_11b2p1b2plb90pbbx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,61302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Additive expansion mode.
     * @deprecated As of 3.1. Please use {@link ExpansionMode#ADDITIVE} instead.
     */
    @Deprecated
    public static final int ADDITIVE_MODE = 1;
    /** Multiplicative expansion mode.
     * @deprecated As of 3.1. Please use {@link ExpansionMode#MULTIPLICATIVE} instead.
     */
    @Deprecated
    public static final int MULTIPLICATIVE_MODE = 0;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -3485529955529426875L;

    /** Default value for initial capacity. */
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    /** Default value for array size modifier. */
    private static final double DEFAULT_EXPANSION_FACTOR = 2.0;
    /**
     * Default value for the difference between {@link #contractionCriterion}
     * and {@link #expansionFactor}.
     */
    private static final double DEFAULT_CONTRACTION_DELTA = 0.5;

    /**
     * The contraction criteria determines when the internal array will be
     * contracted to fit the number of elements contained in the element
     *  array + 1.
     */
    private double contractionCriterion = 2.5;

    /**
     * The expansion factor of the array.  When the array needs to be expanded,
     * the new array size will be
     * {@code internalArray.length * expansionFactor}
     * if {@code expansionMode} is set to MULTIPLICATIVE_MODE, or
     * {@code internalArray.length + expansionFactor} if
     * {@code expansionMode} is set to ADDITIVE_MODE.
     */
    private double expansionFactor = 2.0;

    /**
     * Determines whether array expansion by {@code expansionFactor}
     * is additive or multiplicative.
     */
    private ExpansionMode expansionMode = ExpansionMode.MULTIPLICATIVE;

    /**
     * The internal storage array.
     */
    private double[] internalArray;

    /**
     * The number of addressable elements in the array.  Note that this
     * has nothing to do with the length of the internal storage array.
     */
    private int numElements = 0;

    /**
     * The position of the first addressable element in the internal storage
     * array.  The addressable elements in the array are
     * {@code internalArray[startIndex],...,internalArray[startIndex + numElements - 1]}.
     */
    private int startIndex = 0;

    /**
     * Specification of expansion algorithm.
     * @since 3.1
     */
    public static enum ExpansionMode {
        /** Multiplicative expansion mode. */
        MULTIPLICATIVE,
        /** Additive expansion mode. */
        ADDITIVE
    }

    /**
     * Creates an instance with default properties.
     * <ul>
     *  <li>{@code initialCapacity = 16}</li>
     *  <li>{@code expansionMode = MULTIPLICATIVE}</li>
     *  <li>{@code expansionFactor = 2.0}</li>
     *  <li>{@code contractionCriterion = 2.5}</li>
     * </ul>
     */
    public ResizableDoubleArray() {
        this(DEFAULT_INITIAL_CAPACITY);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61010);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61009);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified initial capacity.
     * Other properties take default values:
     * <ul>
     *  <li>{@code expansionMode = MULTIPLICATIVE}</li>
     *  <li>{@code expansionFactor = 2.0}</li>
     *  <li>{@code contractionCriterion = 2.5}</li>
     * </ul>
     * @param initialCapacity Initial size of the internal storage array.
     * @throws MathIllegalArgumentException if {@code initialCapacity <= 0}.
     */
    public ResizableDoubleArray(int initialCapacity)
        throws MathIllegalArgumentException {
        this(initialCapacity, DEFAULT_EXPANSION_FACTOR);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61012);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61011);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance from an existing {@code double[]} with the
     * initial capacity and numElements corresponding to the size of
     * the supplied {@code double[]} array.
     * If the supplied array is null, a new empty array with the default
     * initial capacity will be created.
     * The input array is copied, not referenced.
     * Other properties take default values:
     * <ul>
     *  <li>{@code initialCapacity = 16}</li>
     *  <li>{@code expansionMode = MULTIPLICATIVE}</li>
     *  <li>{@code expansionFactor = 2.0}</li>
     *  <li>{@code contractionCriterion = 2.5}</li>
     * </ul>
     *
     * @param initialArray initial array
     * @since 2.2
     */
    public ResizableDoubleArray(double[] initialArray) {
        this(DEFAULT_INITIAL_CAPACITY,
             DEFAULT_EXPANSION_FACTOR,
             DEFAULT_CONTRACTION_DELTA + DEFAULT_EXPANSION_FACTOR,
             ExpansionMode.MULTIPLICATIVE,
             initialArray);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61014);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61013);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified initial capacity
     * and expansion factor.
     * The remaining properties take default values:
     * <ul>
     *  <li>{@code expansionMode = MULTIPLICATIVE}</li>
     *  <li>{@code contractionCriterion = 0.5 + expansionFactor}</li>
     * </ul>
     * <br/>
     * Throws IllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     *  <li>{@code initialCapacity > 0}</li>
     *  <li>{@code expansionFactor > 1}</li>
     * </ul>
     *
     * @param initialCapacity Initial size of the internal storage array.
     * @param expansionFactor The array will be expanded based on this
     * parameter.
     * @throws MathIllegalArgumentException if parameters are not valid.
     * @deprecated As of 3.1. Please use
     * {@link #ResizableDoubleArray(int,double)} instead.
     */
    @Deprecated
    public ResizableDoubleArray(int initialCapacity,
                                float expansionFactor)
        throws MathIllegalArgumentException {
        this(initialCapacity,
             (double) expansionFactor);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61016);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61015);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified initial capacity
     * and expansion factor.
     * The remaining properties take default values:
     * <ul>
     *  <li>{@code expansionMode = MULTIPLICATIVE}</li>
     *  <li>{@code contractionCriterion = 0.5 + expansionFactor}</li>
     * </ul>
     * <br/>
     * Throws IllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     *  <li>{@code initialCapacity > 0}</li>
     *  <li>{@code expansionFactor > 1}</li>
     * </ul>
     *
     * @param initialCapacity Initial size of the internal storage array.
     * @param expansionFactor The array will be expanded based on this
     * parameter.
     * @throws MathIllegalArgumentException if parameters are not valid.
     * @since 3.1
     */
    public ResizableDoubleArray(int initialCapacity,
                                double expansionFactor)
        throws MathIllegalArgumentException {
        this(initialCapacity,
             expansionFactor,
             DEFAULT_CONTRACTION_DELTA + expansionFactor);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61018);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61017);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified initialCapacity,
     * expansionFactor, and contractionCriterion.
     * The expansion mode will default to {@code MULTIPLICATIVE}.
     * <br/>
     * Throws IllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     *  <li>{@code initialCapacity > 0}</li>
     *  <li>{@code expansionFactor > 1}</li>
     *  <li>{@code contractionCriterion >= expansionFactor}</li>
     * </ul>
     *
     * @param initialCapacity Initial size of the internal storage array..
     * @param expansionFactor The array will be expanded based on this
     * parameter.
     * @param contractionCriteria Contraction criteria.
     * @throws MathIllegalArgumentException if parameters are not valid.
     * @deprecated As of 3.1. Please use
     * {@link #ResizableDoubleArray(int,double,double)} instead.
     */
    @Deprecated
    public ResizableDoubleArray(int initialCapacity,
                                float expansionFactor,
                                float contractionCriteria)
        throws MathIllegalArgumentException {
        this(initialCapacity,
             (double) expansionFactor,
             (double) contractionCriteria);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61020);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61019);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified initial capacity,
     * expansion factor, and contraction criteria.
     * The expansion mode will default to {@code MULTIPLICATIVE}.
     * <br/>
     * Throws IllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     *  <li>{@code initialCapacity > 0}</li>
     *  <li>{@code expansionFactor > 1}</li>
     *  <li>{@code contractionCriterion >= expansionFactor}</li>
     * </ul>
     *
     * @param initialCapacity Initial size of the internal storage array..
     * @param expansionFactor The array will be expanded based on this
     * parameter.
     * @param contractionCriterion Contraction criterion.
     * @throws MathIllegalArgumentException if the parameters are not valid.
     * @since 3.1
     */
    public ResizableDoubleArray(int initialCapacity,
                                double expansionFactor,
                                double contractionCriterion)
        throws MathIllegalArgumentException {
        this(initialCapacity,
             expansionFactor,
             contractionCriterion,
             ExpansionMode.MULTIPLICATIVE,
             null);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61022);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61021);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * <p>
     * Create a ResizableArray with the specified properties.</p>
     * <p>
     * Throws IllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     * <li><code>initialCapacity > 0</code></li>
     * <li><code>expansionFactor > 1</code></li>
     * <li><code>contractionFactor >= expansionFactor</code></li>
     * <li><code>expansionMode in {MULTIPLICATIVE_MODE, ADDITIVE_MODE}</code>
     * </li>
     * </ul></p>
     *
     * @param initialCapacity the initial size of the internal storage array
     * @param expansionFactor the array will be expanded based on this
     *                        parameter
     * @param contractionCriteria the contraction Criteria
     * @param expansionMode  the expansion mode
     * @throws MathIllegalArgumentException if parameters are not valid
     * @deprecated As of 3.1. Please use
     * {@link #ResizableDoubleArray(int,double,double,ExpansionMode,double[])}
     * instead.
     */
    @Deprecated
    public ResizableDoubleArray(int initialCapacity, float expansionFactor,
            float contractionCriteria, int expansionMode) throws MathIllegalArgumentException {
        this(initialCapacity,
             expansionFactor,
             contractionCriteria,
             (((expansionMode == ADDITIVE_MODE )&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61024)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61025)==0&false))?
             ExpansionMode.ADDITIVE :
             ExpansionMode.MULTIPLICATIVE,
             null);__CLR4_4_11b2p1b2plb90pbbx.R.inc(61026);try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61023);
        // XXX Just ot retain the expected failure in a unit test.
        // With the new "enum", that test will become obsolete.
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61027);setExpansionMode(expansionMode);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Creates an instance with the specified properties.
     * <br/>
     * Throws MathIllegalArgumentException if the following conditions are
     * not met:
     * <ul>
     *  <li>{@code initialCapacity > 0}</li>
     *  <li>{@code expansionFactor > 1}</li>
     *  <li>{@code contractionCriterion >= expansionFactor}</li>
     * </ul>
     *
     * @param initialCapacity Initial size of the internal storage array.
     * @param expansionFactor The array will be expanded based on this
     * parameter.
     * @param contractionCriterion Contraction criteria.
     * @param expansionMode Expansion mode.
     * @param data Initial contents of the array.
     * @throws MathIllegalArgumentException if the parameters are not valid.
     */
    public ResizableDoubleArray(int initialCapacity,
                                double expansionFactor,
                                double contractionCriterion,
                                ExpansionMode expansionMode,
                                double ... data)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61028);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61029);if ((((initialCapacity <= 0)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61030)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61031)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61032);throw new NotStrictlyPositiveException(LocalizedFormats.INITIAL_CAPACITY_NOT_POSITIVE,
                                                   initialCapacity);
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61033);checkContractExpand(contractionCriterion, expansionFactor);

        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61034);this.expansionFactor = expansionFactor;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61035);this.contractionCriterion = contractionCriterion;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61036);this.expansionMode = expansionMode;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61037);internalArray = new double[initialCapacity];
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61038);numElements = 0;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61039);startIndex = 0;

        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61040);if ((((data != null)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61041)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61042)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61043);addElements(data);
        }
    }}finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Copy constructor.  Creates a new ResizableDoubleArray that is a deep,
     * fresh copy of the original. Needs to acquire synchronization lock
     * on original.  Original may not be null; otherwise a {@link NullArgumentException}
     * is thrown.
     *
     * @param original array to copy
     * @exception NullArgumentException if original is null
     * @since 2.0
     */
    public ResizableDoubleArray(ResizableDoubleArray original)
        throws NullArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61044);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61045);MathUtils.checkNotNull(original);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61046);copy(original, this);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Adds an element to the end of this expandable array.
     *
     * @param value Value to be added to end of array.
     */
    public synchronized void addElement(double value) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61047);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61048);if ((((internalArray.length <= startIndex + numElements)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61049)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61050)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61051);expand();
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61052);internalArray[startIndex + numElements++] = value;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Adds several element to the end of this expandable array.
     *
     * @param values Values to be added to end of array.
     * @since 2.2
     */
    public synchronized void addElements(double[] values) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61053);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61054);final double[] tempArray = new double[numElements + values.length + 1];
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61055);System.arraycopy(internalArray, startIndex, tempArray, 0, numElements);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61056);System.arraycopy(values, 0, tempArray, numElements, values.length);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61057);internalArray = tempArray;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61058);startIndex = 0;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61059);numElements += values.length;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * <p>
     * Adds an element to the end of the array and removes the first
     * element in the array.  Returns the discarded first element.
     * The effect is similar to a push operation in a FIFO queue.
     * </p>
     * <p>
     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)
     * and addElementRolling(5) is invoked, the result is an array containing
     * the entries 2, 3, 4, 5 and the value returned is 1.
     * </p>
     *
     * @param value Value to be added to the array.
     * @return the value which has been discarded or "pushed" out of the array
     * by this rolling insert.
     */
    public synchronized double addElementRolling(double value) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61060);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61061);double discarded = internalArray[startIndex];

        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61062);if (((((startIndex + (numElements + 1)) > internalArray.length)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61063)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61064)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61065);expand();
        }
        // Increment the start index
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61066);startIndex += 1;

        // Add the new value
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61067);internalArray[startIndex + (numElements - 1)] = value;

        // Check the contraction criterion.
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61068);if ((((shouldContract())&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61069)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61070)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61071);contract();
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61072);return discarded;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Substitutes <code>value</code> for the most recently added value.
     * Returns the value that has been replaced. If the array is empty (i.e.
     * if {@link #numElements} is zero), an IllegalStateException is thrown.
     *
     * @param value New value to substitute for the most recently added value
     * @return the value that has been replaced in the array.
     * @throws MathIllegalStateException if the array is empty
     * @since 2.0
     */
    public synchronized double substituteMostRecentElement(double value)
        throws MathIllegalStateException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61073);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61074);if ((((numElements < 1)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61075)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61076)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61077);throw new MathIllegalStateException(
                    LocalizedFormats.CANNOT_SUBSTITUTE_ELEMENT_FROM_EMPTY_ARRAY);
        }

        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61078);final int substIndex = startIndex + (numElements - 1);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61079);final double discarded = internalArray[substIndex];

        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61080);internalArray[substIndex] = value;

        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61081);return discarded;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Checks the expansion factor and the contraction criterion and throws an
     * IllegalArgumentException if the contractionCriteria is less than the
     * expansionCriteria
     *
     * @param expansion factor to be checked
     * @param contraction criteria to be checked
     * @throws MathIllegalArgumentException if the contractionCriteria is less than
     * the expansionCriteria.
     * @deprecated As of 3.1. Please use
     * {@link #checkContractExpand(double,double)} instead.
     */
    @Deprecated
    protected void checkContractExpand(float contraction, float expansion)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61082);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61083);checkContractExpand((double) contraction,
                            (double) expansion);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Checks the expansion factor and the contraction criterion and raises
     * an exception if the contraction criterion is smaller than the
     * expansion criterion.
     *
     * @param contraction Criterion to be checked.
     * @param expansion Factor to be checked.
     * @throws NumberIsTooSmallException if {@code contraction < expansion}.
     * @throws NumberIsTooSmallException if {@code contraction <= 1}.
     * @throws NumberIsTooSmallException if {@code expansion <= 1 }.
     * @since 3.1
     */
    protected void checkContractExpand(double contraction,
                                       double expansion)
        throws NumberIsTooSmallException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61084);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61085);if ((((contraction < expansion)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61086)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61087)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61088);final NumberIsTooSmallException e = new NumberIsTooSmallException(contraction, 1, true);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61089);e.getContext().addMessage(LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR,
                                      contraction, expansion);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61090);throw e;
        }

        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61091);if ((((contraction <= 1)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61092)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61093)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61094);final NumberIsTooSmallException e = new NumberIsTooSmallException(contraction, 1, false);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61095);e.getContext().addMessage(LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_ONE,
                                      contraction);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61096);throw e;
        }

        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61097);if ((((expansion <= 1)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61098)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61099)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61100);final NumberIsTooSmallException e = new NumberIsTooSmallException(contraction, 1, false);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61101);e.getContext().addMessage(LocalizedFormats.EXPANSION_FACTOR_SMALLER_THAN_ONE,
                                      expansion);
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61102);throw e;
        }
    }}finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Clear the array contents, resetting the number of elements to zero.
     */
    public synchronized void clear() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61103);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61104);numElements = 0;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61105);startIndex = 0;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Contracts the storage array to the (size of the element set) + 1 - to
     * avoid a zero length array. This function also resets the startIndex to
     * zero.
     */
    public synchronized void contract() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61106);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61107);final double[] tempArray = new double[numElements + 1];

        // Copy and swap - copy only the element array from the src array.
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61108);System.arraycopy(internalArray, startIndex, tempArray, 0, numElements);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61109);internalArray = tempArray;

        // Reset the start index to zero
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61110);startIndex = 0;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Discards the <code>i</code> initial elements of the array.  For example,
     * if the array contains the elements 1,2,3,4, invoking
     * <code>discardFrontElements(2)</code> will cause the first two elements
     * to be discarded, leaving 3,4 in the array.  Throws illegalArgumentException
     * if i exceeds numElements.
     *
     * @param i  the number of elements to discard from the front of the array
     * @throws MathIllegalArgumentException if i is greater than numElements.
     * @since 2.0
     */
    public synchronized void discardFrontElements(int i)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61111);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61112);discardExtremeElements(i,true);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Discards the <code>i</code> last elements of the array.  For example,
     * if the array contains the elements 1,2,3,4, invoking
     * <code>discardMostRecentElements(2)</code> will cause the last two elements
     * to be discarded, leaving 1,2 in the array.  Throws illegalArgumentException
     * if i exceeds numElements.
     *
     * @param i  the number of elements to discard from the end of the array
     * @throws MathIllegalArgumentException if i is greater than numElements.
     * @since 2.0
     */
    public synchronized void discardMostRecentElements(int i)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61113);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61114);discardExtremeElements(i,false);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Discards the <code>i</code> first or last elements of the array,
     * depending on the value of <code>front</code>.
     * For example, if the array contains the elements 1,2,3,4, invoking
     * <code>discardExtremeElements(2,false)</code> will cause the last two elements
     * to be discarded, leaving 1,2 in the array.
     * For example, if the array contains the elements 1,2,3,4, invoking
     * <code>discardExtremeElements(2,true)</code> will cause the first two elements
     * to be discarded, leaving 3,4 in the array.
     * Throws illegalArgumentException
     * if i exceeds numElements.
     *
     * @param i  the number of elements to discard from the front/end of the array
     * @param front true if elements are to be discarded from the front
     * of the array, false if elements are to be discarded from the end
     * of the array
     * @throws MathIllegalArgumentException if i is greater than numElements.
     * @since 2.0
     */
    private synchronized void discardExtremeElements(int i,
                                                     boolean front)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61115);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61116);if ((((i > numElements)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61117)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61118)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61119);throw new MathIllegalArgumentException(
                    LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY,
                    i, numElements);
       } }else {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61120);if ((((i < 0)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61121)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61122)==0&false))) {{
           __CLR4_4_11b2p1b2plb90pbbx.R.inc(61123);throw new MathIllegalArgumentException(
                   LocalizedFormats.CANNOT_DISCARD_NEGATIVE_NUMBER_OF_ELEMENTS,
                   i);
        } }else {{
            // "Subtract" this number of discarded from numElements
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61124);numElements -= i;
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61125);if ((((front)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61126)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61127)==0&false))) {{
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61128);startIndex += i;
            }
        }}
        }}__CLR4_4_11b2p1b2plb90pbbx.R.inc(61129);if ((((shouldContract())&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61130)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61131)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61132);contract();
        }
    }}finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Expands the internal storage array using the expansion factor.
     * <p>
     * if <code>expansionMode</code> is set to MULTIPLICATIVE_MODE,
     * the new array size will be <code>internalArray.length * expansionFactor.</code>
     * If <code>expansionMode</code> is set to ADDITIVE_MODE,  the length
     * after expansion will be <code>internalArray.length + expansionFactor</code>
     * </p>
     */
    protected synchronized void expand() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61133);
        // notice the use of FastMath.ceil(), this guarantees that we will always
        // have an array of at least currentSize + 1.   Assume that the
        // current initial capacity is 1 and the expansion factor
        // is 1.000000000000000001.  The newly calculated size will be
        // rounded up to 2 after the multiplication is performed.
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61134);int newSize = 0;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61135);if ((((expansionMode == ExpansionMode.MULTIPLICATIVE)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61136)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61137)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61138);newSize = (int) FastMath.ceil(internalArray.length * expansionFactor);
        } }else {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61139);newSize = (int) (internalArray.length + FastMath.round(expansionFactor));
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61140);final double[] tempArray = new double[newSize];

        // Copy and swap
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61141);System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61142);internalArray = tempArray;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Expands the internal storage array to the specified size.
     *
     * @param size Size of the new internal storage array.
     */
    private synchronized void expandTo(int size) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61143);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61144);final double[] tempArray = new double[size];
        // Copy and swap
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61145);System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61146);internalArray = tempArray;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * The contraction criteria defines when the internal array will contract
     * to store only the number of elements in the element array.
     * If  the <code>expansionMode</code> is <code>MULTIPLICATIVE_MODE</code>,
     * contraction is triggered when the ratio between storage array length
     * and <code>numElements</code> exceeds <code>contractionFactor</code>.
     * If the <code>expansionMode</code> is <code>ADDITIVE_MODE</code>, the
     * number of excess storage locations is compared to
     * <code>contractionFactor.</code>
     *
     * @return the contraction criteria used to reclaim memory.
     * @deprecated As of 3.1. Please use {@link #getContractionCriterion()}
     * instead.
     */
    @Deprecated
    public float getContractionCriteria() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61147);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61148);return (float) getContractionCriterion();
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * The contraction criterion defines when the internal array will contract
     * to store only the number of elements in the element array.
     * If  the <code>expansionMode</code> is <code>MULTIPLICATIVE_MODE</code>,
     * contraction is triggered when the ratio between storage array length
     * and <code>numElements</code> exceeds <code>contractionFactor</code>.
     * If the <code>expansionMode</code> is <code>ADDITIVE_MODE</code>, the
     * number of excess storage locations is compared to
     * <code>contractionFactor.</code>
     *
     * @return the contraction criterion used to reclaim memory.
     * @since 3.1
     */
    public double getContractionCriterion() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61149);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61150);return contractionCriterion;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns the element at the specified index
     *
     * @param index index to fetch a value from
     * @return value stored at the specified index
     * @throws ArrayIndexOutOfBoundsException if <code>index</code> is less than
     * zero or is greater than <code>getNumElements() - 1</code>.
     */
    public synchronized double getElement(int index) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61151);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61152);if ((((index >= numElements)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61153)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61154)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61155);throw new ArrayIndexOutOfBoundsException(index);
        } }else {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61156);if ((((index >= 0)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61157)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61158)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61159);return internalArray[startIndex + index];
        } }else {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61160);throw new ArrayIndexOutOfBoundsException(index);
        }
    }}}finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

     /**
     * Returns a double array containing the elements of this
     * <code>ResizableArray</code>.  This method returns a copy, not a
     * reference to the underlying array, so that changes made to the returned
     *  array have no effect on this <code>ResizableArray.</code>
     * @return the double array.
     */
    public synchronized double[] getElements() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61161);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61162);final double[] elementArray = new double[numElements];
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61163);System.arraycopy(internalArray, startIndex, elementArray, 0, numElements);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61164);return elementArray;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * The expansion factor controls the size of a new array when an array
     * needs to be expanded.  The <code>expansionMode</code>
     * determines whether the size of the array is multiplied by the
     * <code>expansionFactor</code> (MULTIPLICATIVE_MODE) or if
     * the expansion is additive (ADDITIVE_MODE -- <code>expansionFactor</code>
     * storage locations added).  The default <code>expansionMode</code> is
     * MULTIPLICATIVE_MODE and the default <code>expansionFactor</code>
     * is 2.0.
     *
     * @return the expansion factor of this expandable double array
     * @deprecated As of 3.1. Return type will be changed to "double" in 4.0.
     */
    @Deprecated
    public float getExpansionFactor() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61165);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61166);return (float) expansionFactor;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * The expansion mode determines whether the internal storage
     * array grows additively or multiplicatively when it is expanded.
     *
     * @return the expansion mode.
     * @deprecated As of 3.1. Return value to be changed to
     * {@link ExpansionMode} in 4.0.
     */
    @Deprecated
    public int getExpansionMode() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61167);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11b2p1b2plb90pbbx.R.inc(61168);switch (expansionMode) {
        case MULTIPLICATIVE:if (!__CLB4_4_1_bool0) {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61169);__CLB4_4_1_bool0=true;}
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61170);return MULTIPLICATIVE_MODE;
        case ADDITIVE:if (!__CLB4_4_1_bool0) {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61171);__CLB4_4_1_bool0=true;}
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61172);return ADDITIVE_MODE;
        default:if (!__CLB4_4_1_bool0) {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61173);__CLB4_4_1_bool0=true;}
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61174);throw new MathInternalError(); // Should never happen.
        }
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Notice the package scope on this method.   This method is simply here
     * for the JUnit test, it allows us check if the expansion is working
     * properly after a number of expansions.  This is not meant to be a part
     * of the public interface of this class.
     *
     * @return the length of the internal storage array.
     * @deprecated As of 3.1. Please use {@link #getCapacity()} instead.
     */
    @Deprecated
    synchronized int getInternalLength() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61175);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61176);return internalArray.length;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Gets the currently allocated size of the internal data structure used
     * for storing elements.
     * This is not to be confused with {@link #getNumElements() the number of
     * elements actually stored}.
     *
     * @return the length of the internal array.
     * @since 3.1
     */
    public int getCapacity() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61177);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61178);return internalArray.length;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns the number of elements currently in the array.  Please note
     * that this is different from the length of the internal storage array.
     *
     * @return the number of elements.
     */
    public synchronized int getNumElements() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61179);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61180);return numElements;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns the internal storage array.  Note that this method returns
     * a reference to the internal storage array, not a copy, and to correctly
     * address elements of the array, the <code>startIndex</code> is
     * required (available via the {@link #start} method).  This method should
     * only be used in cases where copying the internal array is not practical.
     * The {@link #getElements} method should be used in all other cases.
     *
     *
     * @return the internal storage array used by this object
     * @since 2.0
     * @deprecated As of 3.1.
     */
    @Deprecated
    public synchronized double[] getInternalValues() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61181);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61182);return internalArray;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Provides <em>direct</em> access to the internal storage array.
     * Please note that this method returns a reference to this object's
     * storage array, not a copy.
     * <br/>
     * To correctly address elements of the array, the "start index" is
     * required (available via the {@link #getStartIndex() getStartIndex}
     * method.
     * <br/>
     * This method should only be used to avoid copying the internal array.
     * The returned value <em>must</em> be used for reading only; other
     * uses could lead to this object becoming inconsistent.
     * <br/>
     * The {@link #getElements} method has no such limitation since it
     * returns a copy of this array's addressable elements.
     *
     * @return the internal storage array used by this object.
     * @since 3.1
     */
    protected double[] getArrayRef() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61183);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61184);return internalArray;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns the "start index" of the internal array.
     * This index is the position of the first addressable element in the
     * internal storage array.
     * The addressable elements in the array are at indices contained in
     * the interval [{@link #getStartIndex()},
     *               {@link #getStartIndex()} + {@link #getNumElements()} - 1].
     *
     * @return the start index.
     * @since 3.1
     */
    protected int getStartIndex() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61185);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61186);return startIndex;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the contraction criteria.
     *
     * @param contractionCriteria contraction criteria
     * @throws MathIllegalArgumentException if the contractionCriteria is less than
     *         the expansionCriteria.
     * @deprecated As of 3.1 (to be removed in 4.0 as field will become "final").
     */
    @Deprecated
    public void setContractionCriteria(float contractionCriteria)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61187);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61188);checkContractExpand(contractionCriteria, getExpansionFactor());
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61189);synchronized(this) {
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61190);this.contractionCriterion = contractionCriteria;
        }
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Performs an operation on the addressable elements of the array.
     *
     * @param f Function to be applied on this array.
     * @return the result.
     * @since 3.1
     */
    public double compute(MathArrays.Function f) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61191);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61192);final double[] array;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61193);final int start;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61194);final int num;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61195);synchronized(this) {
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61196);array = internalArray;
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61197);start = startIndex;
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61198);num   = numElements;
        }
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61199);return f.evaluate(array, start, num);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the element at the specified index.  If the specified index is greater than
     * <code>getNumElements() - 1</code>, the <code>numElements</code> property
     * is increased to <code>index +1</code> and additional storage is allocated
     * (if necessary) for the new element and all  (uninitialized) elements
     * between the new element and the previous end of the array).
     *
     * @param index index to store a value in
     * @param value value to store at the specified index
     * @throws ArrayIndexOutOfBoundsException if {@code index < 0}.
     */
    public synchronized void setElement(int index, double value) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61200);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61201);if ((((index < 0)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61202)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61203)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61204);throw new ArrayIndexOutOfBoundsException(index);
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61205);if ((((index + 1 > numElements)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61206)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61207)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61208);numElements = index + 1;
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61209);if (((((startIndex + index) >= internalArray.length)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61210)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61211)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61212);expandTo(startIndex + (index + 1));
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61213);internalArray[startIndex + index] = value;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the expansionFactor.  Throws IllegalArgumentException if the
     * the following conditions are not met:
     * <ul>
     * <li><code>expansionFactor > 1</code></li>
     * <li><code>contractionFactor >= expansionFactor</code></li>
     * </ul>
     * @param expansionFactor the new expansion factor value.
     * @throws MathIllegalArgumentException if expansionFactor is <= 1 or greater
     * than contractionFactor
     * @deprecated As of 3.1 (to be removed in 4.0 as field will become "final").
     */
    @Deprecated
    public void setExpansionFactor(float expansionFactor) throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61214);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61215);checkContractExpand(getContractionCriterion(), expansionFactor);
        // The check above verifies that the expansion factor is > 1.0;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61216);synchronized(this) {
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61217);this.expansionFactor = expansionFactor;
        }
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the <code>expansionMode</code>. The specified value must be one of
     * ADDITIVE_MODE, MULTIPLICATIVE_MODE.
     *
     * @param expansionMode The expansionMode to set.
     * @throws MathIllegalArgumentException if the specified mode value is not valid.
     * @deprecated As of 3.1. Please use {@link #setExpansionMode(ExpansionMode)} instead.
     */
    @Deprecated
    public void setExpansionMode(int expansionMode)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61218);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61219);if ((((expansionMode != MULTIPLICATIVE_MODE &&
            expansionMode != ADDITIVE_MODE)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61220)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61221)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61222);throw new MathIllegalArgumentException(LocalizedFormats.UNSUPPORTED_EXPANSION_MODE, expansionMode,
                                                   MULTIPLICATIVE_MODE, "MULTIPLICATIVE_MODE",
                                                   ADDITIVE_MODE, "ADDITIVE_MODE");
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61223);synchronized(this) {
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61224);if ((((expansionMode == MULTIPLICATIVE_MODE)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61225)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61226)==0&false))) {{
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61227);setExpansionMode(ExpansionMode.MULTIPLICATIVE);
            } }else {__CLR4_4_11b2p1b2plb90pbbx.R.inc(61228);if ((((expansionMode == ADDITIVE_MODE)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61229)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61230)==0&false))) {{
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61231);setExpansionMode(ExpansionMode.ADDITIVE);
            }
        }}}
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the {@link ExpansionMode expansion mode}.
     *
     * @param expansionMode Expansion mode to use for resizing the array.
     * @deprecated As of 3.1 (to be removed in 4.0 as field will become "final").
     */
    @Deprecated
    public void setExpansionMode(ExpansionMode expansionMode) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61232);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61233);this.expansionMode = expansionMode;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Sets the initial capacity.  Should only be invoked by constructors.
     *
     * @param initialCapacity of the array
     * @throws MathIllegalArgumentException if <code>initialCapacity</code> is not
     * positive.
     * @deprecated As of 3.1, this is a no-op.
     */
    @Deprecated
    protected void setInitialCapacity(int initialCapacity)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61234);
        // Body removed in 3.1.
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * This function allows you to control the number of elements contained
     * in this array, and can be used to "throw out" the last n values in an
     * array. This function will also expand the internal array as needed.
     *
     * @param i a new number of elements
     * @throws MathIllegalArgumentException if <code>i</code> is negative.
     */
    public synchronized void setNumElements(int i)
        throws MathIllegalArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61235);
        // If index is negative thrown an error.
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61236);if ((((i < 0)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61237)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61238)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61239);throw new MathIllegalArgumentException(
                    LocalizedFormats.INDEX_NOT_POSITIVE,
                    i);
        }

        // Test the new num elements, check to see if the array needs to be
        // expanded to accommodate this new number of elements.
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61240);final int newSize = startIndex + i;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61241);if ((((newSize > internalArray.length)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61242)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61243)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61244);expandTo(newSize);
        }

        // Set the new number of elements to new value.
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61245);numElements = i;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns true if the internal storage array has too many unused
     * storage positions.
     *
     * @return true if array satisfies the contraction criteria
     */
    private synchronized boolean shouldContract() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61246);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61247);if ((((expansionMode == ExpansionMode.MULTIPLICATIVE)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61248)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61249)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61250);return (internalArray.length / ((float) numElements)) > contractionCriterion;
        } }else {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61251);return (internalArray.length - numElements) > contractionCriterion;
        }
    }}finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns the starting index of the internal array.  The starting index is
     * the position of the first addressable element in the internal storage
     * array.  The addressable elements in the array are <code>
     * internalArray[startIndex],...,internalArray[startIndex + numElements -1]
     * </code>
     *
     * @return the starting index.
     * @deprecated As of 3.1.
     */
    @Deprecated
    public synchronized int start() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61252);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61253);return startIndex;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * <p>Copies source to dest, copying the underlying data, so dest is
     * a new, independent copy of source.  Does not contract before
     * the copy.</p>
     *
     * <p>Obtains synchronization locks on both source and dest
     * (in that order) before performing the copy.</p>
     *
     * <p>Neither source nor dest may be null; otherwise a {@link NullArgumentException}
     * is thrown</p>
     *
     * @param source ResizableDoubleArray to copy
     * @param dest ResizableArray to replace with a copy of the source array
     * @exception NullArgumentException if either source or dest is null
     * @since 2.0
     *
     */
    public static void copy(ResizableDoubleArray source,
                            ResizableDoubleArray dest)
        throws NullArgumentException {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61254);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61255);MathUtils.checkNotNull(source);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61256);MathUtils.checkNotNull(dest);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61257);synchronized(source) {
           __CLR4_4_11b2p1b2plb90pbbx.R.inc(61258);synchronized(dest) {
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61259);dest.contractionCriterion = source.contractionCriterion;
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61260);dest.expansionFactor = source.expansionFactor;
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61261);dest.expansionMode = source.expansionMode;
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61262);dest.internalArray = new double[source.internalArray.length];
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61263);System.arraycopy(source.internalArray, 0, dest.internalArray,
                       0, dest.internalArray.length);
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61264);dest.numElements = source.numElements;
               __CLR4_4_11b2p1b2plb90pbbx.R.inc(61265);dest.startIndex = source.startIndex;
           }
       }
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns a copy of the ResizableDoubleArray.  Does not contract before
     * the copy, so the returned object is an exact copy of this.
     *
     * @return a new ResizableDoubleArray with the same data and configuration
     * properties as this
     * @since 2.0
     */
    public synchronized ResizableDoubleArray copy() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61266);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61267);final ResizableDoubleArray result = new ResizableDoubleArray();
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61268);copy(this, result);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61269);return result;
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns true iff object is a ResizableDoubleArray with the same properties
     * as this and an identical internal storage array.
     *
     * @param object object to be compared for equality with this
     * @return true iff object is a ResizableDoubleArray with the same data and
     * properties as this
     * @since 2.0
     */
    @Override
    public boolean equals(Object object) {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61270);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61271);if ((((object == this )&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61272)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61273)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61274);return true;
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61275);if ((((object instanceof ResizableDoubleArray == false)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61276)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61277)==0&false))) {{
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61278);return false;
        }
        }__CLR4_4_11b2p1b2plb90pbbx.R.inc(61279);synchronized(this) {
            __CLR4_4_11b2p1b2plb90pbbx.R.inc(61280);synchronized(object) {
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61281);boolean result = true;
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61282);final ResizableDoubleArray other = (ResizableDoubleArray) object;
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61283);result = result && (other.contractionCriterion == contractionCriterion);
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61284);result = result && (other.expansionFactor == expansionFactor);
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61285);result = result && (other.expansionMode == expansionMode);
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61286);result = result && (other.numElements == numElements);
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61287);result = result && (other.startIndex == startIndex);
                __CLR4_4_11b2p1b2plb90pbbx.R.inc(61288);if ((((!result)&&(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61289)!=0|true))||(__CLR4_4_11b2p1b2plb90pbbx.R.iget(61290)==0&false))) {{
                    __CLR4_4_11b2p1b2plb90pbbx.R.inc(61291);return false;
                } }else {{
                    __CLR4_4_11b2p1b2plb90pbbx.R.inc(61292);return Arrays.equals(internalArray, other.internalArray);
                }
            }}
        }
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

    /**
     * Returns a hash code consistent with equals.
     *
     * @return the hash code representing this {@code ResizableDoubleArray}.
     * @since 2.0
     */
    @Override
    public synchronized int hashCode() {try{__CLR4_4_11b2p1b2plb90pbbx.R.inc(61293);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61294);final int[] hashData = new int[6];
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61295);hashData[0] = Double.valueOf(expansionFactor).hashCode();
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61296);hashData[1] = Double.valueOf(contractionCriterion).hashCode();
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61297);hashData[2] = expansionMode.hashCode();
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61298);hashData[3] = Arrays.hashCode(internalArray);
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61299);hashData[4] = numElements;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61300);hashData[5] = startIndex;
        __CLR4_4_11b2p1b2plb90pbbx.R.inc(61301);return Arrays.hashCode(hashData);
    }finally{__CLR4_4_11b2p1b2plb90pbbx.R.flushNeeded();}}

}
