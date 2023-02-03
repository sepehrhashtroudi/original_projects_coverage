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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.math3.exception.MathIllegalArgumentException;

/**
 * This TansformerMap automates the transformation of mixed object types.
 * It provides a means to set NumberTransformers that will be selected
 * based on the Class of the object handed to the Maps
 * <code>double transform(Object o)</code> method.
 * @version $Id$
 */
public class TransformerMap implements NumberTransformer, Serializable {public static class __CLR4_4_11bau1baulb90pbc4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,61362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 4605318041528645258L;

    /**
     * A default Number Transformer for Numbers and numeric Strings.
     */
    private NumberTransformer defaultTransformer = null;

    /**
     * The internal Map.
     */
    private Map<Class<?>, NumberTransformer> map = null;

    /**
     * Build a map containing only the default transformer.
     */
    public TransformerMap() {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61302);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61303);map = new HashMap<Class<?>, NumberTransformer>();
        __CLR4_4_11bau1baulb90pbc4.R.inc(61304);defaultTransformer = new DefaultTransformer();
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Tests if a Class is present in the TransformerMap.
     * @param key Class to check
     * @return true|false
     */
    public boolean containsClass(Class<?> key) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61305);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61306);return map.containsKey(key);
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Tests if a NumberTransformer is present in the TransformerMap.
     * @param value NumberTransformer to check
     * @return true|false
     */
    public boolean containsTransformer(NumberTransformer value) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61307);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61308);return map.containsValue(value);
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Returns the Transformer that is mapped to a class
     * if mapping is not present, this returns null.
     * @param key The Class of the object
     * @return the mapped NumberTransformer or null.
     */
    public NumberTransformer getTransformer(Class<?> key) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61309);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61310);return map.get(key);
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Sets a Class to Transformer Mapping in the Map. If
     * the Class is already present, this overwrites that
     * mapping.
     * @param key The Class
     * @param transformer The NumberTransformer
     * @return the replaced transformer if one is present
     */
    public NumberTransformer putTransformer(Class<?> key, NumberTransformer transformer) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61311);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61312);return map.put(key, transformer);
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Removes a Class to Transformer Mapping in the Map.
     * @param key The Class
     * @return the removed transformer if one is present or
     * null if none was present.
     */
    public NumberTransformer removeTransformer(Class<?> key) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61313);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61314);return map.remove(key);
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Clears all the Class to Transformer mappings.
     */
    public void clear() {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61315);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61316);map.clear();
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Returns the Set of Classes used as keys in the map.
     * @return Set of Classes
     */
    public Set<Class<?>> classes() {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61317);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61318);return map.keySet();
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Returns the Set of NumberTransformers used as values
     * in the map.
     * @return Set of NumberTransformers
     */
    public Collection<NumberTransformer> transformers() {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61319);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61320);return map.values();
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /**
     * Attempts to transform the Object against the map of
     * NumberTransformers. Otherwise it returns Double.NaN.
     *
     * @param o the Object to be transformed.
     * @return the double value of the Object.
     * @throws MathIllegalArgumentException if the Object can not be
     * transformed into a Double.
     * @see org.apache.commons.math3.util.NumberTransformer#transform(java.lang.Object)
     */
    public double transform(Object o) throws MathIllegalArgumentException {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61321);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61322);double value = Double.NaN;

        __CLR4_4_11bau1baulb90pbc4.R.inc(61323);if ((((o instanceof Number || o instanceof String)&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61324)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61325)==0&false))) {{
            __CLR4_4_11bau1baulb90pbc4.R.inc(61326);value = defaultTransformer.transform(o);
        } }else {{
            __CLR4_4_11bau1baulb90pbc4.R.inc(61327);NumberTransformer trans = getTransformer(o.getClass());
            __CLR4_4_11bau1baulb90pbc4.R.inc(61328);if ((((trans != null)&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61329)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61330)==0&false))) {{
                __CLR4_4_11bau1baulb90pbc4.R.inc(61331);value = trans.transform(o);
            }
        }}

        }__CLR4_4_11bau1baulb90pbc4.R.inc(61332);return value;
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61333);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61334);if ((((this == other)&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61335)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61336)==0&false))) {{
            __CLR4_4_11bau1baulb90pbc4.R.inc(61337);return true;
        }
        }__CLR4_4_11bau1baulb90pbc4.R.inc(61338);if ((((other instanceof TransformerMap)&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61339)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61340)==0&false))) {{
            __CLR4_4_11bau1baulb90pbc4.R.inc(61341);TransformerMap rhs = (TransformerMap) other;
            __CLR4_4_11bau1baulb90pbc4.R.inc(61342);if ((((! defaultTransformer.equals(rhs.defaultTransformer))&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61343)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61344)==0&false))) {{
                __CLR4_4_11bau1baulb90pbc4.R.inc(61345);return false;
            }
            }__CLR4_4_11bau1baulb90pbc4.R.inc(61346);if ((((map.size() != rhs.map.size())&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61347)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61348)==0&false))) {{
                __CLR4_4_11bau1baulb90pbc4.R.inc(61349);return false;
            }
            }__CLR4_4_11bau1baulb90pbc4.R.inc(61350);for (Map.Entry<Class<?>, NumberTransformer> entry : map.entrySet()) {{
                __CLR4_4_11bau1baulb90pbc4.R.inc(61351);if ((((! entry.getValue().equals(rhs.map.get(entry.getKey())))&&(__CLR4_4_11bau1baulb90pbc4.R.iget(61352)!=0|true))||(__CLR4_4_11bau1baulb90pbc4.R.iget(61353)==0&false))) {{
                    __CLR4_4_11bau1baulb90pbc4.R.inc(61354);return false;
                }
            }}
            }__CLR4_4_11bau1baulb90pbc4.R.inc(61355);return true;
        }
        }__CLR4_4_11bau1baulb90pbc4.R.inc(61356);return false;
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_11bau1baulb90pbc4.R.inc(61357);
        __CLR4_4_11bau1baulb90pbc4.R.inc(61358);int hash = defaultTransformer.hashCode();
        __CLR4_4_11bau1baulb90pbc4.R.inc(61359);for (NumberTransformer t : map.values()) {{
            __CLR4_4_11bau1baulb90pbc4.R.inc(61360);hash = hash * 31 + t.hashCode();
        }
        }__CLR4_4_11bau1baulb90pbc4.R.inc(61361);return hash;
    }finally{__CLR4_4_11bau1baulb90pbc4.R.flushNeeded();}}

}
