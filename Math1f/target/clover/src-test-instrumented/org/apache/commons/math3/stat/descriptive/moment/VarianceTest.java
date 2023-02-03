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
package org.apache.commons.math3.stat.descriptive.moment;

import org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatisticAbstractTest;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math3.util.MathArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link UnivariateStatistic} class.
 *
 * @version $Id$
 */
public class VarianceTest extends StorelessUnivariateStatisticAbstractTest{static class __CLR4_4_12b8v2b8vlb90peon{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Variance stat;

    /**
     * {@inheritDoc}
     */
    @Override
    public UnivariateStatistic getUnivariateStatistic() {try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107887);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107888);return new Variance();
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double expectedValue() {try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107889);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107890);return this.var;
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    /**Expected value for  the testArray defined in UnivariateStatisticAbstractTest */
    public double expectedWeightedValue() {try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107891);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107892);return this.weightedVar;
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    /**
     * Make sure Double.NaN is returned iff n = 0
     *
     */
    @Test
    public void testNaN() {__CLR4_4_12b8v2b8vlb90peon.R.globalSliceStart(getClass().getName(),107893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihm8g2b91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b8v2b8vlb90peon.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b8v2b8vlb90peon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihm8g2b91(){try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107893);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107894);StandardDeviation std = new StandardDeviation();
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107895);Assert.assertTrue(Double.isNaN(std.getResult()));
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107896);std.increment(1d);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107897);Assert.assertEquals(0d, std.getResult(), 0);
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    /**
     * Test population version of variance
     */
    @Test
    public void testPopulation() {__CLR4_4_12b8v2b8vlb90peon.R.globalSliceStart(getClass().getName(),107898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz9yqi2b96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b8v2b8vlb90peon.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b8v2b8vlb90peon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testPopulation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz9yqi2b96(){try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107898);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107899);double[] values = {-1.0d, 3.1d, 4.0d, -2.1d, 22d, 11.7d, 3d, 14d};
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107900);SecondMoment m = new SecondMoment();
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107901);m.evaluate(values);  // side effect is to add values
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107902);Variance v1 = new Variance();
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107903);v1.setBiasCorrected(false);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107904);Assert.assertEquals(populationVariance(values), v1.evaluate(values), 1E-14);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107905);v1.incrementAll(values);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107906);Assert.assertEquals(populationVariance(values), v1.getResult(), 1E-14);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107907);v1 = new Variance(false, m);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107908);Assert.assertEquals(populationVariance(values), v1.getResult(), 1E-14);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107909);v1 = new Variance(false);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107910);Assert.assertEquals(populationVariance(values), v1.evaluate(values), 1E-14);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107911);v1.incrementAll(values);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107912);Assert.assertEquals(populationVariance(values), v1.getResult(), 1E-14);
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    /**
     * Definitional formula for population variance
     */
    protected double populationVariance(double[] v) {try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107913);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107914);double mean = new Mean().evaluate(v);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107915);double sum = 0;
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107916);for (int i = 0; (((i < v.length)&&(__CLR4_4_12b8v2b8vlb90peon.R.iget(107917)!=0|true))||(__CLR4_4_12b8v2b8vlb90peon.R.iget(107918)==0&false)); i++) {{
           __CLR4_4_12b8v2b8vlb90peon.R.inc(107919);sum += (v[i] - mean) * (v[i] - mean);
        }
        }__CLR4_4_12b8v2b8vlb90peon.R.inc(107920);return sum / v.length;
    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

    @Test
    public void testWeightedVariance() {__CLR4_4_12b8v2b8vlb90peon.R.globalSliceStart(getClass().getName(),107921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17olish2b9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b8v2b8vlb90peon.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b8v2b8vlb90peon.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VarianceTest.testWeightedVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17olish2b9t(){try{__CLR4_4_12b8v2b8vlb90peon.R.inc(107921);
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107922);Variance variance = new Variance();
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107923);Assert.assertEquals(expectedWeightedValue(),
                variance.evaluate(testArray, testWeightsArray, 0, testArray.length), getTolerance());

        // All weights = 1 -> weighted variance = unweighted variance
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107924);Assert.assertEquals(expectedValue(),
                variance.evaluate(testArray, unitWeightsArray, 0, testArray.length), getTolerance());

        // All weights the same -> when weights are normalized to sum to the length of the values array,
        // weighted variance = unweighted value
        __CLR4_4_12b8v2b8vlb90peon.R.inc(107925);Assert.assertEquals(expectedValue(),
                variance.evaluate(testArray, MathArrays.normalizeArray(identicalWeightsArray, testArray.length),
                        0, testArray.length), getTolerance());

    }finally{__CLR4_4_12b8v2b8vlb90peon.R.flushNeeded();}}

}
