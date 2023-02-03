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
package org.apache.commons.math3.analysis.interpolation;

import org.apache.commons.math3.analysis.TrivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.util.MathArrays;

/**
 * Function that implements the
 * <a href="http://en.wikipedia.org/wiki/Tricubic_interpolation">
 * tricubic spline interpolation</a>, as proposed in
 * <quote>
 *  Tricubic interpolation in three dimensions<br/>
 *  F. Lekien and J. Marsden<br/>
 *  <em>Int. J. Numer. Meth. Engng</em> 2005; <b>63</b>:455-471
 * </quote>
 *
 * @since 2.2
 * @version $Id$
 */
public class TricubicSplineInterpolatingFunction
    implements TrivariateFunction {public static class __CLR4_4_135c35clb90p6y5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Matrix to compute the spline coefficients from the function values
     * and function derivatives values
     */
    private static final double[][] AINV = {
        { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -3,3,0,0,0,0,0,0,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 2,-2,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,-3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 9,-9,-9,9,0,0,0,0,6,3,-6,-3,0,0,0,0,6,-6,3,-3,0,0,0,0,0,0,0,0,0,0,0,0,4,2,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -6,6,6,-6,0,0,0,0,-3,-3,3,3,0,0,0,0,-4,4,-2,2,0,0,0,0,0,0,0,0,0,0,0,0,-2,-2,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 2,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,2,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -6,6,6,-6,0,0,0,0,-4,-2,4,2,0,0,0,0,-3,3,-3,3,0,0,0,0,0,0,0,0,0,0,0,0,-2,-1,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 4,-4,-4,4,0,0,0,0,2,2,-2,-2,0,0,0,0,2,-2,2,-2,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,3,0,0,0,0,0,0,-2,-1,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,-2,0,0,0,0,0,0,1,1,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-1,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,-9,-9,9,0,0,0,0,0,0,0,0,0,0,0,0,6,3,-6,-3,0,0,0,0,6,-6,3,-3,0,0,0,0,4,2,2,1,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6,6,6,-6,0,0,0,0,0,0,0,0,0,0,0,0,-3,-3,3,3,0,0,0,0,-4,4,-2,2,0,0,0,0,-2,-2,-1,-1,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6,6,6,-6,0,0,0,0,0,0,0,0,0,0,0,0,-4,-2,4,2,0,0,0,0,-3,3,-3,3,0,0,0,0,-2,-1,-2,-1,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,-4,-4,4,0,0,0,0,0,0,0,0,0,0,0,0,2,2,-2,-2,0,0,0,0,2,-2,2,-2,0,0,0,0,1,1,1,1,0,0,0,0 },
        {-3,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,-3,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 9,-9,0,0,-9,9,0,0,6,3,0,0,-6,-3,0,0,0,0,0,0,0,0,0,0,6,-6,0,0,3,-3,0,0,0,0,0,0,0,0,0,0,4,2,0,0,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -6,6,0,0,6,-6,0,0,-3,-3,0,0,3,3,0,0,0,0,0,0,0,0,0,0,-4,4,0,0,-2,2,0,0,0,0,0,0,0,0,0,0,-2,-2,0,0,-1,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,0,0,-1,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,-9,0,0,-9,9,0,0,0,0,0,0,0,0,0,0,6,3,0,0,-6,-3,0,0,0,0,0,0,0,0,0,0,6,-6,0,0,3,-3,0,0,4,2,0,0,2,1,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6,6,0,0,6,-6,0,0,0,0,0,0,0,0,0,0,-3,-3,0,0,3,3,0,0,0,0,0,0,0,0,0,0,-4,4,0,0,-2,2,0,0,-2,-2,0,0,-1,-1,0,0 },
        { 9,0,-9,0,-9,0,9,0,0,0,0,0,0,0,0,0,6,0,3,0,-6,0,-3,0,6,0,-6,0,3,0,-3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,0,2,0,2,0,1,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,9,0,-9,0,-9,0,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,3,0,-6,0,-3,0,6,0,-6,0,3,0,-3,0,0,0,0,0,0,0,0,0,4,0,2,0,2,0,1,0 },
        { -27,27,27,-27,27,-27,-27,27,-18,-9,18,9,18,9,-18,-9,-18,18,-9,9,18,-18,9,-9,-18,18,18,-18,-9,9,9,-9,-12,-6,-6,-3,12,6,6,3,-12,-6,12,6,-6,-3,6,3,-12,12,-6,6,-6,6,-3,3,-8,-4,-4,-2,-4,-2,-2,-1 },
        { 18,-18,-18,18,-18,18,18,-18,9,9,-9,-9,-9,-9,9,9,12,-12,6,-6,-12,12,-6,6,12,-12,-12,12,6,-6,-6,6,6,6,3,3,-6,-6,-3,-3,6,6,-6,-6,3,3,-3,-3,8,-8,4,-4,4,-4,2,-2,4,4,2,2,2,2,1,1 },
        { -6,0,6,0,6,0,-6,0,0,0,0,0,0,0,0,0,-3,0,-3,0,3,0,3,0,-4,0,4,0,-2,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-2,0,-1,0,-1,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,-6,0,6,0,6,0,-6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3,0,-3,0,3,0,3,0,-4,0,4,0,-2,0,2,0,0,0,0,0,0,0,0,0,-2,0,-2,0,-1,0,-1,0 },
        { 18,-18,-18,18,-18,18,18,-18,12,6,-12,-6,-12,-6,12,6,9,-9,9,-9,-9,9,-9,9,12,-12,-12,12,6,-6,-6,6,6,3,6,3,-6,-3,-6,-3,8,4,-8,-4,4,2,-4,-2,6,-6,6,-6,3,-3,3,-3,4,2,4,2,2,1,2,1 },
        { -12,12,12,-12,12,-12,-12,12,-6,-6,6,6,6,6,-6,-6,-6,6,-6,6,6,-6,6,-6,-8,8,8,-8,-4,4,4,-4,-3,-3,-3,-3,3,3,3,3,-4,-4,4,4,-2,-2,2,2,-4,4,-4,4,-2,2,-2,2,-2,-2,-2,-2,-1,-1,-1,-1 },
        { 2,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,2,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { -6,6,0,0,6,-6,0,0,-4,-2,0,0,4,2,0,0,0,0,0,0,0,0,0,0,-3,3,0,0,-3,3,0,0,0,0,0,0,0,0,0,0,-2,-1,0,0,-2,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 4,-4,0,0,-4,4,0,0,2,2,0,0,-2,-2,0,0,0,0,0,0,0,0,0,0,2,-2,0,0,2,-2,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6,6,0,0,6,-6,0,0,0,0,0,0,0,0,0,0,-4,-2,0,0,4,2,0,0,0,0,0,0,0,0,0,0,-3,3,0,0,-3,3,0,0,-2,-1,0,0,-2,-1,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,-4,0,0,-4,4,0,0,0,0,0,0,0,0,0,0,2,2,0,0,-2,-2,0,0,0,0,0,0,0,0,0,0,2,-2,0,0,2,-2,0,0,1,1,0,0,1,1,0,0 },
        { -6,0,6,0,6,0,-6,0,0,0,0,0,0,0,0,0,-4,0,-2,0,4,0,2,0,-3,0,3,0,-3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2,0,-1,0,-2,0,-1,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,-6,0,6,0,6,0,-6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-4,0,-2,0,4,0,2,0,-3,0,3,0,-3,0,3,0,0,0,0,0,0,0,0,0,-2,0,-1,0,-2,0,-1,0 },
        { 18,-18,-18,18,-18,18,18,-18,12,6,-12,-6,-12,-6,12,6,12,-12,6,-6,-12,12,-6,6,9,-9,-9,9,9,-9,-9,9,8,4,4,2,-8,-4,-4,-2,6,3,-6,-3,6,3,-6,-3,6,-6,3,-3,6,-6,3,-3,4,2,2,1,4,2,2,1 },
        { -12,12,12,-12,12,-12,-12,12,-6,-6,6,6,6,6,-6,-6,-8,8,-4,4,8,-8,4,-4,-6,6,6,-6,-6,6,6,-6,-4,-4,-2,-2,4,4,2,2,-3,-3,3,3,-3,-3,3,3,-4,4,-2,2,-4,4,-2,2,-2,-2,-1,-1,-2,-2,-1,-1 },
        { 4,0,-4,0,-4,0,4,0,0,0,0,0,0,0,0,0,2,0,2,0,-2,0,-2,0,2,0,-2,0,2,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,4,0,-4,0,-4,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,2,0,-2,0,-2,0,2,0,-2,0,2,0,-2,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0 },
        { -12,12,12,-12,12,-12,-12,12,-8,-4,8,4,8,4,-8,-4,-6,6,-6,6,6,-6,6,-6,-6,6,6,-6,-6,6,6,-6,-4,-2,-4,-2,4,2,4,2,-4,-2,4,2,-4,-2,4,2,-3,3,-3,3,-3,3,-3,3,-2,-1,-2,-1,-2,-1,-2,-1 },
        { 8,-8,-8,8,-8,8,8,-8,4,4,-4,-4,-4,-4,4,4,4,-4,4,-4,-4,4,-4,4,4,-4,-4,4,4,-4,-4,4,2,2,2,2,-2,-2,-2,-2,2,2,-2,-2,2,2,-2,-2,2,-2,2,-2,2,-2,2,-2,1,1,1,1,1,1,1,1 }
    };

    /** Samples x-coordinates */
    private final double[] xval;
    /** Samples y-coordinates */
    private final double[] yval;
    /** Samples z-coordinates */
    private final double[] zval;
    /** Set of cubic splines pacthing the whole data grid */
    private final TricubicSplineFunction[][][] splines;

    /**
     * @param x Sample values of the x-coordinate, in increasing order.
     * @param y Sample values of the y-coordinate, in increasing order.
     * @param z Sample values of the y-coordinate, in increasing order.
     * @param f Values of the function on every grid point.
     * @param dFdX Values of the partial derivative of function with respect to x on every grid point.
     * @param dFdY Values of the partial derivative of function with respect to y on every grid point.
     * @param dFdZ Values of the partial derivative of function with respect to z on every grid point.
     * @param d2FdXdY Values of the cross partial derivative of function on every grid point.
     * @param d2FdXdZ Values of the cross partial derivative of function on every grid point.
     * @param d2FdYdZ Values of the cross partial derivative of function on every grid point.
     * @param d3FdXdYdZ Values of the cross partial derivative of function on every grid point.
     * @throws NoDataException if any of the arrays has zero length.
     * @throws DimensionMismatchException if the various arrays do not contain the expected number of elements.
     * @throws NonMonotonicSequenceException if {@code x}, {@code y} or {@code z} are not strictly increasing.
     */
    public TricubicSplineInterpolatingFunction(double[] x,
                                               double[] y,
                                               double[] z,
                                               double[][][] f,
                                               double[][][] dFdX,
                                               double[][][] dFdY,
                                               double[][][] dFdZ,
                                               double[][][] d2FdXdY,
                                               double[][][] d2FdXdZ,
                                               double[][][] d2FdYdZ,
                                               double[][][] d3FdXdYdZ)
        throws NoDataException,
               DimensionMismatchException,
               NonMonotonicSequenceException {try{__CLR4_4_135c35clb90p6y5.R.inc(4080);
        __CLR4_4_135c35clb90p6y5.R.inc(4081);final int xLen = x.length;
        __CLR4_4_135c35clb90p6y5.R.inc(4082);final int yLen = y.length;
        __CLR4_4_135c35clb90p6y5.R.inc(4083);final int zLen = z.length;

        __CLR4_4_135c35clb90p6y5.R.inc(4084);if ((((xLen == 0 || yLen == 0 || z.length == 0 || f.length == 0 || f[0].length == 0)&&(__CLR4_4_135c35clb90p6y5.R.iget(4085)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4086)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4087);throw new NoDataException();
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4088);if ((((xLen != f.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4089)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4090)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4091);throw new DimensionMismatchException(xLen, f.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4092);if ((((xLen != dFdX.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4093)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4094)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4095);throw new DimensionMismatchException(xLen, dFdX.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4096);if ((((xLen != dFdY.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4097)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4098)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4099);throw new DimensionMismatchException(xLen, dFdY.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4100);if ((((xLen != dFdZ.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4101)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4102)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4103);throw new DimensionMismatchException(xLen, dFdZ.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4104);if ((((xLen != d2FdXdY.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4105)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4106)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4107);throw new DimensionMismatchException(xLen, d2FdXdY.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4108);if ((((xLen != d2FdXdZ.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4109)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4110)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4111);throw new DimensionMismatchException(xLen, d2FdXdZ.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4112);if ((((xLen != d2FdYdZ.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4113)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4114)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4115);throw new DimensionMismatchException(xLen, d2FdYdZ.length);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4116);if ((((xLen != d3FdXdYdZ.length)&&(__CLR4_4_135c35clb90p6y5.R.iget(4117)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4118)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4119);throw new DimensionMismatchException(xLen, d3FdXdYdZ.length);
        }

        }__CLR4_4_135c35clb90p6y5.R.inc(4120);MathArrays.checkOrder(x);
        __CLR4_4_135c35clb90p6y5.R.inc(4121);MathArrays.checkOrder(y);
        __CLR4_4_135c35clb90p6y5.R.inc(4122);MathArrays.checkOrder(z);

        __CLR4_4_135c35clb90p6y5.R.inc(4123);xval = x.clone();
        __CLR4_4_135c35clb90p6y5.R.inc(4124);yval = y.clone();
        __CLR4_4_135c35clb90p6y5.R.inc(4125);zval = z.clone();

        __CLR4_4_135c35clb90p6y5.R.inc(4126);final int lastI = xLen - 1;
        __CLR4_4_135c35clb90p6y5.R.inc(4127);final int lastJ = yLen - 1;
        __CLR4_4_135c35clb90p6y5.R.inc(4128);final int lastK = zLen - 1;
        __CLR4_4_135c35clb90p6y5.R.inc(4129);splines = new TricubicSplineFunction[lastI][lastJ][lastK];

        __CLR4_4_135c35clb90p6y5.R.inc(4130);for (int i = 0; (((i < lastI)&&(__CLR4_4_135c35clb90p6y5.R.iget(4131)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4132)==0&false)); i++) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4133);if ((((f[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4134)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4135)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4136);throw new DimensionMismatchException(f[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4137);if ((((dFdX[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4138)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4139)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4140);throw new DimensionMismatchException(dFdX[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4141);if ((((dFdY[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4142)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4143)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4144);throw new DimensionMismatchException(dFdY[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4145);if ((((dFdZ[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4146)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4147)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4148);throw new DimensionMismatchException(dFdZ[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4149);if ((((d2FdXdY[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4150)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4151)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4152);throw new DimensionMismatchException(d2FdXdY[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4153);if ((((d2FdXdZ[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4154)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4155)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4156);throw new DimensionMismatchException(d2FdXdZ[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4157);if ((((d2FdYdZ[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4158)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4159)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4160);throw new DimensionMismatchException(d2FdYdZ[i].length, yLen);
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4161);if ((((d3FdXdYdZ[i].length != yLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4162)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4163)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4164);throw new DimensionMismatchException(d3FdXdYdZ[i].length, yLen);
            }

            }__CLR4_4_135c35clb90p6y5.R.inc(4165);final int ip1 = i + 1;
            __CLR4_4_135c35clb90p6y5.R.inc(4166);for (int j = 0; (((j < lastJ)&&(__CLR4_4_135c35clb90p6y5.R.iget(4167)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4168)==0&false)); j++) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4169);if ((((f[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4170)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4171)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4172);throw new DimensionMismatchException(f[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4173);if ((((dFdX[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4174)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4175)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4176);throw new DimensionMismatchException(dFdX[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4177);if ((((dFdY[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4178)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4179)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4180);throw new DimensionMismatchException(dFdY[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4181);if ((((dFdZ[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4182)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4183)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4184);throw new DimensionMismatchException(dFdZ[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4185);if ((((d2FdXdY[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4186)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4187)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4188);throw new DimensionMismatchException(d2FdXdY[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4189);if ((((d2FdXdZ[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4190)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4191)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4192);throw new DimensionMismatchException(d2FdXdZ[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4193);if ((((d2FdYdZ[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4194)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4195)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4196);throw new DimensionMismatchException(d2FdYdZ[i][j].length, zLen);
                }
                }__CLR4_4_135c35clb90p6y5.R.inc(4197);if ((((d3FdXdYdZ[i][j].length != zLen)&&(__CLR4_4_135c35clb90p6y5.R.iget(4198)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4199)==0&false))) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4200);throw new DimensionMismatchException(d3FdXdYdZ[i][j].length, zLen);
                }

                }__CLR4_4_135c35clb90p6y5.R.inc(4201);final int jp1 = j + 1;
                __CLR4_4_135c35clb90p6y5.R.inc(4202);for (int k = 0; (((k < lastK)&&(__CLR4_4_135c35clb90p6y5.R.iget(4203)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4204)==0&false)); k++) {{
                    __CLR4_4_135c35clb90p6y5.R.inc(4205);final int kp1 = k + 1;

                    __CLR4_4_135c35clb90p6y5.R.inc(4206);final double[] beta = new double[] {
                        f[i][j][k], f[ip1][j][k],
                        f[i][jp1][k], f[ip1][jp1][k],
                        f[i][j][kp1], f[ip1][j][kp1],
                        f[i][jp1][kp1], f[ip1][jp1][kp1],

                        dFdX[i][j][k], dFdX[ip1][j][k],
                        dFdX[i][jp1][k], dFdX[ip1][jp1][k],
                        dFdX[i][j][kp1], dFdX[ip1][j][kp1],
                        dFdX[i][jp1][kp1], dFdX[ip1][jp1][kp1],

                        dFdY[i][j][k], dFdY[ip1][j][k],
                        dFdY[i][jp1][k], dFdY[ip1][jp1][k],
                        dFdY[i][j][kp1], dFdY[ip1][j][kp1],
                        dFdY[i][jp1][kp1], dFdY[ip1][jp1][kp1],

                        dFdZ[i][j][k], dFdZ[ip1][j][k],
                        dFdZ[i][jp1][k], dFdZ[ip1][jp1][k],
                        dFdZ[i][j][kp1], dFdZ[ip1][j][kp1],
                        dFdZ[i][jp1][kp1], dFdZ[ip1][jp1][kp1],

                        d2FdXdY[i][j][k], d2FdXdY[ip1][j][k],
                        d2FdXdY[i][jp1][k], d2FdXdY[ip1][jp1][k],
                        d2FdXdY[i][j][kp1], d2FdXdY[ip1][j][kp1],
                        d2FdXdY[i][jp1][kp1], d2FdXdY[ip1][jp1][kp1],

                        d2FdXdZ[i][j][k], d2FdXdZ[ip1][j][k],
                        d2FdXdZ[i][jp1][k], d2FdXdZ[ip1][jp1][k],
                        d2FdXdZ[i][j][kp1], d2FdXdZ[ip1][j][kp1],
                        d2FdXdZ[i][jp1][kp1], d2FdXdZ[ip1][jp1][kp1],

                        d2FdYdZ[i][j][k], d2FdYdZ[ip1][j][k],
                        d2FdYdZ[i][jp1][k], d2FdYdZ[ip1][jp1][k],
                        d2FdYdZ[i][j][kp1], d2FdYdZ[ip1][j][kp1],
                        d2FdYdZ[i][jp1][kp1], d2FdYdZ[ip1][jp1][kp1],

                        d3FdXdYdZ[i][j][k], d3FdXdYdZ[ip1][j][k],
                        d3FdXdYdZ[i][jp1][k], d3FdXdYdZ[ip1][jp1][k],
                        d3FdXdYdZ[i][j][kp1], d3FdXdYdZ[ip1][j][kp1],
                        d3FdXdYdZ[i][jp1][kp1], d3FdXdYdZ[ip1][jp1][kp1],
                    };

                    __CLR4_4_135c35clb90p6y5.R.inc(4207);splines[i][j][k] = new TricubicSplineFunction(computeSplineCoefficients(beta));
                }
            }}
        }}
    }}finally{__CLR4_4_135c35clb90p6y5.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws OutOfRangeException if any of the variables is outside its interpolation range.
     */
    public double value(double x, double y, double z)
        throws OutOfRangeException {try{__CLR4_4_135c35clb90p6y5.R.inc(4208);
        __CLR4_4_135c35clb90p6y5.R.inc(4209);final int i = searchIndex(x, xval);
        __CLR4_4_135c35clb90p6y5.R.inc(4210);if ((((i == -1)&&(__CLR4_4_135c35clb90p6y5.R.iget(4211)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4212)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4213);throw new OutOfRangeException(x, xval[0], xval[xval.length - 1]);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4214);final int j = searchIndex(y, yval);
        __CLR4_4_135c35clb90p6y5.R.inc(4215);if ((((j == -1)&&(__CLR4_4_135c35clb90p6y5.R.iget(4216)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4217)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4218);throw new OutOfRangeException(y, yval[0], yval[yval.length - 1]);
        }
        }__CLR4_4_135c35clb90p6y5.R.inc(4219);final int k = searchIndex(z, zval);
        __CLR4_4_135c35clb90p6y5.R.inc(4220);if ((((k == -1)&&(__CLR4_4_135c35clb90p6y5.R.iget(4221)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4222)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4223);throw new OutOfRangeException(z, zval[0], zval[zval.length - 1]);
        }

        }__CLR4_4_135c35clb90p6y5.R.inc(4224);final double xN = (x - xval[i]) / (xval[i + 1] - xval[i]);
        __CLR4_4_135c35clb90p6y5.R.inc(4225);final double yN = (y - yval[j]) / (yval[j + 1] - yval[j]);
        __CLR4_4_135c35clb90p6y5.R.inc(4226);final double zN = (z - zval[k]) / (zval[k + 1] - zval[k]);

        __CLR4_4_135c35clb90p6y5.R.inc(4227);return splines[i][j][k].value(xN, yN, zN);
    }finally{__CLR4_4_135c35clb90p6y5.R.flushNeeded();}}

    /**
     * @param c Coordinate.
     * @param val Coordinate samples.
     * @return the index in {@code val} corresponding to the interval containing {@code c}, or {@code -1}
     *   if {@code c} is out of the range defined by the end values of {@code val}.
     */
    private int searchIndex(double c, double[] val) {try{__CLR4_4_135c35clb90p6y5.R.inc(4228);
        __CLR4_4_135c35clb90p6y5.R.inc(4229);if ((((c < val[0])&&(__CLR4_4_135c35clb90p6y5.R.iget(4230)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4231)==0&false))) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4232);return -1;
        }

        }__CLR4_4_135c35clb90p6y5.R.inc(4233);final int max = val.length;
        __CLR4_4_135c35clb90p6y5.R.inc(4234);for (int i = 1; (((i < max)&&(__CLR4_4_135c35clb90p6y5.R.iget(4235)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4236)==0&false)); i++) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4237);if ((((c <= val[i])&&(__CLR4_4_135c35clb90p6y5.R.iget(4238)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4239)==0&false))) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4240);return i - 1;
            }
        }}

        }__CLR4_4_135c35clb90p6y5.R.inc(4241);return -1;
    }finally{__CLR4_4_135c35clb90p6y5.R.flushNeeded();}}

    /**
     * Compute the spline coefficients from the list of function values and
     * function partial derivatives values at the four corners of a grid
     * element. They must be specified in the following order:
     * <ul>
     *  <li>f(0,0,0)</li>
     *  <li>f(1,0,0)</li>
     *  <li>f(0,1,0)</li>
     *  <li>f(1,1,0)</li>
     *  <li>f(0,0,1)</li>
     *  <li>f(1,0,1)</li>
     *  <li>f(0,1,1)</li>
     *  <li>f(1,1,1)</li>
     *
     *  <li>f<sub>x</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>x</sub>(1,1,1)</li>
     *
     *  <li>f<sub>y</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>y</sub>(1,1,1)</li>
     *
     *  <li>f<sub>z</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>z</sub>(1,1,1)</li>
     *
     *  <li>f<sub>xy</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>xy</sub>(1,1,1)</li>
     *
     *  <li>f<sub>xz</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>xz</sub>(1,1,1)</li>
     *
     *  <li>f<sub>yz</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>yz</sub>(1,1,1)</li>
     *
     *  <li>f<sub>xyz</sub>(0,0,0)</li>
     *  <li>... <em>(same order as above)</em></li>
     *  <li>f<sub>xyz</sub>(1,1,1)</li>
     * </ul>
     * where the subscripts indicate the partial derivative with respect to
     * the corresponding variable(s).
     *
     * @param beta List of function values and function partial derivatives values.
     * @return the spline coefficients.
     */
    private double[] computeSplineCoefficients(double[] beta) {try{__CLR4_4_135c35clb90p6y5.R.inc(4242);
        __CLR4_4_135c35clb90p6y5.R.inc(4243);final int sz = 64;
        __CLR4_4_135c35clb90p6y5.R.inc(4244);final double[] a = new double[sz];

        __CLR4_4_135c35clb90p6y5.R.inc(4245);for (int i = 0; (((i < sz)&&(__CLR4_4_135c35clb90p6y5.R.iget(4246)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4247)==0&false)); i++) {{
            __CLR4_4_135c35clb90p6y5.R.inc(4248);double result = 0;
            __CLR4_4_135c35clb90p6y5.R.inc(4249);final double[] row = AINV[i];
            __CLR4_4_135c35clb90p6y5.R.inc(4250);for (int j = 0; (((j < sz)&&(__CLR4_4_135c35clb90p6y5.R.iget(4251)!=0|true))||(__CLR4_4_135c35clb90p6y5.R.iget(4252)==0&false)); j++) {{
                __CLR4_4_135c35clb90p6y5.R.inc(4253);result += row[j] * beta[j];
            }
            }__CLR4_4_135c35clb90p6y5.R.inc(4254);a[i] = result;
        }

        }__CLR4_4_135c35clb90p6y5.R.inc(4255);return a;
    }finally{__CLR4_4_135c35clb90p6y5.R.flushNeeded();}}
}

/**
 * 3D-spline function.
 *
 * @version $Id$
 */
class TricubicSplineFunction
    implements TrivariateFunction {public static class __CLR4_4_135c3a8lb90p6y6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4301,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Number of points. */
    private static final short N = 4;
    /** Coefficients */
    private final double[][][] a = new double[N][N][N];

    /**
     * @param aV List of spline coefficients.
     */
    public TricubicSplineFunction(double[] aV) {try{__CLR4_4_135c3a8lb90p6y6.R.inc(4256);
        __CLR4_4_135c3a8lb90p6y6.R.inc(4257);for (int i = 0; (((i < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4258)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4259)==0&false)); i++) {{
            __CLR4_4_135c3a8lb90p6y6.R.inc(4260);for (int j = 0; (((j < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4261)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4262)==0&false)); j++) {{
                __CLR4_4_135c3a8lb90p6y6.R.inc(4263);for (int k = 0; (((k < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4264)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4265)==0&false)); k++) {{
                    __CLR4_4_135c3a8lb90p6y6.R.inc(4266);a[i][j][k] = aV[i + N * (j + N * k)];
                }
            }}
        }}
    }}finally{__CLR4_4_135c3a8lb90p6y6.R.flushNeeded();}}

    /**
     * @param x x-coordinate of the interpolation point.
     * @param y y-coordinate of the interpolation point.
     * @param z z-coordinate of the interpolation point.
     * @return the interpolated value.
     * @throws OutOfRangeException if {@code x}, {@code y} or
     * {@code z} are not in the interval {@code [0, 1]}.
     */
    public double value(double x, double y, double z)
        throws OutOfRangeException {try{__CLR4_4_135c3a8lb90p6y6.R.inc(4267);
        __CLR4_4_135c3a8lb90p6y6.R.inc(4268);if ((((x < 0 || x > 1)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4269)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4270)==0&false))) {{
            __CLR4_4_135c3a8lb90p6y6.R.inc(4271);throw new OutOfRangeException(x, 0, 1);
        }
        }__CLR4_4_135c3a8lb90p6y6.R.inc(4272);if ((((y < 0 || y > 1)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4273)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4274)==0&false))) {{
            __CLR4_4_135c3a8lb90p6y6.R.inc(4275);throw new OutOfRangeException(y, 0, 1);
        }
        }__CLR4_4_135c3a8lb90p6y6.R.inc(4276);if ((((z < 0 || z > 1)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4277)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4278)==0&false))) {{
            __CLR4_4_135c3a8lb90p6y6.R.inc(4279);throw new OutOfRangeException(z, 0, 1);
        }

        }__CLR4_4_135c3a8lb90p6y6.R.inc(4280);final double x2 = x * x;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4281);final double x3 = x2 * x;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4282);final double[] pX = { 1, x, x2, x3 };

        __CLR4_4_135c3a8lb90p6y6.R.inc(4283);final double y2 = y * y;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4284);final double y3 = y2 * y;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4285);final double[] pY = { 1, y, y2, y3 };

        __CLR4_4_135c3a8lb90p6y6.R.inc(4286);final double z2 = z * z;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4287);final double z3 = z2 * z;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4288);final double[] pZ = { 1, z, z2, z3 };

        __CLR4_4_135c3a8lb90p6y6.R.inc(4289);double result = 0;
        __CLR4_4_135c3a8lb90p6y6.R.inc(4290);for (int i = 0; (((i < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4291)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4292)==0&false)); i++) {{
            __CLR4_4_135c3a8lb90p6y6.R.inc(4293);for (int j = 0; (((j < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4294)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4295)==0&false)); j++) {{
                __CLR4_4_135c3a8lb90p6y6.R.inc(4296);for (int k = 0; (((k < N)&&(__CLR4_4_135c3a8lb90p6y6.R.iget(4297)!=0|true))||(__CLR4_4_135c3a8lb90p6y6.R.iget(4298)==0&false)); k++) {{
                    __CLR4_4_135c3a8lb90p6y6.R.inc(4299);result += a[i][j][k] * pX[i] * pY[j] * pZ[k];
                }
            }}
        }}

        }__CLR4_4_135c3a8lb90p6y6.R.inc(4300);return result;
    }finally{__CLR4_4_135c3a8lb90p6y6.R.flushNeeded();}}
}
