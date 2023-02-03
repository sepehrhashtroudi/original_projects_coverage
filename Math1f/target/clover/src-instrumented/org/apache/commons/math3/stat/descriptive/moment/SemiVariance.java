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

package org.apache.commons.math3.stat.descriptive.moment;

import java.io.Serializable;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>Computes the semivariance of a set of values with respect to a given cutoff value.
 * We define the <i>downside semivariance</i> of a set of values <code>x</code>
 * against the <i>cutoff value</i> <code>cutoff</code> to be <br/>
 * <code>&Sigma; (x[i] - target)<sup>2</sup> / df</code> <br/>
 * where the sum is taken over all <code>i</code> such that <code>x[i] < cutoff</code>
 * and <code>df</code> is the length of <code>x</code> (non-bias-corrected) or
 * one less than this number (bias corrected).  The <i>upside semivariance</i>
 * is defined similarly, with the sum taken over values of <code>x</code> that
 * exceed the cutoff value.</p>
 *
 * <p>The cutoff value defaults to the mean, bias correction defaults to <code>true</code>
 * and the "variance direction" (upside or downside) defaults to downside.  The variance direction
 * and bias correction may be set using property setters or their values can provided as
 * parameters to {@link #evaluate(double[], double, Direction, boolean, int, int)}.</p>
 *
 * <p>If the input array is null, <code>evaluate</code> methods throw
 * <code>IllegalArgumentException.</code>  If the array has length 1, <code>0</code>
 * is returned, regardless of the value of the <code>cutoff.</code>
 *
 * <p><strong>Note that this class is not intended to be threadsafe.</strong> If
 * multiple threads access an instance of this class concurrently, and one or
 * more of these threads invoke property setters, external synchronization must
 * be provided to ensure correct results.</p>
 *
 * @since 2.1
 * @version $Id$
 */
public class SemiVariance extends AbstractUnivariateStatistic implements Serializable {public static class __CLR4_4_113zs13zslb90panv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,51900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The UPSIDE Direction is used to specify that the observations above the
     * cutoff point will be used to calculate SemiVariance.
     */
    public static final Direction UPSIDE_VARIANCE = Direction.UPSIDE;

    /**
     * The DOWNSIDE Direction is used to specify that the observations below
     * the cutoff point will be used to calculate SemiVariance
     */
    public static final Direction DOWNSIDE_VARIANCE = Direction.DOWNSIDE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -2653430366886024994L;

    /**
     * Determines whether or not bias correction is applied when computing the
     * value of the statisic.  True means that bias is corrected.
     */
    private boolean biasCorrected = true;

    /**
     * Determines whether to calculate downside or upside SemiVariance.
     */
    private Direction varianceDirection = Direction.DOWNSIDE;

    /**
     * Constructs a SemiVariance with default (true) <code>biasCorrected</code>
     * property and default (Downside) <code>varianceDirection</code> property.
     */
    public SemiVariance() {try{__CLR4_4_113zs13zslb90panv.R.inc(51832);
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * Constructs a SemiVariance with the specified <code>biasCorrected</code>
     * property and default (Downside) <code>varianceDirection</code> property.
     *
     * @param biasCorrected  setting for bias correction - true means
     * bias will be corrected and is equivalent to using the argumentless
     * constructor
     */
    public SemiVariance(final boolean biasCorrected) {try{__CLR4_4_113zs13zslb90panv.R.inc(51833);
        __CLR4_4_113zs13zslb90panv.R.inc(51834);this.biasCorrected = biasCorrected;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


    /**
     * Constructs a SemiVariance with the specified <code>Direction</code> property
     * and default (true) <code>biasCorrected</code> property
     *
     * @param direction  setting for the direction of the SemiVariance
     * to calculate
     */
    public SemiVariance(final Direction direction) {try{__CLR4_4_113zs13zslb90panv.R.inc(51835);
        __CLR4_4_113zs13zslb90panv.R.inc(51836);this.varianceDirection = direction;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


    /**
     * Constructs a SemiVariance with the specified <code>isBiasCorrected</code>
     * property and the specified <code>Direction</code> property.
     *
     * @param corrected  setting for bias correction - true means
     * bias will be corrected and is equivalent to using the argumentless
     * constructor
     *
     * @param direction  setting for the direction of the SemiVariance
     * to calculate
     */
    public SemiVariance(final boolean corrected, final Direction direction) {try{__CLR4_4_113zs13zslb90panv.R.inc(51837);
        __CLR4_4_113zs13zslb90panv.R.inc(51838);this.biasCorrected = corrected;
        __CLR4_4_113zs13zslb90panv.R.inc(51839);this.varianceDirection = direction;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


    /**
     * Copy constructor, creates a new {@code SemiVariance} identical
     * to the {@code original}
     *
     * @param original the {@code SemiVariance} instance to copy
     * @throws NullArgumentException  if original is null
     */
    public SemiVariance(final SemiVariance original) throws NullArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51840);
        __CLR4_4_113zs13zslb90panv.R.inc(51841);copy(original, this);
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


    /**
     * {@inheritDoc}
     */
    @Override
    public SemiVariance copy() {try{__CLR4_4_113zs13zslb90panv.R.inc(51842);
        __CLR4_4_113zs13zslb90panv.R.inc(51843);SemiVariance result = new SemiVariance();
        // No try-catch or advertised exception because args are guaranteed non-null
        __CLR4_4_113zs13zslb90panv.R.inc(51844);copy(this, result);
        __CLR4_4_113zs13zslb90panv.R.inc(51845);return result;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


    /**
     * Copies source to dest.
     * <p>Neither source nor dest can be null.</p>
     *
     * @param source SemiVariance to copy
     * @param dest SemiVariance to copy to
     * @throws NullArgumentException if either source or dest is null
     */
    public static void copy(final SemiVariance source, SemiVariance dest)
        throws NullArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51846);
        __CLR4_4_113zs13zslb90panv.R.inc(51847);MathUtils.checkNotNull(source);
        __CLR4_4_113zs13zslb90panv.R.inc(51848);MathUtils.checkNotNull(dest);
        __CLR4_4_113zs13zslb90panv.R.inc(51849);dest.setData(source.getDataRef());
        __CLR4_4_113zs13zslb90panv.R.inc(51850);dest.biasCorrected = source.biasCorrected;
        __CLR4_4_113zs13zslb90panv.R.inc(51851);dest.varianceDirection = source.varianceDirection;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
      * <p>Returns the {@link SemiVariance} of the designated values against the mean, using
      * instance properties varianceDirection and biasCorrection.</p>
      *
      * <p>Returns <code>NaN</code> if the array is empty and throws
      * <code>IllegalArgumentException</code> if the array is null.</p>
      *
      * @param values the input array
      * @param start index of the first array element to include
      * @param length the number of elements to include
      * @return the SemiVariance
      * @throws MathIllegalArgumentException if the parameters are not valid
      *
      */
      @Override
      public double evaluate(final double[] values, final int start, final int length)
      throws MathIllegalArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51852);
        __CLR4_4_113zs13zslb90panv.R.inc(51853);double m = (new Mean()).evaluate(values, start, length);
        __CLR4_4_113zs13zslb90panv.R.inc(51854);return evaluate(values, m, varianceDirection, biasCorrected, 0, values.length);
      }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


      /**
       * This method calculates {@link SemiVariance} for the entire array against the mean, using
       * the current value of the biasCorrection instance property.
       *
       * @param values the input array
       * @param direction the {@link Direction} of the semivariance
       * @return the SemiVariance
       * @throws MathIllegalArgumentException if values is null
       *
       */
      public double evaluate(final double[] values, Direction direction)
      throws MathIllegalArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51855);
          __CLR4_4_113zs13zslb90panv.R.inc(51856);double m = (new Mean()).evaluate(values);
          __CLR4_4_113zs13zslb90panv.R.inc(51857);return evaluate (values, m, direction, biasCorrected, 0, values.length);
      }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

      /**
       * <p>Returns the {@link SemiVariance} of the designated values against the cutoff, using
       * instance properties variancDirection and biasCorrection.</p>
       *
       * <p>Returns <code>NaN</code> if the array is empty and throws
       * <code>MathIllegalArgumentException</code> if the array is null.</p>
       *
       * @param values the input array
       * @param cutoff the reference point
       * @return the SemiVariance
       * @throws MathIllegalArgumentException if values is null
       */
      public double evaluate(final double[] values, final double cutoff)
      throws MathIllegalArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51858);
          __CLR4_4_113zs13zslb90panv.R.inc(51859);return evaluate(values, cutoff, varianceDirection, biasCorrected, 0, values.length);
      }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

      /**
       * <p>Returns the {@link SemiVariance} of the designated values against the cutoff in the
       * given direction, using the current value of the biasCorrection instance property.</p>
       *
       * <p>Returns <code>NaN</code> if the array is empty and throws
       * <code>MathIllegalArgumentException</code> if the array is null.</p>
       *
       * @param values the input array
       * @param cutoff the reference point
       * @param direction the {@link Direction} of the semivariance
       * @return the SemiVariance
       * @throws MathIllegalArgumentException if values is null
       */
      public double evaluate(final double[] values, final double cutoff, final Direction direction)
      throws MathIllegalArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51860);
          __CLR4_4_113zs13zslb90panv.R.inc(51861);return evaluate(values, cutoff, direction, biasCorrected, 0, values.length);
      }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}


     /**
      * <p>Returns the {@link SemiVariance} of the designated values against the cutoff
      * in the given direction with the provided bias correction.</p>
      *
      * <p>Returns <code>NaN</code> if the array is empty and throws
      * <code>IllegalArgumentException</code> if the array is null.</p>
      *
      * @param values the input array
      * @param cutoff the reference point
      * @param direction the {@link Direction} of the semivariance
      * @param corrected the BiasCorrection flag
      * @param start index of the first array element to include
      * @param length the number of elements to include
      * @return the SemiVariance
      * @throws MathIllegalArgumentException if the parameters are not valid
      *
      */
    public double evaluate (final double[] values, final double cutoff, final Direction direction,
            final boolean corrected, final int start, final int length) throws MathIllegalArgumentException {try{__CLR4_4_113zs13zslb90panv.R.inc(51862);

        __CLR4_4_113zs13zslb90panv.R.inc(51863);test(values, start, length);
        __CLR4_4_113zs13zslb90panv.R.inc(51864);if ((((values.length == 0)&&(__CLR4_4_113zs13zslb90panv.R.iget(51865)!=0|true))||(__CLR4_4_113zs13zslb90panv.R.iget(51866)==0&false))) {{
            __CLR4_4_113zs13zslb90panv.R.inc(51867);return Double.NaN;
        } }else {{
            __CLR4_4_113zs13zslb90panv.R.inc(51868);if ((((values.length == 1)&&(__CLR4_4_113zs13zslb90panv.R.iget(51869)!=0|true))||(__CLR4_4_113zs13zslb90panv.R.iget(51870)==0&false))) {{
                __CLR4_4_113zs13zslb90panv.R.inc(51871);return 0.0;
            } }else {{
                __CLR4_4_113zs13zslb90panv.R.inc(51872);final boolean booleanDirection = direction.getDirection();

                __CLR4_4_113zs13zslb90panv.R.inc(51873);double dev = 0.0;
                __CLR4_4_113zs13zslb90panv.R.inc(51874);double sumsq = 0.0;
                __CLR4_4_113zs13zslb90panv.R.inc(51875);for (int i = start; (((i < length)&&(__CLR4_4_113zs13zslb90panv.R.iget(51876)!=0|true))||(__CLR4_4_113zs13zslb90panv.R.iget(51877)==0&false)); i++) {{
                    __CLR4_4_113zs13zslb90panv.R.inc(51878);if (((((values[i] > cutoff) == booleanDirection)&&(__CLR4_4_113zs13zslb90panv.R.iget(51879)!=0|true))||(__CLR4_4_113zs13zslb90panv.R.iget(51880)==0&false))) {{
                       __CLR4_4_113zs13zslb90panv.R.inc(51881);dev = values[i] - cutoff;
                       __CLR4_4_113zs13zslb90panv.R.inc(51882);sumsq += dev * dev;
                    }
                }}

                }__CLR4_4_113zs13zslb90panv.R.inc(51883);if ((((corrected)&&(__CLR4_4_113zs13zslb90panv.R.iget(51884)!=0|true))||(__CLR4_4_113zs13zslb90panv.R.iget(51885)==0&false))) {{
                    __CLR4_4_113zs13zslb90panv.R.inc(51886);return sumsq / (length - 1.0);
                } }else {{
                    __CLR4_4_113zs13zslb90panv.R.inc(51887);return sumsq / length;
                }
            }}
        }}
    }}finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * Returns true iff biasCorrected property is set to true.
     *
     * @return the value of biasCorrected.
     */
    public boolean isBiasCorrected() {try{__CLR4_4_113zs13zslb90panv.R.inc(51888);
        __CLR4_4_113zs13zslb90panv.R.inc(51889);return biasCorrected;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * Sets the biasCorrected property.
     *
     * @param biasCorrected new biasCorrected property value
     */
    public void setBiasCorrected(boolean biasCorrected) {try{__CLR4_4_113zs13zslb90panv.R.inc(51890);
        __CLR4_4_113zs13zslb90panv.R.inc(51891);this.biasCorrected = biasCorrected;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * Returns the varianceDirection property.
     *
     * @return the varianceDirection
     */
    public Direction getVarianceDirection () {try{__CLR4_4_113zs13zslb90panv.R.inc(51892);
        __CLR4_4_113zs13zslb90panv.R.inc(51893);return varianceDirection;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * Sets the variance direction
     *
     * @param varianceDirection the direction of the semivariance
     */
    public void setVarianceDirection(Direction varianceDirection) {try{__CLR4_4_113zs13zslb90panv.R.inc(51894);
        __CLR4_4_113zs13zslb90panv.R.inc(51895);this.varianceDirection = varianceDirection;
    }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

    /**
     * The direction of the semivariance - either upside or downside. The direction
     * is represented by boolean, with true corresponding to UPSIDE semivariance.
     */
    public enum Direction {
        /**
         * The UPSIDE Direction is used to specify that the observations above the
         * cutoff point will be used to calculate SemiVariance
         */
        UPSIDE (true),

        /**
         * The DOWNSIDE Direction is used to specify that the observations below
         * the cutoff point will be used to calculate SemiVariance
         */
        DOWNSIDE (false);

        /**
         *   boolean value  UPSIDE <-> true
         */
        private boolean direction;

        /**
         * Create a Direction with the given value.
         *
         * @param b boolean value representing the Direction. True corresponds to UPSIDE.
         */
        Direction (boolean b) {try{__CLR4_4_113zs13zslb90panv.R.inc(51896);
            __CLR4_4_113zs13zslb90panv.R.inc(51897);direction = b;
        }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}

        /**
         * Returns the value of this Direction. True corresponds to UPSIDE.
         *
         * @return true if direction is UPSIDE; false otherwise
         */
        boolean getDirection () {try{__CLR4_4_113zs13zslb90panv.R.inc(51898);
            __CLR4_4_113zs13zslb90panv.R.inc(51899);return direction;
        }finally{__CLR4_4_113zs13zslb90panv.R.flushNeeded();}}
    }
}
