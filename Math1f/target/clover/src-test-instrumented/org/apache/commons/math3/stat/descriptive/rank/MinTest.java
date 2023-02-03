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
package org.apache.commons.math3.stat.descriptive.rank;

import org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link UnivariateStatistic} class.
 * @version $Id$
 */
public class MinTest extends StorelessUnivariateStatisticAbstractTest{static class __CLR4_4_12bco2bcolb90peoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Min stat;

    /**
     * {@inheritDoc}
     */
    @Override
    public UnivariateStatistic getUnivariateStatistic() {try{__CLR4_4_12bco2bcolb90peoz.R.inc(108024);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108025);return new Min();
    }finally{__CLR4_4_12bco2bcolb90peoz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double expectedValue() {try{__CLR4_4_12bco2bcolb90peoz.R.inc(108026);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108027);return this.min;
    }finally{__CLR4_4_12bco2bcolb90peoz.R.flushNeeded();}}

    @Test
    public void testSpecialValues() {__CLR4_4_12bco2bcolb90peoz.R.globalSliceStart(getClass().getName(),108028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8kumo2bcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bco2bcolb90peoz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bco2bcolb90peoz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.MinTest.testSpecialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8kumo2bcs(){try{__CLR4_4_12bco2bcolb90peoz.R.inc(108028);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108029);double[] testArray = {0d, Double.NaN, Double.POSITIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        __CLR4_4_12bco2bcolb90peoz.R.inc(108030);Min min = new Min();
        __CLR4_4_12bco2bcolb90peoz.R.inc(108031);Assert.assertTrue(Double.isNaN(min.getResult()));
        __CLR4_4_12bco2bcolb90peoz.R.inc(108032);min.increment(testArray[0]);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108033);Assert.assertEquals(0d, min.getResult(), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108034);min.increment(testArray[1]);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108035);Assert.assertEquals(0d, min.getResult(), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108036);min.increment(testArray[2]);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108037);Assert.assertEquals(0d, min.getResult(), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108038);min.increment(testArray[3]);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108039);Assert.assertEquals(Double.NEGATIVE_INFINITY, min.getResult(), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108040);Assert.assertEquals(Double.NEGATIVE_INFINITY, min.evaluate(testArray), 0);
    }finally{__CLR4_4_12bco2bcolb90peoz.R.flushNeeded();}}

    @Test
    public void testNaNs() {__CLR4_4_12bco2bcolb90peoz.R.globalSliceStart(getClass().getName(),108041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7k2oh2bd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bco2bcolb90peoz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bco2bcolb90peoz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.MinTest.testNaNs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7k2oh2bd5(){try{__CLR4_4_12bco2bcolb90peoz.R.inc(108041);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108042);Min min = new Min();
        __CLR4_4_12bco2bcolb90peoz.R.inc(108043);double nan = Double.NaN;
        __CLR4_4_12bco2bcolb90peoz.R.inc(108044);Assert.assertEquals(2d, min.evaluate(new double[]{nan, 2d, 3d}), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108045);Assert.assertEquals(1d, min.evaluate(new double[]{1d, nan, 3d}), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108046);Assert.assertEquals(1d, min.evaluate(new double[]{1d, 2d, nan}), 0);
        __CLR4_4_12bco2bcolb90peoz.R.inc(108047);Assert.assertTrue(Double.isNaN(min.evaluate(new double[]{nan, nan, nan})));
    }finally{__CLR4_4_12bco2bcolb90peoz.R.flushNeeded();}}

}
