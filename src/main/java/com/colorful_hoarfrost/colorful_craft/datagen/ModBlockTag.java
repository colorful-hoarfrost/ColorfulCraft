package com.colorful_hoarfrost.colorful_craft.datagen;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTag extends FabricTagProvider.BlockTagProvider {
    public ModBlockTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.@NotNull WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.WALLS).add(
                ModBlocks.CALCITE_WALL,
                ModBlocks.POLISHED_ANDESITE_WALL,
                ModBlocks.POLISHED_DIORITE_WALL,
                ModBlocks.POLISHED_GRANITE_WALL,
                ModBlocks.SMOOTH_BASALT_WALL,
                ModBlocks.STONE_WALL

        );
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(
                ModBlocks.CALCITE_SLAB,
                ModBlocks.CALCITE_STAIRS,
                ModBlocks.CALCITE_WALL,
                ModBlocks.POLISHED_ANDESITE_WALL,
                ModBlocks.POLISHED_DIORITE_WALL,
                ModBlocks.POLISHED_GRANITE_WALL,
                ModBlocks.SMOOTH_BASALT_SLAB,
                ModBlocks.SMOOTH_BASALT_STAIRS,
                ModBlocks.SMOOTH_BASALT_WALL,
                ModBlocks.STONE_WALL
        );
        valueLookupBuilder(BlockTags.SLABS).add(
                ModBlocks.CALCITE_SLAB,
                ModBlocks.SMOOTH_BASALT_SLAB
        );
        valueLookupBuilder(BlockTags.STAIRS).add(
                ModBlocks.CALCITE_STAIRS,
                ModBlocks.CALCITE_STAIRS
        );
    }
}