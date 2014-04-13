package populo.mod.obsidianMod;


import populo.mod.obsidianMod.Tools.ObsidianAxe;
import populo.mod.obsidianMod.Tools.ObsidianHoe;
import populo.mod.obsidianMod.Tools.ObsidianPick;
import populo.mod.obsidianMod.Tools.ObsidianShovel;
import populo.mod.obsidianMod.Tools.ObsidianSword;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ObsidianModID", name="Obsidian Mod", version="1.0.5")
@NetworkMod(clientSideRequired=true, serverSideRequired = false) // not used in 1.7

public class ObsidianMod {


    // The instance of your mod that Forge uses.
    @Instance(value = "Obsidian Tools")
    public static ObsidianMod instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="populo.mod.obsidianMod.client.ClientProxy", serverSide="populo.mod.obsidianMod.CommonProxy")
    public static CommonProxy proxy;
    
    public static EnumToolMaterial ObsidianTool = EnumHelper.addToolMaterial("Obsidian Tool", 3, 2300, 10.0F, 4.5F, 25);
    public static EnumArmorMaterial ObsidianArmor = EnumHelper.addArmorMaterial("Obdisian Armor", 40, new int[] {5, 10, 8, 5}, 30);
    
    
    //RenderingRegistry.addNewArmourRendererPrefix("ObsidianArmor");
    
    
    public static Item obsidianIngot;
    public static Item obsidianPickaxe;
    public static Item obsidianAxe;
    public static Item obsidianShovel;
    public static Item obsidianHoe;
    public static Item obsidianSword;
    public static Item obsidianHelmet;
    public static Item obsidianChest;
    public static Item obsidianLeggings;
    public static Item obsidianBoots;
    //public static Item 


    
    
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    	obsidianIngot = new ObsidianIngot(4069, 64, CreativeTabs.tabMaterials, 1, "obsidianIngot").setTextureName("obsidianmod:obsidianIngot");
    	obsidianPickaxe = (ItemPickaxe) new ObsidianPick(4070, ObsidianTool).setUnlocalizedName("obsidianPickaxe").setTextureName("obsidianmod:obsidianPickaxe");
    	obsidianAxe = (ItemAxe) new ObsidianAxe(4071, ObsidianTool).setUnlocalizedName("obsidianAxe");
    	obsidianShovel = (ItemSpade) new ObsidianShovel(4072, ObsidianTool).setUnlocalizedName("obsidianShovel");
    	obsidianHoe = (ItemHoe) new ObsidianHoe(4073, ObsidianTool).setUnlocalizedName("obsidianHoe");
    	obsidianSword = (ItemSword) new ObsidianSword(4074, ObsidianTool).setUnlocalizedName("obsidianSword");
    	//obsidianHelmet = new ObsidianArmor(4075, ObsidianArmor, 5, 0).setUnlocalizedName("obsidianHelmet");
    }
    
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            
            
            GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
            	"OOO", "OOO", "OOO", 'O', obsidianIngot
            });
            GameRegistry.addRecipe(new ItemStack(obsidianPickaxe, 1), new Object[] {
            	"OOO", " S ", " S ", 'O', obsidianIngot, 'S', Item.stick
            });
            GameRegistry.addRecipe(new ItemStack(obsidianAxe, 1), new Object[] {
            	"OO ", "OS ", " S ", 'O', obsidianIngot, 'S', Item.stick
            });
            GameRegistry.addRecipe(new ItemStack(obsidianSword, 1), new Object[] {
            	" O ", " O ", " S ", 'O', obsidianIngot, 'S', Item.stick
            });
            GameRegistry.addRecipe(new ItemStack(obsidianShovel, 1), new Object[] {
            	" O ", " S ", " S ", 'O', obsidianIngot, 'S', Item.stick
            });
            GameRegistry.addRecipe(new ItemStack(obsidianHoe, 1), new Object[] {
            	" OO", " S ", " S ", 'O', obsidianIngot, 'S', Item.stick
            });
            
            
            GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(ObsidianMod.obsidianIngot, 3), 5F);
            
           
            
            LanguageRegistry.addName(obsidianIngot, "Obsidian Ingot");
            LanguageRegistry.addName(obsidianPickaxe, "Obsidian Pickaxe");
            LanguageRegistry.addName(obsidianAxe, "Obsidian Axe");
            LanguageRegistry.addName(obsidianHoe, "Obsidian Hoe");
            LanguageRegistry.addName(obsidianShovel, "Obsidian Shovel");
            LanguageRegistry.addName(obsidianSword, "Obsidian Sword");
    }
    
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}
