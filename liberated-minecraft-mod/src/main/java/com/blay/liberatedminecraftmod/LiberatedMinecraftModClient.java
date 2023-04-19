package com.blay.liberatedminecraftmod;

import net.fabricmc.api.ClientModInitializer;

public class LiberatedMinecraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("hey yo, it's client");
    }
}
