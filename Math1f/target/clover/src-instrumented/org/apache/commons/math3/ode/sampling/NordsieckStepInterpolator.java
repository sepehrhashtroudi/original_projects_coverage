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

package org.apache.commons.math3.ode.sampling;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements an interpolator for integrators using Nordsieck representation.
 *
 * <p>This interpolator computes dense output around the current point.
 * The interpolation equation is based on Taylor series formulas.
 *
 * @see org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator
 * @see org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator
 * @version $Id$
 * @since 2.0
 */

public class NordsieckStepInterpolator extends AbstractStepInterpolator {public static class __CLR4_4_1r76r76lb90p9jx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -7179861704951334960L;

    /** State variation. */
    protected double[] stateVariation;

    /** Step size used in the first scaled derivative and Nordsieck vector. */
    private double scalingH;

    /** Reference time for all arrays.
     * <p>Sometimes, the reference time is the same as previousTime,
     * sometimes it is the same as currentTime, so we use a separate
     * field to avoid any confusion.
     * </p>
     */
    private double referenceTime;

    /** First scaled derivative. */
    private double[] scaled;

    /** Nordsieck vector. */
    private Array2DRowRealMatrix nordsieck;

    /** Simple constructor.
     * This constructor builds an instance that is not usable yet, the
     * {@link AbstractStepInterpolator#reinitialize} method should be called
     * before using the instance in order to initialize the internal arrays. This
     * constructor is used only in order to delay the initialization in
     * some cases.
     */
    public NordsieckStepInterpolator() {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35250);
    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** Copy constructor.
     * @param interpolator interpolator to copy from. The copy is a deep
     * copy: its arrays are separated from the original arrays of the
     * instance
     */
    public NordsieckStepInterpolator(final NordsieckStepInterpolator interpolator) {
        super(interpolator);__CLR4_4_1r76r76lb90p9jx.R.inc(35252);try{__CLR4_4_1r76r76lb90p9jx.R.inc(35251);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35253);scalingH      = interpolator.scalingH;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35254);referenceTime = interpolator.referenceTime;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35255);if ((((interpolator.scaled != null)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35256)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35257)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35258);scaled = interpolator.scaled.clone();
        }
        }__CLR4_4_1r76r76lb90p9jx.R.inc(35259);if ((((interpolator.nordsieck != null)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35260)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35261)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35262);nordsieck = new Array2DRowRealMatrix(interpolator.nordsieck.getDataRef(), true);
        }
        }__CLR4_4_1r76r76lb90p9jx.R.inc(35263);if ((((interpolator.stateVariation != null)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35264)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35265)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35266);stateVariation = interpolator.stateVariation.clone();
        }
    }}finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected StepInterpolator doCopy() {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35267);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35268);return new NordsieckStepInterpolator(this);
    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** Reinitialize the instance.
     * <p>Beware that all arrays <em>must</em> be references to integrator
     * arrays, in order to ensure proper update without copy.</p>
     * @param y reference to the integrator array holding the state at
     * the end of the step
     * @param forward integration direction indicator
     * @param primaryMapper equations mapper for the primary equations set
     * @param secondaryMappers equations mappers for the secondary equations sets
     */
    @Override
    public void reinitialize(final double[] y, final boolean forward,
                             final EquationsMapper primaryMapper,
                             final EquationsMapper[] secondaryMappers) {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35269);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35270);super.reinitialize(y, forward, primaryMapper, secondaryMappers);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35271);stateVariation = new double[y.length];
    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** Reinitialize the instance.
     * <p>Beware that all arrays <em>must</em> be references to integrator
     * arrays, in order to ensure proper update without copy.</p>
     * @param time time at which all arrays are defined
     * @param stepSize step size used in the scaled and Nordsieck arrays
     * @param scaledDerivative reference to the integrator array holding the first
     * scaled derivative
     * @param nordsieckVector reference to the integrator matrix holding the
     * Nordsieck vector
     */
    public void reinitialize(final double time, final double stepSize,
                             final double[] scaledDerivative,
                             final Array2DRowRealMatrix nordsieckVector) {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35272);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35273);this.referenceTime = time;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35274);this.scalingH      = stepSize;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35275);this.scaled        = scaledDerivative;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35276);this.nordsieck     = nordsieckVector;

        // make sure the state and derivatives will depend on the new arrays
        __CLR4_4_1r76r76lb90p9jx.R.inc(35277);setInterpolatedTime(getInterpolatedTime());

    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** Rescale the instance.
     * <p>Since the scaled and Nordsieck arrays are shared with the caller,
     * this method has the side effect of rescaling this arrays in the caller too.</p>
     * @param stepSize new step size to use in the scaled and Nordsieck arrays
     */
    public void rescale(final double stepSize) {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35278);

        __CLR4_4_1r76r76lb90p9jx.R.inc(35279);final double ratio = stepSize / scalingH;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35280);for (int i = 0; (((i < scaled.length)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35281)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35282)==0&false)); ++i) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35283);scaled[i] *= ratio;
        }

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35284);final double[][] nData = nordsieck.getDataRef();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35285);double power = ratio;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35286);for (int i = 0; (((i < nData.length)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35287)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35288)==0&false)); ++i) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35289);power *= ratio;
            __CLR4_4_1r76r76lb90p9jx.R.inc(35290);final double[] nDataI = nData[i];
            __CLR4_4_1r76r76lb90p9jx.R.inc(35291);for (int j = 0; (((j < nDataI.length)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35292)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35293)==0&false)); ++j) {{
                __CLR4_4_1r76r76lb90p9jx.R.inc(35294);nDataI[j] *= power;
            }
        }}

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35295);scalingH = stepSize;

    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /**
     * Get the state vector variation from current to interpolated state.
     * <p>This method is aimed at computing y(t<sub>interpolation</sub>)
     * -y(t<sub>current</sub>) accurately by avoiding the cancellation errors
     * that would occur if the subtraction were performed explicitly.</p>
     * <p>The returned vector is a reference to a reused array, so
     * it should not be modified and it should be copied if it needs
     * to be preserved across several calls.</p>
     * @return state vector at time {@link #getInterpolatedTime}
     * @see #getInterpolatedDerivatives()
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     */
    public double[] getInterpolatedStateVariation() throws MaxCountExceededException {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35296);
        // compute and ignore interpolated state
        // to make sure state variation is computed as a side effect
        __CLR4_4_1r76r76lb90p9jx.R.inc(35297);getInterpolatedState();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35298);return stateVariation;
    }finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35299);

        __CLR4_4_1r76r76lb90p9jx.R.inc(35300);final double x = interpolatedTime - referenceTime;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35301);final double normalizedAbscissa = x / scalingH;

        __CLR4_4_1r76r76lb90p9jx.R.inc(35302);Arrays.fill(stateVariation, 0.0);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35303);Arrays.fill(interpolatedDerivatives, 0.0);

        // apply Taylor formula from high order to low order,
        // for the sake of numerical accuracy
        __CLR4_4_1r76r76lb90p9jx.R.inc(35304);final double[][] nData = nordsieck.getDataRef();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35305);for (int i = nData.length - 1; (((i >= 0)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35306)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35307)==0&false)); --i) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35308);final int order = i + 2;
            __CLR4_4_1r76r76lb90p9jx.R.inc(35309);final double[] nDataI = nData[i];
            __CLR4_4_1r76r76lb90p9jx.R.inc(35310);final double power = FastMath.pow(normalizedAbscissa, order);
            __CLR4_4_1r76r76lb90p9jx.R.inc(35311);for (int j = 0; (((j < nDataI.length)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35312)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35313)==0&false)); ++j) {{
                __CLR4_4_1r76r76lb90p9jx.R.inc(35314);final double d = nDataI[j] * power;
                __CLR4_4_1r76r76lb90p9jx.R.inc(35315);stateVariation[j]          += d;
                __CLR4_4_1r76r76lb90p9jx.R.inc(35316);interpolatedDerivatives[j] += order * d;
            }
        }}

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35317);for (int j = 0; (((j < currentState.length)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35318)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35319)==0&false)); ++j) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35320);stateVariation[j] += scaled[j] * normalizedAbscissa;
            __CLR4_4_1r76r76lb90p9jx.R.inc(35321);interpolatedState[j] = currentState[j] + stateVariation[j];
            __CLR4_4_1r76r76lb90p9jx.R.inc(35322);interpolatedDerivatives[j] =
                (interpolatedDerivatives[j] + scaled[j] * normalizedAbscissa) / x;
        }

    }}finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void writeExternal(final ObjectOutput out)
        throws IOException {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35323);

        // save the state of the base class
        __CLR4_4_1r76r76lb90p9jx.R.inc(35324);writeBaseExternal(out);

        // save the local attributes
        __CLR4_4_1r76r76lb90p9jx.R.inc(35325);out.writeDouble(scalingH);
        __CLR4_4_1r76r76lb90p9jx.R.inc(35326);out.writeDouble(referenceTime);

        __CLR4_4_1r76r76lb90p9jx.R.inc(35327);final int n = ((((currentState == null) )&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35328)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35329)==0&false))? -1 : currentState.length;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35330);if ((((scaled == null)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35331)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35332)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35333);out.writeBoolean(false);
        } }else {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35334);out.writeBoolean(true);
            __CLR4_4_1r76r76lb90p9jx.R.inc(35335);for (int j = 0; (((j < n)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35336)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35337)==0&false)); ++j) {{
                __CLR4_4_1r76r76lb90p9jx.R.inc(35338);out.writeDouble(scaled[j]);
            }
        }}

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35339);if ((((nordsieck == null)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35340)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35341)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35342);out.writeBoolean(false);
        } }else {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35343);out.writeBoolean(true);
            __CLR4_4_1r76r76lb90p9jx.R.inc(35344);out.writeObject(nordsieck);
        }

        // we don't save state variation, it will be recomputed

    }}finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void readExternal(final ObjectInput in)
        throws IOException, ClassNotFoundException {try{__CLR4_4_1r76r76lb90p9jx.R.inc(35345);

        // read the base class
        __CLR4_4_1r76r76lb90p9jx.R.inc(35346);final double t = readBaseExternal(in);

        // read the local attributes
        __CLR4_4_1r76r76lb90p9jx.R.inc(35347);scalingH      = in.readDouble();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35348);referenceTime = in.readDouble();

        __CLR4_4_1r76r76lb90p9jx.R.inc(35349);final int n = ((((currentState == null) )&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35350)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35351)==0&false))? -1 : currentState.length;
        __CLR4_4_1r76r76lb90p9jx.R.inc(35352);final boolean hasScaled = in.readBoolean();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35353);if ((((hasScaled)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35354)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35355)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35356);scaled = new double[n];
            __CLR4_4_1r76r76lb90p9jx.R.inc(35357);for (int j = 0; (((j < n)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35358)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35359)==0&false)); ++j) {{
                __CLR4_4_1r76r76lb90p9jx.R.inc(35360);scaled[j] = in.readDouble();
            }
        }} }else {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35361);scaled = null;
        }

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35362);final boolean hasNordsieck = in.readBoolean();
        __CLR4_4_1r76r76lb90p9jx.R.inc(35363);if ((((hasNordsieck)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35364)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35365)==0&false))) {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35366);nordsieck = (Array2DRowRealMatrix) in.readObject();
        } }else {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35367);nordsieck = null;
        }

        }__CLR4_4_1r76r76lb90p9jx.R.inc(35368);if ((((hasScaled && hasNordsieck)&&(__CLR4_4_1r76r76lb90p9jx.R.iget(35369)!=0|true))||(__CLR4_4_1r76r76lb90p9jx.R.iget(35370)==0&false))) {{
            // we can now set the interpolated time and state
            __CLR4_4_1r76r76lb90p9jx.R.inc(35371);stateVariation = new double[n];
            __CLR4_4_1r76r76lb90p9jx.R.inc(35372);setInterpolatedTime(t);
        } }else {{
            __CLR4_4_1r76r76lb90p9jx.R.inc(35373);stateVariation = null;
        }

    }}finally{__CLR4_4_1r76r76lb90p9jx.R.flushNeeded();}}

}
