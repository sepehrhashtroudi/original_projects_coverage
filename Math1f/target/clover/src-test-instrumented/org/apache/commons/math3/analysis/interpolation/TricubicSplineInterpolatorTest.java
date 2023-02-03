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
import org.junit.Ignore;

/**
 * Test case for the tricubic interpolator.
 * 
 * @version $Id$
 */
public final class TricubicSplineInterpolatorTest {static class __CLR4_4_11fxl1fxllb90pc2p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test preconditions.
     */
    @Test
    public void testPreconditions() {__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceStart(getClass().getName(),67305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01fxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fxl1fxllb90pc2p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01fxl(){try{__CLR4_4_11fxl1fxllb90pc2p.R.inc(67305);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67306);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67307);double[] yval = new double[] {-4, -3, -1, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67308);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67309);double[][][] fval = new double[xval.length][yval.length][zval.length];

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67310);TrivariateGridInterpolator interpolator = new TricubicSplineInterpolator();
        
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67311);@SuppressWarnings("unused")
        TrivariateFunction p = interpolator.interpolate(xval, yval, zval, fval);
        
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67312);double[] wxval = new double[] {3, 2, 5, 6.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67313);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67314);p = interpolator.interpolate(wxval, yval, zval, fval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67315);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67316);double[] wyval = new double[] {-4, -3, -1, -1};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67317);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67318);p = interpolator.interpolate(xval, wyval, zval, fval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67319);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67320);double[] wzval = new double[] {-12, -8, -5.5, -3, -4, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67321);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67322);p = interpolator.interpolate(xval, yval, wzval, fval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67323);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67324);double[][][] wfval = new double[xval.length][yval.length + 1][zval.length];
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67325);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67326);p = interpolator.interpolate(xval, yval, zval, wfval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67327);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67328);wfval = new double[xval.length - 1][yval.length][zval.length];
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67329);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67330);p = interpolator.interpolate(xval, yval, zval, wfval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67331);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67332);wfval = new double[xval.length][yval.length][zval.length - 1];
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67333);try {
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67334);p = interpolator.interpolate(xval, yval, zval, wfval);
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67335);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }finally{__CLR4_4_11fxl1fxllb90pc2p.R.flushNeeded();}}

    /**
     * Test of interpolator for a plane.
     * <p>
     * f(x, y, z) = 2 x - 3 y - z + 5
     */
    @Ignore@Test
    public void testPlane() {__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceStart(getClass().getName(),67336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaagi71fyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fxl1fxllb90pc2p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest.testPlane",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaagi71fyg(){try{__CLR4_4_11fxl1fxllb90pc2p.R.inc(67336);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67337);TrivariateFunction f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fxl1fxllb90pc2p.R.inc(67338);
                    __CLR4_4_11fxl1fxllb90pc2p.R.inc(67339);return 2 * x - 3 * y - z + 5;
                }finally{__CLR4_4_11fxl1fxllb90pc2p.R.flushNeeded();}}
            };

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67340);TrivariateGridInterpolator interpolator = new TricubicSplineInterpolator();

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67341);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67342);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67343);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67344);double[][][] fval = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67345);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67346)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67347)==0&false)); i++) {{
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67348);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67349)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67350)==0&false)); j++) {{
                __CLR4_4_11fxl1fxllb90pc2p.R.inc(67351);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67352)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67353)==0&false)); k++) {{
                    __CLR4_4_11fxl1fxllb90pc2p.R.inc(67354);fval[i][j][k] = f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        }__CLR4_4_11fxl1fxllb90pc2p.R.inc(67355);TrivariateFunction p = interpolator.interpolate(xval, yval, zval, fval);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67356);double x, y, z;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67357);double expected, result;
        
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67358);x = 4;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67359);y = -3;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67360);z = 0;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67361);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67362);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67363);Assert.assertEquals("On sample point", expected, result, 1e-15);

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67364);x = 4.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67365);y = -1.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67366);z = -4.25;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67367);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67368);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67369);Assert.assertEquals("half-way between sample points (middle of the patch)", expected, result, 0.3);

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67370);x = 3.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67371);y = -3.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67372);z = -10;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67373);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67374);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67375);Assert.assertEquals("half-way between sample points (border of the patch)", expected, result, 0.3);
    }finally{__CLR4_4_11fxl1fxllb90pc2p.R.flushNeeded();}}

    /**
     * Test of interpolator for a sine wave.
     * <p>
     * <p>
     *  f(x, y, z) = a cos [&omega; z - k<sub>y</sub> x - k<sub>y</sub> y]
     * </p>
     * with A = 0.2, &omega; = 0.5, k<sub>x</sub> = 2, k<sub>y</sub> = 1.
     */
    @Ignore@Test
    public void testWave() {__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceStart(getClass().getName(),67376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13eufe61fzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fxl1fxllb90pc2p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fxl1fxllb90pc2p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest.testWave",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13eufe61fzk(){try{__CLR4_4_11fxl1fxllb90pc2p.R.inc(67376);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67377);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67378);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67379);double[] zval = new double[] {-12, -8, -5.5, -3, 0, 4};

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67380);final double a = 0.2;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67381);final double omega = 0.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67382);final double kx = 2;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67383);final double ky = 1;

        // Function values
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67384);TrivariateFunction f = new TrivariateFunction() {
                public double value(double x, double y, double z) {try{__CLR4_4_11fxl1fxllb90pc2p.R.inc(67385);
                    __CLR4_4_11fxl1fxllb90pc2p.R.inc(67386);return a * FastMath.cos(omega * z - kx * x - ky * y);
                }finally{__CLR4_4_11fxl1fxllb90pc2p.R.flushNeeded();}}
            };
        
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67387);double[][][] fval = new double[xval.length][yval.length][zval.length];
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67388);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67389)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67390)==0&false)); i++) {{
            __CLR4_4_11fxl1fxllb90pc2p.R.inc(67391);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67392)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67393)==0&false)); j++) {{
                __CLR4_4_11fxl1fxllb90pc2p.R.inc(67394);for (int k = 0; (((k < zval.length)&&(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67395)!=0|true))||(__CLR4_4_11fxl1fxllb90pc2p.R.iget(67396)==0&false)); k++) {{
                    __CLR4_4_11fxl1fxllb90pc2p.R.inc(67397);fval[i][j][k] = f.value(xval[i], yval[j], zval[k]);
                }
            }}
        }}

        }__CLR4_4_11fxl1fxllb90pc2p.R.inc(67398);TrivariateGridInterpolator interpolator = new TricubicSplineInterpolator();

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67399);TrivariateFunction p = interpolator.interpolate(xval, yval, zval, fval);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67400);double x, y, z;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67401);double expected, result;
        
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67402);x = 4;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67403);y = -3;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67404);z = 0;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67405);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67406);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67407);Assert.assertEquals("On sample point",
                            expected, result, 1e-12);

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67408);x = 4.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67409);y = -1.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67410);z = -4.25;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67411);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67412);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67413);Assert.assertEquals("Half-way between sample points (middle of the patch)",
                            expected, result, 0.1);

        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67414);x = 3.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67415);y = -3.5;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67416);z = -10;
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67417);expected = f.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67418);result = p.value(x, y, z);
        __CLR4_4_11fxl1fxllb90pc2p.R.inc(67419);Assert.assertEquals("Half-way between sample points (border of the patch)",
                            expected, result, 0.1);
    }finally{__CLR4_4_11fxl1fxllb90pc2p.R.flushNeeded();}}
}
