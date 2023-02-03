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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;

/**
 * Perform Uniform Crossover [UX] on the specified chromosomes. A fixed mixing
 * ratio is used to combine genes from the first and second parents, e.g. using a
 * ratio of 0.5 would result in approximately 50% of genes coming from each
 * parent. This is typically a poor method of crossover, but empirical evidence
 * suggests that it is more exploratory and results in a larger part of the
 * problem space being searched.
 * <p>
 * This crossover policy evaluates each gene of the parent chromosomes by chosing a
 * uniform random number {@code p} in the range [0, 1]. If {@code p} &lt; {@code ratio},
 * the parent genes are swapped. This means with a ratio of 0.7, 30% of the genes from the
 * first parent and 70% from the second parent will be selected for the first offspring (and
 * vice versa for the second offspring).
 * <p>
 * This policy works only on {@link AbstractListChromosome}, and therefore it
 * is parameterized by T. Moreover, the chromosomes must have same lengths.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Crossover_%28genetic_algorithm%29">Crossover techniques (Wikipedia)</a>
 * @see <a href="http://www.obitko.com/tutorials/genetic-algorithms/crossover-mutation.php">Crossover (Obitko.com)</a>
 * @see <a href="http://www.tomaszgwiazda.com/uniformX.htm">Uniform crossover</a>
 * @param <T> generic type of the {@link AbstractListChromosome}s for crossover
 * @since 3.1
 * @version $Id$
 */
public class UniformCrossover<T> implements CrossoverPolicy {public static class __CLR4_4_1c71c71lb90p816{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The mixing ratio. */
    private final double ratio;

    /**
     * Creates a new {@link UniformCrossover} policy using the given mixing ratio.
     *
     * @param ratio the mixing ratio
     * @throws OutOfRangeException if the mixing ratio is outside the [0, 1] range
     */
    public UniformCrossover(final double ratio) throws OutOfRangeException {try{__CLR4_4_1c71c71lb90p816.R.inc(15805);
        __CLR4_4_1c71c71lb90p816.R.inc(15806);if ((((ratio < 0.0d || ratio > 1.0d)&&(__CLR4_4_1c71c71lb90p816.R.iget(15807)!=0|true))||(__CLR4_4_1c71c71lb90p816.R.iget(15808)==0&false))) {{
            __CLR4_4_1c71c71lb90p816.R.inc(15809);throw new OutOfRangeException(LocalizedFormats.CROSSOVER_RATE, ratio, 0.0d, 1.0d);
        }
        }__CLR4_4_1c71c71lb90p816.R.inc(15810);this.ratio = ratio;
    }finally{__CLR4_4_1c71c71lb90p816.R.flushNeeded();}}

    /**
     * Returns the mixing ratio used by this {@link CrossoverPolicy}.
     *
     * @return the mixing ratio
     */
    public double getRatio() {try{__CLR4_4_1c71c71lb90p816.R.inc(15811);
        __CLR4_4_1c71c71lb90p816.R.inc(15812);return ratio;
    }finally{__CLR4_4_1c71c71lb90p816.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException iff one of the chromosomes is
     *   not an instance of {@link AbstractListChromosome}
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    @SuppressWarnings("unchecked")
    public ChromosomePair crossover(final Chromosome first, final Chromosome second)
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1c71c71lb90p816.R.inc(15813);

        __CLR4_4_1c71c71lb90p816.R.inc(15814);if ((((!(first instanceof AbstractListChromosome<?> && second instanceof AbstractListChromosome<?>))&&(__CLR4_4_1c71c71lb90p816.R.iget(15815)!=0|true))||(__CLR4_4_1c71c71lb90p816.R.iget(15816)==0&false))) {{
            __CLR4_4_1c71c71lb90p816.R.inc(15817);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
        }
        }__CLR4_4_1c71c71lb90p816.R.inc(15818);return mate((AbstractListChromosome<T>) first, (AbstractListChromosome<T>) second);
    }finally{__CLR4_4_1c71c71lb90p816.R.flushNeeded();}}

    /**
     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.
     *
     * @param first the first chromosome
     * @param second the second chromosome
     * @return the pair of new chromosomes that resulted from the crossover
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    private ChromosomePair mate(final AbstractListChromosome<T> first,
                                final AbstractListChromosome<T> second) throws DimensionMismatchException {try{__CLR4_4_1c71c71lb90p816.R.inc(15819);
        __CLR4_4_1c71c71lb90p816.R.inc(15820);final int length = first.getLength();
        __CLR4_4_1c71c71lb90p816.R.inc(15821);if ((((length != second.getLength())&&(__CLR4_4_1c71c71lb90p816.R.iget(15822)!=0|true))||(__CLR4_4_1c71c71lb90p816.R.iget(15823)==0&false))) {{
            __CLR4_4_1c71c71lb90p816.R.inc(15824);throw new DimensionMismatchException(second.getLength(), length);
        }

        // array representations of the parents
        }__CLR4_4_1c71c71lb90p816.R.inc(15825);final List<T> parent1Rep = first.getRepresentation();
        __CLR4_4_1c71c71lb90p816.R.inc(15826);final List<T> parent2Rep = second.getRepresentation();
        // and of the children
        __CLR4_4_1c71c71lb90p816.R.inc(15827);final List<T> child1Rep = new ArrayList<T>(first.getLength());
        __CLR4_4_1c71c71lb90p816.R.inc(15828);final List<T> child2Rep = new ArrayList<T>(second.getLength());

        __CLR4_4_1c71c71lb90p816.R.inc(15829);final RandomGenerator random = GeneticAlgorithm.getRandomGenerator();

        __CLR4_4_1c71c71lb90p816.R.inc(15830);for (int index = 0; (((index < length)&&(__CLR4_4_1c71c71lb90p816.R.iget(15831)!=0|true))||(__CLR4_4_1c71c71lb90p816.R.iget(15832)==0&false)); index++) {{

            __CLR4_4_1c71c71lb90p816.R.inc(15833);if ((((random.nextDouble() < ratio)&&(__CLR4_4_1c71c71lb90p816.R.iget(15834)!=0|true))||(__CLR4_4_1c71c71lb90p816.R.iget(15835)==0&false))) {{
                // swap the bits -> take other parent
                __CLR4_4_1c71c71lb90p816.R.inc(15836);child1Rep.add(parent2Rep.get(index));
                __CLR4_4_1c71c71lb90p816.R.inc(15837);child2Rep.add(parent1Rep.get(index));
            } }else {{
                __CLR4_4_1c71c71lb90p816.R.inc(15838);child1Rep.add(parent1Rep.get(index));
                __CLR4_4_1c71c71lb90p816.R.inc(15839);child2Rep.add(parent2Rep.get(index));
            }
        }}

        }__CLR4_4_1c71c71lb90p816.R.inc(15840);return new ChromosomePair(first.newFixedLengthChromosome(child1Rep),
                                  second.newFixedLengthChromosome(child2Rep));
    }finally{__CLR4_4_1c71c71lb90p816.R.flushNeeded();}}
}
