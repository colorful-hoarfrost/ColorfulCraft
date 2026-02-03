package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.ColorfulCraft;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.RecipeCraftedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancements extends FabricAdvancementProvider {
    public ModAdvancements(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull Consumer<AdvancementEntry> consumer) {
        final RegistryWrapper<Item> itemLookUp = wrapperLookup.getOrThrow(RegistryKeys.ITEM);
        AdvancementEntry root = Advancement.Builder.create()
                .display(
                        ModItems.GUIDE_BOOK,
                        Text.translatable("advancements.colorful_craft.root.title"),
                        Text.translatable("advancements.colorful_craft.root.description"),
                        Identifier.ofVanilla("block/quartz_block_bottom"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("hello_world", TickCriterion.Conditions.createTick())
                .build(consumer, ColorfulCraft.MOD_ID + "/root");
        AdvancementEntry refine = Advancement.Builder.create().parent(root)
                .display(
                        Blocks.CALCITE,
                        Text.translatable("advancements.colorful_craft.refine.title"),
                        Text.translatable("advancements.colorful_craft.refine.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("smelt_diorite", RecipeCraftedCriterion.Conditions.create(
                        RegistryKey.of(
                                RegistryKeys.RECIPE,
                                Identifier.of(ColorfulCraft.MOD_ID, "calcite")
                        )
                ))
                .criterion("smelt_andesite", RecipeCraftedCriterion.Conditions.create(
                        RegistryKey.of(
                                RegistryKeys.RECIPE,
                                Identifier.of(ColorfulCraft.MOD_ID, "tuff")
                        )
                ))
                .build(consumer, ColorfulCraft.MOD_ID + "/refine");
        AdvancementEntry graft = Advancement.Builder.create().parent(root)
                .display(
                        Blocks.LARGE_FERN,
                        Text.translatable("advancements.colorful_craft.graft.title"),
                        Text.translatable("advancements.colorful_craft.graft.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("craft_tall_grass", RecipeCraftedCriterion.Conditions.create(
                        RegistryKey.of(
                                RegistryKeys.RECIPE,
                                Identifier.of(ColorfulCraft.MOD_ID, "tall_grass")
                        )
                ))
                .criterion("craft_large_fern", RecipeCraftedCriterion.Conditions.create(
                        RegistryKey.of(
                                RegistryKeys.RECIPE,
                                Identifier.of(ColorfulCraft.MOD_ID, "large_fern")
                        )
                ))
                .build(consumer, ColorfulCraft.MOD_ID + "/graft");
        AdvancementEntry revive = Advancement.Builder.create().parent(root)
                .display(
                        Items.ENCHANTED_GOLDEN_APPLE,
                        Text.translatable("advancements.colorful_craft.revive.title"),
                        Text.translatable("advancements.colorful_craft.revive.description"),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("craft_enchanted_golden_apple", RecipeCraftedCriterion.Conditions.create(
                        RegistryKey.of(
                                RegistryKeys.RECIPE,
                                Identifier.of(ColorfulCraft.MOD_ID, "enchanted_golden_apple")
                        )
                ))
                .build(consumer, ColorfulCraft.MOD_ID + "/revive");
        AdvancementEntry invincible = Advancement.Builder.create().parent(revive)
                .display(
                        ModItems.DIAMOND_APPLE,
                        Text.translatable("advancements.colorful_craft.invincible.title"),
                        Text.translatable("advancements.colorful_craft.invincible.description"),
                        null,
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("eat_diamond_apple", ConsumeItemCriterion.Conditions.item(itemLookUp, ModItems.DIAMOND_APPLE))
                .rewards(AdvancementRewards.Builder.experience(100))
                .build(consumer, ColorfulCraft.MOD_ID + "/invincible");
    }
}