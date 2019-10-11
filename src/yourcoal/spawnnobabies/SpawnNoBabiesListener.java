/*************************************************************************
 * 
 * AVRGAMING LLC __________________
 * 
 * [2013] AVRGAMING LLC All Rights Reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of
 * AVRGAMING LLC and its suppliers, if any. The intellectual and technical
 * concepts contained herein are proprietary to AVRGAMING LLC and its suppliers
 * and may be covered by U.S. and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from AVRGAMING LLC.
 */
package yourcoal.spawnnobabies;

import org.bukkit.entity.Entity;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SpawnNoBabiesListener implements Listener {

	@EventHandler(priority = EventPriority.LOWEST)
	public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
		Entity ent = event.getEntity();
		
		if (ent instanceof Zombie) {
			Zombie zom = (Zombie) ent;
			if (zom.isBaby()) {
				zom.setBaby(false);
			}
			return;
		}
		
		if (ent instanceof PigZombie) {
			PigZombie pzm = (PigZombie) ent;
			if (pzm.isBaby()) {
				pzm.setBaby(false);
			}
			return;
		}
		
	}
}
