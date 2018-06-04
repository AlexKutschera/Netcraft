package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class SolarmodulCuprit extends Item {

    private static final String name = "solarmodul_Cuprit";

    public SolarmodulCuprit(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}