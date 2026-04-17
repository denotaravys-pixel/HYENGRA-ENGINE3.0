package com.hyengra.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HyengraMod implements ModInitializer {

    public static final String MOD_ID = "hyengra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[HyengraEngine] Inicializado (lado servidor/comum)");
    }
}
