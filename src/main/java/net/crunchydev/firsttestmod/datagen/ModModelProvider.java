package net.crunchydev.firsttestmod.datagen;

import net.crunchydev.firsttestmod.block.ModBlocks;
import net.crunchydev.firsttestmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMUGLORP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMUGLORP_DUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMUGLORP_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMUGLORP_DEEPSLATE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SMUGLORP_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMUGLORP_DUST, Models.GENERATED);

        itemModelGenerator.register(ModItems.MEATBALL_SPAGHETTI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LORP_FUEL, Models.GENERATED);
    }
}
