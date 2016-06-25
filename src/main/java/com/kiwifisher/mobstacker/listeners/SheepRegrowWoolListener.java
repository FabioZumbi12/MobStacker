package com.kiwifisher.mobstacker.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

import com.kiwifisher.mobstacker.MobStacker;

public class SheepRegrowWoolListener implements Listener {

    private MobStacker plugin;

    public SheepRegrowWoolListener(MobStacker plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void regrowEvent(SheepRegrowWoolEvent event) {

        /*
        When a sheep regrows it's wool, try to stack it.
         */
        getPlugin().getStackUtils().attemptToStack(0, event.getEntity(), CreatureSpawnEvent.SpawnReason.CUSTOM);

    }

    public MobStacker getPlugin() {
        return plugin;
    }
}
