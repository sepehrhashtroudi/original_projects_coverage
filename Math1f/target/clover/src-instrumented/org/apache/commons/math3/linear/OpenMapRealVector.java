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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator;

/**
 * This class implements the {@link RealVector} interface with a
 * {@link OpenIntToDoubleHashMap} backing store.
 * @version $Id$
 * @since 2.0
 * @deprecated As of version 3.1, this class is deprecated, for reasons exposed
 * in this JIRA
 * <a href="https://issues.apache.org/jira/browse/MATH-870">ticket</a>. This
 * class will be removed in version 4.0.
 */
@Deprecated
public class OpenMapRealVector extends SparseRealVector
    implements Serializable {public static class __CLR4_4_1llzllzlb90p8zn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default Tolerance for having a value considered zero. */
    public static final double DEFAULT_ZERO_TOLERANCE = 1.0e-12;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 8772222695580707260L;
    /** Entries of the vector. */
    private final OpenIntToDoubleHashMap entries;
    /** Dimension of the vector. */
    private final int virtualSize;
    /** Tolerance for having a value considered zero. */
    private final double epsilon;

    /**
     * Build a 0-length vector.
     * Zero-length vectors may be used to initialized construction of vectors
     * by data gathering. We start with zero-length and use either the {@link
     * #OpenMapRealVector(OpenMapRealVector, int)} constructor
     * or one of the {@code append} method ({@link #append(double)},
     * {@link #append(RealVector)}) to gather data into this vector.
     */
    public OpenMapRealVector() {
        this(0, DEFAULT_ZERO_TOLERANCE);__CLR4_4_1llzllzlb90p8zn.R.inc(28008);try{__CLR4_4_1llzllzlb90p8zn.R.inc(28007);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Construct a vector of zeroes.
     *
     * @param dimension Size of the vector.
     */
    public OpenMapRealVector(int dimension) {
        this(dimension, DEFAULT_ZERO_TOLERANCE);__CLR4_4_1llzllzlb90p8zn.R.inc(28010);try{__CLR4_4_1llzllzlb90p8zn.R.inc(28009);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Construct a vector of zeroes, specifying zero tolerance.
     *
     * @param dimension Size of the vector.
     * @param epsilon Tolerance below which a value considered zero.
     */
    public OpenMapRealVector(int dimension, double epsilon) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28011);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28012);virtualSize = dimension;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28013);entries = new OpenIntToDoubleHashMap(0.0);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28014);this.epsilon = epsilon;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Build a resized vector, for use with append.
     *
     * @param v Original vector.
     * @param resize Amount to add.
     */
    protected OpenMapRealVector(OpenMapRealVector v, int resize) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28015);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28016);virtualSize = v.getDimension() + resize;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28017);entries = new OpenIntToDoubleHashMap(v.entries);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28018);epsilon = v.epsilon;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Build a vector with known the sparseness (for advanced use only).
     *
     * @param dimension Size of the vector.
     * @param expectedSize The expected number of non-zero entries.
     */
    public OpenMapRealVector(int dimension, int expectedSize) {
        this(dimension, expectedSize, DEFAULT_ZERO_TOLERANCE);__CLR4_4_1llzllzlb90p8zn.R.inc(28020);try{__CLR4_4_1llzllzlb90p8zn.R.inc(28019);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Build a vector with known the sparseness and zero tolerance
     * setting (for advanced use only).
     *
     * @param dimension Size of the vector.
     * @param expectedSize Expected number of non-zero entries.
     * @param epsilon Tolerance below which a value is considered zero.
     */
    public OpenMapRealVector(int dimension, int expectedSize, double epsilon) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28021);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28022);virtualSize = dimension;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28023);entries = new OpenIntToDoubleHashMap(expectedSize, 0.0);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28024);this.epsilon = epsilon;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Create from an array.
     * Only non-zero entries will be stored.
     *
     * @param values Set of values to create from.
     */
    public OpenMapRealVector(double[] values) {
        this(values, DEFAULT_ZERO_TOLERANCE);__CLR4_4_1llzllzlb90p8zn.R.inc(28026);try{__CLR4_4_1llzllzlb90p8zn.R.inc(28025);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Create from an array, specifying zero tolerance.
     * Only non-zero entries will be stored.
     *
     * @param values Set of values to create from.
     * @param epsilon Tolerance below which a value is considered zero.
     */
    public OpenMapRealVector(double[] values, double epsilon) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28027);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28028);virtualSize = values.length;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28029);entries = new OpenIntToDoubleHashMap(0.0);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28030);this.epsilon = epsilon;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28031);for (int key = 0; (((key < values.length)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28032)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28033)==0&false)); key++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28034);double value = values[key];
            __CLR4_4_1llzllzlb90p8zn.R.inc(28035);if ((((!isDefaultValue(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28036)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28037)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28038);entries.put(key, value);
            }
        }}
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Create from an array.
     * Only non-zero entries will be stored.
     *
     * @param values The set of values to create from
     */
    public OpenMapRealVector(Double[] values) {
        this(values, DEFAULT_ZERO_TOLERANCE);__CLR4_4_1llzllzlb90p8zn.R.inc(28040);try{__CLR4_4_1llzllzlb90p8zn.R.inc(28039);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Create from an array.
     * Only non-zero entries will be stored.
     *
     * @param values Set of values to create from.
     * @param epsilon Tolerance below which a value is considered zero.
     */
    public OpenMapRealVector(Double[] values, double epsilon) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28041);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28042);virtualSize = values.length;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28043);entries = new OpenIntToDoubleHashMap(0.0);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28044);this.epsilon = epsilon;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28045);for (int key = 0; (((key < values.length)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28046)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28047)==0&false)); key++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28048);double value = values[key].doubleValue();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28049);if ((((!isDefaultValue(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28050)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28051)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28052);entries.put(key, value);
            }
        }}
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param v Instance to copy from.
     */
    public OpenMapRealVector(OpenMapRealVector v) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28053);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28054);virtualSize = v.getDimension();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28055);entries = new OpenIntToDoubleHashMap(v.getEntries());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28056);epsilon = v.epsilon;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Generic copy constructor.
     *
     * @param v Instance to copy from.
     */
    public OpenMapRealVector(RealVector v) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28057);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28058);virtualSize = v.getDimension();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28059);entries = new OpenIntToDoubleHashMap(0.0);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28060);epsilon = DEFAULT_ZERO_TOLERANCE;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28061);for (int key = 0; (((key < virtualSize)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28062)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28063)==0&false)); key++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28064);double value = v.getEntry(key);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28065);if ((((!isDefaultValue(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28066)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28067)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28068);entries.put(key, value);
            }
        }}
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Get the entries of this instance.
     *
     * @return the entries of this instance.
     */
    private OpenIntToDoubleHashMap getEntries() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28069);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28070);return entries;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Determine if this value is within epsilon of zero.
     *
     * @param value Value to test
     * @return {@code true} if this value is within epsilon to zero,
     * {@code false} otherwise.
     * @since 2.1
     */
    protected boolean isDefaultValue(double value) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28071);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28072);return FastMath.abs(value) < epsilon;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector add(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28073);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28074);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28075);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28076)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28077)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28078);return add((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28079);return super.add(v);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Optimized method to add two OpenMapRealVectors.
     * It copies the larger vector, then iterates over the smaller.
     *
     * @param v Vector to add.
     * @return the sum of {@code this} and {@code v}.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    public OpenMapRealVector add(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28080);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28081);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28082);boolean copyThis = entries.size() > v.entries.size();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28083);OpenMapRealVector res = (((copyThis )&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28084)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28085)==0&false))? this.copy() : v.copy();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28086);Iterator iter = (((copyThis )&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28087)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28088)==0&false))? v.entries.iterator() : entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28089);OpenIntToDoubleHashMap randomAccess = (((copyThis )&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28090)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28091)==0&false))? entries : v.entries;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28092);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28093)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28094)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28095);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28096);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28097);if ((((randomAccess.containsKey(key))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28098)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28099)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28100);res.setEntry(key, randomAccess.get(key) + iter.value());
            } }else {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28101);res.setEntry(key, iter.value());
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28102);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Optimized method to append a OpenMapRealVector.
     * @param v vector to append
     * @return The result of appending {@code v} to self
     */
    public OpenMapRealVector append(OpenMapRealVector v) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28103);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28104);OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28105);Iterator iter = v.entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28106);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28107)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28108)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28109);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28110);res.setEntry(iter.key() + virtualSize, iter.value());
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28111);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector append(RealVector v) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28112);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28113);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28114)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28115)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28116);return append((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28117);final OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
            __CLR4_4_1llzllzlb90p8zn.R.inc(28118);for (int i = 0; (((i < v.getDimension())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28119)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28120)==0&false)); i++) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28121);res.setEntry(i + virtualSize, v.getEntry(i));
            }
            }__CLR4_4_1llzllzlb90p8zn.R.inc(28122);return res;
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector append(double d) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28123);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28124);OpenMapRealVector res = new OpenMapRealVector(this, 1);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28125);res.setEntry(virtualSize, d);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28126);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 2.1
     */
    @Override
    public OpenMapRealVector copy() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28127);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28128);return new OpenMapRealVector(this);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Computes the dot product.
     * Note that the computation is now performed in the parent class: no
     * performance improvement is to be expected from this overloaded
     * method.
     * The previous implementation was buggy and cannot be easily fixed
     * (see MATH-795).
     *
     * @param v Vector.
     * @return the dot product of this vector with {@code v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     *
     * @deprecated as of 3.1 (to be removed in 4.0). The computation is
     * performed by the parent class. The method must be kept to maintain
     * backwards compatibility.
     */
    @Deprecated
    public double dotProduct(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28129);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28130);return dotProduct((RealVector) v);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector ebeDivide(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28131);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28132);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28133);OpenMapRealVector res = new OpenMapRealVector(this);
        /*
         * MATH-803: it is not sufficient to loop through non zero entries of
         * this only. Indeed, if this[i] = 0d and v[i] = 0d, then
         * this[i] / v[i] = NaN, and not 0d.
         */
        __CLR4_4_1llzllzlb90p8zn.R.inc(28134);final int n = getDimension();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28135);for (int i = 0; (((i < n)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28136)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28137)==0&false)); i++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28138);res.setEntry(i, this.getEntry(i) / v.getEntry(i));
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28139);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector ebeMultiply(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28140);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28141);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28142);OpenMapRealVector res = new OpenMapRealVector(this);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28143);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28144);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28145)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28146)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28147);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28148);res.setEntry(iter.key(), iter.value() * v.getEntry(iter.key()));
        }
        /*
         * MATH-803: the above loop assumes that 0d * x  = 0d for any double x,
         * which allows to consider only the non-zero entries of this. However,
         * this fails if this[i] == 0d and (v[i] = NaN or v[i] = Infinity).
         *
         * These special cases are handled below.
         */
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28149);if ((((v.isNaN() || v.isInfinite())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28150)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28151)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28152);final int n = getDimension();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28153);for (int i = 0; (((i < n)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28154)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28155)==0&false)); i++) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28156);final double y = v.getEntry(i);
                __CLR4_4_1llzllzlb90p8zn.R.inc(28157);if ((((Double.isNaN(y))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28158)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28159)==0&false))) {{
                    __CLR4_4_1llzllzlb90p8zn.R.inc(28160);res.setEntry(i, Double.NaN);
                } }else {__CLR4_4_1llzllzlb90p8zn.R.inc(28161);if ((((Double.isInfinite(y))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28162)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28163)==0&false))) {{
                    __CLR4_4_1llzllzlb90p8zn.R.inc(28164);final double x = this.getEntry(i);
                    __CLR4_4_1llzllzlb90p8zn.R.inc(28165);res.setEntry(i, x * y);
                }
            }}}
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28166);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector getSubVector(int index, int n)
        throws NotPositiveException, OutOfRangeException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28167);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28168);checkIndex(index);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28169);if ((((n < 0)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28170)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28171)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28172);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28173);checkIndex(index + n - 1);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28174);OpenMapRealVector res = new OpenMapRealVector(n);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28175);int end = index + n;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28176);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28177);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28178)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28179)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28180);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28181);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28182);if ((((key >= index && key < end)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28183)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28184)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28185);res.setEntry(key - index, iter.value());
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28186);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getDimension() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28187);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28188);return virtualSize;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Optimized method to compute distance.
     *
     * @param v Vector to compute distance to.
     * @return the distance from {@code this} and {@code v}.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    public double getDistance(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28189);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28190);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28191);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28192);double res = 0;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28193);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28194)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28195)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28196);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28197);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28198);double delta;
            __CLR4_4_1llzllzlb90p8zn.R.inc(28199);delta = iter.value() - v.getEntry(key);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28200);res += delta * delta;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28201);iter = v.getEntries().iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28202);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28203)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28204)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28205);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28206);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28207);if ((((!entries.containsKey(key))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28208)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28209)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28210);final double value = iter.value();
                __CLR4_4_1llzllzlb90p8zn.R.inc(28211);res += value * value;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28212);return FastMath.sqrt(res);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getDistance(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28213);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28214);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28215);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28216)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28217)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28218);return getDistance((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28219);return super.getDistance(v);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(int index) throws OutOfRangeException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28220);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28221);checkIndex(index);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28222);return entries.get(index);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Distance between two vectors.
     * This method computes the distance consistent with
     * L<sub>1</sub> norm, i.e. the sum of the absolute values of
     * elements differences.
     *
     * @param v Vector to which distance is requested.
     * @return distance between this vector and {@code v}.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    public double getL1Distance(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28223);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28224);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28225);double max = 0;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28226);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28227);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28228)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28229)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28230);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28231);double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
            __CLR4_4_1llzllzlb90p8zn.R.inc(28232);max += delta;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28233);iter = v.getEntries().iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28234);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28235)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28236)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28237);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28238);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28239);if ((((!entries.containsKey(key))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28240)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28241)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28242);double delta = FastMath.abs(iter.value());
                __CLR4_4_1llzllzlb90p8zn.R.inc(28243);max +=  FastMath.abs(delta);
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28244);return max;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getL1Distance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28245);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28246);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28247);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28248)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28249)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28250);return getL1Distance((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28251);return super.getL1Distance(v);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Optimized method to compute LInfDistance.
     *
     * @param v Vector to compute distance from.
     * @return the LInfDistance.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    private double getLInfDistance(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28252);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28253);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28254);double max = 0;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28255);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28256);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28257)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28258)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28259);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28260);double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
            __CLR4_4_1llzllzlb90p8zn.R.inc(28261);if ((((delta > max)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28262)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28263)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28264);max = delta;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28265);iter = v.getEntries().iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28266);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28267)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28268)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28269);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28270);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28271);if ((((!entries.containsKey(key) && iter.value() > max)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28272)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28273)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28274);max = iter.value();
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28275);return max;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getLInfDistance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28276);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28277);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28278);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28279)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28280)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28281);return getLInfDistance((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28282);return super.getLInfDistance(v);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean isInfinite() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28283);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28284);boolean infiniteFound = false;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28285);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28286);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28287)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28288)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28289);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28290);final double value = iter.value();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28291);if ((((Double.isNaN(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28292)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28293)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28294);return false;
            }
            }__CLR4_4_1llzllzlb90p8zn.R.inc(28295);if ((((Double.isInfinite(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28296)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28297)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28298);infiniteFound = true;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28299);return infiniteFound;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean isNaN() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28300);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28301);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28302);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28303)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28304)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28305);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28306);if ((((Double.isNaN(iter.value()))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28307)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28308)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28309);return true;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28310);return false;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector mapAdd(double d) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28311);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28312);return copy().mapAddToSelf(d);
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector mapAddToSelf(double d) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28313);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28314);for (int i = 0; (((i < virtualSize)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28315)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28316)==0&false)); i++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28317);setEntry(i, getEntry(i) + d);
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28318);return this;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(int index, double value)
        throws OutOfRangeException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28319);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28320);checkIndex(index);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28321);if ((((!isDefaultValue(value))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28322)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28323)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28324);entries.put(index, value);
        } }else {__CLR4_4_1llzllzlb90p8zn.R.inc(28325);if ((((entries.containsKey(index))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28326)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28327)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28328);entries.remove(index);
        }
    }}}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubVector(int index, RealVector v)
        throws OutOfRangeException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28329);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28330);checkIndex(index);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28331);checkIndex(index + v.getDimension() - 1);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28332);for (int i = 0; (((i < v.getDimension())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28333)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28334)==0&false)); i++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28335);setEntry(i + index, v.getEntry(i));
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void set(double value) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28336);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28337);for (int i = 0; (((i < virtualSize)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28338)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28339)==0&false)); i++) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28340);setEntry(i, value);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Optimized method to subtract OpenMapRealVectors.
     *
     * @param v Vector to subtract from {@code this}.
     * @return the difference of {@code this} and {@code v}.
     * @throws DimensionMismatchException if the dimensions do not match.
     */
    public OpenMapRealVector subtract(OpenMapRealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28341);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28342);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28343);OpenMapRealVector res = copy();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28344);Iterator iter = v.getEntries().iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28345);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28346)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28347)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28348);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28349);int key = iter.key();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28350);if ((((entries.containsKey(key))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28351)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28352)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28353);res.setEntry(key, entries.get(key) - iter.value());
            } }else {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28354);res.setEntry(key, -iter.value());
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28355);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector subtract(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28356);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28357);checkVectorDimensions(v.getDimension());
        __CLR4_4_1llzllzlb90p8zn.R.inc(28358);if ((((v instanceof OpenMapRealVector)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28359)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28360)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28361);return subtract((OpenMapRealVector) v);
        } }else {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28362);return super.subtract(v);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public OpenMapRealVector unitVector() throws MathArithmeticException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28363);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28364);OpenMapRealVector res = copy();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28365);res.unitize();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28366);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void unitize() throws MathArithmeticException {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28367);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28368);double norm = getNorm();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28369);if ((((isDefaultValue(norm))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28370)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28371)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28372);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28373);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28374);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28375)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28376)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28377);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28378);entries.put(iter.key(), iter.value() / norm);
        }
    }}finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] toArray() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28379);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28380);double[] res = new double[virtualSize];
        __CLR4_4_1llzllzlb90p8zn.R.inc(28381);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28382);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28383)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28384)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28385);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28386);res[iter.key()] = iter.value();
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28387);return res;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * Implementation Note: This works on exact values, and as a result
     * it is possible for {@code a.subtract(b)} to be the zero vector, while
     * {@code a.hashCode() != b.hashCode()}.
     */
    @Override
    public int hashCode() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28388);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28389);final int prime = 31;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28390);int result = 1;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28391);long temp;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28392);temp = Double.doubleToLongBits(epsilon);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28393);result = prime * result + (int) (temp ^ (temp >>> 32));
        __CLR4_4_1llzllzlb90p8zn.R.inc(28394);result = prime * result + virtualSize;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28395);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28396);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28397)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28398)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28399);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28400);temp = Double.doubleToLongBits(iter.value());
            __CLR4_4_1llzllzlb90p8zn.R.inc(28401);result = prime * result + (int) (temp ^ (temp >>32));
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28402);return result;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * Implementation Note: This performs an exact comparison, and as a result
     * it is possible for {@code a.subtract(b}} to be the zero vector, while
     * {@code  a.equals(b) == false}.
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28403);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28404);if ((((this == obj)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28405)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28406)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28407);return true;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28408);if ((((!(obj instanceof OpenMapRealVector))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28409)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28410)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28411);return false;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28412);OpenMapRealVector other = (OpenMapRealVector) obj;
        __CLR4_4_1llzllzlb90p8zn.R.inc(28413);if ((((virtualSize != other.virtualSize)&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28414)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28415)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28416);return false;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28417);if ((((Double.doubleToLongBits(epsilon) !=
            Double.doubleToLongBits(other.epsilon))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28418)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28419)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28420);return false;
        }
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28421);Iterator iter = entries.iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28422);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28423)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28424)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28425);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28426);double test = other.getEntry(iter.key());
            __CLR4_4_1llzllzlb90p8zn.R.inc(28427);if ((((Double.doubleToLongBits(test) != Double.doubleToLongBits(iter.value()))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28428)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28429)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28430);return false;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28431);iter = other.getEntries().iterator();
        __CLR4_4_1llzllzlb90p8zn.R.inc(28432);while ((((iter.hasNext())&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28433)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28434)==0&false))) {{
            __CLR4_4_1llzllzlb90p8zn.R.inc(28435);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28436);double test = iter.value();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28437);if ((((Double.doubleToLongBits(test) != Double.doubleToLongBits(getEntry(iter.key())))&&(__CLR4_4_1llzllzlb90p8zn.R.iget(28438)!=0|true))||(__CLR4_4_1llzllzlb90p8zn.R.iget(28439)==0&false))) {{
                __CLR4_4_1llzllzlb90p8zn.R.inc(28440);return false;
            }
        }}
        }__CLR4_4_1llzllzlb90p8zn.R.inc(28441);return true;
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     *
     * @return the percentage of none zero elements as a decimal percent.
     * @since 2.2
     */
    public double getSparsity() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28442);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28443);return (double)entries.size()/(double)getDimension();
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public java.util.Iterator<Entry> sparseIterator() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28444);
        __CLR4_4_1llzllzlb90p8zn.R.inc(28445);return new OpenMapSparseIterator();
    }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    /**
     * Implementation of {@code Entry} optimized for OpenMap.
     * This implementation does not allow arbitrary calls to {@code setIndex}
     * since the order in which entries are returned is undefined.
     */
    protected class OpenMapEntry extends Entry {
        /** Iterator pointing to the entry. */
        private final Iterator iter;

        /**
         * Build an entry from an iterator point to an element.
         *
         * @param iter Iterator pointing to the entry.
         */
        protected OpenMapEntry(Iterator iter) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28446);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28447);this.iter = iter;
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public double getValue() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28448);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28449);return iter.value();
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void setValue(double value) {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28450);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28451);entries.put(iter.key(), value);
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int getIndex() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28452);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28453);return iter.key();
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

    }

    /**
     * Iterator class to do iteration over just the non-zero elements.
     * This implementation is fail-fast, so cannot be used to modify
     * any zero element.
     */
    protected class OpenMapSparseIterator implements java.util.Iterator<Entry> {
        /** Underlying iterator. */
        private final Iterator iter;
        /** Current entry. */
        private final Entry current;

        /** Simple constructor. */
        protected OpenMapSparseIterator() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28454);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28455);iter = entries.iterator();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28456);current = new OpenMapEntry(iter);
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean hasNext() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28457);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28458);return iter.hasNext();
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Entry next() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28459);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28460);iter.advance();
            __CLR4_4_1llzllzlb90p8zn.R.inc(28461);return current;
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void remove() {try{__CLR4_4_1llzllzlb90p8zn.R.inc(28462);
            __CLR4_4_1llzllzlb90p8zn.R.inc(28463);throw new UnsupportedOperationException("Not supported");
        }finally{__CLR4_4_1llzllzlb90p8zn.R.flushNeeded();}}
    }
}
