package netcraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class Netcraft {

    private ModMetadata metadata;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        metadata = event.getModMetadata();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(metadata.modId);
    }
}