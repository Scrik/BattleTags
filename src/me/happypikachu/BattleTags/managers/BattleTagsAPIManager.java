package me.happypikachu.BattleTags.managers;

import me.happypikachu.BattleTags.BattleTags;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.kitteh.tag.PlayerReceiveNameTagEvent;
import org.kitteh.tag.TagAPI;

public class BattleTagsAPIManager extends TagsManager implements Listener {
    public BattleTagsAPIManager(BattleTags plugin) {
            super(plugin);
    }
    
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onNameTag(PlayerReceiveNameTagEvent e) {
		e.setTag(getTag(e.getPlayer(), e.getNamedPlayer()));
	}

	@Override
	public void update(Player player) {
		TagAPI.refreshPlayer(player);
	}
}