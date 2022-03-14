package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static com.globalista.globlocks.block.GloblocksBlocks.*;

public class GloblocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    public GloblocksBlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        addDrop(LIMESTONE);
        addDrop(POLISHED_LIMESTONE);
        addDrop(LIMESTONE_BRICKS);
        addDrop(MARBLE);
        addDrop(POLISHED_MARBLE);
        addDrop(MARBLE_BRICKS);
        addDrop(SCHIST);
        addDrop(POLISHED_SCHIST);
        addDrop(SCHIST_BRICKS);
        addDrop(LOAM);
        addDrop(DRIED_LOAM);
        addDrop(LOAM_BRICKS);
        addDrop(BLACK_BRICKS);
        addDrop(BLUE_BRICKS);
        addDrop(BROWN_BRICKS);
        addDrop(CYAN_BRICKS);
        addDrop(GRAY_BRICKS);
        addDrop(GREEN_BRICKS);
        addDrop(LIGHT_BLUE_BRICKS);
        addDrop(LIGHT_GRAY_BRICKS);
        addDrop(LIME_BRICKS);
        addDrop(MAGENTA_BRICKS);
        addDrop(ORANGE_BRICKS);
        addDrop(PINK_BRICKS);
        addDrop(PURPLE_BRICKS);
        addDrop(RED_BRICKS);
        addDrop(WHITE_BRICKS);
        addDrop(YELLOW_BRICKS);
    }
}
