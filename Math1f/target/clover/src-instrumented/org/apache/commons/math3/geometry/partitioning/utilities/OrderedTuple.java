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

import java.util.Arrays;

import org.apache.commons.math3.util.FastMath;

/** This class implements an ordering operation for T-uples.
 *
 * <p>Ordering is done by encoding all components of the T-uple into a
 * single scalar value and using this value as the sorting
 * key. Encoding is performed using the method invented by Georg
 * Cantor in 1877 when he proved it was possible to establish a
 * bijection between a line and a plane. The binary representations of
 * the components of the T-uple are mixed together to form a single
 * scalar. This means that the 2<sup>k</sup> bit of component 0 is
 * followed by the 2<sup>k</sup> bit of component 1, then by the
 * 2<sup>k</sup> bit of component 2 up to the 2<sup>k</sup> bit of
 * component {@code t}, which is followed by the 2<sup>k-1</sup>
 * bit of component 0, followed by the 2<sup>k-1</sup> bit of
 * component 1 ... The binary representations are extended as needed
 * to handle numbers with different scales and a suitable
 * 2<sup>p</sup> offset is added to the components in order to avoid
 * negative numbers (this offset is adjusted as needed during the
 * comparison operations).</p>
 *
 * <p>The more interesting property of the encoding method for our
 * purpose is that it allows to select all the points that are in a
 * given range. This is depicted in dimension 2 by the following
 * picture:</p>
 *
 * <img src="doc-files/OrderedTuple.png" />
 *
 * <p>This picture shows a set of 100000 random 2-D pairs having their
 * first component between -50 and +150 and their second component
 * between -350 and +50. We wanted to extract all pairs having their
 * first component between +30 and +70 and their second component
 * between -120 and -30. We built the lower left point at coordinates
 * (30, -120) and the upper right point at coordinates (70, -30). All
 * points smaller than the lower left point are drawn in red and all
 * points larger than the upper right point are drawn in blue. The
 * green points are between the two limits. This picture shows that
 * all the desired points are selected, along with spurious points. In
 * this case, we get 15790 points, 4420 of which really belonging to
 * the desired rectangle. It is possible to extract very small
 * subsets. As an example extracting from the same 100000 points set
 * the points having their first component between +30 and +31 and
 * their second component between -91 and -90, we get a subset of 11
 * points, 2 of which really belonging to the desired rectangle.</p>
 *
 * <p>the previous selection technique can be applied in all
 * dimensions, still using two points to define the interval. The
 * first point will have all its components set to their lower bounds
 * while the second point will have all its components set to their
 * upper bounds.</p>
 *
 * <p>T-uples with negative infinite or positive infinite components
 * are sorted logically.</p>
 *
 * <p>Since the specification of the {@code Comparator} interface
 * allows only {@code ClassCastException} errors, some arbitrary
 * choices have been made to handle specific cases. The rationale for
 * these choices is to keep <em>regular</em> and consistent T-uples
 * together.</p>
 * <ul>
 * <li>instances with different dimensions are sorted according to
 * their dimension regardless of their components values</li>
 * <li>instances with {@code Double.NaN} components are sorted
 * after all other ones (even after instances with positive infinite
 * components</li>
 * <li>instances with both positive and negative infinite components
 * are considered as if they had {@code Double.NaN}
 * components</li>
 * </ul>
 *
 * @version $Id$
 * @since 3.0
 */
public class OrderedTuple implements Comparable<OrderedTuple> {public static class __CLR4_4_1fqefqelb90p8hz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,20602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Sign bit mask. */
    private static final long SIGN_MASK     = 0x8000000000000000L;

    /** Exponent bits mask. */
    private static final long EXPONENT_MASK = 0x7ff0000000000000L;

    /** Mantissa bits mask. */
    private static final long MANTISSA_MASK = 0x000fffffffffffffL;

    /** Implicit MSB for normalized numbers. */
    private static final long IMPLICIT_ONE  = 0x0010000000000000L;

    /** Double components of the T-uple. */
    private double[] components;

    /** Offset scale. */
    private int offset;

    /** Least Significant Bit scale. */
    private int lsb;

    /** Ordering encoding of the double components. */
    private long[] encoding;

    /** Positive infinity marker. */
    private boolean posInf;

    /** Negative infinity marker. */
    private boolean negInf;

    /** Not A Number marker. */
    private boolean nan;

    /** Build an ordered T-uple from its components.
     * @param components double components of the T-uple
     */
    public OrderedTuple(final double ... components) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20390);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20391);this.components = components.clone();
        __CLR4_4_1fqefqelb90p8hz.R.inc(20392);int msb = Integer.MIN_VALUE;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20393);lsb     = Integer.MAX_VALUE;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20394);posInf  = false;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20395);negInf  = false;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20396);nan     = false;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20397);for (int i = 0; (((i < components.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20398)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20399)==0&false)); ++i) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20400);if ((((Double.isInfinite(components[i]))&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20401)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20402)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20403);if ((((components[i] < 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20404)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20405)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20406);negInf = true;
                } }else {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20407);posInf = true;
                }
            }} }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20408);if ((((Double.isNaN(components[i]))&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20409)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20410)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20411);nan = true;
            } }else {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20412);final long b = Double.doubleToLongBits(components[i]);
                __CLR4_4_1fqefqelb90p8hz.R.inc(20413);final long m = mantissa(b);
                __CLR4_4_1fqefqelb90p8hz.R.inc(20414);if ((((m != 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20415)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20416)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20417);final int e = exponent(b);
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20418);msb = FastMath.max(msb, e + computeMSB(m));
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20419);lsb = FastMath.min(lsb, e + computeLSB(m));
                }
            }}
        }}}

        }__CLR4_4_1fqefqelb90p8hz.R.inc(20420);if ((((posInf && negInf)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20421)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20422)==0&false))) {{
            // instance cannot be sorted logically
            __CLR4_4_1fqefqelb90p8hz.R.inc(20423);posInf = false;
            __CLR4_4_1fqefqelb90p8hz.R.inc(20424);negInf = false;
            __CLR4_4_1fqefqelb90p8hz.R.inc(20425);nan    = true;
        }

        }__CLR4_4_1fqefqelb90p8hz.R.inc(20426);if ((((lsb <= msb)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20427)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20428)==0&false))) {{
            // encode the T-upple with the specified offset
            __CLR4_4_1fqefqelb90p8hz.R.inc(20429);encode(msb + 16);
        } }else {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20430);encoding = new long[] {
                0x0L
            };
        }

    }}finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Encode the T-uple with a given offset.
     * @param minOffset minimal scale of the offset to add to all
     * components (must be greater than the MSBs of all components)
     */
    private void encode(final int minOffset) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20431);

        // choose an offset with some margins
        __CLR4_4_1fqefqelb90p8hz.R.inc(20432);offset  = minOffset + 31;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20433);offset -= offset % 32;

        __CLR4_4_1fqefqelb90p8hz.R.inc(20434);if (((((encoding != null) && (encoding.length == 1) && (encoding[0] == 0x0L))&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20435)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20436)==0&false))) {{
            // the components are all zeroes
            __CLR4_4_1fqefqelb90p8hz.R.inc(20437);return;
        }

        // allocate an integer array to encode the components (we use only
        // 63 bits per element because there is no unsigned long in Java)
        }__CLR4_4_1fqefqelb90p8hz.R.inc(20438);final int neededBits  = offset + 1 - lsb;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20439);final int neededLongs = (neededBits + 62) / 63;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20440);encoding = new long[components.length * neededLongs];

        // mix the bits from all components
        __CLR4_4_1fqefqelb90p8hz.R.inc(20441);int  eIndex = 0;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20442);int  shift  = 62;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20443);long word   = 0x0L;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20444);for (int k = offset; (((eIndex < encoding.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20445)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20446)==0&false)); --k) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20447);for (int vIndex = 0; (((vIndex < components.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20448)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20449)==0&false)); ++vIndex) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20450);if ((((getBit(vIndex, k) != 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20451)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20452)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20453);word |= 0x1L << shift;
                }
                }__CLR4_4_1fqefqelb90p8hz.R.inc(20454);if ((((shift-- == 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20455)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20456)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20457);encoding[eIndex++] = word;
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20458);word  = 0x0L;
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20459);shift = 62;
                }
            }}
        }}

    }}finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Compares this ordered T-uple with the specified object.

     * <p>The ordering method is detailed in the general description of
     * the class. Its main property is to be consistent with distance:
     * geometrically close T-uples stay close to each other when stored
     * in a sorted collection using this comparison method.</p>

     * <p>T-uples with negative infinite, positive infinite are sorted
     * logically.</p>

     * <p>Some arbitrary choices have been made to handle specific
     * cases. The rationale for these choices is to keep
     * <em>normal</em> and consistent T-uples together.</p>
     * <ul>
     * <li>instances with different dimensions are sorted according to
     * their dimension regardless of their components values</li>
     * <li>instances with {@code Double.NaN} components are sorted
     * after all other ones (evan after instances with positive infinite
     * components</li>
     * <li>instances with both positive and negative infinite components
     * are considered as if they had {@code Double.NaN}
     * components</li>
     * </ul>

     * @param ot T-uple to compare instance with
     * @return a negative integer if the instance is less than the
     * object, zero if they are equal, or a positive integer if the
     * instance is greater than the object

     */
    public int compareTo(final OrderedTuple ot) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20460);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20461);if ((((components.length == ot.components.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20462)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20463)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20464);if ((((nan)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20465)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20466)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20467);return +1;
            } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20468);if ((((ot.nan)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20469)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20470)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20471);return -1;
            } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20472);if ((((negInf || ot.posInf)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20473)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20474)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20475);return -1;
            } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20476);if ((((posInf || ot.negInf)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20477)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20478)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20479);return +1;
            } }else {{

                __CLR4_4_1fqefqelb90p8hz.R.inc(20480);if ((((offset < ot.offset)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20481)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20482)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20483);encode(ot.offset);
                } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20484);if ((((offset > ot.offset)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20485)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20486)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20487);ot.encode(offset);
                }

                }}__CLR4_4_1fqefqelb90p8hz.R.inc(20488);final int limit = FastMath.min(encoding.length, ot.encoding.length);
                __CLR4_4_1fqefqelb90p8hz.R.inc(20489);for (int i = 0; (((i < limit)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20490)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20491)==0&false)); ++i) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20492);if ((((encoding[i] < ot.encoding[i])&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20493)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20494)==0&false))) {{
                        __CLR4_4_1fqefqelb90p8hz.R.inc(20495);return -1;
                    } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20496);if ((((encoding[i] > ot.encoding[i])&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20497)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20498)==0&false))) {{
                        __CLR4_4_1fqefqelb90p8hz.R.inc(20499);return +1;
                    }
                }}}

                }__CLR4_4_1fqefqelb90p8hz.R.inc(20500);if ((((encoding.length < ot.encoding.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20501)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20502)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20503);return -1;
                } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20504);if ((((encoding.length > ot.encoding.length)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20505)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20506)==0&false))) {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20507);return +1;
                } }else {{
                    __CLR4_4_1fqefqelb90p8hz.R.inc(20508);return 0;
                }

            }}}
        }}}}}

        }__CLR4_4_1fqefqelb90p8hz.R.inc(20509);return components.length - ot.components.length;

    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(final Object other) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20510);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20511);if ((((this == other)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20512)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20513)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20514);return true;
        } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20515);if ((((other instanceof OrderedTuple)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20516)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20517)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20518);return compareTo((OrderedTuple) other) == 0;
        } }else {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20519);return false;
        }
    }}}finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20520);
        // the following constants are arbitrary small primes
        __CLR4_4_1fqefqelb90p8hz.R.inc(20521);final int multiplier = 37;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20522);final int trueHash   = 97;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20523);final int falseHash  = 71;

        // hash fields and combine them
        // (we rely on the multiplier to have different combined weights
        //  for all int fields and all boolean fields)
        __CLR4_4_1fqefqelb90p8hz.R.inc(20524);int hash = Arrays.hashCode(components);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20525);hash = hash * multiplier + offset;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20526);hash = hash * multiplier + lsb;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20527);hash = hash * multiplier + ((((posInf )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20528)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20529)==0&false))? trueHash : falseHash);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20530);hash = hash * multiplier + ((((negInf )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20531)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20532)==0&false))? trueHash : falseHash);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20533);hash = hash * multiplier + ((((nan    )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20534)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20535)==0&false))? trueHash : falseHash);

        __CLR4_4_1fqefqelb90p8hz.R.inc(20536);return hash;

    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Get the components array.
     * @return array containing the T-uple components
     */
    public double[] getComponents() {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20537);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20538);return components.clone();
    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Extract the sign from the bits of a double.
     * @param bits binary representation of the double
     * @return sign bit (zero if positive, non zero if negative)
     */
    private static long sign(final long bits) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20539);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20540);return bits & SIGN_MASK;
    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Extract the exponent from the bits of a double.
     * @param bits binary representation of the double
     * @return exponent
     */
    private static int exponent(final long bits) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20541);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20542);return ((int) ((bits & EXPONENT_MASK) >> 52)) - 1075;
    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Extract the mantissa from the bits of a double.
     * @param bits binary representation of the double
     * @return mantissa
     */
    private static long mantissa(final long bits) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20543);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20544);return (((((bits & EXPONENT_MASK) == 0) )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20545)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20546)==0&false))?
               ((bits & MANTISSA_MASK) << 1) :          // subnormal number
               (IMPLICIT_ONE | (bits & MANTISSA_MASK)); // normal number
    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Compute the most significant bit of a long.
     * @param l long from which the most significant bit is requested
     * @return scale of the most significant bit of {@code l},
     * or 0 if {@code l} is zero
     * @see #computeLSB
     */
    private static int computeMSB(final long l) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20547);

        __CLR4_4_1fqefqelb90p8hz.R.inc(20548);long ll = l;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20549);long mask  = 0xffffffffL;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20550);int  scale = 32;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20551);int  msb   = 0;

        __CLR4_4_1fqefqelb90p8hz.R.inc(20552);while ((((scale != 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20553)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20554)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20555);if (((((ll & mask) != ll)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20556)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20557)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20558);msb |= scale;
                __CLR4_4_1fqefqelb90p8hz.R.inc(20559);ll = ll >> scale;
            }
            }__CLR4_4_1fqefqelb90p8hz.R.inc(20560);scale = scale >> 1;
            __CLR4_4_1fqefqelb90p8hz.R.inc(20561);mask  = mask >> scale;
        }

        }__CLR4_4_1fqefqelb90p8hz.R.inc(20562);return msb;

    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Compute the least significant bit of a long.
     * @param l long from which the least significant bit is requested
     * @return scale of the least significant bit of {@code l},
     * or 63 if {@code l} is zero
     * @see #computeMSB
     */
    private static int computeLSB(final long l) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20563);

        __CLR4_4_1fqefqelb90p8hz.R.inc(20564);long ll = l;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20565);long mask  = 0xffffffff00000000L;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20566);int  scale = 32;
        __CLR4_4_1fqefqelb90p8hz.R.inc(20567);int  lsb   = 0;

        __CLR4_4_1fqefqelb90p8hz.R.inc(20568);while ((((scale != 0)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20569)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20570)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20571);if (((((ll & mask) == ll)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20572)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20573)==0&false))) {{
                __CLR4_4_1fqefqelb90p8hz.R.inc(20574);lsb |= scale;
                __CLR4_4_1fqefqelb90p8hz.R.inc(20575);ll = ll >> scale;
            }
            }__CLR4_4_1fqefqelb90p8hz.R.inc(20576);scale = scale >> 1;
            __CLR4_4_1fqefqelb90p8hz.R.inc(20577);mask  = mask >> scale;
        }

        }__CLR4_4_1fqefqelb90p8hz.R.inc(20578);return lsb;

    }finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

    /** Get a bit from the mantissa of a double.
     * @param i index of the component
     * @param k scale of the requested bit
     * @return the specified bit (either 0 or 1), after the offset has
     * been added to the double
     */
    private int getBit(final int i, final int k) {try{__CLR4_4_1fqefqelb90p8hz.R.inc(20579);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20580);final long bits = Double.doubleToLongBits(components[i]);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20581);final int e = exponent(bits);
        __CLR4_4_1fqefqelb90p8hz.R.inc(20582);if (((((k < e) || (k > offset))&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20583)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20584)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20585);return 0;
        } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20586);if ((((k == offset)&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20587)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20588)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20589);return ((((sign(bits) == 0L) )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20590)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20591)==0&false))? 1 : 0;
        } }else {__CLR4_4_1fqefqelb90p8hz.R.inc(20592);if ((((k > (e + 52))&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20593)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20594)==0&false))) {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20595);return ((((sign(bits) == 0L) )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20596)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20597)==0&false))? 0 : 1;
        } }else {{
            __CLR4_4_1fqefqelb90p8hz.R.inc(20598);final long m = ((((sign(bits) == 0L) )&&(__CLR4_4_1fqefqelb90p8hz.R.iget(20599)!=0|true))||(__CLR4_4_1fqefqelb90p8hz.R.iget(20600)==0&false))? mantissa(bits) : -mantissa(bits);
            __CLR4_4_1fqefqelb90p8hz.R.inc(20601);return (int) ((m >> (k - e)) & 0x1L);
        }
    }}}}finally{__CLR4_4_1fqefqelb90p8hz.R.flushNeeded();}}

}
