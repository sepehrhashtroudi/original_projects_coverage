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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

/**
 * Population of chromosomes represented by a {@link List}.
 *
 * @since 2.0
 * @version $Id$
 */
public abstract class ListPopulation implements Population {public static class __CLR4_4_1bxobxolb90p7za{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** List of chromosomes */
    private List<Chromosome> chromosomes;

    /** maximal size of the population */
    private int populationLimit;

    /**
     * Creates a new ListPopulation instance and initializes its inner chromosome list.
     *
     * @param populationLimit maximal size of the population
     * @throws NotPositiveException if the population limit is not a positive number (&lt; 1)
     */
    public ListPopulation(final int populationLimit) throws NotPositiveException {
        this(Collections.<Chromosome> emptyList(), populationLimit);__CLR4_4_1bxobxolb90p7za.R.inc(15469);try{__CLR4_4_1bxobxolb90p7za.R.inc(15468);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Creates a new ListPopulation instance.
     * <p>
     * Note: the chromosomes of the specified list are added to the population.
     *
     * @param chromosomes list of chromosomes to be added to the population
     * @param populationLimit maximal size of the population
     * @throws NullArgumentException if the list of chromosomes is {@code null}
     * @throws NotPositiveException if the population limit is not a positive number (&lt; 1)
     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit
     */
    public ListPopulation(final List<Chromosome> chromosomes, final int populationLimit)
        throws NullArgumentException, NotPositiveException, NumberIsTooLargeException {try{__CLR4_4_1bxobxolb90p7za.R.inc(15470);

        __CLR4_4_1bxobxolb90p7za.R.inc(15471);if ((((chromosomes == null)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15472)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15473)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15474);throw new NullArgumentException();
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15475);if ((((populationLimit <= 0)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15476)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15477)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15478);throw new NotPositiveException(LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE, populationLimit);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15479);if ((((chromosomes.size() > populationLimit)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15480)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15481)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15482);throw new NumberIsTooLargeException(LocalizedFormats.LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE,
                                                chromosomes.size(), populationLimit, false);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15483);this.populationLimit = populationLimit;
        __CLR4_4_1bxobxolb90p7za.R.inc(15484);this.chromosomes = new ArrayList<Chromosome>(populationLimit);
        __CLR4_4_1bxobxolb90p7za.R.inc(15485);this.chromosomes.addAll(chromosomes);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Sets the list of chromosomes.
     * <p>
     * Note: this method removed all existing chromosomes in the population and adds all chromosomes
     * of the specified list to the population.
     *
     * @param chromosomes the list of chromosomes
     * @throws NullArgumentException if the list of chromosomes is {@code null}
     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit
     * @deprecated use {@link #addChromosomes(Collection)} instead
     */
    @Deprecated
    public void setChromosomes(final List<Chromosome> chromosomes)
        throws NullArgumentException, NumberIsTooLargeException {try{__CLR4_4_1bxobxolb90p7za.R.inc(15486);

        __CLR4_4_1bxobxolb90p7za.R.inc(15487);if ((((chromosomes == null)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15488)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15489)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15490);throw new NullArgumentException();
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15491);if ((((chromosomes.size() > populationLimit)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15492)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15493)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15494);throw new NumberIsTooLargeException(LocalizedFormats.LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE,
                                                chromosomes.size(), populationLimit, false);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15495);this.chromosomes.clear();
        __CLR4_4_1bxobxolb90p7za.R.inc(15496);this.chromosomes.addAll(chromosomes);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Add a {@link Collection} of chromosomes to this {@link Population}.
     * @param chromosomeColl a {@link Collection} of chromosomes
     * @throws NumberIsTooLargeException if the population would exceed the population limit when
     * adding this chromosome
     * @since 3.1
     */
    public void addChromosomes(final Collection<Chromosome> chromosomeColl) throws NumberIsTooLargeException {try{__CLR4_4_1bxobxolb90p7za.R.inc(15497);
        __CLR4_4_1bxobxolb90p7za.R.inc(15498);if ((((chromosomes.size() + chromosomeColl.size() > populationLimit)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15499)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15500)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15501);throw new NumberIsTooLargeException(LocalizedFormats.LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE,
                                                chromosomes.size(), populationLimit, false);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15502);this.chromosomes.addAll(chromosomeColl);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Returns an unmodifiable list of the chromosomes in this population.
     * @return the unmodifiable list of chromosomes
     */
    public List<Chromosome> getChromosomes() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15503);
        __CLR4_4_1bxobxolb90p7za.R.inc(15504);return Collections.unmodifiableList(chromosomes);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Access the list of chromosomes.
     * @return the list of chromosomes
     * @since 3.1
     */
    protected List<Chromosome> getChromosomeList() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15505);
        __CLR4_4_1bxobxolb90p7za.R.inc(15506);return chromosomes;
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Add the given chromosome to the population.
     *
     * @param chromosome the chromosome to add.
     * @throws NumberIsTooLargeException if the population would exceed the {@code populationLimit} after
     *   adding this chromosome
     */
    public void addChromosome(final Chromosome chromosome) throws NumberIsTooLargeException {try{__CLR4_4_1bxobxolb90p7za.R.inc(15507);
        __CLR4_4_1bxobxolb90p7za.R.inc(15508);if ((((chromosomes.size() >= populationLimit)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15509)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15510)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15511);throw new NumberIsTooLargeException(LocalizedFormats.LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE,
                                                chromosomes.size(), populationLimit, false);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15512);this.chromosomes.add(chromosome);
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Access the fittest chromosome in this population.
     * @return the fittest chromosome.
     */
    public Chromosome getFittestChromosome() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15513);
        // best so far
        __CLR4_4_1bxobxolb90p7za.R.inc(15514);Chromosome bestChromosome = this.chromosomes.get(0);
        __CLR4_4_1bxobxolb90p7za.R.inc(15515);for (Chromosome chromosome : this.chromosomes) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15516);if ((((chromosome.compareTo(bestChromosome) > 0)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15517)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15518)==0&false))) {{
                // better chromosome found
                __CLR4_4_1bxobxolb90p7za.R.inc(15519);bestChromosome = chromosome;
            }
        }}
        }__CLR4_4_1bxobxolb90p7za.R.inc(15520);return bestChromosome;
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Access the maximum population size.
     * @return the maximum population size.
     */
    public int getPopulationLimit() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15521);
        __CLR4_4_1bxobxolb90p7za.R.inc(15522);return this.populationLimit;
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Sets the maximal population size.
     * @param populationLimit maximal population size.
     * @throws NotPositiveException if the population limit is not a positive number (&lt; 1)
     * @throws NumberIsTooSmallException if the new population size is smaller than the current number
     *   of chromosomes in the population
     */
    public void setPopulationLimit(final int populationLimit) throws NotPositiveException, NumberIsTooSmallException {try{__CLR4_4_1bxobxolb90p7za.R.inc(15523);
        __CLR4_4_1bxobxolb90p7za.R.inc(15524);if ((((populationLimit <= 0)&&(__CLR4_4_1bxobxolb90p7za.R.iget(15525)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15526)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15527);throw new NotPositiveException(LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE, populationLimit);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15528);if ((((populationLimit < chromosomes.size())&&(__CLR4_4_1bxobxolb90p7za.R.iget(15529)!=0|true))||(__CLR4_4_1bxobxolb90p7za.R.iget(15530)==0&false))) {{
            __CLR4_4_1bxobxolb90p7za.R.inc(15531);throw new NumberIsTooSmallException(populationLimit, chromosomes.size(), true);
        }
        }__CLR4_4_1bxobxolb90p7za.R.inc(15532);this.populationLimit = populationLimit;
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Access the current population size.
     * @return the current population size.
     */
    public int getPopulationSize() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15533);
        __CLR4_4_1bxobxolb90p7za.R.inc(15534);return this.chromosomes.size();
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15535);
        __CLR4_4_1bxobxolb90p7za.R.inc(15536);return this.chromosomes.toString();
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}

    /**
     * Returns an iterator over the unmodifiable list of chromosomes.
     * <p>Any call to {@link Iterator#remove()} will result in a {@link UnsupportedOperationException}.</p>
     *
     * @return chromosome iterator
     */
    public Iterator<Chromosome> iterator() {try{__CLR4_4_1bxobxolb90p7za.R.inc(15537);
        __CLR4_4_1bxobxolb90p7za.R.inc(15538);return getChromosomes().iterator();
    }finally{__CLR4_4_1bxobxolb90p7za.R.flushNeeded();}}
}
