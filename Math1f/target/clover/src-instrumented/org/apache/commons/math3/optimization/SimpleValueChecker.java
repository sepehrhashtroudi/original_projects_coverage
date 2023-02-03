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

package org.apache.commons.math3.optimization;

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

/**
 * Simple implementation of the {@link ConvergenceChecker} interface using
 * only objective function values.
 *
 * Convergence is considered to have been reached if either the relative
 * difference between the objective function values is smaller than a
 * threshold or if either the absolute difference between the objective
 * function values is smaller than another threshold.
 * <br/>
 * The {@link #converged(int,PointValuePair,PointValuePair) converged}
 * method will also return {@code true} if the number of iterations has been set
 * (see {@link #SimpleValueChecker(double,double,int) this constructor}).
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class SimpleValueChecker
    extends AbstractConvergenceChecker<PointValuePair> {public static class __CLR4_4_1vw4vw4lb90p9xh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * If {@link #maxIterationCount} is set to this value, the number of
     * iterations will never cause
     * {@link #converged(int,PointValuePair,PointValuePair)}
     * to return {@code true}.
     */
    private static final int ITERATION_CHECK_DISABLED = -1;
    /**
     * Number of iterations after which the
     * {@link #converged(int,PointValuePair,PointValuePair)} method
     * will return true (unless the check is disabled).
     */
    private final int maxIterationCount;

    /**
     * Build an instance with default thresholds.
     * @deprecated See {@link AbstractConvergenceChecker#AbstractConvergenceChecker()}
     */
    @Deprecated
    public SimpleValueChecker() {try{__CLR4_4_1vw4vw4lb90p9xh.R.inc(41332);
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41333);maxIterationCount = ITERATION_CHECK_DISABLED;
    }finally{__CLR4_4_1vw4vw4lb90p9xh.R.flushNeeded();}}

    /** Build an instance with specified thresholds.
     *
     * In order to perform only relative checks, the absolute tolerance
     * must be set to a negative value. In order to perform only absolute
     * checks, the relative tolerance must be set to a negative value.
     *
     * @param relativeThreshold relative tolerance threshold
     * @param absoluteThreshold absolute tolerance threshold
     */
    public SimpleValueChecker(final double relativeThreshold,
                              final double absoluteThreshold) {
        super(relativeThreshold, absoluteThreshold);__CLR4_4_1vw4vw4lb90p9xh.R.inc(41335);try{__CLR4_4_1vw4vw4lb90p9xh.R.inc(41334);
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41336);maxIterationCount = ITERATION_CHECK_DISABLED;
    }finally{__CLR4_4_1vw4vw4lb90p9xh.R.flushNeeded();}}

    /**
     * Builds an instance with specified thresholds.
     *
     * In order to perform only relative checks, the absolute tolerance
     * must be set to a negative value. In order to perform only absolute
     * checks, the relative tolerance must be set to a negative value.
     *
     * @param relativeThreshold relative tolerance threshold
     * @param absoluteThreshold absolute tolerance threshold
     * @param maxIter Maximum iteration count.
     * @throws NotStrictlyPositiveException if {@code maxIter <= 0}.
     *
     * @since 3.1
     */
    public SimpleValueChecker(final double relativeThreshold,
                              final double absoluteThreshold,
                              final int maxIter) {
        super(relativeThreshold, absoluteThreshold);__CLR4_4_1vw4vw4lb90p9xh.R.inc(41338);try{__CLR4_4_1vw4vw4lb90p9xh.R.inc(41337);

        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41339);if ((((maxIter <= 0)&&(__CLR4_4_1vw4vw4lb90p9xh.R.iget(41340)!=0|true))||(__CLR4_4_1vw4vw4lb90p9xh.R.iget(41341)==0&false))) {{
            __CLR4_4_1vw4vw4lb90p9xh.R.inc(41342);throw new NotStrictlyPositiveException(maxIter);
        }
        }__CLR4_4_1vw4vw4lb90p9xh.R.inc(41343);maxIterationCount = maxIter;
    }finally{__CLR4_4_1vw4vw4lb90p9xh.R.flushNeeded();}}

    /**
     * Check if the optimization algorithm has converged considering the
     * last two points.
     * This method may be called several time from the same algorithm
     * iteration with different points. This can be detected by checking the
     * iteration number at each call if needed. Each time this method is
     * called, the previous and current point correspond to points with the
     * same role at each iteration, so they can be compared. As an example,
     * simplex-based algorithms call this method for all points of the simplex,
     * not only for the best or worst ones.
     *
     * @param iteration Index of current iteration
     * @param previous Best point in the previous iteration.
     * @param current Best point in the current iteration.
     * @return {@code true} if the algorithm has converged.
     */
    @Override
    public boolean converged(final int iteration,
                             final PointValuePair previous,
                             final PointValuePair current) {try{__CLR4_4_1vw4vw4lb90p9xh.R.inc(41344);
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41345);if ((((maxIterationCount != ITERATION_CHECK_DISABLED && iteration >= maxIterationCount)&&(__CLR4_4_1vw4vw4lb90p9xh.R.iget(41346)!=0|true))||(__CLR4_4_1vw4vw4lb90p9xh.R.iget(41347)==0&false))) {{
            __CLR4_4_1vw4vw4lb90p9xh.R.inc(41348);return true;
        }

        }__CLR4_4_1vw4vw4lb90p9xh.R.inc(41349);final double p = previous.getValue();
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41350);final double c = current.getValue();
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41351);final double difference = FastMath.abs(p - c);
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41352);final double size = FastMath.max(FastMath.abs(p), FastMath.abs(c));
        __CLR4_4_1vw4vw4lb90p9xh.R.inc(41353);return difference <= size * getRelativeThreshold() ||
            difference <= getAbsoluteThreshold();
    }finally{__CLR4_4_1vw4vw4lb90p9xh.R.flushNeeded();}}
}
