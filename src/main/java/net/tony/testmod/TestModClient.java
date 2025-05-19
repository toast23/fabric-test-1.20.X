package net.tony.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tony.testmod.entity.ModEntities;
import net.tony.testmod.entity.client.*;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CAR, CarModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CAR, CarRenderer::new);

    }
}
