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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;


/**
 * This class represents a combined set of first order differential equations,
 * with at least a primary set of equations expandable by some sets of secondary
 * equations.
 * <p>
 * One typical use case is the computation of the Jacobian matrix for some ODE.
 * In this case, the primary set of equations corresponds to the raw ODE, and we
 * add to this set another bunch of secondary equations which represent the Jacobian
 * matrix of the primary set.
 * </p>
 * <p>
 * We want the integrator to use <em>only</em> the primary set to estimate the
 * errors and hence the step sizes. It should <em>not</em> use the secondary
 * equations in this computation. The {@link AbstractIntegrator integrator} will
 * be able to know where the primary set ends and so where the secondary sets begin.
 * </p>
 *
 * @see FirstOrderDifferentialEquations
 * @see JacobianMatrices
 *
 * @version $Id$
 * @since 3.0
 */

public class ExpandableStatefulODE {public static class __CLR4_4_1ou3ou3lb90p9a4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Primary differential equation. */
    private final FirstOrderDifferentialEquations primary;

    /** Mapper for primary equation. */
    private final EquationsMapper primaryMapper;

    /** Time. */
    private double time;

    /** State. */
    private final double[] primaryState;

    /** State derivative. */
    private final double[] primaryStateDot;

    /** Components of the expandable ODE. */
    private List<SecondaryComponent> components;

    /** Build an expandable set from its primary ODE set.
     * @param primary the primary set of differential equations to be integrated.
     */
    public ExpandableStatefulODE(final FirstOrderDifferentialEquations primary) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32187);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32188);final int n          = primary.getDimension();
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32189);this.primary         = primary;
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32190);this.primaryMapper   = new EquationsMapper(0, n);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32191);this.time            = Double.NaN;
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32192);this.primaryState    = new double[n];
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32193);this.primaryStateDot = new double[n];
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32194);this.components      = new ArrayList<ExpandableStatefulODE.SecondaryComponent>();
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get the primary set of differential equations.
     * @return primary set of differential equations
     */
    public FirstOrderDifferentialEquations getPrimary() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32195);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32196);return primary;
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Return the dimension of the complete set of equations.
     * <p>
     * The complete set of equations correspond to the primary set plus all secondary sets.
     * </p>
     * @return dimension of the complete set of equations
     */
    public int getTotalDimension() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32197);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32198);if ((((components.isEmpty())&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32199)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32200)==0&false))) {{
            // there are no secondary equations, the complete set is limited to the primary set
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32201);return primaryMapper.getDimension();
        } }else {{
            // there are secondary equations, the complete set ends after the last set
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32202);final EquationsMapper lastMapper = components.get(components.size() - 1).mapper;
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32203);return lastMapper.getFirstIndex() + lastMapper.getDimension();
        }
    }}finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get the current time derivative of the complete state vector.
     * @param t current value of the independent <I>time</I> variable
     * @param y array containing the current value of the complete state vector
     * @param yDot placeholder array where to put the time derivative of the complete state vector
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     * @exception DimensionMismatchException if arrays dimensions do not match equations settings
     */
    public void computeDerivatives(final double t, final double[] y, final double[] yDot)
        throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32204);

        // compute derivatives of the primary equations
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32205);primaryMapper.extractEquationData(y, primaryState);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32206);primary.computeDerivatives(t, primaryState, primaryStateDot);

        // Add contribution for secondary equations
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32207);for (final SecondaryComponent component : components) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32208);component.mapper.extractEquationData(y, component.state);
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32209);component.equation.computeDerivatives(t, primaryState, primaryStateDot,
                                                  component.state, component.stateDot);
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32210);component.mapper.insertEquationData(component.stateDot, yDot);
        }

        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32211);primaryMapper.insertEquationData(primaryStateDot, yDot);

    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Add a set of secondary equations to be integrated along with the primary set.
     * @param secondary secondary equations set
     * @return index of the secondary equation in the expanded state
     */
    public int addSecondaryEquations(final SecondaryEquations secondary) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32212);

        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32213);final int firstIndex;
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32214);if ((((components.isEmpty())&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32215)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32216)==0&false))) {{
            // lazy creation of the components list
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32217);components = new ArrayList<ExpandableStatefulODE.SecondaryComponent>();
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32218);firstIndex = primary.getDimension();
        } }else {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32219);final SecondaryComponent last = components.get(components.size() - 1);
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32220);firstIndex = last.mapper.getFirstIndex() + last.mapper.getDimension();
        }

        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32221);components.add(new SecondaryComponent(secondary, firstIndex));

        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32222);return components.size() - 1;

    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get an equations mapper for the primary equations set.
     * @return mapper for the primary set
     * @see #getSecondaryMappers()
     */
    public EquationsMapper getPrimaryMapper() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32223);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32224);return primaryMapper;
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get the equations mappers for the secondary equations sets.
     * @return equations mappers for the secondary equations sets
     * @see #getPrimaryMapper()
     */
    public EquationsMapper[] getSecondaryMappers() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32225);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32226);final EquationsMapper[] mappers = new EquationsMapper[components.size()];
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32227);for (int i = 0; (((i < mappers.length)&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32228)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32229)==0&false)); ++i) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32230);mappers[i] = components.get(i).mapper;
        }
        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32231);return mappers;
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Set current time.
     * @param time current time
     */
    public void setTime(final double time) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32232);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32233);this.time = time;
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get current time.
     * @return current time
     */
    public double getTime() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32234);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32235);return time;
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Set primary part of the current state.
     * @param primaryState primary part of the current state
     * @throws DimensionMismatchException if the dimension of the array does not
     * match the primary set
     */
    public void setPrimaryState(final double[] primaryState) throws DimensionMismatchException {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32236);

        // safety checks
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32237);if ((((primaryState.length != this.primaryState.length)&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32238)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32239)==0&false))) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32240);throw new DimensionMismatchException(primaryState.length, this.primaryState.length);
        }

        // set the data
        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32241);System.arraycopy(primaryState, 0, this.primaryState, 0, primaryState.length);

    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get primary part of the current state.
     * @return primary part of the current state
     */
    public double[] getPrimaryState() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32242);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32243);return primaryState.clone();
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get primary part of the current state derivative.
     * @return primary part of the current state derivative
     */
    public double[] getPrimaryStateDot() {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32244);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32245);return primaryStateDot.clone();
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Set secondary part of the current state.
     * @param index index of the part to set as returned by {@link
     * #addSecondaryEquations(SecondaryEquations)}
     * @param secondaryState secondary part of the current state
     * @throws DimensionMismatchException if the dimension of the partial state does not
     * match the selected equations set dimension
     */
    public void setSecondaryState(final int index, final double[] secondaryState)
        throws DimensionMismatchException {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32246);

        // get either the secondary state
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32247);double[] localArray = components.get(index).state;

        // safety checks
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32248);if ((((secondaryState.length != localArray.length)&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32249)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32250)==0&false))) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32251);throw new DimensionMismatchException(secondaryState.length, localArray.length);
        }

        // set the data
        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32252);System.arraycopy(secondaryState, 0, localArray, 0, secondaryState.length);

    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get secondary part of the current state.
     * @param index index of the part to set as returned by {@link
     * #addSecondaryEquations(SecondaryEquations)}
     * @return secondary part of the current state
     */
    public double[] getSecondaryState(final int index) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32253);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32254);return components.get(index).state.clone();
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get secondary part of the current state derivative.
     * @param index index of the part to set as returned by {@link
     * #addSecondaryEquations(SecondaryEquations)}
     * @return secondary part of the current state derivative
     */
    public double[] getSecondaryStateDot(final int index) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32255);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32256);return components.get(index).stateDot.clone();
    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Set the complete current state.
     * @param completeState complete current state to copy data from
     * @throws DimensionMismatchException if the dimension of the complete state does not
     * match the complete equations sets dimension
     */
    public void setCompleteState(final double[] completeState)
        throws DimensionMismatchException {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32257);

        // safety checks
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32258);if ((((completeState.length != getTotalDimension())&&(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32259)!=0|true))||(__CLR4_4_1ou3ou3lb90p9a4.R.iget(32260)==0&false))) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32261);throw new DimensionMismatchException(completeState.length, getTotalDimension());
        }

        // set the data
        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32262);primaryMapper.extractEquationData(completeState, primaryState);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32263);for (final SecondaryComponent component : components) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32264);component.mapper.extractEquationData(completeState, component.state);
        }

    }}finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Get the complete current state.
     * @return complete current state
     * @throws DimensionMismatchException if the dimension of the complete state does not
     * match the complete equations sets dimension
     */
    public double[] getCompleteState() throws DimensionMismatchException {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32265);

        // allocate complete array
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32266);double[] completeState = new double[getTotalDimension()];

        // set the data
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32267);primaryMapper.insertEquationData(primaryState, completeState);
        __CLR4_4_1ou3ou3lb90p9a4.R.inc(32268);for (final SecondaryComponent component : components) {{
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32269);component.mapper.insertEquationData(component.state, completeState);
        }

        }__CLR4_4_1ou3ou3lb90p9a4.R.inc(32270);return completeState;

    }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    /** Components of the compound stateful ODE. */
    private static class SecondaryComponent {

        /** Secondary differential equation. */
        private final SecondaryEquations equation;

        /** Mapper between local and complete arrays. */
        private final EquationsMapper mapper;

        /** State. */
        private final double[] state;

        /** State derivative. */
        private final double[] stateDot;

        /** Simple constructor.
         * @param equation secondary differential equation
         * @param firstIndex index to use for the first element in the complete arrays
         */
        public SecondaryComponent(final SecondaryEquations equation, final int firstIndex) {try{__CLR4_4_1ou3ou3lb90p9a4.R.inc(32271);
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32272);final int n   = equation.getDimension();
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32273);this.equation = equation;
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32274);mapper        = new EquationsMapper(firstIndex, n);
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32275);state         = new double[n];
            __CLR4_4_1ou3ou3lb90p9a4.R.inc(32276);stateDot      = new double[n];
        }finally{__CLR4_4_1ou3ou3lb90p9a4.R.flushNeeded();}}

    }

}
