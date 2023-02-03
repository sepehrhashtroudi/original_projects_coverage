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

package org.apache.commons.math3.random;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.distribution.AbstractRealDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.StatisticalSummary;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>Represents an <a href="http://http://en.wikipedia.org/wiki/Empirical_distribution_function">
 * empirical probability distribution</a> -- a probability distribution derived
 * from observed data without making any assumptions about the functional form
 * of the population distribution that the data come from.</p>
 *
 * <p>An <code>EmpiricalDistribution</code> maintains data structures, called
 * <i>distribution digests</i>, that describe empirical distributions and
 * support the following operations: <ul>
 * <li>loading the distribution from a file of observed data values</li>
 * <li>dividing the input data into "bin ranges" and reporting bin frequency
 *     counts (data for histogram)</li>
 * <li>reporting univariate statistics describing the full set of data values
 *     as well as the observations within each bin</li>
 * <li>generating random values from the distribution</li>
 * </ul>
 * Applications can use <code>EmpiricalDistribution</code> to build grouped
 * frequency histograms representing the input data or to generate random values
 * "like" those in the input file -- i.e., the values generated will follow the
 * distribution of the values in the file.</p>
 *
 * <p>The implementation uses what amounts to the
 * <a href="http://nedwww.ipac.caltech.edu/level5/March02/Silverman/Silver2_6.html">
 * Variable Kernel Method</a> with Gaussian smoothing:<p>
 * <strong>Digesting the input file</strong>
 * <ol><li>Pass the file once to compute min and max.</li>
 * <li>Divide the range from min-max into <code>binCount</code> "bins."</li>
 * <li>Pass the data file again, computing bin counts and univariate
 *     statistics (mean, std dev.) for each of the bins </li>
 * <li>Divide the interval (0,1) into subintervals associated with the bins,
 *     with the length of a bin's subinterval proportional to its count.</li></ol>
 * <strong>Generating random values from the distribution</strong><ol>
 * <li>Generate a uniformly distributed value in (0,1) </li>
 * <li>Select the subinterval to which the value belongs.
 * <li>Generate a random Gaussian value with mean = mean of the associated
 *     bin and std dev = std dev of associated bin.</li></ol></p>
 *
 * <p>EmpiricalDistribution implements the {@link RealDistribution} interface
 * as follows.  Given x within the range of values in the dataset, let B
 * be the bin containing x and let K be the within-bin kernel for B.  Let P(B-)
 * be the sum of the probabilities of the bins below B and let K(B) be the
 * mass of B under K (i.e., the integral of the kernel density over B).  Then
 * set P(X < x) = P(B-) + P(B) * K(x) / K(B) where K(x) is the kernel distribution
 * evaluated at x. This results in a cdf that matches the grouped frequency
 * distribution at the bin endpoints and interpolates within bins using
 * within-bin kernels.</p>
 *
 *<strong>USAGE NOTES:</strong><ul>
 *<li>The <code>binCount</code> is set by default to 1000.  A good rule of thumb
 *    is to set the bin count to approximately the length of the input file divided
 *    by 10. </li>
 *<li>The input file <i>must</i> be a plain text file containing one valid numeric
 *    entry per line.</li>
 * </ul></p>
 *
 * @version $Id$
 */
public class EmpiricalDistribution extends AbstractRealDistribution {public static class __CLR4_4_110kk10kklb90pab7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default bin count */
    public static final int DEFAULT_BIN_COUNT = 1000;

    /** Character set for file input */
    private static final String FILE_CHARSET = "US-ASCII";

    /** Serializable version identifier */
    private static final long serialVersionUID = 5729073523949762654L;

    /** RandomDataGenerator instance to use in repeated calls to getNext() */
    protected final RandomDataGenerator randomData;

    /** List of SummaryStatistics objects characterizing the bins */
    private final List<SummaryStatistics> binStats;

    /** Sample statistics */
    private SummaryStatistics sampleStats = null;

    /** Max loaded value */
    private double max = Double.NEGATIVE_INFINITY;

    /** Min loaded value */
    private double min = Double.POSITIVE_INFINITY;

    /** Grid size */
    private double delta = 0d;

    /** number of bins */
    private final int binCount;

    /** is the distribution loaded? */
    private boolean loaded = false;

    /** upper bounds of subintervals in (0,1) "belonging" to the bins */
    private double[] upperBounds = null;

    /**
     * Creates a new EmpiricalDistribution with the default bin count.
     */
    public EmpiricalDistribution() {
        this(DEFAULT_BIN_COUNT);__CLR4_4_110kk10kklb90pab7.R.inc(47397);try{__CLR4_4_110kk10kklb90pab7.R.inc(47396);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Creates a new EmpiricalDistribution with the specified bin count.
     *
     * @param binCount number of bins
     */
    public EmpiricalDistribution(int binCount) {
        this(binCount, new RandomDataGenerator());__CLR4_4_110kk10kklb90pab7.R.inc(47399);try{__CLR4_4_110kk10kklb90pab7.R.inc(47398);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Creates a new EmpiricalDistribution with the specified bin count using the
     * provided {@link RandomGenerator} as the source of random data.
     *
     * @param binCount number of bins
     * @param generator random data generator (may be null, resulting in default JDK generator)
     * @since 3.0
     */
    public EmpiricalDistribution(int binCount, RandomGenerator generator) {
        this(binCount, new RandomDataGenerator(generator));__CLR4_4_110kk10kklb90pab7.R.inc(47401);try{__CLR4_4_110kk10kklb90pab7.R.inc(47400);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Creates a new EmpiricalDistribution with default bin count using the
     * provided {@link RandomGenerator} as the source of random data.
     *
     * @param generator random data generator (may be null, resulting in default JDK generator)
     * @since 3.0
     */
    public EmpiricalDistribution(RandomGenerator generator) {
        this(DEFAULT_BIN_COUNT, generator);__CLR4_4_110kk10kklb90pab7.R.inc(47403);try{__CLR4_4_110kk10kklb90pab7.R.inc(47402);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Creates a new EmpiricalDistribution with the specified bin count using the
     * provided {@link RandomDataImpl} instance as the source of random data.
     *
     * @param binCount number of bins
     * @param randomData random data generator (may be null, resulting in default JDK generator)
     * @since 3.0
     * @deprecated As of 3.1. Please use {@link #EmpiricalDistribution(int,RandomGenerator)} instead.
     */
    @Deprecated
    public EmpiricalDistribution(int binCount, RandomDataImpl randomData) {
        this(binCount, randomData.getDelegate());__CLR4_4_110kk10kklb90pab7.R.inc(47405);try{__CLR4_4_110kk10kklb90pab7.R.inc(47404);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Creates a new EmpiricalDistribution with default bin count using the
     * provided {@link RandomDataImpl} as the source of random data.
     *
     * @param randomData random data generator (may be null, resulting in default JDK generator)
     * @since 3.0
     * @deprecated As of 3.1. Please use {@link #EmpiricalDistribution(RandomGenerator)} instead.
     */
    @Deprecated
    public EmpiricalDistribution(RandomDataImpl randomData) {
        this(DEFAULT_BIN_COUNT, randomData);__CLR4_4_110kk10kklb90pab7.R.inc(47407);try{__CLR4_4_110kk10kklb90pab7.R.inc(47406);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Private constructor to allow lazy initialisation of the RNG contained
     * in the {@link #randomData} instance variable.
     *
     * @param binCount number of bins
     * @param randomData Random data generator.
     */
    private EmpiricalDistribution(int binCount,
                                  RandomDataGenerator randomData) {
        super(null);__CLR4_4_110kk10kklb90pab7.R.inc(47409);try{__CLR4_4_110kk10kklb90pab7.R.inc(47408);
        __CLR4_4_110kk10kklb90pab7.R.inc(47410);this.binCount = binCount;
        __CLR4_4_110kk10kklb90pab7.R.inc(47411);this.randomData = randomData;
        __CLR4_4_110kk10kklb90pab7.R.inc(47412);binStats = new ArrayList<SummaryStatistics>();
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Computes the empirical distribution from the provided
     * array of numbers.
     *
     * @param in the input data array
     * @exception NullArgumentException if in is null
     */
    public void load(double[] in) throws NullArgumentException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47413);
        __CLR4_4_110kk10kklb90pab7.R.inc(47414);DataAdapter da = new ArrayDataAdapter(in);
        __CLR4_4_110kk10kklb90pab7.R.inc(47415);try {
            __CLR4_4_110kk10kklb90pab7.R.inc(47416);da.computeStats();
            // new adapter for the second pass
            __CLR4_4_110kk10kklb90pab7.R.inc(47417);fillBinStats(new ArrayDataAdapter(in));
        } catch (IOException ex) {
            // Can't happen
            __CLR4_4_110kk10kklb90pab7.R.inc(47418);throw new MathInternalError();
        }
        __CLR4_4_110kk10kklb90pab7.R.inc(47419);loaded = true;

    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Computes the empirical distribution using data read from a URL.
     *
     * <p>The input file <i>must</i> be an ASCII text file containing one
     * valid numeric entry per line.</p>
     *
     * @param url url of the input file
     *
     * @throws IOException if an IO error occurs
     * @throws NullArgumentException if url is null
     * @throws ZeroException if URL contains no data
     */
    public void load(URL url) throws IOException, NullArgumentException, ZeroException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47420);
        __CLR4_4_110kk10kklb90pab7.R.inc(47421);MathUtils.checkNotNull(url);
        __CLR4_4_110kk10kklb90pab7.R.inc(47422);Charset charset = Charset.forName(FILE_CHARSET);
        __CLR4_4_110kk10kklb90pab7.R.inc(47423);BufferedReader in =
            new BufferedReader(new InputStreamReader(url.openStream(), charset));
        __CLR4_4_110kk10kklb90pab7.R.inc(47424);try {
            __CLR4_4_110kk10kklb90pab7.R.inc(47425);DataAdapter da = new StreamDataAdapter(in);
            __CLR4_4_110kk10kklb90pab7.R.inc(47426);da.computeStats();
            __CLR4_4_110kk10kklb90pab7.R.inc(47427);if ((((sampleStats.getN() == 0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47428)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47429)==0&false))) {{
                __CLR4_4_110kk10kklb90pab7.R.inc(47430);throw new ZeroException(LocalizedFormats.URL_CONTAINS_NO_DATA, url);
            }
            // new adapter for the second pass
            }__CLR4_4_110kk10kklb90pab7.R.inc(47431);in = new BufferedReader(new InputStreamReader(url.openStream(), charset));
            __CLR4_4_110kk10kklb90pab7.R.inc(47432);fillBinStats(new StreamDataAdapter(in));
            __CLR4_4_110kk10kklb90pab7.R.inc(47433);loaded = true;
        } finally {
           __CLR4_4_110kk10kklb90pab7.R.inc(47434);try {
               __CLR4_4_110kk10kklb90pab7.R.inc(47435);in.close();
           } catch (IOException ex) { //NOPMD
               // ignore
           }
        }
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Computes the empirical distribution from the input file.
     *
     * <p>The input file <i>must</i> be an ASCII text file containing one
     * valid numeric entry per line.</p>
     *
     * @param file the input file
     * @throws IOException if an IO error occurs
     * @throws NullArgumentException if file is null
     */
    public void load(File file) throws IOException, NullArgumentException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47436);
        __CLR4_4_110kk10kklb90pab7.R.inc(47437);MathUtils.checkNotNull(file);
        __CLR4_4_110kk10kklb90pab7.R.inc(47438);Charset charset = Charset.forName(FILE_CHARSET);
        __CLR4_4_110kk10kklb90pab7.R.inc(47439);InputStream is = new FileInputStream(file);
        __CLR4_4_110kk10kklb90pab7.R.inc(47440);BufferedReader in = new BufferedReader(new InputStreamReader(is, charset));
        __CLR4_4_110kk10kklb90pab7.R.inc(47441);try {
            __CLR4_4_110kk10kklb90pab7.R.inc(47442);DataAdapter da = new StreamDataAdapter(in);
            __CLR4_4_110kk10kklb90pab7.R.inc(47443);da.computeStats();
            // new adapter for second pass
            __CLR4_4_110kk10kklb90pab7.R.inc(47444);is = new FileInputStream(file);
            __CLR4_4_110kk10kklb90pab7.R.inc(47445);in = new BufferedReader(new InputStreamReader(is, charset));
            __CLR4_4_110kk10kklb90pab7.R.inc(47446);fillBinStats(new StreamDataAdapter(in));
            __CLR4_4_110kk10kklb90pab7.R.inc(47447);loaded = true;
        } finally {
            __CLR4_4_110kk10kklb90pab7.R.inc(47448);try {
                __CLR4_4_110kk10kklb90pab7.R.inc(47449);in.close();
            } catch (IOException ex) { //NOPMD
                // ignore
            }
        }
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Provides methods for computing <code>sampleStats</code> and
     * <code>beanStats</code> abstracting the source of data.
     */
    private abstract class DataAdapter{

        /**
         * Compute bin stats.
         *
         * @throws IOException  if an error occurs computing bin stats
         */
        public abstract void computeBinStats() throws IOException;

        /**
         * Compute sample statistics.
         *
         * @throws IOException if an error occurs computing sample stats
         */
        public abstract void computeStats() throws IOException;

    }

    /**
     * <code>DataAdapter</code> for data provided through some input stream
     */
    private class StreamDataAdapter extends DataAdapter{

        /** Input stream providing access to the data */
        private BufferedReader inputStream;

        /**
         * Create a StreamDataAdapter from a BufferedReader
         *
         * @param in BufferedReader input stream
         */
        public StreamDataAdapter(BufferedReader in){
            super();__CLR4_4_110kk10kklb90pab7.R.inc(47451);try{__CLR4_4_110kk10kklb90pab7.R.inc(47450);
            __CLR4_4_110kk10kklb90pab7.R.inc(47452);inputStream = in;
        }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void computeBinStats() throws IOException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47453);
            __CLR4_4_110kk10kklb90pab7.R.inc(47454);String str = null;
            __CLR4_4_110kk10kklb90pab7.R.inc(47455);double val = 0.0d;
            __CLR4_4_110kk10kklb90pab7.R.inc(47456);while ((str = inputStream.readLine()) != null) {{
                __CLR4_4_110kk10kklb90pab7.R.inc(47459);val = Double.parseDouble(str);
                __CLR4_4_110kk10kklb90pab7.R.inc(47460);SummaryStatistics stats = binStats.get(findBin(val));
                __CLR4_4_110kk10kklb90pab7.R.inc(47461);stats.addValue(val);
            }

            }__CLR4_4_110kk10kklb90pab7.R.inc(47462);inputStream.close();
            __CLR4_4_110kk10kklb90pab7.R.inc(47463);inputStream = null;
        }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void computeStats() throws IOException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47464);
            __CLR4_4_110kk10kklb90pab7.R.inc(47465);String str = null;
            __CLR4_4_110kk10kklb90pab7.R.inc(47466);double val = 0.0;
            __CLR4_4_110kk10kklb90pab7.R.inc(47467);sampleStats = new SummaryStatistics();
            __CLR4_4_110kk10kklb90pab7.R.inc(47468);while ((str = inputStream.readLine()) != null) {{
                __CLR4_4_110kk10kklb90pab7.R.inc(47471);val = Double.parseDouble(str);
                __CLR4_4_110kk10kklb90pab7.R.inc(47472);sampleStats.addValue(val);
            }
            }__CLR4_4_110kk10kklb90pab7.R.inc(47473);inputStream.close();
            __CLR4_4_110kk10kklb90pab7.R.inc(47474);inputStream = null;
        }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}
    }

    /**
     * <code>DataAdapter</code> for data provided as array of doubles.
     */
    private class ArrayDataAdapter extends DataAdapter {

        /** Array of input  data values */
        private double[] inputArray;

        /**
         * Construct an ArrayDataAdapter from a double[] array
         *
         * @param in double[] array holding the data
         * @throws NullArgumentException if in is null
         */
        public ArrayDataAdapter(double[] in) throws NullArgumentException {
            super();__CLR4_4_110kk10kklb90pab7.R.inc(47476);try{__CLR4_4_110kk10kklb90pab7.R.inc(47475);
            __CLR4_4_110kk10kklb90pab7.R.inc(47477);MathUtils.checkNotNull(in);
            __CLR4_4_110kk10kklb90pab7.R.inc(47478);inputArray = in;
        }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void computeStats() throws IOException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47479);
            __CLR4_4_110kk10kklb90pab7.R.inc(47480);sampleStats = new SummaryStatistics();
            __CLR4_4_110kk10kklb90pab7.R.inc(47481);for (int i = 0; (((i < inputArray.length)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47482)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47483)==0&false)); i++) {{
                __CLR4_4_110kk10kklb90pab7.R.inc(47484);sampleStats.addValue(inputArray[i]);
            }
        }}finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void computeBinStats() throws IOException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47485);
            __CLR4_4_110kk10kklb90pab7.R.inc(47486);for (int i = 0; (((i < inputArray.length)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47487)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47488)==0&false)); i++) {{
                __CLR4_4_110kk10kklb90pab7.R.inc(47489);SummaryStatistics stats =
                    binStats.get(findBin(inputArray[i]));
                __CLR4_4_110kk10kklb90pab7.R.inc(47490);stats.addValue(inputArray[i]);
            }
        }}finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}
    }

    /**
     * Fills binStats array (second pass through data file).
     *
     * @param da object providing access to the data
     * @throws IOException  if an IO error occurs
     */
    private void fillBinStats(final DataAdapter da)
        throws IOException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47491);
        // Set up grid
        __CLR4_4_110kk10kklb90pab7.R.inc(47492);min = sampleStats.getMin();
        __CLR4_4_110kk10kklb90pab7.R.inc(47493);max = sampleStats.getMax();
        __CLR4_4_110kk10kklb90pab7.R.inc(47494);delta = (max - min)/((double) binCount);

        // Initialize binStats ArrayList
        __CLR4_4_110kk10kklb90pab7.R.inc(47495);if ((((!binStats.isEmpty())&&(__CLR4_4_110kk10kklb90pab7.R.iget(47496)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47497)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47498);binStats.clear();
        }
        }__CLR4_4_110kk10kklb90pab7.R.inc(47499);for (int i = 0; (((i < binCount)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47500)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47501)==0&false)); i++) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47502);SummaryStatistics stats = new SummaryStatistics();
            __CLR4_4_110kk10kklb90pab7.R.inc(47503);binStats.add(i,stats);
        }

        // Filling data in binStats Array
        }__CLR4_4_110kk10kklb90pab7.R.inc(47504);da.computeBinStats();

        // Assign upperBounds based on bin counts
        __CLR4_4_110kk10kklb90pab7.R.inc(47505);upperBounds = new double[binCount];
        __CLR4_4_110kk10kklb90pab7.R.inc(47506);upperBounds[0] =
        ((double) binStats.get(0).getN()) / (double) sampleStats.getN();
        __CLR4_4_110kk10kklb90pab7.R.inc(47507);for (int i = 1; (((i < binCount-1)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47508)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47509)==0&false)); i++) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47510);upperBounds[i] = upperBounds[i-1] +
            ((double) binStats.get(i).getN()) / (double) sampleStats.getN();
        }
        }__CLR4_4_110kk10kklb90pab7.R.inc(47511);upperBounds[binCount-1] = 1.0d;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Returns the index of the bin to which the given value belongs
     *
     * @param value  the value whose bin we are trying to find
     * @return the index of the bin containing the value
     */
    private int findBin(double value) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47512);
        __CLR4_4_110kk10kklb90pab7.R.inc(47513);return FastMath.min(
                FastMath.max((int) FastMath.ceil((value - min) / delta) - 1, 0),
                binCount - 1);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Generates a random value from this distribution.
     * <strong>Preconditions:</strong><ul>
     * <li>the distribution must be loaded before invoking this method</li></ul>
     * @return the random value.
     * @throws MathIllegalStateException if the distribution has not been loaded
     */
    public double getNextValue() throws MathIllegalStateException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47514);

        __CLR4_4_110kk10kklb90pab7.R.inc(47515);if ((((!loaded)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47516)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47517)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47518);throw new MathIllegalStateException(LocalizedFormats.DISTRIBUTION_NOT_LOADED);
        }

        // Start with a uniformly distributed random number in (0,1)
        }__CLR4_4_110kk10kklb90pab7.R.inc(47519);final double x = randomData.nextUniform(0,1);

        // Use this to select the bin and generate a Gaussian within the bin
        __CLR4_4_110kk10kklb90pab7.R.inc(47520);for (int i = 0; (((i < binCount)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47521)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47522)==0&false)); i++) {{
           __CLR4_4_110kk10kklb90pab7.R.inc(47523);if ((((x <= upperBounds[i])&&(__CLR4_4_110kk10kklb90pab7.R.iget(47524)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47525)==0&false))) {{
               __CLR4_4_110kk10kklb90pab7.R.inc(47526);SummaryStatistics stats = binStats.get(i);
               __CLR4_4_110kk10kklb90pab7.R.inc(47527);if ((((stats.getN() > 0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47528)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47529)==0&false))) {{
                   __CLR4_4_110kk10kklb90pab7.R.inc(47530);if ((((stats.getStandardDeviation() > 0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47531)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47532)==0&false))) {{  // more than one obs
                       __CLR4_4_110kk10kklb90pab7.R.inc(47533);return getKernel(stats).sample();
                   } }else {{
                       __CLR4_4_110kk10kklb90pab7.R.inc(47534);return stats.getMean(); // only one obs in bin
                   }
               }}
           }}
        }}
        }__CLR4_4_110kk10kklb90pab7.R.inc(47535);throw new MathIllegalStateException(LocalizedFormats.NO_BIN_SELECTED);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Returns a {@link StatisticalSummary} describing this distribution.
     * <strong>Preconditions:</strong><ul>
     * <li>the distribution must be loaded before invoking this method</li></ul>
     *
     * @return the sample statistics
     * @throws IllegalStateException if the distribution has not been loaded
     */
    public StatisticalSummary getSampleStats() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47536);
        __CLR4_4_110kk10kklb90pab7.R.inc(47537);return sampleStats;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Returns the number of bins.
     *
     * @return the number of bins.
     */
    public int getBinCount() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47538);
        __CLR4_4_110kk10kklb90pab7.R.inc(47539);return binCount;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Returns a List of {@link SummaryStatistics} instances containing
     * statistics describing the values in each of the bins.  The list is
     * indexed on the bin number.
     *
     * @return List of bin statistics.
     */
    public List<SummaryStatistics> getBinStats() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47540);
        __CLR4_4_110kk10kklb90pab7.R.inc(47541);return binStats;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * <p>Returns a fresh copy of the array of upper bounds for the bins.
     * Bins are: <br/>
     * [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,
     *  (upperBounds[binCount-2], upperBounds[binCount-1] = max].</p>
     *
     * <p>Note: In versions 1.0-2.0 of commons-math, this method
     * incorrectly returned the array of probability generator upper
     * bounds now returned by {@link #getGeneratorUpperBounds()}.</p>
     *
     * @return array of bin upper bounds
     * @since 2.1
     */
    public double[] getUpperBounds() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47542);
        __CLR4_4_110kk10kklb90pab7.R.inc(47543);double[] binUpperBounds = new double[binCount];
        __CLR4_4_110kk10kklb90pab7.R.inc(47544);for (int i = 0; (((i < binCount - 1)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47545)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47546)==0&false)); i++) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47547);binUpperBounds[i] = min + delta * (i + 1);
        }
        }__CLR4_4_110kk10kklb90pab7.R.inc(47548);binUpperBounds[binCount - 1] = max;
        __CLR4_4_110kk10kklb90pab7.R.inc(47549);return binUpperBounds;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * <p>Returns a fresh copy of the array of upper bounds of the subintervals
     * of [0,1] used in generating data from the empirical distribution.
     * Subintervals correspond to bins with lengths proportional to bin counts.</p>
     *
     * <p>In versions 1.0-2.0 of commons-math, this array was (incorrectly) returned
     * by {@link #getUpperBounds()}.</p>
     *
     * @since 2.1
     * @return array of upper bounds of subintervals used in data generation
     */
    public double[] getGeneratorUpperBounds() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47550);
        __CLR4_4_110kk10kklb90pab7.R.inc(47551);int len = upperBounds.length;
        __CLR4_4_110kk10kklb90pab7.R.inc(47552);double[] out = new double[len];
        __CLR4_4_110kk10kklb90pab7.R.inc(47553);System.arraycopy(upperBounds, 0, out, 0, len);
        __CLR4_4_110kk10kklb90pab7.R.inc(47554);return out;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Property indicating whether or not the distribution has been loaded.
     *
     * @return true if the distribution has been loaded
     */
    public boolean isLoaded() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47555);
        __CLR4_4_110kk10kklb90pab7.R.inc(47556);return loaded;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Reseeds the random number generator used by {@link #getNextValue()}.
     *
     * @param seed random generator seed
     * @since 3.0
     */
    public void reSeed(long seed) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47557);
        __CLR4_4_110kk10kklb90pab7.R.inc(47558);randomData.reSeed(seed);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    // Distribution methods ---------------------------

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    @Override
    public double probability(double x) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47559);
        __CLR4_4_110kk10kklb90pab7.R.inc(47560);return 0;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>Returns the kernel density normalized so that its integral over each bin
     * equals the bin mass.</p>
     *
     * <p>Algorithm description: <ol>
     * <li>Find the bin B that x belongs to.</li>
     * <li>Compute K(B) = the mass of B with respect to the within-bin kernel (i.e., the
     * integral of the kernel density over B).</li>
     * <li>Return k(x) * P(B) / K(B), where k is the within-bin kernel density
     * and P(B) is the mass of B.</li></ol></p>
     * @since 3.1
     */
    public double density(double x) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47561);
        __CLR4_4_110kk10kklb90pab7.R.inc(47562);if ((((x < min || x > max)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47563)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47564)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47565);return 0d;
        }
        }__CLR4_4_110kk10kklb90pab7.R.inc(47566);final int binIndex = findBin(x);
        __CLR4_4_110kk10kklb90pab7.R.inc(47567);final RealDistribution kernel = getKernel(binStats.get(binIndex));
        __CLR4_4_110kk10kklb90pab7.R.inc(47568);return kernel.density(x) * pB(binIndex) / kB(binIndex);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>Algorithm description:<ol>
     * <li>Find the bin B that x belongs to.</li>
     * <li>Compute P(B) = the mass of B and P(B-) = the combined mass of the bins below B.</li>
     * <li>Compute K(B) = the probability mass of B with respect to the within-bin kernel
     * and K(B-) = the kernel distribution evaluated at the lower endpoint of B</li>
     * <li>Return P(B-) + P(B) * [K(x) - K(B-)] / K(B) where
     * K(x) is the within-bin kernel distribution function evaluated at x.</li></ol></p>
     *
     * @since 3.1
     */
    public double cumulativeProbability(double x) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47569);
        __CLR4_4_110kk10kklb90pab7.R.inc(47570);if ((((x < min)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47571)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47572)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47573);return 0d;
        } }else {__CLR4_4_110kk10kklb90pab7.R.inc(47574);if ((((x >= max)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47575)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47576)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47577);return 1d;
        }
        }}__CLR4_4_110kk10kklb90pab7.R.inc(47578);final int binIndex = findBin(x);
        __CLR4_4_110kk10kklb90pab7.R.inc(47579);final double pBminus = pBminus(binIndex);
        __CLR4_4_110kk10kklb90pab7.R.inc(47580);final double pB = pB(binIndex);
        __CLR4_4_110kk10kklb90pab7.R.inc(47581);final double[] binBounds = getUpperBounds();
        __CLR4_4_110kk10kklb90pab7.R.inc(47582);final double kB = kB(binIndex);
        __CLR4_4_110kk10kklb90pab7.R.inc(47583);final double lower = (((binIndex == 0 )&&(__CLR4_4_110kk10kklb90pab7.R.iget(47584)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47585)==0&false))? min : binBounds[binIndex - 1];
        __CLR4_4_110kk10kklb90pab7.R.inc(47586);final RealDistribution kernel = k(x);
        __CLR4_4_110kk10kklb90pab7.R.inc(47587);final double withinBinCum =
            (kernel.cumulativeProbability(x) -  kernel.cumulativeProbability(lower)) / kB;
        __CLR4_4_110kk10kklb90pab7.R.inc(47588);return pBminus + pB * withinBinCum;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>Algorithm description:<ol>
     * <li>Find the smallest i such that the sum of the masses of the bins
     *  through i is at least p.</li>
     * <li>
     *   Let K be the within-bin kernel distribution for bin i.</br>
     *   Let K(B) be the mass of B under K. <br/>
     *   Let K(B-) be K evaluated at the lower endpoint of B (the combined
     *   mass of the bins below B under K).<br/>
     *   Let P(B) be the probability of bin i.<br/>
     *   Let P(B-) be the sum of the bin masses below bin i. <br/>
     *   Let pCrit = p - P(B-)<br/>
     * <li>Return the inverse of K evaluated at <br/>
     *    K(B-) + pCrit * K(B) / P(B) </li>
     *  </ol></p>
     *
     * @since 3.1
     */
    @Override
    public double inverseCumulativeProbability(final double p) throws OutOfRangeException {try{__CLR4_4_110kk10kklb90pab7.R.inc(47589);
        __CLR4_4_110kk10kklb90pab7.R.inc(47590);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47591)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47592)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47593);throw new OutOfRangeException(p, 0, 1);
        }

        }__CLR4_4_110kk10kklb90pab7.R.inc(47594);if ((((p == 0.0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47595)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47596)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47597);return getSupportLowerBound();
        }

        }__CLR4_4_110kk10kklb90pab7.R.inc(47598);if ((((p == 1.0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47599)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47600)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47601);return getSupportUpperBound();
        }

        }__CLR4_4_110kk10kklb90pab7.R.inc(47602);int i = 0;
        __CLR4_4_110kk10kklb90pab7.R.inc(47603);while ((((cumBinP(i) < p)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47604)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47605)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47606);i++;
        }

        }__CLR4_4_110kk10kklb90pab7.R.inc(47607);final RealDistribution kernel = getKernel(binStats.get(i));
        __CLR4_4_110kk10kklb90pab7.R.inc(47608);final double kB = kB(i);
        __CLR4_4_110kk10kklb90pab7.R.inc(47609);final double[] binBounds = getUpperBounds();
        __CLR4_4_110kk10kklb90pab7.R.inc(47610);final double lower = (((i == 0 )&&(__CLR4_4_110kk10kklb90pab7.R.iget(47611)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47612)==0&false))? min : binBounds[i - 1];
        __CLR4_4_110kk10kklb90pab7.R.inc(47613);final double kBminus = kernel.cumulativeProbability(lower);
        __CLR4_4_110kk10kklb90pab7.R.inc(47614);final double pB = pB(i);
        __CLR4_4_110kk10kklb90pab7.R.inc(47615);final double pBminus = pBminus(i);
        __CLR4_4_110kk10kklb90pab7.R.inc(47616);final double pCrit = p - pBminus;
        __CLR4_4_110kk10kklb90pab7.R.inc(47617);if ((((pCrit <= 0)&&(__CLR4_4_110kk10kklb90pab7.R.iget(47618)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47619)==0&false))) {{
            __CLR4_4_110kk10kklb90pab7.R.inc(47620);return lower;
        }
        }__CLR4_4_110kk10kklb90pab7.R.inc(47621);return kernel.inverseCumulativeProbability(kBminus + pCrit * kB / pB);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public double getNumericalMean() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47622);
       __CLR4_4_110kk10kklb90pab7.R.inc(47623);return sampleStats.getMean();
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public double getNumericalVariance() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47624);
        __CLR4_4_110kk10kklb90pab7.R.inc(47625);return sampleStats.getVariance();
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public double getSupportLowerBound() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47626);
       __CLR4_4_110kk10kklb90pab7.R.inc(47627);return min;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public double getSupportUpperBound() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47628);
        __CLR4_4_110kk10kklb90pab7.R.inc(47629);return max;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47630);
        __CLR4_4_110kk10kklb90pab7.R.inc(47631);return true;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47632);
        __CLR4_4_110kk10kklb90pab7.R.inc(47633);return true;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    public boolean isSupportConnected() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47634);
        __CLR4_4_110kk10kklb90pab7.R.inc(47635);return true;
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    @Override
    public double sample() {try{__CLR4_4_110kk10kklb90pab7.R.inc(47636);
        __CLR4_4_110kk10kklb90pab7.R.inc(47637);return getNextValue();
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @since 3.1
     */
    @Override
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47638);
        __CLR4_4_110kk10kklb90pab7.R.inc(47639);randomData.reSeed(seed);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * The probability of bin i.
     *
     * @param i the index of the bin
     * @return the probability that selection begins in bin i
     */
    private double pB(int i) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47640);
        __CLR4_4_110kk10kklb90pab7.R.inc(47641);return (((i == 0 )&&(__CLR4_4_110kk10kklb90pab7.R.iget(47642)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47643)==0&false))? upperBounds[0] :
            upperBounds[i] - upperBounds[i - 1];
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * The combined probability of the bins up to but not including bin i.
     *
     * @param i the index of the bin
     * @return the probability that selection begins in a bin below bin i.
     */
    private double pBminus(int i) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47644);
        __CLR4_4_110kk10kklb90pab7.R.inc(47645);return (((i == 0 )&&(__CLR4_4_110kk10kklb90pab7.R.iget(47646)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47647)==0&false))? 0 : upperBounds[i - 1];
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * Mass of bin i under the within-bin kernel of the bin.
     *
     * @param i index of the bin
     * @return the difference in the within-bin kernel cdf between the
     * upper and lower endpoints of bin i
     */
    @SuppressWarnings("deprecation")
    private double kB(int i) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47648);
        __CLR4_4_110kk10kklb90pab7.R.inc(47649);final double[] binBounds = getUpperBounds();
        __CLR4_4_110kk10kklb90pab7.R.inc(47650);final RealDistribution kernel = getKernel(binStats.get(i));
        __CLR4_4_110kk10kklb90pab7.R.inc(47651);return (((i == 0 )&&(__CLR4_4_110kk10kklb90pab7.R.iget(47652)!=0|true))||(__CLR4_4_110kk10kklb90pab7.R.iget(47653)==0&false))? kernel.cumulativeProbability(min, binBounds[0]) :
            kernel.cumulativeProbability(binBounds[i - 1], binBounds[i]);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * The within-bin kernel of the bin that x belongs to.
     *
     * @param x the value to locate within a bin
     * @return the within-bin kernel of the bin containing x
     */
    private RealDistribution k(double x) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47654);
        __CLR4_4_110kk10kklb90pab7.R.inc(47655);final int binIndex = findBin(x);
        __CLR4_4_110kk10kklb90pab7.R.inc(47656);return getKernel(binStats.get(binIndex));
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * The combined probability of the bins up to and including binIndex.
     *
     * @param binIndex maximum bin index
     * @return sum of the probabilities of bins through binIndex
     */
    private double cumBinP(int binIndex) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47657);
        __CLR4_4_110kk10kklb90pab7.R.inc(47658);return upperBounds[binIndex];
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}

    /**
     * The within-bin smoothing kernel.
     *
     * @param bStats summary statistics for the bin
     * @return within-bin kernel parameterized by bStats
     */
    protected RealDistribution getKernel(SummaryStatistics bStats) {try{__CLR4_4_110kk10kklb90pab7.R.inc(47659);
        // Default to Gaussian
        __CLR4_4_110kk10kklb90pab7.R.inc(47660);return new NormalDistribution(randomData.getRandomGenerator(),
                bStats.getMean(), bStats.getStandardDeviation(),
                NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }finally{__CLR4_4_110kk10kklb90pab7.R.flushNeeded();}}
}
