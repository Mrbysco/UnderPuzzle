package com.Mrbysco.UnderPuzzle.proxy;

import com.Mrbysco.UnderPuzzle.init.PuzzleBlocks;
import com.Mrbysco.UnderPuzzle.init.PuzzleItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void init() {
        //NetworkRegistry.INSTANCE.registerGuiHandler(RDTReference.MOD_ID, new GuiProxy());
		//RDTItems.registerRenders();
		//RDTBlocks.registerRenders();
	}
	
	
	@Override
	public void Preinit() {
		//PuzzleItems.registerRenderMetadata();
		PuzzleItems.registerRenders();
		PuzzleBlocks.registerRenders();
	}

}
