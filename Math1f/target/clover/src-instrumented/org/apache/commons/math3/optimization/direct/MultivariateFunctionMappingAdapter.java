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

package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Logit;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>Adapter for mapping bounded {@link MultivariateFunction} to unbounded ones.</p>
 *
 * <p>
 * This adapter can be used to wrap functions subject to simple bounds on
 * parameters so they can be used by optimizers that do <em>not</em> directly
 * support simple bounds.
 * </p>
 * <p>
 * The principle is that the user function that will be wrapped will see its
 * parameters bounded as required, i.e when its {@code value} method is called
 * with argument array {@code point}, the elements array will fulfill requirement
 * {@code lower[i] <= point[i] <= upper[i]} for all i. Some of the components
 * may be unbounded or bounded only on one side if the corresponding bound is
 * set to an infinite value. The optimizer will not manage the user function by
 * itself, but it will handle this adapter and it is this adapter that will take
 * care the bounds are fulfilled. The adapter {@link #value(double[])} method will
 * be called by the optimizer with unbound parameters, and the adapter will map
 * the unbounded value to the bounded range using appropriate functions like
 * {@link Sigmoid} for double bounded elements for example.
 * </p>
 * <p>
 * As the optimizer sees only unbounded parameters, it should be noted that the
 * start point or simplex expected by the optimizer should be unbounded, so the
 * user is responsible for converting his bounded point to unbounded by calling
 * {@link #boundedToUnbounded(double[])} before providing them to the optimizer.
 * For the same reason, the point returned by the {@link
 * org.apache.commons.math3.optimization.BaseMultivariateOptimizer#optimize(int,
 * MultivariateFunction, org.apache.commons.math3.optimization.GoalType, double[])}
 * method is unbounded. So to convert this point to bounded, users must call
 * {@link #unboundedToBounded(double[])} by themselves!</p>
 * <p>
 * This adapter is only a poor man solution to simple bounds optimization constraints
 * that can be used with simple optimizers like {@link SimplexOptimizer} with {@link
 * NelderMeadSimplex} or {@link MultiDirectionalSimplex}. A better solution is to use
 * an optimizer that directly supports simple bounds like {@link CMAESOptimizer} or
 * {@link BOBYQAOptimizer}. One caveat of this poor man solution is that behavior near
 * the bounds may be numerically unstable as bounds are mapped from infinite values.
 * Another caveat is that convergence values are evaluated by the optimizer with respect
 * to unbounded variables, so there will be scales differences when converted to bounded
 * variables.
 * </p>
 *
 * @see MultivariateFunctionPenaltyAdapter
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */

@Deprecated
public class MultivariateFunctionMappingAdapter implements MultivariateFunction {public static class __CLR4_4_1y6gy6glb90pa2d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying bounded function. */
    private final MultivariateFunction bounded;

    /** Mapping functions. */
    private final Mapper[] mappers;

    /** Simple constructor.
     * @param bounded bounded function
     * @param lower lower bounds for each element of the input parameters array
     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for
     * unbounded values)
     * @param upper upper bounds for each element of the input parameters array
     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for
     * unbounded values)
     * @exception DimensionMismatchException if lower and upper bounds are not
     * consistent, either according to dimension or to values
     */
    public MultivariateFunctionMappingAdapter(final MultivariateFunction bounded,
                                                  final double[] lower, final double[] upper) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44296);

        // safety checks
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44297);MathUtils.checkNotNull(lower);
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44298);MathUtils.checkNotNull(upper);
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44299);if ((((lower.length != upper.length)&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44300)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44301)==0&false))) {{
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44302);throw new DimensionMismatchException(lower.length, upper.length);
        }
        }__CLR4_4_1y6gy6glb90pa2d.R.inc(44303);for (int i = 0; (((i < lower.length)&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44304)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44305)==0&false)); ++i) {{
            // note the following test is written in such a way it also fails for NaN
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44306);if ((((!(upper[i] >= lower[i]))&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44307)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44308)==0&false))) {{
                __CLR4_4_1y6gy6glb90pa2d.R.inc(44309);throw new NumberIsTooSmallException(upper[i], lower[i], true);
            }
        }}

        }__CLR4_4_1y6gy6glb90pa2d.R.inc(44310);this.bounded = bounded;
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44311);this.mappers = new Mapper[lower.length];
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44312);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44313)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44314)==0&false)); ++i) {{
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44315);if ((((Double.isInfinite(lower[i]))&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44316)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44317)==0&false))) {{
                __CLR4_4_1y6gy6glb90pa2d.R.inc(44318);if ((((Double.isInfinite(upper[i]))&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44319)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44320)==0&false))) {{
                    // element is unbounded, no transformation is needed
                    __CLR4_4_1y6gy6glb90pa2d.R.inc(44321);mappers[i] = new NoBoundsMapper();
                } }else {{
                    // element is simple-bounded on the upper side
                    __CLR4_4_1y6gy6glb90pa2d.R.inc(44322);mappers[i] = new UpperBoundMapper(upper[i]);
                }
            }} }else {{
                __CLR4_4_1y6gy6glb90pa2d.R.inc(44323);if ((((Double.isInfinite(upper[i]))&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44324)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44325)==0&false))) {{
                    // element is simple-bounded on the lower side
                    __CLR4_4_1y6gy6glb90pa2d.R.inc(44326);mappers[i] = new LowerBoundMapper(lower[i]);
                } }else {{
                    // element is double-bounded
                    __CLR4_4_1y6gy6glb90pa2d.R.inc(44327);mappers[i] = new LowerUpperBoundMapper(lower[i], upper[i]);
                }
            }}
        }}

    }}finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    /** Map an array from unbounded to bounded.
     * @param point unbounded value
     * @return bounded value
     */
    public double[] unboundedToBounded(double[] point) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44328);

        // map unbounded input point to bounded point
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44329);final double[] mapped = new double[mappers.length];
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44330);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44331)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44332)==0&false)); ++i) {{
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44333);mapped[i] = mappers[i].unboundedToBounded(point[i]);
        }

        }__CLR4_4_1y6gy6glb90pa2d.R.inc(44334);return mapped;

    }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    /** Map an array from bounded to unbounded.
     * @param point bounded value
     * @return unbounded value
     */
    public double[] boundedToUnbounded(double[] point) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44335);

        // map bounded input point to unbounded point
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44336);final double[] mapped = new double[mappers.length];
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44337);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1y6gy6glb90pa2d.R.iget(44338)!=0|true))||(__CLR4_4_1y6gy6glb90pa2d.R.iget(44339)==0&false)); ++i) {{
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44340);mapped[i] = mappers[i].boundedToUnbounded(point[i]);
        }

        }__CLR4_4_1y6gy6glb90pa2d.R.inc(44341);return mapped;

    }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    /** Compute the underlying function value from an unbounded point.
     * <p>
     * This method simply bounds the unbounded point using the mappings
     * set up at construction and calls the underlying function using
     * the bounded point.
     * </p>
     * @param point unbounded value
     * @return underlying function value
     * @see #unboundedToBounded(double[])
     */
    public double value(double[] point) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44342);
        __CLR4_4_1y6gy6glb90pa2d.R.inc(44343);return bounded.value(unboundedToBounded(point));
    }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    /** Mapping interface. */
    private interface Mapper {

        /** Map a value from unbounded to bounded.
         * @param y unbounded value
         * @return bounded value
         */
        double unboundedToBounded(double y);

        /** Map a value from bounded to unbounded.
         * @param x bounded value
         * @return unbounded value
         */
        double boundedToUnbounded(double x);

    }

    /** Local class for no bounds mapping. */
    private static class NoBoundsMapper implements Mapper {

        /** Simple constructor.
         */
        public NoBoundsMapper() {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44344);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44345);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44346);return y;
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44347);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44348);return x;
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    }

    /** Local class for lower bounds mapping. */
    private static class LowerBoundMapper implements Mapper {

        /** Low bound. */
        private final double lower;

        /** Simple constructor.
         * @param lower lower bound
         */
        public LowerBoundMapper(final double lower) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44349);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44350);this.lower = lower;
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44351);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44352);return lower + FastMath.exp(y);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44353);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44354);return FastMath.log(x - lower);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    }

    /** Local class for upper bounds mapping. */
    private static class UpperBoundMapper implements Mapper {

        /** Upper bound. */
        private final double upper;

        /** Simple constructor.
         * @param upper upper bound
         */
        public UpperBoundMapper(final double upper) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44355);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44356);this.upper = upper;
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44357);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44358);return upper - FastMath.exp(-y);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44359);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44360);return -FastMath.log(upper - x);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    }

    /** Local class for lower and bounds mapping. */
    private static class LowerUpperBoundMapper implements Mapper {

        /** Function from unbounded to bounded. */
        private final UnivariateFunction boundingFunction;

        /** Function from bounded to unbounded. */
        private final UnivariateFunction unboundingFunction;

        /** Simple constructor.
         * @param lower lower bound
         * @param upper upper bound
         */
        public LowerUpperBoundMapper(final double lower, final double upper) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44361);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44362);boundingFunction   = new Sigmoid(lower, upper);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44363);unboundingFunction = new Logit(lower, upper);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44364);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44365);return boundingFunction.value(y);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1y6gy6glb90pa2d.R.inc(44366);
            __CLR4_4_1y6gy6glb90pa2d.R.inc(44367);return unboundingFunction.value(x);
        }finally{__CLR4_4_1y6gy6glb90pa2d.R.flushNeeded();}}

    }

}
