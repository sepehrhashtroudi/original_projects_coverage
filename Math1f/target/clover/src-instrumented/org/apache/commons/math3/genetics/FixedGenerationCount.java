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

import org.apache.commons.math3.exception.NumberIsTooSmallException;

/**
 * Stops after a fixed number of generations. Each time {@link #isSatisfied(Population)} is invoked, a generation
 * counter is incremented. Once the counter reaches the configured <code>maxGenerations</code> value,
 * {@link #isSatisfied(Population)} returns true.
 *
 * @version $Id$
 * @since 2.0
 */
public class FixedGenerationCount implements StoppingCondition {public static class __CLR4_4_1bvjbvjlb90p7yu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15406,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Number of generations that have passed */
    private int numGenerations = 0;

    /** Maximum number of generations (stopping criteria) */
    private final int maxGenerations;

    /**
     * Create a new FixedGenerationCount instance.
     *
     * @param maxGenerations number of generations to evolve
     * @throws NumberIsTooSmallException if the number of generations is &lt; 1
     */
    public FixedGenerationCount(final int maxGenerations) throws NumberIsTooSmallException {try{__CLR4_4_1bvjbvjlb90p7yu.R.inc(15391);
        __CLR4_4_1bvjbvjlb90p7yu.R.inc(15392);if ((((maxGenerations <= 0)&&(__CLR4_4_1bvjbvjlb90p7yu.R.iget(15393)!=0|true))||(__CLR4_4_1bvjbvjlb90p7yu.R.iget(15394)==0&false))) {{
            __CLR4_4_1bvjbvjlb90p7yu.R.inc(15395);throw new NumberIsTooSmallException(maxGenerations, 1, true);
        }
        }__CLR4_4_1bvjbvjlb90p7yu.R.inc(15396);this.maxGenerations = maxGenerations;
    }finally{__CLR4_4_1bvjbvjlb90p7yu.R.flushNeeded();}}

    /**
     * Determine whether or not the given number of generations have passed. Increments the number of generations
     * counter if the maximum has not been reached.
     *
     * @param population ignored (no impact on result)
     * @return <code>true</code> IFF the maximum number of generations has been exceeded
     */
    public boolean isSatisfied(final Population population) {try{__CLR4_4_1bvjbvjlb90p7yu.R.inc(15397);
        __CLR4_4_1bvjbvjlb90p7yu.R.inc(15398);if ((((this.numGenerations < this.maxGenerations)&&(__CLR4_4_1bvjbvjlb90p7yu.R.iget(15399)!=0|true))||(__CLR4_4_1bvjbvjlb90p7yu.R.iget(15400)==0&false))) {{
            __CLR4_4_1bvjbvjlb90p7yu.R.inc(15401);numGenerations++;
            __CLR4_4_1bvjbvjlb90p7yu.R.inc(15402);return false;
        }
        }__CLR4_4_1bvjbvjlb90p7yu.R.inc(15403);return true;
    }finally{__CLR4_4_1bvjbvjlb90p7yu.R.flushNeeded();}}

    /**
     * Returns the number of generations that have already passed.
     * @return the number of generations that have passed
     */
    public int getNumGenerations() {try{__CLR4_4_1bvjbvjlb90p7yu.R.inc(15404);
        __CLR4_4_1bvjbvjlb90p7yu.R.inc(15405);return numGenerations;
    }finally{__CLR4_4_1bvjbvjlb90p7yu.R.flushNeeded();}}

}
