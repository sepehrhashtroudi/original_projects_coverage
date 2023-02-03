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
 * An objective function for a linear optimization problem.
 * <p>
 * A linear objective function has one the form:
 * <pre>
 * c<sub>1</sub>x<sub>1</sub> + ... c<sub>n</sub>x<sub>n</sub> + d
 * </pre>
 * The c<sub>i</sub> and d are the coefficients of the equation,
 * the x<sub>i</sub> are the coordinates of the current point.
 * </p>
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class LinearObjectiveFunction implements Serializable {public static class __CLR4_4_1zivzivlb90pa66{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46071,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -4531815507568396090L;

    /** Coefficients of the constraint (c<sub>i</sub>). */
    private final transient RealVector coefficients;

    /** Constant term of the linear equation. */
    private final double constantTerm;

    /**
     * @param coefficients The coefficients for the linear equation being optimized
     * @param constantTerm The constant term of the linear equation
     */
    public LinearObjectiveFunction(double[] coefficients, double constantTerm) {
        this(new ArrayRealVector(coefficients), constantTerm);__CLR4_4_1zivzivlb90pa66.R.inc(46040);try{__CLR4_4_1zivzivlb90pa66.R.inc(46039);
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * @param coefficients The coefficients for the linear equation being optimized
     * @param constantTerm The constant term of the linear equation
     */
    public LinearObjectiveFunction(RealVector coefficients, double constantTerm) {try{__CLR4_4_1zivzivlb90pa66.R.inc(46041);
        __CLR4_4_1zivzivlb90pa66.R.inc(46042);this.coefficients = coefficients;
        __CLR4_4_1zivzivlb90pa66.R.inc(46043);this.constantTerm = constantTerm;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Get the coefficients of the linear equation being optimized.
     * @return coefficients of the linear equation being optimized
     */
    public RealVector getCoefficients() {try{__CLR4_4_1zivzivlb90pa66.R.inc(46044);
        __CLR4_4_1zivzivlb90pa66.R.inc(46045);return coefficients;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Get the constant of the linear equation being optimized.
     * @return constant of the linear equation being optimized
     */
    public double getConstantTerm() {try{__CLR4_4_1zivzivlb90pa66.R.inc(46046);
        __CLR4_4_1zivzivlb90pa66.R.inc(46047);return constantTerm;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Compute the value of the linear equation at the current point
     * @param point point at which linear equation must be evaluated
     * @return value of the linear equation at the current point
     */
    public double getValue(final double[] point) {try{__CLR4_4_1zivzivlb90pa66.R.inc(46048);
        __CLR4_4_1zivzivlb90pa66.R.inc(46049);return coefficients.dotProduct(new ArrayRealVector(point, false)) + constantTerm;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Compute the value of the linear equation at the current point
     * @param point point at which linear equation must be evaluated
     * @return value of the linear equation at the current point
     */
    public double getValue(final RealVector point) {try{__CLR4_4_1zivzivlb90pa66.R.inc(46050);
        __CLR4_4_1zivzivlb90pa66.R.inc(46051);return coefficients.dotProduct(point) + constantTerm;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_4_1zivzivlb90pa66.R.inc(46052);

      __CLR4_4_1zivzivlb90pa66.R.inc(46053);if ((((this == other)&&(__CLR4_4_1zivzivlb90pa66.R.iget(46054)!=0|true))||(__CLR4_4_1zivzivlb90pa66.R.iget(46055)==0&false))) {{
        __CLR4_4_1zivzivlb90pa66.R.inc(46056);return true;
      }

      }__CLR4_4_1zivzivlb90pa66.R.inc(46057);if ((((other instanceof LinearObjectiveFunction)&&(__CLR4_4_1zivzivlb90pa66.R.iget(46058)!=0|true))||(__CLR4_4_1zivzivlb90pa66.R.iget(46059)==0&false))) {{
          __CLR4_4_1zivzivlb90pa66.R.inc(46060);LinearObjectiveFunction rhs = (LinearObjectiveFunction) other;
          __CLR4_4_1zivzivlb90pa66.R.inc(46061);return (constantTerm == rhs.constantTerm) && coefficients.equals(rhs.coefficients);
      }

      }__CLR4_4_1zivzivlb90pa66.R.inc(46062);return false;
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1zivzivlb90pa66.R.inc(46063);
        __CLR4_4_1zivzivlb90pa66.R.inc(46064);return Double.valueOf(constantTerm).hashCode() ^ coefficients.hashCode();
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Serialize the instance.
     * @param oos stream where object should be written
     * @throws IOException if object cannot be written to stream
     */
    private void writeObject(ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1zivzivlb90pa66.R.inc(46065);
        __CLR4_4_1zivzivlb90pa66.R.inc(46066);oos.defaultWriteObject();
        __CLR4_4_1zivzivlb90pa66.R.inc(46067);MatrixUtils.serializeRealVector(coefficients, oos);
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

    /**
     * Deserialize the instance.
     * @param ois stream from which the object should be read
     * @throws ClassNotFoundException if a class in the stream cannot be found
     * @throws IOException if object cannot be read from the stream
     */
    private void readObject(ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1zivzivlb90pa66.R.inc(46068);
        __CLR4_4_1zivzivlb90pa66.R.inc(46069);ois.defaultReadObject();
        __CLR4_4_1zivzivlb90pa66.R.inc(46070);MatrixUtils.deserializeRealVector(this, "coefficients", ois);
    }finally{__CLR4_4_1zivzivlb90pa66.R.flushNeeded();}}

}
