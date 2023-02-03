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
package org.apache.commons.math3.analysis.integration.gauss;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.math3.util.Pair;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test for {@link BaseRuleFactory}.
 *
 * @version $Id$
 */
public class BaseRuleFactoryTest {static class __CLR4_4_11ebz1ebzlb90pbz8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Tests that a given rule rule will be computed and added once to the cache
     * whatever the number of times this rule is called concurrently.
     */
    @Test
        public void testConcurrentCreation() throws InterruptedException,
                                                    ExecutionException {__CLR4_4_11ebz1ebzlb90pbz8.R.globalSliceStart(getClass().getName(),65231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s14xb1ebz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ebz1ebzlb90pbz8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ebz1ebzlb90pbz8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactoryTest.testConcurrentCreation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s14xb1ebz() throws InterruptedException, ExecutionException{try{__CLR4_4_11ebz1ebzlb90pbz8.R.inc(65231);
        // Number of times the same rule will be called.
        __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65232);final int numTasks = 20;

        __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65233);final ThreadPoolExecutor exec
            = new ThreadPoolExecutor(3, numTasks, 1, TimeUnit.SECONDS,
                                     new ArrayBlockingQueue<Runnable>(2));

        __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65234);final List<Future<Pair<double[], double[]>>> results
            = new ArrayList<Future<Pair<double[], double[]>>>();
        __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65235);for (int i = 0; (((i < numTasks)&&(__CLR4_4_11ebz1ebzlb90pbz8.R.iget(65236)!=0|true))||(__CLR4_4_11ebz1ebzlb90pbz8.R.iget(65237)==0&false)); i++) {{
            __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65238);results.add(exec.submit(new RuleBuilder()));
        }

        // Ensure that all computations have completed.
        }__CLR4_4_11ebz1ebzlb90pbz8.R.inc(65239);for (Future<Pair<double[], double[]>> f : results) {{
            __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65240);f.get();
        }

        // Assertion would fail if "getRuleInternal" were not "synchronized".
        }__CLR4_4_11ebz1ebzlb90pbz8.R.inc(65241);final int n = RuleBuilder.getNumberOfCalls();
        __CLR4_4_11ebz1ebzlb90pbz8.R.inc(65242);Assert.assertEquals("Rule computation was called " + n + " times", 1, n);
    }finally{__CLR4_4_11ebz1ebzlb90pbz8.R.flushNeeded();}}
}

class RuleBuilder implements Callable<Pair<double[], double[]>> {public static class __CLR4_4_11ebz1ecblb90pbz9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final DummyRuleFactory factory = new DummyRuleFactory();

    public Pair<double[], double[]> call() {try{__CLR4_4_11ebz1ecblb90pbz9.R.inc(65243);
        __CLR4_4_11ebz1ecblb90pbz9.R.inc(65244);final int dummy = 2; // Always request the same rule.
        __CLR4_4_11ebz1ecblb90pbz9.R.inc(65245);return factory.getRule(dummy);
    }finally{__CLR4_4_11ebz1ecblb90pbz9.R.flushNeeded();}}

    public static int getNumberOfCalls() {try{__CLR4_4_11ebz1ecblb90pbz9.R.inc(65246);
        __CLR4_4_11ebz1ecblb90pbz9.R.inc(65247);return factory.getNumberOfCalls();
    }finally{__CLR4_4_11ebz1ecblb90pbz9.R.flushNeeded();}}
}

class DummyRuleFactory extends BaseRuleFactory<Double> {public static class __CLR4_4_11ebz1ecglb90pbz9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Rule computations counter. */
    private static AtomicInteger nCalls = new AtomicInteger();

    @Override
    protected Pair<Double[], Double[]> computeRule(int order) {try{__CLR4_4_11ebz1ecglb90pbz9.R.inc(65248);
        // Tracks whether this computation has been called more than once.
        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65249);nCalls.getAndIncrement();

        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65250);try {
            // Sleep to simulate computation time.
            __CLR4_4_11ebz1ecglb90pbz9.R.inc(65251);Thread.sleep(20);
        } catch (InterruptedException e) {
            __CLR4_4_11ebz1ecglb90pbz9.R.inc(65252);Assert.fail("Unexpected interruption");
        }

         // Dummy rule (but contents must exist).
        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65253);final Double[] p = new Double[order];
        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65254);final Double[] w = new Double[order];
        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65255);for (int i = 0; (((i < order)&&(__CLR4_4_11ebz1ecglb90pbz9.R.iget(65256)!=0|true))||(__CLR4_4_11ebz1ecglb90pbz9.R.iget(65257)==0&false)); i++) {{
            __CLR4_4_11ebz1ecglb90pbz9.R.inc(65258);p[i] = new Double(i);
            __CLR4_4_11ebz1ecglb90pbz9.R.inc(65259);w[i] = new Double(i);
        }
        }__CLR4_4_11ebz1ecglb90pbz9.R.inc(65260);return new Pair<Double[], Double[]>(p, w);
    }finally{__CLR4_4_11ebz1ecglb90pbz9.R.flushNeeded();}}

    public int getNumberOfCalls() {try{__CLR4_4_11ebz1ecglb90pbz9.R.inc(65261);
        __CLR4_4_11ebz1ecglb90pbz9.R.inc(65262);return nCalls.get();
    }finally{__CLR4_4_11ebz1ecglb90pbz9.R.flushNeeded();}}
}
