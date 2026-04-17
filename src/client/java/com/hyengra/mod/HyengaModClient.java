package com.hyengra.mod;

import com.hyengra.mod.render.ChunkRenderer;
import net.fabricmc.api.ClientModInitializer;

public class HyengaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkRenderer.init();
    }
}
