package net.aneighbourhooddeveloper.eggwars.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AdminCommand implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("admin")) {
			if(!sender.hasPermission("eggwars.admin")) {
				sender.sendMessage(ChatColor.RED + "No permission");
			} else {

			}
		}
		return false;
	}
}
