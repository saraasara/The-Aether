package com.aetherteam.aether;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegistryObject;

public class AetherGameEvents {
    public static final DeferredRegister<GameEvent> GAME_EVENTS = DeferredRegister.create(Registries.GAME_EVENT, Aether.MODID);

    public static final RegistryObject<GameEvent> ICESTONE_FREEZABLE_UPDATE = GAME_EVENTS.register("icestone_freezable_update", () -> new GameEvent("icestone_freezable_update", 4));
}
