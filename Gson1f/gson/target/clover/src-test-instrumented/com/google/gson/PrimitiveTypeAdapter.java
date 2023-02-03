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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.gson.JsonParseException;
import com.google.gson.Primitives;

/**
 * Handles type conversion from some object to some primitive (or primitive
 * wrapper instance).
 * 
 * @author Joel Leitch
 */
final class PrimitiveTypeAdapter {public static class __CLR4_4_13v63v6lck0y8vy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5041,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @SuppressWarnings("unchecked")
  public <T> T adaptType(Object from, Class<T> to) {try{__CLR4_4_13v63v6lck0y8vy.R.inc(5010);
    __CLR4_4_13v63v6lck0y8vy.R.inc(5011);Class<?> aClass = Primitives.wrap(to);
    __CLR4_4_13v63v6lck0y8vy.R.inc(5012);if ((((Primitives.isWrapperType(aClass))&&(__CLR4_4_13v63v6lck0y8vy.R.iget(5013)!=0|true))||(__CLR4_4_13v63v6lck0y8vy.R.iget(5014)==0&false))) {{
      __CLR4_4_13v63v6lck0y8vy.R.inc(5015);if ((((aClass == Character.class)&&(__CLR4_4_13v63v6lck0y8vy.R.iget(5016)!=0|true))||(__CLR4_4_13v63v6lck0y8vy.R.iget(5017)==0&false))) {{
        __CLR4_4_13v63v6lck0y8vy.R.inc(5018);String value = from.toString();
        __CLR4_4_13v63v6lck0y8vy.R.inc(5019);if ((((value.length() == 1)&&(__CLR4_4_13v63v6lck0y8vy.R.iget(5020)!=0|true))||(__CLR4_4_13v63v6lck0y8vy.R.iget(5021)==0&false))) {{
          __CLR4_4_13v63v6lck0y8vy.R.inc(5022);return (T) (Character) from.toString().charAt(0);
        }
        }__CLR4_4_13v63v6lck0y8vy.R.inc(5023);throw new JsonParseException("The value: " + value + " contains more than a character.");
      }

      }__CLR4_4_13v63v6lck0y8vy.R.inc(5024);try {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5025);Constructor<?> constructor = aClass.getConstructor(String.class);
        __CLR4_4_13v63v6lck0y8vy.R.inc(5026);return (T) constructor.newInstance(from.toString());
      } catch (NoSuchMethodException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5027);throw new JsonParseException(e);
      } catch (IllegalAccessException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5028);throw new JsonParseException(e);
      } catch (InvocationTargetException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5029);throw new JsonParseException(e);
      } catch (InstantiationException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5030);throw new JsonParseException(e);
      }
    } }else {__CLR4_4_13v63v6lck0y8vy.R.inc(5031);if ((((Enum.class.isAssignableFrom(to))&&(__CLR4_4_13v63v6lck0y8vy.R.iget(5032)!=0|true))||(__CLR4_4_13v63v6lck0y8vy.R.iget(5033)==0&false))) {{
      // Case where the type being adapted to is an Enum
      // We will try to convert from.toString() to the enum
      __CLR4_4_13v63v6lck0y8vy.R.inc(5034);try {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5035);Method valuesMethod = to.getMethod("valueOf", String.class);
        __CLR4_4_13v63v6lck0y8vy.R.inc(5036);return (T) valuesMethod.invoke(null, from.toString());
      } catch (NoSuchMethodException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5037);throw new RuntimeException(e);
      } catch (IllegalAccessException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5038);throw new RuntimeException(e);
      } catch (InvocationTargetException e) {
        __CLR4_4_13v63v6lck0y8vy.R.inc(5039);throw new RuntimeException(e);
      }
    } }else {{
      __CLR4_4_13v63v6lck0y8vy.R.inc(5040);throw new JsonParseException("Can not adapt type " + from.getClass() + " to " + to);
    }
  }}}finally{__CLR4_4_13v63v6lck0y8vy.R.flushNeeded();}}
}
