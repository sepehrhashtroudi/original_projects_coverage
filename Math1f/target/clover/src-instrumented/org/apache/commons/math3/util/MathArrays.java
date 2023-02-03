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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Arrays utilities.
 *
 * @since 3.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class MathArrays {public static class __CLR4_4_119tz19tzlb90pb9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Factor used for splitting double numbers: n = 2^27 + 1 (i.e. {@value}). */
    private static final int SPLIT_FACTOR = 0x8000001;

    /**
     * Private constructor.
     */
    private MathArrays() {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59399);}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Real-valued function that operate on an array or a part of it.
     * @since 3.1
     */
    public interface Function {
        /**
         * Operates on an entire array.
         *
         * @param array Array to operate on.
         * @return the result of the operation.
         */
        double evaluate(double[] array);
        /**
         * @param array Array to operate on.
         * @param startIndex Index of the first element to take into account.
         * @param numElements Number of elements to take into account.
         * @return the result of the operation.
         */
        double evaluate(double[] array,
                        int startIndex,
                        int numElements);
    }

    /**
     * Create a copy of an array scaled by a value.
     *
     * @param arr Array to scale.
     * @param val Scalar.
     * @return scaled copy of array with each entry multiplied by val.
     * @since 3.2
     */
    public static double[] scale(double val, final double[] arr) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59400);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59401);double[] newArr = new double[arr.length];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59402);for (int i = 0; (((i < arr.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59403)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59404)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59405);newArr[i] = arr[i] * val;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59406);return newArr;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * <p>Multiply each element of an array by a value.</p>
     *
     * <p>The array is modified in place (no copy is created).</p>
     *
     * @param arr Array to scale
     * @param val Scalar
     * @since 3.2
     */
    public static void scaleInPlace(double val, final double[] arr) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59407);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59408);for (int i = 0; (((i < arr.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59409)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59410)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59411);arr[i] *= val;
        }
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Creates an array whose contents will be the element-by-element
     * addition of the arguments.
     *
     * @param a First term of the addition.
     * @param b Second term of the addition.
     * @return a new array {@code r} where {@code r[i] = a[i] + b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeAdd(double[] a, double[] b)
        throws DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59412);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59413);if ((((a.length != b.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59414)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59415)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59416);throw new DimensionMismatchException(a.length, b.length);
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59417);final double[] result = a.clone();
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59418);for (int i = 0; (((i < a.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59419)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59420)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59421);result[i] += b[i];
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59422);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
    /**
     * Creates an array whose contents will be the element-by-element
     * subtraction of the second argument from the first.
     *
     * @param a First term.
     * @param b Element to be subtracted.
     * @return a new array {@code r} where {@code r[i] = a[i] - b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeSubtract(double[] a, double[] b)
        throws DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59423);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59424);if ((((a.length != b.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59425)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59426)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59427);throw new DimensionMismatchException(a.length, b.length);
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59428);final double[] result = a.clone();
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59429);for (int i = 0; (((i < a.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59430)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59431)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59432);result[i] -= b[i];
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59433);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
    /**
     * Creates an array whose contents will be the element-by-element
     * multiplication of the arguments.
     *
     * @param a First factor of the multiplication.
     * @param b Second factor of the multiplication.
     * @return a new array {@code r} where {@code r[i] = a[i] * b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeMultiply(double[] a, double[] b)
        throws DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59434);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59435);if ((((a.length != b.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59436)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59437)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59438);throw new DimensionMismatchException(a.length, b.length);
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59439);final double[] result = a.clone();
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59440);for (int i = 0; (((i < a.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59441)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59442)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59443);result[i] *= b[i];
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59444);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
    /**
     * Creates an array whose contents will be the element-by-element
     * division of the first argument by the second.
     *
     * @param a Numerator of the division.
     * @param b Denominator of the division.
     * @return a new array {@code r} where {@code r[i] = a[i] / b[i]}.
     * @throws DimensionMismatchException if the array lengths differ.
     * @since 3.1
     */
    public static double[] ebeDivide(double[] a, double[] b)
        throws DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59445);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59446);if ((((a.length != b.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59447)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59448)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59449);throw new DimensionMismatchException(a.length, b.length);
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59450);final double[] result = a.clone();
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59451);for (int i = 0; (((i < a.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59452)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59453)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59454);result[i] /= b[i];
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59455);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>1</sub> (sum of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>1</sub> distance between the two points
     */
    public static double distance1(double[] p1, double[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59456);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59457);double sum = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59458);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59459)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59460)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59461);sum += FastMath.abs(p1[i] - p2[i]);
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59462);return sum;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>1</sub> (sum of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>1</sub> distance between the two points
     */
    public static int distance1(int[] p1, int[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59463);
      __CLR4_4_119tz19tzlb90pb9c.R.inc(59464);int sum = 0;
      __CLR4_4_119tz19tzlb90pb9c.R.inc(59465);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59466)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59467)==0&false)); i++) {{
          __CLR4_4_119tz19tzlb90pb9c.R.inc(59468);sum += FastMath.abs(p1[i] - p2[i]);
      }
      }__CLR4_4_119tz19tzlb90pb9c.R.inc(59469);return sum;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>2</sub> (Euclidean) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>2</sub> distance between the two points
     */
    public static double distance(double[] p1, double[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59470);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59471);double sum = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59472);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59473)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59474)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59475);final double dp = p1[i] - p2[i];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59476);sum += dp * dp;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59477);return FastMath.sqrt(sum);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>2</sub> (Euclidean) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>2</sub> distance between the two points
     */
    public static double distance(int[] p1, int[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59478);
      __CLR4_4_119tz19tzlb90pb9c.R.inc(59479);double sum = 0;
      __CLR4_4_119tz19tzlb90pb9c.R.inc(59480);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59481)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59482)==0&false)); i++) {{
          __CLR4_4_119tz19tzlb90pb9c.R.inc(59483);final double dp = p1[i] - p2[i];
          __CLR4_4_119tz19tzlb90pb9c.R.inc(59484);sum += dp * dp;
      }
      }__CLR4_4_119tz19tzlb90pb9c.R.inc(59485);return FastMath.sqrt(sum);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>&infin;</sub> (max of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>&infin;</sub> distance between the two points
     */
    public static double distanceInf(double[] p1, double[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59486);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59487);double max = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59488);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59489)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59490)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59491);max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59492);return max;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Calculates the L<sub>&infin;</sub> (max of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>&infin;</sub> distance between the two points
     */
    public static int distanceInf(int[] p1, int[] p2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59493);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59494);int max = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59495);for (int i = 0; (((i < p1.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59496)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59497)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59498);max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59499);return max;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Specification of ordering direction.
     */
    public static enum OrderDirection {
        /** Constant for increasing direction. */
        INCREASING,
        /** Constant for decreasing direction. */
        DECREASING
    }

    /**
     * Check that an array is monotonically increasing or decreasing.
     *
     * @param <T> the type of the elements in the specified array
     * @param val Values.
     * @param dir Ordering direction.
     * @param strict Whether the order should be strict.
     * @return {@code true} if sorted, {@code false} otherwise.
     */
    public static  <T extends Comparable<? super T>> boolean isMonotonic(T[] val,
                                      OrderDirection dir,
                                      boolean strict) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59500);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59501);T previous = val[0];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59502);final int max = val.length;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59503);for (int i = 1; (((i < max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59504)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59505)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59506);final int comp;
            boolean __CLB4_4_1_bool0=false;__CLR4_4_119tz19tzlb90pb9c.R.inc(59507);switch (dir) {
            case INCREASING:if (!__CLB4_4_1_bool0) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59508);__CLB4_4_1_bool0=true;}
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59509);comp = previous.compareTo(val[i]);
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59510);if ((((strict)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59511)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59512)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59513);if ((((comp >= 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59514)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59515)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59516);return false;
                    }
                }} }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59517);if ((((comp > 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59518)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59519)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59520);return false;
                    }
                }}
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(59521);break;
            case DECREASING:if (!__CLB4_4_1_bool0) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59522);__CLB4_4_1_bool0=true;}
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59523);comp = val[i].compareTo(previous);
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59524);if ((((strict)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59525)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59526)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59527);if ((((comp >= 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59528)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59529)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59530);return false;
                    }
                }} }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59531);if ((((comp > 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59532)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59533)==0&false))) {{
                       __CLR4_4_119tz19tzlb90pb9c.R.inc(59534);return false;
                    }
                }}
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(59535);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59536);__CLB4_4_1_bool0=true;}
                // Should never happen.
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59537);throw new MathInternalError();
            }

            __CLR4_4_119tz19tzlb90pb9c.R.inc(59538);previous = val[i];
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59539);return true;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that an array is monotonically increasing or decreasing.
     *
     * @param val Values.
     * @param dir Ordering direction.
     * @param strict Whether the order should be strict.
     * @return {@code true} if sorted, {@code false} otherwise.
     */
    public static boolean isMonotonic(double[] val, OrderDirection dir, boolean strict) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59540);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59541);return checkOrder(val, dir, strict, false);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that the given array is sorted.
     *
     * @param val Values.
     * @param dir Ordering direction.
     * @param strict Whether the order should be strict.
     * @param abort Whether to throw an exception if the check fails.
     * @return {@code true} if the array is sorted.
     * @throws NonMonotonicSequenceException if the array is not sorted
     * and {@code abort} is {@code true}.
     */
    public static boolean checkOrder(double[] val, OrderDirection dir,
                                     boolean strict, boolean abort)
        throws NonMonotonicSequenceException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59542);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59543);double previous = val[0];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59544);final int max = val.length;

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59545);int index;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59546);ITEM:
        for (index = 1; (((index < max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59547)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59548)==0&false)); index++) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_119tz19tzlb90pb9c.R.inc(59549);switch (dir) {
            case INCREASING:if (!__CLB4_4_1_bool1) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59550);__CLB4_4_1_bool1=true;}
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59551);if ((((strict)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59552)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59553)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59554);if ((((val[index] <= previous)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59555)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59556)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59557);break ITEM;
                    }
                }} }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59558);if ((((val[index] < previous)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59559)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59560)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59561);break ITEM;
                    }
                }}
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(59562);break;
            case DECREASING:if (!__CLB4_4_1_bool1) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59563);__CLB4_4_1_bool1=true;}
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59564);if ((((strict)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59565)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59566)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59567);if ((((val[index] >= previous)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59568)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59569)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59570);break ITEM;
                    }
                }} }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59571);if ((((val[index] > previous)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59572)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59573)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59574);break ITEM;
                    }
                }}
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(59575);break;
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_119tz19tzlb90pb9c.R.inc(59576);__CLB4_4_1_bool1=true;}
                // Should never happen.
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59577);throw new MathInternalError();
            }

            __CLR4_4_119tz19tzlb90pb9c.R.inc(59578);previous = val[index];
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59579);if ((((index == max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59580)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59581)==0&false))) {{
            // Loop completed.
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59582);return true;
        }

        // Loop early exit means wrong ordering.
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59583);if ((((abort)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59584)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59585)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59586);throw new NonMonotonicSequenceException(val[index], previous, index, dir, strict);
        } }else {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59587);return false;
        }
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that the given array is sorted.
     *
     * @param val Values.
     * @param dir Ordering direction.
     * @param strict Whether the order should be strict.
     * @throws NonMonotonicSequenceException if the array is not sorted.
     * @since 2.2
     */
    public static void checkOrder(double[] val, OrderDirection dir,
                                  boolean strict) throws NonMonotonicSequenceException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59588);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59589);checkOrder(val, dir, strict, true);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that the given array is sorted in strictly increasing order.
     *
     * @param val Values.
     * @throws NonMonotonicSequenceException if the array is not sorted.
     * @since 2.2
     */
    public static void checkOrder(double[] val) throws NonMonotonicSequenceException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59590);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59591);checkOrder(val, OrderDirection.INCREASING, true);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Throws DimensionMismatchException if the input array is not rectangular.
     *
     * @param in array to be tested
     * @throws NullArgumentException if input array is null
     * @throws DimensionMismatchException if input array is not rectangular
     * @since 3.1
     */
    public static void checkRectangular(final long[][] in)
        throws NullArgumentException, DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59592);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59593);MathUtils.checkNotNull(in);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59594);for (int i = 1; (((i < in.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59595)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59596)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59597);if ((((in[i].length != in[0].length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59598)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59599)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59600);throw new DimensionMismatchException(
                        LocalizedFormats.DIFFERENT_ROWS_LENGTHS,
                        in[i].length, in[0].length);
            }
        }}
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that all entries of the input array are strictly positive.
     *
     * @param in Array to be tested
     * @throws NotStrictlyPositiveException if any entries of the array are not
     * strictly positive.
     * @since 3.1
     */
    public static void checkPositive(final double[] in)
        throws NotStrictlyPositiveException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59601);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59602);for (int i = 0; (((i < in.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59603)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59604)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59605);if ((((in[i] <= 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59606)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59607)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59608);throw new NotStrictlyPositiveException(in[i]);
            }
        }}
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check that all entries of the input array are >= 0.
     *
     * @param in Array to be tested
     * @throws NotPositiveException if any array entries are less than 0.
     * @since 3.1
     */
    public static void checkNonNegative(final long[] in)
        throws NotPositiveException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59609);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59610);for (int i = 0; (((i < in.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59611)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59612)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59613);if ((((in[i] < 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59614)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59615)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59616);throw new NotPositiveException(in[i]);
            }
        }}
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Check all entries of the input array are >= 0.
     *
     * @param in Array to be tested
     * @throws NotPositiveException if any array entries are less than 0.
     * @since 3.1
     */
    public static void checkNonNegative(final long[][] in)
        throws NotPositiveException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59617);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59618);for (int i = 0; (((i < in.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59619)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59620)==0&false)); i ++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59621);for (int j = 0; (((j < in[i].length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59622)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59623)==0&false)); j++) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59624);if ((((in[i][j] < 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59625)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59626)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59627);throw new NotPositiveException(in[i][j]);
                }
            }}
        }}
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.
     * Translation of the minpack enorm subroutine.
     *
     * The redistribution policy for MINPACK is available
     * <a href="http://www.netlib.org/minpack/disclaimer">here</a>, for
     * convenience, it is reproduced below.</p>
     *
     * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
     * <tr><td>
     *    Minpack Copyright Notice (1999) University of Chicago.
     *    All rights reserved
     * </td></tr>
     * <tr><td>
     * Redistribution and use in source and binary forms, with or without
     * modification, are permitted provided that the following conditions
     * are met:
     * <ol>
     *  <li>Redistributions of source code must retain the above copyright
     *      notice, this list of conditions and the following disclaimer.</li>
     * <li>Redistributions in binary form must reproduce the above
     *     copyright notice, this list of conditions and the following
     *     disclaimer in the documentation and/or other materials provided
     *     with the distribution.</li>
     * <li>The end-user documentation included with the redistribution, if any,
     *     must include the following acknowledgment:
     *     {@code This product includes software developed by the University of
     *           Chicago, as Operator of Argonne National Laboratory.}
     *     Alternately, this acknowledgment may appear in the software itself,
     *     if and wherever such third-party acknowledgments normally appear.</li>
     * <li><strong>WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED "AS IS"
     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
     *     BE CORRECTED.</strong></li>
     * <li><strong>LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.</strong></li>
     * <ol></td></tr>
     * </table>
     *
     * @param v Vector of doubles.
     * @return the 2-norm of the vector.
     * @since 2.2
     */
    public static double safeNorm(double[] v) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59628);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59629);double rdwarf = 3.834e-20;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59630);double rgiant = 1.304e+19;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59631);double s1 = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59632);double s2 = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59633);double s3 = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59634);double x1max = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59635);double x3max = 0;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59636);double floatn = v.length;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59637);double agiant = rgiant / floatn;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59638);for (int i = 0; (((i < v.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59639)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59640)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59641);double xabs = Math.abs(v[i]);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59642);if ((((xabs < rdwarf || xabs > agiant)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59643)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59644)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59645);if ((((xabs > rdwarf)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59646)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59647)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59648);if ((((xabs > x1max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59649)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59650)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59651);double r = x1max / xabs;
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59652);s1= 1 + s1 * r * r;
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59653);x1max = xabs;
                    } }else {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59654);double r = xabs / x1max;
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59655);s1 += r * r;
                    }
                }} }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59656);if ((((xabs > x3max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59657)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59658)==0&false))) {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59659);double r = x3max / xabs;
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59660);s3= 1 + s3 * r * r;
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59661);x3max = xabs;
                    } }else {{
                        __CLR4_4_119tz19tzlb90pb9c.R.inc(59662);if ((((xabs != 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59663)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59664)==0&false))) {{
                            __CLR4_4_119tz19tzlb90pb9c.R.inc(59665);double r = xabs / x3max;
                            __CLR4_4_119tz19tzlb90pb9c.R.inc(59666);s3 += r * r;
                        }
                    }}
                }}
            }} }else {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59667);s2 += xabs * xabs;
            }
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59668);double norm;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59669);if ((((s1 != 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59670)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59671)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59672);norm = x1max * Math.sqrt(s1 + (s2 / x1max) / x1max);
        } }else {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59673);if ((((s2 == 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59674)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59675)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59676);norm = x3max * Math.sqrt(s3);
            } }else {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59677);if ((((s2 >= x3max)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59678)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59679)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59680);norm = Math.sqrt(s2 * (1 + (x3max / s2) * (x3max * s3)));
                } }else {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(59681);norm = Math.sqrt(x3max * ((s2 / x3max) + (x3max * s3)));
                }
            }}
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59682);return norm;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Sort an array in ascending order in place and perform the same reordering
     * of entries on other arrays. For example, if
     * {@code x = [3, 1, 2], y = [1, 2, 3]} and {@code z = [0, 5, 7]}, then
     * {@code sortInPlace(x, y, z)} will update {@code x} to {@code [1, 2, 3]},
     * {@code y} to {@code [2, 3, 1]} and {@code z} to {@code [5, 7, 0]}.
     *
     * @param x Array to be sorted and used as a pattern for permutation
     * of the other arrays.
     * @param yList Set of arrays whose permutations of entries will follow
     * those performed on {@code x}.
     * @throws DimensionMismatchException if any {@code y} is not the same
     * size as {@code x}.
     * @throws NullArgumentException if {@code x} or any {@code y} is null.
     * @since 3.0
     */
    public static void sortInPlace(double[] x, double[] ... yList)
        throws DimensionMismatchException, NullArgumentException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59683);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59684);sortInPlace(x, OrderDirection.INCREASING, yList);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Sort an array in place and perform the same reordering of entries on
     * other arrays.  This method works the same as the other
     * {@link #sortInPlace(double[], double[][]) sortInPlace} method, but
     * allows the order of the sort to be provided in the {@code dir}
     * parameter.
     *
     * @param x Array to be sorted and used as a pattern for permutation
     * of the other arrays.
     * @param dir Order direction.
     * @param yList Set of arrays whose permutations of entries will follow
     * those performed on {@code x}.
     * @throws DimensionMismatchException if any {@code y} is not the same
     * size as {@code x}.
     * @throws NullArgumentException if {@code x} or any {@code y} is null
     * @since 3.0
     */
    public static void sortInPlace(double[] x,
                                   final OrderDirection dir,
                                   double[] ... yList)
        throws NullArgumentException,
               DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59685);

        // Consistency checks.
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59686);if ((((x == null)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59687)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59688)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59689);throw new NullArgumentException();
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59690);final int yListLen = yList.length;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59691);final int len = x.length;

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59692);for (int j = 0; (((j < yListLen)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59693)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59694)==0&false)); j++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59695);final double[] y = yList[j];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59696);if ((((y == null)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59697)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59698)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59699);throw new NullArgumentException();
            }
            }__CLR4_4_119tz19tzlb90pb9c.R.inc(59700);if ((((y.length != len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59701)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59702)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59703);throw new DimensionMismatchException(y.length, len);
            }
        }}

        // Associate each abscissa "x[i]" with its index "i".
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59704);final List<Pair<Double, Integer>> list
            = new ArrayList<Pair<Double, Integer>>(len);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59705);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59706)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59707)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59708);list.add(new Pair<Double, Integer>(x[i], i));
        }

        // Create comparators for increasing and decreasing orders.
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59709);final Comparator<Pair<Double, Integer>> comp
            = (((dir == MathArrays.OrderDirection.INCREASING )&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59710)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59711)==0&false))?
            new Comparator<Pair<Double, Integer>>() {
            public int compare(Pair<Double, Integer> o1,
                               Pair<Double, Integer> o2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59712);
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59713);return o1.getKey().compareTo(o2.getKey());
            }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
        } : new Comparator<Pair<Double,Integer>>() {
            public int compare(Pair<Double, Integer> o1,
                               Pair<Double, Integer> o2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59714);
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59715);return o2.getKey().compareTo(o1.getKey());
            }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
        };

        // Sort.
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59716);Collections.sort(list, comp);

        // Modify the original array so that its elements are in
        // the prescribed order.
        // Retrieve indices of original locations.
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59717);final int[] indices = new int[len];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59718);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59719)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59720)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59721);final Pair<Double, Integer> e = list.get(i);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59722);x[i] = e.getKey();
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59723);indices[i] = e.getValue();
        }

        // In each of the associated arrays, move the
        // elements to their new location.
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59724);for (int j = 0; (((j < yListLen)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59725)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59726)==0&false)); j++) {{
            // Input array will be modified in place.
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59727);final double[] yInPlace = yList[j];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59728);final double[] yOrig = yInPlace.clone();

            __CLR4_4_119tz19tzlb90pb9c.R.inc(59729);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59730)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59731)==0&false)); i++) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59732);yInPlace[i] = yOrig[indices[i]];
            }
        }}
    }}finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @return the copied array.
     */
     public static int[] copyOf(int[] source) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59733);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59734);return copyOf(source, source.length);
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @return the copied array.
     */
     public static double[] copyOf(double[] source) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59735);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59736);return copyOf(source, source.length);
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @param len Number of entries to copy. If smaller then the source
     * length, the copy will be truncated, if larger it will padded with
     * zeroes.
     * @return the copied array.
     */
    public static int[] copyOf(int[] source, int len) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59737);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59738);final int[] output = new int[len];
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59739);System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59740);return output;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @param len Number of entries to copy. If smaller then the source
     * length, the copy will be truncated, if larger it will padded with
     * zeroes.
     * @return the copied array.
     */
    public static double[] copyOf(double[] source, int len) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59741);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59742);final double[] output = new double[len];
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59743);System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59744);return output;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Compute a linear combination accurately.
     * This method computes the sum of the products
     * <code>a<sub>i</sub> b<sub>i</sub></code> to high accuracy.
     * It does so by using specific multiplication and addition algorithms to
     * preserve accuracy and reduce cancellation effects.
     * <br/>
     * It is based on the 2005 paper
     * <a href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.2.1547">
     * Accurate Sum and Dot Product</a> by Takeshi Ogita, Siegfried M. Rump,
     * and Shin'ichi Oishi published in SIAM J. Sci. Comput.
     *
     * @param a Factors.
     * @param b Factors.
     * @return <code>&Sigma;<sub>i</sub> a<sub>i</sub> b<sub>i</sub></code>.
     * @throws DimensionMismatchException if arrays dimensions don't match
     */
    public static double linearCombination(final double[] a, final double[] b)
        throws DimensionMismatchException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59745);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59746);final int len = a.length;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59747);if ((((len != b.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59748)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59749)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59750);throw new DimensionMismatchException(len, b.length);
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59751);if ((((len == 1)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59752)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59753)==0&false))) {{
            // Revert to scalar multiplication.
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59754);return a[0] * b[0];
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59755);final double[] prodHigh = new double[len];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59756);double prodLowSum = 0;

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59757);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59758)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59759)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59760);final double ai = a[i];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59761);final double ca = SPLIT_FACTOR * ai;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59762);final double aHigh = ca - (ca - ai);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59763);final double aLow = ai - aHigh;

            __CLR4_4_119tz19tzlb90pb9c.R.inc(59764);final double bi = b[i];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59765);final double cb = SPLIT_FACTOR * bi;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59766);final double bHigh = cb - (cb - bi);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59767);final double bLow = bi - bHigh;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59768);prodHigh[i] = ai * bi;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59769);final double prodLow = aLow * bLow - (((prodHigh[i] -
                                                    aHigh * bHigh) -
                                                   aLow * bHigh) -
                                                  aHigh * bLow);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59770);prodLowSum += prodLow;
        }


        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59771);final double prodHighCur = prodHigh[0];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59772);double prodHighNext = prodHigh[1];
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59773);double sHighPrev = prodHighCur + prodHighNext;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59774);double sPrime = sHighPrev - prodHighNext;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59775);double sLowSum = (prodHighNext - (sHighPrev - sPrime)) + (prodHighCur - sPrime);

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59776);final int lenMinusOne = len - 1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59777);for (int i = 1; (((i < lenMinusOne)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59778)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59779)==0&false)); i++) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59780);prodHighNext = prodHigh[i + 1];
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59781);final double sHighCur = sHighPrev + prodHighNext;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59782);sPrime = sHighCur - prodHighNext;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59783);sLowSum += (prodHighNext - (sHighCur - sPrime)) + (sHighPrev - sPrime);
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59784);sHighPrev = sHighCur;
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59785);double result = sHighPrev + (prodLowSum + sLowSum);

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59786);if ((((Double.isNaN(result))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59787)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59788)==0&false))) {{
            // either we have split infinite numbers or some coefficients were NaNs,
            // just rely on the naive implementation and let IEEE754 handle this
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59789);result = 0;
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59790);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59791)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59792)==0&false)); ++i) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59793);result += a[i] * b[i];
            }
        }}

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59794);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Compute a linear combination accurately.
     * <p>
     * This method computes a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub> to high accuracy. It does
     * so by using specific multiplication and addition algorithms to
     * preserve accuracy and reduce cancellation effects. It is based
     * on the 2005 paper <a
     * href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.2.1547">
     * Accurate Sum and Dot Product</a> by Takeshi Ogita,
     * Siegfried M. Rump, and Shin'ichi Oishi published in SIAM J. Sci. Comput.
     * </p>
     * @param a1 first factor of the first term
     * @param b1 second factor of the first term
     * @param a2 first factor of the second term
     * @param b2 second factor of the second term
     * @return a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub>
     * @see #linearCombination(double, double, double, double, double, double)
     * @see #linearCombination(double, double, double, double, double, double, double, double)
     */
    public static double linearCombination(final double a1, final double b1,
                                           final double a2, final double b2) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59795);

        // the code below is split in many additions/subtractions that may
        // appear redundant. However, they should NOT be simplified, as they
        // use IEEE754 floating point arithmetic rounding properties.
        // as an example, the expression "ca1 - (ca1 - a1)" is NOT the same as "a1"
        // The variable naming conventions are that xyzHigh contains the most significant
        // bits of xyz and xyzLow contains its least significant bits. So theoretically
        // xyz is the sum xyzHigh + xyzLow, but in many cases below, this sum cannot
        // be represented in only one double precision number so we preserve two numbers
        // to hold it as long as we can, combining the high and low order bits together
        // only at the end, after cancellation may have occurred on high order bits

        // split a1 and b1 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59796);final double ca1        = SPLIT_FACTOR * a1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59797);final double a1High     = ca1 - (ca1 - a1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59798);final double a1Low      = a1 - a1High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59799);final double cb1        = SPLIT_FACTOR * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59800);final double b1High     = cb1 - (cb1 - b1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59801);final double b1Low      = b1 - b1High;

        // accurate multiplication a1 * b1
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59802);final double prod1High  = a1 * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59803);final double prod1Low   = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low);

        // split a2 and b2 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59804);final double ca2        = SPLIT_FACTOR * a2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59805);final double a2High     = ca2 - (ca2 - a2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59806);final double a2Low      = a2 - a2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59807);final double cb2        = SPLIT_FACTOR * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59808);final double b2High     = cb2 - (cb2 - b2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59809);final double b2Low      = b2 - b2High;

        // accurate multiplication a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59810);final double prod2High  = a2 * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59811);final double prod2Low   = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low);

        // accurate addition a1 * b1 + a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59812);final double s12High    = prod1High + prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59813);final double s12Prime   = s12High - prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59814);final double s12Low     = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);

        // final rounding, s12 may have suffered many cancellations, we try
        // to recover some bits from the extra words we have saved up to now
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59815);double result = s12High + (prod1Low + prod2Low + s12Low);

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59816);if ((((Double.isNaN(result))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59817)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59818)==0&false))) {{
            // either we have split infinite numbers or some coefficients were NaNs,
            // just rely on the naive implementation and let IEEE754 handle this
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59819);result = a1 * b1 + a2 * b2;
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59820);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Compute a linear combination accurately.
     * <p>
     * This method computes a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub> + a<sub>3</sub>&times;b<sub>3</sub>
     * to high accuracy. It does so by using specific multiplication and
     * addition algorithms to preserve accuracy and reduce cancellation effects.
     * It is based on the 2005 paper <a
     * href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.2.1547">
     * Accurate Sum and Dot Product</a> by Takeshi Ogita,
     * Siegfried M. Rump, and Shin'ichi Oishi published in SIAM J. Sci. Comput.
     * </p>
     * @param a1 first factor of the first term
     * @param b1 second factor of the first term
     * @param a2 first factor of the second term
     * @param b2 second factor of the second term
     * @param a3 first factor of the third term
     * @param b3 second factor of the third term
     * @return a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub> + a<sub>3</sub>&times;b<sub>3</sub>
     * @see #linearCombination(double, double, double, double)
     * @see #linearCombination(double, double, double, double, double, double, double, double)
     */
    public static double linearCombination(final double a1, final double b1,
                                           final double a2, final double b2,
                                           final double a3, final double b3) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59821);

        // the code below is split in many additions/subtractions that may
        // appear redundant. However, they should NOT be simplified, as they
        // do use IEEE754 floating point arithmetic rounding properties.
        // as an example, the expression "ca1 - (ca1 - a1)" is NOT the same as "a1"
        // The variables naming conventions are that xyzHigh contains the most significant
        // bits of xyz and xyzLow contains its least significant bits. So theoretically
        // xyz is the sum xyzHigh + xyzLow, but in many cases below, this sum cannot
        // be represented in only one double precision number so we preserve two numbers
        // to hold it as long as we can, combining the high and low order bits together
        // only at the end, after cancellation may have occurred on high order bits

        // split a1 and b1 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59822);final double ca1        = SPLIT_FACTOR * a1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59823);final double a1High     = ca1 - (ca1 - a1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59824);final double a1Low      = a1 - a1High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59825);final double cb1        = SPLIT_FACTOR * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59826);final double b1High     = cb1 - (cb1 - b1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59827);final double b1Low      = b1 - b1High;

        // accurate multiplication a1 * b1
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59828);final double prod1High  = a1 * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59829);final double prod1Low   = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low);

        // split a2 and b2 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59830);final double ca2        = SPLIT_FACTOR * a2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59831);final double a2High     = ca2 - (ca2 - a2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59832);final double a2Low      = a2 - a2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59833);final double cb2        = SPLIT_FACTOR * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59834);final double b2High     = cb2 - (cb2 - b2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59835);final double b2Low      = b2 - b2High;

        // accurate multiplication a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59836);final double prod2High  = a2 * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59837);final double prod2Low   = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low);

        // split a3 and b3 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59838);final double ca3        = SPLIT_FACTOR * a3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59839);final double a3High     = ca3 - (ca3 - a3);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59840);final double a3Low      = a3 - a3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59841);final double cb3        = SPLIT_FACTOR * b3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59842);final double b3High     = cb3 - (cb3 - b3);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59843);final double b3Low      = b3 - b3High;

        // accurate multiplication a3 * b3
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59844);final double prod3High  = a3 * b3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59845);final double prod3Low   = a3Low * b3Low - (((prod3High - a3High * b3High) - a3Low * b3High) - a3High * b3Low);

        // accurate addition a1 * b1 + a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59846);final double s12High    = prod1High + prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59847);final double s12Prime   = s12High - prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59848);final double s12Low     = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);

        // accurate addition a1 * b1 + a2 * b2 + a3 * b3
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59849);final double s123High   = s12High + prod3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59850);final double s123Prime  = s123High - prod3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59851);final double s123Low    = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime);

        // final rounding, s123 may have suffered many cancellations, we try
        // to recover some bits from the extra words we have saved up to now
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59852);double result = s123High + (prod1Low + prod2Low + prod3Low + s12Low + s123Low);

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59853);if ((((Double.isNaN(result))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59854)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59855)==0&false))) {{
            // either we have split infinite numbers or some coefficients were NaNs,
            // just rely on the naive implementation and let IEEE754 handle this
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59856);result = a1 * b1 + a2 * b2 + a3 * b3;
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59857);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Compute a linear combination accurately.
     * <p>
     * This method computes a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub> + a<sub>3</sub>&times;b<sub>3</sub> +
     * a<sub>4</sub>&times;b<sub>4</sub>
     * to high accuracy. It does so by using specific multiplication and
     * addition algorithms to preserve accuracy and reduce cancellation effects.
     * It is based on the 2005 paper <a
     * href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.2.1547">
     * Accurate Sum and Dot Product</a> by Takeshi Ogita,
     * Siegfried M. Rump, and Shin'ichi Oishi published in SIAM J. Sci. Comput.
     * </p>
     * @param a1 first factor of the first term
     * @param b1 second factor of the first term
     * @param a2 first factor of the second term
     * @param b2 second factor of the second term
     * @param a3 first factor of the third term
     * @param b3 second factor of the third term
     * @param a4 first factor of the third term
     * @param b4 second factor of the third term
     * @return a<sub>1</sub>&times;b<sub>1</sub> +
     * a<sub>2</sub>&times;b<sub>2</sub> + a<sub>3</sub>&times;b<sub>3</sub> +
     * a<sub>4</sub>&times;b<sub>4</sub>
     * @see #linearCombination(double, double, double, double)
     * @see #linearCombination(double, double, double, double, double, double)
     */
    public static double linearCombination(final double a1, final double b1,
                                           final double a2, final double b2,
                                           final double a3, final double b3,
                                           final double a4, final double b4) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59858);

        // the code below is split in many additions/subtractions that may
        // appear redundant. However, they should NOT be simplified, as they
        // do use IEEE754 floating point arithmetic rounding properties.
        // as an example, the expression "ca1 - (ca1 - a1)" is NOT the same as "a1"
        // The variables naming conventions are that xyzHigh contains the most significant
        // bits of xyz and xyzLow contains its least significant bits. So theoretically
        // xyz is the sum xyzHigh + xyzLow, but in many cases below, this sum cannot
        // be represented in only one double precision number so we preserve two numbers
        // to hold it as long as we can, combining the high and low order bits together
        // only at the end, after cancellation may have occurred on high order bits

        // split a1 and b1 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59859);final double ca1        = SPLIT_FACTOR * a1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59860);final double a1High     = ca1 - (ca1 - a1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59861);final double a1Low      = a1 - a1High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59862);final double cb1        = SPLIT_FACTOR * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59863);final double b1High     = cb1 - (cb1 - b1);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59864);final double b1Low      = b1 - b1High;

        // accurate multiplication a1 * b1
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59865);final double prod1High  = a1 * b1;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59866);final double prod1Low   = a1Low * b1Low - (((prod1High - a1High * b1High) - a1Low * b1High) - a1High * b1Low);

        // split a2 and b2 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59867);final double ca2        = SPLIT_FACTOR * a2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59868);final double a2High     = ca2 - (ca2 - a2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59869);final double a2Low      = a2 - a2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59870);final double cb2        = SPLIT_FACTOR * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59871);final double b2High     = cb2 - (cb2 - b2);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59872);final double b2Low      = b2 - b2High;

        // accurate multiplication a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59873);final double prod2High  = a2 * b2;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59874);final double prod2Low   = a2Low * b2Low - (((prod2High - a2High * b2High) - a2Low * b2High) - a2High * b2Low);

        // split a3 and b3 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59875);final double ca3        = SPLIT_FACTOR * a3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59876);final double a3High     = ca3 - (ca3 - a3);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59877);final double a3Low      = a3 - a3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59878);final double cb3        = SPLIT_FACTOR * b3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59879);final double b3High     = cb3 - (cb3 - b3);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59880);final double b3Low      = b3 - b3High;

        // accurate multiplication a3 * b3
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59881);final double prod3High  = a3 * b3;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59882);final double prod3Low   = a3Low * b3Low - (((prod3High - a3High * b3High) - a3Low * b3High) - a3High * b3Low);

        // split a4 and b4 as two 26 bits numbers
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59883);final double ca4        = SPLIT_FACTOR * a4;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59884);final double a4High     = ca4 - (ca4 - a4);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59885);final double a4Low      = a4 - a4High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59886);final double cb4        = SPLIT_FACTOR * b4;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59887);final double b4High     = cb4 - (cb4 - b4);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59888);final double b4Low      = b4 - b4High;

        // accurate multiplication a4 * b4
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59889);final double prod4High  = a4 * b4;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59890);final double prod4Low   = a4Low * b4Low - (((prod4High - a4High * b4High) - a4Low * b4High) - a4High * b4Low);

        // accurate addition a1 * b1 + a2 * b2
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59891);final double s12High    = prod1High + prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59892);final double s12Prime   = s12High - prod2High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59893);final double s12Low     = (prod2High - (s12High - s12Prime)) + (prod1High - s12Prime);

        // accurate addition a1 * b1 + a2 * b2 + a3 * b3
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59894);final double s123High   = s12High + prod3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59895);final double s123Prime  = s123High - prod3High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59896);final double s123Low    = (prod3High - (s123High - s123Prime)) + (s12High - s123Prime);

        // accurate addition a1 * b1 + a2 * b2 + a3 * b3 + a4 * b4
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59897);final double s1234High  = s123High + prod4High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59898);final double s1234Prime = s1234High - prod4High;
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59899);final double s1234Low   = (prod4High - (s1234High - s1234Prime)) + (s123High - s1234Prime);

        // final rounding, s1234 may have suffered many cancellations, we try
        // to recover some bits from the extra words we have saved up to now
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59900);double result = s1234High + (prod1Low + prod2Low + prod3Low + prod4Low + s12Low + s123Low + s1234Low);

        __CLR4_4_119tz19tzlb90pb9c.R.inc(59901);if ((((Double.isNaN(result))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59902)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59903)==0&false))) {{
            // either we have split infinite numbers or some coefficients were NaNs,
            // just rely on the naive implementation and let IEEE754 handle this
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59904);result = a1 * b1 + a2 * b2 + a3 * b3 + a4 * b4;
        }

        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59905);return result;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Returns true iff both arguments are null or have same dimensions and all
     * their elements are equal as defined by
     * {@link Precision#equals(float,float)}.
     *
     * @param x first array
     * @param y second array
     * @return true if the values are both null or have same dimension
     * and equal elements.
     */
    public static boolean equals(float[] x, float[] y) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59906);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59907);if (((((x == null) || (y == null))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59908)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59909)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59910);return !((x == null) ^ (y == null));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59911);if ((((x.length != y.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59912)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59913)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59914);return false;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59915);for (int i = 0; (((i < x.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59916)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59917)==0&false)); ++i) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59918);if ((((!Precision.equals(x[i], y[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59919)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59920)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59921);return false;
            }
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59922);return true;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Returns true iff both arguments are null or have same dimensions and all
     * their elements are equal as defined by
     * {@link Precision#equalsIncludingNaN(double,double) this method}.
     *
     * @param x first array
     * @param y second array
     * @return true if the values are both null or have same dimension and
     * equal elements
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(float[] x, float[] y) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59923);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59924);if (((((x == null) || (y == null))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59925)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59926)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59927);return !((x == null) ^ (y == null));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59928);if ((((x.length != y.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59929)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59930)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59931);return false;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59932);for (int i = 0; (((i < x.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59933)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59934)==0&false)); ++i) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59935);if ((((!Precision.equalsIncludingNaN(x[i], y[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59936)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59937)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59938);return false;
            }
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59939);return true;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Returns {@code true} iff both arguments are {@code null} or have same
     * dimensions and all their elements are equal as defined by
     * {@link Precision#equals(double,double)}.
     *
     * @param x First array.
     * @param y Second array.
     * @return {@code true} if the values are both {@code null} or have same
     * dimension and equal elements.
     */
    public static boolean equals(double[] x, double[] y) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59940);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59941);if (((((x == null) || (y == null))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59942)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59943)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59944);return !((x == null) ^ (y == null));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59945);if ((((x.length != y.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59946)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59947)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59948);return false;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59949);for (int i = 0; (((i < x.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59950)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59951)==0&false)); ++i) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59952);if ((((!Precision.equals(x[i], y[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59953)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59954)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59955);return false;
            }
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59956);return true;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Returns {@code true} iff both arguments are {@code null} or have same
     * dimensions and all their elements are equal as defined by
     * {@link Precision#equalsIncludingNaN(double,double) this method}.
     *
     * @param x First array.
     * @param y Second array.
     * @return {@code true} if the values are both {@code null} or have same
     * dimension and equal elements.
     * @since 2.2
     */
    public static boolean equalsIncludingNaN(double[] x, double[] y) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59957);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(59958);if (((((x == null) || (y == null))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59959)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59960)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59961);return !((x == null) ^ (y == null));
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59962);if ((((x.length != y.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59963)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59964)==0&false))) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59965);return false;
        }
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59966);for (int i = 0; (((i < x.length)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59967)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59968)==0&false)); ++i) {{
            __CLR4_4_119tz19tzlb90pb9c.R.inc(59969);if ((((!Precision.equalsIncludingNaN(x[i], y[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59970)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59971)==0&false))) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(59972);return false;
            }
        }}
        }__CLR4_4_119tz19tzlb90pb9c.R.inc(59973);return true;
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

     /**
      * Normalizes an array to make it sum to a specified value.
      * Returns the result of the transformation <pre>
      *    x |-> x * normalizedSum / sum
      * </pre>
      * applied to each non-NaN element x of the input array, where sum is the
      * sum of the non-NaN entries in the input array.</p>
      *
      * <p>Throws IllegalArgumentException if {@code normalizedSum} is infinite
      * or NaN and ArithmeticException if the input array contains any infinite elements
      * or sums to 0.</p>
      *
      * <p>Ignores (i.e., copies unchanged to the output array) NaNs in the input array.</p>
      *
      * @param values Input array to be normalized
      * @param normalizedSum Target sum for the normalized array
      * @return the normalized array.
      * @throws MathArithmeticException if the input array contains infinite
      * elements or sums to zero.
      * @throws MathIllegalArgumentException if the target sum is infinite or {@code NaN}.
      * @since 2.1
      */
     public static double[] normalizeArray(double[] values, double normalizedSum)
         throws MathIllegalArgumentException, MathArithmeticException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(59974);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59975);if ((((Double.isInfinite(normalizedSum))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59976)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59977)==0&false))) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(59978);throw new MathIllegalArgumentException(LocalizedFormats.NORMALIZE_INFINITE);
         }
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(59979);if ((((Double.isNaN(normalizedSum))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59980)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59981)==0&false))) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(59982);throw new MathIllegalArgumentException(LocalizedFormats.NORMALIZE_NAN);
         }
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(59983);double sum = 0d;
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59984);final int len = values.length;
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59985);double[] out = new double[len];
         __CLR4_4_119tz19tzlb90pb9c.R.inc(59986);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59987)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59988)==0&false)); i++) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(59989);if ((((Double.isInfinite(values[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59990)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59991)==0&false))) {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(59992);throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_ARRAY_ELEMENT, values[i], i);
             }
             }__CLR4_4_119tz19tzlb90pb9c.R.inc(59993);if ((((!Double.isNaN(values[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59994)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59995)==0&false))) {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(59996);sum += values[i];
             }
         }}
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(59997);if ((((sum == 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(59998)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(59999)==0&false))) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60000);throw new MathArithmeticException(LocalizedFormats.ARRAY_SUMS_TO_ZERO);
         }
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(60001);for (int i = 0; (((i < len)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60002)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60003)==0&false)); i++) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60004);if ((((Double.isNaN(values[i]))&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60005)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60006)==0&false))) {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(60007);out[i] = Double.NaN;
             } }else {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(60008);out[i] = values[i] * normalizedSum / sum;
             }
         }}
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(60009);return out;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

     /** Build an array of elements.
      * <p>
      * Arrays are filled with field.getZero()
      * </p>
      * @param <T> the type of the field elements
      * @param field field to which array elements belong
      * @param length of the array
      * @return a new array
      * @since 3.2
      */
     public static <T> T[] buildArray(final Field<T> field, final int length) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60010);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60011);@SuppressWarnings("unchecked") // OK because field must be correct class
         T[] array = (T[]) Array.newInstance(field.getRuntimeClass(), length);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60012);Arrays.fill(array, field.getZero());
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60013);return array;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

     /** Build a double dimension  array of elements.
      * <p>
      * Arrays are filled with field.getZero()
      * </p>
      * @param <T> the type of the field elements
      * @param field field to which array elements belong
      * @param rows number of rows in the array
      * @param columns number of columns (may be negative to build partial
      * arrays in the same way <code>new Field[rows][]</code> works)
      * @return a new array
      * @since 3.2
      */
     @SuppressWarnings("unchecked")
    public static <T> T[][] buildArray(final Field<T> field, final int rows, final int columns) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60014);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60015);final T[][] array;
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60016);if ((((columns < 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60017)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60018)==0&false))) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60019);T[] dummyRow = buildArray(field, 0);
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60020);array = (T[][]) Array.newInstance(dummyRow.getClass(), rows);
         } }else {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60021);array = (T[][]) Array.newInstance(field.getRuntimeClass(),
                                               new int[] {
                                                   rows, columns
                                               });
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60022);for (int i = 0; (((i < rows)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60023)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60024)==0&false)); ++i) {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(60025);Arrays.fill(array[i], field.getZero());
             }
         }}
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(60026);return array;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

     /**
      * Calculates the <a href="http://en.wikipedia.org/wiki/Convolution">
      * convolution</a> between two sequences.
      * The solution is obtained via straightforward computation of the
      * convolution sum (and not via FFT).
      * Whenever the computation needs an element that would be located
      * at an index outside the input arrays, the value is assumed to be
      * zero.
      *
      * @param x First sequence.
      * Typically, this sequence will represent an input signal to a system.
      * @param h Second sequence.
      * Typically, this sequence will represent the impulse response of the
      * system.
      * @return the convolution of {@code x} and {@code h}.
      * This array's length will be {@code x.length + h.length - 1}.
      * @throws NullArgumentException if either {@code x} or {@code h} is
      * {@code null}.
      * @throws NoDataException if either {@code x} or {@code h} is empty.
      *
      * @since 3.3
      */
     public static double[] convolve(double[] x, double[] h)
         throws NullArgumentException,
                NoDataException {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60027);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60028);MathUtils.checkNotNull(x);
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60029);MathUtils.checkNotNull(h);

         __CLR4_4_119tz19tzlb90pb9c.R.inc(60030);final int xLen = x.length;
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60031);final int hLen = h.length;

         __CLR4_4_119tz19tzlb90pb9c.R.inc(60032);if ((((xLen == 0 || hLen == 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60033)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60034)==0&false))) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60035);throw new NoDataException();
         }

         // initialize the output array
         }__CLR4_4_119tz19tzlb90pb9c.R.inc(60036);final int totalLength = xLen + hLen - 1;
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60037);final double[] y = new double[totalLength];

         // straightforward implementation of the convolution sum
         __CLR4_4_119tz19tzlb90pb9c.R.inc(60038);for (int n = 0; (((n < totalLength)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60039)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60040)==0&false)); n++) {{
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60041);double yn = 0;
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60042);int k = FastMath.max(0, n + 1 - xLen);
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60043);int j = n - k;
             __CLR4_4_119tz19tzlb90pb9c.R.inc(60044);while ((((k < hLen && j >= 0)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60045)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60046)==0&false))) {{
                 __CLR4_4_119tz19tzlb90pb9c.R.inc(60047);yn += x[j--] * h[k++];
             }
             }__CLR4_4_119tz19tzlb90pb9c.R.inc(60048);y[n] = yn;
         }

         }__CLR4_4_119tz19tzlb90pb9c.R.inc(60049);return y;
     }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Specification for indicating that some operation applies
     * before or after a given index.
     */
    public static enum Position {
        /** Designates the beginning of the array (near index 0). */
        HEAD,
        /** Designates the end of the array. */
        TAIL
    }

    /**
     * Shuffle the entries of the given array.
     * The {@code start} and {@code pos} parameters select which portion
     * of the array is randomized and which is left untouched.
     *
     * @see #shuffle(int[],int,Position,RandomGenerator)
     *
     * @param list Array whose entries will be shuffled (in-place).
     * @param start Index at which shuffling begins.
     * @param pos Shuffling is performed for index positions between
     * {@code start} and either the end (if {@link Position#TAIL})
     * or the beginning (if {@link Position#HEAD}) of the array.
     */
    public static void shuffle(int[] list,
                               int start,
                               Position pos) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60050);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(60051);shuffle(list, start, pos, new Well19937c());
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Shuffle the entries of the given array, using the
     * <a href="http://en.wikipedia.org/wiki/Fisher\u2013Yates_shuffle#The_modern_algorithm">
     * Fisher\u2013Yates</a> algorithm.
     * The {@code start} and {@code pos} parameters select which portion
     * of the array is randomized and which is left untouched.
     *
     * @param list Array whose entries will be shuffled (in-place).
     * @param start Index at which shuffling begins.
     * @param pos Shuffling is performed for index positions between
     * {@code start} and either the end (if {@link Position#TAIL})
     * or the beginning (if {@link Position#HEAD}) of the array.
     * @param rng Random number generator.
     */
    public static void shuffle(int[] list,
                               int start,
                               Position pos,
                               RandomGenerator rng) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60052);
        boolean __CLB4_4_1_bool2=false;__CLR4_4_119tz19tzlb90pb9c.R.inc(60053);switch (pos) {
        case TAIL:if (!__CLB4_4_1_bool2) {__CLR4_4_119tz19tzlb90pb9c.R.inc(60054);__CLB4_4_1_bool2=true;} {
            __CLR4_4_119tz19tzlb90pb9c.R.inc(60055);for (int i = list.length - 1; (((i >= start)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60056)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60057)==0&false)); i--) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60058);final int target;
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60059);if ((((i == start)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60060)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60061)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(60062);target = start;
                } }else {{
                    // NumberIsTooLargeException cannot occur.
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(60063);target = new UniformIntegerDistribution(rng, start, i).sample();
                }
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(60064);final int temp = list[target];
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60065);list[target] = list[i];
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60066);list[i] = temp;
            }
        }}
            __CLR4_4_119tz19tzlb90pb9c.R.inc(60067);break;
        case HEAD:if (!__CLB4_4_1_bool2) {__CLR4_4_119tz19tzlb90pb9c.R.inc(60068);__CLB4_4_1_bool2=true;} {
            __CLR4_4_119tz19tzlb90pb9c.R.inc(60069);for (int i = 0; (((i <= start)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60070)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60071)==0&false)); i++) {{
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60072);final int target;
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60073);if ((((i == start)&&(__CLR4_4_119tz19tzlb90pb9c.R.iget(60074)!=0|true))||(__CLR4_4_119tz19tzlb90pb9c.R.iget(60075)==0&false))) {{
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(60076);target = start;
                } }else {{
                    // NumberIsTooLargeException cannot occur.
                    __CLR4_4_119tz19tzlb90pb9c.R.inc(60077);target = new UniformIntegerDistribution(rng, i, start).sample();
                }
                }__CLR4_4_119tz19tzlb90pb9c.R.inc(60078);final int temp = list[target];
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60079);list[target] = list[i];
                __CLR4_4_119tz19tzlb90pb9c.R.inc(60080);list[i] = temp;
            }
        }}
            __CLR4_4_119tz19tzlb90pb9c.R.inc(60081);break;
        default:if (!__CLB4_4_1_bool2) {__CLR4_4_119tz19tzlb90pb9c.R.inc(60082);__CLB4_4_1_bool2=true;}
            __CLR4_4_119tz19tzlb90pb9c.R.inc(60083);throw new MathInternalError(); // Should never happen.
        }
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Shuffle the entries of the given array.
     *
     * @see #shuffle(int[],int,Position,RandomGenerator)
     *
     * @param list Array whose entries will be shuffled (in-place).
     * @param rng Random number generator.
     */
    public static void shuffle(int[] list,
                               RandomGenerator rng) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60084);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(60085);shuffle(list, 0, Position.TAIL, rng);
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}

    /**
     * Shuffle the entries of the given array.
     *
     * @see #shuffle(int[],int,Position,RandomGenerator)
     *
     * @param list Array whose entries will be shuffled (in-place).
     */
    public static void shuffle(int[] list) {try{__CLR4_4_119tz19tzlb90pb9c.R.inc(60086);
        __CLR4_4_119tz19tzlb90pb9c.R.inc(60087);shuffle(list, new Well19937c());
    }finally{__CLR4_4_119tz19tzlb90pb9c.R.flushNeeded();}}
}
