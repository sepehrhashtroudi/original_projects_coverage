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

/** This class implements AVL trees.
 *
 * <p>The purpose of this class is to sort elements while allowing
 * duplicate elements (i.e. such that {@code a.equals(b)} is
 * true). The {@code SortedSet} interface does not allow this, so
 * a specific class is needed. Null elements are not allowed.</p>
 *
 * <p>Since the {@code equals} method is not sufficient to
 * differentiate elements, the {@link #delete delete} method is
 * implemented using the equality operator.</p>
 *
 * <p>In order to clearly mark the methods provided here do not have
 * the same semantics as the ones specified in the
 * {@code SortedSet} interface, different names are used
 * ({@code add} has been replaced by {@link #insert insert} and
 * {@code remove} has been replaced by {@link #delete
 * delete}).</p>
 *
 * <p>This class is based on the C implementation Georg Kraml has put
 * in the public domain. Unfortunately, his <a
 * href="www.purists.org/georg/avltree/index.html">page</a> seems not
 * to exist any more.</p>
 *
 * @param <T> the type of the elements
 *
 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class AVLTree<T extends Comparable<T>> {public static class __CLR4_4_1ffnffnlb90p8hg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,20390,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Top level node. */
    private Node top;

    /** Build an empty tree.
     */
    public AVLTree() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20003);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20004);top = null;
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Insert an element in the tree.
     * @param element element to insert (silently ignored if null)
     */
    public void insert(final T element) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20005);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20006);if ((((element != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20007)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20008)==0&false))) {{
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20009);if ((((top == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20010)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20011)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20012);top = new Node(element, null);
            } }else {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20013);top.insert(element);
            }
        }}
    }}finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Delete an element from the tree.
     * <p>The element is deleted only if there is a node {@code n}
     * containing exactly the element instance specified, i.e. for which
     * {@code n.getElement() == element}. This is purposely
     * <em>different</em> from the specification of the
     * {@code java.util.Set} {@code remove} method (in fact,
     * this is the reason why a specific class has been developed).</p>
     * @param element element to delete (silently ignored if null)
     * @return true if the element was deleted from the tree
     */
    public boolean delete(final T element) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20014);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20015);if ((((element != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20016)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20017)==0&false))) {{
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20018);for (Node node = getNotSmaller(element); (((node != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20019)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20020)==0&false)); node = node.getNext()) {{
                // loop over all elements neither smaller nor larger
                // than the specified one
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20021);if ((((node.element == element)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20022)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20023)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20024);node.delete();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20025);return true;
                } }else {__CLR4_4_1ffnffnlb90p8hg.R.inc(20026);if ((((node.element.compareTo(element) > 0)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20027)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20028)==0&false))) {{
                    // all the remaining elements are known to be larger,
                    // the element is not in the tree
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20029);return false;
                }
            }}}
        }}
        }__CLR4_4_1ffnffnlb90p8hg.R.inc(20030);return false;
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Check if the tree is empty.
     * @return true if the tree is empty
     */
    public boolean isEmpty() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20031);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20032);return top == null;
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}


    /** Get the number of elements of the tree.
     * @return number of elements contained in the tree
     */
    public int size() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20033);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20034);return ((((top == null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20035)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20036)==0&false))? 0 : top.size();
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Get the node whose element is the smallest one in the tree.
     * @return the tree node containing the smallest element in the tree
     * or null if the tree is empty
     * @see #getLargest
     * @see #getNotSmaller
     * @see #getNotLarger
     * @see Node#getPrevious
     * @see Node#getNext
     */
    public Node getSmallest() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20037);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20038);return ((((top == null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20039)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20040)==0&false))? null : top.getSmallest();
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Get the node whose element is the largest one in the tree.
     * @return the tree node containing the largest element in the tree
     * or null if the tree is empty
     * @see #getSmallest
     * @see #getNotSmaller
     * @see #getNotLarger
     * @see Node#getPrevious
     * @see Node#getNext
     */
    public Node getLargest() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20041);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20042);return ((((top == null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20043)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20044)==0&false))? null : top.getLargest();
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Get the node whose element is not smaller than the reference object.
     * @param reference reference object (may not be in the tree)
     * @return the tree node containing the smallest element not smaller
     * than the reference object or null if either the tree is empty or
     * all its elements are smaller than the reference object
     * @see #getSmallest
     * @see #getLargest
     * @see #getNotLarger
     * @see Node#getPrevious
     * @see Node#getNext
     */
    public Node getNotSmaller(final T reference) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20045);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20046);Node candidate = null;
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20047);for (Node node = top; (((node != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20048)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20049)==0&false));) {{
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20050);if ((((node.element.compareTo(reference) < 0)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20051)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20052)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20053);if ((((node.right == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20054)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20055)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20056);return candidate;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20057);node = node.right;
            } }else {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20058);candidate = node;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20059);if ((((node.left == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20060)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20061)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20062);return candidate;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20063);node = node.left;
            }
        }}
        }__CLR4_4_1ffnffnlb90p8hg.R.inc(20064);return null;
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Get the node whose element is not larger than the reference object.
     * @param reference reference object (may not be in the tree)
     * @return the tree node containing the largest element not larger
     * than the reference object (in which case the node is guaranteed
     * not to be empty) or null if either the tree is empty or all its
     * elements are larger than the reference object
     * @see #getSmallest
     * @see #getLargest
     * @see #getNotSmaller
     * @see Node#getPrevious
     * @see Node#getNext
     */
    public Node getNotLarger(final T reference) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20065);
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20066);Node candidate = null;
        __CLR4_4_1ffnffnlb90p8hg.R.inc(20067);for (Node node = top; (((node != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20068)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20069)==0&false));) {{
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20070);if ((((node.element.compareTo(reference) > 0)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20071)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20072)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20073);if ((((node.left == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20074)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20075)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20076);return candidate;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20077);node = node.left;
            } }else {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20078);candidate = node;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20079);if ((((node.right == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20080)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20081)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20082);return candidate;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20083);node = node.right;
            }
        }}
        }__CLR4_4_1ffnffnlb90p8hg.R.inc(20084);return null;
    }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    /** Enum for tree skew factor. */
    private static enum Skew {
        /** Code for left high trees. */
        LEFT_HIGH,

        /** Code for right high trees. */
        RIGHT_HIGH,

        /** Code for Skew.BALANCED trees. */
        BALANCED;
    }

    /** This class implements AVL trees nodes.
     * <p>AVL tree nodes implement all the logical structure of the
     * tree. Nodes are created by the {@link AVLTree AVLTree} class.</p>
     * <p>The nodes are not independant from each other but must obey
     * specific balancing constraints and the tree structure is
     * rearranged as elements are inserted or deleted from the tree. The
     * creation, modification and tree-related navigation methods have
     * therefore restricted access. Only the order-related navigation,
     * reading and delete methods are public.</p>
     * @see AVLTree
     */
    public class Node {

        /** Element contained in the current node. */
        private T element;

        /** Left sub-tree. */
        private Node left;

        /** Right sub-tree. */
        private Node right;

        /** Parent tree. */
        private Node parent;

        /** Skew factor. */
        private Skew skew;

        /** Build a node for a specified element.
         * @param element element
         * @param parent parent node
         */
        Node(final T element, final Node parent) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20085);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20086);this.element = element;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20087);left         = null;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20088);right        = null;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20089);this.parent  = parent;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20090);skew         = Skew.BALANCED;
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the contained element.
         * @return element contained in the node
         */
        public T getElement() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20091);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20092);return element;
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the number of elements of the tree rooted at this node.
         * @return number of elements contained in the tree rooted at this node
         */
        int size() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20093);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20094);return 1 + (((((left  == null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20095)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20096)==0&false))? 0 : left.size()) + (((((right == null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20097)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20098)==0&false))? 0 : right.size());
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the node whose element is the smallest one in the tree
         * rooted at this node.
         * @return the tree node containing the smallest element in the
         * tree rooted at this node or null if the tree is empty
         * @see #getLargest
         */
        Node getSmallest() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20099);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20100);Node node = this;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20101);while ((((node.left != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20102)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20103)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20104);node = node.left;
            }
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20105);return node;
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the node whose element is the largest one in the tree
         * rooted at this node.
         * @return the tree node containing the largest element in the
         * tree rooted at this node or null if the tree is empty
         * @see #getSmallest
         */
        Node getLargest() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20106);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20107);Node node = this;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20108);while ((((node.right != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20109)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20110)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20111);node = node.right;
            }
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20112);return node;
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the node containing the next smaller or equal element.
         * @return node containing the next smaller or equal element or
         * null if there is no smaller or equal element in the tree
         * @see #getNext
         */
        public Node getPrevious() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20113);

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20114);if ((((left != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20115)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20116)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20117);final Node node = left.getLargest();
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20118);if ((((node != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20119)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20120)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20121);return node;
                }
            }}

            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20122);for (Node node = this; (((node.parent != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20123)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20124)==0&false)); node = node.parent) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20125);if ((((node != node.parent.left)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20126)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20127)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20128);return node.parent;
                }
            }}

            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20129);return null;

        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Get the node containing the next larger or equal element.
         * @return node containing the next larger or equal element (in
         * which case the node is guaranteed not to be empty) or null if
         * there is no larger or equal element in the tree
         * @see #getPrevious
         */
        public Node getNext() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20130);

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20131);if ((((right != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20132)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20133)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20134);final Node node = right.getSmallest();
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20135);if ((((node != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20136)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20137)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20138);return node;
                }
            }}

            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20139);for (Node node = this; (((node.parent != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20140)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20141)==0&false)); node = node.parent) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20142);if ((((node != node.parent.right)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20143)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20144)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20145);return node.parent;
                }
            }}

            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20146);return null;

        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Insert an element in a sub-tree.
         * @param newElement element to insert
         * @return true if the parent tree should be re-Skew.BALANCED
         */
        boolean insert(final T newElement) {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20147);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20148);if ((((newElement.compareTo(this.element) < 0)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20149)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20150)==0&false))) {{
                // the inserted element is smaller than the node
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20151);if ((((left == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20152)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20153)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20154);left = new Node(newElement, this);
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20155);return rebalanceLeftGrown();
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20156);return (((left.insert(newElement) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20157)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20158)==0&false))? rebalanceLeftGrown() : false;
            }

            // the inserted element is equal to or greater than the node
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20159);if ((((right == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20160)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20161)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20162);right = new Node(newElement, this);
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20163);return rebalanceRightGrown();
            }
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20164);return (((right.insert(newElement) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20165)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20166)==0&false))? rebalanceRightGrown() : false;

        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Delete the node from the tree.
         */
        public void delete() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20167);
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20168);if (((((parent == null) && (left == null) && (right == null))&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20169)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20170)==0&false))) {{
                // this was the last node, the tree is now empty
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20171);element = null;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20172);top     = null;
            } }else {{

                __CLR4_4_1ffnffnlb90p8hg.R.inc(20173);Node node;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20174);Node child;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20175);boolean leftShrunk;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20176);if (((((left == null) && (right == null))&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20177)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20178)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20179);node       = this;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20180);element    = null;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20181);leftShrunk = node == node.parent.left;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20182);child      = null;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20183);node       = ((((left != null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20184)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20185)==0&false))? left.getLargest() : right.getSmallest();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20186);element    = node.element;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20187);leftShrunk = node == node.parent.left;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20188);child      = ((((node.left != null) )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20189)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20190)==0&false))? node.left : node.right;
                }

                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20191);node = node.parent;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20192);if ((((leftShrunk)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20193)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20194)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20195);node.left = child;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20196);node.right = child;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20197);if ((((child != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20198)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20199)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20200);child.parent = node;
                }

                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20201);while (((((((leftShrunk )&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20202)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20203)==0&false))? node.rebalanceLeftShrunk() : node.rebalanceRightShrunk())&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20204)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20205)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20206);if ((((node.parent == null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20207)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20208)==0&false))) {{
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20209);return;
                    }
                    }__CLR4_4_1ffnffnlb90p8hg.R.inc(20210);leftShrunk = node == node.parent.left;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20211);node = node.parent;
                }

            }}
        }}finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Re-balance the instance as left sub-tree has grown.
         * @return true if the parent tree should be reSkew.BALANCED too
         */
        private boolean rebalanceLeftGrown() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20212);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20213);switch (skew) {
            case LEFT_HIGH:if (!__CLB4_4_1_bool0) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20214);__CLB4_4_1_bool0=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20215);if ((((left.skew == Skew.LEFT_HIGH)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20216)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20217)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20218);rotateCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20219);skew       = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20220);right.skew = Skew.BALANCED;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20221);final Skew s = left.right.skew;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20222);left.rotateCCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20223);rotateCW();
                    boolean __CLB4_4_1_bool1=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20224);switch(s) {
                    case LEFT_HIGH:if (!__CLB4_4_1_bool1) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20225);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20226);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20227);right.skew = Skew.RIGHT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20228);break;
                    case RIGHT_HIGH:if (!__CLB4_4_1_bool1) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20229);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20230);left.skew  = Skew.LEFT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20231);right.skew = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20232);break;
                    default:if (!__CLB4_4_1_bool1) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20233);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20234);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20235);right.skew = Skew.BALANCED;
                    }
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20236);skew = Skew.BALANCED;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20237);return false;
            case RIGHT_HIGH:if (!__CLB4_4_1_bool0) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20238);__CLB4_4_1_bool0=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20239);skew = Skew.BALANCED;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20240);return false;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20241);__CLB4_4_1_bool0=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20242);skew = Skew.LEFT_HIGH;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20243);return true;
            }
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Re-balance the instance as right sub-tree has grown.
         * @return true if the parent tree should be reSkew.BALANCED too
         */
        private boolean rebalanceRightGrown() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20244);
            boolean __CLB4_4_1_bool2=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20245);switch (skew) {
            case LEFT_HIGH:if (!__CLB4_4_1_bool2) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20246);__CLB4_4_1_bool2=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20247);skew = Skew.BALANCED;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20248);return false;
            case RIGHT_HIGH:if (!__CLB4_4_1_bool2) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20249);__CLB4_4_1_bool2=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20250);if ((((right.skew == Skew.RIGHT_HIGH)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20251)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20252)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20253);rotateCCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20254);skew      = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20255);left.skew = Skew.BALANCED;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20256);final Skew s = right.left.skew;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20257);right.rotateCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20258);rotateCCW();
                    boolean __CLB4_4_1_bool3=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20259);switch (s) {
                    case LEFT_HIGH:if (!__CLB4_4_1_bool3) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20260);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20261);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20262);right.skew = Skew.RIGHT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20263);break;
                    case RIGHT_HIGH:if (!__CLB4_4_1_bool3) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20264);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20265);left.skew  = Skew.LEFT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20266);right.skew = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20267);break;
                    default:if (!__CLB4_4_1_bool3) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20268);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20269);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20270);right.skew = Skew.BALANCED;
                    }
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20271);skew = Skew.BALANCED;
                }
                }__CLR4_4_1ffnffnlb90p8hg.R.inc(20272);return false;
            default:if (!__CLB4_4_1_bool2) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20273);__CLB4_4_1_bool2=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20274);skew = Skew.RIGHT_HIGH;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20275);return true;
            }
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Re-balance the instance as left sub-tree has shrunk.
         * @return true if the parent tree should be reSkew.BALANCED too
         */
        private boolean rebalanceLeftShrunk() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20276);
            boolean __CLB4_4_1_bool4=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20277);switch (skew) {
            case LEFT_HIGH:if (!__CLB4_4_1_bool4) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20278);__CLB4_4_1_bool4=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20279);skew = Skew.BALANCED;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20280);return true;
            case RIGHT_HIGH:if (!__CLB4_4_1_bool4) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20281);__CLB4_4_1_bool4=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20282);if ((((right.skew == Skew.RIGHT_HIGH)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20283)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20284)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20285);rotateCCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20286);skew      = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20287);left.skew = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20288);return true;
                } }else {__CLR4_4_1ffnffnlb90p8hg.R.inc(20289);if ((((right.skew == Skew.BALANCED)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20290)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20291)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20292);rotateCCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20293);skew      = Skew.LEFT_HIGH;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20294);left.skew = Skew.RIGHT_HIGH;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20295);return false;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20296);final Skew s = right.left.skew;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20297);right.rotateCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20298);rotateCCW();
                    boolean __CLB4_4_1_bool5=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20299);switch (s) {
                    case LEFT_HIGH:if (!__CLB4_4_1_bool5) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20300);__CLB4_4_1_bool5=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20301);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20302);right.skew = Skew.RIGHT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20303);break;
                    case RIGHT_HIGH:if (!__CLB4_4_1_bool5) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20304);__CLB4_4_1_bool5=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20305);left.skew  = Skew.LEFT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20306);right.skew = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20307);break;
                    default:if (!__CLB4_4_1_bool5) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20308);__CLB4_4_1_bool5=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20309);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20310);right.skew = Skew.BALANCED;
                    }
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20311);skew = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20312);return true;
                }
            }}default:if (!__CLB4_4_1_bool4) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20313);__CLB4_4_1_bool4=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20314);skew = Skew.RIGHT_HIGH;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20315);return false;
            }
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Re-balance the instance as right sub-tree has shrunk.
         * @return true if the parent tree should be reSkew.BALANCED too
         */
        private boolean rebalanceRightShrunk() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20316);
            boolean __CLB4_4_1_bool6=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20317);switch (skew) {
            case RIGHT_HIGH:if (!__CLB4_4_1_bool6) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20318);__CLB4_4_1_bool6=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20319);skew = Skew.BALANCED;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20320);return true;
            case LEFT_HIGH:if (!__CLB4_4_1_bool6) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20321);__CLB4_4_1_bool6=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20322);if ((((left.skew == Skew.LEFT_HIGH)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20323)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20324)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20325);rotateCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20326);skew       = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20327);right.skew = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20328);return true;
                } }else {__CLR4_4_1ffnffnlb90p8hg.R.inc(20329);if ((((left.skew == Skew.BALANCED)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20330)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20331)==0&false))) {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20332);rotateCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20333);skew       = Skew.RIGHT_HIGH;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20334);right.skew = Skew.LEFT_HIGH;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20335);return false;
                } }else {{
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20336);final Skew s = left.right.skew;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20337);left.rotateCCW();
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20338);rotateCW();
                    boolean __CLB4_4_1_bool7=false;__CLR4_4_1ffnffnlb90p8hg.R.inc(20339);switch (s) {
                    case LEFT_HIGH:if (!__CLB4_4_1_bool7) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20340);__CLB4_4_1_bool7=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20341);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20342);right.skew = Skew.RIGHT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20343);break;
                    case RIGHT_HIGH:if (!__CLB4_4_1_bool7) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20344);__CLB4_4_1_bool7=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20345);left.skew  = Skew.LEFT_HIGH;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20346);right.skew = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20347);break;
                    default:if (!__CLB4_4_1_bool7) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20348);__CLB4_4_1_bool7=true;}
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20349);left.skew  = Skew.BALANCED;
                        __CLR4_4_1ffnffnlb90p8hg.R.inc(20350);right.skew = Skew.BALANCED;
                    }
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20351);skew = Skew.BALANCED;
                    __CLR4_4_1ffnffnlb90p8hg.R.inc(20352);return true;
                }
            }}default:if (!__CLB4_4_1_bool6) {__CLR4_4_1ffnffnlb90p8hg.R.inc(20353);__CLB4_4_1_bool6=true;}
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20354);skew = Skew.LEFT_HIGH;
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20355);return false;
            }
        }finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Perform a clockwise rotation rooted at the instance.
         * <p>The skew factor are not updated by this method, they
         * <em>must</em> be updated by the caller</p>
         */
        private void rotateCW() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20356);

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20357);final T tmpElt       = element;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20358);element              = left.element;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20359);left.element         = tmpElt;

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20360);final Node tmpNode   = left;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20361);left                 = tmpNode.left;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20362);tmpNode.left         = tmpNode.right;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20363);tmpNode.right        = right;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20364);right                = tmpNode;

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20365);if ((((left != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20366)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20367)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20368);left.parent = this;
            }
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20369);if ((((right.right != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20370)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20371)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20372);right.right.parent = right;
            }

        }}finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

        /** Perform a counter-clockwise rotation rooted at the instance.
         * <p>The skew factor are not updated by this method, they
         * <em>must</em> be updated by the caller</p>
         */
        private void rotateCCW() {try{__CLR4_4_1ffnffnlb90p8hg.R.inc(20373);

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20374);final T tmpElt        = element;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20375);element               = right.element;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20376);right.element         = tmpElt;

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20377);final Node tmpNode    = right;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20378);right                 = tmpNode.right;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20379);tmpNode.right         = tmpNode.left;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20380);tmpNode.left          = left;
            __CLR4_4_1ffnffnlb90p8hg.R.inc(20381);left                  = tmpNode;

            __CLR4_4_1ffnffnlb90p8hg.R.inc(20382);if ((((right != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20383)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20384)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20385);right.parent = this;
            }
            }__CLR4_4_1ffnffnlb90p8hg.R.inc(20386);if ((((left.left != null)&&(__CLR4_4_1ffnffnlb90p8hg.R.iget(20387)!=0|true))||(__CLR4_4_1ffnffnlb90p8hg.R.iget(20388)==0&false))) {{
                __CLR4_4_1ffnffnlb90p8hg.R.inc(20389);left.left.parent = left;
            }

        }}finally{__CLR4_4_1ffnffnlb90p8hg.R.flushNeeded();}}

    }

}
