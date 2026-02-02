package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModEnUsLanguage extends FabricLanguageProvider {
    public ModEnUsLanguage(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.CALCITE_SLAB, "Calcite Slab");
        translationBuilder.add(ModBlocks.CALCITE_STAIRS, "Calcite Stairs");
        translationBuilder.add(ModBlocks.CALCITE_WALL, "Calcite Wall");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_WALL, "Polished Andesite Wall");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_WALL, "Polished Diorite Wall");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_WALL, "Polished Granite Wall");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_SLAB, "Smooth Basalt Slab");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_STAIRS, "Smooth Basalt Stairs");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_WALL, "Smooth Basalt Wall");
        translationBuilder.add(ModBlocks.STONE_WALL, "Stone Wall");

        translationBuilder.add(ModItems.DIAMOND_APPLE, "Diamond Apple");

        translationBuilder.add("advancements.colorful_craft.root.title", "ColorfulCraft");
        translationBuilder.add("advancements.colorful_craft.root.description", "Hello World");
        translationBuilder.add("advancements.colorful_craft.graft.title", "Graft");
        translationBuilder.add(
                "advancements.colorful_craft.graft.description",
                "Craft Tall Grass and Large Fern"
        );
        translationBuilder.add("advancements.colorful_craft.refine.title", "Refine");
        translationBuilder.add(
                "advancements.colorful_craft.refine.description",
                "Smelt Diorite and Andesite"
        );
        translationBuilder.add("advancements.colorful_craft.revive.title", "Revive");
        translationBuilder.add(
                "advancements.colorful_craft.revive.description",
                "Craft an Enchanted Golden Apple"
        );
        translationBuilder.add("advancements.colorful_craft.invincible.title", "Invincible");
        translationBuilder.add(
                "advancements.colorful_craft.invincible.description",
                "Eat a Diamond Apple"
        );

        translationBuilder.add("itemGroup.aBuildingBlocks", "Colorful Building Blocks");
        translationBuilder.add("itemGroup.bColoredBlocks", "Colorful Colored Blocks");
        translationBuilder.add("itemGroup.cNatural", "Colorful Natural Blocks");
        translationBuilder.add("itemGroup.dFunctional", "Colorful Functional Blocks");
        translationBuilder.add("itemGroup.eRedstone", "Colorful Redstone Blocks");
        translationBuilder.add("itemGroup.fTools", "Colorful Tools & Utilities");
        translationBuilder.add("itemGroup.gCombat", "Colorful Combat");
        translationBuilder.add("itemGroup.hFoodAndDrink", "Colorful Food & Drinks");
        translationBuilder.add("itemGroup.iIngredients", "Colorful Ingredients");
        translationBuilder.add("itemGroup.jSpawnEggs", "Colorful Spawn Eggs");
    }
}