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

package org.apache.commons.math3.linear;

import java.util.Random;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.junit.Test;
import org.junit.Assert;

public class HessenbergTransformerTest {static class __CLR4_4_11ukv1ukvlb90pd71{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[][] testSquare5 = {
            { 5, 4, 3, 2, 1 },
            { 1, 4, 0, 3, 3 },
            { 2, 0, 3, 0, 0 },
            { 3, 2, 1, 2, 5 },
            { 4, 2, 1, 4, 1 }
    };

    private double[][] testSquare3 = {
            {  2, -1, 1 },
            { -1,  2, 1 },
            {  1, -1, 2 }
    };

    // from http://eigen.tuxfamily.org/dox/classEigen_1_1HessenbergDecomposition.html

    private double[][] testRandom = {
            {  0.680,  0.823, -0.4440, -0.2700 },
            { -0.211, -0.605,  0.1080,  0.0268 },
            {  0.566, -0.330, -0.0452,  0.9040 },
            {  0.597,  0.536,  0.2580,  0.8320 }
    };

    @Test
    public void testNonSquare() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1ukv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1ukv(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86287);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86288);try {
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86289);new HessenbergTransformer(MatrixUtils.createRealMatrix(new double[3][2]));
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86290);Assert.fail("an exception should have been thrown");
        } catch (NonSquareMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testAEqualPHPt() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jipvaw1ukz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testAEqualPHPt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jipvaw1ukz(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86291);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86292);checkAEqualPHPt(MatrixUtils.createRealMatrix(testSquare5));
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86293);checkAEqualPHPt(MatrixUtils.createRealMatrix(testSquare3));
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86294);checkAEqualPHPt(MatrixUtils.createRealMatrix(testRandom));
   }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testPOrthogonal() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd9c21ul3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testPOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd9c21ul3(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86295);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86296);checkOrthogonal(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare5)).getP());
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86297);checkOrthogonal(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare3)).getP());
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testPTOrthogonal() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thvrme1ul6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testPTOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thvrme1ul6(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86298);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86299);checkOrthogonal(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare5)).getPT());
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86300);checkOrthogonal(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare3)).getPT());
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testHessenbergForm() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p66fv1ul9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testHessenbergForm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p66fv1ul9(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86301);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86302);checkHessenbergForm(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare5)).getH());
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86303);checkHessenbergForm(new HessenbergTransformer(MatrixUtils.createRealMatrix(testSquare3)).getH());
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testRandomData() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjtgo61ulc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testRandomData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjtgo61ulc(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86304);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86305);for (int run = 0; (((run < 100)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86306)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86307)==0&false)); run++) {{
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86308);Random r = new Random(System.currentTimeMillis());

            // matrix size
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86309);int size = r.nextInt(20) + 4;

            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86310);double[][] data = new double[size][size];
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86311);for (int i = 0; (((i < size)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86312)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86313)==0&false)); i++) {{
                __CLR4_4_11ukv1ukvlb90pd71.R.inc(86314);for (int j = 0; (((j < size)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86315)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86316)==0&false)); j++) {{
                    __CLR4_4_11ukv1ukvlb90pd71.R.inc(86317);data[i][j] = r.nextInt(100);
                }
            }}

            }__CLR4_4_11ukv1ukvlb90pd71.R.inc(86318);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86319);RealMatrix h = checkAEqualPHPt(m);
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86320);checkHessenbergForm(h);
        }
    }}finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testRandomDataNormalDistribution() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mzult1ult();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testRandomDataNormalDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mzult1ult(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86321);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86322);for (int run = 0; (((run < 100)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86323)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86324)==0&false)); run++) {{
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86325);Random r = new Random(System.currentTimeMillis());
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86326);NormalDistribution dist = new NormalDistribution(0.0, r.nextDouble() * 5);

            // matrix size
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86327);int size = r.nextInt(20) + 4;

            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86328);double[][] data = new double[size][size];
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86329);for (int i = 0; (((i < size)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86330)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86331)==0&false)); i++) {{
                __CLR4_4_11ukv1ukvlb90pd71.R.inc(86332);for (int j = 0; (((j < size)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86333)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86334)==0&false)); j++) {{
                    __CLR4_4_11ukv1ukvlb90pd71.R.inc(86335);data[i][j] = dist.sample();
                }
            }}

            }__CLR4_4_11ukv1ukvlb90pd71.R.inc(86336);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86337);RealMatrix h = checkAEqualPHPt(m);
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86338);checkHessenbergForm(h);
        }
    }}finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testMatricesValues5() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsxudq1umb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testMatricesValues5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsxudq1umb(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86339);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86340);checkMatricesValues(testSquare5,
                            new double[][] {
                                { 1.0,  0.0,                0.0,                0.0,                0.0               },
                                { 0.0, -0.182574185835055,  0.784218758628863,  0.395029040913988, -0.442289115981669 },
                                { 0.0, -0.365148371670111, -0.337950625265477, -0.374110794088820, -0.782621974707823 },
                                { 0.0, -0.547722557505166,  0.402941130124223, -0.626468266309003,  0.381019628053472 },
                                { 0.0, -0.730296743340221, -0.329285224617644,  0.558149336547665,  0.216118545309225 }
                            },
                            new double[][] {
                                {  5.0,              -3.65148371670111,  2.59962019434982, -0.237003414680848, -3.13886458663398  },
                                { -5.47722557505166,  6.9,              -2.29164066120599,  0.207283564429169,  0.703858369151728 },
                                {  0.0,              -4.21386600008432,  2.30555659846067,  2.74935928725112,   0.857569835914113 },
                                {  0.0,               0.0,               2.86406180891882, -1.11582249161595,   0.817995267184158 },
                                {  0.0,               0.0,               0.0,               0.683518597386085,  1.91026589315528  }
                            });
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    @Test
    public void testMatricesValues3() {__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceStart(getClass().getName(),86341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1faxwss1umd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ukv1ukvlb90pd71.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ukv1ukvlb90pd71.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.HessenbergTransformerTest.testMatricesValues3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),86341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1faxwss1umd(){try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86341);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86342);checkMatricesValues(testSquare3,
                            new double[][] {
                                {  1.0,  0.0,               0.0               },
                                {  0.0, -0.707106781186547, 0.707106781186547 },
                                {  0.0,  0.707106781186547, 0.707106781186548 },
                            },
                            new double[][] {
                                {  2.0,              1.41421356237309,  0.0 },
                                {  1.41421356237310, 2.0,              -1.0 },
                                {  0.0,              1.0,               2.0 },
                            });
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    ///////////////////////////////////////////////////////////////////////////
    // Test helpers
    ///////////////////////////////////////////////////////////////////////////
    
    private RealMatrix checkAEqualPHPt(RealMatrix matrix) {try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86343);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86344);HessenbergTransformer transformer = new HessenbergTransformer(matrix);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86345);RealMatrix p  = transformer.getP();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86346);RealMatrix pT = transformer.getPT();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86347);RealMatrix h  = transformer.getH();
        
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86348);RealMatrix result = p.multiply(h).multiply(pT);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86349);double norm = result.subtract(matrix).getNorm();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86350);Assert.assertEquals(0, norm, 1.0e-10);
        
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86351);for (int i = 0; (((i < matrix.getRowDimension())&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86352)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86353)==0&false)); ++i) {{
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86354);for (int j = 0; (((j < matrix.getColumnDimension())&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86355)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86356)==0&false)); ++j) {{
                __CLR4_4_11ukv1ukvlb90pd71.R.inc(86357);if ((((i > j + 1)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86358)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86359)==0&false))) {{
                    __CLR4_4_11ukv1ukvlb90pd71.R.inc(86360);Assert.assertEquals(matrix.getEntry(i, j), result.getEntry(i, j), 1.0e-12);
                }
            }}
        }}
        
        }__CLR4_4_11ukv1ukvlb90pd71.R.inc(86361);return transformer.getH();
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    private void checkOrthogonal(RealMatrix m) {try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86362);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86363);RealMatrix mTm = m.transpose().multiply(m);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86364);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(mTm.getRowDimension());
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86365);Assert.assertEquals(0, mTm.subtract(id).getNorm(), 1.0e-14);
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}

    private void checkHessenbergForm(RealMatrix m) {try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86366);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86367);final int rows = m.getRowDimension();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86368);final int cols = m.getColumnDimension();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86369);for (int i = 0; (((i < rows)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86370)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86371)==0&false)); ++i) {{
            __CLR4_4_11ukv1ukvlb90pd71.R.inc(86372);for (int j = 0; (((j < cols)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86373)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86374)==0&false)); ++j) {{
                __CLR4_4_11ukv1ukvlb90pd71.R.inc(86375);if ((((i > j + 1)&&(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86376)!=0|true))||(__CLR4_4_11ukv1ukvlb90pd71.R.iget(86377)==0&false))) {{
                    __CLR4_4_11ukv1ukvlb90pd71.R.inc(86378);Assert.assertEquals(0, m.getEntry(i, j), 1.0e-16);
                }
            }}
        }}
    }}finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}
    
    private void checkMatricesValues(double[][] matrix, double[][] pRef, double[][] hRef) {try{__CLR4_4_11ukv1ukvlb90pd71.R.inc(86379);
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86380);HessenbergTransformer transformer =
            new HessenbergTransformer(MatrixUtils.createRealMatrix(matrix));

        // check values against known references
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86381);RealMatrix p = transformer.getP();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86382);Assert.assertEquals(0, p.subtract(MatrixUtils.createRealMatrix(pRef)).getNorm(), 1.0e-14);

        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86383);RealMatrix h = transformer.getH();
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86384);Assert.assertEquals(0, h.subtract(MatrixUtils.createRealMatrix(hRef)).getNorm(), 1.0e-14);

        // check the same cached instance is returned the second time
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86385);Assert.assertTrue(p == transformer.getP());
        __CLR4_4_11ukv1ukvlb90pd71.R.inc(86386);Assert.assertTrue(h == transformer.getH());
    }finally{__CLR4_4_11ukv1ukvlb90pd71.R.flushNeeded();}}
}
