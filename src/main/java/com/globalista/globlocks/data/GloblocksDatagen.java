package com.globalista.globlocks.data;


import com.globalista.globlocks.data.provider.GloblocksBlockLootTableProvider;
import com.globalista.globlocks.data.provider.GloblocksBlockTagProvider;
import com.globalista.globlocks.data.provider.GloblocksModelProvider;
import com.globalista.globlocks.data.provider.GloblocksRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class GloblocksDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(GloblocksRecipeProvider::new);
        dataGenerator.addProvider(GloblocksModelProvider::new);
        dataGenerator.addProvider(GloblocksBlockLootTableProvider::new);

        FabricTagProvider.BlockTagProvider blockTags = new GloblocksBlockTagProvider(dataGenerator);
        dataGenerator.addProvider(blockTags);

    }

}
