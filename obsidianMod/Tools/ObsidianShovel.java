package populo.mod.obsidianMod.Tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade {
	public ObsidianShovel(int ID, EnumToolMaterial material) {
		super(ID, material);
		setCreativeTab(CreativeTabs.tabTools);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("obsidianmod:obsidian_shovel");
	}
}
