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
package org.apache.commons.math3.random;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * <p>This class provides a stable normalized random generator. It samples from a stable
 * distribution with location parameter 0 and scale 1.</p>
 *
 * <p>The implementation uses the Chambers-Mallows-Stuck method as described in
 * <i>Handbook of computational statistics: concepts and methods</i> by
 * James E. Gentle, Wolfgang H&auml;rdle, Yuichi Mori.</p>
 *
 * @version $Id$
 * @since 3.0
 */
public class StableRandomGenerator implements NormalizedRandomGenerator {public static class __CLR4_4_111ed11edlb90paew{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48520,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying generator. */
    private final RandomGenerator generator;

    /** stability parameter */
    private final double alpha;

    /** skewness parameter */
    private final double beta;

    /** cache of expression value used in generation */
    private final double zeta;

    /**
     * Create a new generator.
     *
     * @param generator underlying random generator to use
     * @param alpha Stability parameter. Must be in range (0, 2]
     * @param beta Skewness parameter. Must be in range [-1, 1]
     * @throws NullArgumentException if generator is null
     * @throws OutOfRangeException if {@code alpha <= 0} or {@code alpha > 2}
     * or {@code beta < -1} or {@code beta > 1}
     */
    public StableRandomGenerator(final RandomGenerator generator,
                                 final double alpha, final double beta)
        throws NullArgumentException, OutOfRangeException {try{__CLR4_4_111ed11edlb90paew.R.inc(48469);
        __CLR4_4_111ed11edlb90paew.R.inc(48470);if ((((generator == null)&&(__CLR4_4_111ed11edlb90paew.R.iget(48471)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48472)==0&false))) {{
            __CLR4_4_111ed11edlb90paew.R.inc(48473);throw new NullArgumentException();
        }

        }__CLR4_4_111ed11edlb90paew.R.inc(48474);if ((((!(alpha > 0d && alpha <= 2d))&&(__CLR4_4_111ed11edlb90paew.R.iget(48475)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48476)==0&false))) {{
            __CLR4_4_111ed11edlb90paew.R.inc(48477);throw new OutOfRangeException(LocalizedFormats.OUT_OF_RANGE_LEFT,
                    alpha, 0, 2);
        }

        }__CLR4_4_111ed11edlb90paew.R.inc(48478);if ((((!(beta >= -1d && beta <= 1d))&&(__CLR4_4_111ed11edlb90paew.R.iget(48479)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48480)==0&false))) {{
            __CLR4_4_111ed11edlb90paew.R.inc(48481);throw new OutOfRangeException(LocalizedFormats.OUT_OF_RANGE_SIMPLE,
                    beta, -1, 1);
        }

        }__CLR4_4_111ed11edlb90paew.R.inc(48482);this.generator = generator;
        __CLR4_4_111ed11edlb90paew.R.inc(48483);this.alpha = alpha;
        __CLR4_4_111ed11edlb90paew.R.inc(48484);this.beta = beta;
        __CLR4_4_111ed11edlb90paew.R.inc(48485);if ((((alpha < 2d && beta != 0d)&&(__CLR4_4_111ed11edlb90paew.R.iget(48486)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48487)==0&false))) {{
            __CLR4_4_111ed11edlb90paew.R.inc(48488);zeta = beta * FastMath.tan(FastMath.PI * alpha / 2);
        } }else {{
            __CLR4_4_111ed11edlb90paew.R.inc(48489);zeta = 0d;
        }
    }}finally{__CLR4_4_111ed11edlb90paew.R.flushNeeded();}}

    /**
     * Generate a random scalar with zero location and unit scale.
     *
     * @return a random scalar with zero location and unit scale
     */
    public double nextNormalizedDouble() {try{__CLR4_4_111ed11edlb90paew.R.inc(48490);
        // we need 2 uniform random numbers to calculate omega and phi
        __CLR4_4_111ed11edlb90paew.R.inc(48491);double omega = -FastMath.log(generator.nextDouble());
        __CLR4_4_111ed11edlb90paew.R.inc(48492);double phi = FastMath.PI * (generator.nextDouble() - 0.5);

        // Normal distribution case (Box-Muller algorithm)
        __CLR4_4_111ed11edlb90paew.R.inc(48493);if ((((alpha == 2d)&&(__CLR4_4_111ed11edlb90paew.R.iget(48494)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48495)==0&false))) {{
            __CLR4_4_111ed11edlb90paew.R.inc(48496);return FastMath.sqrt(2d * omega) * FastMath.sin(phi);
        }

        }__CLR4_4_111ed11edlb90paew.R.inc(48497);double x;
        // when beta = 0, zeta is zero as well
        // Thus we can exclude it from the formula
        __CLR4_4_111ed11edlb90paew.R.inc(48498);if ((((beta == 0d)&&(__CLR4_4_111ed11edlb90paew.R.iget(48499)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48500)==0&false))) {{
            // Cauchy distribution case
            __CLR4_4_111ed11edlb90paew.R.inc(48501);if ((((alpha == 1d)&&(__CLR4_4_111ed11edlb90paew.R.iget(48502)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48503)==0&false))) {{
                __CLR4_4_111ed11edlb90paew.R.inc(48504);x = FastMath.tan(phi);
            } }else {{
                __CLR4_4_111ed11edlb90paew.R.inc(48505);x = FastMath.pow(omega * FastMath.cos((1 - alpha) * phi),
                    1d / alpha - 1d) *
                    FastMath.sin(alpha * phi) /
                    FastMath.pow(FastMath.cos(phi), 1d / alpha);
            }
        }} }else {{
            // Generic stable distribution
            __CLR4_4_111ed11edlb90paew.R.inc(48506);double cosPhi = FastMath.cos(phi);
            // to avoid rounding errors around alpha = 1
            __CLR4_4_111ed11edlb90paew.R.inc(48507);if ((((FastMath.abs(alpha - 1d) > 1e-8)&&(__CLR4_4_111ed11edlb90paew.R.iget(48508)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48509)==0&false))) {{
                __CLR4_4_111ed11edlb90paew.R.inc(48510);double alphaPhi = alpha * phi;
                __CLR4_4_111ed11edlb90paew.R.inc(48511);double invAlphaPhi = phi - alphaPhi;
                __CLR4_4_111ed11edlb90paew.R.inc(48512);x = (FastMath.sin(alphaPhi) + zeta * FastMath.cos(alphaPhi)) / cosPhi *
                    (FastMath.cos(invAlphaPhi) + zeta * FastMath.sin(invAlphaPhi)) /
                     FastMath.pow(omega * cosPhi, (1 - alpha) / alpha);
            } }else {{
                __CLR4_4_111ed11edlb90paew.R.inc(48513);double betaPhi = FastMath.PI / 2 + beta * phi;
                __CLR4_4_111ed11edlb90paew.R.inc(48514);x = 2d / FastMath.PI * (betaPhi * FastMath.tan(phi) - beta *
                    FastMath.log(FastMath.PI / 2d * omega * cosPhi / betaPhi));

                __CLR4_4_111ed11edlb90paew.R.inc(48515);if ((((alpha != 1d)&&(__CLR4_4_111ed11edlb90paew.R.iget(48516)!=0|true))||(__CLR4_4_111ed11edlb90paew.R.iget(48517)==0&false))) {{
                    __CLR4_4_111ed11edlb90paew.R.inc(48518);x = x + beta * FastMath.tan(FastMath.PI * alpha / 2);
                }
            }}
        }}
        }__CLR4_4_111ed11edlb90paew.R.inc(48519);return x;
    }finally{__CLR4_4_111ed11edlb90paew.R.flushNeeded();}}
}
