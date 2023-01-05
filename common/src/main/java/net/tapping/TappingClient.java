package net.tapping;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.tapping.registry.ModBlocks;
import net.tapping.util.SignUtil;

public class TappingClient {
    public static void init() {
        BlockEntityRenderers.register(ModBlocks.MAPLE_SIGN.get(), SignRenderer::new);
        SignUtil.addWoodType(ModBlocks.MAPLE);
    }
}
