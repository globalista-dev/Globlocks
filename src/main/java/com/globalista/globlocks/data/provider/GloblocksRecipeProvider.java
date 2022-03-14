package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

import static com.globalista.globlocks.block.ModBlocks.LIMESTONE;
import static com.globalista.globlocks.block.ModBlocks.POLISHED_LIMESTONE;

public class GloblocksRecipeProvider extends FabricRecipeProvider {
        public GloblocksRecipeProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            offerPolishedStoneRecipe(exporter, POLISHED_LIMESTONE, LIMESTONE);
        }
}
