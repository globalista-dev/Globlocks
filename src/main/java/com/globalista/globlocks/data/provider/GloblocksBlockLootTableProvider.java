package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static com.globalista.globlocks.block.ModBlocks.LIMESTONE;
import static com.globalista.globlocks.block.ModBlocks.POLISHED_LIMESTONE;

public class GloblocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    public GloblocksBlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        addDrop(LIMESTONE);
        addDrop(POLISHED_LIMESTONE);
    }
}
