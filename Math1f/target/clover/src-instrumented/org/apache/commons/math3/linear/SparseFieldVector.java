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
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.OpenIntToFieldHashMap;

/**
 * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 2.0
 * @deprecated As of version 3.1, this class is deprecated, for reasons exposed
 * in this JIRA
 * <a href="https://issues.apache.org/jira/browse/MATH-870">ticket</a>. This
 * class will be removed in version 4.0.
 */
@Deprecated
public class SparseFieldVector<T extends FieldElement<T>> implements FieldVector<T>, Serializable {public static class __CLR4_4_1ni5ni5lb90p95u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,30814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**  Serialization identifier. */
    private static final long serialVersionUID = 7841233292190413362L;
    /** Field to which the elements belong. */
    private final Field<T> field;
    /** Entries of the vector. */
    private final OpenIntToFieldHashMap<T> entries;
    /** Dimension of the vector. */
    private final int virtualSize;

    /**
     * Build a 0-length vector.
     * Zero-length vectors may be used to initialize construction of vectors
     * by data gathering. We start with zero-length and use either the {@link
     * #SparseFieldVector(SparseFieldVector, int)} constructor
     * or one of the {@code append} method ({@link #append(FieldVector)} or
     * {@link #append(SparseFieldVector)}) to gather data into this vector.
     *
     * @param field Field to which the elements belong.
     */
    public SparseFieldVector(Field<T> field) {
        this(field, 0);__CLR4_4_1ni5ni5lb90p95u.R.inc(30462);try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30461);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}


    /**
     * Construct a vector of zeroes.
     *
     * @param field Field to which the elements belong.
     * @param dimension Size of the vector.
     */
    public SparseFieldVector(Field<T> field, int dimension) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30463);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30464);this.field = field;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30465);virtualSize = dimension;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30466);entries = new OpenIntToFieldHashMap<T>(field);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Build a resized vector, for use with append.
     *
     * @param v Original vector
     * @param resize Amount to add.
     */
    protected SparseFieldVector(SparseFieldVector<T> v, int resize) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30467);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30468);field = v.field;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30469);virtualSize = v.getDimension() + resize;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30470);entries = new OpenIntToFieldHashMap<T>(v.entries);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}


    /**
     * Build a vector with known the sparseness (for advanced use only).
     *
     * @param field Field to which the elements belong.
     * @param dimension Size of the vector.
     * @param expectedSize Expected number of non-zero entries.
     */
    public SparseFieldVector(Field<T> field, int dimension, int expectedSize) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30471);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30472);this.field = field;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30473);virtualSize = dimension;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30474);entries = new OpenIntToFieldHashMap<T>(field,expectedSize);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Create from a Field array.
     * Only non-zero entries will be stored.
     *
     * @param field Field to which the elements belong.
     * @param values Set of values to create from.
     * @exception NullArgumentException if values is null
     */
    public SparseFieldVector(Field<T> field, T[] values) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30475);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30476);MathUtils.checkNotNull(values);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30477);this.field = field;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30478);virtualSize = values.length;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30479);entries = new OpenIntToFieldHashMap<T>(field);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30480);for (int key = 0; (((key < values.length)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30481)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30482)==0&false)); key++) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30483);T value = values[key];
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30484);entries.put(key, value);
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param v Instance to copy.
     */
    public SparseFieldVector(SparseFieldVector<T> v) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30485);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30486);field = v.field;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30487);virtualSize = v.getDimension();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30488);entries = new OpenIntToFieldHashMap<T>(v.getEntries());
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Get the entries of this instance.
     *
     * @return the entries of this instance
     */
    private OpenIntToFieldHashMap<T> getEntries() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30489);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30490);return entries;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Optimized method to add sparse vectors.
     *
     * @param v Vector to add.
     * @return {@code this + v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}.
     */
    public FieldVector<T> add(SparseFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30491);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30492);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30493);SparseFieldVector<T> res = (SparseFieldVector<T>)copy();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30494);OpenIntToFieldHashMap<T>.Iterator iter = v.getEntries().iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30495);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30496)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30497)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30498);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30499);int key = iter.key();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30500);T value = iter.value();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30501);if ((((entries.containsKey(key))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30502)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30503)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30504);res.setEntry(key, entries.get(key).add(value));
            } }else {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30505);res.setEntry(key, value);
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30506);return res;

    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Construct a vector by appending a vector to this vector.
     *
     * @param v Vector to append to this one.
     * @return a new vector.
     */
    public FieldVector<T> append(SparseFieldVector<T> v) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30507);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30508);SparseFieldVector<T> res = new SparseFieldVector<T>(this, v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30509);OpenIntToFieldHashMap<T>.Iterator iter = v.entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30510);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30511)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30512)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30513);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30514);res.setEntry(iter.key() + virtualSize, iter.value());
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30515);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> append(FieldVector<T> v) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30516);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30517);if ((((v instanceof SparseFieldVector<?>)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30518)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30519)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30520);return append((SparseFieldVector<T>) v);
        } }else {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30521);final int n = v.getDimension();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30522);FieldVector<T> res = new SparseFieldVector<T>(this, n);
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30523);for (int i = 0; (((i < n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30524)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30525)==0&false)); i++) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30526);res.setEntry(i + virtualSize, v.getEntry(i));
            }
            }__CLR4_4_1ni5ni5lb90p95u.R.inc(30527);return res;
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception NullArgumentException if d is null
     */
    public FieldVector<T> append(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30528);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30529);MathUtils.checkNotNull(d);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30530);FieldVector<T> res = new SparseFieldVector<T>(this, 1);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30531);res.setEntry(virtualSize, d);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30532);return res;
     }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> copy() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30533);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30534);return new SparseFieldVector<T>(this);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T dotProduct(FieldVector<T> v) throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30535);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30536);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30537);T res = field.getZero();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30538);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30539);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30540)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30541)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30542);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30543);res = res.add(v.getEntry(iter.key()).multiply(iter.value()));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30544);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> ebeDivide(FieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30545);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30546);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30547);SparseFieldVector<T> res = new SparseFieldVector<T>(this);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30548);OpenIntToFieldHashMap<T>.Iterator iter = res.entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30549);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30550)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30551)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30552);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30553);res.setEntry(iter.key(), iter.value().divide(v.getEntry(iter.key())));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30554);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> ebeMultiply(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30555);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30556);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30557);SparseFieldVector<T> res = new SparseFieldVector<T>(this);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30558);OpenIntToFieldHashMap<T>.Iterator iter = res.entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30559);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30560)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30561)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30562);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30563);res.setEntry(iter.key(), iter.value().multiply(v.getEntry(iter.key())));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30564);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @deprecated as of 3.1, to be removed in 4.0. Please use the {@link #toArray()} method instead.
     */
    @Deprecated
    public T[] getData() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30565);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30566);return toArray();
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30567);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30568);return virtualSize;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T getEntry(int index) throws OutOfRangeException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30569);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30570);checkIndex(index);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30571);return entries.get(index);
   }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Field<T> getField() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30572);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30573);return field;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> getSubVector(int index, int n)
        throws OutOfRangeException, NotPositiveException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30574);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30575);if ((((n < 0)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30576)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30577)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30578);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30579);checkIndex(index);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30580);checkIndex(index + n - 1);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30581);SparseFieldVector<T> res = new SparseFieldVector<T>(field,n);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30582);int end = index + n;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30583);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30584);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30585)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30586)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30587);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30588);int key = iter.key();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30589);if ((((key >= index && key < end)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30590)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30591)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30592);res.setEntry(key - index, iter.value());
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30593);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapAdd(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30594);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30595);return copy().mapAddToSelf(d);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapAddToSelf(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30596);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30597);for (int i = 0; (((i < virtualSize)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30598)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30599)==0&false)); i++) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30600);setEntry(i, getEntry(i).add(d));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30601);return this;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapDivide(T d)
        throws NullArgumentException, MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30602);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30603);return copy().mapDivideToSelf(d);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapDivideToSelf(T d)
        throws NullArgumentException, MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30604);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30605);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30606);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30607)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30608)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30609);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30610);entries.put(iter.key(), iter.value().divide(d));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30611);return this;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapInv() throws MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30612);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30613);return copy().mapInvToSelf();
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapInvToSelf() throws MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30614);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30615);for (int i = 0; (((i < virtualSize)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30616)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30617)==0&false)); i++) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30618);setEntry(i, field.getOne().divide(getEntry(i)));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30619);return this;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapMultiply(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30620);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30621);return copy().mapMultiplyToSelf(d);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapMultiplyToSelf(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30622);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30623);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30624);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30625)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30626)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30627);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30628);entries.put(iter.key(), iter.value().multiply(d));
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30629);return this;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapSubtract(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30630);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30631);return copy().mapSubtractToSelf(d);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> mapSubtractToSelf(T d) throws NullArgumentException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30632);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30633);return mapAddToSelf(field.getZero().subtract(d));
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Optimized method to compute outer product when both vectors are sparse.
     * @param v vector with which outer product should be computed
     * @return the matrix outer product between instance and v
     */
    public FieldMatrix<T> outerProduct(SparseFieldVector<T> v) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30634);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30635);final int n = v.getDimension();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30636);SparseFieldMatrix<T> res = new SparseFieldMatrix<T>(field, virtualSize, n);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30637);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30638);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30639)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30640)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30641);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30642);OpenIntToFieldHashMap<T>.Iterator iter2 = v.entries.iterator();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30643);while ((((iter2.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30644)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30645)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30646);iter2.advance();
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30647);res.setEntry(iter.key(), iter2.key(), iter.value().multiply(iter2.value()));
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30648);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> outerProduct(FieldVector<T> v) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30649);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30650);if ((((v instanceof SparseFieldVector<?>)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30651)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30652)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30653);return outerProduct((SparseFieldVector<T>)v);
        } }else {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30654);final int n = v.getDimension();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30655);FieldMatrix<T> res = new SparseFieldMatrix<T>(field, virtualSize, n);
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30656);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30657);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30658)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30659)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30660);iter.advance();
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30661);int row = iter.key();
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30662);FieldElement<T>value = iter.value();
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30663);for (int col = 0; (((col < n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30664)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30665)==0&false)); col++) {{
                    __CLR4_4_1ni5ni5lb90p95u.R.inc(30666);res.setEntry(row, col, value.multiply(v.getEntry(col)));
                }
            }}
            }__CLR4_4_1ni5ni5lb90p95u.R.inc(30667);return res;
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> projection(FieldVector<T> v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30668);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30669);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30670);return v.mapMultiply(dotProduct(v).divide(v.dotProduct(v)));
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception NullArgumentException if value is null
     */
    public void set(T value) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30671);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30672);MathUtils.checkNotNull(value);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30673);for (int i = 0; (((i < virtualSize)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30674)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30675)==0&false)); i++) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30676);setEntry(i, value);
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc}
     * @exception NullArgumentException if value is null
     */
    public void setEntry(int index, T value) throws NullArgumentException, OutOfRangeException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30677);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30678);MathUtils.checkNotNull(value);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30679);checkIndex(index);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30680);entries.put(index, value);
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSubVector(int index, FieldVector<T> v)
        throws OutOfRangeException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30681);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30682);checkIndex(index);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30683);checkIndex(index + v.getDimension() - 1);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30684);final int n = v.getDimension();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30685);for (int i = 0; (((i < n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30686)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30687)==0&false)); i++) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30688);setEntry(i + index, v.getEntry(i));
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Optimized method to compute {@code this} minus {@code v}.
     * @param v vector to be subtracted
     * @return {@code this - v}
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this}.
     */
    public SparseFieldVector<T> subtract(SparseFieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30689);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30690);checkVectorDimensions(v.getDimension());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30691);SparseFieldVector<T> res = (SparseFieldVector<T>)copy();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30692);OpenIntToFieldHashMap<T>.Iterator iter = v.getEntries().iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30693);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30694)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30695)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30696);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30697);int key = iter.key();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30698);if ((((entries.containsKey(key))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30699)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30700)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30701);res.setEntry(key, entries.get(key).subtract(iter.value()));
            } }else {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30702);res.setEntry(key, field.getZero().subtract(iter.value()));
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30703);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> subtract(FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30704);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30705);if ((((v instanceof SparseFieldVector<?>)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30706)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30707)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30708);return subtract((SparseFieldVector<T>)v);
        } }else {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30709);final int n = v.getDimension();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30710);checkVectorDimensions(n);
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30711);SparseFieldVector<T> res = new SparseFieldVector<T>(this);
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30712);for (int i = 0; (((i < n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30713)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30714)==0&false)); i++) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30715);if ((((entries.containsKey(i))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30716)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30717)==0&false))) {{
                    __CLR4_4_1ni5ni5lb90p95u.R.inc(30718);res.setEntry(i, entries.get(i).subtract(v.getEntry(i)));
                } }else {{
                    __CLR4_4_1ni5ni5lb90p95u.R.inc(30719);res.setEntry(i, field.getZero().subtract(v.getEntry(i)));
                }
            }}
            }__CLR4_4_1ni5ni5lb90p95u.R.inc(30720);return res;
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] toArray() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30721);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30722);T[] res = MathArrays.buildArray(field, virtualSize);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30723);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30724);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30725)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30726)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30727);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30728);res[iter.key()] = iter.value();
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30729);return res;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Check whether an index is valid.
     *
     * @param index Index to check.
     * @throws OutOfRangeException if the index is not valid.
     */
    private void checkIndex(final int index) throws OutOfRangeException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30730);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30731);if ((((index < 0 || index >= getDimension())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30732)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30733)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30734);throw new OutOfRangeException(index, 0, getDimension() - 1);
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /**
     * Check if instance dimension is equal to some expected value.
     *
     * @param n Expected dimension.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    protected void checkVectorDimensions(int n)
        throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30735);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30736);if ((((getDimension() != n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30737)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30738)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30739);throw new DimensionMismatchException(getDimension(), n);
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> add(FieldVector<T> v) throws DimensionMismatchException {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30740);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30741);if ((((v instanceof SparseFieldVector<?>)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30742)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30743)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30744);return add((SparseFieldVector<T>) v);
        } }else {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30745);final int n = v.getDimension();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30746);checkVectorDimensions(n);
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30747);SparseFieldVector<T> res = new SparseFieldVector<T>(field,
                                                                getDimension());
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30748);for (int i = 0; (((i < n)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30749)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30750)==0&false)); i++) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30751);res.setEntry(i, v.getEntry(i).add(getEntry(i)));
            }
            }__CLR4_4_1ni5ni5lb90p95u.R.inc(30752);return res;
        }
    }}finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30753);
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30754);final int prime = 31;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30755);int result = 1;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30756);result = prime * result + (((((field == null) )&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30757)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30758)==0&false))? 0 : field.hashCode());
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30759);result = prime * result + virtualSize;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30760);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30761);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30762)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30763)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30764);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30765);int temp = iter.value().hashCode();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30766);result = prime * result + temp;
        }
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30767);return result;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}


    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1ni5ni5lb90p95u.R.inc(30768);

        __CLR4_4_1ni5ni5lb90p95u.R.inc(30769);if ((((this == obj)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30770)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30771)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30772);return true;
        }

        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30773);if ((((!(obj instanceof SparseFieldVector<?>))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30774)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30775)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30776);return false;
        }

        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30777);@SuppressWarnings("unchecked") // OK, because "else if" check below ensures that
                                       // other must be the same type as this
        SparseFieldVector<T> other = (SparseFieldVector<T>) obj;
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30778);if ((((field == null)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30779)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30780)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30781);if ((((other.field != null)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30782)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30783)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30784);return false;
            }
        }} }else {__CLR4_4_1ni5ni5lb90p95u.R.inc(30785);if ((((!field.equals(other.field))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30786)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30787)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30788);return false;
        }
        }}__CLR4_4_1ni5ni5lb90p95u.R.inc(30789);if ((((virtualSize != other.virtualSize)&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30790)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30791)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30792);return false;
        }

        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30793);OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30794);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30795)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30796)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30797);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30798);T test = other.getEntry(iter.key());
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30799);if ((((!test.equals(iter.value()))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30800)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30801)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30802);return false;
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30803);iter = other.getEntries().iterator();
        __CLR4_4_1ni5ni5lb90p95u.R.inc(30804);while ((((iter.hasNext())&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30805)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30806)==0&false))) {{
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30807);iter.advance();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30808);T test = iter.value();
            __CLR4_4_1ni5ni5lb90p95u.R.inc(30809);if ((((!test.equals(getEntry(iter.key())))&&(__CLR4_4_1ni5ni5lb90p95u.R.iget(30810)!=0|true))||(__CLR4_4_1ni5ni5lb90p95u.R.iget(30811)==0&false))) {{
                __CLR4_4_1ni5ni5lb90p95u.R.inc(30812);return false;
            }
        }}
        }__CLR4_4_1ni5ni5lb90p95u.R.inc(30813);return true;
    }finally{__CLR4_4_1ni5ni5lb90p95u.R.flushNeeded();}}
}
