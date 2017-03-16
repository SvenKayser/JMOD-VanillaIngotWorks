package com.jeffpeng.jmod.vanillaingotworks;

import java.util.ArrayList;
import java.util.Map;

import com.jeffpeng.jmod.JMODPlugin;
import com.jeffpeng.jmod.JMODPluginContainer;
import com.jeffpeng.jmod.forgeevents.JMODInitConfigEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Plugin extends JMODPlugin {

	public Plugin(JMODPluginContainer container) {
		super(container);
		// TODO Auto-generated constructor stub
	}
	
	@SubscribeEvent
	public void initConfig(JMODInitConfigEvent event){
		event.get().put("vanillaingotworks:alloymap", new ArrayList<AlloyDescriptor>());
	}

}
