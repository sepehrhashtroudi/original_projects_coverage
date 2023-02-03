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

package org.apache.commons.math3.stat.descriptive.moment;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.linear.RealMatrix;

import org.junit.Test;
import org.junit.Assert;

public class VectorialCovarianceTest {static class __CLR4_4_12b9y2b9ylb90peor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107961,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[][] points;

    public VectorialCovarianceTest() {try{__CLR4_4_12b9y2b9ylb90peor.R.inc(107926);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107927);points = new double[][] {
            { 1.2, 2.3,  4.5},
            {-0.7, 2.3,  5.0},
            { 3.1, 0.0, -3.1},
            { 6.0, 1.2,  4.2},
            {-0.7, 2.3,  5.0}
        };
    }finally{__CLR4_4_12b9y2b9ylb90peor.R.flushNeeded();}}

    @Test
    public void testMismatch() {__CLR4_4_12b9y2b9ylb90peor.R.globalSliceStart(getClass().getName(),107928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pp7tbt2ba0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b9y2b9ylb90peor.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b9y2b9ylb90peor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest.testMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pp7tbt2ba0(){try{__CLR4_4_12b9y2b9ylb90peor.R.inc(107928);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107929);try {
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107930);new VectorialCovariance(8, true).increment(new double[5]);
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107931);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException dme) {
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107932);Assert.assertEquals(5, dme.getArgument());
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107933);Assert.assertEquals(8, dme.getDimension());
        }
    }finally{__CLR4_4_12b9y2b9ylb90peor.R.flushNeeded();}}

    @Test
    public void testSimplistic() {__CLR4_4_12b9y2b9ylb90peor.R.globalSliceStart(getClass().getName(),107934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci8r1y2ba6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b9y2b9ylb90peor.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b9y2b9ylb90peor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest.testSimplistic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci8r1y2ba6(){try{__CLR4_4_12b9y2b9ylb90peor.R.inc(107934);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107935);VectorialCovariance stat = new VectorialCovariance(2, true);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107936);stat.increment(new double[] {-1.0,  1.0});
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107937);stat.increment(new double[] { 1.0, -1.0});
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107938);RealMatrix c = stat.getResult();
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107939);Assert.assertEquals( 2.0, c.getEntry(0, 0), 1.0e-12);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107940);Assert.assertEquals(-2.0, c.getEntry(1, 0), 1.0e-12);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107941);Assert.assertEquals( 2.0, c.getEntry(1, 1), 1.0e-12);
    }finally{__CLR4_4_12b9y2b9ylb90peor.R.flushNeeded();}}

    @Test
    public void testBasicStats() {__CLR4_4_12b9y2b9ylb90peor.R.globalSliceStart(getClass().getName(),107942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl2cru2bae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b9y2b9ylb90peor.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b9y2b9ylb90peor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest.testBasicStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl2cru2bae(){try{__CLR4_4_12b9y2b9ylb90peor.R.inc(107942);

        __CLR4_4_12b9y2b9ylb90peor.R.inc(107943);VectorialCovariance stat = new VectorialCovariance(points[0].length, true);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107944);for (int i = 0; (((i < points.length)&&(__CLR4_4_12b9y2b9ylb90peor.R.iget(107945)!=0|true))||(__CLR4_4_12b9y2b9ylb90peor.R.iget(107946)==0&false)); ++i) {{
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107947);stat.increment(points[i]);
        }

        }__CLR4_4_12b9y2b9ylb90peor.R.inc(107948);Assert.assertEquals(points.length, stat.getN());

        __CLR4_4_12b9y2b9ylb90peor.R.inc(107949);RealMatrix c = stat.getResult();
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107950);double[][] refC    = new double[][] {
                { 8.0470, -1.9195, -3.4445},
                {-1.9195,  1.0470,  3.2795},
                {-3.4445,  3.2795, 12.2070}
        };

        __CLR4_4_12b9y2b9ylb90peor.R.inc(107951);for (int i = 0; (((i < c.getRowDimension())&&(__CLR4_4_12b9y2b9ylb90peor.R.iget(107952)!=0|true))||(__CLR4_4_12b9y2b9ylb90peor.R.iget(107953)==0&false)); ++i) {{
            __CLR4_4_12b9y2b9ylb90peor.R.inc(107954);for (int j = 0; (((j <= i)&&(__CLR4_4_12b9y2b9ylb90peor.R.iget(107955)!=0|true))||(__CLR4_4_12b9y2b9ylb90peor.R.iget(107956)==0&false)); ++j) {{
                __CLR4_4_12b9y2b9ylb90peor.R.inc(107957);Assert.assertEquals(refC[i][j], c.getEntry(i, j), 1.0e-12);
            }
        }}

    }}finally{__CLR4_4_12b9y2b9ylb90peor.R.flushNeeded();}}

    @Test
    public void testSerial(){__CLR4_4_12b9y2b9ylb90peor.R.globalSliceStart(getClass().getName(),107958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2bau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b9y2b9ylb90peor.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b9y2b9ylb90peor.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2bau(){try{__CLR4_4_12b9y2b9ylb90peor.R.inc(107958);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107959);VectorialCovariance stat = new VectorialCovariance(points[0].length, true);
        __CLR4_4_12b9y2b9ylb90peor.R.inc(107960);Assert.assertEquals(stat, TestUtils.serializeAndRecover(stat));
    }finally{__CLR4_4_12b9y2b9ylb90peor.R.flushNeeded();}}
}
