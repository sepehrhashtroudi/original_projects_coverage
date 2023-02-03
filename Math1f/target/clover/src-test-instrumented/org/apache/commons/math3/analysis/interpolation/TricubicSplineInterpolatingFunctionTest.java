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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.analysis.TrivariateFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for the bicubic function.
 * 
 * @version $Id$
 */
public final class TricubicSplineInterpolatingFunctionTest {static class __CLR4_4_11fom1fomlb90pc2j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test preconditions.
     */
    @Test
    public void testPreconditions() {__CLR4_4_11fom1fomlb90pc2j.R.globalSliceStart(getClass().getName(),66982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01fom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fom1fomlb90pc2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fom1fomlb90pc2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunctionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01fom(){try{__CLR4_4_11fom1fomlb90pc2j.R.inc(66982);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66983);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66984);double[] yval = new double[] {-4, -3, -1, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66985);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66986);double[][][] fval = new double[xval.length][yval.length][zval.length];

        __CLR4_4_11fom1fomlb90pc2j.R.inc(66987);@SuppressWarnings("unused")
        TrivariateFunction tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                                             fval, fval, fval, fval,
                                                                             fval, fval, fval, fval);
        
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66988);double[] wxval = new double[] {3, 2, 5, 6.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66989);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66990);tcf = new TricubicSplineInterpolatingFunction(wxval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66991);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66992);double[] wyval = new double[] {-4, -1, -1, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66993);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66994);tcf = new TricubicSplineInterpolatingFunction(xval, wyval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66995);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66996);double[] wzval = new double[] {-12, -8, -9, -3, 0, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(66997);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66998);tcf = new TricubicSplineInterpolatingFunction(xval, yval, wzval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(66999);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67000);double[][][] wfval = new double[xval.length - 1][yval.length - 1][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67001);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67002);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          wfval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67003);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67004);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67005);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, wfval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67006);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67007);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67008);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, wfval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67009);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67010);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67011);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, wfval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67012);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67013);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67014);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          wfval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67015);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67016);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67017);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, wfval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67018);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67019);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67020);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, wfval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67021);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67022);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67023);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, wfval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67024);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67025);wfval = new double[xval.length][yval.length - 1][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67026);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67027);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          wfval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67028);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67029);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67030);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, wfval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67031);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67032);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67033);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, wfval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67034);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67035);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67036);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, wfval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67037);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67038);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67039);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          wfval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67040);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67041);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67042);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, wfval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67043);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67044);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67045);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, wfval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67046);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67047);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67048);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, wfval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67049);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67050);wfval = new double[xval.length][yval.length][zval.length - 1];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67051);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67052);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          wfval, fval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67053);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67054);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67055);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, wfval, fval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67056);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67057);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67058);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, wfval, fval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67059);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67060);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67061);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, wfval,
                                                          fval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67062);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67063);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67064);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          wfval, fval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67065);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67066);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67067);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, wfval, fval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67068);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67069);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67070);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, wfval, fval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67071);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67072);try {
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67073);tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                          fval, fval, fval, fval,
                                                          fval, fval, fval, wfval);
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67074);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}

    /**
     * Test for a plane.
     * <p>
     *  f(x, y, z) = 2 x - 3 y - 4 z + 5
     * </p>
     */
    @Test
    public void testPlane() {__CLR4_4_11fom1fomlb90pc2j.R.globalSliceStart(getClass().getName(),67075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaagi71fr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fom1fomlb90pc2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fom1fomlb90pc2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunctionTest.testPlane",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaagi71fr7(){try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67075);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67076);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67077);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67078);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 2.5};

        // Function values
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67079);TrivariateFunction f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67080);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67081);return 2 * x - 3 * y - 4 * z + 5;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67082);double[][][] fval = new double[xval.length][yval.length][zval.length];

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67083);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67084)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67085)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67086);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67087)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67088)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67089);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67090)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67091)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67092);fval[i][j][k] = f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67093);double[][][] dFdX = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67094);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67095)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67096)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67097);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67098)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67099)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67100);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67101)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67102)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67103);dFdX[i][j][k] = 2;
                }
            }}
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67104);double[][][] dFdY = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67105);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67106)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67107)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67108);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67109)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67110)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67111);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67112)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67113)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67114);dFdY[i][j][k] = -3;
                }
            }}
        }}

        // Partial derivatives with respect to z
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67115);double[][][] dFdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67116);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67117)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67118)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67119);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67120)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67121)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67122);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67123)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67124)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67125);dFdZ[i][j][k] = -4;
                }
            }}
        }}
        // Partial cross-derivatives
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67126);double[][][] d2FdXdY = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67127);double[][][] d2FdXdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67128);double[][][] d2FdYdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67129);double[][][] d3FdXdYdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67130);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67131)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67132)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67133);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67134)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67135)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67136);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67137)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67138)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67139);d2FdXdY[i][j][k] = 0;
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67140);d2FdXdZ[i][j][k] = 0;
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67141);d2FdYdZ[i][j][k] = 0;
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67142);d3FdXdYdZ[i][j][k] = 0;
                }
            }}
        }}

        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67143);TrivariateFunction tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                                             fval, dFdX, dFdY, dFdZ,
                                                                             d2FdXdY, d2FdXdZ, d2FdYdZ,
                                                                             d3FdXdYdZ);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67144);double x, y, z;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67145);double expected, result;

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67146);x = 4;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67147);y = -3;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67148);z = 0;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67149);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67150);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67151);Assert.assertEquals("On sample point",
                            expected, result, 1e-15);

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67152);x = 4.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67153);y = -1.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67154);z = -4.25;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67155);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67156);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67157);Assert.assertEquals("Half-way between sample points (middle of the patch)",
                            expected, result, 0.3);

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67158);x = 3.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67159);y = -3.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67160);z = -10;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67161);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67162);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67163);Assert.assertEquals("Half-way between sample points (border of the patch)",
                            expected, result, 0.3);
    }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}

    /**
     * Sine wave.
     * <p>
     *  f(x, y, z) = a cos [&omega; z - k<sub>y</sub> x - k<sub>y</sub> y]
     * </p>
     * with A = 0.2, &omega; = 0.5, k<sub>x</sub> = 2, k<sub>y</sub> = 1.
     */
    @Test
    public void testWave() {__CLR4_4_11fom1fomlb90pc2j.R.globalSliceStart(getClass().getName(),67164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13eufe61fto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fom1fomlb90pc2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fom1fomlb90pc2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunctionTest.testWave",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13eufe61fto(){try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67164);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67165);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67166);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67167);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 4};
        
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67168);final double a = 0.2;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67169);final double omega = 0.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67170);final double kx = 2;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67171);final double ky = 1;
        
        // Function values
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67172);TrivariateFunction f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67173);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67174);return a * FastMath.cos(omega * z - kx * x - ky * y);
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67175);double[][][] fval = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67176);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67177)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67178)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67179);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67180)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67181)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67182);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67183)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67184)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67185);fval[i][j][k] = f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}
        
        // Partial derivatives with respect to x
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67186);double[][][] dFdX = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67187);TrivariateFunction dFdX_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67188);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67189);return a * FastMath.sin(omega * z - kx * x - ky * y) * kx;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67190);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67191)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67192)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67193);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67194)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67195)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67196);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67197)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67198)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67199);dFdX[i][j][k] = dFdX_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}
            
        // Partial derivatives with respect to y
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67200);double[][][] dFdY = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67201);TrivariateFunction dFdY_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67202);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67203);return a * FastMath.sin(omega * z - kx * x - ky * y) * ky;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67204);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67205)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67206)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67207);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67208)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67209)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67210);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67211)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67212)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67213);dFdY[i][j][k] = dFdY_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        // Partial derivatives with respect to z
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67214);double[][][] dFdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67215);TrivariateFunction dFdZ_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67216);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67217);return -a * FastMath.sin(omega * z - kx * x - ky * y) * omega;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67218);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67219)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67220)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67221);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67222)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67223)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67224);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67225)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67226)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67227);dFdZ[i][j][k] = dFdZ_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        // Partial second derivatives w.r.t. (x, y)
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67228);double[][][] d2FdXdY = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67229);TrivariateFunction d2FdXdY_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67230);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67231);return -a * FastMath.cos(omega * z - kx * x - ky * y) * kx * ky;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67232);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67233)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67234)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67235);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67236)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67237)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67238);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67239)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67240)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67241);d2FdXdY[i][j][k] = d2FdXdY_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        // Partial second derivatives w.r.t. (x, z)
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67242);double[][][] d2FdXdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67243);TrivariateFunction d2FdXdZ_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67244);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67245);return a * FastMath.cos(omega * z - kx * x - ky * y) * kx * omega;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67246);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67247)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67248)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67249);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67250)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67251)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67252);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67253)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67254)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67255);d2FdXdZ[i][j][k] = d2FdXdZ_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        // Partial second derivatives w.r.t. (y, z)
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67256);double[][][] d2FdYdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67257);TrivariateFunction d2FdYdZ_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67258);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67259);return a * FastMath.cos(omega * z - kx * x - ky * y) * ky * omega;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67260);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67261)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67262)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67263);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67264)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67265)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67266);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67267)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67268)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67269);d2FdYdZ[i][j][k] = d2FdYdZ_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        // Partial third derivatives
        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67270);double[][][] d3FdXdYdZ = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67271);TrivariateFunction d3FdXdYdZ_f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fom1fomlb90pc2j.R.inc(67272);
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67273);return a * FastMath.sin(omega * z - kx * x - ky * y) * kx * ky * omega;
                }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
            };
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67274);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67275)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67276)==0&false)); i++) {{
            __CLR4_4_11fom1fomlb90pc2j.R.inc(67277);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67278)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67279)==0&false)); j++) {{
                __CLR4_4_11fom1fomlb90pc2j.R.inc(67280);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fom1fomlb90pc2j.R.iget(67281)!=0|true))||(__CLR4_4_11fom1fomlb90pc2j.R.iget(67282)==0&false)); k++) {{
                    __CLR4_4_11fom1fomlb90pc2j.R.inc(67283);d3FdXdYdZ[i][j][k] = d3FdXdYdZ_f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        }__CLR4_4_11fom1fomlb90pc2j.R.inc(67284);TrivariateFunction tcf = new TricubicSplineInterpolatingFunction(xval, yval, zval,
                                                                             fval, dFdX, dFdY, dFdZ,
                                                                             d2FdXdY, d2FdXdZ, d2FdYdZ,
                                                                             d3FdXdYdZ);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67285);double x, y, z;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67286);double expected, result;
        
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67287);x = 4;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67288);y = -3;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67289);z = 0;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67290);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67291);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67292);Assert.assertEquals("On sample point",
                            expected, result, 1e-14);

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67293);x = 4.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67294);y = -1.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67295);z = -4.25;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67296);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67297);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67298);Assert.assertEquals("Half-way between sample points (middle of the patch)",
                            expected, result, 0.1);

        __CLR4_4_11fom1fomlb90pc2j.R.inc(67299);x = 3.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67300);y = -3.5;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67301);z = -10;
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67302);expected = f.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67303);result = tcf.value(x, y, z);
        __CLR4_4_11fom1fomlb90pc2j.R.inc(67304);Assert.assertEquals("Half-way between sample points (border of the patch)",
                            expected, result, 0.1);
    }finally{__CLR4_4_11fom1fomlb90pc2j.R.flushNeeded();}}
}
