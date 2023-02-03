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
package org.apache.commons.math3.stat.descriptive.moment;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;

/**
 * Returns the arithmetic mean of the available vectors.
 * @since 1.2
 * @version $Id$
 */
public class VectorialMean implements Serializable {public static class __CLR4_4_114cb14cblb90paoi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 8223009086481006892L;

    /** Means for each component. */
    private final Mean[] means;

    /** Constructs a VectorialMean.
     * @param dimension vectors dimension
     */
    public VectorialMean(int dimension) {try{__CLR4_4_114cb14cblb90paoi.R.inc(52283);
        __CLR4_4_114cb14cblb90paoi.R.inc(52284);means = new Mean[dimension];
        __CLR4_4_114cb14cblb90paoi.R.inc(52285);for (int i = 0; (((i < dimension)&&(__CLR4_4_114cb14cblb90paoi.R.iget(52286)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52287)==0&false)); ++i) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52288);means[i] = new Mean();
        }
    }}finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

    /**
     * Add a new vector to the sample.
     * @param v vector to add
     * @throws DimensionMismatchException if the vector does not have the right dimension
     */
    public void increment(double[] v) throws DimensionMismatchException {try{__CLR4_4_114cb14cblb90paoi.R.inc(52289);
        __CLR4_4_114cb14cblb90paoi.R.inc(52290);if ((((v.length != means.length)&&(__CLR4_4_114cb14cblb90paoi.R.iget(52291)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52292)==0&false))) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52293);throw new DimensionMismatchException(v.length, means.length);
        }
        }__CLR4_4_114cb14cblb90paoi.R.inc(52294);for (int i = 0; (((i < v.length)&&(__CLR4_4_114cb14cblb90paoi.R.iget(52295)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52296)==0&false)); ++i) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52297);means[i].increment(v[i]);
        }
    }}finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

    /**
     * Get the mean vector.
     * @return mean vector
     */
    public double[] getResult() {try{__CLR4_4_114cb14cblb90paoi.R.inc(52298);
        __CLR4_4_114cb14cblb90paoi.R.inc(52299);double[] result = new double[means.length];
        __CLR4_4_114cb14cblb90paoi.R.inc(52300);for (int i = 0; (((i < result.length)&&(__CLR4_4_114cb14cblb90paoi.R.iget(52301)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52302)==0&false)); ++i) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52303);result[i] = means[i].getResult();
        }
        }__CLR4_4_114cb14cblb90paoi.R.inc(52304);return result;
    }finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

    /**
     * Get the number of vectors in the sample.
     * @return number of vectors in the sample
     */
    public long getN() {try{__CLR4_4_114cb14cblb90paoi.R.inc(52305);
        __CLR4_4_114cb14cblb90paoi.R.inc(52306);return ((((means.length == 0) )&&(__CLR4_4_114cb14cblb90paoi.R.iget(52307)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52308)==0&false))? 0 : means[0].getN();
    }finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_114cb14cblb90paoi.R.inc(52309);
        __CLR4_4_114cb14cblb90paoi.R.inc(52310);final int prime = 31;
        __CLR4_4_114cb14cblb90paoi.R.inc(52311);int result = 1;
        __CLR4_4_114cb14cblb90paoi.R.inc(52312);result = prime * result + Arrays.hashCode(means);
        __CLR4_4_114cb14cblb90paoi.R.inc(52313);return result;
    }finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_114cb14cblb90paoi.R.inc(52314);
        __CLR4_4_114cb14cblb90paoi.R.inc(52315);if ((((this == obj)&&(__CLR4_4_114cb14cblb90paoi.R.iget(52316)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52317)==0&false))) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52318);return true;
        }
        }__CLR4_4_114cb14cblb90paoi.R.inc(52319);if ((((!(obj instanceof VectorialMean))&&(__CLR4_4_114cb14cblb90paoi.R.iget(52320)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52321)==0&false))) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52322);return false;
        }
        }__CLR4_4_114cb14cblb90paoi.R.inc(52323);VectorialMean other = (VectorialMean) obj;
        __CLR4_4_114cb14cblb90paoi.R.inc(52324);if ((((!Arrays.equals(means, other.means))&&(__CLR4_4_114cb14cblb90paoi.R.iget(52325)!=0|true))||(__CLR4_4_114cb14cblb90paoi.R.iget(52326)==0&false))) {{
            __CLR4_4_114cb14cblb90paoi.R.inc(52327);return false;
        }
        }__CLR4_4_114cb14cblb90paoi.R.inc(52328);return true;
    }finally{__CLR4_4_114cb14cblb90paoi.R.flushNeeded();}}

}
