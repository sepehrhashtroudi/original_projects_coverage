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

package org.apache.commons.math3.optimization.linear;

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
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
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
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
class SimplexTableau implements Serializable {public static class __CLR4_4_1znhznhlb90pa74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Column label for negative vars. */
    private static final String NEGATIVE_VAR_COLUMN_LABEL = "x-";

    /** Default amount of error to accept in floating point comparisons (as ulps). */
    private static final int DEFAULT_ULPS = 10;

    /** The cut-off threshold to zero-out entries. */
    private static final double CUTOFF_THRESHOLD = 1e-12;

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

    /**
     * Build a tableau for a linear problem.
     * @param f linear objective function
     * @param constraints linear constraints
     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}
     * @param restrictToNonNegative whether to restrict the variables to non-negative values
     * @param epsilon amount of error to accept when checking for optimality
     */
    SimplexTableau(final LinearObjectiveFunction f,
                   final Collection<LinearConstraint> constraints,
                   final GoalType goalType, final boolean restrictToNonNegative,
                   final double epsilon) {
        this(f, constraints, goalType, restrictToNonNegative, epsilon, DEFAULT_ULPS);__CLR4_4_1znhznhlb90pa74.R.inc(46206);try{__CLR4_4_1znhznhlb90pa74.R.inc(46205);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

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
                   final GoalType goalType, final boolean restrictToNonNegative,
                   final double epsilon,
                   final int maxUlps) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46207);
        __CLR4_4_1znhznhlb90pa74.R.inc(46208);this.f                      = f;
        __CLR4_4_1znhznhlb90pa74.R.inc(46209);this.constraints            = normalizeConstraints(constraints);
        __CLR4_4_1znhznhlb90pa74.R.inc(46210);this.restrictToNonNegative  = restrictToNonNegative;
        __CLR4_4_1znhznhlb90pa74.R.inc(46211);this.epsilon                = epsilon;
        __CLR4_4_1znhznhlb90pa74.R.inc(46212);this.maxUlps                = maxUlps;
        __CLR4_4_1znhznhlb90pa74.R.inc(46213);this.numDecisionVariables   = f.getCoefficients().getDimension() +
                                      ((((restrictToNonNegative )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46214)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46215)==0&false))? 0 : 1);
        __CLR4_4_1znhznhlb90pa74.R.inc(46216);this.numSlackVariables      = getConstraintTypeCounts(Relationship.LEQ) +
                                      getConstraintTypeCounts(Relationship.GEQ);
        __CLR4_4_1znhznhlb90pa74.R.inc(46217);this.numArtificialVariables = getConstraintTypeCounts(Relationship.EQ) +
                                      getConstraintTypeCounts(Relationship.GEQ);
        __CLR4_4_1znhznhlb90pa74.R.inc(46218);this.tableau = createTableau(goalType == GoalType.MAXIMIZE);
        __CLR4_4_1znhznhlb90pa74.R.inc(46219);initializeColumnLabels();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Initialize the labels for the columns.
     */
    protected void initializeColumnLabels() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46220);
      __CLR4_4_1znhznhlb90pa74.R.inc(46221);if ((((getNumObjectiveFunctions() == 2)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46222)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46223)==0&false))) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46224);columnLabels.add("W");
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46225);columnLabels.add("Z");
      __CLR4_4_1znhznhlb90pa74.R.inc(46226);for (int i = 0; (((i < getOriginalNumDecisionVariables())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46227)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46228)==0&false)); i++) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46229);columnLabels.add("x" + i);
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46230);if ((((!restrictToNonNegative)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46231)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46232)==0&false))) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46233);columnLabels.add(NEGATIVE_VAR_COLUMN_LABEL);
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46234);for (int i = 0; (((i < getNumSlackVariables())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46235)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46236)==0&false)); i++) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46237);columnLabels.add("s" + i);
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46238);for (int i = 0; (((i < getNumArtificialVariables())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46239)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46240)==0&false)); i++) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46241);columnLabels.add("a" + i);
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46242);columnLabels.add("RHS");
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Create the tableau by itself.
     * @param maximize if true, goal is to maximize the objective function
     * @return created tableau
     */
    protected RealMatrix createTableau(final boolean maximize) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46243);

        // create a matrix of the correct size
        __CLR4_4_1znhznhlb90pa74.R.inc(46244);int width = numDecisionVariables + numSlackVariables +
        numArtificialVariables + getNumObjectiveFunctions() + 1; // + 1 is for RHS
        __CLR4_4_1znhznhlb90pa74.R.inc(46245);int height = constraints.size() + getNumObjectiveFunctions();
        __CLR4_4_1znhznhlb90pa74.R.inc(46246);Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(height, width);

        // initialize the objective function rows
        __CLR4_4_1znhznhlb90pa74.R.inc(46247);if ((((getNumObjectiveFunctions() == 2)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46248)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46249)==0&false))) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46250);matrix.setEntry(0, 0, -1);
        }
        }__CLR4_4_1znhznhlb90pa74.R.inc(46251);int zIndex = ((((getNumObjectiveFunctions() == 1) )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46252)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46253)==0&false))? 0 : 1;
        __CLR4_4_1znhznhlb90pa74.R.inc(46254);matrix.setEntry(zIndex, zIndex, (((maximize )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46255)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46256)==0&false))? 1 : -1);
        __CLR4_4_1znhznhlb90pa74.R.inc(46257);RealVector objectiveCoefficients =
            (((maximize )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46258)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46259)==0&false))? f.getCoefficients().mapMultiply(-1) : f.getCoefficients();
        __CLR4_4_1znhznhlb90pa74.R.inc(46260);copyArray(objectiveCoefficients.toArray(), matrix.getDataRef()[zIndex]);
        __CLR4_4_1znhznhlb90pa74.R.inc(46261);matrix.setEntry(zIndex, width - 1,
            (((maximize )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46262)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46263)==0&false))? f.getConstantTerm() : -1 * f.getConstantTerm());

        __CLR4_4_1znhznhlb90pa74.R.inc(46264);if ((((!restrictToNonNegative)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46265)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46266)==0&false))) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46267);matrix.setEntry(zIndex, getSlackVariableOffset() - 1,
                getInvertedCoefficientSum(objectiveCoefficients));
        }

        // initialize the constraint rows
        }__CLR4_4_1znhznhlb90pa74.R.inc(46268);int slackVar = 0;
        __CLR4_4_1znhznhlb90pa74.R.inc(46269);int artificialVar = 0;
        __CLR4_4_1znhznhlb90pa74.R.inc(46270);for (int i = 0; (((i < constraints.size())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46271)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46272)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46273);LinearConstraint constraint = constraints.get(i);
            __CLR4_4_1znhznhlb90pa74.R.inc(46274);int row = getNumObjectiveFunctions() + i;

            // decision variable coefficients
            __CLR4_4_1znhznhlb90pa74.R.inc(46275);copyArray(constraint.getCoefficients().toArray(), matrix.getDataRef()[row]);

            // x-
            __CLR4_4_1znhznhlb90pa74.R.inc(46276);if ((((!restrictToNonNegative)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46277)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46278)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46279);matrix.setEntry(row, getSlackVariableOffset() - 1,
                    getInvertedCoefficientSum(constraint.getCoefficients()));
            }

            // RHS
            }__CLR4_4_1znhznhlb90pa74.R.inc(46280);matrix.setEntry(row, width - 1, constraint.getValue());

            // slack variables
            __CLR4_4_1znhznhlb90pa74.R.inc(46281);if ((((constraint.getRelationship() == Relationship.LEQ)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46282)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46283)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46284);matrix.setEntry(row, getSlackVariableOffset() + slackVar++, 1);  // slack
            } }else {__CLR4_4_1znhznhlb90pa74.R.inc(46285);if ((((constraint.getRelationship() == Relationship.GEQ)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46286)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46287)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46288);matrix.setEntry(row, getSlackVariableOffset() + slackVar++, -1); // excess
            }

            // artificial variables
            }}__CLR4_4_1znhznhlb90pa74.R.inc(46289);if (((((constraint.getRelationship() == Relationship.EQ) ||
                    (constraint.getRelationship() == Relationship.GEQ))&&(__CLR4_4_1znhznhlb90pa74.R.iget(46290)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46291)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46292);matrix.setEntry(0, getArtificialVariableOffset() + artificialVar, 1);
                __CLR4_4_1znhznhlb90pa74.R.inc(46293);matrix.setEntry(row, getArtificialVariableOffset() + artificialVar++, 1);
                __CLR4_4_1znhznhlb90pa74.R.inc(46294);matrix.setRowVector(0, matrix.getRowVector(0).subtract(matrix.getRowVector(row)));
            }
        }}

        }__CLR4_4_1znhznhlb90pa74.R.inc(46295);return matrix;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get new versions of the constraints which have positive right hand sides.
     * @param originalConstraints original (not normalized) constraints
     * @return new versions of the constraints
     */
    public List<LinearConstraint> normalizeConstraints(Collection<LinearConstraint> originalConstraints) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46296);
        __CLR4_4_1znhznhlb90pa74.R.inc(46297);List<LinearConstraint> normalized = new ArrayList<LinearConstraint>(originalConstraints.size());
        __CLR4_4_1znhznhlb90pa74.R.inc(46298);for (LinearConstraint constraint : originalConstraints) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46299);normalized.add(normalize(constraint));
        }
        }__CLR4_4_1znhznhlb90pa74.R.inc(46300);return normalized;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get a new equation equivalent to this one with a positive right hand side.
     * @param constraint reference constraint
     * @return new equation
     */
    private LinearConstraint normalize(final LinearConstraint constraint) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46301);
        __CLR4_4_1znhznhlb90pa74.R.inc(46302);if ((((constraint.getValue() < 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46303)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46304)==0&false))) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46305);return new LinearConstraint(constraint.getCoefficients().mapMultiply(-1),
                                        constraint.getRelationship().oppositeRelationship(),
                                        -1 * constraint.getValue());
        }
        }__CLR4_4_1znhznhlb90pa74.R.inc(46306);return new LinearConstraint(constraint.getCoefficients(),
                                    constraint.getRelationship(), constraint.getValue());
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the number of objective functions in this tableau.
     * @return 2 for Phase 1.  1 for Phase 2.
     */
    protected final int getNumObjectiveFunctions() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46307);
        __CLR4_4_1znhznhlb90pa74.R.inc(46308);return (((this.numArtificialVariables > 0 )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46309)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46310)==0&false))? 2 : 1;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get a count of constraints corresponding to a specified relationship.
     * @param relationship relationship to count
     * @return number of constraint with the specified relationship
     */
    private int getConstraintTypeCounts(final Relationship relationship) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46311);
        __CLR4_4_1znhznhlb90pa74.R.inc(46312);int count = 0;
        __CLR4_4_1znhznhlb90pa74.R.inc(46313);for (final LinearConstraint constraint : constraints) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46314);if ((((constraint.getRelationship() == relationship)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46315)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46316)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46317);++count;
            }
        }}
        }__CLR4_4_1znhznhlb90pa74.R.inc(46318);return count;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the -1 times the sum of all coefficients in the given array.
     * @param coefficients coefficients to sum
     * @return the -1 times the sum of all coefficients in the given array.
     */
    protected static double getInvertedCoefficientSum(final RealVector coefficients) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46319);
        __CLR4_4_1znhznhlb90pa74.R.inc(46320);double sum = 0;
        __CLR4_4_1znhznhlb90pa74.R.inc(46321);for (double coefficient : coefficients.toArray()) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46322);sum -= coefficient;
        }
        }__CLR4_4_1znhznhlb90pa74.R.inc(46323);return sum;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Checks whether the given column is basic.
     * @param col index of the column to check
     * @return the row that the variable is basic in.  null if the column is not basic
     */
    protected Integer getBasicRow(final int col) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46324);
        __CLR4_4_1znhznhlb90pa74.R.inc(46325);Integer row = null;
        __CLR4_4_1znhznhlb90pa74.R.inc(46326);for (int i = 0; (((i < getHeight())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46327)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46328)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46329);final double entry = getEntry(i, col);
            __CLR4_4_1znhznhlb90pa74.R.inc(46330);if ((((Precision.equals(entry, 1d, maxUlps) && (row == null))&&(__CLR4_4_1znhznhlb90pa74.R.iget(46331)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46332)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46333);row = i;
            } }else {__CLR4_4_1znhznhlb90pa74.R.inc(46334);if ((((!Precision.equals(entry, 0d, maxUlps))&&(__CLR4_4_1znhznhlb90pa74.R.iget(46335)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46336)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46337);return null;
            }
        }}}
        }__CLR4_4_1znhznhlb90pa74.R.inc(46338);return row;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Removes the phase 1 objective function, positive cost non-artificial variables,
     * and the non-basic artificial variables from this tableau.
     */
    protected void dropPhase1Objective() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46339);
        __CLR4_4_1znhznhlb90pa74.R.inc(46340);if ((((getNumObjectiveFunctions() == 1)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46341)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46342)==0&false))) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46343);return;
        }

        }__CLR4_4_1znhznhlb90pa74.R.inc(46344);Set<Integer> columnsToDrop = new TreeSet<Integer>();
        __CLR4_4_1znhznhlb90pa74.R.inc(46345);columnsToDrop.add(0);

        // positive cost non-artificial variables
        __CLR4_4_1znhznhlb90pa74.R.inc(46346);for (int i = getNumObjectiveFunctions(); (((i < getArtificialVariableOffset())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46347)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46348)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46349);final double entry = tableau.getEntry(0, i);
            __CLR4_4_1znhznhlb90pa74.R.inc(46350);if ((((Precision.compareTo(entry, 0d, epsilon) > 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46351)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46352)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46353);columnsToDrop.add(i);
            }
        }}

        // non-basic artificial variables
        }__CLR4_4_1znhznhlb90pa74.R.inc(46354);for (int i = 0; (((i < getNumArtificialVariables())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46355)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46356)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46357);int col = i + getArtificialVariableOffset();
            __CLR4_4_1znhznhlb90pa74.R.inc(46358);if ((((getBasicRow(col) == null)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46359)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46360)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46361);columnsToDrop.add(col);
            }
        }}

        }__CLR4_4_1znhznhlb90pa74.R.inc(46362);double[][] matrix = new double[getHeight() - 1][getWidth() - columnsToDrop.size()];
        __CLR4_4_1znhznhlb90pa74.R.inc(46363);for (int i = 1; (((i < getHeight())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46364)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46365)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46366);int col = 0;
            __CLR4_4_1znhznhlb90pa74.R.inc(46367);for (int j = 0; (((j < getWidth())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46368)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46369)==0&false)); j++) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46370);if ((((!columnsToDrop.contains(j))&&(__CLR4_4_1znhznhlb90pa74.R.iget(46371)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46372)==0&false))) {{
                    __CLR4_4_1znhznhlb90pa74.R.inc(46373);matrix[i - 1][col++] = tableau.getEntry(i, j);
                }
            }}
        }}

        // remove the columns in reverse order so the indices are correct
        }__CLR4_4_1znhznhlb90pa74.R.inc(46374);Integer[] drop = columnsToDrop.toArray(new Integer[columnsToDrop.size()]);
        __CLR4_4_1znhznhlb90pa74.R.inc(46375);for (int i = drop.length - 1; (((i >= 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46376)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46377)==0&false)); i--) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46378);columnLabels.remove((int) drop[i]);
        }

        }__CLR4_4_1znhznhlb90pa74.R.inc(46379);this.tableau = new Array2DRowRealMatrix(matrix);
        __CLR4_4_1znhznhlb90pa74.R.inc(46380);this.numArtificialVariables = 0;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * @param src the source array
     * @param dest the destination array
     */
    private void copyArray(final double[] src, final double[] dest) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46381);
        __CLR4_4_1znhznhlb90pa74.R.inc(46382);System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Returns whether the problem is at an optimal state.
     * @return whether the model has been solved
     */
    boolean isOptimal() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46383);
        __CLR4_4_1znhznhlb90pa74.R.inc(46384);for (int i = getNumObjectiveFunctions(); (((i < getWidth() - 1)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46385)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46386)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46387);final double entry = tableau.getEntry(0, i);
            __CLR4_4_1znhznhlb90pa74.R.inc(46388);if ((((Precision.compareTo(entry, 0d, epsilon) < 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46389)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46390)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46391);return false;
            }
        }}
        }__CLR4_4_1znhznhlb90pa74.R.inc(46392);return true;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the current solution.
     * @return current solution
     */
    protected PointValuePair getSolution() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46393);
      __CLR4_4_1znhznhlb90pa74.R.inc(46394);int negativeVarColumn = columnLabels.indexOf(NEGATIVE_VAR_COLUMN_LABEL);
      __CLR4_4_1znhznhlb90pa74.R.inc(46395);Integer negativeVarBasicRow = (((negativeVarColumn > 0 )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46396)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46397)==0&false))? getBasicRow(negativeVarColumn) : null;
      __CLR4_4_1znhznhlb90pa74.R.inc(46398);double mostNegative = (((negativeVarBasicRow == null )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46399)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46400)==0&false))? 0 : getEntry(negativeVarBasicRow, getRhsOffset());

      __CLR4_4_1znhznhlb90pa74.R.inc(46401);Set<Integer> basicRows = new HashSet<Integer>();
      __CLR4_4_1znhznhlb90pa74.R.inc(46402);double[] coefficients = new double[getOriginalNumDecisionVariables()];
      __CLR4_4_1znhznhlb90pa74.R.inc(46403);for (int i = 0; (((i < coefficients.length)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46404)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46405)==0&false)); i++) {{
          __CLR4_4_1znhznhlb90pa74.R.inc(46406);int colIndex = columnLabels.indexOf("x" + i);
          __CLR4_4_1znhznhlb90pa74.R.inc(46407);if ((((colIndex < 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46408)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46409)==0&false))) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46410);coefficients[i] = 0;
            __CLR4_4_1znhznhlb90pa74.R.inc(46411);continue;
          }
          }__CLR4_4_1znhznhlb90pa74.R.inc(46412);Integer basicRow = getBasicRow(colIndex);
          __CLR4_4_1znhznhlb90pa74.R.inc(46413);if ((((basicRow != null && basicRow == 0)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46414)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46415)==0&false))) {{
              // if the basic row is found to be the objective function row
              // set the coefficient to 0 -> this case handles unconstrained
              // variables that are still part of the objective function
              __CLR4_4_1znhznhlb90pa74.R.inc(46416);coefficients[i] = 0;
          } }else {__CLR4_4_1znhznhlb90pa74.R.inc(46417);if ((((basicRows.contains(basicRow))&&(__CLR4_4_1znhznhlb90pa74.R.iget(46418)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46419)==0&false))) {{
              // if multiple variables can take a given value
              // then we choose the first and set the rest equal to 0
              __CLR4_4_1znhznhlb90pa74.R.inc(46420);coefficients[i] = 0 - ((((restrictToNonNegative )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46421)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46422)==0&false))? 0 : mostNegative);
          } }else {{
              __CLR4_4_1znhznhlb90pa74.R.inc(46423);basicRows.add(basicRow);
              __CLR4_4_1znhznhlb90pa74.R.inc(46424);coefficients[i] =
                  ((((basicRow == null )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46425)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46426)==0&false))? 0 : getEntry(basicRow, getRhsOffset())) -
                  ((((restrictToNonNegative )&&(__CLR4_4_1znhznhlb90pa74.R.iget(46427)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46428)==0&false))? 0 : mostNegative);
          }
      }}}
      }__CLR4_4_1znhznhlb90pa74.R.inc(46429);return new PointValuePair(coefficients, f.getValue(coefficients));
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Subtracts a multiple of one row from another.
     * <p>
     * After application of this operation, the following will hold:
     * <pre>minuendRow = minuendRow - multiple * subtrahendRow</pre>
     *
     * @param dividendRow index of the row
     * @param divisor value of the divisor
     */
    protected void divideRow(final int dividendRow, final double divisor) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46430);
        __CLR4_4_1znhznhlb90pa74.R.inc(46431);for (int j = 0; (((j < getWidth())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46432)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46433)==0&false)); j++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46434);tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
        }
    }}finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

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
                               final double multiple) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46435);
        __CLR4_4_1znhznhlb90pa74.R.inc(46436);for (int i = 0; (((i < getWidth())&&(__CLR4_4_1znhznhlb90pa74.R.iget(46437)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46438)==0&false)); i++) {{
            __CLR4_4_1znhznhlb90pa74.R.inc(46439);double result = tableau.getEntry(minuendRow, i) - tableau.getEntry(subtrahendRow, i) * multiple;
            // cut-off values smaller than the CUTOFF_THRESHOLD, otherwise may lead to numerical instabilities
            __CLR4_4_1znhznhlb90pa74.R.inc(46440);if ((((FastMath.abs(result) < CUTOFF_THRESHOLD)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46441)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46442)==0&false))) {{
                __CLR4_4_1znhznhlb90pa74.R.inc(46443);result = 0.0;
            }
            }__CLR4_4_1znhznhlb90pa74.R.inc(46444);tableau.setEntry(minuendRow, i, result);
        }
    }}finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the width of the tableau.
     * @return width of the tableau
     */
    protected final int getWidth() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46445);
        __CLR4_4_1znhznhlb90pa74.R.inc(46446);return tableau.getColumnDimension();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the height of the tableau.
     * @return height of the tableau
     */
    protected final int getHeight() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46447);
        __CLR4_4_1znhznhlb90pa74.R.inc(46448);return tableau.getRowDimension();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get an entry of the tableau.
     * @param row row index
     * @param column column index
     * @return entry at (row, column)
     */
    protected final double getEntry(final int row, final int column) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46449);
        __CLR4_4_1znhznhlb90pa74.R.inc(46450);return tableau.getEntry(row, column);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Set an entry of the tableau.
     * @param row row index
     * @param column column index
     * @param value for the entry
     */
    protected final void setEntry(final int row, final int column,
                                  final double value) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46451);
        __CLR4_4_1znhznhlb90pa74.R.inc(46452);tableau.setEntry(row, column, value);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the offset of the first slack variable.
     * @return offset of the first slack variable
     */
    protected final int getSlackVariableOffset() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46453);
        __CLR4_4_1znhznhlb90pa74.R.inc(46454);return getNumObjectiveFunctions() + numDecisionVariables;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the offset of the first artificial variable.
     * @return offset of the first artificial variable
     */
    protected final int getArtificialVariableOffset() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46455);
        __CLR4_4_1znhznhlb90pa74.R.inc(46456);return getNumObjectiveFunctions() + numDecisionVariables + numSlackVariables;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the offset of the right hand side.
     * @return offset of the right hand side
     */
    protected final int getRhsOffset() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46457);
        __CLR4_4_1znhznhlb90pa74.R.inc(46458);return getWidth() - 1;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the number of decision variables.
     * <p>
     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent
     * the absolute value of the most negative variable.
     *
     * @return number of decision variables
     * @see #getOriginalNumDecisionVariables()
     */
    protected final int getNumDecisionVariables() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46459);
        __CLR4_4_1znhznhlb90pa74.R.inc(46460);return numDecisionVariables;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the original number of decision variables.
     * @return original number of decision variables
     * @see #getNumDecisionVariables()
     */
    protected final int getOriginalNumDecisionVariables() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46461);
        __CLR4_4_1znhznhlb90pa74.R.inc(46462);return f.getCoefficients().getDimension();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the number of slack variables.
     * @return number of slack variables
     */
    protected final int getNumSlackVariables() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46463);
        __CLR4_4_1znhznhlb90pa74.R.inc(46464);return numSlackVariables;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the number of artificial variables.
     * @return number of artificial variables
     */
    protected final int getNumArtificialVariables() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46465);
        __CLR4_4_1znhznhlb90pa74.R.inc(46466);return numArtificialVariables;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Get the tableau data.
     * @return tableau data
     */
    protected final double[][] getData() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46467);
        __CLR4_4_1znhznhlb90pa74.R.inc(46468);return tableau.getData();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_4_1znhznhlb90pa74.R.inc(46469);

      __CLR4_4_1znhznhlb90pa74.R.inc(46470);if ((((this == other)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46471)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46472)==0&false))) {{
        __CLR4_4_1znhznhlb90pa74.R.inc(46473);return true;
      }

      }__CLR4_4_1znhznhlb90pa74.R.inc(46474);if ((((other instanceof SimplexTableau)&&(__CLR4_4_1znhznhlb90pa74.R.iget(46475)!=0|true))||(__CLR4_4_1znhznhlb90pa74.R.iget(46476)==0&false))) {{
          __CLR4_4_1znhznhlb90pa74.R.inc(46477);SimplexTableau rhs = (SimplexTableau) other;
          __CLR4_4_1znhznhlb90pa74.R.inc(46478);return (restrictToNonNegative  == rhs.restrictToNonNegative) &&
                 (numDecisionVariables   == rhs.numDecisionVariables) &&
                 (numSlackVariables      == rhs.numSlackVariables) &&
                 (numArtificialVariables == rhs.numArtificialVariables) &&
                 (epsilon                == rhs.epsilon) &&
                 (maxUlps                == rhs.maxUlps) &&
                 f.equals(rhs.f) &&
                 constraints.equals(rhs.constraints) &&
                 tableau.equals(rhs.tableau);
      }
      }__CLR4_4_1znhznhlb90pa74.R.inc(46479);return false;
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1znhznhlb90pa74.R.inc(46480);
        __CLR4_4_1znhznhlb90pa74.R.inc(46481);return Boolean.valueOf(restrictToNonNegative).hashCode() ^
               numDecisionVariables ^
               numSlackVariables ^
               numArtificialVariables ^
               Double.valueOf(epsilon).hashCode() ^
               maxUlps ^
               f.hashCode() ^
               constraints.hashCode() ^
               tableau.hashCode();
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Serialize the instance.
     * @param oos stream where object should be written
     * @throws IOException if object cannot be written to stream
     */
    private void writeObject(ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1znhznhlb90pa74.R.inc(46482);
        __CLR4_4_1znhznhlb90pa74.R.inc(46483);oos.defaultWriteObject();
        __CLR4_4_1znhznhlb90pa74.R.inc(46484);MatrixUtils.serializeRealMatrix(tableau, oos);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}

    /**
     * Deserialize the instance.
     * @param ois stream from which the object should be read
     * @throws ClassNotFoundException if a class in the stream cannot be found
     * @throws IOException if object cannot be read from the stream
     */
    private void readObject(ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1znhznhlb90pa74.R.inc(46485);
        __CLR4_4_1znhznhlb90pa74.R.inc(46486);ois.defaultReadObject();
        __CLR4_4_1znhznhlb90pa74.R.inc(46487);MatrixUtils.deserializeRealMatrix(this, "tableau", ois);
    }finally{__CLR4_4_1znhznhlb90pa74.R.flushNeeded();}}
}
