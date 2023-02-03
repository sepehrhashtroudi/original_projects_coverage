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

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;


/**
 * A linear constraint for a linear optimization problem.
 * <p>
 * A linear constraint has one of the forms:
 * <ul>
 *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> = v</li>
 *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> &lt;= v</li>
 *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> >= v</li>
 *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> =
 *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
 *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> &lt;=
 *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
 *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> >=
 *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
 * </ul>
 * The c<sub>i</sub>, l<sub>i</sub> or r<sub>i</sub> are the coefficients of the constraints, the x<sub>i</sub>
 * are the coordinates of the current point and v is the value of the constraint.
 * </p>
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class LinearConstraint implements Serializable {public static class __CLR4_4_1zhnzhnlb90pa62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -764632794033034092L;

    /** Coefficients of the constraint (left hand side). */
    private final transient RealVector coefficients;

    /** Relationship between left and right hand sides (=, &lt;=, >=). */
    private final Relationship relationship;

    /** Value of the constraint (right hand side). */
    private final double value;

    /**
     * Build a constraint involving a single linear equation.
     * <p>
     * A linear constraint with a single linear equation has one of the forms:
     * <ul>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> = v</li>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> &lt;= v</li>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> >= v</li>
     * </ul>
     * </p>
     * @param coefficients The coefficients of the constraint (left hand side)
     * @param relationship The type of (in)equality used in the constraint
     * @param value The value of the constraint (right hand side)
     */
    public LinearConstraint(final double[] coefficients, final Relationship relationship,
                            final double value) {
        this(new ArrayRealVector(coefficients), relationship, value);__CLR4_4_1zhnzhnlb90pa62.R.inc(45996);try{__CLR4_4_1zhnzhnlb90pa62.R.inc(45995);
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Build a constraint involving a single linear equation.
     * <p>
     * A linear constraint with a single linear equation has one of the forms:
     * <ul>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> = v</li>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> &lt;= v</li>
     *   <li>c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> >= v</li>
     * </ul>
     * </p>
     * @param coefficients The coefficients of the constraint (left hand side)
     * @param relationship The type of (in)equality used in the constraint
     * @param value The value of the constraint (right hand side)
     */
    public LinearConstraint(final RealVector coefficients, final Relationship relationship,
                            final double value) {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(45997);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(45998);this.coefficients = coefficients;
        __CLR4_4_1zhnzhnlb90pa62.R.inc(45999);this.relationship = relationship;
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46000);this.value        = value;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Build a constraint involving two linear equations.
     * <p>
     * A linear constraint with two linear equation has one of the forms:
     * <ul>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> =
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> &lt;=
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> >=
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     * </ul>
     * </p>
     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint
     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint
     * @param relationship The type of (in)equality used in the constraint
     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint
     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint
     */
    public LinearConstraint(final double[] lhsCoefficients, final double lhsConstant,
                            final Relationship relationship,
                            final double[] rhsCoefficients, final double rhsConstant) {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46001);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46002);double[] sub = new double[lhsCoefficients.length];
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46003);for (int i = 0; (((i < sub.length)&&(__CLR4_4_1zhnzhnlb90pa62.R.iget(46004)!=0|true))||(__CLR4_4_1zhnzhnlb90pa62.R.iget(46005)==0&false)); ++i) {{
            __CLR4_4_1zhnzhnlb90pa62.R.inc(46006);sub[i] = lhsCoefficients[i] - rhsCoefficients[i];
        }
        }__CLR4_4_1zhnzhnlb90pa62.R.inc(46007);this.coefficients = new ArrayRealVector(sub, false);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46008);this.relationship = relationship;
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46009);this.value        = rhsConstant - lhsConstant;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Build a constraint involving two linear equations.
     * <p>
     * A linear constraint with two linear equation has one of the forms:
     * <ul>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> =
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> &lt;=
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     *   <li>l<sub>1</sub>x<sub>1</sub> + ... l<sub>n</sub>x<sub>n</sub> + l<sub>cst</sub> >=
     *       r<sub>1</sub>x<sub>1</sub> + ... r<sub>n</sub>x<sub>n</sub> + r<sub>cst</sub></li>
     * </ul>
     * </p>
     * @param lhsCoefficients The coefficients of the linear expression on the left hand side of the constraint
     * @param lhsConstant The constant term of the linear expression on the left hand side of the constraint
     * @param relationship The type of (in)equality used in the constraint
     * @param rhsCoefficients The coefficients of the linear expression on the right hand side of the constraint
     * @param rhsConstant The constant term of the linear expression on the right hand side of the constraint
     */
    public LinearConstraint(final RealVector lhsCoefficients, final double lhsConstant,
                            final Relationship relationship,
                            final RealVector rhsCoefficients, final double rhsConstant) {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46010);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46011);this.coefficients = lhsCoefficients.subtract(rhsCoefficients);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46012);this.relationship = relationship;
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46013);this.value        = rhsConstant - lhsConstant;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Get the coefficients of the constraint (left hand side).
     * @return coefficients of the constraint (left hand side)
     */
    public RealVector getCoefficients() {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46014);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46015);return coefficients;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Get the relationship between left and right hand sides.
     * @return relationship between left and right hand sides
     */
    public Relationship getRelationship() {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46016);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46017);return relationship;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Get the value of the constraint (right hand side).
     * @return value of the constraint (right hand side)
     */
    public double getValue() {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46018);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46019);return value;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46020);

      __CLR4_4_1zhnzhnlb90pa62.R.inc(46021);if ((((this == other)&&(__CLR4_4_1zhnzhnlb90pa62.R.iget(46022)!=0|true))||(__CLR4_4_1zhnzhnlb90pa62.R.iget(46023)==0&false))) {{
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46024);return true;
      }

      }__CLR4_4_1zhnzhnlb90pa62.R.inc(46025);if ((((other instanceof LinearConstraint)&&(__CLR4_4_1zhnzhnlb90pa62.R.iget(46026)!=0|true))||(__CLR4_4_1zhnzhnlb90pa62.R.iget(46027)==0&false))) {{
          __CLR4_4_1zhnzhnlb90pa62.R.inc(46028);LinearConstraint rhs = (LinearConstraint) other;
          __CLR4_4_1zhnzhnlb90pa62.R.inc(46029);return (relationship == rhs.relationship) &&
                 (value        == rhs.value) &&
                 coefficients.equals(rhs.coefficients);
      }
      }__CLR4_4_1zhnzhnlb90pa62.R.inc(46030);return false;
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46031);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46032);return relationship.hashCode() ^
               Double.valueOf(value).hashCode() ^
               coefficients.hashCode();
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Serialize the instance.
     * @param oos stream where object should be written
     * @throws IOException if object cannot be written to stream
     */
    private void writeObject(ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46033);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46034);oos.defaultWriteObject();
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46035);MatrixUtils.serializeRealVector(coefficients, oos);
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

    /**
     * Deserialize the instance.
     * @param ois stream from which the object should be read
     * @throws ClassNotFoundException if a class in the stream cannot be found
     * @throws IOException if object cannot be read from the stream
     */
    private void readObject(ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1zhnzhnlb90pa62.R.inc(46036);
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46037);ois.defaultReadObject();
        __CLR4_4_1zhnzhnlb90pa62.R.inc(46038);MatrixUtils.deserializeRealVector(this, "coefficients", ois);
    }finally{__CLR4_4_1zhnzhnlb90pa62.R.flushNeeded();}}

}
