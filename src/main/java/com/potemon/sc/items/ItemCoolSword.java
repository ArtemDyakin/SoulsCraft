package com.potemon.sc.items;

import com.potemon.sc.init.InitItems;
import com.potemon.sc.utils.interfaces.IHasModel;
import com.potemon.sc.main.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemCoolSword extends ItemSword implements IHasModel {
	public ItemCoolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
