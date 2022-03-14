package com.globalista.globlocks.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;

public class ModBlocks extends BlockRegister {

    public static void callBlocks() {
        System.out.println("Registering Globlocks' blocks");
    }

    public static final Block LIMESTONE = register("limestone", new Block(FabricBlockSettings.copy(Blocks.ANDESITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_LIMESTONE = register("polished_limestone", new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)), ItemGroup.BUILDING_BLOCKS);


}
