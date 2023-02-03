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

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for the "microsphere projection" interpolator.
 *
 * @version $Id$
 */
public final class MicrosphereInterpolatorTest {static class __CLR4_4_11ff31ff3lb90pc1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test of interpolator for a plane.
     * <p>
     * y = 2 x<sub>1</sub> - 3 x<sub>2</sub> + 5
     */
    @Test
    public void testLinearFunction2D() {__CLR4_4_11ff31ff3lb90pc1q.R.globalSliceStart(getClass().getName(),66639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrz85k1ff3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ff31ff3lb90pc1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ff31ff3lb90pc1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest.testLinearFunction2D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrz85k1ff3(){try{__CLR4_4_11ff31ff3lb90pc1q.R.inc(66639);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66640);MultivariateFunction f = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_11ff31ff3lb90pc1q.R.inc(66641);
                    __CLR4_4_11ff31ff3lb90pc1q.R.inc(66642);if ((((x.length != 2)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66643)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66644)==0&false))) {{
                        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66645);throw new IllegalArgumentException();
                    }
                    }__CLR4_4_11ff31ff3lb90pc1q.R.inc(66646);return 2 * x[0] - 3 * x[1] + 5;
                }finally{__CLR4_4_11ff31ff3lb90pc1q.R.flushNeeded();}}
            };

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66647);MultivariateInterpolator interpolator = new MicrosphereInterpolator();

        // Interpolating points in [-1, 1][-1, 1] by steps of 1.
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66648);final int n = 9;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66649);final int dim = 2;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66650);double[][] x = new double[n][dim];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66651);double[] y = new double[n];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66652);int index = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66653);for (int i = -1; (((i <= 1)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66654)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66655)==0&false)); i++) {{
            __CLR4_4_11ff31ff3lb90pc1q.R.inc(66656);for (int j = -1; (((j <= 1)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66657)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66658)==0&false)); j++) {{
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66659);x[index][0] = i;
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66660);x[index][1] = j;
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66661);y[index] = f.value(x[index]);
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66662);++index;
            }
        }}

        }__CLR4_4_11ff31ff3lb90pc1q.R.inc(66663);MultivariateFunction p = interpolator.interpolate(x, y);

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66664);double[] c = new double[dim];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66665);double expected, result;

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66666);c[0] = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66667);c[1] = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66668);expected = f.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66669);result = p.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66670);Assert.assertEquals("On sample point", expected, result, FastMath.ulp(1d));

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66671);c[0] = 0 + 1e-5;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66672);c[1] = 1 - 1e-5;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66673);expected = f.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66674);result = p.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66675);Assert.assertEquals("1e-5 away from sample point", expected, result, 1e-4);
    }finally{__CLR4_4_11ff31ff3lb90pc1q.R.flushNeeded();}}

    /**
     * Test of interpolator for a quadratic function.
     * <p>
     * y = 2 x<sub>1</sub><sup>2</sup> - 3 x<sub>2</sub><sup>2</sup>
     *     + 4 x<sub>1</sub> x<sub>2</sub> - 5
     */
    @Test
    public void testParaboloid2D() {__CLR4_4_11ff31ff3lb90pc1q.R.globalSliceStart(getClass().getName(),66676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya4gfq1fg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ff31ff3lb90pc1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ff31ff3lb90pc1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest.testParaboloid2D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya4gfq1fg4(){try{__CLR4_4_11ff31ff3lb90pc1q.R.inc(66676);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66677);MultivariateFunction f = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_11ff31ff3lb90pc1q.R.inc(66678);
                    __CLR4_4_11ff31ff3lb90pc1q.R.inc(66679);if ((((x.length != 2)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66680)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66681)==0&false))) {{
                        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66682);throw new IllegalArgumentException();
                    }
                    }__CLR4_4_11ff31ff3lb90pc1q.R.inc(66683);return 2 * x[0] * x[0] - 3 * x[1] * x[1] + 4 * x[0] * x[1] - 5;
                }finally{__CLR4_4_11ff31ff3lb90pc1q.R.flushNeeded();}}
            };

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66684);MultivariateInterpolator interpolator = new MicrosphereInterpolator();

        // Interpolating points in [-10, 10][-10, 10] by steps of 2.
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66685);final int n = 121;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66686);final int dim = 2;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66687);double[][] x = new double[n][dim];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66688);double[] y = new double[n];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66689);int index = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66690);for (int i = -10; (((i <= 10)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66691)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66692)==0&false)); i += 2) {{
            __CLR4_4_11ff31ff3lb90pc1q.R.inc(66693);for (int j = -10; (((j <= 10)&&(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66694)!=0|true))||(__CLR4_4_11ff31ff3lb90pc1q.R.iget(66695)==0&false)); j += 2) {{
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66696);x[index][0] = i;
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66697);x[index][1] = j;
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66698);y[index] = f.value(x[index]);
                __CLR4_4_11ff31ff3lb90pc1q.R.inc(66699);++index;
            }
        }}

        }__CLR4_4_11ff31ff3lb90pc1q.R.inc(66700);MultivariateFunction p = interpolator.interpolate(x, y);

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66701);double[] c = new double[dim];
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66702);double expected, result;

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66703);c[0] = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66704);c[1] = 0;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66705);expected = f.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66706);result = p.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66707);Assert.assertEquals("On sample point", expected, result, FastMath.ulp(1d));

        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66708);c[0] = 2 + 1e-5;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66709);c[1] = 2 - 1e-5;
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66710);expected = f.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66711);result = p.value(c);
        __CLR4_4_11ff31ff3lb90pc1q.R.inc(66712);Assert.assertEquals("1e-5 away from sample point", expected, result, 1e-3);
    }finally{__CLR4_4_11ff31ff3lb90pc1q.R.flushNeeded();}}
}
