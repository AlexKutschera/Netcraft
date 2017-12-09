package netcraft.util.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import netcraft.generate.OresGenerator;
import netcraft.init.Blocks;
import netcraft.init.Items;

public class RegistryHandler {

    public static void client(){

    }

    public static void common(){
        Items.init();
        Items.register();

        Blocks.init();

        GameRegistry.registerWorldGenerator(new OresGenerator(), 0);
    }

}
