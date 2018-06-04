package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SolarmodulIron extends Item {

    private static final String name = "solarmodul_Iron";

    public SolarmodulIron(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}