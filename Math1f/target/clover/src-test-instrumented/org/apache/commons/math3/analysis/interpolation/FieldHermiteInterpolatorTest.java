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

import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class FieldHermiteInterpolatorTest {static class __CLR4_4_11eyw1eywlb90pc0z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testZero() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i71eyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i71eyw(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66056);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66057);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66058);interpolator.addSamplePoint(new BigFraction(0), new BigFraction[] { new BigFraction(0) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66059);for (int x = -10; (((x < 10)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66060)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66061)==0&false)); x++) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66062);BigFraction y = interpolator.value(new BigFraction(x))[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66063);Assert.assertEquals(BigFraction.ZERO, y);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66064);BigFraction[][] derivatives = interpolator.derivatives(new BigFraction(x), 1);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66065);Assert.assertEquals(BigFraction.ZERO, derivatives[0][0]);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66066);Assert.assertEquals(BigFraction.ZERO, derivatives[1][0]);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testQuadratic() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssocod1ez7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssocod1ez7(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66067);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66068);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66069);interpolator.addSamplePoint(new BigFraction(0), new BigFraction[] { new BigFraction(2) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66070);interpolator.addSamplePoint(new BigFraction(1), new BigFraction[] { new BigFraction(0) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66071);interpolator.addSamplePoint(new BigFraction(2), new BigFraction[] { new BigFraction(0) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66072);for (double x = -10; (((x < 10)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66073)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66074)==0&false)); x += 1.0) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66075);BigFraction y = interpolator.value(new BigFraction(x))[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66076);Assert.assertEquals((x - 1) * (x - 2), y.doubleValue(), 1.0e-15);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66077);BigFraction[][] derivatives = interpolator.derivatives(new BigFraction(x), 3);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66078);Assert.assertEquals((x - 1) * (x - 2), derivatives[0][0].doubleValue(), 1.0e-15);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66079);Assert.assertEquals(2 * x - 3, derivatives[1][0].doubleValue(), 1.0e-15);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66080);Assert.assertEquals(2, derivatives[2][0].doubleValue(), 1.0e-15);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66081);Assert.assertEquals(0, derivatives[3][0].doubleValue(), 1.0e-15);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testMixedDerivatives() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfb8tm1ezm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testMixedDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfb8tm1ezm(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66082);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66083);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66084);interpolator.addSamplePoint(new BigFraction(0), new BigFraction[] { new BigFraction(1) }, new BigFraction[] { new BigFraction(2) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66085);interpolator.addSamplePoint(new BigFraction(1), new BigFraction[] { new BigFraction(4) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66086);interpolator.addSamplePoint(new BigFraction(2), new BigFraction[] { new BigFraction(5) }, new BigFraction[] { new BigFraction(2) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66087);BigFraction[][] derivatives = interpolator.derivatives(new BigFraction(0), 5);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66088);Assert.assertEquals(new BigFraction(  1), derivatives[0][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66089);Assert.assertEquals(new BigFraction(  2), derivatives[1][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66090);Assert.assertEquals(new BigFraction(  8), derivatives[2][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66091);Assert.assertEquals(new BigFraction(-24), derivatives[3][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66092);Assert.assertEquals(new BigFraction( 24), derivatives[4][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66093);Assert.assertEquals(new BigFraction(  0), derivatives[5][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66094);derivatives = interpolator.derivatives(new BigFraction(1), 5);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66095);Assert.assertEquals(new BigFraction(  4), derivatives[0][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66096);Assert.assertEquals(new BigFraction(  2), derivatives[1][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66097);Assert.assertEquals(new BigFraction( -4), derivatives[2][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66098);Assert.assertEquals(new BigFraction(  0), derivatives[3][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66099);Assert.assertEquals(new BigFraction( 24), derivatives[4][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66100);Assert.assertEquals(new BigFraction(  0), derivatives[5][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66101);derivatives = interpolator.derivatives(new BigFraction(2), 5);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66102);Assert.assertEquals(new BigFraction(  5), derivatives[0][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66103);Assert.assertEquals(new BigFraction(  2), derivatives[1][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66104);Assert.assertEquals(new BigFraction(  8), derivatives[2][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66105);Assert.assertEquals(new BigFraction( 24), derivatives[3][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66106);Assert.assertEquals(new BigFraction( 24), derivatives[4][0]);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66107);Assert.assertEquals(new BigFraction(  0), derivatives[5][0]);
    }finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testRandomPolynomialsValuesOnly() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tw7we71f0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testRandomPolynomialsValuesOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tw7we71f0c(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66108);

        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66109);Random random = new Random(0x42b1e7dbd361a932l);

        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66110);for (int i = 0; (((i < 100)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66111)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66112)==0&false)); ++i) {{

            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66113);int maxDegree = 0;
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66114);PolynomialFunction[] p = new PolynomialFunction[5];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66115);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66116)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66117)==0&false)); ++k) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66118);int degree = random.nextInt(7);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66119);p[k] = randomPolynomial(degree, random);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66120);maxDegree = FastMath.max(maxDegree, degree);
            }

            }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66121);DfpField field = new DfpField(30);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66122);Dfp step = field.getOne().divide(field.newDfp(10));
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66123);FieldHermiteInterpolator<Dfp> interpolator = new FieldHermiteInterpolator<Dfp>();
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66124);for (int j = 0; (((j < 1 + maxDegree)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66125)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66126)==0&false)); ++j) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66127);Dfp x = field.newDfp(j).multiply(step);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66128);Dfp[] values = new Dfp[p.length];
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66129);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66130)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66131)==0&false)); ++k) {{
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66132);values[k] = field.newDfp(p[k].value(x.getReal()));
                }
                }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66133);interpolator.addSamplePoint(x, values);
            }

            }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66134);for (int j = 0; (((j < 20)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66135)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66136)==0&false)); ++j) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66137);Dfp x = field.newDfp(j).multiply(step);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66138);Dfp[] values = interpolator.value(x);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66139);Assert.assertEquals(p.length, values.length);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66140);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66141)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66142)==0&false)); ++k) {{
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66143);Assert.assertEquals(p[k].value(x.getReal()),
                                        values[k].getReal(),
                                        1.0e-8 * FastMath.abs(p[k].value(x.getReal())));
                }
            }}

        }}

    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testRandomPolynomialsFirstDerivative() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pv6441f1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testRandomPolynomialsFirstDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pv6441f1c(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66144);

        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66145);Random random = new Random(0x570803c982ca5d3bl);

        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66146);for (int i = 0; (((i < 100)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66147)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66148)==0&false)); ++i) {{

            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66149);int maxDegree = 0;
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66150);PolynomialFunction[] p      = new PolynomialFunction[5];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66151);PolynomialFunction[] pPrime = new PolynomialFunction[5];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66152);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66153)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66154)==0&false)); ++k) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66155);int degree = random.nextInt(7);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66156);p[k]      = randomPolynomial(degree, random);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66157);pPrime[k] = p[k].polynomialDerivative();
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66158);maxDegree = FastMath.max(maxDegree, degree);
            }

            }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66159);DfpField field = new DfpField(30);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66160);Dfp step = field.getOne().divide(field.newDfp(10));
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66161);FieldHermiteInterpolator<Dfp> interpolator = new FieldHermiteInterpolator<Dfp>();
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66162);for (int j = 0; (((j < 1 + maxDegree / 2)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66163)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66164)==0&false)); ++j) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66165);Dfp x = field.newDfp(j).multiply(step);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66166);Dfp[] values      = new Dfp[p.length];
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66167);Dfp[] derivatives = new Dfp[p.length];
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66168);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66169)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66170)==0&false)); ++k) {{
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66171);values[k]      = field.newDfp(p[k].value(x.getReal()));
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66172);derivatives[k] = field.newDfp(pPrime[k].value(x.getReal()));
                }
                }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66173);interpolator.addSamplePoint(x, values, derivatives);
            }

            }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66174);Dfp h = step.divide(field.newDfp(100000));
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66175);for (int j = 0; (((j < 20)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66176)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66177)==0&false)); ++j) {{
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66178);Dfp x = field.newDfp(j).multiply(step);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66179);Dfp[] y  = interpolator.value(x);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66180);Dfp[] yP = interpolator.value(x.add(h));
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66181);Dfp[] yM = interpolator.value(x.subtract(h));
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66182);Assert.assertEquals(p.length, y.length);
                __CLR4_4_11eyw1eywlb90pc0z.R.inc(66183);for (int k = 0; (((k < p.length)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66184)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66185)==0&false)); ++k) {{
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66186);Assert.assertEquals(p[k].value(x.getReal()),
                                        y[k].getReal(),
                                        1.0e-8 * FastMath.abs(p[k].value(x.getReal())));
                    __CLR4_4_11eyw1eywlb90pc0z.R.inc(66187);Assert.assertEquals(pPrime[k].value(x.getReal()),
                                        yP[k].subtract(yM[k]).divide(h.multiply(2)).getReal(),
                                        4.0e-8 * FastMath.abs(p[k].value(x.getReal())));
                }
            }}

        }}
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testSine() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h6gfa1f2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testSine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h6gfa1f2k(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66188);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66189);DfpField field = new DfpField(30);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66190);FieldHermiteInterpolator<Dfp> interpolator = new FieldHermiteInterpolator<Dfp>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66191);for (Dfp x = field.getZero(); (((x.getReal() < FastMath.PI)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66192)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66193)==0&false)); x = x.add(0.5)) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66194);interpolator.addSamplePoint(x, new Dfp[] { x.sin() });
        }
        }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66195);for (Dfp x = field.newDfp(0.1); (((x.getReal() < 2.9)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66196)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66197)==0&false)); x = x.add(0.01)) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66198);Dfp y = interpolator.value(x)[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66199);Assert.assertEquals( x.sin().getReal(), y.getReal(), 3.5e-5);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testSquareRoot() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113gf0o1f2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testSquareRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113gf0o1f2w(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66200);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66201);DfpField field = new DfpField(30);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66202);FieldHermiteInterpolator<Dfp> interpolator = new FieldHermiteInterpolator<Dfp>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66203);for (Dfp x = field.getOne(); (((x.getReal() < 3.6)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66204)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66205)==0&false)); x = x.add(0.5)) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66206);interpolator.addSamplePoint(x, new Dfp[] { x.sqrt() });
        }
        }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66207);for (Dfp x = field.newDfp(1.1); (((x.getReal() < 3.5)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66208)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66209)==0&false)); x = x.add(0.01)) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66210);Dfp y = interpolator.value(x)[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66211);Assert.assertEquals(x.sqrt().getReal(), y.getReal(), 1.5e-4);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testWikipedia() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9sooc1f38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testWikipedia",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9sooc1f38(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66212);
        // this test corresponds to the example from Wikipedia page:
        // http://en.wikipedia.org/wiki/Hermite_interpolation
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66213);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66214);interpolator.addSamplePoint(new BigFraction(-1),
                                    new BigFraction[] { new BigFraction( 2) },
                                    new BigFraction[] { new BigFraction(-8) },
                                    new BigFraction[] { new BigFraction(56) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66215);interpolator.addSamplePoint(new BigFraction( 0),
                                    new BigFraction[] { new BigFraction( 1) },
                                    new BigFraction[] { new BigFraction( 0) },
                                    new BigFraction[] { new BigFraction( 0) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66216);interpolator.addSamplePoint(new BigFraction( 1),
                                    new BigFraction[] { new BigFraction( 2) },
                                    new BigFraction[] { new BigFraction( 8) },
                                    new BigFraction[] { new BigFraction(56) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66217);for (BigFraction x = new BigFraction(-1); (((x.doubleValue() <= 1.0)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66218)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66219)==0&false)); x = x.add(new BigFraction(1, 8))) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66220);BigFraction y = interpolator.value(x)[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66221);BigFraction x2 = x.multiply(x);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66222);BigFraction x4 = x2.multiply(x2);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66223);BigFraction x8 = x4.multiply(x4);
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66224);Assert.assertEquals(x8.add(new BigFraction(1)), y);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test
    public void testOnePointParabola() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdatfp1f3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testOnePointParabola",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdatfp1f3l(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66225);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66226);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66227);interpolator.addSamplePoint(new BigFraction(0),
                                    new BigFraction[] { new BigFraction(1) },
                                    new BigFraction[] { new BigFraction(1) },
                                    new BigFraction[] { new BigFraction(2) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66228);for (BigFraction x = new BigFraction(-1); (((x.doubleValue() <= 1.0)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66229)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66230)==0&false)); x = x.add(new BigFraction(1, 8))) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66231);BigFraction y = interpolator.value(x)[0];
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66232);Assert.assertEquals(BigFraction.ONE.add(x.multiply(BigFraction.ONE.add(x))), y);
        }
    }}finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    private PolynomialFunction randomPolynomial(int degree, Random random) {try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66233);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66234);double[] coeff = new double[ 1 + degree];
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66235);for (int j = 0; (((j < degree)&&(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66236)!=0|true))||(__CLR4_4_11eyw1eywlb90pc0z.R.iget(66237)==0&false)); ++j) {{
            __CLR4_4_11eyw1eywlb90pc0z.R.inc(66238);coeff[j] = random.nextDouble();
        }
        }__CLR4_4_11eyw1eywlb90pc0z.R.inc(66239);return new PolynomialFunction(coeff);
    }finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testEmptySampleValue() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t4ij71f40();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,109,112,116,121,83,97,109,112,108,101,86,97,108,117,101,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testEmptySampleValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t4ij71f40(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66240);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66241);new FieldHermiteInterpolator<BigFraction>().value(BigFraction.ZERO);
    }finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testEmptySampleDerivative() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p1sa51f42();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,109,112,116,121,83,97,109,112,108,101,68,101,114,105,118,97,116,105,118,101,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testEmptySampleDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p1sa51f42(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66242);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66243);new FieldHermiteInterpolator<BigFraction>().derivatives(BigFraction.ZERO, 1);
    }finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testDuplicatedAbscissa() {__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceStart(getClass().getName(),66244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bugj231f44();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,117,112,108,105,99,97,116,101,100,65,98,115,99,105,115,115,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyw1eywlb90pc0z.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyw1eywlb90pc0z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest.testDuplicatedAbscissa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bugj231f44(){try{__CLR4_4_11eyw1eywlb90pc0z.R.inc(66244);
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66245);FieldHermiteInterpolator<BigFraction> interpolator = new FieldHermiteInterpolator<BigFraction>();
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66246);interpolator.addSamplePoint(new BigFraction(1), new BigFraction[] { new BigFraction(0) });
        __CLR4_4_11eyw1eywlb90pc0z.R.inc(66247);interpolator.addSamplePoint(new BigFraction(1), new BigFraction[] { new BigFraction(1) });
    }finally{__CLR4_4_11eyw1eywlb90pc0z.R.flushNeeded();}}

}

