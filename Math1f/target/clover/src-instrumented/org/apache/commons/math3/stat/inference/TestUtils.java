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
package org.apache.commons.math3.stat.inference;

import java.util.Collection;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;

/**
 * A collection of static methods to create inference test instances or to
 * perform inference tests.
 *
 * @since 1.1
 * @version $Id$
 */
public class TestUtils  {static class __CLR4_4_1154e154elb90paqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Singleton TTest instance. */
    private static final TTest T_TEST = new TTest();

    /** Singleton ChiSquareTest instance. */
    private static final ChiSquareTest CHI_SQUARE_TEST = new ChiSquareTest();

    /** Singleton OneWayAnova instance. */
    private static final OneWayAnova ONE_WAY_ANANOVA = new OneWayAnova();

    /** Singleton G-Test instance. */
    private static final GTest G_TEST = new GTest();

    /**
     * Prevent instantiation.
     */
    private TestUtils() {
        super();__CLR4_4_1154e154elb90paqs.R.inc(53295);try{__CLR4_4_1154e154elb90paqs.R.inc(53294);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    // CHECKSTYLE: stop JavadocMethodCheck

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(double[], double[])
     */
    public static double homoscedasticT(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53296);
        __CLR4_4_1154e154elb90paqs.R.inc(53297);return T_TEST.homoscedasticT(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticT(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double homoscedasticT(final StatisticalSummary sampleStats1,
                                        final StatisticalSummary sampleStats2)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53298);
        __CLR4_4_1154e154elb90paqs.R.inc(53299);return T_TEST.homoscedasticT(sampleStats1, sampleStats2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[], double)
     */
    public static boolean homoscedasticTTest(final double[] sample1, final double[] sample2,
                                             final double alpha)
        throws NullArgumentException, NumberIsTooSmallException,
        OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53300);
        __CLR4_4_1154e154elb90paqs.R.inc(53301);return T_TEST.homoscedasticTTest(sample1, sample2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(double[], double[])
     */
    public static double homoscedasticTTest(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53302);
        __CLR4_4_1154e154elb90paqs.R.inc(53303);return T_TEST.homoscedasticTTest(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#homoscedasticTTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double homoscedasticTTest(final StatisticalSummary sampleStats1,
                                            final StatisticalSummary sampleStats2)
        throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53304);
        __CLR4_4_1154e154elb90paqs.R.inc(53305);return T_TEST.homoscedasticTTest(sampleStats1, sampleStats2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#pairedT(double[], double[])
     */
    public static double pairedT(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NoDataException,
        DimensionMismatchException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53306);
        __CLR4_4_1154e154elb90paqs.R.inc(53307);return T_TEST.pairedT(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[], double)
     */
    public static boolean pairedTTest(final double[] sample1, final double[] sample2,
                                      final double alpha)
        throws NullArgumentException, NoDataException, DimensionMismatchException,
        NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53308);
        __CLR4_4_1154e154elb90paqs.R.inc(53309);return T_TEST.pairedTTest(sample1, sample2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#pairedTTest(double[], double[])
     */
    public static double pairedTTest(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NoDataException, DimensionMismatchException,
        NumberIsTooSmallException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53310);
        __CLR4_4_1154e154elb90paqs.R.inc(53311);return T_TEST.pairedTTest(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#t(double, double[])
     */
    public static double t(final double mu, final double[] observed)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53312);
        __CLR4_4_1154e154elb90paqs.R.inc(53313);return T_TEST.t(mu, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#t(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double t(final double mu, final StatisticalSummary sampleStats)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53314);
        __CLR4_4_1154e154elb90paqs.R.inc(53315);return T_TEST.t(mu, sampleStats);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#t(double[], double[])
     */
    public static double t(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53316);
        __CLR4_4_1154e154elb90paqs.R.inc(53317);return T_TEST.t(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#t(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double t(final StatisticalSummary sampleStats1,
                           final StatisticalSummary sampleStats2)
        throws NullArgumentException, NumberIsTooSmallException {try{__CLR4_4_1154e154elb90paqs.R.inc(53318);
        __CLR4_4_1154e154elb90paqs.R.inc(53319);return T_TEST.t(sampleStats1, sampleStats2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[], double)
     */
    public static boolean tTest(final double mu, final double[] sample, final double alpha)
        throws NullArgumentException, NumberIsTooSmallException,
        OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53320);
        __CLR4_4_1154e154elb90paqs.R.inc(53321);return T_TEST.tTest(mu, sample, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, double[])
     */
    public static double tTest(final double mu, final double[] sample)
        throws NullArgumentException, NumberIsTooSmallException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53322);
        __CLR4_4_1154e154elb90paqs.R.inc(53323);return T_TEST.tTest(mu, sample);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)
     */
    public static boolean tTest(final double mu, final StatisticalSummary sampleStats,
                                final double alpha)
        throws NullArgumentException, NumberIsTooSmallException,
        OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53324);
        __CLR4_4_1154e154elb90paqs.R.inc(53325);return T_TEST.tTest(mu, sampleStats, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double tTest(final double mu, final StatisticalSummary sampleStats)
        throws NullArgumentException, NumberIsTooSmallException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53326);
        __CLR4_4_1154e154elb90paqs.R.inc(53327);return T_TEST.tTest(mu, sampleStats);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[], double)
     */
    public static boolean tTest(final double[] sample1, final double[] sample2,
                                final double alpha)
        throws NullArgumentException, NumberIsTooSmallException,
        OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53328);
        __CLR4_4_1154e154elb90paqs.R.inc(53329);return T_TEST.tTest(sample1, sample2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(double[], double[])
     */
    public static double tTest(final double[] sample1, final double[] sample2)
        throws NullArgumentException, NumberIsTooSmallException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53330);
        __CLR4_4_1154e154elb90paqs.R.inc(53331);return T_TEST.tTest(sample1, sample2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)
     */
    public static boolean tTest(final StatisticalSummary sampleStats1,
                                final StatisticalSummary sampleStats2,
                                final double alpha)
        throws NullArgumentException, NumberIsTooSmallException,
        OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53332);
        __CLR4_4_1154e154elb90paqs.R.inc(53333);return T_TEST.tTest(sampleStats1, sampleStats2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.TTest#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary)
     */
    public static double tTest(final StatisticalSummary sampleStats1,
                               final StatisticalSummary sampleStats2)
        throws NullArgumentException, NumberIsTooSmallException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53334);
        __CLR4_4_1154e154elb90paqs.R.inc(53335);return T_TEST.tTest(sampleStats1, sampleStats2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(double[], long[])
     */
    public static double chiSquare(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException {try{__CLR4_4_1154e154elb90paqs.R.inc(53336);
        __CLR4_4_1154e154elb90paqs.R.inc(53337);return CHI_SQUARE_TEST.chiSquare(expected, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquare(long[][])
     */
    public static double chiSquare(final long[][] counts)
        throws NullArgumentException, NotPositiveException,
        DimensionMismatchException {try{__CLR4_4_1154e154elb90paqs.R.inc(53338);
        __CLR4_4_1154e154elb90paqs.R.inc(53339);return CHI_SQUARE_TEST.chiSquare(counts);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[], double)
     */
    public static boolean chiSquareTest(final double[] expected, final long[] observed,
                                        final double alpha)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53340);
        __CLR4_4_1154e154elb90paqs.R.inc(53341);return CHI_SQUARE_TEST.chiSquareTest(expected, observed, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(double[], long[])
     */
    public static double chiSquareTest(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53342);
        __CLR4_4_1154e154elb90paqs.R.inc(53343);return CHI_SQUARE_TEST.chiSquareTest(expected, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][], double)
     */
    public static boolean chiSquareTest(final long[][] counts, final double alpha)
        throws NullArgumentException, DimensionMismatchException,
        NotPositiveException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53344);
        __CLR4_4_1154e154elb90paqs.R.inc(53345);return CHI_SQUARE_TEST.chiSquareTest(counts, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTest(long[][])
     */
    public static double chiSquareTest(final long[][] counts)
        throws NullArgumentException, DimensionMismatchException,
        NotPositiveException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53346);
        __CLR4_4_1154e154elb90paqs.R.inc(53347);return CHI_SQUARE_TEST.chiSquareTest(counts);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareDataSetsComparison(long[], long[])
     *
     * @since 1.2
     */
    public static double chiSquareDataSetsComparison(final long[] observed1,
                                                     final long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException {try{__CLR4_4_1154e154elb90paqs.R.inc(53348);
        __CLR4_4_1154e154elb90paqs.R.inc(53349);return CHI_SQUARE_TEST.chiSquareDataSetsComparison(observed1, observed2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[])
     *
     * @since 1.2
     */
    public static double chiSquareTestDataSetsComparison(final long[] observed1,
                                                         final long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53350);
        __CLR4_4_1154e154elb90paqs.R.inc(53351);return CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.ChiSquareTest#chiSquareTestDataSetsComparison(long[], long[], double)
     *
     * @since 1.2
     */
    public static boolean chiSquareTestDataSetsComparison(final long[] observed1,
                                                          final long[] observed2,
                                                          final double alpha)
        throws DimensionMismatchException, NotPositiveException,
        ZeroException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53352);
        __CLR4_4_1154e154elb90paqs.R.inc(53353);return CHI_SQUARE_TEST.chiSquareTestDataSetsComparison(observed1, observed2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaFValue(Collection)
     *
     * @since 1.2
     */
    public static double oneWayAnovaFValue(final Collection<double[]> categoryData)
        throws NullArgumentException, DimensionMismatchException {try{__CLR4_4_1154e154elb90paqs.R.inc(53354);
        __CLR4_4_1154e154elb90paqs.R.inc(53355);return ONE_WAY_ANANOVA.anovaFValue(categoryData);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaPValue(Collection)
     *
     * @since 1.2
     */
    public static double oneWayAnovaPValue(final Collection<double[]> categoryData)
        throws NullArgumentException, DimensionMismatchException,
        ConvergenceException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53356);
        __CLR4_4_1154e154elb90paqs.R.inc(53357);return ONE_WAY_ANANOVA.anovaPValue(categoryData);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.OneWayAnova#anovaTest(Collection,double)
     *
     * @since 1.2
     */
    public static boolean oneWayAnovaTest(final Collection<double[]> categoryData,
                                          final double alpha)
        throws NullArgumentException, DimensionMismatchException,
        OutOfRangeException, ConvergenceException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53358);
        __CLR4_4_1154e154elb90paqs.R.inc(53359);return ONE_WAY_ANANOVA.anovaTest(categoryData, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

     /**
     * @see org.apache.commons.math3.stat.inference.GTest#g(double[], long[])
     * @since 3.1
     */
    public static double g(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException {try{__CLR4_4_1154e154elb90paqs.R.inc(53360);
        __CLR4_4_1154e154elb90paqs.R.inc(53361);return G_TEST.g(expected, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.GTest#gTest( double[],  long[] )
     * @since 3.1
     */
    public static double gTest(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53362);
        __CLR4_4_1154e154elb90paqs.R.inc(53363);return G_TEST.gTest(expected, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.GTest#gTestIntrinsic(double[], long[] )
     * @since 3.1
     */
    public static double gTestIntrinsic(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53364);
        __CLR4_4_1154e154elb90paqs.R.inc(53365);return G_TEST.gTestIntrinsic(expected, observed);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

     /**
     * @see org.apache.commons.math3.stat.inference.GTest#gTest( double[],long[],double)
     * @since 3.1
     */
    public static boolean gTest(final double[] expected, final long[] observed,
                                final double alpha)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53366);
        __CLR4_4_1154e154elb90paqs.R.inc(53367);return G_TEST.gTest(expected, observed, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.GTest#gDataSetsComparison(long[], long[])
     * @since 3.1
     */
    public static double gDataSetsComparison(final long[] observed1,
                                                  final long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException {try{__CLR4_4_1154e154elb90paqs.R.inc(53368);
        __CLR4_4_1154e154elb90paqs.R.inc(53369);return G_TEST.gDataSetsComparison(observed1, observed2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.GTest#rootLogLikelihoodRatio(long, long, long, long)
     * @since 3.1
     */
    public static double rootLogLikelihoodRatio(final long k11, final long k12, final long k21, final long k22)
        throws DimensionMismatchException, NotPositiveException, ZeroException {try{__CLR4_4_1154e154elb90paqs.R.inc(53370);
        __CLR4_4_1154e154elb90paqs.R.inc(53371);return G_TEST.rootLogLikelihoodRatio(k11, k12, k21, k22);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}


    /**
     * @see org.apache.commons.math3.stat.inference.GTest#gTestDataSetsComparison(long[], long[])
     * @since 3.1
     */
    public static double gTestDataSetsComparison(final long[] observed1,
                                                        final long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException,
        MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53372);
        __CLR4_4_1154e154elb90paqs.R.inc(53373);return G_TEST.gTestDataSetsComparison(observed1, observed2);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    /**
     * @see org.apache.commons.math3.stat.inference.GTest#gTestDataSetsComparison(long[],long[],double)
     * @since 3.1
     */
    public static boolean gTestDataSetsComparison(final long[] observed1,
                                                  final long[] observed2,
                                                  final double alpha)
        throws DimensionMismatchException, NotPositiveException,
        ZeroException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_1154e154elb90paqs.R.inc(53374);
        __CLR4_4_1154e154elb90paqs.R.inc(53375);return G_TEST.gTestDataSetsComparison(observed1, observed2, alpha);
    }finally{__CLR4_4_1154e154elb90paqs.R.flushNeeded();}}

    // CHECKSTYLE: resume JavadocMethodCheck

}
