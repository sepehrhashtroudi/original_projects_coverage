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
package org.apache.commons.math3.exception;

import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Exception to be thrown when the a sequence of values is not monotonically
 * increasing or decreasing.
 *
 * @since 2.2 (name changed to "NonMonotonicSequenceException" in 3.0)
 * @version $Id$
 */
public class NonMonotonicSequenceException extends MathIllegalNumberException {public static class __CLR4_4_19o69o6lb90p7ns{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12556,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version Id. */
    private static final long serialVersionUID = 3596849179428944575L;
    /**
     * Direction (positive for increasing, negative for decreasing).
     */
    private final MathArrays.OrderDirection direction;
    /**
     * Whether the sequence must be strictly increasing or decreasing.
     */
    private final boolean strict;
    /**
     * Index of the wrong value.
     */
    private final int index;
    /**
     * Previous value.
     */
    private final Number previous;

    /**
     * Construct the exception.
     * This constructor uses default values assuming that the sequence should
     * have been strictly increasing.
     *
     * @param wrong Value that did not match the requirements.
     * @param previous Previous value in the sequence.
     * @param index Index of the value that did not match the requirements.
     */
    public NonMonotonicSequenceException(Number wrong,
                                         Number previous,
                                         int index) {
        this(wrong, previous, index, MathArrays.OrderDirection.INCREASING, true);__CLR4_4_19o69o6lb90p7ns.R.inc(12535);try{__CLR4_4_19o69o6lb90p7ns.R.inc(12534);
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}

    /**
     * Construct the exception.
     *
     * @param wrong Value that did not match the requirements.
     * @param previous Previous value in the sequence.
     * @param index Index of the value that did not match the requirements.
     * @param direction Strictly positive for a sequence required to be
     * increasing, negative (or zero) for a decreasing sequence.
     * @param strict Whether the sequence must be strictly increasing or
     * decreasing.
     */
    public NonMonotonicSequenceException(Number wrong,
                                         Number previous,
                                         int index,
                                         MathArrays.OrderDirection direction,
                                         boolean strict) {
        super((((direction == MathArrays.OrderDirection.INCREASING )&&(__CLR4_4_19o69o6lb90p7ns.R.iget(12537)!=0|true))||(__CLR4_4_19o69o6lb90p7ns.R.iget(12538)==0&false))?
              ((((strict )&&(__CLR4_4_19o69o6lb90p7ns.R.iget(12539)!=0|true))||(__CLR4_4_19o69o6lb90p7ns.R.iget(12540)==0&false))?
               LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE :
               LocalizedFormats.NOT_INCREASING_SEQUENCE) :
              ((((strict )&&(__CLR4_4_19o69o6lb90p7ns.R.iget(12541)!=0|true))||(__CLR4_4_19o69o6lb90p7ns.R.iget(12542)==0&false))?
               LocalizedFormats.NOT_STRICTLY_DECREASING_SEQUENCE :
               LocalizedFormats.NOT_DECREASING_SEQUENCE),
              wrong, previous, Integer.valueOf(index), Integer.valueOf(index - 1));__CLR4_4_19o69o6lb90p7ns.R.inc(12543);try{__CLR4_4_19o69o6lb90p7ns.R.inc(12536);

        __CLR4_4_19o69o6lb90p7ns.R.inc(12544);this.direction = direction;
        __CLR4_4_19o69o6lb90p7ns.R.inc(12545);this.strict = strict;
        __CLR4_4_19o69o6lb90p7ns.R.inc(12546);this.index = index;
        __CLR4_4_19o69o6lb90p7ns.R.inc(12547);this.previous = previous;
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}

    /**
     * @return the order direction.
     **/
    public MathArrays.OrderDirection getDirection() {try{__CLR4_4_19o69o6lb90p7ns.R.inc(12548);
        __CLR4_4_19o69o6lb90p7ns.R.inc(12549);return direction;
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}
    /**
     * @return {@code true} is the sequence should be strictly monotonic.
     **/
    public boolean getStrict() {try{__CLR4_4_19o69o6lb90p7ns.R.inc(12550);
        __CLR4_4_19o69o6lb90p7ns.R.inc(12551);return strict;
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}
    /**
     * Get the index of the wrong value.
     *
     * @return the current index.
     */
    public int getIndex() {try{__CLR4_4_19o69o6lb90p7ns.R.inc(12552);
        __CLR4_4_19o69o6lb90p7ns.R.inc(12553);return index;
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}
    /**
     * @return the previous value.
     */
    public Number getPrevious() {try{__CLR4_4_19o69o6lb90p7ns.R.inc(12554);
        __CLR4_4_19o69o6lb90p7ns.R.inc(12555);return previous;
    }finally{__CLR4_4_19o69o6lb90p7ns.R.flushNeeded();}}
}
