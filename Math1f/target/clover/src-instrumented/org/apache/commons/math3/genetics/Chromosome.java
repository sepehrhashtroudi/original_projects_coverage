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

/**
 * Individual in a population. Chromosomes are compared based on their fitness.
 * <p>
 * The chromosomes are IMMUTABLE, and so their fitness is also immutable and
 * therefore it can be cached.
 *
 * @since 2.0
 * @version $Id$
 */
public abstract class Chromosome implements Comparable<Chromosome>,Fitness {public static class __CLR4_4_1brxbrxlb90p7y5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Value assigned when no fitness has been computed yet. */
    private static final double NO_FITNESS = Double.NEGATIVE_INFINITY;

    /** Cached value of the fitness of this chromosome. */
    private double fitness = NO_FITNESS;

    /**
     * Access the fitness of this chromosome. The bigger the fitness, the better the chromosome.
     * <p>
     * Computation of fitness is usually very time-consuming task, therefore the fitness is cached.
     *
     * @return the fitness
     */
    public double getFitness() {try{__CLR4_4_1brxbrxlb90p7y5.R.inc(15261);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15262);if ((((this.fitness == NO_FITNESS)&&(__CLR4_4_1brxbrxlb90p7y5.R.iget(15263)!=0|true))||(__CLR4_4_1brxbrxlb90p7y5.R.iget(15264)==0&false))) {{
            // no cache - compute the fitness
            __CLR4_4_1brxbrxlb90p7y5.R.inc(15265);this.fitness = fitness();
        }
        }__CLR4_4_1brxbrxlb90p7y5.R.inc(15266);return this.fitness;
    }finally{__CLR4_4_1brxbrxlb90p7y5.R.flushNeeded();}}

    /**
     * Compares two chromosomes based on their fitness. The bigger the fitness, the better the chromosome.
     *
     * @param another another chromosome to compare
     * @return
     * <ul>
     *   <li>-1 if <code>another</code> is better than <code>this</code></li>
     *   <li>1 if <code>another</code> is worse than <code>this</code></li>
     *   <li>0 if the two chromosomes have the same fitness</li>
     * </ul>
     */
    public int compareTo(final Chromosome another) {try{__CLR4_4_1brxbrxlb90p7y5.R.inc(15267);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15268);return ((Double)this.getFitness()).compareTo(another.getFitness());
    }finally{__CLR4_4_1brxbrxlb90p7y5.R.flushNeeded();}}

    /**
     * Returns <code>true</code> iff <code>another</code> has the same representation and therefore the same fitness. By
     * default, it returns false -- override it in your implementation if you need it.
     *
     * @param another chromosome to compare
     * @return true if <code>another</code> is equivalent to this chromosome
     */
    protected boolean isSame(final Chromosome another) {try{__CLR4_4_1brxbrxlb90p7y5.R.inc(15269);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15270);return false;
    }finally{__CLR4_4_1brxbrxlb90p7y5.R.flushNeeded();}}

    /**
     * Searches the <code>population</code> for another chromosome with the same representation. If such chromosome is
     * found, it is returned, if no such chromosome exists, returns <code>null</code>.
     *
     * @param population Population to search
     * @return Chromosome with the same representation, or <code>null</code> if no such chromosome exists.
     */
    protected Chromosome findSameChromosome(final Population population) {try{__CLR4_4_1brxbrxlb90p7y5.R.inc(15271);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15272);for (Chromosome anotherChr : population) {{
            __CLR4_4_1brxbrxlb90p7y5.R.inc(15273);if ((((this.isSame(anotherChr))&&(__CLR4_4_1brxbrxlb90p7y5.R.iget(15274)!=0|true))||(__CLR4_4_1brxbrxlb90p7y5.R.iget(15275)==0&false))) {{
                __CLR4_4_1brxbrxlb90p7y5.R.inc(15276);return anotherChr;
            }
        }}
        }__CLR4_4_1brxbrxlb90p7y5.R.inc(15277);return null;
    }finally{__CLR4_4_1brxbrxlb90p7y5.R.flushNeeded();}}

    /**
     * Searches the population for a chromosome representing the same solution, and if it finds one,
     * updates the fitness to its value.
     *
     * @param population Population to search
     */
    public void searchForFitnessUpdate(final Population population) {try{__CLR4_4_1brxbrxlb90p7y5.R.inc(15278);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15279);Chromosome sameChromosome = findSameChromosome(population);
        __CLR4_4_1brxbrxlb90p7y5.R.inc(15280);if ((((sameChromosome != null)&&(__CLR4_4_1brxbrxlb90p7y5.R.iget(15281)!=0|true))||(__CLR4_4_1brxbrxlb90p7y5.R.iget(15282)==0&false))) {{
            __CLR4_4_1brxbrxlb90p7y5.R.inc(15283);fitness = sameChromosome.getFitness();
        }
    }}finally{__CLR4_4_1brxbrxlb90p7y5.R.flushNeeded();}}

}
