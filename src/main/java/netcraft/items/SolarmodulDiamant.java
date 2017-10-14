package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SolarmodulDiamant extends Item {

    private static final String name = "solarmodul_Diamant";

    public SolarmodulDiamant(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}