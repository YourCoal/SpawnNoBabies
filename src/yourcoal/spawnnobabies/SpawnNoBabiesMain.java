package yourcoal.spawnnobabies;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnNoBabiesMain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		final PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new SpawnNoBabiesListener(), this);
	}
	
}
