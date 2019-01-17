package com.avairebot.stayconnected;

import com.avairebot.contracts.handlers.EventListener;
import com.avairebot.handlers.events.MusicEndedEvent;
import com.avairebot.plugin.JavaPlugin;

public class StayConnected extends JavaPlugin {

    @Override
    public void onEnable() {
        getAvaire().getConfig().set("music-activity.enabled", false);
        registerEventListener(new Listener());
    }

    private class Listener extends EventListener {

        @Override
        public void onMusicEnded(MusicEndedEvent event) {
            event.setCancelled(true);
        }
    }
}
