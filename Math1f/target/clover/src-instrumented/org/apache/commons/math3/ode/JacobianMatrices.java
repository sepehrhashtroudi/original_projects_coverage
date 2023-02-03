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
package org.apache.commons.math3.ode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * This class defines a set of {@link SecondaryEquations secondary equations} to
 * compute the Jacobian matrices with respect to the initial state vector and, if
 * any, to some parameters of the primary ODE set.
 * <p>
 * It is intended to be packed into an {@link ExpandableStatefulODE}
 * in conjunction with a primary set of ODE, which may be:
 * <ul>
 * <li>a {@link FirstOrderDifferentialEquations}</li>
 * <li>a {@link MainStateJacobianProvider}</li>
 * </ul>
 * In order to compute Jacobian matrices with respect to some parameters of the
 * primary ODE set, the following parameter Jacobian providers may be set:
 * <ul>
 * <li>a {@link ParameterJacobianProvider}</li>
 * <li>a {@link ParameterizedODE}</li>
 * </ul>
 * </p>
 *
 * @see ExpandableStatefulODE
 * @see FirstOrderDifferentialEquations
 * @see MainStateJacobianProvider
 * @see ParameterJacobianProvider
 * @see ParameterizedODE
 *
 * @version $Id$
 * @since 3.0
 */
public class JacobianMatrices {public static class __CLR4_4_1owzowzlb90p9av{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Expandable first order differential equation. */
    private ExpandableStatefulODE efode;

    /** Index of the instance in the expandable set. */
    private int index;

    /** FODE with exact primary Jacobian computation skill. */
    private MainStateJacobianProvider jode;

    /** FODE without exact parameter Jacobian computation skill. */
    private ParameterizedODE pode;

    /** Main state vector dimension. */
    private int stateDim;

    /** Selected parameters for parameter Jacobian computation. */
    private ParameterConfiguration[] selectedParameters;

    /** FODE with exact parameter Jacobian computation skill. */
    private List<ParameterJacobianProvider> jacobianProviders;

    /** Parameters dimension. */
    private int paramDim;

    /** Boolean for selected parameters consistency. */
    private boolean dirtyParameter;

    /** State and parameters Jacobian matrices in a row. */
    private double[] matricesData;

    /** Simple constructor for a secondary equations set computing Jacobian matrices.
     * <p>
     * Parameters must belong to the supported ones given by {@link
     * Parameterizable#getParametersNames()}, so the primary set of differential
     * equations must be {@link Parameterizable}.
     * </p>
     * <p>Note that each selection clears the previous selected parameters.</p>
     *
     * @param fode the primary first order differential equations set to extend
     * @param hY step used for finite difference computation with respect to state vector
     * @param parameters parameters to consider for Jacobian matrices processing
     * (may be null if parameters Jacobians is not desired)
     * @exception DimensionMismatchException if there is a dimension mismatch between
     * the steps array {@code hY} and the equation dimension
     */
    public JacobianMatrices(final FirstOrderDifferentialEquations fode, final double[] hY,
                            final String... parameters)
        throws DimensionMismatchException {
        this(new MainStateJacobianWrapper(fode, hY), parameters);__CLR4_4_1owzowzlb90p9av.R.inc(32292);try{__CLR4_4_1owzowzlb90p9av.R.inc(32291);
    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Simple constructor for a secondary equations set computing Jacobian matrices.
     * <p>
     * Parameters must belong to the supported ones given by {@link
     * Parameterizable#getParametersNames()}, so the primary set of differential
     * equations must be {@link Parameterizable}.
     * </p>
     * <p>Note that each selection clears the previous selected parameters.</p>
     *
     * @param jode the primary first order differential equations set to extend
     * @param parameters parameters to consider for Jacobian matrices processing
     * (may be null if parameters Jacobians is not desired)
     */
    public JacobianMatrices(final MainStateJacobianProvider jode,
                            final String... parameters) {try{__CLR4_4_1owzowzlb90p9av.R.inc(32293);

        __CLR4_4_1owzowzlb90p9av.R.inc(32294);this.efode = null;
        __CLR4_4_1owzowzlb90p9av.R.inc(32295);this.index = -1;

        __CLR4_4_1owzowzlb90p9av.R.inc(32296);this.jode = jode;
        __CLR4_4_1owzowzlb90p9av.R.inc(32297);this.pode = null;

        __CLR4_4_1owzowzlb90p9av.R.inc(32298);this.stateDim = jode.getDimension();

        __CLR4_4_1owzowzlb90p9av.R.inc(32299);if ((((parameters == null)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32300)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32301)==0&false))) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32302);selectedParameters = null;
            __CLR4_4_1owzowzlb90p9av.R.inc(32303);paramDim = 0;
        } }else {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32304);this.selectedParameters = new ParameterConfiguration[parameters.length];
            __CLR4_4_1owzowzlb90p9av.R.inc(32305);for (int i = 0; (((i < parameters.length)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32306)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32307)==0&false)); ++i) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32308);selectedParameters[i] = new ParameterConfiguration(parameters[i], Double.NaN);
            }
            }__CLR4_4_1owzowzlb90p9av.R.inc(32309);paramDim = parameters.length;
        }
        }__CLR4_4_1owzowzlb90p9av.R.inc(32310);this.dirtyParameter = false;

        __CLR4_4_1owzowzlb90p9av.R.inc(32311);this.jacobianProviders = new ArrayList<ParameterJacobianProvider>();

        // set the default initial state Jacobian to the identity
        // and the default initial parameters Jacobian to the null matrix
        __CLR4_4_1owzowzlb90p9av.R.inc(32312);matricesData = new double[(stateDim + paramDim) * stateDim];
        __CLR4_4_1owzowzlb90p9av.R.inc(32313);for (int i = 0; (((i < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32314)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32315)==0&false)); ++i) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32316);matricesData[i * (stateDim + 1)] = 1.0;
        }

    }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Register the variational equations for the Jacobians matrices to the expandable set.
     * @param expandable expandable set into which variational equations should be registered
     * @throws DimensionMismatchException if the dimension of the partial state does not
     * match the selected equations set dimension
     * @exception MismatchedEquations if the primary set of the expandable set does
     * not match the one used to build the instance
     * @see ExpandableStatefulODE#addSecondaryEquations(SecondaryEquations)
     */
    public void registerVariationalEquations(final ExpandableStatefulODE expandable)
        throws DimensionMismatchException, MismatchedEquations {try{__CLR4_4_1owzowzlb90p9av.R.inc(32317);

        // safety checks
        __CLR4_4_1owzowzlb90p9av.R.inc(32318);final FirstOrderDifferentialEquations ode = ((((jode instanceof MainStateJacobianWrapper) )&&(__CLR4_4_1owzowzlb90p9av.R.iget(32319)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32320)==0&false))?
                                                    ((MainStateJacobianWrapper) jode).ode :
                                                    jode;
        __CLR4_4_1owzowzlb90p9av.R.inc(32321);if ((((expandable.getPrimary() != ode)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32322)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32323)==0&false))) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32324);throw new MismatchedEquations();
        }

        }__CLR4_4_1owzowzlb90p9av.R.inc(32325);efode = expandable;
        __CLR4_4_1owzowzlb90p9av.R.inc(32326);index = efode.addSecondaryEquations(new JacobiansSecondaryEquations());
        __CLR4_4_1owzowzlb90p9av.R.inc(32327);efode.setSecondaryState(index, matricesData);

    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Add a parameter Jacobian provider.
     * @param provider the parameter Jacobian provider to compute exactly the parameter Jacobian matrix
     */
    public void addParameterJacobianProvider(final ParameterJacobianProvider provider) {try{__CLR4_4_1owzowzlb90p9av.R.inc(32328);
        __CLR4_4_1owzowzlb90p9av.R.inc(32329);jacobianProviders.add(provider);
    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Set a parameter Jacobian provider.
     * @param parameterizedOde the parameterized ODE to compute the parameter Jacobian matrix using finite differences
     */
    public void setParameterizedODE(final ParameterizedODE parameterizedOde) {try{__CLR4_4_1owzowzlb90p9av.R.inc(32330);
        __CLR4_4_1owzowzlb90p9av.R.inc(32331);this.pode = parameterizedOde;
        __CLR4_4_1owzowzlb90p9av.R.inc(32332);dirtyParameter = true;
    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Set the step associated to a parameter in order to compute by finite
     *  difference the Jacobian matrix.
     * <p>
     * Needed if and only if the primary ODE set is a {@link ParameterizedODE}.
     * </p>
     * <p>
     * Given a non zero parameter value pval for the parameter, a reasonable value
     * for such a step is {@code pval * FastMath.sqrt(Precision.EPSILON)}.
     * </p>
     * <p>
     * A zero value for such a step doesn't enable to compute the parameter Jacobian matrix.
     * </p>
     * @param parameter parameter to consider for Jacobian processing
     * @param hP step for Jacobian finite difference computation w.r.t. the specified parameter
     * @see ParameterizedODE
     * @exception UnknownParameterException if the parameter is not supported
     */
    public void setParameterStep(final String parameter, final double hP)
        throws UnknownParameterException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32333);

        __CLR4_4_1owzowzlb90p9av.R.inc(32334);for (ParameterConfiguration param: selectedParameters) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32335);if ((((parameter.equals(param.getParameterName()))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32336)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32337)==0&false))) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32338);param.setHP(hP);
                __CLR4_4_1owzowzlb90p9av.R.inc(32339);dirtyParameter = true;
                __CLR4_4_1owzowzlb90p9av.R.inc(32340);return;
            }
        }}

        }__CLR4_4_1owzowzlb90p9av.R.inc(32341);throw new UnknownParameterException(parameter);

    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Set the initial value of the Jacobian matrix with respect to state.
     * <p>
     * If this method is not called, the initial value of the Jacobian
     * matrix with respect to state is set to identity.
     * </p>
     * @param dYdY0 initial Jacobian matrix w.r.t. state
     * @exception DimensionMismatchException if matrix dimensions are incorrect
     */
    public void setInitialMainStateJacobian(final double[][] dYdY0)
        throws DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32342);

        // Check dimensions
        __CLR4_4_1owzowzlb90p9av.R.inc(32343);checkDimension(stateDim, dYdY0);
        __CLR4_4_1owzowzlb90p9av.R.inc(32344);checkDimension(stateDim, dYdY0[0]);

        // store the matrix in row major order as a single dimension array
        __CLR4_4_1owzowzlb90p9av.R.inc(32345);int i = 0;
        __CLR4_4_1owzowzlb90p9av.R.inc(32346);for (final double[] row : dYdY0) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32347);System.arraycopy(row, 0, matricesData, i, stateDim);
            __CLR4_4_1owzowzlb90p9av.R.inc(32348);i += stateDim;
        }

        }__CLR4_4_1owzowzlb90p9av.R.inc(32349);if ((((efode != null)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32350)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32351)==0&false))) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32352);efode.setSecondaryState(index, matricesData);
        }

    }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Set the initial value of a column of the Jacobian matrix with respect to one parameter.
     * <p>
     * If this method is not called for some parameter, the initial value of
     * the column of the Jacobian matrix with respect to this parameter is set to zero.
     * </p>
     * @param pName parameter name
     * @param dYdP initial Jacobian column vector with respect to the parameter
     * @exception UnknownParameterException if a parameter is not supported
     * @throws DimensionMismatchException if the column vector does not match state dimension
     */
    public void setInitialParameterJacobian(final String pName, final double[] dYdP)
        throws UnknownParameterException, DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32353);

        // Check dimensions
        __CLR4_4_1owzowzlb90p9av.R.inc(32354);checkDimension(stateDim, dYdP);

        // store the column in a global single dimension array
        __CLR4_4_1owzowzlb90p9av.R.inc(32355);int i = stateDim * stateDim;
        __CLR4_4_1owzowzlb90p9av.R.inc(32356);for (ParameterConfiguration param: selectedParameters) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32357);if ((((pName.equals(param.getParameterName()))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32358)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32359)==0&false))) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32360);System.arraycopy(dYdP, 0, matricesData, i, stateDim);
                __CLR4_4_1owzowzlb90p9av.R.inc(32361);if ((((efode != null)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32362)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32363)==0&false))) {{
                    __CLR4_4_1owzowzlb90p9av.R.inc(32364);efode.setSecondaryState(index, matricesData);
                }
                }__CLR4_4_1owzowzlb90p9av.R.inc(32365);return;
            }
            }__CLR4_4_1owzowzlb90p9av.R.inc(32366);i += stateDim;
        }

        }__CLR4_4_1owzowzlb90p9av.R.inc(32367);throw new UnknownParameterException(pName);

    }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Get the current value of the Jacobian matrix with respect to state.
     * @param dYdY0 current Jacobian matrix with respect to state.
     */
    public void getCurrentMainSetJacobian(final double[][] dYdY0) {try{__CLR4_4_1owzowzlb90p9av.R.inc(32368);

        // get current state for this set of equations from the expandable fode
        __CLR4_4_1owzowzlb90p9av.R.inc(32369);double[] p = efode.getSecondaryState(index);

        __CLR4_4_1owzowzlb90p9av.R.inc(32370);int j = 0;
        __CLR4_4_1owzowzlb90p9av.R.inc(32371);for (int i = 0; (((i < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32372)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32373)==0&false)); i++) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32374);System.arraycopy(p, j, dYdY0[i], 0, stateDim);
            __CLR4_4_1owzowzlb90p9av.R.inc(32375);j += stateDim;
        }

    }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Get the current value of the Jacobian matrix with respect to one parameter.
     * @param pName name of the parameter for the computed Jacobian matrix
     * @param dYdP current Jacobian matrix with respect to the named parameter
     */
    public void getCurrentParameterJacobian(String pName, final double[] dYdP) {try{__CLR4_4_1owzowzlb90p9av.R.inc(32376);

        // get current state for this set of equations from the expandable fode
        __CLR4_4_1owzowzlb90p9av.R.inc(32377);double[] p = efode.getSecondaryState(index);

        __CLR4_4_1owzowzlb90p9av.R.inc(32378);int i = stateDim * stateDim;
        __CLR4_4_1owzowzlb90p9av.R.inc(32379);for (ParameterConfiguration param: selectedParameters) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32380);if ((((param.getParameterName().equals(pName))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32381)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32382)==0&false))) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32383);System.arraycopy(p, i, dYdP, 0, stateDim);
                __CLR4_4_1owzowzlb90p9av.R.inc(32384);return;
            }
            }__CLR4_4_1owzowzlb90p9av.R.inc(32385);i += stateDim;
        }

    }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Check array dimensions.
     * @param expected expected dimension
     * @param array (may be null if expected is 0)
     * @throws DimensionMismatchException if the array dimension does not match the expected one
     */
    private void checkDimension(final int expected, final Object array)
        throws DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32386);
        __CLR4_4_1owzowzlb90p9av.R.inc(32387);int arrayDimension = ((((array == null) )&&(__CLR4_4_1owzowzlb90p9av.R.iget(32388)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32389)==0&false))? 0 : Array.getLength(array);
        __CLR4_4_1owzowzlb90p9av.R.inc(32390);if ((((arrayDimension != expected)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32391)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32392)==0&false))) {{
            __CLR4_4_1owzowzlb90p9av.R.inc(32393);throw new DimensionMismatchException(arrayDimension, expected);
        }
    }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    /** Local implementation of secondary equations.
     * <p>
     * This class is an inner class to ensure proper scheduling of calls
     * by forcing the use of {@link JacobianMatrices#registerVariationalEquations(ExpandableStatefulODE)}.
     * </p>
     */
    private class JacobiansSecondaryEquations implements SecondaryEquations {

        /** {@inheritDoc} */
        public int getDimension() {try{__CLR4_4_1owzowzlb90p9av.R.inc(32394);
            __CLR4_4_1owzowzlb90p9av.R.inc(32395);return stateDim * (stateDim + paramDim);
        }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void computeDerivatives(final double t, final double[] y, final double[] yDot,
                                       final double[] z, final double[] zDot)
            throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32396);

            // Lazy initialization
            __CLR4_4_1owzowzlb90p9av.R.inc(32397);if ((((dirtyParameter && (paramDim != 0))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32398)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32399)==0&false))) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32400);jacobianProviders.add(new ParameterJacobianWrapper(jode, pode, selectedParameters));
                __CLR4_4_1owzowzlb90p9av.R.inc(32401);dirtyParameter = false;
            }

            // variational equations:
            // from d[dy/dt]/dy0 and d[dy/dt]/dp to d[dy/dy0]/dt and d[dy/dp]/dt

            // compute Jacobian matrix with respect to primary state
            }__CLR4_4_1owzowzlb90p9av.R.inc(32402);double[][] dFdY = new double[stateDim][stateDim];
            __CLR4_4_1owzowzlb90p9av.R.inc(32403);jode.computeMainStateJacobian(t, y, yDot, dFdY);

            // Dispatch Jacobian matrix in the compound secondary state vector
            __CLR4_4_1owzowzlb90p9av.R.inc(32404);for (int i = 0; (((i < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32405)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32406)==0&false)); ++i) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32407);final double[] dFdYi = dFdY[i];
                __CLR4_4_1owzowzlb90p9av.R.inc(32408);for (int j = 0; (((j < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32409)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32410)==0&false)); ++j) {{
                    __CLR4_4_1owzowzlb90p9av.R.inc(32411);double s = 0;
                    __CLR4_4_1owzowzlb90p9av.R.inc(32412);final int startIndex = j;
                    __CLR4_4_1owzowzlb90p9av.R.inc(32413);int zIndex = startIndex;
                    __CLR4_4_1owzowzlb90p9av.R.inc(32414);for (int l = 0; (((l < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32415)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32416)==0&false)); ++l) {{
                        __CLR4_4_1owzowzlb90p9av.R.inc(32417);s += dFdYi[l] * z[zIndex];
                        __CLR4_4_1owzowzlb90p9av.R.inc(32418);zIndex += stateDim;
                    }
                    }__CLR4_4_1owzowzlb90p9av.R.inc(32419);zDot[startIndex + i * stateDim] = s;
                }
            }}

            }__CLR4_4_1owzowzlb90p9av.R.inc(32420);if ((((paramDim != 0)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32421)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32422)==0&false))) {{
                // compute Jacobian matrices with respect to parameters
                __CLR4_4_1owzowzlb90p9av.R.inc(32423);double[] dFdP = new double[stateDim];
                __CLR4_4_1owzowzlb90p9av.R.inc(32424);int startIndex = stateDim * stateDim;
                __CLR4_4_1owzowzlb90p9av.R.inc(32425);for (ParameterConfiguration param: selectedParameters) {{
                    __CLR4_4_1owzowzlb90p9av.R.inc(32426);boolean found = false;
                    __CLR4_4_1owzowzlb90p9av.R.inc(32427);for (int k = 0 ; ((((!found) && (k < jacobianProviders.size()))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32428)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32429)==0&false)); ++k) {{
                        __CLR4_4_1owzowzlb90p9av.R.inc(32430);final ParameterJacobianProvider provider = jacobianProviders.get(k);
                        __CLR4_4_1owzowzlb90p9av.R.inc(32431);if ((((provider.isSupported(param.getParameterName()))&&(__CLR4_4_1owzowzlb90p9av.R.iget(32432)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32433)==0&false))) {{
                            __CLR4_4_1owzowzlb90p9av.R.inc(32434);provider.computeParameterJacobian(t, y, yDot,
                                                              param.getParameterName(), dFdP);
                            __CLR4_4_1owzowzlb90p9av.R.inc(32435);for (int i = 0; (((i < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32436)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32437)==0&false)); ++i) {{
                                __CLR4_4_1owzowzlb90p9av.R.inc(32438);final double[] dFdYi = dFdY[i];
                                __CLR4_4_1owzowzlb90p9av.R.inc(32439);int zIndex = startIndex;
                                __CLR4_4_1owzowzlb90p9av.R.inc(32440);double s = dFdP[i];
                                __CLR4_4_1owzowzlb90p9av.R.inc(32441);for (int l = 0; (((l < stateDim)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32442)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32443)==0&false)); ++l) {{
                                    __CLR4_4_1owzowzlb90p9av.R.inc(32444);s += dFdYi[l] * z[zIndex];
                                    __CLR4_4_1owzowzlb90p9av.R.inc(32445);zIndex++;
                                }
                                }__CLR4_4_1owzowzlb90p9av.R.inc(32446);zDot[startIndex + i] = s;
                            }
                            }__CLR4_4_1owzowzlb90p9av.R.inc(32447);found = true;
                        }
                    }}
                    }__CLR4_4_1owzowzlb90p9av.R.inc(32448);if ((((! found)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32449)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32450)==0&false))) {{
                        __CLR4_4_1owzowzlb90p9av.R.inc(32451);Arrays.fill(zDot, startIndex, startIndex + stateDim, 0.0);
                    }
                    }__CLR4_4_1owzowzlb90p9av.R.inc(32452);startIndex += stateDim;
                }
            }}

        }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}
    }

    /** Wrapper class to compute jacobian matrices by finite differences for ODE
     *  which do not compute them by themselves.
     */
    private static class MainStateJacobianWrapper implements MainStateJacobianProvider {

        /** Raw ODE without jacobians computation skill to be wrapped into a MainStateJacobianProvider. */
        private final FirstOrderDifferentialEquations ode;

        /** Steps for finite difference computation of the jacobian df/dy w.r.t. state. */
        private final double[] hY;

        /** Wrap a {@link FirstOrderDifferentialEquations} into a {@link MainStateJacobianProvider}.
         * @param ode original ODE problem, without jacobians computation skill
         * @param hY step sizes to compute the jacobian df/dy
         * @see JacobianMatrices#setMainStateSteps(double[])
         * @exception DimensionMismatchException if there is a dimension mismatch between
         * the steps array {@code hY} and the equation dimension
         */
        public MainStateJacobianWrapper(final FirstOrderDifferentialEquations ode,
                                        final double[] hY)
            throws DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32453);
            __CLR4_4_1owzowzlb90p9av.R.inc(32454);this.ode = ode;
            __CLR4_4_1owzowzlb90p9av.R.inc(32455);this.hY = hY.clone();
            __CLR4_4_1owzowzlb90p9av.R.inc(32456);if ((((hY.length != ode.getDimension())&&(__CLR4_4_1owzowzlb90p9av.R.iget(32457)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32458)==0&false))) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32459);throw new DimensionMismatchException(ode.getDimension(), hY.length);
            }
        }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

        /** {@inheritDoc} */
        public int getDimension() {try{__CLR4_4_1owzowzlb90p9av.R.inc(32460);
            __CLR4_4_1owzowzlb90p9av.R.inc(32461);return ode.getDimension();
        }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void computeDerivatives(double t, double[] y, double[] yDot)
            throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32462);
            __CLR4_4_1owzowzlb90p9av.R.inc(32463);ode.computeDerivatives(t, y, yDot);
        }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY)
            throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1owzowzlb90p9av.R.inc(32464);

            __CLR4_4_1owzowzlb90p9av.R.inc(32465);final int n = ode.getDimension();
            __CLR4_4_1owzowzlb90p9av.R.inc(32466);final double[] tmpDot = new double[n];

            __CLR4_4_1owzowzlb90p9av.R.inc(32467);for (int j = 0; (((j < n)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32468)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32469)==0&false)); ++j) {{
                __CLR4_4_1owzowzlb90p9av.R.inc(32470);final double savedYj = y[j];
                __CLR4_4_1owzowzlb90p9av.R.inc(32471);y[j] += hY[j];
                __CLR4_4_1owzowzlb90p9av.R.inc(32472);ode.computeDerivatives(t, y, tmpDot);
                __CLR4_4_1owzowzlb90p9av.R.inc(32473);for (int i = 0; (((i < n)&&(__CLR4_4_1owzowzlb90p9av.R.iget(32474)!=0|true))||(__CLR4_4_1owzowzlb90p9av.R.iget(32475)==0&false)); ++i) {{
                    __CLR4_4_1owzowzlb90p9av.R.inc(32476);dFdY[i][j] = (tmpDot[i] - yDot[i]) / hY[j];
                }
                }__CLR4_4_1owzowzlb90p9av.R.inc(32477);y[j] = savedYj;
            }
        }}finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    }

    /**
     * Special exception for equations mismatch.
     * @since 3.1
     */
    public static class MismatchedEquations extends MathIllegalArgumentException {

        /** Serializable UID. */
        private static final long serialVersionUID = 20120902L;

        /** Simple constructor. */
        public MismatchedEquations() {
            super(LocalizedFormats.UNMATCHED_ODE_IN_EXPANDED_SET);__CLR4_4_1owzowzlb90p9av.R.inc(32479);try{__CLR4_4_1owzowzlb90p9av.R.inc(32478);
        }finally{__CLR4_4_1owzowzlb90p9av.R.flushNeeded();}}

    }

}

