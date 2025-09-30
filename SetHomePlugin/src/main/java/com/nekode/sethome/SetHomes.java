package com.nekode.sethome;

import org.bukkit.plugin.java.JavaPlugin;

public class SetHomes extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SetHomePlugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SetHomePlugin disabled!");
    }
}