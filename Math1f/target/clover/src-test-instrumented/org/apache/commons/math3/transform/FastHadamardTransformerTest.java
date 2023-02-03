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
package org.apache.commons.math3.transform;

import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;


/**
 * JUnit Test for HadamardTransformerTest
 * @see org.apache.commons.math3.transform.FastHadamardTransformer
 */
public final class FastHadamardTransformerTest {static class __CLR4_4_12dpi2dpilb90peub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of transformer for the a 8-point FHT (means n=8)
     */
    @Test
    public void test8Points() {__CLR4_4_12dpi2dpilb90peub.R.globalSliceStart(getClass().getName(),111078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpgbxs2dpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dpi2dpilb90peub.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dpi2dpilb90peub.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastHadamardTransformerTest.test8Points",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpgbxs2dpi(){try{__CLR4_4_12dpi2dpilb90peub.R.inc(111078);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111079);checkAllTransforms(new int[] { 1, 4, -2, 3, 0, 1, 4, -1 },
                       new int[] { 10, -4, 2, -4, 2, -12, 6, 8 });
    }finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    /**
     * Test of transformer for the a 4-points FHT (means n=4)
     */
    @Test
    public void test4Points() {__CLR4_4_12dpi2dpilb90peub.R.globalSliceStart(getClass().getName(),111080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jtn9o2dpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dpi2dpilb90peub.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dpi2dpilb90peub.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastHadamardTransformerTest.test4Points",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jtn9o2dpk(){try{__CLR4_4_12dpi2dpilb90peub.R.inc(111080);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111081);checkAllTransforms(new int[] { 1, 2, 3, 4 },
                           new int[] { 10, -2, -4, 0 });
    }finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    /**
     * Test the inverse transform of an integer vector is not always an integer vector
     */
    @Test
    public void testNoIntInverse() {__CLR4_4_12dpi2dpilb90peub.R.globalSliceStart(getClass().getName(),111082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6fr8l2dpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dpi2dpilb90peub.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dpi2dpilb90peub.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastHadamardTransformerTest.testNoIntInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6fr8l2dpm(){try{__CLR4_4_12dpi2dpilb90peub.R.inc(111082);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111083);FastHadamardTransformer transformer = new FastHadamardTransformer();
        __CLR4_4_12dpi2dpilb90peub.R.inc(111084);double[] x = transformer.transform(new double[] { 0, 1, 0, 1}, TransformType.INVERSE);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111085);Assert.assertEquals( 0.5, x[0], 0);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111086);Assert.assertEquals(-0.5, x[1], 0);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111087);Assert.assertEquals( 0.0, x[2], 0);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111088);Assert.assertEquals( 0.0, x[3], 0);
    }finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    /**
     * Test of transformer for wrong number of points
     */
    @Test
    public void test3Points() {__CLR4_4_12dpi2dpilb90peub.R.globalSliceStart(getClass().getName(),111089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13w4vf92dpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dpi2dpilb90peub.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dpi2dpilb90peub.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastHadamardTransformerTest.test3Points",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13w4vf92dpt(){try{__CLR4_4_12dpi2dpilb90peub.R.inc(111089);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111090);try {
            __CLR4_4_12dpi2dpilb90peub.R.inc(111091);new FastHadamardTransformer().transform(new double[3], TransformType.FORWARD);
            __CLR4_4_12dpi2dpilb90peub.R.inc(111092);Assert.fail("an exception should have been thrown");
        } catch (IllegalArgumentException iae) {
            // expected
        }
    }finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    private void checkAllTransforms(int[]x, int[] y) {try{__CLR4_4_12dpi2dpilb90peub.R.inc(111093);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111094);checkDoubleTransform(x, y);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111095);checkInverseDoubleTransform(x, y);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111096);checkIntTransform(x, y);
    }finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    private void checkDoubleTransform(int[]x, int[] y) {try{__CLR4_4_12dpi2dpilb90peub.R.inc(111097);
        // Initiate the transformer
        __CLR4_4_12dpi2dpilb90peub.R.inc(111098);FastHadamardTransformer transformer = new FastHadamardTransformer();

        // check double transform
        __CLR4_4_12dpi2dpilb90peub.R.inc(111099);double[] dX = new double[x.length];
        __CLR4_4_12dpi2dpilb90peub.R.inc(111100);for (int i = 0; (((i < dX.length)&&(__CLR4_4_12dpi2dpilb90peub.R.iget(111101)!=0|true))||(__CLR4_4_12dpi2dpilb90peub.R.iget(111102)==0&false)); ++i) {{
            __CLR4_4_12dpi2dpilb90peub.R.inc(111103);dX[i] = x[i];
        }
        }__CLR4_4_12dpi2dpilb90peub.R.inc(111104);double dResult[] = transformer.transform(dX, TransformType.FORWARD);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111105);for (int i = 0; (((i < dResult.length)&&(__CLR4_4_12dpi2dpilb90peub.R.iget(111106)!=0|true))||(__CLR4_4_12dpi2dpilb90peub.R.iget(111107)==0&false)); i++) {{
            // compare computed results to precomputed results
            __CLR4_4_12dpi2dpilb90peub.R.inc(111108);Assert.assertTrue(Precision.equals(y[i], dResult[i], 1));
        }
    }}finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    private void checkIntTransform(int[]x, int[] y) {try{__CLR4_4_12dpi2dpilb90peub.R.inc(111109);
        // Initiate the transformer
        __CLR4_4_12dpi2dpilb90peub.R.inc(111110);FastHadamardTransformer transformer = new FastHadamardTransformer();

        // check integer transform
        __CLR4_4_12dpi2dpilb90peub.R.inc(111111);int iResult[] = transformer.transform(x);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111112);for (int i = 0; (((i < iResult.length)&&(__CLR4_4_12dpi2dpilb90peub.R.iget(111113)!=0|true))||(__CLR4_4_12dpi2dpilb90peub.R.iget(111114)==0&false)); i++) {{
            // compare computed results to precomputed results
            __CLR4_4_12dpi2dpilb90peub.R.inc(111115);Assert.assertEquals(y[i], iResult[i]);
        }

    }}finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

    private void checkInverseDoubleTransform(int[]x, int[] y) {try{__CLR4_4_12dpi2dpilb90peub.R.inc(111116);
        // Initiate the transformer
        __CLR4_4_12dpi2dpilb90peub.R.inc(111117);FastHadamardTransformer transformer = new FastHadamardTransformer();

        // check double transform
        __CLR4_4_12dpi2dpilb90peub.R.inc(111118);double[] dY = new double[y.length];
        __CLR4_4_12dpi2dpilb90peub.R.inc(111119);for (int i = 0; (((i < dY.length)&&(__CLR4_4_12dpi2dpilb90peub.R.iget(111120)!=0|true))||(__CLR4_4_12dpi2dpilb90peub.R.iget(111121)==0&false)); ++i) {{
            __CLR4_4_12dpi2dpilb90peub.R.inc(111122);dY[i] = y[i];
        }
        }__CLR4_4_12dpi2dpilb90peub.R.inc(111123);double dResult[] = transformer.transform(dY, TransformType.INVERSE);
        __CLR4_4_12dpi2dpilb90peub.R.inc(111124);for (int i = 0; (((i < dResult.length)&&(__CLR4_4_12dpi2dpilb90peub.R.iget(111125)!=0|true))||(__CLR4_4_12dpi2dpilb90peub.R.iget(111126)==0&false)); i++) {{
            // compare computed results to precomputed results
            __CLR4_4_12dpi2dpilb90peub.R.inc(111127);Assert.assertTrue(Precision.equals(x[i], dResult[i], 1));
        }

    }}finally{__CLR4_4_12dpi2dpilb90peub.R.flushNeeded();}}

}
