package com.example.examplemod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class CustomBlock extends Block {
    public CustomBlock() {
        super(Properties.of()
                .strength(3.0f, 3.0f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()  // Requires the correct tool for drops
        );
    }
}
