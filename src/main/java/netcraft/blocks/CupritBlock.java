package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import netcraft.Netcraft;
import netcraft.init.Blocks;

public class CupritBlock extends Block {

    public static final String name = "cuprit_block";

    public CupritBlock() {
        super(Material.IRON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
        Blocks.registerBlock(this);
    }

}