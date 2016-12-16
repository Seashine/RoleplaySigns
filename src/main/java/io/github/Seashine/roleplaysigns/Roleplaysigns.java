package io.github.Seashine.roleplaysigns;

import org.bukkit.plugin.java.JavaPlugin;

public final class Roleplaysigns extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("RoleplaySigns enabled!");
		this.getCommand("rps").setExecutor(new RpsCommandExecutor(this));
		getServer().getPluginManager().registerEvents(new RpsListener(), this);
	}

	@Override
	public void onDisable() {
		getLogger().info("RoleplaySigns disabled!");
	}

}
