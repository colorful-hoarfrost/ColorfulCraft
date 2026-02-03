package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTables extends FabricBlockLootTableProvider {
    public ModLootTables(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CALCITE_SLAB);
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB);
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.STONE_WALL);
    }
}