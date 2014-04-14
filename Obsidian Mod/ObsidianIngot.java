package populo.mod.obsidianMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item {

	public ObsidianIngot(int ID, int maxStackSize, CreativeTabs tab, int texture, String name) {
		super(ID);
        setMaxStackSize(maxStackSize);
        setCreativeTab(tab);
        setUnlocalizedName(name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("obsidianmod:obsidian_ingot");
	}

}
