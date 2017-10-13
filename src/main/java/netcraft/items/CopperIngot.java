package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class CopperIngot extends Item {

    private static final String name = "copper_ingot";

    public CopperIngot(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
