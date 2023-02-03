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

package org.apache.commons.math3.util;

import java.io.Serializable;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;

/**
 * A Default NumberTransformer for java.lang.Numbers and Numeric Strings. This
 * provides some simple conversion capabilities to turn any java.lang.Number
 * into a primitive double or to turn a String representation of a Number into
 * a double.
 *
 * @version $Id$
 */
public class DefaultTransformer implements NumberTransformer, Serializable {public static class __CLR4_4_117t617t6lb90pavt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56798,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 4019938025047800455L;

    /**
     * @param o  the object that gets transformed.
     * @return a double primitive representation of the Object o.
     * @throws NullArgumentException if Object <code>o</code> is {@code null}.
     * @throws MathIllegalArgumentException if Object <code>o</code>
     * cannot successfully be transformed
     * @see <a href="http://commons.apache.org/collections/api-release/org/apache/commons/collections/Transformer.html">Commons Collections Transformer</a>
     */
    public double transform(Object o)
        throws NullArgumentException, MathIllegalArgumentException {try{__CLR4_4_117t617t6lb90pavt.R.inc(56778);

        __CLR4_4_117t617t6lb90pavt.R.inc(56779);if ((((o == null)&&(__CLR4_4_117t617t6lb90pavt.R.iget(56780)!=0|true))||(__CLR4_4_117t617t6lb90pavt.R.iget(56781)==0&false))) {{
            __CLR4_4_117t617t6lb90pavt.R.inc(56782);throw new NullArgumentException(LocalizedFormats.OBJECT_TRANSFORMATION);
        }

        }__CLR4_4_117t617t6lb90pavt.R.inc(56783);if ((((o instanceof Number)&&(__CLR4_4_117t617t6lb90pavt.R.iget(56784)!=0|true))||(__CLR4_4_117t617t6lb90pavt.R.iget(56785)==0&false))) {{
            __CLR4_4_117t617t6lb90pavt.R.inc(56786);return ((Number)o).doubleValue();
        }

        }__CLR4_4_117t617t6lb90pavt.R.inc(56787);try {
            __CLR4_4_117t617t6lb90pavt.R.inc(56788);return Double.parseDouble(o.toString());
        } catch (NumberFormatException e) {
            __CLR4_4_117t617t6lb90pavt.R.inc(56789);throw new MathIllegalArgumentException(LocalizedFormats.CANNOT_TRANSFORM_TO_DOUBLE,
                                                   o.toString());
        }
    }finally{__CLR4_4_117t617t6lb90pavt.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_117t617t6lb90pavt.R.inc(56790);
        __CLR4_4_117t617t6lb90pavt.R.inc(56791);if ((((this == other)&&(__CLR4_4_117t617t6lb90pavt.R.iget(56792)!=0|true))||(__CLR4_4_117t617t6lb90pavt.R.iget(56793)==0&false))) {{
            __CLR4_4_117t617t6lb90pavt.R.inc(56794);return true;
        }
        }__CLR4_4_117t617t6lb90pavt.R.inc(56795);return other instanceof DefaultTransformer;
    }finally{__CLR4_4_117t617t6lb90pavt.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_117t617t6lb90pavt.R.inc(56796);
        // some arbitrary number ...
        __CLR4_4_117t617t6lb90pavt.R.inc(56797);return 401993047;
    }finally{__CLR4_4_117t617t6lb90pavt.R.flushNeeded();}}

}
