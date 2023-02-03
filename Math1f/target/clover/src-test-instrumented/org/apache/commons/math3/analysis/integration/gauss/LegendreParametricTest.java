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
package org.apache.commons.math3.analysis.integration.gauss;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test of the {@link LegendreRuleFactory}.
 * This parameterized test extends the standard test for Gaussian quadrature
 * rule, where each monomial is tested in turn.
 * Parametrization allows to test automatically 0, 1, ... , {@link #MAX_NUM_POINTS}
 * quadrature rules.
 *
 * @version $Id$
 */
@RunWith(value=Parameterized.class)
public class LegendreParametricTest extends GaussianQuadratureAbstractTest {static class __CLR4_4_11egl1egllb90pbzw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();
    private static final GaussIntegratorFactory factory = new GaussIntegratorFactory();

    /**
     * The highest order quadrature rule to be tested.
     */
    public static final int MAX_NUM_POINTS = 30;

    /**
     * Creates a new instance of this test, with the specified number of nodes
     * for the Gauss-Legendre quadrature rule.
     *
     * @param numberOfPoints Order of integration rule.
     * @param maxDegree Maximum degree of monomials to be tested.
     * @param eps Value of &epsilon;.
     * @param numUlps Value of the maximum relative error (in ulps).
     */
    public LegendreParametricTest(int numberOfPoints,
                                  int maxDegree,
                                  double eps,
                                  double numUlps) {
        super(factory.legendre(numberOfPoints),
              maxDegree, eps, numUlps);__CLR4_4_11egl1egllb90pbzw.R.inc(65398);try{__CLR4_4_11egl1egllb90pbzw.R.inc(65397);
    }finally{__CLR4_4_11egl1egllb90pbzw.R.flushNeeded();}}

    /**
     * Returns the collection of parameters to be passed to the constructor of
     * this class.
     * Gauss-Legendre quadrature rules of order 1, ..., {@link #MAX_NUM_POINTS}
     * will be constructed.
     *
     * @return the collection of parameters for this parameterized test.
     */
    @SuppressWarnings("boxing") // OK here
    @Parameters
    public static Collection<Object[]> getParameters() {try{__CLR4_4_11egl1egllb90pbzw.R.inc(65399);
        __CLR4_4_11egl1egllb90pbzw.R.inc(65400);final ArrayList<Object[]> parameters = new ArrayList<Object[]>();
        __CLR4_4_11egl1egllb90pbzw.R.inc(65401);for (int k = 1; (((k <= MAX_NUM_POINTS)&&(__CLR4_4_11egl1egllb90pbzw.R.iget(65402)!=0|true))||(__CLR4_4_11egl1egllb90pbzw.R.iget(65403)==0&false)); k++) {{
            __CLR4_4_11egl1egllb90pbzw.R.inc(65404);parameters.add(new Object[] { k, 2 * k - 1, Math.ulp(1d), 91d });
        }
        }__CLR4_4_11egl1egllb90pbzw.R.inc(65405);return parameters;
    }finally{__CLR4_4_11egl1egllb90pbzw.R.flushNeeded();}}

    @Override
    public double getExpectedValue(final int n) {try{__CLR4_4_11egl1egllb90pbzw.R.inc(65406);
        __CLR4_4_11egl1egllb90pbzw.R.inc(65407);if ((((n % 2 == 1)&&(__CLR4_4_11egl1egllb90pbzw.R.iget(65408)!=0|true))||(__CLR4_4_11egl1egllb90pbzw.R.iget(65409)==0&false))) {{
            __CLR4_4_11egl1egllb90pbzw.R.inc(65410);return 0;
        }
        }__CLR4_4_11egl1egllb90pbzw.R.inc(65411);return 2d / (n + 1);
    }finally{__CLR4_4_11egl1egllb90pbzw.R.flushNeeded();}}
}
