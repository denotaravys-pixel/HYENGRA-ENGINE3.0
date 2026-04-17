package com.hyengra.mod;

import com.hyengra.mod.render.ChunkRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;

public class HyengaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkRenderer.init();

        WorldRenderEvents.BEFORE_CHUNKS.register(context -> {
            ChunkRenderer.onBeforeWorldRender(
                context.camera(),
                context.tickCounter()
            );
        });
    }
}
