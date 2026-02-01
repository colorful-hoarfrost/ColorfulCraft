package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import org.jetbrains.annotations.NotNull;

public class ModModel extends FabricModelProvider {
    public ModModel(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE)
                .slab(ModBlocks.CALCITE_SLAB)
                .stairs(ModBlocks.CALCITE_STAIRS)
                .wall(ModBlocks.CALCITE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE).wall(ModBlocks.POLISHED_ANDESITE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE).wall(ModBlocks.POLISHED_DIORITE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE).wall(ModBlocks.POLISHED_GRANITE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT)
                .slab(ModBlocks.SMOOTH_BASALT_SLAB)
                .stairs(ModBlocks.SMOOTH_BASALT_STAIRS)
                .wall(ModBlocks.SMOOTH_BASALT_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE).wall(ModBlocks.STONE_WALL);
    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUIDE_BOOK, Models.GENERATED);
    }
}