package net.tapping.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.tapping.fabriclike.TappingFabricLikeClient;

@Environment(EnvType.CLIENT)
public class TappingFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TappingFabricLikeClient.init();
    }
}
