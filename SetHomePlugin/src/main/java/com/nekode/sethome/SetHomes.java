/*
 * Nekode SetHomes Plugin
 * Copyright (C) 2025 Jergg
 *
 * Licensed under the GNU General Public License, Version 3 or later.
 * See <http://www.gnu.org/licenses/>.
 */
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