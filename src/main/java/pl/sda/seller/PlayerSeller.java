package pl.sda.seller;

import pl.sda.player.Player;

public class PlayerSeller implements Seller {
    private final Player player;
    private final String name;

    public PlayerSeller(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    public void sell() {
        player.play();

    }
}
