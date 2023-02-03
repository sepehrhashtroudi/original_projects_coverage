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

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link BracketFinder}.
 */
public class BracketFinderTest {static class __CLR4_4_123uk23uklb90pdxk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCubicMin() {__CLR4_4_123uk23uklb90pdxk.R.globalSliceStart(getClass().getName(),98300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dts13z23uk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123uk23uklb90pdxk.R.rethrow($CLV_t2$);}finally{__CLR4_4_123uk23uklb90pdxk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BracketFinderTest.testCubicMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dts13z23uk(){try{__CLR4_4_123uk23uklb90pdxk.R.inc(98300);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98301);final BracketFinder bFind = new BracketFinder();
        __CLR4_4_123uk23uklb90pdxk.R.inc(98302);final UnivariateFunction func = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123uk23uklb90pdxk.R.inc(98303);
                    __CLR4_4_123uk23uklb90pdxk.R.inc(98304);if ((((x < -2)&&(__CLR4_4_123uk23uklb90pdxk.R.iget(98305)!=0|true))||(__CLR4_4_123uk23uklb90pdxk.R.iget(98306)==0&false))) {{
                        __CLR4_4_123uk23uklb90pdxk.R.inc(98307);return value(-2);
                    }
                    }else  {{
                        __CLR4_4_123uk23uklb90pdxk.R.inc(98308);return (x - 1) * (x + 2) * (x + 3);
                    }
                }}finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}
            };

        __CLR4_4_123uk23uklb90pdxk.R.inc(98309);bFind.search(func, GoalType.MINIMIZE, -2 , -1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98310);final double tol = 1e-15;
        // Comparing with results computed in Python.
        __CLR4_4_123uk23uklb90pdxk.R.inc(98311);Assert.assertEquals(-2, bFind.getLo(), tol);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98312);Assert.assertEquals(-1, bFind.getMid(), tol);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98313);Assert.assertEquals(0.61803399999999997, bFind.getHi(), tol);
    }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}

    @Test
    public void testCubicMax() {__CLR4_4_123uk23uklb90pdxk.R.globalSliceStart(getClass().getName(),98314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zbfm523uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123uk23uklb90pdxk.R.rethrow($CLV_t2$);}finally{__CLR4_4_123uk23uklb90pdxk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BracketFinderTest.testCubicMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zbfm523uy(){try{__CLR4_4_123uk23uklb90pdxk.R.inc(98314);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98315);final BracketFinder bFind = new BracketFinder();
        __CLR4_4_123uk23uklb90pdxk.R.inc(98316);final UnivariateFunction func = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123uk23uklb90pdxk.R.inc(98317);
                    __CLR4_4_123uk23uklb90pdxk.R.inc(98318);if ((((x < -2)&&(__CLR4_4_123uk23uklb90pdxk.R.iget(98319)!=0|true))||(__CLR4_4_123uk23uklb90pdxk.R.iget(98320)==0&false))) {{
                        __CLR4_4_123uk23uklb90pdxk.R.inc(98321);return value(-2);
                    }
                    }else  {{
                        __CLR4_4_123uk23uklb90pdxk.R.inc(98322);return -(x - 1) * (x + 2) * (x + 3);
                    }
                }}finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}
            };

        __CLR4_4_123uk23uklb90pdxk.R.inc(98323);bFind.search(func, GoalType.MAXIMIZE, -2 , -1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98324);final double tol = 1e-15;
        __CLR4_4_123uk23uklb90pdxk.R.inc(98325);Assert.assertEquals(-2, bFind.getLo(), tol);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98326);Assert.assertEquals(-1, bFind.getMid(), tol);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98327);Assert.assertEquals(0.61803399999999997, bFind.getHi(), tol);
    }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}

    @Test
    public void testMinimumIsOnIntervalBoundary() {__CLR4_4_123uk23uklb90pdxk.R.globalSliceStart(getClass().getName(),98328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qn4d723vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123uk23uklb90pdxk.R.rethrow($CLV_t2$);}finally{__CLR4_4_123uk23uklb90pdxk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BracketFinderTest.testMinimumIsOnIntervalBoundary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qn4d723vc(){try{__CLR4_4_123uk23uklb90pdxk.R.inc(98328);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98329);final UnivariateFunction func = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123uk23uklb90pdxk.R.inc(98330);
                    __CLR4_4_123uk23uklb90pdxk.R.inc(98331);return x * x;
                }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}
            };

        __CLR4_4_123uk23uklb90pdxk.R.inc(98332);final BracketFinder bFind = new BracketFinder();

        __CLR4_4_123uk23uklb90pdxk.R.inc(98333);bFind.search(func, GoalType.MINIMIZE, 0, 1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98334);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98335);Assert.assertTrue(0 <= bFind.getHi());

        __CLR4_4_123uk23uklb90pdxk.R.inc(98336);bFind.search(func, GoalType.MINIMIZE, -1, 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98337);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98338);Assert.assertTrue(0 <= bFind.getHi());
    }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}

    @Test
    public void testIntervalBoundsOrdering() {__CLR4_4_123uk23uklb90pdxk.R.globalSliceStart(getClass().getName(),98339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171r1rt23vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123uk23uklb90pdxk.R.rethrow($CLV_t2$);}finally{__CLR4_4_123uk23uklb90pdxk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.univariate.BracketFinderTest.testIntervalBoundsOrdering",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171r1rt23vn(){try{__CLR4_4_123uk23uklb90pdxk.R.inc(98339);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98340);final UnivariateFunction func = new UnivariateFunction() {
                public double value(double x) {try{__CLR4_4_123uk23uklb90pdxk.R.inc(98341);
                    __CLR4_4_123uk23uklb90pdxk.R.inc(98342);return x * x;
                }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}
            };

        __CLR4_4_123uk23uklb90pdxk.R.inc(98343);final BracketFinder bFind = new BracketFinder();

        __CLR4_4_123uk23uklb90pdxk.R.inc(98344);bFind.search(func, GoalType.MINIMIZE, -1, 1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98345);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98346);Assert.assertTrue(0 <= bFind.getHi());

        __CLR4_4_123uk23uklb90pdxk.R.inc(98347);bFind.search(func, GoalType.MINIMIZE, 1, -1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98348);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98349);Assert.assertTrue(0 <= bFind.getHi());

        __CLR4_4_123uk23uklb90pdxk.R.inc(98350);bFind.search(func, GoalType.MINIMIZE, 1, 2);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98351);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98352);Assert.assertTrue(0 <= bFind.getHi());

        __CLR4_4_123uk23uklb90pdxk.R.inc(98353);bFind.search(func, GoalType.MINIMIZE, 2, 1);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98354);Assert.assertTrue(bFind.getLo() <= 0);
        __CLR4_4_123uk23uklb90pdxk.R.inc(98355);Assert.assertTrue(0 <= bFind.getHi());
    }finally{__CLR4_4_123uk23uklb90pdxk.R.flushNeeded();}}
}
