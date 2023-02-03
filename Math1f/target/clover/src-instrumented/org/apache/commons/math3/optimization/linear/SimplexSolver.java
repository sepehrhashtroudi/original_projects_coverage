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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.Precision;


/**
 * Solves a linear problem using the Two-Phase Simplex Method.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class SimplexSolver extends AbstractLinearOptimizer {public static class __CLR4_4_1zk5zk5lb90pa6l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default amount of error to accept for algorithm convergence. */
    private static final double DEFAULT_EPSILON = 1.0e-6;

    /** Default amount of error to accept in floating point comparisons (as ulps). */
    private static final int DEFAULT_ULPS = 10;

    /** Amount of error to accept for algorithm convergence. */
    private final double epsilon;

    /** Amount of error to accept in floating point comparisons (as ulps). */
    private final int maxUlps;

    /**
     * Build a simplex solver with default settings.
     */
    public SimplexSolver() {
        this(DEFAULT_EPSILON, DEFAULT_ULPS);__CLR4_4_1zk5zk5lb90pa6l.R.inc(46086);try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46085);
    }finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /**
     * Build a simplex solver with a specified accepted amount of error
     * @param epsilon the amount of error to accept for algorithm convergence
     * @param maxUlps amount of error to accept in floating point comparisons
     */
    public SimplexSolver(final double epsilon, final int maxUlps) {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46087);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46088);this.epsilon = epsilon;
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46089);this.maxUlps = maxUlps;
    }finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /**
     * Returns the column with the most negative coefficient in the objective function row.
     * @param tableau simple tableau for the problem
     * @return column with the most negative coefficient
     */
    private Integer getPivotColumn(SimplexTableau tableau) {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46090);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46091);double minValue = 0;
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46092);Integer minPos = null;
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46093);for (int i = tableau.getNumObjectiveFunctions(); (((i < tableau.getWidth() - 1)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46094)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46095)==0&false)); i++) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46096);final double entry = tableau.getEntry(0, i);
            // check if the entry is strictly smaller than the current minimum
            // do not use a ulp/epsilon check
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46097);if ((((entry < minValue)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46098)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46099)==0&false))) {{
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46100);minValue = entry;
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46101);minPos = i;
            }
        }}
        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46102);return minPos;
    }finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /**
     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).
     * @param tableau simple tableau for the problem
     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}
     * @return row with the minimum ratio
     */
    private Integer getPivotRow(SimplexTableau tableau, final int col) {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46103);
        // create a list of all the rows that tie for the lowest score in the minimum ratio test
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46104);List<Integer> minRatioPositions = new ArrayList<Integer>();
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46105);double minRatio = Double.MAX_VALUE;
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46106);for (int i = tableau.getNumObjectiveFunctions(); (((i < tableau.getHeight())&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46107)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46108)==0&false)); i++) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46109);final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46110);final double entry = tableau.getEntry(i, col);

            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46111);if ((((Precision.compareTo(entry, 0d, maxUlps) > 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46112)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46113)==0&false))) {{
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46114);final double ratio = rhs / entry;
                // check if the entry is strictly equal to the current min ratio
                // do not use a ulp/epsilon check
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46115);final int cmp = Double.compare(ratio, minRatio);
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46116);if ((((cmp == 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46117)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46118)==0&false))) {{
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46119);minRatioPositions.add(i);
                } }else {__CLR4_4_1zk5zk5lb90pa6l.R.inc(46120);if ((((cmp < 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46121)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46122)==0&false))) {{
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46123);minRatio = ratio;
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46124);minRatioPositions = new ArrayList<Integer>();
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46125);minRatioPositions.add(i);
                }
            }}}
        }}

        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46126);if ((((minRatioPositions.size() == 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46127)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46128)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46129);return null;
        } }else {__CLR4_4_1zk5zk5lb90pa6l.R.inc(46130);if ((((minRatioPositions.size() > 1)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46131)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46132)==0&false))) {{
            // there's a degeneracy as indicated by a tie in the minimum ratio test

            // 1. check if there's an artificial variable that can be forced out of the basis
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46133);if ((((tableau.getNumArtificialVariables() > 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46134)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46135)==0&false))) {{
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46136);for (Integer row : minRatioPositions) {{
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46137);for (int i = 0; (((i < tableau.getNumArtificialVariables())&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46138)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46139)==0&false)); i++) {{
                        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46140);int column = i + tableau.getArtificialVariableOffset();
                        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46141);final double entry = tableau.getEntry(row, column);
                        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46142);if ((((Precision.equals(entry, 1d, maxUlps) && row.equals(tableau.getBasicRow(column)))&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46143)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46144)==0&false))) {{
                            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46145);return row;
                        }
                    }}
                }}
            }}

            // 2. apply Bland's rule to prevent cycling:
            //    take the row for which the corresponding basic variable has the smallest index
            //
            // see http://www.stanford.edu/class/msande310/blandrule.pdf
            // see http://en.wikipedia.org/wiki/Bland%27s_rule (not equivalent to the above paper)
            //
            // Additional heuristic: if we did not get a solution after half of maxIterations
            //                       revert to the simple case of just returning the top-most row
            // This heuristic is based on empirical data gathered while investigating MATH-828.
            }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46146);if ((((getIterations() < getMaxIterations() / 2)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46147)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46148)==0&false))) {{
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46149);Integer minRow = null;
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46150);int minIndex = tableau.getWidth();
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46151);final int varStart = tableau.getNumObjectiveFunctions();
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46152);final int varEnd = tableau.getWidth() - 1;
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46153);for (Integer row : minRatioPositions) {{
                    __CLR4_4_1zk5zk5lb90pa6l.R.inc(46154);for (int i = varStart; (((i < varEnd && !row.equals(minRow))&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46155)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46156)==0&false)); i++) {{
                        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46157);final Integer basicRow = tableau.getBasicRow(i);
                        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46158);if ((((basicRow != null && basicRow.equals(row) && i < minIndex)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46159)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46160)==0&false))) {{
                            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46161);minIndex = i;
                            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46162);minRow = row;
                        }
                    }}
                }}
                }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46163);return minRow;
            }
        }}
        }}__CLR4_4_1zk5zk5lb90pa6l.R.inc(46164);return minRatioPositions.get(0);
    }finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /**
     * Runs one iteration of the Simplex method on the given model.
     * @param tableau simple tableau for the problem
     * @throws MaxCountExceededException if the maximal iteration count has been exceeded
     * @throws UnboundedSolutionException if the model is found not to have a bounded solution
     */
    protected void doIteration(final SimplexTableau tableau)
        throws MaxCountExceededException, UnboundedSolutionException {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46165);

        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46166);incrementIterationsCounter();

        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46167);Integer pivotCol = getPivotColumn(tableau);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46168);Integer pivotRow = getPivotRow(tableau, pivotCol);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46169);if ((((pivotRow == null)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46170)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46171)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46172);throw new UnboundedSolutionException();
        }

        // set the pivot element to 1
        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46173);double pivotVal = tableau.getEntry(pivotRow, pivotCol);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46174);tableau.divideRow(pivotRow, pivotVal);

        // set the rest of the pivot column to 0
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46175);for (int i = 0; (((i < tableau.getHeight())&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46176)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46177)==0&false)); i++) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46178);if ((((i != pivotRow)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46179)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46180)==0&false))) {{
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46181);final double multiplier = tableau.getEntry(i, pivotCol);
                __CLR4_4_1zk5zk5lb90pa6l.R.inc(46182);tableau.subtractRow(i, pivotRow, multiplier);
            }
        }}
    }}finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /**
     * Solves Phase 1 of the Simplex method.
     * @param tableau simple tableau for the problem
     * @throws MaxCountExceededException if the maximal iteration count has been exceeded
     * @throws UnboundedSolutionException if the model is found not to have a bounded solution
     * @throws NoFeasibleSolutionException if there is no feasible solution
     */
    protected void solvePhase1(final SimplexTableau tableau)
        throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46183);

        // make sure we're in Phase 1
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46184);if ((((tableau.getNumArtificialVariables() == 0)&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46185)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46186)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46187);return;
        }

        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46188);while ((((!tableau.isOptimal())&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46189)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46190)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46191);doIteration(tableau);
        }

        // if W is not zero then we have no feasible solution
        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46192);if ((((!Precision.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0d, epsilon))&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46193)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46194)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46195);throw new NoFeasibleSolutionException();
        }
    }}finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public PointValuePair doOptimize()
        throws MaxCountExceededException, UnboundedSolutionException, NoFeasibleSolutionException {try{__CLR4_4_1zk5zk5lb90pa6l.R.inc(46196);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46197);final SimplexTableau tableau =
            new SimplexTableau(getFunction(),
                               getConstraints(),
                               getGoalType(),
                               restrictToNonNegative(),
                               epsilon,
                               maxUlps);

        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46198);solvePhase1(tableau);
        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46199);tableau.dropPhase1Objective();

        __CLR4_4_1zk5zk5lb90pa6l.R.inc(46200);while ((((!tableau.isOptimal())&&(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46201)!=0|true))||(__CLR4_4_1zk5zk5lb90pa6l.R.iget(46202)==0&false))) {{
            __CLR4_4_1zk5zk5lb90pa6l.R.inc(46203);doIteration(tableau);
        }
        }__CLR4_4_1zk5zk5lb90pa6l.R.inc(46204);return tableau.getSolution();
    }finally{__CLR4_4_1zk5zk5lb90pa6l.R.flushNeeded();}}

}
