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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Tournament selection scheme. Each of the two selected chromosomes is selected
 * based on n-ary tournament -- this is done by drawing {@link #arity} random
 * chromosomes without replacement from the population, and then selecting the
 * fittest chromosome among them.
 *
 * @since 2.0
 * @version $Id$
 */
public class TournamentSelection implements SelectionPolicy {public static class __CLR4_4_1c6dc6dlb90p810{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** number of chromosomes included in the tournament selections */
    private int arity;

    /**
     * Creates a new TournamentSelection instance.
     *
     * @param arity how many chromosomes will be drawn to the tournament
     */
    public TournamentSelection(final int arity) {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15781);
        __CLR4_4_1c6dc6dlb90p810.R.inc(15782);this.arity = arity;
    }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}

    /**
     * Select two chromosomes from the population. Each of the two selected
     * chromosomes is selected based on n-ary tournament -- this is done by
     * drawing {@link #arity} random chromosomes without replacement from the
     * population, and then selecting the fittest chromosome among them.
     *
     * @param population the population from which the chromosomes are chosen.
     * @return the selected chromosomes.
     * @throws MathIllegalArgumentException if the tournament arity is bigger than the population size
     */
    public ChromosomePair select(final Population population) throws MathIllegalArgumentException {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15783);
        __CLR4_4_1c6dc6dlb90p810.R.inc(15784);return new ChromosomePair(tournament((ListPopulation) population),
                                  tournament((ListPopulation) population));
    }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}

    /**
     * Helper for {@link #select(Population)}. Draw {@link #arity} random chromosomes without replacement from the
     * population, and then select the fittest chromosome among them.
     *
     * @param population the population from which the chromosomes are choosen.
     * @return the selected chromosome.
     * @throws MathIllegalArgumentException if the tournament arity is bigger than the population size
     */
    private Chromosome tournament(final ListPopulation population) throws MathIllegalArgumentException {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15785);
        __CLR4_4_1c6dc6dlb90p810.R.inc(15786);if ((((population.getPopulationSize() < this.arity)&&(__CLR4_4_1c6dc6dlb90p810.R.iget(15787)!=0|true))||(__CLR4_4_1c6dc6dlb90p810.R.iget(15788)==0&false))) {{
            __CLR4_4_1c6dc6dlb90p810.R.inc(15789);throw new MathIllegalArgumentException(LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY,
                                                   arity, population.getPopulationSize());
        }
        // auxiliary population
        }__CLR4_4_1c6dc6dlb90p810.R.inc(15790);ListPopulation tournamentPopulation = new ListPopulation(this.arity) {
            public Population nextGeneration() {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15791);
                // not useful here
                __CLR4_4_1c6dc6dlb90p810.R.inc(15792);return null;
            }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}
        };

        // create a copy of the chromosome list
        __CLR4_4_1c6dc6dlb90p810.R.inc(15793);List<Chromosome> chromosomes = new ArrayList<Chromosome> (population.getChromosomes());
        __CLR4_4_1c6dc6dlb90p810.R.inc(15794);for (int i=0; (((i<this.arity)&&(__CLR4_4_1c6dc6dlb90p810.R.iget(15795)!=0|true))||(__CLR4_4_1c6dc6dlb90p810.R.iget(15796)==0&false)); i++) {{
            // select a random individual and add it to the tournament
            __CLR4_4_1c6dc6dlb90p810.R.inc(15797);int rind = GeneticAlgorithm.getRandomGenerator().nextInt(chromosomes.size());
            __CLR4_4_1c6dc6dlb90p810.R.inc(15798);tournamentPopulation.addChromosome(chromosomes.get(rind));
            // do not select it again
            __CLR4_4_1c6dc6dlb90p810.R.inc(15799);chromosomes.remove(rind);
        }
        // the winner takes it all
        }__CLR4_4_1c6dc6dlb90p810.R.inc(15800);return tournamentPopulation.getFittestChromosome();
    }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}

    /**
     * Gets the arity (number of chromosomes drawn to the tournament).
     *
     * @return arity of the tournament
     */
    public int getArity() {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15801);
        __CLR4_4_1c6dc6dlb90p810.R.inc(15802);return arity;
    }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}

    /**
     * Sets the arity (number of chromosomes drawn to the tournament).
     *
     * @param arity arity of the tournament
     */
    public void setArity(final int arity) {try{__CLR4_4_1c6dc6dlb90p810.R.inc(15803);
        __CLR4_4_1c6dc6dlb90p810.R.inc(15804);this.arity = arity;
    }finally{__CLR4_4_1c6dc6dlb90p810.R.flushNeeded();}}

}
