package com.colorful_hoarfrost.colorful_craft.advancement;

import com.colorful_hoarfrost.colorful_craft.ColorfulCraft;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.AbstractCriterion;
import net.minecraft.advancement.criterion.Criterion;
import net.minecraft.advancement.criterion.RecipeCraftedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancements implements Consumer<Consumer<AdvancementEntry>> {
    @Override
    public void accept(Consumer<AdvancementEntry> advancementEntryConsumer) {
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
                .build(advancementEntryConsumer, ColorfulCraft.MOD_ID + "/root");
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
                .build(advancementEntryConsumer, ColorfulCraft.MOD_ID + "/refine");
    }
}