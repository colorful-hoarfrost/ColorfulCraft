package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipe extends FabricRecipeProvider {
    public ModRecipe(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeGenerator getRecipeGenerator(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull RecipeExporter exporter) {
        return new RecipeGenerator(wrapperLookup, exporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.DECORATIONS, Blocks.TALL_GRASS)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Blocks.SHORT_GRASS)
                        .criterion(hasItem(Blocks.SHORT_GRASS), conditionsFromItem(Blocks.SHORT_GRASS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, Blocks.LARGE_FERN)
                        .pattern("#")
                        .pattern("#")
                        .input('#', Blocks.FERN)
                        .criterion(hasItem(Blocks.FERN), conditionsFromItem(Blocks.FERN))
                        .offerTo(exporter);
                createShaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                        .pattern("###")
                        .pattern("#$#")
                        .pattern("###")
                        .input('#', Blocks.GOLD_BLOCK)
                        .input('$', Items.APPLE)
                        .criterion(hasItem(Blocks.GOLD_BLOCK), conditionsFromItem(Blocks.GOLD_BLOCK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.FOOD, ModItems.DIAMOND_APPLE)
                        .pattern("###")
                        .pattern("#$#")
                        .pattern("###")
                        .input('#', Items.DIAMOND)
                        .input('$', Items.GOLDEN_APPLE)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.GOLDEN_APPLE), conditionsFromItem(Items.GOLDEN_APPLE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion("has_calcite", conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Ingredient.ofItem(Blocks.SMOOTH_BASALT))
                        .criterion("has_smooth_basalt", conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion("has_calcite", conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItem(Blocks.SMOOTH_BASALT))
                        .criterion("has_smooth_basalt", conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItem(Blocks.DIORITE),
                        RecipeCategory.BUILDING_BLOCKS,
                        Blocks.CALCITE,
                        0.1F,
                        200
                ).criterion("has_diorite", conditionsFromItem(Blocks.DIORITE)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItem(Blocks.ANDESITE),
                        RecipeCategory.BUILDING_BLOCKS,
                        Blocks.TUFF,
                        0.1F,
                        200
                ).criterion("has_andesite", conditionsFromItem(Blocks.ANDESITE)).offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipe";
    }
}