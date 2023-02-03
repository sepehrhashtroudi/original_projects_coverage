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
import java.util.Iterator;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements the {@link RealVector} interface with a double array.
 * @version $Id$
 * @since 2.0
 */
public class ArrayRealVector extends RealVector implements Serializable {public static class __CLR4_4_1howhowlb90p8oh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,23446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -1097961340710804027L;
    /** Default format. */
    private static final RealVectorFormat DEFAULT_FORMAT = RealVectorFormat.getInstance();

    /** Entries of the vector. */
    private double data[];

    /**
     * Build a 0-length vector.
     * Zero-length vectors may be used to initialized construction of vectors
     * by data gathering. We start with zero-length and use either the {@link
     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor
     * or one of the {@code append} method ({@link #append(double)},
     * {@link #append(ArrayRealVector)}) to gather data into this vector.
     */
    public ArrayRealVector() {try{__CLR4_4_1howhowlb90p8oh.R.inc(22928);
        __CLR4_4_1howhowlb90p8oh.R.inc(22929);data = new double[0];
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector of zeroes.
     *
     * @param size Size of the vector.
     */
    public ArrayRealVector(int size) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22930);
        __CLR4_4_1howhowlb90p8oh.R.inc(22931);data = new double[size];
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector with preset values.
     *
     * @param size Size of the vector
     * @param preset All entries will be set with this value.
     */
    public ArrayRealVector(int size, double preset) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22932);
        __CLR4_4_1howhowlb90p8oh.R.inc(22933);data = new double[size];
        __CLR4_4_1howhowlb90p8oh.R.inc(22934);Arrays.fill(data, preset);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from an array, copying the input array.
     *
     * @param d Array.
     */
    public ArrayRealVector(double[] d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22935);
        __CLR4_4_1howhowlb90p8oh.R.inc(22936);data = d.clone();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Create a new ArrayRealVector using the input array as the underlying
     * data array.
     * If an array is built specially in order to be embedded in a
     * ArrayRealVector and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.
     *
     * @param d Data for the new vector.
     * @param copyArray if {@code true}, the input array will be copied,
     * otherwise it will be referenced.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #ArrayRealVector(double[])
     */
    public ArrayRealVector(double[] d, boolean copyArray)
        throws NullArgumentException {try{__CLR4_4_1howhowlb90p8oh.R.inc(22937);
        __CLR4_4_1howhowlb90p8oh.R.inc(22938);if ((((d == null)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22939)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22940)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22941);throw new NullArgumentException();
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22942);data = (((copyArray )&&(__CLR4_4_1howhowlb90p8oh.R.iget(22943)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22944)==0&false))? d.clone() :  d;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from part of a array.
     *
     * @param d Array.
     * @param pos Position of first entry.
     * @param size Number of entries to copy.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NumberIsTooLargeException if the size of {@code d} is less
     * than {@code pos + size}.
     */
    public ArrayRealVector(double[] d, int pos, int size)
        throws NullArgumentException, NumberIsTooLargeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(22945);
        __CLR4_4_1howhowlb90p8oh.R.inc(22946);if ((((d == null)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22947)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22948)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22949);throw new NullArgumentException();
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22950);if ((((d.length < pos + size)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22951)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22952)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22953);throw new NumberIsTooLargeException(pos + size, d.length, true);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22954);data = new double[size];
        __CLR4_4_1howhowlb90p8oh.R.inc(22955);System.arraycopy(d, pos, data, 0, size);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from an array.
     *
     * @param d Array of {@code Double}s.
     */
    public ArrayRealVector(Double[] d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22956);
        __CLR4_4_1howhowlb90p8oh.R.inc(22957);data = new double[d.length];
        __CLR4_4_1howhowlb90p8oh.R.inc(22958);for (int i = 0; (((i < d.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22959)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22960)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22961);data[i] = d[i].doubleValue();
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from part of an array.
     *
     * @param d Array.
     * @param pos Position of first entry.
     * @param size Number of entries to copy.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NumberIsTooLargeException if the size of {@code d} is less
     * than {@code pos + size}.
     */
    public ArrayRealVector(Double[] d, int pos, int size)
        throws NullArgumentException, NumberIsTooLargeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(22962);
        __CLR4_4_1howhowlb90p8oh.R.inc(22963);if ((((d == null)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22964)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22965)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22966);throw new NullArgumentException();
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22967);if ((((d.length < pos + size)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22968)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22969)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22970);throw new NumberIsTooLargeException(pos + size, d.length, true);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22971);data = new double[size];
        __CLR4_4_1howhowlb90p8oh.R.inc(22972);for (int i = pos; (((i < pos + size)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22973)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22974)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22975);data[i - pos] = d[i].doubleValue();
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector, using a deep copy.
     *
     * @param v vector to copy.
     * @throws NullArgumentException if {@code v} is {@code null}.
     */
    public ArrayRealVector(RealVector v) throws NullArgumentException {try{__CLR4_4_1howhowlb90p8oh.R.inc(22976);
        __CLR4_4_1howhowlb90p8oh.R.inc(22977);if ((((v == null)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22978)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22979)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22980);throw new NullArgumentException();
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(22981);data = new double[v.getDimension()];
        __CLR4_4_1howhowlb90p8oh.R.inc(22982);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(22983)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22984)==0&false)); ++i) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(22985);data[i] = v.getEntry(i);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector, using a deep copy.
     *
     * @param v Vector to copy.
     * @throws NullArgumentException if {@code v} is {@code null}.
     */
    public ArrayRealVector(ArrayRealVector v) throws NullArgumentException {
        this(v, true);__CLR4_4_1howhowlb90p8oh.R.inc(22987);try{__CLR4_4_1howhowlb90p8oh.R.inc(22986);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector from another vector.
     *
     * @param v Vector to copy.
     * @param deep If {@code true} perform a deep copy, otherwise perform a
     * shallow copy.
     */
    public ArrayRealVector(ArrayRealVector v, boolean deep) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22988);
        __CLR4_4_1howhowlb90p8oh.R.inc(22989);data = (((deep )&&(__CLR4_4_1howhowlb90p8oh.R.iget(22990)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(22991)==0&false))? v.data.clone() : v.data;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     */
    public ArrayRealVector(ArrayRealVector v1, ArrayRealVector v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22992);
        __CLR4_4_1howhowlb90p8oh.R.inc(22993);data = new double[v1.data.length + v2.data.length];
        __CLR4_4_1howhowlb90p8oh.R.inc(22994);System.arraycopy(v1.data, 0, data, 0, v1.data.length);
        __CLR4_4_1howhowlb90p8oh.R.inc(22995);System.arraycopy(v2.data, 0, data, v1.data.length, v2.data.length);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     */
    public ArrayRealVector(ArrayRealVector v1, RealVector v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(22996);
        __CLR4_4_1howhowlb90p8oh.R.inc(22997);final int l1 = v1.data.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(22998);final int l2 = v2.getDimension();
        __CLR4_4_1howhowlb90p8oh.R.inc(22999);data = new double[l1 + l2];
        __CLR4_4_1howhowlb90p8oh.R.inc(23000);System.arraycopy(v1.data, 0, data, 0, l1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23001);for (int i = 0; (((i < l2)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23002)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23003)==0&false)); ++i) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23004);data[l1 + i] = v2.getEntry(i);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     */
    public ArrayRealVector(RealVector v1, ArrayRealVector v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23005);
        __CLR4_4_1howhowlb90p8oh.R.inc(23006);final int l1 = v1.getDimension();
        __CLR4_4_1howhowlb90p8oh.R.inc(23007);final int l2 = v2.data.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(23008);data = new double[l1 + l2];
        __CLR4_4_1howhowlb90p8oh.R.inc(23009);for (int i = 0; (((i < l1)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23010)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23011)==0&false)); ++i) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23012);data[i] = v1.getEntry(i);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23013);System.arraycopy(v2.data, 0, data, l1, l2);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     */
    public ArrayRealVector(ArrayRealVector v1, double[] v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23014);
        __CLR4_4_1howhowlb90p8oh.R.inc(23015);final int l1 = v1.getDimension();
        __CLR4_4_1howhowlb90p8oh.R.inc(23016);final int l2 = v2.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(23017);data = new double[l1 + l2];
        __CLR4_4_1howhowlb90p8oh.R.inc(23018);System.arraycopy(v1.data, 0, data, 0, l1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23019);System.arraycopy(v2, 0, data, l1, l2);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 First vector (will be put in front of the new vector).
     * @param v2 Second vector (will be put at back of the new vector).
     */
    public ArrayRealVector(double[] v1, ArrayRealVector v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23020);
        __CLR4_4_1howhowlb90p8oh.R.inc(23021);final int l1 = v1.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(23022);final int l2 = v2.getDimension();
        __CLR4_4_1howhowlb90p8oh.R.inc(23023);data = new double[l1 + l2];
        __CLR4_4_1howhowlb90p8oh.R.inc(23024);System.arraycopy(v1, 0, data, 0, l1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23025);System.arraycopy(v2.data, 0, data, l1, l2);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending one vector to another vector.
     * @param v1 first vector (will be put in front of the new vector)
     * @param v2 second vector (will be put at back of the new vector)
     */
    public ArrayRealVector(double[] v1, double[] v2) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23026);
        __CLR4_4_1howhowlb90p8oh.R.inc(23027);final int l1 = v1.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(23028);final int l2 = v2.length;
        __CLR4_4_1howhowlb90p8oh.R.inc(23029);data = new double[l1 + l2];
        __CLR4_4_1howhowlb90p8oh.R.inc(23030);System.arraycopy(v1, 0, data, 0, l1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23031);System.arraycopy(v2, 0, data, l1, l2);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector copy() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23032);
        __CLR4_4_1howhowlb90p8oh.R.inc(23033);return new ArrayRealVector(this, true);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector add(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23034);
        __CLR4_4_1howhowlb90p8oh.R.inc(23035);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23036)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23037)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23038);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23039);final int dim = vData.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23040);checkVectorDimensions(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23041);ArrayRealVector result = new ArrayRealVector(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23042);double[] resultData = result.data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23043);for (int i = 0; (((i < dim)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23044)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23045)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23046);resultData[i] = data[i] + vData[i];
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23047);return result;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23048);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23049);double[] out = data.clone();
            __CLR4_4_1howhowlb90p8oh.R.inc(23050);Iterator<Entry> it = v.iterator();
            __CLR4_4_1howhowlb90p8oh.R.inc(23051);while ((((it.hasNext())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23052)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23053)==0&false))) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23054);final Entry e = it.next();
                __CLR4_4_1howhowlb90p8oh.R.inc(23055);out[e.getIndex()] += e.getValue();
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23056);return new ArrayRealVector(out, false);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector subtract(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23057);
        __CLR4_4_1howhowlb90p8oh.R.inc(23058);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23059)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23060)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23061);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23062);final int dim = vData.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23063);checkVectorDimensions(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23064);ArrayRealVector result = new ArrayRealVector(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23065);double[] resultData = result.data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23066);for (int i = 0; (((i < dim)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23067)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23068)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23069);resultData[i] = data[i] - vData[i];
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23070);return result;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23071);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23072);double[] out = data.clone();
            __CLR4_4_1howhowlb90p8oh.R.inc(23073);Iterator<Entry> it = v.iterator();
            __CLR4_4_1howhowlb90p8oh.R.inc(23074);while ((((it.hasNext())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23075)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23076)==0&false))) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23077);final Entry e = it.next();
                __CLR4_4_1howhowlb90p8oh.R.inc(23078);out[e.getIndex()] -= e.getValue();
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23079);return new ArrayRealVector(out, false);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector map(UnivariateFunction function) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23080);
        __CLR4_4_1howhowlb90p8oh.R.inc(23081);return copy().mapToSelf(function);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector mapToSelf(UnivariateFunction function) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23082);
        __CLR4_4_1howhowlb90p8oh.R.inc(23083);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23084)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23085)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23086);data[i] = function.value(data[i]);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23087);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector mapAddToSelf(double d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23088);
        __CLR4_4_1howhowlb90p8oh.R.inc(23089);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23090)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23091)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23092);data[i] = data[i] + d;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23093);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector mapSubtractToSelf(double d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23094);
        __CLR4_4_1howhowlb90p8oh.R.inc(23095);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23096)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23097)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23098);data[i] = data[i] - d;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23099);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector mapMultiplyToSelf(double d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23100);
        __CLR4_4_1howhowlb90p8oh.R.inc(23101);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23102)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23103)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23104);data[i] = data[i] * d;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23105);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector mapDivideToSelf(double d) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23106);
        __CLR4_4_1howhowlb90p8oh.R.inc(23107);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23108)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23109)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23110);data[i] = data[i] / d;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23111);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector ebeMultiply(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23112);
        __CLR4_4_1howhowlb90p8oh.R.inc(23113);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23114)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23115)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23116);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23117);final int dim = vData.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23118);checkVectorDimensions(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23119);ArrayRealVector result = new ArrayRealVector(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23120);double[] resultData = result.data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23121);for (int i = 0; (((i < dim)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23122)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23123)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23124);resultData[i] = data[i] * vData[i];
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23125);return result;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23126);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23127);double[] out = data.clone();
            __CLR4_4_1howhowlb90p8oh.R.inc(23128);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23129)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23130)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23131);out[i] *= v.getEntry(i);
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23132);return new ArrayRealVector(out, false);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector ebeDivide(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23133);
        __CLR4_4_1howhowlb90p8oh.R.inc(23134);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23135)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23136)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23137);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23138);final int dim = vData.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23139);checkVectorDimensions(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23140);ArrayRealVector result = new ArrayRealVector(dim);
            __CLR4_4_1howhowlb90p8oh.R.inc(23141);double[] resultData = result.data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23142);for (int i = 0; (((i < dim)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23143)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23144)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23145);resultData[i] = data[i] / vData[i];
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23146);return result;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23147);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23148);double[] out = data.clone();
            __CLR4_4_1howhowlb90p8oh.R.inc(23149);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23150)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23151)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23152);out[i] /= v.getEntry(i);
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23153);return new ArrayRealVector(out, false);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Get a reference to the underlying data array.
     * This method does not make a fresh copy of the underlying data.
     *
     * @return the array of entries.
     */
    public double[] getDataRef() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23154);
        __CLR4_4_1howhowlb90p8oh.R.inc(23155);return data;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double dotProduct(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23156);
        __CLR4_4_1howhowlb90p8oh.R.inc(23157);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23158)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23159)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23160);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23161);checkVectorDimensions(vData.length);
            __CLR4_4_1howhowlb90p8oh.R.inc(23162);double dot = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23163);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23164)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23165)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23166);dot += data[i] * vData[i];
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23167);return dot;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23168);return super.dotProduct(v);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getNorm() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23169);
        __CLR4_4_1howhowlb90p8oh.R.inc(23170);double sum = 0;
        __CLR4_4_1howhowlb90p8oh.R.inc(23171);for (double a : data) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23172);sum += a * a;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23173);return FastMath.sqrt(sum);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getL1Norm() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23174);
        __CLR4_4_1howhowlb90p8oh.R.inc(23175);double sum = 0;
        __CLR4_4_1howhowlb90p8oh.R.inc(23176);for (double a : data) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23177);sum += FastMath.abs(a);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23178);return sum;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getLInfNorm() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23179);
        __CLR4_4_1howhowlb90p8oh.R.inc(23180);double max = 0;
        __CLR4_4_1howhowlb90p8oh.R.inc(23181);for (double a : data) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23182);max = FastMath.max(max, FastMath.abs(a));
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23183);return max;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getDistance(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23184);
        __CLR4_4_1howhowlb90p8oh.R.inc(23185);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23186)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23187)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23188);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23189);checkVectorDimensions(vData.length);
            __CLR4_4_1howhowlb90p8oh.R.inc(23190);double sum = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23191);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23192)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23193)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23194);final double delta = data[i] - vData[i];
                __CLR4_4_1howhowlb90p8oh.R.inc(23195);sum += delta * delta;
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23196);return FastMath.sqrt(sum);
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23197);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23198);double sum = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23199);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23200)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23201)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23202);final double delta = data[i] - v.getEntry(i);
                __CLR4_4_1howhowlb90p8oh.R.inc(23203);sum += delta * delta;
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23204);return FastMath.sqrt(sum);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getL1Distance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23205);
        __CLR4_4_1howhowlb90p8oh.R.inc(23206);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23207)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23208)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23209);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23210);checkVectorDimensions(vData.length);
            __CLR4_4_1howhowlb90p8oh.R.inc(23211);double sum = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23212);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23213)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23214)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23215);final double delta = data[i] - vData[i];
                __CLR4_4_1howhowlb90p8oh.R.inc(23216);sum += FastMath.abs(delta);
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23217);return sum;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23218);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23219);double sum = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23220);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23221)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23222)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23223);final double delta = data[i] - v.getEntry(i);
                __CLR4_4_1howhowlb90p8oh.R.inc(23224);sum += FastMath.abs(delta);
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23225);return sum;
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getLInfDistance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23226);
        __CLR4_4_1howhowlb90p8oh.R.inc(23227);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23228)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23229)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23230);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23231);checkVectorDimensions(vData.length);
            __CLR4_4_1howhowlb90p8oh.R.inc(23232);double max = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23233);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23234)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23235)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23236);final double delta = data[i] - vData[i];
                __CLR4_4_1howhowlb90p8oh.R.inc(23237);max = FastMath.max(max, FastMath.abs(delta));
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23238);return max;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23239);checkVectorDimensions(v);
            __CLR4_4_1howhowlb90p8oh.R.inc(23240);double max = 0;
            __CLR4_4_1howhowlb90p8oh.R.inc(23241);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23242)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23243)==0&false)); ++i) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23244);final double delta = data[i] - v.getEntry(i);
                __CLR4_4_1howhowlb90p8oh.R.inc(23245);max = FastMath.max(max, FastMath.abs(delta));
            }
            }__CLR4_4_1howhowlb90p8oh.R.inc(23246);return max;
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealMatrix outerProduct(RealVector v) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23247);
        __CLR4_4_1howhowlb90p8oh.R.inc(23248);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23249)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23250)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23251);final double[] vData = ((ArrayRealVector) v).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23252);final int m = data.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23253);final int n = vData.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23254);final RealMatrix out = MatrixUtils.createRealMatrix(m, n);
            __CLR4_4_1howhowlb90p8oh.R.inc(23255);for (int i = 0; (((i < m)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23256)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23257)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23258);for (int j = 0; (((j < n)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23259)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23260)==0&false)); j++) {{
                    __CLR4_4_1howhowlb90p8oh.R.inc(23261);out.setEntry(i, j, data[i] * vData[j]);
                }
            }}
            }__CLR4_4_1howhowlb90p8oh.R.inc(23262);return out;
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23263);final int m = data.length;
            __CLR4_4_1howhowlb90p8oh.R.inc(23264);final int n = v.getDimension();
            __CLR4_4_1howhowlb90p8oh.R.inc(23265);final RealMatrix out = MatrixUtils.createRealMatrix(m, n);
            __CLR4_4_1howhowlb90p8oh.R.inc(23266);for (int i = 0; (((i < m)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23267)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23268)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23269);for (int j = 0; (((j < n)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23270)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23271)==0&false)); j++) {{
                    __CLR4_4_1howhowlb90p8oh.R.inc(23272);out.setEntry(i, j, data[i] * v.getEntry(j));
                }
            }}
            }__CLR4_4_1howhowlb90p8oh.R.inc(23273);return out;
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(int index) throws OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23274);
        __CLR4_4_1howhowlb90p8oh.R.inc(23275);try {
            __CLR4_4_1howhowlb90p8oh.R.inc(23276);return data[index];
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1howhowlb90p8oh.R.inc(23277);throw new OutOfRangeException(LocalizedFormats.INDEX, index, 0,
                getDimension() - 1);
        }
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getDimension() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23278);
        __CLR4_4_1howhowlb90p8oh.R.inc(23279);return data.length;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector append(RealVector v) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23280);
        __CLR4_4_1howhowlb90p8oh.R.inc(23281);try {
            __CLR4_4_1howhowlb90p8oh.R.inc(23282);return new ArrayRealVector(this, (ArrayRealVector) v);
        } catch (ClassCastException cce) {
            __CLR4_4_1howhowlb90p8oh.R.inc(23283);return new ArrayRealVector(this, v);
        }
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Construct a vector by appending a vector to this vector.
     *
     * @param v Vector to append to this one.
     * @return a new vector.
     */
    public ArrayRealVector append(ArrayRealVector v) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23284);
        __CLR4_4_1howhowlb90p8oh.R.inc(23285);return new ArrayRealVector(this, v);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector append(double in) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23286);
        __CLR4_4_1howhowlb90p8oh.R.inc(23287);final double[] out = new double[data.length + 1];
        __CLR4_4_1howhowlb90p8oh.R.inc(23288);System.arraycopy(data, 0, out, 0, data.length);
        __CLR4_4_1howhowlb90p8oh.R.inc(23289);out[data.length] = in;
        __CLR4_4_1howhowlb90p8oh.R.inc(23290);return new ArrayRealVector(out, false);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector getSubVector(int index, int n)
        throws OutOfRangeException, NotPositiveException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23291);
        __CLR4_4_1howhowlb90p8oh.R.inc(23292);if ((((n < 0)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23293)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23294)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23295);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23296);ArrayRealVector out = new ArrayRealVector(n);
        __CLR4_4_1howhowlb90p8oh.R.inc(23297);try {
            __CLR4_4_1howhowlb90p8oh.R.inc(23298);System.arraycopy(data, index, out.data, 0, n);
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1howhowlb90p8oh.R.inc(23299);checkIndex(index);
            __CLR4_4_1howhowlb90p8oh.R.inc(23300);checkIndex(index + n - 1);
        }
        __CLR4_4_1howhowlb90p8oh.R.inc(23301);return out;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(int index, double value) throws OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23302);
        __CLR4_4_1howhowlb90p8oh.R.inc(23303);try {
            __CLR4_4_1howhowlb90p8oh.R.inc(23304);data[index] = value;
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1howhowlb90p8oh.R.inc(23305);checkIndex(index);
        }
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(int index, double increment)
        throws OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23306);
        __CLR4_4_1howhowlb90p8oh.R.inc(23307);try {
        __CLR4_4_1howhowlb90p8oh.R.inc(23308);data[index] += increment;
        } catch(IndexOutOfBoundsException e){
            __CLR4_4_1howhowlb90p8oh.R.inc(23309);throw new OutOfRangeException(LocalizedFormats.INDEX,
                                          index, 0, data.length - 1);
        }
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubVector(int index, RealVector v)
        throws OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23310);
        __CLR4_4_1howhowlb90p8oh.R.inc(23311);if ((((v instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23312)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23313)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23314);setSubVector(index, ((ArrayRealVector) v).data);
        } }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23315);try {
                __CLR4_4_1howhowlb90p8oh.R.inc(23316);for (int i = index; (((i < index + v.getDimension())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23317)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23318)==0&false)); ++i) {{
                    __CLR4_4_1howhowlb90p8oh.R.inc(23319);data[i] = v.getEntry(i - index);
                }
            }} catch (IndexOutOfBoundsException e) {
                __CLR4_4_1howhowlb90p8oh.R.inc(23320);checkIndex(index);
                __CLR4_4_1howhowlb90p8oh.R.inc(23321);checkIndex(index + v.getDimension() - 1);
            }
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Set a set of consecutive elements.
     *
     * @param index Index of first element to be set.
     * @param v Vector containing the values to set.
     * @throws OutOfRangeException if the index is inconsistent with the vector
     * size.
     */
    public void setSubVector(int index, double[] v)
        throws OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23322);
        __CLR4_4_1howhowlb90p8oh.R.inc(23323);try {
            __CLR4_4_1howhowlb90p8oh.R.inc(23324);System.arraycopy(v, 0, data, index, v.length);
        } catch (IndexOutOfBoundsException e) {
            __CLR4_4_1howhowlb90p8oh.R.inc(23325);checkIndex(index);
            __CLR4_4_1howhowlb90p8oh.R.inc(23326);checkIndex(index + v.length - 1);
        }
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void set(double value) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23327);
        __CLR4_4_1howhowlb90p8oh.R.inc(23328);Arrays.fill(data, value);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] toArray(){try{__CLR4_4_1howhowlb90p8oh.R.inc(23329);
        __CLR4_4_1howhowlb90p8oh.R.inc(23330);return data.clone();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public String toString(){try{__CLR4_4_1howhowlb90p8oh.R.inc(23331);
        __CLR4_4_1howhowlb90p8oh.R.inc(23332);return DEFAULT_FORMAT.format(this);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Check if instance and specified vectors have the same dimension.
     *
     * @param v Vector to compare instance with.
     * @throws DimensionMismatchException if the vectors do not
     * have the same dimension.
     */
    @Override
    protected void checkVectorDimensions(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23333);
        __CLR4_4_1howhowlb90p8oh.R.inc(23334);checkVectorDimensions(v.getDimension());
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Check if instance dimension is equal to some expected value.
     *
     * @param n Expected dimension.
     * @throws DimensionMismatchException if the dimension is
     * inconsistent with vector size.
     */
    @Override
    protected void checkVectorDimensions(int n)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23335);
        __CLR4_4_1howhowlb90p8oh.R.inc(23336);if ((((data.length != n)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23337)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23338)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23339);throw new DimensionMismatchException(data.length, n);
        }
    }}finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Check if any coordinate of this vector is {@code NaN}.
     *
     * @return {@code true} if any coordinate of this vector is {@code NaN},
     * {@code false} otherwise.
     */
    @Override
    public boolean isNaN() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23340);
        __CLR4_4_1howhowlb90p8oh.R.inc(23341);for (double v : data) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23342);if ((((Double.isNaN(v))&&(__CLR4_4_1howhowlb90p8oh.R.iget(23343)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23344)==0&false))) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23345);return true;
            }
        }}
        }__CLR4_4_1howhowlb90p8oh.R.inc(23346);return false;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * Check whether any coordinate of this vector is infinite and none
     * are {@code NaN}.
     *
     * @return {@code true} if any coordinate of this vector is infinite and
     * none are {@code NaN}, {@code false} otherwise.
     */
    @Override
    public boolean isInfinite() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23347);
        __CLR4_4_1howhowlb90p8oh.R.inc(23348);if ((((isNaN())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23349)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23350)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23351);return false;
        }

        }__CLR4_4_1howhowlb90p8oh.R.inc(23352);for (double v : data) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23353);if ((((Double.isInfinite(v))&&(__CLR4_4_1howhowlb90p8oh.R.iget(23354)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23355)==0&false))) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23356);return true;
            }
        }}

        }__CLR4_4_1howhowlb90p8oh.R.inc(23357);return false;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23358);
        __CLR4_4_1howhowlb90p8oh.R.inc(23359);if ((((this == other)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23360)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23361)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23362);return true;
        }

        }__CLR4_4_1howhowlb90p8oh.R.inc(23363);if ((((!(other instanceof RealVector))&&(__CLR4_4_1howhowlb90p8oh.R.iget(23364)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23365)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23366);return false;
        }

        }__CLR4_4_1howhowlb90p8oh.R.inc(23367);RealVector rhs = (RealVector) other;
        __CLR4_4_1howhowlb90p8oh.R.inc(23368);if ((((data.length != rhs.getDimension())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23369)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23370)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23371);return false;
        }

        }__CLR4_4_1howhowlb90p8oh.R.inc(23372);if ((((rhs.isNaN())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23373)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23374)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23375);return this.isNaN();
        }

        }__CLR4_4_1howhowlb90p8oh.R.inc(23376);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23377)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23378)==0&false)); ++i) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23379);if ((((data[i] != rhs.getEntry(i))&&(__CLR4_4_1howhowlb90p8oh.R.iget(23380)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23381)==0&false))) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23382);return false;
            }
        }}
        }__CLR4_4_1howhowlb90p8oh.R.inc(23383);return true;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * {@inheritDoc} All {@code NaN} values have the same hash code.
     */
    @Override
    public int hashCode() {try{__CLR4_4_1howhowlb90p8oh.R.inc(23384);
        __CLR4_4_1howhowlb90p8oh.R.inc(23385);if ((((isNaN())&&(__CLR4_4_1howhowlb90p8oh.R.iget(23386)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23387)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23388);return 9;
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23389);return MathUtils.hash(data);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector combine(double a, double b, RealVector y)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23390);
        __CLR4_4_1howhowlb90p8oh.R.inc(23391);return copy().combineToSelf(a, b, y);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public ArrayRealVector combineToSelf(double a, double b, RealVector y)
        throws DimensionMismatchException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23392);
        __CLR4_4_1howhowlb90p8oh.R.inc(23393);if ((((y instanceof ArrayRealVector)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23394)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23395)==0&false))) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23396);final double[] yData = ((ArrayRealVector) y).data;
            __CLR4_4_1howhowlb90p8oh.R.inc(23397);checkVectorDimensions(yData.length);
            __CLR4_4_1howhowlb90p8oh.R.inc(23398);for (int i = 0; (((i < this.data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23399)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23400)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23401);data[i] = a * data[i] + b * yData[i];
            }
        }} }else {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23402);checkVectorDimensions(y);
            __CLR4_4_1howhowlb90p8oh.R.inc(23403);for (int i = 0; (((i < this.data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23404)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23405)==0&false)); i++) {{
                __CLR4_4_1howhowlb90p8oh.R.inc(23406);data[i] = a * data[i] + b * y.getEntry(i);
            }
        }}
        }__CLR4_4_1howhowlb90p8oh.R.inc(23407);return this;
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23408);
        __CLR4_4_1howhowlb90p8oh.R.inc(23409);visitor.start(data.length, 0, data.length - 1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23410);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23411)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23412)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23413);visitor.visit(i, data[i]);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23414);return visitor.end();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor,
        final int start, final int end) throws NumberIsTooSmallException,
        OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23415);
        __CLR4_4_1howhowlb90p8oh.R.inc(23416);checkIndices(start, end);
        __CLR4_4_1howhowlb90p8oh.R.inc(23417);visitor.start(data.length, start, end);
        __CLR4_4_1howhowlb90p8oh.R.inc(23418);for (int i = start; (((i <= end)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23419)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23420)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23421);visitor.visit(i, data[i]);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23422);return visitor.end();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * In this implementation, the optimized order is the default order.
     */
    @Override
    public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23423);
        __CLR4_4_1howhowlb90p8oh.R.inc(23424);return walkInDefaultOrder(visitor);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * In this implementation, the optimized order is the default order.
     */
    @Override
    public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor,
        final int start, final int end) throws NumberIsTooSmallException,
        OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23425);
        __CLR4_4_1howhowlb90p8oh.R.inc(23426);return walkInDefaultOrder(visitor, start, end);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInDefaultOrder(final RealVectorChangingVisitor visitor) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23427);
        __CLR4_4_1howhowlb90p8oh.R.inc(23428);visitor.start(data.length, 0, data.length - 1);
        __CLR4_4_1howhowlb90p8oh.R.inc(23429);for (int i = 0; (((i < data.length)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23430)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23431)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23432);data[i] = visitor.visit(i, data[i]);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23433);return visitor.end();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInDefaultOrder(final RealVectorChangingVisitor visitor,
        final int start, final int end) throws NumberIsTooSmallException,
        OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23434);
        __CLR4_4_1howhowlb90p8oh.R.inc(23435);checkIndices(start, end);
        __CLR4_4_1howhowlb90p8oh.R.inc(23436);visitor.start(data.length, start, end);
        __CLR4_4_1howhowlb90p8oh.R.inc(23437);for (int i = start; (((i <= end)&&(__CLR4_4_1howhowlb90p8oh.R.iget(23438)!=0|true))||(__CLR4_4_1howhowlb90p8oh.R.iget(23439)==0&false)); i++) {{
            __CLR4_4_1howhowlb90p8oh.R.inc(23440);data[i] = visitor.visit(i, data[i]);
        }
        }__CLR4_4_1howhowlb90p8oh.R.inc(23441);return visitor.end();
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * In this implementation, the optimized order is the default order.
     */
    @Override
    public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor) {try{__CLR4_4_1howhowlb90p8oh.R.inc(23442);
        __CLR4_4_1howhowlb90p8oh.R.inc(23443);return walkInDefaultOrder(visitor);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * In this implementation, the optimized order is the default order.
     */
    @Override
    public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor,
        final int start, final int end) throws NumberIsTooSmallException,
        OutOfRangeException {try{__CLR4_4_1howhowlb90p8oh.R.inc(23444);
        __CLR4_4_1howhowlb90p8oh.R.inc(23445);return walkInDefaultOrder(visitor, start, end);
    }finally{__CLR4_4_1howhowlb90p8oh.R.flushNeeded();}}
}
