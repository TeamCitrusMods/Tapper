package net.tapping;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.tapping.registry.ModBlocks;
import net.tapping.registry.ModItems;

public class Tapping {
    public static final String MOD_ID = "tapping";
    public static final CreativeModeTab TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "tapping"), () -> new ItemStack(ModItems.MAPLE_LOG.get()));
    
    public static void init() {
        ModBlocks.BLOCKS.register();
        ModItems.ITEMS.register();
        ModBlocks.BLOCK_ENTITIES.register();

        WoodType.register(ModBlocks.MAPLE);
    }
}
