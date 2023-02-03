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
 * Test cases for {@link KolmogorovSmirnovDistribution}.
 *
 * @version $Id$
 */
public class KolmogorovSmirnovDistributionTest {static class __CLR4_4_11jwt1jwtlb90pce5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,72487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final double TOLERANCE = 10e-10;

    @Test
    public void testCumulativeDensityFunction() {__CLR4_4_11jwt1jwtlb90pce5.R.globalSliceStart(getClass().getName(),72461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha7nxe1jwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jwt1jwtlb90pce5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jwt1jwtlb90pce5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.KolmogorovSmirnovDistributionTest.testCumulativeDensityFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha7nxe1jwt(){try{__CLR4_4_11jwt1jwtlb90pce5.R.inc(72461);
        
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72462);KolmogorovSmirnovDistribution dist;
        
        /* The code below is generated using the R-script located in
         * /src/test/R/KolmogorovSmirnovDistributionTestCases.R
         */
        
        /* R version 2.11.1 (2010-05-31) */


        /* formatC(.C("pkolmogorov2x", p = as.double(0.005), n = as.integer(200), PACKAGE = "stats")$p, 40) gives
         * 4.907829957616471622388047046469198862537e-86
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72463);dist = new KolmogorovSmirnovDistribution(200);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72464);Assert.assertEquals(4.907829957616471622388047046469198862537e-86, dist.cdf(0.005, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.02), n = as.integer(200), PACKAGE = "stats")$p, 40) gives
         * 5.151982014280041957199687829849210629618e-06
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72465);dist = new KolmogorovSmirnovDistribution(200);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72466);Assert.assertEquals(5.151982014280041957199687829849210629618e-06, dist.cdf(0.02, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.031111), n = as.integer(200), PACKAGE = "stats")$p, 40) gives
         * 0.01291614648162886340443389343590752105229
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72467);dist = new KolmogorovSmirnovDistribution(200);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72468);Assert.assertEquals(0.01291614648162886340443389343590752105229, dist.cdf(0.031111, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.04), n = as.integer(200), PACKAGE = "stats")$p, 40) gives
         * 0.1067137011362679355208626930107129737735
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72469);dist = new KolmogorovSmirnovDistribution(200);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72470);Assert.assertEquals(0.1067137011362679355208626930107129737735, dist.cdf(0.04, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.005), n = as.integer(341), PACKAGE = "stats")$p, 40) gives
         * 1.914734701559404553985102395145063418825e-53
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72471);dist = new KolmogorovSmirnovDistribution(341);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72472);Assert.assertEquals(1.914734701559404553985102395145063418825e-53, dist.cdf(0.005, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.02), n = as.integer(341), PACKAGE = "stats")$p, 40) gives
         * 0.001171328985781981343872182321774744195864
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72473);dist = new KolmogorovSmirnovDistribution(341);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72474);Assert.assertEquals(0.001171328985781981343872182321774744195864, dist.cdf(0.02, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.031111), n = as.integer(341), PACKAGE = "stats")$p, 40) gives
         * 0.1142955196267499418105728636874118819833
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72475);dist = new KolmogorovSmirnovDistribution(341);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72476);Assert.assertEquals(0.1142955196267499418105728636874118819833, dist.cdf(0.031111, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.04), n = as.integer(341), PACKAGE = "stats")$p, 40) gives
         * 0.3685529520496805266915885113121476024389
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72477);dist = new KolmogorovSmirnovDistribution(341);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72478);Assert.assertEquals(0.3685529520496805266915885113121476024389, dist.cdf(0.04, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.005), n = as.integer(389), PACKAGE = "stats")$p, 40) gives
         * 1.810657144595055888918455512707637574637e-47
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72479);dist = new KolmogorovSmirnovDistribution(389);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72480);Assert.assertEquals(1.810657144595055888918455512707637574637e-47, dist.cdf(0.005, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.02), n = as.integer(389), PACKAGE = "stats")$p, 40) gives
         * 0.003068542559702356568168690742481885536108
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72481);dist = new KolmogorovSmirnovDistribution(389);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72482);Assert.assertEquals(0.003068542559702356568168690742481885536108, dist.cdf(0.02, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.031111), n = as.integer(389), PACKAGE = "stats")$p, 40) gives
         * 0.1658291700122746237244797384846606291831
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72483);dist = new KolmogorovSmirnovDistribution(389);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72484);Assert.assertEquals(0.1658291700122746237244797384846606291831, dist.cdf(0.031111, false), TOLERANCE);

        /* formatC(.C("pkolmogorov2x", p = as.double(0.04), n = as.integer(389), PACKAGE = "stats")$p, 40) gives
         * 0.4513143712128902529379104180407011881471
         */
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72485);dist = new KolmogorovSmirnovDistribution(389);
        __CLR4_4_11jwt1jwtlb90pce5.R.inc(72486);Assert.assertEquals(0.4513143712128902529379104180407011881471, dist.cdf(0.04, false), TOLERANCE);

    }finally{__CLR4_4_11jwt1jwtlb90pce5.R.flushNeeded();}}

}
