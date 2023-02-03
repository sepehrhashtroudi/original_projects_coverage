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
s * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.stat.descriptive;

import java.util.ArrayList;
import java.util.List;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.distribution.IntegerDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link UnivariateStatistic} class.
 * @version $Id$
 */
public abstract class UnivariateStatisticAbstractTest {static class __CLR4_4_12b162b16lb90penw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107689,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected double mean = 12.404545454545455d;
    protected double geoMean = 12.070589161633011d;

    protected double var = 10.00235930735931d;
    protected double std = FastMath.sqrt(var);
    protected double skew = 1.437423729196190d;
    protected double kurt = 2.377191264804700d;

    protected double min = 8.2d;
    protected double max = 21d;
    protected double median = 12d;
    protected double percentile5 = 8.29d;
    protected double percentile95 = 20.82d;

    protected double product = 628096400563833396009676.9200400128d;
    protected double sumLog = 54.7969806116451507d;
    protected double sumSq = 3595.250d;
    protected double sum = 272.90d;
    protected double secondMoment = 210.04954545454547d;
    protected double thirdMoment = 868.0906859504136;
    protected double fourthMoment = 9244.080993773481;


    protected double weightedMean = 12.366995073891626d;
    protected double weightedVar =   9.974760968886391d;
    protected double weightedStd = FastMath.sqrt(weightedVar);
    protected double weightedProduct = 8517647448765288000000d;
    protected double weightedSum = 251.05d;

    protected double tolerance = 10E-12;

    protected double[] testArray =
        { 12.5, 12.0, 11.8, 14.2, 14.9, 14.5, 21.0,  8.2, 10.3, 11.3,
          14.1,  9.9, 12.2, 12.0, 12.1, 11.0, 19.8, 11.0, 10.0,  8.8,
           9.0, 12.3 };

    protected double[] testWeightsArray =
        {  1.5,  0.8,  1.2,  0.4,  0.8,  1.8,  1.2,  1.1,  1.0,  0.7,
           1.3,  0.6,  0.7,  1.3,  0.7,  1.0,  0.4,  0.1,  1.4,  0.9,
           1.1,  0.3 };

    protected double[] identicalWeightsArray =
        {  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,
           0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,  0.5,
           0.5,  0.5 };

    protected double[] unitWeightsArray =
        {  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,
           1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,
           1.0,  1.0 };

    public abstract UnivariateStatistic getUnivariateStatistic();

    public abstract double expectedValue();

    public double getTolerance() {try{__CLR4_4_12b162b16lb90penw.R.inc(107610);
        __CLR4_4_12b162b16lb90penw.R.inc(107611);return tolerance;
    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}

    @Test
    public void testEvaluation() {__CLR4_4_12b162b16lb90penw.R.globalSliceStart(getClass().getName(),107612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ku5xqj2b18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b162b16lb90penw.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b162b16lb90penw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest.testEvaluation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ku5xqj2b18(){try{__CLR4_4_12b162b16lb90penw.R.inc(107612);
        __CLR4_4_12b162b16lb90penw.R.inc(107613);Assert.assertEquals(
            expectedValue(),
            getUnivariateStatistic().evaluate(testArray),
            getTolerance());
    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}
    
    @Test
    public void testEvaluateArraySegment() {__CLR4_4_12b162b16lb90penw.R.globalSliceStart(getClass().getName(),107614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpzep82b1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b162b16lb90penw.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b162b16lb90penw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest.testEvaluateArraySegment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpzep82b1a(){try{__CLR4_4_12b162b16lb90penw.R.inc(107614);
        __CLR4_4_12b162b16lb90penw.R.inc(107615);final UnivariateStatistic stat = getUnivariateStatistic();
        __CLR4_4_12b162b16lb90penw.R.inc(107616);final double[] arrayZero = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107617);System.arraycopy(testArray, 0, arrayZero, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107618);Assert.assertEquals(stat.evaluate(arrayZero), stat.evaluate(testArray, 0, 5), 0);
        __CLR4_4_12b162b16lb90penw.R.inc(107619);final double[] arrayOne = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107620);System.arraycopy(testArray, 5, arrayOne, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107621);Assert.assertEquals(stat.evaluate(arrayOne), stat.evaluate(testArray, 5, 5), 0);
        __CLR4_4_12b162b16lb90penw.R.inc(107622);final double[] arrayEnd = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107623);System.arraycopy(testArray, testArray.length - 5, arrayEnd, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107624);Assert.assertEquals(stat.evaluate(arrayEnd), stat.evaluate(testArray, testArray.length - 5, 5), 0);
    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}
    
    @Test
    public void testEvaluateArraySegmentWeighted() {__CLR4_4_12b162b16lb90penw.R.globalSliceStart(getClass().getName(),107625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egazr12b1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b162b16lb90penw.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b162b16lb90penw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest.testEvaluateArraySegmentWeighted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egazr12b1l(){try{__CLR4_4_12b162b16lb90penw.R.inc(107625);
        // See if this statistic computes weighted statistics
        // If not, skip this test
        __CLR4_4_12b162b16lb90penw.R.inc(107626);UnivariateStatistic statistic = getUnivariateStatistic();
        __CLR4_4_12b162b16lb90penw.R.inc(107627);if ((((!(statistic instanceof WeightedEvaluation))&&(__CLR4_4_12b162b16lb90penw.R.iget(107628)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107629)==0&false))) {{
            __CLR4_4_12b162b16lb90penw.R.inc(107630);return;
        }
        }__CLR4_4_12b162b16lb90penw.R.inc(107631);final WeightedEvaluation stat = (WeightedEvaluation) getUnivariateStatistic();
        __CLR4_4_12b162b16lb90penw.R.inc(107632);final double[] arrayZero = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107633);final double[] weightZero = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107634);System.arraycopy(testArray, 0, arrayZero, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107635);System.arraycopy(testWeightsArray, 0, weightZero, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107636);Assert.assertEquals(stat.evaluate(arrayZero, weightZero),
                stat.evaluate(testArray, testWeightsArray, 0, 5), 0);
        __CLR4_4_12b162b16lb90penw.R.inc(107637);final double[] arrayOne = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107638);final double[] weightOne = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107639);System.arraycopy(testArray, 5, arrayOne, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107640);System.arraycopy(testWeightsArray, 5, weightOne, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107641);Assert.assertEquals(stat.evaluate(arrayOne, weightOne),
                stat.evaluate(testArray, testWeightsArray, 5, 5), 0);
        __CLR4_4_12b162b16lb90penw.R.inc(107642);final double[] arrayEnd = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107643);final double[] weightEnd = new double[5];
        __CLR4_4_12b162b16lb90penw.R.inc(107644);System.arraycopy(testArray, testArray.length - 5, arrayEnd, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107645);System.arraycopy(testWeightsArray, testArray.length - 5, weightEnd, 0, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107646);Assert.assertEquals(stat.evaluate(arrayEnd, weightEnd),
                stat.evaluate(testArray, testWeightsArray, testArray.length - 5, 5), 0);
    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_12b162b16lb90penw.R.globalSliceStart(getClass().getName(),107647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a2b27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b162b16lb90penw.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b162b16lb90penw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a2b27(){try{__CLR4_4_12b162b16lb90penw.R.inc(107647);
        __CLR4_4_12b162b16lb90penw.R.inc(107648);UnivariateStatistic original = getUnivariateStatistic();
        __CLR4_4_12b162b16lb90penw.R.inc(107649);UnivariateStatistic copy = original.copy();
        __CLR4_4_12b162b16lb90penw.R.inc(107650);Assert.assertEquals(
                expectedValue(),
                copy.evaluate(testArray),
                getTolerance());
    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}

    /**
     * Tests consistency of weighted statistic computation.
     * For statistics that support weighted evaluation, this test case compares
     * the result of direct computation on an array with repeated values with
     * a weighted computation on the corresponding (shorter) array with each
     * value appearing only once but with a weight value equal to its multiplicity
     * in the repeating array.
     */

    @Test
    public void testWeightedConsistency() {__CLR4_4_12b162b16lb90penw.R.globalSliceStart(getClass().getName(),107651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdkg7e2b2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b162b16lb90penw.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b162b16lb90penw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest.testWeightedConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdkg7e2b2b(){try{__CLR4_4_12b162b16lb90penw.R.inc(107651);

        // See if this statistic computes weighted statistics
        // If not, skip this test
        __CLR4_4_12b162b16lb90penw.R.inc(107652);UnivariateStatistic statistic = getUnivariateStatistic();
        __CLR4_4_12b162b16lb90penw.R.inc(107653);if ((((!(statistic instanceof WeightedEvaluation))&&(__CLR4_4_12b162b16lb90penw.R.iget(107654)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107655)==0&false))) {{
            __CLR4_4_12b162b16lb90penw.R.inc(107656);return;
        }

        // Create arrays of values and corresponding integral weights
        // and longer array with values repeated according to the weights
        }__CLR4_4_12b162b16lb90penw.R.inc(107657);final int len = 10;        // length of values array
        __CLR4_4_12b162b16lb90penw.R.inc(107658);final double mu = 0;       // mean of test data
        __CLR4_4_12b162b16lb90penw.R.inc(107659);final double sigma = 5;    // std dev of test data
        __CLR4_4_12b162b16lb90penw.R.inc(107660);double[] values = new double[len];
        __CLR4_4_12b162b16lb90penw.R.inc(107661);double[] weights = new double[len];

        // Fill weights array with random int values between 1 and 5
        __CLR4_4_12b162b16lb90penw.R.inc(107662);int[] intWeights = new int[len];
        __CLR4_4_12b162b16lb90penw.R.inc(107663);final IntegerDistribution weightDist = new UniformIntegerDistribution(1, 5);
        __CLR4_4_12b162b16lb90penw.R.inc(107664);for (int i = 0; (((i < len)&&(__CLR4_4_12b162b16lb90penw.R.iget(107665)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107666)==0&false)); i++) {{
            __CLR4_4_12b162b16lb90penw.R.inc(107667);intWeights[i] = weightDist.sample();
            __CLR4_4_12b162b16lb90penw.R.inc(107668);weights[i] = intWeights[i];
        }

        // Fill values array with random data from N(mu, sigma)
        // and fill valuesList with values from values array with
        // values[i] repeated weights[i] times, each i
        }__CLR4_4_12b162b16lb90penw.R.inc(107669);final RealDistribution valueDist = new NormalDistribution(mu, sigma);
        __CLR4_4_12b162b16lb90penw.R.inc(107670);List<Double> valuesList = new ArrayList<Double>();
        __CLR4_4_12b162b16lb90penw.R.inc(107671);for (int i = 0; (((i < len)&&(__CLR4_4_12b162b16lb90penw.R.iget(107672)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107673)==0&false)); i++) {{
            __CLR4_4_12b162b16lb90penw.R.inc(107674);double value = valueDist.sample();
            __CLR4_4_12b162b16lb90penw.R.inc(107675);values[i] = value;
            __CLR4_4_12b162b16lb90penw.R.inc(107676);for (int j = 0; (((j < intWeights[i])&&(__CLR4_4_12b162b16lb90penw.R.iget(107677)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107678)==0&false)); j++) {{
                __CLR4_4_12b162b16lb90penw.R.inc(107679);valuesList.add(new Double(value));
            }
        }}

        // Dump valuesList into repeatedValues array
        }__CLR4_4_12b162b16lb90penw.R.inc(107680);int sumWeights = valuesList.size();
        __CLR4_4_12b162b16lb90penw.R.inc(107681);double[] repeatedValues = new double[sumWeights];
        __CLR4_4_12b162b16lb90penw.R.inc(107682);for (int i = 0; (((i < sumWeights)&&(__CLR4_4_12b162b16lb90penw.R.iget(107683)!=0|true))||(__CLR4_4_12b162b16lb90penw.R.iget(107684)==0&false)); i++) {{
            __CLR4_4_12b162b16lb90penw.R.inc(107685);repeatedValues[i] = valuesList.get(i);
        }

        // Compare result of weighted statistic computation with direct computation
        // on array of repeated values
        }__CLR4_4_12b162b16lb90penw.R.inc(107686);WeightedEvaluation weightedStatistic = (WeightedEvaluation) statistic;
        __CLR4_4_12b162b16lb90penw.R.inc(107687);TestUtils.assertRelativelyEquals(statistic.evaluate(repeatedValues),
                weightedStatistic.evaluate(values, weights, 0, values.length),
                10E-12);

        // Check consistency of weighted evaluation methods
        __CLR4_4_12b162b16lb90penw.R.inc(107688);Assert.assertEquals(weightedStatistic.evaluate(values, weights, 0, values.length),
                weightedStatistic.evaluate(values, weights), Double.MIN_VALUE);

    }finally{__CLR4_4_12b162b16lb90penw.R.flushNeeded();}}

}
