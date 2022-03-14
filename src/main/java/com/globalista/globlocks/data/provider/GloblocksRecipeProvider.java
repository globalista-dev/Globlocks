package com.globalista.globlocks.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;

import java.util.function.Consumer;

import static com.globalista.globlocks.block.GloblocksBlocks.*;
import static com.globalista.globlocks.recipe.GloblocksRecipeProvider.offerBrickDyeingRecipe;

public class GloblocksRecipeProvider extends FabricRecipeProvider {
        public GloblocksRecipeProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

            // Polished stone
            offerPolishedStoneRecipe(exporter, POLISHED_LIMESTONE, LIMESTONE);
            offerPolishedStoneRecipe(exporter, POLISHED_MARBLE, MARBLE);
            offerPolishedStoneRecipe(exporter, POLISHED_SCHIST, SCHIST);

            // Stone bricks
            offerPolishedStoneRecipe(exporter, LIMESTONE_BRICKS, POLISHED_LIMESTONE);
            offerPolishedStoneRecipe(exporter, MARBLE_BRICKS, POLISHED_MARBLE);
            offerPolishedStoneRecipe(exporter, SCHIST_BRICKS, POLISHED_SCHIST);

            // Stained bricks
            offerBrickDyeingRecipe(exporter, BLACK_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, BLUE_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, BROWN_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, CYAN_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, GRAY_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, GREEN_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, LIGHT_BLUE_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, LIGHT_GRAY_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, LIME_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, MAGENTA_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, ORANGE_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, PINK_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, PURPLE_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, RED_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, WHITE_BRICKS, Items.BLACK_DYE);
            offerBrickDyeingRecipe(exporter, YELLOW_BRICKS, Items.BLACK_DYE);
        }
}
