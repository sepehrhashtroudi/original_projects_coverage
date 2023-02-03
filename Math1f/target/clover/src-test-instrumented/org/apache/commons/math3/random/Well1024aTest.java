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

import org.junit.Assert;

import org.junit.Test;

public class Well1024aTest extends RandomGeneratorAbstractTest {static class __CLR4_4_128u228u2lb90pebs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected RandomGenerator makeGenerator() {try{__CLR4_4_128u228u2lb90pebs.R.inc(104762);
        __CLR4_4_128u228u2lb90pebs.R.inc(104763);return new Well1024a(1001);
    }finally{__CLR4_4_128u228u2lb90pebs.R.flushNeeded();}}

    @Test
    public void testReferenceCode() {__CLR4_4_128u228u2lb90pebs.R.globalSliceStart(getClass().getName(),104764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5k4bx28u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128u228u2lb90pebs.R.rethrow($CLV_t2$);}finally{__CLR4_4_128u228u2lb90pebs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.Well1024aTest.testReferenceCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5k4bx28u4(){try{__CLR4_4_128u228u2lb90pebs.R.inc(104764);
        __CLR4_4_128u228u2lb90pebs.R.inc(104765);Well1024a mt = new Well1024a(new int[] {
            740849862,  1202665156,  -199039369,  -259008301,  -291878969, -1164428990, -1565918811,   491009864,
          -1883086670,  1383450241,  1244617256,   689006653, -1576746370, -1307940314,  1421489086,  1742094000,
           -595495729,  1047766204,  1875773301, -1637793284,  1379017098,   262792705,   191880010,  -251000180,
          -1753047622,  -972355720,    90626881,  1644693418,  1503365577,   439653419,  1806361562,  1268823869
       });
        __CLR4_4_128u228u2lb90pebs.R.inc(104766);int[] refInt = {
           -1478749726,  -1645579484,  -2075363835,  -2063444174,  -1834148336,  -1769045872,    -40711346,   1717441026,
            2130656771,    783441285,    570433609,   1560023451,    653233971,   1368672434,    -72036215,   1071111800,
             933776492,     26114960,     49888778,   1808107515,   1092989296,    754848337,   1336994364,  -1987450448,
            -691190146,  -1803870839,   1110716866,   1173269113,   -391000050,   2014216908,    180756301,   -382891013,
           -1908154585,   1580737629,   1080267957,   -125532248,   2094530239,   2132964485,   -438596348,   -760299445,
            1058181869,   2050816800,  -1534429037,    -62552782,    824524142,   -818590371,  -1857695907,   -684762866,
            -156556543,   -902759995,   -880795194,  -1387351132,  -1263017515,    448006597,    201038266,   1929826313,
            -455367306,    672963027,   2000073013,  -1546842042,    446341090,   1001696686,   -779919012,   -347722602,
           -1342821677,   1639571150,   -835315755,   1505585376,    367004975,  -2035864404,  -1786623553,   1249724913,
             182435312,   1444514513,   1815333708,   1333772382,    299664001,   -284691169,   2034403374,   1423310887,
           -1319051884,   1557286441,   -445198266,   -251809030,   1602786123,    944036382,  -1020529634,    258344235,
             685254367,   1838964943,   -156674528,   -979736602,   -538312836,    234643178,    211152102,   -635498640,
           -1036733933,  -1347589147,   -565609042,  -1358714165,    508618483,   -786364693,   2071450261,   1206956772,
            -678931458,    167690617,    144698821,   1719720781,   1575869280,  -1343221123,  -1766469944,    284991647,
            -717305514,    892653651,  -1368347075,   -615701972,   -730369849,   1360396003,  -1869287623,   1778269052,
            -586061545,   -699517114,     61530249,  -1860611767,   -519660852,   1841085925,   1555610093,   -399979337,
            -790345742,    422355947,   2007965433,   2044952550,  -1712164595,   -102915702,   -693865324,  -1894042487,
           -1285020072,   -215883074,     95833252,   1625818040,  -1055951680,    513067085,   1825246558,   -553461652,
           -1923361799,  -1869480206,    567232636,  -1751727150,  -1832301399,   -108136455,  -1312244126,     14006795,
             850221366,   -382389732,  -1741556188,  -1317464467,   1948314870,    753994471,   1028235947,    342494132,
           -1862256693,    723808794,   -234257642,   1609928369,   -802733456,   1315831915,   1436072885,   1224767136,
            2144557791,  -1839965886,    224821018,  -1461697757,  -1080386760,   1638573498,  -1188173812,   -325181523,
           -1750676219,  -1780415850,    698793362,   -908352052,    299746482,   -161660934,   1938166833,    800297005,
              56640033,  -1214932666,  -1248124842,   1822796868,   1777615881,   -718517774,   1908159957,   1733053281,
            1851844331,   1283519375,  -1771494956,   2060179999,   1666129209,   1919453531,   -498145770,    697567008,
            1855487148,  -1587163491,    565216434,  -1477877933,   -925662919,   -806492585,  -1201439047,  -1424534232,
            1788616523,     69414717,    655893636,  -1175978556,     24787512,   -861550001,    439525754,   -190433174,
            -383811606,   -508589783,   1441608687,    608181366,   1539467064,    925903122,    697209654,   1878283393,
           -1967567432,  -1659677763,   -249658183,    847096354,    397741956,   -125334541,  -1286840731,   1016461908,
            -997968592,   1795331475,   1856856501,  -1716726445,   -582181331,   -887091847,    426964855,   -609219941,
           -1456232632,   -483467616,   1069260754,    972242064,  -1406786247,   1954194029,     52627891,   1212755081,
            2117436668,    281073392,    741537353,   -483063506,   1850906286,   -244876135,   -270818140,   1817568823
        };

        __CLR4_4_128u228u2lb90pebs.R.inc(104767);for (int i = 0; (((i < refInt.length)&&(__CLR4_4_128u228u2lb90pebs.R.iget(104768)!=0|true))||(__CLR4_4_128u228u2lb90pebs.R.iget(104769)==0&false)); ++i) {{
            __CLR4_4_128u228u2lb90pebs.R.inc(104770);Assert.assertEquals(refInt[i], mt.nextInt());
        }

    }}finally{__CLR4_4_128u228u2lb90pebs.R.flushNeeded();}}

}
