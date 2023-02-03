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

package org.apache.commons.math3.optimization;


import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optimization.direct.NelderMeadSimplex;
import org.apache.commons.math3.optimization.direct.SimplexOptimizer;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateMultiStartOptimizerTest {static class __CLR4_4_124492449lb90pdyc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testRosenbrock() {__CLR4_4_124492449lb90pdyc.R.globalSliceStart(getClass().getName(),98649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glvc692449();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124492449lb90pdyc.R.rethrow($CLV_t2$);}finally{__CLR4_4_124492449lb90pdyc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.MultivariateMultiStartOptimizerTest.testRosenbrock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glvc692449(){try{__CLR4_4_124492449lb90pdyc.R.inc(98649);
        __CLR4_4_124492449lb90pdyc.R.inc(98650);Rosenbrock rosenbrock = new Rosenbrock();
        __CLR4_4_124492449lb90pdyc.R.inc(98651);SimplexOptimizer underlying
            = new SimplexOptimizer(new SimpleValueChecker(-1, 1.0e-3));
        __CLR4_4_124492449lb90pdyc.R.inc(98652);NelderMeadSimplex simplex = new NelderMeadSimplex(new double[][] {
                { -1.2,  1.0 }, { 0.9, 1.2 } , {  3.5, -2.3 }
            });
        __CLR4_4_124492449lb90pdyc.R.inc(98653);underlying.setSimplex(simplex);
        __CLR4_4_124492449lb90pdyc.R.inc(98654);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_124492449lb90pdyc.R.inc(98655);g.setSeed(16069223052l);
        __CLR4_4_124492449lb90pdyc.R.inc(98656);RandomVectorGenerator generator =
            new UncorrelatedRandomVectorGenerator(2, new GaussianRandomGenerator(g));
        __CLR4_4_124492449lb90pdyc.R.inc(98657);MultivariateMultiStartOptimizer optimizer =
            new MultivariateMultiStartOptimizer(underlying, 10, generator);
        __CLR4_4_124492449lb90pdyc.R.inc(98658);PointValuePair optimum =
            optimizer.optimize(1100, rosenbrock, GoalType.MINIMIZE, new double[] { -1.2, 1.0 });

        __CLR4_4_124492449lb90pdyc.R.inc(98659);Assert.assertEquals(rosenbrock.getCount(), optimizer.getEvaluations());
        __CLR4_4_124492449lb90pdyc.R.inc(98660);Assert.assertTrue(optimizer.getEvaluations() > 900);
        __CLR4_4_124492449lb90pdyc.R.inc(98661);Assert.assertTrue(optimizer.getEvaluations() < 1200);
        __CLR4_4_124492449lb90pdyc.R.inc(98662);Assert.assertTrue(optimum.getValue() < 8.0e-4);
    }finally{__CLR4_4_124492449lb90pdyc.R.flushNeeded();}}

    private static class Rosenbrock implements MultivariateFunction {
        private int count;

        public Rosenbrock() {try{__CLR4_4_124492449lb90pdyc.R.inc(98663);
            __CLR4_4_124492449lb90pdyc.R.inc(98664);count = 0;
        }finally{__CLR4_4_124492449lb90pdyc.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124492449lb90pdyc.R.inc(98665);
            __CLR4_4_124492449lb90pdyc.R.inc(98666);++count;
            __CLR4_4_124492449lb90pdyc.R.inc(98667);double a = x[1] - x[0] * x[0];
            __CLR4_4_124492449lb90pdyc.R.inc(98668);double b = 1.0 - x[0];
            __CLR4_4_124492449lb90pdyc.R.inc(98669);return 100 * a * a + b * b;
        }finally{__CLR4_4_124492449lb90pdyc.R.flushNeeded();}}

        public int getCount() {try{__CLR4_4_124492449lb90pdyc.R.inc(98670);
            __CLR4_4_124492449lb90pdyc.R.inc(98671);return count;
        }finally{__CLR4_4_124492449lb90pdyc.R.flushNeeded();}}
    }
}
