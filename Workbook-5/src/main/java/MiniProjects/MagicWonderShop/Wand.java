package MiniProjects.MagicWonderShop;

public class Wand extends MagicItem{
    public Wand(String name, double price) {
        super(name, price);
    }

    @Override
    public void use(){

        System.out.println( "Swish! The wand sparks with magical energy!");
    }
}
