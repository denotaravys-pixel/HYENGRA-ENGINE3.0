package com.hyengra.mod.mixin.client;

import com.hyengra.mod.render.ChunkRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Injeta nos pontos de render do WorldRenderer para 1.21.1.
 *
 * ATENÇÃO: Em 1.21.1 o método render() tem assinatura nova.
 * O @At("HEAD") injeta ANTES de qualquer lógica vanilla — seguro.
 * Não usar RETURN aqui sem verificar RenderPhase — risco de crash.
 */
@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {

    /**
     * Hook no início do frame de render do mundo.
     * Assinatura 1.21.1: render(RenderTickCounter, boolean, Camera, GameRenderer, LightmapTextureManager, Matrix4f, Matrix4f)
     */
    @Inject(
        method = "render",
        at = @At("HEAD")
    )
    private void hyengra$onRenderHead(
            RenderTickCounter tickCounter,
            boolean bl,
            Camera camera,
            CallbackInfo ci
    ) {
        ChunkRenderer.onBeforeWorldRender(camera, tickCounter);
    }
}
