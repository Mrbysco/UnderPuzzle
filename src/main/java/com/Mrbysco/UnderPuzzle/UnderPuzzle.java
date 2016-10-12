package com.Mrbysco.UnderPuzzle;

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

@Mod(modid = PuzzleReference.MOD_ID, name = PuzzleReference.MOD_NAME, version = PuzzleReference.VERSION, acceptedMinecraftVersions = PuzzleReference.ACCEPTED_VERSIONS)
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
    	PuzzleBlocks.init();
    	PuzzleBlocks.register();
    	PuzzleItems.init();
    	PuzzleItems.register();

    	proxy.Preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}