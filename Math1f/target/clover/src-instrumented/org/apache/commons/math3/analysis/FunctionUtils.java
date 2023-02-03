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

package org.apache.commons.math3.analysis;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Utilities for manipulating function objects.
 *
 * @version $Id$
 * @since 3.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FunctionUtils {public static class __CLR4_4_100lb90p64y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Class only contains static methods.
     */
    private FunctionUtils() {try{__CLR4_4_100lb90p64y.R.inc(0);}finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Composes functions.
     * <br/>
     * The functions in the argument list are composed sequentially, in the
     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).
     *
     * @param f List of functions.
     * @return the composite function.
     */
    public static UnivariateFunction compose(final UnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(1);
        __CLR4_4_100lb90p64y.R.inc(2);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(3);
                __CLR4_4_100lb90p64y.R.inc(4);double r = x;
                __CLR4_4_100lb90p64y.R.inc(5);for (int i = f.length - 1; (((i >= 0)&&(__CLR4_4_100lb90p64y.R.iget(6)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(7)==0&false)); i--) {{
                    __CLR4_4_100lb90p64y.R.inc(8);r = f[i].value(r);
                }
                }__CLR4_4_100lb90p64y.R.inc(9);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Composes functions.
     * <br/>
     * The functions in the argument list are composed sequentially, in the
     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).
     *
     * @param f List of functions.
     * @return the composite function.
     * @since 3.1
     */
    public static UnivariateDifferentiableFunction compose(final UnivariateDifferentiableFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(10);
        __CLR4_4_100lb90p64y.R.inc(11);return new UnivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double t) {try{__CLR4_4_100lb90p64y.R.inc(12);
                __CLR4_4_100lb90p64y.R.inc(13);double r = t;
                __CLR4_4_100lb90p64y.R.inc(14);for (int i = f.length - 1; (((i >= 0)&&(__CLR4_4_100lb90p64y.R.iget(15)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(16)==0&false)); i--) {{
                    __CLR4_4_100lb90p64y.R.inc(17);r = f[i].value(r);
                }
                }__CLR4_4_100lb90p64y.R.inc(18);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure value(final DerivativeStructure t) {try{__CLR4_4_100lb90p64y.R.inc(19);
                __CLR4_4_100lb90p64y.R.inc(20);DerivativeStructure r = t;
                __CLR4_4_100lb90p64y.R.inc(21);for (int i = f.length - 1; (((i >= 0)&&(__CLR4_4_100lb90p64y.R.iget(22)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(23)==0&false)); i--) {{
                    __CLR4_4_100lb90p64y.R.inc(24);r = f[i].value(r);
                }
                }__CLR4_4_100lb90p64y.R.inc(25);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Composes functions.
     * <br/>
     * The functions in the argument list are composed sequentially, in the
     * given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).
     *
     * @param f List of functions.
     * @return the composite function.
     * @deprecated as of 3.1 replaced by {@link #compose(UnivariateDifferentiableFunction...)}
     */
    @Deprecated
    public static DifferentiableUnivariateFunction compose(final DifferentiableUnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(26);
        __CLR4_4_100lb90p64y.R.inc(27);return new DifferentiableUnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(28);
                __CLR4_4_100lb90p64y.R.inc(29);double r = x;
                __CLR4_4_100lb90p64y.R.inc(30);for (int i = f.length - 1; (((i >= 0)&&(__CLR4_4_100lb90p64y.R.iget(31)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(32)==0&false)); i--) {{
                    __CLR4_4_100lb90p64y.R.inc(33);r = f[i].value(r);
                }
                }__CLR4_4_100lb90p64y.R.inc(34);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public UnivariateFunction derivative() {try{__CLR4_4_100lb90p64y.R.inc(35);
                __CLR4_4_100lb90p64y.R.inc(36);return new UnivariateFunction() {
                    /** {@inheritDoc} */
                    public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(37);
                        __CLR4_4_100lb90p64y.R.inc(38);double p = 1;
                        __CLR4_4_100lb90p64y.R.inc(39);double r = x;
                        __CLR4_4_100lb90p64y.R.inc(40);for (int i = f.length - 1; (((i >= 0)&&(__CLR4_4_100lb90p64y.R.iget(41)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(42)==0&false)); i--) {{
                            __CLR4_4_100lb90p64y.R.inc(43);p *= f[i].derivative().value(r);
                            __CLR4_4_100lb90p64y.R.inc(44);r = f[i].value(r);
                        }
                        }__CLR4_4_100lb90p64y.R.inc(45);return p;
                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Adds functions.
     *
     * @param f List of functions.
     * @return a function that computes the sum of the functions.
     */
    public static UnivariateFunction add(final UnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(46);
        __CLR4_4_100lb90p64y.R.inc(47);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(48);
                __CLR4_4_100lb90p64y.R.inc(49);double r = f[0].value(x);
                __CLR4_4_100lb90p64y.R.inc(50);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(51)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(52)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(53);r += f[i].value(x);
                }
                }__CLR4_4_100lb90p64y.R.inc(54);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Adds functions.
     *
     * @param f List of functions.
     * @return a function that computes the sum of the functions.
     * @since 3.1
     */
    public static UnivariateDifferentiableFunction add(final UnivariateDifferentiableFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(55);
        __CLR4_4_100lb90p64y.R.inc(56);return new UnivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double t) {try{__CLR4_4_100lb90p64y.R.inc(57);
                __CLR4_4_100lb90p64y.R.inc(58);double r = f[0].value(t);
                __CLR4_4_100lb90p64y.R.inc(59);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(60)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(61)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(62);r += f[i].value(t);
                }
                }__CLR4_4_100lb90p64y.R.inc(63);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc}
             * @throws DimensionMismatchException if functions are not consistent with each other
             */
            public DerivativeStructure value(final DerivativeStructure t)
                throws DimensionMismatchException {try{__CLR4_4_100lb90p64y.R.inc(64);
                __CLR4_4_100lb90p64y.R.inc(65);DerivativeStructure r = f[0].value(t);
                __CLR4_4_100lb90p64y.R.inc(66);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(67)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(68)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(69);r = r.add(f[i].value(t));
                }
                }__CLR4_4_100lb90p64y.R.inc(70);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Adds functions.
     *
     * @param f List of functions.
     * @return a function that computes the sum of the functions.
     * @deprecated as of 3.1 replaced by {@link #add(UnivariateDifferentiableFunction...)}
     */
    @Deprecated
    public static DifferentiableUnivariateFunction add(final DifferentiableUnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(71);
        __CLR4_4_100lb90p64y.R.inc(72);return new DifferentiableUnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(73);
                __CLR4_4_100lb90p64y.R.inc(74);double r = f[0].value(x);
                __CLR4_4_100lb90p64y.R.inc(75);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(76)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(77)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(78);r += f[i].value(x);
                }
                }__CLR4_4_100lb90p64y.R.inc(79);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public UnivariateFunction derivative() {try{__CLR4_4_100lb90p64y.R.inc(80);
                __CLR4_4_100lb90p64y.R.inc(81);return new UnivariateFunction() {
                    /** {@inheritDoc} */
                    public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(82);
                        __CLR4_4_100lb90p64y.R.inc(83);double r = f[0].derivative().value(x);
                        __CLR4_4_100lb90p64y.R.inc(84);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(85)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(86)==0&false)); i++) {{
                            __CLR4_4_100lb90p64y.R.inc(87);r += f[i].derivative().value(x);
                        }
                        }__CLR4_4_100lb90p64y.R.inc(88);return r;
                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Multiplies functions.
     *
     * @param f List of functions.
     * @return a function that computes the product of the functions.
     */
    public static UnivariateFunction multiply(final UnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(89);
        __CLR4_4_100lb90p64y.R.inc(90);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(91);
                __CLR4_4_100lb90p64y.R.inc(92);double r = f[0].value(x);
                __CLR4_4_100lb90p64y.R.inc(93);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(94)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(95)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(96);r *= f[i].value(x);
                }
                }__CLR4_4_100lb90p64y.R.inc(97);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Multiplies functions.
     *
     * @param f List of functions.
     * @return a function that computes the product of the functions.
     * @since 3.1
     */
    public static UnivariateDifferentiableFunction multiply(final UnivariateDifferentiableFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(98);
        __CLR4_4_100lb90p64y.R.inc(99);return new UnivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double t) {try{__CLR4_4_100lb90p64y.R.inc(100);
                __CLR4_4_100lb90p64y.R.inc(101);double r = f[0].value(t);
                __CLR4_4_100lb90p64y.R.inc(102);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(103)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(104)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(105);r  *= f[i].value(t);
                }
                }__CLR4_4_100lb90p64y.R.inc(106);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure value(final DerivativeStructure t) {try{__CLR4_4_100lb90p64y.R.inc(107);
                __CLR4_4_100lb90p64y.R.inc(108);DerivativeStructure r = f[0].value(t);
                __CLR4_4_100lb90p64y.R.inc(109);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(110)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(111)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(112);r = r.multiply(f[i].value(t));
                }
                }__CLR4_4_100lb90p64y.R.inc(113);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Multiplies functions.
     *
     * @param f List of functions.
     * @return a function that computes the product of the functions.
     * @deprecated as of 3.1 replaced by {@link #multiply(UnivariateDifferentiableFunction...)}
     */
    @Deprecated
    public static DifferentiableUnivariateFunction multiply(final DifferentiableUnivariateFunction ... f) {try{__CLR4_4_100lb90p64y.R.inc(114);
        __CLR4_4_100lb90p64y.R.inc(115);return new DifferentiableUnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(116);
                __CLR4_4_100lb90p64y.R.inc(117);double r = f[0].value(x);
                __CLR4_4_100lb90p64y.R.inc(118);for (int i = 1; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(119)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(120)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(121);r *= f[i].value(x);
                }
                }__CLR4_4_100lb90p64y.R.inc(122);return r;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public UnivariateFunction derivative() {try{__CLR4_4_100lb90p64y.R.inc(123);
                __CLR4_4_100lb90p64y.R.inc(124);return new UnivariateFunction() {
                    /** {@inheritDoc} */
                    public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(125);
                        __CLR4_4_100lb90p64y.R.inc(126);double sum = 0;
                        __CLR4_4_100lb90p64y.R.inc(127);for (int i = 0; (((i < f.length)&&(__CLR4_4_100lb90p64y.R.iget(128)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(129)==0&false)); i++) {{
                            __CLR4_4_100lb90p64y.R.inc(130);double prod = f[i].derivative().value(x);
                            __CLR4_4_100lb90p64y.R.inc(131);for (int j = 0; (((j < f.length)&&(__CLR4_4_100lb90p64y.R.iget(132)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(133)==0&false)); j++) {{
                                __CLR4_4_100lb90p64y.R.inc(134);if ((((i != j)&&(__CLR4_4_100lb90p64y.R.iget(135)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(136)==0&false))) {{
                                    __CLR4_4_100lb90p64y.R.inc(137);prod *= f[j].value(x);
                                }
                            }}
                            }__CLR4_4_100lb90p64y.R.inc(138);sum += prod;
                        }
                        }__CLR4_4_100lb90p64y.R.inc(139);return sum;
                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Returns the univariate function <br/>
     * {@code h(x) = combiner(f(x), g(x))}.
     *
     * @param combiner Combiner function.
     * @param f Function.
     * @param g Function.
     * @return the composite function.
     */
    public static UnivariateFunction combine(final BivariateFunction combiner,
                                             final UnivariateFunction f,
                                             final UnivariateFunction g) {try{__CLR4_4_100lb90p64y.R.inc(140);
        __CLR4_4_100lb90p64y.R.inc(141);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(142);
                __CLR4_4_100lb90p64y.R.inc(143);return combiner.value(f.value(x), g.value(x));
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Returns a MultivariateFunction h(x[]) defined by <pre> <code>
     * h(x[]) = combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))
     * </code></pre>
     *
     * @param combiner Combiner function.
     * @param f Function.
     * @param initialValue Initial value.
     * @return a collector function.
     */
    public static MultivariateFunction collector(final BivariateFunction combiner,
                                                 final UnivariateFunction f,
                                                 final double initialValue) {try{__CLR4_4_100lb90p64y.R.inc(144);
        __CLR4_4_100lb90p64y.R.inc(145);return new MultivariateFunction() {
            /** {@inheritDoc} */
            public double value(double[] point) {try{__CLR4_4_100lb90p64y.R.inc(146);
                __CLR4_4_100lb90p64y.R.inc(147);double result = combiner.value(initialValue, f.value(point[0]));
                __CLR4_4_100lb90p64y.R.inc(148);for (int i = 1; (((i < point.length)&&(__CLR4_4_100lb90p64y.R.iget(149)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(150)==0&false)); i++) {{
                    __CLR4_4_100lb90p64y.R.inc(151);result = combiner.value(result, f.value(point[i]));
                }
                }__CLR4_4_100lb90p64y.R.inc(152);return result;
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Returns a MultivariateFunction h(x[]) defined by <pre> <code>
     * h(x[]) = combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])
     * </code></pre>
     *
     * @param combiner Combiner function.
     * @param initialValue Initial value.
     * @return a collector function.
     */
    public static MultivariateFunction collector(final BivariateFunction combiner,
                                                 final double initialValue) {try{__CLR4_4_100lb90p64y.R.inc(153);
        __CLR4_4_100lb90p64y.R.inc(154);return collector(combiner, new Identity(), initialValue);
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Creates a unary function by fixing the first argument of a binary function.
     *
     * @param f Binary function.
     * @param fixed Value to which the first argument of {@code f} is set.
     * @return the unary function h(x) = f(fixed, x)
     */
    public static UnivariateFunction fix1stArgument(final BivariateFunction f,
                                                    final double fixed) {try{__CLR4_4_100lb90p64y.R.inc(155);
        __CLR4_4_100lb90p64y.R.inc(156);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(157);
                __CLR4_4_100lb90p64y.R.inc(158);return f.value(fixed, x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
    /**
     * Creates a unary function by fixing the second argument of a binary function.
     *
     * @param f Binary function.
     * @param fixed Value to which the second argument of {@code f} is set.
     * @return the unary function h(x) = f(x, fixed)
     */
    public static UnivariateFunction fix2ndArgument(final BivariateFunction f,
                                                    final double fixed) {try{__CLR4_4_100lb90p64y.R.inc(159);
        __CLR4_4_100lb90p64y.R.inc(160);return new UnivariateFunction() {
            /** {@inheritDoc} */
            public double value(double x) {try{__CLR4_4_100lb90p64y.R.inc(161);
                __CLR4_4_100lb90p64y.R.inc(162);return f.value(x, fixed);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /**
     * Samples the specified univariate real function on the specified interval.
     * <br/>
     * The interval is divided equally into {@code n} sections and sample points
     * are taken from {@code min} to {@code max - (max - min) / n}; therefore
     * {@code f} is not sampled at the upper bound {@code max}.
     *
     * @param f Function to be sampled
     * @param min Lower bound of the interval (included).
     * @param max Upper bound of the interval (excluded).
     * @param n Number of sample points.
     * @return the array of samples.
     * @throws NumberIsTooLargeException if the lower bound {@code min} is
     * greater than, or equal to the upper bound {@code max}.
     * @throws NotStrictlyPositiveException if the number of sample points
     * {@code n} is negative.
     */
    public static double[] sample(UnivariateFunction f, double min, double max, int n)
       throws NumberIsTooLargeException, NotStrictlyPositiveException {try{__CLR4_4_100lb90p64y.R.inc(163);

        __CLR4_4_100lb90p64y.R.inc(164);if ((((n <= 0)&&(__CLR4_4_100lb90p64y.R.iget(165)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(166)==0&false))) {{
            __CLR4_4_100lb90p64y.R.inc(167);throw new NotStrictlyPositiveException(
                    LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES,
                    Integer.valueOf(n));
        }
        }__CLR4_4_100lb90p64y.R.inc(168);if ((((min >= max)&&(__CLR4_4_100lb90p64y.R.iget(169)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(170)==0&false))) {{
            __CLR4_4_100lb90p64y.R.inc(171);throw new NumberIsTooLargeException(min, max, false);
        }

        }__CLR4_4_100lb90p64y.R.inc(172);final double[] s = new double[n];
        __CLR4_4_100lb90p64y.R.inc(173);final double h = (max - min) / n;
        __CLR4_4_100lb90p64y.R.inc(174);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(175)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(176)==0&false)); i++) {{
            __CLR4_4_100lb90p64y.R.inc(177);s[i] = f.value(min + i * h);
        }
        }__CLR4_4_100lb90p64y.R.inc(178);return s;
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link UnivariateDifferentiableFunction} into a {@link DifferentiableUnivariateFunction}.
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableUnivariateFunction} interface itself is deprecated
     */
    @Deprecated
    public static DifferentiableUnivariateFunction toDifferentiableUnivariateFunction(final UnivariateDifferentiableFunction f) {try{__CLR4_4_100lb90p64y.R.inc(179);
        __CLR4_4_100lb90p64y.R.inc(180);return new DifferentiableUnivariateFunction() {

            /** {@inheritDoc} */
            public double value(final double x) {try{__CLR4_4_100lb90p64y.R.inc(181);
                __CLR4_4_100lb90p64y.R.inc(182);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public UnivariateFunction derivative() {try{__CLR4_4_100lb90p64y.R.inc(183);
                __CLR4_4_100lb90p64y.R.inc(184);return new UnivariateFunction() {
                    /** {@inheritDoc} */
                    public double value(final double x) {try{__CLR4_4_100lb90p64y.R.inc(185);
                        __CLR4_4_100lb90p64y.R.inc(186);return f.value(new DerivativeStructure(1, 1, 0, x)).getPartialDerivative(1);
                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link DifferentiableUnivariateFunction} into a {@link UnivariateDifferentiableFunction}.
     * <p>
     * Note that the converted function is able to handle {@link DerivativeStructure} up to order one.
     * If the function is called with higher order, a {@link NumberIsTooLargeException} will be thrown.
     * </p>
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableUnivariateFunction} interface itself is deprecated
     */
    @Deprecated
    public static UnivariateDifferentiableFunction toUnivariateDifferential(final DifferentiableUnivariateFunction f) {try{__CLR4_4_100lb90p64y.R.inc(187);
        __CLR4_4_100lb90p64y.R.inc(188);return new UnivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double x) {try{__CLR4_4_100lb90p64y.R.inc(189);
                __CLR4_4_100lb90p64y.R.inc(190);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc}
             * @exception NumberIsTooLargeException if derivation order is greater than 1
             */
            public DerivativeStructure value(final DerivativeStructure t)
                throws NumberIsTooLargeException {try{__CLR4_4_100lb90p64y.R.inc(191);
                boolean __CLB4_4_1_bool0=false;__CLR4_4_100lb90p64y.R.inc(192);switch (t.getOrder()) {
                    case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_100lb90p64y.R.inc(193);__CLB4_4_1_bool0=true;}
                        __CLR4_4_100lb90p64y.R.inc(194);return new DerivativeStructure(t.getFreeParameters(), 0, f.value(t.getValue()));
                    case 1 :if (!__CLB4_4_1_bool0) {__CLR4_4_100lb90p64y.R.inc(195);__CLB4_4_1_bool0=true;} {
                        __CLR4_4_100lb90p64y.R.inc(196);final int parameters = t.getFreeParameters();
                        __CLR4_4_100lb90p64y.R.inc(197);final double[] derivatives = new double[parameters + 1];
                        __CLR4_4_100lb90p64y.R.inc(198);derivatives[0] = f.value(t.getValue());
                        __CLR4_4_100lb90p64y.R.inc(199);final double fPrime = f.derivative().value(t.getValue());
                        __CLR4_4_100lb90p64y.R.inc(200);int[] orders = new int[parameters];
                        __CLR4_4_100lb90p64y.R.inc(201);for (int i = 0; (((i < parameters)&&(__CLR4_4_100lb90p64y.R.iget(202)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(203)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(204);orders[i] = 1;
                            __CLR4_4_100lb90p64y.R.inc(205);derivatives[i + 1] = fPrime * t.getPartialDerivative(orders);
                            __CLR4_4_100lb90p64y.R.inc(206);orders[i] = 0;
                        }
                        }__CLR4_4_100lb90p64y.R.inc(207);return new DerivativeStructure(parameters, 1, derivatives);
                    }
                    default :if (!__CLB4_4_1_bool0) {__CLR4_4_100lb90p64y.R.inc(208);__CLB4_4_1_bool0=true;}
                        __CLR4_4_100lb90p64y.R.inc(209);throw new NumberIsTooLargeException(t.getOrder(), 1, true);
                }
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link MultivariateDifferentiableFunction} into a {@link DifferentiableMultivariateFunction}.
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableMultivariateFunction} interface itself is deprecated
     */
    @Deprecated
    public static DifferentiableMultivariateFunction toDifferentiableMultivariateFunction(final MultivariateDifferentiableFunction f) {try{__CLR4_4_100lb90p64y.R.inc(210);
        __CLR4_4_100lb90p64y.R.inc(211);return new DifferentiableMultivariateFunction() {

            /** {@inheritDoc} */
            public double value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(212);
                __CLR4_4_100lb90p64y.R.inc(213);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc} */
            public MultivariateFunction partialDerivative(final int k) {try{__CLR4_4_100lb90p64y.R.inc(214);
                __CLR4_4_100lb90p64y.R.inc(215);return new MultivariateFunction() {
                    /** {@inheritDoc} */
                    public double value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(216);

                        __CLR4_4_100lb90p64y.R.inc(217);final int n = x.length;

                        // delegate computation to underlying function
                        __CLR4_4_100lb90p64y.R.inc(218);final DerivativeStructure[] dsX = new DerivativeStructure[n];
                        __CLR4_4_100lb90p64y.R.inc(219);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(220)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(221)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(222);if ((((i == k)&&(__CLR4_4_100lb90p64y.R.iget(223)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(224)==0&false))) {{
                                __CLR4_4_100lb90p64y.R.inc(225);dsX[i] = new DerivativeStructure(1, 1, 0, x[i]);
                            } }else {{
                                __CLR4_4_100lb90p64y.R.inc(226);dsX[i] = new DerivativeStructure(1, 1, x[i]);
                            }
                        }}
                        }__CLR4_4_100lb90p64y.R.inc(227);final DerivativeStructure y = f.value(dsX);

                        // extract partial derivative
                        __CLR4_4_100lb90p64y.R.inc(228);return y.getPartialDerivative(1);

                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            public MultivariateVectorFunction gradient() {try{__CLR4_4_100lb90p64y.R.inc(229);
                __CLR4_4_100lb90p64y.R.inc(230);return new MultivariateVectorFunction() {
                    /** {@inheritDoc} */
                    public double[] value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(231);

                        __CLR4_4_100lb90p64y.R.inc(232);final int n = x.length;

                        // delegate computation to underlying function
                        __CLR4_4_100lb90p64y.R.inc(233);final DerivativeStructure[] dsX = new DerivativeStructure[n];
                        __CLR4_4_100lb90p64y.R.inc(234);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(235)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(236)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(237);dsX[i] = new DerivativeStructure(n, 1, i, x[i]);
                        }
                        }__CLR4_4_100lb90p64y.R.inc(238);final DerivativeStructure y = f.value(dsX);

                        // extract gradient
                        __CLR4_4_100lb90p64y.R.inc(239);final double[] gradient = new double[n];
                        __CLR4_4_100lb90p64y.R.inc(240);final int[] orders = new int[n];
                        __CLR4_4_100lb90p64y.R.inc(241);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(242)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(243)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(244);orders[i]   = 1;
                            __CLR4_4_100lb90p64y.R.inc(245);gradient[i] = y.getPartialDerivative(orders);
                            __CLR4_4_100lb90p64y.R.inc(246);orders[i]   = 0;
                        }

                        }__CLR4_4_100lb90p64y.R.inc(247);return gradient;

                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link DifferentiableMultivariateFunction} into a {@link MultivariateDifferentiableFunction}.
     * <p>
     * Note that the converted function is able to handle {@link DerivativeStructure} elements
     * that all have the same number of free parameters and order, and with order at most 1.
     * If the function is called with inconsistent numbers of free parameters or higher order, a
     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.
     * </p>
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableMultivariateFunction} interface itself is deprecated
     */
    @Deprecated
    public static MultivariateDifferentiableFunction toMultivariateDifferentiableFunction(final DifferentiableMultivariateFunction f) {try{__CLR4_4_100lb90p64y.R.inc(248);
        __CLR4_4_100lb90p64y.R.inc(249);return new MultivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(250);
                __CLR4_4_100lb90p64y.R.inc(251);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc}
             * @exception NumberIsTooLargeException if derivation order is higher than 1
             * @exception DimensionMismatchException if numbers of free parameters are inconsistent
             */
            public DerivativeStructure value(final DerivativeStructure[] t)
                throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_100lb90p64y.R.inc(252);

                // check parameters and orders limits
                __CLR4_4_100lb90p64y.R.inc(253);final int parameters = t[0].getFreeParameters();
                __CLR4_4_100lb90p64y.R.inc(254);final int order      = t[0].getOrder();
                __CLR4_4_100lb90p64y.R.inc(255);final int n          = t.length;
                __CLR4_4_100lb90p64y.R.inc(256);if ((((order > 1)&&(__CLR4_4_100lb90p64y.R.iget(257)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(258)==0&false))) {{
                    __CLR4_4_100lb90p64y.R.inc(259);throw new NumberIsTooLargeException(order, 1, true);
                }

                // check all elements in the array are consistent
                }__CLR4_4_100lb90p64y.R.inc(260);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(261)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(262)==0&false)); ++i) {{
                    __CLR4_4_100lb90p64y.R.inc(263);if ((((t[i].getFreeParameters() != parameters)&&(__CLR4_4_100lb90p64y.R.iget(264)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(265)==0&false))) {{
                        __CLR4_4_100lb90p64y.R.inc(266);throw new DimensionMismatchException(t[i].getFreeParameters(), parameters);
                    }

                    }__CLR4_4_100lb90p64y.R.inc(267);if ((((t[i].getOrder() != order)&&(__CLR4_4_100lb90p64y.R.iget(268)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(269)==0&false))) {{
                        __CLR4_4_100lb90p64y.R.inc(270);throw new DimensionMismatchException(t[i].getOrder(), order);
                    }
                }}

                // delegate computation to underlying function
                }__CLR4_4_100lb90p64y.R.inc(271);final double[] point = new double[n];
                __CLR4_4_100lb90p64y.R.inc(272);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(273)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(274)==0&false)); ++i) {{
                    __CLR4_4_100lb90p64y.R.inc(275);point[i] = t[i].getValue();
                }
                }__CLR4_4_100lb90p64y.R.inc(276);final double value      = f.value(point);
                __CLR4_4_100lb90p64y.R.inc(277);final double[] gradient = f.gradient().value(point);

                // merge value and gradient into one DerivativeStructure
                __CLR4_4_100lb90p64y.R.inc(278);final double[] derivatives = new double[parameters + 1];
                __CLR4_4_100lb90p64y.R.inc(279);derivatives[0] = value;
                __CLR4_4_100lb90p64y.R.inc(280);final int[] orders = new int[parameters];
                __CLR4_4_100lb90p64y.R.inc(281);for (int i = 0; (((i < parameters)&&(__CLR4_4_100lb90p64y.R.iget(282)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(283)==0&false)); ++i) {{
                    __CLR4_4_100lb90p64y.R.inc(284);orders[i] = 1;
                    __CLR4_4_100lb90p64y.R.inc(285);for (int j = 0; (((j < n)&&(__CLR4_4_100lb90p64y.R.iget(286)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(287)==0&false)); ++j) {{
                        __CLR4_4_100lb90p64y.R.inc(288);derivatives[i + 1] += gradient[j] * t[j].getPartialDerivative(orders);
                    }
                    }__CLR4_4_100lb90p64y.R.inc(289);orders[i] = 0;
                }

                }__CLR4_4_100lb90p64y.R.inc(290);return new DerivativeStructure(parameters, order, derivatives);

            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link MultivariateDifferentiableVectorFunction} into a {@link DifferentiableMultivariateVectorFunction}.
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableMultivariateVectorFunction} interface itself is deprecated
     */
    @Deprecated
    public static DifferentiableMultivariateVectorFunction toDifferentiableMultivariateVectorFunction(final MultivariateDifferentiableVectorFunction f) {try{__CLR4_4_100lb90p64y.R.inc(291);
        __CLR4_4_100lb90p64y.R.inc(292);return new DifferentiableMultivariateVectorFunction() {

            /** {@inheritDoc} */
            public double[] value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(293);
                __CLR4_4_100lb90p64y.R.inc(294);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            public MultivariateMatrixFunction jacobian() {try{__CLR4_4_100lb90p64y.R.inc(295);
                __CLR4_4_100lb90p64y.R.inc(296);return new MultivariateMatrixFunction() {
                    /** {@inheritDoc} */
                    public double[][] value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(297);

                        __CLR4_4_100lb90p64y.R.inc(298);final int n = x.length;

                        // delegate computation to underlying function
                        __CLR4_4_100lb90p64y.R.inc(299);final DerivativeStructure[] dsX = new DerivativeStructure[n];
                        __CLR4_4_100lb90p64y.R.inc(300);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(301)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(302)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(303);dsX[i] = new DerivativeStructure(n, 1, i, x[i]);
                        }
                        }__CLR4_4_100lb90p64y.R.inc(304);final DerivativeStructure[] y = f.value(dsX);

                        // extract Jacobian
                        __CLR4_4_100lb90p64y.R.inc(305);final double[][] jacobian = new double[y.length][n];
                        __CLR4_4_100lb90p64y.R.inc(306);final int[] orders = new int[n];
                        __CLR4_4_100lb90p64y.R.inc(307);for (int i = 0; (((i < y.length)&&(__CLR4_4_100lb90p64y.R.iget(308)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(309)==0&false)); ++i) {{
                            __CLR4_4_100lb90p64y.R.inc(310);for (int j = 0; (((j < n)&&(__CLR4_4_100lb90p64y.R.iget(311)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(312)==0&false)); ++j) {{
                                __CLR4_4_100lb90p64y.R.inc(313);orders[j]      = 1;
                                __CLR4_4_100lb90p64y.R.inc(314);jacobian[i][j] = y[i].getPartialDerivative(orders);
                                __CLR4_4_100lb90p64y.R.inc(315);orders[j]      = 0;
                            }
                        }}

                        }__CLR4_4_100lb90p64y.R.inc(316);return jacobian;

                    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}
                };
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

    /** Convert a {@link DifferentiableMultivariateVectorFunction} into a {@link MultivariateDifferentiableVectorFunction}.
     * <p>
     * Note that the converted function is able to handle {@link DerivativeStructure} elements
     * that all have the same number of free parameters and order, and with order at most 1.
     * If the function is called with inconsistent numbers of free parameters or higher order, a
     * {@link DimensionMismatchException} or a {@link NumberIsTooLargeException} will be thrown.
     * </p>
     * @param f function to convert
     * @return converted function
     * @deprecated this conversion method is temporary in version 3.1, as the {@link
     * DifferentiableMultivariateFunction} interface itself is deprecated
     */
    @Deprecated
    public static MultivariateDifferentiableVectorFunction toMultivariateDifferentiableVectorFunction(final DifferentiableMultivariateVectorFunction f) {try{__CLR4_4_100lb90p64y.R.inc(317);
        __CLR4_4_100lb90p64y.R.inc(318);return new MultivariateDifferentiableVectorFunction() {

            /** {@inheritDoc} */
            public double[] value(final double[] x) {try{__CLR4_4_100lb90p64y.R.inc(319);
                __CLR4_4_100lb90p64y.R.inc(320);return f.value(x);
            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

            /** {@inheritDoc}
             * @exception NumberIsTooLargeException if derivation order is higher than 1
             * @exception DimensionMismatchException if numbers of free parameters are inconsistent
             */
            public DerivativeStructure[] value(final DerivativeStructure[] t)
                throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_100lb90p64y.R.inc(321);

                // check parameters and orders limits
                __CLR4_4_100lb90p64y.R.inc(322);final int parameters = t[0].getFreeParameters();
                __CLR4_4_100lb90p64y.R.inc(323);final int order      = t[0].getOrder();
                __CLR4_4_100lb90p64y.R.inc(324);final int n          = t.length;
                __CLR4_4_100lb90p64y.R.inc(325);if ((((order > 1)&&(__CLR4_4_100lb90p64y.R.iget(326)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(327)==0&false))) {{
                    __CLR4_4_100lb90p64y.R.inc(328);throw new NumberIsTooLargeException(order, 1, true);
                }

                // check all elements in the array are consistent
                }__CLR4_4_100lb90p64y.R.inc(329);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(330)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(331)==0&false)); ++i) {{
                    __CLR4_4_100lb90p64y.R.inc(332);if ((((t[i].getFreeParameters() != parameters)&&(__CLR4_4_100lb90p64y.R.iget(333)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(334)==0&false))) {{
                        __CLR4_4_100lb90p64y.R.inc(335);throw new DimensionMismatchException(t[i].getFreeParameters(), parameters);
                    }

                    }__CLR4_4_100lb90p64y.R.inc(336);if ((((t[i].getOrder() != order)&&(__CLR4_4_100lb90p64y.R.iget(337)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(338)==0&false))) {{
                        __CLR4_4_100lb90p64y.R.inc(339);throw new DimensionMismatchException(t[i].getOrder(), order);
                    }
                }}

                // delegate computation to underlying function
                }__CLR4_4_100lb90p64y.R.inc(340);final double[] point = new double[n];
                __CLR4_4_100lb90p64y.R.inc(341);for (int i = 0; (((i < n)&&(__CLR4_4_100lb90p64y.R.iget(342)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(343)==0&false)); ++i) {{
                    __CLR4_4_100lb90p64y.R.inc(344);point[i] = t[i].getValue();
                }
                }__CLR4_4_100lb90p64y.R.inc(345);final double[] value      = f.value(point);
                __CLR4_4_100lb90p64y.R.inc(346);final double[][] jacobian = f.jacobian().value(point);

                // merge value and Jacobian into a DerivativeStructure array
                __CLR4_4_100lb90p64y.R.inc(347);final DerivativeStructure[] merged = new DerivativeStructure[value.length];
                __CLR4_4_100lb90p64y.R.inc(348);for (int k = 0; (((k < merged.length)&&(__CLR4_4_100lb90p64y.R.iget(349)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(350)==0&false)); ++k) {{
                    __CLR4_4_100lb90p64y.R.inc(351);final double[] derivatives = new double[parameters + 1];
                    __CLR4_4_100lb90p64y.R.inc(352);derivatives[0] = value[k];
                    __CLR4_4_100lb90p64y.R.inc(353);final int[] orders = new int[parameters];
                    __CLR4_4_100lb90p64y.R.inc(354);for (int i = 0; (((i < parameters)&&(__CLR4_4_100lb90p64y.R.iget(355)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(356)==0&false)); ++i) {{
                        __CLR4_4_100lb90p64y.R.inc(357);orders[i] = 1;
                        __CLR4_4_100lb90p64y.R.inc(358);for (int j = 0; (((j < n)&&(__CLR4_4_100lb90p64y.R.iget(359)!=0|true))||(__CLR4_4_100lb90p64y.R.iget(360)==0&false)); ++j) {{
                            __CLR4_4_100lb90p64y.R.inc(361);derivatives[i + 1] += jacobian[k][j] * t[j].getPartialDerivative(orders);
                        }
                        }__CLR4_4_100lb90p64y.R.inc(362);orders[i] = 0;
                    }
                    }__CLR4_4_100lb90p64y.R.inc(363);merged[k] = new DerivativeStructure(parameters, order, derivatives);
                }

                }__CLR4_4_100lb90p64y.R.inc(364);return merged;

            }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

        };
    }finally{__CLR4_4_100lb90p64y.R.flushNeeded();}}

}
