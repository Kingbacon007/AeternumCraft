package com.kingbacon007.aeternumcraft.items;


import com.kingbacon007.aeternumcraft.blocks.BlocksRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModeItemTabs {

    public static final CreativeModeTab AETERNUMCRAFT_BLOCKS = new CreativeModeTab("aeternumcraft_block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlocksRegister.HARDLIGHT_BLOCK_ITEM.get());
        }
    };
}