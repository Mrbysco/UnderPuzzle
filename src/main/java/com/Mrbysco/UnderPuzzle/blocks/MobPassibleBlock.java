package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MobPassibleBlock extends Block{

	public MobPassibleBlock() {
		super(Material.BARRIER);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.PLAYERWALL.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.PLAYERWALL.getRegistryName());
		this.setBlockUnbreakable();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return true;
    }
	
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Override
	public boolean isTranslucent(IBlockState state) {
		return true;
	}
}
