package net.schlaubi.ultimatediscordapiexample.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("dc").setExecutor(new CommandExample());
    }
}
