/**
 * 
 */
package flimaas.adersin.objects;

import flimaas.adersin.Main;
import flimaas.adersin.init.ItemInit;
import flimaas.adersin.proxy.ClientProxy;
import flimaas.adersin.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}	
}
