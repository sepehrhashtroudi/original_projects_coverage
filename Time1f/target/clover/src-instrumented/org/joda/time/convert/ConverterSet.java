/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
package org.joda.time.convert;

/**
 * A set of converters, which allows exact converters to be quickly
 * selected. This class is threadsafe because it is (essentially) immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class ConverterSet {public static class __CLR4_4_19pr9prlc8azt3d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Converter[] iConverters;

    // A simple immutable hashtable: closed hashing, linear probing, sized
    // power of 2, at least one null slot.
    private Entry[] iSelectEntries;

    ConverterSet(Converter[] converters) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12591);
        // Since this is a package private constructor, we trust ourselves not
        // to alter the array outside this class.
        __CLR4_4_19pr9prlc8azt3d.R.inc(12592);iConverters = converters;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12593);iSelectEntries = new Entry[1 << 4]; // 16
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns the closest matching converter for the given type, or null if
     * none found.
     *
     * @param type type to select, which may be null
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    Converter select(Class<?> type) throws IllegalStateException {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12594);
        // Check the hashtable first.
        __CLR4_4_19pr9prlc8azt3d.R.inc(12595);Entry[] entries = iSelectEntries;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12596);int length = entries.length;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12597);int index = (((type == null )&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12598)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12599)==0&false))? 0 : type.hashCode() & (length - 1);

        __CLR4_4_19pr9prlc8azt3d.R.inc(12600);Entry e;
        // This loop depends on there being at least one null slot.
        __CLR4_4_19pr9prlc8azt3d.R.inc(12601);while ((e = entries[index]) != null) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12604);if ((((e.iType == type)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12605)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12606)==0&false))) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12607);return e.iConverter;
            }
            }__CLR4_4_19pr9prlc8azt3d.R.inc(12608);if ((((++index >= length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12609)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12610)==0&false))) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12611);index = 0;
            }
        }}

        // Not found in the hashtable, so do actual work.

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12612);Converter converter = selectSlow(this, type);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12613);e = new Entry(type, converter);

        // Save the entry for future selects. This class must be threadsafe,
        // but there is no synchronization. Since the hashtable is being used
        // as a cache, it is okay to destroy existing entries. This isn't
        // likely to occur unless there is a high amount of concurrency. As
        // time goes on, cache updates will occur less often, and the cache
        // will fill with all the necessary entries.

        // Do all updates on a copy: slots in iSelectEntries must not be
        // updated by multiple threads as this can allow all null slots to be
        // consumed.
        __CLR4_4_19pr9prlc8azt3d.R.inc(12614);entries = (Entry[])entries.clone();

        // Add new entry.
        __CLR4_4_19pr9prlc8azt3d.R.inc(12615);entries[index] = e;

        // Verify that at least one null slot exists!
        __CLR4_4_19pr9prlc8azt3d.R.inc(12616);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12617)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12618)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12619);if ((((entries[i] == null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12620)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12621)==0&false))) {{
                // Found a null slot, swap in new hashtable.
                __CLR4_4_19pr9prlc8azt3d.R.inc(12622);iSelectEntries = entries;
                __CLR4_4_19pr9prlc8azt3d.R.inc(12623);return converter;
            }
        }}

        // Double capacity and re-hash.

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12624);int newLength = length << 1;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12625);Entry[] newEntries = new Entry[newLength];
        __CLR4_4_19pr9prlc8azt3d.R.inc(12626);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12627)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12628)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12629);e = entries[i];
            __CLR4_4_19pr9prlc8azt3d.R.inc(12630);type = e.iType;
            __CLR4_4_19pr9prlc8azt3d.R.inc(12631);index = (((type == null )&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12632)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12633)==0&false))? 0 : type.hashCode() & (newLength - 1);
            __CLR4_4_19pr9prlc8azt3d.R.inc(12634);while ((((newEntries[index] != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12635)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12636)==0&false))) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12637);if ((((++index >= newLength)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12638)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12639)==0&false))) {{
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12640);index = 0;
                }
            }}
            }__CLR4_4_19pr9prlc8azt3d.R.inc(12641);newEntries[index] = e;
        }

        // Swap in new hashtable.
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12642);iSelectEntries = newEntries;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12643);return converter;
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns the amount of converters in the set.
     */
    int size() {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12644);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12645);return iConverters.length;
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Copies all the converters in the set to the given array.
     */
    void copyInto(Converter[] converters) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12646);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12647);System.arraycopy(iConverters, 0, converters, 0, iConverters.length);
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the given converter added. If a
     * matching converter is already in the set, the given converter replaces
     * it. If the converter is exactly the same as one already in the set, the
     * original set is returned.
     *
     * @param converter  converter to add, must not be null
     * @param removed  if not null, element 0 is set to the removed converter
     * @throws NullPointerException if converter is null
     */
    ConverterSet add(Converter converter, Converter[] removed) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12648);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12649);Converter[] converters = iConverters;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12650);int length = converters.length;

        __CLR4_4_19pr9prlc8azt3d.R.inc(12651);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12652)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12653)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12654);Converter existing = converters[i];
            __CLR4_4_19pr9prlc8azt3d.R.inc(12655);if ((((converter.equals(existing))&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12656)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12657)==0&false))) {{
                // Already in the set.
                __CLR4_4_19pr9prlc8azt3d.R.inc(12658);if ((((removed != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12659)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12660)==0&false))) {{
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12661);removed[0] = null;
                }
                }__CLR4_4_19pr9prlc8azt3d.R.inc(12662);return this;
            }
            
            }__CLR4_4_19pr9prlc8azt3d.R.inc(12663);if ((((converter.getSupportedType() == existing.getSupportedType())&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12664)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12665)==0&false))) {{
                // Replace the converter.
                __CLR4_4_19pr9prlc8azt3d.R.inc(12666);Converter[] copy = new Converter[length];
                    
                __CLR4_4_19pr9prlc8azt3d.R.inc(12667);for (int j=0; (((j<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12668)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12669)==0&false)); j++) {{
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12670);if ((((j != i)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12671)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12672)==0&false))) {{
                        __CLR4_4_19pr9prlc8azt3d.R.inc(12673);copy[j] = converters[j];
                    } }else {{
                        __CLR4_4_19pr9prlc8azt3d.R.inc(12674);copy[j] = converter;
                    }
                }}

                }__CLR4_4_19pr9prlc8azt3d.R.inc(12675);if ((((removed != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12676)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12677)==0&false))) {{
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12678);removed[0] = existing;
                }
                }__CLR4_4_19pr9prlc8azt3d.R.inc(12679);return new ConverterSet(copy);
            }
        }}

        // Not found, so add it.
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12680);Converter[] copy = new Converter[length + 1];
        __CLR4_4_19pr9prlc8azt3d.R.inc(12681);System.arraycopy(converters, 0, copy, 0, length);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12682);copy[length] = converter;
        
        __CLR4_4_19pr9prlc8azt3d.R.inc(12683);if ((((removed != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12684)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12685)==0&false))) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12686);removed[0] = null;
        }
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12687);return new ConverterSet(copy);
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the given converter removed. If the
     * converter was not in the set, the original set is returned.
     *
     * @param converter  converter to remove, must not be null
     * @param removed  if not null, element 0 is set to the removed converter
     * @throws NullPointerException if converter is null
     */
    ConverterSet remove(Converter converter, Converter[] removed) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12688);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12689);Converter[] converters = iConverters;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12690);int length = converters.length;

        __CLR4_4_19pr9prlc8azt3d.R.inc(12691);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12692)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12693)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12694);if ((((converter.equals(converters[i]))&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12695)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12696)==0&false))) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12697);return remove(i, removed);
            }
        }}

        // Not found.
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12698);if ((((removed != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12699)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12700)==0&false))) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12701);removed[0] = null;
        }
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12702);return this;
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the converter at the given index
     * removed.
     *
     * @param index index of converter to remove
     * @param removed if not null, element 0 is set to the removed converter
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    ConverterSet remove(final int index, Converter[] removed) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12703);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12704);Converter[] converters = iConverters;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12705);int length = converters.length;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12706);if ((((index >= length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12707)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12708)==0&false))) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12709);throw new IndexOutOfBoundsException();
        }

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12710);if ((((removed != null)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12711)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12712)==0&false))) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12713);removed[0] = converters[index];
        }

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12714);Converter[] copy = new Converter[length - 1];
                
        __CLR4_4_19pr9prlc8azt3d.R.inc(12715);int j = 0;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12716);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12717)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12718)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12719);if ((((i != index)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12720)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12721)==0&false))) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12722);copy[j++] = converters[i];
            }
        }}
        
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12723);return new ConverterSet(copy);
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    /**
     * Returns the closest matching converter for the given type, but not very
     * efficiently.
     */
    private static Converter selectSlow(ConverterSet set, Class<?> type) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12724);
        __CLR4_4_19pr9prlc8azt3d.R.inc(12725);Converter[] converters = set.iConverters;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12726);int length = converters.length;
        __CLR4_4_19pr9prlc8azt3d.R.inc(12727);Converter converter;

        __CLR4_4_19pr9prlc8azt3d.R.inc(12728);for (int i=length; (((--i>=0)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12729)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12730)==0&false)); ) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12731);converter = converters[i];
            __CLR4_4_19pr9prlc8azt3d.R.inc(12732);Class<?> supportedType = converter.getSupportedType();

            __CLR4_4_19pr9prlc8azt3d.R.inc(12733);if ((((supportedType == type)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12734)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12735)==0&false))) {{
                // Exact match.
                __CLR4_4_19pr9prlc8azt3d.R.inc(12736);return converter;
            }

            }__CLR4_4_19pr9prlc8azt3d.R.inc(12737);if ((((supportedType == null || (type != null && !supportedType.isAssignableFrom(type)))&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12738)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12739)==0&false))) {{
                // Eliminate the impossible.
                __CLR4_4_19pr9prlc8azt3d.R.inc(12740);set = set.remove(i, null);
                __CLR4_4_19pr9prlc8azt3d.R.inc(12741);converters = set.iConverters;
                __CLR4_4_19pr9prlc8azt3d.R.inc(12742);length = converters.length;
            }
        }}

        // Haven't found exact match, so check what remains in the set.

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12743);if ((((type == null || length == 0)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12744)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12745)==0&false))) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12746);return null;
        }
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12747);if ((((length == 1)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12748)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12749)==0&false))) {{
            // Found the one best match.
            __CLR4_4_19pr9prlc8azt3d.R.inc(12750);return converters[0];
        }

        // At this point, there exist multiple potential converters.

        // Eliminate supertypes.
        }__CLR4_4_19pr9prlc8azt3d.R.inc(12751);for (int i=length; (((--i>=0)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12752)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12753)==0&false)); ) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12754);converter = converters[i];
            __CLR4_4_19pr9prlc8azt3d.R.inc(12755);Class<?> supportedType = converter.getSupportedType();
            __CLR4_4_19pr9prlc8azt3d.R.inc(12756);for (int j=length; (((--j>=0)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12757)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12758)==0&false)); ) {{
                __CLR4_4_19pr9prlc8azt3d.R.inc(12759);if ((((j != i && converters[j].getSupportedType().isAssignableFrom(supportedType))&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12760)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12761)==0&false))) {{
                    // Eliminate supertype.
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12762);set = set.remove(j, null);
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12763);converters = set.iConverters;
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12764);length = converters.length;
                    __CLR4_4_19pr9prlc8azt3d.R.inc(12765);i = length - 1;
                }
            }}
        }}        
        
        // Check what remains in the set.

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12766);if ((((length == 1)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12767)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12768)==0&false))) {{
            // Found the one best match.
            __CLR4_4_19pr9prlc8azt3d.R.inc(12769);return converters[0];
        }

        // Class c implements a, b {}
        // Converters exist only for a and b. Which is better? Neither.

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12770);StringBuilder msg = new StringBuilder();
        __CLR4_4_19pr9prlc8azt3d.R.inc(12771);msg.append("Unable to find best converter for type \"");
        __CLR4_4_19pr9prlc8azt3d.R.inc(12772);msg.append(type.getName());
        __CLR4_4_19pr9prlc8azt3d.R.inc(12773);msg.append("\" from remaining set: ");
        __CLR4_4_19pr9prlc8azt3d.R.inc(12774);for (int i=0; (((i<length)&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12775)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12776)==0&false)); i++) {{
            __CLR4_4_19pr9prlc8azt3d.R.inc(12777);converter = converters[i];
            __CLR4_4_19pr9prlc8azt3d.R.inc(12778);Class<?> supportedType = converter.getSupportedType();

            __CLR4_4_19pr9prlc8azt3d.R.inc(12779);msg.append(converter.getClass().getName());
            __CLR4_4_19pr9prlc8azt3d.R.inc(12780);msg.append('[');
            __CLR4_4_19pr9prlc8azt3d.R.inc(12781);msg.append((((supportedType == null )&&(__CLR4_4_19pr9prlc8azt3d.R.iget(12782)!=0|true))||(__CLR4_4_19pr9prlc8azt3d.R.iget(12783)==0&false))? null : supportedType.getName());
            __CLR4_4_19pr9prlc8azt3d.R.inc(12784);msg.append("], ");
        }

        }__CLR4_4_19pr9prlc8azt3d.R.inc(12785);throw new IllegalStateException(msg.toString());
    }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}

    static class Entry {
        final Class<?> iType;
        final Converter iConverter;

        Entry(Class<?> type, Converter converter) {try{__CLR4_4_19pr9prlc8azt3d.R.inc(12786);
            __CLR4_4_19pr9prlc8azt3d.R.inc(12787);iType = type;
            __CLR4_4_19pr9prlc8azt3d.R.inc(12788);iConverter = converter;
        }finally{__CLR4_4_19pr9prlc8azt3d.R.flushNeeded();}}
    }

}
