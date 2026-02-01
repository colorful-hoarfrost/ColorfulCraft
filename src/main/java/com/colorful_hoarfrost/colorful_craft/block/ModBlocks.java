package com.colorful_hoarfrost.colorful_craft.block;

import com.colorful_hoarfrost.colorful_craft.ColorfulCraft;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block CALCITE_STAIRS = registerStairsBlock(
            "calcite_stairs",
            Blocks.CALCITE
    );
    public static final Block CALCITE_SLAB = register(
            "calcite_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CALCITE).solid()
    );
    public static final Block CALCITE_WALL = register(
            "calcite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CALCITE).solid()
    );
    public static final Block POLISHED_ANDESITE_WALL = register(
            "polished_andesite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).solid()
    );
    public static final Block POLISHED_DIORITE_WALL = register(
            "polished_diorite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).solid()
    );
    public static final Block POLISHED_GRANITE_WALL = register(
            "polished_granite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).solid()
    );
    public static final Block STONE_WALL = register(
            "stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE).solid()
    );
    public static final Block SMOOTH_BASALT_STAIRS = registerStairsBlock(
            "smooth_basalt_stairs",
            Blocks.SMOOTH_BASALT
    );
    public static final Block SMOOTH_BASALT_SLAB = register(
            "smooth_basalt_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT).solid()
    );
    public static final Block SMOOTH_BASALT_WALL = register(
            "smooth_basalt_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT).solid()
    );

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = factory.apply(settings.registryKey(blockKey));
        RegistryKey<Item> itemKey = keyOfItem(name);
        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
        Registry.register(Registries.ITEM, itemKey, blockItem);
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static Block registerWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        RegistryKey<Block> key = keyOfBlock(name);
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ColorfulCraft.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ColorfulCraft.MOD_ID, name));
    }

    private static Block registerStairsBlock(String id, Block base) {
        return register(id, settings -> new StairsBlock(base.getDefaultState(), settings), AbstractBlock.Settings.copy(base));
    }

    public static void initialize() {
    }
}