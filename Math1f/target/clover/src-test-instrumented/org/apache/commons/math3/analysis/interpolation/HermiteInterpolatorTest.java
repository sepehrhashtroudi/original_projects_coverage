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

import java.util.Random;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class HermiteInterpolatorTest {static class __CLR4_4_11f481f48lb90pc1a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testZero() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i71f48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i71f48(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66248);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66249);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66250);interpolator.addSamplePoint(0.0, new double[] { 0.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66251);for (double x = -10; (((x < 10)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66252)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66253)==0&false)); x += 1.0) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66254);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 1, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66255);Assert.assertEquals(0.0, y.getValue(), 1.0e-15);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66256);Assert.assertEquals(0.0, y.getPartialDerivative(1), 1.0e-15);
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66257);checkPolynomial(new PolynomialFunction(new double[] { 0.0 }),
                        interpolator.getPolynomials()[0]);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testQuadratic() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssocod1f4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssocod1f4i(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66258);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66259);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66260);interpolator.addSamplePoint(0.0, new double[] { 2.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66261);interpolator.addSamplePoint(1.0, new double[] { 0.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66262);interpolator.addSamplePoint(2.0, new double[] { 0.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66263);for (double x = -10; (((x < 10)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66264)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66265)==0&false)); x += 1.0) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66266);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 1, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66267);Assert.assertEquals((x - 1.0) * (x - 2.0), y.getValue(), 1.0e-15);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66268);Assert.assertEquals(2 * x - 3.0, y.getPartialDerivative(1), 1.0e-15);
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66269);checkPolynomial(new PolynomialFunction(new double[] { 2.0, -3.0, 1.0 }),
                        interpolator.getPolynomials()[0]);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testMixedDerivatives() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfb8tm1f4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testMixedDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfb8tm1f4u(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66270);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66271);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66272);interpolator.addSamplePoint(0.0, new double[] { 1.0 }, new double[] { 2.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66273);interpolator.addSamplePoint(1.0, new double[] { 4.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66274);interpolator.addSamplePoint(2.0, new double[] { 5.0 }, new double[] { 2.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66275);Assert.assertEquals(4, interpolator.getPolynomials()[0].degree());
        __CLR4_4_11f481f48lb90pc1a.R.inc(66276);DerivativeStructure y0 = interpolator.value(new DerivativeStructure(1, 1, 0, 0.0))[0];
        __CLR4_4_11f481f48lb90pc1a.R.inc(66277);Assert.assertEquals(1.0, y0.getValue(), 1.0e-15);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66278);Assert.assertEquals(2.0, y0.getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66279);Assert.assertEquals(4.0, interpolator.value(1.0)[0], 1.0e-15);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66280);DerivativeStructure y2 = interpolator.value(new DerivativeStructure(1, 1, 0, 2.0))[0];
        __CLR4_4_11f481f48lb90pc1a.R.inc(66281);Assert.assertEquals(5.0, y2.getValue(), 1.0e-15);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66282);Assert.assertEquals(2.0, y2.getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66283);checkPolynomial(new PolynomialFunction(new double[] { 1.0, 2.0, 4.0, -4.0, 1.0 }),
                        interpolator.getPolynomials()[0]);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testRandomPolynomialsValuesOnly() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tw7we71f58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testRandomPolynomialsValuesOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tw7we71f58(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66284);

        __CLR4_4_11f481f48lb90pc1a.R.inc(66285);Random random = new Random(0x42b1e7dbd361a932l);

        __CLR4_4_11f481f48lb90pc1a.R.inc(66286);for (int i = 0; (((i < 100)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66287)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66288)==0&false)); ++i) {{

            __CLR4_4_11f481f48lb90pc1a.R.inc(66289);int maxDegree = 0;
            __CLR4_4_11f481f48lb90pc1a.R.inc(66290);PolynomialFunction[] p = new PolynomialFunction[5];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66291);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66292)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66293)==0&false)); ++k) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66294);int degree = random.nextInt(7);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66295);p[k] = randomPolynomial(degree, random);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66296);maxDegree = FastMath.max(maxDegree, degree);
            }

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66297);HermiteInterpolator interpolator = new HermiteInterpolator();
            __CLR4_4_11f481f48lb90pc1a.R.inc(66298);for (int j = 0; (((j < 1 + maxDegree)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66299)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66300)==0&false)); ++j) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66301);double x = 0.1 * j;
                __CLR4_4_11f481f48lb90pc1a.R.inc(66302);double[] values = new double[p.length];
                __CLR4_4_11f481f48lb90pc1a.R.inc(66303);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66304)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66305)==0&false)); ++k) {{
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66306);values[k] = p[k].value(x);
                }
                }__CLR4_4_11f481f48lb90pc1a.R.inc(66307);interpolator.addSamplePoint(x, values);
            }

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66308);for (double x = 0; (((x < 2)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66309)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66310)==0&false)); x += 0.1) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66311);double[] values = interpolator.value(x);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66312);Assert.assertEquals(p.length, values.length);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66313);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66314)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66315)==0&false)); ++k) {{
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66316);Assert.assertEquals(p[k].value(x), values[k], 1.0e-8 * FastMath.abs(p[k].value(x)));
                }
            }}

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66317);PolynomialFunction[] result = interpolator.getPolynomials();
            __CLR4_4_11f481f48lb90pc1a.R.inc(66318);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66319)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66320)==0&false)); ++k) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66321);checkPolynomial(p[k], result[k]);
            }

        }}
    }}finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testRandomPolynomialsFirstDerivative() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pv6441f6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testRandomPolynomialsFirstDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pv6441f6a(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66322);

        __CLR4_4_11f481f48lb90pc1a.R.inc(66323);Random random = new Random(0x570803c982ca5d3bl);

        __CLR4_4_11f481f48lb90pc1a.R.inc(66324);for (int i = 0; (((i < 100)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66325)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66326)==0&false)); ++i) {{

            __CLR4_4_11f481f48lb90pc1a.R.inc(66327);int maxDegree = 0;
            __CLR4_4_11f481f48lb90pc1a.R.inc(66328);PolynomialFunction[] p      = new PolynomialFunction[5];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66329);PolynomialFunction[] pPrime = new PolynomialFunction[5];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66330);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66331)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66332)==0&false)); ++k) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66333);int degree = random.nextInt(7);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66334);p[k]      = randomPolynomial(degree, random);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66335);pPrime[k] = p[k].polynomialDerivative();
                __CLR4_4_11f481f48lb90pc1a.R.inc(66336);maxDegree = FastMath.max(maxDegree, degree);
            }

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66337);HermiteInterpolator interpolator = new HermiteInterpolator();
            __CLR4_4_11f481f48lb90pc1a.R.inc(66338);for (int j = 0; (((j < 1 + maxDegree / 2)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66339)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66340)==0&false)); ++j) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66341);double x = 0.1 * j;
                __CLR4_4_11f481f48lb90pc1a.R.inc(66342);double[] values      = new double[p.length];
                __CLR4_4_11f481f48lb90pc1a.R.inc(66343);double[] derivatives = new double[p.length];
                __CLR4_4_11f481f48lb90pc1a.R.inc(66344);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66345)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66346)==0&false)); ++k) {{
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66347);values[k]      = p[k].value(x);
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66348);derivatives[k] = pPrime[k].value(x);
                }
                }__CLR4_4_11f481f48lb90pc1a.R.inc(66349);interpolator.addSamplePoint(x, values, derivatives);
            }

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66350);for (double x = 0; (((x < 2)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66351)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66352)==0&false)); x += 0.1) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66353);DerivativeStructure[] y = interpolator.value(new DerivativeStructure(1, 1, 0, x));
                __CLR4_4_11f481f48lb90pc1a.R.inc(66354);Assert.assertEquals(p.length, y.length);
                __CLR4_4_11f481f48lb90pc1a.R.inc(66355);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66356)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66357)==0&false)); ++k) {{
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66358);Assert.assertEquals(p[k].value(x), y[k].getValue(), 1.0e-8 * FastMath.abs(p[k].value(x)));
                    __CLR4_4_11f481f48lb90pc1a.R.inc(66359);Assert.assertEquals(pPrime[k].value(x), y[k].getPartialDerivative(1), 4.0e-8 * FastMath.abs(p[k].value(x)));
                }
            }}

            }__CLR4_4_11f481f48lb90pc1a.R.inc(66360);PolynomialFunction[] result = interpolator.getPolynomials();
            __CLR4_4_11f481f48lb90pc1a.R.inc(66361);for (int k = 0; (((k < p.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66362)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66363)==0&false)); ++k) {{
                __CLR4_4_11f481f48lb90pc1a.R.inc(66364);checkPolynomial(p[k], result[k]);
            }

        }}
    }}finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testSine() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h6gfa1f7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testSine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h6gfa1f7h(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66365);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66366);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66367);for (double x = 0; (((x < FastMath.PI)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66368)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66369)==0&false)); x += 0.5) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66370);interpolator.addSamplePoint(x, new double[] { FastMath.sin(x) });
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66371);for (double x = 0.1; (((x <= 2.9)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66372)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66373)==0&false)); x += 0.01) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66374);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 2, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66375);Assert.assertEquals( FastMath.sin(x), y.getValue(), 3.5e-5);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66376);Assert.assertEquals( FastMath.cos(x), y.getPartialDerivative(1), 1.3e-4);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66377);Assert.assertEquals(-FastMath.sin(x), y.getPartialDerivative(2), 2.9e-3);
        }
    }}finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testSquareRoot() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113gf0o1f7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testSquareRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113gf0o1f7u(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66378);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66379);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66380);for (double x = 1.0; (((x < 3.6)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66381)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66382)==0&false)); x += 0.5) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66383);interpolator.addSamplePoint(x, new double[] { FastMath.sqrt(x) });
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66384);for (double x = 1.1; (((x < 3.5)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66385)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66386)==0&false)); x += 0.01) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66387);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 1, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66388);Assert.assertEquals(FastMath.sqrt(x), y.getValue(), 1.5e-4);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66389);Assert.assertEquals(0.5 / FastMath.sqrt(x), y.getPartialDerivative(1), 8.5e-4);
        }
    }}finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testWikipedia() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9sooc1f86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testWikipedia",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9sooc1f86(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66390);
        // this test corresponds to the example from Wikipedia page:
        // http://en.wikipedia.org/wiki/Hermite_interpolation
        __CLR4_4_11f481f48lb90pc1a.R.inc(66391);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66392);interpolator.addSamplePoint(-1, new double[] { 2 }, new double[] { -8 }, new double[] { 56 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66393);interpolator.addSamplePoint( 0, new double[] { 1 }, new double[] {  0 }, new double[] {  0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66394);interpolator.addSamplePoint( 1, new double[] { 2 }, new double[] {  8 }, new double[] { 56 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66395);for (double x = -1.0; (((x <= 1.0)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66396)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66397)==0&false)); x += 0.125) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66398);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 1, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66399);double x2 = x * x;
            __CLR4_4_11f481f48lb90pc1a.R.inc(66400);double x4 = x2 * x2;
            __CLR4_4_11f481f48lb90pc1a.R.inc(66401);double x8 = x4 * x4;
            __CLR4_4_11f481f48lb90pc1a.R.inc(66402);Assert.assertEquals(x8 + 1, y.getValue(), 1.0e-15);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66403);Assert.assertEquals(8 * x4 * x2 * x, y.getPartialDerivative(1), 1.0e-15);
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66404);checkPolynomial(new PolynomialFunction(new double[] { 1, 0, 0, 0, 0, 0, 0, 0, 1 }),
                        interpolator.getPolynomials()[0]);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test
    public void testOnePointParabola() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdatfp1f8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testOnePointParabola",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdatfp1f8l(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66405);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66406);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66407);interpolator.addSamplePoint(0, new double[] { 1 }, new double[] { 1 }, new double[] { 2 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66408);for (double x = -1.0; (((x <= 1.0)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66409)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66410)==0&false)); x += 0.125) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66411);DerivativeStructure y = interpolator.value(new DerivativeStructure(1, 1, 0, x))[0];
            __CLR4_4_11f481f48lb90pc1a.R.inc(66412);Assert.assertEquals(1 + x * (1 + x), y.getValue(), 1.0e-15);
            __CLR4_4_11f481f48lb90pc1a.R.inc(66413);Assert.assertEquals(1 + 2 * x, y.getPartialDerivative(1), 1.0e-15);
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66414);checkPolynomial(new PolynomialFunction(new double[] { 1, 1, 1 }),
                        interpolator.getPolynomials()[0]);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    private PolynomialFunction randomPolynomial(int degree, Random random) {try{__CLR4_4_11f481f48lb90pc1a.R.inc(66415);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66416);double[] coeff = new double[ 1 + degree];
        __CLR4_4_11f481f48lb90pc1a.R.inc(66417);for (int j = 0; (((j < degree)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66418)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66419)==0&false)); ++j) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66420);coeff[j] = random.nextDouble();
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66421);return new PolynomialFunction(coeff);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testEmptySample() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swpotw1f92();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,109,112,116,121,83,97,109,112,108,101,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testEmptySample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swpotw1f92(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66422);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66423);new HermiteInterpolator().value(0.0);
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testDuplicatedAbscissa() {__CLR4_4_11f481f48lb90pc1a.R.globalSliceStart(getClass().getName(),66424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bugj231f94();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,117,112,108,105,99,97,116,101,100,65,98,115,99,105,115,115,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f481f48lb90pc1a.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f481f48lb90pc1a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest.testDuplicatedAbscissa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bugj231f94(){try{__CLR4_4_11f481f48lb90pc1a.R.inc(66424);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66425);HermiteInterpolator interpolator = new HermiteInterpolator();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66426);interpolator.addSamplePoint(1.0, new double[] { 0.0 });
        __CLR4_4_11f481f48lb90pc1a.R.inc(66427);interpolator.addSamplePoint(1.0, new double[] { 1.0 });
    }finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

    private void checkPolynomial(PolynomialFunction expected, PolynomialFunction result) {try{__CLR4_4_11f481f48lb90pc1a.R.inc(66428);
        __CLR4_4_11f481f48lb90pc1a.R.inc(66429);Assert.assertTrue(result.degree() >= expected.degree());
        __CLR4_4_11f481f48lb90pc1a.R.inc(66430);double[] cE = expected.getCoefficients();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66431);double[] cR = result.getCoefficients();
        __CLR4_4_11f481f48lb90pc1a.R.inc(66432);for (int i = 0; (((i < cE.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66433)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66434)==0&false)); ++i) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66435);Assert.assertEquals(cE[i], cR[i], 1.0e-8 * FastMath.abs(cE[i]));
        }
        }__CLR4_4_11f481f48lb90pc1a.R.inc(66436);for (int i = cE.length; (((i < cR.length)&&(__CLR4_4_11f481f48lb90pc1a.R.iget(66437)!=0|true))||(__CLR4_4_11f481f48lb90pc1a.R.iget(66438)==0&false)); ++i) {{
            __CLR4_4_11f481f48lb90pc1a.R.inc(66439);Assert.assertEquals(0.0, cR[i], 1.0e-9);
        }
    }}finally{__CLR4_4_11f481f48lb90pc1a.R.flushNeeded();}}

}

