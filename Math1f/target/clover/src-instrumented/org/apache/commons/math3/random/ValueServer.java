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
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Generates values for use in simulation applications.
 * <p>
 * How values are generated is determined by the <code>mode</code>
 * property.</p>
 * <p>
 * Supported <code>mode</code> values are: <ul>
 * <li> DIGEST_MODE -- uses an empirical distribution </li>
 * <li> REPLAY_MODE -- replays data from <code>valuesFileURL</code></li>
 * <li> UNIFORM_MODE -- generates uniformly distributed random values with
 *                      mean = <code>mu</code> </li>
 * <li> EXPONENTIAL_MODE -- generates exponentially distributed random values
 *                         with mean = <code>mu</code></li>
 * <li> GAUSSIAN_MODE -- generates Gaussian distributed random values with
 *                       mean = <code>mu</code> and
 *                       standard deviation = <code>sigma</code></li>
 * <li> CONSTANT_MODE -- returns <code>mu</code> every time.</li></ul></p>
 *
 * @version $Id$
 *
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ValueServer {public static class __CLR4_4_111ho11holb90pafb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48693,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Use empirical distribution.  */
    public static final int DIGEST_MODE = 0;

    /** Replay data from valuesFilePath. */
    public static final int REPLAY_MODE = 1;

    /** Uniform random deviates with mean = &mu;. */
    public static final int UNIFORM_MODE = 2;

    /** Exponential random deviates with mean = &mu;. */
    public static final int EXPONENTIAL_MODE = 3;

    /** Gaussian random deviates with mean = &mu;, std dev = &sigma;. */
    public static final int GAUSSIAN_MODE = 4;

    /** Always return mu */
    public static final int CONSTANT_MODE = 5;

    /** mode determines how values are generated. */
    private int mode = 5;

    /** URI to raw data values. */
    private URL valuesFileURL = null;

    /** Mean for use with non-data-driven modes. */
    private double mu = 0.0;

    /** Standard deviation for use with GAUSSIAN_MODE. */
    private double sigma = 0.0;

    /** Empirical probability distribution for use with DIGEST_MODE. */
    private EmpiricalDistribution empiricalDistribution = null;

    /** File pointer for REPLAY_MODE. */
    private BufferedReader filePointer = null;

    /** RandomDataImpl to use for random data generation. */
    private final RandomDataImpl randomData;

    // Data generation modes ======================================

    /** Creates new ValueServer */
    public ValueServer() {try{__CLR4_4_111ho11holb90pafb.R.inc(48588);
        __CLR4_4_111ho11holb90pafb.R.inc(48589);randomData = new RandomDataImpl();
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Construct a ValueServer instance using a RandomDataImpl as its source
     * of random data.
     *
     * @param randomData the RandomDataImpl instance used to source random data
     * @since 3.0
     * @deprecated use {@link #ValueServer(RandomGenerator)}
     */
    @Deprecated
    public ValueServer(RandomDataImpl randomData) {try{__CLR4_4_111ho11holb90pafb.R.inc(48590);
        __CLR4_4_111ho11holb90pafb.R.inc(48591);this.randomData = randomData;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Construct a ValueServer instance using a RandomGenerator as its source
     * of random data.
     *
     * @since 3.1
     * @param generator source of random data
     */
    public ValueServer(RandomGenerator generator) {try{__CLR4_4_111ho11holb90pafb.R.inc(48592);
        __CLR4_4_111ho11holb90pafb.R.inc(48593);this.randomData = new RandomDataImpl(generator);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the next generated value, generated according
     * to the mode value (see MODE constants).
     *
     * @return generated value
     * @throws IOException in REPLAY_MODE if a file I/O error occurs
     * @throws MathIllegalStateException if mode is not recognized
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    public double getNext() throws IOException, MathIllegalStateException, MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48594);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_111ho11holb90pafb.R.inc(48595);switch (mode) {
            case DIGEST_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48596);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48597);return getNextDigest();
            case REPLAY_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48598);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48599);return getNextReplay();
            case UNIFORM_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48600);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48601);return getNextUniform();
            case EXPONENTIAL_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48602);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48603);return getNextExponential();
            case GAUSSIAN_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48604);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48605);return getNextGaussian();
            case CONSTANT_MODE:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48606);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48607);return mu;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_111ho11holb90pafb.R.inc(48608);__CLB4_4_1_bool0=true;} __CLR4_4_111ho11holb90pafb.R.inc(48609);throw new MathIllegalStateException(
                    LocalizedFormats.UNKNOWN_MODE,
                    mode,
                    "DIGEST_MODE",   DIGEST_MODE,   "REPLAY_MODE",      REPLAY_MODE,
                    "UNIFORM_MODE",  UNIFORM_MODE,  "EXPONENTIAL_MODE", EXPONENTIAL_MODE,
                    "GAUSSIAN_MODE", GAUSSIAN_MODE, "CONSTANT_MODE",    CONSTANT_MODE);
        }
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Fills the input array with values generated using getNext() repeatedly.
     *
     * @param values array to be filled
     * @throws IOException in REPLAY_MODE if a file I/O error occurs
     * @throws MathIllegalStateException if mode is not recognized
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    public void fill(double[] values)
        throws IOException, MathIllegalStateException, MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48610);
        __CLR4_4_111ho11holb90pafb.R.inc(48611);for (int i = 0; (((i < values.length)&&(__CLR4_4_111ho11holb90pafb.R.iget(48612)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48613)==0&false)); i++) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48614);values[i] = getNext();
        }
    }}finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns an array of length <code>length</code> with values generated
     * using getNext() repeatedly.
     *
     * @param length length of output array
     * @return array of generated values
     * @throws IOException in REPLAY_MODE if a file I/O error occurs
     * @throws MathIllegalStateException if mode is not recognized
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    public double[] fill(int length)
        throws IOException, MathIllegalStateException, MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48615);
        __CLR4_4_111ho11holb90pafb.R.inc(48616);double[] out = new double[length];
        __CLR4_4_111ho11holb90pafb.R.inc(48617);for (int i = 0; (((i < length)&&(__CLR4_4_111ho11holb90pafb.R.iget(48618)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48619)==0&false)); i++) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48620);out[i] = getNext();
        }
        }__CLR4_4_111ho11holb90pafb.R.inc(48621);return out;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Computes the empirical distribution using values from the file
     * in <code>valuesFileURL</code>, using the default number of bins.
     * <p>
     * <code>valuesFileURL</code> must exist and be
     * readable by *this at runtime.</p>
     * <p>
     * This method must be called before using <code>getNext()</code>
     * with <code>mode = DIGEST_MODE</code></p>
     *
     * @throws IOException if an I/O error occurs reading the input file
     * @throws NullArgumentException if the {@code valuesFileURL} has not been set
     * @throws ZeroException if URL contains no data
     */
    public void computeDistribution() throws IOException, ZeroException, NullArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48622);
        __CLR4_4_111ho11holb90pafb.R.inc(48623);computeDistribution(EmpiricalDistribution.DEFAULT_BIN_COUNT);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Computes the empirical distribution using values from the file
     * in <code>valuesFileURL</code> and <code>binCount</code> bins.
     * <p>
     * <code>valuesFileURL</code> must exist and be readable by this process
     * at runtime.</p>
     * <p>
     * This method must be called before using <code>getNext()</code>
     * with <code>mode = DIGEST_MODE</code></p>
     *
     * @param binCount the number of bins used in computing the empirical
     * distribution
     * @throws NullArgumentException if the {@code valuesFileURL} has not been set
     * @throws IOException if an error occurs reading the input file
     * @throws ZeroException if URL contains no data
     */
    public void computeDistribution(int binCount) throws NullArgumentException, IOException, ZeroException {try{__CLR4_4_111ho11holb90pafb.R.inc(48624);
        __CLR4_4_111ho11holb90pafb.R.inc(48625);empiricalDistribution = new EmpiricalDistribution(binCount, randomData);
        __CLR4_4_111ho11holb90pafb.R.inc(48626);empiricalDistribution.load(valuesFileURL);
        __CLR4_4_111ho11holb90pafb.R.inc(48627);mu = empiricalDistribution.getSampleStats().getMean();
        __CLR4_4_111ho11holb90pafb.R.inc(48628);sigma = empiricalDistribution.getSampleStats().getStandardDeviation();
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the data generation mode. See {@link ValueServer the class javadoc}
     * for description of the valid values of this property.
     *
     * @return Value of property mode.
     */
    public int getMode() {try{__CLR4_4_111ho11holb90pafb.R.inc(48629);
        __CLR4_4_111ho11holb90pafb.R.inc(48630);return mode;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Sets the data generation mode.
     *
     * @param mode New value of the data generation mode.
     */
    public void setMode(int mode) {try{__CLR4_4_111ho11holb90pafb.R.inc(48631);
        __CLR4_4_111ho11holb90pafb.R.inc(48632);this.mode = mode;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the URL for the file used to build the empirical distribution
     * when using {@link #DIGEST_MODE}.
     *
     * @return Values file URL.
     */
    public URL getValuesFileURL() {try{__CLR4_4_111ho11holb90pafb.R.inc(48633);
        __CLR4_4_111ho11holb90pafb.R.inc(48634);return valuesFileURL;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Sets the {@link #getValuesFileURL() values file URL} using a string
     * URL representation.
     *
     * @param url String representation for new valuesFileURL.
     * @throws MalformedURLException if url is not well formed
     */
    public void setValuesFileURL(String url) throws MalformedURLException {try{__CLR4_4_111ho11holb90pafb.R.inc(48635);
        __CLR4_4_111ho11holb90pafb.R.inc(48636);this.valuesFileURL = new URL(url);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Sets the the {@link #getValuesFileURL() values file URL}.
     *
     * <p>The values file <i>must</i> be an ASCII text file containing one
     * valid numeric entry per line.</p>
     *
     * @param url URL of the values file.
     */
    public void setValuesFileURL(URL url) {try{__CLR4_4_111ho11holb90pafb.R.inc(48637);
        __CLR4_4_111ho11holb90pafb.R.inc(48638);this.valuesFileURL = url;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the {@link EmpiricalDistribution} used when operating in {@value #DIGEST_MODE}.
     *
     * @return EmpircalDistribution built by {@link #computeDistribution()}
     */
    public EmpiricalDistribution getEmpiricalDistribution() {try{__CLR4_4_111ho11holb90pafb.R.inc(48639);
        __CLR4_4_111ho11holb90pafb.R.inc(48640);return empiricalDistribution;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Resets REPLAY_MODE file pointer to the beginning of the <code>valuesFileURL</code>.
     *
     * @throws IOException if an error occurs opening the file
     */
    public void resetReplayFile() throws IOException {try{__CLR4_4_111ho11holb90pafb.R.inc(48641);
        __CLR4_4_111ho11holb90pafb.R.inc(48642);if ((((filePointer != null)&&(__CLR4_4_111ho11holb90pafb.R.iget(48643)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48644)==0&false))) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48645);try {
                __CLR4_4_111ho11holb90pafb.R.inc(48646);filePointer.close();
                __CLR4_4_111ho11holb90pafb.R.inc(48647);filePointer = null;
            } catch (IOException ex) { //NOPMD
                // ignore
            }
        }
        }__CLR4_4_111ho11holb90pafb.R.inc(48648);filePointer = new BufferedReader(new InputStreamReader(valuesFileURL.openStream(), "UTF-8"));
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Closes {@code valuesFileURL} after use in REPLAY_MODE.
     *
     * @throws IOException if an error occurs closing the file
     */
    public void closeReplayFile() throws IOException {try{__CLR4_4_111ho11holb90pafb.R.inc(48649);
        __CLR4_4_111ho11holb90pafb.R.inc(48650);if ((((filePointer != null)&&(__CLR4_4_111ho11holb90pafb.R.iget(48651)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48652)==0&false))) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48653);filePointer.close();
            __CLR4_4_111ho11holb90pafb.R.inc(48654);filePointer = null;
        }
    }}finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the mean used when operating in {@link #GAUSSIAN_MODE}, {@link #EXPONENTIAL_MODE}
     * or {@link #UNIFORM_MODE}.  When operating in {@link #CONSTANT_MODE}, this is the constant
     * value always returned.  Calling {@link #computeDistribution()} sets this value to the
     * overall mean of the values in the {@link #getValuesFileURL() values file}.
     *
     * @return Mean used in data generation.
     */
    public double getMu() {try{__CLR4_4_111ho11holb90pafb.R.inc(48655);
        __CLR4_4_111ho11holb90pafb.R.inc(48656);return mu;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Sets the {@link #getMu() mean} used in data generation.  Note that calling this method
     * after {@link #computeDistribution()} has been called will have no effect on data
     * generated in {@link #DIGEST_MODE}.
     *
     * @param mu new Mean value.
     */
    public void setMu(double mu) {try{__CLR4_4_111ho11holb90pafb.R.inc(48657);
        __CLR4_4_111ho11holb90pafb.R.inc(48658);this.mu = mu;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Returns the standard deviation used when operating in {@link #GAUSSIAN_MODE}.
     * Calling {@link #computeDistribution()} sets this value to the overall standard
     * deviation of the values in the {@link #getValuesFileURL() values file}.  This
     * property has no effect when the data generation mode is not
     * {@link #GAUSSIAN_MODE}.
     *
     * @return Standard deviation used when operating in {@link #GAUSSIAN_MODE}.
     */
    public double getSigma() {try{__CLR4_4_111ho11holb90pafb.R.inc(48659);
        __CLR4_4_111ho11holb90pafb.R.inc(48660);return sigma;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Sets the {@link #getSigma() standard deviation} used in {@link #GAUSSIAN_MODE}.
     *
     * @param sigma New standard deviation.
     */
    public void setSigma(double sigma) {try{__CLR4_4_111ho11holb90pafb.R.inc(48661);
        __CLR4_4_111ho11holb90pafb.R.inc(48662);this.sigma = sigma;
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Reseeds the random data generator.
     *
     * @param seed Value with which to reseed the {@link RandomDataImpl}
     * used to generate random data.
     */
    public void reSeed(long seed) {try{__CLR4_4_111ho11holb90pafb.R.inc(48663);
        __CLR4_4_111ho11holb90pafb.R.inc(48664);randomData.reSeed(seed);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    //------------- private methods ---------------------------------

    /**
     * Gets a random value in DIGEST_MODE.
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Before this method is called, <code>computeDistribution()</code>
     * must have completed successfully; otherwise an
     * <code>IllegalStateException</code> will be thrown</li></ul></p>
     *
     * @return next random value from the empirical distribution digest
     * @throws MathIllegalStateException if digest has not been initialized
     */
    private double getNextDigest() throws MathIllegalStateException {try{__CLR4_4_111ho11holb90pafb.R.inc(48665);
        __CLR4_4_111ho11holb90pafb.R.inc(48666);if (((((empiricalDistribution == null) ||
            (empiricalDistribution.getBinStats().size() == 0))&&(__CLR4_4_111ho11holb90pafb.R.iget(48667)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48668)==0&false))) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48669);throw new MathIllegalStateException(LocalizedFormats.DIGEST_NOT_INITIALIZED);
        }
        }__CLR4_4_111ho11holb90pafb.R.inc(48670);return empiricalDistribution.getNextValue();
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Gets next sequential value from the <code>valuesFileURL</code>.
     * <p>
     * Throws an IOException if the read fails.</p>
     * <p>
     * This method will open the <code>valuesFileURL</code> if there is no
     * replay file open.</p>
     * <p>
     * The <code>valuesFileURL</code> will be closed and reopened to wrap around
     * from EOF to BOF if EOF is encountered. EOFException (which is a kind of
     * IOException) may still be thrown if the <code>valuesFileURL</code> is
     * empty.</p>
     *
     * @return next value from the replay file
     * @throws IOException if there is a problem reading from the file
     * @throws MathIllegalStateException if URL contains no data
     * @throws NumberFormatException if an invalid numeric string is
     *   encountered in the file
     */
    private double getNextReplay() throws IOException, MathIllegalStateException {try{__CLR4_4_111ho11holb90pafb.R.inc(48671);
        __CLR4_4_111ho11holb90pafb.R.inc(48672);String str = null;
        __CLR4_4_111ho11holb90pafb.R.inc(48673);if ((((filePointer == null)&&(__CLR4_4_111ho11holb90pafb.R.iget(48674)!=0|true))||(__CLR4_4_111ho11holb90pafb.R.iget(48675)==0&false))) {{
            __CLR4_4_111ho11holb90pafb.R.inc(48676);resetReplayFile();
        }
        }__CLR4_4_111ho11holb90pafb.R.inc(48677);if ((str = filePointer.readLine()) == null) {{
            // we have probably reached end of file, wrap around from EOF to BOF
            __CLR4_4_111ho11holb90pafb.R.inc(48680);closeReplayFile();
            __CLR4_4_111ho11holb90pafb.R.inc(48681);resetReplayFile();
            __CLR4_4_111ho11holb90pafb.R.inc(48682);if ((str = filePointer.readLine()) == null) {{
                __CLR4_4_111ho11holb90pafb.R.inc(48685);throw new MathIllegalStateException(LocalizedFormats.URL_CONTAINS_NO_DATA,
                                                    valuesFileURL);
            }
        }}
        }__CLR4_4_111ho11holb90pafb.R.inc(48686);return Double.parseDouble(str);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Gets a uniformly distributed random value with mean = mu.
     *
     * @return random uniform value
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    private double getNextUniform() throws MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48687);
        __CLR4_4_111ho11holb90pafb.R.inc(48688);return randomData.nextUniform(0, 2 * mu);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Gets an exponentially distributed random value with mean = mu.
     *
     * @return random exponential value
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    private double getNextExponential() throws MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48689);
        __CLR4_4_111ho11holb90pafb.R.inc(48690);return randomData.nextExponential(mu);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

    /**
     * Gets a Gaussian distributed random value with mean = mu
     * and standard deviation = sigma.
     *
     * @return random Gaussian value
     * @throws MathIllegalArgumentException if the underlying random generator thwrows one
     */
    private double getNextGaussian() throws MathIllegalArgumentException {try{__CLR4_4_111ho11holb90pafb.R.inc(48691);
        __CLR4_4_111ho11holb90pafb.R.inc(48692);return randomData.nextGaussian(mu, sigma);
    }finally{__CLR4_4_111ho11holb90pafb.R.flushNeeded();}}

}
