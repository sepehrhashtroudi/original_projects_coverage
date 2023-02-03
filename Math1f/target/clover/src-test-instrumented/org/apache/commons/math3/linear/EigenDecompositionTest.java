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

import java.util.Arrays;
import java.util.Random;


import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EigenDecompositionTest {static class __CLR4_4_11tj41tj4lb90pd4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,85309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double[] refValues;
    private RealMatrix matrix;

    @Test
    public void testDimension1() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9q7381tj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9q7381tj4(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84928);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84929);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] { { 1.5 } });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84930);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84931);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84932);Assert.assertEquals(1.5, ed.getRealEigenvalue(0), 1.0e-15);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testDimension2() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1piq5vp1tj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1piq5vp1tj9(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84933);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84934);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] {
                    { 59.0, 12.0 },
                    { 12.0, 66.0 }
            });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84935);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84936);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84937);Assert.assertEquals(75.0, ed.getRealEigenvalue(0), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84938);Assert.assertEquals(50.0, ed.getRealEigenvalue(1), 1.0e-15);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testDimension3() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srq4o61tjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srq4o61tjf(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84939);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84940);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] {
                                   {  39632.0, -4824.0, -16560.0 },
                                   {  -4824.0,  8693.0,   7920.0 },
                                   { -16560.0,  7920.0,  17300.0 }
                               });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84941);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84942);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84943);Assert.assertEquals(50000.0, ed.getRealEigenvalue(0), 3.0e-11);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84944);Assert.assertEquals(12500.0, ed.getRealEigenvalue(1), 3.0e-11);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84945);Assert.assertEquals( 3125.0, ed.getRealEigenvalue(2), 3.0e-11);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testDimension3MultipleRoot() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16doe3s1tjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension3MultipleRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16doe3s1tjm(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84946);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84947);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] {
                    {  5,   10,   15 },
                    { 10,   20,   30 },
                    { 15,   30,   45 }
            });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84948);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84949);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84950);Assert.assertEquals(70.0, ed.getRealEigenvalue(0), 3.0e-11);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84951);Assert.assertEquals(0.0,  ed.getRealEigenvalue(1), 3.0e-11);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84952);Assert.assertEquals(0.0,  ed.getRealEigenvalue(2), 3.0e-11);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testDimension4WithSplit() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138lecb1tjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension4WithSplit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138lecb1tjt(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84953);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84954);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] {
                                   {  0.784, -0.288,  0.000,  0.000 },
                                   { -0.288,  0.616,  0.000,  0.000 },
                                   {  0.000,  0.000,  0.164, -0.048 },
                                   {  0.000,  0.000, -0.048,  0.136 }
                               });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84955);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84956);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84957);Assert.assertEquals(1.0, ed.getRealEigenvalue(0), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84958);Assert.assertEquals(0.4, ed.getRealEigenvalue(1), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84959);Assert.assertEquals(0.2, ed.getRealEigenvalue(2), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84960);Assert.assertEquals(0.1, ed.getRealEigenvalue(3), 1.0e-15);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testDimension4WithoutSplit() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zss871tk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimension4WithoutSplit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zss871tk1(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84961);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84962);RealMatrix matrix =
            MatrixUtils.createRealMatrix(new double[][] {
                                   {  0.5608, -0.2016,  0.1152, -0.2976 },
                                   { -0.2016,  0.4432, -0.2304,  0.1152 },
                                   {  0.1152, -0.2304,  0.3088, -0.1344 },
                                   { -0.2976,  0.1152, -0.1344,  0.3872 }
                               });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84963);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84964);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84965);Assert.assertEquals(1.0, ed.getRealEigenvalue(0), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84966);Assert.assertEquals(0.4, ed.getRealEigenvalue(1), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84967);Assert.assertEquals(0.2, ed.getRealEigenvalue(2), 1.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84968);Assert.assertEquals(0.1, ed.getRealEigenvalue(3), 1.0e-15);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    // the following test triggered an ArrayIndexOutOfBoundsException in commons-math 2.0
    @Test
    public void testMath308() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f378h41tk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testMath308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f378h41tk9(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84969);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84970);double[] mainTridiagonal = {
            22.330154644539597, 46.65485522478641, 17.393672330044705, 54.46687435351116, 80.17800767709437
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84971);double[] secondaryTridiagonal = {
            13.04450406501361, -5.977590941539671, 2.9040909856707517, 7.1570352792841225
        };

        // the reference values have been computed using routine DSTEMR
        // from the fortran library LAPACK version 3.2.1
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84972);double[] refEigenValues = {
            82.044413207204002, 53.456697699894512, 52.536278520113882, 18.847969733754262, 14.138204224043099
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84973);RealVector[] refEigenVectors = {
            new ArrayRealVector(new double[] { -0.000462690386766, -0.002118073109055,  0.011530080757413,  0.252322434584915,  0.967572088232592 }),
            new ArrayRealVector(new double[] {  0.314647769490148,  0.750806415553905, -0.167700312025760, -0.537092972407375,  0.143854968127780 }),
            new ArrayRealVector(new double[] {  0.222368839324646,  0.514921891363332, -0.021377019336614,  0.801196801016305, -0.207446991247740 }),
            new ArrayRealVector(new double[] { -0.713933751051495,  0.190582113553930, -0.671410443368332,  0.056056055955050, -0.006541576993581 }),
            new ArrayRealVector(new double[] { -0.584677060845929,  0.367177264979103,  0.721453187784497, -0.052971054621812,  0.005740715188257 })
        };

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84974);EigenDecomposition decomposition;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84975);decomposition = new EigenDecomposition(mainTridiagonal, secondaryTridiagonal);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84976);double[] eigenValues = decomposition.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84977);for (int i = 0; (((i < refEigenValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84978)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84979)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(84980);Assert.assertEquals(refEigenValues[i], eigenValues[i], 1.0e-5);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(84981);Assert.assertEquals(0, refEigenVectors[i].subtract(decomposition.getEigenvector(i)).getNorm(), 2.0e-7);
        }

    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testMathpbx02() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6avrp1tkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testMathpbx02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6avrp1tkm(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84982);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84983);double[] mainTridiagonal = {
              7484.860960227216, 18405.28129035345, 13855.225609560746,
             10016.708722343366, 559.8117399576674, 6750.190788301587,
                71.21428769782159
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84984);double[] secondaryTridiagonal = {
             -4175.088570476366,1975.7955858241994,5193.178422374075,
              1995.286659169179,75.34535882933804,-234.0808002076056
        };

        // the reference values have been computed using routine DSTEMR
        // from the fortran library LAPACK version 3.2.1
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84985);double[] refEigenValues = {
                20654.744890306974412,16828.208208485466457,
                6893.155912634994820,6757.083016675340332,
                5887.799885688558788,64.309089923240379,
                57.992628792736340
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84986);RealVector[] refEigenVectors = {
                new ArrayRealVector(new double[] {-0.270356342026904, 0.852811091326997, 0.399639490702077, 0.198794657813990, 0.019739323307666, 0.000106983022327, -0.000001216636321}),
                new ArrayRealVector(new double[] {0.179995273578326,-0.402807848153042,0.701870993525734,0.555058211014888,0.068079148898236,0.000509139115227,-0.000007112235617}),
                new ArrayRealVector(new double[] {-0.399582721284727,-0.056629954519333,-0.514406488522827,0.711168164518580,0.225548081276367,0.125943999652923,-0.004321507456014}),
                new ArrayRealVector(new double[] {0.058515721572821,0.010200130057739,0.063516274916536,-0.090696087449378,-0.017148420432597,0.991318870265707,-0.034707338554096}),
                new ArrayRealVector(new double[] {0.855205995537564,0.327134656629775,-0.265382397060548,0.282690729026706,0.105736068025572,-0.009138126622039,0.000367751821196}),
                new ArrayRealVector(new double[] {-0.002913069901144,-0.005177515777101,0.041906334478672,-0.109315918416258,0.436192305456741,0.026307315639535,0.891797507436344}),
                new ArrayRealVector(new double[] {-0.005738311176435,-0.010207611670378,0.082662420517928,-0.215733886094368,0.861606487840411,-0.025478530652759,-0.451080697503958})
        };

        // the following line triggers the exception
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84987);EigenDecomposition decomposition;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84988);decomposition = new EigenDecomposition(mainTridiagonal, secondaryTridiagonal);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84989);double[] eigenValues = decomposition.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(84990);for (int i = 0; (((i < refEigenValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84991)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84992)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(84993);Assert.assertEquals(refEigenValues[i], eigenValues[i], 1.0e-3);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(84994);if ((((refEigenVectors[i].dotProduct(decomposition.getEigenvector(i)) < 0)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84995)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(84996)==0&false))) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(84997);Assert.assertEquals(0, refEigenVectors[i].add(decomposition.getEigenvector(i)).getNorm(), 1.0e-5);
            } }else {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(84998);Assert.assertEquals(0, refEigenVectors[i].subtract(decomposition.getEigenvector(i)).getNorm(), 1.0e-5);
            }
        }}

    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testMathpbx03() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),84999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfauk61tl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testMathpbx03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfauk61tl3(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(84999);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85000);double[] mainTridiagonal = {
            1809.0978259647177,3395.4763425956166,1832.1894584712693,3804.364873592377,
            806.0482458637571,2403.656427234185,28.48691431556015
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85001);double[] secondaryTridiagonal = {
            -656.8932064545833,-469.30804108920734,-1021.7714889369421,
            -1152.540497328983,-939.9765163817368,-12.885877015422391
        };

        // the reference values have been computed using routine DSTEMR
        // from the fortran library LAPACK version 3.2.1
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85002);double[] refEigenValues = {
            4603.121913685183245,3691.195818048970978,2743.442955402465032,1657.596442107321764,
            1336.797819095331306,30.129865209677519,17.035352085224986
        };

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85003);RealVector[] refEigenVectors = {
            new ArrayRealVector(new double[] {-0.036249830202337,0.154184732411519,-0.346016328392363,0.867540105133093,-0.294483395433451,0.125854235969548,-0.000354507444044}),
            new ArrayRealVector(new double[] {-0.318654191697157,0.912992309960507,-0.129270874079777,-0.184150038178035,0.096521712579439,-0.070468788536461,0.000247918177736}),
            new ArrayRealVector(new double[] {-0.051394668681147,0.073102235876933,0.173502042943743,-0.188311980310942,-0.327158794289386,0.905206581432676,-0.004296342252659}),
            new ArrayRealVector(new double[] {0.838150199198361,0.193305209055716,-0.457341242126146,-0.166933875895419,0.094512811358535,0.119062381338757,-0.000941755685226}),
            new ArrayRealVector(new double[] {0.438071395458547,0.314969169786246,0.768480630802146,0.227919171600705,-0.193317045298647,-0.170305467485594,0.001677380536009}),
            new ArrayRealVector(new double[] {-0.003726503878741,-0.010091946369146,-0.067152015137611,-0.113798146542187,-0.313123000097908,-0.118940107954918,0.932862311396062}),
            new ArrayRealVector(new double[] {0.009373003194332,0.025570377559400,0.170955836081348,0.291954519805750,0.807824267665706,0.320108347088646,0.360202112392266}),
        };

        // the following line triggers the exception
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85004);EigenDecomposition decomposition;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85005);decomposition = new EigenDecomposition(mainTridiagonal, secondaryTridiagonal);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85006);double[] eigenValues = decomposition.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85007);for (int i = 0; (((i < refEigenValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85008)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85009)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85010);Assert.assertEquals(refEigenValues[i], eigenValues[i], 1.0e-4);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85011);if ((((refEigenVectors[i].dotProduct(decomposition.getEigenvector(i)) < 0)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85012)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85013)==0&false))) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85014);Assert.assertEquals(0, refEigenVectors[i].add(decomposition.getEigenvector(i)).getNorm(), 1.0e-5);
            } }else {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85015);Assert.assertEquals(0, refEigenVectors[i].subtract(decomposition.getEigenvector(i)).getNorm(), 1.0e-5);
            }
        }}

    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test a matrix already in tridiagonal form. */
    @Test
    public void testTridiagonal() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0fnn91tlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testTridiagonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0fnn91tlk(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85016);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85017);Random r = new Random(4366663527842l);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85018);double[] ref = new double[30];
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85019);for (int i = 0; (((i < ref.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85020)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85021)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85022);if ((((i < 5)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85023)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85024)==0&false))) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85025);ref[i] = 2 * r.nextDouble() - 1;
            } }else {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85026);ref[i] = 0.0001 * r.nextDouble() + 6;
            }
        }}
        }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85027);Arrays.sort(ref);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85028);TriDiagonalTransformer t =
            new TriDiagonalTransformer(createTestMatrix(r, ref));
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85029);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85030);ed = new EigenDecomposition(t.getMainDiagonalRef(), t.getSecondaryDiagonalRef());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85031);double[] eigenValues = ed.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85032);Assert.assertEquals(ref.length, eigenValues.length);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85033);for (int i = 0; (((i < ref.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85034)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85035)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85036);Assert.assertEquals(ref[ref.length - i - 1], eigenValues[i], 2.0e-14);
        }

    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test dimensions */
    @Test
    public void testDimensions() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nobtd21tm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nobtd21tm5(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85037);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85038);final int m = matrix.getRowDimension();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85039);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85040);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85041);Assert.assertEquals(m, ed.getV().getRowDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85042);Assert.assertEquals(m, ed.getV().getColumnDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85043);Assert.assertEquals(m, ed.getD().getColumnDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85044);Assert.assertEquals(m, ed.getD().getColumnDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85045);Assert.assertEquals(m, ed.getVT().getRowDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85046);Assert.assertEquals(m, ed.getVT().getColumnDimension());
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test eigenvalues */
    @Test
    public void testEigenvalues() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1og1oo31tmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testEigenvalues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1og1oo31tmf(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85047);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85048);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85049);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85050);double[] eigenValues = ed.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85051);Assert.assertEquals(refValues.length, eigenValues.length);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85052);for (int i = 0; (((i < refValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85053)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85054)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85055);Assert.assertEquals(refValues[i], eigenValues[i], 3.0e-15);
        }
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test eigenvalues for a big matrix. */
    @Test
    public void testBigMatrix() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlvtwq1tmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testBigMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlvtwq1tmo(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85056);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85057);Random r = new Random(17748333525117l);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85058);double[] bigValues = new double[200];
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85059);for (int i = 0; (((i < bigValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85060)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85061)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85062);bigValues[i] = 2 * r.nextDouble() - 1;
        }
        }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85063);Arrays.sort(bigValues);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85064);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85065);ed = new EigenDecomposition(createTestMatrix(r, bigValues));
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85066);double[] eigenValues = ed.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85067);Assert.assertEquals(bigValues.length, eigenValues.length);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85068);for (int i = 0; (((i < bigValues.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85069)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85070)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85071);Assert.assertEquals(bigValues[bigValues.length - i - 1], eigenValues[i], 2.0e-14);
        }
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testSymmetric() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzhpxw1tn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testSymmetric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzhpxw1tn4(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85072);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85073);RealMatrix symmetric = MatrixUtils.createRealMatrix(new double[][] {
                {4, 1, 1},
                {1, 2, 3},
                {1, 3, 6}
        });

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85074);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85075);ed = new EigenDecomposition(symmetric);
        
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85076);RealMatrix d = ed.getD();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85077);RealMatrix v = ed.getV();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85078);RealMatrix vT = ed.getVT();

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85079);double norm = v.multiply(d).multiply(vT).subtract(symmetric).getNorm();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85080);Assert.assertEquals(0, norm, 6.0e-13);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testSquareRoot() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113gf0o1tnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testSquareRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113gf0o1tnd(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85081);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85082);final double[][] data = {
            { 33, 24,  7 },
            { 24, 57, 11 },
            {  7, 11,  9 }
        };

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85083);final EigenDecomposition dec = new EigenDecomposition(MatrixUtils.createRealMatrix(data));
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85084);final RealMatrix sqrtM = dec.getSquareRoot();

        // Reconstruct initial matrix.
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85085);final RealMatrix m = sqrtM.multiply(sqrtM);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85086);final int dim = data.length;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85087);for (int r = 0; (((r < dim)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85088)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85089)==0&false)); r++) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85090);for (int c = 0; (((c < dim)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85091)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85092)==0&false)); c++) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85093);Assert.assertEquals("m[" + r + "][" + c + "]",
                                    data[r][c], m.getEntry(r, c), 1e-13);
            }
        }}
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test(expected=MathUnsupportedOperationException.class)
    public void testSquareRootNonSymmetric() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15luuki1tnq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,113,117,97,114,101,82,111,111,116,78,111,110,83,121,109,109,101,116,114,105,99,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testSquareRootNonSymmetric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15luuki1tnq(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85094);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85095);final double[][] data = {
            { 1,  2, 4 },
            { 2,  3, 5 },
            { 11, 5, 9 }
        };

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85096);final EigenDecomposition dec = new EigenDecomposition(MatrixUtils.createRealMatrix(data));
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85097);@SuppressWarnings("unused")
        final RealMatrix sqrtM = dec.getSquareRoot();
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test(expected=MathUnsupportedOperationException.class)
    public void testSquareRootNonPositiveDefinite() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcqohg1tnu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,113,117,97,114,101,82,111,111,116,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testSquareRootNonPositiveDefinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcqohg1tnu(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85098);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85099);final double[][] data = {
            { 1, 2,  4 },
            { 2, 3,  5 },
            { 4, 5, -9 }
        };

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85100);final EigenDecomposition dec = new EigenDecomposition(MatrixUtils.createRealMatrix(data));
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85101);@SuppressWarnings("unused")
        final RealMatrix sqrtM = dec.getSquareRoot();
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Test
    public void testUnsymmetric() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2is9f1tny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testUnsymmetric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2is9f1tny(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85102);
        // Vandermonde matrix V(x;i,j) = x_i^{n - j} with x = (-1,-2,3,4)
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85103);double[][] vData = { { -1.0, 1.0, -1.0, 1.0 },
                             { -8.0, 4.0, -2.0, 1.0 },
                             { 27.0, 9.0,  3.0, 1.0 },
                             { 64.0, 16.0, 4.0, 1.0 } };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85104);checkUnsymmetricMatrix(MatrixUtils.createRealMatrix(vData));
      
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85105);RealMatrix randMatrix = MatrixUtils.createRealMatrix(new double[][] {
                {0,  1,     0,     0},
                {1,  0,     2.e-7, 0},
                {0, -2.e-7, 0,     1},
                {0,  0,     1,     0}
        });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85106);checkUnsymmetricMatrix(randMatrix);

        // from http://eigen.tuxfamily.org/dox/classEigen_1_1RealSchur.html
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85107);double[][] randData2 = {
                {  0.680, -0.3300, -0.2700, -0.717, -0.687,  0.0259 },
                { -0.211,  0.5360,  0.0268,  0.214, -0.198,  0.6780 },
                {  0.566, -0.4440,  0.9040, -0.967, -0.740,  0.2250 },
                {  0.597,  0.1080,  0.8320, -0.514, -0.782, -0.4080 },
                {  0.823, -0.0452,  0.2710, -0.726,  0.998,  0.2750 },
                { -0.605,  0.2580,  0.4350,  0.608, -0.563,  0.0486 }
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85108);checkUnsymmetricMatrix(MatrixUtils.createRealMatrix(randData2));
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}
    
    @Test
    @Ignore
    public void testRandomUnsymmetricMatrix() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1faynjl1to5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testRandomUnsymmetricMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1faynjl1to5(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85109);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85110);for (int run = 0; (((run < 100)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85111)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85112)==0&false)); run++) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85113);Random r = new Random(System.currentTimeMillis());

            // matrix size
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85114);int size = r.nextInt(20) + 4;

            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85115);double[][] data = new double[size][size];
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85116);for (int i = 0; (((i < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85117)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85118)==0&false)); i++) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85119);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85120)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85121)==0&false)); j++) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85122);data[i][j] = r.nextInt(100);
                }
            }}

            }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85123);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85124);checkUnsymmetricMatrix(m);
        }        
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}
    
    @Test
    @Ignore
    public void testNormalDistributionUnsymmetricMatrix() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zapoix1tol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testNormalDistributionUnsymmetricMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zapoix1tol(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85125);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85126);for (int run = 0; (((run < 100)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85127)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85128)==0&false)); run++) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85129);Random r = new Random(System.currentTimeMillis());
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85130);NormalDistribution dist = new NormalDistribution(0.0, r.nextDouble() * 5);

            // matrix size
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85131);int size = r.nextInt(20) + 4;

            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85132);double[][] data = new double[size][size];
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85133);for (int i = 0; (((i < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85134)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85135)==0&false)); i++) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85136);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85137)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85138)==0&false)); j++) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85139);data[i][j] = dist.sample();
                }
            }}

            }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85140);RealMatrix m = MatrixUtils.createRealMatrix(data);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85141);checkUnsymmetricMatrix(m);
        }
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}
    
    @Test
    public void testMath848() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irupmf1tp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testMath848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irupmf1tp2(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85142);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85143);double[][] data = {
                { 0.1849449280, -0.0646971046,  0.0774755812, -0.0969651755, -0.0692648806,  0.3282344352, -0.0177423074,  0.2063136340},
                {-0.0742700134, -0.0289063030, -0.0017269460, -0.0375550146, -0.0487737922, -0.2616837868, -0.0821201295, -0.2530000167},
                { 0.2549910127,  0.0995733692, -0.0009718388,  0.0149282808,  0.1791878897, -0.0823182816,  0.0582629256,  0.3219545182},
                {-0.0694747557, -0.1880649148, -0.2740630911,  0.0720096468, -0.1800836914, -0.3518996425,  0.2486747833,  0.6257938167},
                { 0.0536360918, -0.1339297778,  0.2241579764, -0.0195327484, -0.0054103808,  0.0347564518,  0.5120802482, -0.0329902864},
                {-0.5933332356, -0.2488721082,  0.2357173629,  0.0177285473,  0.0856630593, -0.3567126300, -0.1600668126, -0.1010899621},
                {-0.0514349819, -0.0854319435,  0.1125050061,  0.0063453560, -0.2250000688, -0.2209343090,  0.1964623477, -0.1512329924},
                { 0.0197395947, -0.1997170581, -0.1425959019, -0.2749477910, -0.0969467073,  0.0603688520, -0.2826905192,  0.1794315473}};
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85144);RealMatrix m = MatrixUtils.createRealMatrix(data);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85145);checkUnsymmetricMatrix(m);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Checks that the eigen decomposition of a general (unsymmetric) matrix is valid by
     * checking: A*V = V*D
     */
    private void checkUnsymmetricMatrix(final RealMatrix m) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85146);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85147);try {
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85148);EigenDecomposition ed = new EigenDecomposition(m);
        
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85149);RealMatrix d = ed.getD();
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85150);RealMatrix v = ed.getV();
            //RealMatrix vT = ed.getVT();

            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85151);RealMatrix x = m.multiply(v);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85152);RealMatrix y = v.multiply(d);
        
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85153);double diffNorm = x.subtract(y).getNorm();
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85154);Assert.assertTrue("The norm of (X-Y) is too large: " + diffNorm + ", matrix=" + m.toString(),
                    x.subtract(y).getNorm() < 1000 * Precision.EPSILON * FastMath.max(x.getNorm(), y.getNorm()));
        
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85155);RealMatrix invV = new LUDecomposition(v).getSolver().getInverse();
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85156);double norm = v.multiply(d).multiply(invV).subtract(m).getNorm();
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85157);Assert.assertEquals(0.0, norm, 1.0e-10);
        } catch (Exception e) {
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85158);Assert.fail("Failed to create EigenDecomposition for matrix " + m.toString() + ", ex=" + e.toString());
        }
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test eigenvectors */
    @Test
    public void testEigenvectors() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnwtf1tpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testEigenvectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnwtf1tpj(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85159);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85160);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85161);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85162);for (int i = 0; (((i < matrix.getRowDimension())&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85163)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85164)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85165);double lambda = ed.getRealEigenvalue(i);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85166);RealVector v  = ed.getEigenvector(i);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85167);RealVector mV = matrix.operate(v);
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85168);Assert.assertEquals(0, mV.subtract(v.mapMultiplyToSelf(lambda)).getNorm(), 1.0e-13);
        }
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test A = VDVt */
    @Test
    public void testAEqualVDVt() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gndz9k1tpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testAEqualVDVt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gndz9k1tpt(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85169);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85170);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85171);ed = new EigenDecomposition(matrix);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85172);RealMatrix v  = ed.getV();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85173);RealMatrix d  = ed.getD();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85174);RealMatrix vT = ed.getVT();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85175);double norm = v.multiply(d).multiply(vT).subtract(matrix).getNorm();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85176);Assert.assertEquals(0, norm, 6.0e-13);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test that V is orthogonal */
    @Test
    public void testVOrthogonal() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w126kc1tq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testVOrthogonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w126kc1tq1(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85177);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85178);RealMatrix v = new EigenDecomposition(matrix).getV();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85179);RealMatrix vTv = v.transpose().multiply(v);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85180);RealMatrix id  = MatrixUtils.createRealIdentityMatrix(vTv.getRowDimension());
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85181);Assert.assertEquals(0, vTv.subtract(id).getNorm(), 2.0e-13);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /** test diagonal matrix */
    @Test
    public void testDiagonal() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umo0j61tq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDiagonal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umo0j61tq6(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85182);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85183);double[] diagonal = new double[] { -3.0, -2.0, 2.0, 5.0 };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85184);RealMatrix m = MatrixUtils.createRealDiagonalMatrix(diagonal);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85185);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85186);ed = new EigenDecomposition(m);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85187);Assert.assertEquals(diagonal[0], ed.getRealEigenvalue(3), 2.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85188);Assert.assertEquals(diagonal[1], ed.getRealEigenvalue(2), 2.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85189);Assert.assertEquals(diagonal[2], ed.getRealEigenvalue(1), 2.0e-15);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85190);Assert.assertEquals(diagonal[3], ed.getRealEigenvalue(0), 2.0e-15);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Matrix with eigenvalues {8, -1, -1}
     */
    @Test
    public void testRepeatedEigenvalue() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6glvs1tqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testRepeatedEigenvalue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6glvs1tqf(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85191);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85192);RealMatrix repeated = MatrixUtils.createRealMatrix(new double[][] {
                {3,  2,  4},
                {2,  0,  2},
                {4,  2,  3}
        });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85193);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85194);ed = new EigenDecomposition(repeated);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85195);checkEigenValues((new double[] {8, -1, -1}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85196);checkEigenVector((new double[] {2, 1, 2}), ed, 1E-12);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Matrix with eigenvalues {2, 0, 12}
     */
    @Test
    public void testDistinctEigenvalues() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f939ix1tql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testDistinctEigenvalues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f939ix1tql(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85197);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85198);RealMatrix distinct = MatrixUtils.createRealMatrix(new double[][] {
                {3, 1, -4},
                {1, 3, -4},
                {-4, -4, 8}
        });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85199);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85200);ed = new EigenDecomposition(distinct);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85201);checkEigenValues((new double[] {2, 0, 12}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85202);checkEigenVector((new double[] {1, -1, 0}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85203);checkEigenVector((new double[] {1, 1, 1}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85204);checkEigenVector((new double[] {-1, -1, 2}), ed, 1E-12);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Verifies operation on indefinite matrix
     */
    @Test
    public void testZeroDivide() {__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceStart(getClass().getName(),85205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au9zyy1tqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tj41tj4lb90pd4v.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tj41tj4lb90pd4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.EigenDecompositionTest.testZeroDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),85205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au9zyy1tqt(){try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85205);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85206);RealMatrix indefinite = MatrixUtils.createRealMatrix(new double [][] {
                { 0.0, 1.0, -1.0 },
                { 1.0, 1.0, 0.0 },
                { -1.0,0.0, 1.0 }
        });
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85207);EigenDecomposition ed;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85208);ed = new EigenDecomposition(indefinite);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85209);checkEigenValues((new double[] {2, 1, -1}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85210);double isqrt3 = 1/FastMath.sqrt(3.0);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85211);checkEigenVector((new double[] {isqrt3,isqrt3,-isqrt3}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85212);double isqrt2 = 1/FastMath.sqrt(2.0);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85213);checkEigenVector((new double[] {0.0,-isqrt2,-isqrt2}), ed, 1E-12);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85214);double isqrt6 = 1/FastMath.sqrt(6.0);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85215);checkEigenVector((new double[] {2*isqrt6,-isqrt6,isqrt6}), ed, 1E-12);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}
    /**
     * Verifies that the given EigenDecomposition has eigenvalues equivalent to
     * the targetValues, ignoring the order of the values and allowing
     * values to differ by tolerance.
     */
    protected void checkEigenValues(double[] targetValues,
            EigenDecomposition ed, double tolerance) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85216);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85217);double[] observed = ed.getRealEigenvalues();
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85218);for (int i = 0; (((i < observed.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85219)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85220)==0&false)); i++) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85221);Assert.assertTrue(isIncludedValue(observed[i], targetValues, tolerance));
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85222);Assert.assertTrue(isIncludedValue(targetValues[i], observed, tolerance));
        }
    }}finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}


    /**
     * Returns true iff there is an entry within tolerance of value in
     * searchArray.
     */
    private boolean isIncludedValue(double value, double[] searchArray,
            double tolerance) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85223);
       __CLR4_4_11tj41tj4lb90pd4v.R.inc(85224);boolean found = false;
       __CLR4_4_11tj41tj4lb90pd4v.R.inc(85225);int i = 0;
       __CLR4_4_11tj41tj4lb90pd4v.R.inc(85226);while ((((!found && i < searchArray.length)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85227)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85228)==0&false))) {{
           __CLR4_4_11tj41tj4lb90pd4v.R.inc(85229);if ((((FastMath.abs(value - searchArray[i]) < tolerance)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85230)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85231)==0&false))) {{
               __CLR4_4_11tj41tj4lb90pd4v.R.inc(85232);found = true;
           }
           }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85233);i++;
       }
       }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85234);return found;
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Returns true iff eigenVector is a scalar multiple of one of the columns
     * of ed.getV().  Does not try linear combinations - i.e., should only be
     * used to find vectors in one-dimensional eigenspaces.
     */
    protected void checkEigenVector(double[] eigenVector,
            EigenDecomposition ed, double tolerance) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85235);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85236);Assert.assertTrue(isIncludedColumn(eigenVector, ed.getV(), tolerance));
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    /**
     * Returns true iff there is a column that is a scalar multiple of column
     * in searchMatrix (modulo tolerance)
     */
    private boolean isIncludedColumn(double[] column, RealMatrix searchMatrix,
            double tolerance) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85237);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85238);boolean found = false;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85239);int i = 0;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85240);while ((((!found && i < searchMatrix.getColumnDimension())&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85241)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85242)==0&false))) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85243);double multiplier = 1.0;
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85244);boolean matching = true;
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85245);int j = 0;
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85246);while ((((matching && j < searchMatrix.getRowDimension())&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85247)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85248)==0&false))) {{
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85249);double colEntry = searchMatrix.getEntry(j, i);
                // Use the first entry where both are non-zero as scalar
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85250);if ((((FastMath.abs(multiplier - 1.0) <= FastMath.ulp(1.0) && FastMath.abs(colEntry) > 1E-14
                        && FastMath.abs(column[j]) > 1e-14)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85251)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85252)==0&false))) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85253);multiplier = colEntry / column[j];
                }
                }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85254);if ((((FastMath.abs(column[j] * multiplier - colEntry) > tolerance)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85255)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85256)==0&false))) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85257);matching = false;
                }
                }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85258);j++;
            }
            }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85259);found = matching;
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85260);i++;
        }
        }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85261);return found;
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @Before
    public void setUp() {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85262);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85263);refValues = new double[] {
                2.003, 2.002, 2.001, 1.001, 1.000, 0.001
        };
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85264);matrix = createTestMatrix(new Random(35992629946426l), refValues);
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85265);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85266);refValues = null;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85267);matrix    = null;
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    static RealMatrix createTestMatrix(final Random r, final double[] eigenValues) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85268);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85269);final int n = eigenValues.length;
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85270);final RealMatrix v = createOrthogonalMatrix(r, n);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85271);final RealMatrix d = MatrixUtils.createRealDiagonalMatrix(eigenValues);
        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85272);return v.multiply(d).multiply(v.transpose());
    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}

    public static RealMatrix createOrthogonalMatrix(final Random r, final int size) {try{__CLR4_4_11tj41tj4lb90pd4v.R.inc(85273);

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85274);final double[][] data = new double[size][size];

        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85275);for (int i = 0; (((i < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85276)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85277)==0&false)); ++i) {{
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85278);final double[] dataI = data[i];
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85279);double norm2 = 0;
            __CLR4_4_11tj41tj4lb90pd4v.R.inc(85280);do {{

                // generate randomly row I
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85281);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85282)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85283)==0&false)); ++j) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85284);dataI[j] = 2 * r.nextDouble() - 1;
                }

                // project the row in the subspace orthogonal to previous rows
                }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85285);for (int k = 0; (((k < i)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85286)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85287)==0&false)); ++k) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85288);final double[] dataK = data[k];
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85289);double dotProduct = 0;
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85290);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85291)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85292)==0&false)); ++j) {{
                        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85293);dotProduct += dataI[j] * dataK[j];
                    }
                    }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85294);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85295)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85296)==0&false)); ++j) {{
                        __CLR4_4_11tj41tj4lb90pd4v.R.inc(85297);dataI[j] -= dotProduct * dataK[j];
                    }
                }}

                // normalize the row
                }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85298);norm2 = 0;
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85299);for (final double dataIJ : dataI) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85300);norm2 += dataIJ * dataIJ;
                }
                }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85301);final double inv = 1.0 / FastMath.sqrt(norm2);
                __CLR4_4_11tj41tj4lb90pd4v.R.inc(85302);for (int j = 0; (((j < size)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85303)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85304)==0&false)); ++j) {{
                    __CLR4_4_11tj41tj4lb90pd4v.R.inc(85305);dataI[j] *= inv;
                }

            }} }while ((((norm2 * size < 0.01)&&(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85306)!=0|true))||(__CLR4_4_11tj41tj4lb90pd4v.R.iget(85307)==0&false)));
        }

        }__CLR4_4_11tj41tj4lb90pd4v.R.inc(85308);return MatrixUtils.createRealMatrix(data);

    }finally{__CLR4_4_11tj41tj4lb90pd4v.R.flushNeeded();}}
}
