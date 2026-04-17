package com.hyengra.mod.mixin.client;

import org.spongepowered.asm.mixin.Mixin;

// Mixin vazio — hook via WorldRenderEvents na Fase 2
@Mixin(targets = "net.minecraft.client.render.WorldRenderer")
public abstract class WorldRendererMixin {
}
