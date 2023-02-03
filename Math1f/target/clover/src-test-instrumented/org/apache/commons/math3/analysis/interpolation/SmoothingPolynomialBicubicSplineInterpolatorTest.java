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
import org.apache.commons.math3.analysis.BivariateFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for the smoothing bicubic interpolator.
 * 
 * @version $Id$
 */
public final class SmoothingPolynomialBicubicSplineInterpolatorTest {static class __CLR4_4_11fj71fj7lb90pc20{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test preconditions.
     */
    @Test
    public void testPreconditions() {__CLR4_4_11fj71fj7lb90pc20.R.globalSliceStart(getClass().getName(),66787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01fj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fj71fj7lb90pc20.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fj71fj7lb90pc20.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolatorTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01fj7(){try{__CLR4_4_11fj71fj7lb90pc20.R.inc(66787);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66788);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66789);double[] yval = new double[] {-4, -3, -1, 2.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66790);double[][] zval = new double[xval.length][yval.length];

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66791);BivariateGridInterpolator interpolator = new SmoothingPolynomialBicubicSplineInterpolator(0);
        
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66792);@SuppressWarnings("unused")
        BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66793);double[] wxval = new double[] {3, 2, 5, 6.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66794);try {
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66795);p = interpolator.interpolate(wxval, yval, zval);
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66796);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66797);double[] wyval = new double[] {-4, -3, -1, -1};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66798);try {
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66799);p = interpolator.interpolate(xval, wyval, zval);
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66800);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66801);double[][] wzval = new double[xval.length][yval.length + 1];
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66802);try {
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66803);p = interpolator.interpolate(xval, yval, wzval);
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66804);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66805);wzval = new double[xval.length - 1][yval.length];
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66806);try {
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66807);p = interpolator.interpolate(xval, yval, wzval);
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66808);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66809);wzval = new double[xval.length][yval.length - 1];
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66810);try {
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66811);p = interpolator.interpolate(xval, yval, wzval);
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66812);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }finally{__CLR4_4_11fj71fj7lb90pc20.R.flushNeeded();}}

    /**
     * Test of interpolator for a plane.
     * <p>
     * z = 2 x - 3 y + 5
     */
    @Test
    public void testPlane() {__CLR4_4_11fj71fj7lb90pc20.R.globalSliceStart(getClass().getName(),66813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaagi71fjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fj71fj7lb90pc20.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fj71fj7lb90pc20.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolatorTest.testPlane",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaagi71fjx(){try{__CLR4_4_11fj71fj7lb90pc20.R.inc(66813);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66814);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11fj71fj7lb90pc20.R.inc(66815);
                    __CLR4_4_11fj71fj7lb90pc20.R.inc(66816);return 2 * x - 3 * y + 5
                        + (((((int) (FastMath.abs(5 * x + 3 * y)) % 2 == 0 )&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66817)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66818)==0&false))? 1 : -1);
                }finally{__CLR4_4_11fj71fj7lb90pc20.R.flushNeeded();}}
            };

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66819);BivariateGridInterpolator interpolator = new SmoothingPolynomialBicubicSplineInterpolator(1);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66820);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66821);double[] yval = new double[] {-4, -3, -1, 2, 2.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66822);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66823);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66824)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66825)==0&false)); i++) {{
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66826);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66827)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66828)==0&false)); j++) {{
                __CLR4_4_11fj71fj7lb90pc20.R.inc(66829);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}

        }__CLR4_4_11fj71fj7lb90pc20.R.inc(66830);BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66831);double x, y;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66832);double expected, result;
        
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66833);x = 4;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66834);y = -3;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66835);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66836);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66837);Assert.assertEquals("On sample point", expected, result, 2);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66838);x = 4.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66839);y = -1.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66840);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66841);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66842);Assert.assertEquals("half-way between sample points (middle of the patch)", expected, result, 2);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66843);x = 3.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66844);y = -3.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66845);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66846);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66847);Assert.assertEquals("half-way between sample points (border of the patch)", expected, result, 2);
    }finally{__CLR4_4_11fj71fj7lb90pc20.R.flushNeeded();}}

    /**
     * Test of interpolator for a paraboloid.
     * <p>
     * z = 2 x<sup>2</sup> - 3 y<sup>2</sup> + 4 x y - 5
     */
    @Test
    public void testParaboloid() {__CLR4_4_11fj71fj7lb90pc20.R.globalSliceStart(getClass().getName(),66848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ddva41fkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11fj71fj7lb90pc20.R.rethrow($CLV_t2$);}finally{__CLR4_4_11fj71fj7lb90pc20.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolatorTest.testParaboloid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ddva41fkw(){try{__CLR4_4_11fj71fj7lb90pc20.R.inc(66848);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66849);BivariateFunction f = new BivariateFunction() {
                public double value(double x, double y) {try{__CLR4_4_11fj71fj7lb90pc20.R.inc(66850);
                    __CLR4_4_11fj71fj7lb90pc20.R.inc(66851);return 2 * x * x - 3 * y * y + 4 * x * y - 5
                        + (((((int) (FastMath.abs(5 * x + 3 * y)) % 2 == 0 )&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66852)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66853)==0&false))? 1 : -1);
                }finally{__CLR4_4_11fj71fj7lb90pc20.R.flushNeeded();}}
            };

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66854);BivariateGridInterpolator interpolator = new SmoothingPolynomialBicubicSplineInterpolator(4);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66855);double[] xval = new double[] {3, 4, 5, 6.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66856);double[] yval = new double[] {-4, -3, -2, -1, 0.5, 2.5};
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66857);double[][] zval = new double[xval.length][yval.length];
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66858);for (int i = 0; (((i < xval.length)&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66859)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66860)==0&false)); i++) {{
            __CLR4_4_11fj71fj7lb90pc20.R.inc(66861);for (int j = 0; (((j < yval.length)&&(__CLR4_4_11fj71fj7lb90pc20.R.iget(66862)!=0|true))||(__CLR4_4_11fj71fj7lb90pc20.R.iget(66863)==0&false)); j++) {{
                __CLR4_4_11fj71fj7lb90pc20.R.inc(66864);zval[i][j] = f.value(xval[i], yval[j]);
            }
        }}

        }__CLR4_4_11fj71fj7lb90pc20.R.inc(66865);BivariateFunction p = interpolator.interpolate(xval, yval, zval);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66866);double x, y;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66867);double expected, result;

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66868);x = 5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66869);y = 0.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66870);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66871);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66872);Assert.assertEquals("On sample point", expected, result, 2);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66873);x = 4.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66874);y = -1.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66875);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66876);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66877);Assert.assertEquals("half-way between sample points (middle of the patch)", expected, result, 2);

        __CLR4_4_11fj71fj7lb90pc20.R.inc(66878);x = 3.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66879);y = -3.5;
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66880);expected = f.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66881);result = p.value(x, y);
        __CLR4_4_11fj71fj7lb90pc20.R.inc(66882);Assert.assertEquals("half-way between sample points (border of the patch)", expected, result, 2);
    }finally{__CLR4_4_11fj71fj7lb90pc20.R.flushNeeded();}}
}
