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

package org.apache.commons.csv;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * A CSV record
 */
public class CSVRecord implements Serializable, Iterable<String> {public static class __CLR4_4_1elell6l8x0du{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    
    /** The values of the record */
    private final String[] values;

    /** The column name to index mapping. */
    private final Map<String, Integer> mapping;

    CSVRecord(String[] values, Map<String, Integer> mapping) {try{__CLR4_4_1elell6l8x0du.R.inc(525);
        __CLR4_4_1elell6l8x0du.R.inc(526);this.values = (((values != null )&&(__CLR4_4_1elell6l8x0du.R.iget(527)!=0|true))||(__CLR4_4_1elell6l8x0du.R.iget(528)==0&false))? values : EMPTY_STRING_ARRAY;
        __CLR4_4_1elell6l8x0du.R.inc(529);this.mapping = mapping;
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    /**
     * Returns a value by index.
     *
     * @param i the index of the column retrieved
     */
    public String get(int i) {try{__CLR4_4_1elell6l8x0du.R.inc(530);
        __CLR4_4_1elell6l8x0du.R.inc(531);return values[i];
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    /**
     * Returns a value by name.
     *
     * @param name the name of the column to be retrieved
     * @return the column value, or {@code null} if the column name is not found
     * @throws IllegalStateException if no header mapping was provided
     */
    public String get(String name) {try{__CLR4_4_1elell6l8x0du.R.inc(532);
        __CLR4_4_1elell6l8x0du.R.inc(533);if ((((mapping == null)&&(__CLR4_4_1elell6l8x0du.R.iget(534)!=0|true))||(__CLR4_4_1elell6l8x0du.R.iget(535)==0&false))) {{
            __CLR4_4_1elell6l8x0du.R.inc(536);throw new IllegalStateException("No header was specified, the record values can't be accessed by name");
        }

        }__CLR4_4_1elell6l8x0du.R.inc(537);Integer index = mapping.get(name);

        __CLR4_4_1elell6l8x0du.R.inc(538);return (((index != null )&&(__CLR4_4_1elell6l8x0du.R.iget(539)!=0|true))||(__CLR4_4_1elell6l8x0du.R.iget(540)==0&false))? values[index.intValue()] : null;
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    public Iterator<String> iterator() {try{__CLR4_4_1elell6l8x0du.R.inc(541);
        __CLR4_4_1elell6l8x0du.R.inc(542);return Arrays.asList(values).iterator();
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    String[] values() {try{__CLR4_4_1elell6l8x0du.R.inc(543);
        __CLR4_4_1elell6l8x0du.R.inc(544);return values;
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    /**
     * Returns the number of values in this record.
     */
    public int size() {try{__CLR4_4_1elell6l8x0du.R.inc(545);
        __CLR4_4_1elell6l8x0du.R.inc(546);return values.length;
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1elell6l8x0du.R.inc(547);
        __CLR4_4_1elell6l8x0du.R.inc(548);return Arrays.toString(values);
    }finally{__CLR4_4_1elell6l8x0du.R.flushNeeded();}}
}
