package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;
import netcraft.init.Items;

public class CupritDust extends Item {

    public static final String name = "cuprit_dust";

    public CupritDust(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
        Items.registerItem(this);
    }

}
