package io.github.Seashine.roleplaysigns;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class RpsListener implements Listener {
	@EventHandler
	public void onSignClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.hasPermission("sign.use")) {

			Block b = e.getClickedBlock();
			if (b.getType() == Material.SIGN_POST || b.getType() == Material.WALL_SIGN) {
				if (e.getAction() == Action.RIGHT_CLICK_BLOCK && !(p.isSneaking() == true)) {
					Sign sign = (Sign) b.getState();
					if (sign.getLine(0).equalsIgnoreCase("[!]")) {
						// TODO code that fetches the sign's data from the
						// database.
						p.sendMessage("RoleplaySign Clicked.");
						return;
					}
				}
				if ((e.getAction() == Action.RIGHT_CLICK_BLOCK) && (p.isSneaking() == true)) {
					Sign sign = (Sign) b.getState();
					if (sign.getLine(0).equalsIgnoreCase("[!]")) {
						p.sendMessage("Enter sign description:");
						// TODO RoleplaySign creation code.
						p.sendMessage("If this plugin was finished you could create a roleplaysign now.");
						return;

					}
				}
			}

		} else {
			p.sendMessage("You don't have permission 'sign.use'.");
		}
	}
}
