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
package org.apache.commons.math3.analysis.polynomials;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the PolynomialsUtils class.
 *
 * @version $Id$
 */
public class PolynomialsUtilsTest {static class __CLR4_4_11gdp1gdplb90pc3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68124,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testFirstChebyshevPolynomials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ed7znr1gdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testFirstChebyshevPolynomials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ed7znr1gdp(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67885);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67886);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(3), "-3 x + 4 x^3");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67887);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(2), "-1 + 2 x^2");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67888);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(1), "x");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67889);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(0), "1");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67890);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(7), "-7 x + 56 x^3 - 112 x^5 + 64 x^7");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67891);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(6), "-1 + 18 x^2 - 48 x^4 + 32 x^6");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67892);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(5), "5 x - 20 x^3 + 16 x^5");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67893);checkPolynomial(PolynomialsUtils.createChebyshevPolynomial(4), "1 - 8 x^2 + 8 x^4");

    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testChebyshevBounds() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bnja11gdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testChebyshevBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bnja11gdy(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67894);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67895);for (int k = 0; (((k < 12)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67896)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67897)==0&false)); ++k) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67898);PolynomialFunction Tk = PolynomialsUtils.createChebyshevPolynomial(k);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67899);for (double x = -1; (((x <= 1)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67900)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67901)==0&false)); x += 0.02) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67902);Assert.assertTrue(k + " " + Tk.value(x), FastMath.abs(Tk.value(x)) < (1 + 1e-12));
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testChebyshevDifferentials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b2sr01ge7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testChebyshevDifferentials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b2sr01ge7(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67903);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67904);for (int k = 0; (((k < 12)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67905)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67906)==0&false)); ++k) {{

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67907);PolynomialFunction Tk0 = PolynomialsUtils.createChebyshevPolynomial(k);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67908);PolynomialFunction Tk1 = Tk0.polynomialDerivative();
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67909);PolynomialFunction Tk2 = Tk1.polynomialDerivative();

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67910);PolynomialFunction g0 = new PolynomialFunction(new double[] { k * k });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67911);PolynomialFunction g1 = new PolynomialFunction(new double[] { 0, -1});
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67912);PolynomialFunction g2 = new PolynomialFunction(new double[] { 1, 0, -1 });

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67913);PolynomialFunction Tk0g0 = Tk0.multiply(g0);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67914);PolynomialFunction Tk1g1 = Tk1.multiply(g1);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67915);PolynomialFunction Tk2g2 = Tk2.multiply(g2);

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67916);checkNullPolynomial(Tk0g0.add(Tk1g1.add(Tk2g2)));

        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testChebyshevOrthogonality() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhjvcf1gel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testChebyshevOrthogonality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhjvcf1gel(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67917);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67918);UnivariateFunction weight = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67919);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67920);return 1 / FastMath.sqrt(1 - x * x);
            }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67921);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67922)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67923)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67924);PolynomialFunction pi = PolynomialsUtils.createChebyshevPolynomial(i);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67925);for (int j = 0; (((j <= i)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67926)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67927)==0&false)); ++j) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67928);PolynomialFunction pj = PolynomialsUtils.createChebyshevPolynomial(j);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67929);checkOrthogonality(pi, pj, weight, -0.9999, 0.9999, 1.5, 0.03);
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testFirstHermitePolynomials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nc3js21gey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testFirstHermitePolynomials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nc3js21gey(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67930);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67931);checkPolynomial(PolynomialsUtils.createHermitePolynomial(3), "-12 x + 8 x^3");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67932);checkPolynomial(PolynomialsUtils.createHermitePolynomial(2), "-2 + 4 x^2");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67933);checkPolynomial(PolynomialsUtils.createHermitePolynomial(1), "2 x");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67934);checkPolynomial(PolynomialsUtils.createHermitePolynomial(0), "1");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67935);checkPolynomial(PolynomialsUtils.createHermitePolynomial(7), "-1680 x + 3360 x^3 - 1344 x^5 + 128 x^7");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67936);checkPolynomial(PolynomialsUtils.createHermitePolynomial(6), "-120 + 720 x^2 - 480 x^4 + 64 x^6");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67937);checkPolynomial(PolynomialsUtils.createHermitePolynomial(5), "120 x - 160 x^3 + 32 x^5");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67938);checkPolynomial(PolynomialsUtils.createHermitePolynomial(4), "12 - 48 x^2 + 16 x^4");

    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testHermiteDifferentials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ir0ogf1gf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testHermiteDifferentials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ir0ogf1gf7(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67939);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67940);for (int k = 0; (((k < 12)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67941)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67942)==0&false)); ++k) {{

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67943);PolynomialFunction Hk0 = PolynomialsUtils.createHermitePolynomial(k);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67944);PolynomialFunction Hk1 = Hk0.polynomialDerivative();
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67945);PolynomialFunction Hk2 = Hk1.polynomialDerivative();

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67946);PolynomialFunction g0 = new PolynomialFunction(new double[] { 2 * k });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67947);PolynomialFunction g1 = new PolynomialFunction(new double[] { 0, -2 });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67948);PolynomialFunction g2 = new PolynomialFunction(new double[] { 1 });

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67949);PolynomialFunction Hk0g0 = Hk0.multiply(g0);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67950);PolynomialFunction Hk1g1 = Hk1.multiply(g1);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67951);PolynomialFunction Hk2g2 = Hk2.multiply(g2);

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67952);checkNullPolynomial(Hk0g0.add(Hk1g1.add(Hk2g2)));

        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testHermiteOrthogonality() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kjlv01gfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testHermiteOrthogonality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kjlv01gfl(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67953);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67954);UnivariateFunction weight = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67955);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67956);return FastMath.exp(-x * x);
            }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67957);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67958)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67959)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67960);PolynomialFunction pi = PolynomialsUtils.createHermitePolynomial(i);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67961);for (int j = 0; (((j <= i)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67962)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67963)==0&false)); ++j) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67964);PolynomialFunction pj = PolynomialsUtils.createHermitePolynomial(j);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67965);checkOrthogonality(pi, pj, weight, -50, 50, 1.5, 1.0e-8);
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testFirstLaguerrePolynomials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnewjp1gfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testFirstLaguerrePolynomials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnewjp1gfy(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67966);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67967);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(3), 6l, "6 - 18 x + 9 x^2 - x^3");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67968);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(2), 2l, "2 - 4 x + x^2");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67969);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(1), 1l, "1 - x");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67970);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(0), 1l, "1");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67971);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(7), 5040l,
                "5040 - 35280 x + 52920 x^2 - 29400 x^3"
                + " + 7350 x^4 - 882 x^5 + 49 x^6 - x^7");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67972);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(6),  720l,
                "720 - 4320 x + 5400 x^2 - 2400 x^3 + 450 x^4"
                + " - 36 x^5 + x^6");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67973);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(5),  120l,
        "120 - 600 x + 600 x^2 - 200 x^3 + 25 x^4 - x^5");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67974);checkPolynomial(PolynomialsUtils.createLaguerrePolynomial(4),   24l,
        "24 - 96 x + 72 x^2 - 16 x^3 + x^4");

    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testLaguerreDifferentials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwvo0a1gg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testLaguerreDifferentials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwvo0a1gg7(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67975);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67976);for (int k = 0; (((k < 12)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67977)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67978)==0&false)); ++k) {{

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67979);PolynomialFunction Lk0 = PolynomialsUtils.createLaguerrePolynomial(k);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67980);PolynomialFunction Lk1 = Lk0.polynomialDerivative();
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67981);PolynomialFunction Lk2 = Lk1.polynomialDerivative();

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67982);PolynomialFunction g0 = new PolynomialFunction(new double[] { k });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67983);PolynomialFunction g1 = new PolynomialFunction(new double[] { 1, -1 });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67984);PolynomialFunction g2 = new PolynomialFunction(new double[] { 0, 1 });

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67985);PolynomialFunction Lk0g0 = Lk0.multiply(g0);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67986);PolynomialFunction Lk1g1 = Lk1.multiply(g1);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67987);PolynomialFunction Lk2g2 = Lk2.multiply(g2);

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67988);checkNullPolynomial(Lk0g0.add(Lk1g1.add(Lk2g2)));

        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testLaguerreOrthogonality() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),67989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qelev1ggl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testLaguerreOrthogonality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qelev1ggl(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67989);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67990);UnivariateFunction weight = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(67991);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(67992);return FastMath.exp(-x);
            }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(67993);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67994)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67995)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67996);PolynomialFunction pi = PolynomialsUtils.createLaguerrePolynomial(i);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(67997);for (int j = 0; (((j <= i)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67998)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(67999)==0&false)); ++j) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68000);PolynomialFunction pj = PolynomialsUtils.createLaguerrePolynomial(j);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68001);checkOrthogonality(pi, pj, weight, 0.0, 100.0, 0.99999, 1.0e-13);
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testFirstLegendrePolynomials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1db89a01ggy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testFirstLegendrePolynomials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1db89a01ggy(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68002);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68003);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(3),  2l, "-3 x + 5 x^3");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68004);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(2),  2l, "-1 + 3 x^2");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68005);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(1),  1l, "x");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68006);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(0),  1l, "1");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68007);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(7), 16l, "-35 x + 315 x^3 - 693 x^5 + 429 x^7");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68008);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(6), 16l, "-5 + 105 x^2 - 315 x^4 + 231 x^6");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68009);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(5),  8l, "15 x - 70 x^3 + 63 x^5");
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68010);checkPolynomial(PolynomialsUtils.createLegendrePolynomial(4),  8l, "3 - 30 x^2 + 35 x^4");

    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testLegendreDifferentials() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2s5zh1gh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testLegendreDifferentials",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2s5zh1gh7(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68011);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68012);for (int k = 0; (((k < 12)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68013)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68014)==0&false)); ++k) {{

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68015);PolynomialFunction Pk0 = PolynomialsUtils.createLegendrePolynomial(k);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68016);PolynomialFunction Pk1 = Pk0.polynomialDerivative();
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68017);PolynomialFunction Pk2 = Pk1.polynomialDerivative();

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68018);PolynomialFunction g0 = new PolynomialFunction(new double[] { k * (k + 1) });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68019);PolynomialFunction g1 = new PolynomialFunction(new double[] { 0, -2 });
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68020);PolynomialFunction g2 = new PolynomialFunction(new double[] { 1, 0, -1 });

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68021);PolynomialFunction Pk0g0 = Pk0.multiply(g0);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68022);PolynomialFunction Pk1g1 = Pk1.multiply(g1);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68023);PolynomialFunction Pk2g2 = Pk2.multiply(g2);

            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68024);checkNullPolynomial(Pk0g0.add(Pk1g1.add(Pk2g2)));

        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testLegendreOrthogonality() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwb3e21ghl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testLegendreOrthogonality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwb3e21ghl(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68025);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68026);UnivariateFunction weight = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68027);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68028);return 1;
            }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68029);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68030)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68031)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68032);PolynomialFunction pi = PolynomialsUtils.createLegendrePolynomial(i);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68033);for (int j = 0; (((j <= i)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68034)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68035)==0&false)); ++j) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68036);PolynomialFunction pj = PolynomialsUtils.createLegendrePolynomial(j);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68037);checkOrthogonality(pi, pj, weight, -1, 1, 0.1, 1.0e-13);
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testHighDegreeLegendre() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i8cwbr1ghy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testHighDegreeLegendre",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i8cwbr1ghy(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68038);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68039);PolynomialsUtils.createLegendrePolynomial(40);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68040);double[] l40 = PolynomialsUtils.createLegendrePolynomial(40).getCoefficients();
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68041);double denominator = 274877906944d;
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68042);double[] numerators = new double[] {
                          +34461632205d,            -28258538408100d,          +3847870979902950d,        -207785032914759300d,
                  +5929294332103310025d,     -103301483474866556880d,    +1197358103913226000200d,    -9763073770369381232400d,
              +58171647881784229843050d,  -260061484647976556945400d,  +888315281771246239250340d, -2345767627188139419665400d,
            +4819022625419112503443050d, -7710436200670580005508880d, +9566652323054238154983240d, -9104813935044723209570256d,
            +6516550296251767619752905d, -3391858621221953912598660d, +1211378079007840683070950d,  -265365894974690562152100d,
              +26876802183334044115405d
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68043);for (int i = 0; (((i < l40.length)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68044)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68045)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68046);if ((((i % 2 == 0)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68047)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68048)==0&false))) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68049);double ci = numerators[i / 2] / denominator;
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68050);Assert.assertEquals(ci, l40[i], FastMath.abs(ci) * 1e-15);
            } }else {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68051);Assert.assertEquals(0, l40[i], 0);
            }
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testJacobiLegendre() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgfh4z1gic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testJacobiLegendre",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgfh4z1gic(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68052);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68053);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68054)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68055)==0&false)); ++i) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68056);PolynomialFunction legendre = PolynomialsUtils.createLegendrePolynomial(i);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68057);PolynomialFunction jacobi   = PolynomialsUtils.createJacobiPolynomial(i, 0, 0);
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68058);checkNullPolynomial(legendre.subtract(jacobi));
        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testJacobiEvaluationAt1() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxmvv11gij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testJacobiEvaluationAt1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxmvv11gij(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68059);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68060);for (int v = 0; (((v < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68061)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68062)==0&false)); ++v) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68063);for (int w = 0; (((w < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68064)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68065)==0&false)); ++w) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68066);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68067)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68068)==0&false)); ++i) {{
                    __CLR4_4_11gdp1gdplb90pc3u.R.inc(68069);PolynomialFunction jacobi = PolynomialsUtils.createJacobiPolynomial(i, v, w);
                    __CLR4_4_11gdp1gdplb90pc3u.R.inc(68070);double binomial = CombinatoricsUtils.binomialCoefficient(v + i, i);
                    __CLR4_4_11gdp1gdplb90pc3u.R.inc(68071);Assert.assertTrue(Precision.equals(binomial, jacobi.value(1.0), 1));
                }
            }}
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testJacobiOrthogonality() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15pqkjk1giw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testJacobiOrthogonality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15pqkjk1giw(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68072);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68073);for (int v = 0; (((v < 5)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68074)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68075)==0&false)); ++v) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68076);for (int w = v; (((w < 5)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68077)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68078)==0&false)); ++w) {{
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68079);final int vv = v;
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68080);final int ww = w;
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68081);UnivariateFunction weight = new UnivariateFunction() {
                    public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68082);
                        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68083);return FastMath.pow(1 - x, vv) * FastMath.pow(1 + x, ww);
                    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
                };
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68084);for (int i = 0; (((i < 10)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68085)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68086)==0&false)); ++i) {{
                    __CLR4_4_11gdp1gdplb90pc3u.R.inc(68087);PolynomialFunction pi = PolynomialsUtils.createJacobiPolynomial(i, v, w);
                    __CLR4_4_11gdp1gdplb90pc3u.R.inc(68088);for (int j = 0; (((j <= i)&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68089)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68090)==0&false)); ++j) {{
                        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68091);PolynomialFunction pj = PolynomialsUtils.createJacobiPolynomial(j, v, w);
                        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68092);checkOrthogonality(pi, pj, weight, -1, 1, 0.1, 1.0e-12);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    @Test
    public void testShift() {__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceStart(getClass().getName(),68093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lei7d1gjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gdp1gdplb90pc3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gdp1gdplb90pc3u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest.testShift",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lei7d1gjh(){try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68093);
        // f1(x) = 1 + x + 2 x^2
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68094);PolynomialFunction f1x = new PolynomialFunction(new double[] { 1, 1, 2 });

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68095);PolynomialFunction f1x1
            = new PolynomialFunction(PolynomialsUtils.shift(f1x.getCoefficients(), 1));
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68096);checkPolynomial(f1x1, "4 + 5 x + 2 x^2");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68097);PolynomialFunction f1xM1
            = new PolynomialFunction(PolynomialsUtils.shift(f1x.getCoefficients(), -1));
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68098);checkPolynomial(f1xM1, "2 - 3 x + 2 x^2");
        
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68099);PolynomialFunction f1x3
            = new PolynomialFunction(PolynomialsUtils.shift(f1x.getCoefficients(), 3));
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68100);checkPolynomial(f1x3, "22 + 13 x + 2 x^2");

        // f2(x) = 2 + 3 x^2 + 8 x^3 + 121 x^5
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68101);PolynomialFunction f2x = new PolynomialFunction(new double[]{2, 0, 3, 8, 0, 121});

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68102);PolynomialFunction f2x1
            = new PolynomialFunction(PolynomialsUtils.shift(f2x.getCoefficients(), 1));
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68103);checkPolynomial(f2x1, "134 + 635 x + 1237 x^2 + 1218 x^3 + 605 x^4 + 121 x^5");

        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68104);PolynomialFunction f2x3
            = new PolynomialFunction(PolynomialsUtils.shift(f2x.getCoefficients(), 3));
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68105);checkPolynomial(f2x3, "29648 + 49239 x + 32745 x^2 + 10898 x^3 + 1815 x^4 + 121 x^5");
    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}


    private void checkPolynomial(PolynomialFunction p, long denominator, String reference) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68106);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68107);PolynomialFunction q = new PolynomialFunction(new double[] { denominator});
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68108);Assert.assertEquals(reference, p.multiply(q).toString());
    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    private void checkPolynomial(PolynomialFunction p, String reference) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68109);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68110);Assert.assertEquals(reference, p.toString());
    }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    private void checkNullPolynomial(PolynomialFunction p) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68111);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68112);for (double coefficient : p.getCoefficients()) {{
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68113);Assert.assertEquals(0, coefficient, 1e-13);
        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}

    private void checkOrthogonality(final PolynomialFunction p1,
                                    final PolynomialFunction p2,
                                    final UnivariateFunction weight,
                                    final double a, final double b,
                                    final double nonZeroThreshold,
                                    final double zeroThreshold) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68114);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68115);UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11gdp1gdplb90pc3u.R.inc(68116);
                __CLR4_4_11gdp1gdplb90pc3u.R.inc(68117);return weight.value(x) * p1.value(x) * p2.value(x);
            }finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
        };
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68118);double dotProduct =
                new IterativeLegendreGaussIntegrator(5, 1.0e-9, 1.0e-8, 2, 15).integrate(1000000, f, a, b);
        __CLR4_4_11gdp1gdplb90pc3u.R.inc(68119);if ((((p1.degree() == p2.degree())&&(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68120)!=0|true))||(__CLR4_4_11gdp1gdplb90pc3u.R.iget(68121)==0&false))) {{
            // integral should be non-zero
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68122);Assert.assertTrue("I(" + p1.degree() + ", " + p2.degree() + ") = "+ dotProduct,
                              FastMath.abs(dotProduct) > nonZeroThreshold);
        } }else {{
            // integral should be zero
            __CLR4_4_11gdp1gdplb90pc3u.R.inc(68123);Assert.assertEquals("I(" + p1.degree() + ", " + p2.degree() + ") = "+ dotProduct,
                                0.0, FastMath.abs(dotProduct), zeroThreshold);
        }
    }}finally{__CLR4_4_11gdp1gdplb90pc3u.R.flushNeeded();}}
}
