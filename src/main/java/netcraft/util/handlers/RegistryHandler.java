package netcraft.util.handlers;

import netcraft.init.Blocks;
import netcraft.init.Items;

public class RegistryHandler {

    public static void Client(){

    }

    public static void Common(){
        Items.init();
        Items.register();

        Blocks.init();
        Blocks.register();
    }

}
