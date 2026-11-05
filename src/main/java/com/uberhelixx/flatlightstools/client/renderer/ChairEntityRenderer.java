package com.uberhelixx.flatlightstools.client.renderer;

import com.uberhelixx.flatlightstools.common.entity.ChairEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ChairEntityRenderer extends EntityRenderer<ChairEntity> {
    public ChairEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }
    
    @Override
    public ResourceLocation getTextureLocation(ChairEntity chairEntity) {
        return null;
    }
}
