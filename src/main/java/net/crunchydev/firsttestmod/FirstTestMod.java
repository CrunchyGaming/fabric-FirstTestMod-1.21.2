package net.crunchydev.firsttestmod;

import net.crunchydev.firsttestmod.block.ModBlocks;
import net.crunchydev.firsttestmod.item.ModItemGroups;
import net.crunchydev.firsttestmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstTestMod implements ModInitializer {

	public static final String MOD_ID = "firsttestmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.LORP_FUEL, 4000);
	}

}