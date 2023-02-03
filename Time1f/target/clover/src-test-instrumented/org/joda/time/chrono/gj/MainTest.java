/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.chrono.gj;

import java.util.Random;

import junit.framework.TestCase;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * Tests either the Julian or Gregorian chronology from org.joda.time.chrono.gj
 * against the implementations in this package. It tests all the date fields
 * against their principal methods.
 * <p>
 * Randomly generated values are fed into the DateTimeField methods and the
 * results are compared between the two chronologies. If any result doesn't
 * match, an error report is generated and the program exits. Each time this
 * test program is run, the pseudo random number generator is seeded with the
 * same value. This ensures consistent results between test runs.
 * <p>
 * The main method accepts three optional arguments: iterations, mode, seed. By
 * default, iterations is set to 1,000,000. The test will take several minutes
 * to run, depending on the computer's performance. Every 5 seconds a progress
 * message is printed.
 * <p>
 * The mode can be either 'g' for proleptic gregorian (the default) or 'j' for
 * proleptic julian. To override the default random number generator seed, pass
 * in a third argument which accepts a long signed integer.
 *
 * @author Brian S O'Neill
 */
public class MainTest extends TestCase {static class __CLR4_4_114vx14vxlc8azwst{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,53236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final int GREGORIAN_MODE = 0;
    public static final int JULIAN_MODE = 1;

    private static final long MILLIS_PER_YEAR = (long)365.2425 * 24 * 60 * 60 * 1000;
    private static final long _1000_YEARS = 1000 * MILLIS_PER_YEAR;
    private static final long _500_YEARS = 500 * MILLIS_PER_YEAR;
    private static final long MAX_MILLIS = (10000 - 1970) * MILLIS_PER_YEAR;
    private static final long MIN_MILLIS = (-10000 - 1970) * MILLIS_PER_YEAR;

    // Show progess reports every 5 seconds.
    private static final long UPDATE_INTERVAL = 5000;

    /**
     * Arguments: iterations [mode [seed]]
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_114vx14vxlc8azwst.R.inc(52989);
        __CLR4_4_114vx14vxlc8azwst.R.inc(52990);int iterations = 1000000;
        __CLR4_4_114vx14vxlc8azwst.R.inc(52991);int mode = GREGORIAN_MODE;
        __CLR4_4_114vx14vxlc8azwst.R.inc(52992);long seed = 1345435247779935L;

        __CLR4_4_114vx14vxlc8azwst.R.inc(52993);if ((((args.length > 0)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(52994)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(52995)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(52996);iterations = Integer.parseInt(args[0]);
            __CLR4_4_114vx14vxlc8azwst.R.inc(52997);if ((((args.length > 1)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(52998)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(52999)==0&false))) {{
                __CLR4_4_114vx14vxlc8azwst.R.inc(53000);if ((((args[1].startsWith("g"))&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53001)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53002)==0&false))) {{
                    __CLR4_4_114vx14vxlc8azwst.R.inc(53003);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_114vx14vxlc8azwst.R.inc(53004);if ((((args[1].startsWith("j"))&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53005)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53006)==0&false))) {{
                    __CLR4_4_114vx14vxlc8azwst.R.inc(53007);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_114vx14vxlc8azwst.R.inc(53008);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_114vx14vxlc8azwst.R.inc(53009);if ((((args.length > 2)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53010)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53011)==0&false))) {{
                    __CLR4_4_114vx14vxlc8azwst.R.inc(53012);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_114vx14vxlc8azwst.R.inc(53013);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private final int iIterations;
    private final int iMode;
    private final long iSeed;
    private final Chronology iTest;
    private final Chronology iActual;

    /**
     * @param iterations number of test iterations to perform
     * @param mode GREGORIAN_MODE or JULIAN_MODE,0=Gregorian, 1=Julian
     * @param seed seed for random number generator
     */
    public MainTest(int iterations, int mode, long seed) {
        super("testChronology");__CLR4_4_114vx14vxlc8azwst.R.inc(53015);try{__CLR4_4_114vx14vxlc8azwst.R.inc(53014);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53016);iIterations = iterations;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53017);iMode = mode;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53018);iSeed = seed;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53019);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53020)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53021)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53022);iTest = new TestGregorianChronology();
            __CLR4_4_114vx14vxlc8azwst.R.inc(53023);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53024);iTest = new TestJulianChronology();
            __CLR4_4_114vx14vxlc8azwst.R.inc(53025);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    public void testChronology() {__CLR4_4_114vx14vxlc8azwst.R.globalSliceStart(getClass().getName(),53026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86n14wy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_114vx14vxlc8azwst.R.rethrow($CLV_t2$);}finally{__CLR4_4_114vx14vxlc8azwst.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86n14wy(){try{__CLR4_4_114vx14vxlc8azwst.R.inc(53026);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53027);int iterations = iIterations;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53028);long seed = iSeed;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53029);String modeStr;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53030);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53031)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53032)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53033);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53034);modeStr = "Julian";
        }

        }__CLR4_4_114vx14vxlc8azwst.R.inc(53035);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_114vx14vxlc8azwst.R.inc(53036);Random rnd = new Random(seed);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53037);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_114vx14vxlc8azwst.R.inc(53038);for (int i=0; (((i<iterations)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53039)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53040)==0&false)); i++) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53041);long now = System.currentTimeMillis();
            __CLR4_4_114vx14vxlc8azwst.R.inc(53042);if ((((now >= updateMillis)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53043)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53044)==0&false))) {{
                __CLR4_4_114vx14vxlc8azwst.R.inc(53045);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_114vx14vxlc8azwst.R.inc(53046);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_114vx14vxlc8azwst.R.inc(53047);if ((((complete < 100)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53048)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53049)==0&false))) {{
                    __CLR4_4_114vx14vxlc8azwst.R.inc(53050);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_114vx14vxlc8azwst.R.inc(53051);long millis = randomMillis(rnd);
            __CLR4_4_114vx14vxlc8azwst.R.inc(53052);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_114vx14vxlc8azwst.R.inc(53053);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_114vx14vxlc8azwst.R.inc(53054);try {
                __CLR4_4_114vx14vxlc8azwst.R.inc(53055);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_114vx14vxlc8azwst.R.inc(53056);System.out.println("Failure index: " + i);
                __CLR4_4_114vx14vxlc8azwst.R.inc(53057);System.out.println("Test millis: " + millis);
                __CLR4_4_114vx14vxlc8azwst.R.inc(53058);System.out.println("Test value: " + value);
                __CLR4_4_114vx14vxlc8azwst.R.inc(53059);System.out.println("Test millis2: " + millis2);
                __CLR4_4_114vx14vxlc8azwst.R.inc(53060);fail(e.getMessage());
            }
        }

        }__CLR4_4_114vx14vxlc8azwst.R.inc(53061);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53062);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53063);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53064);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53065);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53066);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53067);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53068);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53069);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53070);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53071);int a, b;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53072);long x, y;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53073);boolean m, n;

        // get test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53074);a = fieldA.get(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53075);b = fieldB.get(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53076);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_114vx14vxlc8azwst.R.inc(53077);Class fieldClass = fieldA.getClass();
        __CLR4_4_114vx14vxlc8azwst.R.inc(53078);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53079)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53080)==0&false))) {{
            
            __CLR4_4_114vx14vxlc8azwst.R.inc(53081);a = fieldA.getMaximumValue(millis);
            __CLR4_4_114vx14vxlc8azwst.R.inc(53082);b = fieldB.getMaximumValue(millis);
            __CLR4_4_114vx14vxlc8azwst.R.inc(53083);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_114vx14vxlc8azwst.R.inc(53084);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53085);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53086);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53087)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53088)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53089);x = fieldA.set(millis, a);
            __CLR4_4_114vx14vxlc8azwst.R.inc(53090);y = fieldB.set(millis, b);
            __CLR4_4_114vx14vxlc8azwst.R.inc(53091);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_114vx14vxlc8azwst.R.inc(53092);x = fieldA.roundFloor(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53093);y = fieldB.roundFloor(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53094);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53095);x = fieldA.roundCeiling(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53096);y = fieldB.roundCeiling(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53097);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53098);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53099);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53100);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53101);x = fieldA.roundHalfEven(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53102);y = fieldB.roundHalfEven(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53103);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53104);x = fieldA.remainder(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53105);y = fieldB.remainder(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53106);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53107);x = fieldA.add(millis, value);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53108);y = fieldB.add(millis, value);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53109);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53110);x = fieldA.addWrapField(millis, value);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53111);y = fieldB.addWrapField(millis, value);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53112);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53113);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53114);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53115);try {
            __CLR4_4_114vx14vxlc8azwst.R.inc(53116);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_114vx14vxlc8azwst.R.inc(53117);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_114vx14vxlc8azwst.R.inc(53118);throw e;
        }

        // isLeap test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53119);m = fieldA.isLeap(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53120);n = fieldB.isLeap(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53121);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_114vx14vxlc8azwst.R.inc(53122);a = fieldA.getLeapAmount(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53123);b = fieldB.getLeapAmount(millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53124);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53125);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53126);if ((((minValue >= maxValue)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53127)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53128)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53129);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_114vx14vxlc8azwst.R.inc(53130);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_114vx14vxlc8azwst.R.inc(53131);value -= minValue;

        __CLR4_4_114vx14vxlc8azwst.R.inc(53132);if ((((value >= 0)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53133)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53134)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53135);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_114vx14vxlc8azwst.R.inc(53136);int remByRange = (-value) % wrapRange;

        __CLR4_4_114vx14vxlc8azwst.R.inc(53137);if ((((remByRange == 0)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53138)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53139)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53140);return 0 + minValue;
        }
        }__CLR4_4_114vx14vxlc8azwst.R.inc(53141);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53142);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53143);if ((((valueA != valueB)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53144)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53145)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53146);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53147);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53148);if ((((millisA != millisB)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53149)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53150)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53151);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53152);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53153);if ((((millisA != millisB)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53154)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53155)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53156);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53157);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53158);if ((((boolA != boolB)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53159)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53160)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53161);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53162);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53163);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53164);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_114vx14vxlc8azwst.R.inc(53165);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53166);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53167);System.out.println(valueA + " != " + valueB);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53168);throw new RuntimeException();
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53169);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53170);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53171);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_114vx14vxlc8azwst.R.inc(53172);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53173);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53174);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53175);System.out.println(millisA + " != " + millisB);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53176);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53177);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53178);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53179);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53180);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53181);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53182);throw new RuntimeException();
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53183);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53184);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53185);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_114vx14vxlc8azwst.R.inc(53186);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53187);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53188);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53189);System.out.println(millisA + " != " + millisB);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53190);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53191);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53192);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53193);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53194);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53195);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53196);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53197);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53198);throw new RuntimeException();
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53199);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53200);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53201);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_114vx14vxlc8azwst.R.inc(53202);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53203);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53204);System.out.println(boolA + " != " + boolB);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53205);throw new RuntimeException();
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53206);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53207);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53208)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53209)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53210);return fieldA.getName();
        } }else {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53211);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53212);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53213);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53214);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53215);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53216);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53217);return makeDate(millis, iActual);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53218);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53219);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53220);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53221);long millis = rnd.nextLong();
        __CLR4_4_114vx14vxlc8azwst.R.inc(53222);if ((((millis >= 0)&&(__CLR4_4_114vx14vxlc8azwst.R.iget(53223)!=0|true))||(__CLR4_4_114vx14vxlc8azwst.R.iget(53224)==0&false))) {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53225);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_114vx14vxlc8azwst.R.inc(53226);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_114vx14vxlc8azwst.R.inc(53227);return millis;
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_114vx14vxlc8azwst.R.inc(53228);
        __CLR4_4_114vx14vxlc8azwst.R.inc(53229);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53230);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53231);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53232);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53233);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53234);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_114vx14vxlc8azwst.R.inc(53235);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_114vx14vxlc8azwst.R.flushNeeded();}}

}
