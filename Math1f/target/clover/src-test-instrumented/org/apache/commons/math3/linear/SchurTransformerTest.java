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

public class SchurTransformerTest {static class __CLR4_4_11win1winlb90pdcb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,88893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    // from http://eigen.tuxfamily.org/dox/classEigen_1_1RealSchur.html
    private double[][] testRandom = {
            {  0.680, -0.3300, -0.2700, -0.717, -0.687,  0.0259 },
            { -0.211,  0.5360,  0.0268,  0.214, -0.198,  0.6780 },
            {  0.566, -0.4440,  0.9040, -0.967, -0.740,  0.2250 },
            {  0.597,  0.1080,  0.8320, -0.514, -0.782, -0.4080 },
            {  0.823, -0.0452,  0.2710, -0.726,  0.998,  0.2750 },
            { -0.605,  0.2580,  0.4350,  0.608, -0.563,  0.0486 }
    };

    @Test
    public void testNonSquare() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0zsgx1win();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testNonSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0zsgx1win(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88799);
        __CLR4_4_11win1winlb90pdcb.R.inc(88800);try {
            __CLR4_4_11win1winlb90pdcb.R.inc(88801);new SchurTransformer(MatrixUtils.createRealMatrix(new double[3][2]));
            __CLR4_4_11win1winlb90pdcb.R.inc(88802);Assert.fail("an exception should have been thrown");
        } catch (NonSquareMatrixException ime) {
            // expected behavior
        }
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testAEqualPTPt() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pw5wb81wir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testAEqualPTPt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pw5wb81wir(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88803);
        __CLR4_4_11win1winlb90pdcb.R.inc(88804);checkAEqualPTPt(MatrixUtils.createRealMatrix(testSquare5));
        __CLR4_4_11win1winlb90pdcb.R.inc(88805);checkAEqualPTPt(MatrixUtils.createRealMatrix(testSquare3));
        __CLR4_4_11win1winlb90pdcb.R.inc(88806);checkAEqualPTPt(MatrixUtils.createRealMatrix(testRandom));
   }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testPOrthogonal() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kd9c21wiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testPOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kd9c21wiv(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88807);
        __CLR4_4_11win1winlb90pdcb.R.inc(88808);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare5)).getP());
        __CLR4_4_11win1winlb90pdcb.R.inc(88809);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare3)).getP());
        __CLR4_4_11win1winlb90pdcb.R.inc(88810);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testRandom)).getP());        
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testPTOrthogonal() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thvrme1wiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testPTOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thvrme1wiz(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88811);
        __CLR4_4_11win1winlb90pdcb.R.inc(88812);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare5)).getPT());
        __CLR4_4_11win1winlb90pdcb.R.inc(88813);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare3)).getPT());
        __CLR4_4_11win1winlb90pdcb.R.inc(88814);checkOrthogonal(new SchurTransformer(MatrixUtils.createRealMatrix(testRandom)).getPT());
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testSchurForm() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lpv5e1wj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testSchurForm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lpv5e1wj3(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88815);
        __CLR4_4_11win1winlb90pdcb.R.inc(88816);checkSchurForm(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare5)).getT());
        __CLR4_4_11win1winlb90pdcb.R.inc(88817);checkSchurForm(new SchurTransformer(MatrixUtils.createRealMatrix(testSquare3)).getT());
        __CLR4_4_11win1winlb90pdcb.R.inc(88818);checkSchurForm(new SchurTransformer(MatrixUtils.createRealMatrix(testRandom)).getT());
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testRandomData() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjtgo61wj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testRandomData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjtgo61wj7(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88819);
        __CLR4_4_11win1winlb90pdcb.R.inc(88820);for (int run = 0; (((run < 100)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88821)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88822)==0&false)); run++) {{
            __CLR4_4_11win1winlb90pdcb.R.inc(88823);Random r = new Random(System.currentTimeMillis());

            // matrix size
            __CLR4_4_11win1winlb90pdcb.R.inc(88824);int size = r.nextInt(20) + 4;

            __CLR4_4_11win1winlb90pdcb.R.inc(88825);double[][] data = new double[size][size];
            __CLR4_4_11win1winlb90pdcb.R.inc(88826);for (int i = 0; (((i < size)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88827)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88828)==0&false)); i++) {{
                __CLR4_4_11win1winlb90pdcb.R.inc(88829);for (int j = 0; (((j < size)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88830)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88831)==0&false)); j++) {{
                    __CLR4_4_11win1winlb90pdcb.R.inc(88832);data[i][j] = r.nextInt(100);
                }
            }}

            }__CLR4_4_11win1winlb90pdcb.R.inc(88833);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11win1winlb90pdcb.R.inc(88834);RealMatrix s = checkAEqualPTPt(m);
            __CLR4_4_11win1winlb90pdcb.R.inc(88835);checkSchurForm(s);
        }
    }}finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testRandomDataNormalDistribution() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mzult1wjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testRandomDataNormalDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mzult1wjo(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88836);
        __CLR4_4_11win1winlb90pdcb.R.inc(88837);for (int run = 0; (((run < 100)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88838)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88839)==0&false)); run++) {{
            __CLR4_4_11win1winlb90pdcb.R.inc(88840);Random r = new Random(System.currentTimeMillis());
            __CLR4_4_11win1winlb90pdcb.R.inc(88841);NormalDistribution dist = new NormalDistribution(0.0, r.nextDouble() * 5);

            // matrix size
            __CLR4_4_11win1winlb90pdcb.R.inc(88842);int size = r.nextInt(20) + 4;

            __CLR4_4_11win1winlb90pdcb.R.inc(88843);double[][] data = new double[size][size];
            __CLR4_4_11win1winlb90pdcb.R.inc(88844);for (int i = 0; (((i < size)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88845)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88846)==0&false)); i++) {{
                __CLR4_4_11win1winlb90pdcb.R.inc(88847);for (int j = 0; (((j < size)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88848)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88849)==0&false)); j++) {{
                    __CLR4_4_11win1winlb90pdcb.R.inc(88850);data[i][j] = dist.sample();
                }
            }}

            }__CLR4_4_11win1winlb90pdcb.R.inc(88851);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11win1winlb90pdcb.R.inc(88852);RealMatrix s = checkAEqualPTPt(m);
            __CLR4_4_11win1winlb90pdcb.R.inc(88853);checkSchurForm(s);
        }
    }}finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @Test
    public void testMath848() {__CLR4_4_11win1winlb90pdcb.R.globalSliceStart(getClass().getName(),88854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irupmf1wk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11win1winlb90pdcb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11win1winlb90pdcb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SchurTransformerTest.testMath848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irupmf1wk6(){try{__CLR4_4_11win1winlb90pdcb.R.inc(88854);
        __CLR4_4_11win1winlb90pdcb.R.inc(88855);double[][] data = {
                { 0.1849449280, -0.0646971046,  0.0774755812, -0.0969651755, -0.0692648806,  0.3282344352, -0.0177423074,  0.2063136340},
                {-0.0742700134, -0.0289063030, -0.0017269460, -0.0375550146, -0.0487737922, -0.2616837868, -0.0821201295, -0.2530000167},
                { 0.2549910127,  0.0995733692, -0.0009718388,  0.0149282808,  0.1791878897, -0.0823182816,  0.0582629256,  0.3219545182},
                {-0.0694747557, -0.1880649148, -0.2740630911,  0.0720096468, -0.1800836914, -0.3518996425,  0.2486747833,  0.6257938167},
                { 0.0536360918, -0.1339297778,  0.2241579764, -0.0195327484, -0.0054103808,  0.0347564518,  0.5120802482, -0.0329902864},
                {-0.5933332356, -0.2488721082,  0.2357173629,  0.0177285473,  0.0856630593, -0.3567126300, -0.1600668126, -0.1010899621},
                {-0.0514349819, -0.0854319435,  0.1125050061,  0.0063453560, -0.2250000688, -0.2209343090,  0.1964623477, -0.1512329924},
                { 0.0197395947, -0.1997170581, -0.1425959019, -0.2749477910, -0.0969467073,  0.0603688520, -0.2826905192,  0.1794315473}};
        __CLR4_4_11win1winlb90pdcb.R.inc(88856);RealMatrix m = MatrixUtils.createRealMatrix(data);
        __CLR4_4_11win1winlb90pdcb.R.inc(88857);RealMatrix s = checkAEqualPTPt(m);
        __CLR4_4_11win1winlb90pdcb.R.inc(88858);checkSchurForm(s);
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    ///////////////////////////////////////////////////////////////////////////
    // Test helpers
    ///////////////////////////////////////////////////////////////////////////

    private RealMatrix checkAEqualPTPt(RealMatrix matrix) {try{__CLR4_4_11win1winlb90pdcb.R.inc(88859);
        __CLR4_4_11win1winlb90pdcb.R.inc(88860);SchurTransformer transformer = new SchurTransformer(matrix);
        __CLR4_4_11win1winlb90pdcb.R.inc(88861);RealMatrix p  = transformer.getP();
        __CLR4_4_11win1winlb90pdcb.R.inc(88862);RealMatrix t  = transformer.getT();
        __CLR4_4_11win1winlb90pdcb.R.inc(88863);RealMatrix pT = transformer.getPT();
        
        __CLR4_4_11win1winlb90pdcb.R.inc(88864);RealMatrix result = p.multiply(t).multiply(pT);

        __CLR4_4_11win1winlb90pdcb.R.inc(88865);double norm = result.subtract(matrix).getNorm();
        __CLR4_4_11win1winlb90pdcb.R.inc(88866);Assert.assertEquals(0, norm, 1.0e-9);
        
        __CLR4_4_11win1winlb90pdcb.R.inc(88867);return t;
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    private void checkOrthogonal(RealMatrix m) {try{__CLR4_4_11win1winlb90pdcb.R.inc(88868);
        __CLR4_4_11win1winlb90pdcb.R.inc(88869);RealMatrix mTm = m.transpose().multiply(m);
        __CLR4_4_11win1winlb90pdcb.R.inc(88870);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(mTm.getRowDimension());
        __CLR4_4_11win1winlb90pdcb.R.inc(88871);Assert.assertEquals(0, mTm.subtract(id).getNorm(), 1.0e-14);
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    private void checkSchurForm(final RealMatrix m) {try{__CLR4_4_11win1winlb90pdcb.R.inc(88872);
        __CLR4_4_11win1winlb90pdcb.R.inc(88873);final int rows = m.getRowDimension();
        __CLR4_4_11win1winlb90pdcb.R.inc(88874);final int cols = m.getColumnDimension();
        __CLR4_4_11win1winlb90pdcb.R.inc(88875);for (int i = 0; (((i < rows)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88876)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88877)==0&false)); ++i) {{
            __CLR4_4_11win1winlb90pdcb.R.inc(88878);for (int j = 0; (((j < cols)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88879)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88880)==0&false)); ++j) {{
                __CLR4_4_11win1winlb90pdcb.R.inc(88881);if ((((i > j + 1)&&(__CLR4_4_11win1winlb90pdcb.R.iget(88882)!=0|true))||(__CLR4_4_11win1winlb90pdcb.R.iget(88883)==0&false))) {{
                    __CLR4_4_11win1winlb90pdcb.R.inc(88884);Assert.assertEquals(0, m.getEntry(i, j), 1.0e-16);
                }
            }}
        }}
    }}finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}

    @SuppressWarnings("unused")
    private void checkMatricesValues(double[][] matrix, double[][] pRef, double[][] hRef) {try{__CLR4_4_11win1winlb90pdcb.R.inc(88885);

        __CLR4_4_11win1winlb90pdcb.R.inc(88886);SchurTransformer transformer =
            new SchurTransformer(MatrixUtils.createRealMatrix(matrix));

        // check values against known references
        __CLR4_4_11win1winlb90pdcb.R.inc(88887);RealMatrix p = transformer.getP();
        __CLR4_4_11win1winlb90pdcb.R.inc(88888);Assert.assertEquals(0, p.subtract(MatrixUtils.createRealMatrix(pRef)).getNorm(), 1.0e-14);

        __CLR4_4_11win1winlb90pdcb.R.inc(88889);RealMatrix t = transformer.getT();
        __CLR4_4_11win1winlb90pdcb.R.inc(88890);Assert.assertEquals(0, t.subtract(MatrixUtils.createRealMatrix(hRef)).getNorm(), 1.0e-14);

        // check the same cached instance is returned the second time
        __CLR4_4_11win1winlb90pdcb.R.inc(88891);Assert.assertTrue(p == transformer.getP());
        __CLR4_4_11win1winlb90pdcb.R.inc(88892);Assert.assertTrue(t == transformer.getT());
    }finally{__CLR4_4_11win1winlb90pdcb.R.flushNeeded();}}
}
