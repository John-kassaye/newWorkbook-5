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
            System.out.println("Here is your order: " + menuItem.getName() + "\nHere is the description for the order: " + menuItem.getDescription()
                    + "\nHere is your price " +  menuItem.getPrice() + "\nHere is your calories: " +menuItem.getCalories() +"\n");
        }


        for (MenuItem menuItem : menuItemList){
            totalPrice+= menuItem.getPrice();
            totalCalories+= menuItem.getCalories();
        }

        System.out.println("Here is your total price: " + totalPrice);
        System.out.println("Here is your total calories: " + totalCalories);
    }
}
