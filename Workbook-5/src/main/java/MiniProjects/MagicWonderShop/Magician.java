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

    public double addMethod(){
        double total = 0;
        for (Item item : magicItemList){
            total+= item.getPrice();
        }

        return total;
    }

}
