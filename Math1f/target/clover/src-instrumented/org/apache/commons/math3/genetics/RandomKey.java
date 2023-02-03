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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Random Key chromosome is used for permutation representation. It is a vector
 * of a fixed length of real numbers in [0,1] interval. The index of the i-th
 * smallest value in the vector represents an i-th member of the permutation.
 * <p>
 * For example, the random key [0.2, 0.3, 0.8, 0.1] corresponds to the
 * permutation of indices (3,0,1,2). If the original (unpermuted) sequence would
 * be (a,b,c,d), this would mean the sequence (d,a,b,c).
 * <p>
 * With this representation, common operators like n-point crossover can be
 * used, because any such chromosome represents a valid permutation.
 * <p>
 * Since the chromosome (and thus its arrayRepresentation) is immutable, the
 * array representation is sorted only once in the constructor.
 * <p>
 * For details, see:
 * <ul>
 *   <li>Bean, J.C.: Genetic algorithms and random keys for sequencing and
 *       optimization. ORSA Journal on Computing 6 (1994) 154-160</li>
 *   <li>Rothlauf, F.: Representations for Genetic and Evolutionary Algorithms.
 *       Volume 104 of Studies in Fuzziness and Soft Computing. Physica-Verlag,
 *       Heidelberg (2002)</li>
 * </ul>
 *
 * @param <T> type of the permuted objects
 * @since 2.0
 * @version $Id$
 */
public abstract class RandomKey<T> extends AbstractListChromosome<Double> implements PermutationChromosome<T> {public static class __CLR4_4_1c39c39lb90p80n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Cache of sorted representation (unmodifiable). */
    private final List<Double> sortedRepresentation;

    /**
     * Base sequence [0,1,...,n-1], permuted accorting to the representation (unmodifiable).
     */
    private final List<Integer> baseSeqPermutation;

    /**
     * Constructor.
     *
     * @param representation list of [0,1] values representing the permutation
     * @throws InvalidRepresentationException iff the <code>representation</code> can not represent a valid chromosome
     */
    public RandomKey(final List<Double> representation) throws InvalidRepresentationException {
        super(representation);__CLR4_4_1c39c39lb90p80n.R.inc(15670);try{__CLR4_4_1c39c39lb90p80n.R.inc(15669);
        // store the sorted representation
        __CLR4_4_1c39c39lb90p80n.R.inc(15671);List<Double> sortedRepr = new ArrayList<Double> (getRepresentation());
        __CLR4_4_1c39c39lb90p80n.R.inc(15672);Collections.sort(sortedRepr);
        __CLR4_4_1c39c39lb90p80n.R.inc(15673);sortedRepresentation = Collections.unmodifiableList(sortedRepr);
        // store the permutation of [0,1,...,n-1] list for toString() and isSame() methods
        __CLR4_4_1c39c39lb90p80n.R.inc(15674);baseSeqPermutation = Collections.unmodifiableList(
            decodeGeneric(baseSequence(getLength()), getRepresentation(), sortedRepresentation)
        );
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param representation array of [0,1] values representing the permutation
     * @throws InvalidRepresentationException iff the <code>representation</code> can not represent a valid chromosome
     */
    public RandomKey(final Double[] representation) throws InvalidRepresentationException {
        this(Arrays.asList(representation));__CLR4_4_1c39c39lb90p80n.R.inc(15676);try{__CLR4_4_1c39c39lb90p80n.R.inc(15675);
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public List<T> decode(final List<T> sequence) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15677);
        __CLR4_4_1c39c39lb90p80n.R.inc(15678);return decodeGeneric(sequence, getRepresentation(), sortedRepresentation);
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Decodes a permutation represented by <code>representation</code> and
     * returns a (generic) list with the permuted values.
     *
     * @param <S> generic type of the sequence values
     * @param sequence the unpermuted sequence
     * @param representation representation of the permutation ([0,1] vector)
     * @param sortedRepr sorted <code>representation</code>
     * @return list with the sequence values permuted according to the representation
     * @throws DimensionMismatchException iff the length of the <code>sequence</code>,
     *   <code>representation</code> or <code>sortedRepr</code> lists are not equal
     */
    private static <S> List<S> decodeGeneric(final List<S> sequence, List<Double> representation,
                                             final List<Double> sortedRepr)
        throws DimensionMismatchException {try{__CLR4_4_1c39c39lb90p80n.R.inc(15679);

        __CLR4_4_1c39c39lb90p80n.R.inc(15680);int l = sequence.size();

        // the size of the three lists must be equal
        __CLR4_4_1c39c39lb90p80n.R.inc(15681);if ((((representation.size() != l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15682)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15683)==0&false))) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15684);throw new DimensionMismatchException(representation.size(), l);
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15685);if ((((sortedRepr.size() != l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15686)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15687)==0&false))) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15688);throw new DimensionMismatchException(sortedRepr.size(), l);
        }

        // do not modify the original representation
        }__CLR4_4_1c39c39lb90p80n.R.inc(15689);List<Double> reprCopy = new ArrayList<Double> (representation);

        // now find the indices in the original repr and use them for permuting
        __CLR4_4_1c39c39lb90p80n.R.inc(15690);List<S> res = new ArrayList<S> (l);
        __CLR4_4_1c39c39lb90p80n.R.inc(15691);for (int i=0; (((i<l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15692)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15693)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15694);int index = reprCopy.indexOf(sortedRepr.get(i));
            __CLR4_4_1c39c39lb90p80n.R.inc(15695);res.add(sequence.get(index));
            __CLR4_4_1c39c39lb90p80n.R.inc(15696);reprCopy.set(index, null);
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15697);return res;
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Returns <code>true</code> iff <code>another</code> is a RandomKey and
     * encodes the same permutation.
     *
     * @param another chromosome to compare
     * @return true iff chromosomes encode the same permutation
     */
    @Override
    protected boolean isSame(final Chromosome another) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15698);
        // type check
        __CLR4_4_1c39c39lb90p80n.R.inc(15699);if ((((! (another instanceof RandomKey<?>))&&(__CLR4_4_1c39c39lb90p80n.R.iget(15700)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15701)==0&false))) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15702);return false;
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15703);RandomKey<?> anotherRk = (RandomKey<?>) another;
        // size check
        __CLR4_4_1c39c39lb90p80n.R.inc(15704);if ((((getLength() != anotherRk.getLength())&&(__CLR4_4_1c39c39lb90p80n.R.iget(15705)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15706)==0&false))) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15707);return false;
        }

        // two different representations can still encode the same permutation
        // the ordering is what counts
        }__CLR4_4_1c39c39lb90p80n.R.inc(15708);List<Integer> thisPerm = this.baseSeqPermutation;
        __CLR4_4_1c39c39lb90p80n.R.inc(15709);List<Integer> anotherPerm = anotherRk.baseSeqPermutation;

        __CLR4_4_1c39c39lb90p80n.R.inc(15710);for (int i=0; (((i<getLength())&&(__CLR4_4_1c39c39lb90p80n.R.iget(15711)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15712)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15713);if ((((thisPerm.get(i) != anotherPerm.get(i))&&(__CLR4_4_1c39c39lb90p80n.R.iget(15714)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15715)==0&false))) {{
                __CLR4_4_1c39c39lb90p80n.R.inc(15716);return false;
            }
        }}
        // the permutations are the same
        }__CLR4_4_1c39c39lb90p80n.R.inc(15717);return true;
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected void checkValidity(final List<Double> chromosomeRepresentation)
        throws InvalidRepresentationException {try{__CLR4_4_1c39c39lb90p80n.R.inc(15718);

        __CLR4_4_1c39c39lb90p80n.R.inc(15719);for (double val : chromosomeRepresentation) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15720);if ((((val < 0 || val > 1)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15721)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15722)==0&false))) {{
                __CLR4_4_1c39c39lb90p80n.R.inc(15723);throw new InvalidRepresentationException(LocalizedFormats.OUT_OF_RANGE_SIMPLE,
                                                         val, 0, 1);
            }
        }}
    }}finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}


    /**
     * Generates a representation corresponding to a random permutation of
     * length l which can be passed to the RandomKey constructor.
     *
     * @param l length of the permutation
     * @return representation of a random permutation
     */
    public static final List<Double> randomPermutation(final int l) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15724);
        __CLR4_4_1c39c39lb90p80n.R.inc(15725);List<Double> repr = new ArrayList<Double>(l);
        __CLR4_4_1c39c39lb90p80n.R.inc(15726);for (int i=0; (((i<l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15727)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15728)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15729);repr.add(GeneticAlgorithm.getRandomGenerator().nextDouble());
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15730);return repr;
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Generates a representation corresponding to an identity permutation of
     * length l which can be passed to the RandomKey constructor.
     *
     * @param l length of the permutation
     * @return representation of an identity permutation
     */
    public static final List<Double> identityPermutation(final int l) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15731);
        __CLR4_4_1c39c39lb90p80n.R.inc(15732);List<Double> repr = new ArrayList<Double>(l);
        __CLR4_4_1c39c39lb90p80n.R.inc(15733);for (int i=0; (((i<l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15734)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15735)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15736);repr.add((double)i/l);
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15737);return repr;
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Generates a representation of a permutation corresponding to the
     * <code>data</code> sorted by <code>comparator</code>. The
     * <code>data</code> is not modified during the process.
     *
     * This is useful if you want to inject some permutations to the initial
     * population.
     *
     * @param <S> type of the data
     * @param data list of data determining the order
     * @param comparator how the data will be compared
     * @return list representation of the permutation corresponding to the parameters
     */
    public static <S> List<Double> comparatorPermutation(final List<S> data,
                                                         final Comparator<S> comparator) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15738);
        __CLR4_4_1c39c39lb90p80n.R.inc(15739);List<S> sortedData = new ArrayList<S>(data);
        __CLR4_4_1c39c39lb90p80n.R.inc(15740);Collections.sort(sortedData, comparator);

        __CLR4_4_1c39c39lb90p80n.R.inc(15741);return inducedPermutation(data, sortedData);
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Generates a representation of a permutation corresponding to a
     * permutation which yields <code>permutedData</code> when applied to
     * <code>originalData</code>.
     *
     * This method can be viewed as an inverse to {@link #decode(List)}.
     *
     * @param <S> type of the data
     * @param originalData the original, unpermuted data
     * @param permutedData the data, somehow permuted
     * @return representation of a permutation corresponding to the permutation
     *   <code>originalData -> permutedData</code>
     * @throws DimensionMismatchException iff the length of <code>originalData</code>
     *   and <code>permutedData</code> lists are not equal
     * @throws MathIllegalArgumentException iff the <code>permutedData</code> and
     *   <code>originalData</code> lists contain different data
     */
    public static <S> List<Double> inducedPermutation(final List<S> originalData,
                                                      final List<S> permutedData)
        throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_1c39c39lb90p80n.R.inc(15742);

        __CLR4_4_1c39c39lb90p80n.R.inc(15743);if ((((originalData.size() != permutedData.size())&&(__CLR4_4_1c39c39lb90p80n.R.iget(15744)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15745)==0&false))) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15746);throw new DimensionMismatchException(permutedData.size(), originalData.size());
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15747);int l = originalData.size();

        __CLR4_4_1c39c39lb90p80n.R.inc(15748);List<S> origDataCopy = new ArrayList<S> (originalData);

        __CLR4_4_1c39c39lb90p80n.R.inc(15749);Double[] res = new Double[l];
        __CLR4_4_1c39c39lb90p80n.R.inc(15750);for (int i=0; (((i<l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15751)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15752)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15753);int index = origDataCopy.indexOf(permutedData.get(i));
            __CLR4_4_1c39c39lb90p80n.R.inc(15754);if ((((index == -1)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15755)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15756)==0&false))) {{
                __CLR4_4_1c39c39lb90p80n.R.inc(15757);throw new MathIllegalArgumentException(LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA);
            }
            }__CLR4_4_1c39c39lb90p80n.R.inc(15758);res[index] = (double) i / l;
            __CLR4_4_1c39c39lb90p80n.R.inc(15759);origDataCopy.set(index, null);
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15760);return Arrays.asList(res);
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1c39c39lb90p80n.R.inc(15761);
        __CLR4_4_1c39c39lb90p80n.R.inc(15762);return String.format("(f=%s pi=(%s))", getFitness(), baseSeqPermutation);
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}

    /**
     * Helper for constructor. Generates a list of natural numbers (0,1,...,l-1).
     *
     * @param l length of list to generate
     * @return list of integers from 0 to l-1
     */
    private static List<Integer> baseSequence(final int l) {try{__CLR4_4_1c39c39lb90p80n.R.inc(15763);
        __CLR4_4_1c39c39lb90p80n.R.inc(15764);List<Integer> baseSequence = new ArrayList<Integer> (l);
        __CLR4_4_1c39c39lb90p80n.R.inc(15765);for (int i=0; (((i<l)&&(__CLR4_4_1c39c39lb90p80n.R.iget(15766)!=0|true))||(__CLR4_4_1c39c39lb90p80n.R.iget(15767)==0&false)); i++) {{
            __CLR4_4_1c39c39lb90p80n.R.inc(15768);baseSequence.add(i);
        }
        }__CLR4_4_1c39c39lb90p80n.R.inc(15769);return baseSequence;
    }finally{__CLR4_4_1c39c39lb90p80n.R.flushNeeded();}}
}
