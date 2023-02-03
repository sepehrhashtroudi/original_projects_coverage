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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

/**
 * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 2.0
 */
public class ArrayFieldVector<T extends FieldElement<T>> implements FieldVector<T>, Serializable {public static class __CLR4_4_1hd2hd2lb90p8nh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,22928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 7648186910365927050L;

    /** Entries of the vector. */
    private T[] data;

    /** Field to which the elements belong. */
    private final Field<T> field;

    /**
     * Build a 0-length vector.
     * Zero-length vectors may be used to initialize construction of vectors
     * by data gathering. We start with zero-length and use either the {@link
     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor
     * or one of the {@code append} methods ({@link #add(FieldVector)} or
     * {@link #append(ArrayFieldVector)}) to gather data into this vector.
     *
     * @param field field to which the elements belong
     */
    public ArrayFieldVector(final Field<T> field) {
        this(field, 0);__CLR4_4_1hd2hd2lb90p8nh.R.inc(22503);try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22502);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector of zeroes.
     *
     * @param field Field to which the elements belong.
     * @param size Size of the vector.
     */
    public ArrayFieldVector(Field<T> field, int size) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22504);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22505);this.field = field;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22506);this.data  = MathArrays.buildArray(field, size);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector with preset values.
     *
     * @param size Size of the vector.
     * @param preset All entries will be set with this value.
     */
    public ArrayFieldVector(int size, T preset) {
        this(preset.getField(), size);__CLR4_4_1hd2hd2lb90p8nh.R.inc(22508);try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22507);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22509);Arrays.fill(data, preset);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from an array, copying the input array.
     * This constructor needs a non-empty {@code d} array to retrieve
     * the field from its first element. This implies it cannot build
     * 0 length vectors. To build vectors from any size, one should
     * use the {@link #ArrayFieldVector(Field, FieldElement[])} constructor.
     *
     * @param d Array.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws ZeroException if {@code d} is empty.
     * @see #ArrayFieldVector(Field, FieldElement[])
     */
    public ArrayFieldVector(T[] d)
            throws NullArgumentException, ZeroException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22510);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22511);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22512);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22513);field = d[0].getField();
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22514);data = d.clone();
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22515);throw new ZeroException(LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from an array, copying the input array.
     *
     * @param field Field to which the elements belong.
     * @param d Array.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #ArrayFieldVector(FieldElement[])
     */
    public ArrayFieldVector(Field<T> field, T[] d)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22516);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22517);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22518);this.field = field;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22519);data = d.clone();
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Create a new ArrayFieldVector using the input array as the underlying
     * data array.
     * If an array is built specially in order to be embedded in a
     * ArrayFieldVector and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.
     * This constructor needs a non-empty {@code d} array to retrieve
     * the field from its first element. This implies it cannot build
     * 0 length vectors. To build vectors from any size, one should
     * use the {@link #ArrayFieldVector(Field, FieldElement[], boolean)}
     * constructor.
     *
     * @param d Data for the new vector.
     * @param copyArray If {@code true}, the input array will be copied,
     * otherwise it will be referenced.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws ZeroException if {@code d} is empty.
     * @see #ArrayFieldVector(FieldElement[])
     * @see #ArrayFieldVector(Field, FieldElement[], boolean)
     */
    public ArrayFieldVector(T[] d, boolean copyArray)
            throws NullArgumentException, ZeroException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22520);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22521);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22522);if ((((d.length == 0)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22523)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22524)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22525);throw new ZeroException(LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22526);field = d[0].getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22527);data = (((copyArray )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22528)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22529)==0&false))? d.clone() : d;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Create a new ArrayFieldVector using the input array as the underlying
     * data array.
     * If an array is built specially in order to be embedded in a
     * ArrayFieldVector and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.
     *
     * @param field Field to which the elements belong.
     * @param d Data for the new vector.
     * @param copyArray If {@code true}, the input array will be copied,
     * otherwise it will be referenced.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #ArrayFieldVector(FieldElement[], boolean)
     */
    public ArrayFieldVector(Field<T> field, T[] d, boolean copyArray)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22530);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22531);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22532);this.field = field;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22533);data = (((copyArray )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22534)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22535)==0&false))? d.clone() :  d;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from part of a array.
     *
     * @param d Array.
     * @param pos Position of the first entry.
     * @param size Number of entries to copy.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NumberIsTooLargeException if the size of {@code d} is less
     * than {@code pos + size}.
     */
    public ArrayFieldVector(T[] d, int pos, int size)
            throws NullArgumentException, NumberIsTooLargeException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22536);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22537);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22538);if ((((d.length < pos + size)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22539)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22540)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22541);throw new NumberIsTooLargeException(pos + size, d.length, true);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22542);field = d[0].getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22543);data = MathArrays.buildArray(field, size);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22544);System.arraycopy(d, pos, data, 0, size);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from part of a array.
     *
     * @param field Field to which the elements belong.
     * @param d Array.
     * @param pos Position of the first entry.
     * @param size Number of entries to copy.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NumberIsTooLargeException if the size of {@code d} is less
     * than {@code pos + size}.
     */
    public ArrayFieldVector(Field<T> field, T[] d, int pos, int size)
            throws NullArgumentException, NumberIsTooLargeException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22545);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22546);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22547);if ((((d.length < pos + size)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22548)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22549)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22550);throw new NumberIsTooLargeException(pos + size, d.length, true);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22551);this.field = field;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22552);data = MathArrays.buildArray(field, size);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22553);System.arraycopy(d, pos, data, 0, size);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector, using a deep copy.
     *
     * @param v Vector to copy.
     * @throws NullArgumentException if {@code v} is {@code null}.
     */
    public ArrayFieldVector(FieldVector<T> v)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22554);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22555);MathUtils.checkNotNull(v);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22556);field = v.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22557);data = MathArrays.buildArray(field, v.getDimension());
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22558);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22559)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22560)==0&false)); ++i) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22561);data[i] = v.getEntry(i);
        }
    }}finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector, using a deep copy.
     *
     * @param v Vector to copy.
     * @throws NullArgumentException if {@code v} is {@code null}.
     */
    public ArrayFieldVector(ArrayFieldVector<T> v)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22562);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22563);MathUtils.checkNotNull(v);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22564);field = v.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22565);data = v.data.clone();
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector.
     *
     * @param v Vector to copy.
     * @param deep If {@code true} perform a deep copy, otherwise perform
     * a shallow copy
     * @throws NullArgumentException if {@code v} is {@code null}.
     */
    public ArrayFieldVector(ArrayFieldVector<T> v, boolean deep)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22566);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22567);MathUtils.checkNotNull(v);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22568);field = v.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22569);data = (((deep )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22570)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22571)==0&false))? v.data.clone() : v.data;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldVector, FieldVector)}
     */
    @Deprecated
    public ArrayFieldVector(ArrayFieldVector<T> v1, ArrayFieldVector<T> v2)
            throws NullArgumentException {
        this((FieldVector<T>) v1, (FieldVector<T>) v2);__CLR4_4_1hd2hd2lb90p8nh.R.inc(22573);try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22572);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @since 3.2
     */
    public ArrayFieldVector(FieldVector<T> v1, FieldVector<T> v2)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22574);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22575);MathUtils.checkNotNull(v1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22576);MathUtils.checkNotNull(v2);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22577);field = v1.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22578);final T[] v1Data =
                ((((v1 instanceof ArrayFieldVector) )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22579)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22580)==0&false))? ((ArrayFieldVector<T>) v1).data : v1.toArray();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22581);final T[] v2Data =
                ((((v2 instanceof ArrayFieldVector) )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22582)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22583)==0&false))? ((ArrayFieldVector<T>) v2).data : v2.toArray();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22584);data = MathArrays.buildArray(field, v1Data.length + v2Data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22585);System.arraycopy(v1Data, 0, data, 0, v1Data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22586);System.arraycopy(v2Data, 0, data, v1Data.length, v2Data.length);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldVector, FieldElement[])}
     */
    @Deprecated
    public ArrayFieldVector(ArrayFieldVector<T> v1, T[] v2)
            throws NullArgumentException {
        this((FieldVector<T>) v1, v2);__CLR4_4_1hd2hd2lb90p8nh.R.inc(22588);try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22587);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @since 3.2
     */
    public ArrayFieldVector(FieldVector<T> v1, T[] v2)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22589);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22590);MathUtils.checkNotNull(v1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22591);MathUtils.checkNotNull(v2);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22592);field = v1.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22593);final T[] v1Data =
                ((((v1 instanceof ArrayFieldVector) )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22594)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22595)==0&false))? ((ArrayFieldVector<T>) v1).data : v1.toArray();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22596);data = MathArrays.buildArray(field, v1Data.length + v2.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22597);System.arraycopy(v1Data, 0, data, 0, v1Data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22598);System.arraycopy(v2, 0, data, v1Data.length, v2.length);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldElement[], FieldVector)}
     */
    @Deprecated
    public ArrayFieldVector(T[] v1, ArrayFieldVector<T> v2)
            throws NullArgumentException {
        this(v1, (FieldVector<T>) v2);__CLR4_4_1hd2hd2lb90p8nh.R.inc(22600);try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22599);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @since 3.2
     */
    public ArrayFieldVector(T[] v1, FieldVector<T> v2)
            throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22601);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22602);MathUtils.checkNotNull(v1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22603);MathUtils.checkNotNull(v2);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22604);field = v2.getField();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22605);final T[] v2Data =
                ((((v2 instanceof ArrayFieldVector) )&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22606)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22607)==0&false))? ((ArrayFieldVector<T>) v2).data : v2.toArray();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22608);data = MathArrays.buildArray(field, v1.length + v2Data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22609);System.arraycopy(v1, 0, data, 0, v1.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22610);System.arraycopy(v2Data, 0, data, v1.length, v2Data.length);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * This constructor needs at least one non-empty array to retrieve
     * the field from its first element. This implies it cannot build
     * 0 length vectors. To build vectors from any size, one should
     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}
     * constructor.
     *
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @throws ZeroException if both arrays are empty.
     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])
     */
    public ArrayFieldVector(T[] v1, T[] v2)
            throws NullArgumentException, ZeroException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22611);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22612);MathUtils.checkNotNull(v1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22613);MathUtils.checkNotNull(v2);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22614);if ((((v1.length + v2.length == 0)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22615)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22616)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22617);throw new ZeroException(LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22618);data = MathArrays.buildArray(v1[0].getField(), v1.length + v2.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22619);System.arraycopy(v1, 0, data, 0, v1.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22620);System.arraycopy(v2, 0, data, v1.length, v2.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22621);field = data[0].getField();
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     *
     * @param field Field to which the elements belong.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     * @throws NullArgumentException if {@code v1} or {@code v2} is
     * {@code null}.
     * @throws ZeroException if both arrays are empty.
     * @see #ArrayFieldVector(FieldElement[], FieldElement[])
     */
    public ArrayFieldVector(Field<T> field, T[] v1, T[] v2)
            throws NullArgumentException, ZeroException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22622);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22623);MathUtils.checkNotNull(v1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22624);MathUtils.checkNotNull(v2);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22625);if ((((v1.length + v2.length == 0)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22626)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22627)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22628);throw new ZeroException(LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22629);data = MathArrays.buildArray(field, v1.length + v2.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22630);System.arraycopy(v1, 0, data, 0, v1.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22631);System.arraycopy(v2, 0, data, v1.length, v2.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22632);this.field = field;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Field<T> getField() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22633);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22634);return field;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> copy() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22635);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22636);return new ArrayFieldVector<T>(this, true);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> add(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22637);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22638);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22639);return add((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22640);checkVectorDimensions(v);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22641);T[] out = MathArrays.buildArray(field, data.length);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22642);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22643)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22644)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22645);out[i] = data[i].add(v.getEntry(i));
            }
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22646);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Compute the sum of {@code this} and {@code v}.
     * @param v vector to be added
     * @return {@code this + v}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     */
    public ArrayFieldVector<T> add(ArrayFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22647);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22648);checkVectorDimensions(v.data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22649);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22650);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22651)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22652)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22653);out[i] = data[i].add(v.data[i]);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22654);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> subtract(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22655);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22656);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22657);return subtract((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22658);checkVectorDimensions(v);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22659);T[] out = MathArrays.buildArray(field, data.length);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22660);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22661)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22662)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22663);out[i] = data[i].subtract(v.getEntry(i));
            }
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22664);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Compute {@code this} minus {@code v}.
     * @param v vector to be subtracted
     * @return {@code this - v}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     */
    public ArrayFieldVector<T> subtract(ArrayFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22665);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22666);checkVectorDimensions(v.data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22667);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22668);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22669)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22670)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22671);out[i] = data[i].subtract(v.data[i]);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22672);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapAdd(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22673);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22674);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22675);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22676)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22677)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22678);out[i] = data[i].add(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22679);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapAddToSelf(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22680);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22681);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22682)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22683)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22684);data[i] = data[i].add(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22685);return this;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapSubtract(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22686);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22687);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22688);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22689)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22690)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22691);out[i] = data[i].subtract(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22692);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22693);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22694);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22695)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22696)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22697);data[i] = data[i].subtract(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22698);return this;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapMultiply(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22699);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22700);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22701);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22702)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22703)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22704);out[i] = data[i].multiply(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22705);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22706);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22707);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22708)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22709)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22710);data[i] = data[i].multiply(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22711);return this;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapDivide(T d)
        throws NullArgumentException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22712);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22713);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22714);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22715);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22716)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22717)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22718);out[i] = data[i].divide(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22719);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapDivideToSelf(T d)
        throws NullArgumentException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22720);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22721);MathUtils.checkNotNull(d);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22722);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22723)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22724)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22725);data[i] = data[i].divide(d);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22726);return this;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapInv() throws MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22727);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22728);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22729);final T one = field.getOne();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22730);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22731)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22732)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22733);try {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22734);out[i] = one.divide(data[i]);
            } catch (final MathArithmeticException e) {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22735);throw new MathArithmeticException(LocalizedFormats.INDEX, i);
            }
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22736);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapInvToSelf() throws MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22737);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22738);final T one = field.getOne();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22739);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22740)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22741)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22742);try {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22743);data[i] = one.divide(data[i]);
            } catch (final MathArithmeticException e) {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22744);throw new MathArithmeticException(LocalizedFormats.INDEX, i);
            }
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22745);return this;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> ebeMultiply(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22746);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22747);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22748);return ebeMultiply((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22749);checkVectorDimensions(v);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22750);T[] out = MathArrays.buildArray(field, data.length);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22751);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22752)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22753)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22754);out[i] = data[i].multiply(v.getEntry(i));
            }
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22755);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Element-by-element multiplication.
     * @param v vector by which instance elements must be multiplied
     * @return a vector containing {@code this[i] * v[i]} for all {@code i}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     */
    public ArrayFieldVector<T> ebeMultiply(ArrayFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22756);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22757);checkVectorDimensions(v.data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22758);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22759);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22760)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22761)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22762);out[i] = data[i].multiply(v.data[i]);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22763);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> ebeDivide(FieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22764);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22765);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22766);return ebeDivide((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22767);checkVectorDimensions(v);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22768);T[] out = MathArrays.buildArray(field, data.length);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22769);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22770)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22771)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22772);try {
                    __CLR4_4_1hd2hd2lb90p8nh.R.inc(22773);out[i] = data[i].divide(v.getEntry(i));
                } catch (final MathArithmeticException e) {
                    __CLR4_4_1hd2hd2lb90p8nh.R.inc(22774);throw new MathArithmeticException(LocalizedFormats.INDEX, i);
                }
            }
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22775);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Element-by-element division.
     * @param v vector by which instance elements must be divided
     * @return a vector containing {@code this[i] / v[i]} for all {@code i}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     * @throws MathArithmeticException if one entry of {@code v} is zero.
     */
    public ArrayFieldVector<T> ebeDivide(ArrayFieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22776);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22777);checkVectorDimensions(v.data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22778);T[] out = MathArrays.buildArray(field, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22779);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22780)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22781)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22782);try {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22783);out[i] = data[i].divide(v.data[i]);
            } catch (final MathArithmeticException e) {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22784);throw new MathArithmeticException(LocalizedFormats.INDEX, i);
            }
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22785);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] getData() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22786);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22787);return data.clone();
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Returns a reference to the underlying data array.
     * <p>Does not make a fresh copy of the underlying data.</p>
     * @return array of entries
     */
    public T[] getDataRef() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22788);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22789);return data;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T dotProduct(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22790);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22791);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22792);return dotProduct((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22793);checkVectorDimensions(v);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22794);T dot = field.getZero();
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22795);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22796)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22797)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22798);dot = dot.add(data[i].multiply(v.getEntry(i)));
            }
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22799);return dot;
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Compute the dot product.
     * @param v vector with which dot product should be computed
     * @return the scalar dot product of {@code this} and {@code v}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     */
    public T dotProduct(ArrayFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22800);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22801);checkVectorDimensions(v.data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22802);T dot = field.getZero();
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22803);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22804)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22805)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22806);dot = dot.add(data[i].multiply(v.data[i]));
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22807);return dot;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> projection(FieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22808);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22809);return v.mapMultiply(dotProduct(v).divide(v.dotProduct(v)));
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** Find the orthogonal projection of this vector onto another vector.
     * @param v vector onto which {@code this} must be projected
     * @return projection of {@code this} onto {@code v}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}
     * @throws MathArithmeticException if {@code v} is the null vector.
     */
    public ArrayFieldVector<T> projection(ArrayFieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22810);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22811);return (ArrayFieldVector<T>) v.mapMultiply(dotProduct(v).divide(v.dotProduct(v)));
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> outerProduct(FieldVector<T> v) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22812);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22813);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22814);return outerProduct((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22815);final int m = data.length;
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22816);final int n = v.getDimension();
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22817);final FieldMatrix<T> out = new Array2DRowFieldMatrix<T>(field, m, n);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22818);for (int i = 0; (((i < m)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22819)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22820)==0&false)); i++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22821);for (int j = 0; (((j < n)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22822)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22823)==0&false)); j++) {{
                    __CLR4_4_1hd2hd2lb90p8nh.R.inc(22824);out.setEntry(i, j, data[i].multiply(v.getEntry(j)));
                }
            }}
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22825);return out;
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Compute the outer product.
     * @param v vector with which outer product should be computed
     * @return the matrix outer product between instance and v
     */
    public FieldMatrix<T> outerProduct(ArrayFieldVector<T> v) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22826);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22827);final int m = data.length;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22828);final int n = v.data.length;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22829);final FieldMatrix<T> out = new Array2DRowFieldMatrix<T>(field, m, n);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22830);for (int i = 0; (((i < m)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22831)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22832)==0&false)); i++) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22833);for (int j = 0; (((j < n)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22834)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22835)==0&false)); j++) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22836);out.setEntry(i, j, data[i].multiply(v.data[j]));
            }
        }}
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22837);return out;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T getEntry(int index) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22838);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22839);return data[index];
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22840);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22841);return data.length;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> append(FieldVector<T> v) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22842);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22843);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22844);return append((ArrayFieldVector<T>) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22845);return new ArrayFieldVector<T>(this,new ArrayFieldVector<T>(v));
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Construct a vector by appending a vector to this vector.
     * @param v vector to append to this one.
     * @return a new vector
     */
    public ArrayFieldVector<T> append(ArrayFieldVector<T> v) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22846);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22847);return new ArrayFieldVector<T>(this, v);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> append(T in) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22848);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22849);final T[] out = MathArrays.buildArray(field, data.length + 1);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22850);System.arraycopy(data, 0, out, 0, data.length);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22851);out[data.length] = in;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22852);return new ArrayFieldVector<T>(field, out, false);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> getSubVector(int index, int n)
        throws OutOfRangeException, NotPositiveException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22853);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22854);if ((((n < 0)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22855)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22856)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22857);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22858);ArrayFieldVector<T> out = new ArrayFieldVector<T>(field, n);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22859);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22860);System.arraycopy(data, index, out.data, 0, n);
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22861);checkIndex(index);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22862);checkIndex(index + n - 1);
        }
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22863);return out;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setEntry(int index, T value) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22864);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22865);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22866);data[index] = value;
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22867);checkIndex(index);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSubVector(int index, FieldVector<T> v) throws OutOfRangeException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22868);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22869);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22870);try {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22871);set(index, (ArrayFieldVector<T>) v);
            } catch (ClassCastException cce) {
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22872);for (int i = index; (((i < index + v.getDimension())&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22873)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22874)==0&false)); ++i) {{
                    __CLR4_4_1hd2hd2lb90p8nh.R.inc(22875);data[i] = v.getEntry(i-index);
                }
            }}
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22876);checkIndex(index);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22877);checkIndex(index + v.getDimension() - 1);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Set a set of consecutive elements.
     *
     * @param index index of first element to be set.
     * @param v vector containing the values to set.
     * @throws OutOfRangeException if the index is invalid.
     */
    public void set(int index, ArrayFieldVector<T> v) throws OutOfRangeException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22878);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22879);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22880);System.arraycopy(v.data, 0, data, index, v.data.length);
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22881);checkIndex(index);
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22882);checkIndex(index + v.data.length - 1);
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void set(T value) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22883);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22884);Arrays.fill(data, value);
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] toArray(){try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22885);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22886);return data.clone();
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Check if instance and specified vectors have the same dimension.
     * @param v vector to compare instance with
     * @exception DimensionMismatchException if the vectors do not
     * have the same dimensions
     */
    protected void checkVectorDimensions(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22887);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22888);checkVectorDimensions(v.getDimension());
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Check if instance dimension is equal to some expected value.
     *
     * @param n Expected dimension.
     * @throws DimensionMismatchException if the dimension is not equal to the
     * size of {@code this} vector.
     */
    protected void checkVectorDimensions(int n)
        throws DimensionMismatchException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22889);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22890);if ((((data.length != n)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22891)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22892)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22893);throw new DimensionMismatchException(data.length, n);
        }
    }}finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Test for the equality of two vectors.
     *
     * @param other Object to test for equality.
     * @return {@code true} if two vector objects are equal, {@code false}
     * otherwise.
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22894);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22895);if ((((this == other)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22896)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22897)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22898);return true;
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22899);if ((((other == null)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22900)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22901)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22902);return false;
        }

        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22903);try {
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22904);@SuppressWarnings("unchecked") // May fail, but we ignore ClassCastException
                FieldVector<T> rhs = (FieldVector<T>) other;
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22905);if ((((data.length != rhs.getDimension())&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22906)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22907)==0&false))) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22908);return false;
            }

            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22909);for (int i = 0; (((i < data.length)&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22910)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22911)==0&false)); ++i) {{
                __CLR4_4_1hd2hd2lb90p8nh.R.inc(22912);if ((((!data[i].equals(rhs.getEntry(i)))&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22913)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22914)==0&false))) {{
                    __CLR4_4_1hd2hd2lb90p8nh.R.inc(22915);return false;
                }
            }}
            }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22916);return true;
        } catch (ClassCastException ex) {
            // ignore exception
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22917);return false;
        }
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Get a hashCode for the real vector.
     * <p>All NaN values have the same hash code.</p>
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22918);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22919);int h = 3542;
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22920);for (final T a : data) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22921);h = h ^ a.hashCode();
        }
        }__CLR4_4_1hd2hd2lb90p8nh.R.inc(22922);return h;
    }finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}

    /**
     * Check if an index is valid.
     *
     * @param index Index to check.
     * @exception OutOfRangeException if the index is not valid.
     */
    private void checkIndex(final int index) throws OutOfRangeException {try{__CLR4_4_1hd2hd2lb90p8nh.R.inc(22923);
        __CLR4_4_1hd2hd2lb90p8nh.R.inc(22924);if ((((index < 0 || index >= getDimension())&&(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22925)!=0|true))||(__CLR4_4_1hd2hd2lb90p8nh.R.iget(22926)==0&false))) {{
            __CLR4_4_1hd2hd2lb90p8nh.R.inc(22927);throw new OutOfRangeException(LocalizedFormats.INDEX,
                                          index, 0, getDimension() - 1);
        }
    }}finally{__CLR4_4_1hd2hd2lb90p8nh.R.flushNeeded();}}
}
