package MiniProjects.MagicWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Magician magician = new Magician();
        MagicItem magician3 = new Wand("wand",569,"Wwq");
        MagicItem magician4 = new Potion("potion",1000,"wqwq");
        magician.add(magician3);
        magician.add(magician4);
        magician.performShow();

        // alternate way
//        magician.getMagicItemList().add(magician3);
//        magician.getMagicItemList().add(magician4);

        Musician musician = new Musician();
        MusicItem magicItem1 = new Guitar("guitar",100, 2);
        MusicItem magicItem2 = new DrumKit("drum kit",300, 4);

        musician.add(magicItem1);
        musician.add(magicItem2);
        musician.playConcert();

        // alternate way
//        musician.getMusicItemsList().add(magicItem1);
//        musician.getMusicItemsList().add(magicItem2);
        
        System.out.println();
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Potion("potion",232,"blabla"));
        itemList.add(new DrumKit("drum",300,5));
        itemList.add(new Guitar("guitar",700,7));
        itemList.add(new Wand("wand",900,"blabla"));

        for (Item item : itemList){
            item.use();
        }

        System.out.println(Item.getNumOfItem());

        System.out.println("\ntotal cost: " + magician.addMethod());
        musician.addMethod();

    }
}
