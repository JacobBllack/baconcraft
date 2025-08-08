package com.example.baconcraft;

import com.example.baconcraft.registry.ModBlocks;
import com.example.baconcraft.registry.ModCreativeTabs;
import com.example.baconcraft.registry.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BaconCraft.MODID)
public class BaconCraft {
    public static final String MODID = "baconcraft";

    public BaconCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModCreativeTabs.TABS.register(bus);
    }
}
