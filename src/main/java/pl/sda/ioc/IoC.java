package pl.sda.ioc;

import pl.sda.player.Mp3Player;
import pl.sda.player.Mp4Player;
import pl.sda.player.Mp5Player;
import pl.sda.player.Player;

import java.util.HashMap;
import java.util.Map;

public class IoC {

    public static Map<String, Player> players;

    static {
        players = new HashMap<>();
        players.put("mp3Player", new Mp3Player(100));
        players.put("mp4Player", new Mp4Player(200));
        players.put("mp5Player", new Mp5Player(300));
    }


}
