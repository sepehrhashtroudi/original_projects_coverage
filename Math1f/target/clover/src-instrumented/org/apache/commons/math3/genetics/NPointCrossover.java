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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;

/**
 * N-point crossover policy. For each iteration a random crossover point is
 * selected and the first part from each parent is copied to the corresponding
 * child, and the second parts are copied crosswise.
 *
 * Example (2-point crossover):
 * <pre>
 * -C- denotes a crossover point
 *           -C-       -C-                         -C-        -C-
 * p1 = (1 0  | 1 0 0 1 | 0 1 1)    X    p2 = (0 1  | 1 0 1 0  | 1 1 1)
 *      \----/ \-------/ \-----/              \----/ \--------/ \-----/
 *        ||      (*)       ||                  ||      (**)       ||
 *        VV      (**)      VV                  VV      (*)        VV
 *      /----\ /--------\ /-----\             /----\ /--------\ /-----\
 * c1 = (1 0  | 1 0 1 0  | 0 1 1)    X   c2 = (0 1  | 1 0 0 1  | 0 1 1)
 * </pre>
 *
 * This policy works only on {@link AbstractListChromosome}, and therefore it
 * is parameterized by T. Moreover, the chromosomes must have same lengths.
 *
 * @param <T> generic type of the {@link AbstractListChromosome}s for crossover
 * @since 3.1
 * @version $Id$
 */
public class NPointCrossover<T> implements CrossoverPolicy {public static class __CLR4_4_1bznbznlb90p7zj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The number of crossover points. */
    private final int crossoverPoints;

    /**
     * Creates a new {@link NPointCrossover} policy using the given number of points.
     * <p>
     * <b>Note</b>: the number of crossover points must be &lt; <code>chromosome length - 1</code>.
     * This condition can only be checked at runtime, as the chromosome length is not known in advance.
     *
     * @param crossoverPoints the number of crossover points
     * @throws NotStrictlyPositiveException if the number of {@code crossoverPoints} is not strictly positive
     */
    public NPointCrossover(final int crossoverPoints) throws NotStrictlyPositiveException {try{__CLR4_4_1bznbznlb90p7zj.R.inc(15539);
        __CLR4_4_1bznbznlb90p7zj.R.inc(15540);if ((((crossoverPoints <= 0)&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15541)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15542)==0&false))) {{
            __CLR4_4_1bznbznlb90p7zj.R.inc(15543);throw new NotStrictlyPositiveException(crossoverPoints);
        }
        }__CLR4_4_1bznbznlb90p7zj.R.inc(15544);this.crossoverPoints = crossoverPoints;
    }finally{__CLR4_4_1bznbznlb90p7zj.R.flushNeeded();}}

    /**
     * Returns the number of crossover points used by this {@link CrossoverPolicy}.
     *
     * @return the number of crossover points
     */
    public int getCrossoverPoints() {try{__CLR4_4_1bznbznlb90p7zj.R.inc(15545);
        __CLR4_4_1bznbznlb90p7zj.R.inc(15546);return crossoverPoints;
    }finally{__CLR4_4_1bznbznlb90p7zj.R.flushNeeded();}}

    /**
     * Performs a N-point crossover. N random crossover points are selected and are used
     * to divide the parent chromosomes into segments. The segments are copied in alternate
     * order from the two parents to the corresponding child chromosomes.
     *
     * Example (2-point crossover):
     * <pre>
     * -C- denotes a crossover point
     *           -C-       -C-                         -C-        -C-
     * p1 = (1 0  | 1 0 0 1 | 0 1 1)    X    p2 = (0 1  | 1 0 1 0  | 1 1 1)
     *      \----/ \-------/ \-----/              \----/ \--------/ \-----/
     *        ||      (*)       ||                  ||      (**)       ||
     *        VV      (**)      VV                  VV      (*)        VV
     *      /----\ /--------\ /-----\             /----\ /--------\ /-----\
     * c1 = (1 0  | 1 0 1 0  | 0 1 1)    X   c2 = (0 1  | 1 0 0 1  | 0 1 1)
     * </pre>
     *
     * @param first first parent (p1)
     * @param second second parent (p2)
     * @return pair of two children (c1,c2)
     * @throws MathIllegalArgumentException iff one of the chromosomes is
     *   not an instance of {@link AbstractListChromosome}
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    @SuppressWarnings("unchecked") // OK because of instanceof checks
    public ChromosomePair crossover(final Chromosome first, final Chromosome second)
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1bznbznlb90p7zj.R.inc(15547);

        __CLR4_4_1bznbznlb90p7zj.R.inc(15548);if ((((!(first instanceof AbstractListChromosome<?> && second instanceof AbstractListChromosome<?>))&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15549)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15550)==0&false))) {{
            __CLR4_4_1bznbznlb90p7zj.R.inc(15551);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
        }
        }__CLR4_4_1bznbznlb90p7zj.R.inc(15552);return mate((AbstractListChromosome<T>) first, (AbstractListChromosome<T>) second);
    }finally{__CLR4_4_1bznbznlb90p7zj.R.flushNeeded();}}

    /**
     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.
     *
     * @param first the first chromosome
     * @param second the second chromosome
     * @return the pair of new chromosomes that resulted from the crossover
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     * @throws NumberIsTooLargeException if the number of crossoverPoints is too large for the actual chromosomes
     */
    private ChromosomePair mate(final AbstractListChromosome<T> first,
                                final AbstractListChromosome<T> second)
        throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_1bznbznlb90p7zj.R.inc(15553);

        __CLR4_4_1bznbznlb90p7zj.R.inc(15554);final int length = first.getLength();
        __CLR4_4_1bznbznlb90p7zj.R.inc(15555);if ((((length != second.getLength())&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15556)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15557)==0&false))) {{
            __CLR4_4_1bznbznlb90p7zj.R.inc(15558);throw new DimensionMismatchException(second.getLength(), length);
        }
        }__CLR4_4_1bznbznlb90p7zj.R.inc(15559);if ((((crossoverPoints >= length)&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15560)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15561)==0&false))) {{
            __CLR4_4_1bznbznlb90p7zj.R.inc(15562);throw new NumberIsTooLargeException(crossoverPoints, length, false);
        }

        // array representations of the parents
        }__CLR4_4_1bznbznlb90p7zj.R.inc(15563);final List<T> parent1Rep = first.getRepresentation();
        __CLR4_4_1bznbznlb90p7zj.R.inc(15564);final List<T> parent2Rep = second.getRepresentation();
        // and of the children
        __CLR4_4_1bznbznlb90p7zj.R.inc(15565);final ArrayList<T> child1Rep = new ArrayList<T>(first.getLength());
        __CLR4_4_1bznbznlb90p7zj.R.inc(15566);final ArrayList<T> child2Rep = new ArrayList<T>(second.getLength());

        __CLR4_4_1bznbznlb90p7zj.R.inc(15567);final RandomGenerator random = GeneticAlgorithm.getRandomGenerator();

        __CLR4_4_1bznbznlb90p7zj.R.inc(15568);ArrayList<T> c1 = child1Rep;
        __CLR4_4_1bznbznlb90p7zj.R.inc(15569);ArrayList<T> c2 = child2Rep;

        __CLR4_4_1bznbznlb90p7zj.R.inc(15570);int remainingPoints = crossoverPoints;
        __CLR4_4_1bznbznlb90p7zj.R.inc(15571);int lastIndex = 0;
        __CLR4_4_1bznbznlb90p7zj.R.inc(15572);for (int i = 0; (((i < crossoverPoints)&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15573)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15574)==0&false)); i++, remainingPoints--) {{
            // select the next crossover point at random
            __CLR4_4_1bznbznlb90p7zj.R.inc(15575);final int crossoverIndex = 1 + lastIndex + random.nextInt(length - lastIndex - remainingPoints);

            // copy the current segment
            __CLR4_4_1bznbznlb90p7zj.R.inc(15576);for (int j = lastIndex; (((j < crossoverIndex)&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15577)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15578)==0&false)); j++) {{
                __CLR4_4_1bznbznlb90p7zj.R.inc(15579);c1.add(parent1Rep.get(j));
                __CLR4_4_1bznbznlb90p7zj.R.inc(15580);c2.add(parent2Rep.get(j));
            }

            // swap the children for the next segment
            }__CLR4_4_1bznbznlb90p7zj.R.inc(15581);ArrayList<T> tmp = c1;
            __CLR4_4_1bznbznlb90p7zj.R.inc(15582);c1 = c2;
            __CLR4_4_1bznbznlb90p7zj.R.inc(15583);c2 = tmp;

            __CLR4_4_1bznbznlb90p7zj.R.inc(15584);lastIndex = crossoverIndex;
        }

        // copy the last segment
        }__CLR4_4_1bznbznlb90p7zj.R.inc(15585);for (int j = lastIndex; (((j < length)&&(__CLR4_4_1bznbznlb90p7zj.R.iget(15586)!=0|true))||(__CLR4_4_1bznbznlb90p7zj.R.iget(15587)==0&false)); j++) {{
            __CLR4_4_1bznbznlb90p7zj.R.inc(15588);c1.add(parent1Rep.get(j));
            __CLR4_4_1bznbznlb90p7zj.R.inc(15589);c2.add(parent2Rep.get(j));
        }

        }__CLR4_4_1bznbznlb90p7zj.R.inc(15590);return new ChromosomePair(first.newFixedLengthChromosome(child1Rep),
                                  second.newFixedLengthChromosome(child2Rep));
    }finally{__CLR4_4_1bznbznlb90p7zj.R.flushNeeded();}}
}
