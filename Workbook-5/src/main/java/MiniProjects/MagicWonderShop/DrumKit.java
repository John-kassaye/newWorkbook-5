package MiniProjects.MagicWonderShop;

public class DrumKit extends MusicItem {
    public DrumKit(String name, double price, int numberOfString) {
        super(name, price, numberOfString);
    }

    @Override
    public void use(){

        System.out.println( "🥁 Boom boom! The drumbeat fills the room!");
    }
}
