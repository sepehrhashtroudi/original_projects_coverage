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
package org.apache.commons.math3.optim.nonlinear.scalar;

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
 * that can be used with simple optimizers like
 * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer
 * SimplexOptimizer}.
 * A better solution is to use an optimizer that directly supports simple bounds like
 * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer
 * CMAESOptimizer} or
 * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer
 * BOBYQAOptimizer}.
 * One caveat of this poor-man's solution is that behavior near the bounds may be
 * numerically unstable as bounds are mapped from infinite values.
 * Another caveat is that convergence values are evaluated by the optimizer with
 * respect to unbounded variables, so there will be scales differences when
 * converted to bounded variables.
 * </p>
 *
 * @see MultivariateFunctionPenaltyAdapter
 *
 * @version $Id$
 * @since 3.0
 */
public class MultivariateFunctionMappingAdapter
    implements MultivariateFunction {public static class __CLR4_4_1s5zs5zlb90p9no{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
                                              final double[] lower, final double[] upper) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36503);
        // safety checks
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36504);MathUtils.checkNotNull(lower);
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36505);MathUtils.checkNotNull(upper);
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36506);if ((((lower.length != upper.length)&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36507)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36508)==0&false))) {{
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36509);throw new DimensionMismatchException(lower.length, upper.length);
        }
        }__CLR4_4_1s5zs5zlb90p9no.R.inc(36510);for (int i = 0; (((i < lower.length)&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36511)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36512)==0&false)); ++i) {{
            // note the following test is written in such a way it also fails for NaN
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36513);if ((((!(upper[i] >= lower[i]))&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36514)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36515)==0&false))) {{
                __CLR4_4_1s5zs5zlb90p9no.R.inc(36516);throw new NumberIsTooSmallException(upper[i], lower[i], true);
            }
        }}

        }__CLR4_4_1s5zs5zlb90p9no.R.inc(36517);this.bounded = bounded;
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36518);this.mappers = new Mapper[lower.length];
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36519);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36520)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36521)==0&false)); ++i) {{
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36522);if ((((Double.isInfinite(lower[i]))&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36523)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36524)==0&false))) {{
                __CLR4_4_1s5zs5zlb90p9no.R.inc(36525);if ((((Double.isInfinite(upper[i]))&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36526)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36527)==0&false))) {{
                    // element is unbounded, no transformation is needed
                    __CLR4_4_1s5zs5zlb90p9no.R.inc(36528);mappers[i] = new NoBoundsMapper();
                } }else {{
                    // element is simple-bounded on the upper side
                    __CLR4_4_1s5zs5zlb90p9no.R.inc(36529);mappers[i] = new UpperBoundMapper(upper[i]);
                }
            }} }else {{
                __CLR4_4_1s5zs5zlb90p9no.R.inc(36530);if ((((Double.isInfinite(upper[i]))&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36531)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36532)==0&false))) {{
                    // element is simple-bounded on the lower side
                    __CLR4_4_1s5zs5zlb90p9no.R.inc(36533);mappers[i] = new LowerBoundMapper(lower[i]);
                } }else {{
                    // element is double-bounded
                    __CLR4_4_1s5zs5zlb90p9no.R.inc(36534);mappers[i] = new LowerUpperBoundMapper(lower[i], upper[i]);
                }
            }}
        }}
    }}finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    /**
     * Maps an array from unbounded to bounded.
     *
     * @param point Unbounded values.
     * @return the bounded values.
     */
    public double[] unboundedToBounded(double[] point) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36535);
        // Map unbounded input point to bounded point.
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36536);final double[] mapped = new double[mappers.length];
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36537);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36538)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36539)==0&false)); ++i) {{
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36540);mapped[i] = mappers[i].unboundedToBounded(point[i]);
        }

        }__CLR4_4_1s5zs5zlb90p9no.R.inc(36541);return mapped;
    }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    /**
     * Maps an array from bounded to unbounded.
     *
     * @param point Bounded values.
     * @return the unbounded values.
     */
    public double[] boundedToUnbounded(double[] point) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36542);
        // Map bounded input point to unbounded point.
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36543);final double[] mapped = new double[mappers.length];
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36544);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1s5zs5zlb90p9no.R.iget(36545)!=0|true))||(__CLR4_4_1s5zs5zlb90p9no.R.iget(36546)==0&false)); ++i) {{
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36547);mapped[i] = mappers[i].boundedToUnbounded(point[i]);
        }

        }__CLR4_4_1s5zs5zlb90p9no.R.inc(36548);return mapped;
    }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    /**
     * Compute the underlying function value from an unbounded point.
     * <p>
     * This method simply bounds the unbounded point using the mappings
     * set up at construction and calls the underlying function using
     * the bounded point.
     * </p>
     * @param point unbounded value
     * @return underlying function value
     * @see #unboundedToBounded(double[])
     */
    public double value(double[] point) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36549);
        __CLR4_4_1s5zs5zlb90p9no.R.inc(36550);return bounded.value(unboundedToBounded(point));
    }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    /** Mapping interface. */
    private interface Mapper {
        /**
         * Maps a value from unbounded to bounded.
         *
         * @param y Unbounded value.
         * @return the bounded value.
         */
        double unboundedToBounded(double y);

        /**
         * Maps a value from bounded to unbounded.
         *
         * @param x Bounded value.
         * @return the unbounded value.
         */
        double boundedToUnbounded(double x);
    }

    /** Local class for no bounds mapping. */
    private static class NoBoundsMapper implements Mapper {
        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36551);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36552);return y;
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36553);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36554);return x;
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}
    }

    /** Local class for lower bounds mapping. */
    private static class LowerBoundMapper implements Mapper {
        /** Low bound. */
        private final double lower;

        /**
         * Simple constructor.
         *
         * @param lower lower bound
         */
        public LowerBoundMapper(final double lower) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36555);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36556);this.lower = lower;
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36557);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36558);return lower + FastMath.exp(y);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36559);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36560);return FastMath.log(x - lower);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    }

    /** Local class for upper bounds mapping. */
    private static class UpperBoundMapper implements Mapper {

        /** Upper bound. */
        private final double upper;

        /** Simple constructor.
         * @param upper upper bound
         */
        public UpperBoundMapper(final double upper) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36561);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36562);this.upper = upper;
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36563);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36564);return upper - FastMath.exp(-y);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36565);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36566);return -FastMath.log(upper - x);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

    }

    /** Local class for lower and bounds mapping. */
    private static class LowerUpperBoundMapper implements Mapper {
        /** Function from unbounded to bounded. */
        private final UnivariateFunction boundingFunction;
        /** Function from bounded to unbounded. */
        private final UnivariateFunction unboundingFunction;

        /**
         * Simple constructor.
         *
         * @param lower lower bound
         * @param upper upper bound
         */
        public LowerUpperBoundMapper(final double lower, final double upper) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36567);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36568);boundingFunction   = new Sigmoid(lower, upper);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36569);unboundingFunction = new Logit(lower, upper);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double unboundedToBounded(final double y) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36570);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36571);return boundingFunction.value(y);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double boundedToUnbounded(final double x) {try{__CLR4_4_1s5zs5zlb90p9no.R.inc(36572);
            __CLR4_4_1s5zs5zlb90p9no.R.inc(36573);return unboundingFunction.value(x);
        }finally{__CLR4_4_1s5zs5zlb90p9no.R.flushNeeded();}}
    }
}