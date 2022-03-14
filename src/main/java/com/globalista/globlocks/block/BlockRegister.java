package com.globalista.globlocks.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.globalista.globlocks.Globlocks.MOD_ID;

public class BlockRegister {

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    public static Block register(String id, Block block, BlockItem item) {
        Registry.register(Registry.BLOCK, id(id), block);
        Registry.register(Registry.ITEM, id(id), item);
        return block;
    }

    public static Block register(String id, Block block, ItemGroup itemGroup) {
        return register(id, block, new BlockItem(block, new Item.Settings().group(itemGroup)));
    }
}
