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
package org.apache.commons.math3;

import java.util.Random;
import java.util.concurrent.Callable;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Simple benchmarking utilities.
 */
public class PerfTestUtils {static class __CLR4_4_11bni1bnilb90pbqc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,61835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Nanoseconds to milliseconds conversion factor ({@value}). */
    public static final double NANO_TO_MILLI = 1e-6;
    /** Default number of code repeat per timed block. */
    private static final int DEFAULT_REPEAT_CHUNK = 1000;
    /** Default number of code repeats for computing the average run time. */
    private static final int DEFAULT_REPEAT_STAT = 10000;
    /** RNG. */
    private static Random rng = new Random();

    /**
     * Timing.
     *
     * @param repeatChunk Each timing measurement will done done for that
     * number of repeats of the code.
     * @param repeatStat Timing will be averaged over that number of runs.
     * @param runGC Call {@code System.gc()} between each timed block. When
     * set to {@code true}, the test will run much slower.
     * @param methods Codes being timed.
     * @return for each of the given {@code methods}, a
     * {@link StatisticalSummary} of the average times (in milliseconds)
     * taken by a single call to the {@code call} method (i.e. the time
     * taken by each timed block divided by {@code repeatChunk}).
     */
    public static StatisticalSummary[] time(int repeatChunk,
                                            int repeatStat,
                                            boolean runGC,
                                            Callable<Double> ... methods) {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61758);
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61759);final double[][][] times = timesAndResults(repeatChunk,
                                                   repeatStat,
                                                   runGC,
                                                   methods);

        __CLR4_4_11bni1bnilb90pbqc.R.inc(61760);final int len = methods.length;
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61761);final StatisticalSummary[] stats = new StatisticalSummary[len];
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61762);for (int j = 0; (((j < len)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61763)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61764)==0&false)); j++) {{
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61765);final SummaryStatistics s = new SummaryStatistics();
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61766);for (int k = 0; (((k < repeatStat)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61767)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61768)==0&false)); k++) {{
                __CLR4_4_11bni1bnilb90pbqc.R.inc(61769);s.addValue(times[j][k][0]);
            }
            }__CLR4_4_11bni1bnilb90pbqc.R.inc(61770);stats[j] = s.getSummary();
        }

        }__CLR4_4_11bni1bnilb90pbqc.R.inc(61771);return stats;
    }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

    /**
     * Timing.
     *
     * @param repeatChunk Each timing measurement will done done for that
     * number of repeats of the code.
     * @param repeatStat Timing will be averaged over that number of runs.
     * @param runGC Call {@code System.gc()} between each timed block. When
     * set to {@code true}, the test will run much slower.
     * @param methods Codes being timed.
     * @return for each of the given {@code methods} (first dimension), and
     * each of the {@code repeatStat} runs (second dimension):
     * <ul>
     *  <li>
     *   the average time (in milliseconds) taken by a single call to the
     *   {@code call} method (i.e. the time taken by each timed block divided
     *   by {@code repeatChunk})
     *  </li>
     *  <li>
     *   the result returned by the {@code call} method.
     *  </li>
     * </ul>
     */
    public static double[][][] timesAndResults(int repeatChunk,
                                               int repeatStat,
                                               boolean runGC,
                                               Callable<Double> ... methods) {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61772);
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61773);final int numMethods = methods.length;
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61774);final double[][][] timesAndResults = new double[numMethods][repeatStat][2];

        __CLR4_4_11bni1bnilb90pbqc.R.inc(61775);try {
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61776);for (int k = 0; (((k < repeatStat)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61777)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61778)==0&false)); k++) {{
                __CLR4_4_11bni1bnilb90pbqc.R.inc(61779);for (int j = 0; (((j < numMethods)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61780)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61781)==0&false)); j++) {{
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61782);if ((((runGC)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61783)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61784)==0&false))) {{
                        // Try to perform GC outside the timed block.
                        __CLR4_4_11bni1bnilb90pbqc.R.inc(61785);System.gc();
                    }

                    }__CLR4_4_11bni1bnilb90pbqc.R.inc(61786);final Callable<Double> r = methods[j];
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61787);final double[] result = new double[repeatChunk];

                    // Timed block.
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61788);final long start = System.nanoTime();
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61789);for (int i = 0; (((i < repeatChunk)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61790)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61791)==0&false)); i++) {{
                        __CLR4_4_11bni1bnilb90pbqc.R.inc(61792);result[i] = r.call().doubleValue();
                    }
                    }__CLR4_4_11bni1bnilb90pbqc.R.inc(61793);final long stop = System.nanoTime();

                    // Collect run time.
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61794);timesAndResults[j][k][0] = (stop - start) * NANO_TO_MILLI;
                    // Keep track of a randomly selected result.
                    __CLR4_4_11bni1bnilb90pbqc.R.inc(61795);timesAndResults[j][k][1] = result[rng.nextInt(repeatChunk)];
                }
            }}
        }} catch (Exception e) {
            // Abort benchmarking if codes throw exceptions.
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61796);throw new MathIllegalStateException(LocalizedFormats.SIMPLE_MESSAGE, e.getMessage());
        }

        __CLR4_4_11bni1bnilb90pbqc.R.inc(61797);final double normFactor = 1d / repeatChunk;
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61798);for (int j = 0; (((j < numMethods)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61799)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61800)==0&false)); j++) {{
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61801);for (int k = 0; (((k < repeatStat)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61802)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61803)==0&false)); k++) {{
                __CLR4_4_11bni1bnilb90pbqc.R.inc(61804);timesAndResults[j][k][0] *= normFactor;
            }
        }}

        }__CLR4_4_11bni1bnilb90pbqc.R.inc(61805);return timesAndResults;
    }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

    /**
     * Timing and report (to standard output) the average time and standard
     * deviation of a single call.
     * The timing is performed by calling the
     * {@link #time(int,int,boolean,Callable[]) time} method.
     *
     * @param title Title of the test (for the report).
     * @param repeatChunk Each timing measurement will done done for that
     * number of repeats of the code.
     * @param repeatStat Timing will be averaged over that number of runs.
     * @param runGC Call {@code System.gc()} between each timed block. When
     * set to {@code true}, the test will run much slower.
     * @param methods Codes being timed.
     * @return for each of the given {@code methods}, a statistics of the
     * average times (in milliseconds) taken by a single call to the
     * {@code call} method (i.e. the time taken by each timed block divided
     * by {@code repeatChunk}).
     */
    @SuppressWarnings("boxing")
    public static StatisticalSummary[] timeAndReport(String title,
                                                     int repeatChunk,
                                                     int repeatStat,
                                                     boolean runGC,
                                                     RunTest ... methods) {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61806);
        // Header format.
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61807);final String hFormat = "%s (calls per timed block: %d, timed blocks: %d, time unit: ms)";

        // Width of the longest name.
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61808);int nameLength = 0;
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61809);for (RunTest m : methods) {{
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61810);int len = m.getName().length();
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61811);if ((((len > nameLength)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61812)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61813)==0&false))) {{
                __CLR4_4_11bni1bnilb90pbqc.R.inc(61814);nameLength = len;
            }
        }}
        }__CLR4_4_11bni1bnilb90pbqc.R.inc(61815);final String nameLengthFormat = "%" + nameLength + "s";

        // Column format.
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61816);final String cFormat = nameLengthFormat + " %14s %14s %10s %10s %15s";
        // Result format.
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61817);final String format = nameLengthFormat + " %.8e %.8e %.4e %.4e % .8e";

        __CLR4_4_11bni1bnilb90pbqc.R.inc(61818);System.out.println(String.format(hFormat,
                                         title,
                                         repeatChunk,
                                         repeatStat));
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61819);System.out.println(String.format(cFormat,
                                         "name",
                                         "time/call",
                                         "std error",
                                         "total time",
                                         "ratio",
                                         "difference"));
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61820);final StatisticalSummary[] time = time(repeatChunk,
                                               repeatStat,
                                               runGC,
                                               methods);
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61821);final double refSum = time[0].getSum() * repeatChunk;
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61822);for (int i = 0, max = time.length; (((i < max)&&(__CLR4_4_11bni1bnilb90pbqc.R.iget(61823)!=0|true))||(__CLR4_4_11bni1bnilb90pbqc.R.iget(61824)==0&false)); i++) {{
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61825);final StatisticalSummary s = time[i];
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61826);final double sum = s.getSum() * repeatChunk;
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61827);System.out.println(String.format(format,
                                             methods[i].getName(),
                                             s.getMean(),
                                             s.getStandardDeviation(),
                                             sum,
                                             sum / refSum,
                                             sum - refSum));
        }

        }__CLR4_4_11bni1bnilb90pbqc.R.inc(61828);return time;
    }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

    /**
     * Timing and report (to standard output).
     * This method calls {@link #timeAndReport(String,int,int,boolean,RunTest[])
     * timeAndReport(title, 1000, 10000, false, methods)}.
     *
     * @param title Title of the test (for the report).
     * @param methods Codes being timed.
     * @return for each of the given {@code methods}, a statistics of the
     * average times (in milliseconds) taken by a single call to the
     * {@code call} method (i.e. the time taken by each timed block divided
     * by {@code repeatChunk}).
     */
    public static StatisticalSummary[] timeAndReport(String title,
                                                     RunTest ... methods) {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61829);
        __CLR4_4_11bni1bnilb90pbqc.R.inc(61830);return timeAndReport(title,
                             DEFAULT_REPEAT_CHUNK,
                             DEFAULT_REPEAT_STAT,
                             false,
                             methods);
    }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

    /**
     * Utility class for storing a test label.
     */
    public static abstract class RunTest implements Callable<Double> {
        private final String name;

        /**
         * @param name Test name.
         */
        public RunTest(String name) {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61831);
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61832);this.name = name;
        }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

        /**
         * @return the name of this test.
         */
        public String getName() {try{__CLR4_4_11bni1bnilb90pbqc.R.inc(61833);
            __CLR4_4_11bni1bnilb90pbqc.R.inc(61834);return name;
        }finally{__CLR4_4_11bni1bnilb90pbqc.R.flushNeeded();}}

        /** {@inheritDoc} */
        public abstract Double call() throws Exception;
    }
}
