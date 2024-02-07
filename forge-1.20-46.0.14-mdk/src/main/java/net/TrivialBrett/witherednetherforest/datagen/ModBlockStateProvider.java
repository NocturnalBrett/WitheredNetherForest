package net.TrivialBrett.witherednetherforest.datagen;

import net.TrivialBrett.witherednetherforest.WitheredNetherForest;
import net.TrivialBrett.witherednetherforest.block.ModBlocks;
import net.TrivialBrett.witherednetherforest.WitheredNetherForest;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WitheredNetherForest.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*
        blockWithItem(WitheredNetherForest.ALEXANDRITE_BLOCK);
        blockWithItem(WitheredNetherForest.RAW_ALEXANDRITE_BLOCK);

        blockWithItem(WitheredNetherForest.ALEXANDRITE_ORE);
        blockWithItem(WitheredNetherForest.DEEPSLATE_ALEXANDRITE_ORE);
        blockWithItem(WitheredNetherForest.END_STONE_ALEXANDRITE_ORE);
        blockWithItem(WitheredNetherForest.NETHER_ALEXANDRITE_ORE);

        blockWithItem(WitheredNetherForest.SOUND_BLOCK);


         */
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
