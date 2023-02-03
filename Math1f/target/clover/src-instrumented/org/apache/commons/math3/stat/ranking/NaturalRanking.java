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

package org.apache.commons.math3.stat.ranking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.FastMath;


/**
 * <p> Ranking based on the natural ordering on doubles.</p>
 * <p>NaNs are treated according to the configured {@link NaNStrategy} and ties
 * are handled using the selected {@link TiesStrategy}.
 * Configuration settings are supplied in optional constructor arguments.
 * Defaults are {@link NaNStrategy#FAILED} and {@link TiesStrategy#AVERAGE},
 * respectively. When using {@link TiesStrategy#RANDOM}, a
 * {@link RandomGenerator} may be supplied as a constructor argument.</p>
 * <p>Examples:
 * <table border="1" cellpadding="3">
 * <tr><th colspan="3">
 * Input data: (20, 17, 30, 42.3, 17, 50, Double.NaN, Double.NEGATIVE_INFINITY, 17)
 * </th></tr>
 * <tr><th>NaNStrategy</th><th>TiesStrategy</th>
 * <th><code>rank(data)</code></th>
 * <tr>
 * <td>default (NaNs maximal)</td>
 * <td>default (ties averaged)</td>
 * <td>(5, 3, 6, 7, 3, 8, 9, 1, 3)</td></tr>
 * <tr>
 * <td>default (NaNs maximal)</td>
 * <td>MINIMUM</td>
 * <td>(5, 2, 6, 7, 2, 8, 9, 1, 2)</td></tr>
 * <tr>
 * <td>MINIMAL</td>
 * <td>default (ties averaged)</td>
 * <td>(6, 4, 7, 8, 4, 9, 1.5, 1.5, 4)</td></tr>
 * <tr>
 * <td>REMOVED</td>
 * <td>SEQUENTIAL</td>
 * <td>(5, 2, 6, 7, 3, 8, 1, 4)</td></tr>
 * <tr>
 * <td>MINIMAL</td>
 * <td>MAXIMUM</td>
 * <td>(6, 5, 7, 8, 5, 9, 2, 2, 5)</td></tr></table></p>
 *
 * @since 2.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NaturalRanking implements RankingAlgorithm {public static class __CLR4_4_1159a159alb90par8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** default NaN strategy */
    public static final NaNStrategy DEFAULT_NAN_STRATEGY = NaNStrategy.FAILED;

    /** default ties strategy */
    public static final TiesStrategy DEFAULT_TIES_STRATEGY = TiesStrategy.AVERAGE;

    /** NaN strategy - defaults to NaNs maximal */
    private final NaNStrategy nanStrategy;

    /** Ties strategy - defaults to ties averaged */
    private final TiesStrategy tiesStrategy;

    /** Source of random data - used only when ties strategy is RANDOM */
    private final RandomDataGenerator randomData;

    /**
     * Create a NaturalRanking with default strategies for handling ties and NaNs.
     */
    public NaturalRanking() {
        super();__CLR4_4_1159a159alb90par8.R.inc(53471);try{__CLR4_4_1159a159alb90par8.R.inc(53470);
        __CLR4_4_1159a159alb90par8.R.inc(53472);tiesStrategy = DEFAULT_TIES_STRATEGY;
        __CLR4_4_1159a159alb90par8.R.inc(53473);nanStrategy = DEFAULT_NAN_STRATEGY;
        __CLR4_4_1159a159alb90par8.R.inc(53474);randomData = null;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Create a NaturalRanking with the given TiesStrategy.
     *
     * @param tiesStrategy the TiesStrategy to use
     */
    public NaturalRanking(TiesStrategy tiesStrategy) {
        super();__CLR4_4_1159a159alb90par8.R.inc(53476);try{__CLR4_4_1159a159alb90par8.R.inc(53475);
        __CLR4_4_1159a159alb90par8.R.inc(53477);this.tiesStrategy = tiesStrategy;
        __CLR4_4_1159a159alb90par8.R.inc(53478);nanStrategy = DEFAULT_NAN_STRATEGY;
        __CLR4_4_1159a159alb90par8.R.inc(53479);randomData = new RandomDataGenerator();
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Create a NaturalRanking with the given NaNStrategy.
     *
     * @param nanStrategy the NaNStrategy to use
     */
    public NaturalRanking(NaNStrategy nanStrategy) {
        super();__CLR4_4_1159a159alb90par8.R.inc(53481);try{__CLR4_4_1159a159alb90par8.R.inc(53480);
        __CLR4_4_1159a159alb90par8.R.inc(53482);this.nanStrategy = nanStrategy;
        __CLR4_4_1159a159alb90par8.R.inc(53483);tiesStrategy = DEFAULT_TIES_STRATEGY;
        __CLR4_4_1159a159alb90par8.R.inc(53484);randomData = null;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Create a NaturalRanking with the given NaNStrategy and TiesStrategy.
     *
     * @param nanStrategy NaNStrategy to use
     * @param tiesStrategy TiesStrategy to use
     */
    public NaturalRanking(NaNStrategy nanStrategy, TiesStrategy tiesStrategy) {
        super();__CLR4_4_1159a159alb90par8.R.inc(53486);try{__CLR4_4_1159a159alb90par8.R.inc(53485);
        __CLR4_4_1159a159alb90par8.R.inc(53487);this.nanStrategy = nanStrategy;
        __CLR4_4_1159a159alb90par8.R.inc(53488);this.tiesStrategy = tiesStrategy;
        __CLR4_4_1159a159alb90par8.R.inc(53489);randomData = new RandomDataGenerator();
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Create a NaturalRanking with TiesStrategy.RANDOM and the given
     * RandomGenerator as the source of random data.
     *
     * @param randomGenerator source of random data
     */
    public NaturalRanking(RandomGenerator randomGenerator) {
        super();__CLR4_4_1159a159alb90par8.R.inc(53491);try{__CLR4_4_1159a159alb90par8.R.inc(53490);
        __CLR4_4_1159a159alb90par8.R.inc(53492);this.tiesStrategy = TiesStrategy.RANDOM;
        __CLR4_4_1159a159alb90par8.R.inc(53493);nanStrategy = DEFAULT_NAN_STRATEGY;
        __CLR4_4_1159a159alb90par8.R.inc(53494);randomData = new RandomDataGenerator(randomGenerator);
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}


    /**
     * Create a NaturalRanking with the given NaNStrategy, TiesStrategy.RANDOM
     * and the given source of random data.
     *
     * @param nanStrategy NaNStrategy to use
     * @param randomGenerator source of random data
     */
    public NaturalRanking(NaNStrategy nanStrategy,
            RandomGenerator randomGenerator) {
        super();__CLR4_4_1159a159alb90par8.R.inc(53496);try{__CLR4_4_1159a159alb90par8.R.inc(53495);
        __CLR4_4_1159a159alb90par8.R.inc(53497);this.nanStrategy = nanStrategy;
        __CLR4_4_1159a159alb90par8.R.inc(53498);this.tiesStrategy = TiesStrategy.RANDOM;
        __CLR4_4_1159a159alb90par8.R.inc(53499);randomData = new RandomDataGenerator(randomGenerator);
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Return the NaNStrategy
     *
     * @return returns the NaNStrategy
     */
    public NaNStrategy getNanStrategy() {try{__CLR4_4_1159a159alb90par8.R.inc(53500);
        __CLR4_4_1159a159alb90par8.R.inc(53501);return nanStrategy;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Return the TiesStrategy
     *
     * @return the TiesStrategy
     */
    public TiesStrategy getTiesStrategy() {try{__CLR4_4_1159a159alb90par8.R.inc(53502);
        __CLR4_4_1159a159alb90par8.R.inc(53503);return tiesStrategy;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Rank <code>data</code> using the natural ordering on Doubles, with
     * NaN values handled according to <code>nanStrategy</code> and ties
     * resolved using <code>tiesStrategy.</code>
     *
     * @param data array to be ranked
     * @return array of ranks
     * @throws NotANumberException if the selected {@link NaNStrategy} is {@code FAILED}
     * and a {@link Double#NaN} is encountered in the input data
     */
    public double[] rank(double[] data) {try{__CLR4_4_1159a159alb90par8.R.inc(53504);

        // Array recording initial positions of data to be ranked
        __CLR4_4_1159a159alb90par8.R.inc(53505);IntDoublePair[] ranks = new IntDoublePair[data.length];
        __CLR4_4_1159a159alb90par8.R.inc(53506);for (int i = 0; (((i < data.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53507)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53508)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53509);ranks[i] = new IntDoublePair(data[i], i);
        }

        // Recode, remove or record positions of NaNs
        }__CLR4_4_1159a159alb90par8.R.inc(53510);List<Integer> nanPositions = null;
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1159a159alb90par8.R.inc(53511);switch (nanStrategy) {
            case MAXIMAL:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53512);__CLB4_4_1_bool0=true;} // Replace NaNs with +INFs
                __CLR4_4_1159a159alb90par8.R.inc(53513);recodeNaNs(ranks, Double.POSITIVE_INFINITY);
                __CLR4_4_1159a159alb90par8.R.inc(53514);break;
            case MINIMAL:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53515);__CLB4_4_1_bool0=true;} // Replace NaNs with -INFs
                __CLR4_4_1159a159alb90par8.R.inc(53516);recodeNaNs(ranks, Double.NEGATIVE_INFINITY);
                __CLR4_4_1159a159alb90par8.R.inc(53517);break;
            case REMOVED:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53518);__CLB4_4_1_bool0=true;} // Drop NaNs from data
                __CLR4_4_1159a159alb90par8.R.inc(53519);ranks = removeNaNs(ranks);
                __CLR4_4_1159a159alb90par8.R.inc(53520);break;
            case FIXED:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53521);__CLB4_4_1_bool0=true;}   // Record positions of NaNs
                __CLR4_4_1159a159alb90par8.R.inc(53522);nanPositions = getNanPositions(ranks);
                __CLR4_4_1159a159alb90par8.R.inc(53523);break;
            case FAILED:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53524);__CLB4_4_1_bool0=true;}
                __CLR4_4_1159a159alb90par8.R.inc(53525);nanPositions = getNanPositions(ranks);
                __CLR4_4_1159a159alb90par8.R.inc(53526);if ((((nanPositions.size() > 0)&&(__CLR4_4_1159a159alb90par8.R.iget(53527)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53528)==0&false))) {{
                    __CLR4_4_1159a159alb90par8.R.inc(53529);throw new NotANumberException();
                }
                }__CLR4_4_1159a159alb90par8.R.inc(53530);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1159a159alb90par8.R.inc(53531);__CLB4_4_1_bool0=true;} // this should not happen unless NaNStrategy enum is changed
                __CLR4_4_1159a159alb90par8.R.inc(53532);throw new MathInternalError();
        }

        // Sort the IntDoublePairs
        __CLR4_4_1159a159alb90par8.R.inc(53533);Arrays.sort(ranks);

        // Walk the sorted array, filling output array using sorted positions,
        // resolving ties as we go
        __CLR4_4_1159a159alb90par8.R.inc(53534);double[] out = new double[ranks.length];
        __CLR4_4_1159a159alb90par8.R.inc(53535);int pos = 1;  // position in sorted array
        __CLR4_4_1159a159alb90par8.R.inc(53536);out[ranks[0].getPosition()] = pos;
        __CLR4_4_1159a159alb90par8.R.inc(53537);List<Integer> tiesTrace = new ArrayList<Integer>();
        __CLR4_4_1159a159alb90par8.R.inc(53538);tiesTrace.add(ranks[0].getPosition());
        __CLR4_4_1159a159alb90par8.R.inc(53539);for (int i = 1; (((i < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53540)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53541)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53542);if ((((Double.compare(ranks[i].getValue(), ranks[i - 1].getValue()) > 0)&&(__CLR4_4_1159a159alb90par8.R.iget(53543)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53544)==0&false))) {{
                // tie sequence has ended (or had length 1)
                __CLR4_4_1159a159alb90par8.R.inc(53545);pos = i + 1;
                __CLR4_4_1159a159alb90par8.R.inc(53546);if ((((tiesTrace.size() > 1)&&(__CLR4_4_1159a159alb90par8.R.iget(53547)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53548)==0&false))) {{  // if seq is nontrivial, resolve
                    __CLR4_4_1159a159alb90par8.R.inc(53549);resolveTie(out, tiesTrace);
                }
                }__CLR4_4_1159a159alb90par8.R.inc(53550);tiesTrace = new ArrayList<Integer>();
                __CLR4_4_1159a159alb90par8.R.inc(53551);tiesTrace.add(ranks[i].getPosition());
            } }else {{
                // tie sequence continues
                __CLR4_4_1159a159alb90par8.R.inc(53552);tiesTrace.add(ranks[i].getPosition());
            }
            }__CLR4_4_1159a159alb90par8.R.inc(53553);out[ranks[i].getPosition()] = pos;
        }
        }__CLR4_4_1159a159alb90par8.R.inc(53554);if ((((tiesTrace.size() > 1)&&(__CLR4_4_1159a159alb90par8.R.iget(53555)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53556)==0&false))) {{  // handle tie sequence at end
            __CLR4_4_1159a159alb90par8.R.inc(53557);resolveTie(out, tiesTrace);
        }
        }__CLR4_4_1159a159alb90par8.R.inc(53558);if ((((nanStrategy == NaNStrategy.FIXED)&&(__CLR4_4_1159a159alb90par8.R.iget(53559)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53560)==0&false))) {{
            __CLR4_4_1159a159alb90par8.R.inc(53561);restoreNaNs(out, nanPositions);
        }
        }__CLR4_4_1159a159alb90par8.R.inc(53562);return out;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Returns an array that is a copy of the input array with IntDoublePairs
     * having NaN values removed.
     *
     * @param ranks input array
     * @return array with NaN-valued entries removed
     */
    private IntDoublePair[] removeNaNs(IntDoublePair[] ranks) {try{__CLR4_4_1159a159alb90par8.R.inc(53563);
        __CLR4_4_1159a159alb90par8.R.inc(53564);if ((((!containsNaNs(ranks))&&(__CLR4_4_1159a159alb90par8.R.iget(53565)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53566)==0&false))) {{
            __CLR4_4_1159a159alb90par8.R.inc(53567);return ranks;
        }
        }__CLR4_4_1159a159alb90par8.R.inc(53568);IntDoublePair[] outRanks = new IntDoublePair[ranks.length];
        __CLR4_4_1159a159alb90par8.R.inc(53569);int j = 0;
        __CLR4_4_1159a159alb90par8.R.inc(53570);for (int i = 0; (((i < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53571)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53572)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53573);if ((((Double.isNaN(ranks[i].getValue()))&&(__CLR4_4_1159a159alb90par8.R.iget(53574)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53575)==0&false))) {{
                // drop, but adjust original ranks of later elements
                __CLR4_4_1159a159alb90par8.R.inc(53576);for (int k = i + 1; (((k < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53577)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53578)==0&false)); k++) {{
                    __CLR4_4_1159a159alb90par8.R.inc(53579);ranks[k] = new IntDoublePair(
                            ranks[k].getValue(), ranks[k].getPosition() - 1);
                }
            }} }else {{
                __CLR4_4_1159a159alb90par8.R.inc(53580);outRanks[j] = new IntDoublePair(
                        ranks[i].getValue(), ranks[i].getPosition());
                __CLR4_4_1159a159alb90par8.R.inc(53581);j++;
            }
        }}
        }__CLR4_4_1159a159alb90par8.R.inc(53582);IntDoublePair[] returnRanks = new IntDoublePair[j];
        __CLR4_4_1159a159alb90par8.R.inc(53583);System.arraycopy(outRanks, 0, returnRanks, 0, j);
        __CLR4_4_1159a159alb90par8.R.inc(53584);return returnRanks;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Recodes NaN values to the given value.
     *
     * @param ranks array to recode
     * @param value the value to replace NaNs with
     */
    private void recodeNaNs(IntDoublePair[] ranks, double value) {try{__CLR4_4_1159a159alb90par8.R.inc(53585);
        __CLR4_4_1159a159alb90par8.R.inc(53586);for (int i = 0; (((i < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53587)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53588)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53589);if ((((Double.isNaN(ranks[i].getValue()))&&(__CLR4_4_1159a159alb90par8.R.iget(53590)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53591)==0&false))) {{
                __CLR4_4_1159a159alb90par8.R.inc(53592);ranks[i] = new IntDoublePair(
                        value, ranks[i].getPosition());
            }
        }}
    }}finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Checks for presence of NaNs in <code>ranks.</code>
     *
     * @param ranks array to be searched for NaNs
     * @return true iff ranks contains one or more NaNs
     */
    private boolean containsNaNs(IntDoublePair[] ranks) {try{__CLR4_4_1159a159alb90par8.R.inc(53593);
        __CLR4_4_1159a159alb90par8.R.inc(53594);for (int i = 0; (((i < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53595)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53596)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53597);if ((((Double.isNaN(ranks[i].getValue()))&&(__CLR4_4_1159a159alb90par8.R.iget(53598)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53599)==0&false))) {{
                __CLR4_4_1159a159alb90par8.R.inc(53600);return true;
            }
        }}
        }__CLR4_4_1159a159alb90par8.R.inc(53601);return false;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Resolve a sequence of ties, using the configured {@link TiesStrategy}.
     * The input <code>ranks</code> array is expected to take the same value
     * for all indices in <code>tiesTrace</code>.  The common value is recoded
     * according to the tiesStrategy. For example, if ranks = <5,8,2,6,2,7,1,2>,
     * tiesTrace = <2,4,7> and tiesStrategy is MINIMUM, ranks will be unchanged.
     * The same array and trace with tiesStrategy AVERAGE will come out
     * <5,8,3,6,3,7,1,3>.
     *
     * @param ranks array of ranks
     * @param tiesTrace list of indices where <code>ranks</code> is constant
     * -- that is, for any i and j in TiesTrace, <code> ranks[i] == ranks[j]
     * </code>
     */
    private void resolveTie(double[] ranks, List<Integer> tiesTrace) {try{__CLR4_4_1159a159alb90par8.R.inc(53602);

        // constant value of ranks over tiesTrace
        __CLR4_4_1159a159alb90par8.R.inc(53603);final double c = ranks[tiesTrace.get(0)];

        // length of sequence of tied ranks
        __CLR4_4_1159a159alb90par8.R.inc(53604);final int length = tiesTrace.size();

        boolean __CLB4_4_1_bool1=false;__CLR4_4_1159a159alb90par8.R.inc(53605);switch (tiesStrategy) {
            case  AVERAGE:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53606);__CLB4_4_1_bool1=true;}  // Replace ranks with average
                __CLR4_4_1159a159alb90par8.R.inc(53607);fill(ranks, tiesTrace, (2 * c + length - 1) / 2d);
                __CLR4_4_1159a159alb90par8.R.inc(53608);break;
            case MAXIMUM:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53609);__CLB4_4_1_bool1=true;}   // Replace ranks with maximum values
                __CLR4_4_1159a159alb90par8.R.inc(53610);fill(ranks, tiesTrace, c + length - 1);
                __CLR4_4_1159a159alb90par8.R.inc(53611);break;
            case MINIMUM:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53612);__CLB4_4_1_bool1=true;}   // Replace ties with minimum
                __CLR4_4_1159a159alb90par8.R.inc(53613);fill(ranks, tiesTrace, c);
                __CLR4_4_1159a159alb90par8.R.inc(53614);break;
            case RANDOM:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53615);__CLB4_4_1_bool1=true;}    // Fill with random integral values in [c, c + length - 1]
                __CLR4_4_1159a159alb90par8.R.inc(53616);Iterator<Integer> iterator = tiesTrace.iterator();
                __CLR4_4_1159a159alb90par8.R.inc(53617);long f = FastMath.round(c);
                __CLR4_4_1159a159alb90par8.R.inc(53618);while ((((iterator.hasNext())&&(__CLR4_4_1159a159alb90par8.R.iget(53619)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53620)==0&false))) {{
                    // No advertised exception because args are guaranteed valid
                    __CLR4_4_1159a159alb90par8.R.inc(53621);ranks[iterator.next()] =
                        randomData.nextLong(f, f + length - 1);
                }
                }__CLR4_4_1159a159alb90par8.R.inc(53622);break;
            case SEQUENTIAL:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53623);__CLB4_4_1_bool1=true;}  // Fill sequentially from c to c + length - 1
                // walk and fill
                __CLR4_4_1159a159alb90par8.R.inc(53624);iterator = tiesTrace.iterator();
                __CLR4_4_1159a159alb90par8.R.inc(53625);f = FastMath.round(c);
                __CLR4_4_1159a159alb90par8.R.inc(53626);int i = 0;
                __CLR4_4_1159a159alb90par8.R.inc(53627);while ((((iterator.hasNext())&&(__CLR4_4_1159a159alb90par8.R.iget(53628)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53629)==0&false))) {{
                    __CLR4_4_1159a159alb90par8.R.inc(53630);ranks[iterator.next()] = f + i++;
                }
                }__CLR4_4_1159a159alb90par8.R.inc(53631);break;
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_1159a159alb90par8.R.inc(53632);__CLB4_4_1_bool1=true;} // this should not happen unless TiesStrategy enum is changed
                __CLR4_4_1159a159alb90par8.R.inc(53633);throw new MathInternalError();
        }
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Sets<code>data[i] = value</code> for each i in <code>tiesTrace.</code>
     *
     * @param data array to modify
     * @param tiesTrace list of index values to set
     * @param value value to set
     */
    private void fill(double[] data, List<Integer> tiesTrace, double value) {try{__CLR4_4_1159a159alb90par8.R.inc(53634);
        __CLR4_4_1159a159alb90par8.R.inc(53635);Iterator<Integer> iterator = tiesTrace.iterator();
        __CLR4_4_1159a159alb90par8.R.inc(53636);while ((((iterator.hasNext())&&(__CLR4_4_1159a159alb90par8.R.iget(53637)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53638)==0&false))) {{
            __CLR4_4_1159a159alb90par8.R.inc(53639);data[iterator.next()] = value;
        }
    }}finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Set <code>ranks[i] = Double.NaN</code> for each i in <code>nanPositions.</code>
     *
     * @param ranks array to modify
     * @param nanPositions list of index values to set to <code>Double.NaN</code>
     */
    private void restoreNaNs(double[] ranks, List<Integer> nanPositions) {try{__CLR4_4_1159a159alb90par8.R.inc(53640);
        __CLR4_4_1159a159alb90par8.R.inc(53641);if ((((nanPositions.size() == 0)&&(__CLR4_4_1159a159alb90par8.R.iget(53642)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53643)==0&false))) {{
            __CLR4_4_1159a159alb90par8.R.inc(53644);return;
        }
        }__CLR4_4_1159a159alb90par8.R.inc(53645);Iterator<Integer> iterator = nanPositions.iterator();
        __CLR4_4_1159a159alb90par8.R.inc(53646);while ((((iterator.hasNext())&&(__CLR4_4_1159a159alb90par8.R.iget(53647)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53648)==0&false))) {{
            __CLR4_4_1159a159alb90par8.R.inc(53649);ranks[iterator.next().intValue()] = Double.NaN;
        }

    }}finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Returns a list of indexes where <code>ranks</code> is <code>NaN.</code>
     *
     * @param ranks array to search for <code>NaNs</code>
     * @return list of indexes i such that <code>ranks[i] = NaN</code>
     */
    private List<Integer> getNanPositions(IntDoublePair[] ranks) {try{__CLR4_4_1159a159alb90par8.R.inc(53650);
        __CLR4_4_1159a159alb90par8.R.inc(53651);ArrayList<Integer> out = new ArrayList<Integer>();
        __CLR4_4_1159a159alb90par8.R.inc(53652);for (int i = 0; (((i < ranks.length)&&(__CLR4_4_1159a159alb90par8.R.iget(53653)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53654)==0&false)); i++) {{
            __CLR4_4_1159a159alb90par8.R.inc(53655);if ((((Double.isNaN(ranks[i].getValue()))&&(__CLR4_4_1159a159alb90par8.R.iget(53656)!=0|true))||(__CLR4_4_1159a159alb90par8.R.iget(53657)==0&false))) {{
                __CLR4_4_1159a159alb90par8.R.inc(53658);out.add(Integer.valueOf(i));
            }
        }}
        }__CLR4_4_1159a159alb90par8.R.inc(53659);return out;
    }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

    /**
     * Represents the position of a double value in an ordering.
     * Comparable interface is implemented so Arrays.sort can be used
     * to sort an array of IntDoublePairs by value.  Note that the
     * implicitly defined natural ordering is NOT consistent with equals.
     */
    private static class IntDoublePair implements Comparable<IntDoublePair>  {

        /** Value of the pair */
        private final double value;

        /** Original position of the pair */
        private final int position;

        /**
         * Construct an IntDoublePair with the given value and position.
         * @param value the value of the pair
         * @param position the original position
         */
        public IntDoublePair(double value, int position) {try{__CLR4_4_1159a159alb90par8.R.inc(53660);
            __CLR4_4_1159a159alb90par8.R.inc(53661);this.value = value;
            __CLR4_4_1159a159alb90par8.R.inc(53662);this.position = position;
        }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

        /**
         * Compare this IntDoublePair to another pair.
         * Only the <strong>values</strong> are compared.
         *
         * @param other the other pair to compare this to
         * @return result of <code>Double.compare(value, other.value)</code>
         */
        public int compareTo(IntDoublePair other) {try{__CLR4_4_1159a159alb90par8.R.inc(53663);
            __CLR4_4_1159a159alb90par8.R.inc(53664);return Double.compare(value, other.value);
        }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

        // N.B. equals() and hashCode() are not implemented; see MATH-610 for discussion.

        /**
         * Returns the value of the pair.
         * @return value
         */
        public double getValue() {try{__CLR4_4_1159a159alb90par8.R.inc(53665);
            __CLR4_4_1159a159alb90par8.R.inc(53666);return value;
        }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}

        /**
         * Returns the original position of the pair.
         * @return position
         */
        public int getPosition() {try{__CLR4_4_1159a159alb90par8.R.inc(53667);
            __CLR4_4_1159a159alb90par8.R.inc(53668);return position;
        }finally{__CLR4_4_1159a159alb90par8.R.flushNeeded();}}
    }
}
