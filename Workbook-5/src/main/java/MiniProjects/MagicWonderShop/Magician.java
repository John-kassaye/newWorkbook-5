package MiniProjects.MagicWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Magician {
    List<MagicItem> magicItemList = new ArrayList<>();

    public void performShow(){
        for (MagicItem magicItem : magicItemList){
            magicItem.use();
        }
    }

    public void add(MagicItem magicItem){
        magicItemList.add(magicItem);
    }
}
