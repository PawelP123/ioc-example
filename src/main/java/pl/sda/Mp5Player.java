package pl.sda;

public class Mp5Player implements Player {
    private final int price;

    public Mp5Player(int price) {
        this.price = price;
    }

    public void play() {
        System.out.println(Mp5Player.class.getSimpleName());
    }
}
