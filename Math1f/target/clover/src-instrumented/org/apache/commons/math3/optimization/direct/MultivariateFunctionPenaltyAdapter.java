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
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>Adapter extending bounded {@link MultivariateFunction} to an unbouded
 * domain using a penalty function.</p>
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
 * be called by the optimizer with unbound parameters, and the adapter will check
 * if the parameters is within range or not. If it is in range, then the underlying
 * user function will be called, and if it is not the value of a penalty function
 * will be returned instead.
 * </p>
 * <p>
 * This adapter is only a poor man solution to simple bounds optimization constraints
 * that can be used with simple optimizers like {@link SimplexOptimizer} with {@link
 * NelderMeadSimplex} or {@link MultiDirectionalSimplex}. A better solution is to use
 * an optimizer that directly supports simple bounds like {@link CMAESOptimizer} or
 * {@link BOBYQAOptimizer}. One caveat of this poor man solution is that if start point
 * or start simplex is completely outside of the allowed range, only the penalty function
 * is used, and the optimizer may converge without ever entering the range.
 * </p>
 *
 * @see MultivariateFunctionMappingAdapter
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */

@Deprecated
public class MultivariateFunctionPenaltyAdapter implements MultivariateFunction {public static class __CLR4_4_1y8gy8glb90pa2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying bounded function. */
    private final MultivariateFunction bounded;

    /** Lower bounds. */
    private final double[] lower;

    /** Upper bounds. */
    private final double[] upper;

    /** Penalty offset. */
    private final double offset;

    /** Penalty scales. */
    private final double[] scale;

    /** Simple constructor.
     * <p>
     * When the optimizer provided points are out of range, the value of the
     * penalty function will be used instead of the value of the underlying
     * function. In order for this penalty to be effective in rejecting this
     * point during the optimization process, the penalty function value should
     * be defined with care. This value is computed as:
     * <pre>
     *   penalty(point) = offset + &sum;<sub>i</sub>[scale[i] * &radic;|point[i]-boundary[i]|]
     * </pre>
     * where indices i correspond to all the components that violates their boundaries.
     * </p>
     * <p>
     * So when attempting a function minimization, offset should be larger than
     * the maximum expected value of the underlying function and scale components
     * should all be positive. When attempting a function maximization, offset
     * should be lesser than the minimum expected value of the underlying function
     * and scale components should all be negative.
     * minimization, and lesser than the minimum expected value of the underlying
     * function when attempting maximization.
     * </p>
     * <p>
     * These choices for the penalty function have two properties. First, all out
     * of range points will return a function value that is worse than the value
     * returned by any in range point. Second, the penalty is worse for large
     * boundaries violation than for small violations, so the optimizer has an hint
     * about the direction in which it should search for acceptable points.
     * </p>
     * @param bounded bounded function
     * @param lower lower bounds for each element of the input parameters array
     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for
     * unbounded values)
     * @param upper upper bounds for each element of the input parameters array
     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for
     * unbounded values)
     * @param offset base offset of the penalty function
     * @param scale scale of the penalty function
     * @exception DimensionMismatchException if lower bounds, upper bounds and
     * scales are not consistent, either according to dimension or to bounadary
     * values
     */
    public MultivariateFunctionPenaltyAdapter(final MultivariateFunction bounded,
                                                  final double[] lower, final double[] upper,
                                                  final double offset, final double[] scale) {try{__CLR4_4_1y8gy8glb90pa2g.R.inc(44368);

        // safety checks
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44369);MathUtils.checkNotNull(lower);
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44370);MathUtils.checkNotNull(upper);
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44371);MathUtils.checkNotNull(scale);
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44372);if ((((lower.length != upper.length)&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44373)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44374)==0&false))) {{
            __CLR4_4_1y8gy8glb90pa2g.R.inc(44375);throw new DimensionMismatchException(lower.length, upper.length);
        }
        }__CLR4_4_1y8gy8glb90pa2g.R.inc(44376);if ((((lower.length != scale.length)&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44377)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44378)==0&false))) {{
            __CLR4_4_1y8gy8glb90pa2g.R.inc(44379);throw new DimensionMismatchException(lower.length, scale.length);
        }
        }__CLR4_4_1y8gy8glb90pa2g.R.inc(44380);for (int i = 0; (((i < lower.length)&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44381)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44382)==0&false)); ++i) {{
            // note the following test is written in such a way it also fails for NaN
            __CLR4_4_1y8gy8glb90pa2g.R.inc(44383);if ((((!(upper[i] >= lower[i]))&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44384)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44385)==0&false))) {{
                __CLR4_4_1y8gy8glb90pa2g.R.inc(44386);throw new NumberIsTooSmallException(upper[i], lower[i], true);
            }
        }}

        }__CLR4_4_1y8gy8glb90pa2g.R.inc(44387);this.bounded = bounded;
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44388);this.lower   = lower.clone();
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44389);this.upper   = upper.clone();
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44390);this.offset  = offset;
        __CLR4_4_1y8gy8glb90pa2g.R.inc(44391);this.scale   = scale.clone();

    }finally{__CLR4_4_1y8gy8glb90pa2g.R.flushNeeded();}}

    /** Compute the underlying function value from an unbounded point.
     * <p>
     * This method simply returns the value of the underlying function
     * if the unbounded point already fulfills the bounds, and compute
     * a replacement value using the offset and scale if bounds are
     * violated, without calling the function at all.
     * </p>
     * @param point unbounded point
     * @return either underlying function value or penalty function value
     */
    public double value(double[] point) {try{__CLR4_4_1y8gy8glb90pa2g.R.inc(44392);

        __CLR4_4_1y8gy8glb90pa2g.R.inc(44393);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44394)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44395)==0&false)); ++i) {{
            __CLR4_4_1y8gy8glb90pa2g.R.inc(44396);if (((((point[i] < lower[i]) || (point[i] > upper[i]))&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44397)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44398)==0&false))) {{
                // bound violation starting at this component
                __CLR4_4_1y8gy8glb90pa2g.R.inc(44399);double sum = 0;
                __CLR4_4_1y8gy8glb90pa2g.R.inc(44400);for (int j = i; (((j < scale.length)&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44401)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44402)==0&false)); ++j) {{
                    __CLR4_4_1y8gy8glb90pa2g.R.inc(44403);final double overshoot;
                    __CLR4_4_1y8gy8glb90pa2g.R.inc(44404);if ((((point[j] < lower[j])&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44405)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44406)==0&false))) {{
                        __CLR4_4_1y8gy8glb90pa2g.R.inc(44407);overshoot = scale[j] * (lower[j] - point[j]);
                    } }else {__CLR4_4_1y8gy8glb90pa2g.R.inc(44408);if ((((point[j] > upper[j])&&(__CLR4_4_1y8gy8glb90pa2g.R.iget(44409)!=0|true))||(__CLR4_4_1y8gy8glb90pa2g.R.iget(44410)==0&false))) {{
                        __CLR4_4_1y8gy8glb90pa2g.R.inc(44411);overshoot = scale[j] * (point[j] - upper[j]);
                    } }else {{
                        __CLR4_4_1y8gy8glb90pa2g.R.inc(44412);overshoot = 0;
                    }
                    }}__CLR4_4_1y8gy8glb90pa2g.R.inc(44413);sum += FastMath.sqrt(overshoot);
                }
                }__CLR4_4_1y8gy8glb90pa2g.R.inc(44414);return offset + sum;
            }
        }}

        // all boundaries are fulfilled, we are in the expected
        // domain of the underlying function
        }__CLR4_4_1y8gy8glb90pa2g.R.inc(44415);return bounded.value(point);

    }finally{__CLR4_4_1y8gy8glb90pa2g.R.flushNeeded();}}

}
