package MiniProjects.MagicWonderShop;

public class Wand extends MagicItem{
    public Wand(String name, double price, String rarityLevel) {
        super(name, price, rarityLevel);
    }

    @Override
    public void use(){

        System.out.println( "Swish! The wand sparks with magical energy!");
    }
}
