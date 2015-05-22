package com.nimbusweblab.nwlcore.staff;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StaffCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sdr, Command cmd, String lbl,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("staff")) {
			if (args.length == 0) {
				sdr.sendMessage(ChatColor.WHITE + "-----" + ChatColor.GREEN
						+ " NWLCore Staff " + ChatColor.WHITE + "-----");
				sdr.sendMessage(ChatColor.DARK_PURPLE + "Description: "
						+ ChatColor.GREEN
						+ "NWLCore command for staff members.");
				sdr.sendMessage(ChatColor.DARK_PURPLE + "Users: "
						+ ChatColor.GREEN + "Nimbus Web Lab Official Staff");
			} else if (sdr.hasPermission("nwlcore.staff.member"))
				;
			{
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("help")) {

					} else {
						sdr.sendMessage(ChatColor.DARK_RED
								+ "Unknown command! Do /staff!");
					}
				} else if (!sdr.hasPermission("nwlcore.staff.member")) {
					sdr.sendMessage(ChatColor.DARK_RED
							+ "You do not have permission to do this!"
							+ ChatColor.BLUE
							+ "Speak to a mamber of staff if you believe this is an error.");
				}
			}
		}
		return false;
	}
}