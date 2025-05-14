package MiniProjects.MagicWonderShop;

public class MusicItem extends Item{
    private int numberOfString;

    public MusicItem(String name, double price, int numberOfString) {
        super(name, price);
        this.numberOfString = numberOfString;
    }
}
