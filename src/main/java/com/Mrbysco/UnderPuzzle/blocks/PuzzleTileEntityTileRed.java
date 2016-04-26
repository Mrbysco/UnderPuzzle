package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.tileentity.UnderRedTileEntity;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

public class PuzzleTileEntityTileRed extends BlockContainer{

	public PuzzleTileEntityTileRed(Material materialIn) {
		super(materialIn);
		this.fullBlock = true;
		this.setBlockUnbreakable();
	}

	public boolean isOpaqueCube() 
	{
		return false;
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new UnderRedTileEntity();
	}
	
}
