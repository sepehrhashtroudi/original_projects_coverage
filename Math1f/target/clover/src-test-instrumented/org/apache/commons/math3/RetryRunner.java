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

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;


/**
 * A test runner that retries tests when assertions fail.
 * @version $Id$
 */
public class RetryRunner extends BlockJUnit4ClassRunner {public static class __CLR4_4_11bpn1bpnlb90pbqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,61856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Simple constructor.
     *
     * @param testClass Class to test.
     * @throws InitializationError if default runner cannot be built.
     */
    public RetryRunner(final Class<?> testClass)
        throws InitializationError {
        super(testClass);__CLR4_4_11bpn1bpnlb90pbqh.R.inc(61836);try{__CLR4_4_11bpn1bpnlb90pbqh.R.inc(61835);
    }finally{__CLR4_4_11bpn1bpnlb90pbqh.R.flushNeeded();}}

    @Override
    public Statement methodInvoker(final FrameworkMethod method,
                                   Object test) {try{__CLR4_4_11bpn1bpnlb90pbqh.R.inc(61837);
        __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61838);final Statement singleTryStatement = super.methodInvoker(method, test);
        __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61839);return new Statement() {
            /**
             * Evaluate the statement.
             * We attempt several runs for the test, at most MAX_ATTEMPTS.
             * if one attempt succeeds, we succeed, if all attempts fail, we
             * fail with the reason corresponding to the last attempt
             */
            @Override
            public void evaluate() throws Throwable {try{__CLR4_4_11bpn1bpnlb90pbqh.R.inc(61840);
                __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61841);Throwable failureReason = null;

                __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61842);final Retry retry = method.getAnnotation(Retry.class);
                __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61843);if ((((retry == null)&&(__CLR4_4_11bpn1bpnlb90pbqh.R.iget(61844)!=0|true))||(__CLR4_4_11bpn1bpnlb90pbqh.R.iget(61845)==0&false))) {{
                    // Do a single test run attempt.
                    __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61846);singleTryStatement.evaluate();
                } }else {{
                    __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61847);final int numRetries = retry.value();

                    __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61848);for (int i = 0; (((i < numRetries)&&(__CLR4_4_11bpn1bpnlb90pbqh.R.iget(61849)!=0|true))||(__CLR4_4_11bpn1bpnlb90pbqh.R.iget(61850)==0&false)); ++i) {{
                        __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61851);try {
                            // Do a single test run attempt.
                            __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61852);singleTryStatement.evaluate();
                            // Attempt succeeded, stop evaluation here.
                            __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61853);return;
                        } catch (Throwable t) {
                            // Attempt failed, store the reason.
                            __CLR4_4_11bpn1bpnlb90pbqh.R.inc(61854);failureReason = t;
                        }
                    }

                    // All attempts failed.
                    }__CLR4_4_11bpn1bpnlb90pbqh.R.inc(61855);throw failureReason;
                }
            }}finally{__CLR4_4_11bpn1bpnlb90pbqh.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11bpn1bpnlb90pbqh.R.flushNeeded();}}
}
