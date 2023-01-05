package net.tapping.fabriclike;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.tapping.TappingClient;
import net.tapping.registry.ModBlocks;

public class TappingFabricLikeClient {
    public static void init() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
        TappingClient.init();
    }
}
