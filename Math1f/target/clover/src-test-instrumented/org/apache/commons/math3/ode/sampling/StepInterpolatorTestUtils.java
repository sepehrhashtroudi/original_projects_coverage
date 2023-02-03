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
package org.apache.commons.math3.ode.sampling;


import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblemAbstract;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;

public class StepInterpolatorTestUtils {static class __CLR4_4_120r920r9lb90pdof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void checkDerivativesConsistency(final FirstOrderIntegrator integrator,
                                                   final TestProblemAbstract problem,
                                                   final double threshold)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_120r920r9lb90pdof.R.inc(94293);
        __CLR4_4_120r920r9lb90pdof.R.inc(94294);integrator.addStepHandler(new StepHandler() {

            public void handleStep(StepInterpolator interpolator, boolean isLast)
                throws MaxCountExceededException {try{__CLR4_4_120r920r9lb90pdof.R.inc(94295);

                __CLR4_4_120r920r9lb90pdof.R.inc(94296);final double h = 0.001 * (interpolator.getCurrentTime() - interpolator.getPreviousTime());
                __CLR4_4_120r920r9lb90pdof.R.inc(94297);final double t = interpolator.getCurrentTime() - 300 * h;

                __CLR4_4_120r920r9lb90pdof.R.inc(94298);if ((((FastMath.abs(h) < 10 * FastMath.ulp(t))&&(__CLR4_4_120r920r9lb90pdof.R.iget(94299)!=0|true))||(__CLR4_4_120r920r9lb90pdof.R.iget(94300)==0&false))) {{
                    __CLR4_4_120r920r9lb90pdof.R.inc(94301);return;
                }

                }__CLR4_4_120r920r9lb90pdof.R.inc(94302);interpolator.setInterpolatedTime(t - 4 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94303);final double[] yM4h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94304);interpolator.setInterpolatedTime(t - 3 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94305);final double[] yM3h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94306);interpolator.setInterpolatedTime(t - 2 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94307);final double[] yM2h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94308);interpolator.setInterpolatedTime(t - h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94309);final double[] yM1h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94310);interpolator.setInterpolatedTime(t + h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94311);final double[] yP1h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94312);interpolator.setInterpolatedTime(t + 2 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94313);final double[] yP2h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94314);interpolator.setInterpolatedTime(t + 3 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94315);final double[] yP3h = interpolator.getInterpolatedState().clone();
                __CLR4_4_120r920r9lb90pdof.R.inc(94316);interpolator.setInterpolatedTime(t + 4 * h);
                __CLR4_4_120r920r9lb90pdof.R.inc(94317);final double[] yP4h = interpolator.getInterpolatedState().clone();

                __CLR4_4_120r920r9lb90pdof.R.inc(94318);interpolator.setInterpolatedTime(t);
                __CLR4_4_120r920r9lb90pdof.R.inc(94319);final double[] yDot = interpolator.getInterpolatedDerivatives();

                __CLR4_4_120r920r9lb90pdof.R.inc(94320);for (int i = 0; (((i < yDot.length)&&(__CLR4_4_120r920r9lb90pdof.R.iget(94321)!=0|true))||(__CLR4_4_120r920r9lb90pdof.R.iget(94322)==0&false)); ++i) {{
                    __CLR4_4_120r920r9lb90pdof.R.inc(94323);final double approYDot = ( -3 * (yP4h[i] - yM4h[i]) +
                                               32 * (yP3h[i] - yM3h[i]) +
                                             -168 * (yP2h[i] - yM2h[i]) +
                                              672 * (yP1h[i] - yM1h[i])) / (840 * h);
                    __CLR4_4_120r920r9lb90pdof.R.inc(94324);Assert.assertEquals(approYDot, yDot[i], threshold);
                }

            }}finally{__CLR4_4_120r920r9lb90pdof.R.flushNeeded();}}

            public void init(double t0, double[] y0, double t) {try{__CLR4_4_120r920r9lb90pdof.R.inc(94325);
            }finally{__CLR4_4_120r920r9lb90pdof.R.flushNeeded();}}

        });

        __CLR4_4_120r920r9lb90pdof.R.inc(94326);integrator.integrate(problem,
                             problem.getInitialTime(), problem.getInitialState(),
                             problem.getFinalTime(), new double[problem.getDimension()]);

    }finally{__CLR4_4_120r920r9lb90pdof.R.flushNeeded();}}
}

