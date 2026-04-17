package com.hyengra.mod.render;

import com.hyengra.mod.HyengraMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;

/**
 * ChunkRenderer — ponto de extensão do motor gráfico Hyengra.
 *
 * FASE 1 (atual): stub que confirma que o hook está activo.
 * FASE 2: interceptar draw calls de chunks via WorldRenderContext.
 * FASE 3: substituir buffers por pipeline customizado.
 */
@Environment(EnvType.CLIENT)
public class ChunkRenderer {

    private static boolean initialized = false;

    public static void init() {
        if (initialized) return;
        initialized = true;
        HyengraMod.LOGGER.info("[ChunkRenderer] Renderer Hyengra activo");
    }

    /**
     * Chamado por WorldRendererMixin antes de cada frame de mundo.
     * tickCounter substitui o float tickDelta removido em 1.21.1.
     */
    public static void onBeforeWorldRender(Camera camera, RenderTickCounter tickCounter) {
        // Fase 1: apenas log de confirmação (remove depois)
        // HyengraMod.LOGGER.info("[ChunkRenderer] frame tick={}", tickCounter.getTickDelta(false));
    }

    /**
     * Chamado após o render vanilla de opaco/translúcido terminar.
     */
    public static void onAfterWorldRender() {
        // Reservado para Fase 2
    }
}
