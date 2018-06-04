package netcraft.util.handlers;

import net.minecraftforge.oredict.OreDictionary;
import netcraft.init.Items;

public class OreDictionaryHandler {

    public static void registerOreDictionary(){
        OreDictionary.registerOre("ingotCopper", Items.copperIngot);
    }

}
