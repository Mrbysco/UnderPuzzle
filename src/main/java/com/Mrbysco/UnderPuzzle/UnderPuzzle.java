package com.Mrbysco.UnderPuzzle;

import org.lwjgl.opengl.Display;

import com.Mrbysco.UnderPuzzle.init.PuzzleBlocks;
import com.Mrbysco.UnderPuzzle.init.PuzzleItems;
import com.Mrbysco.UnderPuzzle.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PuzzleReference.MOD_ID, name = PuzzleReference.MOD_NAME, version = PuzzleReference.VERSION)
public class UnderPuzzle	
{
	
	@Instance(PuzzleReference.MOD_ID)
	public static UnderPuzzle instance;
	
	@SidedProxy(clientSide = PuzzleReference.CLIENT_PROXY_CLASS, serverSide = PuzzleReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final UNDERPUZZLEtab tabUNDERPUZZLE = new UNDERPUZZLEtab("tabUNDERPUZZLE");
	
	@EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    	Display.setTitle("Minecraft 1.10");
    	
    	PuzzleBlocks.init();
    	PuzzleBlocks.register();
    	PuzzleItems.init();
    	PuzzleItems.register();

    	proxy.registerTileEntities();
    	proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	Display.setTitle("Minecraft 1.10");	
    }
}