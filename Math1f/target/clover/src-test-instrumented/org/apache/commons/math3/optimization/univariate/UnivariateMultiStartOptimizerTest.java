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
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class UnivariateMultiStartOptimizerTest {static class __CLR4_4_1273s273slb90pe5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,102569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSinMin() {__CLR4_4_1273s273slb90pe5u.R.globalSliceStart(getClass().getName(),102520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rif2vn273s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1273s273slb90pe5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1273s273slb90pe5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest.testSinMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rif2vn273s(){try{__CLR4_4_1273s273slb90pe5u.R.inc(102520);
        __CLR4_4_1273s273slb90pe5u.R.inc(102521);UnivariateFunction f = new Sin();
        __CLR4_4_1273s273slb90pe5u.R.inc(102522);UnivariateOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_1273s273slb90pe5u.R.inc(102523);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1273s273slb90pe5u.R.inc(102524);g.setSeed(44428400075l);
        __CLR4_4_1273s273slb90pe5u.R.inc(102525);UnivariateMultiStartOptimizer<UnivariateFunction> optimizer =
            new UnivariateMultiStartOptimizer<UnivariateFunction>(underlying, 10, g);
        __CLR4_4_1273s273slb90pe5u.R.inc(102526);optimizer.optimize(300, f, GoalType.MINIMIZE, -100.0, 100.0);
        __CLR4_4_1273s273slb90pe5u.R.inc(102527);UnivariatePointValuePair[] optima = optimizer.getOptima();
        __CLR4_4_1273s273slb90pe5u.R.inc(102528);for (int i = 1; (((i < optima.length)&&(__CLR4_4_1273s273slb90pe5u.R.iget(102529)!=0|true))||(__CLR4_4_1273s273slb90pe5u.R.iget(102530)==0&false)); ++i) {{
            __CLR4_4_1273s273slb90pe5u.R.inc(102531);double d = (optima[i].getPoint() - optima[i-1].getPoint()) / (2 * FastMath.PI);
            __CLR4_4_1273s273slb90pe5u.R.inc(102532);Assert.assertTrue(FastMath.abs(d - FastMath.rint(d)) < 1.0e-8);
            __CLR4_4_1273s273slb90pe5u.R.inc(102533);Assert.assertEquals(-1.0, f.value(optima[i].getPoint()), 1.0e-10);
            __CLR4_4_1273s273slb90pe5u.R.inc(102534);Assert.assertEquals(f.value(optima[i].getPoint()), optima[i].getValue(), 1.0e-10);
        }
        }__CLR4_4_1273s273slb90pe5u.R.inc(102535);Assert.assertTrue(optimizer.getEvaluations() > 200);
        __CLR4_4_1273s273slb90pe5u.R.inc(102536);Assert.assertTrue(optimizer.getEvaluations() < 300);
    }finally{__CLR4_4_1273s273slb90pe5u.R.flushNeeded();}}

    @Test
    public void testQuinticMin() {__CLR4_4_1273s273slb90pe5u.R.globalSliceStart(getClass().getName(),102537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yh3462749();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1273s273slb90pe5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1273s273slb90pe5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest.testQuinticMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yh3462749(){try{__CLR4_4_1273s273slb90pe5u.R.inc(102537);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // The function has extrema (first derivative is zero) at 0.27195613 and 0.82221643,
        __CLR4_4_1273s273slb90pe5u.R.inc(102538);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_1273s273slb90pe5u.R.inc(102539);UnivariateOptimizer underlying = new BrentOptimizer(1e-9, 1e-14);
        __CLR4_4_1273s273slb90pe5u.R.inc(102540);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1273s273slb90pe5u.R.inc(102541);g.setSeed(4312000053L);
        __CLR4_4_1273s273slb90pe5u.R.inc(102542);UnivariateMultiStartOptimizer<UnivariateFunction> optimizer =
            new UnivariateMultiStartOptimizer<UnivariateFunction>(underlying, 5, g);

        __CLR4_4_1273s273slb90pe5u.R.inc(102543);UnivariatePointValuePair optimum
            = optimizer.optimize(300, f, GoalType.MINIMIZE, -0.3, -0.2);
        __CLR4_4_1273s273slb90pe5u.R.inc(102544);Assert.assertEquals(-0.2719561293, optimum.getPoint(), 1e-9);
        __CLR4_4_1273s273slb90pe5u.R.inc(102545);Assert.assertEquals(-0.0443342695, optimum.getValue(), 1e-9);

        __CLR4_4_1273s273slb90pe5u.R.inc(102546);UnivariatePointValuePair[] optima = optimizer.getOptima();
        __CLR4_4_1273s273slb90pe5u.R.inc(102547);for (int i = 0; (((i < optima.length)&&(__CLR4_4_1273s273slb90pe5u.R.iget(102548)!=0|true))||(__CLR4_4_1273s273slb90pe5u.R.iget(102549)==0&false)); ++i) {{
            __CLR4_4_1273s273slb90pe5u.R.inc(102550);Assert.assertEquals(f.value(optima[i].getPoint()), optima[i].getValue(), 1e-9);
        }
        }__CLR4_4_1273s273slb90pe5u.R.inc(102551);Assert.assertTrue(optimizer.getEvaluations() >= 50);
        __CLR4_4_1273s273slb90pe5u.R.inc(102552);Assert.assertTrue(optimizer.getEvaluations() <= 100);
    }finally{__CLR4_4_1273s273slb90pe5u.R.flushNeeded();}}

    @Test
    public void testBadFunction() {__CLR4_4_1273s273slb90pe5u.R.globalSliceStart(getClass().getName(),102553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxvs36274p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1273s273slb90pe5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1273s273slb90pe5u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest.testBadFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxvs36274p(){try{__CLR4_4_1273s273slb90pe5u.R.inc(102553);
        __CLR4_4_1273s273slb90pe5u.R.inc(102554);UnivariateFunction f = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_1273s273slb90pe5u.R.inc(102555);
                    __CLR4_4_1273s273slb90pe5u.R.inc(102556);if ((((x < 0)&&(__CLR4_4_1273s273slb90pe5u.R.iget(102557)!=0|true))||(__CLR4_4_1273s273slb90pe5u.R.iget(102558)==0&false))) {{
                        __CLR4_4_1273s273slb90pe5u.R.inc(102559);throw new LocalException();
                    }
                    }__CLR4_4_1273s273slb90pe5u.R.inc(102560);return 0;
                }finally{__CLR4_4_1273s273slb90pe5u.R.flushNeeded();}}
            };
        __CLR4_4_1273s273slb90pe5u.R.inc(102561);UnivariateOptimizer underlying = new BrentOptimizer(1e-9, 1e-14);
        __CLR4_4_1273s273slb90pe5u.R.inc(102562);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1273s273slb90pe5u.R.inc(102563);g.setSeed(4312000053L);
        __CLR4_4_1273s273slb90pe5u.R.inc(102564);UnivariateMultiStartOptimizer<UnivariateFunction> optimizer =
            new UnivariateMultiStartOptimizer<UnivariateFunction>(underlying, 5, g);
 
        __CLR4_4_1273s273slb90pe5u.R.inc(102565);try {
            __CLR4_4_1273s273slb90pe5u.R.inc(102566);optimizer.optimize(300, f, GoalType.MINIMIZE, -0.3, -0.2);
            __CLR4_4_1273s273slb90pe5u.R.inc(102567);Assert.fail();
        } catch (LocalException e) {
            // Expected.
        }

        // Ensure that the exception was thrown because no optimum was found.
        __CLR4_4_1273s273slb90pe5u.R.inc(102568);Assert.assertTrue(optimizer.getOptima()[0] == null);
    }finally{__CLR4_4_1273s273slb90pe5u.R.flushNeeded();}}

    private static class LocalException extends RuntimeException {
        private static final long serialVersionUID = 1194682757034350629L;
    }

}
