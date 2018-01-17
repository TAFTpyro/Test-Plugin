package me.pyro.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        if(player.hasPlayedBefore()){
            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Welcome back " + ChatColor.GOLD + player.getName().toString());
        }else{
            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Welcome to the server " + ChatColor.GOLD + player.getName().toString());
        }

    }
}
