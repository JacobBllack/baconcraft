package com.example.baconcraft.world;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.crafting.Ingredient;
import com.example.baconcraft.registry.ModItems;

public class BaconArmorMaterial implements ArmorMaterial {
    public static final BaconArmorMaterial INSTANCE = new BaconArmorMaterial();

    private static final int[] DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] DEFENSE = new int[]{3, 8, 6, 3}; // boots, chest, legs, helmet order via getDefenseForType

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        int i = switch(type) {
            case BOOTS -> 0;
            case CHESTPLATE -> 1;
            case LEGGINGS -> 2;
            case HELMET -> 3;
        };
        int base = new int[]{13, 15, 16, 11}[i];
        return base * 25; // mid-late
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return switch(type) {
            case BOOTS -> 3;
            case LEGGINGS -> 6;
            case CHESTPLATE -> 8;
            case HELMET -> 3;
        };
    }

    @Override public int getEnchantmentValue() { return 18; }
    @Override public net.minecraft.sounds.SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_IRON; }
    @Override public Ingredient getRepairIngredient() { return Ingredient.of(ModItems.BACON_INGOT.get()); }
    @Override public String getName() { return "baconcraft:bacon"; }
    @Override public float getToughness() { return 1.0f; }
    @Override public float getKnockbackResistance() { return 0.0f; }
}
