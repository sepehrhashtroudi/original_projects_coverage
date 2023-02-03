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
package org.apache.commons.math3.stat.correlation;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Spearman's rank correlation
 *
 * @since 2.0
 * @version $Id$
 */
public class SpearmansRankCorrelationTest extends PearsonsCorrelationTest {static class __CLR4_4_12a092a09lb90pel9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test Longley dataset against R.
     */
    @Override
    @Test
    public void testLongly() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjv2zi2a09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testLongly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjv2zi2a09(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106281);
        __CLR4_4_12a092a09lb90pel9.R.inc(106282);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_12a092a09lb90pel9.R.inc(106283);SpearmansCorrelation corrInstance = new SpearmansCorrelation(matrix);
        __CLR4_4_12a092a09lb90pel9.R.inc(106284);RealMatrix correlationMatrix = corrInstance.getCorrelationMatrix();
        __CLR4_4_12a092a09lb90pel9.R.inc(106285);double[] rData = new double[] {
                1, 0.982352941176471, 0.985294117647059, 0.564705882352941, 0.2264705882352941, 0.976470588235294,
                0.976470588235294, 0.982352941176471, 1, 0.997058823529412, 0.664705882352941, 0.2205882352941176,
                0.997058823529412, 0.997058823529412, 0.985294117647059, 0.997058823529412, 1, 0.638235294117647,
                0.2235294117647059, 0.9941176470588236, 0.9941176470588236, 0.564705882352941, 0.664705882352941,
                0.638235294117647, 1, -0.3411764705882353, 0.685294117647059, 0.685294117647059, 0.2264705882352941,
                0.2205882352941176, 0.2235294117647059, -0.3411764705882353, 1, 0.2264705882352941, 0.2264705882352941,
                0.976470588235294, 0.997058823529412, 0.9941176470588236, 0.685294117647059, 0.2264705882352941, 1, 1,
                0.976470588235294, 0.997058823529412, 0.9941176470588236, 0.685294117647059, 0.2264705882352941, 1, 1
        };
        __CLR4_4_12a092a09lb90pel9.R.inc(106286);TestUtils.assertEquals("Spearman's correlation matrix", createRealMatrix(rData, 7, 7), correlationMatrix, 10E-15);
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    /**
     * Test R swiss fertility dataset.
     */
    @Test
    public void testSwiss() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3cmca2a0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testSwiss",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3cmca2a0f(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106287);
        __CLR4_4_12a092a09lb90pel9.R.inc(106288);RealMatrix matrix = createRealMatrix(swissData, 47, 5);
        __CLR4_4_12a092a09lb90pel9.R.inc(106289);SpearmansCorrelation corrInstance = new SpearmansCorrelation(matrix);
        __CLR4_4_12a092a09lb90pel9.R.inc(106290);RealMatrix correlationMatrix = corrInstance.getCorrelationMatrix();
        __CLR4_4_12a092a09lb90pel9.R.inc(106291);double[] rData = new double[] {
                1, 0.2426642769364176, -0.660902996352354, -0.443257690360988, 0.4136455623012432,
                0.2426642769364176, 1, -0.598859938748963, -0.650463814145816, 0.2886878090882852,
               -0.660902996352354, -0.598859938748963, 1, 0.674603831406147, -0.4750575257171745,
               -0.443257690360988, -0.650463814145816, 0.674603831406147, 1, -0.1444163088302244,
                0.4136455623012432, 0.2886878090882852, -0.4750575257171745, -0.1444163088302244, 1
        };
        __CLR4_4_12a092a09lb90pel9.R.inc(106292);TestUtils.assertEquals("Spearman's correlation matrix", createRealMatrix(rData, 5, 5), correlationMatrix, 10E-15);
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    /**
     * Constant column
     */
    @Override
    @Test
    public void testConstant() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v2a0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v2a0l(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106293);
        __CLR4_4_12a092a09lb90pel9.R.inc(106294);double[] noVariance = new double[] {1, 1, 1, 1};
        __CLR4_4_12a092a09lb90pel9.R.inc(106295);double[] values = new double[] {1, 2, 3, 4};
        __CLR4_4_12a092a09lb90pel9.R.inc(106296);Assert.assertTrue(Double.isNaN(new SpearmansCorrelation().correlation(noVariance, values)));
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    /**
     * Insufficient data
     */
    @Override
    @Test
    public void testInsufficientData() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xyn3a2a0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testInsufficientData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xyn3a2a0p(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106297);
        __CLR4_4_12a092a09lb90pel9.R.inc(106298);double[] one = new double[] {1};
        __CLR4_4_12a092a09lb90pel9.R.inc(106299);double[] two = new double[] {2};
        __CLR4_4_12a092a09lb90pel9.R.inc(106300);try {
            __CLR4_4_12a092a09lb90pel9.R.inc(106301);new SpearmansCorrelation().correlation(one, two);
            __CLR4_4_12a092a09lb90pel9.R.inc(106302);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_12a092a09lb90pel9.R.inc(106303);RealMatrix matrix = new BlockRealMatrix(new double[][] {{0},{1}});
        __CLR4_4_12a092a09lb90pel9.R.inc(106304);try {
            __CLR4_4_12a092a09lb90pel9.R.inc(106305);new SpearmansCorrelation(matrix);
            __CLR4_4_12a092a09lb90pel9.R.inc(106306);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    @Override
    @Test
    public void testConsistency() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tafanh2a0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tafanh2a0z(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106307);
        __CLR4_4_12a092a09lb90pel9.R.inc(106308);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_12a092a09lb90pel9.R.inc(106309);SpearmansCorrelation corrInstance = new SpearmansCorrelation(matrix);
        __CLR4_4_12a092a09lb90pel9.R.inc(106310);double[][] data = matrix.getData();
        __CLR4_4_12a092a09lb90pel9.R.inc(106311);double[] x = matrix.getColumn(0);
        __CLR4_4_12a092a09lb90pel9.R.inc(106312);double[] y = matrix.getColumn(1);
        __CLR4_4_12a092a09lb90pel9.R.inc(106313);Assert.assertEquals(new SpearmansCorrelation().correlation(x, y),
                corrInstance.getCorrelationMatrix().getEntry(0, 1), Double.MIN_VALUE);
        __CLR4_4_12a092a09lb90pel9.R.inc(106314);TestUtils.assertEquals("Correlation matrix", corrInstance.getCorrelationMatrix(),
                new SpearmansCorrelation().computeCorrelationMatrix(data), Double.MIN_VALUE);
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    @Test
    public void testMath891Array() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xkgp62a17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testMath891Array",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xkgp62a17(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106315);
        __CLR4_4_12a092a09lb90pel9.R.inc(106316);final double[] xArray = new double[] { Double.NaN, 1.9, 2, 100, 3 };
        __CLR4_4_12a092a09lb90pel9.R.inc(106317);final double[] yArray = new double[] { 10, 2, 10, Double.NaN, 4 };

        __CLR4_4_12a092a09lb90pel9.R.inc(106318);NaturalRanking ranking = new NaturalRanking(NaNStrategy.REMOVED);
        __CLR4_4_12a092a09lb90pel9.R.inc(106319);SpearmansCorrelation spearman = new SpearmansCorrelation(ranking);
        
        __CLR4_4_12a092a09lb90pel9.R.inc(106320);Assert.assertEquals(0.5, spearman.correlation(xArray, yArray), Double.MIN_VALUE);
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    @Test
    public void testMath891Matrix() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dykwki2a1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testMath891Matrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dykwki2a1d(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106321);
        __CLR4_4_12a092a09lb90pel9.R.inc(106322);final double[] xArray = new double[] { Double.NaN, 1.9, 2, 100, 3 };
        __CLR4_4_12a092a09lb90pel9.R.inc(106323);final double[] yArray = new double[] { 10, 2, 10, Double.NaN, 4 };

        __CLR4_4_12a092a09lb90pel9.R.inc(106324);RealMatrix matrix = MatrixUtils.createRealMatrix(xArray.length, 2);
        __CLR4_4_12a092a09lb90pel9.R.inc(106325);for (int i = 0; (((i < xArray.length)&&(__CLR4_4_12a092a09lb90pel9.R.iget(106326)!=0|true))||(__CLR4_4_12a092a09lb90pel9.R.iget(106327)==0&false)); i++) {{
            __CLR4_4_12a092a09lb90pel9.R.inc(106328);matrix.addToEntry(i, 0, xArray[i]);
            __CLR4_4_12a092a09lb90pel9.R.inc(106329);matrix.addToEntry(i, 1, yArray[i]);
        }

        // compute correlation
        }__CLR4_4_12a092a09lb90pel9.R.inc(106330);NaturalRanking ranking = new NaturalRanking(NaNStrategy.REMOVED);
        __CLR4_4_12a092a09lb90pel9.R.inc(106331);SpearmansCorrelation spearman = new SpearmansCorrelation(matrix, ranking);
        
        __CLR4_4_12a092a09lb90pel9.R.inc(106332);Assert.assertEquals(0.5, spearman.getCorrelationMatrix().getEntry(0, 1), Double.MIN_VALUE);
    }finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

    // Not relevant here
    @Override
    @Test
    public void testStdErrorConsistency() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unagrs2a1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testStdErrorConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unagrs2a1p(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106333);}finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}
    @Override
    @Test
    public void testCovarianceConsistency() {__CLR4_4_12a092a09lb90pel9.R.globalSliceStart(getClass().getName(),106334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dudh742a1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a092a09lb90pel9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a092a09lb90pel9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest.testCovarianceConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dudh742a1q(){try{__CLR4_4_12a092a09lb90pel9.R.inc(106334);}finally{__CLR4_4_12a092a09lb90pel9.R.flushNeeded();}}

}
