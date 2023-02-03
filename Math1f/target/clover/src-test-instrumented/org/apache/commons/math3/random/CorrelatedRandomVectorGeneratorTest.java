/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *///Licensed to the Apache Software Foundation (ASF) under one
//or more contributor license agreements.  See the NOTICE file
//distributed with this work for additional information
//regarding copyright ownership.  The ASF licenses this file
//to you under the Apache License, Version 2.0 (the
//"License"); you may not use this file except in compliance
//with the License.  You may obtain a copy of the License at

//http://www.apache.org/licenses/LICENSE-2.0

//Unless required by applicable law or agreed to in writing,
//software distributed under the License is distributed on an
//"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//KIND, either express or implied.  See the License for the
//specific language governing permissions and limitations
//under the License.

package org.apache.commons.math3.random;

import java.util.Arrays;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.StorelessCovariance;
import org.apache.commons.math3.stat.descriptive.moment.VectorialCovariance;
import org.apache.commons.math3.stat.descriptive.moment.VectorialMean;
import org.apache.commons.math3.util.FastMath;

import org.junit.Test;
import org.junit.Assert;

public class CorrelatedRandomVectorGeneratorTest {static class __CLR4_4_127832783lb90pe68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,102781,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[] mean;
    private RealMatrix covariance;
    private CorrelatedRandomVectorGenerator generator;

    public CorrelatedRandomVectorGeneratorTest() {try{__CLR4_4_127832783lb90pe68.R.inc(102675);
        __CLR4_4_127832783lb90pe68.R.inc(102676);mean = new double[] { 0.0, 1.0, -3.0, 2.3 };

        __CLR4_4_127832783lb90pe68.R.inc(102677);RealMatrix b = MatrixUtils.createRealMatrix(4, 3);
        __CLR4_4_127832783lb90pe68.R.inc(102678);int counter = 0;
        __CLR4_4_127832783lb90pe68.R.inc(102679);for (int i = 0; (((i < b.getRowDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102680)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102681)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102682);for (int j = 0; (((j < b.getColumnDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102683)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102684)==0&false)); ++j) {{
                __CLR4_4_127832783lb90pe68.R.inc(102685);b.setEntry(i, j, 1.0 + 0.1 * ++counter);
            }
        }}
        }__CLR4_4_127832783lb90pe68.R.inc(102686);RealMatrix bbt = b.multiply(b.transpose());
        __CLR4_4_127832783lb90pe68.R.inc(102687);covariance = MatrixUtils.createRealMatrix(mean.length, mean.length);
        __CLR4_4_127832783lb90pe68.R.inc(102688);for (int i = 0; (((i < covariance.getRowDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102689)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102690)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102691);covariance.setEntry(i, i, bbt.getEntry(i, i));
            __CLR4_4_127832783lb90pe68.R.inc(102692);for (int j = 0; (((j < covariance.getColumnDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102693)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102694)==0&false)); ++j) {{
                __CLR4_4_127832783lb90pe68.R.inc(102695);double s = bbt.getEntry(i, j);
                __CLR4_4_127832783lb90pe68.R.inc(102696);covariance.setEntry(i, j, s);
                __CLR4_4_127832783lb90pe68.R.inc(102697);covariance.setEntry(j, i, s);
            }
        }}

        }__CLR4_4_127832783lb90pe68.R.inc(102698);RandomGenerator rg = new JDKRandomGenerator();
        __CLR4_4_127832783lb90pe68.R.inc(102699);rg.setSeed(17399225432l);
        __CLR4_4_127832783lb90pe68.R.inc(102700);GaussianRandomGenerator rawGenerator = new GaussianRandomGenerator(rg);
        __CLR4_4_127832783lb90pe68.R.inc(102701);generator = new CorrelatedRandomVectorGenerator(mean,
                                                        covariance,
                                                        1.0e-12 * covariance.getNorm(),
                                                        rawGenerator);
    }finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    @Test
    public void testRank() {__CLR4_4_127832783lb90pe68.R.globalSliceStart(getClass().getName(),102702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtsx3v278u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127832783lb90pe68.R.rethrow($CLV_t2$);}finally{__CLR4_4_127832783lb90pe68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest.testRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtsx3v278u(){try{__CLR4_4_127832783lb90pe68.R.inc(102702);
        __CLR4_4_127832783lb90pe68.R.inc(102703);Assert.assertEquals(2, generator.getRank());
    }finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    @Test
    public void testMath226() {__CLR4_4_127832783lb90pe68.R.globalSliceStart(getClass().getName(),102704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vc94t278w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127832783lb90pe68.R.rethrow($CLV_t2$);}finally{__CLR4_4_127832783lb90pe68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest.testMath226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vc94t278w(){try{__CLR4_4_127832783lb90pe68.R.inc(102704);
        __CLR4_4_127832783lb90pe68.R.inc(102705);double[] mean = { 1, 1, 10, 1 };
        __CLR4_4_127832783lb90pe68.R.inc(102706);double[][] cov = {
                { 1, 3, 2, 6 },
                { 3, 13, 16, 2 },
                { 2, 16, 38, -1 },
                { 6, 2, -1, 197 }
        };
        __CLR4_4_127832783lb90pe68.R.inc(102707);RealMatrix covRM = MatrixUtils.createRealMatrix(cov);
        __CLR4_4_127832783lb90pe68.R.inc(102708);JDKRandomGenerator jg = new JDKRandomGenerator();
        __CLR4_4_127832783lb90pe68.R.inc(102709);jg.setSeed(5322145245211l);
        __CLR4_4_127832783lb90pe68.R.inc(102710);NormalizedRandomGenerator rg = new GaussianRandomGenerator(jg);
        __CLR4_4_127832783lb90pe68.R.inc(102711);CorrelatedRandomVectorGenerator sg =
            new CorrelatedRandomVectorGenerator(mean, covRM, 0.00001, rg);

        __CLR4_4_127832783lb90pe68.R.inc(102712);double[] min = new double[mean.length];
        __CLR4_4_127832783lb90pe68.R.inc(102713);Arrays.fill(min, Double.POSITIVE_INFINITY);
        __CLR4_4_127832783lb90pe68.R.inc(102714);double[] max = new double[mean.length];
        __CLR4_4_127832783lb90pe68.R.inc(102715);Arrays.fill(max, Double.NEGATIVE_INFINITY);
        __CLR4_4_127832783lb90pe68.R.inc(102716);for (int i = 0; (((i < 10)&&(__CLR4_4_127832783lb90pe68.R.iget(102717)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102718)==0&false)); i++) {{
            __CLR4_4_127832783lb90pe68.R.inc(102719);double[] generated = sg.nextVector();
            __CLR4_4_127832783lb90pe68.R.inc(102720);for (int j = 0; (((j < generated.length)&&(__CLR4_4_127832783lb90pe68.R.iget(102721)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102722)==0&false)); ++j) {{
                __CLR4_4_127832783lb90pe68.R.inc(102723);min[j] = FastMath.min(min[j], generated[j]);
                __CLR4_4_127832783lb90pe68.R.inc(102724);max[j] = FastMath.max(max[j], generated[j]);
            }
        }}
        }__CLR4_4_127832783lb90pe68.R.inc(102725);for (int j = 0; (((j < min.length)&&(__CLR4_4_127832783lb90pe68.R.iget(102726)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102727)==0&false)); ++j) {{
            __CLR4_4_127832783lb90pe68.R.inc(102728);Assert.assertTrue(max[j] - min[j] > 2.0);
        }

    }}finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    @Test
    public void testRootMatrix() {__CLR4_4_127832783lb90pe68.R.globalSliceStart(getClass().getName(),102729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iitic279l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127832783lb90pe68.R.rethrow($CLV_t2$);}finally{__CLR4_4_127832783lb90pe68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest.testRootMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iitic279l(){try{__CLR4_4_127832783lb90pe68.R.inc(102729);
        __CLR4_4_127832783lb90pe68.R.inc(102730);RealMatrix b = generator.getRootMatrix();
        __CLR4_4_127832783lb90pe68.R.inc(102731);RealMatrix bbt = b.multiply(b.transpose());
        __CLR4_4_127832783lb90pe68.R.inc(102732);for (int i = 0; (((i < covariance.getRowDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102733)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102734)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102735);for (int j = 0; (((j < covariance.getColumnDimension())&&(__CLR4_4_127832783lb90pe68.R.iget(102736)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102737)==0&false)); ++j) {{
                __CLR4_4_127832783lb90pe68.R.inc(102738);Assert.assertEquals(covariance.getEntry(i, j), bbt.getEntry(i, j), 1.0e-12);
            }
        }}
    }}finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    @Test
    public void testMeanAndCovariance() {__CLR4_4_127832783lb90pe68.R.globalSliceStart(getClass().getName(),102739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr8o78279v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127832783lb90pe68.R.rethrow($CLV_t2$);}finally{__CLR4_4_127832783lb90pe68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest.testMeanAndCovariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr8o78279v(){try{__CLR4_4_127832783lb90pe68.R.inc(102739);

        __CLR4_4_127832783lb90pe68.R.inc(102740);VectorialMean meanStat = new VectorialMean(mean.length);
        __CLR4_4_127832783lb90pe68.R.inc(102741);VectorialCovariance covStat = new VectorialCovariance(mean.length, true);
        __CLR4_4_127832783lb90pe68.R.inc(102742);for (int i = 0; (((i < 5000)&&(__CLR4_4_127832783lb90pe68.R.iget(102743)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102744)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102745);double[] v = generator.nextVector();
            __CLR4_4_127832783lb90pe68.R.inc(102746);meanStat.increment(v);
            __CLR4_4_127832783lb90pe68.R.inc(102747);covStat.increment(v);
        }

        }__CLR4_4_127832783lb90pe68.R.inc(102748);double[] estimatedMean = meanStat.getResult();
        __CLR4_4_127832783lb90pe68.R.inc(102749);RealMatrix estimatedCovariance = covStat.getResult();
        __CLR4_4_127832783lb90pe68.R.inc(102750);for (int i = 0; (((i < estimatedMean.length)&&(__CLR4_4_127832783lb90pe68.R.iget(102751)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102752)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102753);Assert.assertEquals(mean[i], estimatedMean[i], 0.07);
            __CLR4_4_127832783lb90pe68.R.inc(102754);for (int j = 0; (((j <= i)&&(__CLR4_4_127832783lb90pe68.R.iget(102755)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102756)==0&false)); ++j) {{
                __CLR4_4_127832783lb90pe68.R.inc(102757);Assert.assertEquals(covariance.getEntry(i, j),
                                    estimatedCovariance.getEntry(i, j),
                                    0.1 * (1.0 + FastMath.abs(mean[i])) * (1.0 + FastMath.abs(mean[j])));
            }
        }}

    }}finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    @Test
    public void testSampleWithZeroCovariance() {__CLR4_4_127832783lb90pe68.R.globalSliceStart(getClass().getName(),102758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi0l8y27ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127832783lb90pe68.R.rethrow($CLV_t2$);}finally{__CLR4_4_127832783lb90pe68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.CorrelatedRandomVectorGeneratorTest.testSampleWithZeroCovariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi0l8y27ae(){try{__CLR4_4_127832783lb90pe68.R.inc(102758);
        __CLR4_4_127832783lb90pe68.R.inc(102759);final double[][] covMatrix1 = new double[][]{
                {0.013445532, 0.010394690, 0.009881156, 0.010499559},
                {0.010394690, 0.023006616, 0.008196856, 0.010732709},
                {0.009881156, 0.008196856, 0.019023866, 0.009210099},
                {0.010499559, 0.010732709, 0.009210099, 0.019107243}
        };
        
        __CLR4_4_127832783lb90pe68.R.inc(102760);final double[][] covMatrix2 = new double[][]{
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.013445532, 0.010394690, 0.009881156, 0.010499559},
                {0.0, 0.010394690, 0.023006616, 0.008196856, 0.010732709},
                {0.0, 0.009881156, 0.008196856, 0.019023866, 0.009210099},
                {0.0, 0.010499559, 0.010732709, 0.009210099, 0.019107243}
        };
        
        __CLR4_4_127832783lb90pe68.R.inc(102761);final double[][] covMatrix3 = new double[][]{
                {0.013445532, 0.010394690, 0.0, 0.009881156, 0.010499559},
                {0.010394690, 0.023006616, 0.0, 0.008196856, 0.010732709},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.009881156, 0.008196856, 0.0, 0.019023866, 0.009210099},
                {0.010499559, 0.010732709, 0.0, 0.009210099, 0.019107243}
        };
        
        __CLR4_4_127832783lb90pe68.R.inc(102762);testSampler(covMatrix1, 10000, 0.001);
        __CLR4_4_127832783lb90pe68.R.inc(102763);testSampler(covMatrix2, 10000, 0.001);
        __CLR4_4_127832783lb90pe68.R.inc(102764);testSampler(covMatrix3, 10000, 0.001);

    }finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    private CorrelatedRandomVectorGenerator createSampler(double[][] cov) {try{__CLR4_4_127832783lb90pe68.R.inc(102765);
        __CLR4_4_127832783lb90pe68.R.inc(102766);RealMatrix matrix = new Array2DRowRealMatrix(cov);
        __CLR4_4_127832783lb90pe68.R.inc(102767);double small = 10e-12 * matrix.getNorm();
        __CLR4_4_127832783lb90pe68.R.inc(102768);return new CorrelatedRandomVectorGenerator(
                new double[cov.length],
                matrix,
                small,
                new GaussianRandomGenerator(new JDKRandomGenerator()));
    }finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

    private void testSampler(final double[][] covMatrix, int samples, double epsilon) {try{__CLR4_4_127832783lb90pe68.R.inc(102769);
        __CLR4_4_127832783lb90pe68.R.inc(102770);CorrelatedRandomVectorGenerator sampler = createSampler(covMatrix);
        
        __CLR4_4_127832783lb90pe68.R.inc(102771);StorelessCovariance cov = new StorelessCovariance(covMatrix.length);
        __CLR4_4_127832783lb90pe68.R.inc(102772);for (int i = 0; (((i < samples)&&(__CLR4_4_127832783lb90pe68.R.iget(102773)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102774)==0&false)); ++i) {{
            __CLR4_4_127832783lb90pe68.R.inc(102775);cov.increment(sampler.nextVector());
        }

        }__CLR4_4_127832783lb90pe68.R.inc(102776);double[][] sampleCov = cov.getData();
        __CLR4_4_127832783lb90pe68.R.inc(102777);for (int r = 0; (((r < covMatrix.length)&&(__CLR4_4_127832783lb90pe68.R.iget(102778)!=0|true))||(__CLR4_4_127832783lb90pe68.R.iget(102779)==0&false)); ++r) {{
            __CLR4_4_127832783lb90pe68.R.inc(102780);TestUtils.assertEquals(covMatrix[r], sampleCov[r], epsilon);
        }

    }}finally{__CLR4_4_127832783lb90pe68.R.flushNeeded();}}

}
