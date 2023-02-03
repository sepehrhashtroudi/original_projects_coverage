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
package org.apache.commons.math3.fitting;

import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class CurveFitterTest {static class __CLR4_4_11kxw1kxwlb90pchf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testMath303() {__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceStart(getClass().getName(),73796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115slh91kxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kxw1kxwlb90pchf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.CurveFitterTest.testMath303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115slh91kxw(){try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73796);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73797);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73798);CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73799);fitter.addObservedPoint(2.805d, 0.6934785852953367d);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73800);fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73801);fitter.addObservedPoint(1.655d, 0.9474675497289684);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73802);fitter.addObservedPoint(1.725d, 0.9013594835804194d);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73803);ParametricUnivariateFunction sif = new SimpleInverseFunction();

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73804);double[] initialguess1 = new double[1];
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73805);initialguess1[0] = 1.0d;
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73806);Assert.assertEquals(1, fitter.fit(sif, initialguess1).length);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73807);double[] initialguess2 = new double[2];
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73808);initialguess2[0] = 1.0d;
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73809);initialguess2[1] = .5d;
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73810);Assert.assertEquals(2, fitter.fit(sif, initialguess2).length);
    }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}

    @Test
    public void testMath304() {__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceStart(getClass().getName(),73811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1237db81kyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kxw1kxwlb90pchf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.CurveFitterTest.testMath304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1237db81kyb(){try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73811);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73812);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73813);CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73814);fitter.addObservedPoint(2.805d, 0.6934785852953367d);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73815);fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73816);fitter.addObservedPoint(1.655d, 0.9474675497289684);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73817);fitter.addObservedPoint(1.725d, 0.9013594835804194d);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73818);ParametricUnivariateFunction sif = new SimpleInverseFunction();

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73819);double[] initialguess1 = new double[1];
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73820);initialguess1[0] = 1.0d;
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73821);Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73822);double[] initialguess2 = new double[1];
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73823);initialguess2[0] = 10.0d;
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73824);Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14);
    }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}

    @Test
    public void testMath372() {__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceStart(getClass().getName(),73825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19h4eed1kyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kxw1kxwlb90pchf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kxw1kxwlb90pchf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.CurveFitterTest.testMath372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19h4eed1kyp(){try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73825);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73826);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73827);CurveFitter<ParametricUnivariateFunction> curveFitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73828);curveFitter.addObservedPoint( 15,  4443);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73829);curveFitter.addObservedPoint( 31,  8493);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73830);curveFitter.addObservedPoint( 62, 17586);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73831);curveFitter.addObservedPoint(125, 30582);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73832);curveFitter.addObservedPoint(250, 45087);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73833);curveFitter.addObservedPoint(500, 50683);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73834);ParametricUnivariateFunction f = new ParametricUnivariateFunction() {
            public double value(double x, double ... parameters) {try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73835);
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73836);double a = parameters[0];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73837);double b = parameters[1];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73838);double c = parameters[2];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73839);double d = parameters[3];

                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73840);return d + ((a - d) / (1 + FastMath.pow(x / c, b)));
            }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}

            public double[] gradient(double x, double ... parameters) {try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73841);
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73842);double a = parameters[0];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73843);double b = parameters[1];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73844);double c = parameters[2];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73845);double d = parameters[3];

                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73846);double[] gradients = new double[4];
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73847);double den = 1 + FastMath.pow(x / c, b);

                // derivative with respect to a
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73848);gradients[0] = 1 / den;

                // derivative with respect to b
                // in the reported (invalid) issue, there was a sign error here
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73849);gradients[1] = -((a - d) * FastMath.pow(x / c, b) * FastMath.log(x / c)) / (den * den);

                // derivative with respect to c
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73850);gradients[2] = (b * FastMath.pow(x / c, b - 1) * (x / (c * c)) * (a - d)) / (den * den);

                // derivative with respect to d
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73851);gradients[3] = 1 - (1 / den);

                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73852);return gradients;

            }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}
        };

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73853);double[] initialGuess = new double[] { 1500, 0.95, 65, 35000 };
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73854);double[] estimatedParameters = curveFitter.fit(f, initialGuess);

        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73855);Assert.assertEquals( 2411.00, estimatedParameters[0], 500.00);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73856);Assert.assertEquals(    1.62, estimatedParameters[1],   0.04);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73857);Assert.assertEquals(  111.22, estimatedParameters[2],   0.30);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73858);Assert.assertEquals(55347.47, estimatedParameters[3], 300.00);
        __CLR4_4_11kxw1kxwlb90pchf.R.inc(73859);Assert.assertTrue(optimizer.getRMS() < 600.0);
    }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}

    private static class SimpleInverseFunction implements ParametricUnivariateFunction {

        public double value(double x, double ... parameters) {try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73860);
            __CLR4_4_11kxw1kxwlb90pchf.R.inc(73861);return parameters[0] / x + ((((parameters.length < 2 )&&(__CLR4_4_11kxw1kxwlb90pchf.R.iget(73862)!=0|true))||(__CLR4_4_11kxw1kxwlb90pchf.R.iget(73863)==0&false))? 0 : parameters[1]);
        }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}

        public double[] gradient(double x, double ... doubles) {try{__CLR4_4_11kxw1kxwlb90pchf.R.inc(73864);
            __CLR4_4_11kxw1kxwlb90pchf.R.inc(73865);double[] gradientVector = new double[doubles.length];
            __CLR4_4_11kxw1kxwlb90pchf.R.inc(73866);gradientVector[0] = 1 / x;
            __CLR4_4_11kxw1kxwlb90pchf.R.inc(73867);if ((((doubles.length >= 2)&&(__CLR4_4_11kxw1kxwlb90pchf.R.iget(73868)!=0|true))||(__CLR4_4_11kxw1kxwlb90pchf.R.iget(73869)==0&false))) {{
                __CLR4_4_11kxw1kxwlb90pchf.R.inc(73870);gradientVector[1] = 1;
            }
            }__CLR4_4_11kxw1kxwlb90pchf.R.inc(73871);return gradientVector;
        }finally{__CLR4_4_11kxw1kxwlb90pchf.R.flushNeeded();}}
    }
}
