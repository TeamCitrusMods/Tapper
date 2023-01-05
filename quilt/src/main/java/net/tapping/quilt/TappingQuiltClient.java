package net.tapping.quilt;

import net.tapping.fabriclike.TappingFabricLikeClient;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class TappingQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        TappingFabricLikeClient.init();
    }
}
