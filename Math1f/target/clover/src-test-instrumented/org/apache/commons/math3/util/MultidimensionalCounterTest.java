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

package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class MultidimensionalCounterTest {static class __CLR4_4_12gpi2gpilb90pf5s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,115043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testPreconditions() {__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceStart(getClass().getName(),114966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k02gpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gpi2gpilb90pf5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MultidimensionalCounterTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k02gpi(){try{__CLR4_4_12gpi2gpilb90pf5s.R.inc(114966);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114967);MultidimensionalCounter c;

        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114968);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114969);c = new MultidimensionalCounter(0, 1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114970);Assert.fail("NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114971);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114972);c = new MultidimensionalCounter(2, 0);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114973);Assert.fail("NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114974);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114975);c = new MultidimensionalCounter(-1, 1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114976);Assert.fail("NotStrictlyPositiveException expected");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }

        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114977);c = new MultidimensionalCounter(2, 3);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114978);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114979);c.getCount(1, 1, 1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114980);Assert.fail("DimensionMismatchException expected");
        } catch (DimensionMismatchException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114981);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114982);c.getCount(3, 1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114983);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114984);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114985);c.getCount(0, -1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114986);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114987);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114988);c.getCounts(-1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114989);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114990);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114991);c.getCounts(6);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114992);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException e) {
            // Expected.
        }
    }finally{__CLR4_4_12gpi2gpilb90pf5s.R.flushNeeded();}}

    @Test
    public void testIteratorPreconditions() {__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceStart(getClass().getName(),114993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d63qde2gq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gpi2gpilb90pf5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MultidimensionalCounterTest.testIteratorPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d63qde2gq9(){try{__CLR4_4_12gpi2gpilb90pf5s.R.inc(114993);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114994);MultidimensionalCounter.Iterator iter = (new MultidimensionalCounter(2, 3)).iterator();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114995);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114996);iter.getCount(-1);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114997);Assert.fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
            // Expected.
        }
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(114998);try {
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(114999);iter.getCount(2);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115000);Assert.fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
            // Expected.
        }
    }finally{__CLR4_4_12gpi2gpilb90pf5s.R.flushNeeded();}}

    @Test
    public void testMulti2UniConversion() {__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceStart(getClass().getName(),115001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdkrr62gqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gpi2gpilb90pf5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MultidimensionalCounterTest.testMulti2UniConversion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdkrr62gqh(){try{__CLR4_4_12gpi2gpilb90pf5s.R.inc(115001);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115002);final MultidimensionalCounter c = new MultidimensionalCounter(2, 4, 5);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115003);Assert.assertEquals(c.getCount(1, 2, 3), 33);
    }finally{__CLR4_4_12gpi2gpilb90pf5s.R.flushNeeded();}}

    @Test
    public void testAccessors() {__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceStart(getClass().getName(),115004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hde3s12gqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gpi2gpilb90pf5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MultidimensionalCounterTest.testAccessors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hde3s12gqk(){try{__CLR4_4_12gpi2gpilb90pf5s.R.inc(115004);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115005);final int[] originalSize = new int[] {2, 6, 5};
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115006);final MultidimensionalCounter c = new MultidimensionalCounter(originalSize);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115007);final int nDim = c.getDimension();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115008);Assert.assertEquals(nDim, originalSize.length);

        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115009);final int[] size = c.getSizes();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115010);for (int i = 0; (((i < nDim)&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115011)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115012)==0&false)); i++) {{
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115013);Assert.assertEquals(originalSize[i], size[i]);
        }
    }}finally{__CLR4_4_12gpi2gpilb90pf5s.R.flushNeeded();}}

    @Test
    public void testIterationConsistency() {__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceStart(getClass().getName(),115014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0ctrg2gqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gpi2gpilb90pf5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gpi2gpilb90pf5s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MultidimensionalCounterTest.testIterationConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0ctrg2gqu(){try{__CLR4_4_12gpi2gpilb90pf5s.R.inc(115014);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115015);final MultidimensionalCounter c = new MultidimensionalCounter(2, 3, 4);
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115016);final int[][] expected = new int[][] {
            { 0, 0, 0 },
            { 0, 0, 1 },
            { 0, 0, 2 },
            { 0, 0, 3 },
            { 0, 1, 0 },
            { 0, 1, 1 },
            { 0, 1, 2 },
            { 0, 1, 3 },
            { 0, 2, 0 },
            { 0, 2, 1 },
            { 0, 2, 2 },
            { 0, 2, 3 },
            { 1, 0, 0 },
            { 1, 0, 1 },
            { 1, 0, 2 },
            { 1, 0, 3 },
            { 1, 1, 0 },
            { 1, 1, 1 },
            { 1, 1, 2 },
            { 1, 1, 3 },
            { 1, 2, 0 },
            { 1, 2, 1 },
            { 1, 2, 2 },
            { 1, 2, 3 }
        };

        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115017);final int totalSize = c.getSize();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115018);final int nDim = c.getDimension();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115019);final MultidimensionalCounter.Iterator iter = c.iterator();
        __CLR4_4_12gpi2gpilb90pf5s.R.inc(115020);for (int i = 0; (((i < totalSize)&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115021)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115022)==0&false)); i++) {{
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115023);if ((((!iter.hasNext())&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115024)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115025)==0&false))) {{
                __CLR4_4_12gpi2gpilb90pf5s.R.inc(115026);Assert.fail("Too short");
            }
            }__CLR4_4_12gpi2gpilb90pf5s.R.inc(115027);final int uniDimIndex = iter.next().intValue();
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115028);Assert.assertEquals("Wrong iteration at " + i, i, uniDimIndex);

            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115029);for (int dimIndex = 0; (((dimIndex < nDim)&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115030)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115031)==0&false)); dimIndex++) {{
                __CLR4_4_12gpi2gpilb90pf5s.R.inc(115032);Assert.assertEquals("Wrong multidimensional index for [" + i + "][" + dimIndex + "]",
                                    expected[i][dimIndex], iter.getCount(dimIndex));
            }

            }__CLR4_4_12gpi2gpilb90pf5s.R.inc(115033);Assert.assertEquals("Wrong unidimensional index for [" + i + "]",
                                c.getCount(expected[i]), uniDimIndex);

            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115034);final int[] indices = c.getCounts(uniDimIndex);
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115035);for (int dimIndex = 0; (((dimIndex < nDim)&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115036)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115037)==0&false)); dimIndex++) {{
                __CLR4_4_12gpi2gpilb90pf5s.R.inc(115038);Assert.assertEquals("Wrong multidimensional index for [" + i + "][" + dimIndex + "]",
                                    expected[i][dimIndex], indices[dimIndex]);
            }
        }}

        }__CLR4_4_12gpi2gpilb90pf5s.R.inc(115039);if ((((iter.hasNext())&&(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115040)!=0|true))||(__CLR4_4_12gpi2gpilb90pf5s.R.iget(115041)==0&false))) {{
            __CLR4_4_12gpi2gpilb90pf5s.R.inc(115042);Assert.fail("Too long");
        }
    }}finally{__CLR4_4_12gpi2gpilb90pf5s.R.flushNeeded();}}
}
