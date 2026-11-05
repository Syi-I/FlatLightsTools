package com.uberhelixx.flatlightstools.datagen;

import com.uberhelixx.flatlightstools.FlatLightsTools;
import com.uberhelixx.flatlightstools.common.item.ModItems;
import com.uberhelixx.flatlightstools.common.loot.JogoatAdditionModifier;
import net.minecraft.advancements.critereon.BlockPredicate;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, FlatLightsTools.MODID);
    }
    
    @Override
    protected void start() {
        add("jogoat_fire", new JogoatAdditionModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FIRE).build()
        }, ModItems.JOGOAT.get()));
        
        BlockPredicate blockPredicate = BlockPredicate.Builder.block()
                .of(Tags.Blocks.CHESTS_WOODEN)
                .of(Tags.Blocks.CHESTS_TRAPPED)
                .build();
        
        LocationPredicate.Builder locationPredicate = LocationPredicate.Builder.location().setBlock(blockPredicate);
        
        /*add("curio_structure_loot", new CurioStructureAdditionModifier(new LootItemCondition[]{
                ChestCheckCondition.checkLocation(locationPredicate).build()
        }, 0.85, 0.5, 0.3, 0.0, 0));*/
    }
}
