package MiniProjects.MagicWonderShop;

public class Guitar extends MusicItem{
    public Guitar(String name, double price, int numberOfString) {
        super(name, price, numberOfString);
    }

    @Override
    public void use(){

        System.out.println("🎸 Strumming the strings of the guitar!");
    }

}
