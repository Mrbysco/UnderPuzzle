package com.Mrbysco.UnderPuzzle.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PuzzleTileRed extends Block{
	
	public PuzzleTileRed(Material materialIn) {
		super(materialIn);
		this.setBlockUnbreakable();
	}
}
