package com.nimbusweblab.nwlcore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class NWLCore extends JavaPlugin {
	PluginDescriptionFile pdf = this.getDescription();

	@Override
	public boolean onCommand(CommandSender sdr, Command cmd, String lbl, String[] args) {
		if (cmd.getName().equalsIgnoreCase("nwl")) {
			if (args.length == 0) {
				sdr.sendMessage(ChatColor.WHITE + "-----" + ChatColor.GREEN + " NWLCore " + ChatColor.WHITE + "-----");
				sdr.sendMessage(ChatColor.DARK_PURPLE + "License: " + ChatColor.GREEN + "Nimbus Web Lab");
				sdr.sendMessage(ChatColor.DARK_PURPLE + "Help: " + ChatColor.GREEN + "/nwl help");
				sdr.sendMessage(ChatColor.DARK_PURPLE + "Description: " + ChatColor.GREEN + pdf.getDescription());
				sdr.sendMessage(ChatColor.DARK_PURPLE + "Version: " + ChatColor.GREEN + pdf.getVersion());
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("help")) {
					sdr.sendMessage(ChatColor.WHITE + "-----" + ChatColor.GREEN + " NWLCore Help " + ChatColor.WHITE + "-----");
					sdr.sendMessage(ChatColor.DARK_PURPLE + "/nwl: " + ChatColor.GREEN + "NWLCore Base Command");
					sdr.sendMessage(ChatColor.DARK_PURPLE + "/nwl help: " + ChatColor.GREEN + "Shows this menu!");
				} else {
					sdr.sendMessage(ChatColor.DARK_RED + "Unknown command! Do /nwl!");
				}
			}
		}
		return false;
	}
}
