package netcraft.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import netcraft.util.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event){
        super.init(event);
        RegistryHandler.client();
    }

    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }
}
