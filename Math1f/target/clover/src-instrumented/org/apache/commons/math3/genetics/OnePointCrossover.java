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
import org.apache.commons.math3.exception.util.LocalizedFormats;


/**
 * One point crossover policy. A random crossover point is selected and the
 * first part from each parent is copied to the corresponding child, and the
 * second parts are copied crosswise.
 *
 * Example:
 * <pre>
 * -C- denotes a crossover point
 *                   -C-                                 -C-
 * p1 = (1 0 1 0 0 1  | 0 1 1)    X    p2 = (0 1 1 0 1 0  | 1 1 1)
 *      \------------/ \-----/              \------------/ \-----/
 *            ||         (*)                       ||        (**)
 *            VV         (**)                      VV        (*)
 *      /------------\ /-----\              /------------\ /-----\
 * c1 = (1 0 1 0 0 1  | 1 1 1)    X    c2 = (0 1 1 0 1 0  | 0 1 1)
 * </pre>
 *
 * This policy works only on {@link AbstractListChromosome}, and therefore it
 * is parameterized by T. Moreover, the chromosomes must have same lengths.
 *
 * @param <T> generic type of the {@link AbstractListChromosome}s for crossover
 * @since 2.0
 * @version $Id$
 *
 */
public class OnePointCrossover<T> implements CrossoverPolicy {public static class __CLR4_4_1c13c13lb90p7zz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Performs one point crossover. A random crossover point is selected and the
     * first part from each parent is copied to the corresponding child, and the
     * second parts are copied crosswise.
     *
     * Example:
     * <pre>
     * -C- denotes a crossover point
     *                   -C-                                 -C-
     * p1 = (1 0 1 0 0 1  | 0 1 1)    X    p2 = (0 1 1 0 1 0  | 1 1 1)
     *      \------------/ \-----/              \------------/ \-----/
     *            ||         (*)                       ||        (**)
     *            VV         (**)                      VV        (*)
     *      /------------\ /-----\              /------------\ /-----\
     * c1 = (1 0 1 0 0 1  | 1 1 1)    X    c2 = (0 1 1 0 1 0  | 0 1 1)
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
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1c13c13lb90p7zz.R.inc(15591);

        __CLR4_4_1c13c13lb90p7zz.R.inc(15592);if ((((! (first instanceof AbstractListChromosome<?> && second instanceof AbstractListChromosome<?>))&&(__CLR4_4_1c13c13lb90p7zz.R.iget(15593)!=0|true))||(__CLR4_4_1c13c13lb90p7zz.R.iget(15594)==0&false))) {{
            __CLR4_4_1c13c13lb90p7zz.R.inc(15595);throw new MathIllegalArgumentException(LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
        }
        }__CLR4_4_1c13c13lb90p7zz.R.inc(15596);return crossover((AbstractListChromosome<T>) first, (AbstractListChromosome<T>) second);
    }finally{__CLR4_4_1c13c13lb90p7zz.R.flushNeeded();}}


    /**
     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.
     *
     * @param first the first chromosome.
     * @param second the second chromosome.
     * @return the pair of new chromosomes that resulted from the crossover.
     * @throws DimensionMismatchException if the length of the two chromosomes is different
     */
    private ChromosomePair crossover(final AbstractListChromosome<T> first,
                                     final AbstractListChromosome<T> second) throws DimensionMismatchException {try{__CLR4_4_1c13c13lb90p7zz.R.inc(15597);
        __CLR4_4_1c13c13lb90p7zz.R.inc(15598);final int length = first.getLength();
        __CLR4_4_1c13c13lb90p7zz.R.inc(15599);if ((((length != second.getLength())&&(__CLR4_4_1c13c13lb90p7zz.R.iget(15600)!=0|true))||(__CLR4_4_1c13c13lb90p7zz.R.iget(15601)==0&false))) {{
            __CLR4_4_1c13c13lb90p7zz.R.inc(15602);throw new DimensionMismatchException(second.getLength(), length);
        }

        // array representations of the parents
        }__CLR4_4_1c13c13lb90p7zz.R.inc(15603);final List<T> parent1Rep = first.getRepresentation();
        __CLR4_4_1c13c13lb90p7zz.R.inc(15604);final List<T> parent2Rep = second.getRepresentation();
        // and of the children
        __CLR4_4_1c13c13lb90p7zz.R.inc(15605);final ArrayList<T> child1Rep = new ArrayList<T> (first.getLength());
        __CLR4_4_1c13c13lb90p7zz.R.inc(15606);final ArrayList<T> child2Rep = new ArrayList<T> (second.getLength());

        // select a crossover point at random (0 and length makes no sense)
        __CLR4_4_1c13c13lb90p7zz.R.inc(15607);final int crossoverIndex = 1 + (GeneticAlgorithm.getRandomGenerator().nextInt(length-2));

        // copy the first part
        __CLR4_4_1c13c13lb90p7zz.R.inc(15608);for (int i = 0; (((i < crossoverIndex)&&(__CLR4_4_1c13c13lb90p7zz.R.iget(15609)!=0|true))||(__CLR4_4_1c13c13lb90p7zz.R.iget(15610)==0&false)); i++) {{
            __CLR4_4_1c13c13lb90p7zz.R.inc(15611);child1Rep.add(parent1Rep.get(i));
            __CLR4_4_1c13c13lb90p7zz.R.inc(15612);child2Rep.add(parent2Rep.get(i));
        }
        // and switch the second part
        }__CLR4_4_1c13c13lb90p7zz.R.inc(15613);for (int i = crossoverIndex; (((i < length)&&(__CLR4_4_1c13c13lb90p7zz.R.iget(15614)!=0|true))||(__CLR4_4_1c13c13lb90p7zz.R.iget(15615)==0&false)); i++) {{
            __CLR4_4_1c13c13lb90p7zz.R.inc(15616);child1Rep.add(parent2Rep.get(i));
            __CLR4_4_1c13c13lb90p7zz.R.inc(15617);child2Rep.add(parent1Rep.get(i));
        }

        }__CLR4_4_1c13c13lb90p7zz.R.inc(15618);return new ChromosomePair(first.newFixedLengthChromosome(child1Rep),
                                  second.newFixedLengthChromosome(child2Rep));
    }finally{__CLR4_4_1c13c13lb90p7zz.R.flushNeeded();}}

}
