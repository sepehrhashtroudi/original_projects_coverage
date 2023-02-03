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

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Class defining a real-valued vector with basic algebraic operations.
 * <p>
 * vector element indexing is 0-based -- e.g., {@code getEntry(0)}
 * returns the first element of the vector.
 * </p>
 * <p>
 * The {@code code map} and {@code mapToSelf} methods operate
 * on vectors element-wise, i.e. they perform the same operation (adding a scalar,
 * applying a function ...) on each element in turn. The {@code map}
 * versions create a new vector to hold the result and do not change the instance.
 * The {@code mapToSelf} version uses the instance itself to store the
 * results, so the instance is changed by this method. In all cases, the result
 * vector is returned by the methods, allowing the <i>fluent API</i>
 * style, like this:
 * </p>
 * <pre>
 *   RealVector result = v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));
 * </pre>
 *
 * @version $Id$
 * @since 2.1
 */
public abstract class RealVector {public static class __CLR4_4_1md3md3lb90p92c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,29452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Returns the size of the vector.
     *
     * @return the size of this vector.
     */
    public abstract int getDimension();

    /**
     * Return the entry at the specified index.
     *
     * @param index Index location of entry to be fetched.
     * @return the vector entry at {@code index}.
     * @throws OutOfRangeException if the index is not valid.
     * @see #setEntry(int, double)
     */
    public abstract double getEntry(int index) throws OutOfRangeException;

    /**
     * Set a single element.
     *
     * @param index element index.
     * @param value new value for the element.
     * @throws OutOfRangeException if the index is not valid.
     * @see #getEntry(int)
     */
    public abstract void setEntry(int index, double value)
        throws OutOfRangeException;

    /**
     * Change an entry at the specified index.
     *
     * @param index Index location of entry to be set.
     * @param increment Value to add to the vector entry.
     * @throws OutOfRangeException if the index is not valid.
     * @since 3.0
     */
    public void addToEntry(int index, double increment)
        throws OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(28983);
        __CLR4_4_1md3md3lb90p92c.R.inc(28984);setEntry(index, getEntry(index) + increment);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Construct a new vector by appending a vector to this vector.
     *
     * @param v vector to append to this one.
     * @return a new vector.
     */
    public abstract RealVector append(RealVector v);

    /**
     * Construct a new vector by appending a double to this vector.
     *
     * @param d double to append.
     * @return a new vector.
     */
    public abstract RealVector append(double d);

    /**
     * Get a subvector from consecutive elements.
     *
     * @param index index of first element.
     * @param n number of elements to be retrieved.
     * @return a vector containing n elements.
     * @throws OutOfRangeException if the index is not valid.
     * @throws NotPositiveException if the number of elements is not positive.
     */
    public abstract RealVector getSubVector(int index, int n)
        throws NotPositiveException, OutOfRangeException;

    /**
     * Set a sequence of consecutive elements.
     *
     * @param index index of first element to be set.
     * @param v vector containing the values to set.
     * @throws OutOfRangeException if the index is not valid.
     */
    public abstract void setSubVector(int index, RealVector v)
        throws OutOfRangeException;

    /**
     * Check whether any coordinate of this vector is {@code NaN}.
     *
     * @return {@code true} if any coordinate of this vector is {@code NaN},
     * {@code false} otherwise.
     */
    public abstract boolean isNaN();

    /**
     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.
     *
     * @return {@code true} if any coordinate of this vector is infinite and
     * none are {@code NaN}, {@code false} otherwise.
     */
    public abstract boolean isInfinite();

    /**
     * Check if instance and specified vectors have the same dimension.
     *
     * @param v Vector to compare instance with.
     * @throws DimensionMismatchException if the vectors do not
     * have the same dimension.
     */
    protected void checkVectorDimensions(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(28985);
        __CLR4_4_1md3md3lb90p92c.R.inc(28986);checkVectorDimensions(v.getDimension());
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Check if instance dimension is equal to some expected value.
     *
     * @param n Expected dimension.
     * @throws DimensionMismatchException if the dimension is
     * inconsistent with the vector size.
     */
    protected void checkVectorDimensions(int n)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(28987);
        __CLR4_4_1md3md3lb90p92c.R.inc(28988);int d = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(28989);if ((((d != n)&&(__CLR4_4_1md3md3lb90p92c.R.iget(28990)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(28991)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(28992);throw new DimensionMismatchException(d, n);
        }
    }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Check if an index is valid.
     *
     * @param index Index to check.
     * @exception OutOfRangeException if {@code index} is not valid.
     */
    protected void checkIndex(final int index) throws OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(28993);
        __CLR4_4_1md3md3lb90p92c.R.inc(28994);if ((((index < 0 ||
            index >= getDimension())&&(__CLR4_4_1md3md3lb90p92c.R.iget(28995)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(28996)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(28997);throw new OutOfRangeException(LocalizedFormats.INDEX,
                                          index, 0, getDimension() - 1);
        }
    }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Checks that the indices of a subvector are valid.
     *
     * @param start the index of the first entry of the subvector
     * @param end the index of the last entry of the subvector (inclusive)
     * @throws OutOfRangeException if {@code start} of {@code end} are not valid
     * @throws NumberIsTooSmallException if {@code end < start}
     * @since 3.1
     */
    protected void checkIndices(final int start, final int end)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(28998);
        __CLR4_4_1md3md3lb90p92c.R.inc(28999);final int dim = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29000);if (((((start < 0) || (start >= dim))&&(__CLR4_4_1md3md3lb90p92c.R.iget(29001)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29002)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29003);throw new OutOfRangeException(LocalizedFormats.INDEX, start, 0,
                                          dim - 1);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29004);if (((((end < 0) || (end >= dim))&&(__CLR4_4_1md3md3lb90p92c.R.iget(29005)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29006)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29007);throw new OutOfRangeException(LocalizedFormats.INDEX, end, 0,
                                          dim - 1);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29008);if ((((end < start)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29009)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29010)==0&false))) {{
            // TODO Use more specific error message
            __CLR4_4_1md3md3lb90p92c.R.inc(29011);throw new NumberIsTooSmallException(LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW,
                                                end, start, false);
        }
    }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Compute the sum of this vector and {@code v}.
     * Returns a new vector. Does not change instance data.
     *
     * @param v Vector to be added.
     * @return {@code this} + {@code v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     */
    public RealVector add(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29012);
        __CLR4_4_1md3md3lb90p92c.R.inc(29013);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29014);RealVector result = v.copy();
        __CLR4_4_1md3md3lb90p92c.R.inc(29015);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29016);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29017)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29018)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29019);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29020);final int index = e.getIndex();
            __CLR4_4_1md3md3lb90p92c.R.inc(29021);result.setEntry(index, e.getValue() + result.getEntry(index));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29022);return result;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Subtract {@code v} from this vector.
     * Returns a new vector. Does not change instance data.
     *
     * @param v Vector to be subtracted.
     * @return {@code this} - {@code v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     */
    public RealVector subtract(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29023);
        __CLR4_4_1md3md3lb90p92c.R.inc(29024);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29025);RealVector result = v.mapMultiply(-1d);
        __CLR4_4_1md3md3lb90p92c.R.inc(29026);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29027);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29028)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29029)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29030);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29031);final int index = e.getIndex();
            __CLR4_4_1md3md3lb90p92c.R.inc(29032);result.setEntry(index, e.getValue() + result.getEntry(index));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29033);return result;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Add a value to each entry.
     * Returns a new vector. Does not change instance data.
     *
     * @param d Value to be added to each entry.
     * @return {@code this} + {@code d}.
     */
    public RealVector mapAdd(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29034);
        __CLR4_4_1md3md3lb90p92c.R.inc(29035);return copy().mapAddToSelf(d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Add a value to each entry.
     * The instance is changed in-place.
     *
     * @param d Value to be added to each entry.
     * @return {@code this}.
     */
    public RealVector mapAddToSelf(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29036);
        __CLR4_4_1md3md3lb90p92c.R.inc(29037);if ((((d != 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29038)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29039)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29040);return mapToSelf(FunctionUtils.fix2ndArgument(new Add(), d));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29041);return this;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Returns a (deep) copy of this vector.
     *
     * @return a vector copy.
     */
    public abstract RealVector copy();

    /**
     * Compute the dot product of this vector with {@code v}.
     *
     * @param v Vector with which dot product should be computed
     * @return the scalar dot product between this instance and {@code v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     */
    public double dotProduct(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29042);
        __CLR4_4_1md3md3lb90p92c.R.inc(29043);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29044);double d = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29045);final int n = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29046);for (int i = 0; (((i < n)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29047)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29048)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29049);d += getEntry(i) * v.getEntry(i);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29050);return d;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Computes the cosine of the angle between this vector and the
     * argument.
     *
     * @param v Vector.
     * @return the cosine of the angle between this vector and {@code v}.
     * @throws MathArithmeticException if {@code this} or {@code v} is the null
     * vector
     * @throws DimensionMismatchException if the dimensions of {@code this} and
     * {@code v} do not match
     */
    public double cosine(RealVector v) throws DimensionMismatchException,
        MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29051);
        __CLR4_4_1md3md3lb90p92c.R.inc(29052);final double norm = getNorm();
        __CLR4_4_1md3md3lb90p92c.R.inc(29053);final double vNorm = v.getNorm();

        __CLR4_4_1md3md3lb90p92c.R.inc(29054);if ((((norm == 0 ||
            vNorm == 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29055)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29056)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29057);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29058);return dotProduct(v) / (norm * vNorm);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Element-by-element division.
     *
     * @param v Vector by which instance elements must be divided.
     * @return a vector containing this[i] / v[i] for all i.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     * @deprecated As of version 3.1, this method is deprecated, and will be
     * removed in version 4.0. This decision follows the discussion reported in
     * <a href="https://issues.apache.org/jira/browse/MATH-803?focusedCommentId=13399150#comment-13399150">MATH-803</a>.
     * Uses of this method involving sparse implementations of
     * {@link RealVector} might lead to wrong results. Since there is no
     * satisfactory correction to this bug, this method is deprecated. Users who
     * want to preserve this feature are advised to implement
     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for
     * the sake of efficiency).
     */
    @Deprecated
    public abstract RealVector ebeDivide(RealVector v)
        throws DimensionMismatchException;

    /**
     * Element-by-element multiplication.
     *
     * @param v Vector by which instance elements must be multiplied
     * @return a vector containing this[i] * v[i] for all i.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     * @deprecated As of version 3.1, this method is deprecated, and will be
     * removed in version 4.0. This decision follows the discussion reported in
     * <a href="https://issues.apache.org/jira/browse/MATH-803?focusedCommentId=13399150#comment-13399150">MATH-803</a>.
     * Uses of this method involving sparse implementations of
     * {@link RealVector} might lead to wrong results. Since there is no
     * satisfactory correction to this bug, this method is deprecated. Users who
     * want to preserve this feature are advised to implement
     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for
     * the sake of efficiency).
     */
    @Deprecated
    public abstract RealVector ebeMultiply(RealVector v)
        throws DimensionMismatchException;

    /**
     * Distance between two vectors.
     * <p>This method computes the distance consistent with the
     * L<sub>2</sub> norm, i.e. the square root of the sum of
     * element differences, or Euclidean distance.</p>
     *
     * @param v Vector to which distance is requested.
     * @return the distance between two vectors.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     * @see #getL1Distance(RealVector)
     * @see #getLInfDistance(RealVector)
     * @see #getNorm()
     */
    public double getDistance(RealVector v) throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29059);
        __CLR4_4_1md3md3lb90p92c.R.inc(29060);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29061);double d = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29062);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29063);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29064)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29065)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29066);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29067);final double diff = e.getValue() - v.getEntry(e.getIndex());
            __CLR4_4_1md3md3lb90p92c.R.inc(29068);d += diff * diff;
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29069);return FastMath.sqrt(d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Returns the L<sub>2</sub> norm of the vector.
     * <p>The L<sub>2</sub> norm is the root of the sum of
     * the squared elements.</p>
     *
     * @return the norm.
     * @see #getL1Norm()
     * @see #getLInfNorm()
     * @see #getDistance(RealVector)
     */
    public double getNorm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29070);
        __CLR4_4_1md3md3lb90p92c.R.inc(29071);double sum = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29072);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29073);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29074)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29075)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29076);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29077);final double value = e.getValue();
            __CLR4_4_1md3md3lb90p92c.R.inc(29078);sum += value * value;
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29079);return FastMath.sqrt(sum);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Returns the L<sub>1</sub> norm of the vector.
     * <p>The L<sub>1</sub> norm is the sum of the absolute
     * values of the elements.</p>
     *
     * @return the norm.
     * @see #getNorm()
     * @see #getLInfNorm()
     * @see #getL1Distance(RealVector)
     */
    public double getL1Norm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29080);
        __CLR4_4_1md3md3lb90p92c.R.inc(29081);double norm = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29082);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29083);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29084)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29085)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29086);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29087);norm += FastMath.abs(e.getValue());
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29088);return norm;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Returns the L<sub>&infin;</sub> norm of the vector.
     * <p>The L<sub>&infin;</sub> norm is the max of the absolute
     * values of the elements.</p>
     *
     * @return the norm.
     * @see #getNorm()
     * @see #getL1Norm()
     * @see #getLInfDistance(RealVector)
     */
    public double getLInfNorm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29089);
        __CLR4_4_1md3md3lb90p92c.R.inc(29090);double norm = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29091);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29092);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29093)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29094)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29095);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29096);norm = FastMath.max(norm, FastMath.abs(e.getValue()));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29097);return norm;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Distance between two vectors.
     * <p>This method computes the distance consistent with
     * L<sub>1</sub> norm, i.e. the sum of the absolute values of
     * the elements differences.</p>
     *
     * @param v Vector to which distance is requested.
     * @return the distance between two vectors.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     */
    public double getL1Distance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29098);
        __CLR4_4_1md3md3lb90p92c.R.inc(29099);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29100);double d = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29101);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29102);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29103)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29104)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29105);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29106);d += FastMath.abs(e.getValue() - v.getEntry(e.getIndex()));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29107);return d;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Distance between two vectors.
     * <p>This method computes the distance consistent with
     * L<sub>&infin;</sub> norm, i.e. the max of the absolute values of
     * element differences.</p>
     *
     * @param v Vector to which distance is requested.
     * @return the distance between two vectors.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     * @see #getDistance(RealVector)
     * @see #getL1Distance(RealVector)
     * @see #getLInfNorm()
     */
    public double getLInfDistance(RealVector v)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29108);
        __CLR4_4_1md3md3lb90p92c.R.inc(29109);checkVectorDimensions(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29110);double d = 0;
        __CLR4_4_1md3md3lb90p92c.R.inc(29111);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29112);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29113)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29114)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29115);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29116);d = FastMath.max(FastMath.abs(e.getValue() - v.getEntry(e.getIndex())), d);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29117);return d;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Get the index of the minimum entry.
     *
     * @return the index of the minimum entry or -1 if vector length is 0
     * or all entries are {@code NaN}.
     */
    public int getMinIndex() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29118);
        __CLR4_4_1md3md3lb90p92c.R.inc(29119);int minIndex    = -1;
        __CLR4_4_1md3md3lb90p92c.R.inc(29120);double minValue = Double.POSITIVE_INFINITY;
        __CLR4_4_1md3md3lb90p92c.R.inc(29121);Iterator<Entry> iterator = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29122);while ((((iterator.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29123)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29124)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29125);final Entry entry = iterator.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29126);if ((((entry.getValue() <= minValue)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29127)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29128)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29129);minIndex = entry.getIndex();
                __CLR4_4_1md3md3lb90p92c.R.inc(29130);minValue = entry.getValue();
            }
        }}
        }__CLR4_4_1md3md3lb90p92c.R.inc(29131);return minIndex;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Get the value of the minimum entry.
     *
     * @return the value of the minimum entry or {@code NaN} if all
     * entries are {@code NaN}.
     */
    public double getMinValue() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29132);
        __CLR4_4_1md3md3lb90p92c.R.inc(29133);final int minIndex = getMinIndex();
        __CLR4_4_1md3md3lb90p92c.R.inc(29134);return (((minIndex < 0 )&&(__CLR4_4_1md3md3lb90p92c.R.iget(29135)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29136)==0&false))? Double.NaN : getEntry(minIndex);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Get the index of the maximum entry.
     *
     * @return the index of the maximum entry or -1 if vector length is 0
     * or all entries are {@code NaN}
     */
    public int getMaxIndex() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29137);
        __CLR4_4_1md3md3lb90p92c.R.inc(29138);int maxIndex    = -1;
        __CLR4_4_1md3md3lb90p92c.R.inc(29139);double maxValue = Double.NEGATIVE_INFINITY;
        __CLR4_4_1md3md3lb90p92c.R.inc(29140);Iterator<Entry> iterator = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29141);while ((((iterator.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29142)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29143)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29144);final Entry entry = iterator.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29145);if ((((entry.getValue() >= maxValue)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29146)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29147)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29148);maxIndex = entry.getIndex();
                __CLR4_4_1md3md3lb90p92c.R.inc(29149);maxValue = entry.getValue();
            }
        }}
        }__CLR4_4_1md3md3lb90p92c.R.inc(29150);return maxIndex;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Get the value of the maximum entry.
     *
     * @return the value of the maximum entry or {@code NaN} if all
     * entries are {@code NaN}.
     */
    public double getMaxValue() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29151);
        __CLR4_4_1md3md3lb90p92c.R.inc(29152);final int maxIndex = getMaxIndex();
        __CLR4_4_1md3md3lb90p92c.R.inc(29153);return (((maxIndex < 0 )&&(__CLR4_4_1md3md3lb90p92c.R.iget(29154)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29155)==0&false))? Double.NaN : getEntry(maxIndex);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}


    /**
     * Multiply each entry by the argument. Returns a new vector.
     * Does not change instance data.
     *
     * @param d Multiplication factor.
     * @return {@code this} * {@code d}.
     */
    public RealVector mapMultiply(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29156);
        __CLR4_4_1md3md3lb90p92c.R.inc(29157);return copy().mapMultiplyToSelf(d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Multiply each entry.
     * The instance is changed in-place.
     *
     * @param d Multiplication factor.
     * @return {@code this}.
     */
    public RealVector mapMultiplyToSelf(double d){try{__CLR4_4_1md3md3lb90p92c.R.inc(29158);
        __CLR4_4_1md3md3lb90p92c.R.inc(29159);return mapToSelf(FunctionUtils.fix2ndArgument(new Multiply(), d));
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Subtract a value from each entry. Returns a new vector.
     * Does not change instance data.
     *
     * @param d Value to be subtracted.
     * @return {@code this} - {@code d}.
     */
    public RealVector mapSubtract(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29160);
        __CLR4_4_1md3md3lb90p92c.R.inc(29161);return copy().mapSubtractToSelf(d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Subtract a value from each entry.
     * The instance is changed in-place.
     *
     * @param d Value to be subtracted.
     * @return {@code this}.
     */
    public RealVector mapSubtractToSelf(double d){try{__CLR4_4_1md3md3lb90p92c.R.inc(29162);
        __CLR4_4_1md3md3lb90p92c.R.inc(29163);return mapAddToSelf(-d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Divide each entry by the argument. Returns a new vector.
     * Does not change instance data.
     *
     * @param d Value to divide by.
     * @return {@code this} / {@code d}.
     */
    public RealVector mapDivide(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29164);
        __CLR4_4_1md3md3lb90p92c.R.inc(29165);return copy().mapDivideToSelf(d);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Divide each entry by the argument.
     * The instance is changed in-place.
     *
     * @param d Value to divide by.
     * @return {@code this}.
     */
    public RealVector mapDivideToSelf(double d){try{__CLR4_4_1md3md3lb90p92c.R.inc(29166);
        __CLR4_4_1md3md3lb90p92c.R.inc(29167);return mapToSelf(FunctionUtils.fix2ndArgument(new Divide(), d));
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Compute the outer product.
     *
     * @param v Vector with which outer product should be computed.
     * @return the matrix outer product between this instance and {@code v}.
     */
    public RealMatrix outerProduct(RealVector v) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29168);
        __CLR4_4_1md3md3lb90p92c.R.inc(29169);final int m = this.getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29170);final int n = v.getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29171);final RealMatrix product;
        __CLR4_4_1md3md3lb90p92c.R.inc(29172);if ((((v instanceof SparseRealVector || this instanceof SparseRealVector)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29173)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29174)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29175);product = new OpenMapRealMatrix(m, n);
        } }else {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29176);product = new Array2DRowRealMatrix(m, n);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29177);for (int i = 0; (((i < m)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29178)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29179)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29180);for (int j = 0; (((j < n)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29181)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29182)==0&false)); j++) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29183);product.setEntry(i, j, this.getEntry(i) * v.getEntry(j));
            }
        }}
        }__CLR4_4_1md3md3lb90p92c.R.inc(29184);return product;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Find the orthogonal projection of this vector onto another vector.
     *
     * @param v vector onto which instance must be projected.
     * @return projection of the instance onto {@code v}.
     * @throws DimensionMismatchException if {@code v} is not the same size as
     * {@code this} vector.
     * @throws MathArithmeticException if {@code this} or {@code v} is the null
     * vector
     */
    public RealVector projection(final RealVector v)
        throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29185);
        __CLR4_4_1md3md3lb90p92c.R.inc(29186);final double norm2 = v.dotProduct(v);
        __CLR4_4_1md3md3lb90p92c.R.inc(29187);if ((((norm2 == 0.0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29188)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29189)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29190);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29191);return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Set all elements to a single value.
     *
     * @param value Single value to set for all elements.
     */
    public void set(double value) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29192);
        __CLR4_4_1md3md3lb90p92c.R.inc(29193);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29194);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29195)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29196)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29197);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29198);e.setValue(value);
        }
    }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Convert the vector to an array of {@code double}s.
     * The array is independent from this vector data: the elements
     * are copied.
     *
     * @return an array containing a copy of the vector elements.
     */
    public double[] toArray() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29199);
        __CLR4_4_1md3md3lb90p92c.R.inc(29200);int dim = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29201);double[] values = new double[dim];
        __CLR4_4_1md3md3lb90p92c.R.inc(29202);for (int i = 0; (((i < dim)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29203)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29204)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29205);values[i] = getEntry(i);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29206);return values;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Creates a unit vector pointing in the direction of this vector.
     * The instance is not changed by this method.
     *
     * @return a unit vector pointing in direction of this vector.
     * @throws MathArithmeticException if the norm is zero.
     */
    public RealVector unitVector() throws MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29207);
        __CLR4_4_1md3md3lb90p92c.R.inc(29208);final double norm = getNorm();
        __CLR4_4_1md3md3lb90p92c.R.inc(29209);if ((((norm == 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29210)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29211)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29212);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29213);return mapDivide(norm);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Converts this vector into a unit vector.
     * The instance itself is changed by this method.
     *
     * @throws MathArithmeticException if the norm is zero.
     */
    public void unitize() throws MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29214);
        __CLR4_4_1md3md3lb90p92c.R.inc(29215);final double norm = getNorm();
        __CLR4_4_1md3md3lb90p92c.R.inc(29216);if ((((norm == 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29217)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29218)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29219);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29220);mapDivideToSelf(getNorm());
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Create a sparse iterator over the vector, which may omit some entries.
     * Specialized implementations may choose to not iterate over all
     * dimensions, either because those values are unset, or are equal
     * to defaultValue(), or are small enough to be ignored for the
     * purposes of iteration. No guarantees are made about order of iteration.
     * In dense implementations, this method will often delegate to
     * {@link #iterator()}.
     *
     * <p>Note: derived classes are required to return an {@link Iterator} that
     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}
     * returns {@code true}.</p>
     *
     * @return a sparse iterator.
     * @deprecated As of 3.1, this method is deprecated, because its interface
     * is too confusing (see
     * <a href="https://issues.apache.org/jira/browse/MATH-875">JIRA MATH-875</a>).
     * This method will be completely removed in 4.0.
     */
    @Deprecated
    public Iterator<Entry> sparseIterator() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29221);
        __CLR4_4_1md3md3lb90p92c.R.inc(29222);return new SparseEntryIterator();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Generic dense iterator. Iteration is in increasing order
     * of the vector index.
     *
     * <p>Note: derived classes are required to return an {@link Iterator} that
     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}
     * returns {@code true}.</p>
     *
     * @return a dense iterator.
     */
    public Iterator<Entry> iterator() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29223);
        __CLR4_4_1md3md3lb90p92c.R.inc(29224);final int dim = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29225);return new Iterator<Entry>() {

            /** Current index. */
            private int i = 0;

            /** Current entry. */
            private Entry e = new Entry();

            /** {@inheritDoc} */
            public boolean hasNext() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29226);
                __CLR4_4_1md3md3lb90p92c.R.inc(29227);return i < dim;
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            public Entry next() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29228);
                __CLR4_4_1md3md3lb90p92c.R.inc(29229);if ((((i < dim)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29230)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29231)==0&false))) {{
                    __CLR4_4_1md3md3lb90p92c.R.inc(29232);e.setIndex(i++);
                    __CLR4_4_1md3md3lb90p92c.R.inc(29233);return e;
                } }else {{
                    __CLR4_4_1md3md3lb90p92c.R.inc(29234);throw new NoSuchElementException();
                }
            }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all circumstances.
             */
            public void remove() throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29235);
                __CLR4_4_1md3md3lb90p92c.R.inc(29236);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Acts as if implemented as:
     * <pre>
     *  return copy().mapToSelf(function);
     * </pre>
     * Returns a new vector. Does not change instance data.
     *
     * @param function Function to apply to each entry.
     * @return a new vector.
     */
    public RealVector map(UnivariateFunction function) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29237);
        __CLR4_4_1md3md3lb90p92c.R.inc(29238);return copy().mapToSelf(function);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Acts as if it is implemented as:
     * <pre>
     *  Entry e = null;
     *  for(Iterator<Entry> it = iterator(); it.hasNext(); e = it.next()) {
     *      e.setValue(function.value(e.getValue()));
     *  }
     * </pre>
     * Entries of this vector are modified in-place by this method.
     *
     * @param function Function to apply to each entry.
     * @return a reference to this vector.
     */
    public RealVector mapToSelf(UnivariateFunction function) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29239);
        __CLR4_4_1md3md3lb90p92c.R.inc(29240);Iterator<Entry> it = iterator();
        __CLR4_4_1md3md3lb90p92c.R.inc(29241);while ((((it.hasNext())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29242)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29243)==0&false))) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29244);final Entry e = it.next();
            __CLR4_4_1md3md3lb90p92c.R.inc(29245);e.setValue(function.value(e.getValue()));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29246);return this;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Returns a new vector representing {@code a * this + b * y}, the linear
     * combination of {@code this} and {@code y}.
     * Returns a new vector. Does not change instance data.
     *
     * @param a Coefficient of {@code this}.
     * @param b Coefficient of {@code y}.
     * @param y Vector with which {@code this} is linearly combined.
     * @return a vector containing {@code a * this[i] + b * y[i]} for all
     * {@code i}.
     * @throws DimensionMismatchException if {@code y} is not the same size as
     * {@code this} vector.
     */
    public RealVector combine(double a, double b, RealVector y)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29247);
        __CLR4_4_1md3md3lb90p92c.R.inc(29248);return copy().combineToSelf(a, b, y);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Updates {@code this} with the linear combination of {@code this} and
     * {@code y}.
     *
     * @param a Weight of {@code this}.
     * @param b Weight of {@code y}.
     * @param y Vector with which {@code this} is linearly combined.
     * @return {@code this}, with components equal to
     * {@code a * this[i] + b * y[i]} for all {@code i}.
     * @throws DimensionMismatchException if {@code y} is not the same size as
     * {@code this} vector.
     */
    public RealVector combineToSelf(double a, double b, RealVector y)
        throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29249);
        __CLR4_4_1md3md3lb90p92c.R.inc(29250);checkVectorDimensions(y);
        __CLR4_4_1md3md3lb90p92c.R.inc(29251);for (int i = 0; (((i < getDimension())&&(__CLR4_4_1md3md3lb90p92c.R.iget(29252)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29253)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29254);final double xi = getEntry(i);
            __CLR4_4_1md3md3lb90p92c.R.inc(29255);final double yi = y.getEntry(i);
            __CLR4_4_1md3md3lb90p92c.R.inc(29256);setEntry(i, a * xi + b * yi);
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29257);return this;
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (but does not alter) all entries of this vector in default order
     * (increasing index).
     *
     * @param visitor the visitor to be used to process the entries of this
     * vector
     * @return the value returned by {@link RealVectorPreservingVisitor#end()}
     * at the end of the walk
     * @since 3.1
     */
    public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29258);
        __CLR4_4_1md3md3lb90p92c.R.inc(29259);final int dim = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29260);visitor.start(dim, 0, dim - 1);
        __CLR4_4_1md3md3lb90p92c.R.inc(29261);for (int i = 0; (((i < dim)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29262)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29263)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29264);visitor.visit(i, getEntry(i));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29265);return visitor.end();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (but does not alter) some entries of this vector in default order
     * (increasing index).
     *
     * @param visitor visitor to be used to process the entries of this vector
     * @param start the index of the first entry to be visited
     * @param end the index of the last entry to be visited (inclusive)
     * @return the value returned by {@link RealVectorPreservingVisitor#end()}
     * at the end of the walk
     * @throws NumberIsTooSmallException if {@code end < start}.
     * @throws OutOfRangeException if the indices are not valid.
     * @since 3.1
     */
    public double walkInDefaultOrder(final RealVectorPreservingVisitor visitor,
                                     final int start, final int end)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29266);
        __CLR4_4_1md3md3lb90p92c.R.inc(29267);checkIndices(start, end);
        __CLR4_4_1md3md3lb90p92c.R.inc(29268);visitor.start(getDimension(), start, end);
        __CLR4_4_1md3md3lb90p92c.R.inc(29269);for (int i = start; (((i <= end)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29270)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29271)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29272);visitor.visit(i, getEntry(i));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29273);return visitor.end();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (but does not alter) all entries of this vector in optimized
     * order. The order in which the entries are visited is selected so as to
     * lead to the most efficient implementation; it might depend on the
     * concrete implementation of this abstract class.
     *
     * @param visitor the visitor to be used to process the entries of this
     * vector
     * @return the value returned by {@link RealVectorPreservingVisitor#end()}
     * at the end of the walk
     * @since 3.1
     */
    public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29274);
        __CLR4_4_1md3md3lb90p92c.R.inc(29275);return walkInDefaultOrder(visitor);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (but does not alter) some entries of this vector in optimized
     * order. The order in which the entries are visited is selected so as to
     * lead to the most efficient implementation; it might depend on the
     * concrete implementation of this abstract class.
     *
     * @param visitor visitor to be used to process the entries of this vector
     * @param start the index of the first entry to be visited
     * @param end the index of the last entry to be visited (inclusive)
     * @return the value returned by {@link RealVectorPreservingVisitor#end()}
     * at the end of the walk
     * @throws NumberIsTooSmallException if {@code end < start}.
     * @throws OutOfRangeException if the indices are not valid.
     * @since 3.1
     */
    public double walkInOptimizedOrder(final RealVectorPreservingVisitor visitor,
                                       final int start, final int end)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29276);
        __CLR4_4_1md3md3lb90p92c.R.inc(29277);return walkInDefaultOrder(visitor, start, end);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (and possibly alters) all entries of this vector in default order
     * (increasing index).
     *
     * @param visitor the visitor to be used to process and modify the entries
     * of this vector
     * @return the value returned by {@link RealVectorChangingVisitor#end()}
     * at the end of the walk
     * @since 3.1
     */
    public double walkInDefaultOrder(final RealVectorChangingVisitor visitor) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29278);
        __CLR4_4_1md3md3lb90p92c.R.inc(29279);final int dim = getDimension();
        __CLR4_4_1md3md3lb90p92c.R.inc(29280);visitor.start(dim, 0, dim - 1);
        __CLR4_4_1md3md3lb90p92c.R.inc(29281);for (int i = 0; (((i < dim)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29282)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29283)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29284);setEntry(i, visitor.visit(i, getEntry(i)));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29285);return visitor.end();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (and possibly alters) some entries of this vector in default order
     * (increasing index).
     *
     * @param visitor visitor to be used to process the entries of this vector
     * @param start the index of the first entry to be visited
     * @param end the index of the last entry to be visited (inclusive)
     * @return the value returned by {@link RealVectorChangingVisitor#end()}
     * at the end of the walk
     * @throws NumberIsTooSmallException if {@code end < start}.
     * @throws OutOfRangeException if the indices are not valid.
     * @since 3.1
     */
    public double walkInDefaultOrder(final RealVectorChangingVisitor visitor,
                              final int start, final int end)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29286);
        __CLR4_4_1md3md3lb90p92c.R.inc(29287);checkIndices(start, end);
        __CLR4_4_1md3md3lb90p92c.R.inc(29288);visitor.start(getDimension(), start, end);
        __CLR4_4_1md3md3lb90p92c.R.inc(29289);for (int i = start; (((i <= end)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29290)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29291)==0&false)); i++) {{
            __CLR4_4_1md3md3lb90p92c.R.inc(29292);setEntry(i, visitor.visit(i, getEntry(i)));
        }
        }__CLR4_4_1md3md3lb90p92c.R.inc(29293);return visitor.end();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (and possibly alters) all entries of this vector in optimized
     * order. The order in which the entries are visited is selected so as to
     * lead to the most efficient implementation; it might depend on the
     * concrete implementation of this abstract class.
     *
     * @param visitor the visitor to be used to process the entries of this
     * vector
     * @return the value returned by {@link RealVectorChangingVisitor#end()}
     * at the end of the walk
     * @since 3.1
     */
    public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29294);
        __CLR4_4_1md3md3lb90p92c.R.inc(29295);return walkInDefaultOrder(visitor);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * Visits (and possibly change) some entries of this vector in optimized
     * order. The order in which the entries are visited is selected so as to
     * lead to the most efficient implementation; it might depend on the
     * concrete implementation of this abstract class.
     *
     * @param visitor visitor to be used to process the entries of this vector
     * @param start the index of the first entry to be visited
     * @param end the index of the last entry to be visited (inclusive)
     * @return the value returned by {@link RealVectorChangingVisitor#end()}
     * at the end of the walk
     * @throws NumberIsTooSmallException if {@code end < start}.
     * @throws OutOfRangeException if the indices are not valid.
     * @since 3.1
     */
    public double walkInOptimizedOrder(final RealVectorChangingVisitor visitor,
                                       final int start, final int end)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29296);
        __CLR4_4_1md3md3lb90p92c.R.inc(29297);return walkInDefaultOrder(visitor, start, end);
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /** An entry in the vector. */
    protected class Entry {
        /** Index of this entry. */
        private int index;

        /** Simple constructor. */
        public Entry() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29298);
            __CLR4_4_1md3md3lb90p92c.R.inc(29299);setIndex(0);
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * Get the value of the entry.
         *
         * @return the value of the entry.
         */
        public double getValue() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29300);
            __CLR4_4_1md3md3lb90p92c.R.inc(29301);return getEntry(getIndex());
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * Set the value of the entry.
         *
         * @param value New value for the entry.
         */
        public void setValue(double value) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29302);
            __CLR4_4_1md3md3lb90p92c.R.inc(29303);setEntry(getIndex(), value);
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * Get the index of the entry.
         *
         * @return the index of the entry.
         */
        public int getIndex() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29304);
            __CLR4_4_1md3md3lb90p92c.R.inc(29305);return index;
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * Set the index of the entry.
         *
         * @param index New index for the entry.
         */
        public void setIndex(int index) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29306);
            __CLR4_4_1md3md3lb90p92c.R.inc(29307);this.index = index;
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
    }

    /**
     * <p>
     * Test for the equality of two real vectors. If all coordinates of two real
     * vectors are exactly the same, and none are {@code NaN}, the two real
     * vectors are considered to be equal. {@code NaN} coordinates are
     * considered to affect globally the vector and be equals to each other -
     * i.e, if either (or all) coordinates of the real vector are equal to
     * {@code NaN}, the real vector is equal to a vector with all {@code NaN}
     * coordinates.
     * </p>
     * <p>
     * This method <em>must</em> be overriden by concrete subclasses of
     * {@link RealVector} (the current implementation throws an exception).
     * </p>
     *
     * @param other Object to test for equality.
     * @return {@code true} if two vector objects are equal, {@code false} if
     * {@code other} is null, not an instance of {@code RealVector}, or
     * not equal to this {@code RealVector} instance.
     * @throws MathUnsupportedOperationException if this method is not
     * overridden.
     */
    @Override
    public boolean equals(Object other)
        throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29308);
        __CLR4_4_1md3md3lb90p92c.R.inc(29309);throw new MathUnsupportedOperationException();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * {@inheritDoc}. This method <em>must</em> be overriden by concrete
     * subclasses of {@link RealVector} (current implementation throws an
     * exception).
     *
     * @throws MathUnsupportedOperationException if this method is not
     * overridden.
     */
    @Override
    public int hashCode() throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29310);
        __CLR4_4_1md3md3lb90p92c.R.inc(29311);throw new MathUnsupportedOperationException();
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

    /**
     * This class should rarely be used, but is here to provide
     * a default implementation of sparseIterator(), which is implemented
     * by walking over the entries, skipping those whose values are the default one.
     *
     * Concrete subclasses which are SparseVector implementations should
     * make their own sparse iterator, rather than using this one.
     *
     * This implementation might be useful for ArrayRealVector, when expensive
     * operations which preserve the default value are to be done on the entries,
     * and the fraction of non-default values is small (i.e. someone took a
     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)
     *
     * @deprecated As of 3.1, this class is deprecated, see
     * <a href="https://issues.apache.org/jira/browse/MATH-875">JIRA MATH-875</a>.
     * This class will be completely removed in 4.0.

     */
    @Deprecated
    protected class SparseEntryIterator implements Iterator<Entry> {
        /** Dimension of the vector. */
        private final int dim;
        /** Last entry returned by {@link #next()}. */
        private Entry current;
        /** Next entry for {@link #next()} to return. */
        private Entry next;

        /** Simple constructor. */
        protected SparseEntryIterator() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29312);
            __CLR4_4_1md3md3lb90p92c.R.inc(29313);dim = getDimension();
            __CLR4_4_1md3md3lb90p92c.R.inc(29314);current = new Entry();
            __CLR4_4_1md3md3lb90p92c.R.inc(29315);next = new Entry();
            __CLR4_4_1md3md3lb90p92c.R.inc(29316);if ((((next.getValue() == 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29317)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29318)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29319);advance(next);
            }
        }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * Advance an entry up to the next nonzero one.
         *
         * @param e entry to advance.
         */
        protected void advance(Entry e) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29320);
            __CLR4_4_1md3md3lb90p92c.R.inc(29321);if ((((e == null)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29322)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29323)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29324);return;
            }
            }__CLR4_4_1md3md3lb90p92c.R.inc(29325);do {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29326);e.setIndex(e.getIndex() + 1);
            } }while ((((e.getIndex() < dim && e.getValue() == 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29327)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29328)==0&false)));
            __CLR4_4_1md3md3lb90p92c.R.inc(29329);if ((((e.getIndex() >= dim)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29330)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29331)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29332);e.setIndex(-1);
            }
        }}finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean hasNext() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29333);
            __CLR4_4_1md3md3lb90p92c.R.inc(29334);return next.getIndex() >= 0;
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Entry next() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29335);
            __CLR4_4_1md3md3lb90p92c.R.inc(29336);int index = next.getIndex();
            __CLR4_4_1md3md3lb90p92c.R.inc(29337);if ((((index < 0)&&(__CLR4_4_1md3md3lb90p92c.R.iget(29338)!=0|true))||(__CLR4_4_1md3md3lb90p92c.R.iget(29339)==0&false))) {{
                __CLR4_4_1md3md3lb90p92c.R.inc(29340);throw new NoSuchElementException();
            }
            }__CLR4_4_1md3md3lb90p92c.R.inc(29341);current.setIndex(index);
            __CLR4_4_1md3md3lb90p92c.R.inc(29342);advance(next);
            __CLR4_4_1md3md3lb90p92c.R.inc(29343);return current;
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         *
         * @throws MathUnsupportedOperationException in all circumstances.
         */
        public void remove() throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29344);
            __CLR4_4_1md3md3lb90p92c.R.inc(29345);throw new MathUnsupportedOperationException();
        }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
    }

    /**
     * Returns an unmodifiable view of the specified vector.
     * The returned vector has read-only access. An attempt to modify it will
     * result in a {@link MathUnsupportedOperationException}. However, the
     * returned vector is <em>not</em> immutable, since any modification of
     * {@code v} will also change the returned view.
     * For example, in the following piece of code
     * <pre>
     *     RealVector v = new ArrayRealVector(2);
     *     RealVector w = RealVector.unmodifiableRealVector(v);
     *     v.setEntry(0, 1.2);
     *     v.setEntry(1, -3.4);
     * </pre>
     * the changes will be seen in the {@code w} view of {@code v}.
     *
     * @param v Vector for which an unmodifiable view is to be returned.
     * @return an unmodifiable view of {@code v}.
     */
    public static RealVector unmodifiableRealVector(final RealVector v) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29346);
        /**
         * This anonymous class is an implementation of {@link RealVector}
         * with read-only access.
         * It wraps any {@link RealVector}, and exposes all methods which
         * do not modify it. Invoking methods which should normally result
         * in the modification of the calling {@link RealVector} results in
         * a {@link MathUnsupportedOperationException}. It should be noted
         * that {@link UnmodifiableVector} is <em>not</em> immutable.
         */
        __CLR4_4_1md3md3lb90p92c.R.inc(29347);return new RealVector() {
            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all circumstances.
             */
            @Override
            public RealVector mapToSelf(UnivariateFunction function)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29348);
                __CLR4_4_1md3md3lb90p92c.R.inc(29349);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector map(UnivariateFunction function) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29350);
                __CLR4_4_1md3md3lb90p92c.R.inc(29351);return v.map(function);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public Iterator<Entry> iterator() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29352);
                __CLR4_4_1md3md3lb90p92c.R.inc(29353);final Iterator<Entry> i = v.iterator();
                __CLR4_4_1md3md3lb90p92c.R.inc(29354);return new Iterator<Entry>() {
                    /** The current entry. */
                    private final UnmodifiableEntry e = new UnmodifiableEntry();

                    /** {@inheritDoc} */
                    public boolean hasNext() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29355);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29356);return i.hasNext();
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

                    /** {@inheritDoc} */
                    public Entry next() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29357);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29358);e.setIndex(i.next().getIndex());
                        __CLR4_4_1md3md3lb90p92c.R.inc(29359);return e;
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

                    /**
                     * {@inheritDoc}
                     *
                     * @throws MathUnsupportedOperationException in all
                     * circumstances.
                     */
                    public void remove() throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29360);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29361);throw new MathUnsupportedOperationException();
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
                };
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public Iterator<Entry> sparseIterator() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29362);
                __CLR4_4_1md3md3lb90p92c.R.inc(29363);final Iterator<Entry> i = v.sparseIterator();

                __CLR4_4_1md3md3lb90p92c.R.inc(29364);return new Iterator<Entry>() {
                    /** The current entry. */
                    private final UnmodifiableEntry e = new UnmodifiableEntry();

                    /** {@inheritDoc} */
                    public boolean hasNext() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29365);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29366);return i.hasNext();
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

                    /** {@inheritDoc} */
                    public Entry next() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29367);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29368);e.setIndex(i.next().getIndex());
                        __CLR4_4_1md3md3lb90p92c.R.inc(29369);return e;
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

                    /**
                     * {@inheritDoc}
                     *
                     * @throws MathUnsupportedOperationException in all
                     * circumstances.
                     */
                    public void remove()
                        throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29370);
                        __CLR4_4_1md3md3lb90p92c.R.inc(29371);throw new MathUnsupportedOperationException();
                    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
                };
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector copy() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29372);
                __CLR4_4_1md3md3lb90p92c.R.inc(29373);return v.copy();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector add(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29374);
                __CLR4_4_1md3md3lb90p92c.R.inc(29375);return v.add(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector subtract(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29376);
                __CLR4_4_1md3md3lb90p92c.R.inc(29377);return v.subtract(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector mapAdd(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29378);
                __CLR4_4_1md3md3lb90p92c.R.inc(29379);return v.mapAdd(d);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public RealVector mapAddToSelf(double d)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29380);
                __CLR4_4_1md3md3lb90p92c.R.inc(29381);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector mapSubtract(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29382);
                __CLR4_4_1md3md3lb90p92c.R.inc(29383);return v.mapSubtract(d);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public RealVector mapSubtractToSelf(double d)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29384);
                __CLR4_4_1md3md3lb90p92c.R.inc(29385);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector mapMultiply(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29386);
                __CLR4_4_1md3md3lb90p92c.R.inc(29387);return v.mapMultiply(d);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public RealVector mapMultiplyToSelf(double d)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29388);
                __CLR4_4_1md3md3lb90p92c.R.inc(29389);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector mapDivide(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29390);
                __CLR4_4_1md3md3lb90p92c.R.inc(29391);return v.mapDivide(d);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public RealVector mapDivideToSelf(double d)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29392);
                __CLR4_4_1md3md3lb90p92c.R.inc(29393);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector ebeMultiply(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29394);
                __CLR4_4_1md3md3lb90p92c.R.inc(29395);return v.ebeMultiply(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector ebeDivide(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29396);
                __CLR4_4_1md3md3lb90p92c.R.inc(29397);return v.ebeDivide(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double dotProduct(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29398);
                __CLR4_4_1md3md3lb90p92c.R.inc(29399);return v.dotProduct(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double cosine(RealVector w)
                throws DimensionMismatchException, MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29400);
                __CLR4_4_1md3md3lb90p92c.R.inc(29401);return v.cosine(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getNorm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29402);
                __CLR4_4_1md3md3lb90p92c.R.inc(29403);return v.getNorm();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getL1Norm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29404);
                __CLR4_4_1md3md3lb90p92c.R.inc(29405);return v.getL1Norm();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getLInfNorm() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29406);
                __CLR4_4_1md3md3lb90p92c.R.inc(29407);return v.getLInfNorm();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getDistance(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29408);
                __CLR4_4_1md3md3lb90p92c.R.inc(29409);return v.getDistance(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getL1Distance(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29410);
                __CLR4_4_1md3md3lb90p92c.R.inc(29411);return v.getL1Distance(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getLInfDistance(RealVector w)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29412);
                __CLR4_4_1md3md3lb90p92c.R.inc(29413);return v.getLInfDistance(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector unitVector() throws MathArithmeticException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29414);
                __CLR4_4_1md3md3lb90p92c.R.inc(29415);return v.unitVector();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public void unitize() throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29416);
                __CLR4_4_1md3md3lb90p92c.R.inc(29417);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealMatrix outerProduct(RealVector w) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29418);
                __CLR4_4_1md3md3lb90p92c.R.inc(29419);return v.outerProduct(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double getEntry(int index) throws OutOfRangeException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29420);
                __CLR4_4_1md3md3lb90p92c.R.inc(29421);return v.getEntry(index);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public void setEntry(int index, double value)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29422);
                __CLR4_4_1md3md3lb90p92c.R.inc(29423);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public void addToEntry(int index, double value)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29424);
                __CLR4_4_1md3md3lb90p92c.R.inc(29425);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public int getDimension() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29426);
                __CLR4_4_1md3md3lb90p92c.R.inc(29427);return v.getDimension();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector append(RealVector w) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29428);
                __CLR4_4_1md3md3lb90p92c.R.inc(29429);return v.append(w);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector append(double d) {try{__CLR4_4_1md3md3lb90p92c.R.inc(29430);
                __CLR4_4_1md3md3lb90p92c.R.inc(29431);return v.append(d);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector getSubVector(int index, int n)
                throws OutOfRangeException, NotPositiveException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29432);
                __CLR4_4_1md3md3lb90p92c.R.inc(29433);return v.getSubVector(index, n);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public void setSubVector(int index, RealVector w)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29434);
                __CLR4_4_1md3md3lb90p92c.R.inc(29435);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public void set(double value)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29436);
                __CLR4_4_1md3md3lb90p92c.R.inc(29437);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public double[] toArray() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29438);
                __CLR4_4_1md3md3lb90p92c.R.inc(29439);return v.toArray();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public boolean isNaN() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29440);
                __CLR4_4_1md3md3lb90p92c.R.inc(29441);return v.isNaN();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public boolean isInfinite() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29442);
                __CLR4_4_1md3md3lb90p92c.R.inc(29443);return v.isInfinite();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public RealVector combine(double a, double b, RealVector y)
                throws DimensionMismatchException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29444);
                __CLR4_4_1md3md3lb90p92c.R.inc(29445);return v.combine(a, b, y);
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /**
             * {@inheritDoc}
             *
             * @throws MathUnsupportedOperationException in all
             * circumstances.
             */
            @Override
            public RealVector combineToSelf(double a, double b, RealVector y)
                throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29446);
                __CLR4_4_1md3md3lb90p92c.R.inc(29447);throw new MathUnsupportedOperationException();
            }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

            /** An entry in the vector. */
            class UnmodifiableEntry extends Entry {
                /** {@inheritDoc} */
                @Override
                public double getValue() {try{__CLR4_4_1md3md3lb90p92c.R.inc(29448);
                    __CLR4_4_1md3md3lb90p92c.R.inc(29449);return v.getEntry(getIndex());
                }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}

                /**
                 * {@inheritDoc}
                 *
                 * @throws MathUnsupportedOperationException in all
                 * circumstances.
                 */
                @Override
                public void setValue(double value)
                    throws MathUnsupportedOperationException {try{__CLR4_4_1md3md3lb90p92c.R.inc(29450);
                    __CLR4_4_1md3md3lb90p92c.R.inc(29451);throw new MathUnsupportedOperationException();
                }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
            }
        };
    }finally{__CLR4_4_1md3md3lb90p92c.R.flushNeeded();}}
}
