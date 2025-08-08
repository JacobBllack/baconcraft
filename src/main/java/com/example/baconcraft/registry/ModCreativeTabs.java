package com.example.baconcraft.registry;

import com.example.baconcraft.BaconCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaconCraft.MODID);

    public static final RegistryObject<CreativeModeTab> BACON_TAB = TABS.register("bacon_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.baconcraft"))
            .icon(() -> new ItemStack(ModItems.BACON_INGOT.get()))
            .displayItems((params, output) -> {
                output.accept(ModBlocks.BACON_ORE.get());
                output.accept(ModItems.RAW_BACON.get());
                output.accept(ModItems.BACON_INGOT.get());
                output.accept(ModItems.BACON_SWORD.get());
                output.accept(ModItems.BACON_PICKAXE.get());
                output.accept(ModItems.BACON_AXE.get());
                output.accept(ModItems.BACON_SHOVEL.get());
                output.accept(ModItems.BACON_HOE.get());
                output.accept(ModItems.BACON_HELMET.get());
                output.accept(ModItems.BACON_CHESTPLATE.get());
                output.accept(ModItems.BACON_LEGGINGS.get());
                output.accept(ModItems.BACON_BOOTS.get());
            })
            .build());
}
