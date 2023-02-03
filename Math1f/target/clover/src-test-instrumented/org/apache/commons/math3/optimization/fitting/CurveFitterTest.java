/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.commons.math3.optimization.fitting;

import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class CurveFitterTest {static class __CLR4_4_1252z252zlb90pe0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99975,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMath303() {__CLR4_4_1252z252zlb90pe0g.R.globalSliceStart(getClass().getName(),99899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115slh9252z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1252z252zlb90pe0g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1252z252zlb90pe0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.CurveFitterTest.testMath303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115slh9252z(){try{__CLR4_4_1252z252zlb90pe0g.R.inc(99899);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99900);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_1252z252zlb90pe0g.R.inc(99901);CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99902);fitter.addObservedPoint(2.805d, 0.6934785852953367d);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99903);fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99904);fitter.addObservedPoint(1.655d, 0.9474675497289684);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99905);fitter.addObservedPoint(1.725d, 0.9013594835804194d);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99906);ParametricUnivariateFunction sif = new SimpleInverseFunction();

        __CLR4_4_1252z252zlb90pe0g.R.inc(99907);double[] initialguess1 = new double[1];
        __CLR4_4_1252z252zlb90pe0g.R.inc(99908);initialguess1[0] = 1.0d;
        __CLR4_4_1252z252zlb90pe0g.R.inc(99909);Assert.assertEquals(1, fitter.fit(sif, initialguess1).length);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99910);double[] initialguess2 = new double[2];
        __CLR4_4_1252z252zlb90pe0g.R.inc(99911);initialguess2[0] = 1.0d;
        __CLR4_4_1252z252zlb90pe0g.R.inc(99912);initialguess2[1] = .5d;
        __CLR4_4_1252z252zlb90pe0g.R.inc(99913);Assert.assertEquals(2, fitter.fit(sif, initialguess2).length);

    }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}

    @Test
    public void testMath304() {__CLR4_4_1252z252zlb90pe0g.R.globalSliceStart(getClass().getName(),99914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1237db8253e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1252z252zlb90pe0g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1252z252zlb90pe0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.CurveFitterTest.testMath304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1237db8253e(){try{__CLR4_4_1252z252zlb90pe0g.R.inc(99914);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99915);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_1252z252zlb90pe0g.R.inc(99916);CurveFitter<ParametricUnivariateFunction> fitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99917);fitter.addObservedPoint(2.805d, 0.6934785852953367d);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99918);fitter.addObservedPoint(2.74333333333333d, 0.6306772025518496d);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99919);fitter.addObservedPoint(1.655d, 0.9474675497289684);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99920);fitter.addObservedPoint(1.725d, 0.9013594835804194d);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99921);ParametricUnivariateFunction sif = new SimpleInverseFunction();

        __CLR4_4_1252z252zlb90pe0g.R.inc(99922);double[] initialguess1 = new double[1];
        __CLR4_4_1252z252zlb90pe0g.R.inc(99923);initialguess1[0] = 1.0d;
        __CLR4_4_1252z252zlb90pe0g.R.inc(99924);Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99925);double[] initialguess2 = new double[1];
        __CLR4_4_1252z252zlb90pe0g.R.inc(99926);initialguess2[0] = 10.0d;
        __CLR4_4_1252z252zlb90pe0g.R.inc(99927);Assert.assertEquals(1.6357215104109237, fitter.fit(sif, initialguess1)[0], 1.0e-14);

    }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}

    @Test
    public void testMath372() {__CLR4_4_1252z252zlb90pe0g.R.globalSliceStart(getClass().getName(),99928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19h4eed253s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1252z252zlb90pe0g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1252z252zlb90pe0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.fitting.CurveFitterTest.testMath372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19h4eed253s(){try{__CLR4_4_1252z252zlb90pe0g.R.inc(99928);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99929);LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        __CLR4_4_1252z252zlb90pe0g.R.inc(99930);CurveFitter<ParametricUnivariateFunction> curveFitter = new CurveFitter<ParametricUnivariateFunction>(optimizer);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99931);curveFitter.addObservedPoint( 15,  4443);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99932);curveFitter.addObservedPoint( 31,  8493);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99933);curveFitter.addObservedPoint( 62, 17586);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99934);curveFitter.addObservedPoint(125, 30582);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99935);curveFitter.addObservedPoint(250, 45087);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99936);curveFitter.addObservedPoint(500, 50683);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99937);ParametricUnivariateFunction f = new ParametricUnivariateFunction() {

            public double value(double x, double ... parameters) {try{__CLR4_4_1252z252zlb90pe0g.R.inc(99938);

                __CLR4_4_1252z252zlb90pe0g.R.inc(99939);double a = parameters[0];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99940);double b = parameters[1];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99941);double c = parameters[2];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99942);double d = parameters[3];

                __CLR4_4_1252z252zlb90pe0g.R.inc(99943);return d + ((a - d) / (1 + FastMath.pow(x / c, b)));
            }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}

            public double[] gradient(double x, double ... parameters) {try{__CLR4_4_1252z252zlb90pe0g.R.inc(99944);

                __CLR4_4_1252z252zlb90pe0g.R.inc(99945);double a = parameters[0];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99946);double b = parameters[1];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99947);double c = parameters[2];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99948);double d = parameters[3];

                __CLR4_4_1252z252zlb90pe0g.R.inc(99949);double[] gradients = new double[4];
                __CLR4_4_1252z252zlb90pe0g.R.inc(99950);double den = 1 + FastMath.pow(x / c, b);

                // derivative with respect to a
                __CLR4_4_1252z252zlb90pe0g.R.inc(99951);gradients[0] = 1 / den;

                // derivative with respect to b
                // in the reported (invalid) issue, there was a sign error here
                __CLR4_4_1252z252zlb90pe0g.R.inc(99952);gradients[1] = -((a - d) * FastMath.pow(x / c, b) * FastMath.log(x / c)) / (den * den);

                // derivative with respect to c
                __CLR4_4_1252z252zlb90pe0g.R.inc(99953);gradients[2] = (b * FastMath.pow(x / c, b - 1) * (x / (c * c)) * (a - d)) / (den * den);

                // derivative with respect to d
                __CLR4_4_1252z252zlb90pe0g.R.inc(99954);gradients[3] = 1 - (1 / den);

                __CLR4_4_1252z252zlb90pe0g.R.inc(99955);return gradients;

            }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}
        };

        __CLR4_4_1252z252zlb90pe0g.R.inc(99956);double[] initialGuess = new double[] { 1500, 0.95, 65, 35000 };
        __CLR4_4_1252z252zlb90pe0g.R.inc(99957);double[] estimatedParameters = curveFitter.fit(f, initialGuess);

        __CLR4_4_1252z252zlb90pe0g.R.inc(99958);Assert.assertEquals( 2411.00, estimatedParameters[0], 500.00);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99959);Assert.assertEquals(    1.62, estimatedParameters[1],   0.04);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99960);Assert.assertEquals(  111.22, estimatedParameters[2],   0.30);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99961);Assert.assertEquals(55347.47, estimatedParameters[3], 300.00);
        __CLR4_4_1252z252zlb90pe0g.R.inc(99962);Assert.assertTrue(optimizer.getRMS() < 600.0);

    }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}

    private static class SimpleInverseFunction implements ParametricUnivariateFunction {

        public double value(double x, double ... parameters) {try{__CLR4_4_1252z252zlb90pe0g.R.inc(99963);
            __CLR4_4_1252z252zlb90pe0g.R.inc(99964);return parameters[0] / x + ((((parameters.length < 2 )&&(__CLR4_4_1252z252zlb90pe0g.R.iget(99965)!=0|true))||(__CLR4_4_1252z252zlb90pe0g.R.iget(99966)==0&false))? 0 : parameters[1]);
        }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}

        public double[] gradient(double x, double ... doubles) {try{__CLR4_4_1252z252zlb90pe0g.R.inc(99967);
            __CLR4_4_1252z252zlb90pe0g.R.inc(99968);double[] gradientVector = new double[doubles.length];
            __CLR4_4_1252z252zlb90pe0g.R.inc(99969);gradientVector[0] = 1 / x;
            __CLR4_4_1252z252zlb90pe0g.R.inc(99970);if ((((doubles.length >= 2)&&(__CLR4_4_1252z252zlb90pe0g.R.iget(99971)!=0|true))||(__CLR4_4_1252z252zlb90pe0g.R.iget(99972)==0&false))) {{
                __CLR4_4_1252z252zlb90pe0g.R.inc(99973);gradientVector[1] = 1;
            }
            }__CLR4_4_1252z252zlb90pe0g.R.inc(99974);return gradientVector;
        }finally{__CLR4_4_1252z252zlb90pe0g.R.flushNeeded();}}
    }

}
