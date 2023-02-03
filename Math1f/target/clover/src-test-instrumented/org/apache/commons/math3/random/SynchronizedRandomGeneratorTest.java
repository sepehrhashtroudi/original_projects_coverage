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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Assert;
import org.junit.Test;

public class SynchronizedRandomGeneratorTest {static class __CLR4_4_128n228n2lb90peas{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final int numberOfThreads = 5;
    private final int numberOfGenerators = 5;
    private final int numberOfSamples = 100000;

    @Test
    public void testAdapter() {__CLR4_4_128n228n2lb90peas.R.globalSliceStart(getClass().getName(),104510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ujnjw28n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128n228n2lb90peas.R.rethrow($CLV_t2$);}finally{__CLR4_4_128n228n2lb90peas.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SynchronizedRandomGeneratorTest.testAdapter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ujnjw28n2(){try{__CLR4_4_128n228n2lb90peas.R.inc(104510);
        __CLR4_4_128n228n2lb90peas.R.inc(104511);final int seed = 12345;
        __CLR4_4_128n228n2lb90peas.R.inc(104512);final RandomGenerator orig = new MersenneTwister(seed);
        __CLR4_4_128n228n2lb90peas.R.inc(104513);final RandomGenerator wrap
            = new SynchronizedRandomGenerator(new MersenneTwister(seed));

        __CLR4_4_128n228n2lb90peas.R.inc(104514);final int bSize = 67;
        __CLR4_4_128n228n2lb90peas.R.inc(104515);final byte[] bOrig = new byte[bSize];
        __CLR4_4_128n228n2lb90peas.R.inc(104516);final byte[] bWrap = new byte[bSize];

        __CLR4_4_128n228n2lb90peas.R.inc(104517);for (int i = 0; (((i < 100)&&(__CLR4_4_128n228n2lb90peas.R.iget(104518)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104519)==0&false)); i++) {{
            __CLR4_4_128n228n2lb90peas.R.inc(104520);orig.nextBytes(bOrig);
            __CLR4_4_128n228n2lb90peas.R.inc(104521);wrap.nextBytes(bWrap);
            __CLR4_4_128n228n2lb90peas.R.inc(104522);for (int k = 0; (((k < bSize)&&(__CLR4_4_128n228n2lb90peas.R.iget(104523)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104524)==0&false)); k++) {{
                __CLR4_4_128n228n2lb90peas.R.inc(104525);Assert.assertEquals(bOrig[k], bWrap[k]);
            }

            }__CLR4_4_128n228n2lb90peas.R.inc(104526);Assert.assertEquals(orig.nextInt(), wrap.nextInt());

            __CLR4_4_128n228n2lb90peas.R.inc(104527);final int range = (i + 1) * 89;
            __CLR4_4_128n228n2lb90peas.R.inc(104528);Assert.assertEquals(orig.nextInt(range), wrap.nextInt(range));

            __CLR4_4_128n228n2lb90peas.R.inc(104529);Assert.assertEquals(orig.nextLong(), wrap.nextLong());
            __CLR4_4_128n228n2lb90peas.R.inc(104530);Assert.assertEquals(orig.nextBoolean(), wrap.nextBoolean());
            __CLR4_4_128n228n2lb90peas.R.inc(104531);Assert.assertEquals(orig.nextFloat(), wrap.nextFloat(), 0);
            __CLR4_4_128n228n2lb90peas.R.inc(104532);Assert.assertEquals(orig.nextDouble(), wrap.nextDouble(), 0);
            __CLR4_4_128n228n2lb90peas.R.inc(104533);Assert.assertEquals(orig.nextGaussian(), wrap.nextGaussian(), 0);

        }
    }}finally{__CLR4_4_128n228n2lb90peas.R.flushNeeded();}}

    @Test
    public void testMath899Sync() throws Throwable {__CLR4_4_128n228n2lb90peas.R.globalSliceStart(getClass().getName(),104534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16q79kw28nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128n228n2lb90peas.R.rethrow($CLV_t2$);}finally{__CLR4_4_128n228n2lb90peas.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.SynchronizedRandomGeneratorTest.testMath899Sync",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16q79kw28nq() throws Throwable{try{__CLR4_4_128n228n2lb90peas.R.inc(104534);
        __CLR4_4_128n228n2lb90peas.R.inc(104535);try {
            // Running the test several times in order to decrease the
            // probability that a non-thread-safe code did not trigger
            // a concurrency problem.
            __CLR4_4_128n228n2lb90peas.R.inc(104536);for (int i = 0; (((i < 10)&&(__CLR4_4_128n228n2lb90peas.R.iget(104537)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104538)==0&false)); i++) {{
                __CLR4_4_128n228n2lb90peas.R.inc(104539);doTestMath899(true, numberOfThreads, numberOfGenerators, numberOfSamples);
            }
        }} catch (InterruptedException e) {
            __CLR4_4_128n228n2lb90peas.R.inc(104540);Assert.fail(e.getMessage());
        } catch (ExecutionException e) {
            __CLR4_4_128n228n2lb90peas.R.inc(104541);throw e.getCause();
        }
    }finally{__CLR4_4_128n228n2lb90peas.R.flushNeeded();}}

    /**
     * @param sync Whether to use a synchronizing wrapper.
     */
    private double[] doTestMath899(final boolean sync,
                                   final int numThreads,
                                   final int numGenerators,
                                   final int numSamples)
        throws InterruptedException,
               ExecutionException {try{__CLR4_4_128n228n2lb90peas.R.inc(104542);
        __CLR4_4_128n228n2lb90peas.R.inc(104543);final RandomGenerator rng = new MersenneTwister();
        __CLR4_4_128n228n2lb90peas.R.inc(104544);final RandomGenerator wrapper = (((sync )&&(__CLR4_4_128n228n2lb90peas.R.iget(104545)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104546)==0&false))? new SynchronizedRandomGenerator(rng) : rng;

        __CLR4_4_128n228n2lb90peas.R.inc(104547);final List<Callable<Double>> tasks = new ArrayList<Callable<Double>>();
        __CLR4_4_128n228n2lb90peas.R.inc(104548);for (int i = 0; (((i < numGenerators)&&(__CLR4_4_128n228n2lb90peas.R.iget(104549)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104550)==0&false)); i++) {{
            __CLR4_4_128n228n2lb90peas.R.inc(104551);tasks.add(new Callable<Double>() {
                    public Double call() {try{__CLR4_4_128n228n2lb90peas.R.inc(104552);
                        __CLR4_4_128n228n2lb90peas.R.inc(104553);Double lastValue = 0d;
                        __CLR4_4_128n228n2lb90peas.R.inc(104554);for (int j = 0; (((j < numSamples)&&(__CLR4_4_128n228n2lb90peas.R.iget(104555)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104556)==0&false)); j++) {{
                            __CLR4_4_128n228n2lb90peas.R.inc(104557);lastValue = wrapper.nextGaussian();
                        }
                        }__CLR4_4_128n228n2lb90peas.R.inc(104558);return lastValue;
                    }finally{__CLR4_4_128n228n2lb90peas.R.flushNeeded();}}
                });
        }

        }__CLR4_4_128n228n2lb90peas.R.inc(104559);final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
        __CLR4_4_128n228n2lb90peas.R.inc(104560);final List<Future<Double>> results = exec.invokeAll(tasks);

        __CLR4_4_128n228n2lb90peas.R.inc(104561);final double[] values = new double[numGenerators];
        __CLR4_4_128n228n2lb90peas.R.inc(104562);for (int i = 0; (((i < numGenerators)&&(__CLR4_4_128n228n2lb90peas.R.iget(104563)!=0|true))||(__CLR4_4_128n228n2lb90peas.R.iget(104564)==0&false)); i++) {{
            __CLR4_4_128n228n2lb90peas.R.inc(104565);values[i] = results.get(i).get();
        }
        }__CLR4_4_128n228n2lb90peas.R.inc(104566);return values;
    }finally{__CLR4_4_128n228n2lb90peas.R.flushNeeded();}}
}
