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
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.math3.util.FastMath;

/**
 * A factory to create instances of {@link StatisticalReferenceDataset} from
 * available resources.
 */
public class StatisticalReferenceDatasetFactory {public static class __CLR4_4_123q723q7lb90pdxe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StatisticalReferenceDatasetFactory() {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98143);
        // Do nothing
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    /**
     * Creates a new buffered reader from the specified resource name.
     *
     * @param name the name of the resource
     * @return a buffered reader
     * @throws IOException if an I/O error occurred
     */
    public static BufferedReader createBufferedReaderFromResource(final String name)
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98144);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98145);final InputStream resourceAsStream;
        __CLR4_4_123q723q7lb90pdxe.R.inc(98146);resourceAsStream = StatisticalReferenceDatasetFactory.class
            .getResourceAsStream(name);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98147);if ((((resourceAsStream == null)&&(__CLR4_4_123q723q7lb90pdxe.R.iget(98148)!=0|true))||(__CLR4_4_123q723q7lb90pdxe.R.iget(98149)==0&false))) {{
            __CLR4_4_123q723q7lb90pdxe.R.inc(98150);throw new IOException("could not find resource " + name);
        }
        }__CLR4_4_123q723q7lb90pdxe.R.inc(98151);return new BufferedReader(new InputStreamReader(resourceAsStream));
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    public static StatisticalReferenceDataset createKirby2()
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98152);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98153);final BufferedReader in = createBufferedReaderFromResource("Kirby2.dat");
        __CLR4_4_123q723q7lb90pdxe.R.inc(98154);StatisticalReferenceDataset dataset = null;
        __CLR4_4_123q723q7lb90pdxe.R.inc(98155);try {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98156);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public double getModelValue(final double x, final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98157);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98158);final double p = a[0] + x * (a[1] + x * a[2]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98159);final double q = 1.0 + x * (a[3] + x * a[4]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98160);return p / q;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

                @Override
                public double[] getModelDerivatives(final double x,
                                                    final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98161);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98162);final double[] dy = new double[5];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98163);final double p = a[0] + x * (a[1] + x * a[2]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98164);final double q = 1.0 + x * (a[3] + x * a[4]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98165);dy[0] = 1.0 / q;
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98166);dy[1] = x / q;
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98167);dy[2] = x * dy[1];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98168);dy[3] = -x * p / (q * q);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98169);dy[4] = x * dy[3];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98170);return dy;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}
            };
        } finally {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98171);in.close();
        }
        __CLR4_4_123q723q7lb90pdxe.R.inc(98172);return dataset;
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    public static StatisticalReferenceDataset createHahn1()
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98173);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98174);final BufferedReader in = createBufferedReaderFromResource("Hahn1.dat");
        __CLR4_4_123q723q7lb90pdxe.R.inc(98175);StatisticalReferenceDataset dataset = null;
        __CLR4_4_123q723q7lb90pdxe.R.inc(98176);try {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98177);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public double getModelValue(final double x, final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98178);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98179);final double p = a[0] + x * (a[1] + x * (a[2] + x * a[3]));
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98180);final double q = 1.0 + x * (a[4] + x * (a[5] + x * a[6]));
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98181);return p / q;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

                @Override
                public double[] getModelDerivatives(final double x,
                                                    final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98182);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98183);final double[] dy = new double[7];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98184);final double p = a[0] + x * (a[1] + x * (a[2] + x * a[3]));
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98185);final double q = 1.0 + x * (a[4] + x * (a[5] + x * a[6]));
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98186);dy[0] = 1.0 / q;
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98187);dy[1] = x * dy[0];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98188);dy[2] = x * dy[1];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98189);dy[3] = x * dy[2];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98190);dy[4] = -x * p / (q * q);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98191);dy[5] = x * dy[4];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98192);dy[6] = x * dy[5];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98193);return dy;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}
            };
        } finally {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98194);in.close();
        }
        __CLR4_4_123q723q7lb90pdxe.R.inc(98195);return dataset;
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    public static StatisticalReferenceDataset createMGH17()
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98196);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98197);final BufferedReader in = createBufferedReaderFromResource("MGH17.dat");
        __CLR4_4_123q723q7lb90pdxe.R.inc(98198);StatisticalReferenceDataset dataset = null;
        __CLR4_4_123q723q7lb90pdxe.R.inc(98199);try {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98200);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public double getModelValue(final double x, final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98201);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98202);return a[0] + a[1] * FastMath.exp(-a[3] * x) + a[2] *
                           FastMath.exp(-a[4] * x);
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

                @Override
                public double[] getModelDerivatives(final double x,
                                                    final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98203);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98204);final double[] dy = new double[5];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98205);dy[0] = 1.0;
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98206);dy[1] = FastMath.exp(-x * a[3]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98207);dy[2] = FastMath.exp(-x * a[4]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98208);dy[3] = -x * a[1] * dy[1];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98209);dy[4] = -x * a[2] * dy[2];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98210);return dy;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}
            };
        } finally {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98211);in.close();
        }
        __CLR4_4_123q723q7lb90pdxe.R.inc(98212);return dataset;
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    public static StatisticalReferenceDataset createLanczos1()
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98213);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98214);final BufferedReader in =
            createBufferedReaderFromResource("Lanczos1.dat");
        __CLR4_4_123q723q7lb90pdxe.R.inc(98215);StatisticalReferenceDataset dataset = null;
        __CLR4_4_123q723q7lb90pdxe.R.inc(98216);try {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98217);dataset = new StatisticalReferenceDataset(in) {

                @Override
                public double getModelValue(final double x, final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98218);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98219);System.out.println(a[0]+", "+a[1]+", "+a[2]+", "+a[3]+", "+a[4]+", "+a[5]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98220);return a[0] * FastMath.exp(-a[3] * x) +
                           a[1] * FastMath.exp(-a[4] * x) +
                           a[2] * FastMath.exp(-a[5] * x);
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

                @Override
                public double[] getModelDerivatives(final double x,
                    final double[] a) {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98221);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98222);final double[] dy = new double[6];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98223);dy[0] = FastMath.exp(-x * a[3]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98224);dy[1] = FastMath.exp(-x * a[4]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98225);dy[2] = FastMath.exp(-x * a[5]);
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98226);dy[3] = -x * a[0] * dy[0];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98227);dy[4] = -x * a[1] * dy[1];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98228);dy[5] = -x * a[2] * dy[2];
                    __CLR4_4_123q723q7lb90pdxe.R.inc(98229);return dy;
                }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}
            };
        } finally {
            __CLR4_4_123q723q7lb90pdxe.R.inc(98230);in.close();
        }
        __CLR4_4_123q723q7lb90pdxe.R.inc(98231);return dataset;
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}

    /**
     * Returns an array with all available reference datasets.
     *
     * @return the array of datasets
     * @throws IOException if an I/O error occurs
     */
    public StatisticalReferenceDataset[] createAll()
        throws IOException {try{__CLR4_4_123q723q7lb90pdxe.R.inc(98232);
        __CLR4_4_123q723q7lb90pdxe.R.inc(98233);return new StatisticalReferenceDataset[] {
            createKirby2(), createMGH17()
        };
    }finally{__CLR4_4_123q723q7lb90pdxe.R.flushNeeded();}}
}
