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

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/**
 * A visitor that adds JSON elements corresponding to each field of an object
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class JsonSerializationVisitor implements ObjectNavigator.Visitor {public static class __CLR4_4_11bs1bslck0y8dh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,1870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private final ObjectNavigatorFactory factory;
  private final ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers;
  private final boolean serializeNulls;
  private final JsonSerializationContext context;
  private final MemoryRefStack ancestors;
  private JsonElement root;

  JsonSerializationVisitor(ObjectNavigatorFactory factory, boolean serializeNulls,
      ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers, JsonSerializationContext context,
      MemoryRefStack ancestors) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1720);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1721);this.factory = factory;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1722);this.serializeNulls = serializeNulls;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1723);this.serializers = serializers;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1724);this.context = context;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1725);this.ancestors = ancestors;
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public Object getTarget() {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1726);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1727);return null;
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void start(ObjectTypePair node) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1728);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1729);if ((((node == null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1730)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1731)==0&false))) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1732);return;
    }
    }__CLR4_4_11bs1bslck0y8dh.R.inc(1733);if ((((ancestors.contains(node))&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1734)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1735)==0&false))) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1736);throw new CircularReferenceException(node);
    }
    }__CLR4_4_11bs1bslck0y8dh.R.inc(1737);ancestors.push(node);
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void end(ObjectTypePair node) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1738);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1739);if ((((node != null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1740)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1741)==0&false))) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1742);ancestors.pop();
    }
  }}finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void startVisitingObject(Object node) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1743);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1744);assignToRoot(new JsonObject());
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void visitArray(Object array, Type arrayType) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1745);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1746);assignToRoot(new JsonArray());
    __CLR4_4_11bs1bslck0y8dh.R.inc(1747);int length = Array.getLength(array);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1748);TypeInfoArray fieldTypeInfo = TypeInfoFactory.getTypeInfoForArray(arrayType);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1749);Type componentType = fieldTypeInfo.getSecondLevelType();
    __CLR4_4_11bs1bslck0y8dh.R.inc(1750);for (int i = 0; (((i < length)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1751)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1752)==0&false)); ++i) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1753);Object child = Array.get(array, i);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1754);Type childType = componentType;
      // we should not get more specific component type yet since it is possible
      // that a custom
      // serializer is registered for the componentType
      __CLR4_4_11bs1bslck0y8dh.R.inc(1755);addAsArrayElement(new ObjectTypePair(child, childType, false));
    }
  }}finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void visitArrayField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1756);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1757);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1758);if ((((isFieldNull(f, obj))&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1759)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1760)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1761);if ((((serializeNulls)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1762)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1763)==0&false))) {{
          __CLR4_4_11bs1bslck0y8dh.R.inc(1764);addChildAsElement(f, JsonNull.createJsonNull());
        }
      }} }else {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1765);Object array = getFieldValue(f, obj);
        __CLR4_4_11bs1bslck0y8dh.R.inc(1766);addAsChildOfObject(f, new ObjectTypePair(array, typeOfF, false));
      }
    }} catch (CircularReferenceException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1767);throw e.createDetailedException(f);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void visitObjectField(FieldAttributes f, Type typeOfF, Object obj) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1768);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1769);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1770);if ((((isFieldNull(f, obj))&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1771)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1772)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1773);if ((((serializeNulls)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1774)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1775)==0&false))) {{
          __CLR4_4_11bs1bslck0y8dh.R.inc(1776);addChildAsElement(f, JsonNull.createJsonNull());
        }
      }} }else {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1777);Object fieldValue = getFieldValue(f, obj);
        // we should not get more specific component type yet since it is
        // possible that a custom
        // serializer is registered for the componentType
        __CLR4_4_11bs1bslck0y8dh.R.inc(1778);addAsChildOfObject(f, new ObjectTypePair(fieldValue, typeOfF, false));
      }
    }} catch (CircularReferenceException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1779);throw e.createDetailedException(f);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public void visitPrimitive(Object obj) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1780);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1781);JsonElement json = (((obj == null )&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1782)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1783)==0&false))? JsonNull.createJsonNull() : new JsonPrimitive(obj);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1784);assignToRoot(json);
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private void addAsChildOfObject(FieldAttributes f, ObjectTypePair fieldValuePair) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1785);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1786);JsonElement childElement = getJsonElementForChild(fieldValuePair);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1787);addChildAsElement(f, childElement);
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private void addChildAsElement(FieldAttributes f, JsonElement childElement) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1788);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1789);FieldNamingStrategy2 namingPolicy = factory.getFieldNamingPolicy();
    __CLR4_4_11bs1bslck0y8dh.R.inc(1790);root.getAsJsonObject().add(namingPolicy.translateName(f), childElement);
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private void addAsArrayElement(ObjectTypePair elementTypePair) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1791);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1792);if ((((elementTypePair.getObject() == null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1793)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1794)==0&false))) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1795);root.getAsJsonArray().add(JsonNull.createJsonNull());
    } }else {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1796);JsonElement childElement = getJsonElementForChild(elementTypePair);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1797);root.getAsJsonArray().add(childElement);
    }
  }}finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private JsonElement getJsonElementForChild(ObjectTypePair fieldValueTypePair) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1798);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1799);ObjectNavigator on = factory.create(fieldValueTypePair);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1800);JsonSerializationVisitor childVisitor =
        new JsonSerializationVisitor(factory, serializeNulls, serializers, context, ancestors);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1801);on.accept(childVisitor);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1802);return childVisitor.getJsonElement();
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public boolean visitUsingCustomHandler(ObjectTypePair objTypePair) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1803);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1804);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1805);Object obj = objTypePair.getObject();
      __CLR4_4_11bs1bslck0y8dh.R.inc(1806);if ((((obj == null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1807)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1808)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1809);if ((((serializeNulls)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1810)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1811)==0&false))) {{
          __CLR4_4_11bs1bslck0y8dh.R.inc(1812);assignToRoot(JsonNull.createJsonNull());
        }
        }__CLR4_4_11bs1bslck0y8dh.R.inc(1813);return true;
      }
      }__CLR4_4_11bs1bslck0y8dh.R.inc(1814);JsonElement element = findAndInvokeCustomSerializer(objTypePair);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1815);if ((((element != null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1816)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1817)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1818);assignToRoot(element);
        __CLR4_4_11bs1bslck0y8dh.R.inc(1819);return true;
      }
      }__CLR4_4_11bs1bslck0y8dh.R.inc(1820);return false;
    } catch (CircularReferenceException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1821);throw e.createDetailedException(null);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  /**
   * objTypePair.getObject() must not be null
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  private JsonElement findAndInvokeCustomSerializer(ObjectTypePair objTypePair) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1822);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1823);Pair<JsonSerializer<?>,ObjectTypePair> pair = objTypePair.getMatchingHandler(serializers);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1824);if ((((pair == null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1825)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1826)==0&false))) {{
      __CLR4_4_11bs1bslck0y8dh.R.inc(1827);return null;
    }
    }__CLR4_4_11bs1bslck0y8dh.R.inc(1828);JsonSerializer serializer = pair.first;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1829);objTypePair = pair.second;
    __CLR4_4_11bs1bslck0y8dh.R.inc(1830);start(objTypePair);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1831);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1832);JsonElement element =
          serializer.serialize(objTypePair.getObject(), objTypePair.getType(), context);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1833);return (((element == null )&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1834)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1835)==0&false))? JsonNull.createJsonNull() : element;
    } finally {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1836);end(objTypePair);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type declaredTypeOfField, Object parent) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1837);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1838);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1839);Preconditions.checkState(root.isJsonObject());
      __CLR4_4_11bs1bslck0y8dh.R.inc(1840);Object obj = f.get(parent);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1841);if ((((obj == null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1842)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1843)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1844);if ((((serializeNulls)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1845)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1846)==0&false))) {{
          __CLR4_4_11bs1bslck0y8dh.R.inc(1847);addChildAsElement(f, JsonNull.createJsonNull());
        }
        }__CLR4_4_11bs1bslck0y8dh.R.inc(1848);return true;
      }
      }__CLR4_4_11bs1bslck0y8dh.R.inc(1849);ObjectTypePair objTypePair = new ObjectTypePair(obj, declaredTypeOfField, false);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1850);JsonElement child = findAndInvokeCustomSerializer(objTypePair);
      __CLR4_4_11bs1bslck0y8dh.R.inc(1851);if ((((child != null)&&(__CLR4_4_11bs1bslck0y8dh.R.iget(1852)!=0|true))||(__CLR4_4_11bs1bslck0y8dh.R.iget(1853)==0&false))) {{
        __CLR4_4_11bs1bslck0y8dh.R.inc(1854);addChildAsElement(f, child);
        __CLR4_4_11bs1bslck0y8dh.R.inc(1855);return true;
      }
      }__CLR4_4_11bs1bslck0y8dh.R.inc(1856);return false;
    } catch (IllegalAccessException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1857);throw new RuntimeException();
    } catch (CircularReferenceException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1858);throw e.createDetailedException(f);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private void assignToRoot(JsonElement newRoot) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1859);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1860);Preconditions.checkNotNull(newRoot);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1861);root = newRoot;
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private boolean isFieldNull(FieldAttributes f, Object obj) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1862);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1863);return getFieldValue(f, obj) == null;
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  private Object getFieldValue(FieldAttributes f, Object obj) {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1864);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1865);try {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1866);return f.get(obj);
    } catch (IllegalAccessException e) {
      __CLR4_4_11bs1bslck0y8dh.R.inc(1867);throw new RuntimeException(e);
    }
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}

  public JsonElement getJsonElement() {try{__CLR4_4_11bs1bslck0y8dh.R.inc(1868);
    __CLR4_4_11bs1bslck0y8dh.R.inc(1869);return root;
  }finally{__CLR4_4_11bs1bslck0y8dh.R.flushNeeded();}}
}
