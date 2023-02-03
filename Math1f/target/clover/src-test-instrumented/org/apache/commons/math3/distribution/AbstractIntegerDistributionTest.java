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
package org.apache.commons.math3.distribution;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for AbstractIntegerDistribution default implementations.
 *
 * @version $Id$
 */
public class AbstractIntegerDistributionTest {static class __CLR4_4_11j1y1j1ylb90pcag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected final DiceDistribution diceDistribution = new DiceDistribution();
    protected final double p = diceDistribution.probability(1);

    @Test
    public void testCumulativeProbabilitiesSingleArguments() {__CLR4_4_11j1y1j1ylb90pcag.R.globalSliceStart(getClass().getName(),71350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1n8x31j1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j1y1j1ylb90pcag.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j1y1j1ylb90pcag.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.AbstractIntegerDistributionTest.testCumulativeProbabilitiesSingleArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1n8x31j1y(){try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71350);
        __CLR4_4_11j1y1j1ylb90pcag.R.inc(71351);for (int i = 1; (((i < 7)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71352)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71353)==0&false)); i++) {{
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71354);Assert.assertEquals(p * i,
                    diceDistribution.cumulativeProbability(i), Double.MIN_VALUE);
        }
        }__CLR4_4_11j1y1j1ylb90pcag.R.inc(71355);Assert.assertEquals(0.0,
                diceDistribution.cumulativeProbability(0), Double.MIN_VALUE);
        __CLR4_4_11j1y1j1ylb90pcag.R.inc(71356);Assert.assertEquals(1.0,
                diceDistribution.cumulativeProbability(7), Double.MIN_VALUE);
    }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

    @Test
    public void testCumulativeProbabilitiesRangeArguments() {__CLR4_4_11j1y1j1ylb90pcag.R.globalSliceStart(getClass().getName(),71357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a24v761j25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j1y1j1ylb90pcag.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j1y1j1ylb90pcag.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.AbstractIntegerDistributionTest.testCumulativeProbabilitiesRangeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a24v761j25(){try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71357);
        __CLR4_4_11j1y1j1ylb90pcag.R.inc(71358);int lower = 0;
        __CLR4_4_11j1y1j1ylb90pcag.R.inc(71359);int upper = 6;
        __CLR4_4_11j1y1j1ylb90pcag.R.inc(71360);for (int i = 0; (((i < 2)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71361)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71362)==0&false)); i++) {{
            // cum(0,6) = p(0 < X <= 6) = 1, cum(1,5) = 4/6, cum(2,4) = 2/6
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71363);Assert.assertEquals(1 - p * 2 * i,
                    diceDistribution.cumulativeProbability(lower, upper), 1E-12);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71364);lower++;
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71365);upper--;
        }
        }__CLR4_4_11j1y1j1ylb90pcag.R.inc(71366);for (int i = 0; (((i < 6)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71367)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71368)==0&false)); i++) {{
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71369);Assert.assertEquals(p, diceDistribution.cumulativeProbability(i, i+1), 1E-12);
        }
    }}finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

    /**
     * Simple distribution modeling a 6-sided die
     */
    class DiceDistribution extends AbstractIntegerDistribution {
        public static final long serialVersionUID = 23734213;

        private final double p = 1d/6d;

        public DiceDistribution() {
            super(null);__CLR4_4_11j1y1j1ylb90pcag.R.inc(71371);try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71370);
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public double probability(int x) {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71372);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71373);if ((((x < 1 || x > 6)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71374)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71375)==0&false))) {{
                __CLR4_4_11j1y1j1ylb90pcag.R.inc(71376);return 0;
            } }else {{
                __CLR4_4_11j1y1j1ylb90pcag.R.inc(71377);return p;
            }
        }}finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public double cumulativeProbability(int x) {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71378);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71379);if ((((x < 1)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71380)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71381)==0&false))) {{
                __CLR4_4_11j1y1j1ylb90pcag.R.inc(71382);return 0;
            } }else {__CLR4_4_11j1y1j1ylb90pcag.R.inc(71383);if ((((x >= 6)&&(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71384)!=0|true))||(__CLR4_4_11j1y1j1ylb90pcag.R.iget(71385)==0&false))) {{
                __CLR4_4_11j1y1j1ylb90pcag.R.inc(71386);return 1;
            } }else {{
                __CLR4_4_11j1y1j1ylb90pcag.R.inc(71387);return p * x;
            }
        }}}finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public double getNumericalMean() {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71388);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71389);return 3.5;
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public double getNumericalVariance() {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71390);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71391);return 12.5 - 3.5 * 3.5;  // E(X^2) - E(X)^2
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public int getSupportLowerBound() {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71392);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71393);return 1;
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public int getSupportUpperBound() {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71394);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71395);return 6;
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}

        public final boolean isSupportConnected() {try{__CLR4_4_11j1y1j1ylb90pcag.R.inc(71396);
            __CLR4_4_11j1y1j1ylb90pcag.R.inc(71397);return true;
        }finally{__CLR4_4_11j1y1j1ylb90pcag.R.flushNeeded();}}
    }
}
