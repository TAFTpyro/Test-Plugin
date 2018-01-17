package me.pyro.plugin;

import me.pyro.plugin.events.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Pizza extends JavaPlugin {

    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\n Loaded Pizza plugin!\n Thanks for downloading!\n\n ");

        /* EVENTS: */
        //getServer().getPluginManager().registerEvents(new EventMove(), this);
        getServer().getPluginManager().registerEvents(new EventJoin(), this);
        getServer().getPluginManager().registerEvents(new EventLeave(), this);
        getServer().getPluginManager().registerEvents(new EventClass(), this);

        loadConfig();
    }

    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\n Unloaded Pizza plugin! \n Goodbye!\n\n");
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
