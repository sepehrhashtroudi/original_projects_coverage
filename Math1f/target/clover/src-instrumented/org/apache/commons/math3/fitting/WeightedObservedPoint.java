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
package org.apache.commons.math3.fitting;

import java.io.Serializable;

/**
 * This class is a simple container for weighted observed point in
 * {@link CurveFitter curve fitting}.
 * <p>Instances of this class are guaranteed to be immutable.</p>
 * @version $Id: WeightedObservedPoint.java 1416643 2012-12-03 19:37:14Z tn $
 * @since 2.0
 */
public class WeightedObservedPoint implements Serializable {public static class __CLR4_4_1abqabqlb90p7rt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version id. */
    private static final long serialVersionUID = 5306874947404636157L;
    /** Weight of the measurement in the fitting process. */
    private final double weight;
    /** Abscissa of the point. */
    private final double x;
    /** Observed value of the function at x. */
    private final double y;

    /**
     * Simple constructor.
     *
     * @param weight Weight of the measurement in the fitting process.
     * @param x Abscissa of the measurement.
     * @param y Ordinate of the measurement.
     */
    public WeightedObservedPoint(final double weight, final double x, final double y) {try{__CLR4_4_1abqabqlb90p7rt.R.inc(13382);
        __CLR4_4_1abqabqlb90p7rt.R.inc(13383);this.weight = weight;
        __CLR4_4_1abqabqlb90p7rt.R.inc(13384);this.x      = x;
        __CLR4_4_1abqabqlb90p7rt.R.inc(13385);this.y      = y;
    }finally{__CLR4_4_1abqabqlb90p7rt.R.flushNeeded();}}

    /**
     * Gets the weight of the measurement in the fitting process.
     *
     * @return the weight of the measurement in the fitting process.
     */
    public double getWeight() {try{__CLR4_4_1abqabqlb90p7rt.R.inc(13386);
        __CLR4_4_1abqabqlb90p7rt.R.inc(13387);return weight;
    }finally{__CLR4_4_1abqabqlb90p7rt.R.flushNeeded();}}

    /**
     * Gets the abscissa of the point.
     *
     * @return the abscissa of the point.
     */
    public double getX() {try{__CLR4_4_1abqabqlb90p7rt.R.inc(13388);
        __CLR4_4_1abqabqlb90p7rt.R.inc(13389);return x;
    }finally{__CLR4_4_1abqabqlb90p7rt.R.flushNeeded();}}

    /**
     * Gets the observed value of the function at x.
     *
     * @return the observed value of the function at x.
     */
    public double getY() {try{__CLR4_4_1abqabqlb90p7rt.R.inc(13390);
        __CLR4_4_1abqabqlb90p7rt.R.inc(13391);return y;
    }finally{__CLR4_4_1abqabqlb90p7rt.R.flushNeeded();}}

}

