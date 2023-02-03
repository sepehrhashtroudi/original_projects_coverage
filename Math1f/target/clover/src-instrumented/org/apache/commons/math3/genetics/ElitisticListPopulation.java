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

import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Population of chromosomes which uses elitism (certain percentage of the best
 * chromosomes is directly copied to the next generation).
 *
 * @version $Id$
 * @since 2.0
 */
public class ElitisticListPopulation extends ListPopulation {public static class __CLR4_4_1buhbuhlb90p7yn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15377,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** percentage of chromosomes copied to the next generation */
    private double elitismRate = 0.9;

    /**
     * Creates a new {@link ElitisticListPopulation} instance.
     *
     * @param chromosomes list of chromosomes in the population
     * @param populationLimit maximal size of the population
     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]
     * @throws NullArgumentException if the list of chromosomes is {@code null}
     * @throws NotPositiveException if the population limit is not a positive number (&lt; 1)
     * @throws NumberIsTooLargeException if the list of chromosomes exceeds the population limit
     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range
     */
    public ElitisticListPopulation(final List<Chromosome> chromosomes, final int populationLimit,
                                   final double elitismRate)
        throws NullArgumentException, NotPositiveException, NumberIsTooLargeException, OutOfRangeException {

        super(chromosomes, populationLimit);__CLR4_4_1buhbuhlb90p7yn.R.inc(15354);try{__CLR4_4_1buhbuhlb90p7yn.R.inc(15353);
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15355);setElitismRate(elitismRate);

    }finally{__CLR4_4_1buhbuhlb90p7yn.R.flushNeeded();}}

    /**
     * Creates a new {@link ElitisticListPopulation} instance and initializes its inner chromosome list.
     *
     * @param populationLimit maximal size of the population
     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]
     * @throws NotPositiveException if the population limit is not a positive number (&lt; 1)
     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range
     */
    public ElitisticListPopulation(final int populationLimit, final double elitismRate)
        throws NotPositiveException, OutOfRangeException {

        super(populationLimit);__CLR4_4_1buhbuhlb90p7yn.R.inc(15357);try{__CLR4_4_1buhbuhlb90p7yn.R.inc(15356);
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15358);setElitismRate(elitismRate);

    }finally{__CLR4_4_1buhbuhlb90p7yn.R.flushNeeded();}}

    /**
     * Start the population for the next generation. The <code>{@link #elitismRate}</code>
     * percents of the best chromosomes are directly copied to the next generation.
     *
     * @return the beginnings of the next generation.
     */
    public Population nextGeneration() {try{__CLR4_4_1buhbuhlb90p7yn.R.inc(15359);
        // initialize a new generation with the same parameters
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15360);ElitisticListPopulation nextGeneration =
                new ElitisticListPopulation(getPopulationLimit(), getElitismRate());

        __CLR4_4_1buhbuhlb90p7yn.R.inc(15361);final List<Chromosome> oldChromosomes = getChromosomeList();
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15362);Collections.sort(oldChromosomes);

        // index of the last "not good enough" chromosome
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15363);int boundIndex = (int) FastMath.ceil((1.0 - getElitismRate()) * oldChromosomes.size());
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15364);for (int i = boundIndex; (((i < oldChromosomes.size())&&(__CLR4_4_1buhbuhlb90p7yn.R.iget(15365)!=0|true))||(__CLR4_4_1buhbuhlb90p7yn.R.iget(15366)==0&false)); i++) {{
            __CLR4_4_1buhbuhlb90p7yn.R.inc(15367);nextGeneration.addChromosome(oldChromosomes.get(i));
        }
        }__CLR4_4_1buhbuhlb90p7yn.R.inc(15368);return nextGeneration;
    }finally{__CLR4_4_1buhbuhlb90p7yn.R.flushNeeded();}}

    /**
     * Sets the elitism rate, i.e. how many best chromosomes will be directly transferred to the next generation [in %].
     *
     * @param elitismRate how many best chromosomes will be directly transferred to the next generation [in %]
     * @throws OutOfRangeException if the elitism rate is outside the [0, 1] range
     */
    public void setElitismRate(final double elitismRate) throws OutOfRangeException {try{__CLR4_4_1buhbuhlb90p7yn.R.inc(15369);
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15370);if ((((elitismRate < 0 || elitismRate > 1)&&(__CLR4_4_1buhbuhlb90p7yn.R.iget(15371)!=0|true))||(__CLR4_4_1buhbuhlb90p7yn.R.iget(15372)==0&false))) {{
            __CLR4_4_1buhbuhlb90p7yn.R.inc(15373);throw new OutOfRangeException(LocalizedFormats.ELITISM_RATE, elitismRate, 0, 1);
        }
        }__CLR4_4_1buhbuhlb90p7yn.R.inc(15374);this.elitismRate = elitismRate;
    }finally{__CLR4_4_1buhbuhlb90p7yn.R.flushNeeded();}}

    /**
     * Access the elitism rate.
     * @return the elitism rate
     */
    public double getElitismRate() {try{__CLR4_4_1buhbuhlb90p7yn.R.inc(15375);
        __CLR4_4_1buhbuhlb90p7yn.R.inc(15376);return this.elitismRate;
    }finally{__CLR4_4_1buhbuhlb90p7yn.R.flushNeeded();}}

}
