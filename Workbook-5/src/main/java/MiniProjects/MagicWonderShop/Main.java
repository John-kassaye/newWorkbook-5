package MiniProjects.MagicWonderShop;

public class Main {
    public static void main(String[] args) {
        Magician magician = new Magician();
        MagicItem magician3 = new Wand("dsdsd",23);
        MagicItem magician4 = new Potion("dsdsd",23);

        magician.add(magician3);
        magician.add(magician4);

        Musician musician = new Musician();
        MusicItem magicItem1 = new Guitar("john",100);
        MusicItem magicItem2 = new Guitar("Kola",300);

        musician.add(magicItem1);
        musician.add(magicItem2);

    }
}
