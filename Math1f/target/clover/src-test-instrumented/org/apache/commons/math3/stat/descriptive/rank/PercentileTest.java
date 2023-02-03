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
package org.apache.commons.math3.stat.descriptive.rank;

import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.UnivariateStatisticAbstractTest;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link UnivariateStatistic} class.
 * @version $Id$
 */
public class PercentileTest extends UnivariateStatisticAbstractTest{static class __CLR4_4_12bdc2bdclb90pep4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Percentile stat;

    /**
     * {@inheritDoc}
     */
    @Override
    public UnivariateStatistic getUnivariateStatistic() {try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108048);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108049);return new Percentile(95.0);
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public double expectedValue() {try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108050);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108051);return this.percentile95;
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testHighPercentile(){__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e414x42bdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testHighPercentile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e414x42bdg(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108052);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108053);double[] d = new double[]{1, 2, 3};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108054);Percentile p = new Percentile(75);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108055);Assert.assertEquals(3.0, p.evaluate(d), 1.0e-5);
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}
    
    @Test
    public void testLowPercentile() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scbmp22bdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testLowPercentile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scbmp22bdk(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108056);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108057);double[] d = new double[] {0, 1};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108058);Percentile p = new Percentile(25);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108059);Assert.assertEquals(0d, p.evaluate(d), Double.MIN_VALUE);
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testPercentile() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11po5ka2bdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testPercentile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11po5ka2bdo(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108060);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108061);double[] d = new double[] {1, 3, 2, 4};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108062);Percentile p = new Percentile(30);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108063);Assert.assertEquals(1.5, p.evaluate(d), 1.0e-5);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108064);p.setQuantile(25);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108065);Assert.assertEquals(1.25, p.evaluate(d), 1.0e-5);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108066);p.setQuantile(75);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108067);Assert.assertEquals(3.75, p.evaluate(d), 1.0e-5);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108068);p.setQuantile(50);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108069);Assert.assertEquals(2.5, p.evaluate(d), 1.0e-5);

        // invalid percentiles
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108070);try {
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108071);p.evaluate(d, 0, d.length, -1.0);
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108072);Assert.fail();
        } catch (MathIllegalArgumentException ex) {
            // success
        }
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108073);try {
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108074);p.evaluate(d, 0, d.length, 101.0);
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108075);Assert.fail();
        } catch (MathIllegalArgumentException ex) {
            // success
        }
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testNISTExample() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vp4w4d2be4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testNISTExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vp4w4d2be4(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108076);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108077);double[] d = new double[] {95.1772, 95.1567, 95.1937, 95.1959,
                95.1442, 95.0610,  95.1591, 95.1195, 95.1772, 95.0925, 95.1990, 95.1682
        };
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108078);Percentile p = new Percentile(90);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108079);Assert.assertEquals(95.1981, p.evaluate(d), 1.0e-4);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108080);Assert.assertEquals(95.1990, p.evaluate(d,0,d.length, 100d), 0);
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void test5() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kq2be9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kq2be9(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108081);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108082);Percentile percentile = new Percentile(5);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108083);Assert.assertEquals(this.percentile5, percentile.evaluate(testArray), getTolerance());
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testNullEmpty() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wp6pgb2bec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testNullEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wp6pgb2bec(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108084);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108085);Percentile percentile = new Percentile(50);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108086);double[] nullArray = null;
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108087);double[] emptyArray = new double[] {};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108088);try {
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108089);percentile.evaluate(nullArray);
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108090);Assert.fail("Expecting MathIllegalArgumentException for null array");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108091);Assert.assertTrue(Double.isNaN(percentile.evaluate(emptyArray)));
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testSingleton() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk2bek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk2bek(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108092);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108093);Percentile percentile = new Percentile(50);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108094);double[] singletonArray = new double[] {1d};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108095);Assert.assertEquals(1d, percentile.evaluate(singletonArray), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108096);Assert.assertEquals(1d, percentile.evaluate(singletonArray, 0, 1), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108097);Assert.assertEquals(1d, percentile.evaluate(singletonArray, 0, 1, 5), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108098);Assert.assertEquals(1d, percentile.evaluate(singletonArray, 0, 1, 100), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108099);Assert.assertTrue(Double.isNaN(percentile.evaluate(singletonArray, 0, 0)));
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testSpecialValues() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8kumo2bes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testSpecialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8kumo2bes(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108100);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108101);Percentile percentile = new Percentile(50);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108102);double[] specialValues = new double[] {0d, 1d, 2d, 3d, 4d,  Double.NaN};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108103);Assert.assertEquals(2.5d, percentile.evaluate(specialValues), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108104);specialValues =  new double[] {Double.NEGATIVE_INFINITY, 1d, 2d, 3d,
                Double.NaN, Double.POSITIVE_INFINITY};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108105);Assert.assertEquals(2.5d, percentile.evaluate(specialValues), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108106);specialValues = new double[] {1d, 1d, Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108107);Assert.assertTrue(Double.isInfinite(percentile.evaluate(specialValues)));
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108108);specialValues = new double[] {1d, 1d, Double.NaN,
                Double.NaN};
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108109);Assert.assertTrue(Double.isNaN(percentile.evaluate(specialValues)));
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108110);specialValues = new double[] {1d, 1d, Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        // Interpolation results in NEGATIVE_INFINITY + POSITIVE_INFINITY
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108111);Assert.assertTrue(Double.isNaN(percentile.evaluate(specialValues)));
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

    @Test
    public void testSetQuantile() {__CLR4_4_12bdc2bdclb90pep4.R.globalSliceStart(getClass().getName(),108112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ute9i2bf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12bdc2bdclb90pep4.R.rethrow($CLV_t2$);}finally{__CLR4_4_12bdc2bdclb90pep4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.rank.PercentileTest.testSetQuantile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ute9i2bf4(){try{__CLR4_4_12bdc2bdclb90pep4.R.inc(108112);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108113);Percentile percentile = new Percentile(10);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108114);percentile.setQuantile(100); // OK
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108115);Assert.assertEquals(100, percentile.getQuantile(), 0);
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108116);try {
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108117);percentile.setQuantile(0);
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108118);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12bdc2bdclb90pep4.R.inc(108119);try {
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108120);new Percentile(0);
            __CLR4_4_12bdc2bdclb90pep4.R.inc(108121);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12bdc2bdclb90pep4.R.flushNeeded();}}

}
