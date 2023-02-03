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
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.junit.Assert;
import org.junit.Test;

public class MultiStartUnivariateOptimizerTest {static class __CLR4_4_123zf23zflb90pdxy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=MathIllegalStateException.class)
    public void testMissingMaxEval() {__CLR4_4_123zf23zflb90pdxy.R.globalSliceStart(getClass().getName(),98475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pq9p7723zf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,115,115,105,110,103,77,97,120,69,118,97,108,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123zf23zflb90pdxy.R.rethrow($CLV_t2$);}finally{__CLR4_4_123zf23zflb90pdxy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest.testMissingMaxEval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pq9p7723zf(){try{__CLR4_4_123zf23zflb90pdxy.R.inc(98475);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98476);UnivariateOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98477);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98478);g.setSeed(44428400075l);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98479);MultiStartUnivariateOptimizer optimizer = new MultiStartUnivariateOptimizer(underlying, 10, g);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98480);optimizer.optimize(new UnivariateObjectiveFunction(new Sin()),
                           GoalType.MINIMIZE,
                           new SearchInterval(-1, 1));
    }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}
    @Test(expected=MathIllegalStateException.class)
    public void testMissingSearchInterval() {__CLR4_4_123zf23zflb90pdxy.R.globalSliceStart(getClass().getName(),98481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ireojc23zl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,115,115,105,110,103,83,101,97,114,99,104,73,110,116,101,114,118,97,108,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123zf23zflb90pdxy.R.rethrow($CLV_t2$);}finally{__CLR4_4_123zf23zflb90pdxy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest.testMissingSearchInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ireojc23zl(){try{__CLR4_4_123zf23zflb90pdxy.R.inc(98481);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98482);UnivariateOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98483);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98484);g.setSeed(44428400075l);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98485);MultiStartUnivariateOptimizer optimizer = new MultiStartUnivariateOptimizer(underlying, 10, g);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98486);optimizer.optimize(new MaxEval(300),
                           new UnivariateObjectiveFunction(new Sin()),
                           GoalType.MINIMIZE);
    }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}

    @Test
    public void testSinMin() {__CLR4_4_123zf23zflb90pdxy.R.globalSliceStart(getClass().getName(),98487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rif2vn23zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123zf23zflb90pdxy.R.rethrow($CLV_t2$);}finally{__CLR4_4_123zf23zflb90pdxy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest.testSinMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rif2vn23zr(){try{__CLR4_4_123zf23zflb90pdxy.R.inc(98487);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98488);UnivariateFunction f = new Sin();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98489);UnivariateOptimizer underlying = new BrentOptimizer(1e-10, 1e-14);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98490);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98491);g.setSeed(44428400075l);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98492);MultiStartUnivariateOptimizer optimizer = new MultiStartUnivariateOptimizer(underlying, 10, g);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98493);optimizer.optimize(new MaxEval(300),
                           new UnivariateObjectiveFunction(f),
                           GoalType.MINIMIZE,
                           new SearchInterval(-100.0, 100.0));
        __CLR4_4_123zf23zflb90pdxy.R.inc(98494);UnivariatePointValuePair[] optima = optimizer.getOptima();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98495);for (int i = 1; (((i < optima.length)&&(__CLR4_4_123zf23zflb90pdxy.R.iget(98496)!=0|true))||(__CLR4_4_123zf23zflb90pdxy.R.iget(98497)==0&false)); ++i) {{
            __CLR4_4_123zf23zflb90pdxy.R.inc(98498);double d = (optima[i].getPoint() - optima[i-1].getPoint()) / (2 * FastMath.PI);
            __CLR4_4_123zf23zflb90pdxy.R.inc(98499);Assert.assertTrue(FastMath.abs(d - FastMath.rint(d)) < 1.0e-8);
            __CLR4_4_123zf23zflb90pdxy.R.inc(98500);Assert.assertEquals(-1.0, f.value(optima[i].getPoint()), 1.0e-10);
            __CLR4_4_123zf23zflb90pdxy.R.inc(98501);Assert.assertEquals(f.value(optima[i].getPoint()), optima[i].getValue(), 1.0e-10);
        }
        }__CLR4_4_123zf23zflb90pdxy.R.inc(98502);Assert.assertTrue(optimizer.getEvaluations() > 200);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98503);Assert.assertTrue(optimizer.getEvaluations() < 300);
    }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}

    @Test
    public void testQuinticMin() {__CLR4_4_123zf23zflb90pdxy.R.globalSliceStart(getClass().getName(),98504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yh3462408();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123zf23zflb90pdxy.R.rethrow($CLV_t2$);}finally{__CLR4_4_123zf23zflb90pdxy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest.testQuinticMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yh3462408(){try{__CLR4_4_123zf23zflb90pdxy.R.inc(98504);
        // The quintic function has zeros at 0, +-0.5 and +-1.
        // The function has extrema (first derivative is zero) at 0.27195613 and 0.82221643,
        __CLR4_4_123zf23zflb90pdxy.R.inc(98505);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98506);UnivariateOptimizer underlying = new BrentOptimizer(1e-9, 1e-14);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98507);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98508);g.setSeed(4312000053L);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98509);MultiStartUnivariateOptimizer optimizer = new MultiStartUnivariateOptimizer(underlying, 5, g);

        __CLR4_4_123zf23zflb90pdxy.R.inc(98510);UnivariatePointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new UnivariateObjectiveFunction(f),
                                 GoalType.MINIMIZE,
                                 new SearchInterval(-0.3, -0.2));
        __CLR4_4_123zf23zflb90pdxy.R.inc(98511);Assert.assertEquals(-0.27195613, optimum.getPoint(), 1e-9);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98512);Assert.assertEquals(-0.0443342695, optimum.getValue(), 1e-9);

        __CLR4_4_123zf23zflb90pdxy.R.inc(98513);UnivariatePointValuePair[] optima = optimizer.getOptima();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98514);for (int i = 0; (((i < optima.length)&&(__CLR4_4_123zf23zflb90pdxy.R.iget(98515)!=0|true))||(__CLR4_4_123zf23zflb90pdxy.R.iget(98516)==0&false)); ++i) {{
            __CLR4_4_123zf23zflb90pdxy.R.inc(98517);Assert.assertEquals(f.value(optima[i].getPoint()), optima[i].getValue(), 1e-9);
        }
        }__CLR4_4_123zf23zflb90pdxy.R.inc(98518);Assert.assertTrue(optimizer.getEvaluations() >= 50);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98519);Assert.assertTrue(optimizer.getEvaluations() <= 100);
    }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}

    @Test
    public void testBadFunction() {__CLR4_4_123zf23zflb90pdxy.R.globalSliceStart(getClass().getName(),98520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxvs36240o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123zf23zflb90pdxy.R.rethrow($CLV_t2$);}finally{__CLR4_4_123zf23zflb90pdxy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest.testBadFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxvs36240o(){try{__CLR4_4_123zf23zflb90pdxy.R.inc(98520);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98521);UnivariateFunction f = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123zf23zflb90pdxy.R.inc(98522);
                    __CLR4_4_123zf23zflb90pdxy.R.inc(98523);if ((((x < 0)&&(__CLR4_4_123zf23zflb90pdxy.R.iget(98524)!=0|true))||(__CLR4_4_123zf23zflb90pdxy.R.iget(98525)==0&false))) {{
                        __CLR4_4_123zf23zflb90pdxy.R.inc(98526);throw new LocalException();
                    }
                    }__CLR4_4_123zf23zflb90pdxy.R.inc(98527);return 0;
                }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}
            };
        __CLR4_4_123zf23zflb90pdxy.R.inc(98528);UnivariateOptimizer underlying = new BrentOptimizer(1e-9, 1e-14);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98529);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_123zf23zflb90pdxy.R.inc(98530);g.setSeed(4312000053L);
        __CLR4_4_123zf23zflb90pdxy.R.inc(98531);MultiStartUnivariateOptimizer optimizer = new MultiStartUnivariateOptimizer(underlying, 5, g);
 
        __CLR4_4_123zf23zflb90pdxy.R.inc(98532);try {
            __CLR4_4_123zf23zflb90pdxy.R.inc(98533);optimizer.optimize(new MaxEval(300),
                               new UnivariateObjectiveFunction(f),
                               GoalType.MINIMIZE,
                               new SearchInterval(-0.3, -0.2));
            __CLR4_4_123zf23zflb90pdxy.R.inc(98534);Assert.fail();
        } catch (LocalException e) {
            // Expected.
        }

        // Ensure that the exception was thrown because no optimum was found.
        __CLR4_4_123zf23zflb90pdxy.R.inc(98535);Assert.assertTrue(optimizer.getOptima()[0] == null);
    }finally{__CLR4_4_123zf23zflb90pdxy.R.flushNeeded();}}

    private static class LocalException extends RuntimeException {
        private static final long serialVersionUID = 1194682757034350629L;
    }

}
