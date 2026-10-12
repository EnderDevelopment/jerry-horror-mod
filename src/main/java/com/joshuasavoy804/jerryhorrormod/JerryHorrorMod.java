package com.joshuasavoy804.jerryhorrormod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JerryHorrorMod implements ModInitializer {
    public static final String MOD_ID = "jerryhorrormod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Jerry Horror Mod");
        JerryEntity.register();
        JerrySounds.register();
    }
}