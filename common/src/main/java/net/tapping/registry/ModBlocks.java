package net.tapping.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.tapping.Tapping;
import net.tapping.block.MapleSignBlock;
import net.tapping.block.OoozingMapleLogBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Tapping.MOD_ID, Registry.BLOCK_REGISTRY);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Tapping.MOD_ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);
    public static final WoodType MAPLE = WoodType.register(new WoodType("maple"));
    public static final RegistrySupplier<Block> MAPLE_LEAVES = BLOCKS.register("maple_leaves", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistrySupplier<Block> MAPLE_LOG = BLOCKS.register("maple_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(2.0f).sound(SoundType.WOOD)));
    public static final RegistrySupplier<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling", () -> new SaplingBlock(new OakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistrySupplier<Block> MAPLE_PLANKS = BLOCKS.register("maple_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistrySupplier<Block> OOZING_MAPLE_LOG = BLOCKS.register("oozing_maple_log", () -> new OoozingMapleLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistrySupplier<Block> MAPLE_STANDING_SIGN = BLOCKS.register("maple_sign", MapleSignBlock.MapleStanding::new);
    public static final RegistrySupplier<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign", MapleSignBlock.MapleWall::new);
    public static final RegistrySupplier<BlockEntityType<MapleSignBlock.MapleBlockEntity>> MAPLE_SIGN = BLOCK_ENTITIES.register("custom_sign", () -> BlockEntityType.Builder.of(MapleSignBlock.MapleBlockEntity::new, MAPLE_WALL_SIGN.get(), MAPLE_STANDING_SIGN.get()).build(null));
}
