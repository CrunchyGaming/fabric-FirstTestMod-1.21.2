package net.crunchydev.firsttestmod.datagen;

import net.crunchydev.firsttestmod.block.ModBlocks;
import net.crunchydev.firsttestmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> SMUGLORP_DUST_SMELTABLES = List.of(ModItems.SMUGLORP_DUST, ModBlocks.SMUGLORP_ORE,
                ModBlocks.SMUGLORP_DEEPSLATE_ORE);

        offerSmelting(recipeExporter, SMUGLORP_DUST_SMELTABLES, RecipeCategory.MISC, ModItems.SMUGLORP_INGOT, 0.25f, 200, "smuglorp_ingot");
        offerBlasting(recipeExporter, SMUGLORP_DUST_SMELTABLES, RecipeCategory.MISC, ModItems.SMUGLORP_INGOT, 0.25f, 100, "smuglorp_ingot");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SMUGLORP_INGOT, RecipeCategory.DECORATIONS, ModBlocks.SMUGLORP_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MEATBALL_SPAGHETTI)
                .pattern("W")
                .pattern("M")
                .pattern("B")
                .input('W', Items.WHEAT)
                .input('M', Items.COOKED_BEEF)
                .input('B', Items.BOWL)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LORP_FUEL)
                .pattern("#CR")
                .input('#', ModItems.SMUGLORP_DUST)
                .input('C', Items.COAL)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.SMUGLORP_DUST), conditionsFromItem(ModItems.SMUGLORP_DUST))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIC_BLOCK)
                .pattern("###")
                .pattern("#L#")
                .pattern("###")
                .input('#', ModItems.SMUGLORP_INGOT)
                .input('L', ModItems.LORP_FUEL)
                .criterion(hasItem(ModItems.LORP_FUEL), conditionsFromItem(ModItems.LORP_FUEL))
                .offerTo(recipeExporter);
    }
}
