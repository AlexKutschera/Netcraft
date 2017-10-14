package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import netcraft.Netcraft;

import java.util.Random;

public class CopperOre extends Block {

    public static final String name = "copper_ore";

    public CopperOre() {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
    }
}