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

import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class UnitSphereRandomVectorGeneratorTest {static class __CLR4_4_128pw28pwlb90peb3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Test the distribution of points from {@link UnitSphereRandomVectorGenerator#nextVector()}
     * in two dimensions.
     */
    @Test
    public void test2DDistribution() {__CLR4_4_128pw28pwlb90peb3.R.globalSliceStart(getClass().getName(),104612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145rozz28pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128pw28pwlb90peb3.R.rethrow($CLV_t2$);}finally{__CLR4_4_128pw28pwlb90peb3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.UnitSphereRandomVectorGeneratorTest.test2DDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145rozz28pw(){try{__CLR4_4_128pw28pwlb90peb3.R.inc(104612);
      
        __CLR4_4_128pw28pwlb90peb3.R.inc(104613);RandomGenerator rg = new JDKRandomGenerator();
        __CLR4_4_128pw28pwlb90peb3.R.inc(104614);rg.setSeed(17399225432l);
        __CLR4_4_128pw28pwlb90peb3.R.inc(104615);UnitSphereRandomVectorGenerator generator = new UnitSphereRandomVectorGenerator(2, rg);

        // In 2D, angles with a given vector should be uniformly distributed
        __CLR4_4_128pw28pwlb90peb3.R.inc(104616);int[] angleBuckets = new int[100];
        __CLR4_4_128pw28pwlb90peb3.R.inc(104617);int steps = 1000000;
        __CLR4_4_128pw28pwlb90peb3.R.inc(104618);for (int i = 0; (((i < steps)&&(__CLR4_4_128pw28pwlb90peb3.R.iget(104619)!=0|true))||(__CLR4_4_128pw28pwlb90peb3.R.iget(104620)==0&false)); ++i) {{
            __CLR4_4_128pw28pwlb90peb3.R.inc(104621);final double[] v = generator.nextVector();
            __CLR4_4_128pw28pwlb90peb3.R.inc(104622);Assert.assertEquals(2, v.length);
            __CLR4_4_128pw28pwlb90peb3.R.inc(104623);Assert.assertEquals(1, length(v), 1e-10);
            // Compute angle formed with vector (1,0)
            // Cosine of angle is their dot product, because both are unit length
            // Dot product here is just the first element of the vector by construction
            __CLR4_4_128pw28pwlb90peb3.R.inc(104624);final double angle = FastMath.acos(v[0]);
            __CLR4_4_128pw28pwlb90peb3.R.inc(104625);final int bucket = (int) (angleBuckets.length * (angle / FastMath.PI));
            __CLR4_4_128pw28pwlb90peb3.R.inc(104626);++angleBuckets[bucket];
        }

        // Simplistic test for roughly even distribution
        }__CLR4_4_128pw28pwlb90peb3.R.inc(104627);final int expectedBucketSize = steps / angleBuckets.length;
        __CLR4_4_128pw28pwlb90peb3.R.inc(104628);for (int bucket : angleBuckets) {{
            __CLR4_4_128pw28pwlb90peb3.R.inc(104629);Assert.assertTrue("Bucket count " + bucket + " vs expected " + expectedBucketSize,
                              FastMath.abs(expectedBucketSize - bucket) < 350);
        }
    }}finally{__CLR4_4_128pw28pwlb90peb3.R.flushNeeded();}}

    /**
     * @return length (L2 norm) of given vector
     */
    private static double length(double[] vector) {try{__CLR4_4_128pw28pwlb90peb3.R.inc(104630);
        __CLR4_4_128pw28pwlb90peb3.R.inc(104631);double total = 0;
        __CLR4_4_128pw28pwlb90peb3.R.inc(104632);for (double d : vector) {{
            __CLR4_4_128pw28pwlb90peb3.R.inc(104633);total += d * d;
        }
        }__CLR4_4_128pw28pwlb90peb3.R.inc(104634);return FastMath.sqrt(total);
    }finally{__CLR4_4_128pw28pwlb90peb3.R.flushNeeded();}}
}
