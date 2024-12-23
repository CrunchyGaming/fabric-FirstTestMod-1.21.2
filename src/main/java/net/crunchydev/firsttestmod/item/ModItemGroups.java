package net.crunchydev.firsttestmod.item;

import net.crunchydev.firsttestmod.FirstTestMod;
import net.crunchydev.firsttestmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SMUGLORP_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstTestMod.MOD_ID, "smuglorp_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SMUGLORP_INGOT))
                    .displayName(Text.translatable("itemgroup.firsttestmod.smuglorp_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SMUGLORP_DUST);
                        entries.add(ModItems.SMUGLORP_INGOT);

                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.MEATBALL_SPAGHETTI);
                        entries.add(ModItems.LORP_FUEL);
                    }).build());

    public static final ItemGroup SMUGLORP_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FirstTestMod.MOD_ID, "smuglorp_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SMUGLORP_BLOCK))
                    .displayName(Text.translatable("itemgroup.firsttestmod.smuglorp_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SMUGLORP_DUST_BLOCK);
                        entries.add(ModBlocks.SMUGLORP_BLOCK);

                        entries.add(ModBlocks.SMUGLORP_ORE);
                        entries.add(ModBlocks.SMUGLORP_DEEPSLATE_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());



    public static void registerItemGroups() {
        FirstTestMod.LOGGER.info("Registering Item Groups for " + FirstTestMod.MOD_ID);
    }

}
