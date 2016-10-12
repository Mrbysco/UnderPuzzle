package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PuzzleTilePurple extends Block{

	public PuzzleTilePurple() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEPURPLE.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEPURPLE.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
}
