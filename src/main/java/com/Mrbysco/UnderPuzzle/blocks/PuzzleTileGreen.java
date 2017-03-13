package com.Mrbysco.UnderPuzzle.blocks;

import com.Mrbysco.UnderPuzzle.PuzzleReference;
import com.Mrbysco.UnderPuzzle.UnderPuzzle;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PuzzleTileGreen extends Block{
	
	public static double cooldown;

	public PuzzleTileGreen() {
		super(Material.CLOTH);
		setUnlocalizedName(PuzzleReference.PUZZLEBlocks.TILEGREEN.getUnlocalisedName());
		setRegistryName(PuzzleReference.PUZZLEBlocks.TILEGREEN.getRegistryName());
		this.setCreativeTab(UnderPuzzle.tabUNDERPUZZLE);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		
		if (entityIn instanceof EntityPlayer)
		{
			cooldown = Math.random();
			EntityPlayer player = worldIn.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2, false);
			int PreviousX = player.getEntityData().getInteger("PreviousPuzzlePosX");
			int PreviousY = player.getEntityData().getInteger("PreviousPuzzlePosY");
			int PreviousZ = player.getEntityData().getInteger("PreviousPuzzlePosZ");
			int BlockX = pos.getX();
			int BlockZ = pos.getZ();
			
			if(PreviousX == BlockX -1)
			{
				/*
				if (cooldown < 0.01) 
				{
					EntityZombie zombie = new EntityZombie(worldIn); 
					worldIn.spawnEntityInWorld(zombie);
					zombie.setLocationAndAngles(BlockX +2.5D, PreviousY, BlockZ +0.5D, 0,0); 
					zombie.isChild();
				}
				*/
				player.getEntityData().setInteger("PreviousPuzzlePosX",(int) player.posX);
				player.getEntityData().setInteger("PreviousPuzzlePosY",(int) player.posY);
				player.getEntityData().setInteger("PreviousPuzzlePosZ",(int) player.posZ);
			}
			
			if(PreviousX == BlockX +1)
			{
				/*
				if (cooldown < 0.01) 
				{
					EntityZombie zombie = new EntityZombie(worldIn); 
					worldIn.spawnEntityInWorld(zombie);
					zombie.setLocationAndAngles(BlockX -1.5D, PreviousY, BlockZ +0.5D -1.5D, 0,0); 
					zombie.isChild();
				}
				*/
				player.getEntityData().setInteger("PreviousPuzzlePosX",(int) player.posX);
				player.getEntityData().setInteger("PreviousPuzzlePosY",(int) player.posY);
				player.getEntityData().setInteger("PreviousPuzzlePosZ",(int) player.posZ);
			}
			
			if(PreviousZ == BlockZ -1)
			{
				/*
				if (cooldown < 0.01) 
				{
					EntityZombie zombie = new EntityZombie(worldIn); 
					worldIn.spawnEntityInWorld(zombie);
					zombie.setLocationAndAngles(BlockX +0.5D, PreviousY, BlockZ +2.5D, 0,0); 
					zombie.isChild();
				}
				*/
				player.getEntityData().setInteger("PreviousPuzzlePosX",(int) player.posX);
				player.getEntityData().setInteger("PreviousPuzzlePosY",(int) player.posY);
				player.getEntityData().setInteger("PreviousPuzzlePosZ",(int) player.posZ);
			}
			
			if(PreviousZ == BlockZ +1)
			{
				/*
				if (cooldown < 0.01) 
				{
					EntityZombie zombie = new EntityZombie(worldIn); 
					worldIn.spawnEntityInWorld(zombie);
					zombie.setLocationAndAngles(BlockX +0.5D, PreviousY, BlockZ -1.5D, 0,0); 
					zombie.isChild();
				}
				*/
				player.getEntityData().setInteger("PreviousPuzzlePosX",(int) player.posX);
				player.getEntityData().setInteger("PreviousPuzzlePosY",(int) player.posY);
				player.getEntityData().setInteger("PreviousPuzzlePosZ",(int) player.posZ);
			}
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
