package com.uberhelixx.flatlightstools.startup;

import com.uberhelixx.flatlightstools.FlatLightsTools;
import com.uberhelixx.flatlightstools.common.item.ModItems;
import com.uberhelixx.flatlightstools.common.item.curio.ModCurios;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlatLightsTools.MODID);
    
    public static final RegistryObject<CreativeModeTab> TAB_FLATLIGHTS = CREATIVE_MODE_TAB.register(FlatLightsTools.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.flatlightstools"))
            .icon(() -> new ItemStack(ModItems.PRISMATIC_INGOT.get()))
            .displayItems((itemDisplayParameters, output) -> {
                ModItems.BLOCK_ITEMS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                ModItems.NOGEN_BLOCK_ITEMS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                ModItems.ITEMS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                ModItems.TOGGLE_ITEMS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                ModItems.MODEL_ITEMS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                ModCurios.CURIOS.getEntries().forEach(e -> {
                    Item item = e.get();
                    output.accept(item);
                });
                
            })
            .build()
    );
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
