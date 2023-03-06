package me.melarnoff.gmsp;

import me.melarnoff.gmsp.Commands.GamemodeSpectatorCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gmsp extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gmsp").setExecutor(new GamemodeSpectatorCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
