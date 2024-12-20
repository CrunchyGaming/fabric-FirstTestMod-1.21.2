package net.crunchydev.firsttestmod.item;

import net.crunchydev.firsttestmod.FirstTestMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ITEM_NAME = registerItem("item_name", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstTestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstTestMod.LOGGER.info("Registering Mod Items for " + FirstTestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ITEM_NAME);
        });
    }

}
