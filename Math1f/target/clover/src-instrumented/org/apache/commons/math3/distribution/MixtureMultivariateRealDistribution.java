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
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;

/**
 * Class for representing <a href="http://en.wikipedia.org/wiki/Mixture_model">
 * mixture model</a> distributions.
 *
 * @param <T> Type of the mixture components.
 *
 * @version $Id$
 * @since 3.1
 */
public class MixtureMultivariateRealDistribution<T extends MultivariateRealDistribution>
    extends AbstractMultivariateRealDistribution {public static class __CLR4_4_18oi8oilb90p7jj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Normalized weight of each mixture component. */
    private final double[] weight;
    /** Mixture components. */
    private final List<T> distribution;

    /**
     * Creates a mixture model from a list of distributions and their
     * associated weights.
     *
     * @param components List of (weight, distribution) pairs from which to sample.
     */
    public MixtureMultivariateRealDistribution(List<Pair<Double, T>> components) {
        this(new Well19937c(), components);__CLR4_4_18oi8oilb90p7jj.R.inc(11251);try{__CLR4_4_18oi8oilb90p7jj.R.inc(11250);
    }finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}

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
    public MixtureMultivariateRealDistribution(RandomGenerator rng,
                                               List<Pair<Double, T>> components) {
        super(rng, components.get(0).getSecond().getDimension());__CLR4_4_18oi8oilb90p7jj.R.inc(11253);try{__CLR4_4_18oi8oilb90p7jj.R.inc(11252);

        __CLR4_4_18oi8oilb90p7jj.R.inc(11254);final int numComp = components.size();
        __CLR4_4_18oi8oilb90p7jj.R.inc(11255);final int dim = getDimension();
        __CLR4_4_18oi8oilb90p7jj.R.inc(11256);double weightSum = 0;
        __CLR4_4_18oi8oilb90p7jj.R.inc(11257);for (int i = 0; (((i < numComp)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11258)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11259)==0&false)); i++) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11260);final Pair<Double, T> comp = components.get(i);
            __CLR4_4_18oi8oilb90p7jj.R.inc(11261);if ((((comp.getSecond().getDimension() != dim)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11262)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11263)==0&false))) {{
                __CLR4_4_18oi8oilb90p7jj.R.inc(11264);throw new DimensionMismatchException(comp.getSecond().getDimension(), dim);
            }
            }__CLR4_4_18oi8oilb90p7jj.R.inc(11265);if ((((comp.getFirst() < 0)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11266)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11267)==0&false))) {{
                __CLR4_4_18oi8oilb90p7jj.R.inc(11268);throw new NotPositiveException(comp.getFirst());
            }
            }__CLR4_4_18oi8oilb90p7jj.R.inc(11269);weightSum += comp.getFirst();
        }

        // Check for overflow.
        }__CLR4_4_18oi8oilb90p7jj.R.inc(11270);if ((((Double.isInfinite(weightSum))&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11271)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11272)==0&false))) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11273);throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        }

        // Store each distribution and its normalized weight.
        }__CLR4_4_18oi8oilb90p7jj.R.inc(11274);distribution = new ArrayList<T>();
        __CLR4_4_18oi8oilb90p7jj.R.inc(11275);weight = new double[numComp];
        __CLR4_4_18oi8oilb90p7jj.R.inc(11276);for (int i = 0; (((i < numComp)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11277)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11278)==0&false)); i++) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11279);final Pair<Double, T> comp = components.get(i);
            __CLR4_4_18oi8oilb90p7jj.R.inc(11280);weight[i] = comp.getFirst() / weightSum;
            __CLR4_4_18oi8oilb90p7jj.R.inc(11281);distribution.add(comp.getSecond());
        }
    }}finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(final double[] values) {try{__CLR4_4_18oi8oilb90p7jj.R.inc(11282);
        __CLR4_4_18oi8oilb90p7jj.R.inc(11283);double p = 0;
        __CLR4_4_18oi8oilb90p7jj.R.inc(11284);for (int i = 0; (((i < weight.length)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11285)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11286)==0&false)); i++) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11287);p += weight[i] * distribution.get(i).density(values);
        }
        }__CLR4_4_18oi8oilb90p7jj.R.inc(11288);return p;
    }finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] sample() {try{__CLR4_4_18oi8oilb90p7jj.R.inc(11289);
        // Sampled values.
        __CLR4_4_18oi8oilb90p7jj.R.inc(11290);double[] vals = null;

        // Determine which component to sample from.
        __CLR4_4_18oi8oilb90p7jj.R.inc(11291);final double randomValue = random.nextDouble();
        __CLR4_4_18oi8oilb90p7jj.R.inc(11292);double sum = 0;

        __CLR4_4_18oi8oilb90p7jj.R.inc(11293);for (int i = 0; (((i < weight.length)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11294)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11295)==0&false)); i++) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11296);sum += weight[i];
            __CLR4_4_18oi8oilb90p7jj.R.inc(11297);if ((((randomValue <= sum)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11298)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11299)==0&false))) {{
                // pick model i
                __CLR4_4_18oi8oilb90p7jj.R.inc(11300);vals = distribution.get(i).sample();
                __CLR4_4_18oi8oilb90p7jj.R.inc(11301);break;
            }
        }}

        }__CLR4_4_18oi8oilb90p7jj.R.inc(11302);if ((((vals == null)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11303)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11304)==0&false))) {{
            // This should never happen, but it ensures we won't return a null in
            // case the loop above has some floating point inequality problem on
            // the final iteration.
            __CLR4_4_18oi8oilb90p7jj.R.inc(11305);vals = distribution.get(weight.length - 1).sample();
        }

        }__CLR4_4_18oi8oilb90p7jj.R.inc(11306);return vals;
    }finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_18oi8oilb90p7jj.R.inc(11307);
        // Seed needs to be propagated to underlying components
        // in order to maintain consistency between runs.
        __CLR4_4_18oi8oilb90p7jj.R.inc(11308);super.reseedRandomGenerator(seed);

        __CLR4_4_18oi8oilb90p7jj.R.inc(11309);for (int i = 0; (((i < distribution.size())&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11310)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11311)==0&false)); i++) {{
            // Make each component's seed different in order to avoid
            // using the same sequence of random numbers.
            __CLR4_4_18oi8oilb90p7jj.R.inc(11312);distribution.get(i).reseedRandomGenerator(i + 1 + seed);
        }
    }}finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}

    /**
     * Gets the distributions that make up the mixture model.
     *
     * @return the component distributions and associated weights.
     */
    public List<Pair<Double, T>> getComponents() {try{__CLR4_4_18oi8oilb90p7jj.R.inc(11313);
        __CLR4_4_18oi8oilb90p7jj.R.inc(11314);final List<Pair<Double, T>> list = new ArrayList<Pair<Double, T>>(weight.length);

        __CLR4_4_18oi8oilb90p7jj.R.inc(11315);for (int i = 0; (((i < weight.length)&&(__CLR4_4_18oi8oilb90p7jj.R.iget(11316)!=0|true))||(__CLR4_4_18oi8oilb90p7jj.R.iget(11317)==0&false)); i++) {{
            __CLR4_4_18oi8oilb90p7jj.R.inc(11318);list.add(new Pair<Double, T>(weight[i], distribution.get(i)));
        }

        }__CLR4_4_18oi8oilb90p7jj.R.inc(11319);return list;
    }finally{__CLR4_4_18oi8oilb90p7jj.R.flushNeeded();}}
}
