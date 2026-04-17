package com.hyengra.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HyengaModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HyengraMod.LOGGER.info("[HyengraEngine] Client inicializado");
    }
}
