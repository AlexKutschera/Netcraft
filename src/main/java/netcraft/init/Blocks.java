package netcraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import netcraft.blocks.CopperOre;
import netcraft.blocks.CupritBlock;
import netcraft.blocks.CupritOre;
import netcraft.blocks.ServerHousing;

import java.util.Objects;

public class Blocks {

    private static Block cupritBlock;
    public static Block cupritOre;
    public static Block copperOre;
    private static Block serverHousing;


    public static  void init(){
        // init all the blocks for registration
        cupritBlock = new CupritBlock();
        cupritOre = new CupritOre();
        copperOre = new CopperOre();
        serverHousing = new ServerHousing();
    }

    /**
     * registers block in game registry
     * @param block block to register
     */
    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);

        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(block),
                0,
                new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
