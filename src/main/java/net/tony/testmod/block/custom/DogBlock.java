package net.tony.testmod.block.custom;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class DogBlock extends FallingBlock {
    public static final BooleanProperty HIT = BooleanProperty.of("hit");

    public DogBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(HIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HIT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient()) {
            world.setBlockState(pos, state.cycle(HIT));
        }

        return ActionResult.SUCCESS;
    }
}
