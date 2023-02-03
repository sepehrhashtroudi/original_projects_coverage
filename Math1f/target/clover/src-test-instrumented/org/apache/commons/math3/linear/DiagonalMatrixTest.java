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

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link DiagonalMatrix} class.
 */
public class DiagonalMatrixTest {static class __CLR4_4_11tcu1tculb90pd48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,84928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testConstructor1() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7k1tcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7k1tcu(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84702);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84703);final int dim = 3;
        __CLR4_4_11tcu1tculb90pd48.R.inc(84704);final DiagonalMatrix m = new DiagonalMatrix(dim);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84705);Assert.assertEquals(dim, m.getRowDimension());
        __CLR4_4_11tcu1tculb90pd48.R.inc(84706);Assert.assertEquals(dim, m.getColumnDimension());
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testConstructor2() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn011tcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn011tcz(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84707);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84708);final double[] d = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84709);final DiagonalMatrix m = new DiagonalMatrix(d);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84710);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84711)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84712)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84713);for (int j = 0; (((j < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84714)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84715)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84716);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84717)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84718)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84719);Assert.assertEquals(d[i], m.getEntry(i, j), 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84720);Assert.assertEquals(0d, m.getEntry(i, j), 0d);
                }
            }}
        }}

        // Check that the underlying was copied.
        }__CLR4_4_11tcu1tculb90pd48.R.inc(84721);d[0] = 0;
        __CLR4_4_11tcu1tculb90pd48.R.inc(84722);Assert.assertFalse(d[0] == m.getEntry(0, 0));
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testConstructor3() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0blsi1tdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testConstructor3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0blsi1tdf(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84723);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84724);final double[] d = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84725);final DiagonalMatrix m = new DiagonalMatrix(d, false);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84726);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84727)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84728)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84729);for (int j = 0; (((j < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84730)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84731)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84732);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84733)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84734)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84735);Assert.assertEquals(d[i], m.getEntry(i, j), 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84736);Assert.assertEquals(0d, m.getEntry(i, j), 0d);
                }
            }}
        }}

        // Check that the underlying is referenced.
        }__CLR4_4_11tcu1tculb90pd48.R.inc(84737);d[0] = 0;
        __CLR4_4_11tcu1tculb90pd48.R.inc(84738);Assert.assertTrue(d[0] == m.getEntry(0, 0));

    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testCreateError() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibshvj1tdv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,69,114,114,111,114,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testCreateError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibshvj1tdv(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84739);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84740);final double[] d = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84741);final DiagonalMatrix m = new DiagonalMatrix(d, false);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84742);m.createMatrix(5, 3);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testCreate() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nf4c51tdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testCreate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nf4c51tdz(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84743);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84744);final double[] d = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84745);final DiagonalMatrix m = new DiagonalMatrix(d, false);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84746);final RealMatrix p = m.createMatrix(5, 5);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84747);Assert.assertTrue(p instanceof DiagonalMatrix);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84748);Assert.assertEquals(5, p.getRowDimension());
        __CLR4_4_11tcu1tculb90pd48.R.inc(84749);Assert.assertEquals(5, p.getColumnDimension());
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a1te6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a1te6(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84750);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84751);final double[] d = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84752);final DiagonalMatrix m = new DiagonalMatrix(d, false);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84753);final DiagonalMatrix p = (DiagonalMatrix) m.copy();
        __CLR4_4_11tcu1tculb90pd48.R.inc(84754);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84755)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84756)==0&false)); ++i) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84757);Assert.assertEquals(m.getEntry(i, i), p.getEntry(i, i), 1.0e-20);
        }
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testGetData() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv4eob1tee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testGetData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv4eob1tee(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84758);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84759);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84760);final int dim = 3;
        __CLR4_4_11tcu1tculb90pd48.R.inc(84761);final DiagonalMatrix m = new DiagonalMatrix(dim);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84762);for (int i = 0; (((i < dim)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84763)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84764)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84765);m.setEntry(i, i, data[i]);
        }

        }__CLR4_4_11tcu1tculb90pd48.R.inc(84766);final double[][] out = m.getData();
        __CLR4_4_11tcu1tculb90pd48.R.inc(84767);Assert.assertEquals(dim, out.length);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84768);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84769)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84770)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84771);Assert.assertEquals(dim, out[i].length);
            __CLR4_4_11tcu1tculb90pd48.R.inc(84772);for (int j = 0; (((j < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84773)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84774)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84775);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84776)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84777)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84778);Assert.assertEquals(data[i], out[i][j], 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84779);Assert.assertEquals(0d, out[i][j], 0d);
                }
            }}
        }}        
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1tf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1tf0(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84780);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84781);final double[] data1 = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84782);final DiagonalMatrix m1 = new DiagonalMatrix(data1);
 
        __CLR4_4_11tcu1tculb90pd48.R.inc(84783);final double[] data2 = { 10.1, 2.3, 45 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84784);final DiagonalMatrix m2 = new DiagonalMatrix(data2);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84785);final DiagonalMatrix result = m1.add(m2);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84786);Assert.assertEquals(m1.getRowDimension(), result.getRowDimension());
        __CLR4_4_11tcu1tculb90pd48.R.inc(84787);for (int i = 0; (((i < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84788)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84789)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84790);for (int j = 0; (((j < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84791)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84792)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84793);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84794)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84795)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84796);Assert.assertEquals(data1[i] + data2[i], result.getEntry(i, j), 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84797);Assert.assertEquals(0d, result.getEntry(i, j), 0d);
                }
            }}
        }}
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1tfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1tfi(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84798);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84799);final double[] data1 = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84800);final DiagonalMatrix m1 = new DiagonalMatrix(data1);
 
        __CLR4_4_11tcu1tculb90pd48.R.inc(84801);final double[] data2 = { 10.1, 2.3, 45 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84802);final DiagonalMatrix m2 = new DiagonalMatrix(data2);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84803);final DiagonalMatrix result = m1.subtract(m2);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84804);Assert.assertEquals(m1.getRowDimension(), result.getRowDimension());
        __CLR4_4_11tcu1tculb90pd48.R.inc(84805);for (int i = 0; (((i < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84806)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84807)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84808);for (int j = 0; (((j < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84809)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84810)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84811);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84812)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84813)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84814);Assert.assertEquals(data1[i] - data2[i], result.getEntry(i, j), 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84815);Assert.assertEquals(0d, result.getEntry(i, j), 0d);
                }
            }}
        }}
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testAddToEntry() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8achd1tg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testAddToEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8achd1tg0(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84816);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84817);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84818);final DiagonalMatrix m = new DiagonalMatrix(data);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84819);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84820)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84821)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84822);m.addToEntry(i, i, i);
            __CLR4_4_11tcu1tculb90pd48.R.inc(84823);Assert.assertEquals(data[i] + i, m.getEntry(i, i), 0d);
        }
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testMultiplyEntry() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gi3ur1tg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testMultiplyEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gi3ur1tg8(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84824);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84825);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84826);final DiagonalMatrix m = new DiagonalMatrix(data);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84827);for (int i = 0; (((i < m.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84828)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84829)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84830);m.multiplyEntry(i, i, i);
            __CLR4_4_11tcu1tculb90pd48.R.inc(84831);Assert.assertEquals(data[i] * i, m.getEntry(i, i), 0d);
        }
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testMultiply1() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flbfum1tgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testMultiply1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flbfum1tgg(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84832);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84833);final double[] data1 = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84834);final DiagonalMatrix m1 = new DiagonalMatrix(data1);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84835);final double[] data2 = { 10.1, 2.3, 45 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84836);final DiagonalMatrix m2 = new DiagonalMatrix(data2);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84837);final DiagonalMatrix result = (DiagonalMatrix) m1.multiply((RealMatrix) m2);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84838);Assert.assertEquals(m1.getRowDimension(), result.getRowDimension());
        __CLR4_4_11tcu1tculb90pd48.R.inc(84839);for (int i = 0; (((i < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84840)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84841)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84842);for (int j = 0; (((j < result.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84843)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84844)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84845);if ((((i == j)&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84846)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84847)==0&false))) {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84848);Assert.assertEquals(data1[i] * data2[i], result.getEntry(i, j), 0d);
                } }else {{
                    __CLR4_4_11tcu1tculb90pd48.R.inc(84849);Assert.assertEquals(0d, result.getEntry(i, j), 0d);
                }
            }}
        }}
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testMultiply2() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccbh251tgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testMultiply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccbh251tgy(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84850);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84851);final double[] data1 = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84852);final DiagonalMatrix diag1 = new DiagonalMatrix(data1);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84853);final double[][] data2 = { { -1.2, 3.4 },
                                   { -5.6, 7.8 },
                                   {  9.1, 2.3 } };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84854);final RealMatrix dense2 = new Array2DRowRealMatrix(data2);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84855);final RealMatrix dense1 = new Array2DRowRealMatrix(diag1.getData());

        __CLR4_4_11tcu1tculb90pd48.R.inc(84856);final RealMatrix diagResult = diag1.multiply(dense2);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84857);final RealMatrix denseResult = dense1.multiply(dense2);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84858);for (int i = 0; (((i < dense1.getRowDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84859)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84860)==0&false)); i++) {{
            __CLR4_4_11tcu1tculb90pd48.R.inc(84861);for (int j = 0; (((j < dense2.getColumnDimension())&&(__CLR4_4_11tcu1tculb90pd48.R.iget(84862)!=0|true))||(__CLR4_4_11tcu1tculb90pd48.R.iget(84863)==0&false)); j++) {{
                __CLR4_4_11tcu1tculb90pd48.R.inc(84864);Assert.assertEquals(denseResult.getEntry(i, j),
                                    diagResult.getEntry(i, j), 0d);
            }
        }}
    }}finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testOperate() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6hzt1thd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testOperate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6hzt1thd(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84865);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84866);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84867);final DiagonalMatrix diag = new DiagonalMatrix(data);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84868);final RealMatrix dense = new Array2DRowRealMatrix(diag.getData());

        __CLR4_4_11tcu1tculb90pd48.R.inc(84869);final double[] v = { 6.7, 890.1, 23.4 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84870);final double[] diagResult = diag.operate(v);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84871);final double[] denseResult = dense.operate(v);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84872);TestUtils.assertEquals(diagResult, denseResult, 0d);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testPreMultiply() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1106vz81thl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testPreMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1106vz81thl(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84873);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84874);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84875);final DiagonalMatrix diag = new DiagonalMatrix(data);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84876);final RealMatrix dense = new Array2DRowRealMatrix(diag.getData());

        __CLR4_4_11tcu1tculb90pd48.R.inc(84877);final double[] v = { 6.7, 890.1, 23.4 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84878);final double[] diagResult = diag.preMultiply(v);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84879);final double[] denseResult = dense.preMultiply(v);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84880);TestUtils.assertEquals(diagResult, denseResult, 0d);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testPreMultiplyVector() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bvffj1tht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testPreMultiplyVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bvffj1tht(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84881);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84882);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84883);final DiagonalMatrix diag = new DiagonalMatrix(data);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84884);final RealMatrix dense = new Array2DRowRealMatrix(diag.getData());

        __CLR4_4_11tcu1tculb90pd48.R.inc(84885);final double[] v = { 6.7, 890.1, 23.4 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84886);final RealVector vector = MatrixUtils.createRealVector(v);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84887);final RealVector diagResult = diag.preMultiply(vector);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84888);final RealVector denseResult = dense.preMultiply(vector);

        __CLR4_4_11tcu1tculb90pd48.R.inc(84889);TestUtils.assertEquals("preMultiply(Vector) returns wrong result", diagResult, denseResult, 0d);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testSetNonDiagonalEntry() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e63zt1ti2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,111,110,68,105,97,103,111,110,97,108,69,110,116,114,121,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSetNonDiagonalEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e63zt1ti2(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84890);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84891);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84892);diag.setEntry(1, 2, 3.4);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testSetNonDiagonalZero() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16bxp411ti5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSetNonDiagonalZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16bxp411ti5(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84893);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84894);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84895);diag.setEntry(1, 2, 0.0);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84896);Assert.assertEquals(0.0, diag.getEntry(1, 2), Precision.SAFE_MIN);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testAddNonDiagonalEntry() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fx0h461ti9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,78,111,110,68,105,97,103,111,110,97,108,69,110,116,114,121,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testAddNonDiagonalEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fx0h461ti9(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84897);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84898);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84899);diag.addToEntry(1, 2, 3.4);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testAddNonDiagonalZero() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkqyhu1tic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testAddNonDiagonalZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkqyhu1tic(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84900);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84901);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84902);diag.addToEntry(1, 2, 0.0);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84903);Assert.assertEquals(0.0, diag.getEntry(1, 2), Precision.SAFE_MIN);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testMultiplyNonDiagonalEntry() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1flb7jh1tig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testMultiplyNonDiagonalEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1flb7jh1tig(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84904);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84905);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84906);diag.multiplyEntry(1, 2, 3.4);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84907);Assert.assertEquals(0.0, diag.getEntry(1, 2), Precision.SAFE_MIN);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testMultiplyNonDiagonalZero() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9vth71tik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testMultiplyNonDiagonalZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9vth71tik(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84908);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84909);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84910);diag.multiplyEntry(1, 2, 0.0);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84911);Assert.assertEquals(0.0, diag.getEntry(1, 2), Precision.SAFE_MIN);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testSetEntryOutOfRange() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193isqp1tio();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,110,116,114,121,79,117,116,79,102,82,97,110,103,101,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSetEntryOutOfRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193isqp1tio(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84912);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84913);final DiagonalMatrix diag = new DiagonalMatrix(3);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84914);diag.setEntry(3, 3, 3.4);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testNull() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19231k01tir();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19231k01tir(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84915);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84916);new DiagonalMatrix(null, false);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testSetSubMatrixError() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135ofvi1tit();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,83,117,98,77,97,116,114,105,120,69,114,114,111,114,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSetSubMatrixError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135ofvi1tit(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84917);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84918);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84919);final DiagonalMatrix diag = new DiagonalMatrix(data);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84920);diag.setSubMatrix(new double[][] { {1.0, 1.0}, {1.0, 1.0}}, 1, 1);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

    @Test
    public void testSetSubMatrix() {__CLR4_4_11tcu1tculb90pd48.R.globalSliceStart(getClass().getName(),84921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyz6bc1tix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11tcu1tculb90pd48.R.rethrow($CLV_t2$);}finally{__CLR4_4_11tcu1tculb90pd48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.DiagonalMatrixTest.testSetSubMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),84921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyz6bc1tix(){try{__CLR4_4_11tcu1tculb90pd48.R.inc(84921);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84922);final double[] data = { -1.2, 3.4, 5 };
        __CLR4_4_11tcu1tculb90pd48.R.inc(84923);final DiagonalMatrix diag = new DiagonalMatrix(data);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84924);diag.setSubMatrix(new double[][] { {0.0, 5.0, 0.0}, {0.0, 0.0, 6.0}}, 1, 0);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84925);Assert.assertEquals(-1.2, diag.getEntry(0, 0), 1.0e-20);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84926);Assert.assertEquals( 5.0, diag.getEntry(1, 1), 1.0e-20);
        __CLR4_4_11tcu1tculb90pd48.R.inc(84927);Assert.assertEquals( 6.0, diag.getEntry(2, 2), 1.0e-20);
    }finally{__CLR4_4_11tcu1tculb90pd48.R.flushNeeded();}}

}
