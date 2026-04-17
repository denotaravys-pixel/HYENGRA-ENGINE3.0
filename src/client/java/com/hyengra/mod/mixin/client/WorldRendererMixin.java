package com.hyengra.mod.mixin.client;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    // Hook movido para WorldRenderEvents em HyengaModClient
}
