package MiniProjects.RestaurantOrderSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItemList = new ArrayList<>();

    public void addItem(MenuItem item){
        menuItemList.add(item);
    }

    public void printOrderSummary(){
        double totalPrice = 0;
        double totalCalories = 0;

        for (MenuItem menuItem : menuItemList){
            System.out.println(menuItem.format());
            totalPrice+= menuItem.getPrice();
            totalCalories+= menuItem.getCalories();
        }

        System.out.println("\nHere is your total price: " + totalPrice);
        System.out.println("Here is your total calories: " + totalCalories);
    }

    public void onlyVegetarian(){
        for (MenuItem menuItem :menuItemList){
            if (menuItem instanceof MainDish){
                MainDish mainDish = (MainDish) menuItem;
                if (mainDish.isVegetarian()){
                    System.out.println(menuItem.format());
                }
            }
        }
    }
}
