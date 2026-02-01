package com.colorful_hoarfrost.colorful_craft;

import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import com.colorful_hoarfrost.colorful_craft.item.ModItemGroups;
import com.colorful_hoarfrost.colorful_craft.item.ModItems;
import com.colorful_hoarfrost.colorful_craft.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

public class ColorfulCraft implements ModInitializer {
    public static final String MOD_ID = "colorful_craft";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItemGroups.initialize();
        ModItems.initialize();
        ModLootTableModifiers.initialize();
    }
}