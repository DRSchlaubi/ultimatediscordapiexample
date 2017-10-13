package net.schlaubi.ultimatediscordapiexample.spigot;

import net.schlaubi.ultimatediscord.UltimateDiscordAPI;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandExample implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command name, String lable, String[] args) {
        if(sender instanceof Player){
            if(args.length > 0){
                Player player = (Player) sender;
                Player target = Bukkit.getPlayer(args[1]);
                if (player != null) {
                    String verified;
                    if(UltimateDiscordAPI.isVerified(player)){
                        verified = "true";
                    } else {
                        verified = "false";
                    }
                    player.sendMessage("Verified: " + verified + "Discordid: " + UltimateDiscordAPI.getDiscordId(player));
                } else {
                    player.sendMessage("Player not found");
                }
            }
        }
        return false;
    }
}
