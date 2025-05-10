package net.tony.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tony.testmod.TestMod;
import net.tony.testmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "cat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cat"))
                    .icon(() -> new ItemStack(ModItems.CAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CAT);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.DOG);

                        entries.add(Items.OCELOT_SPAWN_EGG);

                        entries.add(ModBlocks.DOG_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}
