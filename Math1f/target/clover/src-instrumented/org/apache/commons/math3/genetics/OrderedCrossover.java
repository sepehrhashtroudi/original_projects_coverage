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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.FastMath;

/**
 * Order 1 Crossover [OX1] builds offspring from <b>ordered</b> chromosomes by copying a
 * consecutive slice from one parent, and filling up the remaining genes from the other
 * parent as they appear.
 * <p>
 * This policy works by applying the following rules:
 * <ol>
 *   <li>select a random slice of consecutive genes from parent 1</li>
 *   <li>copy the slice to child 1 and mark out the genes in parent 2</li>
 *   <li>starting from the right side of the slice, copy genes from parent 2 as they
 *       appear to child 1 if they are not yet marked out.</li>
 * </ol>
 * <p>
 * Example (random sublist from index 3 to 7, underlined):
 * <pre>
 * p1 = (8 4 7 3 6 2 5 1 9 0)   X   c1 = (0 4 7 3 6 2 5 1 8 9)
 *             ---------                        ---------
 * p2 = (0 1 2 3 4 5 6 7 8 9)   X   c2 = (8 1 2 3 4 5 6 7 9 0)
 * </pre>
 * <p>
 * This policy works only on {@link AbstractListChromosome}, and therefore it
 * is parameterized by T. Moreover, the chromosomes must have same lengths.
 *
 * @see <a href="http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/Order1CrossoverOperator.aspx">
 * Order 1 Crossover Operator</a>
 *
 * @param <T> generic type of the {@link AbstractListChromosome}s for crossover
 * @since 3.1
 * @version $Id$
 */
public class OrderedCrossover<T> implements CrossoverPolicy {public static class __CLR4_4_1c1vc1vlb90p809{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException iff one of the chromosomes is
     *   not an instance of {@link AbstractListChromosome}
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    @SuppressWarnings("unchecked")
    public ChromosomePair crossover(final Chromosome first, final Chromosome second)
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1c1vc1vlb90p809.R.inc(15619);

        __CLR4_4_1c1vc1vlb90p809.R.inc(15620);if ((((!(first instanceof AbstractListChromosome<?> && second instanceof AbstractListChromosome<?>))&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15621)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15622)==0&false))) {{
            __CLR4_4_1c1vc1vlb90p809.R.inc(15623);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
        }
        }__CLR4_4_1c1vc1vlb90p809.R.inc(15624);return mate((AbstractListChromosome<T>) first, (AbstractListChromosome<T>) second);
    }finally{__CLR4_4_1c1vc1vlb90p809.R.flushNeeded();}}

    /**
     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.
     *
     * @param first the first chromosome
     * @param second the second chromosome
     * @return the pair of new chromosomes that resulted from the crossover
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    protected ChromosomePair mate(final AbstractListChromosome<T> first, final AbstractListChromosome<T> second)
        throws DimensionMismatchException {try{__CLR4_4_1c1vc1vlb90p809.R.inc(15625);

        __CLR4_4_1c1vc1vlb90p809.R.inc(15626);final int length = first.getLength();
        __CLR4_4_1c1vc1vlb90p809.R.inc(15627);if ((((length != second.getLength())&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15628)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15629)==0&false))) {{
            __CLR4_4_1c1vc1vlb90p809.R.inc(15630);throw new DimensionMismatchException(second.getLength(), length);
        }

        // array representations of the parents
        }__CLR4_4_1c1vc1vlb90p809.R.inc(15631);final List<T> parent1Rep = first.getRepresentation();
        __CLR4_4_1c1vc1vlb90p809.R.inc(15632);final List<T> parent2Rep = second.getRepresentation();
        // and of the children
        __CLR4_4_1c1vc1vlb90p809.R.inc(15633);final List<T> child1 = new ArrayList<T>(length);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15634);final List<T> child2 = new ArrayList<T>(length);
        // sets of already inserted items for quick access
        __CLR4_4_1c1vc1vlb90p809.R.inc(15635);final Set<T> child1Set = new HashSet<T>(length);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15636);final Set<T> child2Set = new HashSet<T>(length);

        __CLR4_4_1c1vc1vlb90p809.R.inc(15637);final RandomGenerator random = GeneticAlgorithm.getRandomGenerator();
        // choose random points, making sure that lb < ub.
        __CLR4_4_1c1vc1vlb90p809.R.inc(15638);int a = random.nextInt(length);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15639);int b;
        __CLR4_4_1c1vc1vlb90p809.R.inc(15640);do {{
            __CLR4_4_1c1vc1vlb90p809.R.inc(15641);b = random.nextInt(length);
        } }while ((((a == b)&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15642)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15643)==0&false)));
        // determine the lower and upper bounds
        __CLR4_4_1c1vc1vlb90p809.R.inc(15644);final int lb = FastMath.min(a, b);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15645);final int ub = FastMath.max(a, b);

        // add the subLists that are between lb and ub
        __CLR4_4_1c1vc1vlb90p809.R.inc(15646);child1.addAll(parent1Rep.subList(lb, ub + 1));
        __CLR4_4_1c1vc1vlb90p809.R.inc(15647);child1Set.addAll(child1);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15648);child2.addAll(parent2Rep.subList(lb, ub + 1));
        __CLR4_4_1c1vc1vlb90p809.R.inc(15649);child2Set.addAll(child2);

        // iterate over every item in the parents
        __CLR4_4_1c1vc1vlb90p809.R.inc(15650);for (int i = 1; (((i <= length)&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15651)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15652)==0&false)); i++) {{
            __CLR4_4_1c1vc1vlb90p809.R.inc(15653);final int idx = (ub + i) % length;

            // retrieve the current item in each parent
            __CLR4_4_1c1vc1vlb90p809.R.inc(15654);final T item1 = parent1Rep.get(idx);
            __CLR4_4_1c1vc1vlb90p809.R.inc(15655);final T item2 = parent2Rep.get(idx);

            // if the first child already contains the item in the second parent add it
            __CLR4_4_1c1vc1vlb90p809.R.inc(15656);if ((((!child1Set.contains(item2))&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15657)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15658)==0&false))) {{
                __CLR4_4_1c1vc1vlb90p809.R.inc(15659);child1.add(item2);
                __CLR4_4_1c1vc1vlb90p809.R.inc(15660);child1Set.add(item2);
            }

            // if the second child already contains the item in the first parent add it
            }__CLR4_4_1c1vc1vlb90p809.R.inc(15661);if ((((!child2Set.contains(item1))&&(__CLR4_4_1c1vc1vlb90p809.R.iget(15662)!=0|true))||(__CLR4_4_1c1vc1vlb90p809.R.iget(15663)==0&false))) {{
                __CLR4_4_1c1vc1vlb90p809.R.inc(15664);child2.add(item1);
                __CLR4_4_1c1vc1vlb90p809.R.inc(15665);child2Set.add(item1);
            }
        }}

        // rotate so that the original slice is in the same place as in the parents.
        }__CLR4_4_1c1vc1vlb90p809.R.inc(15666);Collections.rotate(child1, lb);
        __CLR4_4_1c1vc1vlb90p809.R.inc(15667);Collections.rotate(child2, lb);

        __CLR4_4_1c1vc1vlb90p809.R.inc(15668);return new ChromosomePair(first.newFixedLengthChromosome(child1),
                                  second.newFixedLengthChromosome(child2));
    }finally{__CLR4_4_1c1vc1vlb90p809.R.flushNeeded();}}
}
