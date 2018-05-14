package netcraft.util;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipe {

    private ItemStack input, output;
    private int xp;
    
    public FurnaceRecipe(ItemStack input, ItemStack output, int xp){
        this.input = input;
        this.output = output;
        this.xp = xp;
    }

    public void register() {
        GameRegistry.addSmelting(input, output, xp);
    }
}
