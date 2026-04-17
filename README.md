# Hyengra Engine

Motor de render customizado para Minecraft 1.21.1 via Fabric.

## Stack

| Componente | Versão |
|---|---|
| Minecraft | 1.21.1 |
| Fabric Loader | 0.16.9 |
| Fabric API | 0.110.0+1.21.1 |
| Fabric Loom | 1.7.x |
| Java | 21 |
| Gradle | 8.8 |

## Build

```bash
./gradlew build
```

JAR gerado em `build/libs/hyengra-engine-1.0.0.jar`.

## Estrutura

```
src/main/java/com/hyengra/mod/
├── HyengraMod.java          ← entrypoint comum
├── HyengaModClient.java     ← entrypoint cliente
├── render/
│   └── ChunkRenderer.java   ← motor gráfico (fase 1: stub)
└── mixin/
    └── client/
        └── WorldRendererMixin.java  ← hook no WorldRenderer
```

## Roadmap

- [x] Fase 1 — Build limpo + hook confirmado
- [ ] Fase 2 — Cubo customizado na tela via BufferBuilder
- [ ] Fase 3 — Pipeline de chunks próprio
```
