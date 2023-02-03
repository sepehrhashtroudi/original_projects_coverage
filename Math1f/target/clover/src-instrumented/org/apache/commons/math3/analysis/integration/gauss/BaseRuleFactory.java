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
package org.apache.commons.math3.analysis.integration.gauss;

import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.math3.util.Pair;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Base class for rules that determines the integration nodes and their
 * weights.
 * Subclasses must implement the {@link #computeRule(int) computeRule} method.
 *
 * @param <T> Type of the number used to represent the points and weights of
 * the quadrature rules.
 *
 * @since 3.1
 * @version $Id$
 */
public abstract class BaseRuleFactory<T extends Number> {public static class __CLR4_4_123a23alb90p6p6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,2749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** List of points and weights, indexed by the order of the rule. */
    private final Map<Integer, Pair<T[], T[]>> pointsAndWeights
        = new TreeMap<Integer, Pair<T[], T[]>>();
    /** Cache for double-precision rules. */
    private final Map<Integer, Pair<double[], double[]>> pointsAndWeightsDouble
        = new TreeMap<Integer, Pair<double[], double[]>>();

    /**
     * Gets a copy of the quadrature rule with the given number of integration
     * points.
     *
     * @param numberOfPoints Number of integration points.
     * @return a copy of the integration rule.
     * @throws NotStrictlyPositiveException if {@code numberOfPoints < 1}.
     * @throws DimensionMismatchException if the elements of the rule pair do not
     * have the same length.
     */
    public Pair<double[], double[]> getRule(int numberOfPoints)
        throws NotStrictlyPositiveException, DimensionMismatchException {try{__CLR4_4_123a23alb90p6p6.R.inc(2710);

        __CLR4_4_123a23alb90p6p6.R.inc(2711);if ((((numberOfPoints <= 0)&&(__CLR4_4_123a23alb90p6p6.R.iget(2712)!=0|true))||(__CLR4_4_123a23alb90p6p6.R.iget(2713)==0&false))) {{
            __CLR4_4_123a23alb90p6p6.R.inc(2714);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_POINTS,
                                                   numberOfPoints);
        }

        // Try to obtain the rule from the cache.
        }__CLR4_4_123a23alb90p6p6.R.inc(2715);Pair<double[], double[]> cached = pointsAndWeightsDouble.get(numberOfPoints);

        __CLR4_4_123a23alb90p6p6.R.inc(2716);if ((((cached == null)&&(__CLR4_4_123a23alb90p6p6.R.iget(2717)!=0|true))||(__CLR4_4_123a23alb90p6p6.R.iget(2718)==0&false))) {{
            // Rule not computed yet.

            // Compute the rule.
            __CLR4_4_123a23alb90p6p6.R.inc(2719);final Pair<T[], T[]> rule = getRuleInternal(numberOfPoints);
            __CLR4_4_123a23alb90p6p6.R.inc(2720);cached = convertToDouble(rule);

            // Cache it.
            __CLR4_4_123a23alb90p6p6.R.inc(2721);pointsAndWeightsDouble.put(numberOfPoints, cached);
        }

        // Return a copy.
        }__CLR4_4_123a23alb90p6p6.R.inc(2722);return new Pair<double[], double[]>(cached.getFirst().clone(),
                                            cached.getSecond().clone());
    }finally{__CLR4_4_123a23alb90p6p6.R.flushNeeded();}}

    /**
     * Gets a rule.
     * Synchronization ensures that rules will be computed and added to the
     * cache at most once.
     * The returned rule is a reference into the cache.
     *
     * @param numberOfPoints Order of the rule to be retrieved.
     * @return the points and weights corresponding to the given order.
     * @throws DimensionMismatchException if the elements of the rule pair do not
     * have the same length.
     */
    protected synchronized Pair<T[], T[]> getRuleInternal(int numberOfPoints)
        throws DimensionMismatchException {try{__CLR4_4_123a23alb90p6p6.R.inc(2723);
        __CLR4_4_123a23alb90p6p6.R.inc(2724);final Pair<T[], T[]> rule = pointsAndWeights.get(numberOfPoints);
        __CLR4_4_123a23alb90p6p6.R.inc(2725);if ((((rule == null)&&(__CLR4_4_123a23alb90p6p6.R.iget(2726)!=0|true))||(__CLR4_4_123a23alb90p6p6.R.iget(2727)==0&false))) {{
            __CLR4_4_123a23alb90p6p6.R.inc(2728);addRule(computeRule(numberOfPoints));
            // The rule should be available now.
            __CLR4_4_123a23alb90p6p6.R.inc(2729);return getRuleInternal(numberOfPoints);
        }
        }__CLR4_4_123a23alb90p6p6.R.inc(2730);return rule;
    }finally{__CLR4_4_123a23alb90p6p6.R.flushNeeded();}}

    /**
     * Stores a rule.
     *
     * @param rule Rule to be stored.
     * @throws DimensionMismatchException if the elements of the pair do not
     * have the same length.
     */
    protected void addRule(Pair<T[], T[]> rule) throws DimensionMismatchException {try{__CLR4_4_123a23alb90p6p6.R.inc(2731);
        __CLR4_4_123a23alb90p6p6.R.inc(2732);if ((((rule.getFirst().length != rule.getSecond().length)&&(__CLR4_4_123a23alb90p6p6.R.iget(2733)!=0|true))||(__CLR4_4_123a23alb90p6p6.R.iget(2734)==0&false))) {{
            __CLR4_4_123a23alb90p6p6.R.inc(2735);throw new DimensionMismatchException(rule.getFirst().length,
                                                 rule.getSecond().length);
        }

        }__CLR4_4_123a23alb90p6p6.R.inc(2736);pointsAndWeights.put(rule.getFirst().length, rule);
    }finally{__CLR4_4_123a23alb90p6p6.R.flushNeeded();}}

    /**
     * Computes the rule for the given order.
     *
     * @param numberOfPoints Order of the rule to be computed.
     * @return the computed rule.
     * @throws DimensionMismatchException if the elements of the pair do not
     * have the same length.
     */
    protected abstract Pair<T[], T[]> computeRule(int numberOfPoints)
        throws DimensionMismatchException;

    /**
     * Converts the from the actual {@code Number} type to {@code double}
     *
     * @param <T> Type of the number used to represent the points and
     * weights of the quadrature rules.
     * @param rule Points and weights.
     * @return points and weights as {@code double}s.
     */
    private static <T extends Number> Pair<double[], double[]> convertToDouble(Pair<T[], T[]> rule) {try{__CLR4_4_123a23alb90p6p6.R.inc(2737);
        __CLR4_4_123a23alb90p6p6.R.inc(2738);final T[] pT = rule.getFirst();
        __CLR4_4_123a23alb90p6p6.R.inc(2739);final T[] wT = rule.getSecond();

        __CLR4_4_123a23alb90p6p6.R.inc(2740);final int len = pT.length;
        __CLR4_4_123a23alb90p6p6.R.inc(2741);final double[] pD = new double[len];
        __CLR4_4_123a23alb90p6p6.R.inc(2742);final double[] wD = new double[len];

        __CLR4_4_123a23alb90p6p6.R.inc(2743);for (int i = 0; (((i < len)&&(__CLR4_4_123a23alb90p6p6.R.iget(2744)!=0|true))||(__CLR4_4_123a23alb90p6p6.R.iget(2745)==0&false)); i++) {{
            __CLR4_4_123a23alb90p6p6.R.inc(2746);pD[i] = pT[i].doubleValue();
            __CLR4_4_123a23alb90p6p6.R.inc(2747);wD[i] = wT[i].doubleValue();
        }

        }__CLR4_4_123a23alb90p6p6.R.inc(2748);return new Pair<double[], double[]>(pD, wD);
    }finally{__CLR4_4_123a23alb90p6p6.R.flushNeeded();}}
}
