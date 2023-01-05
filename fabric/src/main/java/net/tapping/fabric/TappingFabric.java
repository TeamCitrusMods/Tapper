package net.tapping.fabric;

import net.tapping.fabriclike.TappingFabricLike;
import net.fabricmc.api.ModInitializer;

public class TappingFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TappingFabricLike.init();
    }
}
