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

package org.apache.commons.math3.ode.sampling;

/** Step normalizer output tests, for problems where the first and last points
 * are not fixed points.
 */
public class StepNormalizerOutputTest extends StepNormalizerOutputTestBase {static class __CLR4_4_120sl20sllb90pdoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    protected double getStart() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94341);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94342);return 0.3;
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected double getEnd() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94343);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94344);return 10.1;
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected double[] getExpInc() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94345);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94346);return new double[] { 0.3, 0.8, 1.3, 1.8, 2.3, 2.8, 3.3, 3.8, 4.3,
                              4.8, 5.3, 5.8, 6.3, 6.8, 7.3, 7.8, 8.3, 8.8,
                              9.3, 9.8, 10.1 };
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected double[] getExpIncRev() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94347);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94348);return new double[] { 10.1, 9.6, 9.1, 8.6, 8.1, 7.6, 7.1, 6.6,
                              6.1, 5.6, 5.1, 4.6, 4.1, 3.6, 3.1, 2.6,
                              2.1, 1.6, 1.1, 0.6, 0.3 };
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected double[] getExpMul() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94349);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94350);return new double[] { 0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0,
                              4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5,
                              9.0, 9.5, 10.0, 10.1 };
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected double[] getExpMulRev() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94351);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94352);return new double[] { 10.1, 10.0, 9.5, 9.0, 8.5, 8.0, 7.5, 7.0,
                              6.5, 6.0, 5.5, 5.0, 4.5, 4.0, 3.5, 3.0, 2.5,
                              2.0, 1.5, 1.0, 0.5, 0.3 };
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}

    @Override
    protected int[][] getO() {try{__CLR4_4_120sl20sllb90pdoj.R.inc(94353);
        __CLR4_4_120sl20sllb90pdoj.R.inc(94354);return new int[][] {{1, 1}, {1, 1}, {0, 1}, {0, 1},
                            {1, 0}, {1, 0}, {0, 0}, {0, 0},
                            {1, 1}, {1, 1}, {0, 1}, {0, 1},
                            {1, 0}, {1, 0}, {0, 0}, {0, 0}};
    }finally{__CLR4_4_120sl20sllb90pdoj.R.flushNeeded();}}
}
