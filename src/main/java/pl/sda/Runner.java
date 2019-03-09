package pl.sda;


import pl.sda.ioc.IoC;
import pl.sda.seller.PlayerSeller;

public class Runner {
    public static void main(String[] args) {

        PlayerSeller mp3Seller = new PlayerSeller("mp3Player", IoC.players.get("mp3Player"));
        mp3Seller.sell();


        PlayerSeller mp4Seller = new PlayerSeller("mp4Player", IoC.players.get("mp4Player"));
        mp4Seller.sell();


        PlayerSeller mp5Seller = new PlayerSeller("mp5Player", IoC.players.get("mp5Player"));
        mp5Seller.sell();


    }
}
