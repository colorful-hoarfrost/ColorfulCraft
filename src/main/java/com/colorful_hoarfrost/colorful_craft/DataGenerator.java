package com.colorful_hoarfrost.colorful_craft;

import com.colorful_hoarfrost.colorful_craft.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModAdvancements::new);
        pack.addProvider(ModBlockTags::new);
        pack.addProvider(ModEnUsLanguages::new);
        pack.addProvider(ModLootTables::new);
        pack.addProvider(ModModels::new);
        pack.addProvider(ModRecipes::new);
        pack.addProvider(ModZhCnLanguages::new);
    }
}