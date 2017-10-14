package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import netcraft.Netcraft;

public class ServerHousing extends Block {

    public static final String name = "server_housing";

    public ServerHousing() {
        super(Material.IRON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }

}