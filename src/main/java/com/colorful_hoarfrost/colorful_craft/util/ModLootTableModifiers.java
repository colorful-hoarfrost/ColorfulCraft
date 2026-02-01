package com.colorful_hoarfrost.colorful_craft.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantedCountIncreaseLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier GLOW_SQUID_ID = Identifier.ofVanilla("entities/glow_squid");
    private static final Identifier WARDEN_ID = Identifier.ofVanilla("entities/warden");

    public static void initialize() {
        LootTableEvents.MODIFY.register(
                (key, builder, source, wrapperLookup) -> {
                    if (GLOW_SQUID_ID.equals(key.getValue())) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(Items.DIAMOND))
                                .conditionally(KilledByPlayerLootCondition.builder())
                                .apply(EnchantedCountIncreaseLootFunction.builder(
                                        wrapperLookup,
                                        UniformLootNumberProvider.create(0.0F, 0.2F)
                                ));
                        builder.pool(poolBuilder);
                    }
                    if (WARDEN_ID.equals(key.getValue())) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(Items.ECHO_SHARD))
                                .conditionally(KilledByPlayerLootCondition.builder())
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))
                                .apply(EnchantedCountIncreaseLootFunction.builder(
                                        wrapperLookup,
                                        UniformLootNumberProvider.create(0.0F, 1.0F)
                                ));
                        builder.pool(poolBuilder);
                    }
                }
        );
    }
}