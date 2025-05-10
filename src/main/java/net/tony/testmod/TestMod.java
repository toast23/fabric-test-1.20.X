package net.tony.testmod;

import net.fabricmc.api.ModInitializer;

import net.tony.testmod.block.ModBlocks;
import net.tony.testmod.item.ModItemGroups;
import net.tony.testmod.item.ModItems;
import net.tony.testmod.sounds.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModBlocks.registerModBlocks();
	}
}