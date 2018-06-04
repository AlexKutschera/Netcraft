package netcraft.items;

import net.minecraft.item.Item;
import netcraft.Netcraft;

public class CircuitBoard extends Item {

    private static final String name = "circuit_board";

    public CircuitBoard(){
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}
