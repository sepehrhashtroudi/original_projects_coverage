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

package org.apache.commons.math3.dfp;

/** Subclass of {@link Dfp} which hides the radix-10000 artifacts of the superclass.
 * This should give outward appearances of being a decimal number with DIGITS*4-3
 * decimal digits. This class can be subclassed to appear to be an arbitrary number
 * of decimal digits less than DIGITS*4-3.
 * @version $Id$
 * @since 2.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DfpDec extends Dfp {public static class __CLR4_4_16w26w2lb90p7dg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,9139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Makes an instance with a value of zero.
     * @param factory factory linked to this instance
     */
    protected DfpDec(final DfpField factory) {
        super(factory);__CLR4_4_16w26w2lb90p7dg.R.inc(8931);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8930);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Create an instance from a byte value.
     * @param factory factory linked to this instance
     * @param x value to convert to an instance
     */
    protected DfpDec(final DfpField factory, byte x) {
        super(factory, x);__CLR4_4_16w26w2lb90p7dg.R.inc(8933);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8932);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Create an instance from an int value.
     * @param factory factory linked to this instance
     * @param x value to convert to an instance
     */
    protected DfpDec(final DfpField factory, int x) {
        super(factory, x);__CLR4_4_16w26w2lb90p7dg.R.inc(8935);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8934);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Create an instance from a long value.
     * @param factory factory linked to this instance
     * @param x value to convert to an instance
     */
    protected DfpDec(final DfpField factory, long x) {
        super(factory, x);__CLR4_4_16w26w2lb90p7dg.R.inc(8937);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8936);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Create an instance from a double value.
     * @param factory factory linked to this instance
     * @param x value to convert to an instance
     */
    protected DfpDec(final DfpField factory, double x) {
        super(factory, x);__CLR4_4_16w26w2lb90p7dg.R.inc(8939);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8938);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8940);round(0);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Copy constructor.
     * @param d instance to copy
     */
    public DfpDec(final Dfp d) {
        super(d);__CLR4_4_16w26w2lb90p7dg.R.inc(8942);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8941);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8943);round(0);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Create an instance from a String representation.
     * @param factory factory linked to this instance
     * @param s string representation of the instance
     */
    protected DfpDec(final DfpField factory, final String s) {
        super(factory, s);__CLR4_4_16w26w2lb90p7dg.R.inc(8945);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8944);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8946);round(0);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Creates an instance with a non-finite value.
     * @param factory factory linked to this instance
     * @param sign sign of the Dfp to create
     * @param nans code of the value, must be one of {@link #INFINITE},
     * {@link #SNAN},  {@link #QNAN}
     */
    protected DfpDec(final DfpField factory, final byte sign, final byte nans) {
        super(factory, sign, nans);__CLR4_4_16w26w2lb90p7dg.R.inc(8948);try{__CLR4_4_16w26w2lb90p7dg.R.inc(8947);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance() {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8949);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8950);return new DfpDec(getField());
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final byte x) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8951);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8952);return new DfpDec(getField(), x);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final int x) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8953);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8954);return new DfpDec(getField(), x);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final long x) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8955);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8956);return new DfpDec(getField(), x);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final double x) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8957);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8958);return new DfpDec(getField(), x);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final Dfp d) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8959);

        // make sure we don't mix number with different precision
        __CLR4_4_16w26w2lb90p7dg.R.inc(8960);if ((((getField().getRadixDigits() != d.getField().getRadixDigits())&&(__CLR4_4_16w26w2lb90p7dg.R.iget(8961)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(8962)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(8963);getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_16w26w2lb90p7dg.R.inc(8964);final Dfp result = newInstance(getZero());
            __CLR4_4_16w26w2lb90p7dg.R.inc(8965);result.nans = QNAN;
            __CLR4_4_16w26w2lb90p7dg.R.inc(8966);return dotrap(DfpField.FLAG_INVALID, "newInstance", d, result);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(8967);return new DfpDec(d);

    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final String s) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8968);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8969);return new DfpDec(getField(), s);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp newInstance(final byte sign, final byte nans) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8970);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8971);return new DfpDec(getField(), sign, nans);
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** Get the number of decimal digits this class is going to represent.
     * Default implementation returns {@link #getRadixDigits()}*4-3. Subclasses can
     * override this to return something less.
     * @return number of decimal digits this class is going to represent
     */
    protected int getDecimalDigits() {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8972);
        __CLR4_4_16w26w2lb90p7dg.R.inc(8973);return getRadixDigits() * 4 - 3;
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected int round(int in) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(8974);

        __CLR4_4_16w26w2lb90p7dg.R.inc(8975);int msb = mant[mant.length-1];
        __CLR4_4_16w26w2lb90p7dg.R.inc(8976);if ((((msb == 0)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(8977)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(8978)==0&false))) {{
            // special case -- this == zero
            __CLR4_4_16w26w2lb90p7dg.R.inc(8979);return 0;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(8980);int cmaxdigits = mant.length * 4;
        __CLR4_4_16w26w2lb90p7dg.R.inc(8981);int lsbthreshold = 1000;
        __CLR4_4_16w26w2lb90p7dg.R.inc(8982);while ((((lsbthreshold > msb)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(8983)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(8984)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(8985);lsbthreshold /= 10;
            __CLR4_4_16w26w2lb90p7dg.R.inc(8986);cmaxdigits --;
        }


        }__CLR4_4_16w26w2lb90p7dg.R.inc(8987);final int digits = getDecimalDigits();
        __CLR4_4_16w26w2lb90p7dg.R.inc(8988);final int lsbshift = cmaxdigits - digits;
        __CLR4_4_16w26w2lb90p7dg.R.inc(8989);final int lsd = lsbshift / 4;

        __CLR4_4_16w26w2lb90p7dg.R.inc(8990);lsbthreshold = 1;
        __CLR4_4_16w26w2lb90p7dg.R.inc(8991);for (int i = 0; (((i < lsbshift % 4)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(8992)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(8993)==0&false)); i++) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(8994);lsbthreshold *= 10;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(8995);final int lsb = mant[lsd];

        __CLR4_4_16w26w2lb90p7dg.R.inc(8996);if ((((lsbthreshold <= 1 && digits == 4 * mant.length - 3)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(8997)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(8998)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(8999);return super.round(in);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9000);int discarded = in;  // not looking at this after this point
        __CLR4_4_16w26w2lb90p7dg.R.inc(9001);final int n;
        __CLR4_4_16w26w2lb90p7dg.R.inc(9002);if ((((lsbthreshold == 1)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9003)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9004)==0&false))) {{
            // look to the next digit for rounding
            __CLR4_4_16w26w2lb90p7dg.R.inc(9005);n = (mant[lsd-1] / 1000) % 10;
            __CLR4_4_16w26w2lb90p7dg.R.inc(9006);mant[lsd-1] %= 1000;
            __CLR4_4_16w26w2lb90p7dg.R.inc(9007);discarded |= mant[lsd-1];
        } }else {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9008);n = (lsb * 10 / lsbthreshold) % 10;
            __CLR4_4_16w26w2lb90p7dg.R.inc(9009);discarded |= lsb % (lsbthreshold/10);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9010);for (int i = 0; (((i < lsd)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9011)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9012)==0&false)); i++) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9013);discarded |= mant[i];    // need to know if there are any discarded bits
            __CLR4_4_16w26w2lb90p7dg.R.inc(9014);mant[i] = 0;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9015);mant[lsd] = lsb / lsbthreshold * lsbthreshold;

        __CLR4_4_16w26w2lb90p7dg.R.inc(9016);final boolean inc;
        boolean __CLB4_4_1_bool0=false;__CLR4_4_16w26w2lb90p7dg.R.inc(9017);switch (getField().getRoundingMode()) {
            case ROUND_DOWN:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9018);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9019);inc = false;
                __CLR4_4_16w26w2lb90p7dg.R.inc(9020);break;

            case ROUND_UP:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9021);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9022);inc = (n != 0) || (discarded != 0); // round up if n!=0
                __CLR4_4_16w26w2lb90p7dg.R.inc(9023);break;

            case ROUND_HALF_UP:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9024);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9025);inc = n >= 5;  // round half up
                __CLR4_4_16w26w2lb90p7dg.R.inc(9026);break;

            case ROUND_HALF_DOWN:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9027);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9028);inc = n > 5;  // round half down
                __CLR4_4_16w26w2lb90p7dg.R.inc(9029);break;

            case ROUND_HALF_EVEN:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9030);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9031);inc = (n > 5) ||
                      (n == 5 && discarded != 0) ||
                      (n == 5 && discarded == 0 && ((lsb / lsbthreshold) & 1) == 1);  // round half-even
                __CLR4_4_16w26w2lb90p7dg.R.inc(9032);break;

            case ROUND_HALF_ODD:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9033);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9034);inc = (n > 5) ||
                      (n == 5 && discarded != 0) ||
                      (n == 5 && discarded == 0 && ((lsb / lsbthreshold) & 1) == 0);  // round half-odd
                __CLR4_4_16w26w2lb90p7dg.R.inc(9035);break;

            case ROUND_CEIL:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9036);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9037);inc = (sign == 1) && (n != 0 || discarded != 0);  // round ceil
                __CLR4_4_16w26w2lb90p7dg.R.inc(9038);break;

            case ROUND_FLOOR:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9039);__CLB4_4_1_bool0=true;}
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_16w26w2lb90p7dg.R.inc(9040);__CLB4_4_1_bool0=true;}
                __CLR4_4_16w26w2lb90p7dg.R.inc(9041);inc = (sign == -1) && (n != 0 || discarded != 0);  // round floor
                __CLR4_4_16w26w2lb90p7dg.R.inc(9042);break;
        }

        __CLR4_4_16w26w2lb90p7dg.R.inc(9043);if ((((inc)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9044)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9045)==0&false))) {{
            // increment if necessary
            __CLR4_4_16w26w2lb90p7dg.R.inc(9046);int rh = lsbthreshold;
            __CLR4_4_16w26w2lb90p7dg.R.inc(9047);for (int i = lsd; (((i < mant.length)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9048)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9049)==0&false)); i++) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9050);final int r = mant[i] + rh;
                __CLR4_4_16w26w2lb90p7dg.R.inc(9051);rh = r / RADIX;
                __CLR4_4_16w26w2lb90p7dg.R.inc(9052);mant[i] = r % RADIX;
            }

            }__CLR4_4_16w26w2lb90p7dg.R.inc(9053);if ((((rh != 0)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9054)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9055)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9056);shiftRight();
                __CLR4_4_16w26w2lb90p7dg.R.inc(9057);mant[mant.length-1]=rh;
            }
        }}

        // Check for exceptional cases and raise signals if necessary
        }__CLR4_4_16w26w2lb90p7dg.R.inc(9058);if ((((exp < MIN_EXP)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9059)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9060)==0&false))) {{
            // Gradual Underflow
            __CLR4_4_16w26w2lb90p7dg.R.inc(9061);getField().setIEEEFlagsBits(DfpField.FLAG_UNDERFLOW);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9062);return DfpField.FLAG_UNDERFLOW;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9063);if ((((exp > MAX_EXP)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9064)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9065)==0&false))) {{
            // Overflow
            __CLR4_4_16w26w2lb90p7dg.R.inc(9066);getField().setIEEEFlagsBits(DfpField.FLAG_OVERFLOW);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9067);return DfpField.FLAG_OVERFLOW;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9068);if ((((n != 0 || discarded != 0)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9069)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9070)==0&false))) {{
            // Inexact
            __CLR4_4_16w26w2lb90p7dg.R.inc(9071);getField().setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9072);return DfpField.FLAG_INEXACT;
        }
        }__CLR4_4_16w26w2lb90p7dg.R.inc(9073);return 0;
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public Dfp nextAfter(Dfp x) {try{__CLR4_4_16w26w2lb90p7dg.R.inc(9074);

        __CLR4_4_16w26w2lb90p7dg.R.inc(9075);final String trapName = "nextAfter";

        // make sure we don't mix number with different precision
        __CLR4_4_16w26w2lb90p7dg.R.inc(9076);if ((((getField().getRadixDigits() != x.getField().getRadixDigits())&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9077)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9078)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9079);getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9080);final Dfp result = newInstance(getZero());
            __CLR4_4_16w26w2lb90p7dg.R.inc(9081);result.nans = QNAN;
            __CLR4_4_16w26w2lb90p7dg.R.inc(9082);return dotrap(DfpField.FLAG_INVALID, trapName, x, result);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9083);boolean up = false;
        __CLR4_4_16w26w2lb90p7dg.R.inc(9084);Dfp result;
        __CLR4_4_16w26w2lb90p7dg.R.inc(9085);Dfp inc;

        // if this is greater than x
        __CLR4_4_16w26w2lb90p7dg.R.inc(9086);if ((((this.lessThan(x))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9087)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9088)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9089);up = true;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9090);if ((((equals(x))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9091)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9092)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9093);return newInstance(x);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9094);if ((((lessThan(getZero()))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9095)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9096)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9097);up = !up;
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9098);if ((((up)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9099)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9100)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9101);inc = power10(intLog10() - getDecimalDigits() + 1);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9102);inc = copysign(inc, this);

            __CLR4_4_16w26w2lb90p7dg.R.inc(9103);if ((((this.equals(getZero()))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9104)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9105)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9106);inc = power10K(MIN_EXP-mant.length-1);
            }

            }__CLR4_4_16w26w2lb90p7dg.R.inc(9107);if ((((inc.equals(getZero()))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9108)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9109)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9110);result = copysign(newInstance(getZero()), this);
            } }else {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9111);result = add(inc);
            }
        }} }else {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9112);inc = power10(intLog10());
            __CLR4_4_16w26w2lb90p7dg.R.inc(9113);inc = copysign(inc, this);

            __CLR4_4_16w26w2lb90p7dg.R.inc(9114);if ((((this.equals(inc))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9115)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9116)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9117);inc = inc.divide(power10(getDecimalDigits()));
            } }else {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9118);inc = inc.divide(power10(getDecimalDigits() - 1));
            }

            }__CLR4_4_16w26w2lb90p7dg.R.inc(9119);if ((((this.equals(getZero()))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9120)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9121)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9122);inc = power10K(MIN_EXP-mant.length-1);
            }

            }__CLR4_4_16w26w2lb90p7dg.R.inc(9123);if ((((inc.equals(getZero()))&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9124)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9125)==0&false))) {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9126);result = copysign(newInstance(getZero()), this);
            } }else {{
                __CLR4_4_16w26w2lb90p7dg.R.inc(9127);result = subtract(inc);
            }
        }}

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9128);if ((((result.classify() == INFINITE && this.classify() != INFINITE)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9129)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9130)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9131);getField().setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9132);result = dotrap(DfpField.FLAG_INEXACT, trapName, x, result);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9133);if ((((result.equals(getZero()) && this.equals(getZero()) == false)&&(__CLR4_4_16w26w2lb90p7dg.R.iget(9134)!=0|true))||(__CLR4_4_16w26w2lb90p7dg.R.iget(9135)==0&false))) {{
            __CLR4_4_16w26w2lb90p7dg.R.inc(9136);getField().setIEEEFlagsBits(DfpField.FLAG_INEXACT);
            __CLR4_4_16w26w2lb90p7dg.R.inc(9137);result = dotrap(DfpField.FLAG_INEXACT, trapName, x, result);
        }

        }__CLR4_4_16w26w2lb90p7dg.R.inc(9138);return result;
    }finally{__CLR4_4_16w26w2lb90p7dg.R.flushNeeded();}}

}
