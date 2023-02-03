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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.util.Precision;

/**
 * Solves a linear problem using the "Two-Phase Simplex" method.
 * <p>
 * <b>Note:</b> Depending on the problem definition, the default convergence criteria
 * may be too strict, resulting in {@link NoFeasibleSolutionException} or
 * {@link TooManyIterationsException}. In such a case it is advised to adjust these
 * criteria with more appropriate values, e.g. relaxing the epsilon value.
 * <p>
 * Default convergence criteria:
 * <ul>
 *   <li>Algorithm convergence: 1e-6</li>
 *   <li>Floating-point comparisons: 10 ulp</li>
 *   <li>Cut-Off value: 1e-12</li>
 * </ul>
 * <p>
 * The cut-off value has been introduced to zero out very small numbers in the Simplex tableau,
 * as these may lead to numerical instabilities due to the nature of the Simplex algorithm
 * (the pivot element is used as a denominator). If the problem definition is very tight, the
 * default cut-off value may be too small, thus it is advised to increase it to a larger value,
 * in accordance with the chosen epsilon.
 * <p>
 * It may also be counter-productive to provide a too large value for {@link
 * org.apache.commons.math3.optim.MaxIter MaxIter} as parameter in the call of {@link
 * #optimize(org.apache.commons.math3.optim.OptimizationData...) optimize(OptimizationData...)},
 * as the {@link SimplexSolver} will use different strategies depending on the current iteration
 * count. After half of the allowed max iterations has already been reached, the strategy to select
 * pivot rows will change in order to break possible cycles due to degenerate problems.
 *
 * @version $Id$
 * @since 2.0
 */
public class SimplexSolver extends LinearOptimizer {public static class __CLR4_4_1rryrrylb90p9mk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default amount of error to accept in floating point comparisons (as ulps). */
    static final int DEFAULT_ULPS = 10;

    /** Default cut-off value. */
    static final double DEFAULT_CUT_OFF = 1e-12;

    /** Default amount of error to accept for algorithm convergence. */
    private static final double DEFAULT_EPSILON = 1.0e-6;

    /** Amount of error to accept for algorithm convergence. */
    private final double epsilon;

    /** Amount of error to accept in floating point comparisons (as ulps). */
    private final int maxUlps;

    /**
     * Cut-off value for entries in the tableau: values smaller than the cut-off
     * are treated as zero to improve numerical stability.
     */
    private final double cutOff;

    /**
     * Builds a simplex solver with default settings.
     */
    public SimplexSolver() {
        this(DEFAULT_EPSILON, DEFAULT_ULPS, DEFAULT_CUT_OFF);__CLR4_4_1rryrrylb90p9mk.R.inc(35999);try{__CLR4_4_1rryrrylb90p9mk.R.inc(35998);
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Builds a simplex solver with a specified accepted amount of error.
     *
     * @param epsilon Amount of error to accept for algorithm convergence.
     */
    public SimplexSolver(final double epsilon) {
        this(epsilon, DEFAULT_ULPS, DEFAULT_CUT_OFF);__CLR4_4_1rryrrylb90p9mk.R.inc(36001);try{__CLR4_4_1rryrrylb90p9mk.R.inc(36000);
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Builds a simplex solver with a specified accepted amount of error.
     *
     * @param epsilon Amount of error to accept for algorithm convergence.
     * @param maxUlps Amount of error to accept in floating point comparisons.
     */
    public SimplexSolver(final double epsilon, final int maxUlps) {
        this(epsilon, maxUlps, DEFAULT_CUT_OFF);__CLR4_4_1rryrrylb90p9mk.R.inc(36003);try{__CLR4_4_1rryrrylb90p9mk.R.inc(36002);
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Builds a simplex solver with a specified accepted amount of error.
     *
     * @param epsilon Amount of error to accept for algorithm convergence.
     * @param maxUlps Amount of error to accept in floating point comparisons.
     * @param cutOff Values smaller than the cutOff are treated as zero.
     */
    public SimplexSolver(final double epsilon, final int maxUlps, final double cutOff) {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36004);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36005);this.epsilon = epsilon;
        __CLR4_4_1rryrrylb90p9mk.R.inc(36006);this.maxUlps = maxUlps;
        __CLR4_4_1rryrrylb90p9mk.R.inc(36007);this.cutOff = cutOff;
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Returns the column with the most negative coefficient in the objective function row.
     *
     * @param tableau Simple tableau for the problem.
     * @return the column with the most negative coefficient.
     */
    private Integer getPivotColumn(SimplexTableau tableau) {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36008);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36009);double minValue = 0;
        __CLR4_4_1rryrrylb90p9mk.R.inc(36010);Integer minPos = null;
        __CLR4_4_1rryrrylb90p9mk.R.inc(36011);for (int i = tableau.getNumObjectiveFunctions(); (((i < tableau.getWidth() - 1)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36012)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36013)==0&false)); i++) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36014);final double entry = tableau.getEntry(0, i);
            // check if the entry is strictly smaller than the current minimum
            // do not use a ulp/epsilon check
            __CLR4_4_1rryrrylb90p9mk.R.inc(36015);if ((((entry < minValue)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36016)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36017)==0&false))) {{
                __CLR4_4_1rryrrylb90p9mk.R.inc(36018);minValue = entry;
                __CLR4_4_1rryrrylb90p9mk.R.inc(36019);minPos = i;
            }
        }}
        }__CLR4_4_1rryrrylb90p9mk.R.inc(36020);return minPos;
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).
     *
     * @param tableau Simple tableau for the problem.
     * @param col Column to test the ratio of (see {@link #getPivotColumn(SimplexTableau)}).
     * @return the row with the minimum ratio.
     */
    private Integer getPivotRow(SimplexTableau tableau, final int col) {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36021);
        // create a list of all the rows that tie for the lowest score in the minimum ratio test
        __CLR4_4_1rryrrylb90p9mk.R.inc(36022);List<Integer> minRatioPositions = new ArrayList<Integer>();
        __CLR4_4_1rryrrylb90p9mk.R.inc(36023);double minRatio = Double.MAX_VALUE;
        __CLR4_4_1rryrrylb90p9mk.R.inc(36024);for (int i = tableau.getNumObjectiveFunctions(); (((i < tableau.getHeight())&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36025)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36026)==0&false)); i++) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36027);final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
            __CLR4_4_1rryrrylb90p9mk.R.inc(36028);final double entry = tableau.getEntry(i, col);

            __CLR4_4_1rryrrylb90p9mk.R.inc(36029);if ((((Precision.compareTo(entry, 0d, maxUlps) > 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36030)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36031)==0&false))) {{
                __CLR4_4_1rryrrylb90p9mk.R.inc(36032);final double ratio = rhs / entry;
                // check if the entry is strictly equal to the current min ratio
                // do not use a ulp/epsilon check
                __CLR4_4_1rryrrylb90p9mk.R.inc(36033);final int cmp = Double.compare(ratio, minRatio);
                __CLR4_4_1rryrrylb90p9mk.R.inc(36034);if ((((cmp == 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36035)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36036)==0&false))) {{
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36037);minRatioPositions.add(i);
                } }else {__CLR4_4_1rryrrylb90p9mk.R.inc(36038);if ((((cmp < 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36039)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36040)==0&false))) {{
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36041);minRatio = ratio;
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36042);minRatioPositions = new ArrayList<Integer>();
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36043);minRatioPositions.add(i);
                }
            }}}
        }}

        }__CLR4_4_1rryrrylb90p9mk.R.inc(36044);if ((((minRatioPositions.size() == 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36045)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36046)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36047);return null;
        } }else {__CLR4_4_1rryrrylb90p9mk.R.inc(36048);if ((((minRatioPositions.size() > 1)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36049)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36050)==0&false))) {{
            // there's a degeneracy as indicated by a tie in the minimum ratio test

            // 1. check if there's an artificial variable that can be forced out of the basis
            __CLR4_4_1rryrrylb90p9mk.R.inc(36051);if ((((tableau.getNumArtificialVariables() > 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36052)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36053)==0&false))) {{
                __CLR4_4_1rryrrylb90p9mk.R.inc(36054);for (Integer row : minRatioPositions) {{
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36055);for (int i = 0; (((i < tableau.getNumArtificialVariables())&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36056)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36057)==0&false)); i++) {{
                        __CLR4_4_1rryrrylb90p9mk.R.inc(36058);int column = i + tableau.getArtificialVariableOffset();
                        __CLR4_4_1rryrrylb90p9mk.R.inc(36059);final double entry = tableau.getEntry(row, column);
                        __CLR4_4_1rryrrylb90p9mk.R.inc(36060);if ((((Precision.equals(entry, 1d, maxUlps) && row.equals(tableau.getBasicRow(column)))&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36061)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36062)==0&false))) {{
                            __CLR4_4_1rryrrylb90p9mk.R.inc(36063);return row;
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
            }__CLR4_4_1rryrrylb90p9mk.R.inc(36064);if ((((getEvaluations() < getMaxEvaluations() / 2)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36065)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36066)==0&false))) {{
                __CLR4_4_1rryrrylb90p9mk.R.inc(36067);Integer minRow = null;
                __CLR4_4_1rryrrylb90p9mk.R.inc(36068);int minIndex = tableau.getWidth();
                __CLR4_4_1rryrrylb90p9mk.R.inc(36069);final int varStart = tableau.getNumObjectiveFunctions();
                __CLR4_4_1rryrrylb90p9mk.R.inc(36070);final int varEnd = tableau.getWidth() - 1;
                __CLR4_4_1rryrrylb90p9mk.R.inc(36071);for (Integer row : minRatioPositions) {{
                    __CLR4_4_1rryrrylb90p9mk.R.inc(36072);for (int i = varStart; (((i < varEnd && !row.equals(minRow))&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36073)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36074)==0&false)); i++) {{
                        __CLR4_4_1rryrrylb90p9mk.R.inc(36075);final Integer basicRow = tableau.getBasicRow(i);
                        __CLR4_4_1rryrrylb90p9mk.R.inc(36076);if ((((basicRow != null && basicRow.equals(row) && i < minIndex)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36077)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36078)==0&false))) {{
                            __CLR4_4_1rryrrylb90p9mk.R.inc(36079);minIndex = i;
                            __CLR4_4_1rryrrylb90p9mk.R.inc(36080);minRow = row;
                        }
                    }}
                }}
                }__CLR4_4_1rryrrylb90p9mk.R.inc(36081);return minRow;
            }
        }}
        }}__CLR4_4_1rryrrylb90p9mk.R.inc(36082);return minRatioPositions.get(0);
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Runs one iteration of the Simplex method on the given model.
     *
     * @param tableau Simple tableau for the problem.
     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.
     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.
     */
    protected void doIteration(final SimplexTableau tableau)
        throws TooManyIterationsException,
               UnboundedSolutionException {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36083);

        __CLR4_4_1rryrrylb90p9mk.R.inc(36084);incrementIterationCount();

        __CLR4_4_1rryrrylb90p9mk.R.inc(36085);Integer pivotCol = getPivotColumn(tableau);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36086);Integer pivotRow = getPivotRow(tableau, pivotCol);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36087);if ((((pivotRow == null)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36088)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36089)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36090);throw new UnboundedSolutionException();
        }

        // set the pivot element to 1
        }__CLR4_4_1rryrrylb90p9mk.R.inc(36091);double pivotVal = tableau.getEntry(pivotRow, pivotCol);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36092);tableau.divideRow(pivotRow, pivotVal);

        // set the rest of the pivot column to 0
        __CLR4_4_1rryrrylb90p9mk.R.inc(36093);for (int i = 0; (((i < tableau.getHeight())&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36094)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36095)==0&false)); i++) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36096);if ((((i != pivotRow)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36097)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36098)==0&false))) {{
                __CLR4_4_1rryrrylb90p9mk.R.inc(36099);final double multiplier = tableau.getEntry(i, pivotCol);
                __CLR4_4_1rryrrylb90p9mk.R.inc(36100);tableau.subtractRow(i, pivotRow, multiplier);
            }
        }}
    }}finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /**
     * Solves Phase 1 of the Simplex method.
     *
     * @param tableau Simple tableau for the problem.
     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.
     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.
     * @throws NoFeasibleSolutionException if there is no feasible solution?
     */
    protected void solvePhase1(final SimplexTableau tableau)
        throws TooManyIterationsException,
               UnboundedSolutionException,
               NoFeasibleSolutionException {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36101);

        // make sure we're in Phase 1
        __CLR4_4_1rryrrylb90p9mk.R.inc(36102);if ((((tableau.getNumArtificialVariables() == 0)&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36103)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36104)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36105);return;
        }

        }__CLR4_4_1rryrrylb90p9mk.R.inc(36106);while ((((!tableau.isOptimal())&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36107)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36108)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36109);doIteration(tableau);
        }

        // if W is not zero then we have no feasible solution
        }__CLR4_4_1rryrrylb90p9mk.R.inc(36110);if ((((!Precision.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0d, epsilon))&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36111)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36112)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36113);throw new NoFeasibleSolutionException();
        }
    }}finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public PointValuePair doOptimize()
        throws TooManyIterationsException,
               UnboundedSolutionException,
               NoFeasibleSolutionException {try{__CLR4_4_1rryrrylb90p9mk.R.inc(36114);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36115);final SimplexTableau tableau =
            new SimplexTableau(getFunction(),
                               getConstraints(),
                               getGoalType(),
                               isRestrictedToNonNegative(),
                               epsilon,
                               maxUlps,
                               cutOff);

        __CLR4_4_1rryrrylb90p9mk.R.inc(36116);solvePhase1(tableau);
        __CLR4_4_1rryrrylb90p9mk.R.inc(36117);tableau.dropPhase1Objective();

        __CLR4_4_1rryrrylb90p9mk.R.inc(36118);while ((((!tableau.isOptimal())&&(__CLR4_4_1rryrrylb90p9mk.R.iget(36119)!=0|true))||(__CLR4_4_1rryrrylb90p9mk.R.iget(36120)==0&false))) {{
            __CLR4_4_1rryrrylb90p9mk.R.inc(36121);doIteration(tableau);
        }
        }__CLR4_4_1rryrrylb90p9mk.R.inc(36122);return tableau.getSolution();
    }finally{__CLR4_4_1rryrrylb90p9mk.R.flushNeeded();}}
}
