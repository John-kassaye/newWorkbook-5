package MiniProjects.MagicWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Musician {
    List<MusicItem> musicItemsList = new ArrayList<>();

    public void playConcert(){
        for (MusicItem musicItem : musicItemsList){
            musicItem.use();
        }
    }

    public void add(MusicItem musicItem){
        musicItemsList.add(musicItem);
    }

}
