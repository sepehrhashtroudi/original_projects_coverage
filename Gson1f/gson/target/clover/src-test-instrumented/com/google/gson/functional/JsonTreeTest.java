/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.google.gson.functional;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;

/**
 * Functional tests for {@link Gson#toJsonTree(Object)} and 
 * {@link Gson#toJsonTree(Object, java.lang.reflect.Type)}
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonTreeTest extends TestCase {static class __CLR4_4_15j75j7lck0y95y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,7216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_15j75j7lck0y95y.R.inc(7171);
    __CLR4_4_15j75j7lck0y95y.R.inc(7172);super.setUp();
    __CLR4_4_15j75j7lck0y95y.R.inc(7173);gson = new Gson();
  }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}

  public void testToJsonTree() {__CLR4_4_15j75j7lck0y95y.R.globalSliceStart(getClass().getName(),7174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lq26qu5ja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15j75j7lck0y95y.R.rethrow($CLV_t2$);}finally{__CLR4_4_15j75j7lck0y95y.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonTreeTest.testToJsonTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lq26qu5ja(){try{__CLR4_4_15j75j7lck0y95y.R.inc(7174);
    __CLR4_4_15j75j7lck0y95y.R.inc(7175);BagOfPrimitives bag = new BagOfPrimitives(10L, 5, false, "foo");
    __CLR4_4_15j75j7lck0y95y.R.inc(7176);JsonElement json = gson.toJsonTree(bag);
    __CLR4_4_15j75j7lck0y95y.R.inc(7177);assertTrue(json.isJsonObject());
    __CLR4_4_15j75j7lck0y95y.R.inc(7178);JsonObject obj = json.getAsJsonObject();
    __CLR4_4_15j75j7lck0y95y.R.inc(7179);Set<Entry<String, JsonElement>> children = obj.entrySet();
    __CLR4_4_15j75j7lck0y95y.R.inc(7180);assertEquals(4, children.size());
    __CLR4_4_15j75j7lck0y95y.R.inc(7181);assertContains(obj, new JsonPrimitive(10L));
    __CLR4_4_15j75j7lck0y95y.R.inc(7182);assertContains(obj, new JsonPrimitive(5));
    __CLR4_4_15j75j7lck0y95y.R.inc(7183);assertContains(obj, new JsonPrimitive(false));
    __CLR4_4_15j75j7lck0y95y.R.inc(7184);assertContains(obj, new JsonPrimitive("foo"));
  }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}

  public void testToJsonTreeObjectType() {__CLR4_4_15j75j7lck0y95y.R.globalSliceStart(getClass().getName(),7185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtfz9p5jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15j75j7lck0y95y.R.rethrow($CLV_t2$);}finally{__CLR4_4_15j75j7lck0y95y.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonTreeTest.testToJsonTreeObjectType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtfz9p5jl(){try{__CLR4_4_15j75j7lck0y95y.R.inc(7185);
    __CLR4_4_15j75j7lck0y95y.R.inc(7186);SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L, 5, false, "foo", 1.4F);
    __CLR4_4_15j75j7lck0y95y.R.inc(7187);JsonElement json = gson.toJsonTree(bag, BagOfPrimitives.class);
    __CLR4_4_15j75j7lck0y95y.R.inc(7188);assertTrue(json.isJsonObject());
    __CLR4_4_15j75j7lck0y95y.R.inc(7189);JsonObject obj = json.getAsJsonObject();
    __CLR4_4_15j75j7lck0y95y.R.inc(7190);Set<Entry<String, JsonElement>> children = obj.entrySet();
    __CLR4_4_15j75j7lck0y95y.R.inc(7191);assertEquals(4, children.size());
    __CLR4_4_15j75j7lck0y95y.R.inc(7192);assertContains(obj, new JsonPrimitive(10L));
    __CLR4_4_15j75j7lck0y95y.R.inc(7193);assertContains(obj, new JsonPrimitive(5));
    __CLR4_4_15j75j7lck0y95y.R.inc(7194);assertContains(obj, new JsonPrimitive(false));
    __CLR4_4_15j75j7lck0y95y.R.inc(7195);assertContains(obj, new JsonPrimitive("foo"));
  }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}

  public void testJsonTreeToString() {__CLR4_4_15j75j7lck0y95y.R.globalSliceStart(getClass().getName(),7196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s27qj5jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15j75j7lck0y95y.R.rethrow($CLV_t2$);}finally{__CLR4_4_15j75j7lck0y95y.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonTreeTest.testJsonTreeToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s27qj5jw(){try{__CLR4_4_15j75j7lck0y95y.R.inc(7196);
    __CLR4_4_15j75j7lck0y95y.R.inc(7197);SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L, 5, false, "foo", 1.4F);
    __CLR4_4_15j75j7lck0y95y.R.inc(7198);String json1 = gson.toJson(bag);
    __CLR4_4_15j75j7lck0y95y.R.inc(7199);JsonElement jsonElement = gson.toJsonTree(bag, SubTypeOfBagOfPrimitives.class);
    __CLR4_4_15j75j7lck0y95y.R.inc(7200);String json2 = gson.toJson(jsonElement);
    __CLR4_4_15j75j7lck0y95y.R.inc(7201);assertEquals(json1, json2);
  }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}

  private void assertContains(JsonObject json, JsonPrimitive child) {try{__CLR4_4_15j75j7lck0y95y.R.inc(7202);
    __CLR4_4_15j75j7lck0y95y.R.inc(7203);for (Map.Entry<String, JsonElement> entry : json.entrySet()) {{
      __CLR4_4_15j75j7lck0y95y.R.inc(7204);JsonElement node = entry.getValue();
      __CLR4_4_15j75j7lck0y95y.R.inc(7205);if ((((node.isJsonPrimitive())&&(__CLR4_4_15j75j7lck0y95y.R.iget(7206)!=0|true))||(__CLR4_4_15j75j7lck0y95y.R.iget(7207)==0&false))) {{
        __CLR4_4_15j75j7lck0y95y.R.inc(7208);if ((((node.getAsJsonPrimitive().equals(child))&&(__CLR4_4_15j75j7lck0y95y.R.iget(7209)!=0|true))||(__CLR4_4_15j75j7lck0y95y.R.iget(7210)==0&false))) {{
          __CLR4_4_15j75j7lck0y95y.R.inc(7211);return;
        }
      }}
    }}
    }__CLR4_4_15j75j7lck0y95y.R.inc(7212);fail();
  }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}
  
  private static class SubTypeOfBagOfPrimitives extends BagOfPrimitives {
    @SuppressWarnings("unused")
    float f = 1.2F;
    public SubTypeOfBagOfPrimitives(long l, int i, boolean b, String string, float f) {
      super(l, i, b, string);__CLR4_4_15j75j7lck0y95y.R.inc(7214);try{__CLR4_4_15j75j7lck0y95y.R.inc(7213);
      __CLR4_4_15j75j7lck0y95y.R.inc(7215);this.f = f;
    }finally{__CLR4_4_15j75j7lck0y95y.R.flushNeeded();}}
  }
}
