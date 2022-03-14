package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.util.Identifier;

import static com.globalista.globlocks.Globlocks.MOD_ID;
import static com.globalista.globlocks.block.GloblocksBlocks.*;

public class GloblocksModelProvider extends FabricModelProvider {
    public GloblocksModelProvider(FabricDataGenerator generator) {
        super(generator);
    }

    public static final String block = MOD_ID + ":block/";
    public static final String item = MOD_ID + ":item/";

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator modelGen) {
        // Blocks
        modelGen.registerMirrorable(LIMESTONE);
        modelGen.registerSimpleCubeAll(POLISHED_LIMESTONE);
        modelGen.registerSimpleCubeAll(LIMESTONE_BRICKS);

        modelGen.registerMirrorable(MARBLE);
        modelGen.registerSimpleCubeAll(POLISHED_MARBLE);
        modelGen.registerSimpleCubeAll(MARBLE_BRICKS);

        modelGen.registerMirrorable(SCHIST);
        modelGen.registerSimpleCubeAll(POLISHED_SCHIST);
        modelGen.registerSimpleCubeAll(SCHIST_BRICKS);

        modelGen.registerSimpleCubeAll(LOAM);
        modelGen.registerSimpleCubeAll(DRIED_LOAM);
        modelGen.registerSimpleCubeAll(LOAM_BRICKS);

        modelGen.registerSimpleCubeAll(BLACK_BRICKS);
        modelGen.registerSimpleCubeAll(BLUE_BRICKS);
        modelGen.registerSimpleCubeAll(BROWN_BRICKS);
        modelGen.registerSimpleCubeAll(CYAN_BRICKS);
        modelGen.registerSimpleCubeAll(GRAY_BRICKS);
        modelGen.registerSimpleCubeAll(GREEN_BRICKS);
        modelGen.registerSimpleCubeAll(LIGHT_BLUE_BRICKS);
        modelGen.registerSimpleCubeAll(LIGHT_GRAY_BRICKS);
        modelGen.registerSimpleCubeAll(LIME_BRICKS);
        modelGen.registerSimpleCubeAll(MAGENTA_BRICKS);
        modelGen.registerSimpleCubeAll(ORANGE_BRICKS);
        modelGen.registerSimpleCubeAll(PINK_BRICKS);
        modelGen.registerSimpleCubeAll(PURPLE_BRICKS);
        modelGen.registerSimpleCubeAll(RED_BRICKS);
        modelGen.registerSimpleCubeAll(WHITE_BRICKS);
        modelGen.registerSimpleCubeAll(YELLOW_BRICKS);


        // ItemBlocks
        modelGen.registerParentedItemModel(LIMESTONE, Identifier.tryParse(block + "limestone"));
        modelGen.registerParentedItemModel(POLISHED_LIMESTONE, Identifier.tryParse(block + "polished_limestone"));
        modelGen.registerParentedItemModel(LIMESTONE_BRICKS, Identifier.tryParse(block + "limestone_bricks"));

        modelGen.registerParentedItemModel(MARBLE, Identifier.tryParse(block + "marble"));
        modelGen.registerParentedItemModel(POLISHED_MARBLE, Identifier.tryParse(block + "polished_marble"));
        modelGen.registerParentedItemModel(MARBLE_BRICKS, Identifier.tryParse(block + "marble_bricks"));

        modelGen.registerParentedItemModel(SCHIST, Identifier.tryParse(block + "schist"));
        modelGen.registerParentedItemModel(POLISHED_SCHIST, Identifier.tryParse(block + "polished_schist"));
        modelGen.registerParentedItemModel(SCHIST_BRICKS, Identifier.tryParse(block + "schist_bricks"));

        modelGen.registerParentedItemModel(LOAM, Identifier.tryParse(block + "loam"));
        modelGen.registerParentedItemModel(DRIED_LOAM, Identifier.tryParse(block + "dried_loam"));
        modelGen.registerParentedItemModel(LOAM_BRICKS, Identifier.tryParse(block + "loam_bricks"));

        modelGen.registerParentedItemModel(BLACK_BRICKS, Identifier.tryParse(block + "black_bricks"));
        modelGen.registerParentedItemModel(BLUE_BRICKS, Identifier.tryParse(block + "blue_bricks"));
        modelGen.registerParentedItemModel(BROWN_BRICKS, Identifier.tryParse(block + "brown_bricks"));
        modelGen.registerParentedItemModel(CYAN_BRICKS, Identifier.tryParse(block + "cyan_bricks"));
        modelGen.registerParentedItemModel(GRAY_BRICKS, Identifier.tryParse(block + "gray_bricks"));
        modelGen.registerParentedItemModel(GREEN_BRICKS, Identifier.tryParse(block + "green_bricks"));
        modelGen.registerParentedItemModel(LIGHT_BLUE_BRICKS, Identifier.tryParse(block + "light_blue_bricks"));
        modelGen.registerParentedItemModel(LIGHT_GRAY_BRICKS, Identifier.tryParse(block + "light_gray_bricks"));
        modelGen.registerParentedItemModel(LIME_BRICKS, Identifier.tryParse(block + "lime_bricks"));
        modelGen.registerParentedItemModel(MAGENTA_BRICKS, Identifier.tryParse(block + "magenta_bricks"));
        modelGen.registerParentedItemModel(ORANGE_BRICKS, Identifier.tryParse(block + "orange_bricks"));
        modelGen.registerParentedItemModel(PINK_BRICKS, Identifier.tryParse(block + "pink_bricks"));
        modelGen.registerParentedItemModel(PURPLE_BRICKS, Identifier.tryParse(block + "purple_bricks"));
        modelGen.registerParentedItemModel(RED_BRICKS, Identifier.tryParse(block + "red_bricks"));
        modelGen.registerParentedItemModel(WHITE_BRICKS, Identifier.tryParse(block + "white_bricks"));
        modelGen.registerParentedItemModel(YELLOW_BRICKS, Identifier.tryParse(block + "yellow_bricks"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register();
    }
}
