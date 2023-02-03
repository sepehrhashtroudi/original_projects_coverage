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
import org.apache.commons.math3.analysis.BivariateFunction;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for the bicubic interpolator.
 * 
 * @version $Id$
 */
public final class BicubicSplineInterpolatorTest {static class __CLR4_4_11eu41eu4lb90pc0l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test preconditions.
     */
    @Test
    public void testPreconditions() {__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceStart(getClass().getName(),65884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01eu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eu41eu4lb90pc0l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01eu4(){try{__CLR4_4_11eu41eu4lb90pc0l.R.inc(65884);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65885);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65886);double[] yval = new double[] {-4, -3, -1, 2.5};
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65887);double[][] zval = new double[xval.length][yval.length];

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65888);BivariateGridInterpolator interpolator = new BicubicSplineInterpolator();
        
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65889);@SuppressWarnings("unused")
        BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65890);double[] wxval = new double[] {3, 2, 5, 6.5};
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65891);try {
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65892);p = interpolator.interpolate(wxval, yval, zval);
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65893);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65894);double[] wyval = new double[] {-4, -3, -1, -1};
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65895);try {
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65896);p = interpolator.interpolate(xval, wyval, zval);
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65897);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65898);double[][] wzval = new double[xval.length][yval.length + 1];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65899);try {
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65900);p = interpolator.interpolate(xval, yval, wzval);
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65901);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65902);wzval = new double[xval.length - 1][yval.length];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65903);try {
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65904);p = interpolator.interpolate(xval, yval, wzval);
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65905);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }finally{__CLR4_4_11eu41eu4lb90pc0l.R.flushNeeded();}}

    /**
     * Interpolating a plane.
     * <p>
     * z = 2 x - 3 y + 5
     */
    @Test
    public void testInterpolation1() {__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceStart(getClass().getName(),65906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar047u1euq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eu41eu4lb90pc0l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest.testInterpolation1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar047u1euq(){try{__CLR4_4_11eu41eu4lb90pc0l.R.inc(65906);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65907);final int sz = 21;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65908);double[] xval = new double[sz];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65909);double[] yval = new double[sz];
        // Coordinate values
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65910);final double delta = 1d / (sz - 1);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65911);for (int i = 0; (((i < sz)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65912)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65913)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65914);xval[i] = -1 + 15 * i * delta;
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65915);yval[i] = -20 + 30 * i * delta;
        }

        // Function values
        }__CLR4_4_11eu41eu4lb90pc0l.R.inc(65916);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11eu41eu4lb90pc0l.R.inc(65917);
                    __CLR4_4_11eu41eu4lb90pc0l.R.inc(65918);return 2 * x - 3 * y + 5;
                }finally{__CLR4_4_11eu41eu4lb90pc0l.R.flushNeeded();}}
            };
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65919);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65920);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65921)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65922)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65923);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65924)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65925)==0&false)); j++) {{
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65926);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}

        }__CLR4_4_11eu41eu4lb90pc0l.R.inc(65927);BivariateGridInterpolator interpolator = new BicubicSplineInterpolator();
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65928);BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65929);double x, y;

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65930);final RandomGenerator rng = new Well19937c(1234567L); // "tol" depends on the seed.
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65931);final UniformRealDistribution distX
            = new UniformRealDistribution(rng, xval[0], xval[xval.length - 1]);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65932);final UniformRealDistribution distY
            = new UniformRealDistribution(rng, yval[0], yval[yval.length - 1]);

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65933);final int numSamples = 50;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65934);final double tol = 6;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65935);for (int i = 0; (((i < numSamples)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65936)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65937)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65938);x = distX.sample();
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65939);for (int j = 0; (((j < numSamples)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65940)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65941)==0&false)); j++) {{
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65942);y = distY.sample();
//                 System.out.println(x + " " + y + " " + f.value(x, y) + " " + p.value(x, y));
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65943);Assert.assertEquals(f.value(x, y),  p.value(x, y), tol);
            }
//             System.out.println();
        }}
    }}finally{__CLR4_4_11eu41eu4lb90pc0l.R.flushNeeded();}}

    /**
     * Interpolating a paraboloid.
     * <p>
     * z = 2 x<sup>2</sup> - 3 y<sup>2</sup> + 4 x y - 5
     */
    @Test
    public void testInterpolation2() {__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceStart(getClass().getName(),65944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i05fd1evs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eu41eu4lb90pc0l.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eu41eu4lb90pc0l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest.testInterpolation2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i05fd1evs(){try{__CLR4_4_11eu41eu4lb90pc0l.R.inc(65944);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65945);final int sz = 21;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65946);double[] xval = new double[sz];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65947);double[] yval = new double[sz];
        // Coordinate values
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65948);final double delta = 1d / (sz - 1);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65949);for (int i = 0; (((i < sz)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65950)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65951)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65952);xval[i] = -1 + 15 * i * delta;
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65953);yval[i] = -20 + 30 * i * delta;
        }

        // Function values
        }__CLR4_4_11eu41eu4lb90pc0l.R.inc(65954);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11eu41eu4lb90pc0l.R.inc(65955);
                    __CLR4_4_11eu41eu4lb90pc0l.R.inc(65956);return 2 * x * x - 3 * y * y + 4 * x * y - 5;
                }finally{__CLR4_4_11eu41eu4lb90pc0l.R.flushNeeded();}}
            };
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65957);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65958);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65959)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65960)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65961);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65962)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65963)==0&false)); j++) {{
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65964);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}

        }__CLR4_4_11eu41eu4lb90pc0l.R.inc(65965);BivariateGridInterpolator interpolator = new BicubicSplineInterpolator();
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65966);BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65967);double x, y;

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65968);final RandomGenerator rng = new Well19937c(1234567L); // "tol" depends on the seed.
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65969);final UniformRealDistribution distX
            = new UniformRealDistribution(rng, xval[0], xval[xval.length - 1]);
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65970);final UniformRealDistribution distY
            = new UniformRealDistribution(rng, yval[0], yval[yval.length - 1]);

        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65971);final int numSamples = 50;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65972);final double tol = 251;
        __CLR4_4_11eu41eu4lb90pc0l.R.inc(65973);for (int i = 0; (((i < numSamples)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65974)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65975)==0&false)); i++) {{
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65976);x = distX.sample();
            __CLR4_4_11eu41eu4lb90pc0l.R.inc(65977);for (int j = 0; (((j < numSamples)&&(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65978)!=0|true))||(__CLR4_4_11eu41eu4lb90pc0l.R.iget(65979)==0&false)); j++) {{
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65980);y = distY.sample();
//                 System.out.println(x + " " + y + " " + f.value(x, y) + " " + p.value(x, y));
                __CLR4_4_11eu41eu4lb90pc0l.R.inc(65981);Assert.assertEquals(f.value(x, y),  p.value(x, y), tol);
            }
//             System.out.println();
        }}
    }}finally{__CLR4_4_11eu41eu4lb90pc0l.R.flushNeeded();}}
}
