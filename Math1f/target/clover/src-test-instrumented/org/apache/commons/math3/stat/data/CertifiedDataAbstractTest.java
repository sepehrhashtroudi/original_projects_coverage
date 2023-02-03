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

package org.apache.commons.math3.stat.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Id$
 */
public abstract class CertifiedDataAbstractTest {static class __CLR4_4_12a3y2a3ylb90pelr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DescriptiveStatistics descriptives;

    private SummaryStatistics summaries;

    private Map<String, Double> certifiedValues;

    @Before
    public void setUp() throws IOException {try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106414);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106415);descriptives = new DescriptiveStatistics();
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106416);summaries = new SummaryStatistics();
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106417);certifiedValues = new HashMap<String, Double>();

        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106418);loadData();
    }finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}

    private void loadData() throws IOException {try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106419);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106420);BufferedReader in = null;

        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106421);try {
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106422);URL resourceURL = getClass().getClassLoader().getResource(getResourceName());
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106423);in = new BufferedReader(new InputStreamReader(resourceURL.openStream()));

            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106424);String line = in.readLine();
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106425);while ((((line != null)&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106426)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106427)==0&false))) {{

                /* this call to StringUtils did little for the
                 * following conditional structure
                 */
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106428);line = line.trim();

                // not empty line or comment
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106429);if ((((!("".equals(line) || line.startsWith("#")))&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106430)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106431)==0&false))) {{
                    __CLR4_4_12a3y2a3ylb90pelr.R.inc(106432);int n = line.indexOf('=');
                    __CLR4_4_12a3y2a3ylb90pelr.R.inc(106433);if ((((n == -1)&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106434)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106435)==0&false))) {{
                        // data value
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106436);double value = Double.parseDouble(line);
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106437);descriptives.addValue(value);
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106438);summaries.addValue(value);
                    } }else {{
                        // certified value
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106439);String name = line.substring(0, n).trim();
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106440);String valueString = line.substring(n + 1).trim();
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106441);Double value = Double.valueOf(valueString);
                        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106442);certifiedValues.put(name, value);
                    }
                }}
                }__CLR4_4_12a3y2a3ylb90pelr.R.inc(106443);line = in.readLine();
            }
        }} finally {
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106444);if ((((in != null)&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106445)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106446)==0&false))) {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106447);in.close();
            }
        }}
    }finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}

    protected abstract String getResourceName();

    protected double getMaximumAbsoluteError() {try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106448);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106449);return 1.0e-5;
    }finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106450);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106451);descriptives.clear();
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106452);descriptives = null;

        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106453);summaries.clear();
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106454);summaries = null;

        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106455);certifiedValues.clear();
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106456);certifiedValues = null;
    }finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}

    @Test
    public void testCertifiedValues() {__CLR4_4_12a3y2a3ylb90pelr.R.globalSliceStart(getClass().getName(),106457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulns22a55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a3y2a3ylb90pelr.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a3y2a3ylb90pelr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.data.CertifiedDataAbstractTest.testCertifiedValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulns22a55(){try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106457);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106458);for (String name : certifiedValues.keySet()) {{
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106459);Double expectedValue = certifiedValues.get(name);

            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106460);Double summariesValue = getProperty(summaries, name);
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106461);if ((((summariesValue != null)&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106462)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106463)==0&false))) {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106464);TestUtils.assertEquals("summary value for " + name + " is incorrect.",
                                       summariesValue.doubleValue(), expectedValue.doubleValue(),
                                       getMaximumAbsoluteError());
            }

            }__CLR4_4_12a3y2a3ylb90pelr.R.inc(106465);Double descriptivesValue = getProperty(descriptives, name);
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106466);if ((((descriptivesValue != null)&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106467)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106468)==0&false))) {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106469);TestUtils.assertEquals("descriptive value for " + name + " is incorrect.",
                                       descriptivesValue.doubleValue(), expectedValue.doubleValue(),
                                       getMaximumAbsoluteError());
            }
        }}
    }}finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}


    protected Double getProperty(Object bean, String name) {try{__CLR4_4_12a3y2a3ylb90pelr.R.inc(106470);
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106471);try {
            // Get the value of prop
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106472);String prop = "get" + name.substring(0,1).toUpperCase() + name.substring(1);
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106473);Method meth = bean.getClass().getMethod(prop, new Class[0]);
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106474);Object property = meth.invoke(bean, new Object[0]);
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106475);if ((((meth.getReturnType().equals(Double.TYPE))&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106476)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106477)==0&false))) {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106478);return (Double) property;
            } }else {__CLR4_4_12a3y2a3ylb90pelr.R.inc(106479);if ((((meth.getReturnType().equals(Long.TYPE))&&(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106480)!=0|true))||(__CLR4_4_12a3y2a3ylb90pelr.R.iget(106481)==0&false))) {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106482);return Double.valueOf(((Long) property).doubleValue());
            } }else {{
                __CLR4_4_12a3y2a3ylb90pelr.R.inc(106483);Assert.fail("wrong type: " + meth.getReturnType().getName());
            }
        }}} catch (NoSuchMethodException nsme) {
            // ignored
        } catch (InvocationTargetException ite) {
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106484);Assert.fail(ite.getMessage());
        } catch (IllegalAccessException iae) {
            __CLR4_4_12a3y2a3ylb90pelr.R.inc(106485);Assert.fail(iae.getMessage());
        }
        __CLR4_4_12a3y2a3ylb90pelr.R.inc(106486);return null;
    }finally{__CLR4_4_12a3y2a3ylb90pelr.R.flushNeeded();}}
}
