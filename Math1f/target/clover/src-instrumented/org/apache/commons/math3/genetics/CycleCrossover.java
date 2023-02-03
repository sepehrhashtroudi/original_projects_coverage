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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Cycle Crossover [CX] builds offspring from <b>ordered</b> chromosomes by identifying cycles
 * between two parent chromosomes. To form the children, the cycles are copied from the
 * respective parents.
 * <p>
 * To form a cycle the following procedure is applied:
 * <ol>
 *   <li>start with the first gene of parent 1</li>
 *   <li>look at the gene at the same position of parent 2</li>
 *   <li>go to the position with the same gene in parent 1</li>
 *   <li>add this gene index to the cycle</li>
 *   <li>repeat the steps 2-5 until we arrive at the starting gene of this cycle</li>
 * </ol>
 * The indices that form a cycle are then used to form the children in alternating order, i.e.
 * in cycle 1, the genes of parent 1 are copied to child 1, while in cycle 2 the genes of parent 1
 * are copied to child 2, and so forth ...
 * </p>
 *
 * Example (zero-start cycle):
 * <pre>
 * p1 = (8 4 7 3 6 2 5 1 9 0)    X   c1 = (8 1 2 3 4 5 6 7 9 0)
 * p2 = (0 1 2 3 4 5 6 7 8 9)    X   c2 = (0 4 7 3 6 2 5 1 8 9)
 *
 * cycle 1: 8 0 9
 * cycle 2: 4 1 7 2 5 6
 * cycle 3: 3
 * </pre>
 *
 * This policy works only on {@link AbstractListChromosome}, and therefore it
 * is parameterized by T. Moreover, the chromosomes must have same lengths.
 *
 * @see <a href="http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/CycleCrossoverOperator.aspx">
 * Cycle Crossover Operator</a>
 *
 * @param <T> generic type of the {@link AbstractListChromosome}s for crossover
 * @since 3.1
 * @version $Id$
 */
public class CycleCrossover<T> implements CrossoverPolicy {public static class __CLR4_4_1bsubsulb90p7yh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** If the start index shall be chosen randomly. */
    private final boolean randomStart;

    /**
     * Creates a new {@link CycleCrossover} policy.
     */
    public CycleCrossover() {
        this(false);__CLR4_4_1bsubsulb90p7yh.R.inc(15295);try{__CLR4_4_1bsubsulb90p7yh.R.inc(15294);
    }finally{__CLR4_4_1bsubsulb90p7yh.R.flushNeeded();}}

    /**
     * Creates a new {@link CycleCrossover} policy using the given {@code randomStart} behavior.
     *
     * @param randomStart whether the start index shall be chosen randomly or be set to 0
     */
    public CycleCrossover(final boolean randomStart) {try{__CLR4_4_1bsubsulb90p7yh.R.inc(15296);
        __CLR4_4_1bsubsulb90p7yh.R.inc(15297);this.randomStart = randomStart;
    }finally{__CLR4_4_1bsubsulb90p7yh.R.flushNeeded();}}

    /**
     * Returns whether the starting index is chosen randomly or set to zero.
     *
     * @return {@code true} if the starting index is chosen randomly, {@code false} otherwise
     */
    public boolean isRandomStart() {try{__CLR4_4_1bsubsulb90p7yh.R.inc(15298);
        __CLR4_4_1bsubsulb90p7yh.R.inc(15299);return randomStart;
    }finally{__CLR4_4_1bsubsulb90p7yh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException if the chromosomes are not an instance of {@link AbstractListChromosome}
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    @SuppressWarnings("unchecked")
    public ChromosomePair crossover(final Chromosome first, final Chromosome second)
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1bsubsulb90p7yh.R.inc(15300);

        __CLR4_4_1bsubsulb90p7yh.R.inc(15301);if ((((!(first instanceof AbstractListChromosome<?> && second instanceof AbstractListChromosome<?>))&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15302)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15303)==0&false))) {{
            __CLR4_4_1bsubsulb90p7yh.R.inc(15304);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
        }
        }__CLR4_4_1bsubsulb90p7yh.R.inc(15305);return mate((AbstractListChromosome<T>) first, (AbstractListChromosome<T>) second);
    }finally{__CLR4_4_1bsubsulb90p7yh.R.flushNeeded();}}

    /**
     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.
     *
     * @param first the first chromosome
     * @param second the second chromosome
     * @return the pair of new chromosomes that resulted from the crossover
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    protected ChromosomePair mate(final AbstractListChromosome<T> first, final AbstractListChromosome<T> second)
        throws DimensionMismatchException {try{__CLR4_4_1bsubsulb90p7yh.R.inc(15306);

        __CLR4_4_1bsubsulb90p7yh.R.inc(15307);final int length = first.getLength();
        __CLR4_4_1bsubsulb90p7yh.R.inc(15308);if ((((length != second.getLength())&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15309)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15310)==0&false))) {{
            __CLR4_4_1bsubsulb90p7yh.R.inc(15311);throw new DimensionMismatchException(second.getLength(), length);
        }

        // array representations of the parents
        }__CLR4_4_1bsubsulb90p7yh.R.inc(15312);final List<T> parent1Rep = first.getRepresentation();
        __CLR4_4_1bsubsulb90p7yh.R.inc(15313);final List<T> parent2Rep = second.getRepresentation();
        // and of the children: do a crossover copy to simplify the later processing
        __CLR4_4_1bsubsulb90p7yh.R.inc(15314);final List<T> child1Rep = new ArrayList<T>(second.getRepresentation());
        __CLR4_4_1bsubsulb90p7yh.R.inc(15315);final List<T> child2Rep = new ArrayList<T>(first.getRepresentation());

        // the set of all visited indices so far
        __CLR4_4_1bsubsulb90p7yh.R.inc(15316);final Set<Integer> visitedIndices = new HashSet<Integer>(length);
        // the indices of the current cycle
        __CLR4_4_1bsubsulb90p7yh.R.inc(15317);final List<Integer> indices = new ArrayList<Integer>(length);

        // determine the starting index
        __CLR4_4_1bsubsulb90p7yh.R.inc(15318);int idx = (((randomStart )&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15319)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15320)==0&false))? GeneticAlgorithm.getRandomGenerator().nextInt(length) : 0;
        __CLR4_4_1bsubsulb90p7yh.R.inc(15321);int cycle = 1;

        __CLR4_4_1bsubsulb90p7yh.R.inc(15322);while ((((visitedIndices.size() < length)&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15323)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15324)==0&false))) {{
            __CLR4_4_1bsubsulb90p7yh.R.inc(15325);indices.add(idx);

            __CLR4_4_1bsubsulb90p7yh.R.inc(15326);T item = parent2Rep.get(idx);
            __CLR4_4_1bsubsulb90p7yh.R.inc(15327);idx = parent1Rep.indexOf(item);

            __CLR4_4_1bsubsulb90p7yh.R.inc(15328);while ((((idx != indices.get(0))&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15329)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15330)==0&false))) {{
                // add that index to the cycle indices
                __CLR4_4_1bsubsulb90p7yh.R.inc(15331);indices.add(idx);
                // get the item in the second parent at that index
                __CLR4_4_1bsubsulb90p7yh.R.inc(15332);item = parent2Rep.get(idx);
                // get the index of that item in the first parent
                __CLR4_4_1bsubsulb90p7yh.R.inc(15333);idx = parent1Rep.indexOf(item);
            }

            // for even cycles: swap the child elements on the indices found in this cycle
            }__CLR4_4_1bsubsulb90p7yh.R.inc(15334);if ((((cycle++ % 2 != 0)&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15335)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15336)==0&false))) {{
                __CLR4_4_1bsubsulb90p7yh.R.inc(15337);for (int i : indices) {{
                    __CLR4_4_1bsubsulb90p7yh.R.inc(15338);T tmp = child1Rep.get(i);
                    __CLR4_4_1bsubsulb90p7yh.R.inc(15339);child1Rep.set(i, child2Rep.get(i));
                    __CLR4_4_1bsubsulb90p7yh.R.inc(15340);child2Rep.set(i, tmp);
                }
            }}

            }__CLR4_4_1bsubsulb90p7yh.R.inc(15341);visitedIndices.addAll(indices);
            // find next starting index: last one + 1 until we find an unvisited index
            __CLR4_4_1bsubsulb90p7yh.R.inc(15342);idx = (indices.get(0) + 1) % length;
            __CLR4_4_1bsubsulb90p7yh.R.inc(15343);while ((((visitedIndices.contains(idx) && visitedIndices.size() < length)&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15344)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15345)==0&false))) {{
                __CLR4_4_1bsubsulb90p7yh.R.inc(15346);idx++;
                __CLR4_4_1bsubsulb90p7yh.R.inc(15347);if ((((idx >= length)&&(__CLR4_4_1bsubsulb90p7yh.R.iget(15348)!=0|true))||(__CLR4_4_1bsubsulb90p7yh.R.iget(15349)==0&false))) {{
                    __CLR4_4_1bsubsulb90p7yh.R.inc(15350);idx = 0;
                }
            }}
            }__CLR4_4_1bsubsulb90p7yh.R.inc(15351);indices.clear();
        }

        }__CLR4_4_1bsubsulb90p7yh.R.inc(15352);return new ChromosomePair(first.newFixedLengthChromosome(child1Rep),
                                  second.newFixedLengthChromosome(child2Rep));
    }finally{__CLR4_4_1bsubsulb90p7yh.R.flushNeeded();}}
}
