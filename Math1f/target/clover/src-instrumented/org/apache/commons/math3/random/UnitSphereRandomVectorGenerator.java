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

package org.apache.commons.math3.random;

import org.apache.commons.math3.util.FastMath;


/**
 * Generate random vectors isotropically located on the surface of a sphere.
 *
 * @since 2.1
 * @version $Id$
 */

public class UnitSphereRandomVectorGenerator
    implements RandomVectorGenerator {public static class __CLR4_4_111h411h4lb90paf4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * RNG used for generating the individual components of the vectors.
     */
    private final RandomGenerator rand;
    /**
     * Space dimension.
     */
    private final int dimension;

    /**
     * @param dimension Space dimension.
     * @param rand RNG for the individual components of the vectors.
     */
    public UnitSphereRandomVectorGenerator(final int dimension,
                                           final RandomGenerator rand) {try{__CLR4_4_111h411h4lb90paf4.R.inc(48568);
        __CLR4_4_111h411h4lb90paf4.R.inc(48569);this.dimension = dimension;
        __CLR4_4_111h411h4lb90paf4.R.inc(48570);this.rand = rand;
    }finally{__CLR4_4_111h411h4lb90paf4.R.flushNeeded();}}
    /**
     * Create an object that will use a default RNG ({@link MersenneTwister}),
     * in order to generate the individual components.
     *
     * @param dimension Space dimension.
     */
    public UnitSphereRandomVectorGenerator(final int dimension) {
        this(dimension, new MersenneTwister());__CLR4_4_111h411h4lb90paf4.R.inc(48572);try{__CLR4_4_111h411h4lb90paf4.R.inc(48571);
    }finally{__CLR4_4_111h411h4lb90paf4.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[] nextVector() {try{__CLR4_4_111h411h4lb90paf4.R.inc(48573);
        __CLR4_4_111h411h4lb90paf4.R.inc(48574);final double[] v = new double[dimension];

        // See http://mathworld.wolfram.com/SpherePointPicking.html for example.
        // Pick a point by choosing a standard Gaussian for each element, and then
        // normalizing to unit length.
        __CLR4_4_111h411h4lb90paf4.R.inc(48575);double normSq = 0;
        __CLR4_4_111h411h4lb90paf4.R.inc(48576);for (int i = 0; (((i < dimension)&&(__CLR4_4_111h411h4lb90paf4.R.iget(48577)!=0|true))||(__CLR4_4_111h411h4lb90paf4.R.iget(48578)==0&false)); i++) {{
            __CLR4_4_111h411h4lb90paf4.R.inc(48579);final double comp = rand.nextGaussian();
            __CLR4_4_111h411h4lb90paf4.R.inc(48580);v[i] = comp;
            __CLR4_4_111h411h4lb90paf4.R.inc(48581);normSq += comp * comp;
        }

        }__CLR4_4_111h411h4lb90paf4.R.inc(48582);final double f = 1 / FastMath.sqrt(normSq);
        __CLR4_4_111h411h4lb90paf4.R.inc(48583);for (int i = 0; (((i < dimension)&&(__CLR4_4_111h411h4lb90paf4.R.iget(48584)!=0|true))||(__CLR4_4_111h411h4lb90paf4.R.iget(48585)==0&false)); i++) {{
            __CLR4_4_111h411h4lb90paf4.R.inc(48586);v[i] *= f;
        }

        }__CLR4_4_111h411h4lb90paf4.R.inc(48587);return v;
    }finally{__CLR4_4_111h411h4lb90paf4.R.flushNeeded();}}
}
