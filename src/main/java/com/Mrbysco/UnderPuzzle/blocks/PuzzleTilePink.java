package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PuzzleTilePink extends Block{

	public PuzzleTilePink() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEPINK.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEPINK.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		
		EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false);
		player.getEntityData().setInteger("PreviousPosX",(int) player.posX);
		player.getEntityData().setInteger("PreviousPosY",(int) player.posY);
		player.getEntityData().setInteger("PreviousPosZ",(int) player.posZ);
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
