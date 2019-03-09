package pl.sda;


public class Runner {
    public static void main(String[] args) {
        IoC ioc = new IoC();
        PlayerSeller mp3Seller = new PlayerSeller("mp3Player",ioc.getPlayers().get("mp3Player"));
        mp3Seller.sell();


        PlayerSeller mp4Seller = new PlayerSeller("mp4Player",ioc.getPlayers().get("mp4Player"));
        mp4Seller.sell();


        PlayerSeller mp5Seller = new PlayerSeller("mp5Player",ioc.getPlayers().get("mp5Player"));
        mp5Seller.sell();


    }
}
