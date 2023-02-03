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
package org.apache.commons.math3.optim.univariate;


import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.StepFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * @version $Id$
 */
public final class BrentOptimizerTest {static class __CLR4_4_123w423w4lb90pdxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSinMin() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rif2vn23w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testSinMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rif2vn23w4(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98356);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98357);UnivariateFunction f = new Sin();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98358);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98359);Assert.assertEquals(3 * Math.PI / 2, optimizer.optimize(new MaxEval(200),
                                                                new UnivariateObjectiveFunction(f),
                                                                GoalType.MINIMIZE,
                                                                new SearchInterval(4, 5)).getPoint(), 1e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98360);Assert.assertTrue(optimizer.getEvaluations() <= 50);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98361);Assert.assertEquals(200, optimizer.getMaxEvaluations());
        __CLR4_4_123w423w4lb90pdxu.R.inc(98362);Assert.assertEquals(3 * Math.PI / 2, optimizer.optimize(new MaxEval(200),
                                                                new UnivariateObjectiveFunction(f),
                                                                GoalType.MINIMIZE,
                                                                new SearchInterval(1, 5)).getPoint(), 1e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98363);Assert.assertTrue(optimizer.getEvaluations() <= 100);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98364);Assert.assertTrue(optimizer.getEvaluations() >= 15);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98365);try {
            __CLR4_4_123w423w4lb90pdxu.R.inc(98366);optimizer.optimize(new MaxEval(10),
                               new UnivariateObjectiveFunction(f),
                               GoalType.MINIMIZE,
                               new SearchInterval(4, 5));
            __CLR4_4_123w423w4lb90pdxu.R.inc(98367);Assert.fail("an exception should have been thrown");
        } catch (TooManyEvaluationsException fee) {
            // expected
        }
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testSinMinWithValueChecker() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15afj1923wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testSinMinWithValueChecker",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15afj1923wg(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98368);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98369);final UnivariateFunction f = new Sin();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98370);final ConvergenceChecker<UnivariatePointValuePair> checker = new SimpleUnivariateValueChecker(1e-5, 1e-14);
        // The default stopping criterion of Brent's algorithm should not
        // pass, but the search will stop at the given relative tolerance
        // for the function value.
        __CLR4_4_123w423w4lb90pdxu.R.inc(98371);final UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98372);final UnivariatePointValuePair result = optimizer.optimize(new MaxEval(200),
                                                                   new UnivariateObjectiveFunction(f),
                                                                   GoalType.MINIMIZE,
                                                                   new SearchInterval(4, 5));
        __CLR4_4_123w423w4lb90pdxu.R.inc(98373);Assert.assertEquals(3 * Math.PI / 2, result.getPoint(), 1e-3);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testBoundaries() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq6923wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq6923wm(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98374);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98375);final double lower = -1.0;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98376);final double upper = +1.0;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98377);UnivariateFunction f = new UnivariateFunction() {            
            public double value(double x) {try{__CLR4_4_123w423w4lb90pdxu.R.inc(98378);
                __CLR4_4_123w423w4lb90pdxu.R.inc(98379);if ((((x < lower)&&(__CLR4_4_123w423w4lb90pdxu.R.iget(98380)!=0|true))||(__CLR4_4_123w423w4lb90pdxu.R.iget(98381)==0&false))) {{
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98382);throw new NumberIsTooSmallException(x, lower, true);
                } }else {__CLR4_4_123w423w4lb90pdxu.R.inc(98383);if ((((x > upper)&&(__CLR4_4_123w423w4lb90pdxu.R.iget(98384)!=0|true))||(__CLR4_4_123w423w4lb90pdxu.R.iget(98385)==0&false))) {{
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98386);throw new NumberIsTooLargeException(x, upper, true);
                } }else {{
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98387);return x;
                }
            }}}finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}
        };
        __CLR4_4_123w423w4lb90pdxu.R.inc(98388);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98389);Assert.assertEquals(lower,
                            optimizer.optimize(new MaxEval(100),
                                               new UnivariateObjectiveFunction(f),
                                               GoalType.MINIMIZE,
                                               new SearchInterval(lower, upper)).getPoint(),
                            1.0e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98390);Assert.assertEquals(upper,
                            optimizer.optimize(new MaxEval(100),
                                               new UnivariateObjectiveFunction(f),
                                               GoalType.MAXIMIZE,
                                               new SearchInterval(lower, upper)).getPoint(),
                            1.0e-8);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testQuinticMin() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yh34623x3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testQuinticMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yh34623x3(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98391);
        // The function has local minima at -0.27195613 and 0.82221643.
        __CLR4_4_123w423w4lb90pdxu.R.inc(98392);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98393);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98394);Assert.assertEquals(-0.27195613, optimizer.optimize(new MaxEval(200),
                                                            new UnivariateObjectiveFunction(f),
                                                            GoalType.MINIMIZE,
                                                            new SearchInterval(-0.3, -0.2)).getPoint(), 1.0e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98395);Assert.assertEquals( 0.82221643, optimizer.optimize(new MaxEval(200),
                                                            new UnivariateObjectiveFunction(f),
                                                            GoalType.MINIMIZE,
                                                            new SearchInterval(0.3,  0.9)).getPoint(), 1.0e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98396);Assert.assertTrue(optimizer.getEvaluations() <= 50);

        // search in a large interval
        __CLR4_4_123w423w4lb90pdxu.R.inc(98397);Assert.assertEquals(-0.27195613, optimizer.optimize(new MaxEval(200),
                                                            new UnivariateObjectiveFunction(f),
                                                            GoalType.MINIMIZE,
                                                            new SearchInterval(-1.0, 0.2)).getPoint(), 1.0e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98398);Assert.assertTrue(optimizer.getEvaluations() <= 50);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testQuinticMinStatistics() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1edqifr23xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testQuinticMinStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1edqifr23xb(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98399);
        // The function has local minima at -0.27195613 and 0.82221643.
        __CLR4_4_123w423w4lb90pdxu.R.inc(98400);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98401);UnivariateOptimizer optimizer = new BrentOptimizer(1e-11, 1e-14);

        __CLR4_4_123w423w4lb90pdxu.R.inc(98402);final DescriptiveStatistics[] stat = new DescriptiveStatistics[2];
        __CLR4_4_123w423w4lb90pdxu.R.inc(98403);for (int i = 0; (((i < stat.length)&&(__CLR4_4_123w423w4lb90pdxu.R.iget(98404)!=0|true))||(__CLR4_4_123w423w4lb90pdxu.R.iget(98405)==0&false)); i++) {{
            __CLR4_4_123w423w4lb90pdxu.R.inc(98406);stat[i] = new DescriptiveStatistics();
        }

        }__CLR4_4_123w423w4lb90pdxu.R.inc(98407);final double min = -0.75;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98408);final double max = 0.25;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98409);final int nSamples = 200;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98410);final double delta = (max - min) / nSamples;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98411);for (int i = 0; (((i < nSamples)&&(__CLR4_4_123w423w4lb90pdxu.R.iget(98412)!=0|true))||(__CLR4_4_123w423w4lb90pdxu.R.iget(98413)==0&false)); i++) {{
            __CLR4_4_123w423w4lb90pdxu.R.inc(98414);final double start = min + i * delta;
            __CLR4_4_123w423w4lb90pdxu.R.inc(98415);stat[0].addValue(optimizer.optimize(new MaxEval(40),
                                                new UnivariateObjectiveFunction(f),
                                                GoalType.MINIMIZE,
                                                new SearchInterval(min, max, start)).getPoint());
            __CLR4_4_123w423w4lb90pdxu.R.inc(98416);stat[1].addValue(optimizer.getEvaluations());
        }

        }__CLR4_4_123w423w4lb90pdxu.R.inc(98417);final double meanOptValue = stat[0].getMean();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98418);final double medianEval = stat[1].getPercentile(50);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98419);Assert.assertTrue(meanOptValue > -0.2719561281);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98420);Assert.assertTrue(meanOptValue < -0.2719561280);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98421);Assert.assertEquals(23, (int) medianEval);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testQuinticMax() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18sxom023xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testQuinticMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18sxom023xy(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98422);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // The function has a local maximum at 0.27195613.
        __CLR4_4_123w423w4lb90pdxu.R.inc(98423);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98424);UnivariateOptimizer optimizer = new BrentOptimizer(1e-12, 1e-14);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98425);Assert.assertEquals(0.27195613, optimizer.optimize(new MaxEval(100),
                                                           new UnivariateObjectiveFunction(f),
                                                           GoalType.MAXIMIZE,
                                                           new SearchInterval(0.2, 0.3)).getPoint(), 1e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98426);try {
            __CLR4_4_123w423w4lb90pdxu.R.inc(98427);optimizer.optimize(new MaxEval(5),
                               new UnivariateObjectiveFunction(f),
                               GoalType.MAXIMIZE,
                               new SearchInterval(0.2, 0.3));
            __CLR4_4_123w423w4lb90pdxu.R.inc(98428);Assert.fail("an exception should have been thrown");
        } catch (TooManyEvaluationsException miee) {
            // expected
        }
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testMinEndpoints() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15drbt123y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testMinEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15drbt123y5(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98429);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98430);UnivariateFunction f = new Sin();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98431);UnivariateOptimizer optimizer = new BrentOptimizer(1e-8, 1e-14);

        // endpoint is minimum
        __CLR4_4_123w423w4lb90pdxu.R.inc(98432);double result = optimizer.optimize(new MaxEval(50),
                                           new UnivariateObjectiveFunction(f),
                                           GoalType.MINIMIZE,
                                           new SearchInterval(3 * Math.PI / 2, 5)).getPoint();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98433);Assert.assertEquals(3 * Math.PI / 2, result, 1e-6);

        __CLR4_4_123w423w4lb90pdxu.R.inc(98434);result = optimizer.optimize(new MaxEval(50),
                                    new UnivariateObjectiveFunction(f),
                                    GoalType.MINIMIZE,
                                    new SearchInterval(4, 3 * Math.PI / 2)).getPoint();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98435);Assert.assertEquals(3 * Math.PI / 2, result, 1e-6);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    @Test
    public void testMath832() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131en2c23yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testMath832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131en2c23yc(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98436);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98437);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123w423w4lb90pdxu.R.inc(98438);
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98439);final double sqrtX = FastMath.sqrt(x);
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98440);final double a = 1e2 * sqrtX;
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98441);final double b = 1e6 / x;
                    __CLR4_4_123w423w4lb90pdxu.R.inc(98442);final double c = 1e4 / sqrtX;

                    __CLR4_4_123w423w4lb90pdxu.R.inc(98443);return a + b + c;
                }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}
            };

        __CLR4_4_123w423w4lb90pdxu.R.inc(98444);UnivariateOptimizer optimizer = new BrentOptimizer(1e-10, 1e-8);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98445);final double result = optimizer.optimize(new MaxEval(1483),
                                                 new UnivariateObjectiveFunction(f),
                                                 GoalType.MINIMIZE,
                                                 new SearchInterval(Double.MIN_VALUE,
                                                                    Double.MAX_VALUE)).getPoint();

        __CLR4_4_123w423w4lb90pdxu.R.inc(98446);Assert.assertEquals(804.9355825, result, 1e-6);
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    /**
     * Contrived example showing that prior to the resolution of MATH-855
     * (second revision), the algorithm would not return the best point if
     * it happened to be the initial guess.
     */
    @Test
    public void testKeepInitIfBest() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhn51t23yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testKeepInitIfBest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhn51t23yn(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98447);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98448);final double minSin = 3 * Math.PI / 2;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98449);final double offset = 1e-8;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98450);final double delta = 1e-7;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98451);final UnivariateFunction f1 = new Sin();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98452);final UnivariateFunction f2 = new StepFunction(new double[] { minSin, minSin + offset, minSin + 2 * offset},
                                                       new double[] { 0, -1, 0 });
        __CLR4_4_123w423w4lb90pdxu.R.inc(98453);final UnivariateFunction f = FunctionUtils.add(f1, f2);
        // A slightly less stringent tolerance would make the test pass
        // even with the previous implementation.
        __CLR4_4_123w423w4lb90pdxu.R.inc(98454);final double relTol = 1e-8;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98455);final UnivariateOptimizer optimizer = new BrentOptimizer(relTol, 1e-100);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98456);final double init = minSin + 1.5 * offset;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98457);final UnivariatePointValuePair result
            = optimizer.optimize(new MaxEval(200),
                                 new UnivariateObjectiveFunction(f),
                                 GoalType.MINIMIZE,
                                 new SearchInterval(minSin - 6.789 * delta,
                                                    minSin + 9.876 * delta,
                                                    init));
        __CLR4_4_123w423w4lb90pdxu.R.inc(98458);final int numEval = optimizer.getEvaluations();

        __CLR4_4_123w423w4lb90pdxu.R.inc(98459);final double sol = result.getPoint();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98460);final double expected = init;

//         System.out.println("numEval=" + numEval);
//         System.out.println("min=" + init + " f=" + f.value(init));
//         System.out.println("sol=" + sol + " f=" + f.value(sol));
//         System.out.println("exp=" + expected + " f=" + f.value(expected));

        __CLR4_4_123w423w4lb90pdxu.R.inc(98461);Assert.assertTrue("Best point not reported", f.value(sol) <= f.value(expected));
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}

    /**
     * Contrived example showing that prior to the resolution of MATH-855,
     * the algorithm, by always returning the last evaluated point, would
     * sometimes not report the best point it had found.
     */
    @Test
    public void testMath855() {__CLR4_4_123w423w4lb90pdxu.R.globalSliceStart(getClass().getName(),98462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1170ajp23z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123w423w4lb90pdxu.R.rethrow($CLV_t2$);}finally{__CLR4_4_123w423w4lb90pdxu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BrentOptimizerTest.testMath855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1170ajp23z2(){try{__CLR4_4_123w423w4lb90pdxu.R.inc(98462);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98463);final double minSin = 3 * Math.PI / 2;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98464);final double offset = 1e-8;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98465);final double delta = 1e-7;
        __CLR4_4_123w423w4lb90pdxu.R.inc(98466);final UnivariateFunction f1 = new Sin();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98467);final UnivariateFunction f2 = new StepFunction(new double[] { minSin, minSin + offset, minSin + 5 * offset },
                                                       new double[] { 0, -1, 0 });
        __CLR4_4_123w423w4lb90pdxu.R.inc(98468);final UnivariateFunction f = FunctionUtils.add(f1, f2);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98469);final UnivariateOptimizer optimizer = new BrentOptimizer(1e-8, 1e-100);
        __CLR4_4_123w423w4lb90pdxu.R.inc(98470);final UnivariatePointValuePair result
            = optimizer.optimize(new MaxEval(200),
                                 new UnivariateObjectiveFunction(f),
                                 GoalType.MINIMIZE,
                                 new SearchInterval(minSin - 6.789 * delta,
                                                    minSin + 9.876 * delta));
        __CLR4_4_123w423w4lb90pdxu.R.inc(98471);final int numEval = optimizer.getEvaluations();

        __CLR4_4_123w423w4lb90pdxu.R.inc(98472);final double sol = result.getPoint();
        __CLR4_4_123w423w4lb90pdxu.R.inc(98473);final double expected = 4.712389027602411;

        // System.out.println("min=" + (minSin + offset) + " f=" + f.value(minSin + offset));
        // System.out.println("sol=" + sol + " f=" + f.value(sol));
        // System.out.println("exp=" + expected + " f=" + f.value(expected));

        __CLR4_4_123w423w4lb90pdxu.R.inc(98474);Assert.assertTrue("Best point not reported", f.value(sol) <= f.value(expected));
    }finally{__CLR4_4_123w423w4lb90pdxu.R.flushNeeded();}}
}
