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
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.analysis.BivariateFunction;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

/**
 * Test case for the bicubic function.
 * 
 * @version $Id$
 */
public final class BicubicSplineInterpolatingFunctionTest {static class __CLR4_4_11ehe1ehelb90pc0d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test preconditions.
     */
    @Test
    public void testPreconditions() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01ehe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01ehe(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65426);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65427);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65428);double[] yval = new double[] {-4, -3, -1, 2.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65429);double[][] zval = new double[xval.length][yval.length];

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65430);@SuppressWarnings("unused")
        BivariateFunction bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval,
                                                                           zval, zval, zval);
        
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65431);double[] wxval = new double[] {3, 2, 5, 6.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65432);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65433);bcf = new BicubicSplineInterpolatingFunction(wxval, yval, zval, zval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65434);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65435);double[] wyval = new double[] {-4, -1, -1, 2.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65436);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65437);bcf = new BicubicSplineInterpolatingFunction(xval, wyval, zval, zval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65438);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65439);double[][] wzval = new double[xval.length][yval.length - 1];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65440);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65441);bcf = new BicubicSplineInterpolatingFunction(xval, yval, wzval, zval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65442);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65443);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65444);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, wzval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65445);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65446);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65447);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, zval, wzval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65448);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65449);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65450);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, zval, zval, wzval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65451);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65452);wzval = new double[xval.length - 1][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65453);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65454);bcf = new BicubicSplineInterpolatingFunction(xval, yval, wzval, zval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65455);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65456);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65457);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, wzval, zval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65458);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65459);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65460);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, zval, wzval, zval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65461);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65462);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65463);bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval, zval, zval, wzval);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65464);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Test for a plane.
     * <p>
     * z = 2 x - 3 y + 5
     */
    @Ignore@Test
    public void testPlane() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaagi71eih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testPlane",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaagi71eih(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65465);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65466);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65467);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        // Function values
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65468);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65469);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65470);return 2 * x - 3 * y + 5;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65471);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65472);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65473)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65474)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65475);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65476)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65477)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65478);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65479);double[][] dZdX = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65480);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65481)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65482)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65483);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65484)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65485)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65486);dZdX[i][j] = 2;
            }
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65487);double[][] dZdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65488);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65489)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65490)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65491);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65492)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65493)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65494);dZdY[i][j] = -3;
            }
        }}
        // Partial cross-derivatives
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65495);double[][] dZdXdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65496);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65497)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65498)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65499);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65500)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65501)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65502);dZdXdY[i][j] = 0;
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65503);BivariateFunction bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval,
                                                                           dZdX, dZdY, dZdXdY);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65504);double x, y;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65505);double expected, result;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65506);x = 4;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65507);y = -3;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65508);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65509);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65510);Assert.assertEquals("On sample point",
                            expected, result, 1e-15);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65511);x = 4.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65512);y = -1.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65513);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65514);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65515);Assert.assertEquals("Half-way between sample points (middle of the patch)",
                            expected, result, 0.3);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65516);x = 3.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65517);y = -3.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65518);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65519);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65520);Assert.assertEquals("Half-way between sample points (border of the patch)",
                            expected, result, 0.3);
    }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Test for a paraboloid.
     * <p>
     * z = 2 x<sup>2</sup> - 3 y<sup>2</sup> + 4 x y - 5
     */
    @Ignore@Test
    public void testParaboloid() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ddva41ek1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testParaboloid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ddva41ek1(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65521);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65522);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65523);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        // Function values
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65524);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65525);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65526);return 2 * x * x - 3 * y * y + 4 * x * y - 5;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65527);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65528);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65529)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65530)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65531);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65532)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65533)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65534);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65535);double[][] dZdX = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65536);BivariateFunction dfdX = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65537);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65538);return 4 * (x + y);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65539);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65540)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65541)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65542);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65543)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65544)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65545);dZdX[i][j] = dfdX.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65546);double[][] dZdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65547);BivariateFunction dfdY = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65548);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65549);return 4 * x - 6 * y;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65550);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65551)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65552)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65553);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65554)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65555)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65556);dZdY[i][j] = dfdY.value(xval[i], yval[j]);
            }
        }}
        // Partial cross-derivatives
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65557);double[][] dZdXdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65558);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65559)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65560)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65561);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65562)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65563)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65564);dZdXdY[i][j] = 4;
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65565);BivariateFunction bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval,
                                                                           dZdX, dZdY, dZdXdY);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65566);double x, y;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65567);double expected, result;
        
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65568);x = 4;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65569);y = -3;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65570);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65571);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65572);Assert.assertEquals("On sample point",
                            expected, result, 1e-15);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65573);x = 4.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65574);y = -1.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65575);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65576);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65577);Assert.assertEquals("Half-way between sample points (middle of the patch)",
                            expected, result, 2);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65578);x = 3.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65579);y = -3.5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65580);expected = f.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65581);result = bcf.value(x, y);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65582);Assert.assertEquals("Half-way between sample points (border of the patch)",
                            expected, result, 2);
    }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Test for partial derivatives of {@link BicubicSplineFunction}.
     * <p>
     * f(x, y) = &Sigma;<sub>i</sub>&Sigma;<sub>j</sub> (i+1) (j+2) x<sup>i</sup> y<sup>j</sup>
     */
    @Ignore@Test
    public void testSplinePartialDerivatives() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfrred1elr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testSplinePartialDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfrred1elr(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65583);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65584);final int N = 4;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65585);final double[] coeff = new double[16];

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65586);for (int i = 0; (((i < N)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65587)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65588)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65589);for (int j = 0; (((j < N)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65590)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65591)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65592);coeff[i + N * j] = (i + 1) * (j + 2);
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65593);final BicubicSplineFunction f = new BicubicSplineFunction(coeff);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65594);BivariateFunction derivative;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65595);final double x = 0.435;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65596);final double y = 0.776;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65597);final double tol = 1e-13;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65598);derivative = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65599);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65600);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65601);final double y2 = y * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65602);final double y3 = y2 * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65603);final double yFactor = 2 + 3 * y + 4 * y2 + 5 * y3;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65604);return yFactor * (2 + 6 * x + 12 * x2);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65605);Assert.assertEquals("dFdX", derivative.value(x, y),
                            f.partialDerivativeX().value(x, y), tol);
        
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65606);derivative = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65607);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65608);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65609);final double x3 = x2 * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65610);final double y2 = y * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65611);final double xFactor = 1 + 2 * x + 3 * x2 + 4 * x3;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65612);return xFactor * (3 + 8 * y + 15 * y2);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65613);Assert.assertEquals("dFdY", derivative.value(x, y),
                            f.partialDerivativeY().value(x, y), tol);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65614);derivative = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65615);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65616);final double y2 = y * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65617);final double y3 = y2 * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65618);final double yFactor = 2 + 3 * y + 4 * y2 + 5 * y3;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65619);return yFactor * (6 + 24 * x);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65620);Assert.assertEquals("d2FdX2", derivative.value(x, y),
                            f.partialDerivativeXX().value(x, y), tol);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65621);derivative = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65622);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65623);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65624);final double x3 = x2 * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65625);final double xFactor = 1 + 2 * x + 3 * x2 + 4 * x3;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65626);return xFactor * (8 + 30 * y);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65627);Assert.assertEquals("d2FdY2", derivative.value(x, y),
                            f.partialDerivativeYY().value(x, y), tol);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65628);derivative = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65629);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65630);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65631);final double y2 = y * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65632);final double yFactor = 3 + 8 * y + 15 * y2;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65633);return yFactor * (2 + 6 * x + 12 * x2);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65634);Assert.assertEquals("d2FdXdY", derivative.value(x, y),
                            f.partialDerivativeXY().value(x, y), tol);
    }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Test that the partial derivatives computed from a
     * {@link BicubicSplineInterpolatingFunction} match the input data.
     * <p>
     * f(x, y) = 5
     *           - 3 x + 2 y
     *           - x y + 2 x<sup>2</sup> - 3 y<sup>2</sup>
     *           + 4 x<sup>2</sup> y - x y<sup>2</sup> - 3 x<sup>3</sup> + y<sup>3</sup>
     */
    @Ignore@Test
    public void testMatchingPartialDerivatives() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bilr51en7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testMatchingPartialDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bilr51en7(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65635);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65636);final int sz = 21;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65637);double[] val = new double[sz];
        // Coordinate values
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65638);final double delta = 1d / (sz - 1);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65639);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65640)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65641)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65642);val[i] = i * delta;
        }
        // Function values
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65643);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65644);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65645);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65646);final double x3 = x2 * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65647);final double y2 = y * y;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65648);final double y3 = y2 * y;

                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65649);return 5
                        - 3 * x + 2 * y
                        - x * y + 2 * x2 - 3 * y2
                        + 4 * x2 * y - x * y2 - 3 * x3 + y3;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65650);double[][] fval = new double[sz][sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65651);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65652)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65653)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65654);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65655)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65656)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65657);fval[i][j] = f.value(val[i], val[j]);
            }
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65658);double[][] dFdX = new double[sz][sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65659);BivariateFunction dfdX = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65660);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65661);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65662);final double y2 = y * y;                    
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65663);return - 3 - y + 4 * x + 8 * x * y - y2 - 9 * x2;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65664);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65665)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65666)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65667);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65668)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65669)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65670);dFdX[i][j] = dfdX.value(val[i], val[j]);
            }
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65671);double[][] dFdY = new double[sz][sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65672);BivariateFunction dfdY = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65673);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65674);final double x2 = x * x;
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65675);final double y2 = y * y;                    
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65676);return 2 - x - 6 * y + 4 * x2 - 2 * x * y + 3 * y2;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65677);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65678)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65679)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65680);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65681)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65682)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65683);dFdY[i][j] = dfdY.value(val[i], val[j]);
            }
        }}
        // Partial cross-derivatives
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65684);double[][] d2FdXdY = new double[sz][sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65685);BivariateFunction d2fdXdY = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65686);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65687);return -1 + 8 * x - 2 * y;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65688);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65689)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65690)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65691);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65692)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65693)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65694);d2FdXdY[i][j] = d2fdXdY.value(val[i], val[j]);
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65695);BicubicSplineInterpolatingFunction bcf
            = new BicubicSplineInterpolatingFunction(val, val, fval, dFdX, dFdY, d2FdXdY);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65696);double x, y;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65697);double expected, result;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65698);final double tol = 1e-12;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65699);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65700)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65701)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65702);x = val[i];
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65703);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65704)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65705)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65706);y = val[j];
                
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65707);expected = dfdX.value(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65708);result = bcf.partialDerivativeX(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65709);Assert.assertEquals(x + " " + y + " dFdX", expected, result, tol);

                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65710);expected = dfdY.value(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65711);result = bcf.partialDerivativeY(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65712);Assert.assertEquals(x + " " + y + " dFdY", expected, result, tol);
                
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65713);expected = d2fdXdY.value(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65714);result = bcf.partialDerivativeXY(x, y);
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65715);Assert.assertEquals(x + " " + y + " d2FdXdY", expected, result, tol);
            }
        }}
    }}finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Interpolating a plane.
     * <p>
     * z = 2 x - 3 y + 5
     */
    @Test
    public void testInterpolation1() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar047u1epg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testInterpolation1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar047u1epg(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65716);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65717);final int sz = 21;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65718);double[] xval = new double[sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65719);double[] yval = new double[sz];
        // Coordinate values
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65720);final double delta = 1d / (sz - 1);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65721);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65722)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65723)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65724);xval[i] = -1 + 15 * i * delta;
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65725);yval[i] = -20 + 30 * i * delta;
        }

        // Function values
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65726);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65727);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65728);return 2 * x - 3 * y + 5;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65729);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65730);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65731)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65732)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65733);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65734)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65735)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65736);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65737);double[][] dZdX = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65738);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65739)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65740)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65741);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65742)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65743)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65744);dZdX[i][j] = 2;
            }
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65745);double[][] dZdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65746);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65747)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65748)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65749);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65750)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65751)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65752);dZdY[i][j] = -3;
            }
        }}
        // Partial cross-derivatives
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65753);double[][] dZdXdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65754);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65755)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65756)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65757);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65758)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65759)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65760);dZdXdY[i][j] = 0;
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65761);final BivariateFunction bcf
            = new BicubicSplineInterpolatingFunction(xval, yval, zval,
                                                     dZdX, dZdY, dZdXdY);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65762);double x, y;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65763);final RandomGenerator rng = new Well19937c(1234567L); // "tol" depends on the seed.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65764);final UniformRealDistribution distX
            = new UniformRealDistribution(rng, xval[0], xval[xval.length - 1]);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65765);final UniformRealDistribution distY
            = new UniformRealDistribution(rng, yval[0], yval[yval.length - 1]);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65766);final int numSamples = 50;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65767);final double tol = 6;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65768);for (int i = 0; (((i < numSamples)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65769)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65770)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65771);x = distX.sample();
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65772);for (int j = 0; (((j < numSamples)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65773)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65774)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65775);y = distY.sample();
//                 System.out.println(x + " " + y + " " + f.value(x, y) + " " + bcf.value(x, y));
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65776);Assert.assertEquals(f.value(x, y),  bcf.value(x, y), tol);
            }
//             System.out.println();
        }}
    }}finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    /**
     * Interpolating a paraboloid.
     * <p>
     * z = 2 x<sup>2</sup> - 3 y<sup>2</sup> + 4 x y - 5
     */
    @Test
    public void testInterpolation2() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i05fd1er5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testInterpolation2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i05fd1er5(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65777);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65778);final int sz = 21;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65779);double[] xval = new double[sz];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65780);double[] yval = new double[sz];
        // Coordinate values
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65781);final double delta = 1d / (sz - 1);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65782);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65783)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65784)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65785);xval[i] = -1 + 15 * i * delta;
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65786);yval[i] = -20 + 30 * i * delta;
        }

        // Function values
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65787);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65788);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65789);return 2 * x * x - 3 * y * y + 4 * x * y - 5;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65790);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65791);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65792)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65793)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65794);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65795)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65796)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65797);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to x
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65798);double[][] dZdX = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65799);BivariateFunction dfdX = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65800);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65801);return 4 * (x + y);
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65802);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65803)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65804)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65805);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65806)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65807)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65808);dZdX[i][j] = dfdX.value(xval[i], yval[j]);
            }
        }}
        // Partial derivatives with respect to y
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65809);double[][] dZdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65810);BivariateFunction dfdY = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65811);
                    __CLR4_4_11ehe1ehelb90pc0d.R.inc(65812);return 4 * x - 6 * y;
                }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
            };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65813);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65814)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65815)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65816);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65817)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65818)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65819);dZdY[i][j] = dfdY.value(xval[i], yval[j]);
            }
        }}
        // Partial cross-derivatives
        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65820);double[][] dZdXdY = new double[xval.length][yval.length];
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65821);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65822)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65823)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65824);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65825)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65826)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65827);dZdXdY[i][j] = 4;
            }
        }}

        }__CLR4_4_11ehe1ehelb90pc0d.R.inc(65828);BivariateFunction bcf = new BicubicSplineInterpolatingFunction(xval, yval, zval,
                                                                       dZdX, dZdY, dZdXdY);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65829);double x, y;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65830);final RandomGenerator rng = new Well19937c(1234567L); // "tol" depends on the seed.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65831);final UniformRealDistribution distX
            = new UniformRealDistribution(rng, xval[0], xval[xval.length - 1]);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65832);final UniformRealDistribution distY
            = new UniformRealDistribution(rng, yval[0], yval[yval.length - 1]);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65833);final double tol = 224;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65834);double max = 0;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65835);for (int i = 0; (((i < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65836)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65837)==0&false)); i++) {{
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65838);x = distX.sample();
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65839);for (int j = 0; (((j < sz)&&(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65840)!=0|true))||(__CLR4_4_11ehe1ehelb90pc0d.R.iget(65841)==0&false)); j++) {{
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65842);y = distY.sample();
//                 System.out.println(x + " " + y + " " + f.value(x, y) + " " + bcf.value(x, y));
                __CLR4_4_11ehe1ehelb90pc0d.R.inc(65843);Assert.assertEquals(f.value(x, y),  bcf.value(x, y), tol);
            }
//             System.out.println();
        }}
    }}finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}

    @Test
    public void testIsValidPoint() {__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceStart(getClass().getName(),65844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vx8w91et0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ehe1ehelb90pc0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ehe1ehelb90pc0d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest.testIsValidPoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vx8w91et0(){try{__CLR4_4_11ehe1ehelb90pc0d.R.inc(65844);
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65845);final double xMin = -12;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65846);final double xMax = 34;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65847);final double yMin = 5;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65848);final double yMax = 67;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65849);final double[] xval = new double[] { xMin, xMax };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65850);final double[] yval = new double[] { yMin, yMax };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65851);final double[][] f = new double[][] { { 1, 2 },
                                              { 3, 4 } };
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65852);final double[][] dFdX = f;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65853);final double[][] dFdY = f;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65854);final double[][] dFdXdY = f;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65855);final BicubicSplineInterpolatingFunction bcf
            = new BicubicSplineInterpolatingFunction(xval, yval, f,
                                                     dFdX, dFdY, dFdXdY);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65856);double x, y;

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65857);x = xMin;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65858);y = yMin;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65859);Assert.assertTrue(bcf.isValidPoint(x, y));
        // Ensure that no exception is thrown.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65860);bcf.value(x, y);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65861);x = xMax;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65862);y = yMax;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65863);Assert.assertTrue(bcf.isValidPoint(x, y));
        // Ensure that no exception is thrown.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65864);bcf.value(x, y);
 
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65865);final double xRange = xMax - xMin;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65866);final double yRange = yMax - yMin;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65867);x = xMin + xRange / 3.4;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65868);y = yMin + yRange / 1.2;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65869);Assert.assertTrue(bcf.isValidPoint(x, y));
        // Ensure that no exception is thrown.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65870);bcf.value(x, y);

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65871);final double small = 1e-8;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65872);x = xMin - small;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65873);y = yMax;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65874);Assert.assertFalse(bcf.isValidPoint(x, y));
        // Ensure that an exception would have been thrown.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65875);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65876);bcf.value(x, y);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65877);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException expected) {}

        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65878);x = xMin;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65879);y = yMax + small;
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65880);Assert.assertFalse(bcf.isValidPoint(x, y));
        // Ensure that an exception would have been thrown.
        __CLR4_4_11ehe1ehelb90pc0d.R.inc(65881);try {
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65882);bcf.value(x, y);
            __CLR4_4_11ehe1ehelb90pc0d.R.inc(65883);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException expected) {}
    }finally{__CLR4_4_11ehe1ehelb90pc0d.R.flushNeeded();}}
}
