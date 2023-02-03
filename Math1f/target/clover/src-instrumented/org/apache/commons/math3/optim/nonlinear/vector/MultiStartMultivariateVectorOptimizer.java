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
package org.apache.commons.math3.optim.nonlinear.vector;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer;
import org.apache.commons.math3.optim.PointVectorValuePair;

/**
 * Multi-start optimizer for a (vector) model function.
 *
 * This class wraps an optimizer in order to use it several times in
 * turn with different starting points (trying to avoid being trapped
 * in a local extremum when looking for a global one).
 *
 * @version $Id$
 * @since 3.0
 */
public class MultiStartMultivariateVectorOptimizer
    extends BaseMultiStartMultivariateOptimizer<PointVectorValuePair> {public static class __CLR4_4_1uozuozlb90p9u0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying optimizer. */
    private final MultivariateVectorOptimizer optimizer;
    /** Found optima. */
    private final List<PointVectorValuePair> optima = new ArrayList<PointVectorValuePair>();

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform.
     * If {@code starts == 1}, the result will be same as if {@code optimizer}
     * is called directly.
     * @param generator Random vector generator to use for restarts.
     * @throws NullArgumentException if {@code optimizer} or {@code generator}
     * is {@code null}.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    public MultiStartMultivariateVectorOptimizer(final MultivariateVectorOptimizer optimizer,
                                                 final int starts,
                                                 final RandomVectorGenerator generator)
        throws NullArgumentException,
        NotStrictlyPositiveException {
        super(optimizer, starts, generator);__CLR4_4_1uozuozlb90p9u0.R.inc(39780);try{__CLR4_4_1uozuozlb90p9u0.R.inc(39779);
        __CLR4_4_1uozuozlb90p9u0.R.inc(39781);this.optimizer = optimizer;
    }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public PointVectorValuePair[] getOptima() {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39782);
        __CLR4_4_1uozuozlb90p9u0.R.inc(39783);Collections.sort(optima, getPairComparator());
        __CLR4_4_1uozuozlb90p9u0.R.inc(39784);return optima.toArray(new PointVectorValuePair[0]);
    }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected void store(PointVectorValuePair optimum) {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39785);
        __CLR4_4_1uozuozlb90p9u0.R.inc(39786);optima.add(optimum);
    }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected void clear() {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39787);
        __CLR4_4_1uozuozlb90p9u0.R.inc(39788);optima.clear();
    }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}

    /**
     * @return a comparator for sorting the optima.
     */
    private Comparator<PointVectorValuePair> getPairComparator() {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39789);
        __CLR4_4_1uozuozlb90p9u0.R.inc(39790);return new Comparator<PointVectorValuePair>() {
            private final RealVector target = new ArrayRealVector(optimizer.getTarget(), false);
            private final RealMatrix weight = optimizer.getWeight();

            public int compare(final PointVectorValuePair o1,
                               final PointVectorValuePair o2) {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39791);
                __CLR4_4_1uozuozlb90p9u0.R.inc(39792);if ((((o1 == null)&&(__CLR4_4_1uozuozlb90p9u0.R.iget(39793)!=0|true))||(__CLR4_4_1uozuozlb90p9u0.R.iget(39794)==0&false))) {{
                    __CLR4_4_1uozuozlb90p9u0.R.inc(39795);return ((((o2 == null) )&&(__CLR4_4_1uozuozlb90p9u0.R.iget(39796)!=0|true))||(__CLR4_4_1uozuozlb90p9u0.R.iget(39797)==0&false))? 0 : 1;
                } }else {__CLR4_4_1uozuozlb90p9u0.R.inc(39798);if ((((o2 == null)&&(__CLR4_4_1uozuozlb90p9u0.R.iget(39799)!=0|true))||(__CLR4_4_1uozuozlb90p9u0.R.iget(39800)==0&false))) {{
                    __CLR4_4_1uozuozlb90p9u0.R.inc(39801);return -1;
                }
                }}__CLR4_4_1uozuozlb90p9u0.R.inc(39802);return Double.compare(weightedResidual(o1),
                                      weightedResidual(o2));
            }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}

            private double weightedResidual(final PointVectorValuePair pv) {try{__CLR4_4_1uozuozlb90p9u0.R.inc(39803);
                __CLR4_4_1uozuozlb90p9u0.R.inc(39804);final RealVector v = new ArrayRealVector(pv.getValueRef(), false);
                __CLR4_4_1uozuozlb90p9u0.R.inc(39805);final RealVector r = target.subtract(v);
                __CLR4_4_1uozuozlb90p9u0.R.inc(39806);return r.dotProduct(weight.operate(r));
            }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1uozuozlb90p9u0.R.flushNeeded();}}
}
