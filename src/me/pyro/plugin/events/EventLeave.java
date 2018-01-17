package me.pyro.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventLeave implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();

        event.setQuitMessage(null);
        Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Goodbye " + ChatColor.GOLD + player.getName().toString());

    }
}
