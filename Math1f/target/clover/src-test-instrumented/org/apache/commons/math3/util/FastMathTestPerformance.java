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
package org.apache.commons.math3.util;

import org.apache.commons.math3.PerfTestUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 * Performance tests for FastMath.
 * Not enabled by default, as the class does not end in Test.
 * 
 * Invoke by running<br/>
 * {@code mvn test -Dtest=FastMathTestPerformance}<br/>
 * or by running<br/>
 * {@code mvn test -Dtest=FastMathTestPerformance -DargLine="-DtestRuns=1234 -server"}<br/>
 */
public class FastMathTestPerformance {static class __CLR4_4_12fnm2fnmlb90pf3p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,114255,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int RUNS = Integer.parseInt(System.getProperty("testRuns","10000000"));
    private static final double F1 = 1d / RUNS;

    // Header format
    private static final String FMT_HDR = "%-5s %13s %13s %13s Runs=%d Java %s (%s) %s (%s)";
    // Detail format
    private static final String FMT_DTL = "%-5s %6d %6.1f %6d %6.4f %6d %6.4f";

    @SuppressWarnings("boxing")
    @BeforeClass
    public static void header() {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113602);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113603);System.out.println(String.format(FMT_HDR,
                "Name","StrictMath","FastMath","Math",RUNS,
                System.getProperty("java.version"),
                System.getProperty("java.runtime.version","?"),
                System.getProperty("java.vm.name"),
                System.getProperty("java.vm.version")
                ));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private static void report(String name, long strictMathTime, long fastMathTime, long mathTime) {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113604);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113605);long unitTime = strictMathTime;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113606);System.out.println(String.format(FMT_DTL,
                name,
                strictMathTime / RUNS, (double) strictMathTime / unitTime,
                fastMathTime / RUNS, (double) fastMathTime / unitTime,
                mathTime / RUNS, (double) mathTime / unitTime
                ));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testLog() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ksyv2fnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testLog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ksyv2fnr(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113607);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113608);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113609);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113610);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113611)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113612)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113613);x += StrictMath.log(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113614);long strictMath = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113615);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113616);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113617);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113618)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113619)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113620);x += FastMath.log(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113621);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113622);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113623);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113624);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113625)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113626)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113627);x += Math.log(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113628);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113629);report("log",strictMath,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113630);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testLog10() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qum23c2fof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testLog10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qum23c2fof(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113631);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113632);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113633);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113634);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113635)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113636)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113637);x += StrictMath.log10(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113638);long strictMath = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113639);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113640);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113641);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113642)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113643)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113644);x += FastMath.log10(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113645);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113646);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113647);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113648);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113649)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113650)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113651);x += Math.log10(0.01 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113652);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113653);report("log10",strictMath,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113654);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testLog1p() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr7qs82fp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testLog1p",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr7qs82fp3(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113655);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113656);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113657);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113658);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113659)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113660)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113661);x += StrictMath.log1p(-0.9 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113662);long strictMath = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113663);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113664);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113665);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113666)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113667)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113668);x += FastMath.log1p(-0.9 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113669);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113670);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113671);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113672);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113673)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113674)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113675);x += Math.log1p(-0.9 + i);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113676);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113677);report("log1p",strictMath,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113678);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testPow() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d2fpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d2fpr(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113679);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113680);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113681);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113682);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113683)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113684)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113685);x += StrictMath.pow(0.01 + i * F1, i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113686);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113687);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113688);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113689);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113690)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113691)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113692);x += FastMath.pow(0.01 + i * F1, i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113693);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113694);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113695);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113696);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113697)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113698)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113699);x += Math.pow(0.01 + i * F1, i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113700);long mathTime = System.nanoTime() - time;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113701);report("pow",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113702);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testExp() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdnn6a2fqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testExp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdnn6a2fqf(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113703);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113704);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113705);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113706);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113707)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113708)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113709);x += StrictMath.exp(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113710);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113711);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113712);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113713);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113714)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113715)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113716);x += FastMath.exp(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113717);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113718);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113719);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113720);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113721)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113722)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113723);x += Math.exp(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113724);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113725);report("exp",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113726);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testSin() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfmv712fr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfmv712fr3(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113727);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113728);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113729);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113730);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113731)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113732)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113733);x += StrictMath.sin(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113734);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113735);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113736);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113737);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113738)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113739)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113740);x += FastMath.sin(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113741);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113742);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113743);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113744);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113745)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113746)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113747);x += Math.sin(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113748);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113749);report("sin",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113750);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testAsin() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gmpn42frr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testAsin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gmpn42frr(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113751);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113752);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113753);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113754);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113755)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113756)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113757);x += StrictMath.asin(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113758);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113759);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113760);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113761);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113762)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113763)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113764);x += FastMath.asin(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113765);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113766);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113767);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113768);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113769)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113770)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113771);x += Math.asin(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113772);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113773);report("asin",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113774);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testCos() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz11ok2fsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testCos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz11ok2fsf(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113775);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113776);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113777);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113778);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113779)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113780)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113781);x += StrictMath.cos(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113782);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113783);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113784);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113785);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113786)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113787)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113788);x += FastMath.cos(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113789);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113790);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113791);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113792);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113793)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113794)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113795);x += Math.cos(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113796);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113797);report("cos",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113798);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
            
    @Test
    public void testAcos() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175tfgf2ft3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testAcos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175tfgf2ft3(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113799);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113800);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113801);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113802);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113803)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113804)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113805);x += StrictMath.acos(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113806);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113807);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113808);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113809);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113810)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113811)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113812);x += FastMath.acos(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113813);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113814);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113815);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113816);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113817)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113818)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113819);x += Math.acos(0.999 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113820);long mathTime = System.nanoTime() - time;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113821);report("acos",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113822);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testTan() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15n93x22ftr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testTan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15n93x22ftr(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113823);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113824);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113825);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113826);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113827)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113828)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113829);x += StrictMath.tan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113830);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113831);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113832);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113833);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113834)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113835)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113836);x += FastMath.tan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113837);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113838);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113839);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113840);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113841)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113842)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113843);x += Math.tan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113844);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113845);report("tan",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113846);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testAtan() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z90gx32fuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testAtan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z90gx32fuf(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113847);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113848);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113849);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113850);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113851)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113852)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113853);x += StrictMath.atan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113854);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113855);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113856);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113857);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113858)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113859)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113860);x += FastMath.atan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113861);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113862);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113863);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113864);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113865)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113866)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113867);x += Math.atan(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113868);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113869);report("atan",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113870);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testAtan2() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhqhrb2fv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testAtan2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhqhrb2fv3(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113871);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113872);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113873);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113874);int max   = (int) FastMath.floor(FastMath.sqrt(RUNS));
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113875);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113876)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113877)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113878);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113879)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113880)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113881);x += StrictMath.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113882);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113883);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113884);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113885);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113886)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113887)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113888);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113889)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113890)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113891);x += FastMath.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113892);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113893);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113894);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113895);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113896)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113897)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113898);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113899)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113900)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113901);x += Math.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113902);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113903);report("atan2",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113904);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testHypot() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcoyex2fw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testHypot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcoyex2fw1(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113905);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113906);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113907);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113908);int max   = (int) FastMath.floor(FastMath.sqrt(RUNS));
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113909);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113910)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113911)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113912);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113913)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113914)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113915);x += StrictMath.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113916);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113917);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113918);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113919);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113920)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113921)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113922);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113923)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113924)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113925);x += FastMath.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113926);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113927);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113928);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113929);for (int i = 0; (((i < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113930)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113931)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113932);for (int j = 0; (((j < max)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113933)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113934)==0&false)); j++) {{
                __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113935);x += Math.atan2((i - max/2) * (100.0 / max), (j - max/2) * (100.0 / max));
            }
        }}
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113936);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113937);report("hypot",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113938);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
     
    @Test
    public void testCbrt() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unm0sm2fwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testCbrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unm0sm2fwz(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113939);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113940);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113941);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113942);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113943)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113944)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113945);x += StrictMath.cbrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113946);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113947);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113948);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113949);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113950)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113951)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113952);x += FastMath.cbrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113953);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113954);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113955);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113956);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113957)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113958)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113959);x += Math.cbrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113960);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113961);report("cbrt",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113962);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testSqrt() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eyjxll2fxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testSqrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eyjxll2fxn(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113963);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113964);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113965);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113966);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113967)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113968)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113969);x += StrictMath.sqrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113970);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113971);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113972);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113973);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113974)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113975)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113976);x += FastMath.sqrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113977);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113978);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113979);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113980);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113981)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113982)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113983);x += Math.sqrt(100 * i * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113984);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113985);report("sqrt",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113986);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testCosh() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),113987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cad0a2fyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testCosh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cad0a2fyb(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113987);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113988);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113989);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113990);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113991)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113992)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113993);x += StrictMath.cosh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(113994);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113995);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113996);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(113997);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113998)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(113999)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114000);x += FastMath.cosh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114001);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114002);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114003);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114004);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114005)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114006)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114007);x += Math.cosh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114008);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114009);report("cosh",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114010);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testSinh() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),114011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g86csp2fyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testSinh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g86csp2fyz(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114011);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114012);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114013);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114014);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114015)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114016)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114017);x += StrictMath.sinh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114018);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114019);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114020);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114021);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114022)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114023)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114024);x += FastMath.sinh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114025);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114026);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114027);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114028);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114029)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114030)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114031);x += Math.sinh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114032);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114033);report("sinh",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114034);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testTanh() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),114035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvfj282fzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testTanh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvfj282fzn(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114035);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114036);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114037);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114038);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114039)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114040)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114041);x += StrictMath.tanh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114042);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114043);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114044);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114045);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114046)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114047)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114048);x += FastMath.tanh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114049);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114050);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114051);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114052);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114053)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114054)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114055);x += Math.tanh(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114056);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114057);report("tanh",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114058);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
     
    @Test
    public void testExpm1() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),114059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ctcfq2g0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testExpm1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ctcfq2g0b(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114059);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114060);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114061);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114062);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114063)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114064)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114065);x += StrictMath.expm1(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114066);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114067);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114068);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114069);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114070)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114071)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114072);x += FastMath.expm1(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114073);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114074);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114075);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114076);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114077)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114078)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114079);x += Math.expm1(100 * (i - RUNS/2) * F1);
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114080);long mathTime = System.nanoTime() - time;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114081);report("expm1",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114082);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @Test
    public void testAbs() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),114083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf2g0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf2g0z(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114083);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114084);double x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114085);long time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114086);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114087)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114088)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114089);x += StrictMath.abs(i * (1 - 0.5 * RUNS));
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114090);long strictTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114091);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114092);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114093);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114094)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114095)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114096);x += FastMath.abs(i * (1 - 0.5 * RUNS));
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114097);long fastTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114098);x = 0;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114099);time = System.nanoTime();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114100);for (int i = 0; (((i < RUNS)&&(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114101)!=0|true))||(__CLR4_4_12fnm2fnmlb90pf3p.R.iget(114102)==0&false)); i++) {{
            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114103);x += Math.abs(i * (1 - 0.5 * RUNS));
        }
        }__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114104);long mathTime = System.nanoTime() - time;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114105);report("abs",strictTime,fastTime,mathTime);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114106);Assert.assertTrue(!Double.isNaN(x));
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    @Test
    public void testSimpleBenchmark() {__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceStart(getClass().getName(),114107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197nlb42g1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12fnm2fnmlb90pf3p.R.rethrow($CLV_t2$);}finally{__CLR4_4_12fnm2fnmlb90pf3p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTestPerformance.testSimpleBenchmark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197nlb42g1n(){try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114107);
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114108);final String SM = "StrictMath";
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114109);final String M = "Math";
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114110);final String FM = "FastMath";

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114111);final int numStat = 100;
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114112);final int numCall = RUNS / numStat;

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114113);final double x = Math.random();
        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114114);final double y = Math.random();

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114115);PerfTestUtils.timeAndReport("log",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114116);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114117);return StrictMath.log(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114118);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114119);return Math.log(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114120);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114121);return FastMath.log(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114122);PerfTestUtils.timeAndReport("log10",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114123);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114124);return StrictMath.log10(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114125);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114126);return Math.log10(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114127);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114128);return FastMath.log10(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114129);PerfTestUtils.timeAndReport("log1p",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114130);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114131);return StrictMath.log1p(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114132);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114133);return Math.log1p(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114134);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114135);return FastMath.log1p(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114136);PerfTestUtils.timeAndReport("pow",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114137);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114138);return StrictMath.pow(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114139);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114140);return Math.pow(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114141);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114142);return FastMath.pow(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114143);PerfTestUtils.timeAndReport("exp",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114144);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114145);return StrictMath.exp(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114146);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114147);return Math.exp(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114148);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114149);return FastMath.exp(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114150);PerfTestUtils.timeAndReport("sin",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114151);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114152);return StrictMath.sin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114153);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114154);return Math.sin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114155);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114156);return FastMath.sin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114157);PerfTestUtils.timeAndReport("asin",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114158);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114159);return StrictMath.asin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114160);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114161);return Math.asin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114162);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114163);return FastMath.asin(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114164);PerfTestUtils.timeAndReport("cos",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114165);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114166);return StrictMath.cos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114167);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114168);return Math.cos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114169);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114170);return FastMath.cos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114171);PerfTestUtils.timeAndReport("acos",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114172);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114173);return StrictMath.acos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114174);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114175);return Math.acos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114176);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114177);return FastMath.acos(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114178);PerfTestUtils.timeAndReport("tan",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114179);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114180);return StrictMath.tan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114181);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114182);return Math.tan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114183);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114184);return FastMath.tan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114185);PerfTestUtils.timeAndReport("atan",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114186);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114187);return StrictMath.atan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114188);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114189);return Math.atan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114190);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114191);return FastMath.atan(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114192);PerfTestUtils.timeAndReport("atan2",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114193);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114194);return StrictMath.atan2(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114195);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114196);return Math.atan2(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114197);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114198);return FastMath.atan2(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114199);PerfTestUtils.timeAndReport("hypot",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114200);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114201);return StrictMath.hypot(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114202);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114203);return Math.hypot(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114204);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114205);return FastMath.hypot(x, y);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });


        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114206);PerfTestUtils.timeAndReport("cbrt",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114207);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114208);return StrictMath.cbrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114209);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114210);return Math.cbrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114211);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114212);return FastMath.cbrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114213);PerfTestUtils.timeAndReport("sqrt",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114214);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114215);return StrictMath.sqrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114216);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114217);return Math.sqrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114218);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114219);return FastMath.sqrt(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114220);PerfTestUtils.timeAndReport("cosh",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114221);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114222);return StrictMath.cosh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114223);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114224);return Math.cosh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114225);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114226);return FastMath.cosh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114227);PerfTestUtils.timeAndReport("sinh",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114228);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114229);return StrictMath.sinh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114230);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114231);return Math.sinh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114232);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114233);return FastMath.sinh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114234);PerfTestUtils.timeAndReport("tanh",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114235);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114236);return StrictMath.tanh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114237);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114238);return Math.tanh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114239);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114240);return FastMath.tanh(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114241);PerfTestUtils.timeAndReport("expm1",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114242);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114243);return StrictMath.expm1(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114244);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114245);return Math.expm1(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114246);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114247);return FastMath.expm1(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });

        __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114248);PerfTestUtils.timeAndReport("abs",
                                    numCall,
                                    numStat,
                                    false,
                                    new PerfTestUtils.RunTest(SM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114249);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114250);return StrictMath.abs(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(M) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114251);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114252);return Math.abs(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    },
                                    new PerfTestUtils.RunTest(FM) {
                                        @Override
                                        public Double call() throws Exception {try{__CLR4_4_12fnm2fnmlb90pf3p.R.inc(114253);
                                            __CLR4_4_12fnm2fnmlb90pf3p.R.inc(114254);return FastMath.abs(x);
                                        }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
                                    });
    }finally{__CLR4_4_12fnm2fnmlb90pf3p.R.flushNeeded();}}
}
