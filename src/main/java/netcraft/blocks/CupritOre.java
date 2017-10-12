package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CupritOre extends Block {

    public static final String name = "cuprit_ore";

    public CupritOre() {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

}