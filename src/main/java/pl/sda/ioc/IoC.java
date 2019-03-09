package pl.sda.ioc;

import pl.sda.player.Mp3Player;
import pl.sda.player.Mp4Player;
import pl.sda.player.Mp5Player;
import pl.sda.player.Player;

import java.util.HashMap;
import java.util.Map;

public class IoC {

    private Map<String, Player> players = new HashMap<>();

    public IoC(){
        players.put("mp3Player",new Mp3Player(100));
        players.put("mp4Player",new Mp4Player(200));
        players.put("mp5Player",new Mp5Player(300));
    }

    public Map<String, Player> getPlayers() {
        return players;
    }

}
