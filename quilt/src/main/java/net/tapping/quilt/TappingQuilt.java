package net.tapping.quilt;

import net.tapping.fabriclike.TappingFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TappingQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        TappingFabricLike.init();
    }
}
