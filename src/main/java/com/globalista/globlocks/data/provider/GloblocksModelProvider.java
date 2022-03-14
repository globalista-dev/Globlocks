package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import static com.globalista.globlocks.block.ModBlocks.LIMESTONE;
import static com.globalista.globlocks.block.ModBlocks.POLISHED_LIMESTONE;

public class GloblocksModelProvider extends FabricModelProvider {
    public GloblocksModelProvider(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_LIMESTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        return;
    }
}
