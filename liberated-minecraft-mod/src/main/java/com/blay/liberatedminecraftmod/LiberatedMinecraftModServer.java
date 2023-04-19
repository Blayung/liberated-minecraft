package com.blay.liberatedminecraftmod;

import net.fabricmc.api.DedicatedServerModInitializer;

public class LiberatedMinecraftModServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        System.out.println("hey yo, it's server");
    }
}
