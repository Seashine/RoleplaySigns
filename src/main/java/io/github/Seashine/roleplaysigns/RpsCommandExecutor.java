package io.github.Seashine.roleplaysigns;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

public class RpsCommandExecutor implements CommandExecutor {
	
	public RpsCommandExecutor(Roleplaysigns plugin) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			sender.sendMessage("RoleplaySigns allows you to create signs with long and complex descriptions. To make one, simply create a sign with [!] on the top line, and right click it. You will be prompted to enter the description in chat.");
			return true;
	} else {
		sender.sendMessage("RPS can only be used in-game.");
		return false;
	}
}
}
