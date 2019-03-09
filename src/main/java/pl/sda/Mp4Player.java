package pl.sda;

public class Mp4Player implements Player {
    private final int price;

    public Mp4Player(int price) {
        this.price = price;
    }

    public void play() {
        System.out.println(Mp4Player.class.getSimpleName());
    }
}
