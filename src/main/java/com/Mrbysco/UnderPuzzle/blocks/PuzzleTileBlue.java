package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PuzzleTileBlue extends Block{

	public PuzzleTileBlue() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEBLUE.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEBLUE.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
}
