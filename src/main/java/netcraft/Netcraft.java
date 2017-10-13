package netcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import netcraft.proxy.CommonProxy;
import netcraft.tabs.NetcraftTab;
import netcraft.util.Reference;
import netcraft.util.handlers.OreDictionaryHandler;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class Netcraft {

    public static final CreativeTabs NETCRAFT_TAB = new NetcraftTab();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        OreDictionaryHandler.registerOreDictionary();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
        System.out.println("POST ISSCH DA");
    }
}