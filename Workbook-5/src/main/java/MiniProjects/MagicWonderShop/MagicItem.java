package MiniProjects.MagicWonderShop;

public class MagicItem extends Item{
    private String rarityLevel;
    public MagicItem(String name, double price, String rarityLevel) {
        super(name, price);
        this.rarityLevel = rarityLevel;
    }
}
