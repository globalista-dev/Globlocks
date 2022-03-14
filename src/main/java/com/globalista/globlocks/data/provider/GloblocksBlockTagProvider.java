package com.globalista.globlocks.data.provider;

import com.globalista.globlocks.block.GloblocksBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

import static com.globalista.globlocks.block.GloblocksBlocks.*;

public class GloblocksBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public GloblocksBlockTagProvider(FabricDataGenerator dataGenerator) { super(dataGenerator); }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(LIMESTONE)
                .add(POLISHED_LIMESTONE)
                .add(LIMESTONE_BRICKS)
                .add(SCHIST)
                .add(POLISHED_SCHIST)
                .add(SCHIST_BRICKS)
                .add(DRIED_LOAM)
                .add(LOAM_BRICKS)
                .add(MARBLE)
                .add(POLISHED_MARBLE)
                .add(MARBLE_BRICKS)
                .add(BLACK_BRICKS)
                .add(BLUE_BRICKS)
                .add(BROWN_BRICKS)
                .add(CYAN_BRICKS)
                .add(GRAY_BRICKS)
                .add(GREEN_BRICKS)
                .add(LIGHT_BLUE_BRICKS)
                .add(LIGHT_GRAY_BRICKS)
                .add(LIME_BRICKS)
                .add(MAGENTA_BRICKS)
                .add(ORANGE_BRICKS)
                .add(PINK_BRICKS)
                .add(PURPLE_BRICKS)
                .add(RED_BRICKS)
                .add(WHITE_BRICKS)
                .add(YELLOW_BRICKS);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(LOAM);

        getOrCreateTagBuilder(GloblocksBlockTags.RIVER_BED_REPLACEABLES) // Can be used to generate loam in rivers and oceans
                .add(Blocks.DIRT)
                .add(Blocks.SAND)
                .add(Blocks.GRAVEL);
    }

}
