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

package org.apache.commons.math3.analysis.differentiation;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;


/**
 * Test for class {@link GradientFunction}.
 */
public class GradientFunctionTest {static class __CLR4_4_11dhp1dhplb90pbwd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test2DDistance() {__CLR4_4_11dhp1dhplb90pbwd.R.globalSliceStart(getClass().getName(),64141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edevmo1dhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dhp1dhplb90pbwd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dhp1dhplb90pbwd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.GradientFunctionTest.test2DDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edevmo1dhp(){try{__CLR4_4_11dhp1dhplb90pbwd.R.inc(64141);
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64142);EuclideanDistance f = new EuclideanDistance();
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64143);GradientFunction g = new GradientFunction(f);
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64144);for (double x = -10; (((x < 10)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64145)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64146)==0&false)); x += 0.5) {{
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64147);for (double y = -10; (((y < 10)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64148)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64149)==0&false)); y += 0.5) {{
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64150);double[] point = new double[] { x, y };
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64151);TestUtils.assertEquals(f.gradient(point), g.value(point), 1.0e-15);
            }
        }}
    }}finally{__CLR4_4_11dhp1dhplb90pbwd.R.flushNeeded();}}

    @Test
    public void test3DDistance() {__CLR4_4_11dhp1dhplb90pbwd.R.globalSliceStart(getClass().getName(),64152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sc6uan1di0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dhp1dhplb90pbwd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dhp1dhplb90pbwd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.GradientFunctionTest.test3DDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sc6uan1di0(){try{__CLR4_4_11dhp1dhplb90pbwd.R.inc(64152);
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64153);EuclideanDistance f = new EuclideanDistance();
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64154);GradientFunction g = new GradientFunction(f);
        __CLR4_4_11dhp1dhplb90pbwd.R.inc(64155);for (double x = -10; (((x < 10)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64156)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64157)==0&false)); x += 0.5) {{
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64158);for (double y = -10; (((y < 10)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64159)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64160)==0&false)); y += 0.5) {{
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64161);for (double z = -10; (((z < 10)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64162)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64163)==0&false)); z += 0.5) {{
                    __CLR4_4_11dhp1dhplb90pbwd.R.inc(64164);double[] point = new double[] { x, y, z };
                    __CLR4_4_11dhp1dhplb90pbwd.R.inc(64165);TestUtils.assertEquals(f.gradient(point), g.value(point), 1.0e-15);
                }
            }}
        }}
    }}finally{__CLR4_4_11dhp1dhplb90pbwd.R.flushNeeded();}}

    private static class EuclideanDistance implements MultivariateDifferentiableFunction {
        
        public double value(double[] point) {try{__CLR4_4_11dhp1dhplb90pbwd.R.inc(64166);
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64167);double d2 = 0;
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64168);for (double x : point) {{
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64169);d2 += x * x;
            }
            }__CLR4_4_11dhp1dhplb90pbwd.R.inc(64170);return FastMath.sqrt(d2);
        }finally{__CLR4_4_11dhp1dhplb90pbwd.R.flushNeeded();}}
        
        public DerivativeStructure value(DerivativeStructure[] point)
            throws DimensionMismatchException, MathIllegalArgumentException {try{__CLR4_4_11dhp1dhplb90pbwd.R.inc(64171);
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64172);DerivativeStructure d2 = point[0].getField().getZero();
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64173);for (DerivativeStructure x : point) {{
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64174);d2 = d2.add(x.multiply(x));
            }
            }__CLR4_4_11dhp1dhplb90pbwd.R.inc(64175);return d2.sqrt();
        }finally{__CLR4_4_11dhp1dhplb90pbwd.R.flushNeeded();}}

        public double[] gradient(double[] point) {try{__CLR4_4_11dhp1dhplb90pbwd.R.inc(64176);
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64177);double[] gradient = new double[point.length];
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64178);double d = value(point);
            __CLR4_4_11dhp1dhplb90pbwd.R.inc(64179);for (int i = 0; (((i < point.length)&&(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64180)!=0|true))||(__CLR4_4_11dhp1dhplb90pbwd.R.iget(64181)==0&false)); ++i) {{
                __CLR4_4_11dhp1dhplb90pbwd.R.inc(64182);gradient[i] = point[i] / d;
            }
            }__CLR4_4_11dhp1dhplb90pbwd.R.inc(64183);return gradient;
        }finally{__CLR4_4_11dhp1dhplb90pbwd.R.flushNeeded();}}

    }

}
