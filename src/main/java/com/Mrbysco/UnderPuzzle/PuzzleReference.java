package com.Mrbysco.UnderPuzzle;

public class PuzzleReference {
	public static final String MOD_ID = "underpuzzle";
	public static final String MOD_NAME = "Undertale Puzzle";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.Mrbysco.UnderPuzzle.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Mrbysco.UnderPuzzle.proxy.CommonProxy";

public static enum PUZZLEItems {
	ITEM("UnlocalisedName", "RegistryName");
	
	private String unlocalisedName;
	private String registryName;
	
	PUZZLEItems(String unlocalisedName, String registryName) {
		this.unlocalisedName = unlocalisedName;
		this.registryName = registryName;
	}
	
	public String getUnlocalisedName() {
		return unlocalisedName;
	}
	
	public String getRegistryName() {
		return registryName;
	}
}

public static enum PUZZLEBlocks {
	TILEBLUE("bluetile", "tile_blue"),
	TILEGREEN("greentile", "tile_green"),
	TILEORANGE("orangetile", "tile_orange"),
	TILEPINK("pinktile", "tile_pink"),
	TILEPURPLE("purpletile", "tile_purple"),
	TILERED("redtile", "tile_red"),
	TILEYELLOW("yellowtile", "tile_yellow");
	
	private String unlocalisedName;
	private String registryName;
	
	PUZZLEBlocks(String unlocalisedName, String registryName) {
		this.unlocalisedName = unlocalisedName;
		this.registryName = registryName;
	}
	
	public String getUnlocalisedName() {
		return unlocalisedName;
	}
	
	public String getRegistryName() {
		return registryName;
	}
}
}
