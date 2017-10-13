package netcraft.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Blocks {

    public static  void init(){

    }
    public static  void register(){

    }
    public static  void registerRenders(){

    }
    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
    }
    public static void registerRender(Block block){

    }
}
