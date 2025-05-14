package MiniProjects.MagicWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Musician {
    List<MusicItem> musicItemsList = new ArrayList<>();

    public List<MusicItem> getMusicItemsList() {
        return musicItemsList;
    }

    public void playConcert(){
        for (MusicItem musicItem : musicItemsList){
            musicItem.use();
        }
    }

    public void add(MusicItem musicItem){
        musicItemsList.add(musicItem);
    }

    public void addMethod(){
        double total = 0;
        for (Item item : musicItemsList){
            total+= item.getPrice();
        }

        System.out.println("total cost: " + total);
    }

}
