package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import netcraft.Netcraft;

public class CupritOre extends Block {

    public static final String name = "cuprit_ore";

    public CupritOre() {
        super(Material.IRON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }

}