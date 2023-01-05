package net.tapping.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.tapping.registry.ModBlocks;

public class MapleSignBlock {
    public static class MapleStanding extends StandingSignBlock {
        public MapleStanding() {
            super(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModBlocks.MAPLE);
        }

        @Override
        public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
            return new MapleBlockEntity(blockPos, blockState);
        }
    }

    public static class MapleWall extends WallSignBlock {
        public MapleWall() {
            super(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModBlocks.MAPLE);
        }

        @Override
        public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
            return new MapleBlockEntity(blockPos, blockState);
        }
    }

    public static class MapleBlockEntity extends SignBlockEntity {
        public MapleBlockEntity(BlockPos blockPos, BlockState blockState) {
            super(blockPos, blockState);
        }

        @Override
        public BlockEntityType<?> getType() {
            return ModBlocks.MAPLE_SIGN.get();
        }
    }
}
