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
 */
@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {

    @Inject(
        method = "render(Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/util/math/Matrix4f;Lnet/minecraft/client/util/math/Matrix4f;)V",
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
