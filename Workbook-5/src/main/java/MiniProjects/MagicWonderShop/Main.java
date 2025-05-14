package MiniProjects.MagicWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Magician magician = new Magician();
        MagicItem magician3 = new Wand("wand",23,"Wwq");
        MagicItem magician4 = new Potion("potion",23,"wqwq");

        magician.add(magician3);
        magician.add(magician4);
        magician.performShow();

        Musician musician = new Musician();
        MusicItem magicItem1 = new Guitar("guitar",100);
        MusicItem magicItem2 = new DrumKit("drum kit",300);

        musician.add(magicItem1);
        musician.add(magicItem2);
        musician.playConcert();

        System.out.println(Item.getNumOfItem());

        List<Item> itemList = new ArrayList<>();
        MagicItem magic4 = new Potion("potion",23,"wqwq");
        itemList.add(magic4);

        for (Item item : itemList){
            item.use();
        }

    }
}
