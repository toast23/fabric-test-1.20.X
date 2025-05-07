package net.tony.testmod.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.tony.testmod.TestMod;

public class ModSounds {
    public static final SoundEvent CAT_USED = registerSoundEvent("cat_used");




    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TestMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TestMod.LOGGER.info("Registering sounds for " + TestMod.MOD_ID);
    }
}
