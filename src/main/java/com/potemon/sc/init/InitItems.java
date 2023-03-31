package com.potemon.sc.init;
import java.util.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item;
import com.potemon.sc.items.ItemCoolSword;

public class InitItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item.ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("sc:ebonit", 2, 256, 50.0F, 12.0F, 12);
	public static final Item COOL_SWORD = new ItemCoolSword("cool_sword", TOOL_MATERIAL);
}
