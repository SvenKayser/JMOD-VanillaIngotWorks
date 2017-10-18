package com.jeffpeng.jmod.vanillaingotworks;

import java.util.ArrayList;
import java.util.List;

import com.jeffpeng.jmod.JMODRepresentation;
import com.jeffpeng.jmod.primitives.ModScriptObject;

public class Scripting extends ModScriptObject {
	
	public Scripting(JMODRepresentation owner) {
		super(owner);
		
	}

	@SuppressWarnings("unchecked")
	public  AlloyDescriptor addAlloy(String result, String one, String two, int amount){
		if(config.get("vanillaingotworks:alloymap") == null){
			config.put("vanillaingotworks:alloymap", new ArrayList<AlloyDescriptor>());
		}
		
		AlloyDescriptor newAD = new AlloyDescriptor(result,one,two,amount);
		((List<AlloyDescriptor>) config.get("vanillaingotworks:alloymap")).add(newAD);
		return newAD;
	}
	
	@SuppressWarnings("unchecked")
	public  AlloyDescriptor addAlloy(String result, String one, int amount){
		if(config.get("vanillaingotworks:alloymap") == null){
			config.put("vanillaingotworks:alloymap", new ArrayList<AlloyDescriptor>());
		}
		
		AlloyDescriptor newAD = new AlloyDescriptor(result,one,amount);
		((List<AlloyDescriptor>) config.get("vanillaingotworks:alloymap")).add(newAD);
		return newAD;
	}
} 
