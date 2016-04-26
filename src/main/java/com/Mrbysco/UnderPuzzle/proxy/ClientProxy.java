package com.Mrbysco.UnderPuzzle.proxy;

import com.Mrbysco.UnderPuzzle.init.PuzzleBlocks;
import com.Mrbysco.UnderPuzzle.init.PuzzleEntities;
import com.Mrbysco.UnderPuzzle.init.PuzzleItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders(){
		PuzzleBlocks.registerRenders();
		PuzzleItems.registerRenders();
	}
	
	@Override
	public void registerRenderingFactories(){
		
	}
	
	@Override
	public void registerTileEntities(){
		PuzzleEntities.init();
	}
}
