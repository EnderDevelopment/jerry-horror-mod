package com.joshuasavoy804.jerryhorrormod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JerrySounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "jerryhorrormod");
    public static final RegistryObject<SoundEvent> JERRY_AMBIENT = SOUND_EVENTS.register("jerry_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jerryhorrormod", "jerry_ambient")));
    public static final RegistryObject<SoundEvent> JERRY_HURT = SOUND_EVENTS.register("jerry_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jerryhorrormod", "jerry_hurt")));
    public static final RegistryObject<SoundEvent> JERRY_DEATH = SOUND_EVENTS.register("jerry_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jerryhorrormod", "jerry_death")));

    public static void register() {
        SOUND_EVENTS.register();
    }
}