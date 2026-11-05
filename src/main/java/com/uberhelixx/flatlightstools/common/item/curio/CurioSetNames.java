package com.uberhelixx.flatlightstools.common.item.curio;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class CurioSetNames {
    //used for storing translation key names of curio sets to be used everywhere else
    public static final String DRAGON = "flatlightstools.curioset.dragon";
    public static final String DRAGON_EFFECT = "flatlightstools.curioeffect.dragon";
    public static final String DRAGON_DESC = "flatlightstools.curiodesc.dragon";
    
    public static final String SHORE = "flatlightstools.curioset.shore";
    public static final String SHORE_EFFECT = "flatlightstools.curioeffect.shore";
    public static final String SHORE_DESC = "flatlightstools.curiodesc.shore";
    
    public static final String SUN = "flatlightstools.curioset.sun";
    public static final String SUN_EFFECT = "flatlightstools.curioeffect.sun";
    public static final String SUN_DESC = "flatlightstools.curiodesc.sun";
    
    public static Map<String, String> setPairs = new HashMap<>();
    public static Map<String, String> descPairs = new HashMap<>();
    
    /**
     * Pair up the corresponding {@code Set Name} and {@code Set Effect} translation keys
     */
    public static void pairUp() {
        setPairs.put(DRAGON, DRAGON_EFFECT);
        setPairs.put(SHORE, SHORE_EFFECT);
        setPairs.put(SUN, SUN_EFFECT);
        
        descPairs.put(DRAGON, DRAGON_DESC);
        descPairs.put(SHORE, SHORE_DESC);
        descPairs.put(SUN, SUN_DESC);
    }
    
    /**
     * Gets the {@code Set Name} of the input curio
     * @param curio The curio that we are getting the set name of
     * @return The set name translation key of the curio as a {@link String}, or {@code null} if none
     */
    public static String getName(ItemStack curio) {
        CompoundTag tag = curio.getTag();
        assert tag != null;
        if(!tag.isEmpty()) {
            if(tag.contains(CurioUtils.SET)) {
                return tag.getString(CurioUtils.SET);
            }
        }
        return null;
    }
    
    /**
     * Gets the {@code Set Effect} which matches the input {@code Set Name} of the curio
     * @param setIn The name of the curio set that we are getting the set effect for
     * @return The translation key of the corresponding set effect
     */
    public static String getEffect(String setIn) {
        return setPairs.get(setIn);
    }
    
    /**
     * Gets the {@code Set Effect Description} which matches the input {@code Set Name} of the curio
     * @param setIn The name of the curio set that we are getting the set effect description for
     * @return The translation key of the corresponding set effect description
     */
    public static String getDescription(String setIn) {
        return descPairs.get(setIn);
    }
}
