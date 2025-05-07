package net.tony.testmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.tony.testmod.sounds.ModSounds;

public class CatItem extends Item {

    public CatItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient) {
            user.sendMessage(Text.of("Meow"), false);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), ModSounds.CAT_USED, SoundCategory.PLAYERS, 1.0f, 1.0f);
            stack.damage(1, user, (player) -> {
                player.sendToolBreakStatus(hand);
            });
        }


        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }
}
