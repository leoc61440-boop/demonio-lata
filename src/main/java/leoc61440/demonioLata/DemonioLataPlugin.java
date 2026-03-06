package leoc61440.demonioLata;

import org.bukkit.plugin.java.JavaPlugin;

public class DemonioLataPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register commands and listeners here
        getLogger().info("DemonioLata has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DemonioLata has been disabled!");
    }
}