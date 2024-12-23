package net.crunchydev.firsttestmod.item;

import net.crunchydev.firsttestmod.FirstTestMod;
import net.crunchydev.firsttestmod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SMUGLORP_INGOT = registerItem("smuglorp_ingot", new Item(new Item.Settings()));
    public static final Item SMUGLORP_DUST = registerItem("smuglorp_dust", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item MEATBALL_SPAGHETTI = registerItem("meatball_spaghetti", new Item(new Item.Settings().food(ModFoodComponents.MEATBALL_SPAGHETTI)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstTestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstTestMod.LOGGER.info("Registering Mod Items for " + FirstTestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SMUGLORP_INGOT);
            fabricItemGroupEntries.add(SMUGLORP_DUST);
        });
    }

}
