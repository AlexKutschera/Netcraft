package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SolarmodulGold extends Item {

    private static final String name = "solarmodul_Gold";

    public SolarmodulGold(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}