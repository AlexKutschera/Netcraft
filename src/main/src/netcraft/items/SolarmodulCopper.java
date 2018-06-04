package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SolarmodulCopper extends Item {

    private static final String name = "solarmodul_Copper";

    public SolarmodulCopper(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }

}