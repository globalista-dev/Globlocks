package com.globalista.globlocks;

import net.fabricmc.api.ModInitializer;

import static com.globalista.globlocks.block.GloblocksBlocks.callBlocks;
import static com.globalista.globlocks.world.GloblocksWorldGen.callWorldGen;

public class Globlocks implements ModInitializer {

	public static final String MOD_ID = "globlocks";

	@Override
	public void onInitialize() {
		callBlocks();
		callWorldGen();


	}
}
