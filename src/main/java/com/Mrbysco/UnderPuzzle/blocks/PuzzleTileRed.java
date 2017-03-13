package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;
import com.Mrbysco.UnderPuzzle.init.PuzzleBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class PuzzleTileRed extends Block{
	
	public PuzzleTileRed() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILERED.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILERED.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
	 
	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
    	{
    		//worldIn.setBlockState(pos.up(), PuzzleBlocks.player_wall.getDefaultState());
    		worldIn.setBlockState(pos.up(2), PuzzleBlocks.player_wall.getDefaultState());
    	}
    	super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		{
			worldIn.setBlockState(pos.up(2), Blocks.AIR.getDefaultState());
		}
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) {
		{
			worldIn.setBlockState(pos.up(2), Blocks.AIR.getDefaultState());
		}
		super.onBlockDestroyedByExplosion(worldIn, pos, explosionIn);
	}
	 
}
