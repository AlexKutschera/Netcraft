package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CupritBlock extends Block {

    public static final String name = "cuprit_block";

    public CupritBlock() {
        super(Material.IRON);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

}