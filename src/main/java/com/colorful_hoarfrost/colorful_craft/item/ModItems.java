package com.colorful_hoarfrost.colorful_craft.item;

import com.colorful_hoarfrost.colorful_craft.ColorfulCraft;
import com.colorful_hoarfrost.colorful_craft.component.type.ModConsumableComponents;
import com.colorful_hoarfrost.colorful_craft.component.type.ModFoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ModItems {
    public static final Item DIAMOND_APPLE = register(
            "diamond_apple",
            Item::new,
            new Item.Settings().rarity(Rarity.RARE).food(
                    ModFoodComponents.DIAMOND_APPLE,
                    ModConsumableComponents.DIAMOND_APPLE
            )
    );
    public static final Item GUIDE_BOOK = register("guide_book", Item::new, new Item.Settings());

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ColorfulCraft.MOD_ID, name));
        Item item = factory.apply(settings.registryKey(key));
        Registry.register(Registries.ITEM, key, item);
        return item;
    }

    public static void initialize() {
    }
}