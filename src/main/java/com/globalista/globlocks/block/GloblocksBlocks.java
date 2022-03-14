package com.globalista.globlocks.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class GloblocksBlocks extends BlockRegister {

    public static void callBlocks() {
        System.out.println("Registering Globlocks' blocks");
    }

    // Stone types
    public static final Block LIMESTONE = register("limestone", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(0.90F,0.90F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_LIMESTONE = register("polished_limestone", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(0.90F,0.90F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIMESTONE_BRICKS = register("limestone_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(0.90F,0.90F)), ItemGroup.BUILDING_BLOCKS);

    public static final Block MARBLE = register("marble", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(1.20F,1.20F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_MARBLE = register("polished_marble", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(1.20F,1.20F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MARBLE_BRICKS = register("marble_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).strength(1.20F,1.20F)), ItemGroup.BUILDING_BLOCKS);

    public static final Block SCHIST = register("schist", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(1.35F,1.35F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_SCHIST = register("polished_schist", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(1.35F,1.35F).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SCHIST_BRICKS = register("schist_bricks", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).strength(1.35F,1.35F).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroup.BUILDING_BLOCKS);

    // Ground blocks

    public static final Block LOAM = register("loam", new Block(FabricBlockSettings.copyOf(Blocks.CLAY)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIED_LOAM = register("dried_loam", new Block(FabricBlockSettings.copy(Blocks.STONE).strength(1.1F, 1.1F)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LOAM_BRICKS = register("loam_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).strength(1.1F, 3F)), ItemGroup.BUILDING_BLOCKS);

    // Colored variants

    public static final Block BLACK_BRICKS = register("black_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLUE_BRICKS = register("blue_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BROWN_BRICKS = register("brown_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CYAN_BRICKS = register("cyan_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GRAY_BRICKS = register("gray_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GREEN_BRICKS = register("green_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_BRICKS = register("light_blue_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_BRICKS = register("light_gray_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIME_BRICKS = register("lime_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGENTA_BRICKS = register("magenta_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ORANGE_BRICKS = register("orange_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PINK_BRICKS = register("pink_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PURPLE_BRICKS = register("purple_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RED_BRICKS = register("red_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block WHITE_BRICKS = register("white_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block YELLOW_BRICKS = register("yellow_bricks", new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);

}
