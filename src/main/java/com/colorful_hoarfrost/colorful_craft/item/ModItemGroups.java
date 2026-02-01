package com.colorful_hoarfrost.colorful_craft.item;

import com.colorful_hoarfrost.colorful_craft.ColorfulCraft;
import com.colorful_hoarfrost.colorful_craft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> A_BUILDING_BLOCKS = register("a_building_blocks");
    public static final RegistryKey<ItemGroup> B_COLORED_BLOCKS = register("b_colored_blocks");
    public static final RegistryKey<ItemGroup> C_NATURAL = register("c_natural_blocks");
    public static final RegistryKey<ItemGroup> D_FUNCTIONAL = register("d_functional_blocks");
    public static final RegistryKey<ItemGroup> E_REDSTONE = register("e_redstone_blocks");
    public static final RegistryKey<ItemGroup> F_TOOLS = register("f_tools_and_utilities");
    public static final RegistryKey<ItemGroup> G_COMBAT = register("g_combat");
    public static final RegistryKey<ItemGroup> H_FOOD_AND_DRINK = register("h_food_and_drinks");
    public static final RegistryKey<ItemGroup> I_INGREDIENTS = register("i_ingredients");
    public static final RegistryKey<ItemGroup> J_SPAWN_EGGS = register("j_spawn_eggs");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(ColorfulCraft.MOD_ID, id));
    }

    public static void initialize() {
        Registry.register(
                Registries.ITEM_GROUP,
                A_BUILDING_BLOCKS,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.aBuildingBlocks"))
                        .icon(() -> new ItemStack(Blocks.BRICKS))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.STONE_WALL);
                            entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                            entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                            entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                            entries.add(ModBlocks.CALCITE_STAIRS);
                            entries.add(ModBlocks.CALCITE_SLAB);
                            entries.add(ModBlocks.CALCITE_WALL);
                            entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                            entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                            entries.add(ModBlocks.SMOOTH_BASALT_WALL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                B_COLORED_BLOCKS,
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.bColoredBlocks"))
                        .icon(() -> new ItemStack(Blocks.CYAN_WOOL))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                C_NATURAL,
                ItemGroup.create(ItemGroup.Row.TOP, 9)
                        .displayName(Text.translatable("itemGroup.cNatural"))
                        .icon(() -> new ItemStack(Blocks.GRASS_BLOCK))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                D_FUNCTIONAL,
                ItemGroup.create(ItemGroup.Row.TOP, 10)
                        .displayName(Text.translatable("itemGroup.dFunctional"))
                        .icon(() -> new ItemStack(Items.OAK_SIGN))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                E_REDSTONE,
                ItemGroup.create(ItemGroup.Row.TOP, 11)
                        .displayName(Text.translatable("itemGroup.eRedstone"))
                        .icon(() -> new ItemStack(Items.REDSTONE))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                F_TOOLS,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 7)
                        .displayName(Text.translatable("itemGroup.fTools"))
                        .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                G_COMBAT,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 8)
                        .displayName(Text.translatable("itemGroup.gCombat"))
                        .icon(() -> new ItemStack(Items.NETHERITE_SWORD))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                H_FOOD_AND_DRINK,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 9)
                        .displayName(Text.translatable("itemGroup.hFoodAndDrink"))
                        .icon(() -> new ItemStack(ModItems.DIAMOND_APPLE))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.DIAMOND_APPLE);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                I_INGREDIENTS,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 10)
                        .displayName(Text.translatable("itemGroup.iIngredients"))
                        .icon(() -> new ItemStack(Items.IRON_INGOT))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
        Registry.register(
                Registries.ITEM_GROUP,
                J_SPAWN_EGGS,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 11)
                        .displayName(Text.translatable("itemGroup.jSpawnEggs"))
                        .icon(() -> new ItemStack(Items.CREEPER_SPAWN_EGG))
                        .entries((displayContext, entries) -> {
                            entries.add(Blocks.CYAN_WOOL);
                        })
                        .build()
        );
    }
}