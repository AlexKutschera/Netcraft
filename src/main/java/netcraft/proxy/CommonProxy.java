package netcraft.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import netcraft.util.handlers.RegistryHandler;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        RegistryHandler.Common();
    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }

}
