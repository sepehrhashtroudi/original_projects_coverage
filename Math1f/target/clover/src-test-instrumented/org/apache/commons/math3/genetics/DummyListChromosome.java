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

import java.util.Arrays;
import java.util.List;

/**
 * Implementation of ListChromosome for testing purposes
 */
public class DummyListChromosome extends AbstractListChromosome<Integer> {public static class __CLR4_4_11nqz1nqzlb90pco2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,77475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public DummyListChromosome(final Integer[] representation) {
        super(representation);__CLR4_4_11nqz1nqzlb90pco2.R.inc(77436);try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77435);
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    public DummyListChromosome(final List<Integer> representation) {
        super(representation);__CLR4_4_11nqz1nqzlb90pco2.R.inc(77438);try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77437);
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    public double fitness() {try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77439);
        // Not important.
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77440);return 0;
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    @Override
    protected void checkValidity(final List<Integer> chromosomeRepresentation) throws InvalidRepresentationException {try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77441);
        // Not important.            
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    @Override
    public AbstractListChromosome<Integer> newFixedLengthChromosome(final List<Integer> chromosomeRepresentation) {try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77442);
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77443);return new DummyListChromosome(chromosomeRepresentation);
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77444);
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77445);final int prime = 31;
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77446);int result = 1;
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77447);result = prime * result + ((((getRepresentation() == null )&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77448)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77449)==0&false))? 0 : getRepresentation().hashCode());
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77450);return result;
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}

    @Override
    public boolean equals(final Object obj) {try{__CLR4_4_11nqz1nqzlb90pco2.R.inc(77451);
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77452);if ((((this == obj)&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77453)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77454)==0&false))) {{
            __CLR4_4_11nqz1nqzlb90pco2.R.inc(77455);return true;
        }
        }__CLR4_4_11nqz1nqzlb90pco2.R.inc(77456);if ((((obj == null)&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77457)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77458)==0&false))) {{
            __CLR4_4_11nqz1nqzlb90pco2.R.inc(77459);return false;
        }
        }__CLR4_4_11nqz1nqzlb90pco2.R.inc(77460);if ((((!(obj instanceof DummyListChromosome))&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77461)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77462)==0&false))) {{
            __CLR4_4_11nqz1nqzlb90pco2.R.inc(77463);return false;
        }
        }__CLR4_4_11nqz1nqzlb90pco2.R.inc(77464);final DummyListChromosome other = (DummyListChromosome) obj;
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77465);if ((((getRepresentation() == null)&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77466)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77467)==0&false))) {{
            __CLR4_4_11nqz1nqzlb90pco2.R.inc(77468);if ((((other.getRepresentation() != null)&&(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77469)!=0|true))||(__CLR4_4_11nqz1nqzlb90pco2.R.iget(77470)==0&false))) {{
                __CLR4_4_11nqz1nqzlb90pco2.R.inc(77471);return false;
            }
        }}
        }__CLR4_4_11nqz1nqzlb90pco2.R.inc(77472);final Integer[] rep = getRepresentation().toArray(new Integer[getRepresentation().size()]);
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77473);final Integer[] otherRep = other.getRepresentation().toArray(new Integer[other.getRepresentation().size()]);
        __CLR4_4_11nqz1nqzlb90pco2.R.inc(77474);return Arrays.equals(rep, otherRep);
    }finally{__CLR4_4_11nqz1nqzlb90pco2.R.flushNeeded();}}
}
