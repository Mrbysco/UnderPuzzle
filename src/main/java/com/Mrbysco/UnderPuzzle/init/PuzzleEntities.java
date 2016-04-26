package com.Mrbysco.UnderPuzzle.init;

import com.Mrbysco.UnderPuzzle.tileentity.UnderRedTileEntity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class PuzzleEntities {

	public static void init()
	{
		GameRegistry.registerTileEntity(UnderRedTileEntity.class, "underpuzzle_tile_red");
	}
	
}
