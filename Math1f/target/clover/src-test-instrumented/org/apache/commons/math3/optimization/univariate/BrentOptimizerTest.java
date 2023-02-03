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
package org.apache.commons.math3.optimization.univariate;


import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.StepFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * @version $Id$
 */
public final class BrentOptimizerTest {static class __CLR4_4_127012701lb90pe5p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,102504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSinMin() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rif2vn2701();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testSinMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rif2vn2701(){try{__CLR4_4_127012701lb90pe5p.R.inc(102385);
        __CLR4_4_127012701lb90pe5p.R.inc(102386);UnivariateFunction f = new Sin();
        __CLR4_4_127012701lb90pe5p.R.inc(102387);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_127012701lb90pe5p.R.inc(102388);Assert.assertEquals(3 * Math.PI / 2, optimizer.optimize(200, f, GoalType.MINIMIZE, 4, 5).getPoint(), 1e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102389);Assert.assertTrue(optimizer.getEvaluations() <= 50);
        __CLR4_4_127012701lb90pe5p.R.inc(102390);Assert.assertEquals(200, optimizer.getMaxEvaluations());
        __CLR4_4_127012701lb90pe5p.R.inc(102391);Assert.assertEquals(3 * Math.PI / 2, optimizer.optimize(200, f, GoalType.MINIMIZE, 1, 5).getPoint(), 1e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102392);Assert.assertTrue(optimizer.getEvaluations() <= 100);
        __CLR4_4_127012701lb90pe5p.R.inc(102393);Assert.assertTrue(optimizer.getEvaluations() >= 15);
        __CLR4_4_127012701lb90pe5p.R.inc(102394);try {
            __CLR4_4_127012701lb90pe5p.R.inc(102395);optimizer.optimize(10, f, GoalType.MINIMIZE, 4, 5);
            __CLR4_4_127012701lb90pe5p.R.inc(102396);Assert.fail("an exception should have been thrown");
        } catch (TooManyEvaluationsException fee) {
            // expected
        }
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testSinMinWithValueChecker() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15afj19270d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testSinMinWithValueChecker",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15afj19270d(){try{__CLR4_4_127012701lb90pe5p.R.inc(102397);
        __CLR4_4_127012701lb90pe5p.R.inc(102398);final UnivariateFunction f = new Sin();
        __CLR4_4_127012701lb90pe5p.R.inc(102399);final ConvergenceChecker<UnivariatePointValuePair> checker = new SimpleUnivariateValueChecker(1e-5, 1e-14);
        // The default stopping criterion of Brent's algorithm should not
        // pass, but the search will stop at the given relative tolerance
        // for the function value.
        __CLR4_4_127012701lb90pe5p.R.inc(102400);final UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        __CLR4_4_127012701lb90pe5p.R.inc(102401);final UnivariatePointValuePair result = optimizer.optimize(200, f, GoalType.MINIMIZE, 4, 5);
        __CLR4_4_127012701lb90pe5p.R.inc(102402);Assert.assertEquals(3 * Math.PI / 2, result.getPoint(), 1e-3);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testBoundaries() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq69270j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq69270j(){try{__CLR4_4_127012701lb90pe5p.R.inc(102403);
        __CLR4_4_127012701lb90pe5p.R.inc(102404);final double lower = -1.0;
        __CLR4_4_127012701lb90pe5p.R.inc(102405);final double upper = +1.0;
        __CLR4_4_127012701lb90pe5p.R.inc(102406);UnivariateFunction f = new UnivariateFunction() {            
            public double value(double x) {try{__CLR4_4_127012701lb90pe5p.R.inc(102407);
                __CLR4_4_127012701lb90pe5p.R.inc(102408);if ((((x < lower)&&(__CLR4_4_127012701lb90pe5p.R.iget(102409)!=0|true))||(__CLR4_4_127012701lb90pe5p.R.iget(102410)==0&false))) {{
                    __CLR4_4_127012701lb90pe5p.R.inc(102411);throw new NumberIsTooSmallException(x, lower, true);
                } }else {__CLR4_4_127012701lb90pe5p.R.inc(102412);if ((((x > upper)&&(__CLR4_4_127012701lb90pe5p.R.iget(102413)!=0|true))||(__CLR4_4_127012701lb90pe5p.R.iget(102414)==0&false))) {{
                    __CLR4_4_127012701lb90pe5p.R.inc(102415);throw new NumberIsTooLargeException(x, upper, true);
                } }else {{
                    __CLR4_4_127012701lb90pe5p.R.inc(102416);return x;
                }
            }}}finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}
        };
        __CLR4_4_127012701lb90pe5p.R.inc(102417);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_127012701lb90pe5p.R.inc(102418);Assert.assertEquals(lower,
                            optimizer.optimize(100, f, GoalType.MINIMIZE, lower, upper).getPoint(),
                            1.0e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102419);Assert.assertEquals(upper,
                            optimizer.optimize(100, f, GoalType.MAXIMIZE, lower, upper).getPoint(),
                            1.0e-8);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testQuinticMin() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yh3462710();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testQuinticMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yh3462710(){try{__CLR4_4_127012701lb90pe5p.R.inc(102420);
        // The function has local minima at -0.27195613 and 0.82221643.
        __CLR4_4_127012701lb90pe5p.R.inc(102421);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_127012701lb90pe5p.R.inc(102422);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_127012701lb90pe5p.R.inc(102423);Assert.assertEquals(-0.27195613, optimizer.optimize(200, f, GoalType.MINIMIZE, -0.3, -0.2).getPoint(), 1.0e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102424);Assert.assertEquals( 0.82221643, optimizer.optimize(200, f, GoalType.MINIMIZE,  0.3,  0.9).getPoint(), 1.0e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102425);Assert.assertTrue(optimizer.getEvaluations() <= 50);

        // search in a large interval
        __CLR4_4_127012701lb90pe5p.R.inc(102426);Assert.assertEquals(-0.27195613, optimizer.optimize(200, f, GoalType.MINIMIZE, -1.0, 0.2).getPoint(), 1.0e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102427);Assert.assertTrue(optimizer.getEvaluations() <= 50);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testQuinticMinStatistics() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edqifr2718();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testQuinticMinStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edqifr2718(){try{__CLR4_4_127012701lb90pe5p.R.inc(102428);
        // The function has local minima at -0.27195613 and 0.82221643.
        __CLR4_4_127012701lb90pe5p.R.inc(102429);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_127012701lb90pe5p.R.inc(102430);UnivariateOptimizer optimizer = new BrentOptimizer(1e-11, 1e-14);

        __CLR4_4_127012701lb90pe5p.R.inc(102431);final DescriptiveStatistics[] stat = new DescriptiveStatistics[2];
        __CLR4_4_127012701lb90pe5p.R.inc(102432);for (int i = 0; (((i < stat.length)&&(__CLR4_4_127012701lb90pe5p.R.iget(102433)!=0|true))||(__CLR4_4_127012701lb90pe5p.R.iget(102434)==0&false)); i++) {{
            __CLR4_4_127012701lb90pe5p.R.inc(102435);stat[i] = new DescriptiveStatistics();
        }

        }__CLR4_4_127012701lb90pe5p.R.inc(102436);final double min = -0.75;
        __CLR4_4_127012701lb90pe5p.R.inc(102437);final double max = 0.25;
        __CLR4_4_127012701lb90pe5p.R.inc(102438);final int nSamples = 200;
        __CLR4_4_127012701lb90pe5p.R.inc(102439);final double delta = (max - min) / nSamples;
        __CLR4_4_127012701lb90pe5p.R.inc(102440);for (int i = 0; (((i < nSamples)&&(__CLR4_4_127012701lb90pe5p.R.iget(102441)!=0|true))||(__CLR4_4_127012701lb90pe5p.R.iget(102442)==0&false)); i++) {{
            __CLR4_4_127012701lb90pe5p.R.inc(102443);final double start = min + i * delta;
            __CLR4_4_127012701lb90pe5p.R.inc(102444);stat[0].addValue(optimizer.optimize(40, f, GoalType.MINIMIZE, min, max, start).getPoint());
            __CLR4_4_127012701lb90pe5p.R.inc(102445);stat[1].addValue(optimizer.getEvaluations());
        }

        }__CLR4_4_127012701lb90pe5p.R.inc(102446);final double meanOptValue = stat[0].getMean();
        __CLR4_4_127012701lb90pe5p.R.inc(102447);final double medianEval = stat[1].getPercentile(50);
        __CLR4_4_127012701lb90pe5p.R.inc(102448);Assert.assertTrue(meanOptValue > -0.2719561281);
        __CLR4_4_127012701lb90pe5p.R.inc(102449);Assert.assertTrue(meanOptValue < -0.2719561280);
        __CLR4_4_127012701lb90pe5p.R.inc(102450);Assert.assertEquals(23, (int) medianEval);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testQuinticMax() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18sxom0271v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testQuinticMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18sxom0271v(){try{__CLR4_4_127012701lb90pe5p.R.inc(102451);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // The function has a local maximum at 0.27195613.
        __CLR4_4_127012701lb90pe5p.R.inc(102452);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_127012701lb90pe5p.R.inc(102453);UnivariateOptimizer optimizer = new BrentOptimizer(1e-12, 1e-14);
        __CLR4_4_127012701lb90pe5p.R.inc(102454);Assert.assertEquals(0.27195613, optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.2, 0.3).getPoint(), 1e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102455);try {
            __CLR4_4_127012701lb90pe5p.R.inc(102456);optimizer.optimize(5, f, GoalType.MAXIMIZE, 0.2, 0.3);
            __CLR4_4_127012701lb90pe5p.R.inc(102457);Assert.fail("an exception should have been thrown");
        } catch (TooManyEvaluationsException miee) {
            // expected
        }
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testMinEndpoints() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15drbt12722();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testMinEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15drbt12722(){try{__CLR4_4_127012701lb90pe5p.R.inc(102458);
        __CLR4_4_127012701lb90pe5p.R.inc(102459);UnivariateFunction f = new Sin();
        __CLR4_4_127012701lb90pe5p.R.inc(102460);UnivariateOptimizer optimizer = new BrentOptimizer(1e-8, 1e-14);

        // endpoint is minimum
        __CLR4_4_127012701lb90pe5p.R.inc(102461);double result = optimizer.optimize(50, f, GoalType.MINIMIZE, 3 * Math.PI / 2, 5).getPoint();
        __CLR4_4_127012701lb90pe5p.R.inc(102462);Assert.assertEquals(3 * Math.PI / 2, result, 1e-6);

        __CLR4_4_127012701lb90pe5p.R.inc(102463);result = optimizer.optimize(50, f, GoalType.MINIMIZE, 4, 3 * Math.PI / 2).getPoint();
        __CLR4_4_127012701lb90pe5p.R.inc(102464);Assert.assertEquals(3 * Math.PI / 2, result, 1e-6);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    @Test
    public void testMath832() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131en2c2729();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testMath832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131en2c2729(){try{__CLR4_4_127012701lb90pe5p.R.inc(102465);
        __CLR4_4_127012701lb90pe5p.R.inc(102466);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_127012701lb90pe5p.R.inc(102467);
                    __CLR4_4_127012701lb90pe5p.R.inc(102468);final double sqrtX = FastMath.sqrt(x);
                    __CLR4_4_127012701lb90pe5p.R.inc(102469);final double a = 1e2 * sqrtX;
                    __CLR4_4_127012701lb90pe5p.R.inc(102470);final double b = 1e6 / x;
                    __CLR4_4_127012701lb90pe5p.R.inc(102471);final double c = 1e4 / sqrtX;

                    __CLR4_4_127012701lb90pe5p.R.inc(102472);return a + b + c;
                }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}
            };

        __CLR4_4_127012701lb90pe5p.R.inc(102473);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-8);
        __CLR4_4_127012701lb90pe5p.R.inc(102474);final double result = optimizer.optimize(1483,
                                                 f,
                                                 GoalType.MINIMIZE,
                                                 Double.MIN_VALUE,
                                                 Double.MAX_VALUE).getPoint();

        __CLR4_4_127012701lb90pe5p.R.inc(102475);Assert.assertEquals(804.9355825, result, 1e-6);
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    /**
     * Contrived example showing that prior to the resolution of MATH-855
     * (second revision), the algorithm would not return the best point if
     * it happened to be the initial guess.
     */
    @Test
    public void testKeepInitIfBest() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhn51t272k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testKeepInitIfBest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhn51t272k(){try{__CLR4_4_127012701lb90pe5p.R.inc(102476);
        __CLR4_4_127012701lb90pe5p.R.inc(102477);final double minSin = 3 * Math.PI / 2;
        __CLR4_4_127012701lb90pe5p.R.inc(102478);final double offset = 1e-8;
        __CLR4_4_127012701lb90pe5p.R.inc(102479);final double delta = 1e-7;
        __CLR4_4_127012701lb90pe5p.R.inc(102480);final UnivariateFunction f1 = new Sin();
        __CLR4_4_127012701lb90pe5p.R.inc(102481);final UnivariateFunction f2 = new StepFunction(new double[] { minSin, minSin + offset, minSin + 2 * offset},
                                                       new double[] { 0, -1, 0 });
        __CLR4_4_127012701lb90pe5p.R.inc(102482);final UnivariateFunction f = FunctionUtils.add(f1, f2);
        // A slightly less stringent tolerance would make the test pass
        // even with the previous implementation.
        __CLR4_4_127012701lb90pe5p.R.inc(102483);final double relTol = 1e-8;
        __CLR4_4_127012701lb90pe5p.R.inc(102484);final UnivariateOptimizer optimizer = new BrentOptimizer(relTol, 1e-100);
        __CLR4_4_127012701lb90pe5p.R.inc(102485);final double init = minSin + 1.5 * offset;
        __CLR4_4_127012701lb90pe5p.R.inc(102486);final UnivariatePointValuePair result
            = optimizer.optimize(200, f, GoalType.MINIMIZE,
                                 minSin - 6.789 * delta,
                                 minSin + 9.876 * delta,
                                 init);
        __CLR4_4_127012701lb90pe5p.R.inc(102487);final int numEval = optimizer.getEvaluations();

        __CLR4_4_127012701lb90pe5p.R.inc(102488);final double sol = result.getPoint();
        __CLR4_4_127012701lb90pe5p.R.inc(102489);final double expected = init;

//         System.out.println("numEval=" + numEval);
//         System.out.println("min=" + init + " f=" + f.value(init));
//         System.out.println("sol=" + sol + " f=" + f.value(sol));
//         System.out.println("exp=" + expected + " f=" + f.value(expected));

        __CLR4_4_127012701lb90pe5p.R.inc(102490);Assert.assertTrue("Best point not reported", f.value(sol) <= f.value(expected));
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}

    /**
     * Contrived example showing that prior to the resolution of MATH-855,
     * the algorithm, by always returning the last evaluated point, would
     * sometimes not report the best point it had found.
     */
    @Test
    public void testMath855() {__CLR4_4_127012701lb90pe5p.R.globalSliceStart(getClass().getName(),102491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1170ajp272z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127012701lb90pe5p.R.rethrow($CLV_t2$);}finally{__CLR4_4_127012701lb90pe5p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.BrentOptimizerTest.testMath855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1170ajp272z(){try{__CLR4_4_127012701lb90pe5p.R.inc(102491);
        __CLR4_4_127012701lb90pe5p.R.inc(102492);final double minSin = 3 * Math.PI / 2;
        __CLR4_4_127012701lb90pe5p.R.inc(102493);final double offset = 1e-8;
        __CLR4_4_127012701lb90pe5p.R.inc(102494);final double delta = 1e-7;
        __CLR4_4_127012701lb90pe5p.R.inc(102495);final UnivariateFunction f1 = new Sin();
        __CLR4_4_127012701lb90pe5p.R.inc(102496);final UnivariateFunction f2 = new StepFunction(new double[] { minSin, minSin + offset, minSin + 5 * offset },
                                                       new double[] { 0, -1, 0 });
        __CLR4_4_127012701lb90pe5p.R.inc(102497);final UnivariateFunction f = FunctionUtils.add(f1, f2);
        __CLR4_4_127012701lb90pe5p.R.inc(102498);final UnivariateOptimizer optimizer = new BrentOptimizer(1e-8, 1e-100);
        __CLR4_4_127012701lb90pe5p.R.inc(102499);final UnivariatePointValuePair result
            = optimizer.optimize(200, f, GoalType.MINIMIZE,
                                 minSin - 6.789 * delta,
                                 minSin + 9.876 * delta);
        __CLR4_4_127012701lb90pe5p.R.inc(102500);final int numEval = optimizer.getEvaluations();

        __CLR4_4_127012701lb90pe5p.R.inc(102501);final double sol = result.getPoint();
        __CLR4_4_127012701lb90pe5p.R.inc(102502);final double expected = 4.712389027602411;

        // System.out.println("min=" + (minSin + offset) + " f=" + f.value(minSin + offset));
        // System.out.println("sol=" + sol + " f=" + f.value(sol));
        // System.out.println("exp=" + expected + " f=" + f.value(expected));

        __CLR4_4_127012701lb90pe5p.R.inc(102503);Assert.assertTrue("Best point not reported", f.value(sol) <= f.value(expected));
    }finally{__CLR4_4_127012701lb90pe5p.R.flushNeeded();}}
}
