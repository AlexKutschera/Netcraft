package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import netcraft.Netcraft;

public class CopperOre extends Block {

    public static final String name = "copper_ore";

    public CopperOre() {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}