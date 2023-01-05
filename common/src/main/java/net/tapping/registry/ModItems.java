package net.tapping.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.tapping.Tapping;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Tapping.MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> MAPLE_LEAVES = ITEMS.register("maple_leaves", () -> new BlockItem(ModBlocks.MAPLE_LEAVES.get(), new Item.Properties().tab(Tapping.TAB)));
    public static final RegistrySupplier<Item> MAPLE_LOG = ITEMS.register("maple_log", () -> new BlockItem(ModBlocks.MAPLE_LOG.get(), new Item.Properties().tab(Tapping.TAB)));
    public static final RegistrySupplier<Item> MAPLE_SAPLING = ITEMS.register("maple_sapling", () -> new BlockItem(ModBlocks.MAPLE_SAPLING.get(), new Item.Properties().tab(Tapping.TAB)));
    public static final RegistrySupplier<Item> MAPLE_PLANKS = ITEMS.register("maple_planks", () -> new BlockItem(ModBlocks.MAPLE_PLANKS.get(), new Item.Properties().tab(Tapping.TAB)));
    public static final RegistrySupplier<Item> OOZING_MAPLE_LOG = ITEMS.register("oozing_maple_log", () -> new BlockItem(ModBlocks.OOZING_MAPLE_LOG.get(), new Item.Properties().tab(Tapping.TAB)));
    public static final RegistrySupplier<Item> MAPLE_SIGN = ITEMS.register("maple_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(Tapping.TAB), ModBlocks.MAPLE_STANDING_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));
}
