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

import org.junit.Test;
import org.junit.Assert;

public class VectorialMeanTest {static class __CLR4_4_12bax2baxlb90peou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double[][] points;

    public VectorialMeanTest() {try{__CLR4_4_12bax2baxlb90peou.R.inc(107961);
        __CLR4_4_12bax2baxlb90peou.R.inc(107962);points = new double[][] {
            { 1.2, 2.3,  4.5},
            {-0.7, 2.3,  5.0},
            { 3.1, 0.0, -3.1},
            { 6.0, 1.2,  4.2},
            {-0.7, 2.3,  5.0}
        };
    }finally{__CLR4_4_12bax2baxlb90peou.R.flushNeeded();}}

    @Test
    public void testMismatch() {__CLR4_4_12bax2baxlb90peou.R.globalSliceStart(getClass().getName(),107963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pp7tbt2baz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bax2baxlb90peou.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bax2baxlb90peou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest.testMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pp7tbt2baz(){try{__CLR4_4_12bax2baxlb90peou.R.inc(107963);
        __CLR4_4_12bax2baxlb90peou.R.inc(107964);try {
            __CLR4_4_12bax2baxlb90peou.R.inc(107965);new VectorialMean(8).increment(new double[5]);
            __CLR4_4_12bax2baxlb90peou.R.inc(107966);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException dme) {
            __CLR4_4_12bax2baxlb90peou.R.inc(107967);Assert.assertEquals(5, dme.getArgument());
            __CLR4_4_12bax2baxlb90peou.R.inc(107968);Assert.assertEquals(8, dme.getDimension());
        }
    }finally{__CLR4_4_12bax2baxlb90peou.R.flushNeeded();}}

    @Test
    public void testSimplistic() {__CLR4_4_12bax2baxlb90peou.R.globalSliceStart(getClass().getName(),107969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci8r1y2bb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bax2baxlb90peou.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bax2baxlb90peou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest.testSimplistic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci8r1y2bb5(){try{__CLR4_4_12bax2baxlb90peou.R.inc(107969);
        __CLR4_4_12bax2baxlb90peou.R.inc(107970);VectorialMean stat = new VectorialMean(2);
        __CLR4_4_12bax2baxlb90peou.R.inc(107971);stat.increment(new double[] {-1.0,  1.0});
        __CLR4_4_12bax2baxlb90peou.R.inc(107972);stat.increment(new double[] { 1.0, -1.0});
        __CLR4_4_12bax2baxlb90peou.R.inc(107973);double[] mean = stat.getResult();
        __CLR4_4_12bax2baxlb90peou.R.inc(107974);Assert.assertEquals(0.0, mean[0], 1.0e-12);
        __CLR4_4_12bax2baxlb90peou.R.inc(107975);Assert.assertEquals(0.0, mean[1], 1.0e-12);
    }finally{__CLR4_4_12bax2baxlb90peou.R.flushNeeded();}}

    @Test
    public void testBasicStats() {__CLR4_4_12bax2baxlb90peou.R.globalSliceStart(getClass().getName(),107976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl2cru2bbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bax2baxlb90peou.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bax2baxlb90peou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest.testBasicStats",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl2cru2bbc(){try{__CLR4_4_12bax2baxlb90peou.R.inc(107976);

        __CLR4_4_12bax2baxlb90peou.R.inc(107977);VectorialMean stat = new VectorialMean(points[0].length);
        __CLR4_4_12bax2baxlb90peou.R.inc(107978);for (int i = 0; (((i < points.length)&&(__CLR4_4_12bax2baxlb90peou.R.iget(107979)!=0|true))||(__CLR4_4_12bax2baxlb90peou.R.iget(107980)==0&false)); ++i) {{
            __CLR4_4_12bax2baxlb90peou.R.inc(107981);stat.increment(points[i]);
        }

        }__CLR4_4_12bax2baxlb90peou.R.inc(107982);Assert.assertEquals(points.length, stat.getN());

        __CLR4_4_12bax2baxlb90peou.R.inc(107983);double[] mean = stat.getResult();
        __CLR4_4_12bax2baxlb90peou.R.inc(107984);double[]   refMean = new double[] { 1.78, 1.62,  3.12};

        __CLR4_4_12bax2baxlb90peou.R.inc(107985);for (int i = 0; (((i < mean.length)&&(__CLR4_4_12bax2baxlb90peou.R.iget(107986)!=0|true))||(__CLR4_4_12bax2baxlb90peou.R.iget(107987)==0&false)); ++i) {{
            __CLR4_4_12bax2baxlb90peou.R.inc(107988);Assert.assertEquals(refMean[i], mean[i], 1.0e-12);
        }

    }}finally{__CLR4_4_12bax2baxlb90peou.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_12bax2baxlb90peou.R.globalSliceStart(getClass().getName(),107989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2bbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bax2baxlb90peou.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bax2baxlb90peou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2bbp(){try{__CLR4_4_12bax2baxlb90peou.R.inc(107989);
        __CLR4_4_12bax2baxlb90peou.R.inc(107990);VectorialMean stat = new VectorialMean(points[0].length);
        __CLR4_4_12bax2baxlb90peou.R.inc(107991);for (int i = 0; (((i < points.length)&&(__CLR4_4_12bax2baxlb90peou.R.iget(107992)!=0|true))||(__CLR4_4_12bax2baxlb90peou.R.iget(107993)==0&false)); ++i) {{
            __CLR4_4_12bax2baxlb90peou.R.inc(107994);stat.increment(points[i]);
        }
        }__CLR4_4_12bax2baxlb90peou.R.inc(107995);Assert.assertEquals(stat, TestUtils.serializeAndRecover(stat));
    }finally{__CLR4_4_12bax2baxlb90peou.R.flushNeeded();}}
}
