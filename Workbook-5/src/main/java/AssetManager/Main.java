package AssetManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Asset> assetList = new ArrayList<>();

    public static void main(String[] args) {

        List<Asset> assetList = new ArrayList<>();

        assetList.add(new House("Vacation", "May 11", 200000, "112 street", 1, 23, 1));
        assetList.add(new House("john's house", "Sept 23", 100000, "32 street", 3, 55, 6));
        assetList.add(new Vehicle("personal", "April 11", 20000, "tesla", 4, 130000));
        assetList.add(new Vehicle("mine", "june 11", 34000, "ford", 8, 130000));

        for (Asset asset :assetList){
            System.out.println(asset);
            System.out.println(asset.getValue());
        }

       for (Asset asset : assetList){
           if (asset instanceof House){
               House house = (House) asset;
               System.out.println(house.getAddress());
           } else if(asset instanceof Vehicle){
               Vehicle vehicle = (Vehicle) asset;
               System.out.println(vehicle.getMakeModel() + vehicle.getMakeModel());
           }
       }
    }
}

