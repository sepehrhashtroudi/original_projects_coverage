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
package org.apache.commons.math3.optimization.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

/**
 * A factory to create instances of {@link StatisticalReferenceDataset} from
 * available resources.
 */
public class StatisticalReferenceDatasetFactory {public static class __CLR4_4_126hq26hqlb90pe4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,101777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StatisticalReferenceDatasetFactory() {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101726);
        // Do nothing
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    /**
     * Creates a new buffered reader from the specified resource name.
     *
     * @param name the name of the resource
     * @return a buffered reader
     * @throws IOException if an I/O error occurred
     */
    public static BufferedReader createBufferedReaderFromResource(final String name)
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101727);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101728);final InputStream resourceAsStream;
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101729);resourceAsStream = StatisticalReferenceDatasetFactory.class
            .getResourceAsStream(name);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101730);if ((((resourceAsStream == null)&&(__CLR4_4_126hq26hqlb90pe4b.R.iget(101731)!=0|true))||(__CLR4_4_126hq26hqlb90pe4b.R.iget(101732)==0&false))) {{
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101733);throw new IOException("could not find resource " + name);
        }
        }__CLR4_4_126hq26hqlb90pe4b.R.inc(101734);return new BufferedReader(new InputStreamReader(resourceAsStream));
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    public static StatisticalReferenceDataset createKirby2()
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101735);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101736);final BufferedReader in = createBufferedReaderFromResource("Kirby2.dat");
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101737);StatisticalReferenceDataset dataset = null;
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101738);try {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101739);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public DerivativeStructure getModelValue(final double x, final DerivativeStructure[] a) {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101740);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101741);final DerivativeStructure p = a[0].add(a[1].add(a[2].multiply(x)).multiply(x));
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101742);final DerivativeStructure q = a[3].add(a[4].multiply(x)).multiply(x).add(1.0);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101743);return p.divide(q);
                }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

            };
        } finally {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101744);in.close();
        }
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101745);return dataset;
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    public static StatisticalReferenceDataset createHahn1()
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101746);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101747);final BufferedReader in = createBufferedReaderFromResource("Hahn1.dat");
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101748);StatisticalReferenceDataset dataset = null;
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101749);try {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101750);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public DerivativeStructure getModelValue(final double x, final DerivativeStructure[] a) {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101751);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101752);final DerivativeStructure p = a[0].add(a[1].add(a[2].add(a[3].multiply(x)).multiply(x)).multiply(x));
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101753);final DerivativeStructure q = a[4].add(a[5].add(a[6].multiply(x)).multiply(x)).multiply(x).add(1.0);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101754);return p.divide(q);
                }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

            };
        } finally {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101755);in.close();
        }
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101756);return dataset;
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    public static StatisticalReferenceDataset createMGH17()
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101757);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101758);final BufferedReader in = createBufferedReaderFromResource("MGH17.dat");
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101759);StatisticalReferenceDataset dataset = null;
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101760);try {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101761);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public DerivativeStructure getModelValue(final double x, final DerivativeStructure[] a) {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101762);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101763);return a[0].add(a[1].multiply(a[3].multiply(-x).exp())).add(a[2].multiply(a[4].multiply(-x).exp()));
                }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

            };
        } finally {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101764);in.close();
        }
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101765);return dataset;
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    public static StatisticalReferenceDataset createLanczos1()
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101766);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101767);final BufferedReader in =
            createBufferedReaderFromResource("Lanczos1.dat");
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101768);StatisticalReferenceDataset dataset = null;
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101769);try {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101770);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public DerivativeStructure getModelValue(final double x, final DerivativeStructure[] a) {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101771);
                    __CLR4_4_126hq26hqlb90pe4b.R.inc(101772);return a[0].multiply(a[3].multiply(-x).exp()).add(
                                a[1].multiply(a[4].multiply(-x).exp())).add(
                                     a[2].multiply(a[5].multiply(-x).exp()));
                }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

            };
        } finally {
            __CLR4_4_126hq26hqlb90pe4b.R.inc(101773);in.close();
        }
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101774);return dataset;
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}

    /**
     * Returns an array with all available reference datasets.
     *
     * @return the array of datasets
     * @throws IOException if an I/O error occurs
     */
    public StatisticalReferenceDataset[] createAll()
        throws IOException {try{__CLR4_4_126hq26hqlb90pe4b.R.inc(101775);
        __CLR4_4_126hq26hqlb90pe4b.R.inc(101776);return new StatisticalReferenceDataset[] {
            createKirby2(), createMGH17()
        };
    }finally{__CLR4_4_126hq26hqlb90pe4b.R.flushNeeded();}}
}
