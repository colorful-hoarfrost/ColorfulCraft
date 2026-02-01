package com.colorful_hoarfrost.colorful_craft;

import com.colorful_hoarfrost.colorful_craft.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModAdvancement::new);
        pack.addProvider(ModBlockTag::new);
        pack.addProvider(ModEnUsLanguage::new);
        pack.addProvider(ModLootTable::new);
        pack.addProvider(ModModel::new);
        pack.addProvider(ModRecipe::new);
        pack.addProvider(ModZhCnLanguage::new);
    }
}