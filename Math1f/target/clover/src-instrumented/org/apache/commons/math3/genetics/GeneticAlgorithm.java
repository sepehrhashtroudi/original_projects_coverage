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
package org.apache.commons.math3.genetics;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;

/**
 * Implementation of a genetic algorithm. All factors that govern the operation
 * of the algorithm can be configured for a specific problem.
 *
 * @since 2.0
 * @version $Id$
 */
public class GeneticAlgorithm {public static class __CLR4_4_1bvybvylb90p7z0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Static random number generator shared by GA implementation classes. Set the randomGenerator seed to get
     * reproducible results. Use {@link #setRandomGenerator(RandomGenerator)} to supply an alternative to the default
     * JDK-provided PRNG.
     */
    //@GuardedBy("this")
    private static RandomGenerator randomGenerator = new JDKRandomGenerator();

    /** the crossover policy used by the algorithm. */
    private final CrossoverPolicy crossoverPolicy;

    /** the rate of crossover for the algorithm. */
    private final double crossoverRate;

    /** the mutation policy used by the algorithm. */
    private final MutationPolicy mutationPolicy;

    /** the rate of mutation for the algorithm. */
    private final double mutationRate;

    /** the selection policy used by the algorithm. */
    private final SelectionPolicy selectionPolicy;

    /** the number of generations evolved to reach {@link StoppingCondition} in the last run. */
    private int generationsEvolved = 0;

    /**
     * Create a new genetic algorithm.
     * @param crossoverPolicy The {@link CrossoverPolicy}
     * @param crossoverRate The crossover rate as a percentage (0-1 inclusive)
     * @param mutationPolicy The {@link MutationPolicy}
     * @param mutationRate The mutation rate as a percentage (0-1 inclusive)
     * @param selectionPolicy The {@link SelectionPolicy}
     * @throws OutOfRangeException if the crossover or mutation rate is outside the [0, 1] range
     */
    public GeneticAlgorithm(final CrossoverPolicy crossoverPolicy,
                            final double crossoverRate,
                            final MutationPolicy mutationPolicy,
                            final double mutationRate,
                            final SelectionPolicy selectionPolicy) throws OutOfRangeException {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15406);

        __CLR4_4_1bvybvylb90p7z0.R.inc(15407);if ((((crossoverRate < 0 || crossoverRate > 1)&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15408)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15409)==0&false))) {{
            __CLR4_4_1bvybvylb90p7z0.R.inc(15410);throw new OutOfRangeException(LocalizedFormats.CROSSOVER_RATE,
                                          crossoverRate, 0, 1);
        }
        }__CLR4_4_1bvybvylb90p7z0.R.inc(15411);if ((((mutationRate < 0 || mutationRate > 1)&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15412)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15413)==0&false))) {{
            __CLR4_4_1bvybvylb90p7z0.R.inc(15414);throw new OutOfRangeException(LocalizedFormats.MUTATION_RATE,
                                          mutationRate, 0, 1);
        }
        }__CLR4_4_1bvybvylb90p7z0.R.inc(15415);this.crossoverPolicy = crossoverPolicy;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15416);this.crossoverRate = crossoverRate;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15417);this.mutationPolicy = mutationPolicy;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15418);this.mutationRate = mutationRate;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15419);this.selectionPolicy = selectionPolicy;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Set the (static) random generator.
     *
     * @param random random generator
     */
    public static synchronized void setRandomGenerator(final RandomGenerator random) {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15420);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15421);randomGenerator = random;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the (static) random generator.
     *
     * @return the static random generator shared by GA implementation classes
     */
    public static synchronized RandomGenerator getRandomGenerator() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15422);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15423);return randomGenerator;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Evolve the given population. Evolution stops when the stopping condition
     * is satisfied. Updates the {@link #getGenerationsEvolved() generationsEvolved}
     * property with the number of generations evolved before the StoppingCondition
     * is satisfied.
     *
     * @param initial the initial, seed population.
     * @param condition the stopping condition used to stop evolution.
     * @return the population that satisfies the stopping condition.
     */
    public Population evolve(final Population initial, final StoppingCondition condition) {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15424);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15425);Population current = initial;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15426);generationsEvolved = 0;
        __CLR4_4_1bvybvylb90p7z0.R.inc(15427);while ((((!condition.isSatisfied(current))&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15428)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15429)==0&false))) {{
            __CLR4_4_1bvybvylb90p7z0.R.inc(15430);current = nextGeneration(current);
            __CLR4_4_1bvybvylb90p7z0.R.inc(15431);generationsEvolved++;
        }
        }__CLR4_4_1bvybvylb90p7z0.R.inc(15432);return current;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Evolve the given population into the next generation.
     * <p>
     * <ol>
     *  <li>Get nextGeneration population to fill from <code>current</code>
     *      generation, using its nextGeneration method</li>
     *  <li>Loop until new generation is filled:</li>
     *  <ul><li>Apply configured SelectionPolicy to select a pair of parents
     *          from <code>current</code></li>
     *      <li>With probability = {@link #getCrossoverRate()}, apply
     *          configured {@link CrossoverPolicy} to parents</li>
     *      <li>With probability = {@link #getMutationRate()}, apply
     *          configured {@link MutationPolicy} to each of the offspring</li>
     *      <li>Add offspring individually to nextGeneration,
     *          space permitting</li>
     *  </ul>
     *  <li>Return nextGeneration</li>
     * </ol>
     *
     * @param current the current population.
     * @return the population for the next generation.
     */
    public Population nextGeneration(final Population current) {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15433);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15434);Population nextGeneration = current.nextGeneration();

        __CLR4_4_1bvybvylb90p7z0.R.inc(15435);RandomGenerator randGen = getRandomGenerator();

        __CLR4_4_1bvybvylb90p7z0.R.inc(15436);while ((((nextGeneration.getPopulationSize() < nextGeneration.getPopulationLimit())&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15437)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15438)==0&false))) {{
            // select parent chromosomes
            __CLR4_4_1bvybvylb90p7z0.R.inc(15439);ChromosomePair pair = getSelectionPolicy().select(current);

            // crossover?
            __CLR4_4_1bvybvylb90p7z0.R.inc(15440);if ((((randGen.nextDouble() < getCrossoverRate())&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15441)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15442)==0&false))) {{
                // apply crossover policy to create two offspring
                __CLR4_4_1bvybvylb90p7z0.R.inc(15443);pair = getCrossoverPolicy().crossover(pair.getFirst(), pair.getSecond());
            }

            // mutation?
            }__CLR4_4_1bvybvylb90p7z0.R.inc(15444);if ((((randGen.nextDouble() < getMutationRate())&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15445)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15446)==0&false))) {{
                // apply mutation policy to the chromosomes
                __CLR4_4_1bvybvylb90p7z0.R.inc(15447);pair = new ChromosomePair(
                    getMutationPolicy().mutate(pair.getFirst()),
                    getMutationPolicy().mutate(pair.getSecond()));
            }

            // add the first chromosome to the population
            }__CLR4_4_1bvybvylb90p7z0.R.inc(15448);nextGeneration.addChromosome(pair.getFirst());
            // is there still a place for the second chromosome?
            __CLR4_4_1bvybvylb90p7z0.R.inc(15449);if ((((nextGeneration.getPopulationSize() < nextGeneration.getPopulationLimit())&&(__CLR4_4_1bvybvylb90p7z0.R.iget(15450)!=0|true))||(__CLR4_4_1bvybvylb90p7z0.R.iget(15451)==0&false))) {{
                // add the second chromosome to the population
                __CLR4_4_1bvybvylb90p7z0.R.inc(15452);nextGeneration.addChromosome(pair.getSecond());
            }
        }}

        }__CLR4_4_1bvybvylb90p7z0.R.inc(15453);return nextGeneration;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the crossover policy.
     * @return crossover policy
     */
    public CrossoverPolicy getCrossoverPolicy() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15454);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15455);return crossoverPolicy;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the crossover rate.
     * @return crossover rate
     */
    public double getCrossoverRate() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15456);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15457);return crossoverRate;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the mutation policy.
     * @return mutation policy
     */
    public MutationPolicy getMutationPolicy() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15458);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15459);return mutationPolicy;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the mutation rate.
     * @return mutation rate
     */
    public double getMutationRate() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15460);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15461);return mutationRate;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the selection policy.
     * @return selection policy
     */
    public SelectionPolicy getSelectionPolicy() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15462);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15463);return selectionPolicy;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

    /**
     * Returns the number of generations evolved to reach {@link StoppingCondition} in the last run.
     *
     * @return number of generations evolved
     * @since 2.1
     */
    public int getGenerationsEvolved() {try{__CLR4_4_1bvybvylb90p7z0.R.inc(15464);
        __CLR4_4_1bvybvylb90p7z0.R.inc(15465);return generationsEvolved;
    }finally{__CLR4_4_1bvybvylb90p7z0.R.flushNeeded();}}

}
