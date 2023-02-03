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


import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is also an example of usage.
 */
public class GeneticAlgorithmTestBinary {static class __CLR4_4_11nv81nv8lb90pcog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // parameters for the GA
    private static final int DIMENSION = 50;
    private static final int POPULATION_SIZE = 50;
    private static final int NUM_GENERATIONS = 50;
    private static final double ELITISM_RATE = 0.2;
    private static final double CROSSOVER_RATE = 1;
    private static final double MUTATION_RATE = 0.1;
    private static final int TOURNAMENT_ARITY = 2;

    @Test
    public void test() {__CLR4_4_11nv81nv8lb90pcog.R.globalSliceStart(getClass().getName(),77588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt31nv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nv81nv8lb90pcog.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nv81nv8lb90pcog.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt31nv8(){try{__CLR4_4_11nv81nv8lb90pcog.R.inc(77588);
        // to test a stochastic algorithm is hard, so this will rather be an usage example

        // initialize a new genetic algorithm
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77589);GeneticAlgorithm ga = new GeneticAlgorithm(
                new OnePointCrossover<Integer>(),
                CROSSOVER_RATE, // all selected chromosomes will be recombined (=crosssover)
                new BinaryMutation(),
                MUTATION_RATE,
                new TournamentSelection(TOURNAMENT_ARITY)
        );

        __CLR4_4_11nv81nv8lb90pcog.R.inc(77590);Assert.assertEquals(0, ga.getGenerationsEvolved());

        // initial population
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77591);Population initial = randomPopulation();
        // stopping conditions
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77592);StoppingCondition stopCond = new FixedGenerationCount(NUM_GENERATIONS);

        // best initial chromosome
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77593);Chromosome bestInitial = initial.getFittestChromosome();

        // run the algorithm
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77594);Population finalPopulation = ga.evolve(initial, stopCond);

        // best chromosome from the final population
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77595);Chromosome bestFinal = finalPopulation.getFittestChromosome();

        // the only thing we can test is whether the final solution is not worse than the initial one
        // however, for some implementations of GA, this need not be true :)

        __CLR4_4_11nv81nv8lb90pcog.R.inc(77596);Assert.assertTrue(bestFinal.compareTo(bestInitial) > 0);
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77597);Assert.assertEquals(NUM_GENERATIONS, ga.getGenerationsEvolved());

    }finally{__CLR4_4_11nv81nv8lb90pcog.R.flushNeeded();}}




    /**
     * Initializes a random population.
     */
    private static ElitisticListPopulation randomPopulation() {try{__CLR4_4_11nv81nv8lb90pcog.R.inc(77598);
        __CLR4_4_11nv81nv8lb90pcog.R.inc(77599);List<Chromosome> popList = new LinkedList<Chromosome>();

        __CLR4_4_11nv81nv8lb90pcog.R.inc(77600);for (int i=0; (((i<POPULATION_SIZE)&&(__CLR4_4_11nv81nv8lb90pcog.R.iget(77601)!=0|true))||(__CLR4_4_11nv81nv8lb90pcog.R.iget(77602)==0&false)); i++) {{
            __CLR4_4_11nv81nv8lb90pcog.R.inc(77603);BinaryChromosome randChrom = new FindOnes(BinaryChromosome.randomBinaryRepresentation(DIMENSION));
            __CLR4_4_11nv81nv8lb90pcog.R.inc(77604);popList.add(randChrom);
        }
        }__CLR4_4_11nv81nv8lb90pcog.R.inc(77605);return new ElitisticListPopulation(popList, popList.size(), ELITISM_RATE);
    }finally{__CLR4_4_11nv81nv8lb90pcog.R.flushNeeded();}}

    /**
     * Chromosomes represented by a binary chromosome.
     *
     * The goal is to set all bits (genes) to 1.
     */
    private static class FindOnes extends BinaryChromosome {

        public FindOnes(List<Integer> representation) {
            super(representation);__CLR4_4_11nv81nv8lb90pcog.R.inc(77607);try{__CLR4_4_11nv81nv8lb90pcog.R.inc(77606);
        }finally{__CLR4_4_11nv81nv8lb90pcog.R.flushNeeded();}}

        /**
         * Returns number of elements != 0
         */
        public double fitness() {try{__CLR4_4_11nv81nv8lb90pcog.R.inc(77608);
            __CLR4_4_11nv81nv8lb90pcog.R.inc(77609);int num = 0;
            __CLR4_4_11nv81nv8lb90pcog.R.inc(77610);for (int val : this.getRepresentation()) {{
                __CLR4_4_11nv81nv8lb90pcog.R.inc(77611);if ((((val != 0)&&(__CLR4_4_11nv81nv8lb90pcog.R.iget(77612)!=0|true))||(__CLR4_4_11nv81nv8lb90pcog.R.iget(77613)==0&false)))
                    {__CLR4_4_11nv81nv8lb90pcog.R.inc(77614);num++;
            }}
            // number of elements >= 0
            }__CLR4_4_11nv81nv8lb90pcog.R.inc(77615);return num;
        }finally{__CLR4_4_11nv81nv8lb90pcog.R.flushNeeded();}}

        @Override
        public AbstractListChromosome<Integer> newFixedLengthChromosome(List<Integer> chromosomeRepresentation) {try{__CLR4_4_11nv81nv8lb90pcog.R.inc(77616);
            __CLR4_4_11nv81nv8lb90pcog.R.inc(77617);return new FindOnes(chromosomeRepresentation);
        }finally{__CLR4_4_11nv81nv8lb90pcog.R.flushNeeded();}}

    }
}
