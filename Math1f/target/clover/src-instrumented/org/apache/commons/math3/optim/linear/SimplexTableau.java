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
package org.apache.commons.math3.optim.linear;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * A tableau for use in the Simplex method.
 *
 * <p>
 * Example:
 * <pre>
 *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS
 * ---------------------------------------------------
 *  -1    0    0     0     0     0     0     1     0   &lt;= phase 1 objective
 *   0    1   -15   -10    0     0     0     0     0   &lt;= phase 2 objective
 *   0    0    1     0     0     1     0     0     2   &lt;= constraint 1
 *   0    0    0     1     0     0     1     0     3   &lt;= constraint 2
 *   0    0    1     1     0     0     0     1     4   &lt;= constraint 3
 * </pre>
 * W: Phase 1 objective function</br>
 * Z: Phase 2 objective function</br>
 * x1 &amp; x2: Decision variables</br>
 * x-: Extra decision variable to allow for negative values</br>
 * s1 &amp; s2: Slack/Surplus variables</br>
 * a1: Artificial variable</br>
 * RHS: Right hand side</br>
 * </p>
 * @version $Id$
 * @since 2.0
 */
class SimplexTableau implements Serializable {public static class __CLR4_4_1rvfrvflb90p9n1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Column label for negative vars. */
    private static final String NEGATIVE_VAR_COLUMN_LABEL = "x-";

    /** Serializable version identifier. */
    private static final long serialVersionUID = -1369660067587938365L;

    /** Linear objective function. */
    private final LinearObjectiveFunction f;

    /** Linear constraints. */
    private final List<LinearConstraint> constraints;

    /** Whether to restrict the variables to non-negative values. */
    private final boolean restrictToNonNegative;

    /** The variables each column represents */
    private final List<String> columnLabels = new ArrayList<String>();

    /** Simple tableau. */
    private transient RealMatrix tableau;

    /** Number of decision variables. */
    private final int numDecisionVariables;

    /** Number of slack variables. */
    private final int numSlackVariables;

    /** Number of artificial variables. */
    private int numArtificialVariables;

    /** Amount of error to accept when checking for optimality. */
    private final double epsilon;

    /** Amount of error to accept in floating point comparisons. */
    private final int maxUlps;

    /** Cut-off value for entries in the tableau. */
    private final double cutOff;

    /**
     * Builds a tableau for a linear problem.
     *
     * @param f Linear objective function.
     * @param constraints Linear constraints.
     * @param goalType Optimization goal: either {@link GoalType#MAXIMIZE}
     * or {@link GoalType#MINIMIZE}.
     * @param restrictToNonNegative Whether to restrict the variables to non-negative values.
     * @param epsilon Amount of error to accept when checking for optimality.
     */
    SimplexTableau(final LinearObjectiveFunction f,
                   final Collection<LinearConstraint> constraints,
                   final GoalType goalType,
                   final boolean restrictToNonNegative,
                   final double epsilon) {
        this(f, constraints, goalType, restrictToNonNegative, epsilon,
                SimplexSolver.DEFAULT_ULPS, SimplexSolver.DEFAULT_CUT_OFF);__CLR4_4_1rvfrvflb90p9n1.R.inc(36124);try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36123);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Build a tableau for a linear problem.
     * @param f linear objective function
     * @param constraints linear constraints
     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}
     * @param restrictToNonNegative whether to restrict the variables to non-negative values
     * @param epsilon amount of error to accept when checking for optimality
     * @param maxUlps amount of error to accept in floating point comparisons
     */
    SimplexTableau(final LinearObjectiveFunction f,
                   final Collection<LinearConstraint> constraints,
                   final GoalType goalType,
                   final boolean restrictToNonNegative,
                   final double epsilon,
                   final int maxUlps) {
        this(f, constraints, goalType, restrictToNonNegative, epsilon, maxUlps, SimplexSolver.DEFAULT_CUT_OFF);__CLR4_4_1rvfrvflb90p9n1.R.inc(36126);try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36125);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Build a tableau for a linear problem.
     * @param f linear objective function
     * @param constraints linear constraints
     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}
     * @param restrictToNonNegative whether to restrict the variables to non-negative values
     * @param epsilon amount of error to accept when checking for optimality
     * @param maxUlps amount of error to accept in floating point comparisons
     * @param cutOff the cut-off value for tableau entries
     */
    SimplexTableau(final LinearObjectiveFunction f,
                   final Collection<LinearConstraint> constraints,
                   final GoalType goalType,
                   final boolean restrictToNonNegative,
                   final double epsilon,
                   final int maxUlps,
                   final double cutOff) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36127);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36128);this.f                      = f;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36129);this.constraints            = normalizeConstraints(constraints);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36130);this.restrictToNonNegative  = restrictToNonNegative;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36131);this.epsilon                = epsilon;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36132);this.maxUlps                = maxUlps;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36133);this.cutOff                 = cutOff;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36134);this.numDecisionVariables   = f.getCoefficients().getDimension() +
                                      ((((restrictToNonNegative )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36135)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36136)==0&false))? 0 : 1);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36137);this.numSlackVariables      = getConstraintTypeCounts(Relationship.LEQ) +
                                      getConstraintTypeCounts(Relationship.GEQ);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36138);this.numArtificialVariables = getConstraintTypeCounts(Relationship.EQ) +
                                      getConstraintTypeCounts(Relationship.GEQ);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36139);this.tableau = createTableau(goalType == GoalType.MAXIMIZE);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36140);initializeColumnLabels();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Initialize the labels for the columns.
     */
    protected void initializeColumnLabels() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36141);
      __CLR4_4_1rvfrvflb90p9n1.R.inc(36142);if ((((getNumObjectiveFunctions() == 2)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36143)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36144)==0&false))) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36145);columnLabels.add("W");
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36146);columnLabels.add("Z");
      __CLR4_4_1rvfrvflb90p9n1.R.inc(36147);for (int i = 0; (((i < getOriginalNumDecisionVariables())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36148)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36149)==0&false)); i++) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36150);columnLabels.add("x" + i);
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36151);if ((((!restrictToNonNegative)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36152)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36153)==0&false))) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36154);columnLabels.add(NEGATIVE_VAR_COLUMN_LABEL);
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36155);for (int i = 0; (((i < getNumSlackVariables())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36156)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36157)==0&false)); i++) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36158);columnLabels.add("s" + i);
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36159);for (int i = 0; (((i < getNumArtificialVariables())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36160)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36161)==0&false)); i++) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36162);columnLabels.add("a" + i);
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36163);columnLabels.add("RHS");
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Create the tableau by itself.
     * @param maximize if true, goal is to maximize the objective function
     * @return created tableau
     */
    protected RealMatrix createTableau(final boolean maximize) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36164);

        // create a matrix of the correct size
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36165);int width = numDecisionVariables + numSlackVariables +
        numArtificialVariables + getNumObjectiveFunctions() + 1; // + 1 is for RHS
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36166);int height = constraints.size() + getNumObjectiveFunctions();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36167);Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(height, width);

        // initialize the objective function rows
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36168);if ((((getNumObjectiveFunctions() == 2)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36169)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36170)==0&false))) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36171);matrix.setEntry(0, 0, -1);
        }
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36172);int zIndex = ((((getNumObjectiveFunctions() == 1) )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36173)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36174)==0&false))? 0 : 1;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36175);matrix.setEntry(zIndex, zIndex, (((maximize )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36176)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36177)==0&false))? 1 : -1);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36178);RealVector objectiveCoefficients =
            (((maximize )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36179)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36180)==0&false))? f.getCoefficients().mapMultiply(-1) : f.getCoefficients();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36181);copyArray(objectiveCoefficients.toArray(), matrix.getDataRef()[zIndex]);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36182);matrix.setEntry(zIndex, width - 1,
            (((maximize )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36183)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36184)==0&false))? f.getConstantTerm() : -1 * f.getConstantTerm());

        __CLR4_4_1rvfrvflb90p9n1.R.inc(36185);if ((((!restrictToNonNegative)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36186)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36187)==0&false))) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36188);matrix.setEntry(zIndex, getSlackVariableOffset() - 1,
                getInvertedCoefficientSum(objectiveCoefficients));
        }

        // initialize the constraint rows
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36189);int slackVar = 0;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36190);int artificialVar = 0;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36191);for (int i = 0; (((i < constraints.size())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36192)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36193)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36194);LinearConstraint constraint = constraints.get(i);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36195);int row = getNumObjectiveFunctions() + i;

            // decision variable coefficients
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36196);copyArray(constraint.getCoefficients().toArray(), matrix.getDataRef()[row]);

            // x-
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36197);if ((((!restrictToNonNegative)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36198)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36199)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36200);matrix.setEntry(row, getSlackVariableOffset() - 1,
                    getInvertedCoefficientSum(constraint.getCoefficients()));
            }

            // RHS
            }__CLR4_4_1rvfrvflb90p9n1.R.inc(36201);matrix.setEntry(row, width - 1, constraint.getValue());

            // slack variables
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36202);if ((((constraint.getRelationship() == Relationship.LEQ)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36203)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36204)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36205);matrix.setEntry(row, getSlackVariableOffset() + slackVar++, 1);  // slack
            } }else {__CLR4_4_1rvfrvflb90p9n1.R.inc(36206);if ((((constraint.getRelationship() == Relationship.GEQ)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36207)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36208)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36209);matrix.setEntry(row, getSlackVariableOffset() + slackVar++, -1); // excess
            }

            // artificial variables
            }}__CLR4_4_1rvfrvflb90p9n1.R.inc(36210);if (((((constraint.getRelationship() == Relationship.EQ) ||
                    (constraint.getRelationship() == Relationship.GEQ))&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36211)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36212)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36213);matrix.setEntry(0, getArtificialVariableOffset() + artificialVar, 1);
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36214);matrix.setEntry(row, getArtificialVariableOffset() + artificialVar++, 1);
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36215);matrix.setRowVector(0, matrix.getRowVector(0).subtract(matrix.getRowVector(row)));
            }
        }}

        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36216);return matrix;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get new versions of the constraints which have positive right hand sides.
     * @param originalConstraints original (not normalized) constraints
     * @return new versions of the constraints
     */
    public List<LinearConstraint> normalizeConstraints(Collection<LinearConstraint> originalConstraints) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36217);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36218);List<LinearConstraint> normalized = new ArrayList<LinearConstraint>(originalConstraints.size());
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36219);for (LinearConstraint constraint : originalConstraints) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36220);normalized.add(normalize(constraint));
        }
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36221);return normalized;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get a new equation equivalent to this one with a positive right hand side.
     * @param constraint reference constraint
     * @return new equation
     */
    private LinearConstraint normalize(final LinearConstraint constraint) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36222);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36223);if ((((constraint.getValue() < 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36224)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36225)==0&false))) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36226);return new LinearConstraint(constraint.getCoefficients().mapMultiply(-1),
                                        constraint.getRelationship().oppositeRelationship(),
                                        -1 * constraint.getValue());
        }
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36227);return new LinearConstraint(constraint.getCoefficients(),
                                    constraint.getRelationship(), constraint.getValue());
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the number of objective functions in this tableau.
     * @return 2 for Phase 1.  1 for Phase 2.
     */
    protected final int getNumObjectiveFunctions() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36228);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36229);return (((this.numArtificialVariables > 0 )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36230)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36231)==0&false))? 2 : 1;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get a count of constraints corresponding to a specified relationship.
     * @param relationship relationship to count
     * @return number of constraint with the specified relationship
     */
    private int getConstraintTypeCounts(final Relationship relationship) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36232);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36233);int count = 0;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36234);for (final LinearConstraint constraint : constraints) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36235);if ((((constraint.getRelationship() == relationship)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36236)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36237)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36238);++count;
            }
        }}
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36239);return count;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the -1 times the sum of all coefficients in the given array.
     * @param coefficients coefficients to sum
     * @return the -1 times the sum of all coefficients in the given array.
     */
    protected static double getInvertedCoefficientSum(final RealVector coefficients) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36240);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36241);double sum = 0;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36242);for (double coefficient : coefficients.toArray()) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36243);sum -= coefficient;
        }
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36244);return sum;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Checks whether the given column is basic.
     * @param col index of the column to check
     * @return the row that the variable is basic in.  null if the column is not basic
     */
    protected Integer getBasicRow(final int col) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36245);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36246);Integer row = null;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36247);for (int i = 0; (((i < getHeight())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36248)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36249)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36250);final double entry = getEntry(i, col);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36251);if ((((Precision.equals(entry, 1d, maxUlps) && (row == null))&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36252)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36253)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36254);row = i;
            } }else {__CLR4_4_1rvfrvflb90p9n1.R.inc(36255);if ((((!Precision.equals(entry, 0d, maxUlps))&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36256)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36257)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36258);return null;
            }
        }}}
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36259);return row;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Removes the phase 1 objective function, positive cost non-artificial variables,
     * and the non-basic artificial variables from this tableau.
     */
    protected void dropPhase1Objective() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36260);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36261);if ((((getNumObjectiveFunctions() == 1)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36262)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36263)==0&false))) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36264);return;
        }

        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36265);Set<Integer> columnsToDrop = new TreeSet<Integer>();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36266);columnsToDrop.add(0);

        // positive cost non-artificial variables
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36267);for (int i = getNumObjectiveFunctions(); (((i < getArtificialVariableOffset())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36268)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36269)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36270);final double entry = tableau.getEntry(0, i);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36271);if ((((Precision.compareTo(entry, 0d, epsilon) > 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36272)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36273)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36274);columnsToDrop.add(i);
            }
        }}

        // non-basic artificial variables
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36275);for (int i = 0; (((i < getNumArtificialVariables())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36276)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36277)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36278);int col = i + getArtificialVariableOffset();
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36279);if ((((getBasicRow(col) == null)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36280)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36281)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36282);columnsToDrop.add(col);
            }
        }}

        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36283);double[][] matrix = new double[getHeight() - 1][getWidth() - columnsToDrop.size()];
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36284);for (int i = 1; (((i < getHeight())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36285)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36286)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36287);int col = 0;
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36288);for (int j = 0; (((j < getWidth())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36289)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36290)==0&false)); j++) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36291);if ((((!columnsToDrop.contains(j))&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36292)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36293)==0&false))) {{
                    __CLR4_4_1rvfrvflb90p9n1.R.inc(36294);matrix[i - 1][col++] = tableau.getEntry(i, j);
                }
            }}
        }}

        // remove the columns in reverse order so the indices are correct
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36295);Integer[] drop = columnsToDrop.toArray(new Integer[columnsToDrop.size()]);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36296);for (int i = drop.length - 1; (((i >= 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36297)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36298)==0&false)); i--) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36299);columnLabels.remove((int) drop[i]);
        }

        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36300);this.tableau = new Array2DRowRealMatrix(matrix);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36301);this.numArtificialVariables = 0;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * @param src the source array
     * @param dest the destination array
     */
    private void copyArray(final double[] src, final double[] dest) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36302);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36303);System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Returns whether the problem is at an optimal state.
     * @return whether the model has been solved
     */
    boolean isOptimal() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36304);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36305);for (int i = getNumObjectiveFunctions(); (((i < getWidth() - 1)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36306)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36307)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36308);final double entry = tableau.getEntry(0, i);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36309);if ((((Precision.compareTo(entry, 0d, epsilon) < 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36310)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36311)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36312);return false;
            }
        }}
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36313);return true;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the current solution.
     * @return current solution
     */
    protected PointValuePair getSolution() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36314);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36315);int negativeVarColumn = columnLabels.indexOf(NEGATIVE_VAR_COLUMN_LABEL);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36316);Integer negativeVarBasicRow = (((negativeVarColumn > 0 )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36317)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36318)==0&false))? getBasicRow(negativeVarColumn) : null;
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36319);double mostNegative = (((negativeVarBasicRow == null )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36320)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36321)==0&false))? 0 : getEntry(negativeVarBasicRow, getRhsOffset());

        __CLR4_4_1rvfrvflb90p9n1.R.inc(36322);Set<Integer> basicRows = new HashSet<Integer>();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36323);double[] coefficients = new double[getOriginalNumDecisionVariables()];
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36324);for (int i = 0; (((i < coefficients.length)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36325)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36326)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36327);int colIndex = columnLabels.indexOf("x" + i);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36328);if ((((colIndex < 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36329)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36330)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36331);coefficients[i] = 0;
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36332);continue;
            }
            }__CLR4_4_1rvfrvflb90p9n1.R.inc(36333);Integer basicRow = getBasicRow(colIndex);
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36334);if ((((basicRow != null && basicRow == 0)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36335)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36336)==0&false))) {{
                // if the basic row is found to be the objective function row
                // set the coefficient to 0 -> this case handles unconstrained
                // variables that are still part of the objective function
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36337);coefficients[i] = 0;
            } }else {__CLR4_4_1rvfrvflb90p9n1.R.inc(36338);if ((((basicRows.contains(basicRow))&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36339)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36340)==0&false))) {{
                // if multiple variables can take a given value
                // then we choose the first and set the rest equal to 0
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36341);coefficients[i] = 0 - ((((restrictToNonNegative )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36342)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36343)==0&false))? 0 : mostNegative);
            } }else {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36344);basicRows.add(basicRow);
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36345);coefficients[i] =
                    ((((basicRow == null )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36346)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36347)==0&false))? 0 : getEntry(basicRow, getRhsOffset())) -
                    ((((restrictToNonNegative )&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36348)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36349)==0&false))? 0 : mostNegative);
            }
        }}}
        }__CLR4_4_1rvfrvflb90p9n1.R.inc(36350);return new PointValuePair(coefficients, f.value(coefficients));
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Subtracts a multiple of one row from another.
     * <p>
     * After application of this operation, the following will hold:
     * <pre>minuendRow = minuendRow - multiple * subtrahendRow</pre>
     *
     * @param dividendRow index of the row
     * @param divisor value of the divisor
     */
    protected void divideRow(final int dividendRow, final double divisor) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36351);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36352);for (int j = 0; (((j < getWidth())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36353)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36354)==0&false)); j++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36355);tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
        }
    }}finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Subtracts a multiple of one row from another.
     * <p>
     * After application of this operation, the following will hold:
     * <pre>minuendRow = minuendRow - multiple * subtrahendRow</pre>
     *
     * @param minuendRow row index
     * @param subtrahendRow row index
     * @param multiple multiplication factor
     */
    protected void subtractRow(final int minuendRow, final int subtrahendRow,
                               final double multiple) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36356);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36357);for (int i = 0; (((i < getWidth())&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36358)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36359)==0&false)); i++) {{
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36360);double result = tableau.getEntry(minuendRow, i) - tableau.getEntry(subtrahendRow, i) * multiple;
            // cut-off values smaller than the cut-off threshold, otherwise may lead to numerical instabilities
            __CLR4_4_1rvfrvflb90p9n1.R.inc(36361);if ((((FastMath.abs(result) < cutOff)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36362)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36363)==0&false))) {{
                __CLR4_4_1rvfrvflb90p9n1.R.inc(36364);result = 0.0;
            }
            }__CLR4_4_1rvfrvflb90p9n1.R.inc(36365);tableau.setEntry(minuendRow, i, result);
        }
    }}finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the width of the tableau.
     * @return width of the tableau
     */
    protected final int getWidth() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36366);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36367);return tableau.getColumnDimension();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the height of the tableau.
     * @return height of the tableau
     */
    protected final int getHeight() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36368);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36369);return tableau.getRowDimension();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get an entry of the tableau.
     * @param row row index
     * @param column column index
     * @return entry at (row, column)
     */
    protected final double getEntry(final int row, final int column) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36370);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36371);return tableau.getEntry(row, column);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Set an entry of the tableau.
     * @param row row index
     * @param column column index
     * @param value for the entry
     */
    protected final void setEntry(final int row, final int column,
                                  final double value) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36372);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36373);tableau.setEntry(row, column, value);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the offset of the first slack variable.
     * @return offset of the first slack variable
     */
    protected final int getSlackVariableOffset() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36374);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36375);return getNumObjectiveFunctions() + numDecisionVariables;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the offset of the first artificial variable.
     * @return offset of the first artificial variable
     */
    protected final int getArtificialVariableOffset() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36376);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36377);return getNumObjectiveFunctions() + numDecisionVariables + numSlackVariables;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the offset of the right hand side.
     * @return offset of the right hand side
     */
    protected final int getRhsOffset() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36378);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36379);return getWidth() - 1;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the number of decision variables.
     * <p>
     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent
     * the absolute value of the most negative variable.
     *
     * @return number of decision variables
     * @see #getOriginalNumDecisionVariables()
     */
    protected final int getNumDecisionVariables() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36380);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36381);return numDecisionVariables;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the original number of decision variables.
     * @return original number of decision variables
     * @see #getNumDecisionVariables()
     */
    protected final int getOriginalNumDecisionVariables() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36382);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36383);return f.getCoefficients().getDimension();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the number of slack variables.
     * @return number of slack variables
     */
    protected final int getNumSlackVariables() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36384);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36385);return numSlackVariables;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the number of artificial variables.
     * @return number of artificial variables
     */
    protected final int getNumArtificialVariables() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36386);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36387);return numArtificialVariables;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Get the tableau data.
     * @return tableau data
     */
    protected final double[][] getData() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36388);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36389);return tableau.getData();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36390);

      __CLR4_4_1rvfrvflb90p9n1.R.inc(36391);if ((((this == other)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36392)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36393)==0&false))) {{
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36394);return true;
      }

      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36395);if ((((other instanceof SimplexTableau)&&(__CLR4_4_1rvfrvflb90p9n1.R.iget(36396)!=0|true))||(__CLR4_4_1rvfrvflb90p9n1.R.iget(36397)==0&false))) {{
          __CLR4_4_1rvfrvflb90p9n1.R.inc(36398);SimplexTableau rhs = (SimplexTableau) other;
          __CLR4_4_1rvfrvflb90p9n1.R.inc(36399);return (restrictToNonNegative  == rhs.restrictToNonNegative) &&
                 (numDecisionVariables   == rhs.numDecisionVariables) &&
                 (numSlackVariables      == rhs.numSlackVariables) &&
                 (numArtificialVariables == rhs.numArtificialVariables) &&
                 (epsilon                == rhs.epsilon) &&
                 (maxUlps                == rhs.maxUlps) &&
                 f.equals(rhs.f) &&
                 constraints.equals(rhs.constraints) &&
                 tableau.equals(rhs.tableau);
      }
      }__CLR4_4_1rvfrvflb90p9n1.R.inc(36400);return false;
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36401);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36402);return Boolean.valueOf(restrictToNonNegative).hashCode() ^
               numDecisionVariables ^
               numSlackVariables ^
               numArtificialVariables ^
               Double.valueOf(epsilon).hashCode() ^
               maxUlps ^
               f.hashCode() ^
               constraints.hashCode() ^
               tableau.hashCode();
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Serialize the instance.
     * @param oos stream where object should be written
     * @throws IOException if object cannot be written to stream
     */
    private void writeObject(ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36403);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36404);oos.defaultWriteObject();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36405);MatrixUtils.serializeRealMatrix(tableau, oos);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}

    /**
     * Deserialize the instance.
     * @param ois stream from which the object should be read
     * @throws ClassNotFoundException if a class in the stream cannot be found
     * @throws IOException if object cannot be read from the stream
     */
    private void readObject(ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1rvfrvflb90p9n1.R.inc(36406);
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36407);ois.defaultReadObject();
        __CLR4_4_1rvfrvflb90p9n1.R.inc(36408);MatrixUtils.deserializeRealMatrix(this, "tableau", ois);
    }finally{__CLR4_4_1rvfrvflb90p9n1.R.flushNeeded();}}
}
