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
import org.apache.commons.math3.exception.util.LocalizedFormats;


/**
 * Chromosome represented by a vector of 0s and 1s.
 *
 * @version $Id$
 * @since 2.0
 */
public abstract class BinaryChromosome extends AbstractListChromosome<Integer> {public static class __CLR4_4_1bqlbqllb90p7xy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     * @param representation list of {0,1} values representing the chromosome
     * @throws InvalidRepresentationException iff the <code>representation</code> can not represent a valid chromosome
     */
    public BinaryChromosome(List<Integer> representation) throws InvalidRepresentationException {
        super(representation);__CLR4_4_1bqlbqllb90p7xy.R.inc(15214);try{__CLR4_4_1bqlbqllb90p7xy.R.inc(15213);
    }finally{__CLR4_4_1bqlbqllb90p7xy.R.flushNeeded();}}

    /**
     * Constructor.
     * @param representation array of {0,1} values representing the chromosome
     * @throws InvalidRepresentationException iff the <code>representation</code> can not represent a valid chromosome
     */
    public BinaryChromosome(Integer[] representation) throws InvalidRepresentationException {
        super(representation);__CLR4_4_1bqlbqllb90p7xy.R.inc(15216);try{__CLR4_4_1bqlbqllb90p7xy.R.inc(15215);
    }finally{__CLR4_4_1bqlbqllb90p7xy.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected void checkValidity(List<Integer> chromosomeRepresentation) throws InvalidRepresentationException {try{__CLR4_4_1bqlbqllb90p7xy.R.inc(15217);
        __CLR4_4_1bqlbqllb90p7xy.R.inc(15218);for (int i : chromosomeRepresentation) {{
            __CLR4_4_1bqlbqllb90p7xy.R.inc(15219);if ((((i < 0 || i >1)&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15220)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15221)==0&false))) {{
                __CLR4_4_1bqlbqllb90p7xy.R.inc(15222);throw new InvalidRepresentationException(LocalizedFormats.INVALID_BINARY_DIGIT,
                                                         i);
            }
        }}
    }}finally{__CLR4_4_1bqlbqllb90p7xy.R.flushNeeded();}}

    /**
     * Returns a representation of a random binary array of length <code>length</code>.
     * @param length length of the array
     * @return a random binary array of length <code>length</code>
     */
    public static List<Integer> randomBinaryRepresentation(int length) {try{__CLR4_4_1bqlbqllb90p7xy.R.inc(15223);
        // random binary list
        __CLR4_4_1bqlbqllb90p7xy.R.inc(15224);List<Integer> rList= new ArrayList<Integer> (length);
        __CLR4_4_1bqlbqllb90p7xy.R.inc(15225);for (int j=0; (((j<length)&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15226)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15227)==0&false)); j++) {{
            __CLR4_4_1bqlbqllb90p7xy.R.inc(15228);rList.add(GeneticAlgorithm.getRandomGenerator().nextInt(2));
        }
        }__CLR4_4_1bqlbqllb90p7xy.R.inc(15229);return rList;
    }finally{__CLR4_4_1bqlbqllb90p7xy.R.flushNeeded();}}

    @Override
    protected boolean isSame(Chromosome another) {try{__CLR4_4_1bqlbqllb90p7xy.R.inc(15230);
        // type check
        __CLR4_4_1bqlbqllb90p7xy.R.inc(15231);if ((((! (another instanceof BinaryChromosome))&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15232)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15233)==0&false))) {{
            __CLR4_4_1bqlbqllb90p7xy.R.inc(15234);return false;
        }
        }__CLR4_4_1bqlbqllb90p7xy.R.inc(15235);BinaryChromosome anotherBc = (BinaryChromosome) another;
        // size check
        __CLR4_4_1bqlbqllb90p7xy.R.inc(15236);if ((((getLength() != anotherBc.getLength())&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15237)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15238)==0&false))) {{
            __CLR4_4_1bqlbqllb90p7xy.R.inc(15239);return false;
        }

        }__CLR4_4_1bqlbqllb90p7xy.R.inc(15240);for (int i=0; (((i< getRepresentation().size())&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15241)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15242)==0&false)); i++) {{
            __CLR4_4_1bqlbqllb90p7xy.R.inc(15243);if ((((!(getRepresentation().get(i).equals(anotherBc.getRepresentation().get(i))))&&(__CLR4_4_1bqlbqllb90p7xy.R.iget(15244)!=0|true))||(__CLR4_4_1bqlbqllb90p7xy.R.iget(15245)==0&false))) {{
                __CLR4_4_1bqlbqllb90p7xy.R.inc(15246);return false;
            }
        }}
        // all is ok
        }__CLR4_4_1bqlbqllb90p7xy.R.inc(15247);return true;
    }finally{__CLR4_4_1bqlbqllb90p7xy.R.flushNeeded();}}
}
