package com.example.baconcraft.world;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import com.example.baconcraft.registry.ModItems;

public class BaconToolTier {
    public static final Tier TIER = new Tier() {
        @Override public int getLevel() { return 3; } // diamond level
        @Override public int getUses() { return 1561; }
        @Override public float getSpeed() { return 8.0f; }
        @Override public float getAttackDamageBonus() { return 3.0f; }
        @Override public int getEnchantmentValue() { return 18; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(ModItems.BACON_INGOT.get()); }
    };
}
