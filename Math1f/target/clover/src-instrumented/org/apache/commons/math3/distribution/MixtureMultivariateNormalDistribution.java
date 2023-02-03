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
package org.apache.commons.math3.distribution;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Pair;

/**
 * Multivariate normal mixture distribution.
 * This class is mainly syntactic sugar.
 *
 * @see MixtureMultivariateRealDistribution
 * @version $Id$
 * @since 3.2
 */
public class MixtureMultivariateNormalDistribution
    extends MixtureMultivariateRealDistribution<MultivariateNormalDistribution> {public static class __CLR4_4_18o48o4lb90p7jc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Creates a multivariate normal mixture distribution.
     *
     * @param weights Weights of each component.
     * @param means Mean vector for each component.
     * @param covariances Covariance matrix for each component.
     */
    public MixtureMultivariateNormalDistribution(double[] weights,
                                                 double[][] means,
                                                 double[][][] covariances) {
        super(createComponents(weights, means, covariances));__CLR4_4_18o48o4lb90p7jc.R.inc(11237);try{__CLR4_4_18o48o4lb90p7jc.R.inc(11236);
    }finally{__CLR4_4_18o48o4lb90p7jc.R.flushNeeded();}}

    /**
     * Creates a mixture model from a list of distributions and their
     * associated weights.
     *
     * @param components List of (weight, distribution) pairs from which to sample.
     */
    public MixtureMultivariateNormalDistribution(List<Pair<Double, MultivariateNormalDistribution>> components) {
        super(components);__CLR4_4_18o48o4lb90p7jc.R.inc(11239);try{__CLR4_4_18o48o4lb90p7jc.R.inc(11238);
    }finally{__CLR4_4_18o48o4lb90p7jc.R.flushNeeded();}}

    /**
     * Creates a mixture model from a list of distributions and their
     * associated weights.
     *
     * @param rng Random number generator.
     * @param components Distributions from which to sample.
     * @throws NotPositiveException if any of the weights is negative.
     * @throws DimensionMismatchException if not all components have the same
     * number of variables.
     */
    public MixtureMultivariateNormalDistribution(RandomGenerator rng,
                                                 List<Pair<Double, MultivariateNormalDistribution>> components)
        throws NotPositiveException, DimensionMismatchException {
        super(rng, components);__CLR4_4_18o48o4lb90p7jc.R.inc(11241);try{__CLR4_4_18o48o4lb90p7jc.R.inc(11240);
    }finally{__CLR4_4_18o48o4lb90p7jc.R.flushNeeded();}}

    /**
     * @param weights Weights of each component.
     * @param means Mean vector for each component.
     * @param covariances Covariance matrix for each component.
     * @return the list of components.
     */
    private static List<Pair<Double, MultivariateNormalDistribution>> createComponents(double[] weights,
                                                                                       double[][] means,
                                                                                       double[][][] covariances) {try{__CLR4_4_18o48o4lb90p7jc.R.inc(11242);
        __CLR4_4_18o48o4lb90p7jc.R.inc(11243);final List<Pair<Double, MultivariateNormalDistribution>> mvns
            = new ArrayList<Pair<Double, MultivariateNormalDistribution>>(weights.length);

        __CLR4_4_18o48o4lb90p7jc.R.inc(11244);for (int i = 0; (((i < weights.length)&&(__CLR4_4_18o48o4lb90p7jc.R.iget(11245)!=0|true))||(__CLR4_4_18o48o4lb90p7jc.R.iget(11246)==0&false)); i++) {{
            __CLR4_4_18o48o4lb90p7jc.R.inc(11247);final MultivariateNormalDistribution dist
                = new MultivariateNormalDistribution(means[i], covariances[i]);

            __CLR4_4_18o48o4lb90p7jc.R.inc(11248);mvns.add(new Pair<Double, MultivariateNormalDistribution>(weights[i], dist));
        }

        }__CLR4_4_18o48o4lb90p7jc.R.inc(11249);return mvns;
    }finally{__CLR4_4_18o48o4lb90p7jc.R.flushNeeded();}}
}
