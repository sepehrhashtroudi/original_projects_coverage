/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class can be used to check the validity of a JSON field name.
 *
 * <p>The primary use of this object is to ensure that any Java fields that use the
 * {@link com.google.gson.annotations.SerializedName} annotation is providing valid JSON
 * field names.  This will make the code fail-fast rather than letting the invalid
 * field name propagate to the client and it fails to parse.</p>
 *
 * @author Joel Leitch
 */
class JsonFieldNameValidator {public static class __CLR4_4_1118118lck0y8ah{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final String COMMON_PATTERN = "[a-zA-Z][a-zA-Z0-9\\ \\$_\\-]*$";
  
  private static final Pattern JSON_FIELD_NAME_PATTERN =
      Pattern.compile("(^" + COMMON_PATTERN + ")|(^[\\$_]" + COMMON_PATTERN + ")");

  
  /**
   * Performs validation on the JSON field name to ensure it is a valid field name.
   *
   * @param fieldName the name of the field to validate
   * @return {@code fieldName} if it is a valid JSON field name
   * @throws IllegalArgumentException if the field name is an invalid JSON field name
   */
  public String validate(String fieldName) {try{__CLR4_4_1118118lck0y8ah.R.inc(1340);
    __CLR4_4_1118118lck0y8ah.R.inc(1341);Preconditions.checkNotNull(fieldName);
    __CLR4_4_1118118lck0y8ah.R.inc(1342);Preconditions.checkArgument(!"".equals(fieldName.trim()));

    __CLR4_4_1118118lck0y8ah.R.inc(1343);Matcher matcher = JSON_FIELD_NAME_PATTERN.matcher(fieldName);
    __CLR4_4_1118118lck0y8ah.R.inc(1344);if ((((!matcher.matches())&&(__CLR4_4_1118118lck0y8ah.R.iget(1345)!=0|true))||(__CLR4_4_1118118lck0y8ah.R.iget(1346)==0&false))) {{
      __CLR4_4_1118118lck0y8ah.R.inc(1347);throw new IllegalArgumentException(fieldName + " is not a valid JSON field name.");
    }
    }__CLR4_4_1118118lck0y8ah.R.inc(1348);return fieldName;
  }finally{__CLR4_4_1118118lck0y8ah.R.flushNeeded();}}
}
