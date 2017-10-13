package net.schlaubi.ultimatediscordapiexample.bungee;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.schlaubi.ultimatediscord.UltimateDiscordAPI;

public class CommandExample extends Command{
    public CommandExample(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if(args.length > 0){
            ProxiedPlayer pp = (ProxiedPlayer) sender;
            ProxiedPlayer target = BungeeCord.getInstance().getPlayer(args[0]);
            if(target != null) {
                String verified;
                if (UltimateDiscordAPI.isVerified(target)) {
                    verified = "true";
                } else {
                    verified = "false";
                }

                pp.sendMessage("Verified: " + verified + "Discorid: " + UltimateDiscordAPI.getDiscordId(pp));
            } else {
                pp.sendMessage("Player not found");
            }
        }

    }
}
