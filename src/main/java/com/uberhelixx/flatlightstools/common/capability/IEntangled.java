package com.uberhelixx.flatlightstools.common.capability;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;

public interface IEntangled extends INBTSerializable<CompoundTag> {
    public static final String ENTANGLED_KEY = "flatlightstools.entangled";
    
    default boolean isEntangled() {
        return false;
    }
    
    default void readEntangledState(CompoundTag nbt) {
    }
    
    default void setEntangledState(boolean state) {
    }
}
