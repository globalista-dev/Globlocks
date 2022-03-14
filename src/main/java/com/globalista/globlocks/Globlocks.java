package com.globalista.globlocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.globalista.globlocks.block.ModBlocks.callBlocks;

public class Globlocks implements ModInitializer {

	public static final String MOD_ID = "globlocks";

	private static final Identifier GLOBLOCKS_ID = new Identifier(MOD_ID, "globlocks");

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		callBlocks();

	}
}
