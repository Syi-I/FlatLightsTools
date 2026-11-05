package com.uberhelixx.flatlightstools.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.uberhelixx.flatlightstools.FlatLightsTools;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.settings.KeyConflictContext;

@OnlyIn(Dist.CLIENT)
public class ModKeybinds {
    public static final ModKeybinds INSTANCE = new ModKeybinds();
    
    private ModKeybinds() {}
    
    private static final String CATEGORY = "key.categories." + FlatLightsTools.MODID;
    
    public final KeyMapping CURIO_TOGGLE = new KeyMapping(
            "key." + FlatLightsTools.MODID + ".curio_toggle",
            KeyConflictContext.UNIVERSAL,
            InputConstants.getKey(InputConstants.KEY_V, -1),
            CATEGORY
    );
    
    public final KeyMapping MODE_CYCLE = new KeyMapping(
            "key." + FlatLightsTools.MODID + ".tool_mode_cycle",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_G, -1),
            CATEGORY
    );
}
