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
package org.apache.commons.math3.geometry.partitioning.utilities;

import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import org.junit.Assert;
import org.junit.Test;

public class AVLTreeTest {static class __CLR4_4_11qnc1qnclb90pcya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,81296,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInsert() {__CLR4_4_11qnc1qnclb90pcya.R.globalSliceStart(getClass().getName(),81192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adr9w21qnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qnc1qnclb90pcya.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qnc1qnclb90pcya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest.testInsert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adr9w21qnc(){try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81192);
        // this array in this order allows to pass in all branches
        // of the insertion algorithm
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81193);int[] array = { 16, 13, 15, 14,  2,  0, 12,  9,  8,  5,
            11, 18, 19, 17,  4,  7,  1,  3,  6, 10 };
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81194);AVLTree<Integer> tree = buildTree(array);

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81195);Assert.assertEquals(array.length, tree.size());

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81196);for (int i = 0; (((i < array.length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81197)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81198)==0&false)); ++i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81199);Assert.assertEquals(array[i], value(tree.getNotSmaller(new Integer(array[i]))));
        }

        }__CLR4_4_11qnc1qnclb90pcya.R.inc(81200);checkOrder(tree);

    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    @Test
    public void testDelete1() {__CLR4_4_11qnc1qnclb90pcya.R.globalSliceStart(getClass().getName(),81201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzlq631qnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qnc1qnclb90pcya.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qnc1qnclb90pcya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest.testDelete1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzlq631qnl(){try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81201);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81202);int[][][] arrays = {
            { { 16, 13, 15, 14, 2, 0, 12, 9, 8, 5, 11, 18, 19, 17, 4, 7, 1, 3, 6, 10 },
                { 11, 10, 9, 12, 16, 15, 13, 18, 5, 0, 3, 2, 14, 6, 19, 17, 8, 4, 7, 1 } },
                { { 16, 13, 15, 14, 2, 0, 12, 9, 8, 5, 11, 18, 19, 17, 4, 7, 1, 3, 6, 10 },
                    { 0, 17, 14, 15, 16, 18,  6 } },
                    { { 6, 2, 7, 8, 1, 4, 3, 5 }, { 8 } },
                    { { 6, 2, 7, 8, 1, 4, 5 }, { 8 } },
                    { { 3, 7, 2, 1, 5, 8, 4 }, { 1 } },
                    { { 3, 7, 2, 1, 5, 8, 6 }, { 1 } }
        };
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81203);for (int i = 0; (((i < arrays.length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81204)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81205)==0&false)); ++i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81206);AVLTree<Integer> tree = buildTree(arrays[i][0]);
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81207);Assert.assertTrue(! tree.delete(new Integer(-2000)));
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81208);for (int j = 0; (((j < arrays[i][1].length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81209)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81210)==0&false)); ++j) {{
                __CLR4_4_11qnc1qnclb90pcya.R.inc(81211);Assert.assertTrue(tree.delete(tree.getNotSmaller(new Integer(arrays[i][1][j])).getElement()));
                __CLR4_4_11qnc1qnclb90pcya.R.inc(81212);Assert.assertEquals(arrays[i][0].length - j - 1, tree.size());
            }
        }}
    }}finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    @Test
    public void testNavigation() {__CLR4_4_11qnc1qnclb90pcya.R.globalSliceStart(getClass().getName(),81213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wk6cdv1qnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qnc1qnclb90pcya.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qnc1qnclb90pcya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest.testNavigation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wk6cdv1qnx(){try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81213);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81214);int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81215);AVLTree<Integer> tree = buildTree(array);

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81216);AVLTree<Integer>.Node node = tree.getSmallest();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81217);Assert.assertEquals(array[0], value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81218);for (int i = 0; (((i < array.length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81219)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81220)==0&false)); ++i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81221);Assert.assertEquals(array[i], value(node));
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81222);node = node.getNext();
        }
        }__CLR4_4_11qnc1qnclb90pcya.R.inc(81223);Assert.assertNull(node);

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81224);node = tree.getLargest();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81225);Assert.assertEquals(array[array.length - 1], value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81226);for (int i = array.length - 1; (((i >= 0)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81227)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81228)==0&false)); --i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81229);Assert.assertEquals(array[i], value(node));
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81230);node = node.getPrevious();
        }
        }__CLR4_4_11qnc1qnclb90pcya.R.inc(81231);Assert.assertNull(node);

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81232);checkOrder(tree);

    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    @Test
    public void testSearch() {__CLR4_4_11qnc1qnclb90pcya.R.globalSliceStart(getClass().getName(),81233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ceoyp1qoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qnc1qnclb90pcya.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qnc1qnclb90pcya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest.testSearch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ceoyp1qoh(){try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81233);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81234);int[] array = { 2, 4, 6, 8, 10, 12, 14 };
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81235);AVLTree<Integer> tree = buildTree(array);

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81236);Assert.assertNull(tree.getNotLarger(new Integer(array[0] - 1)));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81237);Assert.assertNull(tree.getNotSmaller(new Integer(array[array.length - 1] + 1)));

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81238);for (int i = 0; (((i < array.length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81239)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81240)==0&false)); ++i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81241);Assert.assertEquals(array[i],
                                value(tree.getNotSmaller(new Integer(array[i] - 1))));
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81242);Assert.assertEquals(array[i],
                                value(tree.getNotLarger(new Integer(array[i] + 1))));
        }

        }__CLR4_4_11qnc1qnclb90pcya.R.inc(81243);checkOrder(tree);

    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    @Test
    public void testRepetition() {__CLR4_4_11qnc1qnclb90pcya.R.globalSliceStart(getClass().getName(),81244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kt8qy1qos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qnc1qnclb90pcya.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qnc1qnclb90pcya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest.testRepetition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),81244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kt8qy1qos(){try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81244);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81245);int[] array = { 1, 1, 3, 3, 4, 5, 6, 7, 7, 7, 7, 7 };
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81246);AVLTree<Integer> tree = buildTree(array);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81247);Assert.assertEquals(array.length, tree.size());

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81248);AVLTree<Integer>.Node node = tree.getNotSmaller(new Integer(3));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81249);Assert.assertEquals(3, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81250);Assert.assertEquals(1, value(node.getPrevious()));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81251);Assert.assertEquals(3, value(node.getNext()));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81252);Assert.assertEquals(4, value(node.getNext().getNext()));

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81253);node = tree.getNotLarger(new Integer(2));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81254);Assert.assertEquals(1, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81255);Assert.assertEquals(1, value(node.getPrevious()));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81256);Assert.assertEquals(3, value(node.getNext()));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81257);Assert.assertNull(node.getPrevious().getPrevious());

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81258);AVLTree<Integer>.Node otherNode = tree.getNotSmaller(new Integer(1));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81259);Assert.assertTrue(node != otherNode);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81260);Assert.assertEquals(1, value(otherNode));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81261);Assert.assertNull(otherNode.getPrevious());

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81262);node = tree.getNotLarger(new Integer(10));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81263);Assert.assertEquals(7, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81264);Assert.assertNull(node.getNext());
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81265);node = node.getPrevious();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81266);Assert.assertEquals(7, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81267);node = node.getPrevious();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81268);Assert.assertEquals(7, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81269);node = node.getPrevious();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81270);Assert.assertEquals(7, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81271);node = node.getPrevious();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81272);Assert.assertEquals(7, value(node));
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81273);node = node.getPrevious();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81274);Assert.assertEquals(6, value(node));

        __CLR4_4_11qnc1qnclb90pcya.R.inc(81275);checkOrder(tree);

    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    private AVLTree<Integer> buildTree(int[] array) {try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81276);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81277);AVLTree<Integer> tree = new AVLTree<Integer>();
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81278);for (int i = 0; (((i < array.length)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81279)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81280)==0&false)); ++i) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81281);tree.insert(new Integer(array[i]));
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81282);tree.insert(null);
        }
        }__CLR4_4_11qnc1qnclb90pcya.R.inc(81283);return tree;
    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    private int value(AVLTree<Integer>.Node node) {try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81284);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81285);return node.getElement().intValue();
    }finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

    private void checkOrder(AVLTree<Integer> tree) {try{__CLR4_4_11qnc1qnclb90pcya.R.inc(81286);
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81287);AVLTree<Integer>.Node next = null;
        __CLR4_4_11qnc1qnclb90pcya.R.inc(81288);for (AVLTree<Integer>.Node node = tree.getSmallest();
        (((node != null)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81289)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81290)==0&false));
        node = next) {{
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81291);next = node.getNext();
            __CLR4_4_11qnc1qnclb90pcya.R.inc(81292);if ((((next != null)&&(__CLR4_4_11qnc1qnclb90pcya.R.iget(81293)!=0|true))||(__CLR4_4_11qnc1qnclb90pcya.R.iget(81294)==0&false))) {{
                __CLR4_4_11qnc1qnclb90pcya.R.inc(81295);Assert.assertTrue(node.getElement().compareTo(next.getElement()) <= 0);
            }
        }}
    }}finally{__CLR4_4_11qnc1qnclb90pcya.R.flushNeeded();}}

}
