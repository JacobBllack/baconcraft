package com.example.baconcraft.registry;

import com.example.baconcraft.BaconCraft;
import com.example.baconcraft.world.BaconArmorMaterial;
import com.example.baconcraft.world.BaconToolTier;
import com.example.baconcraft.world.item.BaconAxeItem;
import com.example.baconcraft.world.item.BaconHoeItem;
import com.example.baconcraft.world.item.BaconPickaxeItem;
import com.example.baconcraft.world.item.BaconShovelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BaconCraft.MODID);

    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> BACON_INGOT = ITEMS.register("bacon_ingot", () -> new Item(new Item.Properties()));

    // Block items
    public static final RegistryObject<BlockItem> BACON_ORE_ITEM = ITEMS.register("bacon_ore", () -> new BlockItem(ModBlocks.BACON_ORE.get(), new Item.Properties()));

    // Tools
    public static final RegistryObject<SwordItem> BACON_SWORD = ITEMS.register("bacon_sword", () -> new SwordItem(BaconToolTier.TIER, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<BaconPickaxeItem> BACON_PICKAXE = ITEMS.register("bacon_pickaxe", () -> new BaconPickaxeItem(BaconToolTier.TIER, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<BaconAxeItem> BACON_AXE = ITEMS.register("bacon_axe", () -> new BaconAxeItem(BaconToolTier.TIER, 5.0f, -3.0f, new Item.Properties()));
    public static final RegistryObject<BaconShovelItem> BACON_SHOVEL = ITEMS.register("bacon_shovel", () -> new BaconShovelItem(BaconToolTier.TIER, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<BaconHoeItem> BACON_HOE = ITEMS.register("bacon_hoe", () -> new BaconHoeItem(BaconToolTier.TIER, -3, 0.0f, new Item.Properties()));

    // Armor
    public static final RegistryObject<ArmorItem> BACON_HELMET = ITEMS.register("bacon_helmet", () -> new ArmorItem(BaconArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> BACON_CHESTPLATE = ITEMS.register("bacon_chestplate", () -> new ArmorItem(BaconArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> BACON_LEGGINGS = ITEMS.register("bacon_leggings", () -> new ArmorItem(BaconArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> BACON_BOOTS = ITEMS.register("bacon_boots", () -> new ArmorItem(BaconArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Properties()));
}
