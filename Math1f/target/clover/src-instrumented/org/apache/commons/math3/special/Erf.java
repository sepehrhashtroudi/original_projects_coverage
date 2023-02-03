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
package org.apache.commons.math3.special;

import org.apache.commons.math3.util.FastMath;

/**
 * This is a utility class that provides computation methods related to the
 * error functions.
 *
 * @version $Id$
 */
public class Erf {public static class __CLR4_4_111uk11uklb90pahq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49165,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The number {@code X_CRIT} is used by {@link #erf(double, double)} internally.
     * This number solves {@code erf(x)=0.5} within 1ulp.
     * More precisely, the current implementations of
     * {@link #erf(double)} and {@link #erfc(double)} satisfy:<br/>
     * {@code erf(X_CRIT) < 0.5},<br/>
     * {@code erf(Math.nextUp(X_CRIT) > 0.5},<br/>
     * {@code erfc(X_CRIT) = 0.5}, and<br/>
     * {@code erfc(Math.nextUp(X_CRIT) < 0.5}
     */
    private static final double X_CRIT = 0.4769362762044697;

    /**
     * Default constructor.  Prohibit instantiation.
     */
    private Erf() {try{__CLR4_4_111uk11uklb90pahq.R.inc(49052);}finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

    /**
     * Returns the error function.
     *
     * <p>erf(x) = 2/&radic;&pi; <sub>0</sub>&int;<sup>x</sup> e<sup>-t<sup>2</sup></sup>dt </p>
     *
     * <p>This implementation computes erf(x) using the
     * {@link Gamma#regularizedGammaP(double, double, double, int) regularized gamma function},
     * following <a href="http://mathworld.wolfram.com/Erf.html"> Erf</a>, equation (3)</p>
     *
     * <p>The value returned is always between -1 and 1 (inclusive).
     * If {@code abs(x) > 40}, then {@code erf(x)} is indistinguishable from
     * either 1 or -1 as a double, so the appropriate extreme value is returned.
     * </p>
     *
     * @param x the value.
     * @return the error function erf(x)
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     * @see Gamma#regularizedGammaP(double, double, double, int)
     */
    public static double erf(double x) {try{__CLR4_4_111uk11uklb90pahq.R.inc(49053);
        __CLR4_4_111uk11uklb90pahq.R.inc(49054);if ((((FastMath.abs(x) > 40)&&(__CLR4_4_111uk11uklb90pahq.R.iget(49055)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49056)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49057);return (((x > 0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49058)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49059)==0&false))? 1 : -1;
        }
        }__CLR4_4_111uk11uklb90pahq.R.inc(49060);final double ret = Gamma.regularizedGammaP(0.5, x * x, 1.0e-15, 10000);
        __CLR4_4_111uk11uklb90pahq.R.inc(49061);return (((x < 0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49062)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49063)==0&false))? -ret : ret;
    }finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

    /**
     * Returns the complementary error function.
     *
     * <p>erfc(x) = 2/&radic;&pi; <sub>x</sub>&int;<sup>&infin;</sup> e<sup>-t<sup>2</sup></sup>dt
     * <br/>
     *    = 1 - {@link #erf(double) erf(x)} </p>
     *
     * <p>This implementation computes erfc(x) using the
     * {@link Gamma#regularizedGammaQ(double, double, double, int) regularized gamma function},
     * following <a href="http://mathworld.wolfram.com/Erf.html"> Erf</a>, equation (3).</p>
     *
     * <p>The value returned is always between 0 and 2 (inclusive).
     * If {@code abs(x) > 40}, then {@code erf(x)} is indistinguishable from
     * either 0 or 2 as a double, so the appropriate extreme value is returned.
     * </p>
     *
     * @param x the value
     * @return the complementary error function erfc(x)
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the algorithm fails to converge.
     * @see Gamma#regularizedGammaQ(double, double, double, int)
     * @since 2.2
     */
    public static double erfc(double x) {try{__CLR4_4_111uk11uklb90pahq.R.inc(49064);
        __CLR4_4_111uk11uklb90pahq.R.inc(49065);if ((((FastMath.abs(x) > 40)&&(__CLR4_4_111uk11uklb90pahq.R.iget(49066)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49067)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49068);return (((x > 0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49069)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49070)==0&false))? 0 : 2;
        }
        }__CLR4_4_111uk11uklb90pahq.R.inc(49071);final double ret = Gamma.regularizedGammaQ(0.5, x * x, 1.0e-15, 10000);
        __CLR4_4_111uk11uklb90pahq.R.inc(49072);return (((x < 0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49073)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49074)==0&false))? 2 - ret : ret;
    }finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

    /**
     * Returns the difference between erf(x1) and erf(x2).
     *
     * The implementation uses either erf(double) or erfc(double)
     * depending on which provides the most precise result.
     *
     * @param x1 the first value
     * @param x2 the second value
     * @return erf(x2) - erf(x1)
     */
    public static double erf(double x1, double x2) {try{__CLR4_4_111uk11uklb90pahq.R.inc(49075);
        __CLR4_4_111uk11uklb90pahq.R.inc(49076);if((((x1 > x2)&&(__CLR4_4_111uk11uklb90pahq.R.iget(49077)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49078)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49079);return -erf(x2, x1);
        }

        }__CLR4_4_111uk11uklb90pahq.R.inc(49080);return
        (((x1 < -X_CRIT )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49081)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49082)==0&false))?
            (((x2 < 0.0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49083)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49084)==0&false))?
                erfc(-x2) - erfc(-x1) :
                erf(x2) - erf(x1) :
            (((x2 > X_CRIT && x1 > 0.0 )&&(__CLR4_4_111uk11uklb90pahq.R.iget(49085)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49086)==0&false))?
                erfc(x1) - erfc(x2) :
                erf(x2) - erf(x1);
    }finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

    /**
     * Returns the inverse erf.
     * <p>
     * This implementation is described in the paper:
     * <a href="http://people.maths.ox.ac.uk/gilesm/files/gems_erfinv.pdf">Approximating
     * the erfinv function</a> by Mike Giles, Oxford-Man Institute of Quantitative Finance,
     * which was published in GPU Computing Gems, volume 2, 2010.
     * The source code is available <a href="http://gpucomputing.net/?q=node/1828">here</a>.
     * </p>
     * @param x the value
     * @return t such that x = erf(t)
     * @since 3.2
     */
    public static double erfInv(final double x) {try{__CLR4_4_111uk11uklb90pahq.R.inc(49087);

        // beware that the logarithm argument must be
        // commputed as (1.0 - x) * (1.0 + x),
        // it must NOT be simplified as 1.0 - x * x as this
        // would induce rounding errors near the boundaries +/-1
        __CLR4_4_111uk11uklb90pahq.R.inc(49088);double w = - FastMath.log((1.0 - x) * (1.0 + x));
        __CLR4_4_111uk11uklb90pahq.R.inc(49089);double p;

        __CLR4_4_111uk11uklb90pahq.R.inc(49090);if ((((w < 6.25)&&(__CLR4_4_111uk11uklb90pahq.R.iget(49091)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49092)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49093);w = w - 3.125;
            __CLR4_4_111uk11uklb90pahq.R.inc(49094);p =  -3.6444120640178196996e-21;
            __CLR4_4_111uk11uklb90pahq.R.inc(49095);p =   -1.685059138182016589e-19 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49096);p =   1.2858480715256400167e-18 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49097);p =    1.115787767802518096e-17 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49098);p =   -1.333171662854620906e-16 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49099);p =   2.0972767875968561637e-17 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49100);p =   6.6376381343583238325e-15 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49101);p =  -4.0545662729752068639e-14 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49102);p =  -8.1519341976054721522e-14 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49103);p =   2.6335093153082322977e-12 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49104);p =  -1.2975133253453532498e-11 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49105);p =  -5.4154120542946279317e-11 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49106);p =    1.051212273321532285e-09 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49107);p =  -4.1126339803469836976e-09 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49108);p =  -2.9070369957882005086e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49109);p =   4.2347877827932403518e-07 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49110);p =  -1.3654692000834678645e-06 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49111);p =  -1.3882523362786468719e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49112);p =    0.0001867342080340571352 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49113);p =  -0.00074070253416626697512 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49114);p =   -0.0060336708714301490533 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49115);p =      0.24015818242558961693 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49116);p =       1.6536545626831027356 + p * w;
        } }else {__CLR4_4_111uk11uklb90pahq.R.inc(49117);if ((((w < 16.0)&&(__CLR4_4_111uk11uklb90pahq.R.iget(49118)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49119)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49120);w = FastMath.sqrt(w) - 3.25;
            __CLR4_4_111uk11uklb90pahq.R.inc(49121);p =   2.2137376921775787049e-09;
            __CLR4_4_111uk11uklb90pahq.R.inc(49122);p =   9.0756561938885390979e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49123);p =  -2.7517406297064545428e-07 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49124);p =   1.8239629214389227755e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49125);p =   1.5027403968909827627e-06 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49126);p =   -4.013867526981545969e-06 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49127);p =   2.9234449089955446044e-06 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49128);p =   1.2475304481671778723e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49129);p =  -4.7318229009055733981e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49130);p =   6.8284851459573175448e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49131);p =   2.4031110387097893999e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49132);p =   -0.0003550375203628474796 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49133);p =   0.00095328937973738049703 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49134);p =   -0.0016882755560235047313 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49135);p =    0.0024914420961078508066 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49136);p =   -0.0037512085075692412107 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49137);p =     0.005370914553590063617 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49138);p =       1.0052589676941592334 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49139);p =       3.0838856104922207635 + p * w;
        } }else {__CLR4_4_111uk11uklb90pahq.R.inc(49140);if ((((!Double.isInfinite(w))&&(__CLR4_4_111uk11uklb90pahq.R.iget(49141)!=0|true))||(__CLR4_4_111uk11uklb90pahq.R.iget(49142)==0&false))) {{
            __CLR4_4_111uk11uklb90pahq.R.inc(49143);w = FastMath.sqrt(w) - 5.0;
            __CLR4_4_111uk11uklb90pahq.R.inc(49144);p =  -2.7109920616438573243e-11;
            __CLR4_4_111uk11uklb90pahq.R.inc(49145);p =  -2.5556418169965252055e-10 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49146);p =   1.5076572693500548083e-09 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49147);p =  -3.7894654401267369937e-09 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49148);p =   7.6157012080783393804e-09 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49149);p =  -1.4960026627149240478e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49150);p =   2.9147953450901080826e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49151);p =  -6.7711997758452339498e-08 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49152);p =   2.2900482228026654717e-07 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49153);p =  -9.9298272942317002539e-07 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49154);p =   4.5260625972231537039e-06 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49155);p =  -1.9681778105531670567e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49156);p =   7.5995277030017761139e-05 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49157);p =  -0.00021503011930044477347 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49158);p =  -0.00013871931833623122026 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49159);p =       1.0103004648645343977 + p * w;
            __CLR4_4_111uk11uklb90pahq.R.inc(49160);p =       4.8499064014085844221 + p * w;
        } }else {{
            // this branch does not appears in the original code, it
            // was added because the previous branch does not handle
            // x = +/-1 correctly. In this case, w is positive infinity
            // and as the first coefficient (-2.71e-11) is negative.
            // Once the first multiplication is done, p becomes negative
            // infinity and remains so throughout the polynomial evaluation.
            // So the branch above incorrectly returns negative infinity
            // instead of the correct positive infinity.
            __CLR4_4_111uk11uklb90pahq.R.inc(49161);p = Double.POSITIVE_INFINITY;
        }

        }}}__CLR4_4_111uk11uklb90pahq.R.inc(49162);return p * x;

    }finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

    /**
     * Returns the inverse erfc.
     * @param x the value
     * @return t such that x = erfc(t)
     * @since 3.2
     */
    public static double erfcInv(final double x) {try{__CLR4_4_111uk11uklb90pahq.R.inc(49163);
        __CLR4_4_111uk11uklb90pahq.R.inc(49164);return erfInv(1 - x);
    }finally{__CLR4_4_111uk11uklb90pahq.R.flushNeeded();}}

}

