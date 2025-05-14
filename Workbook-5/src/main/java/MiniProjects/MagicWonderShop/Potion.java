package MiniProjects.MagicWonderShop;

public class Potion extends MagicItem{

    public Potion(String name, double price, String rarityLevel) {
        super(name, price, rarityLevel);
    }

    @Override
    public void use(){
        System.out.println( "💫 You drink the potion. You feel invisible!");
    }
}
