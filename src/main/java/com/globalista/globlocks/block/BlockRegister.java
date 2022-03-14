package com.globalista.globlocks.block;

import com.globalista.globlocks.Globlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class BlockRegister {

    public static Block register(String id, Block block, BlockItem item) {
        Registry.register(Registry.BLOCK, Globlocks.id(id), block);
        Registry.register(Registry.ITEM, Globlocks.id(id), item);
        return block;
    }

    public static Block register(String id, Block block, ItemGroup itemGroup) {
        return register(id, block, new BlockItem(block, new Item.Settings().group(itemGroup)));
    }
}
