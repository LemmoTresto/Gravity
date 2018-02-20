package me.max.gravity;

import me.max.gravity.listeners.JumpListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gravity extends JavaPlugin {

    @Override
    public void onEnable() {

        new JumpListener(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
