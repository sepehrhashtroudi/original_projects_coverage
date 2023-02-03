/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.commons.math3.linear;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.RealVector.Entry;
import org.junit.Assert;
import org.junit.Test;

/**
 * This is an abstract test of the {@link
 * RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}
 * implementation. These unmodifiable vectors decorate a (modifiable)
 * {@link RealVector}; therefore, a new implementation of this abstract
 * test should be considered for each implementation of
 * {@link RealVector}.
 *
 * @version $Id$
 *
 */
public abstract class UnmodifiableRealVectorAbstractTest {static class __CLR4_4_11xsh1xshlb90pdfn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90743,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The dimension of the randomly generated vectors. */
    protected static final int DIM = 100;
    /** Absolute tolerance. */
    protected static final double EPS = 10 * Math.ulp(1d);
    /**
     * The list of methods which are excluded from the general test
     * {@link #testAllButExcluded()}.
     */
    protected static final Set<String> EXCLUDE = new HashSet<String>();
    /** The random number generator (always initialized with the same seed. */
    protected static final Random RANDOM;

    static {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90449);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90450);EXCLUDE.add("getEntry");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90451);EXCLUDE.add("setEntry");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90452);EXCLUDE.add("addToEntry");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90453);EXCLUDE.add("getSubVector");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90454);EXCLUDE.add("setSubVector");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90455);EXCLUDE.add("iterator");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90456);EXCLUDE.add("sparseIterator");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90457);EXCLUDE.add("walkInDefaultOrder");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90458);EXCLUDE.add("walkInOptimizedOrder");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90459);EXCLUDE.add("ebeDivide");
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90460);EXCLUDE.add("ebeMultiply");

        // Excluded because they are inherited from "Object".
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90461);for (Method m : Object.class.getMethods()) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90462);EXCLUDE.add(m.getName());
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90463);RANDOM = new Random(20110813);
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code double} are equal (within a
     * given tolerance).
     *
     * @param x First {@code double}.
     * @param y Second {@code double}.
     * @return {@code true} if {@code x} and {@code y} are equal.
     */
    public static boolean equals(final double x, final double y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90464);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90465);if ((((x == y)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90466)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90467)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90468);return true;
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90469);if ((((Math.abs(x) <= EPS)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90470)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90471)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90472);return Math.abs(y) <= EPS;
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90473);if ((((Math.abs(y) <= EPS)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90474)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90475)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90476);return Math.abs(x) <= EPS;
        } }else {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90477);return Math.abs(x - y) <= EPS * Math.min(Math.abs(x), Math.abs(y));
        }
    }}}}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code double} arrays are equal
     * (within a given tolerance).
     *
     * @param x First array.
     * @param y Second array.
     * @return {@code true} if {@code x} and {@code y} are equal.
     */
    public static boolean equals(final double[] x, final double[] y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90478);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90479);if ((((x.length != y.length)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90480)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90481)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90482);return false;
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90483);final int n = x.length;
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90484);for (int i = 0; (((i < n)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90485)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90486)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90487);if ((((!equals(x[i], y[i]))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90488)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90489)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90490);return false;
            }
        }}
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90491);return true;
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code RealVector} are equal
     * (within a given tolerance).
     *
     * @param x First vector.
     * @param y Second vector.
     * @return {@code true} if {@code x} and {@code y} are equal.
     */
    public static boolean equals(final RealVector x, final RealVector y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90492);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90493);if ((((x.getDimension() != y.getDimension())&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90494)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90495)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90496);return false;
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90497);final int n = x.getDimension();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90498);for (int i = 0; (((i < n)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90499)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90500)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90501);if ((((!equals(x.getEntry(i), y.getEntry(i)))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90502)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90503)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90504);return false;
            }
        }}
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90505);return true;
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code RealVector} is equal to the
     * specified {@code double} array (within a given tolerance).
     *
     * @param x Vector.
     * @param y Array.
     * @return {@code true} if {@code x} and {@code y} are equal.
     */
    public static boolean equals(final RealVector x, final double[] y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90506);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90507);if ((((x.getDimension() != y.length)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90508)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90509)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90510);return false;
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90511);final int n = x.getDimension();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90512);for (int i = 0; (((i < n)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90513)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90514)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90515);if ((((!equals(x.getEntry(i), y[i]))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90516)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90517)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90518);return false;
            }
        }}
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90519);return true;
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code RealMatrix} are equal
     * (within a given tolerance).
     *
     * @param x First matrix.
     * @param y Second matrix.
     * @return {@code true} if {@code x} and {@code y} are equal.
     */
    public static boolean equals(final RealMatrix x, final RealMatrix y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90520);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90521);if ((((x.getRowDimension() != y.getRowDimension())&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90522)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90523)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90524);return false;
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90525);if ((((x.getColumnDimension() != y.getColumnDimension())&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90526)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90527)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90528);return false;
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90529);final int rows = x.getRowDimension();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90530);final int cols = x.getColumnDimension();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90531);for (int i = 0; (((i < rows)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90532)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90533)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90534);for (int j = 0; (((j < cols)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90535)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90536)==0&false)); j++) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90537);if ((((!equals(x.getEntry(i, j), y.getEntry(i, j)))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90538)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90539)==0&false))) {{
                    __CLR4_4_11xsh1xshlb90pdfn.R.inc(90540);return false;
                }
            }}
        }}
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90541);return true;
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Returns {@code true} if the specified {@code Object} are equal.
     *
     * @param x First object.
     * @param y Second object.
     * @return {@code true} if {@code x} and {@code y} are equal.
     * @throws IllegalArgumentException if {@code x} and {@code y} could
     * not be compared.
     */
    public static boolean equals(final Object x, final Object y) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90542);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90543);if ((((x instanceof Boolean)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90544)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90545)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90546);if ((((y instanceof Boolean)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90547)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90548)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90549);return ((Boolean) x).booleanValue() == ((Boolean) y)
                        .booleanValue();
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90550);return false;
            }
        }}
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90551);if ((((x instanceof Integer)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90552)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90553)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90554);if ((((y instanceof Integer)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90555)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90556)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90557);return ((Integer) x).intValue() == ((Integer) y).intValue();
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90558);return false;
            }
        }} }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90559);if ((((x instanceof Double)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90560)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90561)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90562);if ((((y instanceof Double)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90563)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90564)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90565);return equals(((Double) x).doubleValue(),
                        ((Double) y).doubleValue());
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90566);return false;
            }
        }} }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90567);if ((((x instanceof double[])&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90568)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90569)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90570);if ((((y instanceof double[])&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90571)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90572)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90573);return equals((double[]) x, (double[]) y);
            } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90574);if ((((y instanceof RealVector)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90575)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90576)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90577);return equals((RealVector) y, (double[]) x);
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90578);return false;
            }
        }}} }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90579);if ((((x instanceof RealVector)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90580)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90581)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90582);if ((((y instanceof double[])&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90583)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90584)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90585);return equals((RealVector) x, (double[]) y);
            } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90586);if ((((y instanceof RealVector)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90587)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90588)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90589);return equals((RealVector) x, (RealVector) y);
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90590);return false;
            }
        }}} }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90591);if ((((x instanceof RealMatrix)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90592)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90593)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90594);if ((((y instanceof RealMatrix)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90595)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90596)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90597);return equals((RealMatrix) x, (RealMatrix) y);
            } }else {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90598);return false;
            }
        }} }else {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90599);throw new IllegalArgumentException("could not compare " + x + ", "
                    + y);
        }
    }}}}}}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * Creates a new random vector of a specified type. This vector is then to
     * be wrapped in an unmodifiable vector.
     *
     * @return a new random vector.
     */
    public abstract RealVector createVector();

    /**
     * Creates a new random object of the specified type.
     *
     * @param c Class of the object to be created.
     * @return a new random object.
     * @throws IllegalArgumentException if the specified class is not
     * recognized by this method.
     */
    public Object createParameter(final Class<?> c) {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90600);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90601);if ((((c == Integer.TYPE)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90602)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90603)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90604);return Integer.valueOf(RANDOM.nextInt());
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90605);if ((((c == Double.TYPE)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90606)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90607)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90608);return Double.valueOf(RANDOM.nextDouble());
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90609);if ((((c == double[].class)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90610)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90611)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90612);final double[] v = new double[DIM];
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90613);for (int i = 0; (((i < DIM)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90614)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90615)==0&false)); i++) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90616);v[i] = RANDOM.nextDouble();
            }
            }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90617);return v;
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90618);if ((((c.isAssignableFrom(RealVector.class))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90619)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90620)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90621);return createVector();
        } }else {__CLR4_4_11xsh1xshlb90pdfn.R.inc(90622);if ((((c.isAssignableFrom(UnivariateFunction.class))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90623)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90624)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90625);return new Sin();
        } }else {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90626);throw new IllegalArgumentException("could not create " + c);
        }
    }}}}}}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * This is the general test of most methods in the
     * {@link RealVector#unmodifiableRealVector(RealVector) unmodifiable vector}.
     * It works as follows.
     * First, an unmodifiable view of a copy of the specified random vector
     * {@code u} is created: this defines {@code v}. Then the <em>same</em>
     * method {@code m} is invoked on {@code u} and {@code v}, with randomly
     * generated parameters {@code args}.
     * If it turns out that {@code u} has changed after the call of method
     * {@code m}, then this test checks that the call of this method on
     * {@code v} resulted in a {@link MathUnsupportedOperationException}. If
     * {@code u} was not modified, then this test checks that the results
     * returned by the call of method {@code m} on {@code u} and {@code v}
     * returned the same result.
     *
     * @param m Method to be tested.
     * @param u Random vector from which the unmodifiable view is to be
     *constructed.
     * @param args Arguments to be passed to method {@code m}.
     */
    private void callMethod(final Method m,
                            final RealVector u,
                            final Object... args)
        throws IllegalAccessException,
               IllegalArgumentException,
               InvocationTargetException {try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90627);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90628);final RealVector uu = u.copy();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90629);final RealVector v = RealVector.unmodifiableRealVector(u.copy());
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90630);Object exp = m.invoke(u, args);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90631);if ((((equals(uu, u))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90632)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90633)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90634);Object act = m.invoke(v, args);
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90635);Assert.assertTrue(m.toGenericString() + ", unmodifiable vector has changed",
                              equals(uu, v));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90636);Assert.assertTrue(m.toGenericString() + ", wrong result",
                              equals(exp, act));

        } }else {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90637);boolean flag = false;
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90638);try {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90639);m.invoke(v, args);
            } catch (InvocationTargetException e) {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90640);if ((((e.getCause() instanceof MathUnsupportedOperationException)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90641)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90642)==0&false))) {{
                    __CLR4_4_11xsh1xshlb90pdfn.R.inc(90643);flag = true;
                }
            }}
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90644);Assert.assertTrue(m.toGenericString()+", exception should have been thrown", flag);
        }
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    /**
     * This test calls {@link #callMethod(Method, RealVector, Object...)} on
     * every method defined in interface {@link RealVector}. It generates the
     * appropriate random arguments. Some methods are manually excluded (see
     * {@link #EXCLUDE}), they must be handled by separate tests.
     */
    @Test
    public void testAllButExcluded()
        throws IllegalAccessException,
               IllegalArgumentException,
               InvocationTargetException {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x4cyd91xxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAllButExcluded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x4cyd91xxx() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90645);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90646);Method[] method = RealVector.class.getMethods();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90647);for (int i = 0; (((i < method.length)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90648)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90649)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90650);Method m = method[i];
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90651);if ((((!EXCLUDE.contains(m.getName()))&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90652)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90653)==0&false))) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90654);RealVector u = (RealVector) createParameter(RealVector.class);
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90655);Class<?>[] paramType = m.getParameterTypes();
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90656);Object[] param = new Object[paramType.length];
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90657);for (int j = 0; (((j < paramType.length)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90658)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90659)==0&false)); j++) {{
                    __CLR4_4_11xsh1xshlb90pdfn.R.inc(90660);param[j] = createParameter(paramType[j]);
                }
                }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90661);callMethod(m, u, param);
            }
        }}
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test
    public void testGetEntry() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kt3pn1xye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kt3pn1xye(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90662);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90663);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90664);RealVector v = RealVector.unmodifiableRealVector(u);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90665);for (int i = 0; (((i < DIM)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90666)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90667)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90668);Assert.assertTrue(equals(u.getEntry(i), v.getEntry(i)));
        }
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test(expected = MathUnsupportedOperationException.class)
    public void testSetEntry() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayxmuh1xyl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,69,110,116,114,121,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayxmuh1xyl(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90669);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90670);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90671);RealVector v = RealVector.unmodifiableRealVector(u);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90672);for (int i = 0; (((i < DIM)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90673)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90674)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90675);v.setEntry(i, 0d);
        }
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test(expected = MathUnsupportedOperationException.class)
    public void testAddToEntry() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8achd1xys();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,84,111,69,110,116,114,121,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testAddToEntry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8achd1xys(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90676);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90677);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90678);RealVector v = RealVector.unmodifiableRealVector(u);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90679);for (int i = 0; (((i < DIM)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90680)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90681)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90682);v.addToEntry(i, 0d);
        }
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test
    public void testGetSubVector() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1v7ra1xyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testGetSubVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1v7ra1xyz(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90683);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90684);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90685);RealVector v = RealVector.unmodifiableRealVector(u);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90686);for (int i = 0; (((i < DIM)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90687)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90688)==0&false)); i++) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90689);for (int n = 1; (((n < DIM - i)&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90690)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90691)==0&false)); n++) {{
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90692);RealVector exp = u.getSubVector(i, n);
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90693);RealVector act = v.getSubVector(i, n);
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90694);Assert.assertTrue(equals(exp, act));
            }
        }}
    }}finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test(expected = MathUnsupportedOperationException.class)
    public void testSetSubVector() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rw4l521xzb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,83,117,98,86,101,99,116,111,114,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSetSubVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rw4l521xzb(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90695);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90696);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90697);RealVector v = RealVector.unmodifiableRealVector(u);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90698);v.setSubVector(0, new ArrayRealVector());
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn1xzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn1xzf(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90699);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90700);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90701);Iterator<Entry> i = u.iterator();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90702);RealVector v = RealVector.unmodifiableRealVector(u.copy());
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90703);Iterator<Entry> j = v.iterator();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90704);boolean flag;
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90705);while ((((i.hasNext())&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90706)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90707)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90708);Assert.assertTrue(j.hasNext());
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90709);Entry exp = i.next();
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90710);Entry act = j.next();
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90711);Assert.assertTrue(equals(exp.getIndex(), act.getIndex()));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90712);Assert.assertTrue(equals(exp.getValue(), act.getValue()));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90713);exp.setIndex(RANDOM.nextInt(DIM));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90714);act.setIndex(RANDOM.nextInt(DIM));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90715);flag = false;
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90716);try {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90717);act.setValue(RANDOM.nextDouble());
            } catch (MathUnsupportedOperationException e) {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90718);flag = true;
            }
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90719);Assert.assertTrue("exception should have been thrown", flag);
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90720);Assert.assertFalse(j.hasNext());
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}

    @Test
    public void testSparseIterator() {__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceStart(getClass().getName(),90721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmkbmh1y01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xsh1xshlb90pdfn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xsh1xshlb90pdfn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.UnmodifiableRealVectorAbstractTest.testSparseIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmkbmh1y01(){try{__CLR4_4_11xsh1xshlb90pdfn.R.inc(90721);
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90722);RealVector u = createVector();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90723);Iterator<Entry> i = u.sparseIterator();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90724);RealVector v = RealVector.unmodifiableRealVector(u.copy());
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90725);Iterator<Entry> j = v.sparseIterator();
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90726);boolean flag;
        __CLR4_4_11xsh1xshlb90pdfn.R.inc(90727);while ((((i.hasNext())&&(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90728)!=0|true))||(__CLR4_4_11xsh1xshlb90pdfn.R.iget(90729)==0&false))) {{
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90730);Assert.assertTrue(j.hasNext());
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90731);Entry exp = i.next();
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90732);Entry act = j.next();
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90733);Assert.assertTrue(equals(exp.getIndex(), act.getIndex()));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90734);Assert.assertTrue(equals(exp.getValue(), act.getValue()));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90735);exp.setIndex(RANDOM.nextInt(DIM));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90736);act.setIndex(RANDOM.nextInt(DIM));
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90737);flag = false;
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90738);try {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90739);act.setValue(RANDOM.nextDouble());
            } catch (MathUnsupportedOperationException e) {
                __CLR4_4_11xsh1xshlb90pdfn.R.inc(90740);flag = true;
            }
            __CLR4_4_11xsh1xshlb90pdfn.R.inc(90741);Assert.assertTrue("exception should have been thrown", flag);
        }
        }__CLR4_4_11xsh1xshlb90pdfn.R.inc(90742);Assert.assertFalse(j.hasNext());
    }finally{__CLR4_4_11xsh1xshlb90pdfn.R.flushNeeded();}}
}
