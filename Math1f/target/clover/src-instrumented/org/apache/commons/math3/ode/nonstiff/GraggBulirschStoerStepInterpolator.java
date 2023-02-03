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

package org.apache.commons.math3.ode.nonstiff;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements an interpolator for the Gragg-Bulirsch-Stoer
 * integrator.
 *
 * <p>This interpolator compute dense output inside the last step
 * produced by a Gragg-Bulirsch-Stoer integrator.</p>
 *
 * <p>
 * This implementation is basically a reimplementation in Java of the
 * <a
 * href="http://www.unige.ch/math/folks/hairer/prog/nonstiff/odex.f">odex</a>
 * fortran code by E. Hairer and G. Wanner. The redistribution policy
 * for this code is available <a
 * href="http://www.unige.ch/~hairer/prog/licence.txt">here</a>, for
 * convenience, it is reproduced below.</p>
 * </p>
 *
 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>Copyright (c) 2004, Ernst Hairer</td></tr>
 *
 * <tr><td>Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 * <ul>
 *  <li>Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.</li>
 *  <li>Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.</li>
 * </ul></td></tr>
 *
 * <tr><td><strong>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.</strong></td></tr>
 * </table>
 *
 * @see GraggBulirschStoerIntegrator
 * @version $Id$
 * @since 1.2
 */

class GraggBulirschStoerStepInterpolator
  extends AbstractStepInterpolator {public static class __CLR4_4_1qmyqmylb90p9i6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20110928L;

    /** Slope at the beginning of the step. */
    private double[] y0Dot;

    /** State at the end of the step. */
    private double[] y1;

    /** Slope at the end of the step. */
    private double[] y1Dot;

    /** Derivatives at the middle of the step.
     * element 0 is state at midpoint, element 1 is first derivative ...
     */
    private double[][] yMidDots;

    /** Interpolation polynomials. */
    private double[][] polynomials;

    /** Error coefficients for the interpolation. */
    private double[] errfac;

    /** Degree of the interpolation polynomials. */
    private int currentDegree;

  /** Simple constructor.
   * This constructor should not be used directly, it is only intended
   * for the serialization process.
   */
  public GraggBulirschStoerStepInterpolator() {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34522);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34523);y0Dot    = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34524);y1       = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34525);y1Dot    = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34526);yMidDots = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34527);resetTables(-1);
  }finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** Simple constructor.
   * @param y reference to the integrator array holding the current state
   * @param y0Dot reference to the integrator array holding the slope
   * at the beginning of the step
   * @param y1 reference to the integrator array holding the state at
   * the end of the step
   * @param y1Dot reference to the integrator array holding the slope
   * at the end of the step
   * @param yMidDots reference to the integrator array holding the
   * derivatives at the middle point of the step
   * @param forward integration direction indicator
   * @param primaryMapper equations mapper for the primary equations set
   * @param secondaryMappers equations mappers for the secondary equations sets
   */
  public GraggBulirschStoerStepInterpolator(final double[] y, final double[] y0Dot,
                                            final double[] y1, final double[] y1Dot,
                                            final double[][] yMidDots,
                                            final boolean forward,
                                            final EquationsMapper primaryMapper,
                                            final EquationsMapper[] secondaryMappers) {

    super(y, forward, primaryMapper, secondaryMappers);__CLR4_4_1qmyqmylb90p9i6.R.inc(34529);try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34528);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34530);this.y0Dot    = y0Dot;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34531);this.y1       = y1;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34532);this.y1Dot    = y1Dot;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34533);this.yMidDots = yMidDots;

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34534);resetTables(yMidDots.length + 4);

  }finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public GraggBulirschStoerStepInterpolator
    (final GraggBulirschStoerStepInterpolator interpolator) {

    super(interpolator);__CLR4_4_1qmyqmylb90p9i6.R.inc(34536);try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34535);

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34537);final int dimension = currentState.length;

    // the interpolator has been finalized,
    // the following arrays are not needed anymore
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34538);y0Dot    = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34539);y1       = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34540);y1Dot    = null;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34541);yMidDots = null;

    // copy the interpolation polynomials (up to the current degree only)
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34542);if ((((interpolator.polynomials == null)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34543)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34544)==0&false))) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34545);polynomials = null;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34546);currentDegree = -1;
    } }else {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34547);resetTables(interpolator.currentDegree);
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34548);for (int i = 0; (((i < polynomials.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34549)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34550)==0&false)); ++i) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34551);polynomials[i] = new double[dimension];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34552);System.arraycopy(interpolator.polynomials[i], 0,
                         polynomials[i], 0, dimension);
      }
      }__CLR4_4_1qmyqmylb90p9i6.R.inc(34553);currentDegree = interpolator.currentDegree;
    }

  }}finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** Reallocate the internal tables.
   * Reallocate the internal tables in order to be able to handle
   * interpolation polynomials up to the given degree
   * @param maxDegree maximal degree to handle
   */
  private void resetTables(final int maxDegree) {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34554);

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34555);if ((((maxDegree < 0)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34556)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34557)==0&false))) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34558);polynomials   = null;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34559);errfac        = null;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34560);currentDegree = -1;
    } }else {{

      __CLR4_4_1qmyqmylb90p9i6.R.inc(34561);final double[][] newPols = new double[maxDegree + 1][];
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34562);if ((((polynomials != null)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34563)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34564)==0&false))) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34565);System.arraycopy(polynomials, 0, newPols, 0, polynomials.length);
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34566);for (int i = polynomials.length; (((i < newPols.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34567)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34568)==0&false)); ++i) {{
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34569);newPols[i] = new double[currentState.length];
        }
      }} }else {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34570);for (int i = 0; (((i < newPols.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34571)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34572)==0&false)); ++i) {{
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34573);newPols[i] = new double[currentState.length];
        }
      }}
      }__CLR4_4_1qmyqmylb90p9i6.R.inc(34574);polynomials = newPols;

      // initialize the error factors array for interpolation
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34575);if ((((maxDegree <= 4)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34576)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34577)==0&false))) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34578);errfac = null;
      } }else {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34579);errfac = new double[maxDegree - 4];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34580);for (int i = 0; (((i < errfac.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34581)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34582)==0&false)); ++i) {{
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34583);final int ip5 = i + 5;
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34584);errfac[i] = 1.0 / (ip5 * ip5);
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34585);final double e = 0.5 * FastMath.sqrt (((double) (i + 1)) / ip5);
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34586);for (int j = 0; (((j <= i)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34587)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34588)==0&false)); ++j) {{
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34589);errfac[i] *= e / (j + 1);
          }
        }}
      }}

      }__CLR4_4_1qmyqmylb90p9i6.R.inc(34590);currentDegree = 0;

    }

  }}finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34591);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34592);return new GraggBulirschStoerStepInterpolator(this);
  }finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}


  /** Compute the interpolation coefficients for dense output.
   * @param mu degree of the interpolation polynomial
   * @param h current step
   */
  public void computeCoefficients(final int mu, final double h) {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34593);

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34594);if (((((polynomials == null) || (polynomials.length <= (mu + 4)))&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34595)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34596)==0&false))) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34597);resetTables(mu + 4);
    }

    }__CLR4_4_1qmyqmylb90p9i6.R.inc(34598);currentDegree = mu + 4;

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34599);for (int i = 0; (((i < currentState.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34600)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34601)==0&false)); ++i) {{

      __CLR4_4_1qmyqmylb90p9i6.R.inc(34602);final double yp0   = h * y0Dot[i];
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34603);final double yp1   = h * y1Dot[i];
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34604);final double ydiff = y1[i] - currentState[i];
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34605);final double aspl  = ydiff - yp1;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34606);final double bspl  = yp0 - ydiff;

      __CLR4_4_1qmyqmylb90p9i6.R.inc(34607);polynomials[0][i] = currentState[i];
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34608);polynomials[1][i] = ydiff;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34609);polynomials[2][i] = aspl;
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34610);polynomials[3][i] = bspl;

      __CLR4_4_1qmyqmylb90p9i6.R.inc(34611);if ((((mu < 0)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34612)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34613)==0&false))) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34614);return;
      }

      // compute the remaining coefficients
      }__CLR4_4_1qmyqmylb90p9i6.R.inc(34615);final double ph0 = 0.5 * (currentState[i] + y1[i]) + 0.125 * (aspl + bspl);
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34616);polynomials[4][i] = 16 * (yMidDots[0][i] - ph0);

      __CLR4_4_1qmyqmylb90p9i6.R.inc(34617);if ((((mu > 0)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34618)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34619)==0&false))) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34620);final double ph1 = ydiff + 0.25 * (aspl - bspl);
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34621);polynomials[5][i] = 16 * (yMidDots[1][i] - ph1);

        __CLR4_4_1qmyqmylb90p9i6.R.inc(34622);if ((((mu > 1)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34623)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34624)==0&false))) {{
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34625);final double ph2 = yp1 - yp0;
          __CLR4_4_1qmyqmylb90p9i6.R.inc(34626);polynomials[6][i] = 16 * (yMidDots[2][i] - ph2 + polynomials[4][i]);

          __CLR4_4_1qmyqmylb90p9i6.R.inc(34627);if ((((mu > 2)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34628)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34629)==0&false))) {{
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34630);final double ph3 = 6 * (bspl - aspl);
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34631);polynomials[7][i] = 16 * (yMidDots[3][i] - ph3 + 3 * polynomials[5][i]);

            __CLR4_4_1qmyqmylb90p9i6.R.inc(34632);for (int j = 4; (((j <= mu)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34633)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34634)==0&false)); ++j) {{
              __CLR4_4_1qmyqmylb90p9i6.R.inc(34635);final double fac1 = 0.5 * j * (j - 1);
              __CLR4_4_1qmyqmylb90p9i6.R.inc(34636);final double fac2 = 2 * fac1 * (j - 2) * (j - 3);
              __CLR4_4_1qmyqmylb90p9i6.R.inc(34637);polynomials[j+4][i] =
                  16 * (yMidDots[j][i] + fac1 * polynomials[j+2][i] - fac2 * polynomials[j][i]);
            }

          }}
        }}
      }}
    }}

  }}finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** Estimate interpolation error.
   * @param scale scaling array
   * @return estimate of the interpolation error
   */
  public double estimateError(final double[] scale) {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34638);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34639);double error = 0;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34640);if ((((currentDegree >= 5)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34641)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34642)==0&false))) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34643);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34644)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34645)==0&false)); ++i) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34646);final double e = polynomials[currentDegree][i] / scale[i];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34647);error += e * e;
      }
      }__CLR4_4_1qmyqmylb90p9i6.R.inc(34648);error = FastMath.sqrt(error / scale.length) * errfac[currentDegree - 5];
    }
    }__CLR4_4_1qmyqmylb90p9i6.R.inc(34649);return error;
  }finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                                        final double oneMinusThetaH) {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34650);

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34651);final int dimension = currentState.length;

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34652);final double oneMinusTheta = 1.0 - theta;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34653);final double theta05       = theta - 0.5;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34654);final double tOmT          = theta * oneMinusTheta;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34655);final double t4            = tOmT * tOmT;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34656);final double t4Dot         = 2 * tOmT * (1 - 2 * theta);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34657);final double dot1          = 1.0 / h;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34658);final double dot2          = theta * (2 - 3 * theta) / h;
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34659);final double dot3          = ((3 * theta - 4) * theta + 1) / h;

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34660);for (int i = 0; (((i < dimension)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34661)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34662)==0&false)); ++i) {{

        __CLR4_4_1qmyqmylb90p9i6.R.inc(34663);final double p0 = polynomials[0][i];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34664);final double p1 = polynomials[1][i];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34665);final double p2 = polynomials[2][i];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34666);final double p3 = polynomials[3][i];
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34667);interpolatedState[i] = p0 + theta * (p1 + oneMinusTheta * (p2 * theta + p3 * oneMinusTheta));
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34668);interpolatedDerivatives[i] = dot1 * p1 + dot2 * p2 + dot3 * p3;

        __CLR4_4_1qmyqmylb90p9i6.R.inc(34669);if ((((currentDegree > 3)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34670)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34671)==0&false))) {{
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34672);double cDot = 0;
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34673);double c = polynomials[currentDegree][i];
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34674);for (int j = currentDegree - 1; (((j > 3)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34675)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34676)==0&false)); --j) {{
                __CLR4_4_1qmyqmylb90p9i6.R.inc(34677);final double d = 1.0 / (j - 3);
                __CLR4_4_1qmyqmylb90p9i6.R.inc(34678);cDot = d * (theta05 * cDot + c);
                __CLR4_4_1qmyqmylb90p9i6.R.inc(34679);c = polynomials[j][i] + c * d * theta05;
            }
            }__CLR4_4_1qmyqmylb90p9i6.R.inc(34680);interpolatedState[i]       += t4 * c;
            __CLR4_4_1qmyqmylb90p9i6.R.inc(34681);interpolatedDerivatives[i] += (t4 * cDot + t4Dot * c) / h;
        }

    }}

    }__CLR4_4_1qmyqmylb90p9i6.R.inc(34682);if ((((h == 0)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34683)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34684)==0&false))) {{
        // in this degenerated case, the previous computation leads to NaN for derivatives
        // we fix this by using the derivatives at midpoint
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34685);System.arraycopy(yMidDots[1], 0, interpolatedDerivatives, 0, dimension);
    }

  }}finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void writeExternal(final ObjectOutput out)
    throws IOException {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34686);

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34687);final int dimension = ((((currentState == null) )&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34688)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34689)==0&false))? -1 : currentState.length;

    // save the state of the base class
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34690);writeBaseExternal(out);

    // save the local attributes (but not the temporary vectors)
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34691);out.writeInt(currentDegree);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34692);for (int k = 0; (((k <= currentDegree)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34693)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34694)==0&false)); ++k) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34695);for (int l = 0; (((l < dimension)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34696)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34697)==0&false)); ++l) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34698);out.writeDouble(polynomials[k][l]);
      }
    }}

  }}finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void readExternal(final ObjectInput in)
    throws IOException, ClassNotFoundException {try{__CLR4_4_1qmyqmylb90p9i6.R.inc(34699);

    // read the base class
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34700);final double t = readBaseExternal(in);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34701);final int dimension = ((((currentState == null) )&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34702)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34703)==0&false))? -1 : currentState.length;

    // read the local attributes
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34704);final int degree = in.readInt();
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34705);resetTables(degree);
    __CLR4_4_1qmyqmylb90p9i6.R.inc(34706);currentDegree = degree;

    __CLR4_4_1qmyqmylb90p9i6.R.inc(34707);for (int k = 0; (((k <= currentDegree)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34708)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34709)==0&false)); ++k) {{
      __CLR4_4_1qmyqmylb90p9i6.R.inc(34710);for (int l = 0; (((l < dimension)&&(__CLR4_4_1qmyqmylb90p9i6.R.iget(34711)!=0|true))||(__CLR4_4_1qmyqmylb90p9i6.R.iget(34712)==0&false)); ++l) {{
        __CLR4_4_1qmyqmylb90p9i6.R.inc(34713);polynomials[k][l] = in.readDouble();
      }
    }}

    // we can now set the interpolated time and state
    }__CLR4_4_1qmyqmylb90p9i6.R.inc(34714);setInterpolatedTime(t);

  }finally{__CLR4_4_1qmyqmylb90p9i6.R.flushNeeded();}}

}
