package netcraft.generate;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import netcraft.init.Blocks;

import java.util.Random;

public class OresGenerator implements IWorldGenerator {

    private WorldGenerator copper_ore;

    public OresGenerator(){
        copper_ore = new WorldGenMinable(Blocks.copperOre.getDefaultState(), 9);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case 0: {
                //Overworld
                runGenerator(copper_ore, world, random, chunkX, chunkZ, 50, 0, 50);
                break;
            }
            case 1: {
                //End
                break;
            }
            case -1: {
                //Nether
                break;
            }
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight){
        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Can't generate CopperOre");
        int heightDifference = maxHeight - minHeight + 1;

        for (int i = 0; i < chance; i++){
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDifference);
            int z = chunkZ * 16 + random.nextInt(16);

            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
