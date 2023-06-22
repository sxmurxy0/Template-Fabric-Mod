package dev.sxmurxy.template;

import net.fabricmc.api.ModInitializer;

public class TemplateMod implements ModInitializer {
	
	public static final String MOD_ID = "template";
	private static TemplateMod instance;

	public TemplateMod() {
		instance = this;
	}

	@Override
	public void onInitialize() {

	}

	public static TemplateMod getInstance() {
		return instance;
	}
	
}
