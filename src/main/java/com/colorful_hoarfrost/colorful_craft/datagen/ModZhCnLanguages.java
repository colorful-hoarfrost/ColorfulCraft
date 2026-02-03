package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModZhCnLanguages extends FabricLanguageProvider {
    public ModZhCnLanguages(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.CALCITE_SLAB, "方解石台阶");
        translationBuilder.add(ModBlocks.CALCITE_STAIRS, "方解石楼梯");
        translationBuilder.add(ModBlocks.CALCITE_WALL, "方解石墙");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_WALL, "磨制安山岩墙");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_WALL, "磨制闪长岩墙");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_WALL, "磨制花岗岩墙");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_SLAB, "平滑玄武岩台阶");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_STAIRS, "平滑玄武岩楼梯");
        translationBuilder.add(ModBlocks.SMOOTH_BASALT_WALL, "平滑玄武岩墙");
        translationBuilder.add(ModBlocks.STONE_WALL, "石墙");

        translationBuilder.add(ModItems.DIAMOND_APPLE, "钻石苹果");

        translationBuilder.add("advancements.colorful_craft.root.title", "幻彩工艺");
        translationBuilder.add("advancements.colorful_craft.root.description", "你好，世界");
        translationBuilder.add("advancements.colorful_craft.graft.title", "嫁接");
        translationBuilder.add(
                "advancements.colorful_craft.graft.description",
                "合成高草丛和大型蕨"
        );
        translationBuilder.add("advancements.colorful_craft.refine.title", "淬炼");
        translationBuilder.add(
                "advancements.colorful_craft.refine.description",
                "烧炼闪长岩和安山岩"
        );
        translationBuilder.add("advancements.colorful_craft.revive.title", "复活");
        translationBuilder.add(
                "advancements.colorful_craft.revive.description",
                "合成附魔金苹果"
        );
        translationBuilder.add("advancements.colorful_craft.invincible.title", "勇往直前");
        translationBuilder.add(
                "advancements.colorful_craft.invincible.description",
                "吃下钻石苹果"
        );

        translationBuilder.add("itemGroup.aBuildingBlocks", "幻彩建筑方块");
        translationBuilder.add("itemGroup.bColoredBlocks", "幻彩染色方块");
        translationBuilder.add("itemGroup.cNatural", "幻彩自然方块");
        translationBuilder.add("itemGroup.dFunctional", "幻彩功能方块");
        translationBuilder.add("itemGroup.eRedstone", "幻彩红石方块");
        translationBuilder.add("itemGroup.fTools", "幻彩工具与实用物品");
        translationBuilder.add("itemGroup.gCombat", "幻彩战斗用品");
        translationBuilder.add("itemGroup.hFoodAndDrink", "幻彩食物与饮品");
        translationBuilder.add("itemGroup.iIngredients", "幻彩原材料");
        translationBuilder.add("itemGroup.jSpawnEggs", "幻彩刷怪蛋");
    }
}